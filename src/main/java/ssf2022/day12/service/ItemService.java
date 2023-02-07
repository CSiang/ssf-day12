package ssf2022.day12.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ssf2022.day12.Repository.itemRepo;
import ssf2022.day12.model.Item;

@Service
public class ItemService {
    
    @Autowired
    itemRepo itmRepo;

    public List<Item> retriveItemList() {
        return itmRepo.getCartItems();
    }

}
