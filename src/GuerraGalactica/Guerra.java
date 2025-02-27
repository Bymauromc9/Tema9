package GuerraGalactica;

public class Guerra {
    private Nave naveTerricola;
    private Nave naveCyborg;
    
    public Guerra(){
        naveTerricola=new Nave("Terricola");
        naveCyborg=new Nave("Cyborg");
    }

    public void empiezaCombate(){
        int turno=1;
        while (naveTerricola.cuantosQuedan() > 0 && naveCyborg.cuantosQuedan() > 0) {
            naveTerricola.generaDisparo(7,turno%10);
            naveCyborg.recibeDisparo(turno%10);

            naveCyborg.generaDisparo(7,turno%10);
            naveTerricola.recibeDisparo(turno%10);
            turno++;
        }
        if (naveTerricola.cuantosQuedan()>0) 
        {
            System.out.println("La nave estelar ha ganado la guerra");    
        }else
            System.out.println("El cubo borg ha ganado la guerra");
    }
}
