
import java.util.*;

public class H1_main{
    public static void main (String[] args)
    {
        Scanner ob = new Scanner(System.in);

        System.out.println("Enter a number");
        int z = ob.nextInt();

        if (z>10){
            z = z-10;
        }
            
        System.out.println(z);
    
    }
}
