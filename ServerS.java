package Sprint4.Övningar.ClientServer.Telefonbok;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerS {
    //Gör även en server-klass som tar emot anrop från klienten och skickar
    //tillbaka svar.

    Database d = new Database();

    public ServerS(){
        int port = 46543;


        try (
            ServerSocket serverSocket = new ServerSocket(port);
            Socket clientSocket = serverSocket.accept();
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        ) {

            String databasAnswer;

            out.println("Vad heter kompis?");
            String inputLine = "";

            while ((inputLine = in.readLine()) != null) {
                databasAnswer = d.search(inputLine.trim());
                /*String databasAnswer = d.kompisInfo(inputLine.trim());
                out.println(databasAnswer);*/
                if (databasAnswer == null) {
                    out.println("Denna kompis finns inte i databasen: " + inputLine);
                }
                else {
                    out.println(databasAnswer);
                }
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
        public static void main(String[] args) {
            ServerS s = new ServerS();
        }

}