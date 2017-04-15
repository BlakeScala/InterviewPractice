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
      candyValue = rand.nextInt(2);
      colorValue = rand.nextInt(4);
      System.out.println(i);

      //add a skittle
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

      //or add an m&m
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
    }

    bowl = candyBowl;
    System.out.println("Size of bowl: " + candyBowl.size());
  }

  public void print() {
    for (int i = 0; i < bowl.size(); i++) {
      if (bowl.get(i).getClass().toString().contains("Skittle")) {
        System.out.println((i + 1) + " " + ((Skittle)bowl.get(i)).color + " skittle");
      } else {
        System.out.println((i + 1) + " " + ((MandM)bowl.get(i)).color + " m&m");
      }
    }
  }

  //sort first by candy type, then by color (alphabetically)
  public void sort() {
    List<Object> sortedBowl = new ArrayList<>();
    List<Skittle> skittles = new ArrayList<>();
    List<MandM> mandms = new ArrayList<>();

    for (int i = 0; i < bowl.size(); i++) {
      if (bowl.get(i).getClass().toString().contains("Skittle"))
        skittles.add((Skittle)bowl.get(i));
      else
        mandms.add((MandM)bowl.get(i));
    }

    Collections.sort(skittles, (Skittle s1, Skittle s2) -> s1.color.compareTo(s2.color));

    Collections.sort(mandms, (MandM m1, MandM m2) -> m1.color.compareTo(m2.color));

    sortedBowl.addAll(mandms);
    sortedBowl.addAll(skittles);
  }
}
