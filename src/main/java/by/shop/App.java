package by.shop;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Human client = new Client();
        Human seller = new Seller();
        Human admin = new Admin();

        client.speak("Добрый день!");
        seller.speak("Добрый день!");
        client.speak("Могу ли я приобрести часы?");

        Scanner in = new Scanner(System.in);
        admin.speak("Введите: Да/Нет");
        int attempt = 4;
        for (int i = 0; i < attempt; i++) {
            String line = in.nextLine();

            if (line.equals("Да")) {
                seller.speak("Какие вас интересуют?");


                admin.speak("Пожалуйста, сделайте выбор");
                String line1 = in.nextLine();


                seller.speak(" - отличный выбор");
                System.exit(0);

            } else if (line.equals("Нет")) {
                client.speak("Извините, хорошего дня!");
                seller.speak("Спасибо, и Вам хорошего дня!");
                System.exit(0);
            } else {
                if (i < 3) {
                    admin.speak("Не корректный ответ. Попробуйте еще раз");
                    continue;
                }
                admin.speak("Давай досвидания");
            }
        }
    }
}
