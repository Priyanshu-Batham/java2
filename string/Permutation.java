import java.io.*;
public class Permutation {
    static String swap(String str , int x, int y){
        char c[] = str.toCharArray();
        char temp = c[x];
        c[x] = c[y];
        c[y] = temp;
        str = new String(c);
        return str;
    }

    static void genPerms(String str, int index){
        if(index == str.length()){
            System.out.println(str);
            return;
        }

        for(int i = index; i<str.length(); i++){
            str = Permutation.swap(str, index, i);
            Permutation.genPerms(str, index+1);
            str = Permutation.swap(str, index, i);
        }
    }
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a string: ");
        String s = br.readLine();

        Permutation.genPerms(s, 0);
    }
}
