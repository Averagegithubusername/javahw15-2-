package domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Game {
    private List<Player> players = new ArrayList<>();

    public List<Player> getAll() {
        return players;
    }

    public boolean register(Player player) {
        return players.add(player);
    }

    public int round(String playerName1, String playerName2) {
        ArrayList<Player> match = new ArrayList<>();
        for (Player player : players) {
//            if (!player.getName().equals(playerName1)) throw new NotRegisteredException("Player " + playerName1 + " is not registered");
//            if (!player.getName().equals(playerName2)) throw new NotRegisteredException("Player " + playerName2 + " is not registered");
            if (player.getName().equals(playerName1)) {
                Player p1 = player;
                match.add(p1);
            } else {
                throw new NotRegisteredException("Player " + playerName1 + " is not registered");
            }
            if (player.getName().equals(playerName2)) {
                Player p2 = player;
                match.add(p2);
            } else {
                throw new NotRegisteredException("Player " + playerName2 + " is not registered");
            }
        }
        return;
    }
}