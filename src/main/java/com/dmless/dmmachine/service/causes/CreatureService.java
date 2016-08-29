package com.dmless.dmmachine.service.causes;

import com.dmless.dmmachine.model.cause.Creature;
import com.dmless.dmmachine.service.exceptions.CreatureNotFoundException;

/**
 * Created by Charles on 8/27/2016.
 */
public interface CreatureService {

	public Creature getCreatureById(String id) throws CreatureNotFoundException;
	public Creature getRandomCreature();
	public void newCreature(Creature creature);
	public Creature updateCreature(Creature creature) throws CreatureNotFoundException;
	public void deleteCreature(Creature creature) throws CreatureNotFoundException;
}
