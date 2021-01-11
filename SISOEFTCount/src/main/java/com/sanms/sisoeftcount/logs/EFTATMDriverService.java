package com.sanms.sisoeftcount.logs;

import com.sanms.sisoeftcount.interf.IOperacion;

public class EFTATMDriverService extends Operacion implements IOperacion	
{
	
	public EFTATMDriverService()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public void calcularDiferenciaEtiquetas(int inptSRQ, int inptSRD, int inptSRR, int inptSRS)
	{
		this.setDIF_SRQ_SRD(getSRQ() - getSRD());
		this.setDIF_SRD_SRR(getSRD() - getSRR());
		this.setDIF_SRR_SRS(getSRR() - getSRS());
		this.setDIF_SRQ_SRS(getSRQ() - getSRS());
		
	}

	public int evaluarCondicionOperacionCompletada()
	{
		// TODO Auto-generated method stub
		return 0;
	}

	public int evaluarCondicionOpeacionNoCompletadaNro1()
	{
		// TODO Auto-generated method stub
		return 0;
	}

	public int evaluarCondicionOpeacionNoCompletadaNro2()
	{
		// TODO Auto-generated method stub
		return 0;
	}

	public int evaluarCondicionOpeacionNoCompletadaNro3()
	{
		// TODO Auto-generated method stub
		return 0;
	}

	public int evaluarCondicionOpeacionNoCompletadaNro4()
	{
		// TODO Auto-generated method stub
		return 0;
	}

	public int evaluarCondicionOpeacionNoCompletadaNro5()
	{
		// TODO Auto-generated method stub
		return 0;
	}

	public int evaluarCondicionOpeacionNoCompletadaNro6()
	{
		// TODO Auto-generated method stub
		return 0;
	}

	public int calcularTotalOperacionesCompletadas(int inptDIF_SRQ_SRD, int inptDIF_SRS_SRR, int inptDIF_SRD_SRR)
	{
		// TODO Auto-generated method stub
		return 0;
	}

}
