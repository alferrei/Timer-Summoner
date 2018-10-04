package dao;

import classes.SQLConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import classes.Campeao;

public class CampeaoDAO {
	public Campeao campeao;

	public String pegaNomeCampeao(String nomeChamp) {
		Connection con = SQLConnection.getConnection();
		PreparedStatement stmt = null;
		ResultSet rst = null;

		if (nomeChamp != null) {
			try {
				stmt = con.prepareStatement("SELECT nome FROM campeao WHERE nome LIKE ?");
				stmt.setString(1, "%" + nomeChamp + "%");

				while (rst.next()) {
					Campeao campeao = new Campeao();
					campeao.setNome(rst.getString("nome"));		}
			} catch (SQLException e) {
				Logger.getLogger(CampeaoDAO.class.getName()).log(Level.SEVERE, null, e);
			} finally {
				SQLConnection.closeConnection(con, stmt, rst);
			}
			return campeao.getNome();
		}

		return campeao.getNome();

	}

	void iniciaContador() {
		// precisa abrir e gerar uma conexão com o banco aqui
		if (campeao == null) {

		}
	}

}
