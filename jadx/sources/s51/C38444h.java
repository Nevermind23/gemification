package s51;

import androidx.lifecycle.C1644x;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41238w;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p51.C37906g;
import ue1.C43075l;

/* renamed from: s51.h */
public final class C38444h extends C21481a implements C38440d, C38441e {

    /* renamed from: d */
    private long f92091d;

    /* renamed from: e */
    private boolean f92092e;

    /* renamed from: f */
    private final C38440d f92093f = this;

    /* renamed from: g */
    private final C38441e f92094g = this;

    /* renamed from: h */
    private final C1644x f92095h = new C1644x();

    /* renamed from: s51.h$a */
    static final class C38445a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C38444h f92096d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38445a(C38444h hVar) {
            super(1);
            this.f92096d = hVar;
        }

        /* renamed from: a */
        public final void mo92004a(List list) {
            this.f92096d.mo92001Gt().mo4823o(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo92004a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: s51.h$b */
    static final class C38446b extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C38446b f92097d = new C38446b();

        C38446b() {
            super(1);
        }

        public final void invoke(Throwable th) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: s51.h$c */
    public interface C38447c {
        /* renamed from: a */
        C38444h mo32809a(long j, boolean z);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38444h(C37906g gVar, long j, boolean z) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(gVar, "getSelectableAccountsUseCase");
        this.f92091d = j;
        this.f92092e = z;
        C41205b I = C37906g.m111393e(gVar, this.f92092e, this.f92091d, false, 4, (Object) null).mo95070I(new C38442f(new C38445a(this)), new C38443g(C38446b.f92097d));
        C41536l.m120488h(I, "getSelectableAccountsUse…t)\n                }, {})");
        bindToLifecycle(I);
    }

    /* access modifiers changed from: private */
    public static final void _init_$lambda$0(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: fw */
    public static final void m112872fw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: gw */
    public final C38441e mo92002gw() {
        return this.f92094g;
    }

    /* renamed from: hw */
    public C1644x mo92001Gt() {
        return this.f92095h;
    }
}
