import java.util.Scanner;
public class exercise3{
    public static void main (String[] args)
    {
        Scanner s = new Scanner (System.in);
        System.out.print ("Enter Three Numbers: ");
        float a = s.nextFloat();
        float b = s.nextFloat();
        float c = s.nextFloat();
        float res = a+b+c;
        System.out.println("\nResult= "+res);
        
    }
}