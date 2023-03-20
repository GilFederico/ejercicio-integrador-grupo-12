package trabajo;
import com.opencsv.bean.CsvBindByPosition;
import com.opencsv.bean.CsvDate;
import java.util.List;

public class Equipo {
	@CsvBindByPosition(position = 0)
	private String nombre;
	private String descrip;
	
	public Equipo( String n,String d){		
		this.nombre=n;
		this.descrip=d;
	}

}
