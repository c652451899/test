public class zifuchuan {
     public static void main(String[] args) {
        String a = "abcdefg";
        System.out.println(a);
        String b = a.substring(0, 3);
        System.out.println(b);
        //
        String expletive = "Expletive";
        String PG13="delete";
        String message =expletive+PG13;
        System.out.println(message);
        //
        int age = 13;
        String rating ="PG"+age;
        System.out.println(rating);
        //
        String all = String.join("/", "s","m","l");
        System.out.println(all);
        String c = String.join(",", "a","b","c");
        System.out.println(c);
        //
        a=a.substring(0, 1) + "a!";
        System.out.println(a);


    }
}