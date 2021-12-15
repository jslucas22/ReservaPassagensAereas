package DAO;

import Model.modVoo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Administrador
 */
public class vooDAO {

    //------------------------------------------------------------------------->
    //# Busca os voos cadastrados
    //------------------------------------------------------------------------->
    public ArrayList<modVoo> BuscarVoo(modVoo voo) {
        ArrayList<modVoo> listVoo = new ArrayList<modVoo>();

        try {
            Connection conn = new ConnectionFactory().getConnection();
            String query = "SELECT NUMERO_VOO, ORIGEM, DESTINO, QTD_LUGARES_DISPONIVEIS FROM VOO WITH (NOLOCK) WHERE NUMERO_VOO = " + voo.getNumeroVoo() + " ORDER BY ORIGEM";

            PreparedStatement preparedStatement = conn.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                modVoo voo_model = new modVoo();
                voo_model.setNumeroVoo(resultSet.getInt("NUMERO_VOO"));
                voo_model.setOrigem(resultSet.getString("ORIGEM"));
                voo_model.setDestino(resultSet.getString("DESTINO"));
                voo_model.setQtdLugaresDisponiveis(resultSet.getInt("QTD_LUGARES_DISPONIVEIS"));
                listVoo.add(voo_model);
            }

            resultSet.close();
            preparedStatement.close();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return listVoo;
    }

    //------------------------------------------------------------------------->
    //# Busca a existencia de um voo
    //------------------------------------------------------------------------->
    public Boolean BuscaExitenciaVoo(modVoo voo) {
        modVoo voo_model = new modVoo();
        Boolean existeVoo = false;
        try {
            Connection conn = new ConnectionFactory().getConnection();
            String query = "SELECT NUMERO_VOO FROM VOO WITH(NOLOCK) WHERE NUMERO_VOO = " + voo.getNumeroVoo();

            PreparedStatement preparedStatement = conn.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                voo_model.setNumeroVoo(resultSet.getInt("NUMERO_VOO"));
            }

            if (voo_model.getNumeroVoo() > 0) {
                existeVoo = true;
            } else {
                existeVoo = false;
            }

            preparedStatement.close();
            conn.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return existeVoo;
    }

    //------------------------------------------------------------------------->
    //# Insere os dados de um voo
    //------------------------------------------------------------------------->
    public void InserirVoo(modVoo voo) {
        try {
            Connection conn = new ConnectionFactory().getConnection();
            String query = "INSERT INTO VOO(NUMERO_VOO, ORIGEM, DESTINO, QTD_LUGARES_DISPONIVEIS) VALUES (" + voo.getNumeroVoo() + ", '" + voo.getOrigem() + "', '" + voo.getDestino() + "', " + voo.getQtdLugaresDisponiveis() + ")";

            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.executeQuery();

            preparedStatement.close();
            conn.close();
        } catch (SQLException ex) {
            ex.getErrorCode();
        }
    }

}
