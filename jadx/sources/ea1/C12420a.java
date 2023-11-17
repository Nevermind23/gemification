package ea1;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.sso_client.models.Rule;
import sso.queery.GetUsernamePolicyRulesQuery;

/* renamed from: ea1.a */
public final class C12420a {

    /* renamed from: a */
    public static final C12420a f37085a = new C12420a();

    private C12420a() {
    }

    /* renamed from: b */
    private final Rule m47430b(GetUsernamePolicyRulesQuery.Rule rule) {
        String str;
        Boolean bool;
        String str2;
        String str3;
        Boolean bool2;
        if (rule != null) {
            str = rule.getDescription();
        } else {
            str = null;
        }
        if (rule != null) {
            bool = rule.isInversiveRegEx();
        } else {
            bool = null;
        }
        if (rule != null) {
            str2 = rule.getRegEx();
        } else {
            str2 = null;
        }
        if (rule != null) {
            str3 = rule.getRuleKey();
        } else {
            str3 = null;
        }
        if (rule != null) {
            bool2 = rule.getShowCondition();
        } else {
            bool2 = null;
        }
        return new Rule(str, bool, str2, str3, bool2);
    }

    /* renamed from: a */
    public final List mo33028a(GetUsernamePolicyRulesQuery.GetUsernamePolicyRules getUsernamePolicyRules) {
        C41536l.m120489i(getUsernamePolicyRules, "rule");
        List<GetUsernamePolicyRulesQuery.Rule> rules = getUsernamePolicyRules.getRules();
        if (rules == null) {
            return C41341q.m119907j();
        }
        ArrayList arrayList = new ArrayList(C41343r.m119925u(rules, 10));
        for (GetUsernamePolicyRulesQuery.Rule b : rules) {
            arrayList.add(m47430b(b));
        }
        return arrayList;
    }
}
