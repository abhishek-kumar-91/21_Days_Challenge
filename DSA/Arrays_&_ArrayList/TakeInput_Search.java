import java.util.*;

public class TakeInput_Search{
    public static void main(String [] args){
            Scanner sc= new Scanner(System.in);
            int num[] = new int[5];
            System.out.println(num.length);
            for(int i = 0; i < num.length; i++){
                System.out.print("Enter Number: ");
                num[i] = sc.nextInt();
    
            }

            System.out.print("Enter the number for finding ");
            int searchNumber = sc.nextInt();

            for(int i = 0; i < num.length; i++){
                if(num[i] == searchNumber){
                    System.out.println("Number Found on this index " + i );
                    return;
                }else{
                    System.out.println("Number not found");
                }
            }
    }
}
