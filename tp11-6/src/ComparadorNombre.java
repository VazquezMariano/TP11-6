import java.util.Comparator;

public class ComparadorNombre implements Comparator<ElementoColeccionable> {

	@Override
	public int compare(ElementoColeccionable o1, ElementoColeccionable o2) {
		// TODO Auto-generated method stub
		return o1.getNombre().compareTo(o2.getNombre());
	}

}
