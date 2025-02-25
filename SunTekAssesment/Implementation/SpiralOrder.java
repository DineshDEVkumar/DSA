package SunTekAssesment.Implementation;
import java.util.*;
public class SpiralOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        int[][] matrix = new int[rows][columns];
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println("The Spiral order of the matrix is:\n");
        printspiralorder(matrix,rows,columns);
        scanner.close();
    }
    public static void printspiralorder(int[][] matrix,int rows,int columns){
        int top=0,bottom = rows-1;
        int left=0,right = columns-1;
        while(top <= bottom && left<=right){
            for(int i=left;i<=right;i++){
               System.out.println(matrix[top][i]+ " ");
            }
            top++;
            for(int i=top;i<=bottom;i++){
                System.out.println(matrix[i][right]+" ");
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    System.out.println(matrix[bottom][i]+" ");
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    System.out.println(matrix[i][left]+" ");
                }
                left++;
            }
        }
    }
}
