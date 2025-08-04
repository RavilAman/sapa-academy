package example.lesson10;

import example.lesson9.lesson.model.CurrencyItem;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class CurrencyFinder implements Runnable{

    private String currencyCodeToFind;

    public CurrencyFinder(String currencyCodeToFind) {
        this.currencyCodeToFind = currencyCodeToFind;
    }

    public void find(String currencyCode) {
        List<CurrencyItem> currencies = new ArrayList<>();

        try {
            URL url = new URL("https://nationalbank.kz/rss/rates_all.xml");
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(url.openStream());

            NodeList items = doc.getElementsByTagName("item");

            for (int i = 0; i < items.getLength(); i++) {
                Element item = (Element) items.item(i);

                String code = getText(item, "title");
                String date = getText(item, "pubDate");
                double rate = Double.parseDouble(getText(item, "description"));
                int quantity = Integer.parseInt(getText(item, "quant"));
                String trend = getText(item, "index");
                String change = getText(item, "change");

                currencies.add(new CurrencyItem(code, date, rate, quantity, trend, change));
            }

            // Искусственный замедлитель процесса
            Thread.sleep(4000);

            currencies.forEach(item -> {
                if (item.getCode().equals(currencyCode)) {
                    String message = String.format("Todays " + currencyCode + " value is: " + item.getRate());
                    System.out.println("Задача выполняется потоком с именем: " + Thread.currentThread().getName() + ": " + message);
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Вспомогательный метод для получения текста из тега
    private static String getText(Element parent, String tagName) {
        NodeList nodeList = parent.getElementsByTagName(tagName);
        if (nodeList.getLength() > 0) {
            Node node = nodeList.item(0);
            return node.getTextContent().trim();
        }
        return "";
    }

    @Override
    public void run() {
        find(currencyCodeToFind);
    }
}
