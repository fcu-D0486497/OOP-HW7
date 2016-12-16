package fcu.iecs.oop.pokemon;

public class Charmander extends Pokemon 
{


	public Charmander(String name, PokemonType type,int cP) 
	{
		super(name, type,cP);
	}

	@Override
	public void attack() 
	{
		System.out.println("Ember¡K");
	}
}
