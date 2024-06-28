package Modelo;

import java.util.List;

public class GestorAlquileres {

        public static Alquiler encontrarAlquilerMayorCosto(List<Alquiler> alquileres) {
            if (alquileres.isEmpty()) {
                return null;
            }

            Alquiler alquilerMayorCosto = alquileres.get(0);
            double mayorCosto = alquilerMayorCosto.getCostoTotal();

            for (int i = 1; i < alquileres.size(); i++) {
                Alquiler alquilerActual = alquileres.get(i);
                double costoActual = alquilerActual.getCostoTotal();
                if (costoActual > mayorCosto) {
                    mayorCosto = costoActual;
                    alquilerMayorCosto = alquilerActual;
                }
            }

            return alquilerMayorCosto;
        }
    }
