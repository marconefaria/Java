	/*interface que representa o andamento e a l�gica do jogo. � respons�vel
	por ditar o andamento do jogo. Ela que vai dizer se o jogo acabou ou n�o, se o usu�rio acertou a
	palavra ou n�o, se o usu�rio pode tentar acertar a palavra novamente e qual foi a pontua��o final
	do jogador. Pelo menos duas implementa��es dessa interface devem ser criadas.*/

public interface MecanicaDoJogo {
	/*implementa��es de MecanicaDoJogo devem retratar o andamento do jogo. Exemplos de quest�es
	que podem mudar: quando o jogo termina (ap�s um n�mero fixo de palavras, ap�s um n�mero de
	erros); quantas tentativas podem ser feitas por palavra; como s�o computados os pontos; qual
	embaralhador ser� utilizado e em que momento; e etc... O importante � que independente do
	funcionamento, a classe Principal dever� interagir com ele da mesma forma.*/
	
	public boolean fimJogo(int fim);
	public void proximaJogada(int alternativa);
	public int score();
	public String embaralhador(String palavra);
	public boolean acerto(String palavra, String resposta);
}
