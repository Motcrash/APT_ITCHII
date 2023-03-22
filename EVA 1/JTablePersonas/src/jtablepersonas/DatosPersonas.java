package jtablepersonas;

import java.util.List;
import java.util.ArrayList;

public class DatosPersonas {
    
    private List<Persona> personas;
    public DatosPersonas(){
        obtenerDatos();
    }
    
    public void obtenerDatos(){
        personas = new ArrayList<Persona>();
        personas.add( new Persona( "AORL640713HA32", "LUIS ARMANDO", "ACOSTA", "614 123 45 67", 25, false ));
        personas.add( new Persona( "COBC7010222342", "CLAUDIA ELODIA", "CORDERO", "614 654 65 87", 20, true ));
        personas.add( new Persona( "ERTY023456YHF5", "ERICK ADRIAN", "ACOSTA", "614 341 53 63", 25, false ));
    }
    
    public List<Persona> getPersonas(){
        return personas;
    }
    
    public void desplegarDatosConsola(){
        System.out.println("Curp: \t\t Nombre: \t\t Apellido: \t Celular: \t Edad: \t Soltero: ");
        for(Persona p : personas){
            System.out.println(p.getCurp() +"\t"+ p.getNombre() +"\t"+ p.getApellido() +"\t\t"+ 
                    p.getCelular() +"\t"+ p.getEdad() +"\t"+ p.isSoltero());
        }
        System.out.println("\n\n");
    }
        
}
