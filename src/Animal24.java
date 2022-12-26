public class Animal24 {
    //fields for animal class
    public String name;
    public int age;
    //parameterized constructor for animal class
    public Animal24(String name , int age){
        this.name=name;
        this.age=age;
        System.out.println("Animal Class Parameterized Constructor Called");
    }
    public  void printAnimalInfo(){
        System.out.println("My name is "+this.name+" ,I am "+this.age+
                " year(s) old.");
    }
}
