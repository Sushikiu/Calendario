
public class Reunion extends Evento{
	private String participantes;

	public Reunion(String participantes, int horas, int minutos) {
		super("Reunion", horas, minutos);
		this.setParticipantes(participantes);
	}

	public String getParticipantes() {
		return participantes;
	}

	public void setParticipantes(String participantes) {
		this.participantes = participantes;
	}

	@Override
	public String toString() {
		return "Reunion [Para: " + participantes + ", " + nombre + ", " + horas +":"+ minutos+"]";
	}

	@Override
	public String getTipo() {
		// TODO Auto-generated method stub
		return "Reunion";
	}
	
}
