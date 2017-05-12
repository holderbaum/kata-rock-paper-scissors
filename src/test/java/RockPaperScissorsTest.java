import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class RockPaperScissorsTest {

    private final Object draw = new Object() {
        @Override
        public String toString() {
            return "draw";
        }
    };
    private Object firstHand;
    private Object secondHand;

    private Object play() {
        Object result = null;

        if (firstHand.equals(secondHand)) {
            result = draw;
        }
        return result;
    }

    @Test
    public void shouldFinishAsDrawWhenStoneMeetsStone() {
        Object stone = new Object();
        firstHand = stone;
        secondHand = stone;

        Object result = play();

        assertThat(result, is(draw));
    }

    @Test
    public void shouldFinishAsDrawWhenPaperMeetsPaper() throws Exception {
        Object paper = new Object();
        firstHand = paper;
        secondHand = paper;

        Object result = play();

        assertThat(result, is(draw));
    }

    @Test
    public void shouldFinishAsDrawWhenScissorsMeetsScissors() throws Exception {
        Object scissors = new Object();
        firstHand = scissors;
        secondHand = scissors;

        Object result = play();

        assertThat(result, is(draw));
    }


}
