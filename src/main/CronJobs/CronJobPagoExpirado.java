package main.CronJobs;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import main.EstadoReserva.PendienteDePago;
import main.Reservas.ControllerReserva;
import main.Reservas.Reserva;

import java.time.Duration;
import java.time.LocalDateTime;

public class CronJobPagoExpirado {
    private static int horasMax;

    // controller que tiene todas las reservas
    static ControllerReserva controllerReserva;

    // Constructor
    public CronJobPagoExpirado(ControllerReserva controllerReserva) {
        CronJobPagoExpirado.horasMax = 24;
        CronJobPagoExpirado.controllerReserva = controllerReserva;
    }

    public static void main(String[] args) {

        ArrayList<Reserva> reservas = controllerReserva.getListaReservas();

        // Create a Timer
        Timer timer = new Timer();

        // Create a TimerTask
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                // Itera cada reserva y ejecuta el metodo pagoExpirado() que se ocupa de
                // cancelar la reserva si expiro.
                for (Reserva reserva : reservas) {
                    pagoExpirado(reserva);
                }
            }
        };

        // Ejecutar el CronJob cada 1 hora
        timer.schedule(task, 0, 60 * 60 * 1000);
    }

    public static void pagoExpirado(Reserva reserva) {

        if (reserva.getEstado() instanceof PendienteDePago) {

            long horasPasadas = calcularHorasPasadas(reserva);

            if (horasPasadas >= horasMax) {
                reserva.getEstado().cancelarReserva();
            }

        }
    }

    public static long calcularHorasPasadas(Reserva reserva) {
        LocalDateTime fechaHoraActual = LocalDateTime.now();
        Duration diferencia = Duration.between(reserva.getFechaReserva(), fechaHoraActual);
        long horasPasadas = diferencia.toHours();
        return horasPasadas;
    }

    public void setHorasMax(int horasMaximas) {
        horasMax = horasMaximas;
    }

    public long getHorasMax() {
        return horasMax;
    }
}