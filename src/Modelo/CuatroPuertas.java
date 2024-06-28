package Modelo;

public class CuatroPuertas extends Vehiculo {
    private static final double TARIFA_FIJA_CUATRO_PUERTAS = 120;

    public CuatroPuertas(String modelo, int kilometraje, int anio, String codigoInterno) {
        super(modelo, kilometraje, anio, codigoInterno, TARIFA_FIJA_CUATRO_PUERTAS);
    }
}