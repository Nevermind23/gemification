package gb1;

import androidx.lifecycle.C1619q;
import androidx.lifecycle.C1639v;
import androidx.lifecycle.C1645y;
import ei1.C40894a;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: gb1.q */
public class C32386q extends C1639v {

    /* renamed from: n */
    public static final C32387a f79836n = new C32387a((DefaultConstructorMarker) null);

    /* renamed from: m */
    private final AtomicBoolean f79837m = new AtomicBoolean(false);

    /* renamed from: gb1.q$a */
    public static final class C32387a {
        private C32387a() {
        }

        public /* synthetic */ C32387a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public static final void m95634v(C32386q qVar, C1645y yVar, Object obj) {
        C41536l.m120489i(qVar, "this$0");
        C41536l.m120489i(yVar, "$observer");
        if (qVar.f79837m.compareAndSet(true, false)) {
            yVar.onChanged(obj);
        }
    }

    /* renamed from: k */
    public void mo4819k(C1619q qVar, C1645y yVar) {
        C41536l.m120489i(qVar, "owner");
        C41536l.m120489i(yVar, "observer");
        if (mo4816h()) {
            C40894a.m118636b("SingleLiveEvent").mo95296b("Multiple observers registered but only one will be notified of changes.", new Object[0]);
        }
        super.mo4819k(qVar, new C32385p(this, yVar));
    }

    /* renamed from: o */
    public void mo4823o(Object obj) {
        this.f79837m.set(true);
        super.mo4823o(obj);
    }

    /* renamed from: r */
    public void mo4826r(Object obj) {
        this.f79837m.set(true);
        super.mo4826r(obj);
    }
}
