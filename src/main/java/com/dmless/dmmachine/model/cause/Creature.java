package com.dmless.dmmachine.model.cause;

import com.dmless.dmmachine.model.effect.Event;

import java.util.List;

/**
 * A creature, which can be a cause or target
 * Author: Charles Roth
 */
public class Creature implements Target{
	private int size;
	private List<Event> events;
	private List<Target> targets;
	private String flavor;
	private Cause parent;
	private long id;
	private String name;
	private String description;
	private Boolean isKnown;
	private int hitPoints;
	private int speed;

	@Override
	public int getSize() {
		return this.size;
	}

	@Override
	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public List<Event> getEvents() {
		return events;
	}

	@Override
	public void setEvents(List<Event> events) {
		this.events = events;
	}

	@Override
	public List<Target> getTargets() {
		return targets;
	}

	@Override
	public void setTargets(List<Target> targets) {
		this.targets = targets;
	}

	@Override
	public String getFlavor() {
		return flavor;
	}

	@Override
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	@Override
	public Cause getParent() {
		return parent;
	}

	@Override
	public void setParent(Cause cause) {
		this.parent = cause;
	}

	@Override
	public String getType() {
		return null;
	}

	@Override
	public void setType(String type) {

	}

	@Override
	public void addEvent(Event event) {
		this.events.add(event);
	}

	@Override
	public boolean removeEvent(Event event) {
		return this.events.remove(event);
	}

	@Override
	public void addTarget(Target target) {
		this.targets.add(target);
	}

	@Override
	public boolean removeTarget(Target target) {
		return this.targets.remove(target);
	}

	@Override
	public long getId() {
		return this.id;
	}

	@Override
	public void setId(long id) {
		this.id = id;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getDescription() {
		return this.description;
	}

	@Override
	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public boolean isKnown() {
		return isKnown;
	}

	@Override
	public void toggleIsKnown() {
		this.isKnown = !isKnown;
	}

	public int getHitPoints() {
		return hitPoints;
	}

	public void setHitPoints(int hitPoints) {
		this.hitPoints = hitPoints;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
}
