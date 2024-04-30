public class Test1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int s = a++ + ++b * ++a;
        //10 + 21 * 12
        //10 + 252
        //262
        System.out.println(s);
        System.out.println(a);
        System.out.println(b);


        s = 10;
        a = 48;
        b = 12;
        s += ++b + a++ / b++;
        //10+ (13 + 48/13)
        System.out.println(s); //26
        System.out.println(a); //49
        System.out.println(b); //14
    }    
}