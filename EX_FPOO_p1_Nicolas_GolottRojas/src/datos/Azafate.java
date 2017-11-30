package datos;

import java.util.Objects;

public class Azafate extends PersonalDeCabina {

    private String idioma;

    public Azafate() {
    }
/**
 * 
 * @param rut éste parámetro identifica el rut de la azafate.
 */
    public Azafate(String rut) {
        super(rut);
    }
/**
 * 
 * @param idioma éste parámetro indica el idioma de la azafate.
 * @param nombre éste parámetro indica el nombre de la azafate.
 * @param apellido éste parámetro indica el apellido de la azafate.
 * @param nacionalidad éste parámetro indica la nacionalidad de la azafate.
 * @param edad éste parámetro indica la edad de la azafate (debe ser mayor a 21).
 */
    public Azafate(String idioma, String nombre, String apellido, String nacionalidad, int edad) {
        super(nombre,
              apellido,
              nacionalidad,
              edad);
        this.idioma = idioma;
    }

    public String getIdioma() {
        return idioma;
    }
/**
 * 
 * @param idioma éste parámetro modifica el idioma de la azafate. 
 */
    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.idioma);
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
        final Azafate other = (Azafate) obj;
        if (!Objects.equals(this.idioma, other.idioma)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Azafate{" + "idioma=" + idioma +
                ", rut=" + super.getRut() +
                ", nombre=" + super.getNombre() +
                ", apellido=" + super.getApellido() +
                ", edad=" + super.getEdad();
    }

}
