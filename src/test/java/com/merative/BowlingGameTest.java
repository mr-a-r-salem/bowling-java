package com.merative;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Use http://www.fryes4fun.com/Bowling/scoring.htm for an overview of how to calculate scores
 * See https://www.bowlinggenius.com/ for a working example of a bowling score simulator
 */
public class BowlingGameTest {
    @Test
    public void testScoreNewGame() {
        BowlingGame game = new BowlingGame();
        assertEquals(0, game.score());
    }

    @Test
    public void testScoreFirstFrame() {
        BowlingGame game = new BowlingGame();
        game.bowl(2);
        game.bowl(3);
        assertEquals(5, game.score());
    }

    @Test
    public void testIncompleteFrameHasNoScore() {
        BowlingGame game = new BowlingGame();
        game.bowl(2);
        assertEquals(0, game.score());
    }

    @Test
    public void testGutterBall() {
        BowlingGame game = new BowlingGame();
        game.bowl(0);
        game.bowl(2);
        assertEquals(2, game.score());
    }

    // @Test
    // public void testChainingBowlMethods() {
    //     BowlingGame game = new BowlingGame()
    //         .bowl(0)
    //         .bowl(2)
    //         .bowl(3)
    //         .bowl(4);
    //     assertEquals(9, game.score());
    // }

    // @Test
    // public void testIncompleteSpareFrame() {
    //     BowlingGame game = new BowlingGame()
    //             .bowl(0)
    //             .bowl(10);
    //     assertEquals(0, game.score());
    // }

    // @Test
    // public void testCompleteSpareFrame() {
    //     BowlingGame game = new BowlingGame()
    //             .bowl(1)
    //             .bowl(9)
    //             .bowl(3);
    //     assertEquals(13, game.score());
    // }

    // @Test
    // public void testCompleteSpareFrameLaterInGame() {
    //     BowlingGame game = new BowlingGame()
    //             .bowl(1)
    //             .bowl(3)
    //             .bowl(1)
    //             .bowl(9)
    //             .bowl(3);
    //     assertEquals(17, game.score());
    // }

    // @Test
    // public void testCompleteStrike() {
    //     BowlingGame game = new BowlingGame()
    //             .bowl(10)
    //             .bowl(5)
    //             .bowl(3);
    //     assertEquals(26, game.score());
    // }

    // @Test
    // public void testIncompleteStrikeOneThrow() {
    //     BowlingGame game = new BowlingGame()
    //         .bowl(10);
    //     assertEquals(0, game.score());
    // }

    // @Test
    // public void testIncompleteStrikeTwoThrows() {
    //     BowlingGame game = new BowlingGame()
    //             .bowl(10)
    //             .bowl(1);
    //     assertEquals(0, game.score());
    // }

    // @Test
    // public void testIncompleteStrikeThreeThrows() {
    //     BowlingGame game = new BowlingGame()
    //             .bowl(10)
    //             .bowl(1)
    //             .bowl(8);
    //     assertEquals(28, game.score());
    // }

    // @Test
    // public void testCompleteStrikeAndIncompleteSpare() {
    //     BowlingGame game = new BowlingGame()
    //             .bowl(10)
    //             .bowl(9)
    //             .bowl(1);
    //     assertEquals(20, game.score());
    // }

    // @Test
    // public void testCompleteAndIncompleteStrike() {
    //     BowlingGame game = new BowlingGame()
    //             .bowl(10)
    //             .bowl(10)
    //             .bowl(8);
    //     assertEquals(28, game.score());
    // }

    // @Test
    // public void testCompleteTripleStrikeAndSpares() {
    //     BowlingGame game = new BowlingGame()
    //             .bowl(10)
    //             .bowl(10)
    //             .bowl(10)
    //             .bowl(9)
    //             .bowl(1)
    //             .bowl(6)
    //             .bowl(3);
    //     assertEquals(104, game.score());
    // }
}