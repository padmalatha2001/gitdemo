package in.serosoft.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="items_menu")
public class ItemsMenu {
	
	@Id
	private long itemId;
	private String itemName;
	private int price;
	private String quantity;
	private String category;
	private int TableNo;
	private String restaurentName;
	private int pageNo;
	
	public ItemsMenu(long itemId, String itemName, int price, String quantity, String category, int tableNo,
			String restaurentName, int pageNo) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.price = price;
		this.quantity = quantity;
		this.category = category;
		TableNo = tableNo;
		this.restaurentName = restaurentName;
		this.pageNo = pageNo;
	}

	
	public ItemsMenu() {
		super();
		// TODO Auto-generated constructor stub
	}


	public long getItemId() {
		return itemId;
	}

	public void setItemId(long itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getTableNo() {
		return TableNo;
	}

	public void setTableNo(int tableNo) {
		TableNo = tableNo;
	}

	public String getRestaurentName() {
		return restaurentName;
	}

	public void setRestaurentName(String restaurentName) {
		this.restaurentName = restaurentName;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	@Override
	public String toString() {
		return "ItemsMenu [itemId=" + itemId + ", itemName=" + itemName + ", price=" + price + ", quantity=" + quantity
				+ ", category=" + category + ", TableNo=" + TableNo + ", restaurentName=" + restaurentName + ", pageNo="
				+ pageNo + "]";
	}
	
	

}
