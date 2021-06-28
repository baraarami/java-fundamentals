

import java.util.Random;

public class library {
    public static void main(String[] args) {
        int index = 0;
        do {
            index = roll(5);
            System.out.print( index + ",");
        }
        while (index != 5);

        int[] withDuplictes = new int[]{1, 2, 3, 5};
        System.out.println("Checking array with duplicate" + duplicates(withDuplictes));

        int[] avg = new int[]{5, 6, 7, 8};
        System.out.println("AVG of the Array" + AVG(avg));


        int[][] lowestAvgInstact = new int[][]{
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        System.out.println("Lowest Avg " + LowestAVG(lowestAvgInstact));
    }

    public static int roll(int seed) {
        Random random;
        random = new Random();
        return random.nextInt(seed) + 1;
    }

    public static boolean duplicates(int[] arr) {
        boolean dulicatNum = false;
        for (int i = 0; i < arr.length; i++)
            for (int k = i + 1; k < arr.length; k++)
                if (k != i && arr[k] == arr[i])
                    dulicatNum = true;
        return dulicatNum;
    }


    public static double AVG(int[] arr) {
        if (arr.length == 0) {
            return 0;

        } else {
            int sum = 0;
            double avgNum = 0;
            int size = arr.length;
            for (int x : arr) {
                sum += x;
            }
            avgNum = sum / size;
            return avgNum;
        }
    }

    public static int[] LowestAVG(int[][]arr){
        double currentSum=0;
        double currentAvg=0;
        double lowAvg= 0;
        int indexOfLowestArray=0;
        
        for (int x : arr[0]){
            currentAvg+=x;
        }
        lowAvg=currentSum/arr[0].length;
        
        for (int i =1 ; i <arr.length ; i++){
            currentSum=0 ;
            for (int x:arr[i]){
                currentSum+=x;
            }
        currentAvg =currentSum/ arr[i].length;
            if (lowAvg>currentAvg){
                lowAvg=currentAvg;
                indexOfLowestArray=i;
            }
        
        }
        return arr[indexOfLowestArray];
    }

}
