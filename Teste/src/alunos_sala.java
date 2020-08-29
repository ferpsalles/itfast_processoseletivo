import java.util.Scanner;


public class alunos_sala {
	public static void main (String [] args) {
		Scanner sc = new Scanner (System.in);
		
		int cont = 1;
	    double soma =0;
	   
        
	    System.out.println ("Digite o número total de alunos na disciplina: ");
        int alunos = sc.nextInt();
	    
	      do{
	    	  System.out.println ("Digite o valor da nota: ");
	    	  double nota = sc.nextDouble();
	    	  
	    	  soma +=nota;
	    	  cont ++;
	    	  
              } while( cont<=alunos); 
        
        System.out.println("Média das notas: " + soma/alunos);
        sc.close();
    }
}
