package by.shop;

public class Admin extends Human {

    @Override
    public void speak(String phrase) {
        System.out.println("Система: " + phrase);
    }
}
