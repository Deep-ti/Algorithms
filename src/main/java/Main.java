import NumberTheory.EuclideanAlgorithm;

public class Main {
    public static void main(String[] args) {
        EuclideanAlgorithm euclideanAlgorithm = new EuclideanAlgorithm();
        int a = 400, b= 970;
        int gcd = euclideanAlgorithm.findGCD(a, b);
        System.out.println("GCD of " + a + " and " + b + " is " + gcd);
    }
}
