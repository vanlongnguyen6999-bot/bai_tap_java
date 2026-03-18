public class PrimeNumberLessThan100 {
    public static void main(String[] args){
        for(int i = 2; i < 100 ; i++){
            if(MyMath.checkPrime(i)){
                System.out.print(i + " ");
            }
        }
    }
}
