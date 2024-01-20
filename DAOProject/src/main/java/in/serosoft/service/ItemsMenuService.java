package in.serosoft.service;

import java.util.List;

import in.serosoft.entity.ItemsMenu;

public interface ItemsMenuService {

	public List<ItemsMenu> getMenu();
	public void addItem(ItemsMenu item);
	
}
