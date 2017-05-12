import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class RockPaperScissorsTest {
    @Test
    public void shouldFinishAsDrawWhenStoneMeetsStone() {
        Object stone = new Object();
        Object firstHand = stone;
        Object secondHand = stone;
        Object result = null;
        Object draw = new Object() {
            @Override
            public String toString() {
                return "draw";
            }
        };

        if (firstHand.equals(secondHand)) {
            result = draw;
        }


        assertThat(result, is(draw));
    }

}
