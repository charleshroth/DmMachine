package com.dmless.dmmachine.model.cause;

import com.dmless.dmmachine.model.effect.Event;
import com.dmless.dmmachine.model.effect.Quest;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Charles on 8/26/2016.
 */
public class Location extends Target{

	private List<Creature> creatures;
	private List<Item> items;
	private List<Location> locations;

	/**
	 * @param name
	 * @param description
	 */
	public Location(String name,
						 String description,
						 List<Creature> creatures,
						 List<Item> items,
						 List<Location> locations) {
		super(name, description);
		this.creatures = creatures;
		this.items = items;
		this.locations = locations;
	}

	/**
	 * @param id
	 * @param name
	 * @param description
	 * @param known
	 * @param size
	 */
	public Location(int id,
						 String name,
						 String description,
						 boolean known,
						 int size,
						 List<Creature> creatures,
						 List<Item> items,
						 List<Location> locations) {
		super(id, name, description, known, size);
		this.creatures = creatures;
		this.items = items;
		this.locations = locations;
	}

	/**
	 * @param id
	 * @param name
	 * @param description
	 * @param known
	 * @param size
	 * @param eventList
	 * @param myQuests
	 * @param flavor
	 * @param parent
	 * @param type
	 */
	public Location(int id,
						 String name,
						 String description,
						 boolean known,
						 int size, List<Event> eventList,
						 List<Quest> myQuests,
						 String flavor,
						 Target parent,
						 String type, List<Creature> creatures,
						 List<Item> items,
						 List<Location> locations) {
		super(id, name, description, known, size, eventList, myQuests, flavor, parent, type);
		this.creatures = creatures;
		this.items = items;
		this.locations = locations;
	}

	public List<Creature> getCreatures() {
		return creatures;
	}

	public void setCreatures(List<Creature> creatures) {
		this.creatures = creatures;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public List<Location> getLocations() {
		return locations;
	}

	public void setLocations(List<Location> locations) {
		this.locations = locations;
	}

	public void addItem(Item item) throws Exception{
		if(item.getSize() > this.getSize()) {
			items.add(item);
		}else {
			throw new Exception();
		}
	}

	public boolean removeItem(Item item){
		return items.remove(item);
	}

	public void addCreature(Creature creature) throws Exception{
		if(creature.getSize() > this.getSize()) {
			creatures.add(creature);
		}else {
			throw new Exception();
		}
	}

	public boolean removeCreature(Creature creature){
		return creatures.remove(creature);
	}

	public void addLocation(Location location) throws Exception{
		if(location.getSize() > this.getSize()) {
			locations.add(location);
		}else {
			throw new Exception();
		}
	}

	public boolean removeLocation(Location location){
		return locations.remove(location);
	}

	@Override
	public String toString() {
		return super.toString();
	}
}
