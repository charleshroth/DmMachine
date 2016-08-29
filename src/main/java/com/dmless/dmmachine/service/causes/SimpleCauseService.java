package com.dmless.dmmachine.service.causes;

import com.dmless.dmmachine.model.cause.SimpleCause;
import com.dmless.dmmachine.service.exceptions.CauseNotFoundException;

/**
 * Created by Charles on 8/27/2016.
 */
public interface SimpleCauseService {

	public SimpleCause findSimpleCauseById(long id) throws CauseNotFoundException;
	public SimpleCause getRandomSimpleCause() throws CauseNotFoundException;

	public void newSimpleCause(SimpleCause cause);
	public void updateSimpleCause(SimpleCause cause) throws CauseNotFoundException;
	public void deleteSimpleCause(SimpleCause cause) throws CauseNotFoundException;

}
