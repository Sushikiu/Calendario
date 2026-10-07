public abstract class Evento {
	protected String nombre;
	protected int horas, minutos;
	
	public Evento(String nombre, int horas, int minutos) {
		this.nombre = nombre;
		this.horas = horas;
		this.minutos = minutos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	public abstract String getTipo();

	@Override
	public String toString() {
		return nombre + " (" + horas + ":" + (minutos < 10 ? "0" + minutos : minutos) + ")";
	}
}
