package br.inatel.cdg.redessociais;

import br.inatel.cdg.interfaces.*;

public class Facebook extends RedeSocial implements VideoConferencia, Compartilhamento {

    public Facebook(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no Facebook!");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou um video no Facebook!");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postou um comentário no Facebook!");
    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhou um post no Facebook!");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Está fazendo Streaming no Facebook!");
    }
}
