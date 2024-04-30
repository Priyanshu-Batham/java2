import java.io.*;
class LargeSmol{
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter how many numbers: ");
		int num = Integer.parseInt(br.readLine());
		int big = 0, smol = Integer.MAX_VALUE;
			
		do{
			System.out.print("Enter number: ");
			int n = Integer.parseInt(br.readLine());

			if(n > big) big = n;
			if(n < smol) smol = n;
		}while(--num > 0);

		System.out.println("Biggest Number: "+big);
		System.out.println("Smallest Number: "+smol);
	}
}