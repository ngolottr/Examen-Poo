
package datos;

public class Piloto extends PersonalDeCabina{
     int horas_vuelo;

    public Piloto() {
    }

    public Piloto(String rut) {
        super(rut);
    }

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

    public void setHoras_vuelo(int horas_vuelo) {
        this.horas_vuelo = horas_vuelo;
    }

    
    
  
}
