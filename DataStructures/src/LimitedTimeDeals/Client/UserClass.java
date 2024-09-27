package LimitedTimeDeals.Client;

import LimitedTimeDeals.Controllers.LimitedTimeDealController;
import LimitedTimeDeals.Response.Response;

public class UserClass {

    public static void main(String[] args) {
        LimitedTimeDealController limitedTimeDealController = new LimitedTimeDealController();
        Response response = limitedTimeDealController.createLimitedTimeDeal("10/02/2024 12:12:12IST","11/02/2024 12:12:12IST",
                30000,200,1);
        System.out.println("Message" + response.getMessage());
        System.out.println("Status Code" +response.getStatusCode());
        System.out.println("Status Code" + response.getResult());
    }

}
