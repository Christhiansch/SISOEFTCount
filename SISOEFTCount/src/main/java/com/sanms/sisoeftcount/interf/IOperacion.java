package com.sanms.sisoeftcount.interf;

public interface IOperacion
{
	
	int evaluarCondicionOperacionCompletada();
	int evaluarCondicionOpeacionNoCompletadaNro1();
	int evaluarCondicionOpeacionNoCompletadaNro2();
	int evaluarCondicionOpeacionNoCompletadaNro3();
	int evaluarCondicionOpeacionNoCompletadaNro4();
	int evaluarCondicionOpeacionNoCompletadaNro5();
	int evaluarCondicionOpeacionNoCompletadaNro6();
	void calcularDiferenciaEtiquetas(int inptSRQ, int inptSRD, int inptSRR, int inptSRS);
	int calcularTotalOperacionesCompletadas(int inptDIF_SRQ_SRD, int inptDIF_SRS_SRR, int inptDIF_SRD_SRR);
	
}
