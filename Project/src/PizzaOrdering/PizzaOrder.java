package PizzaOrdering;

public class PizzaOrder {
	  
	  private int id;
	  private String name;
	  private String phoneNumber;
	  private String order;
	  private String type;

	  public PizzaOrder() {
	    setId (1000);
	    setName ("testname");
	    setPhoneNumber ("xxxx");
	    setOrder ("testorder");
	    setType ("testtype");
	  }

	  public void setId(int id) {
	    this.id = id;
	  }

	  public void setName(String name) {
	    this.name = name;
	  }

	  public void setPhoneNumber(String phoneNumber) {
	    this.phoneNumber = phoneNumber;
	  }

	  public void setOrder(String order) {
	    this.order = order;
	  }

	  public void setType(String type) {
	    this.type = type;
	  }
	  
	  public int getId() {
	    return id;
	  }

	  public String getName() {
	    return name;
	  }

	  public String getPhoneNumber() {
	    return phoneNumber;
	  }


	  public String getOrder() {
	    return order;
	  }

	  public String getType() {
	    return type;
	  }
	  
	  
	  double totalCost; 
	  double price; 
	  double deliveryCost; 
	  
	  public double determinePizzaPrice(){
	    if (getOrder().equals("Hawaiian")){
	      price = 14.95;
	    }
	    else if (getOrder().equals("Meat Lovers")){
	      price = 17.95;
	    }
	    
	    else if (getOrder().equals("Aussie")){
	      price = 16.95;
	    }
	    else if (getOrder().equals("Supreme")){
	      price = 15.95;
	    }
	    else if (getOrder().equals("Pepperoni")){
	      price = 13.95;
	    }
	    else {
	      System.out.println("Error: Incorrect Order name has been entered. Please ensure it is spelt correctly"); 
	    }
	    return price;
	  }
	  
	  
	  public double totalCost(){
	    if (getType().equals("Pick-up")){
	      deliveryCost = 0;
	    }
	    else if (getType().equals("Delivery")){
	      deliveryCost = 7;
	    }
	    return totalCost = price + deliveryCost;
	  }
	}

