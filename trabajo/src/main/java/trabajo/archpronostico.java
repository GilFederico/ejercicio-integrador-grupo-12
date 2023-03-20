package trabajo;

import com.opencsv.bean.CsvBindByPosition;

public class archpronostico {
	@CsvBindByPosition ( position = 0)
	private String equipo1;
	@CsvBindByPosition ( position = 1)
	private String gana1;
//	@CsvBindByPosition ( position = 2)
	//private char empate;
	//@CsvBindByPosition ( position = 3)
	//private char gana2;
	@CsvBindByPosition (position =2)
	private String equipo2;
	
	public void equi1(String e1) {
		this.equipo1=e1;
	}
	public void gana1(String g1) {
		this.gana1=g1;
	}
/*	public void empate(char e) {
		this.empate=e;
	}
	public void equi2(char g2) {
		this.gana2=g2;
	}*/
	public void equipo2(String e2) {
		this.equipo2=e2;
	}
	
	public String gete1() {
		return gana1;
	}
	/*return gana1;
	}
	public char geatempata
	public int getgana2() {
		return gana2;
	}
	public String gete2() {
		return equipo2;
	}*/
}
