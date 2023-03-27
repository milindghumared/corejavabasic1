public class ClassInheritance {
    float salary = 5000;
}

class ChildA extends ClassInheritance{
    float bonus = 1000;
    public  static void main(String args[]){
        ClassInheritance i = new ClassInheritance();
        System.out.println(i.salary);
    }

}

