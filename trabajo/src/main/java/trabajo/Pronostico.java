package trabajo;

public class Pronostico {
	private Partido partido;
	private Equipo equipo;
	private resultadoEnu resul;

	
	public Pronostico(Partido p, Equipo e, resultadoEnu r) {
		this.equipo=e;
		this.partido=p;
		this.resul=r;
	}
	
	public int puntos() {
		int x=0;
		resultadoEnu re=partido.resultado(equipo);
		if(resul.equals(re)) {
			x++;
		}
		return x;
	}
}
