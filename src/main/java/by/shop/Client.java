package by.shop;

public class Client extends Human {

    @Override
    public void speak(String phrase) {
        System.out.println("Клиент: " + phrase);
    }
}
