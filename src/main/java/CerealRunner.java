import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CerealRunner
{
    // create a private instance variable to store an ArrayList of Cereal objects
    private ArrayList<Cereal> cereals;

    public CerealRunner(String fileName)
    {
        // instantiate the ArrayList
        this.cereals = newArrayList<Cereal>();

        try
        {
            FileReader fileRdr = new FileReader(fileName);
            Scanner scan = new Scanner(fileRdr);
            while(scan.hasNext())
            {
                String myStr = scan.nextLine();

                // use the split method to parse the data into an array of
                //   String objects
                String[] data = myStr.split(",");

                String zero = data[0];

                double two = Double.parseDouble(data[1]);
                double three = Double.parseDouble(data[2]);
                double four = Double.parseDouble(data[3]);
                double five = Double.parseDouble(data[4]);

                // go through each String array element and save it
                //   into the appropriate variable which will be used to
                //   create a Cereal object

                // create a new Cereal object, and add it to the ArrayList
                Cereal bob = new Cereal(zero, two, three, four, five);
                cereals.add(bob);

            }
            scan.close();


        } catch (FileNotFoundException e)
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        int numCereals = cereals.size();
        System.out.println(numCereals + " records created.");
    }

    public static void main(String[] args)
    {
        String fileName = "src/data/cerealSubset.csv";
        CerealRunner cr = new CerealRunner(fileName);
    }

}

