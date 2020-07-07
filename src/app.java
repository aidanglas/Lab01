/**
 *
 * @author abg5406
 */
public class app
{
  
    public static void main(String[] args)
    {
        GenEd ge1, ge2, ge3, ge4, ge5, ge6, ge7, ge8, ge9, ge10, ge11, ge12;

        ge1 = new GenEd("GWS", "Writing Speaking", 3);
        ge2 = new GenEd("GQ", "Quantification", 3);
        ge3 = new GenEd("GA", "Arts", 3);
        ge4 = new GenEd("GH", "Humanities", 3);
        ge5 = new GenEd("GHW", "Health And Wellness", 3);
        ge6 = new GenEd("GHW","Health And Wellness", 3);
        ge7 = new GenEd("GN","Natural Sciences", 3);
        ge8 = new GenEd("US","United States Cultures", 3);
        ge9 = new GenEd("IL", "International Cultures",  3);
       ge10 = new GenEd("WAC", "Writing Across The Curriculum", 3);
       ge11 = new GenEd();
       ge12 = new GenEd("N/A", "tEST this sENTENCE", 3);
               
       String newLine = System.getProperty("line.separator");
       
       System.out.println(ge1.toString()+ newLine + ge2.toString() + newLine + ge3.toString() + 
       newLine + ge4.toString() + newLine + ge5.toString() + newLine + ge6.toString()
        + newLine + ge7.toString() + newLine + ge8.toString() + newLine + ge9.toString() + 
       newLine + ge10.toString() + newLine + ge11.toString() + newLine + ge12.toString());
    
    }
   
}
