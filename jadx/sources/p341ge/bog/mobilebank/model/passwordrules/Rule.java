package p341ge.bog.mobilebank.model.passwordrules;

import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.model.passwordrules.Rule */
public final class Rule {
    private final String description;
    private final boolean isInversiveRegEx;
    private final String regEx;
    private final String ruleKey;
    private final boolean showCondition;

    public Rule(String str, String str2, boolean z, String str3, boolean z2) {
        C41536l.m120489i(str, "ruleKey");
        C41536l.m120489i(str2, "regEx");
        C41536l.m120489i(str3, "description");
        this.ruleKey = str;
        this.regEx = str2;
        this.isInversiveRegEx = z;
        this.description = str3;
        this.showCondition = z2;
    }

    public static /* synthetic */ Rule copy$default(Rule rule, String str, String str2, boolean z, String str3, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rule.ruleKey;
        }
        if ((i & 2) != 0) {
            str2 = rule.regEx;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            z = rule.isInversiveRegEx;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            str3 = rule.description;
        }
        String str5 = str3;
        if ((i & 16) != 0) {
            z2 = rule.showCondition;
        }
        return rule.copy(str, str4, z3, str5, z2);
    }

    public final String component1() {
        return this.ruleKey;
    }

    public final String component2() {
        return this.regEx;
    }

    public final boolean component3() {
        return this.isInversiveRegEx;
    }

    public final String component4() {
        return this.description;
    }

    public final boolean component5() {
        return this.showCondition;
    }

    public final Rule copy(String str, String str2, boolean z, String str3, boolean z2) {
        C41536l.m120489i(str, "ruleKey");
        C41536l.m120489i(str2, "regEx");
        C41536l.m120489i(str3, "description");
        return new Rule(str, str2, z, str3, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Rule)) {
            return false;
        }
        Rule rule = (Rule) obj;
        return C41536l.m120484d(this.ruleKey, rule.ruleKey) && C41536l.m120484d(this.regEx, rule.regEx) && this.isInversiveRegEx == rule.isInversiveRegEx && C41536l.m120484d(this.description, rule.description) && this.showCondition == rule.showCondition;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getRegEx() {
        return this.regEx;
    }

    public final String getRuleKey() {
        return this.ruleKey;
    }

    public final boolean getShowCondition() {
        return this.showCondition;
    }

    public int hashCode() {
        int hashCode = ((this.ruleKey.hashCode() * 31) + this.regEx.hashCode()) * 31;
        boolean z = this.isInversiveRegEx;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int hashCode2 = (((hashCode + (z ? 1 : 0)) * 31) + this.description.hashCode()) * 31;
        boolean z3 = this.showCondition;
        if (!z3) {
            z2 = z3;
        }
        return hashCode2 + (z2 ? 1 : 0);
    }

    public final boolean isInversiveRegEx() {
        return this.isInversiveRegEx;
    }

    public String toString() {
        String str = this.ruleKey;
        String str2 = this.regEx;
        boolean z = this.isInversiveRegEx;
        String str3 = this.description;
        boolean z2 = this.showCondition;
        return "Rule(ruleKey=" + str + ", regEx=" + str2 + ", isInversiveRegEx=" + z + ", description=" + str3 + ", showCondition=" + z2 + ")";
    }
}
