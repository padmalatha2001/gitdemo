package in.serosoft.resource;

import java.util.List;

import in.serosoft.entity.ItemsMenu;
import in.serosoft.service.ItemsMenuService;
import in.serosoft.service.ItemsMenuServiceImpl;

public class ItemsMenuResource {
	
	ItemsMenuService itemsMenuService = new ItemsMenuServiceImpl();
	public void addItem(ItemsMenu itemsMenu){
		itemsMenuService.addItem(itemsMenu);
		
	}
	public void getMenu() {
		List<ItemsMenu> itemsMenu=itemsMenuService.getMenu();
		System.out.println("\t\t\t\t\t******   MENU   ******");
		for(ItemsMenu item:itemsMenu)
			System.out.println(item);
	}
	
	public static void main(String[] args) {
		
	
		ItemsMenuResource itemsMenuResource = new ItemsMenuResource();
		
		/*
		ItemsMenu itemsMenu = new ItemsMenu(1, "Hyderabadi Mutton Biryani", 350, "Serves 2-3", "Indian", 3, "Krishna Kalyani", 1);
		ItemsMenu itemsMenu1 = new ItemsMenu(2, "Hyderabadi Dum Biryani", 450, "Serves 2-3", "Indian", 3, "Krishna Kalyani", 1);
		ItemsMenu itemsMenu2 = new ItemsMenu(3, "Hyderabadi Fried Piece Biryani", 350, "Serves 2-3", "Indian", 3, "Krishna Kalyani", 1);
		ItemsMenu itemsMenu3 = new ItemsMenu(4, "Mixed Biryani", 350, "Serves 2-3", "Indian", 3, "Krishna Kalyani", 1);
		itemsMenuResource.addItem(itemsMenu);
		itemsMenuResource.addItem(itemsMenu1);
		itemsMenuResource.addItem(itemsMenu2);
		itemsMenuResource.addItem(itemsMenu3);
		*/
		
		itemsMenuResource.getMenu();



	}

}
