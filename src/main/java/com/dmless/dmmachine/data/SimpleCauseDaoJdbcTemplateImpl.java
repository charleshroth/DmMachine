package com.dmless.dmmachine.data;

import com.dmless.dmmachine.model.cause.SimpleCause;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * SimpleCause dao
 * Author: Charles Roth
 */
@Repository
public class SimpleCauseDaoJdbcTemplateImpl implements SimpleCauseDao {

	private static final String INSERT_CAUSE_SQL = "INSERT INTO cause(ID, NAME, DESCRIPTION, ISKNOWN) VALUES (?,?,?,?)";
	private static final String UPDATE_CAUSE_SQL = "UPDATE cause SET ID=?, NAME=?, DESCRIPTION=?, ISKNOWN=?";
	private static final String DELETE_CAUSE_SQL = "DELETE cause WHERE ID=?";
	private static final String GET_CAUSE_BY_ID_SQL = "SELECT * FROM cause WHERE ID=?";
	private static final String GET_RANDOM_CAUSE_ID = "SELECT id FROM cause ORDER BY RAND() LIMIT 1";
	private JdbcTemplate template;

	@Autowired
	public SimpleCauseDaoJdbcTemplateImpl(JdbcTemplate template){ this.template = template;}

	@Override
	public void create(SimpleCause cause) {
		template.update(INSERT_CAUSE_SQL,
				  cause.getId(),
				  cause.getName(),
				  cause.getDescription(),
				  cause.isKnown()
				  );
	}

	@Override
	public SimpleCause getSimpleCauseById(Long id) throws RecordNotFoundException {
		try{
			return template.queryForObject(GET_CAUSE_BY_ID_SQL, new CauseRowMapper(), id);
		}catch (IncorrectResultSizeDataAccessException e){
			throw new RecordNotFoundException();
		}
	}

	@Override
	public Long getRandomSimpleCauseId() {
		return template.queryForObject(GET_RANDOM_CAUSE_ID, Long.class);
	}

	@Override
	public void update(SimpleCause causeToUdate) throws RecordNotFoundException {
		template.update(UPDATE_CAUSE_SQL,
				  causeToUdate.getId(),
				  causeToUdate.getName(),
				  causeToUdate.getDescription(),
				  causeToUdate.isKnown()
		);
	}

	@Override
	public void delete(SimpleCause causeToDelete) throws RecordNotFoundException {
		int rowsAffected = template.update(DELETE_CAUSE_SQL, causeToDelete.getId());
		if (rowsAffected != 1)
		{
			throw new RecordNotFoundException();
		}
	}
}

class CauseRowMapper implements RowMapper<SimpleCause>{
	@Override
	public SimpleCause mapRow(ResultSet rs, int rowNumber) throws SQLException{
		Long id = rs.getLong("ID");
		String name = rs.getString("NAME");
		String description = rs.getString("DESCRIPTION");
		Boolean isKnown = rs.getBoolean("ISKNOWN");
		return new SimpleCause(id, name, description, isKnown);
	}
}
