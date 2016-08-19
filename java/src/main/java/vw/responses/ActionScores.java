package vw.responses;

import java.util.Arrays;

/**
 * Created by jmorra on 8/12/16.
 */
public class ActionScores {

    // Although this is modifiable it is not intended to be updated by the user.  This data structure mimics the
    // C data structure.
    private final ActionScore[] actionScores;

    public ActionScores(final ActionScore[] actionScores) {
        this.actionScores = actionScores;
    }

    public ActionScore[] getActionScores() {
        return actionScores;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ActionScores that = (ActionScores) o;

        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(actionScores, that.actionScores);

    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(actionScores);
    }
}
