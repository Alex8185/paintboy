package by.shop;

import com.sun.deploy.security.SelectableSecurityManager;

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

        for (int i = 0; i < 10; i++) {
            String line = in.nextLine();

            if (line.equals("Да")) {
                System.out.println("Продавец: Какие вас интересуют?");
            } else if (line.equals("Нет")) {
                System.out.println("Клиент: Извините, хорошего дня!");
                seller.speak("Продавец: Спасибо, и Вам хорошего дня!");

            } else if (true) {

                System.out.println("Ответ не корректен!");
                System.out.println("Попробуйте еще раз");

                if (i > 2) {
                    System.out.println("Ничего личного, но ты сегодня не в адеквате, чувак!");
                }
            }
        }
    }
}










