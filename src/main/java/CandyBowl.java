import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class CandyBowl {
  //Declare candy classes
  public class Skittle {
    String color;
  }

  public class MandM {
    String color;
  }

  public class ReesesPiece {
    String color;
  }

  List<Object> bowl;

  public List<String> colors = Arrays.asList("Red","Orange","Yellow","Green");

  public void fillCandyBowl() {
    List<Object> candyBowl = new ArrayList<>();
    Random rand = new Random();
    int candyValue;
    int colorValue;

    //add 100 candy pieces to the bowl
    for (int i = 0; i < 100; i++) {
      // generate a random value for candy and color
      candyValue = rand.nextInt(3);
      colorValue = rand.nextInt(4);

      // add a Skittle
      if (candyValue  == 0) {
        Skittle s = new Skittle();
        if (colorValue == 0)
          s.color = colors.get(colorValue);
        if (colorValue == 1)
          s.color = colors.get(colorValue);
        if (colorValue == 2)
          s.color = colors.get(colorValue);
        if (colorValue == 3)
          s.color = colors.get(colorValue);

        candyBowl.add(s);
      }

      // or add an M&M
      if (candyValue == 1) {
        MandM m = new MandM();
        if (colorValue == 0)
          m.color = colors.get(colorValue);
        if (colorValue == 1)
          m.color = colors.get(colorValue);
        if (colorValue == 2)
          m.color = colors.get(colorValue);
        if (colorValue == 3)
          m.color = colors.get(colorValue);

        candyBowl.add(m);
      }

      // or add a Reese's Piece
      if (candyValue == 2) {
        ReesesPiece r = new ReesesPiece();
        if (colorValue == 0)
          r.color = colors.get(colorValue);
        if (colorValue == 1)
          r.color = colors.get(colorValue);
        if (colorValue == 2)
          r.color = colors.get(colorValue);
        if (colorValue == 3)
          r.color = colors.get(colorValue);

        candyBowl.add(r);
      }
    }

    bowl = candyBowl;
    System.out.println("Size of bowl: " + candyBowl.size());
  }

  public void print() {
    for (int i = 0; i < bowl.size(); i++) {
      if (bowl.get(i).getClass().toString().contains("Skittle"))
        System.out.println((i + 1) + " " + ((Skittle)bowl.get(i)).color + " Skittle");
      else if (bowl.get(i).getClass().toString().contains("MandM"))
        System.out.println((i + 1) + " " + ((MandM)bowl.get(i)).color + " M&M");
      else
        System.out.println((i + 1) + " " + ((ReesesPiece)bowl.get(i)).color + " Reese's Piece");
    }
  }

  //sort first by candy type, then by color (alphabetically)
  public void sort() {
    List<Object> sortedBowl = new ArrayList<>();
    List<Skittle> skittles = new ArrayList<>();
    List<MandM> mandms = new ArrayList<>();
    List<ReesesPiece> reesesPieces = new ArrayList<>();

    for (int i = 0; i < bowl.size(); i++) {
      if (bowl.get(i).getClass().toString().contains("Skittle"))
        skittles.add((Skittle)bowl.get(i));
      else if (bowl.get(i).getClass().toString().contains("MandM"))
        mandms.add((MandM)bowl.get(i));
      else
        reesesPieces.add((ReesesPiece)bowl.get(i));
    }

    Collections.sort(skittles, (Skittle s1, Skittle s2) -> s1.color.compareTo(s2.color));

    Collections.sort(mandms, (MandM m1, MandM m2) -> m1.color.compareTo(m2.color));

    Collections.sort(reesesPieces, (ReesesPiece r1, ReesesPiece r2) -> r1.color.compareTo(r2.color));

    sortedBowl.addAll(mandms);
    sortedBowl.addAll(skittles);
    sortedBowl.addAll(reesesPieces);
  }
}
