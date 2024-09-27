package LimitedTimeDeals.DB;

import LimitedTimeDeals.Modals.DealItem;

import java.util.*;

public class ItemStorage implements IStorage{

    private ItemStorage(){

    }
    private ItemStorage itemStorage;

    public ItemStorage getInstance(){

        if(itemStorage == null){
            itemStorage = new ItemStorage();
        }
        feedItemsData();
        return itemStorage;
    }

    private Map<Integer, DealItem> itemStorageMap = new HashMap();

    public void feedItemsData(){
        itemStorageMap.put(1,new DealItem(1,"Apple Iphone",70000));
        itemStorageMap.put(2,new DealItem(1,"Macbook",80000));
    }

    public DealItem getItemName(long id){
        return itemStorageMap.get(id);
    }


}
