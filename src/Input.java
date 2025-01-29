import java.util.Scanner;
public class Input{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
    String name;
    System.out.print("Enter your name: ");
    name = scanner.nextLine();
    int age; 
    System.out.print("Enter your age: ");
    age = scanner.nextInt();
    float weight;
    System.out.print("Enter your weight: ");
    weight = scanner.nextFloat();
    boolean smoker;
    String temp;
    System.out.print("Have you smoked before (Y/N): ");
    scanner.nextLine();
    temp = scanner.nextLine();
    if(temp.equalsIgnoreCase("y")||temp.equalsIgnoreCase("true")){
        temp = "true";
        smoker = Boolean.parseBoolean(temp);
    }
    else{
        temp = "false";
        smoker = Boolean.parseBoolean(temp);
    }

    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Weight: " + weight);
    System.out.println("Smoker: " + smoker);
    }
}