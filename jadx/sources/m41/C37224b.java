package m41;

import androidx.lifecycle.C1619q;
import androidx.lifecycle.C1644x;
import androidx.lifecycle.C1645y;
import androidx.lifecycle.LiveData;
import he1.C41212c;
import he1.C41238w;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import ue1.C43075l;

/* renamed from: m41.b */
public abstract class C37224b {

    /* renamed from: m41.b$a */
    static final class C37225a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C43075l f89644d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37225a(C43075l lVar) {
            super(1);
            this.f89644d = lVar;
        }

        /* renamed from: a */
        public final void mo90300a(C37223a aVar) {
            Object a;
            if (aVar != null && (a = aVar.mo90296a()) != null) {
                this.f89644d.invoke(a);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo90300a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: m41.b$b */
    static final class C37226b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C43075l f89645d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37226b(C43075l lVar) {
            super(1);
            this.f89645d = lVar;
        }

        /* renamed from: a */
        public final void mo90301a(C37223a aVar) {
            if (!aVar.mo90297b()) {
                this.f89645d.invoke(aVar.mo90298c());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo90301a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: m41.b$c */
    static final class C37227c implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f89646a;

        C37227c(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f89646a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f89646a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f89646a.invoke(obj);
        }
    }

    /* renamed from: a */
    public static final void m109962a(C1644x xVar) {
        C41536l.m120489i(xVar, "<this>");
        m109965d(xVar, C41238w.f97225a);
    }

    /* renamed from: b */
    public static final void m109963b(LiveData liveData, C1619q qVar, C43075l lVar) {
        C41536l.m120489i(liveData, "<this>");
        C41536l.m120489i(qVar, "owner");
        C41536l.m120489i(lVar, "onEventUnhandledContent");
        liveData.mo4819k(qVar, new C37227c(new C37225a(lVar)));
    }

    /* renamed from: c */
    public static final void m109964c(LiveData liveData, C1619q qVar, C43075l lVar) {
        C41536l.m120489i(liveData, "<this>");
        C41536l.m120489i(qVar, "owner");
        C41536l.m120489i(lVar, "onEventUnhandledContent");
        liveData.mo4819k(qVar, new C37227c(new C37226b(lVar)));
    }

    /* renamed from: d */
    public static final void m109965d(C1644x xVar, Object obj) {
        C41536l.m120489i(xVar, "<this>");
        xVar.mo4823o(new C37223a(obj));
    }

    /* renamed from: e */
    public static final void m109966e(C1644x xVar, Object obj) {
        C41536l.m120489i(xVar, "<this>");
        xVar.mo4826r(new C37223a(obj));
    }

    /* renamed from: f */
    public static final void m109967f(C1644x xVar, C43075l lVar) {
        C41536l.m120489i(xVar, "<this>");
        C41536l.m120489i(lVar, "block");
        Object f = xVar.mo4814f();
        if (f != null) {
            xVar.mo4823o(lVar.invoke(f));
        }
    }
}
