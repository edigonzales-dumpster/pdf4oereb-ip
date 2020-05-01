package ch.so.agi.oereb.pdf4oereb;

import java.io.FileNotFoundException;
import java.io.IOException;

public class App {

    public static void main(String[] args) throws IOException {
        Converter converter =  new Converter();
        converter.runXml2Pdf();

    }
}
