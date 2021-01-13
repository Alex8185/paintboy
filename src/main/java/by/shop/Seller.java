package by.shop;

public class Seller extends Human {

    @Override
    public void speak(String phrase) {
        System.out.println("Продавец: " + phrase);
    }
}
