package com.dmless.dmmachine.model.cause;

import com.dmless.dmmachine.model.effect.Event;
import com.dmless.dmmachine.model.effect.Quest;

import java.util.List;

/**
 * Created by Charles on 8/26/2016.
 */
public class Target extends Cause{

	private int size;
	private List<Event> eventList;
	private List<Quest> questList;
	private String flavor;
	private Target parent;
	private String type;

	/**
	 *
	 * @param name
	 * @param description
	 */
	public Target( String name,
					  String description) {
		super(name, description);
	}

	/**
	 *
	 * @param id
	 * @param name
	 * @param description
	 * @param known
	 */
	public Target(int id,
					  String name,
					  String description,
					  boolean known,
					  int size) {
		super(id, name, description, known);
		this.size = size;
	}

	/**
	 *
	 * @param id
	 * @param name
	 * @param description
	 * @param known
	 * @param eventList
	 * @param myQuests
	 * @param flavor
	 * @param parent
	 * @param type
	 */
	public Target(int id,
					  String name,
					  String description,
					  boolean known,
					  int size,
					  List<Event> eventList,
					  List<Quest> myQuests,
					  String flavor,
					  Target parent,
					  String type) {
		super(id, name, description, known);
		this.size = size;
		this.eventList = eventList;
		this.questList = myQuests;
		this.flavor = flavor;
		this.parent = parent;
		this.type = type;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public List<Event> getEventList() {
		return eventList;
	}

	public void setEventList(List<Event> eventList) {
		this.eventList = eventList;
	}

	public List<Quest> getQuestList() {
		return questList;
	}

	public void setQuestList(List<Quest> questList) {
		this.questList = questList;
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public Target getParent() {
		return parent;
	}

	public void setParent(Target parent) {
		this.parent = parent;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void addEvent(Event event){
		eventList.add(event);
	}

	public boolean removeEvent(Event event){
		return eventList.remove(event);
	}

	public void addQuest(Quest quest){
		questList.add(quest);
	}

	public boolean removeQuest(Quest quest){
		return questList.remove(quest);
	}

	@Override
	public String toString() {
		return super.toString();
	}
}
