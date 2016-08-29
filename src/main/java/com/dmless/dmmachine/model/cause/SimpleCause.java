package com.dmless.dmmachine.model.cause;

import java.io.Serializable;

/**
 * The cause
 * Author: Charles Roth
 */
public class SimpleCause implements Cause {

	private long id;
	private String name;
	private String description;
	private boolean isKnown = false;

	@Override
	public long getId() {
		return id;
	}

	@Override
	public void setId(long id) {
		this.id = id;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public boolean isKnown() {
		return isKnown;
	}

	protected void setKnown(boolean known) {
		this.isKnown = known;
	}

	@Override
	public void toggleIsKnown() {
		this.isKnown = !isKnown;
	}

	/**
	 * Constructor
	 * @param name
	 * @param description
	 */
	public SimpleCause(String name, String description){
		this.name = name;
		this.description = description;
		this.isKnown = false;
	}

	/**
	 * Constructor
	 * @param id
	 * @param name
	 * @param description
	 * @param known
	 */
	public SimpleCause(long id, String name, String description, boolean known){
		this.id = id;
		this.name = name;
		this.description = description;
		this.isKnown = known;
	}

	@Override
	public String toString() {
		return "SimpleCause: " + name + " (" + description + ")";
	}
}
