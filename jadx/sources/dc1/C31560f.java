package dc1;

import androidx.lifecycle.C1613n0;
import androidx.lifecycle.LiveData;
import ce1.C40397a;
import ce1.C40398b;
import dd1.C40581p3;
import dd1.C40619v4;
import de1.C40640a;
import ed1.C40734b;
import ei1.C40894a;
import gb1.C32383o;
import gd1.C40992a;
import hd1.C41204a;
import he1.C41238w;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p341ge.bog.sso_client.models.C35947l;
import p341ge.bog.sso_client.models.UserContact;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: dc1.f */
public final class C31560f extends C1613n0 {

    /* renamed from: d */
    private final C40581p3 f78128d;

    /* renamed from: e */
    private final C40619v4 f78129e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C32383o f78130f = new C32383o();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C32383o f78131g = new C32383o();

    /* renamed from: h */
    private final C41204a f78132h = new C41204a();

    /* renamed from: dc1.f$a */
    static final class C31561a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C31560f f78133d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31561a(C31560f fVar) {
            super(1);
            this.f78133d = fVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            C40894a.m118635a(th);
            this.f78133d.f78130f.mo4826r(new C35947l.C35949b(th));
        }
    }

    /* renamed from: dc1.f$b */
    static final class C31562b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C31560f f78134d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31562b(C31560f fVar) {
            super(0);
            this.f78134d = fVar;
        }

        public final void invoke() {
            this.f78134d.f78130f.mo4826r(new C35947l.C35951d(C41238w.f97225a));
        }
    }

    /* renamed from: dc1.f$c */
    static final class C31563c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C31560f f78135d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31563c(C31560f fVar) {
            super(1);
            this.f78135d = fVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            C40894a.m118635a(th);
            this.f78135d.f78131g.mo4826r(new C35947l.C35949b(th));
        }
    }

    /* renamed from: dc1.f$d */
    static final class C31564d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C31560f f78136d;

        /* renamed from: e */
        final /* synthetic */ String f78137e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31564d(C31560f fVar, String str) {
            super(0);
            this.f78136d = fVar;
            this.f78137e = str;
        }

        public final void invoke() {
            this.f78136d.f78131g.mo4826r(new C35947l.C35951d(this.f78137e));
        }
    }

    public C31560f(C40581p3 p3Var, C40619v4 v4Var) {
        C41536l.m120489i(p3Var, "requestOneTimePasswordUseCase");
        C41536l.m120489i(v4Var, "verifyOneTimePasswordUseCase");
        this.f78128d = p3Var;
        this.f78129e = v4Var;
    }

    /* renamed from: fw */
    public final LiveData mo71987fw() {
        return this.f78130f;
    }

    /* renamed from: gw */
    public final LiveData mo71988gw() {
        return this.f78131g;
    }

    /* renamed from: hw */
    public final void mo71989hw(UserContact userContact) {
        C41536l.m120489i(userContact, "userContact");
        C40734b z = C40581p3.m117364d(this.f78128d, userContact, (String) null, false, 6, (Object) null).mo94890I(C40640a.m117458b()).mo94906z(C40992a.m118827a());
        C41536l.m120488h(z, "requestOneTimePasswordUs…dSchedulers.mainThread())");
        C40397a.m116967a(C40398b.m116971d(z, new C31561a(this), new C31562b(this)), this.f78132h);
    }

    /* renamed from: iw */
    public final void mo71990iw(String str, String str2) {
        C41536l.m120489i(str, "password");
        C41536l.m120489i(str2, "clientKey");
        C40734b z = this.f78129e.mo94624c(str, str2).mo94890I(C40640a.m117458b()).mo94906z(C40992a.m118827a());
        C41536l.m120488h(z, "verifyOneTimePasswordUse…dSchedulers.mainThread())");
        C40397a.m116967a(C40398b.m116971d(z, new C31563c(this), new C31564d(this, str2)), this.f78132h);
    }

    /* access modifiers changed from: protected */
    public void onCleared() {
        this.f78132h.dispose();
        super.onCleared();
    }
}
