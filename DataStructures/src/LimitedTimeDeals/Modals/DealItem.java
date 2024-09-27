package LimitedTimeDeals.Modals;

public class DealItem {

    public DealItem(long id, String name, long itemPrice){
        this.id = id;
        this.name = name;
        this.itemPrice = itemPrice;
    }

    private long id;
    private String name;
    private long itemPrice;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(long itemPrice) {
        this.itemPrice = itemPrice;
    }
}
