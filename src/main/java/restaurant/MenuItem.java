package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class MenuItem {
    private String description;
    private double price;
    private String category;
    private boolean isNew;
    private String name;
    private boolean isAvailable;
    private boolean isVegan;
    private Date dateAdded;
    private ArrayList<String> allergens;
    private int spiceLevel;
    private String proteinType;
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

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public boolean isVegan() {
        return isVegan;
    }

    public void setVegan(boolean vegan) {
        isVegan = vegan;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }

    public ArrayList<String> getAllergens() {
        return allergens;
    }

    public void setAllergens(ArrayList<String> allergens) {
        this.allergens = allergens;
    }

    public int getSpiceLevel() {
        return spiceLevel;
    }

    public void setSpiceLevel(int spiceLevel) {
        this.spiceLevel = spiceLevel;
    }

    public String getProteinType() {
        return proteinType;
    }

    public void setProteinType(String proteinType) {
        this.proteinType = proteinType;
    }





}
