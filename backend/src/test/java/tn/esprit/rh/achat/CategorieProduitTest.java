package tn.esprit.rh.achat;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import tn.esprit.rh.achat.entities.CategorieProduit;
import tn.esprit.rh.achat.repositories.CategorieProduitRepository;
import tn.esprit.rh.achat.services.CategorieProduitServiceImpl;
import java.util.Optional;

public class CategorieProduitTest {

    @InjectMocks
    private CategorieProduitServiceImpl categorieProduitService;

    @Mock
    private CategorieProduitRepository categorieProduitRepository;

    @BeforeEach
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testRetrieveCategorieProduit() {
        // Créer une catégorie de produit factice pour le test
        CategorieProduit categorieProduit = new CategorieProduit();
        categorieProduit.setIdCategorieProduit(1L);

        // Configurer le comportement du mock Repository pour retourner la catégorie de produit factice
        Mockito.when(categorieProduitRepository.findById(1L)).thenReturn(Optional.of(categorieProduit));

        // Appeler la méthode de service à tester
        CategorieProduit result = categorieProduitService.retrieveCategorieProduit(1L);

        // Vérifier si la catégorie de produit retournée par le service est la même que celle factice
        assertEquals(categorieProduit, result);
    }

    @Test
    public void testAddCategorieProduit() {
        // Créer une catégorie de produit factice pour le test
        CategorieProduit categorieProduit = new CategorieProduit();
        categorieProduit.setIdCategorieProduit(1L);

        // Configurer le comportement du mock Repository pour sauvegarder la catégorie de produit factice
        Mockito.when(categorieProduitRepository.save(Mockito.any(CategorieProduit.class))).thenReturn(categorieProduit);

        // Appeler la méthode de service à tester pour ajouter la catégorie de produit
        CategorieProduit addedCategorieProduit = categorieProduitService.addCategorieProduit(categorieProduit);

        // Vérifier si la catégorie de produit retournée par le service est la même que celle ajoutée
        assertEquals(categorieProduit, addedCategorieProduit);
    }
}
