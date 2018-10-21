import facade.CheckFacade;

/*
* FACHADA
* Ocultar o simplificar la complejidad
* de la aplicación para el cliente*
* */
public class App {

    public static void main (String[] args)
    {
        CheckFacade cliente1 = new CheckFacade();
        cliente1.buscar("02/07/2018", "08/07/2018", "Lima", "Cancún");

        CheckFacade cliente2 = new CheckFacade();
        cliente2.buscar("02/07/2018", "08/07/2018", "Lima", "Quito");
    }
}
