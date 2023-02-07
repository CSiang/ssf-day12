package ssf2022.day12.Repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import ssf2022.day12.model.Item;

@Repository
public class itemRepo {
    
    private List<Item> itemList;

    public List<Item> getCartItems() {

        itemList = new ArrayList<Item>();

        Item itm = new Item();
        itm.setItemName("Louis Vuitton");
        itm.setQuantity(5);
        itemList.add(itm);

        itm = new Item();
        itm.setItemName("Channel");
        itm.setQuantity(6);
        itemList.add(itm);

        itm = new Item();
        itm.setItemName("Prada");
        itm.setQuantity(10);
        itemList.add(itm);

        itm = new Item();
        itm.setItemName("Hermes");
        itm.setQuantity(1);
        itemList.add(itm);

        itm = new Item();
        itm.setItemName("Bottega");
        itm.setQuantity(3);
        itemList.add(itm);

        return itemList;
    }
    
}
