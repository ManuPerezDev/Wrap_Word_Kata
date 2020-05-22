

import org.junit.Test;



import static org.assertj.core.api.Assertions.assertThat;

public class WrapperShould {
    /**
     * https://codingdojo.org/kata/WordWrap/
     */

    @Test
    public void not_wrap_word(){
        assertThat(Wrapper.wrap("hola", 5)).isEqualTo("hola");
    }

    @Test
    public void wrap_word(){
        assertThat(Wrapper.wrap("hola", 2)).isEqualTo("ho\nla");
    }

    @Test
    public void consider_null_as_empty_string(){

        assertThat(Wrapper.wrap(null, 4)).isEqualTo("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void not_allow_integer_smaller_than_one(){
        Wrapper.wrap("hola", 0);
    }

    @Test
    public void new_line_if_columns_index_equals_a_second_word(){
        assertThat(Wrapper.wrap("hola que", 6)).isEqualTo("hola\nque");
    }

    @Test
    public void wrap_words_with_index_smaller_than_lenght_and_respect_words_with_index_greater_than_lenght(){
        assertThat(Wrapper.wrap("hola que", 3)).isEqualTo("hol\na\nque");
    }
}
