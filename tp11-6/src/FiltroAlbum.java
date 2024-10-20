
public class FiltroAlbum extends Filtro {
private String al;

public FiltroAlbum(String s) {
	this.al = s;
}

@Override
public boolean cumple(FiguritaColeccionable f) {
	return f.getAlbum().equals(al);
}
}
