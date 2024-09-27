package LowLevelDesign.ListItertor;

import java.util.*;
import java.util.Iterator;

public class ListCollections<T> implements ListOfListItertor {

    List<List<T>> collection;

    public ListCollections(List<List<T>> list){
        super();
        this.collection = list;
    }

    @Override
    public Iterator<T> getItertor() {
        return new ListCollectionImplement(this);
    }

    public static class ListCollectionImplement<T> implements Iterator<T>{
        private int currIndex = 0;
        private int currList = 0;
        private ListCollections<T> listCollection;


        public ListCollectionImplement(ListCollections<T> current){
            this.listCollection = current;
        }
        // {[],[1,2,3],[],[9,8,7]}
        @Override
        public boolean hasNext() {
            if(listCollection.collection.size() > 0){
                while (currList < listCollection.collection.size()) {
                    if (listCollection.collection.get(currList).size() > 0 && currIndex < listCollection.collection.get(currList).size()) {
                            return true;
                    } else {
                        currList++;
                        currIndex = 0;
                    }
                }
            }
            return false;
        }

        @Override
        public T next() {
            if (this.hasNext()){
                T obj = listCollection.collection.get(currList).get(currIndex);
                currIndex++;
                if(currIndex >= listCollection.collection.get(currList).size()){
                    currList++;
                    currIndex = 0;
                }
                return obj;
            }
            return null;
        }
    }
}


