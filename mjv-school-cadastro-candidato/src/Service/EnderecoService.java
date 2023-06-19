package Service;

import Beans.Endereco;
import Utilitarios.Utilitario;

import java.util.StringJoiner;

public class EnderecoService {

    public static void PreencherEnderecoNoArquivo(Endereco endereco, StringJoiner arquivo){
        arquivo.add(Utilitario.getValorValido(endereco.getLogradouro()))
                .add(Utilitario.getValorValido(endereco.getNumero()))
                .add(Utilitario.getValorValido(endereco.getBairro()))
                .add(Utilitario.getValorValido(endereco.getComplemento()))
                .add(Utilitario.getValorValido(endereco.getCidade().getNome()))
                .add(Utilitario.getValorValido(endereco.getCidade().getUf()));
    }




}
