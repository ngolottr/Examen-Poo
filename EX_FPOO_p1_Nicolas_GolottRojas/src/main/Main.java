
package main;

import datos.Azafate;
import datos.Cliente;
import datos.Pasaje;
import datos.Piloto;
import negocio.Avion;

/**
 * Demuestra el modelo de negocio de la aerolinea: un Cliente que compra
 * un Pasaje, el Personal de Cabina (Azafata y Piloto, ambos subclases de
 * PersonalDeCabina) y el Avion en el que se realiza el vuelo.
 *
 * @author Nicolas Golott Rojas
 */
public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("12345678-9", "Nicolas Golott");
        System.out.println(cliente);

        Pasaje pasaje = new Pasaje(101, "2026-09-06 08:30", "Santiago", "Economica", 89990.0,
                cliente.getRut(), cliente.getNombre());
        System.out.println(pasaje);

        Azafate azafata = new Azafate("Ingles", "Maria", "Perez", "Chilena", 28);
        System.out.println(azafata);

        Piloto piloto = new Piloto(400, "9-8765432", "Juan", "Soto", "Chilena", 45);
        System.out.println(piloto);

        Avion avion = new Avion("Airbus", "A320", 180, 2, 30);
        System.out.println(avion);
    }

}
