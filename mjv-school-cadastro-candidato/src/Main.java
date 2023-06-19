import Beans.Candidato;
import Service.*;

import java.util.StringJoiner;

public class Main {

    public static void main(String[] args) {

      //  public void popularCandidato(Candidato candidato) {
            Candidato candidato = new Candidato();
            candidato.setNome("Teste");
            candidato.setCpf("012345678901");
            candidato.setSexo("Masculino");
            candidato.getEndereco().getCidade().setNome("Cidade de teste");
            candidato.getEndereco().getCidade().setUf("TE");
            candidato.getEndereco().setBairro("bairro Um");
            candidato.getEndereco().setLogradouro("Rua dos testes");
            candidato.getEndereco().setNumero("123");
            candidato.getEndereco().setBairro("Universitário");
            candidato.getEmail().setEmail("email@teste.com.br");
            candidato.getTelefone().setTelefone(43334342L);
            candidato.getCelular().setTelefone(434343L);
            candidato.getCelular().setCelular(true);
            candidato.getCelular().setWhatsapp(true);
            candidato.getExperienciaProfissional().setProfissao("professor");
            candidato.getExperienciaProfissional().setEmrpesa("SEED");
            candidato.getExperienciaProfissional().setEmpregoAtual(false);
            candidato.getExperienciaProfissional().setSalario(2000.0);
            candidato.getPretencaoSalarial().setPretencaoMaxima(3000.0);
            candidato.getPretencaoSalarial().setPretencaoMinima(1200.0);
            candidato.getPretencaoSalarial().setHabilidades("história");



            StringJoiner arquivo=  new StringJoiner(";");
            CandidatoService.GerarRegistroArquivoCSV(candidato, arquivo);



            System.out.println( arquivo.toString());
            ManipuladorArquivo.SalvarArquivo(null, arquivo.toString());
  //      }
        System.out.println("Hello world!");
    }

         static String getValorValido(String texto) {
                if (texto == null) {
                        return "";
                }
                return texto;
        }

        static String getValorValido(boolean bool) {
                if (bool) {
                        return "true";
                }
                return "false";
        }



}