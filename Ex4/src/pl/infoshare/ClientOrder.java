package pl.infoshare;

public class ClientOrder {
    private String name;
    private String address;
    private int telephone;
    private Pizza pizza;
    private Menu menu;
    private Drinks drinks;

    public ClientOrder(String name, String address, int telephone, Pizza pizza, Menu menu, Drinks drinks) {
        this.name = name;
        this.address = address;
        this.telephone = telephone;
        this.pizza = pizza;
        this.menu = menu;
        this.drinks = drinks;
    }
}
