package by.shop;

public class Client extends Human {

    @Override
    public void speak(String say) {
        System.out.println("Клиент: " + say);
    }
}
