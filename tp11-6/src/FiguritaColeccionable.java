import java.util.ArrayList;
import java.util.Comparator;

public class FiguritaColeccionable extends ElementoColeccionable {
private String album;
private int numero;
private double precio;

	public FiguritaColeccionable(String n, double p, String al, int num) {
		super(n);
		setPrecio(p);
		setAlbum(al);
		setNumero(num);
	}

	@Override
	public ElementoColeccionable getCopia() {
		return new FiguritaColeccionable(this.getNombre(), this.getPrecio(), this.getAlbum(), this.getNumero());
		
	}

	@Override
	public double getPrecio() {
		return this.precio;
	}
	public void setPrecio(double p) {
		this.precio = p;
	}

	@Override
	public ArrayList<ElementoColeccionable> buscar(Filtro f, Comparator<ElementoColeccionable> c) {
		ArrayList<ElementoColeccionable> resultado = new ArrayList<>();
		if(f.cumple(this)) {
			resultado.add(this.getCopia());
		}
		return resultado;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

}
