/**
 * Created by blockost on 27/04/17.
 */
public class Vehicle {
    private String sipp;
    private String name;
    private Float price;
    private String supplier;
    private Float rating;

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

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public Float getRating() {
        return rating;
    }

    public void setRating(Float rating) {
        this.rating = rating;
    }

    public String getSpec() {
        return String.format("%s - %s - %s", name, sipp, SIPPToString());
    }

    private String SIPPToString() {
        StringBuilder builder = new StringBuilder();
        int length = sipp.length();

        for (int i = 0; i < length; i++) {
            builder.append(SIPPHelper.toString(sipp.charAt(i), i));
            if (i < length - 1) builder.append(" - ");
        }

        return builder.toString();
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
