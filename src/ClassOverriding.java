class ClassOverrding {
    public static void main(String[] args) {
        Dogss d1 = new Dogss();
        d1.displayInfo();
    }
}
class Animalss {
    public void displayInfo() {
        System.out.println("I am an animal.");
    }
}

class Dogss extends Animalss {
    @Override
    public void displayInfo() {
        System.out.println("I am a dog.");
    }
}

