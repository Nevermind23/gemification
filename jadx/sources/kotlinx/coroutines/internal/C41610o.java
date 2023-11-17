package kotlinx.coroutines.internal;

import androidx.concurrent.futures.C0611b;
import ef1.C40832l0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41543s;

/* renamed from: kotlinx.coroutines.internal.o */
public class C41610o {

    /* renamed from: d */
    static final /* synthetic */ AtomicReferenceFieldUpdater f97812d;

    /* renamed from: e */
    static final /* synthetic */ AtomicReferenceFieldUpdater f97813e;

    /* renamed from: f */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f97814f;
    volatile /* synthetic */ Object _next = this;
    volatile /* synthetic */ Object _prev = this;
    private volatile /* synthetic */ Object _removedRef = null;

    /* renamed from: kotlinx.coroutines.internal.o$a */
    public static abstract class C41611a extends C41587c {

        /* renamed from: b */
        public final C41610o f97815b;

        /* renamed from: c */
        public C41610o f97816c;

        public C41611a(C41610o oVar) {
            this.f97815b = oVar;
        }

        /* renamed from: h */
        public void mo96357d(C41610o oVar, Object obj) {
            boolean z;
            C41610o oVar2;
            if (obj == null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                oVar2 = this.f97815b;
            } else {
                oVar2 = this.f97816c;
            }
            if (oVar2 != null && C0611b.m2366a(C41610o.f97812d, oVar, this, oVar2) && z) {
                C41610o oVar3 = this.f97815b;
                C41610o oVar4 = this.f97816c;
                C41536l.m120486f(oVar4);
                oVar3.m120717j(oVar4);
            }
        }
    }

    /* renamed from: kotlinx.coroutines.internal.o$b */
    public static final class C41612b extends C41624w {
    }

    /* renamed from: kotlinx.coroutines.internal.o$c */
    /* synthetic */ class C41613c extends C41543s {
        C41613c(Object obj) {
            super(obj, C40832l0.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1);
        }

        public Object get() {
            return C40832l0.m118329a(this.receiver);
        }
    }

    static {
        Class<C41610o> cls = C41610o.class;
        Class<Object> cls2 = Object.class;
        f97812d = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_next");
        f97813e = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_prev");
        f97814f = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_removedRef");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: kotlinx.coroutines.internal.w} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: kotlinx.coroutines.internal.o} */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0048, code lost:
        if (androidx.concurrent.futures.C0611b.m2366a(f97812d, r3, r2, ((kotlinx.coroutines.internal.C41625x) r4).f97836a) != false) goto L_0x004b;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final kotlinx.coroutines.internal.C41610o m120715h(kotlinx.coroutines.internal.C41624w r8) {
        /*
            r7 = this;
        L_0x0000:
            java.lang.Object r0 = r7._prev
            kotlinx.coroutines.internal.o r0 = (kotlinx.coroutines.internal.C41610o) r0
            r1 = 0
            r2 = r0
        L_0x0006:
            r3 = r1
        L_0x0007:
            java.lang.Object r4 = r2._next
            if (r4 != r7) goto L_0x0018
            if (r0 != r2) goto L_0x000e
            return r2
        L_0x000e:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f97813e
            boolean r0 = androidx.concurrent.futures.C0611b.m2366a(r1, r7, r0, r2)
            if (r0 != 0) goto L_0x0017
            goto L_0x0000
        L_0x0017:
            return r2
        L_0x0018:
            boolean r5 = r7.mo96388r()
            if (r5 == 0) goto L_0x001f
            return r1
        L_0x001f:
            if (r4 != r8) goto L_0x0022
            return r2
        L_0x0022:
            boolean r5 = r4 instanceof kotlinx.coroutines.internal.C41624w
            if (r5 == 0) goto L_0x0038
            if (r8 == 0) goto L_0x0032
            r0 = r4
            kotlinx.coroutines.internal.w r0 = (kotlinx.coroutines.internal.C41624w) r0
            boolean r0 = r8.mo96417b(r0)
            if (r0 == 0) goto L_0x0032
            return r1
        L_0x0032:
            kotlinx.coroutines.internal.w r4 = (kotlinx.coroutines.internal.C41624w) r4
            r4.mo96356c(r2)
            goto L_0x0000
        L_0x0038:
            boolean r5 = r4 instanceof kotlinx.coroutines.internal.C41625x
            if (r5 == 0) goto L_0x0052
            if (r3 == 0) goto L_0x004d
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = f97812d
            kotlinx.coroutines.internal.x r4 = (kotlinx.coroutines.internal.C41625x) r4
            kotlinx.coroutines.internal.o r4 = r4.f97836a
            boolean r2 = androidx.concurrent.futures.C0611b.m2366a(r5, r3, r2, r4)
            if (r2 != 0) goto L_0x004b
            goto L_0x0000
        L_0x004b:
            r2 = r3
            goto L_0x0006
        L_0x004d:
            java.lang.Object r2 = r2._prev
            kotlinx.coroutines.internal.o r2 = (kotlinx.coroutines.internal.C41610o) r2
            goto L_0x0007
        L_0x0052:
            r3 = r4
            kotlinx.coroutines.internal.o r3 = (kotlinx.coroutines.internal.C41610o) r3
            r6 = r3
            r3 = r2
            r2 = r6
            goto L_0x0007
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.C41610o.m120715h(kotlinx.coroutines.internal.w):kotlinx.coroutines.internal.o");
    }

    /* renamed from: i */
    private final C41610o m120716i(C41610o oVar) {
        while (oVar.mo96388r()) {
            oVar = (C41610o) oVar._prev;
        }
        return oVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public final void m120717j(C41610o oVar) {
        C41610o oVar2;
        do {
            oVar2 = (C41610o) oVar._prev;
            if (mo96392m() != oVar) {
                return;
            }
        } while (!C0611b.m2366a(f97813e, oVar, oVar2, this));
        if (mo96388r()) {
            oVar.m120715h((C41624w) null);
        }
    }

    /* renamed from: v */
    private final C41625x m120718v() {
        C41625x xVar = (C41625x) this._removedRef;
        if (xVar != null) {
            return xVar;
        }
        C41625x xVar2 = new C41625x(this);
        f97814f.lazySet(this, xVar2);
        return xVar2;
    }

    /* renamed from: f */
    public final boolean mo96390f(C41610o oVar, C41610o oVar2) {
        f97813e.lazySet(oVar, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f97812d;
        atomicReferenceFieldUpdater.lazySet(oVar, oVar2);
        if (!C0611b.m2366a(atomicReferenceFieldUpdater, this, oVar2, oVar)) {
            return false;
        }
        oVar.m120717j(oVar2);
        return true;
    }

    /* renamed from: g */
    public final boolean mo96391g(C41610o oVar) {
        f97813e.lazySet(oVar, this);
        f97812d.lazySet(oVar, this);
        while (mo96392m() == this) {
            if (C0611b.m2366a(f97812d, this, this, oVar)) {
                oVar.m120717j(this);
                return true;
            }
        }
        return false;
    }

    /* renamed from: m */
    public final Object mo96392m() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof C41624w)) {
                return obj;
            }
            ((C41624w) obj).mo96356c(this);
        }
    }

    /* renamed from: n */
    public final C41610o mo96393n() {
        return C41609n.m120713b(mo96392m());
    }

    /* renamed from: o */
    public final C41610o mo96394o() {
        C41610o h = m120715h((C41624w) null);
        return h == null ? m120716i((C41610o) this._prev) : h;
    }

    /* renamed from: p */
    public final void mo96395p() {
        ((C41625x) mo96392m()).f97836a.mo96396q();
    }

    /* renamed from: q */
    public final void mo96396q() {
        C41610o oVar = this;
        while (true) {
            Object m = oVar.mo96392m();
            if (m instanceof C41625x) {
                oVar = ((C41625x) m).f97836a;
            } else {
                oVar.m120715h((C41624w) null);
                return;
            }
        }
    }

    /* renamed from: r */
    public boolean mo96388r() {
        return mo96392m() instanceof C41625x;
    }

    /* renamed from: t */
    public boolean mo95552t() {
        return mo96397u() == null;
    }

    public String toString() {
        return new C41613c(this) + '@' + C40832l0.m118330b(this);
    }

    /* renamed from: u */
    public final C41610o mo96397u() {
        Object m;
        C41610o oVar;
        do {
            m = mo96392m();
            if (m instanceof C41625x) {
                return ((C41625x) m).f97836a;
            }
            if (m == this) {
                return (C41610o) m;
            }
            oVar = (C41610o) m;
        } while (!C0611b.m2366a(f97812d, this, m, oVar.m120718v()));
        oVar.m120715h((C41624w) null);
        return null;
    }

    /* renamed from: w */
    public final int mo96398w(C41610o oVar, C41610o oVar2, C41611a aVar) {
        f97813e.lazySet(oVar, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f97812d;
        atomicReferenceFieldUpdater.lazySet(oVar, oVar2);
        aVar.f97816c = oVar2;
        if (!C0611b.m2366a(atomicReferenceFieldUpdater, this, oVar2, aVar)) {
            return 0;
        }
        if (aVar.mo96356c(this) == null) {
            return 1;
        }
        return 2;
    }
}
