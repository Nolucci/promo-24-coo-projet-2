package duckcorp.duck;

/**
 * Canard en plastique de luxe.
 *
 * TODO (Ex1) :
 *   - Faites hériter cette classe de Duck
 *   - Implémentez le constructeur LuxuryDuck(int qualityScore) avec un appel à super
 *   - Implémentez getBasePrice() et describe()
 * @author Roussille Philippe <roussille@3il.fr>
 */
public class LuxuryDuck extends Duck {

    public static final double BASE_PRICE = 80.0;

    /**
     * Crée un canard de luxe avec le score de qualité donné.
     *
     * @param qualityScore score de qualité entre 0 et 100
     */
    public LuxuryDuck(int qualityScore) {
        super(DuckType.LUXURY, qualityScore);
    }

    /**
     * @return le prix de base d'un canard de luxe (80 €)
     */
    @Override
    public double getBasePrice() {
        return BASE_PRICE;
    }

    /**
     * @return la description du type de canard
     */
    @Override
    public String describe() {
        return "Canard de Luxe";
    }
}
