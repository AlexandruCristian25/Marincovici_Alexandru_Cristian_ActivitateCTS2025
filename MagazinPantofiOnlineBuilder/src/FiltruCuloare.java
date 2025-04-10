import java.util.List;
import java.util.stream.Collectors;

public class FiltruCuloare implements ICautare {
    private String culoare;
    private boolean activ;

    public FiltruCuloare(String culoare, boolean activ) {
        this.culoare = culoare;
        this.activ = activ;
    }

    @Override
    public List<Pantof> aplica(List<Pantof> pantofi) {
        if (!activ) return pantofi;
        return pantofi.stream()
                .filter(p -> p.getCuloare().equalsIgnoreCase(culoare))
                .collect(Collectors.toList());
    }

    @Override
    public boolean esteActiv() {
        return activ;
    }
}
