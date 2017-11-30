
package datos;

import java.util.Objects;

public class Cliente {
    private String rut;
    private String nombre;

    public Cliente() {
    }
/**
 * 
 * @param rut éste parámetro identifica al cliente.
 * @param nombre éste parámetro indica el nombre de cliente.
 */
    public Cliente(String rut, String nombre) {
        this.rut = rut;
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }
/**
 * 
 * 
 * @param rut éste parámetro modifica el rut del cliente. 
 */
    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }
/**
 * 
 * @param nombre éste parámetro modifica el nombre del cliente. 
 */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }
/**
 * .
 * @param obj este parametro instancia un objeto de tipo Objet.
 * @return retorna verdadero si es igua al objeto y falso si es nulo o vacío
 */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.rut, other.rut)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }

    
    
}
