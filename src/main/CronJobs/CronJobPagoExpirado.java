package main.CronJobs;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import main.Reservas.ControllerReserva;
import main.Reservas.Reserva;

public class CronJobPagoExpirado {

    // controller que tiene todas las reservas
    static ControllerReserva controllerReserva;

    // Constructor
    public CronJobPagoExpirado() {
        CronJobPagoExpirado.controllerReserva = new ControllerReserva();
    }

    public static void main(String[] args) {

        // Get Reservas
        ArrayList<Reserva> reservas = controllerReserva.getListaReservas();

        // Create a Timer
        Timer timer = new Timer();

        // Create a TimerTask
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                // Itera cada reserva y ejecuta el metodo pagoExpirado() que se ocupa de cancelar la reserva si expiro.
                for (Reserva reserva : reservas) {
                    reserva.pagoExpirado();
                }
            }
        };

        // Ejecutar el CronJob cada 1 hora
        timer.schedule(task, 0, 60 * 60 * 1000);
    }
}

