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

	void validaNome(String nome) {

		if (nome != null) {
			CampeaoDAO campeao = new CampeaoDAO();
			campeao.getChampName(nome);
		} else {
			// criar tratamento de exception pra esse carinha aqui
			System.out.println("Nome de campeão não é válido");
		}
	}

	public String getChampName(String nome) {
		Connection con = SQLConnection.getConnection();
		PreparedStatement stmt = null;
		ResultSet rst = null;

		try {
			stmt = con.prepareStatement("SELECT nome FROM campeao WHERE nome LIKE ?");
			stmt.setString(1, "%" + nome + "%");

			while (rst.next()) {
				Campeao campeao = new Campeao();
				campeao.setNome(rst.getString("nome"));
			}
		} catch (SQLException e) {
			Logger.getLogger(CampeaoDAO.class.getName()).log(Level.SEVERE, null, e);
		} finally {
			SQLConnection.closeConnection(con, stmt, rst);
		}
		return campeao.getNome();
	}

}
