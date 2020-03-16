package model;

/**
 * This is the state of the machine.
 * @author johan
 * @version 1.0
 */

public class State {

	private String name;
	private boolean inBlock;

	public State(String name) {
		this.name = name;
	}

	/**
	 * This method returns the state's name.
	 * @return the state's name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Modifies the name of the state
	 * @param name: String - The new name of the string
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Returns a concatenation between the state's name and an input symbol. This could be the key for a HashMap get
	 * operation.
	 * @param s - an input symbol.
	 * @return the concatenation between the state's name and s.
	 */
	public String getKey(char s) {
		return name + s;
	}
	
	public void setInBlock(boolean b) {
		inBlock = b;
	}
	
	public boolean isInBlock() {
		return inBlock;
	}
	
	/**
	 * This is an overwrite of the equals method in Object class. Compares the names between two states.
	 * @return  true if the two states has the same name.
	 * 			false if they are not the same.
	 */
//	@Override
//	public boolean equals(Object o) {
//		String n = String.valueOf(o);
//		if(name.equals(n)) {
//			return true;
//		}
//		else {
//			return false;
//		}
//	}
}
