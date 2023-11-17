package p375cf;

import kotlin.jvm.internal.C41536l;
import p652we.C18532c;

/* renamed from: cf.e */
public abstract class C10421e {
    /* renamed from: a */
    public static final boolean m37851a(C18532c.C18533a aVar, C18532c.C18533a aVar2) {
        C41536l.m120490j(aVar, "$this$isEquivalentTo");
        C41536l.m120490j(aVar2, "other");
        if (C41536l.m120484d(aVar, aVar2) || (m37852b(aVar) && m37852b(aVar2))) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static final boolean m37852b(C18532c.C18533a aVar) {
        return aVar instanceof C18532c.C18533a.C18536c;
    }
}
