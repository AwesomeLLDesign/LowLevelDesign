package LimitedTimeDeals.Modals;

public class LimitedTimeDeal {

    public LimitedTimeDeal(long id, String startTime, String endTime, long dealPrice, long quantity, boolean isAcive) {
        this.id = id;
        this.startTime = startTime;
        this.endTime = endTime;
        this.dealPrice = dealPrice;
        this.quantity = quantity;
        this.isAcive = isAcive;
    }

    private long id;
    private String startTime;
    private String endTime;
    private long dealPrice;
    private long quantity;
    private boolean isAcive;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public long getDealPrice() {
        return dealPrice;
    }

    public void setDealPrice(long dealPrice) {
        this.dealPrice = dealPrice;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public boolean isAcive() {
        return isAcive;
    }

    public void setAcive(boolean acive) {
        isAcive = acive;
    }
}
