package br.inatel.cdg.redessociais;

import br.inatel.cdg.interfaces.Compartilhamento;

public class Twitter extends RedeSocial implements Compartilhamento {
    public Twitter(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no Twitter!");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou um video no Twitter!");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postou um comentário no Twitter!");
    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhou um post no Twitter!");
    }
}
