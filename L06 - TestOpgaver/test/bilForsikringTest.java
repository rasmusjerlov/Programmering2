import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class bilForsikringTest {
    private bilForsikring mockeddBilForsikring;

    @Test
    void beregnPraemie_under25_kvinde_2år() {
        //Arrange
        bilForsikring bf = new bilForsikring();

        //Act
        bf.setGrundpaemie(1000);

        //Assert
        assertEquals(1187.5, bf.beregnPraemie(24, true, 2));
    }

    @Test
    void beregnPraemie_under25_mand_2år() {
        //Arrange
        bilForsikring bf = new bilForsikring();

        //Act
        bf.setGrundpaemie(1000);

        //Assert
        assertEquals(1250, bf.beregnPraemie(24, false, 2));
    }

    @Test
    void beregnPraemie_over25_kvinde_3år() {
        //Arrange
        bilForsikring bf = new bilForsikring();

        //Act
        bf.setGrundpaemie(1000);

        //Assert
        assertEquals(807.5, bf.beregnPraemie(25, true, 3));
    }

    @Test
    void beregnPraemie_over25_mand_6år() {
        //Arrange
        bilForsikring bf = new bilForsikring();

        //Act
        bf.setGrundpaemie(1000);

        //Assert
        assertEquals(750, bf.beregnPraemie(25, false, 6));

    }

    @Test
    void beregnPraemie_over25_kvinde_8år() {
        //Arrange
        bilForsikring bf = new bilForsikring();

        //Act
        bf.setGrundpaemie(1000);

        //Assert
        assertEquals(712.5, bf.beregnPraemie(26, true, 8));
    }

    @Test
    void beregnPraemie_over25_kvinde_9år() {
        //Arrange
        bilForsikring bf = new bilForsikring();

        //Act
        bf.setGrundpaemie(1000);

        //Assert
        assertEquals(712.5, bf.beregnPraemie(26, true, 8));
    }
}

