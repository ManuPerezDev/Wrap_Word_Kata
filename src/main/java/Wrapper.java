public class Wrapper {
    public static String wrap(String text, int columns){
        if(text == null){
            return "";
        }

        if(columns < 1){
            throw new IllegalArgumentException("Error: no se aceptan enteros menores a uno");
        }

        if(text.contains(" ")){
            String[] arrayWords = text.split(" ");

            for (int i = 0; i < arrayWords.length; i++) {
                if(arrayWords[i].length() > columns){
                    arrayWords[i] = (arrayWords[i].substring(0, columns) + "\n" + arrayWords[i].substring(columns));
                }else{
                    if(i != 0){
                        arrayWords[i] = "\n" + arrayWords[i];
                    }
                }
            }
            return String.join("", arrayWords);
        }

        if(text.length() > columns){
            return text.substring(0, columns) + "\n" + text.substring(columns);
        }
        return text;
    }

}
