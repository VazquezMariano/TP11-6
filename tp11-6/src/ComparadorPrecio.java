import java.util.Comparator;

public class ComparadorPrecio implements Comparator<ElementoColeccionable> {

	@Override
	public int compare(ElementoColeccionable o1, ElementoColeccionable o2) {
		return (int) (o1.getPrecio() - o2.getPrecio());
	}

}
