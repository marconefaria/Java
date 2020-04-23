import java.util.Calendar;
import java.util.Date;

public class Pessoa extends Relogio{
	private Date dataDeNascimento = new Date();
	private Relogio r = new Relogio();

	public Pessoa(Date dataDeNascimento) {
		super();
		this.dataDeNascimento = dataDeNascimento;
	}

	public Date getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(Date dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	
	public int getIdade(){
		//long hoje = System.currentTimeMillis();
		long dif = r.agora() - getDataDeNascimento().getTime();
		int idade = (int) (dif/1000/60/60/24/365.25);
		return idade;
	}
	
	public String getSigno() {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(getDataDeNascimento());
		
		int mes = calendar.get(Calendar.MONTH);
		int dia = calendar.get(Calendar.DAY_OF_MONTH);
		
		switch(mes) {
			case 0:
				if(dia <= 20) {
					return "Cappric�rnio";
				}else {
					return "Aqu�rio";
				}
			case 1:
				if(dia < 20) {
					return "Aqu�rio";
				}else {
					return "Peixes";
				}
			case 2:
				if(dia <= 20) {
					return "Peixes";
				}else {
					return "�ries";
				}
			case 3:
				if(dia <= 20) {
					return "�ries";
				}else {
					return "Touro";
				}
			case 4:
				if(dia <= 20) {
					return "Touro";
				}else {
					return "G�meos";
				}
			case 5:
				if(dia <= 20) {
					return "G�meos";
				}else {
					return "C�ncer";
				}
			case 6:
				if(dia <= 21) {
					return "C�ncer";
				}else {
					return "Le�o";
				}
			case 7:
				if(dia <= 22) {
					return "Le�o";
				}else {
					return "Virgem";
				}
			case 8:
				if(dia <= 22) {
					return "Virgem";
				}else {
					return "Libra";
				}
			case 9:
				if(dia <= 22) {
					return "Libra";
				}else {
					return "Escorpi�o";
				}
			case 10:
				if(dia <= 21) {
					return "Escorpi�o";
				}else {
					return "Sagit�rio";
				}
			case 11:
				if(dia <= 22) {
					return "Sagit�rio";
				}else {
					return "Capric�rnio";
				}
		}
		return null;
	}
	
	/*long nascimento = getDataDeNascimento().getTime();
		System.out.println(getDataDeNascimento().getTime());
		long agora = r.agora();
		
		long idade = agora - nascimento;
		return idade.getDate;*/
}