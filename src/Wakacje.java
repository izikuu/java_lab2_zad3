import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;
/**
 * Created by Izikk on 11.10.2016.
 */
public class Wakacje
{
    public Wakacje(String cou, String cit, String hot, int foo, Double pri, String roo)
    {
        this.country = cou;
        this.city = cit;
        this.hotel =hot;
        this.food = foo;
        this.price = pri;
        this.room = roo;
    }

    public String country;
    public String city;
    public String hotel;
    public int food;
    public Double price;
    public String room;

    public double cost(String date1, String date2, Boolean food)
    {
        SimpleDateFormat format = new SimpleDateFormat("yy/MM/dd");

        Date d1 = null;
        Date d2 = null;
        try {
            d1 = format.parse(date1);
            d2 = format.parse(date2);
        }
        catch (ParseException e)
        {
        }

        long diff = d2.getTime() - d1.getTime();
        long days = TimeUnit.MILLISECONDS.toDays(diff);
        Double cost = this.price*days;
        if (food == true)
        {
            cost = cost + (days*this.food);
        }
        return cost;
    }
}
