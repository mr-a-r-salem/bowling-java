# bowling-game
A bowling score calculator that keeps track of the score in each frame.

This code is based on Test-driven development (TDD). Tests are defined under `./main/test/java/BowlingGameTest.java`

## Scoring in bowling

![alt text](./images/BowlingScore.png)

The game consists of 10 frames. In each frame the player has two opportunities to knock down 10 pins.  The score for the frame is the total number of pins knocked down, plus bonuses for strikes and spares.

A spare (denoted by /) is when the player knocks down all 10 pins in two tries.  The bonus for that frame is the number of pins knocked down by the next roll. So in frame 3 above, the score is 10 (the total number knocked down) plus a bonus of 5 (the number of pins knocked down on the next roll.)

A strike (denoted by x) is when the player knocks down all 10 pins on his first try.  The bonus for that frame is the value of the next two balls rolled.

In the tenth frame a player who rolls a spare or strike is allowed to roll the extra balls to complete the frame.  However no more than three balls can be rolled in tenth frame.
