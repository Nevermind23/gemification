package q11;

import g11.C32040a;
import kotlin.jvm.internal.C41536l;
import n41.C37353c;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;

/* renamed from: q11.c */
public final class C38103c {

    /* renamed from: a */
    private final PreferencesApiManager f91514a;

    public C38103c(PreferencesApiManager preferencesApiManager) {
        C41536l.m120489i(preferencesApiManager, "preferencesApiManager");
        this.f91514a = preferencesApiManager;
    }

    /* renamed from: a */
    public final C32040a mo91529a() {
        if (this.f91514a.getLanguage() == C37353c.KA) {
            return C32040a.GEORGIAN;
        }
        return C32040a.ENGLISH;
    }
}
