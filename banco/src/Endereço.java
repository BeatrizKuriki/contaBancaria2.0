
public class Endereço {
	private String cep;
	private String nomeRua;
	private String cidade;
	
	
	public Endereço(String cep, String nomeRua, String cidade) {
		super();
		this.cep = cep;
		this.nomeRua = nomeRua;
		this.cidade = cidade;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getNomeRua() {
		return nomeRua;
	}
	public void setNomeRua(String nomeRua) {
		this.nomeRua = nomeRua;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	

}
