package duckcorp.duck;

/**
 * Canard en plastique standard.
 *
 * TODO (Ex1) :
 *   - Faites hériter cette classe de Duck
 *   - Implémentez le constructeur StandardDuck(int qualityScore) avec un appel à super
 *   - Implémentez getBasePrice() et describe()
 * @author Roussille Philippe <roussille@3il.fr>
 */
public class StandardDuck extends Duck {

    public static final double BASE_PRICE = 25.0;

    /**
     * Crée un canard standard avec le score de qualité donné.
     *
     * @param qualityScore score de qualité entre 0 et 100
     */
    public StandardDuck(int qualityScore) {
        super(DuckType.STANDARD, qualityScore);
    }

    /**
     * @return le prix de base d'un canard standard (25 €)
     */
    @Override
    public double getBasePrice() {
        return BASE_PRICE;
    }

    /**
     * @return la description en français du type de canard
     */
    @Override
    public String describe() {
        return "Canard Standard";
    }
}
