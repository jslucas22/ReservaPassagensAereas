package Controller;

import DAO.vooDAO;
import Model.modVoo;
import java.util.ArrayList;

/**
 *
 * @author Administrador
 */
public class vooController {

    public ArrayList<modVoo> BuscarVoo(modVoo voo) {
        vooDAO vooDAO = new vooDAO();
        return vooDAO.BuscarVoo(voo);
    }

    public Boolean BuscarExistenciaVoo(modVoo voo) {
        vooDAO vooDAO = new vooDAO();
        return vooDAO.BuscaExitenciaVoo(voo);
    }

    public void InserirVoo(modVoo voo) {
        vooDAO vooDAO = new vooDAO();
        vooDAO.InserirVoo(voo);
    }
}
