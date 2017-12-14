
package negocio;

public class Avion {
    String marca;
    String modelo;
    int capacidad;
    int num_helices;
    int dist_asientos;

    public Avion(String marca, String modelo, int capacidad, int num_helices, int dist_asientos) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidad = capacidad;
        this.num_helices = num_helices;
        this.dist_asientos = dist_asientos;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getNum_helices() {
        return num_helices;
    }

    public void setNum_helices(int num_helices) {
        this.num_helices = num_helices;
    }

    public int getDist_asientos() {
        return dist_asientos;
    }

    public void setDist_asientos(int dist_asientos) {
        this.dist_asientos = dist_asientos;
    }

    @Override
    public String toString() {
        return "Avion" + "marca=" + marca + 
                ", modelo=" + modelo + 
                ", capacidad=" + capacidad +
                ", num_helices=" + num_helices + 
                ", dist_asientos=" + dist_asientos;
    }
    
}
