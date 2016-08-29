package com.dmless.dmmachine.data;

import com.dmless.dmmachine.model.cause.SimpleCause;

/**
 * The SimpleCause dao interface
 * Author Charles Roth
 */
public interface SimpleCauseDao {
	public void create(SimpleCause cause);
	public SimpleCause getSimpleCauseById(Long id)throws RecordNotFoundException;
	public Long getRandomSimpleCauseId();
	public void update(SimpleCause causeToUdate) throws RecordNotFoundException;
	public void delete(SimpleCause causeToDelete) throws RecordNotFoundException;
}
