package by.shop;

public class Admin extends Human {

    @Override
    public void speak(String say) {
        System.out.println("Система: " + say);

    }
}
