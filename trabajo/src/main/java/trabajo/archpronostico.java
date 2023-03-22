package trabajo;

import com.opencsv.bean.CsvBindByPosition;

public class archpronostico {
	@CsvBindByPosition ( position = 0)
	private String equipo1;
	@CsvBindByPosition ( position = 1)
	private String gana;
	@CsvBindByPosition (position =2)
	private String equipo2;
	
	public void equi1(String e1) {
		this.equipo1=e1;
	}
	public void gana1(String g1) {
		this.gana=g1;
	}

	public void equipo2(String e2) {
		this.equipo2=e2;
	}
	
	public String getgana() {
		return gana;
	}
	public String gete1() {
		return equipo1;
	}

	public String gete2() {
		return equipo2;
	}

}
