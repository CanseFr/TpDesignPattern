package Adapter.entities;

import Adapter.interfaces.Document;

public class DocumentHtml implements Document {
    protected String contenu;

    @Override
    public void setContent(String content) {
        this.contenu = content;
    }

    @Override
    public void draw() {
        System.out.println("Dessine document HTML : " + contenu);
    }

    @Override
    public void print() {
        System.out.println("Imprime document HTML : " + contenu);
    }
}

