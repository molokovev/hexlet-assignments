package exercise;

import static exercise.App.take;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class AppTest {
    @Test
    void take_noElements_zeroCount() {
        List<Integer> expected = new ArrayList<>();

        List<Integer> arg = new ArrayList<>();
        List<Integer> actual = take(arg, 0);

        assertThat(expected).isEqualTo(actual);
    }


    @Test
    void take_noElements_positiveCount() {
        List<Integer> expected = new ArrayList<>();

        List<Integer> arg = new ArrayList<>();
        List<Integer> actual = take(arg, 5);

        assertThat(expected).isEqualTo(actual);
    }

    @Test
    void take_hasElements_zeroCount() {
        List<Integer> expected = new ArrayList<>();

        List<Integer> arg = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> actual = take(arg, 0);

        assertThat(expected).isEqualTo(actual);
    }


    @Test
    void take_hasElements_positiveCount() {
        List<Integer> expected = new ArrayList<>(Arrays.asList(1, 2));

        List<Integer> arg = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> actual = take(arg, 2);

        assertThat(expected).isEqualTo(actual);
    }

    @Test
    void take_hasElements_positiveCount_biggerThanElementsLength() {
        List<Integer> expected = new ArrayList<>(Arrays.asList(1, 2, 3));

        List<Integer> arg = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> actual = take(arg, 10);

        assertThat(expected).isEqualTo(actual);
    }

    @Test
    void take_hasElements_negativeCount() {
        List<Integer> expected = new ArrayList<>();

        List<Integer> arg = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> actual = take(arg, -2);

        assertThat(expected).isEqualTo(actual);
    }
}
