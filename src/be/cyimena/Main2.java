package be.cyimena;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Main2 {

    /**
     * Lis un ensemble de chaine de charactère
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(1234);
        System.out.println("J'attends la connexion ...");
        Socket s = ss.accept(); // on accepte la connexion lorsque le client enverra une requête

        System.out.println("Connexion d'une machine avec l'IP : " + s.getRemoteSocketAddress());
        InputStream is = s.getInputStream();
        OutputStream os = s.getOutputStream();

        System.out.println("J'attends que le client envoie une donnée ...");
        InputStreamReader isr = new InputStreamReader(is); // permet de lire 32 bits (un caractère)
        BufferedReader br = new BufferedReader(isr); // permet de lire une chaine de caractère
        String data = br.readLine();
        System.out.println("On a reçu une chaine de caractère : " + data);

        System.out.println("On ferme la connexion.");
        s.close();
    }

}
