package abstraction;

import overriding.SonaliBank;

public class AbstractionTest {
    public static void main(String[] args) {
        BangladeshBank b= new PubaliBank();
        System.out.println("Rate of interest is :" + " "+ b.getRateOfInterest());
        SonaliBank v = new SonaliBank();
        System.out.println("Rate of interest is :" + " "+ v.getRateOfInterest());
    // or
        PubaliBank p = new PubaliBank();
        System.out.println(" PubaliBank Rate of interest is : " + " " + p.getRateOfInterest()+ "%" );
        SonaliBank s = new SonaliBank();
        System.out.println(" SonaliBank Rate of interest is : " + " " + s.getRateOfInterest()+ "%" );
        KrishiBank k = new KrishiBank();
        System.out.println(" KrishiBank Rate of interest is : " + " " + k.getRateOfInterest()+ "%" );
    }
}
