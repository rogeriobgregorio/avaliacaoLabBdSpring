package com.github.rogeriobgregorio.avaliacaoLabBdSpring.persistence;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.github.rogeriobgregorio.avaliacaoLabBdSpring.entity.Jogo;

@Repository
public class JogoRepository {

	private final JdbcTemplate jdbcTemplate;

	@Autowired
	public JogoRepository(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public List<Jogo> buscarJogo(String data) {
		String sql = "SELECT * FROM fn_consultarData(?)";

		RowMapper<Jogo> mapper = (rs, rowNum) -> {
			String codigoTimeA = rs.getString("nome_timeA");
			String codigoTimeB = rs.getString("nome_timeB");

			return new Jogo(codigoTimeA, codigoTimeB);

		};

		return jdbcTemplate.query(sql, mapper, data);
	}

	public void insereGols(Jogo jogo) {
		String sql = "{CALL sp_insereGols(?, ?, ?, ?)}";

		jdbcTemplate.update(sql, jogo.getGolsTimeA(), jogo.getGolsTimeB(), jogo.getCodigoTimeA(),
				jogo.getCodigoTimeB());
	}

	public void gerarRodadas() {
		String sql = "{call sp_gera_jogos}";
		
		jdbcTemplate.execute(sql);
	}
}
