#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <string.h>

int main (){

    setlocale(LC_ALL, "");

    struct atendimento{
        char nome[80]; 
        char cpf[15];
        int tipoAtendimento;
    };
    
    struct types{
        char nome[80]; 
        char cpf[15];
    };

    int numeroAtendimento, setor, i, j=0, k=0, l=0, m=0, vezes=1, solicit, X;

    do{

        system("cls||clear");
        
        printf("Bem-vindo ao sistema de Atendimento\n\n1 - Solicitar Atendimento\n2 - Listar Atendimento Registrados\n3 - Listar Atendimentos por Setor\n4 - Sair\n\n-");
        scanf("%d", &numeroAtendimento);

        fflush(stdin);

        switch (numeroAtendimento){

            case 1:
                
                system("cls||clear");

                struct atendimento pessoa[100];
                struct types tipo1[100];
                struct types tipo2[100];
                struct types tipo3[100];
                struct types tipo4[100];

                X = solicit + vezes;

                for (i=solicit; i<X; i++){

                    solicit++;

                    system("cls||clear");
                    printf("================= Registro =================\n");
                    fflush(stdin);
                    printf("\nDigite seu nome completo: ");
                    gets(pessoa[i].nome);
                    printf("\n-----------------------------------\n");
                    fflush(stdin);
                    printf("\nDgite seu CPF: ");
                    gets(pessoa[i].cpf);
                    system("cls||clear");
                    fflush(stdin);
                    printf("Qual Atendimento Necessita?\n\n1 - Abertura de Conta\n2 - Caixa\n3 - Gerente Pessoa Fisica\n4 - Gerente Pessoa Juridica\n\n-");
                    scanf("%d", &pessoa[i].tipoAtendimento);
                    system("cls||clear");
                    
                    if(pessoa[i].tipoAtendimento == 1){
                        strcpy(tipo1[j].nome, pessoa[i].nome);
                        strcpy(tipo1[j].cpf, pessoa[i].cpf);
                        j++;
                    }
                    else{
                        if(pessoa[i].tipoAtendimento == 2){
                            strcpy(tipo2[k].nome, pessoa[i].nome);
                            strcpy(tipo2[k].cpf, pessoa[i].cpf);
                            k++;
                        }
                            else{
                                if (pessoa[i].tipoAtendimento == 3){
                                    strcpy(tipo3[l].nome, pessoa[i].nome);
                                    strcpy(tipo3[l].cpf, pessoa[i].cpf);
                                    l++;
                                }
                                    else{
                                        if(pessoa[i].tipoAtendimento == 4){
                                            strcpy(tipo4[m].nome, pessoa[i].nome);
                                            strcpy(tipo4[m].cpf, pessoa[i].cpf);
                                            m++;
                                        }
                                    }
                            }
                 
                    }

                }
                break;
                
            case 2:

                system("cls||clear");
                for (i=0; i<solicit; i++){
                    printf("Nome: %s\n", pessoa[i].nome);
                    printf("CPF: %s\n", pessoa[i].cpf);
                    printf("Tipo Atendimento - %d ", pessoa[i].tipoAtendimento);
                    if(pessoa[i].tipoAtendimento == 1){
                        printf("- Abertura de conta");
                    }
                    else{
                        if(pessoa[i].tipoAtendimento == 2){
                            printf("- Caixa");
                        }
                            else{
                                if(pessoa[i].tipoAtendimento == 3){
                                    printf("- Gerente Pessoa Fisica");
                                }
                                    else{
                                        if(pessoa[i].tipoAtendimento == 4){
                                            printf("- Gerente Pessoa Juridica");
                                        }
                                    }
                            }
                    }
                    printf("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");
                }
                system("read");
                system("pause");// por eu estar utilizando MacOS, Algumas funções são diferentes. Peço que ignore em caso de NOT FOUND ou quaisquer erro de incompatibilidade em seu compilamento.
                break;

            case 3:

                system("cls||clear");
                printf("Deseja Listar Atendimentos de qual Setor?\n\n1 - Abertura de Conta\n2 - Caixa\n3 - Gerente Pessoa Fisica\n4 - Gerente Pessoa Juridica\n\n-");
                fflush(stdin);
                scanf("%d", &setor);

                switch (setor){
                    
                    case 1:
                        
                    system("cls||clear");
                    for (i=0; i<j; i++){
                        printf("Nome: %s\n", tipo1[i].nome);
                        printf("CPF: %s\n", tipo1[i].cpf);
                        printf("Tipo Atendimento - 1 - Abertura de conta");
                        printf("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");
                    }
                    system("read");
                    system("pause");
                    break;

                    case 2:
                        
                    system("cls||clear");
                    for (i=0; i<k; i++){
                        printf("Nome: %s\n", tipo2[i].nome);
                        printf("CPF: %s\n", tipo2[i].cpf);
                        printf("Tipo Atendimento - 2 - Caixa");
                        printf("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");
                    }
                    system("read");
                    system("pause");
                    break;

                    case 3:
                        
                    system("cls||clear");
                    for (i=0; i<l; i++){
                        printf("Nome: %s\n", tipo3[i].nome);
                        printf("CPF: %s\n", tipo3[i].cpf);
                        printf("Tipo Atendimento - 3 - Gerente Pessoa Fisica");
                        printf("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");
                    }
                    system("read");
                    system("pause");
                    break;

                    case 4:
                        
                    system("cls||clear");
                    for (i=0; i<m; i++){
                        printf("Nome: %s\n", tipo4[i].nome);
                        printf("CPF: %s\n", tipo4[i].cpf);
                        printf("Tipo Atendimento - 4 - Gerente Pessoa Juridica");
                        printf("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");
                    }
                    system("read");
                    system("pause");
                    break;
                }

        }
    }
    
    
    while (numeroAtendimento != 4);

    return (0);
}
