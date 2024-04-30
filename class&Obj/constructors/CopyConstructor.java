class CopyConstructor{
    String name;
    int rollno;

    CopyConstructor(String name, int rollno){
        this.name = name;
        this.rollno = rollno;
    }
    CopyConstructor(CopyConstructor obj){
        this.name = obj.name;
        this.rollno = obj.rollno;
    }
    public static void main(String args[]){
        CopyConstructor user = new CopyConstructor("Priyanshu", 17);
        CopyConstructor user1 = new CopyConstructor(user);
        System.out.println(user1.name + " " + user1.rollno);
    }
}
