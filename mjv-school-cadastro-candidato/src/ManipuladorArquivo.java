import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ManipuladorArquivo {

    private static Path arquivoPadrao = Paths.get("c:\\jobby\\files\\cadastro.csv");

    public static void SalvarArquivo(Path arquivoDestino, String conteudo){
        Path arquivoSalvar = arquivoDestino;
        if (arquivoSalvar == null)
            arquivoSalvar = arquivoPadrao;
        String texto = conteudo +System.lineSeparator();
        try {
            Files.write(arquivoSalvar, texto.getBytes(StandardCharsets.UTF_8), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
