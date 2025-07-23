package badeshov;

import badeshov.hw3.CtoF;
import badeshov.hw3.KtoM;
import badeshov.hw3.KtoP;

public class BadeshovMain {
    public static void main (String[] args) {
        KtoP convert3 = new KtoP();
        convert3.convertKP();
//        KtoM convert2 = new KtoM();
//        convert2.convertKM();
//        CtoF convert1 = new CtoF();
//        convert1.convertCF();
    }
}

/*
в консоли (System.out.println) какие единицы измерения она может конвертировать
давать выбор во что конвертировать значение
После распечатки, программа должна спрашивать, хочет ли пользователь продолжить конвертацию, или нет.
 */
