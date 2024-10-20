
public class FiltroNumero extends Filtro {
private int num;

public FiltroNumero(int n) {
	this.num = n;
}

@Override
public boolean cumple(FiguritaColeccionable f) {
	return f.getNumero() == num;
}

}
