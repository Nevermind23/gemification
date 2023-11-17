package p202p0;

import android.os.Bundle;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p202p0.C7530c0;

@C7530c0.C7532b("navigation")
/* renamed from: p0.t */
public class C7598t extends C7530c0 {

    /* renamed from: c */
    private final C7536d0 f22163c;

    public C7598t(C7536d0 d0Var) {
        C41536l.m120489i(d0Var, "navigatorProvider");
        this.f22163c = d0Var;
    }

    /* renamed from: m */
    private final void m28888m(C7549j jVar, C7602w wVar, C7530c0.C7531a aVar) {
        boolean z;
        C7589q qVar;
        C7594s sVar = (C7594s) jVar.mo22097f();
        Bundle d = jVar.mo22095d();
        int R = sVar.mo22232R();
        String S = sVar.mo22233S();
        if (R == 0 && S == null) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (S != null) {
                qVar = sVar.mo22229N(S, false);
            } else {
                qVar = sVar.mo22227L(R, false);
            }
            if (qVar != null) {
                this.f22163c.mo22061d(qVar.mo22216z()).mo22050e(C41339p.m119900e(mo22048b().mo22070a(qVar, qVar.mo22209j(d))), wVar, aVar);
                return;
            }
            throw new IllegalArgumentException("navigation destination " + sVar.mo22231P() + " is not a direct child of this NavGraph");
        }
        throw new IllegalStateException(("no start destination defined via app:startDestination for " + sVar.mo22213v()).toString());
    }

    /* renamed from: e */
    public void mo22050e(List list, C7602w wVar, C7530c0.C7531a aVar) {
        C41536l.m120489i(list, "entries");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m28888m((C7549j) it.next(), wVar, aVar);
        }
    }

    /* renamed from: l */
    public C7594s mo22020a() {
        return new C7594s(this);
    }
}
