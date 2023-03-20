package trabajo;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.List;

import com.opencsv.bean.CsvToBeanBuilder;
public class main {

	public static void main(String[] args)  {
		List<archresultados> listaresul;
		List<archpronostico> listapronos;
		Partido[] part=new Partido[2];
		Equipo eq1 = null,eq2=null;
		Pronostico prons= null;
		Ronda ronda;
		resultadoEnu rest = null;
		int i=0,h=0;
		try {
			listaresul=new CsvToBeanBuilder(new FileReader(args[0]))
			.withType(archresultados.class)
			.build()
			.parse();
			listapronos=new CsvToBeanBuilder(new FileReader(args[1]))
			.withType(archpronostico.class)
			.build()
			.parse();
			while(i<listaresul.size()) {
				for(archresultados lista:listaresul) {
					String a=lista.gete1();
					eq1=new Equipo(a,"hola");
					String b=lista.gete2();
					eq2=new Equipo(b,"hola");
					int gol1=lista.getgole1();
					int gol2=lista.getgole2();
					part[i]=new Partido(eq1,eq2,gol1,gol2);
					if(i==0) {
						break;	
					}
				}
			//	ronda=new Ronda("1",part[0]);//corregir
				for(archpronostico lista2:listapronos) {
					String proresul=lista2.gete1();
					switch(proresul) {
						case "g1":{
							 prons=new Pronostico(part[i], eq1,rest.GANADOR);
						}break;
						case "emp":{
							 prons=new Pronostico(part[i], eq1,rest.EMPATE);
						}break;
						case "g2":{
							 prons=new Pronostico(part[i], eq1,rest.PERDEDOR);
						}break;				
					}
					if(i==0) {
						break;
					}
				
				}
				i++;
				h=h+prons.puntos();
			}
			System.out.println(h);
		}catch(IOException e) {
			e.printStackTrace();
		}		
	}
}
