package DAO;

import Model.modReserva;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Administrador
 */
public class reservaDAO {
    //------------------------------------------------------------------------->
    //# Da a baixa nos lugares disponíveis
    //------------------------------------------------------------------------->

    public String EfetuarReserva(modReserva reserva) {
        String mensagem = "";
        try {
            int qtdLugaresDisponiveis = ObterQuantidadeLugares(reserva) - 1;

            //# se o valor for maior do que -1, podemos efetuar uma reserva
            if (qtdLugaresDisponiveis > -1) {
                Connection conn = new ConnectionFactory().getConnection();
                String query = "UPDATE VOO SET QTD_LUGARES_DISPONIVEIS = " + qtdLugaresDisponiveis + " WHERE NUMERO_VOO = " + reserva.getNumeroVoo();

                PreparedStatement preparedStatement = conn.prepareStatement(query);
                preparedStatement.executeUpdate();

                preparedStatement.close();
                conn.close();

                mensagem = "Reserva Efetuada com sucesso!";
                //# se não, se a quantidade de lugares disponíveis for = 0, o voo já se encontra lotado
            } else {
                mensagem = "Voo lotado!";
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return mensagem;
    }

    public int ObterQuantidadeLugares(modReserva reserva) {
        int lugaresDisponiveis = 0;
        try {

            Connection conn = new ConnectionFactory().getConnection();
            String query = "SELECT QTD_LUGARES_DISPONIVEIS FROM VOO WITH(NOLOCK) WHERE NUMERO_VOO = " + reserva.getNumeroVoo();

            PreparedStatement preparedStatement = conn.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                lugaresDisponiveis = resultSet.getInt("QTD_LUGARES_DISPONIVEIS");
            }

            resultSet.close();
            preparedStatement.close();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return lugaresDisponiveis;
    }

}
