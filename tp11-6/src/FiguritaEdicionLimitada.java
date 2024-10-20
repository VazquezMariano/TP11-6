
public class FiguritaEdicionLimitada extends FiguritaColeccionable {
	private int unidadesDisponibles;
	private Calculador calculador;

	public FiguritaEdicionLimitada(String n, double p, String al, int num, int u) {
		super(n, p, al, num);
		setUnidadesDisponibles(u);
	}

	public int getUnidadesDisponibles() {
		return unidadesDisponibles;
	}

	public void setUnidadesDisponibles(int unidadesDisponibles) {
		this.unidadesDisponibles = unidadesDisponibles;
	}
	
	public double getPrecio() {
		double precionuevo = this.calculador.calcular(super.getPrecio(), getUnidadesDisponibles());
		if(precionuevo >= super.getPrecio()) {
			return precionuevo;
		} else {
			return super.getPrecio();
		}
	}

}
