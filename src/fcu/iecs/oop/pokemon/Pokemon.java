package fcu.iecs.oop.pokemon;

public abstract class Pokemon 
{
	private int CP;
	private String name;
	private PokemonType type;
	public abstract void attack();
	public Pokemon(String name, PokemonType type,int cP) 
	{
		CP = cP;
		this.name = name;
		this.type = type;
	}
	public int getCP() {
		return CP;
	}
	public void setCP(int cP) {
		CP = cP;
	}
	public String getName() {
		return name;
	}
	
	public PokemonType getType() {
		return type;
	}
	
	
}
