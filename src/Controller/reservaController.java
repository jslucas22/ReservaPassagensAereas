package Controller;

import DAO.reservaDAO;
import Model.modReserva;

/**
 *
 * @author Administrador
 */
public class reservaController {

    public String EfetuarReserva(modReserva reserva) {
        reservaDAO reservaDAO = new reservaDAO();
        return reservaDAO.EfetuarReserva(reserva);
    }
}
