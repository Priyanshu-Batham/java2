import java.io.*;
class Power{
	public static void main(String args[])throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the Base: ");
		int base = Integer.parseInt(br.readLine());
		System.out.print("Enter the Exponent: ");
		int expo = Integer.parseInt(br.readLine());

		int answer = base;

		for(; expo>1; expo--){
			answer *= base;
		}

		System.out.print("Answer: "+answer);
	}
}