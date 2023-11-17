package androidx.lifecycle;

import androidx.lifecycle.C1593j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p097h.C6408c;
import p110i.C6494a;
import p110i.C6495b;

/* renamed from: androidx.lifecycle.s */
public class C1631s extends C1593j {

    /* renamed from: j */
    public static final C1632a f4648j = new C1632a((DefaultConstructorMarker) null);

    /* renamed from: b */
    private final boolean f4649b;

    /* renamed from: c */
    private C6494a f4650c;

    /* renamed from: d */
    private C1593j.C1598b f4651d;

    /* renamed from: e */
    private final WeakReference f4652e;

    /* renamed from: f */
    private int f4653f;

    /* renamed from: g */
    private boolean f4654g;

    /* renamed from: h */
    private boolean f4655h;

    /* renamed from: i */
    private ArrayList f4656i;

    /* renamed from: androidx.lifecycle.s$a */
    public static final class C1632a {
        private C1632a() {
        }

        public /* synthetic */ C1632a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C1593j.C1598b mo4944a(C1593j.C1598b bVar, C1593j.C1598b bVar2) {
            C41536l.m120489i(bVar, "state1");
            if (bVar2 == null || bVar2.compareTo(bVar) >= 0) {
                return bVar;
            }
            return bVar2;
        }
    }

    /* renamed from: androidx.lifecycle.s$b */
    public static final class C1633b {

        /* renamed from: a */
        private C1593j.C1598b f4657a;

        /* renamed from: b */
        private C1606m f4658b;

        public C1633b(C1616p pVar, C1593j.C1598b bVar) {
            C41536l.m120489i(bVar, "initialState");
            C41536l.m120486f(pVar);
            this.f4658b = C1637u.m5714f(pVar);
            this.f4657a = bVar;
        }

        /* renamed from: a */
        public final void mo4945a(C1619q qVar, C1593j.C1594a aVar) {
            C41536l.m120489i(aVar, "event");
            C1593j.C1598b c = aVar.mo4910c();
            this.f4657a = C1631s.f4648j.mo4944a(this.f4657a, c);
            C1606m mVar = this.f4658b;
            C41536l.m120486f(qVar);
            mVar.mo336b(qVar, aVar);
            this.f4657a = c;
        }

        /* renamed from: b */
        public final C1593j.C1598b mo4946b() {
            return this.f4657a;
        }
    }

    private C1631s(C1619q qVar, boolean z) {
        this.f4649b = z;
        this.f4650c = new C6494a();
        this.f4651d = C1593j.C1598b.INITIALIZED;
        this.f4656i = new ArrayList();
        this.f4652e = new WeakReference(qVar);
    }

    /* renamed from: e */
    private final void m5686e(C1619q qVar) {
        Iterator b = this.f4650c.mo20417b();
        C41536l.m120488h(b, "observerMap.descendingIterator()");
        while (b.hasNext() && !this.f4655h) {
            Map.Entry entry = (Map.Entry) b.next();
            C41536l.m120488h(entry, "next()");
            C1616p pVar = (C1616p) entry.getKey();
            C1633b bVar = (C1633b) entry.getValue();
            while (bVar.mo4946b().compareTo(this.f4651d) > 0 && !this.f4655h && this.f4650c.contains(pVar)) {
                C1593j.C1594a a = C1593j.C1594a.Companion.mo4911a(bVar.mo4946b());
                if (a != null) {
                    m5693n(a.mo4910c());
                    bVar.mo4945a(qVar, a);
                    m5692m();
                } else {
                    throw new IllegalStateException("no event down from " + bVar.mo4946b());
                }
            }
        }
    }

    /* renamed from: f */
    private final C1593j.C1598b m5687f(C1616p pVar) {
        C1593j.C1598b bVar;
        C1633b bVar2;
        Map.Entry o = this.f4650c.mo20416o(pVar);
        C1593j.C1598b bVar3 = null;
        if (o == null || (bVar2 = (C1633b) o.getValue()) == null) {
            bVar = null;
        } else {
            bVar = bVar2.mo4946b();
        }
        if (!this.f4656i.isEmpty()) {
            ArrayList arrayList = this.f4656i;
            bVar3 = (C1593j.C1598b) arrayList.get(arrayList.size() - 1);
        }
        C1632a aVar = f4648j;
        return aVar.mo4944a(aVar.mo4944a(this.f4651d, bVar), bVar3);
    }

    /* renamed from: g */
    private final void m5688g(String str) {
        if (this.f4649b && !C6408c.m25463g().mo20293b()) {
            throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
        }
    }

    /* renamed from: h */
    private final void m5689h(C1619q qVar) {
        C6495b.C6499d i = this.f4650c.mo20421i();
        C41536l.m120488h(i, "observerMap.iteratorWithAdditions()");
        while (i.hasNext() && !this.f4655h) {
            Map.Entry entry = (Map.Entry) i.next();
            C1616p pVar = (C1616p) entry.getKey();
            C1633b bVar = (C1633b) entry.getValue();
            while (bVar.mo4946b().compareTo(this.f4651d) < 0 && !this.f4655h && this.f4650c.contains(pVar)) {
                m5693n(bVar.mo4946b());
                C1593j.C1594a b = C1593j.C1594a.Companion.mo4912b(bVar.mo4946b());
                if (b != null) {
                    bVar.mo4945a(qVar, b);
                    m5692m();
                } else {
                    throw new IllegalStateException("no event up from " + bVar.mo4946b());
                }
            }
        }
    }

    /* renamed from: j */
    private final boolean m5690j() {
        if (this.f4650c.size() == 0) {
            return true;
        }
        Map.Entry c = this.f4650c.mo20418c();
        C41536l.m120486f(c);
        C1593j.C1598b b = ((C1633b) c.getValue()).mo4946b();
        Map.Entry j = this.f4650c.mo20423j();
        C41536l.m120486f(j);
        C1593j.C1598b b2 = ((C1633b) j.getValue()).mo4946b();
        if (b == b2 && this.f4651d == b2) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    private final void m5691l(C1593j.C1598b bVar) {
        boolean z;
        C1593j.C1598b bVar2 = this.f4651d;
        if (bVar2 != bVar) {
            if (bVar2 == C1593j.C1598b.INITIALIZED && bVar == C1593j.C1598b.DESTROYED) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                this.f4651d = bVar;
                if (this.f4654g || this.f4653f != 0) {
                    this.f4655h = true;
                    return;
                }
                this.f4654g = true;
                m5694p();
                this.f4654g = false;
                if (this.f4651d == C1593j.C1598b.DESTROYED) {
                    this.f4650c = new C6494a();
                    return;
                }
                return;
            }
            throw new IllegalStateException(("no event down from " + this.f4651d + " in component " + this.f4652e.get()).toString());
        }
    }

    /* renamed from: m */
    private final void m5692m() {
        ArrayList arrayList = this.f4656i;
        arrayList.remove(arrayList.size() - 1);
    }

    /* renamed from: n */
    private final void m5693n(C1593j.C1598b bVar) {
        this.f4656i.add(bVar);
    }

    /* renamed from: p */
    private final void m5694p() {
        C1619q qVar = (C1619q) this.f4652e.get();
        if (qVar != null) {
            while (!m5690j()) {
                this.f4655h = false;
                C1593j.C1598b bVar = this.f4651d;
                Map.Entry c = this.f4650c.mo20418c();
                C41536l.m120486f(c);
                if (bVar.compareTo(((C1633b) c.getValue()).mo4946b()) < 0) {
                    m5686e(qVar);
                }
                Map.Entry j = this.f4650c.mo20423j();
                if (!this.f4655h && j != null && this.f4651d.compareTo(((C1633b) j.getValue()).mo4946b()) > 0) {
                    m5689h(qVar);
                }
            }
            this.f4655h = false;
            return;
        }
        throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
    }

    /* renamed from: a */
    public void mo4906a(C1616p pVar) {
        C1619q qVar;
        boolean z;
        C41536l.m120489i(pVar, "observer");
        m5688g("addObserver");
        C1593j.C1598b bVar = this.f4651d;
        C1593j.C1598b bVar2 = C1593j.C1598b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = C1593j.C1598b.INITIALIZED;
        }
        C1633b bVar3 = new C1633b(pVar, bVar2);
        if (((C1633b) this.f4650c.mo20414l(pVar, bVar3)) == null && (qVar = (C1619q) this.f4652e.get()) != null) {
            if (this.f4653f != 0 || this.f4654g) {
                z = true;
            } else {
                z = false;
            }
            C1593j.C1598b f = m5687f(pVar);
            this.f4653f++;
            while (bVar3.mo4946b().compareTo(f) < 0 && this.f4650c.contains(pVar)) {
                m5693n(bVar3.mo4946b());
                C1593j.C1594a b = C1593j.C1594a.Companion.mo4912b(bVar3.mo4946b());
                if (b != null) {
                    bVar3.mo4945a(qVar, b);
                    m5692m();
                    f = m5687f(pVar);
                } else {
                    throw new IllegalStateException("no event up from " + bVar3.mo4946b());
                }
            }
            if (!z) {
                m5694p();
            }
            this.f4653f--;
        }
    }

    /* renamed from: b */
    public C1593j.C1598b mo4907b() {
        return this.f4651d;
    }

    /* renamed from: d */
    public void mo4909d(C1616p pVar) {
        C41536l.m120489i(pVar, "observer");
        m5688g("removeObserver");
        this.f4650c.mo20415n(pVar);
    }

    /* renamed from: i */
    public void mo4941i(C1593j.C1594a aVar) {
        C41536l.m120489i(aVar, "event");
        m5688g("handleLifecycleEvent");
        m5691l(aVar.mo4910c());
    }

    /* renamed from: k */
    public void mo4942k(C1593j.C1598b bVar) {
        C41536l.m120489i(bVar, "state");
        m5688g("markState");
        mo4943o(bVar);
    }

    /* renamed from: o */
    public void mo4943o(C1593j.C1598b bVar) {
        C41536l.m120489i(bVar, "state");
        m5688g("setCurrentState");
        m5691l(bVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C1631s(C1619q qVar) {
        this(qVar, true);
        C41536l.m120489i(qVar, "provider");
    }
}
