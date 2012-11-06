package annanda.lab1;


public class Carro {
	
	public String modelo;
	public double preco; 
	public double consumo_medio;
	public boolean novo; 
	public Dono dono;
	public int ano;
	
	public Carro(String modelo, double preco, double consumo_medio, boolean novo, Dono dono, int ano){
		this.modelo = modelo;
		this.preco = preco;
		this.consumo_medio = consumo_medio;
		this.novo = novo;
		this.dono = dono;
		this.ano = ano;
	}
	
	public boolean carroVelho(){
		if (this.ano < 2002) {
			return true;
		}
		return false;
	}
	
	public boolean feitoAntes(int ano){
		if(this.ano < ano){
			return true;
		}
		return false;
	}
	
	public boolean maisVelho(Carro outro) {
		return this.feitoAntes(outro.ano);
	}
	

}