
import java.security.SecureRandom;

public class secureRandomDemo {
    public static void main(String[] args) {
        SecureRandom radomNumber = new SecureRandom();
        while (true) {
            var  number = radomNumber.nextInt(10);
            System.out.println(number);
            
            if(number == 5){
                System.out.println("I hit 5......orz");
                break;
            }
            
        }
    }
}
