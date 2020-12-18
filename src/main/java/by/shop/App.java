package by.shop;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Human client = new Client();
        Human seller = new Seller();

        client.speak("Клиент: Добрый день!");
        seller.speak("Продавец: Добрый день!");
        client.speak("Клиент: Могу ли я приобрести часы?");

        Scanner in = new Scanner(System.in);
        System.out.println("Введите: Да/Нет");
        int attempt = 4;

        for (int i = 0; i < attempt; i++) {

            String line = in.nextLine();

            if (line.equals("Да")) {
                System.out.println("Продавец: Какие вас интересуют?");
                System.exit(0);
            } else if (line.equals("Нет")) {
                System.out.println("Клиент: Извините, хорошего дня!");
                seller.speak("Продавец: Спасибо, и Вам хорошего дня!");
                System.exit(0);
            } else {
                if (i < 3) {
                    System.out.println("Не корректный ответ. Попробуйте еще раз");
                    continue;
                }
                System.out.println("Давай досвидания");
            }
        }
    }
}











