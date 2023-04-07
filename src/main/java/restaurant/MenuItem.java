package restaurant;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class MenuItem {
    // Fields
    private String description;
    private double price;
    private String category;
    private boolean isNew;
    private String name;

    public MenuItem(String name, String description, double price, String category, boolean isNew) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.isNew = isNew;
    }

    // Methods
    public boolean checkIfNew() {
        return this.isNew;
    }

    public String printMenuItem() {
        return this.toString();
    }

    // Getters/setters
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // toString
    @Override
    public String toString() {
        return name + ": " + description + ". $" + price;
    }

    // toEquals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return Double.compare(menuItem.price, price) == 0 && description.equals(menuItem.description) && category.equals(menuItem.category) && name.equals(menuItem.name);
    }

    //hashCode
    @Override
    public int hashCode() {
        return Objects.hash(description, price, category, name);
    }
}
