/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author edu
 */
public class ExpresionesRegulares {

    public static void main(String[] args) {
        System.out.println("Ej 1");
        String autoPista = "AP-77";
        System.out.println(nombreAutopista(autoPista));
        System.out.println("Ej 2");
        String matricula = "1241AFL";
        System.out.println(numMatricula(matricula));
        System.out.println("Ej 3");
        String lt = "d1l4p9";
        System.out.println(letraNumero(lt));
        System.out.println("Ej 4");
        String codigoPostal = "29670";
        System.out.println(codPostal(codigoPostal));
        System.out.println("Ej 5");
        String pasen = "ecorara446";
        System.out.println(iPasen(pasen));
        System.out.println("Ej 6");
        String palabra = "ABCDE";
        System.out.println(tamaño5NiFRK(palabra));
        System.out.println("Ej 7");
        String hardSoft = "sfsagsagsaSoftwarefsfafsagaf341hardware";
        System.out.println(hardwareSoftware(hardSoft));
    }

    private static boolean nombreAutopista(String autopista) {
        boolean match = false;
        if (autopista.matches("^AP-\\d{1,}$")) {
            match = true;
        }
        return match;
    }

    private static boolean numMatricula(String matricula) {
        boolean encontrado = false;
        Pattern padre = Pattern.compile("^\\d{4}[A-Z]{3}$");
        Matcher madre = padre.matcher(matricula);
        if (madre.matches()) {
            encontrado = true;
        }

        return encontrado;
    }

    private static boolean letraNumero(String letraNum) {
        boolean encontrado = false;
        Pattern padre = Pattern.compile("[a-z]{1}[0-9]{1}");
        Matcher madre = padre.matcher(letraNum);
        if (madre.find()) {
            encontrado = true;
        }

        return encontrado;
    }

    private static boolean codPostal(String cP) {
        boolean encontrado = false;
        Pattern padre = Pattern.compile("^\\d{5}$");
        Matcher madre = padre.matcher(cP);
        if (madre.matches()) {
            return encontrado = true;
        }
        return encontrado;
    }

    private static boolean iPasen(String usuario) {
        boolean encontrado = false;
        Pattern padre = Pattern.compile("^([a-z]{7}|[a-z]{8})\\d{3}$");
        Matcher madre = padre.matcher(usuario);
        if (madre.matches()) {
            encontrado = true;
        }
        return encontrado;
    }

    private static boolean tamaño5NiFRK(String patron) {
        boolean match = false;
        if (patron.matches("[ABCDEGHIJLMNÑOPQSTUVWXYZ]{5}")) {
            match = true;
        }
        return match;
    }

    private static boolean hardwareSoftware(String hS) {
        boolean encontrado = false;
        Pattern padre = Pattern.compile("[hH]ardware|[sS]oftware");
        Matcher madre = padre.matcher(hS);
        while (madre.find()) {
            encontrado = true;
        }
        return encontrado;
    }
}
