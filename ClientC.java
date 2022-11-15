package Sprint4.Övningar.ClientServer.Telefonbok;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientC {

    public ClientC (){
    //På klient-sidan: Gör en klient-app som anropar servern och skickar över
        //ett namn (som en String). När serverns svar kommer ska klienten skriva ut
        //detta i consolen.

        try(
            Socket s = new Socket("127.0.0.1", 46543);
            PrintWriter out = new PrintWriter(s.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
        ){

            String fromServer = "";
            String fromUser = "";

            fromServer = in.readLine();
            System.out.println(fromServer);

            while((fromUser = userInput.readLine()) != null){

                out.println(fromUser);
                System.out.println("Sent to server: "+fromUser);

                fromServer = in.readLine();
                System.out.println(fromServer);

            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }

    public static void main(String[] args) {
        ClientC k = new ClientC();

    }

}
