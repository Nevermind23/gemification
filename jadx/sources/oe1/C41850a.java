package oe1;

import he1.C41225n;
import he1.C41228o;
import java.io.Serializable;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C41536l;

/* renamed from: oe1.a */
public abstract class C41850a implements Continuation, C41854e, Serializable {

    /* renamed from: d */
    private final Continuation f98229d;

    public C41850a(Continuation continuation) {
        this.f98229d = continuation;
    }

    /* renamed from: a */
    public Continuation mo3708a(Object obj, Continuation continuation) {
        C41536l.m120489i(continuation, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    /* renamed from: c */
    public final Continuation mo96643c() {
        return this.f98229d;
    }

    /* renamed from: d */
    public StackTraceElement mo96644d() {
        return C41856g.m121272d(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract Object mo3709f(Object obj);

    /* renamed from: g */
    public C41854e mo95202g() {
        Continuation continuation = this.f98229d;
        if (continuation instanceof C41854e) {
            return (C41854e) continuation;
        }
        return null;
    }

    /* renamed from: h */
    public final void mo94382h(Object obj) {
        Continuation continuation = this;
        while (true) {
            C41857h.m121274b(continuation);
            C41850a aVar = (C41850a) continuation;
            Continuation continuation2 = aVar.f98229d;
            C41536l.m120486f(continuation2);
            try {
                Object f = aVar.mo3709f(obj);
                if (f != C41793d.m121157c()) {
                    obj = C41225n.m119478a(f);
                    aVar.mo96645k();
                    if (continuation2 instanceof C41850a) {
                        continuation = continuation2;
                    } else {
                        continuation2.mo94382h(obj);
                        return;
                    }
                } else {
                    return;
                }
            } catch (Throwable th) {
                C41225n.C41226a aVar2 = C41225n.f97210d;
                obj = C41225n.m119478a(C41228o.m119482a(th));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo96645k() {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Continuation at ");
        Object d = mo96644d();
        if (d == null) {
            d = getClass().getName();
        }
        sb.append(d);
        return sb.toString();
    }
}
