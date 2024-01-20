package in.serosoft.rs;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import in.serosoft.entity.ItemsMenu;
import in.serosoft.service.impl.ItemsMenuService;

@Controller
public class ItemsMenuResource {
		
	@Autowired
	private ItemsMenuService itemsMenuService;
	
	@PostMapping("/addItem")
	public int  addItem(ItemsMenu itemsMenu) {
		ItemsMenu itemsMenu3 = new ItemsMenu(10, "Mixed Biryani", 350, "Serves 2-3", "Indian", 3, "Krishna Kalyani", 1);
		return itemsMenuService.addItem(itemsMenu);
		 
	}
	
	@GetMapping("/getItem")
	public ItemsMenu findById(int id) {
		return itemsMenuService.findById(id);
	}

	@PostMapping("/updateItem")
	public ItemsMenu updateItemMenu(ItemsMenu item) {
		return itemsMenuService.updateItemMenu(item);
	}

	@DeleteMapping("/deleteItem")
	public int deleteItemsMenu(int id) {
		return itemsMenuService.deleteItemsMenu(id);
	}

	@GetMapping("/getItemsMenu")
	public ItemsMenu getItemsMenu(int id) {
		return itemsMenuService.getItemsMenu(id);
	}

	@GetMapping("/getItems")
	public List<ItemsMenu> getAllItemsMenu() {
		return itemsMenuService.getAllItemsMenu();
	}

}
