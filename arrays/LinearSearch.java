import java.io.*;

class LinearSearch{
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

    System.out.println("");
    System.out.print("Enter number to search: ");
    int num = Integer.parseInt(br.readLine());

    for(int i = 0; i<n; i++){
      if(arr[i] == num) System.out.println("Number found at index: "+(i));
      flag = true;
    }

    if(!flag) System.out.print(num + " not found" );
  }
}