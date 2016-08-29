package com.dmless.dmmachine.service.causes;

import com.dmless.dmmachine.data.SimpleCauseDao;
import com.dmless.dmmachine.data.RecordNotFoundException;
import com.dmless.dmmachine.model.cause.SimpleCause;
import com.dmless.dmmachine.service.exceptions.CauseNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Charles on 8/28/2016.
 */
@Service
public class SimpleCauseServiceJdbcImpl implements SimpleCauseService {

	public SimpleCauseDao dao;

	@Autowired
	public SimpleCauseServiceJdbcImpl(SimpleCauseDao dao){
		this.dao = dao;
	}

	@Override
	public SimpleCause findSimpleCauseById(long id) throws CauseNotFoundException {
		try {
			return dao.getSimpleCauseById(id);
		} catch (RecordNotFoundException e) {
			throw new CauseNotFoundException();
		}
	}

	@Override
	public SimpleCause getRandomSimpleCause() throws CauseNotFoundException{
		Long id = dao.getRandomSimpleCauseId();
		try {
			return dao.getSimpleCauseById(id);
		} catch (RecordNotFoundException e) {
			throw new CauseNotFoundException();
		}
	}

	@Override
	public void newSimpleCause(SimpleCause cause) {
		dao.create(cause);
	}

	@Override
	public void updateSimpleCause(SimpleCause cause) throws CauseNotFoundException {
		try {
			dao.update(cause);
		} catch (RecordNotFoundException e) {
			throw new CauseNotFoundException();
		}
	}

	@Override
	public void deleteSimpleCause(SimpleCause cause) throws CauseNotFoundException {
		try {
			dao.delete(cause);
		} catch (RecordNotFoundException e) {
			throw new CauseNotFoundException();
		}
	}
}
