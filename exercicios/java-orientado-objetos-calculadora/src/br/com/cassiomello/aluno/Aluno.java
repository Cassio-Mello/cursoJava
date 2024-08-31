package br.com.cassiomello.aluno;

public class Aluno {
    private String nomeAluno;
    private int matricula;
    private double nota1;
    private double nota2;
    private double nota3;

    //contrutor
    public Aluno(String nomeAluno, int matricula, double nota1, double nota2, double nota3) {
        this.nomeAluno = nomeAluno;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public double calcularMeida() {
        return (nota1 + nota2 + nota3) / 3;
    }

    public void aprovado(double media) {
        media = calcularMeida();
        if (media >= 7) {
            System.out.println("O aluno " + nomeAluno + " foi APROVADO com média " + media);
        }else {
            System.out.println("O aluno " + nomeAluno + " foi RPROVADO com média " + media);
        }
    }

    public void listarAluno(){
        System.out.println("Nome do aluno: " + nomeAluno);
        System.out.println("Numero da matricula: " + matricula);

    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }
    

    

}
