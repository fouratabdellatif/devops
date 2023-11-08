package tn.esprit.rh.achat;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tn.esprit.rh.achat.entities.Operateur;
import tn.esprit.rh.achat.repositories.OperateurRepository;
import tn.esprit.rh.achat.services.OperateurServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class OperateurTest {
    @Autowired
    private OperateurRepository operateurRepository;

    @Autowired
    private OperateurServiceImpl operateurService;

/*     @Test
    public void testAddOperateur() {
        Operateur operateur = new Operateur();
        operateur.setNom("Abdellatif");
        operateur.setPrenom("Fourat");
        operateur.setPassword("Fourat12");

        Operateur addedOperateur = operateurService.addOperateur(operateur);

        assertNotNull(addedOperateur.getIdOperateur());
        assertEquals("Abdellatif", addedOperateur.getNom());
        assertEquals("Fourat", addedOperateur.getPrenom());
        assertEquals("Fourat12", addedOperateur.getPassword());
    }

    @Test
    public void testUpdateOperateur() {
        Operateur operateur = new Operateur();
        operateur.setIdOperateur(1L); // Assuming an Operateur with ID 1 exists in the database
        operateur.setNom("Fourat");

        Operateur updatedOperateur = operateurService.updateOperateur(operateur);

        assertEquals("Fourat", updatedOperateur.getNom());
    }

    @Test
    public void testRetrieveOperateur() {
        // Assuming an Operateur with ID 1 exists in the database
        Long id = 1L;

        Operateur operateur = operateurService.retrieveOperateur(id);

        // assertNotNull(operateur);
        //assertEquals("Fakher", operateur.getNom()); // Adjust the expected values
    }
  /*  @Test
    public void testDeleteOperateur() {
        // Assuming an Operateur with ID 1 exists in the database
        Long id = 5L;

        operateurService.deleteOperateur(id);

        // Verify that the Operateur is deleted (you can use Mockito to verify the delete method was called)
    }*/
}
