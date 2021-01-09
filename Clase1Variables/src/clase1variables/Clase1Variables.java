package clase1variables;

public class Clase1Variables {

    public static void main(String[] args) {
      
        /*Tipos de Datos Pr imitivos
        Numeros enteros :
        short 
        int
        long
        Numeros con coma :
        float 
        double
        
        Caracteres : 
        char "t" , "$"
        
        Cadenas de Caracteres : 
        String  "hola soy alex"
        */
        
        //Defino variables 
        //tipoDeDato  Identificador
        int edad = 10 ;
//        Camel Case
        float precioProductoMasBarato = 12.5f;
        double pi = 3.141;
        
        System.out.println("la edad es " + edad);
        System.out.println("El precio del producto mas barato es "+ precioProductoMasBarato);
        System.out.println("el numero pi " + pi);
                
        edad = 25 ;
        System.out.println("la edad es " + edad);
        
        char sexo ;
        sexo = 'M';
        System.out.println("sexo : " + sexo );
        
        String direccion = "Av Santa fe 5050 Buenos Aires";
                
        System.out.println(direccion);
            
        
        
    }
    
}
