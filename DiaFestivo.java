
public class DiaFestivo extends Evento{
	private String motivo;

	public DiaFestivo(int horas, int minutos, String motivo) {
		super("DiaFestivo", horas, minutos);
		this.setMotivo(motivo);
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	@Override
	public String toString() {
		return "DiaFestivo [Motivo=" + motivo + nombre + ", " + horas + ":" + minutos+ "]";
	}

	@Override
	public String getTipo() {
		// TODO Auto-generated method stub
		return "DiaFestivo";
	}

	
}
