package Classes;
import java.io.FileWriter;
import java.io.IOException;

class BaseLog {
    protected String logFile = "log.txt";

    protected void writeLog(String message) {
        try (FileWriter writer = new FileWriter(logFile, true)) {
            writer.write(message + "\n");
        } catch (IOException e) {
            System.out.println("Erro ao escrever no arquivo de log: " + e.getMessage());
        }
    }
}

    

