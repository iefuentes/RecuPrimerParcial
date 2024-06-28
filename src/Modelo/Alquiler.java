package Modelo;

import java.time.LocalDate;

public class Alquiler {
    private Cliente cliente;
    private Vehiculo vehiculo;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private int kilometrosRecorridos;

    
    public Alquiler(Cliente cliente, Vehiculo vehiculo, LocalDate fechaInicio, LocalDate fechaFin, int kilometrosRecorridos) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.kilometrosRecorridos = kilometrosRecorridos;
    }

    public Alquiler() {
    }
    

    public double calcularCostoAlquiler() {
        int diasAlquilados = (int) this.fechaInicio.until(this.fechaFin).getDays();
        double costoDiario = diasAlquilados * vehiculo.getTarifaFijaDiaria();
        double costoKilometraje = this.kilometrosRecorridos * 50;
        return costoDiario + costoKilometraje;
    }

    public double getCostoTotal(){
        return calcularCostoAlquiler();
    }
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public int getKilometrosRecorridos() {
        return kilometrosRecorridos;
    }

    public void setKilometrosRecorridos(int kilometrosRecorridos) {
        this.kilometrosRecorridos = kilometrosRecorridos;
    }

    // Método para mostrar información del alquiler


    @Override
    public String toString() {
        return "Alquiler{" +
                "cliente=" + cliente.getNombreCompleto() + " - DNI: " + cliente.getDni() +
                ", vehiculo=" + vehiculo.getModelo() +
                ", fechaInicio=" + fechaInicio +
                ", fechaFin=" + fechaFin +
                ", kilometrosRecorridos=" + kilometrosRecorridos +
                ", costoTotal=" + getCostoTotal() +
                '}';
    }
}
    
    
    