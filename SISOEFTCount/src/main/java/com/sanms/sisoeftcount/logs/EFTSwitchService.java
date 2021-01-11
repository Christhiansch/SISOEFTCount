package com.sanms.sisoeftcount.logs;

import com.sanms.sisoeftcount.interf.IOperacion;

public class EFTSwitchService extends Operacion implements IOperacion
{

	private int NOENVIA_AUTORIZADOR;
	private int NORESPONDE_ALCLIENTE;
	private int NORESPONDE_AUTORIZADOR;

	public EFTSwitchService()
	{
		super();
	}

	public int getNOENVIA_AUTORIZADOR()
	{
		return NOENVIA_AUTORIZADOR;
	}

	public void setNOENVIA_AUTORIZADOR(int nOENVIA_AUTORIZADOR)
	{
		NOENVIA_AUTORIZADOR = nOENVIA_AUTORIZADOR;
	}

	public int getNORESPONDE_ALCLIENTE()
	{
		return NORESPONDE_ALCLIENTE;
	}

	public void setNORESPONDE_ALCLIENTE(int nORESPONDE_ALCLIENTE)
	{
		NORESPONDE_ALCLIENTE = nORESPONDE_ALCLIENTE;
	}

	public int getNORESPONDE_AUTORIZADOR()
	{
		return NORESPONDE_AUTORIZADOR;
	}

	public void setNORESPONDE_AUTORIZADOR(int nORESPONDE_AUTORIZADOR)
	{
		NORESPONDE_AUTORIZADOR = nORESPONDE_AUTORIZADOR;
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
		if (getDIF_SRQ_SRD() == 0 & getDIF_SRR_SRS() == 0 & getDIF_SRQ_SRS() == 0)
		{
			setCOMPLETADAS(getSRS());
			setNOCOMPLETADAS(getNOCOMPLETADAS());
		}
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

		return 0;
	}

}
