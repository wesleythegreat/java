import java.util.Scanner;
public class main
{
    public static void main (String args[])
    {
        String name, fname, sname;
        System.out.println("write your first name: ");
        Scanner myobj = new Scanner(System.in);
        String first = myobj.nextLine();
        System.out.println("write your last name: ");
        Scanner myobj2 = new Scanner (System.in);
        String last = myobj2.nextLine();
        fname = first;
        sname = last;
        name = fname + " " + sname;
        System.out.println("Hello "+ name);


    }
}   