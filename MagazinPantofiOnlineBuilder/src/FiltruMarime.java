import java.util.List;
import java.util.stream.Collectors;

public class FiltruMarime implements ICautare {
    private int marime;
    private boolean activ;

    public FiltruMarime(int marime, boolean activ) {
        this.marime = marime;
        this.activ = activ;
    }

    @Override
    public List<Pantof> aplica(List<Pantof> pantofi) {
        if (!activ) return pantofi;
        return pantofi.stream()
                .filter(p -> p.getMarime() == marime)
                .collect(Collectors.toList());
    }

    @Override
    public boolean esteActiv() {
        return activ;
    }
}
