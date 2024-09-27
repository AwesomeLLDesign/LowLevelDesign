package LimitedTimeDeals.Controllers;

import LimitedTimeDeals.DB.DealStorage;
import LimitedTimeDeals.DB.ItemStorage;
import LimitedTimeDeals.Response.Response;
import LimitedTimeDeals.Services.ILimitedTimeDealService;
import LimitedTimeDeals.Services.Impl.LimitedTimeDealServiceImpl;

//Path("/LimitedTimeDeal")
public class LimitedTimeDealController {

    private ILimitedTimeDealService limitedTimeDealService;
    private ItemStorage itemStorage;
    private DealStorage dealStorage;

    public LimitedTimeDealController() {
        itemStorage = new ItemStorage();
        dealStorage = new DealStorage();
        limitedTimeDealService = new LimitedTimeDealServiceImpl(itemStorage, dealStorage);
    }

    //Path("/createDeal")
    //@POST
    public Response createLimitedTimeDeal(String dealStartTime, String dealEndTime,
                                          long itemPrice, long quantity, long itemId) {
        Response response = null;
        try {
            response = limitedTimeDealService.createLimitedTimeDeal(dealStartTime, dealEndTime, itemPrice, quantity, itemId);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            //logging
        }
        return response;
    }

    //Path("/updateDeal/{time}")
    //@PUT
    public Response updateTimeForDeal(long dealId, String dealEndTime) {

        return null;
    }

    //Path("/updateDeal/{quantity}")
    //@PUT
    public Response updateQuantitiesForDeal(long dealId, long quantity) {

        return null;
    }

    //Path("/endDeal/")
    //@PUT
    public Response endLimitedTimeDeal(long dealId, Boolean isActive) {

        return null;
    }


}
