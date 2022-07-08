public class dadosPessoas {

    private String nomeCrianca;
    private String telefoneContato;
    private String nomeResponsavel;

    public dadosPessoas(String nomeCrianca, String telefoneContato, String nomeResponsavel) {
        this.nomeCrianca = nomeCrianca;
        this.telefoneContato = telefoneContato;
        this.nomeResponsavel = nomeResponsavel;
    }

    public String getNomeCrianca() {
        return nomeCrianca;
    }

    public void setNomeCrianca(String nomeCrianca) {
        this.nomeCrianca = nomeCrianca;
    }

    public String getTelefoneContato() {
        return telefoneContato;
    }

    public void setTelefoneContato(String telefoneContato) {
        this.telefoneContato = telefoneContato;
    }

    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

}
