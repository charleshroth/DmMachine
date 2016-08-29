package com.dmless.dmmachine.service.causes;

import com.dmless.dmmachine.model.cause.SimpleCause;
import com.dmless.dmmachine.service.exceptions.CauseNotFoundException;

import java.util.HashMap;
import java.util.Random;

/**
 * Created by Charles on 8/27/2016.
 */
public class SimpleCauseServiceMockImpl implements SimpleCauseService {

	private HashMap<Long, SimpleCause> simpleCauseMap;
	private int length = 0;

	public SimpleCauseServiceMockImpl(){
		simpleCauseMap = new HashMap<>();
		simpleCauseMap.put(1L, new SimpleCause(1L, "rain", "A lite rain", true));
		simpleCauseMap.put(2L, new SimpleCause(2L, "magic", "A little magic", false));
		length = 2;
	}

	@Override
	public SimpleCause findSimpleCauseById(long id) throws CauseNotFoundException {
		SimpleCause foundCause = simpleCauseMap.get(id);
		if(foundCause == null){
			throw new CauseNotFoundException();
		}
		return foundCause;
	}

	@Override
	public SimpleCause getRandomSimpleCause() {
		long x = 1234567L;
		long y = 23456789L;
		Random r = new Random();
		long id = x+((long)(r.nextDouble()*(y-x)));
		return simpleCauseMap.get(id);
	}

	@Override
	public void newSimpleCause(SimpleCause cause) {

	}

	@Override
	public void updateSimpleCause(SimpleCause cause) throws CauseNotFoundException {

	}

	@Override
	public void deleteSimpleCause(SimpleCause cause) throws CauseNotFoundException {

	}
}
