package example.lesson9;

import example.lesson9.model.CurrencyItem;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class CurrencyConverter {
    public static void main(String[] args) {
        List<CurrencyItem> currencies = new ArrayList<>();

        try {
            // Загружаем и парсим XML-документ
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


            for (int i = 0; i < currencies.size(); i++ ) {
                if (currencies.get(i).getCode().equals("USD")) {
                    System.out.println(currencies.get(i).getRate());
                    break;
                }
            }

            double currencyValue = currencies.stream()
                    .filter(item -> item.getCode().equals("USD"))
                    .findFirst()
                    .map(item -> item.getRate())
                    .get();

            System.out.println(currencyValue);




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
}
