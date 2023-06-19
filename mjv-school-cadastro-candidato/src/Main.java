import beans.Candidato;

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
            candidato.setEmail("email@teste.com.br");
            candidato.getTelefone().setTelefone(43334342L);
            candidato.getCelular().setTelefone(434343L);
            candidato.getCelular().setWhatsapp(true);
            candidato.getExperienciaProfissional().setProfissao("professor");
            candidato.getExperienciaProfissional().setEmrpesa("SEED");
            candidato.getExperienciaProfissional().setEmpregoAtual(false);
            candidato.getExperienciaProfissional().setSalario(2000.0);
            candidato.getPretencaoSalarial().setPretencaoMaxima(3000.0);
            candidato.getPretencaoSalarial().setPretencaoMinima(1200.0);
            candidato.getPretencaoSalarial().setHabilidades("história");



            StringJoiner sj=  new StringJoiner(";");
            sj.add(getValorValido(candidato.getNome()))
                    .add(getValorValido(candidato.getCpf()))
                    .add(getValorValido(candidato.getNome()))
                    .add(getValorValido(candidato.getCpf()))
                    .add(getValorValido(candidato.getDataNascimentoFormatada()))
                    .add(getValorValido(candidato.getSexo()))
                    .add(getValorValido(candidato.getEndereco().getLogradouro()))
                    .add(getValorValido(candidato.getEndereco().getNumero()))
                    .add(getValorValido(candidato.getEndereco().getBairro()))
                    .add(getValorValido(candidato.getEndereco().getComplemento()))
                    .add(getValorValido(candidato.getEndereco().getCidade().getNome()))
                    .add(getValorValido(candidato.getEndereco().getCidade().getUf()))
                    .add(getValorValido(candidato.getEmail()))
                    .add(getValorValido(candidato.getTelefone().getTelefone().toString()))
                    .add(getValorValido(candidato.getCelular().getTelefone().toString()))
                    .add(getValorValido(candidato.getCelular().getTelefone().toString()))
                    .add(getValorValido(candidato.getCelular().isWhatsapp()))
                    .add(getValorValido(candidato.getExperienciaProfissional().getProfissao()))
                    .add(getValorValido(candidato.getExperienciaProfissional().getEmrpesa()))
                    .add(getValorValido(candidato.getExperienciaProfissional().getSalario().toString()))
                    .add(getValorValido(candidato.getExperienciaProfissional().isEmpregoAtual()))
                    .add(getValorValido(candidato.getPretencaoSalarial().getPretencaoMaxima().toString()))
                    .add(getValorValido(candidato.getPretencaoSalarial().getPretencaoMinima().toString()))
                    .add(getValorValido(candidato.getPretencaoSalarial().getHabilidades()));
            System.out.println( sj.toString());
            ManipuladorArquivo.SalvarArquivo(null, sj.toString());
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