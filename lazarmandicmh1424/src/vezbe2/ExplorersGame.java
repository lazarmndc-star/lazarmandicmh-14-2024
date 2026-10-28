package vezbe2;

import java.util.Scanner;

public class ExplorersGame {

	public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       
       System.out.println("Welcome to the exploreation game!");
       System.out.println("What is your name?");
       String name = scanner.next();
       System.out.println(name + " Where do you want to go?");
       String destination = scanner.next();
       
       Explorer explorer = new Explorer (name, destination);
       System.out.println("The game begins");
       while(explorer.isalive()) {
    	   explorer.explore();
    	   
         if(!explorer.isalive()) {
        System.out.println("The explorer has perished, game ends");
        explorer.explorerDied();
        continue;
       
       }
       if (explorer.getKnowledge() >= 100) {
    	   System.out.println("you are very lucky");
    	   break;
    	   
       }
     System.out.println("After" + explorer.getTurn() + "days of exploration we"
       +"currently have following stats:");
     System.out.println("Supplies" + explorer.getSupplies());
     System.out.println("Knowledge" + explorer.getKnowledge() );
     System.out.println("If you want to continue press 1, otherwise you're going home!");
     int choice = scanner.nextInt();
     if(choice == 1){
    	 continue;
     }else {
    	 break;
     }
     
	}
       System.out.println("your final score is "+ explorer.getKnowledge());
       scanner.close();
}
}