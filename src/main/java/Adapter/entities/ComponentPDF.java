package Adapter.entities;

public class ComponentPDF {
    protected String content;

    public void pdfFixedContent(String content) {
        this.content = content;
    }

    public void pdfPrepareDisplay() {
        System.out.println("Affichage PDF : Début");
    }

    public void pdfRefresh() {
        System.out.println("Affichage contenu PDF : " + content);
    }

    public void pdfFinishedDisplay() {
        System.out.println("Affichage PDF : Fin");
    }

    public void pdfSendPrinter() {
        System.out.println("Impression PDF : " + content);
    }
}

