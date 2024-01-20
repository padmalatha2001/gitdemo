package in.serosoft.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.serosoft.dao.impl.ItemsMenuDAO;
import in.serosoft.entity.ItemsMenu;

@Service
public class ItemsMenuServiceImpl implements ItemsMenuService {
	
//	ItemsMenuDAO itemsMenuDAO = new ItemsMenuDAOImpl();

	@Autowired
	private ItemsMenuDAO itemsMenuDAO;
	
	@Override
	public int addItem(ItemsMenu itemsMenu) {
		return itemsMenuDAO.addItem(itemsMenu);
	}

	@Override
	public ItemsMenu findById(int id) {
		return itemsMenuDAO.findById(id);
	}

	@Override
	public ItemsMenu updateItemMenu(ItemsMenu item) {
		return itemsMenuDAO.updateItemMenu(item);
	}

	@Override
	public int deleteItemsMenu(int id) {
		return itemsMenuDAO.deleteItemsMenu(id);
	}

	@Override
	public ItemsMenu getItemsMenu(int id) {
		return itemsMenuDAO.getItemsMenu(id);
	}

	@Override
	public List<ItemsMenu> getAllItemsMenu() {
		return itemsMenuDAO.getAllItemsMenu();
	}

}
