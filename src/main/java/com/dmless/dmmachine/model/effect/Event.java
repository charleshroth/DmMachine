package com.dmless.dmmachine.model.effect;

import com.dmless.dmmachine.model.cause.Cause;
import com.dmless.dmmachine.model.effect.Effect;

/**
 * Created by Charles on 8/26/2016.
 */
public class Event {

	private Effect effect;
	private Cause cause;
	private String name;
	public int timer = 0;
	private boolean isKnown = false;

	public Event(Effect effect,
					 Cause cause,
					 String name,
					 int timer,
					 boolean isKnown) {
		this.effect = effect;
		this.cause = cause;
		this.name = name;
		this.timer = timer;
		this.isKnown = isKnown;
	}

	public Effect getEffect() {
		return effect;
	}

	public void setEffect(Effect effect) {
		this.effect = effect;
	}

	public Cause getCause() {
		return cause;
	}

	public void setCause(Cause cause) {
		this.cause = cause;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTimer() {
		return timer;
	}

	public void setTimer(int timer) {
		this.timer = timer;
	}

	public boolean isKnown() {
		return isKnown;
	}

	public void setKnown(boolean known) {
		isKnown = known;
	}

	@Override
	public String toString() {
		return "Event{" +
				  "effect=" + effect +
				  ", cause=" + cause +
				  ", name='" + name + '\'' +
				  ", timer=" + timer +
				  ", isKnown=" + isKnown +
				  '}';
	}
}
