package NumberTheory;

public class EuclideanAlgorithm {
    public int findGCD(int a, int b){
        while( b != 0){
            if(a > b){
                a -= b;
            }else{
                b -= a;
            }
        }
        return a;
    }
}
