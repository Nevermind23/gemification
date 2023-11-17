package me1;

import kotlin.jvm.internal.C41536l;
import me1.C41752f;
import ue1.C43075l;

/* renamed from: me1.b */
public abstract class C41742b implements C41752f.C41757c {

    /* renamed from: d */
    private final C43075l f98017d;

    /* renamed from: e */
    private final C41752f.C41757c f98018e;

    public C41742b(C41752f.C41757c cVar, C43075l lVar) {
        C41536l.m120489i(cVar, "baseKey");
        C41536l.m120489i(lVar, "safeCast");
        this.f98017d = lVar;
        this.f98018e = cVar instanceof C41742b ? ((C41742b) cVar).f98018e : cVar;
    }

    /* renamed from: a */
    public final boolean mo96529a(C41752f.C41757c cVar) {
        C41536l.m120489i(cVar, "key");
        if (cVar == this || this.f98018e == cVar) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final C41752f.C41755b mo96530b(C41752f.C41755b bVar) {
        C41536l.m120489i(bVar, "element");
        return (C41752f.C41755b) this.f98017d.invoke(bVar);
    }
}
