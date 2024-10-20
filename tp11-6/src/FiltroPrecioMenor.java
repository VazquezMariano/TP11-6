
public class FiltroPrecioMenor extends Filtro {
private double pr;

public FiltroPrecioMenor(double p) {
	this.pr = p;
}

@Override
public boolean cumple(FiguritaColeccionable f) {
	return f.getPrecio() < pr;
}


}
