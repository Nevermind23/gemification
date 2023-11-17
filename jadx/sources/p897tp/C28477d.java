package p897tp;

import ed1.C40762x;
import he1.C41238w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.application.data.entity.ApplicationEntity;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p707as.C19273c;
import p919vp.C29130a;
import p952yp.C30106b;
import ue1.C43075l;

/* renamed from: tp.d */
public final class C28477d implements C30106b {

    /* renamed from: g */
    public static final C28478a f72286g = new C28478a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final IRetrofitService f72287d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C29130a f72288e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public List f72289f;

    /* renamed from: tp.d$a */
    public static final class C28478a {
        private C28478a() {
        }

        public /* synthetic */ C28478a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: tp.d$b */
    static final class C28479b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C28477d f72290d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C28479b(C28477d dVar) {
            super(1);
            this.f72290d = dVar;
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "it");
            C28477d dVar = this.f72290d;
            ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ApplicationEntity applicationEntity = (ApplicationEntity) it.next();
                C29130a b4 = dVar.f72288e;
                C41536l.m120488h(applicationEntity, "application");
                arrayList.add(b4.mo68985b(applicationEntity));
            }
            return arrayList;
        }
    }

    /* renamed from: tp.d$c */
    static final class C28480c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C28477d f72291d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C28480c(C28477d dVar) {
            super(1);
            this.f72291d = dVar;
        }

        /* renamed from: a */
        public final void mo68099a(List list) {
            this.f72291d.f72289f = list;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo68099a((List) obj);
            return C41238w.f97225a;
        }
    }

    public C28477d(IRetrofitService iRetrofitService, C29130a aVar) {
        C41536l.m120489i(iRetrofitService, "service");
        C41536l.m120489i(aVar, "mapper");
        this.f72287d = iRetrofitService;
        this.f72288e = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: d4 */
    public static final List m87319d4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: e4 */
    public static final void m87320e4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: J1 */
    public C40762x mo68097J1(boolean z) {
        List list;
        if (z || (list = this.f72289f) == null) {
            C40762x<BankApiResponse<List<ApplicationEntity>>> applications = this.f72287d.getApplications("COLLECTOR_GET_APPLICATIONS_WITH_CARD_OR_DEPOSIT_DETAILS");
            C41536l.m120488h(applications, "service.getApplications(…_CARD_OR_DEPOSIT_DETAILS)");
            C40762x m = C19273c.m64722h(applications).mo95062A(new C28475b(new C28479b(this))).mo95084m(new C28476c(new C28480c(this)));
            C41536l.m120488h(m, "override fun getApplicat…nDetails)\n        }\n    }");
            return m;
        }
        C40762x z2 = C40762x.m118162z(list);
        C41536l.m120488h(z2, "{\n            Single.jus…icationDetails)\n        }");
        return z2;
    }

    public void clean() {
        this.f72289f = null;
    }
}
