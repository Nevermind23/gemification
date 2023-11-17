package p341ge.bog.mobilebank.sso.presentation;

import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41238w;
import j51.C36729a;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l51.C37072a;
import l51.C37073b;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.sso.presentation.LoginViewModel */
public final class LoginViewModel extends C21481a {

    /* renamed from: d */
    private final C36729a f83870d;

    /* renamed from: e */
    private final C1644x f83871e = new C1644x();

    /* renamed from: ge.bog.mobilebank.sso.presentation.LoginViewModel$a */
    static final class C34699a extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C34699a f83872d = new C34699a();

        C34699a() {
            super(1);
        }

        public final void invoke(Throwable th) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoginViewModel(C36729a aVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(aVar, "getAuthWindowUseCase");
        this.f83870d = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: gw */
    public static final void m101920gw(LoginViewModel loginViewModel) {
        C41536l.m120489i(loginViewModel, "this$0");
        loginViewModel.f83871e.mo4823o(C41238w.f97225a);
    }

    /* access modifiers changed from: private */
    /* renamed from: hw */
    public static final void m101921hw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: fw */
    public final void mo84775fw(int i, FragmentManager fragmentManager) {
        C41536l.m120489i(fragmentManager, "fragmentManager");
        C41205b G = this.f83870d.mo89556a(i, fragmentManager).mo94888G(new C37072a(this), new C37073b(C34699a.f83872d));
        C41536l.m120488h(G, "getAuthWindowUseCase(con…  }, {\n                })");
        addDisposable(G);
    }

    /* renamed from: iw */
    public final LiveData mo84776iw() {
        return this.f83871e;
    }
}
