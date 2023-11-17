package he1;

import androidx.concurrent.futures.C0611b;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ue1.C43064a;

/* renamed from: he1.p */
final class C41229p implements C41217g, Serializable {

    /* renamed from: g */
    public static final C41230a f97212g = new C41230a((DefaultConstructorMarker) null);

    /* renamed from: h */
    private static final AtomicReferenceFieldUpdater f97213h = AtomicReferenceFieldUpdater.newUpdater(C41229p.class, Object.class, "e");

    /* renamed from: d */
    private volatile C43064a f97214d;

    /* renamed from: e */
    private volatile Object f97215e;

    /* renamed from: f */
    private final Object f97216f;

    /* renamed from: he1.p$a */
    public static final class C41230a {
        private C41230a() {
        }

        public /* synthetic */ C41230a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C41229p(C43064a aVar) {
        C41536l.m120489i(aVar, "initializer");
        this.f97214d = aVar;
        C41237v vVar = C41237v.f97224a;
        this.f97215e = vVar;
        this.f97216f = vVar;
    }

    private final Object writeReplace() {
        return new C41213d(getValue());
    }

    /* renamed from: a */
    public boolean mo4932a() {
        return this.f97215e != C41237v.f97224a;
    }

    public Object getValue() {
        Object obj = this.f97215e;
        C41237v vVar = C41237v.f97224a;
        if (obj != vVar) {
            return obj;
        }
        C43064a aVar = this.f97214d;
        if (aVar != null) {
            Object invoke = aVar.invoke();
            if (C0611b.m2366a(f97213h, this, vVar, invoke)) {
                this.f97214d = null;
                return invoke;
            }
        }
        return this.f97215e;
    }

    public String toString() {
        return mo4932a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
