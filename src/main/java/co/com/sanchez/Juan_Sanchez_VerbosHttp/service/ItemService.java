package co.com.sanchez.Juan_Sanchez_VerbosHttp.service;

import co.com.sanchez.Juan_Sanchez_VerbosHttp.model.GroceryItem;
import co.com.sanchez.Juan_Sanchez_VerbosHttp.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemService {
    @Autowired
    private ItemRepository itemRepository;

    public String getAll(){
        List<GroceryItem> items = itemRepository.findAll();
        return "---ITEMS EXISTENTES---\n"+items.toString();
    }

    public String insert(GroceryItem groceryItem){
        GroceryItem savedItem = itemRepository.save(groceryItem);
        return "---ITEM INSERTADO---\n"+savedItem.toString();
    }

    public String update(GroceryItem groceryItem){
        Optional<GroceryItem> optionalItem = itemRepository.findById(groceryItem.getId());
        if (optionalItem.isPresent()) {
            GroceryItem item = optionalItem.get();
            item.setName(groceryItem.getName());
            item.setQuantity(groceryItem.getQuantity());
            item.setCategory(groceryItem.getCategory());
            itemRepository.save(item); // Guardar cambios en la base de datos
            return "---ITEM ACTUALIZADO---\n"+item.toString();
        } else {
            return "---ITEM NO ENCONTRADO---";
        }
    }

    public String delete(String id) {
        if (itemRepository.existsById(id)) {
            itemRepository.deleteById(id); // Eliminar de la base de datos
            return "---ITEM ELIMINADO---";
        } else {
            return "---ITEM NO ENCONTRADO---";
        }
    }

    public String updateData(String id, GroceryItem groceryItem){
        Optional<GroceryItem> optionalItem = itemRepository.findById(id);
        if (optionalItem.isPresent()) {
            GroceryItem item = optionalItem.get();
            if (groceryItem.getName() != null) {
                item.setName(groceryItem.getName());
            }
            if (groceryItem.getCategory() != null) {
                item.setCategory(groceryItem.getCategory());
            }
            itemRepository.save(item); // Guardar los cambios en la base de datos
            return "---ITEM ACTUALIZADO---\n"+item.toString();
        } else {
            return "---ITEM NO ENCONTRADO---";
        }
    }

    public String optionsUpdate(){
        return "OPTIONS: It insert a new grocery item, if the grocery item doesn't exist, it will create automatically";
    }
}
