// Program to extimate area covered using using rectangle sum only
import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double Ar=0;
        System.out.println("Convert the equation to the form A(x^2)+Bx+C where A, B, and C are integers.");
        System.out.print("Value of A=");
        int a=sc.nextInt();
        System.out.print("Value of B=");
        int b=sc.nextInt();
        System.out.print("Value of C=");
        int c=sc.nextInt();
        System.out.print("Enter the limits: ");
        float i=sc.nextFloat();
        int n=sc.nextInt();
        sc.close();
        for(;i<=n;i+=0.5)
        {
            Ar=Ar+(((a*i*i)+(b*i)+c)*0.5);
        }
        System.out.println("Area="+Ar);
    }
}
