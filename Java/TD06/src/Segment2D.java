
/**
 *
 * @author Vincent Poirier
 * @author Fanny Rottee
 */
public class Segment2D implements FormeGeometrique2D, Cloneable {

    private final Point2D p1;
    private final Point2D p2;

    /**
     * Construit un segment avec ses deux extrémités.
     *
     * @param p1 Une extrémité du segment.
     * @param p2 L'autre extrémité du segment.
     */
    public Segment2D(Point2D p1, Point2D p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    /**
     * Calcule et retourne la longueur du segment.
     *
     * @return La longueur du segment.
     */
    public double longueur() {
        return Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2));
    }

    @Override
    public String toString() {
        return "De " + p1.toString() + " à " + p2.toString() + ".";
    }

    /**
     * Déplace la première extrémité du segment.
     *
     * @param dxP1 La variation selon les abscisses à appliquer.
     * @param dyP1 La variation selon les ordonnées à appliquer.
     */
    public void deplaceP1(double dxP1, double dyP1) {
        p1.deplace(dxP1, dyP1);
    }

    /**
     * Déplace la deuxième extrémité du segment.
     *
     * @param dxP2 La variation selon les abscisses à appliquer.
     * @param dyP2 La variation selon les ordonnées à appliquer.
     */
    public void deplaceP2(double dxP2, double dyP2) {
        p2.deplace(dxP2, dyP2);
    }

    /**
     * Renvoie la première extrémité du segment.
     *
     * @return La première extrémité du segment.
     */
    public Point2D getP1() {
        return p1;
    }

    /**
     * Renvoie la deuxième extrémité du segment.
     *
     * @return La deuxième extrémité du segment.
     */
    public Point2D getP2() {
        return p2;
    }

    @Override
    public void deplace(double dx, double dy) {
        deplaceP1(dx, dy);
        deplaceP2(dx, dy);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        final Segment2D other = (Segment2D) obj;
        if (!p1.equals(other.p1)) {
            return false;
        }

        return p2.equals(other.p2);
    }
    
    @Override
    public boolean estIdentique(Object o) {
        return equals(o);
    }

    @Override
    public void affiche() {
        System.out.println(this);
    }

    @Override
    public Segment2D clone() throws CloneNotSupportedException {
        return new Segment2D(getP1(), getP2());
    }

}
