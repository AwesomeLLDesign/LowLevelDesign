package LimitedTimeDeals.Services;

import LimitedTimeDeals.Response.Response;

public interface ILimitedTimeDealService {

    public Response createLimitedTimeDeal(String dealStartTime,String dealEndTime,
                                          long itemPrice,long quantity, long itemId);

    public Response updateTimeForDeal(long dealId,  String  dealEndTime);

    public Response updateQuantitiesForDeal(long dealId,  long quantity);

    public Response endLimitedTimeDeal(long dealId, Boolean isActive);



}
