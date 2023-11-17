package he1;

import java.io.Serializable;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ue1.C43064a;

/* renamed from: he1.q */
final class C41231q implements C41217g, Serializable {

    /* renamed from: d */
    private C43064a f97217d;

    /* renamed from: e */
    private volatile Object f97218e;

    /* renamed from: f */
    private final Object f97219f;

    public C41231q(C43064a aVar, Object obj) {
        C41536l.m120489i(aVar, "initializer");
        this.f97217d = aVar;
        this.f97218e = C41237v.f97224a;
        this.f97219f = obj == null ? this : obj;
    }

    private final Object writeReplace() {
        return new C41213d(getValue());
    }

    /* renamed from: a */
    public boolean mo4932a() {
        return this.f97218e != C41237v.f97224a;
    }

    public Object getValue() {
        Object obj;
        Object obj2 = this.f97218e;
        C41237v vVar = C41237v.f97224a;
        if (obj2 != vVar) {
            return obj2;
        }
        synchronized (this.f97219f) {
            obj = this.f97218e;
            if (obj == vVar) {
                C43064a aVar = this.f97217d;
                C41536l.m120486f(aVar);
                obj = aVar.invoke();
                this.f97218e = obj;
                this.f97217d = null;
            }
        }
        return obj;
    }

    public String toString() {
        return mo4932a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C41231q(C43064a aVar, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, (i & 2) != 0 ? null : obj);
    }
}
