import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Aditya on 12-01-2015.
 */
public class Country {
    protected String countryName;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String getCountry() throws Exception {
        return br.readLine();
    }

    String getCurrency(String name) {
        if (name.matches("India")) {
            Rupee rupee = new Rupee();
            return "" + rupee;
        }
        else {
            Dollar dollar = new Dollar();
            return ""+ dollar;
        }
    }

    public static void main(String args[]) {
        String name = "";
        Country country = new Country();
        try {
            name = country.getCountry();
        } catch (Exception e) {
        }
        System.out.print(""+country.getCurrency(name));


    }
}
