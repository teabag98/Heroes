import org.junit.Test;
import static org.junit.Assert.*;

public class HeroesTest {

    @Test
   public void Hero_instenciatesHero_String(){
        Hero myHero = new Hero("eric");
        assertEquals("eric",myHero.getName());

    }
}
