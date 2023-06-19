package Service;

import Beans.ExperienciaProfissional;
import Utilitarios.Utilitario;

import java.util.StringJoiner;

public class ExperienciaProfissionalService {

    public static void PreencherExperienciaProfissionalNoArquivo(ExperienciaProfissional experiencia, StringJoiner arquivo){
        arquivo.add(Utilitario.getValorValido(experiencia.getProfissao()))
                .add(Utilitario.getValorValido(experiencia.getEmrpesa()))
                .add(Utilitario.getValorValido(experiencia.getSalario().toString()))
                .add(Utilitario.getValorValido(experiencia.isEmpregoAtual()));
    }
}
