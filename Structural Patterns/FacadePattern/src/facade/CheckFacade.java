package facade;

import api.AvionAPI;
import api.HotelAPI;

public class CheckFacade {

    private AvionAPI avion;
    private HotelAPI hotel;

    public CheckFacade() {
        avion = new AvionAPI();
        hotel = new HotelAPI();
    }

    public void buscar (String fechaIda, String fechaVuelta, String origen, String destino)
    {
        avion.buscarVuelos(fechaIda, fechaVuelta, origen, destino);
        hotel.buscarHoteles(fechaIda, fechaVuelta, origen, destino);
    }
}
