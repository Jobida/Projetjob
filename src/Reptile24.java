public class Reptile24 extends Animal24{
    public int legCount;

    public Reptile24(String name, int age,int legCount) {
        super(name, age);
        this.legCount=legCount;
        System.out.println("Reptile Class Parameterized Constructor Called.");

    }
    @Override
    public void printAnimalInfo(){
        super.printAnimalInfo();
        System.out.println("I am a Reptile with "+legCount+" leg(s).");
    }
}
