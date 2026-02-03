import java.io.Console;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Console console = System.console();
        System.out.println("========-> Welcome to Sunshine Repairshop! <-==============");
        System.out.println("First, you need to identify yourself, please type 1 for register or 0 to Login");
        int user = scnr.nextInt();
        // if(console != null){
        //     if(user == 1){
        //         login();
        //     }
        //     else if (user == 0) {
        //         register();
        //     }
        // }
        menu();
        int selection = scnr.nextInt();
        switch (selection){
            case 1:
                screenReplacement();
                break;
            case 2:
                battery();
        }
        
        scnr.close();
    }
        public static void register(){
            
            System.out.println("==========================================================");
            System.out.println("||                  SUNSHINE REPAIR HUB                 ||");
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
                System.out.println("||            NEOLEAGUE SYSTEM INFRASTRUCTURE               ||");
                System.out.println("||            ENTER YOUR USERNAME AND PASSWORD TO LOGIN     ||");
                System.out.println("==========================================================");
                String username = console.readLine();
                System.out.println("Saving....");
                System.out.println("Saved successfully"); 
                char[] password = console.readPassword("Enter your password: ");
                System.out.printf("USER: %s | PASSWORD: %s \n",username, password );
        }
        public static void menu(){
            int speed = 10;
            slowPrint("Welcome user!", speed);
            slowPrint("==========================================", speed);
            slowPrint("       HEALTH SERVICE CLINIC MENU         ", speed);
            slowPrint("||     Your Device, Our Priority.        ||", speed);
            slowPrint("==========================================", speed);
            
            slowPrint("\n--- REPAIR SERVICES ---", speed);
            slowPrint("1.  Smartphone Screen Replacement", speed);
            slowPrint("2.  Battery Health & Replacement", speed);
            slowPrint("3.  Laptop Keyboard/Trackpad Repair", speed);
            slowPrint("4.  Water Damage Recovery", speed);
            slowPrint("5.  OS Reinstallation & Software Troubleshooting", speed);
            slowPrint("6.  Data Recovery & Backup Services", speed);
            slowPrint("7.  Hardware Upgrades (RAM/SSD)", speed);
            slowPrint("8.  Charging Port Cleaning & Repair", speed);
            slowPrint("\n==========================================================", speed);
            slowPrint("   Enter the service number to get an estimate.   ", speed);
        }
        public static void screenReplacement(){
            Scanner scnr = new Scanner(System.in);
            int speed = 10; 
            slowPrint("You have selected Smartphone Screen Replacement", speed);
            slowPrint("First, please select your phone", speed);
            String[] phones = {"1. iPhone 17 Pro Max", "2. iPhone 17", "3. Samsung Galaxy S25 Ultra",
                "4. Samsung Galaxy A56 5G", "5. Google Pixel 10 Pro XL", "6. Google Pixel 9a",
                "7. OnePlus 15", "8. Xiaomi Redmi Note 15 Pro", "9. Nothing Phone (3a) Pro",
                "10. Motorola Moto G86 Power", "11. Fairphone 5", "12. Samsung Galaxy Z Fold 7",
                "13. iPhone 16e", "14. iPhone Air", "15. Samsung Galaxy S25 FE"};
                for(String phone :phones){
                    slowPrint(phone, speed);
                }
        }
        public static void battery(){
            Scanner scnr = new Scanner(System.in);
            int delay = 10;
            slowPrint("You have chosen battery health check service", delay);
            slowPrint("This service may requires technical reviews and face to face replacement, We suggest you may make a reservation for this", delay);
            slowPrint("", delay);
        }

        public static void slowPrint(String text, int delay){
            for(char c : text.toCharArray()){
                System.out.print(c);
                try {
                    Thread.sleep(delay);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
             System.out.println();
        }

    
}
