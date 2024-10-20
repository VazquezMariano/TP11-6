import java.util.ArrayList;
import java.util.Comparator;

public abstract class ElementoColeccionable {
private String nombre;

public ElementoColeccionable(String n) {
	setNombre(n);
}

public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}


public abstract ElementoColeccionable getCopia();

public abstract double getPrecio();

public abstract ArrayList<ElementoColeccionable> buscar(Filtro f, Comparator<ElementoColeccionable> c);

}
