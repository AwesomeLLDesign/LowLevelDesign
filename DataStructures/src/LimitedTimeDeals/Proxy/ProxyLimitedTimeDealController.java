package LimitedTimeDeals.Proxy;

import LimitedTimeDeals.Controllers.LimitedTimeDealController;
import LimitedTimeDeals.Response.Response;

//Path("/LimitedTimeDeal")
public class ProxyLimitedTimeDealController {


    //Path("/createDeal")
    //@POST
    public Response createLimitedTimeDeal(String dealStartTime, String dealEndTime,
                                          long itemPrice, long quantity, long itemId) {
        Response response = null;
        try {
            if(checkAccess("1")){
                LimitedTimeDealController limitedTimeDealController = new LimitedTimeDealController();
                response = limitedTimeDealController.createLimitedTimeDeal("10/02/2024 12:12:12IST","11/02/2024 12:12:12IST",
                        30000,200,1);
            }
           } catch (Exception e) {
            System.out.println(e.getMessage());
            //logging
        }
        return response;
    }

    private boolean checkAccess(String userId){
        //user storage
        return true;
    }


}
