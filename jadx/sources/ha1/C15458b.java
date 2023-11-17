package ha1;

import androidx.lifecycle.C1613n0;
import androidx.lifecycle.LiveData;
import ce1.C40397a;
import ce1.C40398b;
import dd1.C40578p1;
import de1.C40640a;
import ed1.C40762x;
import ei1.C40894a;
import fh1.C40951a;
import gb1.C32383o;
import gd1.C40992a;
import gh1.C41125a;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41224m;
import he1.C41238w;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nh1.C41806a;
import p341ge.bog.sso_client.models.C35947l;
import sso.type.StrongAuthMethod;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ha1.b */
public class C15458b extends C1613n0 {

    /* renamed from: d */
    private final C40578p1 f43873d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C32383o f43874e;

    /* renamed from: f */
    private final C32383o f43875f;

    /* renamed from: g */
    private final C41204a f43876g;

    /* renamed from: ha1.b$a */
    static final class C15459a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C15458b f43877d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15459a(C15458b bVar) {
            super(1);
            this.f43877d = bVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            C40894a.m118635a(th);
            this.f43877d.f43874e.mo4826r(new C35947l.C35949b(th));
        }
    }

    /* renamed from: ha1.b$b */
    static final class C15460b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C15458b f43878d;

        /* renamed from: e */
        final /* synthetic */ String f43879e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15460b(C15458b bVar, String str) {
            super(1);
            this.f43878d = bVar;
            this.f43879e = str;
        }

        /* renamed from: a */
        public final void mo42546a(C41224m mVar) {
            this.f43878d.f43874e.mo4826r(new C35947l.C35951d(new C41224m(mVar, this.f43879e)));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo42546a((C41224m) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ha1.b$c */
    public static final class C15461c implements C41125a {

        /* renamed from: a */
        private final Object f43880a = mo26679a().mo95345c().mo97161i().mo97675g(C41520a0.m120436b(C40578p1.class), (C41806a) null, (C43064a) null);

        /* renamed from: a */
        public C40951a mo26679a() {
            return C41125a.C41126a.m119226a(this);
        }

        /* renamed from: b */
        public final Object mo42547b() {
            return this.f43880a;
        }
    }

    public C15458b() {
        this((C40578p1) null, 1, (DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: ew */
    public final C41205b mo42540ew(C41205b bVar) {
        C41536l.m120489i(bVar, "<this>");
        this.f43876g.mo95660b(bVar);
        return bVar;
    }

    /* renamed from: fw */
    public final LiveData mo42541fw() {
        return this.f43874e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: gw */
    public final C32383o mo42542gw() {
        return this.f43875f;
    }

    /* renamed from: hw */
    public final void mo42543hw(String str, StrongAuthMethod strongAuthMethod) {
        C41536l.m120489i(str, "clientKey");
        C41536l.m120489i(strongAuthMethod, "strongAuthMethod");
        C40762x B = this.f43873d.mo94596c(strongAuthMethod).mo95072K(C40640a.m117458b()).mo95063B(C40992a.m118827a());
        C41536l.m120488h(B, "getUserContactsForAuthUs…dSchedulers.mainThread())");
        C40397a.m116967a(C40398b.m116972e(B, new C15459a(this), new C15460b(this, str)), this.f43876g);
    }

    /* access modifiers changed from: protected */
    public void onCleared() {
        this.f43876g.dispose();
        super.onCleared();
    }

    /* renamed from: x0 */
    public final LiveData mo42544x0() {
        return this.f43875f;
    }

    public C15458b(C40578p1 p1Var) {
        C41536l.m120489i(p1Var, "getUserContactsForAuthUseCase");
        this.f43873d = p1Var;
        this.f43874e = new C32383o();
        this.f43875f = new C32383o();
        this.f43876g = new C41204a();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15458b(C40578p1 p1Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? (C40578p1) new C15461c().mo42547b() : p1Var);
    }
}
