package geometry.zeroDim;

/**
 *
 * @author Vincent Poirier
 * @author Fanny Rottee
 */
public class Point2D {

    private double x;
    private double y;

    /**
     * Construit un point à l'origine.
     */
    public Point2D() {
        this(0, 0);
    }

    /**
     * Construit un point à partir de son abscisse.
     *
     * @param abs L'abscisse du point.
     */
    public Point2D(double abs) {
        this(abs, 0);
    }

    /**
     * Construit un point à partir de ses deux coordonnées cartésiennes.
     *
     * @param x La coordonnée selon l'axe des abscisses.
     * @param y La coordonnée selon l'axe des ordonnées.
     */
    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Déplace le point à partir de sa position actuelle.
     *
     * @param dx La variation selon les abscisses à appliquer.
     * @param dy La variation selon les ordonnées à appliquer.
     */
    public void deplace(double dx, double dy) {
        x += dx;
        y += dy;
    }

    @Override
    public String toString() {
        return "[" + x + ", " + y + "]";
    }

    /**
     * Renvoie la coordonnée du point selon l'axe des abscisses.
     *
     * @return La coordonnée du point selon l'axe des abscisses.
     */
    public double getX() {
        return x;
    }

    /**
     * Renvoie la coordonnée du point selon l'axe des ordonnées.
     *
     * @return La coordonnée du point selon l'axe des ordonnées.
     */
    public double getY() {
        return y;
    }

    /**
     * Calcule la distance entre ce point et un point spécifié.
     *
     * @param pt Le point spécifié.
     * @return La distance entre ce point et le point spécifié.
     */
    public double distance(Point2D pt) {
        return Math.sqrt(Math.pow(pt.x - this.x, 2) + Math.pow(pt.y - this.y, 2));
    }

    /**
     * Effectue une rotation du point d'un angle donné par rapport à l'origine.
     *
     * @param angleEnRadians L'angle en radians sur lequel faire la rotation.
     */
    public void rotation(double angleEnRadians) {
        double xn = this.x * Math.cos(angleEnRadians) - this.y * Math.sin(angleEnRadians);
        double yn = this.x * Math.sin(angleEnRadians) + this.y * Math.cos(angleEnRadians);
        this.x = xn;
        this.y = yn;
    }
}
