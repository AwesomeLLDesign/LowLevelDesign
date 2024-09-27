package LimitedTimeDeals.Response;

import LimitedTimeDeals.Modals.LimitedTimeDeal;

public class Response {

    public Response(int statusCode, String message, LimitedTimeDeal result) {
        this.statusCode = statusCode;
        this.message = message;
        this.result = result;
    }

    private int statusCode;
    private String message;
    private LimitedTimeDeal result;

    public int getStatusCode() {
        return statusCode;
    }

    public String getMessage() {
        return message;
    }

    public LimitedTimeDeal getResult() {
        return result;
    }
}
