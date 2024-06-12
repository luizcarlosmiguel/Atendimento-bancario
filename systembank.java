// SISTEMA DE AUTOATENDIMENTO TOTTEN BANCÁRIO EM JAVA

import java.util.Scanner;

class atendimento{

    String nome, cpf;
    int tipoAtendimento;

}

class Types {

    String nome, cpf;

}



public class systembank {  
    
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int numeroAtendimento, setor, i, j=0, k=0, l=0, m=0, vezes=1, solicit=0, X;

        atendimento[] pessoa = new atendimento[100];
        Types[] tipo1 = new Types[100];
        Types[] tipo2 = new Types[100];
        Types[] tipo3 = new Types[100];
        Types[] tipo4 = new Types[100];

        do {
            System.out.println("\n\n\nBem-vindo ao sistema de Atendimento\n\n1 - Solicitar Atendimento\n2 - Listar Atendimentos Registrados\n3 - Listar Atendimentos por Setor\n4 - Sair\n");
            numeroAtendimento = scanner.nextInt();

            switch (numeroAtendimento) {
                case 1:
                    X = solicit + vezes;

                    for (i=solicit; i<X; i++) {
                        solicit++;
                        System.out.println("\n\n\n\n================= Registro =================\n");
                        System.out.println("\nDigite seu nome completo:\n");
                        pessoa[i] = new atendimento();
                        scanner = new Scanner(System.in);
                        pessoa[i].nome = scanner.nextLine();
                        System.out.println("\n-----------------------------------");
                        System.out.println("\nDigite seu CPF:\n");
                        pessoa[i].cpf = scanner.next();
                        System.out.println("\n-----------------------------------");
                        System.out.println("\nQual Atendimento Necessita?\n\n1 - Abertura de Conta\n2 - Caixa\n3 - Gerente Pessoa Fisica\n4 - Gerente Pessoa Juridica\n");
                        pessoa[i].tipoAtendimento = scanner.nextInt();
                        System.out.println("\n-----------------------------------");

                        if(pessoa[i].tipoAtendimento == 1){
                            tipo1[j] = new Types();
                            tipo1[j].nome = pessoa[i].nome;
                            tipo1[j].cpf = pessoa[i].cpf;
                            j++;
                        }
                        else if(pessoa[i].tipoAtendimento == 2){
                            tipo2[k] = new Types();
                            tipo2[k].nome = pessoa[i].nome;
                            tipo2[k].cpf = pessoa[i].cpf;
                            k++;
                        }

                        else if (pessoa[i].tipoAtendimento == 3){
                            tipo3[l] = new Types();
                            tipo3[l].nome = pessoa[i].nome;
                            tipo3[l].cpf = pessoa[i].cpf;
                            l++;
                        }

                         else if(pessoa[i].tipoAtendimento == 4){
                            tipo4[m] = new Types();
                            tipo4[m].nome = pessoa[i].nome;
                            tipo4[m].cpf = pessoa[i].cpf;
                            m++;
                        }

                    }
                    break;

                    case 2:
                        System.out.println("\n\n");
                        for (i = 0; i < solicit; i++) {
                            System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");
                            System.out.println("Nome: " + pessoa[i].nome);
                            System.out.println("CPF: " + pessoa[i].cpf);
                            System.out.print("Tipo Atendimento - " + pessoa[i].tipoAtendimento);
                            switch (pessoa[i].tipoAtendimento) {
                                case 1:
                                    System.out.println(" - Abertura de conta");
                                    break;
                                case 2:
                                    System.out.println(" - Caixa");
                                    break;
                                case 3:
                                    System.out.println(" - Gerente Pessoa Fisica");
                                    break;
                                case 4:
                                    System.out.println(" - Gerente Pessoa Juridica");
                                    break;
                            }
                            System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                        }
                        break;

                    case 3:
                        System.out.println("\n");
                        System.out.println("-----------------------------------\n");
                        System.out.println("Deseja Listar Atendimentos de qual Setor?\n\n1 - Abertura de Conta\n2 - Caixa\n3 - Gerente Pessoa Fisica\n4 - Gerente Pessoa Juridica\n");
                        setor = scanner.nextInt();
                        System.out.println("\n-----------------------------------");
                        switch (setor) {
                            case 1:
                                System.out.println("\n\n");
                                if (j <= 0){
                                    System.out.println("Não houve Atendimentos para este setor!");
                                    System.out.println("\n\n-----------------------------------");
                                }
                                else{
                                    for (i = 0; i < j; i++) {
                                        System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");
                                        System.out.println("Nome: " + tipo1[i].nome);
                                        System.out.println("CPF: " + tipo1[i].cpf);
                                        System.out.println("Tipo Atendimento - 1 - Abertura de conta");
                                        System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                    }
                                }
                                break;
                            case 2:
                                System.out.println("\n\n");
                                if (k <= 0){
                                    System.out.println("Não houve Atendimentos para este setor!");
                                    System.out.println("\n\n-----------------------------------");
                                }
                                else{
                                    for (i = 0; i < k; i++) {
                                        System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                        System.out.println("Nome: " + tipo2[i].nome);
                                        System.out.println("CPF: " + tipo2[i].cpf);
                                        System.out.println("Tipo Atendimento - 2 - Caixa");
                                        System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                    }
                                }
                                break;
                            case 3:
                                System.out.println("\n\n");
                                if (l <= 0){
                                    System.out.println("Não houve Atendimentos para este setor!");
                                    System.out.println("\n\n-----------------------------------");
                                }
                                else{
                                    for (i = 0; i < l; i++) {
                                        System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                        System.out.println("Nome: " + tipo3[i].nome);
                                        System.out.println("CPF: " + tipo3[i].cpf);
                                        System.out.println("Tipo Atendimento - 3 - Gerente Pessoa Fisica");
                                        System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                    }
                                }
                                break;
                            case 4:
                                System.out.println("\n\n");
                                if (j <= 0){
                                    System.out.println("Não houve Atendimentos para este setor!");
                                    System.out.println("\n\n-----------------------------------");
                                }
                                else{
                                    for (i = 0; i < m; i++) {
                                        System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                        System.out.println("Nome: " + tipo4[i].nome);
                                        System.out.println("CPF: " + tipo4[i].cpf);
                                        System.out.println("Tipo Atendimento - 4 - Gerente Pessoa Juridica");
                                        System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                    }
                                }
                                break;
                    }
                    break;
            }
        } while (numeroAtendimento != 4);
    }
}


//              SYSTEM CLEAR PARA JAVA
