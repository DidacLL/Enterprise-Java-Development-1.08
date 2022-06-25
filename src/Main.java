import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDateTime;

public class Main {
    /*
Suppose you are building a video streaming service. All Videos are either tv series or movies.
 Create classes TvSeries and Movie which extend an Abstract class Video. Add a few methods and properties to each.


You will need two implementations of IntList.
The first implementation is IntArrayList.
The second implementation is IntVector. IntVector should store numbers in an array with a length of 20 by default. When the add method is called, you must first determine if the array is full. If it is, create a new array that is double the size of the current array, move all elements over to the new array and add the new element. (for example, an array of length 10 would be increased to 20)
In your README.md include an example of when IntArrayList would be more efficient and when IntVector would be more efficient.*/
    public static void main(String[] args) {
        long execTime = System.currentTimeMillis();

        var myList= new IntArrayList();
        for (int i=0;i<1000000;i++){
            myList.add((int) (Math.random()*100));
//            System.out.println(myList.get(i));
        }

        int time1= (int) (System.currentTimeMillis()-execTime);

        long execTime2 = System.currentTimeMillis();
        var myList2= new IntVector();
        for (int i=0;i<1000000;i++){
            myList2.add((int) (Math.random()*100));
//            System.out.println(myList2.get(i));
        }
        int time2= (int) (System.currentTimeMillis()-execTime2);
        System.out.println("IntArrayList execution time: "+time1);
        System.out.println("IntVector Execution time: "+ time2);
    }


    public static float roundBigDecimal(BigDecimal bigDecimal) {
        return bigDecimal.setScale(2, RoundingMode.HALF_UP).floatValue();
    }

    public static BigDecimal changeSignAndRound(BigDecimal num){
        return num.negate().setScale(1,RoundingMode.HALF_UP);
    }
}