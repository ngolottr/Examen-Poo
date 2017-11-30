
package datos;

public class Piloto extends PersonalDeCabina{
     int horas_vuelo;

    public Piloto() {
    }
/**
 * 
 * @param rut éste parámetro identifica al Piloto.
 */
    public Piloto(String rut) {
        super(rut);
    }
/**
 * 
 * @param horas_vuelo éste parámetro indica las horas de vuelo del Piloto (deben ser 400 min).
 * @param nombre éste parámetro indica el nombre del Piloto.
 * @param apellido éste parámetro indica el apellido del Piloto.
 * @param nacionalidad éste parámetro indica la nacionalidad del Piloto.
 * @param edad éste parámetro indica la edad del Piloto (debeser mayor a 21).
 */
    public Piloto(int horas_vuelo, String rut, String nombre, String apellido, String nacionalidad, int edad) {
        super(nombre,
              apellido,
              nacionalidad,
              edad);
        this.horas_vuelo = 400;
    }

    public int getHoras_vuelo() {
        return horas_vuelo;
    }
/**
 * 
 * @param horas_vuelo éste parámetro modifia las horas de vuelo del Piloto (debe ser mayor a 400).
 */
    public void setHoras_vuelo(int horas_vuelo) {
        this.horas_vuelo = horas_vuelo;
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
        final Piloto other = (Piloto) obj;
        if (this.horas_vuelo != other.horas_vuelo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Piloto:" + "horas_vuelo=" + horas_vuelo;
    }

    
    
  
}
