public class Eighteen {
    public static void main(String[] args){
        int[] array ={1,2,3,4,5};
        try {
            getFifthElement(array);
        }catch (Exception ex){
            System.out.println("caught!");
        }
        Dog dog = new Dog();

        try { Dog dog2 = null;
            dog.greet(dog2);
        }catch (Exception ex){
            System.out.println("caught!");
        }
    }
    public static void getFifthElement(int[] array){
        System.out.println(array[5]);
    }
}
