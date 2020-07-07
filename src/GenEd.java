/**
 *
 * @author abg5406, Aidan Glas
 */
    public class GenEd
    {

    private String code;
    private String description;
    private int requiredCredits;
    // constructor
    

    public GenEd(String code, String description, int requiredCredits)
    {
        this.code = code;
        this.description = description.substring(0,1).toUpperCase() + description.substring(1).toLowerCase();
        this.requiredCredits = requiredCredits;

    }
    public GenEd()
    {
        this.code = "N/A";
        this.description = "None Available";
        this.requiredCredits = 0;
    }

    @Override
    public String toString()
    { 
        return description + " " + "("+code+")" + " " + requiredCredits;
    }

    public String getCode()
    {
        return code;
    }

    public void setCode(String code)
    {
        this.code = code;
    }

    public String getDescription()
    {
        return description;
        
        //return null;
    }

    public void setDescription(String description)
    {
        //this.description = description;
        this.description = description.substring(1) + description.substring(0,1).toUpperCase();
    }

    public int getRequiredCredits()
    {
        return requiredCredits;
    }

    public void setRequiredCredits(int requiredCredits)
    {
        this.requiredCredits = requiredCredits;
    }
    
}