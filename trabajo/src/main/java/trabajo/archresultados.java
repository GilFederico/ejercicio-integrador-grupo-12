package trabajo;
import com.opencsv.bean.CsvBindByPosition;
public class archresultados {
	@CsvBindByPosition ( position = 0)
	private String equipo1;
	@CsvBindByPosition ( position = 1)
	private int gole1;
	@CsvBindByPosition ( position = 2)
	private int gole2;
	@CsvBindByPosition ( position = 3)
	private String equipo2;
	
	public void equi1(String e1) {
		this.equipo1=e1;
	}
	public void gol1(int g1) {
		this.gole1=g1;
	}
	public void gol2(int g2) {
		this.gole2=g2;
	}
	public void equi2(String e2) {
		this.equipo2=e2;
	}
	
	public String gete1() {
		return equipo1;
	}
	public int getgole1() {
		return gole1;
	}
	public int getgole2() {
		return gole2;
	}
	public String gete2() {
		return equipo2;
	}

}
