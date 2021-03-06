package TPV;

public class Pagado implements  EstadoComanda{
    private static final Pagado instancia = new Pagado();
    private Pagado(){}
    public static Pagado getInstancia() {
        return instancia;
    }


    @Override
    //Una vez pagada la cuenta ya no se podrán registrar nuevos pedidos en la misma. En
    //caso de que los clientes quieran realizar m´as pedidos después de cobrar se creará una
    //nueva comanda.
    public void pagar(Comanda c) {
        var NuevaComanda = new Comanda();
        System.out.println("Se ha creado una NuevaComanda");
    }

    @Override
    public void cancelar(Comanda c) {
    }

    @Override
    public void marcharse(Comanda c) {
    }

    @Override
    public void anadirComanda(Comanda c, ProductoMultiple p, int cantidad) {
    }

    @Override
    public void anadirComanda(Comanda c, ProductoIndividual p, int cantidad) {
    }
    @Override
    public void solicitarCuenta(Comanda c) {
    }
}
