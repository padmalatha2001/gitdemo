package in.serosoft.dao;

import java.util.List;

import in.serosoft.entity.ItemsMenu;

public interface ItemsMenuDAO {
	
	public List<ItemsMenu> getMenu();
	public void addItem(ItemsMenu item);
	


}
