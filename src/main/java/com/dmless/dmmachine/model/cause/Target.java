package com.dmless.dmmachine.model.cause;

import com.dmless.dmmachine.model.effect.Event;

import java.util.List;

/**
 * Author: Charles Roth
 */
public interface Target extends Cause {

	int getSize();
	void setSize(int size);
	List<Event> getEvents();
	void setEvents(List<Event> events);
	List<Target> getTargets();
	void setTargets(List<Target> targets);
	String getFlavor();
	void setFlavor(String flavor);
	Cause getParent();
	void setParent(Cause parent);
	String getType();
	void setType(String type);
	void addEvent(Event event);
	boolean removeEvent(Event event);
	void addTarget(Target target);
	boolean removeTarget(Target target);

}
