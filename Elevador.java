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
			pesoAtualCarga += pesoPessoa;
			valorSeguroAcumulado += registrarSeguro();
			return true;
			
		} else {
			return false;
		}
				
	}
	
	public boolean desembarque(double pesoPessoa) {
		if (this.nrAtualPessoas > 0) {
			this.nrAtualPessoas--;
			this.pesoAtualCarga-=pesoPessoa;
			valorSeguroAcumulado -= registrarSeguro();
			return true;
		}
		return false;
	}
	
	private double registrarSeguro() {
		
		if (this.nrAtualPessoas <= (this.nrMaximoPessoas / 2)) {
			return 1.50 * this.nrAtualPessoas;
			
		} else {
			return 2.00 * this.nrAtualPessoas;
		}
		
	}
	
	public void zerarValorSeguro() {
		this.valorSeguroAcumulado = 0;
	}
}
