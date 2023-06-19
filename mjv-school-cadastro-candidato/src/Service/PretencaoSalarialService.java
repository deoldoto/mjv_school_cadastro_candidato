package Service;

import Beans.PretencaoSalarial;
import Utilitarios.Utilitario;

import java.util.StringJoiner;

public class PretencaoSalarialService {


    public static void PreencherPretencaoSalarialNoArquivo(PretencaoSalarial pretencao, StringJoiner arquivo){
        arquivo.add(Utilitario.getValorValido(pretencao.getPretencaoMaxima().toString()))
                .add(Utilitario.getValorValido(pretencao.getPretencaoMinima().toString()))
                .add(Utilitario.getValorValido(pretencao.getHabilidades()));
    }
}
