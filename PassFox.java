import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PassFox {
    public static String gerarSenha(int quant) {
        List<Character> chars = new ArrayList<>();
        String caracteres = "0123456789+-*/abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ'!@#$%¨&()_}{[];,.";
        for (int i = 0; i < caracteres.length(); i++) {
            chars.add(caracteres.charAt(i));
        }
        Collections.shuffle(chars);
        List<Character> totel = chars.subList(0, quant);

        StringBuilder senha = new StringBuilder();
        for (Character c : totel) {
            senha.append(c);
        }
        return senha.toString();
    }

    public static void main(String[] args) {

    }
}

