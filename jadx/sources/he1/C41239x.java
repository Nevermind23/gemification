package he1;

import java.io.Serializable;
import kotlin.jvm.internal.C41536l;
import ue1.C43064a;

/* renamed from: he1.x */
public final class C41239x implements C41217g, Serializable {

    /* renamed from: d */
    private C43064a f97226d;

    /* renamed from: e */
    private Object f97227e = C41237v.f97224a;

    public C41239x(C43064a aVar) {
        C41536l.m120489i(aVar, "initializer");
        this.f97226d = aVar;
    }

    private final Object writeReplace() {
        return new C41213d(getValue());
    }

    /* renamed from: a */
    public boolean mo4932a() {
        return this.f97227e != C41237v.f97224a;
    }

    public Object getValue() {
        if (this.f97227e == C41237v.f97224a) {
            C43064a aVar = this.f97226d;
            C41536l.m120486f(aVar);
            this.f97227e = aVar.invoke();
            this.f97226d = null;
        }
        return this.f97227e;
    }

    public String toString() {
        return mo4932a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
