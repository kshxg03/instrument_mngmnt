
/**
 * The InstrumentToRent is a subclass of the Instrument class.
 * This subclass consists of five attributes which corrseponds to ChargePerDay, DateofRent, DateofReturn, NumberofDays and IsRented.
 * Here, ChargePerDay and NumberofDays are represented as numbers.
 * Whereas, DateofRent and DateofReturn are represented as string of characters.
 * And, IsRented is represented as boolean value(either true or false).
 * @author (Kshitiz Shrestha)
 * @version (17.0.1)
 */

// Here, extend keyword is used to extend InstrumentToRent to Instrument as it is a subclass of Instrument Class.
public class InstrumentToRent extends Instrument
{
   // Five instance variables: ChargePerDay, DateofRent, DateofReturn, NumberofDays and IsRented are declared
   private int ChargePerDay;
   private String DateofRent;
   private String DateofReturn;
   private int NumberofDays;
   private boolean IsRented;
   
   /*
     * Here, constructor method is used in order to initialize objects.
     * This constructor accepts InstrumentName and ChargePerDay as parameters.
     * A call is made to the superclass contructor with InstrumentName as the parameter.
     * ChargePerDay is assigned as the corresponding parameters values.
     * DateofRent and DateofReturn are set to empty string.
     * NumberofDays is set to zero.
     * IsRented is set to false.
     */

   public InstrumentToRent(String InstrumentName, int ChargePerDay)
   {
       super(InstrumentName);
       this.ChargePerDay = ChargePerDay;
       this.DateofRent = "";
       this.DateofReturn = "";
       this.NumberofDays = 0;
       this.IsRented = false;
   }
   
   // A getter(accesor) method is used to return the value.
   // Here, getter(accessor) method is assigned to each attribute.
   public int getChargePerDay()
   {
       return ChargePerDay;
   }
   
   public String getDateofRent()
   {
       return DateofRent;
   }
   
   public String getDateofReturn()
   {
       return DateofReturn;
   }
   
   public int getNumberofDays()
   {
       return NumberofDays;
   }
   
   public boolean getIsRented()
   {
       return IsRented;
   }
   
   // A setter(mutator) method is used to set values.
   // Here, setter(mutator) method is defined to all five attributes.
   public void setChargePerDay(int ChargePerDay)
   {
       this.ChargePerDay = ChargePerDay;
   }
   
   public void setDateofRent(String DateofRent)
   {
       this.DateofRent = DateofRent;
   }
   
   public void setDateofReturn(String DateofReturn)
   {
       this.DateofReturn = DateofReturn;
   }
   
   public void setNumberofDays(int NumberofDays)
   {
       this.NumberofDays = NumberofDays;
   }
   
   public void setIsRented(boolean IsRented)
   {
       this.IsRented = IsRented;
   }
   
   // Method to rent the instrument. 
   // This method accepts CustomerName, CustomerMobileNumber, PANNumber, DateofRent, DateofReturn and NumberofDays as parameters.
   public void rentInstrument(String CustomerName, String CustomerMobileNumber, int PANNumber, String DateofRent, String DateofReturn, int NumberofDays)
   {
       if(this.getIsRented() == true)
       {
           System.out.println("The instrument is not available");
           System.out.println("Customer Name:"+CustomerName);
           System.out.println("Customer Mobile Number:"+CustomerMobileNumber);
           System.out.println("Date of Return:"+DateofReturn);
       } 
       else
       { 
          this.setCustomerName(CustomerName);
          this.setCustomerMobileNumber(CustomerMobileNumber);
          this.setPANNumber(PANNumber);
          this.DateofRent = DateofRent;
          this.DateofReturn = DateofReturn;
          this.NumberofDays = NumberofDays;
          this.IsRented = true;
          this.setChargePerDay(ChargePerDay*NumberofDays);
       }
   }
   
   /*
    * Method to return the instrument.
    * If the instrument is not returned, following specified message will be shown.
    * However, if the instruments is returned, then following specified message will be shown.
    * Then, the CustomerName, CustomerMobileNumber, DateofRent and DateofReturn is set to empty strings.
    * Also, the number of renting days and PAN is et to 0 and IsRented status is set to false.
    */
   public void returnInstrument()
   {
       if(this.getIsRented() == false)
       {
           System.out.println("The instrument is not yet returned and is still in rent.");
       }
       else
       {
           setCustomerName("");
           setCustomerMobileNumber("");
           setDateofRent("");
           setDateofReturn("");
           setNumberofDays(0);
           setPANNumber(0);
           setIsRented(false);    
       }
   }

   /*
   * A display method is used to display the output.
   * Here,super keyword is used to call display method from instrument class to display the InstrumentID and InstrumentName.
   * If the instrument is rented, customer details along with rented date and return date are displayed.
   */ 
   public void display()
   {
      super.display();
      if(this.getIsRented() == true)
      {
          System.out.println("Rented Date:" +this.DateofRent); 
          System.out.println("Return Date:" +this.DateofReturn);
      }
   }
}
