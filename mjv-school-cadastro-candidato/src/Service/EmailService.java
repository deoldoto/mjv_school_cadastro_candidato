package Service;

import Beans.Email;
import Utilitarios.Utilitario;

import java.util.StringJoiner;

public class EmailService {

    public static  void PreencherEmailNoArquivo(Email email, StringJoiner arquivo){
        arquivo.add(Utilitario.getValorValido(email.getEmail()));
    }
}
