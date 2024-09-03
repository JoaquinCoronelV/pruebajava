import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        // Punto (1-3)
        /*int entero;
        float decimal;
        double doble;
        String cadena;
        entero = 10;
        decimal = 91.2f; //Sin la f al final java interpreta que se trata de un double
        doble = 91.12e18; //e18 = 10^18
        cadena = "Hello World";
        System.out.println(entero);
        System.out.println(decimal);
        System.out.println(doble);
        System.out.println(cadena);2*/
        //Punto 4
        ArrayList<Integer> lista = new ArrayList<Integer>();
        int x = 10;
        lista.add(8);
        lista.add(x);
        lista.add(2 * x);
        System.out.println("Elementos de lista: " + lista.size());
        System.out.printf("For mejorado\n");
        for(int num : lista)
            System.out.println(num);
       
        // O sino
        System.out.printf("For tradicional\n");
        for(int i = 0; i < lista.size(); i++)
            System.out.println(lista.get(i));
    }
}