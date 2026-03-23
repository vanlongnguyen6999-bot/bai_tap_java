import java.util.Random;
public class StopWatch {
    private long startTime, endTime;
    public StopWatch(){
        startTime = System.currentTimeMillis();
    }
    public long getStartTime(){
        return startTime;
    }
    public long getEndTime(){
        return endTime;
    }
    public void start(){
        startTime = System.currentTimeMillis();
    }
    public void end(){
        endTime = System.currentTimeMillis();
    }
    public long getElapsedTime(){
        return endTime - startTime;
    }
}
class App{
    public static void main(String[] args){
        int size = 100000;
        int[] arr = new int[size];
        Random rand = new Random();
        for(int i = 0 ; i < size ; i++){
            arr[i] = rand.nextInt(100000);
        }
        StopWatch sw = new StopWatch();
        sw.start();
        selectionSort(arr);
        sw.end();
        System.out.println("Time : " + sw.getElapsedTime() + " ms");
    }
    public static void selectionSort(int[] arr){
        int n = arr.length;
        for(int i = 0 ; i < n ; i++){
            int minIndex = i ;
            for(int j = i + 1 ; j < n ; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int tmp = arr[0];
            arr[0] = arr[minIndex];
            arr[minIndex] = arr[0];
        }
    }
}
