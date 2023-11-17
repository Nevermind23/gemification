package androidx.work.impl;

import kotlin.jvm.internal.C41536l;
import p267u0.C8503w;
import p318y0.C8998i;

/* renamed from: androidx.work.impl.c */
public final class C2002c extends C8503w.C8505b {

    /* renamed from: a */
    public static final C2002c f6025a = new C2002c();

    private C2002c() {
    }

    /* renamed from: e */
    private final String m7850e() {
        return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < " + mo6808d() + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    }

    /* renamed from: c */
    public void mo6807c(C8998i iVar) {
        C41536l.m120489i(iVar, "db");
        super.mo6807c(iVar);
        iVar.mo23650F();
        try {
            iVar.mo23652L(m7850e());
            iVar.mo23655X();
        } finally {
            iVar.mo23662i0();
        }
    }

    /* renamed from: d */
    public final long mo6808d() {
        return System.currentTimeMillis() - C2064z.f6214a;
    }
}
