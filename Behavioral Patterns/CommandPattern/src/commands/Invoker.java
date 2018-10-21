package commands;

import java.util.ArrayList;
import java.util.List;

public class Invoker {

    private List<IOperacion> operacionList = new ArrayList<>();

    public void recibirOperacion (IOperacion operacion)
    {
        this.operacionList.add(operacion);
    }

    public void realizarOperaciones ()
    {
        this.operacionList.forEach(x -> x.execute());
        this.operacionList.clear();
    }
}
