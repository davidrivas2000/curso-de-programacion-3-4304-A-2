import java.util.ArrayList;

public class Estudiantes {
    
    private int id;
    private String nombre;
    private String facultad;

    public Estudiantes(int id, String nombre, String facultad) {
        this.id = id;
        this.nombre = nombre;
        this.facultad = facultad;
    }

    public String getFacultad(){
        return facultad;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Estudiante [ id: " + id + " Nombre: " + nombre + " Facultad: " + facultad + " ]";
    }

    // Método estático para contar estudiantes de una facultad
    public static int contarEstudiantes(Estudiantes[] e, String nombreFacultad){
        int contador = 0;
        for (int i = 0; i < e.length; i++) {
            if(e[i] != null && e[i].getFacultad().equalsIgnoreCase(nombreFacultad)){
                contador++;
            }        
        }
        return contador;
    }

    // Método estático para listar estudiantes de una facultad
    public static ArrayList<Estudiantes> listarEstudiantes(Estudiantes[] e, String nombreFacultad){
        ArrayList<Estudiantes> lista = new ArrayList<>();
        for (int i = 0; i < e.length; i++) {
            if(e[i] != null && e[i].getFacultad().equalsIgnoreCase(nombreFacultad)){
                lista.add(e[i]);
            }        
        }
        return lista;
    }
}
