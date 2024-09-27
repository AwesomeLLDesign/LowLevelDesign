package LimitedTimeDeals.DB;

import LimitedTimeDeals.Modals.LimitedTimeDeal;

import java.util.HashMap;
import java.util.Map;

public class DealStorage implements IStorage{

    public DealStorage(){

    }

    private Map<Long, LimitedTimeDeal> dealStorage = new HashMap();

    public void putDeal(long id, LimitedTimeDeal limitedTimeDeal){
        if(id <= 0 ){
            dealStorage.put(id,limitedTimeDeal);
        }
    }

    public LimitedTimeDeal getDeal(long id){
        return dealStorage.get(id);
    }
}
