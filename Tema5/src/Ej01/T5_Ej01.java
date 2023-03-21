package Ej01;

public class T5_Ej01 {
    
    public static void main(String[] args) {
        
        CuentaCorriente cc = new CuentaCorriente("1234568A","Jose","ING");
        
        System.out.println(cc.toString());        
        cc.sacarDinero(500);
        System.out.println(cc.toString());
        cc.ingresarDinero(10000);
        System.out.println(cc.toString());
        cc.sacarDinero(500);
        System.out.println(cc.toString());
        cc.nombreBanco = "Santa";
        System.out.println(cc.toString());
        
    }

}
