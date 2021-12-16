public class testChar {
    public static void main(String[] args) throws InterruptedException{
        String char1 = "廢物歡迎來到這";
        String[] split1 = char1.split("");
        for (int i = 0; i < split1.length; i++) {

            System.out.print(split1[i]);
            Delay250ms.delay25(2);
        }
        Delay250ms.delay25(2);
        for (int j = 0 ; j < split1.length ; j++){
            System.out.print("\b");
            Delay250ms.delay25(1);
        }
        String char2 = "抱歉...更正..大神歡迎來到這個甘苦人生";
        String[] split2 = char2.split("");
        for (int i = 0; i < split2.length; i++) {

            System.out.print(split2[i]);
            Delay250ms.delay25(1);
        }
        System.out.println("");



    }
}
