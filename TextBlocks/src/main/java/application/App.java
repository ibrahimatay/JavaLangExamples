package application;

/**
 * 
 * @author ibrahimatay
 * @since 12.05.2020
 * @see https://openjdk.java.net/jeps/355
 * 
 **/

public class App {
    public static void main(String[] args) {    
        String address = """
                 25 Main Street
                 Anytown, USA, 12345
                 """;
        
        System.out.println(address);
        
        System.out.println(
                """
                    <person>
                        <firstName>Bob</firstName>
                        <lastName>Jones</lastName>
                    </person>
                """
        );
        
        System.out.println("""
                       <person>
                           <firstName>Bob</firstName>
                           <lastName>Jones</lastName>
                       </person>
                       """.indent(4));
           
        String firstName = "Ýbrahim";
        String lastName = "ATAY";
        
        String person = """
                <person>
                    <firstName>%s</firstName>
                    <lastName>%s</lastName>
                </person>
                """.formatted(firstName, lastName);
        
        System.out.println(person);
    }
}
