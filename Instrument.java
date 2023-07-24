
/**
 * The Instrument class consists of five attributes which corresponds to InstrumentID, InstrumentName, CustomerName, CustomerMobileNumber and PANNumber.
 * Among these five attributes InstrumentID is a static variable which gets automatically increased values whenever new instruments are added.
 * Here, InstrumentName, CustomerName and CustomerMobileNumber are represented as string of text.
 * Whereas, PANNumber is represented as number.
 * @author (Kshitiz Shrestha)
 * @version (17.0.1)
 */
public class Instrument
{
    // A static variable: InstrumentID is declared.
    private static int InstrumentID;
    // Four instance variables: InstrumentName, CustomerName, CustomerMobileNumber and PANNumber are declared
    private String InstrumentName;
    private String CustomerName;
    private String CustomerMobileNumber;
    private int PANNumber;
    
    /*
     * Here, constructor method is used in order to initialize objects.
     * The instrumentName is initialized by being assigned as the value of the constructors parameter.
     * The InstrumentID is incremented by 1.
     * CustomerName and CustomerMobileNumber are assigned as empty string.
     * PANNumber is initialized as 0.
     */
    public Instrument(String InstrumentName) 
    {
        InstrumentID = ++InstrumentID;
        this.InstrumentName = InstrumentName;
        this.CustomerName = "";
        this.CustomerMobileNumber = "";
        this.PANNumber = 0;
    }
    
    // A getter(accesor) method is used to return the value.
    // Here, getter(accessor) method is assigned to each attribute.
    public int getInstrumentID()
    {
        return InstrumentID;
    }
    
    public String getInstrumentName()//object.getI .equals(....)
    {
        return InstrumentName;
    }
    
    public String getCustomerName()
    {
        return CustomerName;
    }
    
    public String getCustomerMobileNumber()
    {
        return CustomerMobileNumber;
    }
    
    public int getPANNumber()
    {
        return PANNumber;
    }
    
    // A setter(mutator) method is used to set values.
    // Here, setter(mutator) method is defined to all five attributes.
    public void setInstrumentID(int InstrumentID)
    {
        this.InstrumentID = InstrumentID;
    }
    
    public void setInstrumentName(String InstrumentName)
    {
        this.InstrumentName = InstrumentName;
    }
    
    public void setCustomerName(String CustomerName)
    {
        this.CustomerName = CustomerName;
    }
    
    public void setCustomerMobileNumber(String CustomerMobileNumber)
    {
        this.CustomerMobileNumber = CustomerMobileNumber;
    }
    
    public void setPANNumber(int PANNumber)
    {
        this.PANNumber = PANNumber;
    }
    
    /*
     * A display method is used to display the output.
     * Here, the display method will display InstrumentID and InstrumentName.
     * However, if CustomerName, CustomerMobileNumber and PANNumber are not empty or zero, then they are displayed as well.
     */
    
    public void display()
    {
        System.out.println("Instrument ID: "+InstrumentID);
        System.out.println("Instrument Name: "+InstrumentName);
        
        if(CustomerName.equals("") && CustomerMobileNumber.equals("") && PANNumber == 0)
        {
            System.out.println("The Customer Name, Customer's Mobile Number and their PAN Number are empty.");
        }
        else
        {
            System.out.println("Customer's Name: "+CustomerName);
            System.out.println("Customer's Mobile Number: "+CustomerMobileNumber);
            System.out.println("PAN Number: "+PANNumber);
        }
    }
}
