package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    // Fields
    private Date dateUpdated;
    private ArrayList<MenuItem> items;

    public Menu(ArrayList<MenuItem> items) {
        this.items = items;
    }


    // Methods
    public void addItem(MenuItem item) {
        items.add(item);
    }

    public void removeItem(MenuItem item) {
        items.remove(item);
    }

    public Date checkDateUpdated() {
        return this.dateUpdated;
    }

    public String printMenu() {
        return this.toString();
    }

    // Getters/Setters
    public Date getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "items=" + items +
                '}';
    }
}
