package Service;

import Beans.Candidato;
import Utilitarios.Utilitario;

import java.util.StringJoiner;


public class CandidatoService {

    public static void PreencherDadosDoCandidatoNoArquivo(Candidato candidato, StringJoiner arquivo){
        arquivo
                .add(Utilitario.getValorValido(candidato.getNome()))
                .add(Utilitario.getValorValido(candidato.getCpf()))
                .add(Utilitario.getValorValido(candidato.getDataNascimentoFormatada()))
                .add(Utilitario.getValorValido(candidato.getSexo()));

    }

    public static void GerarRegistroArquivoCSV(Candidato candidato, StringJoiner arquivo) {
        CandidatoService.PreencherDadosDoCandidatoNoArquivo(candidato, arquivo);
        EnderecoService.PreencherEnderecoNoArquivo(candidato.getEndereco(), arquivo);
        EmailService.PreencherEmailNoArquivo(candidato.getEmail(), arquivo);
        TelefoneService.PreencherDadosDoTelefoneNoArquivo(candidato.getTelefone(), arquivo);
        TelefoneService.PreencherDadosDoTelefoneNoArquivo(candidato.getCelular(), arquivo);
        ExperienciaProfissionalService.PreencherExperienciaProfissionalNoArquivo(candidato.getExperienciaProfissional(), arquivo);
        PretencaoSalarialService.PreencherPretencaoSalarialNoArquivo(candidato.getPretencaoSalarial(), arquivo);
    }


}
