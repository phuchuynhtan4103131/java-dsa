import java.util.Scanner;


public class DSA {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        // double a = scnr.nextDouble();
        // double b = scnr.nextDouble();
        // double c = scnr.nextDouble();
        // System.out.println(findDelta(a, b, c));
        System.out.println("Enter your phrase: ");
        String text = scnr.nextLine();
        // System.out.println(Uppercase(text));
        System.out.println(isPasswordComplex(text));
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
//     public static boolean Uppercase(String input){
//         return input.chars().allMatch(Character::isUpperCase);
//     }
//     public static boolean Lowercase(String input){
//         return input.chars().allMatch(Character::isLowerCase);
// "^[A-Za-z0-9]{8,}$"
//     }
    public static boolean isPasswordComplex(String input){
        // return input.chars().anyMatch(Character::isUpperCase) && input.chars().anyMatch(Character::isLowerCase) && input.chars().anyMatch(Character::isDigit);
        return input.chars().anyMatch(c -> Character.isUpperCase(c) || Character.isLowerCase(c) || Character.isDigit(c));
    }

}
    
