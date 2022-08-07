package overriding;

public class OveridingTest {
    public static void main(String[] args) {
        KrishiBank k = new KrishiBank();
        System.out.println("KrishiBank Rate of Interest:" + " " + k.getRateOfInterest());
        PubaliBank p = new PubaliBank();
        System.out.println("PubaliBank Rate of Interest:" + " " + p.getRateOfInterest());
        SonaliBank s = new SonaliBank();
        System.out.println("SonaliBank Rate of Interest:" + " " + s.getRateOfInterest());

    }
}
