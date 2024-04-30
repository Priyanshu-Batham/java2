import java.io.*;
import java.util.*;

class BinarySearch{
  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Enter the amount of numbers: ");
    int n = Integer.parseInt(br.readLine());
  
    int arr[] = new int[n];
    boolean flag = false;
    
    for(int i = 0; i<n; i++){
      System.out.print("Enter number: ");
      arr[i] = Integer.parseInt(br.readLine());
    }

    Arrays.sort(arr);

    System.out.println("");
    System.out.print("Enter number to search: ");
    int num = Integer.parseInt(br.readLine());

    int low = 0, high = n-1;
    
    while(low <= high){
      int mid = (low+high)/2;
      if(arr[mid] == num){
        System.out.print(num + "is present");
        flag = true;
        break;
      }

      else if(arr[mid] > num) high = mid-1;
      else low = mid+1;
    }

    if(!flag) System.out.print(num + " not found" );
  }
}