public class FizzBuzz{
    public static void main (String [] args){
        int count=1;
        for (int i=0; i<100; i++){
            if (count % 3 == 0 && count %5 ==0){
                System.out.println("FizzBuzz");
            }
            else if (count % 3==0 ){
                System.out.println("Fizz");
            }
            else if(count % 5==0){
                System.out.println("Buzz");
            }
            count++;
        }
    }
}