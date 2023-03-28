
public class PruebasMain {
    
    public static void main(String[] args) {
        
        Socio sc1 = new Socio(1234, "Jose", "10.05.1982");
        Socio sc2 = new Socio(1255, "Juan", "15.02.1980");
        
        System.out.println(sc1.toString());
        System.out.println(sc2.toString());
        
        System.out.println(sc1.compareTo(sc2));
    }

}
