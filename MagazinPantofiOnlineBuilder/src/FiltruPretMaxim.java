import java.util.List;
import java.util.stream.Collectors;

public class FiltruPretMaxim implements ICautare {
    private double pretMaxim;
    private boolean activ;

    public FiltruPretMaxim(double pretMaxim, boolean activ) {
        this.pretMaxim = pretMaxim;
        this.activ = activ;
    }

    @Override
    public List<Pantof> aplica(List<Pantof> pantofi) {
        if (!activ) return pantofi;
        return pantofi.stream()
                .filter(p -> p.getPret() <= pretMaxim)
                .collect(Collectors.toList());
    }

    @Override
    public boolean esteActiv() {
        return activ;
    }
}
