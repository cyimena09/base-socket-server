package be.cyimena;

import be.cyimena.entity.Voiture;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Main3 {

    /**
     * Lis un objet.
     *
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(1234);
        System.out.println("Le serveur attends la connexion ...");
        Socket s = ss.accept(); // on accepte la connexion lorsque le client enverra une requête

        System.out.println("Connexion d'une machine avec l'IP : " + s.getRemoteSocketAddress());
        InputStream is = s.getInputStream();

        System.out.println("Lecture de l'objet ...");
        ObjectInputStream ois = new ObjectInputStream(is);
        Voiture v = (Voiture) ois.readObject();
        System.out.println(v.marque);
        System.out.println(v.carburant);

        System.out.println("On ferme la connexion.");
        s.close();
    }

}
