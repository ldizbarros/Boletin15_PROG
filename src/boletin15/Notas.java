package boletin15;

import java.text.DecimalFormat;

public class Notas {
    private float probaEscrita;
    private float probaPractica;
    private int boletins;
    private float nota;
   
    
    public void porcentaxeProbaEscrita(float nota1, float nota2){
        float media = (nota1+nota2)/2;
        probaEscrita=(media*4)/10;
    }
    
    public void porcentaxeProbaPractica(float nota){
        probaPractica=(nota*4)/10;
    }
    
    public void porcentaxeBoletins(int boletinsFeitos){
        int porcentaxe=(boletinsFeitos*100)/17;
        
        if (porcentaxe>90){
            boletins=2;
        }
        else if (porcentaxe<=90 && porcentaxe>=70){
            boletins=1;
        }
        else{
            boletins=0;
        }
    }
    public void notaFinal(){
        nota=probaEscrita+probaPractica+boletins;
    }
    
    public void mostrarNotas(){
        DecimalFormat df = new DecimalFormat("0.00"); 
        System.out.println("PROBAS TEÓRICAS…………… "+df.format(probaEscrita)+" \n"+
                           "PROBAS PRÁCTICA…………… "+df.format(probaPractica)+" \n"+
                           "BOLETÍNS  ………………………. "+boletins+" \n"+ 
                           "NOTA TOTAL…………………… "+df.format(nota)+" \n");
    }
    
}
