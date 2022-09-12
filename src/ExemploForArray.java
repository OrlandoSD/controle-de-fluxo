public class ExemploForArray {
    public static void main(String[] args) {
        String alunos[] = {"Felipe", "Jonas", "Julia", "Marcos"};

        //for(int x=0; x <alunos.length; x++){
          //  System.out.println("O aluno no indice x = " + x + " é " + alunos [x] );

          //forma simplificada
          for(String aluno : alunos){
            System.out.println("O Nome do aluno é :  " + aluno );
        }
    }
}
