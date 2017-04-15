import java.io.Console;

public class App {
  public static void main(String[] args) {
    //fill up a bowl with candy
    CandyBowl bowl = new CandyBowl();
    bowl.fillCandyBowl();
    //print out contents of bowl
    bowl.print();
    //sort candy
    bowl.sort();
    //print again
    System.out.println();
    bowl.print();
  }
}
