package fcu.iecs.oop.pokemon;

public class Psyduck extends Pokemon 
{
	
	public Psyduck(String name, PokemonType type,int cP) 
	{
		super(name, type,cP);
	}

	
	@Override
	public void attack() 
	{
		System.out.println("Aqua Tail¡K");
	}
	
}
