import java.util.Scanner;

public class gitPractice {
    //FIX: this is some disgusting formatting.
    //FIX: made main String[] args
    //FIX: Imported Scanner
    public static void main( String[] args )	{
        Scanner s = new Scanner( System.in );
        int int1,int2;
        System.out.println("Give me a number");
        int1 = s.nextInt();
        System.out.println("Give me another number");
        int2 = s.nextInt();
        double avg = (int1 + int2)/2;
        System.out.println("Average: " + avg);
        s.close();
    }
}