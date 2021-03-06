package dograce;

import dograce.models.Dog;
import dograce.models.Player;
import javafx.scene.paint.Color;

import java.util.Observable;

public class DogRaceGame implements IDogRaceGame
{
    private Player player;
    private Player opponent;

    @Override
    public void notifyWhenReady(int playerNr)
    {

    }

    @Override
    public void registerPlayer(String name, String password)
    {
        player = new Player(name, password);
    }

    @Override
    public void startGame() {

    }

    @Override
    public void endGame() {

    }

    @Override
    public void readyPlayer(int playerNr) {

    }

    @Override
    public void saveDog(String name, Color color)
    {
        player.setDog(new Dog(name, color));
    }

    @Override
    public double moveDog(double currentPos)
    {
        player.getDog().setPosX(currentPos + player.getDog().getSpeed());
        return player.getDog().getPosX();
    }

    public double sendPos()
    {
        return player.getDog().getPosX();
    }
}
