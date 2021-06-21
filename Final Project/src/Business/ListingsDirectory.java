package Business;

import java.util.ArrayList;
import java.util.List;

public class ListingsDirectory extends Directory<Listings> {
    public ListingsDirectory(){
        super();
    }

    public ListingsDirectory(List<Listings> list){
        super(list);
    }
}
