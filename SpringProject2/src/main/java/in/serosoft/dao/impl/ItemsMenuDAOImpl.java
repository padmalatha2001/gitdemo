package in.serosoft.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import in.serosoft.entity.ItemsMenu;

@Repository
public class ItemsMenuDAOImpl implements ItemsMenuDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public int addItem(ItemsMenu itemsMenu) {
		Session session = sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		session.save(itemsMenu);
		tr.commit();
		return 1;
	}
	
	@Override
	public ItemsMenu findById(int id) {
		Session session=sessionFactory.openSession();
		ItemsMenu item=session.get(ItemsMenu.class, id);
		return item;
	}

	@Override
	public ItemsMenu updateItemMenu(ItemsMenu item) {
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		session.update(item);
		item=session.get(ItemsMenu.class, item.getItemId());
		tr.commit();
		session.close();
		return item;
	}

	@Override
	public int deleteItemsMenu(int id) {
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		ItemsMenu item=session.get(ItemsMenu.class, id);
		session.delete(item);
		tr.commit();
		return 1;
//		return "deleted Succesfully";
	}

	@Override
	public ItemsMenu getItemsMenu(int id) {
		Session session=sessionFactory.openSession();
		ItemsMenu item=session.get(ItemsMenu.class, id);
		return item;
	}

	@Override
	public List<ItemsMenu> getAllItemsMenu() {
		Session session=sessionFactory.openSession();
		Criteria criteria=session.createCriteria(ItemsMenu.class);
		List<ItemsMenu> items=criteria.list();
		return items;
	}
	

}
