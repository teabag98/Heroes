import org.junit.Test;
import static org.junit.Assert.*;

public class HeroesTest {

    @Test
   public void Hero_instenciatesHeroCorrectly_true(){
        Hero myHero = new Hero("eric",19,"thinker","human");
        assertEquals(true,myHero instanceof Hero );

    }
    @Test
    public void Hero_instanciatesName_String(){
        Hero myHero = new Hero("eric",19,"thinker","human");
        assertEquals("eric",myHero.getName());

    }
    @Test
    public void Hero_instantiatesAge_Int(){
        Hero myHero = new Hero("eric",29,"thinker","human");
        assertEquals(29, myHero.getAge());
    }

}
