############################################################
#### Aplicacao Rest utilizando:  				 	    ####
#### Spring Boot                  					    ####
#### Base de dados h2 em Cache    					    ####
#### Algoritmo para calculo da rota DijkstraAlgorithm   ####
############################################################

####################################################################
#### Configuracao Workspace                                     ####
#### Importar como projeto Maven                                ####
#### Executar o maven build para baixar as dependencias         ####
####################################################################

####################################################################
#### Execucao da aplicacao:                                     ####
#### Executar o metodo main da classe BootApplication.java      ####
#### O servidor do Spring de startar e subir a aplicacao        ####
#### Após a aplicacao no ar, abrir o navegador web              ####
####################################################################

#####################################################################################
#### Acesso aos seguintes servicos rest                                          ####
#### Visualizacao dos mapas cadastrados: http://localhost:8080/mapas             ####
#### Visualizacao das localidades cadastradas: http://localhost:8080/localidades ####
#### Calculo de melhor caminho de rota de entrega:                               ####
#### http://localhost:8080/rotas/<origem>/<destino>                              ####
#### exemplo:http://localhost:8080/rotas/1/4                                     ####
#####################################################################################

#######################################################################################
#### Motivacoes  																   ####
#### Escolha do Spring Boot: Para serviço rest considero o framework mais robusto, ####
ágil e simples de implementacao, 												   ####
#### onde tem tudo configurado, servidor de aplicação nativo, leve de subir.       ####
####                                                                               ####
#### Algoritmo para calculo da melhor rota                                         ####
#### O algoritmo escolhido foi o Dijkstra, onde é baseado em grafo                 ####
#### para solução de problemas de caminho mais curto.                              ####
####																			   ####
#### Base de dados                                                                 ####
#### Hsqldb, por se tratar de um banco que trabalha com cache e possui um ótimos   ####
#### recursos de desempenho, atendeu muito bem o escopo da aplicacao.              ####
#### da aplicacao,                                                                 ####
#######################################################################################  
