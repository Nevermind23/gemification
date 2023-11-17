package gb1;

import androidx.lifecycle.C1619q;
import androidx.lifecycle.C1644x;
import androidx.lifecycle.C1645y;
import ei1.C40894a;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: gb1.o */
public class C32383o extends C1644x {

    /* renamed from: m */
    public static final C32384a f79832m = new C32384a((DefaultConstructorMarker) null);

    /* renamed from: l */
    private final AtomicBoolean f79833l = new AtomicBoolean(false);

    /* renamed from: gb1.o$a */
    public static final class C32384a {
        private C32384a() {
        }

        public /* synthetic */ C32384a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public static final void m95628v(C32383o oVar, C1645y yVar, Object obj) {
        C41536l.m120489i(oVar, "this$0");
        C41536l.m120489i(yVar, "$observer");
        if (oVar.f79833l.compareAndSet(true, false)) {
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
        super.mo4819k(qVar, new C32382n(this, yVar));
    }

    /* renamed from: r */
    public void mo4826r(Object obj) {
        this.f79833l.set(true);
        super.mo4826r(obj);
    }

    /* renamed from: t */
    public final void mo72872t() {
        mo4826r((Object) null);
    }

    /* renamed from: u */
    public final void mo72873u() {
        mo4823o((Object) null);
    }
}
