public class ClassMultiLevelInheritance {
        public static void main(String args[]){
            Dog2 d=new Dog2();
            d.bark();
            d.eat();
            d.sleep();
        }}

    class Animal1{
        void eat(){
            System.out.println("eating...");
        }
    }
    class Dog1 extends Animal1 {
        void bark() {
            System.out.println("barking...");
        }
    }

    class Dog2 extends  Dog1{
    void sleep(){
        System.out.print("sleeping");
    }

}
