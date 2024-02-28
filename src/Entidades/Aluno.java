package Entidades;

public class Aluno {
    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;

    public double notaFinal(){
        double notaFInal = nota1 + nota2 + nota3;
        return notaFInal;
    }

    public String verificarNota(){
        if (notaFinal()>60){
            System.out.println("nota final " + notaFinal());

            return "Pass";
        }else {
            System.out.println("nota final " + notaFinal());
            double faltaPonto = 60 - notaFinal();
            System.out.println("Failed");
            return "missing " + String.valueOf(faltaPonto);
        }
    }
}
