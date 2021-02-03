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

                int attemptNumberItems = 2;
                for (int b = 0; b < attemptNumberItems; b++) {
                String productNumber = scanner.nextLine();

                try {
                    int opNumber = Integer.parseInt(productNumber);
                    seller.speak(items[opNumber - 1] + " Это отличный выбор");
                    System.exit(0);
                } catch (NumberFormatException e) {
                    admin.speak("Значение не верно, введите корректное значение");
                } catch (ArrayIndexOutOfBoundsException e) {
                    admin.speak("Введите корректное значение или закончите покупки");
                    if (b < 1)
                        continue;
                    scanner.nextLine();
                }}

            } else if (line.equalsIgnoreCase("Нет")) {
                client.speak("Извините, хорошего дня!");
                seller.speak("Спасибо, и Вам хорошего дня!");
                System.exit(0);
                scanner.close();
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