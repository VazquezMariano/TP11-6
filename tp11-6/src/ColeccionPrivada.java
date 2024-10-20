import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ColeccionPrivada extends ColeccionFigus {

	public ColeccionPrivada(String n, int des) {
		super(n, des);
	}
	
	public ArrayList<ElementoColeccionable> buscar(Filtro f, Comparator<ElementoColeccionable> c) {
		ArrayList<ElementoColeccionable> resultado = new ArrayList<>();
		return resultado;
	}

}
