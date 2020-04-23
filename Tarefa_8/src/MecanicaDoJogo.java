	/*interface que representa o andamento e a lógica do jogo. É responsável
	por ditar o andamento do jogo. Ela que vai dizer se o jogo acabou ou não, se o usuário acertou a
	palavra ou não, se o usuário pode tentar acertar a palavra novamente e qual foi a pontuação final
	do jogador. Pelo menos duas implementações dessa interface devem ser criadas.*/

public interface MecanicaDoJogo {
	/*implementações de MecanicaDoJogo devem retratar o andamento do jogo. Exemplos de questões
	que podem mudar: quando o jogo termina (após um número fixo de palavras, após um número de
	erros); quantas tentativas podem ser feitas por palavra; como são computados os pontos; qual
	embaralhador será utilizado e em que momento; e etc... O importante é que independente do
	funcionamento, a classe Principal deverá interagir com ele da mesma forma.*/
	
	public boolean fimJogo(int fim);
	public void proximaJogada(int alternativa);
	public int score();
	public String embaralhador(String palavra);
	public boolean acerto(String palavra, String resposta);
}
