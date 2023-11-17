package p341ge.bog.mobilebank.model.passwordrules;

import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.model.passwordrules.PasswordRules */
public final class PasswordRules {
    private final List<Level> levels;
    private final List<Rule> rules;

    public PasswordRules(List<Rule> list, List<Level> list2) {
        C41536l.m120489i(list, "rules");
        C41536l.m120489i(list2, "levels");
        this.rules = list;
        this.levels = list2;
    }

    public final List<Level> getLevels() {
        return this.levels;
    }

    public final List<Rule> getRules() {
        return this.rules;
    }
}
