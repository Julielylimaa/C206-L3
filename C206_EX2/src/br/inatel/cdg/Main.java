package br.inatel.cdg;

import br.inatel.cdg.redessociais.*;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        RedeSocial[] redesSociais = new RedeSocial[4];
        RedeSocial facebook = new Facebook("12345", 45);
        RedeSocial twitter = new Twitter("45678", 65);


        redesSociais[0] = facebook;
        redesSociais[1] = twitter;

        List<Usuario> usuarios = new ArrayList<>();
        Usuario user1 = new Usuario("João Santos", "joaosantos@gmail.com", redesSociais);
        usuarios.add(user1);

        for (Usuario user : usuarios) {
            try {
                System.out.println("Informações do Usuário: \nNome: " +user.getNome() +"    Email: " + user.getEmail());

                for (RedeSocial redes : user.redesSociais) {
                    if (redes instanceof Facebook) {
                        System.out.println("\nFacebook de "+user.getNome());
                        Facebook fb = (Facebook) redes;
                        fb.curtirPublicacao();
                        fb.fazStreaming();
                        fb.postarComentario();
                    } else if (redes instanceof Twitter) {
                        System.out.println("\nTwitter de " +user.getNome());
                        Twitter tt = (Twitter) redes;
                        tt.compartilhar();
                        tt.postarComentario();
                        tt.postarFoto();
                    }else if (redes instanceof GooglePlus) {
                        System.out.println("\nGooglePlus de " + user.getNome());
                        GooglePlus googleplus = (GooglePlus) redes;
                        googleplus.fazStreaming();
                        googleplus.postarVideo();
                        googleplus.curtirPublicacao();
                    }else if (redes instanceof Instagram) {
                        System.out.println("\nInstagram de " + user.getNome());
                        redes.postarFoto();
                        redes.postarVideo();
                        redes.postarComentario();
                    }
                }
                System.out.println("------------------------------------");
            } catch (NullPointerException e) {
                System.out.println("Não foi possível executar a ação!");
            }
        }
    }
}