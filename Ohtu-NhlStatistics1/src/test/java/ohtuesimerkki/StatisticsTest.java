package ohtuesimerkki;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class StatisticsTest {

    Statistics stats;
    Reader readerStub = new Reader() {

        public List<Player> getPlayers() {
            ArrayList<Player> players = new ArrayList<Player>();

            players.add(new Player("Semenko", "EDM", 4, 12));
            players.add(new Player("Lemieux", "PIT", 45, 54));
            players.add(new Player("Kurri", "EDM", 37, 53));
            players.add(new Player("Yzerman", "DET", 42, 56));
            players.add(new Player("Gretzky", "EDM", 35, 89));

            return players;
        }
    };

    @Before
    public void setUp() {
        stats = new Statistics(readerStub);
    }

    @Test
    public void loytyyAija() {
        Player player = stats.search("Yzerman");
        assertEquals("Yzerman", player.getName());

    }

    @Test
    public void eiLoydyAijaa() {
        Player player = stats.search("Malganiis");
        assertEquals(null, player);
    }

    @Test
    public void loytyyJoukkue() {
        List<Player> players = stats.team("EDM");
        Player player = stats.search("Malganiis");
        assertEquals(3, players.size());
    }

    @Test
    public void parhaatPelaajat() {
        List<Player> players = stats.topScorers(3);
        assertEquals(players.get(0).getName(),"Gretzky");
        assertEquals(players.get(1).getName(),"Lemieux");
        assertEquals(players.get(2).getName(),"Yzerman");
    }

}
