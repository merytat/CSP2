package Unit2;

public class WebsiteTester {
    public static void main(String[] args) {
        Website ws1 = new Website();

        System.out.println(ws1);

        Website ws2 = new Website("google","com");
        Website ws3 = new Website("jisedu","org",400);

        System.out.println(ws2);
        System.out.println(ws3);


    }
}
