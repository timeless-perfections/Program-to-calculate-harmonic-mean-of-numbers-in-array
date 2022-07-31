import java.util.Arrays;

public class main {
    public static void main(String[] args) {
      int [] array = {1, 2, 3, 4, 5};
      double total;
      float result = 0;
      for (int i : array){
          result += 1f / i;
      }
        total = array.length / result;

        System.out.println("Harmonic Average = " + total);

    }

}
