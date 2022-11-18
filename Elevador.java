package prova;

public class Elevador {
	private int idElevador;
	private int nrMaximoPessoas;
	private int nrAtualPessoas;
	private String localidade;
	private double pesoMaximoCarga;
	private double pesoAtualCarga;
	private double valorSeguroAcumulado;
	
	
	public Elevador(int idElevador, String localidade,
		   int nrMaximoPessoas, double pesoMaximoCarga) {
		
		this.idElevador = idElevador;
		this.localidade = localidade;
		this.nrMaximoPessoas = nrMaximoPessoas;
		this.pesoMaximoCarga = pesoMaximoCarga;
		this.nrAtualPessoas = 0;
		this.pesoAtualCarga = 0;
		this.valorSeguroAcumulado = 0;
		
	}


	public int getNrMaximoPessoas() {
		return nrMaximoPessoas;
	}


	public void setNrMaximoPessoas(int nrMaximoPessoas) {
		this.nrMaximoPessoas = nrMaximoPessoas;
	}


	public String getLocalidade() {
		return localidade;
	}


	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}


	public double getPesoMaximoCarga() {
		return pesoMaximoCarga;
	}


	public void setPesoMaximoCarga(double pesoMaximoCarga) {
		this.pesoMaximoCarga = pesoMaximoCarga;
	}


	public int getIdElevador() {
		return idElevador;
	}


	public int getNrAtualPessoas() {
		return nrAtualPessoas;
	}


	public double getPesoAtualCarga() {
		return pesoAtualCarga;
	}


	public double getValorSeguroAcumulado() {
		return valorSeguroAcumulado;
	}
	
	public boolean embarque(double pesoPessoa) {
		
		if (nrAtualPessoas < nrMaximoPessoas && pesoAtualCarga < pesoMaximoCarga) {
			
			nrAtualPessoas++;
			pesoAtualCarga = pesoAtualCarga + pesoPessoa;
			return true;
			
		} else {
			return false;
		}
				
	}
	
	public boolean desembarque(double pesoPessoa) {
		
		if (nrAtualPessoas > 0) {
			nrAtualPessoas--;
			pesoAtualCarga = pesoAtualCarga - pesoPessoa;
			
			if (pesoAtualCarga <= 0) {
				
				pesoAtualCarga = 0;
			}
			
			return true;
			
		} else {
			
			return false;
		}

		
	}
	
	private double registrarSeguro() {
		
		if (nrAtualPessoas <= (nrMaximoPessoas / 2)) {
			return valorSeguroAcumulado = 1.50;
			
		} else {
			return valorSeguroAcumulado = 2.00;
		}
		
	}
	
	public void zerarValorSeguro() {
		valorSeguroAcumulado = 0;
	}
}
