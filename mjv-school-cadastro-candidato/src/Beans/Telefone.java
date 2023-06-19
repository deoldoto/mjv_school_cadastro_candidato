package Beans;

public class Telefone {

    private Long telefone;
    private boolean whatsapp = false;

    private boolean isCelular = false;

    public boolean isCelular() {
        return isCelular;
    }

    public void setCelular(boolean celular) {
        isCelular = celular;
    }

    public Long getTelefone() {
        return telefone;
    }

    public void setTelefone(Long telefone) {
        this.telefone = telefone;
    }

    public boolean isWhatsapp() {
        return whatsapp;
    }

    public void setWhatsapp(boolean whatsapp) {
        this.whatsapp = whatsapp;
    }
}
