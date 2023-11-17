package p341ge.bog.mobilebank.payments.presentation.form.base;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Observable;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.payments.presentation.form.base.C33702d;
import vx0.C39491a;

/* renamed from: ge.bog.mobilebank.payments.presentation.form.base.a */
public abstract class C33697a extends Observable {

    /* renamed from: a */
    private final List f82100a = new ArrayList();

    /* renamed from: b */
    private List f82101b = C41358y.m119991B0(C41341q.m119907j());

    /* renamed from: ge.bog.mobilebank.payments.presentation.form.base.a$a */
    public static final class C33698a {

        /* renamed from: a */
        private final C33702d.C33703a f82102a;

        /* renamed from: b */
        private final C33702d f82103b;

        /* renamed from: c */
        private final C39491a f82104c;

        public C33698a(C33702d.C33703a aVar, C33702d dVar, C39491a aVar2) {
            C41536l.m120489i(aVar, "elementType");
            C41536l.m120489i(dVar, "element");
            C41536l.m120489i(aVar2, "elementView");
            this.f82102a = aVar;
            this.f82103b = dVar;
            this.f82104c = aVar2;
        }

        /* renamed from: a */
        public final C33702d mo80307a() {
            return this.f82103b;
        }

        /* renamed from: b */
        public final C33702d.C33703a mo80308b() {
            return this.f82102a;
        }

        /* renamed from: c */
        public final C39491a mo80309c() {
            return this.f82104c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C33698a)) {
                return false;
            }
            C33698a aVar = (C33698a) obj;
            return this.f82102a == aVar.f82102a && C41536l.m120484d(this.f82103b, aVar.f82103b) && C41536l.m120484d(this.f82104c, aVar.f82104c);
        }

        public int hashCode() {
            return (((this.f82102a.hashCode() * 31) + this.f82103b.hashCode()) * 31) + this.f82104c.hashCode();
        }

        public String toString() {
            C33702d.C33703a aVar = this.f82102a;
            C33702d dVar = this.f82103b;
            C39491a aVar2 = this.f82104c;
            return "LayoutEntry(elementType=" + aVar + ", element=" + dVar + ", elementView=" + aVar2 + ")";
        }
    }

    /* renamed from: h */
    private final void m99017h() {
        setChanged();
        notifyObservers();
    }

    /* renamed from: a */
    public final void mo80297a(C33702d.C33703a aVar, C33702d dVar, C39491a aVar2) {
        C41536l.m120489i(aVar, "elementType");
        C41536l.m120489i(dVar, "element");
        C41536l.m120489i(aVar2, "elementView");
        this.f82100a.add(new C33698a(aVar, dVar, aVar2));
    }

    /* renamed from: b */
    public void mo80298b() {
        this.f82100a.clear();
    }

    /* renamed from: c */
    public C33702d mo80299c(int i) {
        return (C33702d) this.f82101b.get(i);
    }

    /* renamed from: d */
    public int mo80300d() {
        return this.f82101b.size();
    }

    /* renamed from: e */
    public C33702d.C33703a mo80301e(int i) {
        return ((C33702d) this.f82101b.get(i)).mo80314b();
    }

    /* renamed from: f */
    public final List mo80302f() {
        List unmodifiableList = Collections.unmodifiableList(this.f82100a);
        C41536l.m120488h(unmodifiableList, "unmodifiableList(layoutEntries)");
        return unmodifiableList;
    }

    /* renamed from: g */
    public final boolean mo80303g() {
        List<C33698a> f = mo80302f();
        if ((f instanceof Collection) && f.isEmpty()) {
            return true;
        }
        for (C33698a c : f) {
            if (!c.mo80309c().mo93125j()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: i */
    public abstract C39491a mo72305i(C33702d.C33703a aVar, int i);

    /* renamed from: j */
    public final void mo80304j() {
        for (C33698a c : this.f82100a) {
            c.mo80309c().mo93118c();
        }
    }

    /* renamed from: k */
    public void mo80305k(List list) {
        C41536l.m120489i(list, "elements");
        this.f82101b = C41358y.m119991B0(list);
        m99017h();
    }

    /* renamed from: l */
    public void mo80306l() {
        for (C33698a aVar : this.f82100a) {
            if (aVar.mo80309c().mo93124i() && !aVar.mo80309c().mo93138w()) {
                return;
            }
        }
    }
}
