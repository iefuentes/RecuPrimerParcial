import Modelo.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear clientes
        Cliente cliente1 = new Cliente("Ignacio Fuentes", "35247044", true);
        Cliente cliente2 = new Cliente("Juliana Casella", "35263232", false); // Ejemplo de cliente sin registro para conducir
        Cliente cliente3 = new Cliente("Roberto Casella", "35261232", true);
        // Crear vehículos
        Vehiculo vehiculo1 = new DosPuertas("Ford Fiesta", 30000, 2022, "D123");
        Vehiculo vehiculo2 = new CuatroPuertas("Toyota Corolla", 40000, 2021, "C456");
        Vehiculo vehiculo3 = new CuatroPuertas("TICO", 55000, 2023, "A121");


        // Fechas de inicio y fin del alquiler
        LocalDate fechaInicio1 = LocalDate.of(2024, 6, 1);
        LocalDate fechaFin1 = LocalDate.of(2024, 6, 10);
        LocalDate fechaInicio2 = LocalDate.of(2024, 6, 5);
        LocalDate fechaFin2 = LocalDate.of(2024, 6, 15);
        LocalDate fechaInicio3 = LocalDate.of(2024, 6, 3);
        LocalDate fechaFin3 = LocalDate.of(2024, 6, 12);

        List<Alquiler> listaAlquileres = new ArrayList<>();

        // Validar clientes y generar alquileres
        if (cliente1.puedeAlquilar()) {
            Alquiler alquiler1 = new Alquiler(cliente1, vehiculo1, fechaInicio1, fechaFin1, 500);
            listaAlquileres.add(alquiler1);
            System.out.println("Alquiler 1 creado:");
            System.out.println(alquiler1);
        } else {
            System.out.println("El cliente no cumple con los requisitos para alquilar.");
        }

        if (cliente2.puedeAlquilar()) {
            Alquiler alquiler2 = new Alquiler(cliente2, vehiculo2, fechaInicio2, fechaFin2, 800);
            listaAlquileres.add(alquiler2);
            System.out.println("Alquiler 1 creado:");
            System.out.println(alquiler2);
        } else {
            System.out.println("El cliente no cumple con los requisitos para alquilar.");
        }

        if (cliente3.puedeAlquilar()) {
            Alquiler alquiler3 = new Alquiler(cliente3, vehiculo3, fechaInicio3, fechaFin3, 700);
            listaAlquileres.add(alquiler3);
            System.out.println("\nAlquiler 3 creado:");
            System.out.println(alquiler3);
        } else {
            System.out.println("El cliente no cumple con los requisitos para alquilar.");

        }

        Alquiler alquilerMayorValor = GestorAlquileres.encontrarAlquilerMayorCosto(listaAlquileres);
        if (alquilerMayorValor != null) {
            System.out.println("\nAlquiler con mayor valor:");
            System.out.println(alquilerMayorValor);
        } else {
            System.out.println("\nNo se encontraron alquileres para evaluar el mayor valor.");
        }

        int contadorDosPuertas = 0;
        int contadorCuatroPuertas = 0;
        int contadorCamioneta=0;

        for (Alquiler alquiler : listaAlquileres) {
            if (alquiler.getVehiculo() instanceof DosPuertas) {
                contadorDosPuertas++;
            } else if (alquiler.getVehiculo() instanceof CuatroPuertas) {
                contadorCuatroPuertas++;
            } else if (alquiler.getVehiculo() instanceof Camioneta){
             contadorCamioneta++;
            }
        }

        // Mostrar resultados
        System.out.println("\nCantidad de alquileres por tipo de vehículo:");
        System.out.println("Dos Puertas: " + contadorDosPuertas);
        System.out.println("Cuatro Puertas: " + contadorCuatroPuertas);
        System.out.println("Camionetas: " + contadorCamioneta);
            }
    }







