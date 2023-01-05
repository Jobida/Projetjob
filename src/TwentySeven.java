import java.util.concurrent.Callable;

public class TwentySeven {
    public static void main(String[] args) {
        Animal27 anim = new Dog27();
        anim.name = "Charlie";
        anim.doTrick();
        Animal27 anima = new Cat27();
        anima.name = "cat Wanda";
        anima.doTrick();
        makeAnimalSpeak(anim);
        makeAnimalSpeak(anima);
    }

    public static void makeAnimalSpeak(Animal27 animal) {
        if (animal instanceof Dog27) {
            Dog27 dog = (Dog27) animal;
            dog.bark();
        } else if(animal instanceof Cat27) {
            Cat27 cat =(Cat27) animal;
            cat.meow();


        }








    }
}
