package com.dmless.dmmachine.model.effect;

import com.dmless.dmmachine.model.cause.Cause;

/**
 * Created by Charles on 8/26/2016.
 */
public class Quest extends Event{

	public Quest(Effect effect,
					 Cause cause,
					 String name,
					 int timer,
					 boolean isKnown) {
		super(effect, cause, name, timer, isKnown);
	}
}
