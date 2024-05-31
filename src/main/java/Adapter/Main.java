package Adapter;

import Adapter.art.Asci;
import Adapter.entities.ComponentPDF;
import Adapter.entities.DocumentHtml;
import Adapter.entities.DocumentPdfAdapter;
import Adapter.interfaces.Document;

public class Main {
    public static void main(String[] args) {
        System.out.println("Exercice 5 : Adapter. \n");

        Document documentHtml = new DocumentHtml();
        documentHtml.setContent("Contenu du document HTML");
        documentHtml.draw();
        documentHtml.print();

        ComponentPDF composantPdf = new ComponentPDF();
        Document documentPdf = new DocumentPdfAdapter(composantPdf);
        documentPdf.setContent("Contenu du document PDF");
        documentPdf.draw();
        documentPdf.print();

        Asci.asci();

    }
}