




public class item {

    
    private String nomeItem;
    private float peso;
    private float largura;
    private float altura;
    private float comprimento;
    private String categoria;
    private String dataDoEnvio;
 
    
    

    public item(String nomeItem, float peso, float largura, float altura, float comprimento, String categoria, String dataDoEnvio) {
        this.nomeItem = nomeItem;
        this.peso = peso;
        this.largura = largura;
        this.altura = altura;
        this.comprimento = comprimento;
        this.categoria = categoria;
        this.dataDoEnvio = dataDoEnvio;
    }

    public static class itemBuilder {

        private String nomeItem;
        private float peso;
        private float largura;
        private float altura;
        private float comprimento;
        private String categoria;
        private String dataDoEnvio;

        public itemBuilder nomeItem(String name) {
            this.nomeItem = name;
            return this;
        }

        public itemBuilder peso(float peso) {
            this.peso = peso;
            return this;
        }

        public itemBuilder largura(float largura) {
            this.largura = largura;
            return this;
        }

        public itemBuilder altura(float altura) {
            this.altura = altura;
            return this;
        }

        public itemBuilder comprimento(float comprimento) {
            this.comprimento = comprimento;
            return this;
        }

        public itemBuilder categoria(String categoria) {
            this.categoria = categoria;
            return this;
        }

        public itemBuilder dataDoEnvio(String dataDoEnvio) {
            this.dataDoEnvio = dataDoEnvio;
            return this;
        }

        public item criarItem() {
            return new item(nomeItem, peso, largura, altura, comprimento, categoria, dataDoEnvio);
        }

    }

    public float calcularVolume() {
        float resultado = largura * altura * comprimento;
        return resultado;
    }

    public String getNomeItem() {
        return nomeItem;
    }

    public void setNomeItem(String nomeItem) {
        this.nomeItem = nomeItem;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getLargura() {
        return largura;
    }

    public void setLargura(float largura) {
        this.largura = largura;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDataDoEnvio() {
        return dataDoEnvio;
    }

    public void setDataDoEnvio(String dataDoEnvio) {
        this.dataDoEnvio = dataDoEnvio;
    }

  

}
