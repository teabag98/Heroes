import org.junit.Test;
import static org.junit.Assert.*;



public class SquadTest {
    @Test
    public void Squad_instantiatesCorrectly_true() {
        Squad mySquad = new Squad("Wakanda", 5, "protection");
        assertEquals(true, mySquad instanceof Squad);
    }

    @Test
    public void Squad_instantiatesWithName_String() {
        Squad mySquad = new Squad("wakanda", 5, "protection");
        assertEquals("wakanda", mySquad.getName());
    }

    @Test
    public void Squad_instantiatesWithSize_Int() {
        Squad mySquad = new Squad("wakanda", 5, "protection");
        assertEquals(5, mySquad.getSize());
    }

}
