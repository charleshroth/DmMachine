package com.dmless.dmmachine.model.cause;

import com.dmless.dmmachine.model.effect.Event;
import com.dmless.dmmachine.model.effect.Quest;

import java.util.List;

/**
 * Created by Charles on 8/26/2016.
 */
public class Item extends Target{
	private List<Creature> creatures;
	private List<Item> inventory;

	/**
	 * @param name
	 * @param description
	 */
	public Item(String name,
					String description,
					List<Creature> creatures,
					List<Item> inventory) {
		super(name, description);
		this.creatures = creatures;
		this.inventory = inventory;
	}

	/**
	 * @param id
	 * @param name
	 * @param description
	 * @param known
	 * @param size
	 */
	public Item(int id,
					String name,
					String description,
					boolean known,
					int size,
					List<Creature> creatures,
					List<Item> inventory) {
		super(id, name, description, known, size);
		this.creatures = creatures;
		this.inventory = inventory;
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
	public Item(int id,
					String name,
					String description,
					boolean known,
					int size,
					List<Event> eventList,
					List<Quest> myQuests,
					String flavor,
					Target parent,
					String type,
					List<Creature> creatures,
					List<Item> inventory) {
		super(id, name, description, known, size, eventList, myQuests, flavor, parent, type);
		this.creatures = creatures;
		this.inventory = inventory;
	}

	public List<Creature> getCreatures() {
		return creatures;
	}

	public void setCreatures(List<Creature> creatures) {
		this.creatures = creatures;
	}

	public List<Item> getInventory() {
		return inventory;
	}

	public void setInventory(List<Item> inventory) {
		this.inventory = inventory;
	}

	public void addInventory(Item item) throws Exception{
		if(item.getSize() > this.getSize()) {
			inventory.add(item);
		}else {
			throw new Exception();
		}
	}

	public boolean removeInventory(Item item){
		return inventory.remove(item);
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

	@Override
	public String toString() {
		return super.toString();
	}
}
