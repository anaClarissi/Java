import java.util.Scanner;
import java.lang.Character;

public class Testes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = in.nextLine();

        // Converter esoaços em snake_case
        palavra = palavra.replaceAll("\\s", "_");

        // Converter kaleb-case em camelCase
        StringBuilder camaelCase = new StringBuilder();
        boolean proximaLetraGrande = false;
        //System.out.println(palavra);

        for (char letra: palavra.toCharArray()){
            if (letra == '-'){
                proximaLetraGrande = true;
            } else {
                if (proximaLetraGrande){
                    camaelCase.append(Character.toUpperCase(letra));
                    proximaLetraGrande = false;
                } else {
                    camaelCase.append(letra);
                }
            }
        }
        palavra = camaelCase.toString();
       // System.out.println(palavra);

        // Converter leetspeak em texto Normal
        StringBuilder textoNormal = new StringBuilder();
        for (char letra: palavra.toCharArray()){
            if (letra == '4'){
                textoNormal.append(palavra.replaceAll("4", "a"));
            } else if (letra == '3') {
                textoNormal.append(palavra.replaceAll("3","e"));
            } else if (letra == '0') {
                textoNormal.append(palavra.replaceAll("0","o"));
            } else if (letra == '1') {
                textoNormal.append(palavra.replaceAll("1", "l"));
            } else if (letra == '7') {
                textoNormal.append(palavra.replaceAll("7","t"));
            }
        }
        palavra = textoNormal.toString();

        System.out.println(palavra);




    }
}
