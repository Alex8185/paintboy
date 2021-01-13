package by.shop;

public class Store {

    private Seller seller;
    private String[] items = new String[]{"НАСТЕННЫЕ", "НАРУЧНЫЕ", "НАСТОЛЬНЫЕ"};


    public void logic() {
        for (int a = 0; a < items.length; a++) {
            System.out.println((a + 1) + ". " + items[a]);
        }
    }
}