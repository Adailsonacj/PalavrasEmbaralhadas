package mecanica;

import java.util.Random;

public class FabricaMecanicaDoJogo
{
    public static MecanicaDoJogo get() {
        int numeroSelecionado = 0;
        Random ran = new Random();

        for(int i = 0; i < 10; ++i) {
            numeroSelecionado = ran.nextInt(2);
        }

        return (MecanicaDoJogo)(numeroSelecionado != 0 ? new TresTentativas() : new MorteSubita());
    }
}
