import java.util.HashSet;
import java.util.Set;

class App {
public String analyzWether(int[][] arr) {
    Set<Integer> uniqueTemperatures= new HashSet<>();
    int high =0;
    int low = arr[0][0];
    String output = "";
    for (int [] innerArr : arr){
        for (int x : innerArr){
            uniqueTemperatures.add(x);
            if (x > high)
                high=x;
            if (x < low)
                low=x;
        }
    }
    output+= "High :"+ high+"\nLow :"+low;
    for (int i = low ; i <=high ; i++){
        if (! uniqueTemperatures.contains(i))
            output+="\nNever saw temperature : " + i;
    }
    return output;

}
public static void main(String[] args){
    int [][] weeklyMonthTemperatures = {
            {66, 64, 58, 65, 71, 57, 60},
            {57, 65, 65, 70, 72, 65, 51},
            {55, 54, 60, 53, 59, 57, 61},
            {65, 56, 55, 52, 55, 62, 57}
    };
    App testObject = new App();
    String output = testObject.analyzWether(weeklyMonthTemperatures);
    System.out.println(output);
}
}
