package ja1;

import androidx.lifecycle.C1644x;
import ce1.C40397a;
import ce1.C40398b;
import da1.C12033d;
import da1.C12038f;
import dd1.C40539j1;
import dd1.C40578p1;
import dd1.C40630y;
import de1.C40640a;
import ed1.C40762x;
import gb1.C32383o;
import gd1.C40992a;
import ha1.C15458b;
import hd1.C41204a;
import he1.C41238w;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.sso_client.models.C35947l;
import p341ge.bog.sso_client.models.RelatedCompany;
import rc1.C42355a;
import ue1.C43075l;

/* renamed from: ja1.a */
public final class C15734a extends C15458b {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final String f44604h;

    /* renamed from: i */
    private final C40539j1 f44605i;

    /* renamed from: j */
    private final C40630y f44606j;

    /* renamed from: k */
    private final C40578p1 f44607k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final C1644x f44608l = new C1644x();

    /* renamed from: m */
    private final C32383o f44609m = new C32383o();

    /* renamed from: n */
    private final C41204a f44610n;

    /* renamed from: o */
    private final C12033d f44611o;

    /* renamed from: ja1.a$a */
    static final class C15735a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C15734a f44612d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15735a(C15734a aVar) {
            super(1);
            this.f44612d = aVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            this.f44612d.f44608l.mo4826r(new C35947l.C35949b(th));
        }
    }

    /* renamed from: ja1.a$b */
    static final class C15736b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C15734a f44613d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15736b(C15734a aVar) {
            super(1);
            this.f44613d = aVar;
        }

        /* renamed from: a */
        public final void mo43115a(List list) {
            C1644x jw = this.f44613d.f44608l;
            C41536l.m120488h(list, "companies");
            C15734a aVar = this.f44613d;
            ArrayList arrayList = new ArrayList();
            for (Object next : list) {
                if (!C41536l.m120484d(((RelatedCompany) next).mo88300b(), aVar.f44604h)) {
                    arrayList.add(next);
                }
            }
            jw.mo4826r(new C35947l.C35951d(arrayList));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo43115a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15734a(String str, C40539j1 j1Var, C40630y yVar, C40578p1 p1Var) {
        super((C40578p1) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(j1Var, "getCompaniesUseCase");
        C41536l.m120489i(yVar, "finishAuthenticationUseCase");
        C41536l.m120489i(p1Var, "getUserContactsForAuthUseCase");
        this.f44604h = str;
        this.f44605i = j1Var;
        this.f44606j = yVar;
        this.f44607k = p1Var;
        C41204a aVar = new C41204a();
        this.f44610n = aVar;
        this.f44611o = new C12033d(new C12038f((List) null, (RelatedCompany) null, 3, (DefaultConstructorMarker) null), (C42355a) null, 2, (DefaultConstructorMarker) null);
        C40762x B = j1Var.mo94575c().mo95072K(C40640a.m117458b()).mo95063B(C40992a.m118827a());
        C41536l.m120488h(B, "getCompaniesUseCase()\n  …dSchedulers.mainThread())");
        C40397a.m116967a(C40398b.m116972e(B, new C15735a(this), new C15736b(this)), aVar);
    }

    /* access modifiers changed from: protected */
    public void onCleared() {
        this.f44610n.dispose();
        super.onCleared();
    }
}
