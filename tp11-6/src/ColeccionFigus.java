import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ColeccionFigus extends ElementoColeccionable {
	private int descuento;
	private ArrayList<ElementoColeccionable> coleccion;

	public ColeccionFigus(String n, int des) {
		super(n);
		setDescuento(des);
		this.coleccion = new ArrayList<>();
	}
	
	public void agregar(ElementoColeccionable el) {
		this.coleccion.add(el);
	}

	@Override
	public ElementoColeccionable getCopia() {
		ColeccionFigus rta = new ColeccionFigus(this.getNombre(), this.getDescuento());
		for(ElementoColeccionable el : coleccion) {
			rta.agregar(el.getCopia());
		}
		return rta;
	}

	@Override
	public double getPrecio() {
		double precioTotal = 0.0;
		for(ElementoColeccionable e : this.coleccion) {
			precioTotal = precioTotal + e.getPrecio();
		}
		return precioTotal - (precioTotal * descuento / 100);
	}

	@Override
	public ArrayList<ElementoColeccionable> buscar(Filtro f, Comparator<ElementoColeccionable> c) {
		ArrayList<ElementoColeccionable> resultado = new ArrayList<>();
		for(ElementoColeccionable el : this.coleccion) {
			resultado.addAll(el.buscar(f, c));
		}
		Collections.sort(resultado, c);
		return resultado;
	}

	public int getDescuento() {
		return descuento;
	}

	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}

}
