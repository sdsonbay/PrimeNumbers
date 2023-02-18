public class Main {
    public static void main(String[] args) {
        int number = 100;

        for(int i = 2; i <= number; i++){
            checkIsPrime(i);
        }
    }

    public static void checkIsPrime(int number){
        boolean isPrime = true;

        for(int i = 2; i <= number / 2; i++){
            if(number % i == 0){
                isPrime = false;
                break;
            }
        }

        if(isPrime){
            System.out.print(number + " ");
        }
    }
}
