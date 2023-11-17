package p798jr;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.model.offers.LoanDecisionParameter;

/* renamed from: jr.a */
public abstract class C25481a {
    /* renamed from: a */
    public static final boolean m80656a(List list, String... strArr) {
        boolean z;
        C41536l.m120489i(list, "paramInfo");
        C41536l.m120489i(strArr, "parameterNames");
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            LoanDecisionParameter loanDecisionParameter = (LoanDecisionParameter) it.next();
            if (!C41536l.m120484d(loanDecisionParameter.getParameterCode(), "EXTRA_CODE") || !C41333m.m119794s(strArr, loanDecisionParameter.getParameterValue())) {
                z = false;
                continue;
            } else {
                z = true;
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }
}
