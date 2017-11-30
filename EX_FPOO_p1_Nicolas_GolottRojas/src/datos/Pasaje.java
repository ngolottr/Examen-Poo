
package datos;

import java.util.Objects;

public class Pasaje extends Cliente {
int num_vuelo;
String fecha_hora;
String destino;
String clase;
double valor;
/**
 * 
 * @param num_vuelo éste parámetro indica el número de vuelo del pasaje del cliente.
 * @param fecha_hora éste parámetro indica la fecha y hora del pasaje del cliente.
 * @param destino éste parámetro indica el destino del pasaje del cliente.
 * @param clase éste parámetro indica la clase del pasaje del cliente (puede ser económica o ejecutiva).
 * @param valor éste parámetro indica el valor del pasaje del cliente.
 * @param rut éste parámetro identifica el rut del cliente en el pasaje.
 * @param nombre éste parámetro indica el nombre del cliente en el pasaje.
 */
    public Pasaje(int num_vuelo, String fecha_hora, String destino, String clase, double valor, String rut, String nombre) {
        super(rut, nombre);
        this.num_vuelo = num_vuelo;
        this.fecha_hora = fecha_hora;
        this.destino = destino;
        this.clase = clase;
        this.valor = valor;
    }

    public int getNum_vuelo() {
        return num_vuelo;
    }

    public void setNum_vuelo(int num_vuelo) {
        this.num_vuelo = num_vuelo;
    }

    public String getFecha_hora() {
        return fecha_hora;
    }

    public void setFecha_hora(String fecha_hora) {
        this.fecha_hora = fecha_hora;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Pasaje{" + "num_vuelo=" + num_vuelo + ", fecha_hora=" + fecha_hora + ", destino=" + destino + ", clase=" + clase + ", valor=" + valor + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 73 * hash + this.num_vuelo;
        hash = 73 * hash + Objects.hashCode(this.fecha_hora);
        hash = 73 * hash + Objects.hashCode(this.destino);
        hash = 73 * hash + Objects.hashCode(this.clase);
        hash = 73 * hash + (int) (Double.doubleToLongBits(this.valor) ^ (Double.doubleToLongBits(this.valor) >>> 32));
        return hash;
    }

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
        final Pasaje other = (Pasaje) obj;
        if (this.num_vuelo != other.num_vuelo) {
            return false;
        }
        if (Double.doubleToLongBits(this.valor) != Double.doubleToLongBits(other.valor)) {
            return false;
        }
        if (!Objects.equals(this.fecha_hora, other.fecha_hora)) {
            return false;
        }
        if (!Objects.equals(this.destino, other.destino)) {
            return false;
        }
        if (!Objects.equals(this.clase, other.clase)) {
            return false;
        }
        return true;
    }

    
}
