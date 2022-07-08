
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class carta implements Serializable {

    private final String nomeArq;
    private dadosPessoas dp;
    private endereco end;
    private item item;
    ArrayList<carta> cr = new ArrayList(lerArquivo());

    carta(String nomeArq, dadosPessoas dp, endereco end, item item) {
        this.nomeArq = nomeArq;
        this.dp = dp;
        this.end = end;
        this.item = item;
    }

    public void CriarCarta(carta carta) {
        cr.add(carta);
        criarObjeto();
        escrita("DadosTexto.txt", cr);
    }

    public void criarObjeto() {

        try ( ObjectOutputStream ob2 = new ObjectOutputStream(new FileOutputStream("corrente.ser"))) {
            ob2.writeObject(cr);
            ob2.close();

        } catch (IOException e) {
            System.out.println("Erro na escrita de dados!" + e);
        }
    }

    public static ArrayList<carta> lerArquivo() {

        ArrayList<carta> corr = new ArrayList();

        try ( ObjectInputStream ob = new ObjectInputStream(new FileInputStream("corrente.ser"))) {

            corr = (ArrayList<carta>) ob.readObject();
            ob.close();
        } catch (IOException e) {
            System.out.println("Erro na escrita de dados!" + e);
        } catch (ClassNotFoundException e1) {
            System.out.println("Classe nao encontrada!" + e1);
        }
        return corr;
    }

    public static void escrita(String nomeArq, ArrayList<carta> cr) {

        try {
            FileWriter arq = new FileWriter(nomeArq, true);
            try ( PrintWriter out = new PrintWriter(arq)) {
                for (int i = 0; i < cr.size(); i++) {
                    String linha = "Data_envio:" + cr.get(i).getItem().getDataDoEnvio() + "\r\n"
                            + "Nome Crianca:" + cr.get(i).getDp().getNomeCrianca() + "\r\n"
                            + "Logradouro:" + cr.get(i).getEnd().getLogradouro() + "\r\n"
                            + "Numero:" + cr.get(i).getEnd().getNumero() + "\r\n"
                            + "Bairro" + cr.get(i).getEnd().getBairro() + "\r\n"
                            + "Cidade:" + cr.get(i).getEnd().getCidade() + "\r\n"
                            + "Telefone:" + cr.get(i).getDp().getTelefoneContato() + "\r\n"
                            + "Nome_responsavel:" + cr.get(i).getDp().getNomeResponsavel() + "\r\n"
                            + "Item_Pedido:" + cr.get(i).getItem().getNomeItem() + "\r\n"
                            + "Peso:" + cr.get(i).getItem().getPeso() + "\r\n"
                            + "Largura:" + cr.get(i).getItem().getLargura() + "\r\n"
                            + "Altura:" + cr.get(i).getItem().getAltura() + "\r\n"
                            + "Comprimento:" + cr.get(i).getItem().getComprimento() + "\r\n"
                            + "Categorias:" + cr.get(i).getItem().getCategoria();
                    out.println(linha);
                }
            }
        } catch (IOException e) {
            System.out.println("Erro na escrita de dados!" + e);
        }
    }

    public void mostrarCarta() {

        System.out.println("CARTA:" + nomeArq);
        System.out.println("nome Crianca:" + dp.getNomeCrianca());
        System.out.println("nome Responsavel:" + dp.getNomeResponsavel());
        System.out.println("Telefone:" + dp.getTelefoneContato());
        System.out.println("logradouro" + end.getLogradouro());
        System.out.println("Numero:" + end.getNumero());
        System.out.println("Bairro:" + end.getBairro());
        System.out.println("Cidade:" + end.getCidade());
        System.out.println("Nome Item:" + item.getNomeItem());
        System.out.println("Peso" + item.getPeso());
        System.out.println("Largura" + item.getLargura());
        System.out.println("Altura" + item.getAltura());
        System.out.println("Comprimento" + item.getComprimento());
        System.out.println("Categoria:" + item.getCategoria());
        System.out.println("Data de envio:" + item.getDataDoEnvio());
    }

    public String getNomeCrianca(dadosPessoas dp) {
        return dp.getNomeCrianca();
    }

    public dadosPessoas getDp() {
        return dp;
    }

    public void setDp(dadosPessoas dp) {
        this.dp = dp;
    }

    public endereco getEnd() {
        return end;
    }

    public void setEnd(endereco end) {
        this.end = end;
    }

    public item getItem() {
        return item;
    }

    public void setItem(item item) {
        this.item = item;
    }

    public String getNomeArq() {
        return nomeArq;
    }

    public List<carta> getCr() {
        return cr;
    }

}
