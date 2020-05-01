package ch.so.agi.oereb.pdf4oereb;

import com.itextpdf.io.font.constants.StandardFonts;
import com.itextpdf.kernel.colors.ColorConstants;
import com.itextpdf.kernel.colors.DeviceRgb;
import com.itextpdf.kernel.events.Event;
import com.itextpdf.kernel.events.IEventHandler;
import com.itextpdf.kernel.events.PdfDocumentEvent;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.geom.Rectangle;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfName;
import com.itextpdf.kernel.pdf.PdfOutline;
import com.itextpdf.kernel.pdf.PdfPage;
import com.itextpdf.kernel.pdf.PdfString;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.kernel.pdf.action.PdfAction;
import com.itextpdf.kernel.pdf.canvas.PdfCanvas;
import com.itextpdf.kernel.pdf.canvas.draw.DottedLine;
import com.itextpdf.kernel.pdf.navigation.PdfDestination;
import com.itextpdf.kernel.pdf.navigation.PdfExplicitDestination;
import com.itextpdf.kernel.pdf.xobject.PdfFormXObject;
import com.itextpdf.layout.Canvas;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.AreaBreak;
//import com.itextpdf.layout.element.List;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Tab;
import com.itextpdf.layout.element.TabStop;
import com.itextpdf.layout.hyphenation.HyphenationConfig;
import com.itextpdf.layout.layout.LayoutContext;
import com.itextpdf.layout.layout.LayoutResult;
import com.itextpdf.layout.property.AreaBreakType;
import com.itextpdf.layout.property.TabAlignment;
import com.itextpdf.layout.property.TextAlignment;
import com.itextpdf.layout.renderer.ParagraphRenderer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.AbstractMap.SimpleEntry;

public class Converter {
    Logger log = LoggerFactory.getLogger(Converter.class);
    
    public static final String SRC = "src/test/data/jekyll_hyde.txt";
    public static final String DEST = "/Users/stefan/tmp/fubar.pdf";

    public void runXml2Pdf() throws IOException {
        log.info("Start xml2pdf");

        

        /*
        File file = new File(DEST);

        //Initialize PDF document
        PdfDocument pdf = new PdfDocument(new PdfWriter(DEST));
        
        // Initialize document
        Document document = new Document(pdf);
        PdfFont font = PdfFontFactory.createFont(StandardFonts.TIMES_ROMAN);
        PdfFont bold = PdfFontFactory.createFont(StandardFonts.HELVETICA_BOLD);
        document.setTextAlignment(TextAlignment.JUSTIFIED)
            .setHyphenation(new HyphenationConfig("en", "uk", 3, 3))
            .setFont(font)
            .setFontSize(11);
        
        BufferedReader br = new BufferedReader(new FileReader(SRC));
        String name, line;
        Paragraph p;
        boolean title = true;
        int counter = 0;
        List<SimpleEntry<String, Integer>> toc = new ArrayList<>();
        while ((line = br.readLine()) != null) {
            p = new Paragraph(line);
            p.setKeepTogether(true);
            if (title) {
                name = String.format("title%02d", counter++);
                p.setFont(bold).setFontSize(12)
                    .setKeepWithNext(true)
                    .setDestination(name);
                title = false;
                document.add(p);
                // The following line is problematic when using setKeepWithNext
                toc.add(new SimpleEntry(line, pdf.getNumberOfPages()));
            }
            else {
                p.setFirstLineIndent(36);
                if (line.isEmpty()) {
                    p.setMarginBottom(12);
                    title = true;
                }
                else {
                    p.setMarginBottom(0);
                }
                document.add(p);
            }
        }
        
        document.add(new AreaBreak(AreaBreakType.NEXT_PAGE));
        
        p = new Paragraph().setFont(bold).add("Table of Contents");
        document.add(p);
        
        toc.remove(0);
        List<TabStop> tabstops = new ArrayList();
        tabstops.add(new TabStop(580, TabAlignment.RIGHT, new DottedLine()));
        for (SimpleEntry<String, Integer> entry : toc) {
            p = new Paragraph()
                .addTabStops(tabstops)
                .add(entry.getKey())
                .add(new Tab())
                .add(String.valueOf(entry.getValue()))
                .setAction(PdfAction.createGoTo(
                        PdfExplicitDestination.createFit(pdf.getPage(entry.getValue()))));
            document.add(p);
        }
        
        //Close document
        document.close();
        */

        /*
        File file = new File(DEST);
        PdfWriter writer = new PdfWriter(DEST);

        //Initialize PDF document
        PdfDocument pdf = new PdfDocument(writer);

        HeaderFooterHandler handler = new HeaderFooterHandler();
        pdf.addEventHandler(PdfDocumentEvent.START_PAGE, handler);
        handler.setInfo("cool info");

        // Initialize document
        Document document = new Document(pdf);

        //Add paragraph to the document
        document.add(new Paragraph("Hello World!"));

        
        Paragraph preface = new Paragraph();
        preface.add(new Paragraph("Title of the document"));
        preface.add(new Paragraph( "This document is a preliminary version and not subject to your license agreement or any other agreement with vogella.com ;-)."));
        preface.setBackgroundColor(new DeviceRgb(255, 100, 20));
        document.add(preface);
        
        Paragraph foo = new Paragraph();
        foo.add(new Paragraph("Title of the document"));
        foo.add(new Paragraph( "This document is a preliminary version and not subject to your license agreement or any other agreement with vogella.com ;-)."));
        foo.setBackgroundColor(ColorConstants.MAGENTA);
        document.add(foo);

        document.add(new AreaBreak(AreaBreakType.NEXT_PAGE));

        Paragraph bar = new Paragraph();
        bar.add(new Paragraph("Title of the document"));
        bar.add(new Paragraph( "This document is a preliminary version and not subject to your license agreement or any other agreement with vogella.com ;-)."));
        bar.setBackgroundColor(ColorConstants.GREEN);
        document.add(bar);

        
        //Close document
        document.close();
        */

    }
}
