class SqueakyClean {
    static String clean(String identifier) {

        // Substitui espaços por sublinhados
        identifier = identifier.replaceAll("\\s", "_");

        // Converter kaleb-case para camelCase
        StringBuilder camelCase = new StringBuilder();
        boolean proximaLetraGrande = false;

        for (char letra: identifier.toCharArray()){
            if (letra == '-'){
                proximaLetraGrande = true;
            } else {
                if (proximaLetraGrande){
                    camelCase.append(Character.toUpperCase(letra));
                    proximaLetraGrande = false;
                } else {
                    camelCase.append(letra);
                }
            }

        }
        identifier = camelCase.toString();

        // Converter leetspeak em texto normal
        identifier = identifier.replaceAll("4","a");
        identifier = identifier.replaceAll("3","e");
        identifier = identifier.replaceAll("0","o");
        identifier = identifier.replaceAll("1","l");
        identifier = identifier.replaceAll("7","t");

        // Remover caracteres especiais
        identifier = identifier.replaceAll("[^\\w\\s]", "");

        // Retorna a palavra
        return identifier;
    }
}
