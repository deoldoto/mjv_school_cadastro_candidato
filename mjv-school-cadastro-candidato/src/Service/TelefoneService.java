package Service;

import Beans.Telefone;
import Utilitarios.Utilitario;

import java.util.StringJoiner;

public class TelefoneService {

    public static void PreencherDadosDoTelefoneNoArquivo(Telefone telefone, StringJoiner arquivo){
        arquivo.add(Utilitario.getValorValido(telefone.getTelefone().toString()));
        if (telefone.isCelular())
            arquivo.add(Utilitario.getValorValido(telefone.isWhatsapp()));
    }
}
