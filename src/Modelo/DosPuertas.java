package Modelo;
public class DosPuertas extends Vehiculo {
    private static final double TARIFA_FIJA_DOS_PUERTAS = 100;

    public DosPuertas(String modelo, int kilometraje, int anio, String codigoInterno) {
        super(modelo, kilometraje, anio, codigoInterno, TARIFA_FIJA_DOS_PUERTAS);
    }
}
