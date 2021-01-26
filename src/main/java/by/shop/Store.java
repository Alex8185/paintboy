package by.shop;

public class Store {

    private Seller seller;
    private String[] items = new String[]{"НАСТЕННЫЕ", "НАРУЧНЫЕ", "НАСТОЛЬНЫЕ"}; 


    public void logic() {
        for (int a = 0; a < items.length; a++) {
            System.out.println((a + 1) + ". " + items[a]);
        }
    }


    public Store(Seller seller) {
        this.seller = seller;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public String[] getItems() {
        return items;
    }

    public void setItems(String[] items) {
        this.items = items;
    }
}
