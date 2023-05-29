package br.inatel.cdg.redessociais;

import br.inatel.cdg.interfaces.*;

public class GooglePlus extends RedeSocial implements VideoConferencia, Compartilhamento {
    public GooglePlus(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no GooglePlus!");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou um video no GooglePlus!");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postou um comentário no GooglePlus!");
    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhou um post no GooglePlus!");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Está fazendo um Streaming no GooglePlus!");
    }
}
