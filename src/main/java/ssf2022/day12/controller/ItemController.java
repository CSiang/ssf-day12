package ssf2022.day12.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import ssf2022.day12.model.Item;
import ssf2022.day12.service.ItemService;

@Controller
@RequestMapping(path={"/shoppingCart"})
public class ItemController {
    
    @Autowired // This autowire enable not to type new ItemRepo()
    ItemService itmSvc;

    @GetMapping(produces = "text/html")
    public String displayCart(Model model) {

        List<Item> items = itmSvc.retriveItemList();
        model.addAttribute("cartItems",items);

        return "cartList";
    }

    @GetMapping("{itemname}")
    public String filteredCart(@PathVariable("itemname") String itemname, Model model) {

        List<Item> items = itmSvc.retriveItemList();
        List <Item> foundItem = items.stream().filter(i -> i.getItemName().equalsIgnoreCase(itemname)).collect(Collectors.toList());

        model.addAttribute("cartItems",foundItem);

        return "cartList";
    }

}
