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
    private Object firstHandWins = new Object() {
        @Override
        public String toString() {
            return "first hand wins";
        }
    };
    private Object firstHand;
    private Object secondHand;

    private Object playDraw() {
        if (firstHand.equals(secondHand)) {
            return draw;
        }
        return null;
    }

    @Test
    public void shouldFinishAsDrawWhenStoneMeetsStone() {
        Object stone = new Object();
        firstHand = stone;
        secondHand = stone;

        Object result = playDraw();

        assertThat(result, is(draw));
    }

    @Test
    public void shouldFinishAsDrawWhenPaperMeetsPaper() {
        Object paper = new Object();
        firstHand = paper;
        secondHand = paper;

        Object result = playDraw();

        assertThat(result, is(draw));
    }

    @Test
    public void shouldFinishAsDrawWhenScissorsMeetsScissors() {
        Object scissors = new Object();
        firstHand = scissors;
        secondHand = scissors;

        Object result = playDraw();

        assertThat(result, is(draw));
    }

    @Test
    public void shouldFinishAsWinFirstHandWhenPaperMeetsStone() {
        Object paper = new Object();
        Object stone = new Object();
        firstHand = paper;
        secondHand = stone;

        Object result = null;
        if (!firstHand.equals(secondHand)) {
            result = firstHandWins;
        }

        assertThat(result, is(firstHandWins));
    }
}
