/*
 * Jogo de Monstros
Você deve criar um Jogo de Monstros cooperativo, da seguinte forma:

Classe Jogador:

Crie uma classe Jogador com os atributos nome, placarGeral e placarIndividual. 
O placar individual vai pertencer a cada jogador do time, já o placar geral pertence a todo o time e é a soma das suas pontuações.

Crie um construtor que inicializa o nome do Jogador.

Crie um método derrotarMonstro que incrementa o placar individual e o placar geral em 1.

Sobrescreva o método equals que verifica se um jogador é igual ao outro checando o seu nome.

Classe JogoDeMonstros:

Crie uma classe JogoDeMonstros com o método iniciarJogo, que recebe como parâmetro uma lista de jogadores,
 percorre essa lista e invoca para cada jogador o método derrotarMonstro.

Ex: Após executar o iniciarJogo com 2 jogadores, o placar individual de cada jogador será 1 e o placar geral será 2.
 */