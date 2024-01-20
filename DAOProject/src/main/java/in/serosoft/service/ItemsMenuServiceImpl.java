package in.serosoft.service;

import java.util.List;

import in.serosoft.dao.ItemsMenuDAO;
import in.serosoft.dao.ItemsMenuDAOImpl;
import in.serosoft.entity.ItemsMenu;

public class ItemsMenuServiceImpl implements ItemsMenuService {

	ItemsMenuDAO itemsMenuDAO = new ItemsMenuDAOImpl();
	
	public List<ItemsMenu> getMenu() {
		List<ItemsMenu> itemsMenu =itemsMenuDAO.getMenu();
		return itemsMenu;
	}

	public void addItem(ItemsMenu item) {
		itemsMenuDAO.addItem(item);
	}

	
}
