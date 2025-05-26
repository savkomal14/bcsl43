import java.util.*;

public class Exc22
{
    public static void main(String[] args)
    {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append("java");
        System.out.println(sb.reverse());
        System.out.println(sb.capacity());
        System.out.println(sb.toString().toUpperCase());
    }
}