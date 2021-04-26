package com.example.Portfolio2_Showtime.item;


/*import javax.persistence.*;*/

/*@Entity
@Table*/
public class Item {

/*    @Id
    @SequenceGenerator(
            name = "item_sequence",
            sequenceName = "item_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "item_sequence"
    )*/
    private int id;
    private String name;
    private double price;
    private String pictureURL;
    private String description;

    public Item() {

    }

    public Item(int id, String name, double price, String pictureURL, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.pictureURL = pictureURL;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPictureURL() {
        return pictureURL;
    }

    public void setPictureURL(String pictureURL) {
        this.pictureURL = pictureURL;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", pictureURL='" + pictureURL + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
