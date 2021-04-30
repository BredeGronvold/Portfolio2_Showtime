package com.example.Portfolio2_Showtime.service;

import com.example.Portfolio2_Showtime.model.Item;
import com.example.Portfolio2_Showtime.repositories.ItemRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ItemService {
    private final ItemRepository itemRepository;

    public List<Item> getAllItems(){
        return itemRepository.findAll();
    }

    public Optional<Item> getItem(Long item_id) {
        return itemRepository.findById(item_id);
    }

    public Item createItem(Item item) {
        if(item.getPictureURL()==null) item.setPictureURL("https://lh3.googleusercontent.com/proxy/u1vccwyZoSA68jUpFsKmFCEH8YIRIiWy5JbCfBbA3nyDKkgTERUvvLN0ijgH3hzY57crUKtekRVzjwt0sy0kn20Mqv4DLLrA8pJUqhhJ1dPf1VY");
        return itemRepository.save(item);
    }

    public void deleteItem(Long id) {
        itemRepository.deleteById(id);
    }
}
