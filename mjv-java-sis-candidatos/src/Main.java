import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ParseException, IOException {
        // Criar variável do tipo lista de Strings, que receberá todas as linhas a serem adicionadas no arquivo
        List<String> linhas = new ArrayList<String>();

        // Formatar String para ser usado como Date
        SimpleDateFormat dateFormatJoao = new SimpleDateFormat("dd/MM/yyyy");
        Date nascimentoJoao = dateFormatJoao.parse("01/09/1979");
        Cadastro cadastroJoao = new Cadastro(
            "Joao Gonçalves", 
            "111.111.111-11",
            nascimentoJoao,
            Sexo.Masculino,
            "Rua Santos",
            "02",
            "Jd. Morumbi",
            "casa",
            "Guará",
            "São Paulo",
            "joao@emailJoao.com",
            39398484,
            97778877,
            true,
            "Eletricista",
            "Eletrica SA",
            3000.00,
            true,
            3000.00,
            5000.00,
            "Experiente na area"
        );
        
        // Formatar String para ser usado como Date
        SimpleDateFormat dateFormatKarina = new SimpleDateFormat("dd/MM/yyyy");
        Date nascimentoKarina= dateFormatKarina.parse("01/11/1983");
        Cadastro cadastroKarina = new Cadastro(
            "Karina Santos", 
            "222.222.222-22",
            nascimentoKarina,
            Sexo.Feminino,
            "Rua Sampaio",
            "50",
            "Jd. Augusta",
            "apto. 18",
            "Ilhéus",
            "Bahia",
            "karina@emailKarina.com",
            39151314,
            96976812,
            true,
            "Programadora BackEnd",
            "Code SA",
            4500.00,
            true,
            5000.00,
            7000.00,
            "Autodidata"
        );

        // Formatar String para ser usado como Date
        SimpleDateFormat dateFormatFrancine = new SimpleDateFormat("dd/MM/yyyy");
        Date nascimentoFrancine = dateFormatFrancine.parse("28/05/1990");
        Cadastro cadastroFrancine = new Cadastro(
            "Francine Cruz", 
            "333.333.333-33",
            nascimentoFrancine,
            Sexo.Feminino,
            "Rua Bairiri",
            "1020",
            "Boa Vista",
            "apto. 65",
            "Belém",
            "Pará",
            "francine@emailFrancine.com",
            39344487,
            98973113,
            true,
            "Designer",
            "Mercado Livre",
            8000.00,
            true,
            8500.00,
            10000.00,
            "Domínio de photoshop"
        );

        linhas.add(cadastroJoao.buildString(cadastroJoao));
        linhas.add(cadastroKarina.buildString(cadastroKarina));
        linhas.add(cadastroFrancine.buildString(cadastroFrancine));

        Arquivo arquivo = new Arquivo("cadastro.csv", "Arquivos");
        File file = arquivo.criarArquivo(arquivo);
        
        if(file != null){
            arquivo.escreverArquivo(file, linhas);
        }
        
       
                                

    }
}