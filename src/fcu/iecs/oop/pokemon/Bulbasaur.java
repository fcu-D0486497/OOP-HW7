package fcu.iecs.oop.pokemon;

public class Bulbasaur extends Pokemon 
{
	

	public Bulbasaur(String name, PokemonType type,int cP) 
	{
		super(name, type,cP);
	}

	@Override
	public void attack() 
	{
		System.out.println("Tackle¡K");
	}
}
