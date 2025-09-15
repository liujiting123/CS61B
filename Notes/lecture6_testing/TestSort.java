import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;
public class TestSort {
    @Test
    public void testSort() {
        String[] input = {"bob", "luka", "joe", "cat"};
        String[] expected = {"bob", "cat", "joe", "luka"};
        Sort.sort(input);
        assertThat(input).isEqualTo(expected);
    }

    @Test
    public void testFindSmallest(){
        String[] input = {"bob", "luka", "joe", "cat"};
        String expected = "bob";

        String actual = Sort.findSmallest(input).value;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testSwap() {
        String[] input = {"bob", "luka", "joe", "cat"};
        String[] expected = {"bob", "cat", "joe", "luka"};
        Sort.swap(input,1,3);
        assertThat(expected).isEqualTo(input);
    }
}
