package com.sanms.sisoeftcount.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Logger;

import com.sanms.sisoeftcount.logs.EFTATMDriverService;
import com.sanms.sisoeftcount.utils.ConstantLog;

public class SISOEFTCountMain
{
	
	private final static Logger LOGGER = Logger.getLogger(SISOEFTCountMain.class.getName());

	public static void main(String args[])
	{

		EFTATMDriverService eftatm = new EFTATMDriverService();
		
		Path path = Paths.get("E:\\Trabajo christhian\\Pruebas de Esfuerzo\\20201224\\Prueba.txt");
		
		try
		{
			
			String line;
			
			int totalSRQ = 0;
			int totalSRD = 0;
			int totalARS = 0;
			int totalSRS = 0;
			
			BufferedReader reader = Files.newBufferedReader(path);
			
			while((line = reader.readLine()) != null)
			{
				if(line.contains(ConstantLog.TAG_SRQ))
					totalSRQ++;
				
				if(line.contains(ConstantLog.TAG_SRD))
					totalSRD++;
				
				if(line.contains(ConstantLog.TAG_ARS))
					totalARS++;
				
				if(line.contains(ConstantLog.TAG_SRS))
					totalSRS++;
			}
			
			eftatm.setSRQ(totalSRQ);
			eftatm.setSRD(totalSRD);
			eftatm.setSRR(totalARS);
			eftatm.setSRS(totalSRS);
			
			System.out.println("TOTAL SRQ: " + eftatm.getSRQ());
			System.out.println("TOTAL SRD: " + eftatm.getSRD());
			System.out.println("TOTAL ARS: " + eftatm.getSRR());
			System.out.println("TOTAL SRS: " + eftatm.getSRS());
			
			eftatm.calcularDiferenciaEtiquetas();
			
			System.out.println("SRQ - SRD: " + eftatm.getDIF_SRQ_SRD());
			System.out.println("SRQ - SRS: " + eftatm.getDIF_SRQ_SRS());
			
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
