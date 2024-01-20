package in.serosoft.service.impl;


import java.util.List;

import in.serosoft.entity.ItemsMenu;

public interface ItemsMenuService {

	public int addItem(ItemsMenu item);
	
	public ItemsMenu findById(int id);

	public ItemsMenu updateItemMenu(ItemsMenu item);

	public int deleteItemsMenu(int id);

	public ItemsMenu getItemsMenu(int id);

	public List<ItemsMenu> getAllItemsMenu();
	
}
