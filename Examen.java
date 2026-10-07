
public class Examen extends Evento{
	private String materia;

	public Examen(String materia, int horas, int minutos) {
		super("Examen", horas, minutos);
		this.materia = materia;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	@Override
	public String toString() {
		return "Examen [Materia=" + materia + ", " + horas + ":" + minutos + "]";
	}

	@Override
	public String getTipo() {
		// TODO Auto-generated method stub
		return "Examen";
	}
	
}
