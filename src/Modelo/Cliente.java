package Modelo;

public class Cliente {
    private String nombreCompleto;
    private String dni;
    private boolean registroConducir;

    public Cliente() {
    }
    public Cliente(String nombreCompleto, String dni, boolean registroConducir) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
        this.registroConducir = registroConducir;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public boolean isRegistroConducir() {
        return registroConducir;
    }

    public void setRegistroConducir(boolean registroConducir) {
        this.registroConducir = registroConducir;
    }

    public boolean puedeAlquilar() {
        // Verificar que el nombre completo no esté vacío
        if (nombreCompleto == null || nombreCompleto.isEmpty()) {
            return false;
        }

        // Verificar que el DNI no esté vacío
        if (dni == null || dni.isEmpty()) {
            return false;
        }

        // Verificar que el cliente tenga registro para conducir
        if (!registroConducir) {
            return false;
        }

        // Si pasa todas las validaciones, el cliente puede alquilar
        return true;
    }
}