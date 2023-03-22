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
		//Equipo eq1 ,eq2;
		int i=0,h=0;
		resultadoEnu rest = null;
	//	Pronostico prons = null;
		Ronda ronda;
		
		try {
			listaresul=new CsvToBeanBuilder(new FileReader(args[0]))
			.withType(archresultados.class)
			.build()
			.parse();
			listapronos=new CsvToBeanBuilder(new FileReader(args[1]))
			.withType(archpronostico.class)
			.build()
			.parse();
//			while(i<listaresul.size()) {
				for(archresultados lista:listaresul) {
					for(archpronostico lista2:listapronos) {
						if(lista.gete1().equals(lista2.gete1() )) {
					//String a=lista.gete1();
					 Equipo eq1=new Equipo(lista.gete1(),"----");
					//String b=lista.gete2();
					 Equipo eq2=new Equipo(lista.gete2(),"----");
					//int gol1=lista.getgole1();
					//int gol2=lista.getgole2();
					part[i]=new Partido(eq1,eq2,lista.getgole1(),lista.getgole2());
					//if(i==0) {
						//break;	
					//}
	//			}
//				ronda=new Ronda("1",part[i]);				
					//String proresul=lista2.getgana();
					switch(lista2.getgana()) { // g1=gana equipo 1, emp= empate, g2=gana equipo 2
						case "g1":{
							 rest=rest.GANADOR;
						}break;
						case "emp":{
							 rest=rest.EMPATE;
						}break;
						case "g2":{
							 rest=rest.PERDEDOR;
						}break;				
					}
					Pronostico prons=new Pronostico(part[i], eq1,rest);
					//if(i==0) {
						//break;
					//}
					h=h+prons.puntos();
						}						
					}
				i++;					
				}	
			System.out.println("puntaje= "+h);
		}catch(IOException e) {
			e.printStackTrace();
		}		
	}
}
