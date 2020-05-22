

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WrapWordShould {
    /**
     * https://codingdojo.org/kata/WordWrap/
     */

    @Test
    public void not_wrap_word(){
        assertThat(wordWrap("hola", 5)).isEqualTo("hola");
    }

    @Test
    public void wrap_word(){
        assertThat(wordWrap("hola", 2)).isEqualTo("ho\nla");
    }

    @Test
    public void consider_null_as_empty_string(){

        assertThat(wordWrap(null, 4)).isEqualTo("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void not_allow_integer_smaller_than_one(){
        wordWrap("hola", 0);
    }

    public String wordWrap(String text, int columns){
        if(text == null){
            return "";
        }

        if(columns < 1){
            throw new IllegalArgumentException("Error: no se aceptan enteros menores a uno");
        }

        int textLength = text.length();

        if(textLength > columns){
            return text.substring(0, columns) + "\n" + text.substring(columns);
        }

        return text;
    }
}
