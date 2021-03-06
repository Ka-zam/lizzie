package wagner.stephanie.lizzie.theme;

import wagner.stephanie.benchmark.Stopwatch;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


/**
 * DefaultTheme
 */
public class DefaultTheme implements ITheme {
    BufferedImage blackStoneCached = null;
    BufferedImage whiteStoneCached = null;
    BufferedImage boardCached = null;
    BufferedImage backgroundCached = null;

    @Override
    public BufferedImage getBlackStone(int[] position) {
        if (blackStoneCached == null) {
            try {
                blackStoneCached = ImageIO.read(new File("assets/black0.png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return blackStoneCached;
    }

    @Override
    public BufferedImage getWhiteStone(int[] position) {
        if (whiteStoneCached == null) {
            try {
                whiteStoneCached = ImageIO.read(new File("assets/white0.png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return whiteStoneCached;
    }

    @Override
    public BufferedImage getBoard() {
        if (boardCached == null) {
            try {
                boardCached = ImageIO.read(new File("assets/board.png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return boardCached;
    }

    @Override
    public BufferedImage getBackground() {
        if (backgroundCached == null) {
            try {
                backgroundCached = ImageIO.read(new File("assets/background.jpg"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return backgroundCached;
    }
}