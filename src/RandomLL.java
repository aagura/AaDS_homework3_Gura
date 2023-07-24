import java.util.Random;

public class  RandomLL {


     public static LL fill(int size, int min, int max) {
         LL list = new LL();
         Random random = new Random();
         for (int i = 0; i < size; i++) {
             int randomValue = random.nextInt(max - min + 1) + min;
             list.add(randomValue);;
         }
        return list;
     }
}


