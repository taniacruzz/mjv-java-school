import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Arquivo {
    private String nomeArquivo;
    private String caminhoArquivo;
    
    // Método construtor
    public Arquivo(String nomeArquivo, String caminhoArquivo) {
        this.nomeArquivo = nomeArquivo;
        this.caminhoArquivo = caminhoArquivo;
    }
    
    // Métodos
    public String getNomeArquivo() {
        return nomeArquivo;
    }

    public String getCaminhoArquivo() {
        return caminhoArquivo;
    }
    
    // Método para criar novo arquivo
    public File criarArquivo(Arquivo objArquivo) {

        String cabecalho = "Nome;CPF;Data de Nascimento;Sexo;"+
            "Logradouro;N°;Bairro;Complemento;Cidade;Estado;"+
            "Email;Telefone;Celular;Celular Whats;"+
            "Profissão;Empresa;Salario;Emprego Atual;"+
            "Pretensão Minima;Pretensão Máxima;"+
            "Habilidades";
        
        try {
            File arquivo = new File(objArquivo.caminhoArquivo, objArquivo.nomeArquivo);
            FileWriter fileWriter = new FileWriter(arquivo);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.close();
            System.out.println("Arquivo CSV criado com sucesso.");

            // Adicionar cabeçalho
            Path arquivoPath = Paths.get("Arquivos/cadastro.csv");
            Files.write(arquivoPath, cabecalho.getBytes(StandardCharsets.UTF_8), StandardOpenOption.APPEND);
            Files.write(arquivoPath, System.lineSeparator().getBytes(StandardCharsets.UTF_8), StandardOpenOption.APPEND);

            return arquivo;
            
        } catch (IOException e) {
            System.out.println("Erro ao criar o arquivo CSV: " + e.getMessage());
            return null;
        }

    }

    // Método para escrever no arquivo. Usa-se append para que a próxima linha não sobrescreva a anterior.
    public void escreverArquivo(File objArquivo, List<String> listaLinhas) throws IOException {
        Path arquivoDestino = Paths.get("Arquivos/cadastro.csv");

        for(String linha: listaLinhas){
            Files.write(arquivoDestino, linha.getBytes(StandardCharsets.UTF_8), StandardOpenOption.APPEND);
            Files.write(arquivoDestino, System.lineSeparator().getBytes(StandardCharsets.UTF_8), StandardOpenOption.APPEND);

        }
    }



     

    
    
}
