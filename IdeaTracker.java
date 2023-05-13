import java.util.ArrayList;
import java.util.Scanner;

public class IdeaTracker {
    // Vars //
    private ArrayList<String> collection = new ArrayList<String>();

    private String userString, title;
    private String mainSelection = "y";

    private Scanner input = new Scanner(System.in);

    // Main Code Operation //
    public void Run(){
        // Introduction //
        System.out.println("Welcome to the Idea Tracker");

        while (!mainSelection.equalsIgnoreCase("n")){
            System.out.print("Please enter what the title of this ideas list will be: ");

            // Main Loop //

            // Ask for title
            title = input.nextLine();

            // Ask for items in list
            System.out.print("Please enter an idea to put under this new list(enter 'exit' to exit): ");
            userString = input.nextLine();
            collection.add(userString);
            
            while(!userString.equalsIgnoreCase("exit")) {
                System.out.print("Please enter an idea to put under this new list(enter 'exit' to exit): ");
                userString = input.nextLine();
                collection.add(userString);
            }
            collection.remove(collection.size() - 1);

            // Print out the list
            System.out.println("\n" + title.toUpperCase());
            for (int i = 0; i < collection.size(); i++){
                System.out.println(i+1 + ". " + collection.get(i));
            }

            // Reset Arrays for next loop
            collection.clear();

            // Ask if the user would like to repeat
            System.out.print("\nWould you like to make another list? (Y)es or (N)o: ");
            mainSelection = input.nextLine();
        }
        input.close();
        
    }
}