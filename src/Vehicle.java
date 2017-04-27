/**
 * Created by blockost on 27/04/17.
 */
public class Vehicle {
    private String sipp;
    private String name;
    private float price;
    private String supplier;
    private float rating;

    public Vehicle(String sipp, String name, float price, String supplier, float rating) {
        this.sipp = sipp;
        this.name = name;
        this.price = price;
        this.supplier = supplier;
        this.rating = rating;
    }

    public String getSipp() {
        return sipp;
    }

    public void setSipp(String sipp) {
        this.sipp = sipp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
            "sipp='" + sipp + '\'' +
            ", name='" + name + '\'' +
            ", price=" + price +
            ", supplier='" + supplier + '\'' +
            ", rating=" + rating +
            '}';
    }
}
