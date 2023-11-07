/*package tn.esprit.rh.achat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import tn.esprit.rh.achat.entities.Produit;
import tn.esprit.rh.achat.repositories.ProduitRepository;
import tn.esprit.rh.achat.services.ProduitServiceImpl;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ProduitServiceTest {

    @Autowired
    private ProduitServiceImpl produitService;

    @Autowired
    private ProduitRepository produitRepository;

    @Test
    public void testAddProduit() {
        Produit produit = new Produit();
        produit.setCodeProduit("P001");
        produit.setLibelleProduit("Test Product");
        produit.setPrix(10.0f); // Set any necessary fields

        Produit savedProduit = produitService.addProduit(produit);
        assertNotNull(savedProduit.getIdProduit());
    }

    @Test
    public void testRetrieveAllProduits() {
        List<Produit> allProduits = produitService.retrieveAllProduits();
    }

    @Test
    public void testRetrieveProduit() {
        Produit retrievedProduit = produitService.retrieveProduit(2L); // Replace with an existing ID
        assertNotNull(retrievedProduit);
    }

    @Test
    public void testUpdateProduit() {
        Produit retrievedProduit = produitService.retrieveProduit(2L); // Replace with an existing ID
        retrievedProduit.setLibelleProduit("Updated Product");
        Produit updatedProduit = produitService.updateProduit(retrievedProduit);
        assertEquals("Updated Product", updatedProduit.getLibelleProduit());
    }

    @Test
    public void testDeleteProduit() {
        produitService.deleteProduit(5L); // Replace with an existing ID
        Produit deletedProduit = produitService.retrieveProduit(5L); // Replace with an existing ID
        assertNull(deletedProduit);
    }

    @Test
    public void testAssignProduitToStock() {
        // Replace with actual IDs
        Long produitId = 2L;
        Long stockId = 1L;
        produitService.assignProduitToStock(produitId, stockId);
        Produit produit = produitService.retrieveProduit(produitId);
        assertEquals(stockId, produit.getStock().getIdStock()); // Assuming this is how you're associating with a stock
    }
}
*/