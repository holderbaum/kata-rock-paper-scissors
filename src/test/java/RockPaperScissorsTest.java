import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class RockPaperScissorsTest {

    enum Result {
        DRAW,
        FIRST_HAND_WINS,
        SECOND_HAND_WINS
    }

    private Object firstHand;
    private Object secondHand;

    private Object playDraw() {
        if (firstHand.equals(secondHand)) {
            return Result.DRAW;
        }
        return null;
    }

    @Test
    public void shouldFinishAsDrawWhenStoneMeetsStone() {
        Object stone = new Object();
        firstHand = stone;
        secondHand = stone;

        Object result = playDraw();

        assertThat(result, is(Result.DRAW));
    }

    @Test
    public void shouldFinishAsDrawWhenPaperMeetsPaper() {
        Object paper = new Object();
        firstHand = paper;
        secondHand = paper;

        Object result = playDraw();

        assertThat(result, is(Result.DRAW));
    }

    @Test
    public void shouldFinishAsDrawWhenScissorsMeetsScissors() {
        Object scissors = new Object();
        firstHand = scissors;
        secondHand = scissors;

        Object result = playDraw();

        assertThat(result, is(Result.DRAW));
    }

    @Test
    public void shouldFinishAsWinFirstHandWhenPaperMeetsStone() {
        Object paper = new Object();
        Object stone = new Object();
        firstHand = paper;
        secondHand = stone;

        Object result = null;
        if (!firstHand.equals(secondHand)) {
            result = Result.FIRST_HAND_WINS;
        }

        assertThat(result, is(Result.FIRST_HAND_WINS));
    }

    @Test
    public void shouldFinishAsWinSecondHandWhenStoneMeetsPaper() {
        Object paper = new Object();
        Object stone = new Object();
        firstHand = stone;
        secondHand = paper;

        Object result = null;
        if (!firstHand.equals(secondHand)) {
            result = Result.SECOND_HAND_WINS;
        }

        assertThat(result, is(Result.SECOND_HAND_WINS));
    }
}
