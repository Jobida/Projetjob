public class Dog24 extends Animal24{
    public String breed;
    public Dog24(String name,String breed,int age){
        super(name,age);
        this.breed=breed;
        System.out.println("Dog Class Parameterized Constructor Called");
    }
    @Override
    public void printAnimalInfo(){
        super.printAnimalInfo();
        System.out.println("I am a dog and my breed is: "+ this.breed+ ".");
    }

    }

