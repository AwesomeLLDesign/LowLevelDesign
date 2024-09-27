package LimitedTimeDeals.Services.Impl;

import LimitedTimeDeals.DB.DealStorage;
import LimitedTimeDeals.DB.ItemStorage;
import LimitedTimeDeals.Modals.DealItem;
import LimitedTimeDeals.Modals.LimitedTimeDeal;
import LimitedTimeDeals.Response.Response;
import LimitedTimeDeals.Services.ILimitedTimeDealService;

public class LimitedTimeDealServiceImpl implements ILimitedTimeDealService {

    private ItemStorage itemStorage;
    private DealStorage dealStorage;

    public LimitedTimeDealServiceImpl(ItemStorage itemStorage,DealStorage dealStorage){
        this.itemStorage = itemStorage;
        this.dealStorage = dealStorage;
    }
    private long limitedDealId = 1;

    public Response createLimitedTimeDeal(String dealStartTime,String dealEndTime,
                                          long itemPrice, long quantity, long itemId) {
        DealItem dealItem = itemStorage.getItemName(itemId);
        LimitedTimeDeal limitedTimeDeal = new LimitedTimeDeal(limitedDealId,dealStartTime,dealEndTime,itemPrice,quantity,true);
        dealStorage.putDeal(limitedDealId,limitedTimeDeal);
        return new Response(200, "Create a new Deal",limitedTimeDeal);
    }

    public Response updateTimeForDeal(long dealId, String dealEndTime) {
        return null;
    }

    public Response updateQuantitiesForDeal(long dealId, long quantity) {
        return null;
    }

    public Response endLimitedTimeDeal(long dealId, Boolean isActive) {
        return null;
    }
}
