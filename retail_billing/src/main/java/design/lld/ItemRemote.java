package design.lld;
import java.util.List;

public interface ItemRemote {
    String newItem (Items items);
    List<Items> viewItems();
    void alterItem (int itemId);
    String discontinue (int itemId);
}
    

    
    
    

