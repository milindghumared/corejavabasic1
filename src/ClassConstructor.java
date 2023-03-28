public class ClassConstructor {
 int a;

 public  ClassConstructor(){
     a=100;
 }
    public static void main(String[] args) {
        ClassConstructor myObj = new ClassConstructor();
        System.out.println(myObj.a);
    }
}
