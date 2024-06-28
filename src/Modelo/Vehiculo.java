package Modelo;

public abstract class Vehiculo {
    private String modelo;
    private int kilometraje;
    private int anio;
    private String codigoInterno;
    private double tarifaFijaDiaria;


    public Vehiculo(String modelo, int kilometraje, int anio, String codigoInterno, double tarifaFijaDiaria) {
        this.modelo = modelo;
        this.kilometraje = kilometraje;
        this.anio = anio;
        this.codigoInterno = codigoInterno;
        this.tarifaFijaDiaria = tarifaFijaDiaria;
    }

    public Vehiculo() {
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getCodigoInterno() {
        return codigoInterno;
    }

    public void setCodigoInterno(String codigoInterno) {
        this.codigoInterno = codigoInterno;
    }

    public double getTarifaFijaDiaria() {
        return tarifaFijaDiaria;
    }

    public void setTarifaFijaDiaria(double tarifaFijaDiaria) {
        this.tarifaFijaDiaria = tarifaFijaDiaria;
    }
}

