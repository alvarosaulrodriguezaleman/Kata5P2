package main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import model.Mail;
import view.HistogramDisplay;
import view.MailHistogramBuilder;
import view.MailListReader;

public class Kata4 {

    public static void main(String[] args) {
        List<Mail> arr = new ArrayList<Mail>();
        try {
            arr = new MailListReader().read("email.txt");
        } catch (IOException ex) {
            System.out.println("No se pudo leer el fichero: " + ex);
        }
        new HistogramDisplay(new MailHistogramBuilder().build(arr)).execute();
    }
    
}