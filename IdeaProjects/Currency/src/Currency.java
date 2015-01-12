/**
 * Created by Aditya on 12-01-2015.
 */
public class Currency {
    private String currencyName;
    char currencySymbol;

    Currency(String name, char symbol) {
        this.currencyName = name;
        this.currencySymbol = symbol;
    }
    public String toString(){
        return "Name:"+currencyName+"\nSymbol:"+currencySymbol;

    }

}
