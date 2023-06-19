import java.util.Date;

public class Cadastro {

    // Dados pessoais
    private String nome;
    private String cpf;
    private Date dataNascimento;
    private Sexo sexo;

    // Endereço
    private String logradouro;
    private String numero;
    private String bairro;
    private String complemento;
    private String cidade;
    private String estado;

    // Dados de contato
    private String email;
    private Long telefone;
    private Long celular;
    private boolean celularWhats;

    // Dados profissionais
    private String profissao;
    private String empresa;
    private double salario;
    private boolean empregoAtual;

    // Pretensão salarial
    private double pretensaoMinima;
    private double pretensaoMaxima;

    // Habilidades
    private String habilidades;

    // Método construtor
    public Cadastro(
        String nome, 
        String cpf, 
        Date dataNascimento, 
        Sexo sexo, 
        String logradouro, 
        String numero,
        String bairro,
        String complemento,
        String cidade,
        String estado,
        String email,
        long telefone,
        long celular,
        boolean celularWhats,
        String profissao,
        String empresa,
        double salario,
        boolean empregoAtual,
        double pretensaoMinima,
        double pretensaoMaxima,
        String habilidades
    ) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.complemento = complemento;
        this.cidade = cidade;
        this.estado = estado;
        this.email = email;
        this.telefone = telefone;
        this.celular = celular;
        this.celularWhats = celularWhats;
        this.profissao = profissao;
        this.empresa = empresa;
        this.salario = salario;
        this.empregoAtual = empregoAtual;
        this.pretensaoMinima = pretensaoMinima;
        this.pretensaoMaxima = pretensaoMaxima;
        this.habilidades = habilidades;
    }    
    
    // Método que inclui todos os atributos desta classe em uma única String
    public String buildString(Cadastro cadastro) {
        StringBuilder conteudo = new StringBuilder();
        
        conteudo.append(nome + ";");
        conteudo.append(cpf + ";");
        conteudo.append(dataNascimento + ";");
        conteudo.append(sexo + ";");
        conteudo.append(logradouro + ";");
        conteudo.append(numero + ";");
        conteudo.append(bairro + ";");
        conteudo.append(complemento + ";");
        conteudo.append(cidade + ";");
        conteudo.append(estado + ";");
        conteudo.append(email + ";");
        conteudo.append(telefone + ";");
        conteudo.append(celular + ";");
        conteudo.append(celularWhats + ";");
        conteudo.append(profissao + ";");
        conteudo.append(empresa + ";");
        conteudo.append(salario + ";");
        conteudo.append(empregoAtual + ";");
        conteudo.append(pretensaoMinima + ";");
        conteudo.append(pretensaoMaxima + ";");
        conteudo.append(habilidades);

        return conteudo.toString();

        
        
    }

    
}    
