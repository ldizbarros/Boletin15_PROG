package boletin15;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Boletin15 {

    public static void main(String[] args) {
        JFrame frame = new JFrame("InputDialog1");
        int notas = JOptionPane.showConfirmDialog(frame, 
                "Quieres calcular una nota?", 
                "HOLA!!",
                JOptionPane.YES_NO_OPTION);
        
        while(notas == JOptionPane.YES_OPTION){
            Notas n1 = new Notas();
            float nota1 = Float.parseFloat(JOptionPane.showInputDialog(frame, 
                "Introduce la nota del primer examen teorico", 
                JOptionPane.QUESTION_MESSAGE));
            float nota2 = Float.parseFloat(JOptionPane.showInputDialog(frame, 
                "Introduce la nota del segundo examen teorico", 
                JOptionPane.QUESTION_MESSAGE));
            n1.porcentaxeProbaEscrita(nota1, nota2);
            float nota3 = Float.parseFloat(JOptionPane.showInputDialog(frame, 
                "Introduce la nota del examen practico", 
                JOptionPane.QUESTION_MESSAGE));
            n1.porcentaxeProbaPractica(nota3);
            int nota4 = Integer.parseInt(JOptionPane.showInputDialog(frame, 
                "Introduce el umero de boletines entregados", 
                JOptionPane.QUESTION_MESSAGE));
            n1.porcentaxeBoletins(nota4);
            n1.notaFinal();
            n1.mostrarNotas();
            
            notas = JOptionPane.showConfirmDialog(frame, 
                "Quieres calcular una nota?", 
                "HOLA!!",
                JOptionPane.YES_NO_OPTION);
        }
    }
    
}
