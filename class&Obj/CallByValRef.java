class CallByValRef {
    int x;
    static void change(int j) {
        j = j * 2;
    }

    static void change(CallByValRef obj){
        obj.x *= 2;
    }
    public static void main(String[] args) {
        int i = 5;
        CallByValRef obj = new CallByValRef();
        obj.x = 10;
        change(obj);
        change(i);

        System.out.println("Value of i is " + i);
        System.out.println("Value of x is " + obj.x);
    }
}