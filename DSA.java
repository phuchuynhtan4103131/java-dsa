import java.util.Scanner;


public class DSA {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double a = scnr.nextDouble();
        double b = scnr.nextDouble();
        double c = scnr.nextDouble();
        System.out.println(findDelta(a, b, c));
    }


    public static int findMax(int a, int b, int c){
        if(a > b){
            if(a > c || a == c){
                return a;
            }
        }
        if(b > c){
            return b;
        }
        return c;
    }

    public static double findDelta(double a, double b, double  c){
        double d = Math.pow(b,2) - 4 * a * c;
        if(d < 0){
            System.out.println("Phương trình vô nghiệm");
        }else if(d == 0){
            System.out.println("Phương trình có hai nghiệm kép");
            return d = -b/2*a;
        }else{
            System.out.println("Phương trình có 2 nghiệm phân biệt");
            double d1 =  (-b+Math.sqrt(d))/2*a;
            double d2 = (-b-Math.sqrt(d))/2*a;
            System.out.println("d1 = " + d1 + ", d2 = " + d2);
        }
        return d;
    }
}
    
