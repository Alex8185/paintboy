package by.shop;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Human client = new Client();
        Human admin = new Admin();
        Store store = new Store(new Seller());
        Human seller = store.getSeller();
        String[] items = store.getItems();

        client.speak("Добрый день!");
        seller.speak("Добрый день!");
        client.speak("Могу ли я приобрести часы?");

        Scanner scanner = new Scanner(System.in);
        admin.speak("Введите: Да/Нет");
        int attempt = 4;
        for (int i = 0; i < attempt; i++) {
            String line = scanner.nextLine();

            if (line.equalsIgnoreCase("Да")) {
                seller.speak("Какие вас интересуют?");
                for (int a = 0; a < items.length; a++) {
                    System.out.println((a + 1) + ". " + items[a]);
                }
                admin.speak("Пожалуйста, сделайте выбор");
                String productNumber = scanner.nextLine();
                int opNumber = Integer.parseInt(productNumber);
                seller.speak(items[opNumber-1] + " Это отличный выбор");
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