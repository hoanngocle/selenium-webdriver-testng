package basic;

import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class Topic_02_Data_Type
{
    public static void main(String[] args) {
        // Two data type
        // Primitive Type: Kiểu nguyên thủy - 8 type
        //char - kí tự - 16
        char c = 'A';
        System.out.println(c);

        // byte - số nguyên - 8
        byte bNumber = '8';
        System.out.println(bNumber);

        // short - số nguyên - 16
        short shortNumber = 32000;
        System.out.println(shortNumber);

        // int - số nguyên - 32
        int intNumber = 2000000000;
        System.out.println(intNumber);

        // long - số nguyên - 64
        long longNumber = 40000000;
        System.out.println(longNumber);

        // float - số thực - 32
        float floatNumber = 9.5f;
        System.out.println(floatNumber);

        // double - số thực 64
        double doubleNumber = 64.5d;
        System.out.println(doubleNumber);

        // boolean - logic - 1 (true/false)
        boolean booleanType = true;
        System.out.println(booleanType);


        // Reference Type: Kiểu tham chiếu
        // Object
        Object o = new Object();

        // Array
        String[] array = {"Ha Noi", "Thanh Hoa", "Sai Gon"};
        Integer[] phone = {98124215, 98745124};

        // Class
        Topic_02_Data_Type topic = new Topic_02_Data_Type();

        // Interface
        WebDriver driver;

        // Collection
        List<String> address = new ArrayList<String>();

        // String - Chuỗi ký tự
        String name = "Nyx Darkness";
        String cityName = "Thanh Hoa";

    }
}
