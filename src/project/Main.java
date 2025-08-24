package project;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            Aluno aluno1 = new Aluno("João", 20, "2025001", "Engenharia", "joao@email.com", 8.5, "123456");

            ObjectOutputStream out1 = new ObjectOutputStream(new FileOutputStream("aluno.ser"));
            out1.writeObject(aluno1);
            out1.close();
            System.out.println("Primeira serialização: " + aluno1);

            ObjectInputStream in1 = new ObjectInputStream(new FileInputStream("aluno.ser"));
            Aluno aluno2 = (Aluno) in1.readObject();
            in1.close();
            System.out.println("Desserializado: " + aluno2);

            aluno2.setCurso("Ciência da Computação");

            ObjectOutputStream out2 = new ObjectOutputStream(new FileOutputStream("aluno.ser"));
            out2.writeObject(aluno2);
            out2.close();
            System.out.println("Segunda serialização (campo alterado): " + aluno2);

            ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("aluno.ser"));
            Aluno aluno3 = (Aluno) in2.readObject();
            in2.close();
            System.out.println("Desserializado novamente: " + aluno3);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
