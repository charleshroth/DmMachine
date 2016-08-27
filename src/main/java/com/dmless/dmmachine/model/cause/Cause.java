package com.dmless.dmmachine.model.cause;

import java.io.Serializable;

/**
 * Created by Charles on 8/26/2016.
 */
public class Cause implements Serializable {

	private int id;
	private String name;
	private String description;
	private boolean isKnown = false;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isKnown() {
		return isKnown;
	}

	protected void setKnown(boolean known) {
		this.isKnown = known;
	}

	public void toggleIsKnown() {
		this.isKnown = !isKnown;
	}

	/**
	 * Constructor
	 * @param name
	 * @param description
	 */
	public Cause(String name, String description){
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
	public Cause(int id, String name, String description, boolean known){
		this.id = id;
		this.name = name;
		this.description = description;
		this.isKnown = known;
	}

	@Override
	public String toString() {
		return "Cause: " + name + " (" + description + ")";
	}
}
