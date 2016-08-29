package com.dmless.dmmachine.model.cause;

import java.io.Serializable;

/**
 * Author: Charles Roth
 */
public interface Cause extends Serializable {
	long getId();
	void setId(long id);
	String getName();
	void setName(String name);
	String getDescription();
	void setDescription(String description);
	boolean isKnown();
	void toggleIsKnown();
}
