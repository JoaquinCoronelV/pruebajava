package paqClases;
import java.util.ArrayList;
/*
 * @author joaquincoro
 */
public class PrimeraClase {
    String unaCadena;
    int unEntero;
    float unDecimal;
    
    static void mostrar(ArrayList<PrimeraClase> lista) {
        int i = 1;
        for (PrimeraClase obj : lista) {
            System.out.println("\nObjeto " + i + "\nDecimal: " + obj.unDecimal + "\nEntero: " + obj.unEntero + "\nCadena: " + obj.unaCadena);
            i++;
        }
    }
    
    public static void main(String[] args) {
        ArrayList<PrimeraClase> lista = new ArrayList<PrimeraClase>();
       //PrimeraClase obj = new PrimeraClase();
        PrimeraClase obj1 = new PrimeraClase();
        PrimeraClase obj2 = new PrimeraClase();
        PrimeraClase obj3 = new PrimeraClase();
        
        obj1.unaCadena = "Hola Mundo";
        obj1.unEntero = 512;
        obj1.unDecimal = 20.04f;
        //obj1.mostar();
        obj2.unaCadena = "Cumpleanos";
        obj2.unEntero = 912;
        obj2.unDecimal = 9.12f;
        //obj2.mostar();
        obj3.unaCadena = "Progr2";
        obj3.unEntero = 3+1;
        obj3.unDecimal = 0.333f;
        //obj3.mostar();
        
        lista.add(obj1);
        lista.add(obj2);
        lista.add(obj3);
        
        mostrar(lista);
        
/*        for(PrimeraClase obj : lista)
            System.out.println("Lista" + obj);
            System.out.println("\nDecimal: " + obj.unDecimal + "\nEntero: " + obj.unEntero + "\nCadena: " + obj.unaCadena);
*/
    }           
}
