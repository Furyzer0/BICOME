
public class Organism 
{
	private int cooldown;
	private boolean pregnant;
	private int age;
	
	public Organism()
	{
		cooldown = 0;
		age = 1;
		pregnant = false;
	}
	
	public void increaseCooldown()
	{
		if ( cooldown % 3 == 0 && cooldown != 0)
		{
			cooldown = 0;
			setReproductionCooldown( false );
		}
		else
			cooldown++;
	}
	
	public void age()
	{
		age++;
	}
	
	public void setReproductionCooldown( Boolean state )
	{
		pregnant = state;
	}
	
	public Boolean canReproduce()
	{
		if ( !pregnant )
			return true;
		
		return false;
		
	}
	
	public Organism reproduce(Organism o)
	{
		Organism offspring;
		
		this.setReproductionCooldown( true );
		o.setReproductionCooldown( true );
		
		
		
		
		return offspring;
		
	}
}
