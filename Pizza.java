
public class Pizza {

	
	 private String typeOfPizza;
	 private int numChesseToppings;
	 private int numPepperoniToppngs;
	 private int numHamToppings;
	 
	 
	 public Pizza(String typeOfPizza, int numCheeseToppings, int numPepperoniToppings, int numHamToppings)
	 {
		 this.typeOfPizza =  typeOfPizza;
		 this.numChesseToppings = numCheeseToppings;
	 }
	 
	 public String getTypeOfPizza()
	 {
		 return typeOfPizza;
	 }
	 
	 public void setTypeOfPizza(String typeOfPizza)
	 {
		 this.typeOfPizza = typeOfPizza;
	 }
	 
	 public int getNumCheeseToppings()
	 {
		 return numChesseToppings;
	 }
	 
	 public int getNumPepperoniToppings()
	 {
		 return numPepperoniToppngs;
	 }
	 
	 public int getNumHamToppings()
	 {
		 return numHamToppings;
	 }
	 
	  public String getDescription()
	  {
		  
		  return getTypeOfPizza() + " Pizza with " + getNumCheeseToppings()  + 
				  " cheese topping" + 
				  getNumPepperoniToppings() + " pepperoni topping "+ getNumHamToppings() +
				   "hamming topping with a cost of " +
				  calcCost();
	  }
	 
	 public double calcCost(){
		 
		 double cost = 0.0;
	   if(typeOfPizza.equalsIgnoreCase("Small"))
	   {
		   cost = 10 + (2 * getNumCheeseToppings()) +
				   (2 * getNumPepperoniToppings()) +
				   (2 * getNumHamToppings()); 
	   }
	   	
		  return cost;
	 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Pizza pizza = new Pizza("Medium", 2,1,3);
   System.out.print(pizza.getDescription());
	}

}
