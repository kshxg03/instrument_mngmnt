
/**
 * The InstrumentToSell is also a subclass of the Instrument class.
 * This subclass consists of four attributes which corresponds to Price, SellDate, DiscountPercent, IsSold.
 * Here, Price and DiscountPercent are represented as floating point numbers.
 * Whereas, SellDate is represented as string of characters.
 * And, IsSold is represented as boolean value(either true or false)
 * @author (Kshitiz Shrestha)
 * @version (17.0.1)
 */

// Here, extend keyword is used to extend InstrumentToSell to Instrument as it is a subclass of Instrument Class.
public class InstrumentToSell extends Instrument
{
  // Four instance variables: Price, SellDate, DiscountPercent and IsSold are declared
  private float Price;
  private String SellDate;
  private float DiscountPercent;
  private boolean IsSold;
  
  /*
     * Here, constructor method is used in order to initialize objects.
     * This constructor accepts InstrumentName and Price as parameters.
     * A call is made to the superclass contructor with InstrumentName as the parameter.
     * Price is assigned as the corresponding parameters values.
     * SellDate and DiscountPercent are set to empty string and 0.0f respectively.
     * NumberofDays is set to zero.
     * IsSold is set to false.
     */

  public InstrumentToSell (String InstrumentName, float Price)
  {
      super(InstrumentName);
      this.Price = Price;
      this.SellDate = "";
      this.DiscountPercent = 0.0f;
      this.IsSold = false;
  }
  
  // A getter(accesor) method is used to return the value.
  // Here, getter(accessor) method is assigned to each attribute.
  public float getPrice()
  {
      return Price;
  }
    
  public String getSellDate()
  {
      return SellDate;
  }
    
  public float getDiscountPercent()
  {
      return DiscountPercent;
  }
    
  public boolean getIsSold()
  {
      return IsSold;
  }
  
  // A setter(mutator) method is used to set values.
  // Here, setter(mutator) method is defined to all four attributes.
  public void setPrice(float Price)
  // Here, if the instrument is not sold, the new value is assigned to the Price attribute.
  // However, if the instrument is already sold, then the following message is displayed to the user.
  {
      if(this.getIsSold() == false)
      {
          this.Price = Price;
      }
      else 
      {
          System.out.println("This instrument has already been sold; therefore, it is not possible to change the price");
      }
  }
  
  public void setSellDate(String SellDate)
  {
      this.SellDate = SellDate;
  }
  
  public void setDiscountPercent(float DiscountPercent)
  {
      this.DiscountPercent = DiscountPercent;
  }
  
  public void setIsSold(boolean IsSold)
  {
      this.IsSold = IsSold;
  }
  
  //method to sell the instrument.
  public void sellInstrument(String CustomerName, String CustomerMobileNumber, int PANNumber, String SellDate, float DiscountPercent)
  {
      if(this.getIsSold() == true)
      {
          System.out.println("The instrument has already been sold out");
          System.out.println("Customer Mobile Number:"+CustomerName);
          System.out.println("Customer Name:"+CustomerMobileNumber);
          System.out.println("PANNumber:"+PANNumber);
      }
      else
      {
          this.setCustomerName(CustomerName);
          this.setCustomerMobileNumber(CustomerMobileNumber);
          this.setPANNumber(PANNumber);
          this.SellDate = SellDate;
          this.DiscountPercent = DiscountPercent;
          this.IsSold = true;
          this.Price=(Price-(DiscountPercent/100*Price));
      } 
  }
  
  /*
   * A display method is used to display the output.
   * Here,super keyword is used to call display method from instrument class to display the InstrumentID and InstrumentName.
   * Also, the final discounted price is also displayed as output.
   * If the instrument has been sold, customer details along with the sold date is displayed.
   */ 
  public void display()
  {
      super.display();
      System.out.println("The price of the instrument is Rs."+this.getPrice());
      
      if(this.getIsSold() == true)
      {
          System.out.println("Sold Date:" +this.SellDate); 
      }
  }
}
