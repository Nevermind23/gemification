package p164m1;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p151l1.C6861a;
import p177n1.C7207h;
import p190o1.C7399v;

/* renamed from: m1.c */
public abstract class C7057c implements C6861a {

    /* renamed from: a */
    private final C7207h f20993a;

    /* renamed from: b */
    private final List f20994b = new ArrayList();

    /* renamed from: c */
    private final List f20995c = new ArrayList();

    /* renamed from: d */
    private Object f20996d;

    /* renamed from: e */
    private C7058a f20997e;

    /* renamed from: m1.c$a */
    public interface C7058a {
        /* renamed from: c */
        void mo20943c(List list);

        /* renamed from: d */
        void mo20944d(List list);
    }

    public C7057c(C7207h hVar) {
        C41536l.m120489i(hVar, "tracker");
        this.f20993a = hVar;
    }

    /* renamed from: h */
    private final void m27298h(C7058a aVar, Object obj) {
        if (!this.f20994b.isEmpty() && aVar != null) {
            if (obj == null || mo21278c(obj)) {
                aVar.mo20944d(this.f20994b);
            } else {
                aVar.mo20943c(this.f20994b);
            }
        }
    }

    /* renamed from: a */
    public void mo20933a(Object obj) {
        this.f20996d = obj;
        m27298h(this.f20997e, obj);
    }

    /* renamed from: b */
    public abstract boolean mo21277b(C7399v vVar);

    /* renamed from: c */
    public abstract boolean mo21278c(Object obj);

    /* renamed from: d */
    public final boolean mo21281d(String str) {
        C41536l.m120489i(str, "workSpecId");
        Object obj = this.f20996d;
        if (obj == null || !mo21278c(obj) || !this.f20995c.contains(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final void mo21282e(Iterable iterable) {
        C41536l.m120489i(iterable, "workSpecs");
        this.f20994b.clear();
        this.f20995c.clear();
        List list = this.f20994b;
        for (Object next : iterable) {
            if (mo21277b((C7399v) next)) {
                list.add(next);
            }
        }
        List<C7399v> list2 = this.f20994b;
        List list3 = this.f20995c;
        for (C7399v vVar : list2) {
            list3.add(vVar.f21630a);
        }
        if (this.f20994b.isEmpty()) {
            this.f20993a.mo21573f(this);
        } else {
            this.f20993a.mo21571c(this);
        }
        m27298h(this.f20997e, this.f20996d);
    }

    /* renamed from: f */
    public final void mo21283f() {
        if (!this.f20994b.isEmpty()) {
            this.f20994b.clear();
            this.f20993a.mo21573f(this);
        }
    }

    /* renamed from: g */
    public final void mo21284g(C7058a aVar) {
        if (this.f20997e != aVar) {
            this.f20997e = aVar;
            m27298h(aVar, this.f20996d);
        }
    }
}
