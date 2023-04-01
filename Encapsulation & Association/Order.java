class Order{
	private int orderNum;
	private int tableNum;
	private String orderDate;
	private Item itemDetails;
	
	public void setOrderNum(int orderNum){
		this.orderNum = orderNum;
	}
	public int getOrderNum(){
		return this.orderNum;	
	}
	
	public void setTableNum(int tableNum){
		this.tableNum = tableNum;
	}
	public int getTableNum(){
		return this.tableNum;	
	}
	
	public void setOrderDate(String orderDate){
		this.orderDate = orderDate;
	}
	public String getOrderDate(){
		return this.orderDate;	
	}
	
	public void setItemDetails(Item itemDetails){
		this.itemDetails = itemDetails;
	}
	public Item getItemDetails(){
		return this.itemDetails;	
	}
	
	public static void main(String[] args){
		
		Order ord = new Order();
		
		ord.setOrderNum(12);
		ord.setTableNum(3);
		ord.setOrderDate("30 March, 2023 05:22PM");
		
		Item it = new Item();
		it.setItemID(1001);
		it.setItemName("Pizza Zinger Burger");
		it.setItemPrice(450);
		it.setDesc("Pizza Zinger Burger with chilli sauce and an amazaing dish.");
		
		ord.setItemDetails(it);
		
		System.out.println("\n============Order Details============\n");
		System.out.println("Order Number: " +ord.getOrderNum());
		System.out.println("Table Number: " +ord.getTableNum());
		System.out.println("Order Date: " +ord.getOrderDate());
		System.out.println("\n============Items Details============\n");
		System.out.println("Item ID: " +ord.getItemDetails().getItemID());
		System.out.println("Item Name: " +ord.getItemDetails().getItemName());
		System.out.println("Item Price: " +ord.getItemDetails().getItemPrice());
		System.out.println("Item Description: " +ord.getItemDetails().getDesc());
		
		
	}
}
	