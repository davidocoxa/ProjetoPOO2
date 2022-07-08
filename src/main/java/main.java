
public class main {

    public static void main(String[] args) {

        dadosPessoas db = new dadosPessoas("davi", "12345678912", "Marlon");
        endereco ende = new endereco("string", 12, "string", "string");
        item item = new item.itemBuilder()
                .altura(0)
                .categoria("cate")
                .comprimento(0)
                .dataDoEnvio("12/12/1234")
                .largura(0)
                .nomeItem("qualquer")
                .peso(0)
                .criarItem();

        carta c = new carta("dados", db, ende, item);
        c.CriarCarta(c);

    }

}
