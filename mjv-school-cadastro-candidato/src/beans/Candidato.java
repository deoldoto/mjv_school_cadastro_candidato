package beans;

import sun.security.x509.OtherName;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Candidato {
    private String nome;
    private String cpf;
    private LocalDate dataNascimento;
    private String sexo;
    private Endereco endereco;
    private Telefone telefone;
    private Telefone celular;

    private String email;
    private ExperienciaProfissional experienciaProfissional;

    private PretencaoSalarial pretencaoSalarial;

    public Candidato(){
        endereco = new Endereco();
        telefone = new Telefone();
        celular= new Telefone();
        experienciaProfissional = new ExperienciaProfissional();
        pretencaoSalarial = new PretencaoSalarial();


    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public ExperienciaProfissional getExperienciaProfissional() {
        return experienciaProfissional;
    }

    public void setExperienciaProfissional(ExperienciaProfissional experienciaProfissional) {
        this.experienciaProfissional = experienciaProfissional;
    }

    public Telefone getCelular() {
        return celular;
    }

    public void setCelular(Telefone celular) {
        this.celular = celular;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    public PretencaoSalarial getPretencaoSalarial() {
        return pretencaoSalarial;
    }

    public void setPretencaoSalarial(PretencaoSalarial pretencaoSalarial) {
        this.pretencaoSalarial = pretencaoSalarial;
    }

    public String getDataNascimentoFormatada(){

        if (this.dataNascimento == null)
            return "";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YYYY-MM-DD");
        return dataNascimento.format(formatter);

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
