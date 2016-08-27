package com.dmless.dmmachine.model.effect;

/**
 * Created by Charles on 8/26/2016.
 */
public class Effect {
	private String desc;
	private String type;

	public Effect(String desc, String type) {
		this.desc = desc;
		this.type = type;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Effect{" +
				  "desc='" + desc + '\'' +
				  ", type='" + type + '\'' +
				  '}';
	}
}
