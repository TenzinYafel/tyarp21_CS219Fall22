public class Investment {

    public static double investment(double c, double r, int t, int n){
        return c*Math.pow(1+r/n, t*n);
        // return sends the value back to the function and can be used later.
    }
    public static void main(String [] args) {
        System.out.println(investment(1.0, 1.0, 1, (int) 1e9));
        System.out.println(investment(1000, 0.03, 10, 365));
    }
}
