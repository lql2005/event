import java.util.Scanner;
import java.util.Stack;

public class HandleComplementaryPasses{

    Scanner reader = new Scanner(System.in);

    Stack<ComplementaryPasses> comPasses = new Stack<>();

    public void HandleComplementaryPasses(){
        int choice = 0;
        do{
            System.out.println("\n" + "Here are the complementary passes operations availble to you:" + "\n");
            System.out.println("Type 1 to redeem complementary passes:" + "\n");
            System.out.println("Type 2 to display the list of redeemd complementary passes:" + "\n");
            System.out.println("Tyoe 3 to display the las redeemd complementary passes:" + "\n");
            System.out.println("Type 4 to undo the redeemd complementary pass" + "\n");
            System.out.println("Type 5 to Quit:" + "\n");
            choice = reader.nextLine();
            reader.nextLine();
            switch(choice){
                case 1:
                    System.out.println(x:"How many complementary passes would you like to redeem?");
                    int num = reader.nextInt;
                    reader.nextLine();
                    redeemComplementaryPasses(num);
                    break;
                case 2:
                    displayComplementaryPasses();
                    break;
                case 3:
                    displayLastRedeemdComplementaryPasses();
                    break;
                case 4:
                    undoRedeemComplementaryPasses();
                    break;
                case 5:
                    break;
                default:
                    System.out.println(x:"Invalid operation. All the complementary passes have beenredeemd.");
            }
        }while(choice != 5);
    }

    public void redeemComplementaryPasses(int numOfPasses){
        if(comPasses.size() >= 10){
            System.out.println("\n" + "Invalid operation. All the complementary passes have already been redeemed.");
            System.out.println("\n" + "Would you like to see the list of redeemed complementary passes? (Y/N)");
            char choice = reader.nextLine().charAt(index:0);
            if(choice == 'Y'){
                displayComplementaryPasses();
                return;
            }
        }
        else{

            int i=0;

            do{
                System.out.println(x:"Enter the Complementary ");
                String ID = reader.nextLine();

                System.out.println(x:"Enter the access level: ");
                String accessLevel = reader.nextLine();
                
                ComplementaryPasses pass = new ComplementaryPasses(ID,accessLevel);
                comPasses.push(pass);
                i++;
            }while(i<numOfPasses);
        }
    }

    public void displayComplementaryPasses(){
        System.out.println("Here is the list of redeemed complementary passes:" + "\n" + comPasses);
    }

    public void displayLastRedeemedComplementaryPasses(){
        System.out.println("The last redeemed complementary pass is :" + comPasses.peek());
    }

    public void undoRedeemComplementaryPasses(){
        System.out.println(x:"Enter the Pass ID you want to undo:");
        String ID = reader.nextLine();

        for(ComplementaryPasses pass : comPassess){
            if(pass.getPassID().equals(ID)){
                comPassess.pop();
                System.out.println("The pass with the ID " + ID + "has been removed from the redeemed list.");
            }
        }
    }
}     

