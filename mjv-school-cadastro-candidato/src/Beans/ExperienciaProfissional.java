package Beans;

public class ExperienciaProfissional {
    private String profissao;
    private String emrpesa;
    private Double salario;
    private boolean empregoAtual;

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getEmrpesa() {
        return emrpesa;
    }

    public void setEmrpesa(String emrpesa) {
        this.emrpesa = emrpesa;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public boolean isEmpregoAtual() {
        return empregoAtual;
    }

    public void setEmpregoAtual(boolean empregoAtual) {
        this.empregoAtual = empregoAtual;
    }
}
