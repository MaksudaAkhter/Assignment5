package overriding;

public class KrishiBank extends BangladeshBank{
    @Override
    int getRateOfInterest() {
        return 7;
    }
}
