public class Delay250ms {
    public static void delay25(int times) throws InterruptedException{

        for (int i = 0;i < times ;i++) {

            Thread.sleep(200);
        }
    }
}