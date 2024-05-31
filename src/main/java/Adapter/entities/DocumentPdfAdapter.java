package Adapter.entities;

import Adapter.interfaces.Document;

public class DocumentPdfAdapter implements Document {
    private final ComponentPDF composantPdf;

    public DocumentPdfAdapter(ComponentPDF composantPdf) {
        this.composantPdf = composantPdf;
    }

    @Override
    public void setContent(String content) {
        composantPdf.pdfFixedContent(content);
    }

    @Override
    public void draw() {
        composantPdf.pdfPrepareDisplay();
        composantPdf.pdfRefresh();
        composantPdf.pdfFinishedDisplay();
    }

    @Override
    public void print() {
        composantPdf.pdfSendPrinter();
    }
}

