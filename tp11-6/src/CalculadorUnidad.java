
public class CalculadorUnidad extends Calculador {

	@Override
	public double calcular(double precio, int unidades) {
		return precio * unidades;
	}

}
