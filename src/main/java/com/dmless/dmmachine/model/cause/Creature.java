package com.dmless.dmmachine.model.cause;

import java.util.List;

/**
 * Created by Charles on 8/26/2016.
 */
public class Creature extends Target{

	private List<Creature> creatures;
	private List<Item> inventory;
	private List<Target> equipedInventory;

	public Creature(int id,
						 String name,
						 String description,
						 boolean known,
						 int size,
						 List<Creature> creatures,
						 List<Item> inventory,
						 List<Target> equipedInventory) {
		super(id, name, description, known, size);
		this.creatures = creatures;
		this.inventory = inventory;
		this.equipedInventory = equipedInventory;
	}

	public Creature(String name,
						 String description){
		super(name, description);
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

	public List<Target> getEquipedInventory() {
		return equipedInventory;
	}

	public void setEquipedInventory(List<Target> equipedInventory) {
		this.equipedInventory = equipedInventory;
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

	public void equipTarget(Target target) throws Exception{
		if(target.getSize() > this.getSize()) {
			equipedInventory.add(target);
		}else {
			throw new Exception();
		}
	}

	public boolean unequip(Target target){
		return equipedInventory.remove(target);
	}

	@Override
	public String toString() {
		return super.toString();
	}
}
