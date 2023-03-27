public class Herarchicalinheritance {
 public  static  void main(String args[]){
     Lion l = new Lion();
     l.King();
     l.eat();


 }

}

class Animals{
    void eat(){
        System.out.println("eating");
    }
}

class Dogs extends Animals{
    void bark (){
        System.out.print("barking");
    }
}

class Lion extends  Animals{
    void King(){
        System.out.println( "king of animals");
    }
}
