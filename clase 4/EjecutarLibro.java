import java.util.Arrays;


public class EjecutarLibro {
    public static void main(String[] args) {
    
        Libro objLib1 = new Libro(1,precio: $43,000, titulo: "100 años de soledad",autor: "Gabriel Garcia Marquez");
        Libro objLib2 = new Libro(2,precio: $79,000, titulo: "Delirio"   ,         autor: "Laura Restrepo");
        Libro objLib3 = new Libro(3,precio: $48,000, titulo:"Lo que no tiene nombre", autor: "Piedad Bonnett");
        Libro objLib4 = new Libro(4,precio: $50,000, titulo:"Esta herida llena de peces",autor: "Lorena Salazar Masso");
        Libro objLib5 = new Libro(5,precio: $59,000, titulo:"Que viva la Musica",autor: "Andres caicedo");
        
        //Creación del arreglo de objetos
        Libro[] lib = new Libro[5];

        //Asignar los libros a cada posición del arreglo de objetos
        lib[0] = objLib1;
        lib[1] = objLib2;
        lib[2] = objLib3;
        lib[3] = objLib4;
        lib[4] = objLib5;

        //imprimir los libros
         System.out.println(Arrays.toString(lib));
         

         }
        }