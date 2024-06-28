package Modelo;


public class Camioneta extends Vehiculo {
    private static final double TARIFA_FIJA_CAMIONETA = 150;

    public Camioneta(String modelo, int kilometraje, int anio, String codigoInterno) {
        super(modelo, kilometraje, anio, codigoInterno, TARIFA_FIJA_CAMIONETA);
    }
}