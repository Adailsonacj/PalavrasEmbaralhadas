package mecanica;

public class FabricaMecanicaDoJogo 
{
	public static MecanicaDoJogo get()
	{
		return new TresTentativas();
	}
}
