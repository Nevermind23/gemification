package w30;

import androidx.lifecycle.C1639v;
import androidx.lifecycle.C1645y;
import androidx.lifecycle.LiveData;
import he1.C41212c;
import he1.C41238w;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21503d;
import r30.C27909i;
import ue1.C43075l;

/* renamed from: w30.t */
public final class C29219t extends C1639v {

    /* renamed from: m */
    private final LiveData f74262m;

    /* renamed from: n */
    private final LiveData f74263n;

    /* renamed from: o */
    private final LiveData f74264o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public boolean f74265p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public boolean f74266q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public boolean f74267r;

    /* renamed from: w30.t$a */
    static final class C29220a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29219t f74268d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29220a(C29219t tVar) {
            super(1);
            this.f74268d = tVar;
        }

        /* renamed from: a */
        public final void mo69066a(C27909i iVar) {
            this.f74268d.f74265p = C41536l.m120484d(iVar, C27909i.C27911b.f71099b);
            this.f74268d.m89169A();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo69066a((C27909i) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: w30.t$b */
    static final class C29221b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29219t f74269d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29221b(C29219t tVar) {
            super(1);
            this.f74269d = tVar;
        }

        /* renamed from: a */
        public final void mo69067a(C21503d dVar) {
            this.f74269d.f74266q = dVar.mo53703c();
            this.f74269d.m89169A();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo69067a((C21503d) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: w30.t$c */
    static final class C29222c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29219t f74270d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29222c(C29219t tVar) {
            super(1);
            this.f74270d = tVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Boolean) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Boolean bool) {
            C29219t tVar = this.f74270d;
            C41536l.m120488h(bool, "it");
            tVar.f74267r = bool.booleanValue();
            this.f74270d.m89169A();
        }
    }

    /* renamed from: w30.t$d */
    static final class C29223d implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f74271a;

        C29223d(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f74271a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f74271a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f74271a.invoke(obj);
        }
    }

    public C29219t(LiveData liveData, LiveData liveData2, LiveData liveData3) {
        C41536l.m120489i(liveData, "templatesAndPayments");
        C41536l.m120489i(liveData2, "contactsLiveData");
        C41536l.m120489i(liveData3, "moneyRequestIsRefreshing");
        this.f74262m = liveData;
        this.f74263n = liveData2;
        this.f74264o = liveData3;
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public final void m89169A() {
        mo4826r(Boolean.valueOf(this.f74265p || this.f74266q || this.f74267r));
    }

    /* renamed from: z */
    private final void m89174z() {
        mo4957t(this.f74262m);
        mo4957t(this.f74263n);
        mo4957t(this.f74264o);
    }

    /* renamed from: y */
    public final void mo69065y() {
        m89174z();
        mo4956s(this.f74262m, new C29223d(new C29220a(this)));
        mo4956s(this.f74263n, new C29223d(new C29221b(this)));
        mo4956s(this.f74264o, new C29223d(new C29222c(this)));
    }
}
