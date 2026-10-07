import java.util.ArrayList;
import java.util.HashMap;

public class Calendario {
	private static HashMap<String, HashMap<Integer, ArrayList<Evento>>> meses = new HashMap<>();

	public void llenarMeses()
	{
		Calendario.meses.put("Enero", new HashMap<>());
		Calendario.meses.put("Febrero", new HashMap<>());
		Calendario.meses.put("Marzo", new HashMap<>());
		Calendario.meses.put("Abril", new HashMap<>());
		Calendario.meses.put("Mayo", new HashMap<>());
		Calendario.meses.put("Junio", new HashMap<>());
		Calendario.meses.put("Julio", new HashMap<>());
		Calendario.meses.put("Agosto", new HashMap<>());
		Calendario.meses.put("Septiembre", new HashMap<>());
		Calendario.meses.put("Octubre", new HashMap<>());
		Calendario.meses.put("Noviembre", new HashMap<>());
		Calendario.meses.put("Diciembre", new HashMap<>());

		//Poner los dias
		for(int i = 1; i <= 30; i++){
			Calendario.meses.get("Enero").put(i, new ArrayList<>());
			Calendario.meses.get("Febrero").put(i, new ArrayList<>());
			Calendario.meses.get("Marzo").put(i, new ArrayList<>());
			Calendario.meses.get("Abril").put(i, new ArrayList<>());
			Calendario.meses.get("Mayo").put(i, new ArrayList<>());
			Calendario.meses.get("Junio").put(i, new ArrayList<>());
			Calendario.meses.get("Julio").put(i, new ArrayList<>());
			Calendario.meses.get("Agosto").put(i, new ArrayList<>());
			Calendario.meses.get("Septiembre").put(i, new ArrayList<>());
			Calendario.meses.get("Octubre").put(i, new ArrayList<>());
			Calendario.meses.get("Noviembre").put(i, new ArrayList<>());
			Calendario.meses.get("Diciembre").put(i, new ArrayList<>());
		}
	}

	public void agregarEvento(Evento evento, String mes, int dia)
	{
		Calendario.meses.get(mes).get(dia).add(evento);
	}

	public void verEventos(String tipo, int opcion, String mes) {
		String[] mesesOrdenados = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
				"Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

		if(opcion == 1){ // Todos los meses
			for(String m : mesesOrdenados){
				System.out.println("Mes: " + m);
				for(Integer dia : meses.get(m).keySet()) {
					for(Evento evento : meses.get(m).get(dia)) {
						if(evento.getTipo().equalsIgnoreCase(tipo) || tipo.equalsIgnoreCase("todos")) {
							System.out.println("Día " + dia + ": " + evento);
						}
					}
				}
			}
		} else if(opcion == 2) { // Solo un mes específico
			if(meses.containsKey(mes)) {
				System.out.println("Eventos en " + mes + ":");
				for(Integer dia : meses.get(mes).keySet()) {
					for(Evento evento : meses.get(mes).get(dia)) {
						if(evento.getTipo().equalsIgnoreCase(tipo) || tipo.equalsIgnoreCase("todos")) {
							System.out.println("Día " + dia + ": " + evento);
						}
					}
				}
			} else {
				System.out.println("Mes no válido");
			}
		}
	}

	public void cancelarEvento(String mes, int dia) {
		if (meses.containsKey(mes) && meses.get(mes).containsKey(dia)) {
			meses.get(mes).get(dia).clear(); // Elimina todos los eventos de ese día
			System.out.println("Eventos cancelados del día " + dia + " de " + mes);
		} else {
			System.out.println("Mes o día inválido.");
		}
	}

	public void verDiasConEventos() {
		for (String mes : meses.keySet()) {
			for (Integer dia : meses.get(mes).keySet()) {
				if (!meses.get(mes).get(dia).isEmpty()) {
					System.out.println("Hay eventos el día " + dia + " de " + mes);
				}
			}
		}
	}


}
