package cinemaclientes;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;



public class Main {

public static void main(String[] args) {

int pc = 1;

int idade;

String nome;
String data;


ArrayList<Parimpar> listaCinema = new ArrayList<Parimpar>();
Scanner sc = new Scanner(System.in);
while (pc < 2) { System.out.println("============================================="
        + System.lineSeparator()
        +"Efetuar compra de ingresso Cinema Cinemark "
        + pc +":"
        + System.lineSeparator());

nome = (JOptionPane.showInputDialog("Digite a seu nome: "));
idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade: "));
data = (JOptionPane.showInputDialog("Digite o dia da semana: "));



if (idade < 14 || idade > 65 ) {
	JOptionPane.showInputDialog(null,"Seu ingresso é R$ 6,00","A compra do seu ingresso foi efetuada com sucesso!!!" );
	}else if(data .equals("Quarta") || data .equals("Quinta")) {
		JOptionPane.showInputDialog(null,"Seu ingresso é R$ 6,00","A compra do seu ingresso foi efetuada com sucesso!!!" );

	}else{
		JOptionPane.showInputDialog(null,"Seu ingresso é R$ 12,00","A compra do seu ingresso foi efetuada com sucesso!!!" );
		}
	}sc.close();

}
}


