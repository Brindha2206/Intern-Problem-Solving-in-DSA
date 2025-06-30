package day6;

public class twistedPrime {
    public static boolean isPrime(int num){
        return(num==2||num==3||num==5||num==7||num%2!=0&&num%3!=0&&num%5!=0&&num%7!=0)?true:false;
    }
    public static void main(String[] args) {
        int number = 49;
        StringBuilder builder = new StringBuilder();
        builder.append(number);
        int reveresed = Integer.parseInt(builder.reverse().toString());
        System.out.println((isPrime(number)&&isPrime(reveresed))?1:0);
    }
}
