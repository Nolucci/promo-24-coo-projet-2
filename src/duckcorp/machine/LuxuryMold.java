package duckcorp.machine;

import duckcorp.duck.Duck;
import duckcorp.duck.DuckType;
import duckcorp.duck.LuxuryDuck;

/**
 * Moule produisant des Canards de Luxe.
 *
 * TODO (Ex2) :
 *   - Faites hériter cette classe de Machine
 *   - Implémentez le constructeur sans paramètre avec un appel à super
 *   - Implémentez produceDuck(), getPurchaseCost(), getName()
 * @author Roussille Philippe <roussille@3il.fr>
 */
public class LuxuryMold extends Machine {

    public static final int PURCHASE_COST    = 800;
    public static final int CAPACITY         = 2;
    public static final int MAINTENANCE_COST = 80;

    public LuxuryMold() {
        super(DuckType.LUXURY, CAPACITY, MAINTENANCE_COST);
    }

    /**
     * Produit un canard de luxe dont la qualité dépend de l'état de la machine.
     *
     * @return un nouveau LuxuryDuck
     */
    @Override
    public Duck produceDuck() {
        return new LuxuryDuck(computeQuality());
    }

    /**
     * @return le coût d'achat du moule de luxe
     */
    @Override
    public int getPurchaseCost() {
        return PURCHASE_COST;
    }

    /**
     * @return le nom affiché de la machine
     */
    @Override
    public String getName() {
        return "Moule de Luxe";
    }
}
