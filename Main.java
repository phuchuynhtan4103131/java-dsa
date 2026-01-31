import java.io.Console;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Console console = System.console();
        System.out.println("========-> Welcome to the system! <-==============" );
        System.out.println("First, you need to identify yourself, please type 1 for register or 0 to Login");
        int user = scnr.nextInt();
        if(console != null){
            if(user == 1){
                login();
            }
            else if (user == 0) {
                register();
            }
        }
        
        scnr.close();
    }
        public static void register(){
            
            System.out.println("==========================================================");
            System.out.println("||            NEOLEAGUE SYSTEM INFRASTRUCTURE           ||");
            System.out.println("||             CREATE A NEW ACCOUNT TO BEGIN            ||");
            System.out.println("==========================================================");
            Scanner scanner = new Scanner(System.in);
            Console console = System.console();
            String username = console.readLine("||             ENTER YOUR NAME (8-12 CHARACTERS)            || \n");
            char[] password = console.readPassword("||             ENTER YOUR PASSWORD (8-12 CHARACTERS)            ||\n");
            String email = console.readLine("||             ENTER YOUR EMAILS           ||\n");
            if(email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")){
                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                System.out.println("!! [VALIDATION ERROR] You must enter the right email format.  !!");
                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            }
            System.out.println("==========================================================");
            System.out.println("||           REGISTRATION COMPLETED SUCCESSFULLY        ||");
            System.out.println("||          ACCOUNT PROVISIONED ON NEOLEAGUE DB         ||");
            System.out.println("==========================================================");
            System.out.println("[SYSTEM] Welcome! You may now log in with your credentials.");
            System.out.printf("USER: %s | EMAIL: %s \n",username, email );
        }

        public static void login(){
            Console console = System.console();
            System.out.println("==========================================================");
                System.out.println("||            NEOLEAGUE SYSTEM INFRASTRUCTURE           ||");
                System.out.println("||                ENTER YOUR USERNAME AND PASSWORD TO LOGIN               ||");
                System.out.println("==========================================================");
                String username = console.readLine();
                System.out.println("Saving....");
                System.out.println("Saved successfully"); 
                char[] password = console.readPassword("Enter your password: ");
                System.out.printf("USER: %s | PASSWORD: %s \n",username, password );
        }
    
}
