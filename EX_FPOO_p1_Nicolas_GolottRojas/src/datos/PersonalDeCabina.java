package datos;

import java.util.Objects;



public abstract class PersonalDeCabina {

   private String rut, nombre, apellido, nacionalidad;
   private int edad;

    public PersonalDeCabina() {
    }
/**
 * 
 * @param rut éste parámetro identifica al perosnal de cabina.
 */
    public PersonalDeCabina(String rut) {
        this.rut = rut;
    }
/**
 * 
 * @param nombre éste parámetro indica un nombre para el perosnal de cabina.
 * @param apellido éste parámetro indica un apellido para el personal de cabian.
 * @param nacionalidad éste parámetro indica una nacionalidad para el perosnal de cabina.
 * @param edad éste parámetro indica una edad para el personal de la cabina (debe ser mayor a 21).
 */
    public PersonalDeCabina(String nombre, String apellido, String nacionalidad, int edad) {
        this.nombre = nombre = "su nombre";
        this.apellido = apellido = "su apellido";
        this.nacionalidad = nacionalidad;
        this.edad = edad  = 21;
    }
    

    public String getRut() {
        return rut;
    }
/**
 * 
 * @param rut éste parámetro modifica el rut de un personal de cabina. 
 */
    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }
/**
 * 
 * @param nombre éste parámetro modifica el nombre de un personal de cabina.
 */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }
/**
 * 
 * @param apellido 
 */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
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
        final PersonalDeCabina other = (PersonalDeCabina) obj;
        if (this.edad != other.edad) {
            return false;
        }
        if (!Objects.equals(this.rut, other.rut)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellido, other.apellido)) {
            return false;
        }
        if (!Objects.equals(this.nacionalidad, other.nacionalidad)) {
            return false;
        }
        return true;
    }

    
}
