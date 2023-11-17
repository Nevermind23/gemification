package n20;

import kotlin.jvm.internal.C41536l;
import n41.C37353c;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p891su.C28261a;

/* renamed from: n20.a */
public abstract class C26359a {
    /* renamed from: a */
    public static final String m82388a(C28261a aVar) {
        C41536l.m120489i(aVar, "<this>");
        if (PreferencesApiManager.getInstance().getLanguage() == C37353c.EN) {
            return aVar.mo67854j();
        }
        return aVar.mo67855k();
    }
}
