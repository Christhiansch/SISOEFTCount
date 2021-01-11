package com.sanms.sisoeftcount;

import java.util.Scanner;

public class SISOEFTCountPrincipal
{

	private static String caso;

  private static int COMPLETADOS;
  private static int NOCOMPLETADOS;
  private static int NOENVIA_AUTORIZADOR;
  private static int NORESPONDE_ALCLIENTE;
  private static int NORESPONDE_AUTORIZADOR;
  
  
  public static void main(String[] args)
  {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("INGRESE LOS VALORES");
    
    System.out.print("TOTAL DE SRQ: ");
    int inptSRQ = sc.nextInt();
    
    System.out.print("TOTAL DE SRD: ");
    int inptSRD = sc.nextInt();
    
    System.out.print("TOTAL DE SRR: ");
    int inptSRR = sc.nextInt();
    
    System.out.print("TOTAL DE SRS: ");
    int inptSRS = sc.nextInt();
    
    
    System.out.println("");
    System.out.println("**********************************************************");
    System.out.println("");
    
    int SRQ = inptSRQ;
    int SRD = inptSRD;
    int SRR = inptSRR;
    int SRS = inptSRS;
        
    int DIF_SRQ_SRD = SRQ - SRD; //200 - 200 = 0
    int DIF_SRQ_SRS = SRQ - SRS; //200 - 190 = 10   
    int DIF_SRD_SRR = SRD - SRR; //200 - 0 = 200
    int DIF_SRR_SRS = SRR - SRS; //0 - 190 = -190
    int DIF_SRS_SRR = SRS - SRR; //190 - 0 = 190
    
    //CASO A
    if(DIF_SRQ_SRD==0 & DIF_SRS_SRR==0 & SRQ==SRS)
    {
      caso = "A";
      COMPLETADOS = SRS;
      NOCOMPLETADOS = total_operaciones_nocompletadas(DIF_SRQ_SRD, DIF_SRS_SRR, DIF_SRD_SRR);
      imprimirResultadoContabilizacion(caso, COMPLETADOS, NOCOMPLETADOS);
    }
    
    //CASO B
    if(DIF_SRQ_SRD==0 & DIF_SRQ_SRS>0 & DIF_SRR_SRS>0)
    {
      caso = "B";
      NOCOMPLETADOS = total_operaciones_nocompletadas(DIF_SRQ_SRD, DIF_SRR_SRS, DIF_SRD_SRR);
      COMPLETADOS = SRQ - NOCOMPLETADOS;
      imprimirResultadoContabilizacion(caso, COMPLETADOS, NOCOMPLETADOS);
    }
    
    //CASO C
    if(DIF_SRQ_SRD==0 & DIF_SRD_SRR>0 & DIF_SRS_SRR==0)
    {      
      caso = "C";      
      NOCOMPLETADOS = total_operaciones_nocompletadas(DIF_SRQ_SRD, DIF_SRS_SRR, DIF_SRD_SRR);
      COMPLETADOS = SRQ - NOCOMPLETADOS;
      imprimirResultadoContabilizacion(caso, COMPLETADOS, NOCOMPLETADOS);
    }
    
    //CASO D
    if(DIF_SRQ_SRD==0 & DIF_SRD_SRR>0 & DIF_SRR_SRS<0)
    {      
      caso = "D";      
      NOCOMPLETADOS = total_operaciones_nocompletadas(DIF_SRQ_SRD, DIF_SRR_SRS, DIF_SRD_SRR);
      COMPLETADOS= SRQ - NOCOMPLETADOS;
      imprimirResultadoContabilizacion(caso, COMPLETADOS, NOCOMPLETADOS);
    }
    
    //CASO E
    if(DIF_SRQ_SRD>0 & DIF_SRD_SRR==0 & DIF_SRS_SRR==0)
    {
      caso = "E";      
      NOCOMPLETADOS = total_operaciones_nocompletadas(DIF_SRQ_SRD, DIF_SRS_SRR, DIF_SRD_SRR);
      COMPLETADOS = SRQ - NOCOMPLETADOS;
      imprimirResultadoContabilizacion(caso, COMPLETADOS, NOCOMPLETADOS);
    }
    
    //CASO F
    if(DIF_SRQ_SRD>0 & DIF_SRD_SRR>0 & DIF_SRR_SRS>0)
    {      
      caso = "F";
      COMPLETADOS = SRS;
      NOCOMPLETADOS = total_operaciones_nocompletadas(DIF_SRQ_SRD, DIF_SRR_SRS, DIF_SRD_SRR);
      imprimirResultadoContabilizacion(caso, COMPLETADOS, NOCOMPLETADOS);
    }
    
    //CASO G
    if(DIF_SRQ_SRD>0 & DIF_SRD_SRR>0 & DIF_SRS_SRR>0)
    {      
      caso = "G";
      COMPLETADOS = SRS;
      NOCOMPLETADOS = total_operaciones_nocompletadas(DIF_SRQ_SRD, DIF_SRS_SRR, DIF_SRD_SRR);
      imprimirResultadoContabilizacion(caso, COMPLETADOS, NOCOMPLETADOS);
    }
    
  }
  
  public static int total_operaciones_nocompletadas(int noEnviaAutorizador, int noRespondeCliente, int noRespondeAutorizador)
  {
    NOENVIA_AUTORIZADOR = noEnviaAutorizador;
    NORESPONDE_ALCLIENTE = noRespondeCliente;
    NORESPONDE_AUTORIZADOR = noRespondeAutorizador;
       
    return NOENVIA_AUTORIZADOR + NORESPONDE_ALCLIENTE + NORESPONDE_AUTORIZADOR;
  }
  
  public static void imprimirResultadoContabilizacion(String tipocaso, int completados, int nocompletados)
  {
    System.out.println("Ingresa al caso: " + tipocaso);
    System.out.println("El total de operaciones completadas son: " + COMPLETADOS);
    System.out.println("El total de operaciones no completadas son: " + NOCOMPLETADOS);
    System.out.println("Siendo: " + NOENVIA_AUTORIZADOR + " operaciones que no fueron enviadas al autorizador");
    System.out.println("Siendo: " + NORESPONDE_ALCLIENTE + " operaciones que no se responden al cliente");
    System.out.println("Siendo: " + NORESPONDE_AUTORIZADOR + " operaciones que no fueron respondidas por el autorizador");
  }

}
