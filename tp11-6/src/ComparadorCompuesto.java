import java.util.Comparator;

public class ComparadorCompuesto implements Comparator<ElementoColeccionable> {
	private Comparator<ElementoColeccionable> com1;
	private Comparator<ElementoColeccionable> com2;
	
	public ComparadorCompuesto(Comparator<ElementoColeccionable> c1, Comparator<ElementoColeccionable> c2) {
		this.com1 = c1;
		this.com2 = c2;
	}

	@Override
	public int compare(ElementoColeccionable o1, ElementoColeccionable o2) {
		int rta = com1.compare(o1, o2);
		if(rta == 0) {
			return com2.compare(o1, o2);
		}
		return rta;
	}

}
