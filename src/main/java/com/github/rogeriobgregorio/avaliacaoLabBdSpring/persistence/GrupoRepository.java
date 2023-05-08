package com.github.rogeriobgregorio.avaliacaoLabBdSpring.persistence;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.github.rogeriobgregorio.avaliacaoLabBdSpring.entity.Classificacao;
import com.github.rogeriobgregorio.avaliacaoLabBdSpring.entity.Time;

public class GrupoRepository {
	
	private final JdbcTemplate jdbcTemplate;

	@Autowired
	public GrupoRepository(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public List<Time> mostrarGrupos(char grupo) {
	    String sql = "SELECT cod_time, nome_time FROM fn_gerarTabelaGrupo(?)";
	    RowMapper<Time> mapper = (rs, rowNum) -> {
	        Time time = new Time();
	        time.setCodigoTime(rs.getInt("cod_time"));
	        time.setNomeTime(rs.getString("nome_time"));
	        return time;
	    };
	    return jdbcTemplate.query(sql, mapper, grupo);
	}
	
	public List<Classificacao> getTabelaGeralComPontos() {
	    String sql = "SELECT * FROM fn_gerarTabelaGeralComPontos()";
	    return jdbcTemplate.query(sql, (rs, rowNum) -> {
	    	Classificacao tabelaGeral = new Classificacao();
	    	tabelaGeral.setNomeTime(rs.getString("nome_time"));
	    	tabelaGeral.setNumJogosDisputados(rs.getInt("num_jogos_disputados"));
	    	tabelaGeral.setVitorias(rs.getInt("vitorias"));
	    	tabelaGeral.setEmpates(rs.getInt("empates"));
	    	tabelaGeral.setDerrotas(rs.getInt("derrotas"));
	    	tabelaGeral.setGolsMarcados(rs.getInt("gols_marcados"));
	    	tabelaGeral.setGolsSofridos(rs.getInt("gols_sofridos"));
	    	tabelaGeral.setSaldoGols(rs.getInt("saldo_gols"));
	        tabelaGeral.setPontos(rs.getInt("pontos"));
	        return tabelaGeral;
	    });
	}


}
