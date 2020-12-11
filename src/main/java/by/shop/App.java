package by.shop;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        Human client = new Client();
        Human seller = new Seller();

        client.speak("Клиент: Добрый день!");
        seller.speak("Продавец: Добрый день!");
        client.speak("Клиент: Могу ли я приобрести часы?");

        Scanner in = new Scanner(System.in);
        System.out.println("Введите: Да/Нет");
        String str1 = in.nextLine();
        String str2 = "Да";

        boolean i = str1.equals(str2);
        boolean a = false;
        if (a = i) {

            System.out.println("Продавец: Какие вас интересуют?");
        } else {
            System.out.println("Клиент: Извините, хорошего дня!");
            seller.speak("Продавец: Спасибо, и Вам хорошего дня!");
        }


    }


}
