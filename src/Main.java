import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Main {

    public static void main(String[] args)
    {
        String country = "";
        String city = "";
        String hotel = "";
        String room = "";
        int food = 0;
        int price = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz dane hotelu");
        while(true)
        {
            try
            {
                System.out.print("Wpisz kraj:");
                country = scanner.nextLine();
                if(country.isEmpty())
                {
                    throw new Exception();
                }
                break;
            }
            catch (Exception e)
            {
                System.out.println("Nie podales nazwy kraju!");
            }
        }
        while(true)
        {
            try
            {
                System.out.print("Wpisz miasto:");
                city = scanner.nextLine();
                if(country.isEmpty())
                {
                    throw new Exception();
                }
                break;
            }
            catch (Exception e)
            {
                System.out.println("Nie podales nazwy miasta!");
            }
        }
        while(true)
        {
            try
            {
                System.out.print("Wpisz hotel:");
                hotel = scanner.nextLine();
                if(country.isEmpty())
                {
                    throw new Exception();
                }
                break;
            }
            catch (Exception e)
            {
                System.out.println("Nie podales nazwy hotelu!");
            }
        }
        while(true)
        {
            try
            {
                System.out.print("Wpisz pokoj:");
                room = scanner.nextLine();
                if(country.isEmpty())
                {
                    throw new Exception();
                }
                break;
            }
            catch (Exception e)
            {
                System.out.println("Nie podales nazwy pokoju!");
            }
        }
        while(true)
        {
            try
            {
                System.out.print("Wpisz cene za posilek:");
                food = Integer.parseInt(scanner.nextLine());
                if(country.isEmpty())
                {
                    throw new Exception();
                }
                break;
            }
            catch (Exception e)
            {
                System.out.println("Zla cena!");
            }
        }
        while(true)
        {
            try
            {
                System.out.print("Wpisz cene za dzien:");
                price = Integer.parseInt(scanner.nextLine());
                if(country.isEmpty())
                {
                    throw new Exception();
                }
                break;
            }
            catch (Exception e)
            {
                System.out.println("Zla cena!");
            }
        }
        String item = country + " " + city + " " + hotel + " " + price + " " + food + " " + room;
        List<String> lines = new ArrayList<String>();
        lines.add(item);
        Path file = Paths.get("hotels.txt");
        try {
            Files.write(file, lines, Charset.forName("UTF-8"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
