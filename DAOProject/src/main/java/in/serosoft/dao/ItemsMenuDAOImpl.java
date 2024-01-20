package in.serosoft.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import in.serosoft.configuration.Utility;
import in.serosoft.entity.ItemsMenu;

public class ItemsMenuDAOImpl implements ItemsMenuDAO {

	SessionFactory sessionFactory=new Utility().getSession();
	public List<ItemsMenu> getMenu() {
		Session session=sessionFactory.openSession();
		Criteria criteria = session.createCriteria(ItemsMenu.class);
		return criteria.list();
	}

	public void addItem(ItemsMenu item) {
		Session session=sessionFactory.openSession();
		Transaction transaction = new Utility().getTransaction(session);
		session.save(item);
		transaction.commit();
	}

}
