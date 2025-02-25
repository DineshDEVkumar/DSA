package Technical_Training;
import java.util.*;
public class HouseMethod2 {
    public static int maxIndex(int arr[]){
        int max=arr[0],index=0;
        for(int i=1;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
                index=i;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int house[]=Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int i=maxIndex(house), n=house.length,result=0;
        while(house[i]!=0){
            result+=house[i];
            house[i]=0;
            if(i!=0){
                house[i-1]=0;
            }
            if(i!=n-1){
                house[i+1]=0;
            }
            i=maxIndex(house);
        }
        System.out.println(result);
        scan.close();
    }
}
