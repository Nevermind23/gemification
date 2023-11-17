package p940wz;

import a00.C19147a;
import ed1.C40749p;
import ed1.C40762x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import md0.C26186e;
import nd0.C26453c;
import od0.C26940a;
import od0.C26941b;
import p341ge.bog.mobilebank.cleanarch.data.common.entity.ServiceStatusEntity;
import p341ge.bog.mobilebank.cleanarch.data.productconfirmation.entity.PendingProductConfirmationEntity;
import p341ge.bog.mobilebank.cleanarch.offersandapplications.data.entity.NewLoanAllowedEntity;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p707as.C19273c;
import p823lw.C26094a;
import p962yz.C30124a;
import p973zz.C30416a;
import p973zz.C30417b;
import pd0.C27503h;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: wz.d */
public final class C29599d implements C19147a, C26941b {

    /* renamed from: j */
    public static final C29600a f74756j = new C29600a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final IRetrofitService f74757d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C30416a f74758e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C30417b f74759f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C26094a f74760g;

    /* renamed from: h */
    private final /* synthetic */ C26940a f74761h = new C26940a();

    /* renamed from: i */
    private final C27503h f74762i = mo69491g4(new C27503h());

    /* renamed from: wz.d$a */
    public static final class C29600a {
        private C29600a() {
        }

        public /* synthetic */ C29600a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: wz.d$b */
    /* synthetic */ class C29601b extends C41535k implements C43064a {
        C29601b(Object obj) {
            super(0, obj, C29599d.class, "getCreditInfoPermissionStatusObservable", "getCreditInfoPermissionStatusObservable()Lio/reactivex/Observable;", 0);
        }

        public final C40749p invoke() {
            return ((C29599d) this.receiver).m89846i4();
        }
    }

    /* renamed from: wz.d$c */
    static final class C29602c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29599d f74763d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29602c(C29599d dVar) {
            super(1);
            this.f74763d = dVar;
        }

        /* renamed from: a */
        public final C30124a invoke(List list) {
            C41536l.m120489i(list, "it");
            C30416a c4 = this.f74763d.f74758e;
            Object obj = list.get(0);
            C41536l.m120488h(obj, "it[0]");
            return c4.mo70772a((ServiceStatusEntity) obj);
        }
    }

    /* renamed from: wz.d$d */
    static final class C29603d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29599d f74764d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29603d(C29599d dVar) {
            super(1);
            this.f74764d = dVar;
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "ls");
            C26094a e4 = this.f74764d.f74760g;
            ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(e4.mo65012a((PendingProductConfirmationEntity) it.next()));
            }
            return arrayList;
        }
    }

    /* renamed from: wz.d$e */
    static final class C29604e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29599d f74765d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29604e(C29599d dVar) {
            super(1);
            this.f74765d = dVar;
        }

        /* renamed from: a */
        public final Boolean invoke(NewLoanAllowedEntity newLoanAllowedEntity) {
            C41536l.m120489i(newLoanAllowedEntity, "isAllowed");
            return Boolean.valueOf(this.f74765d.f74759f.mo70773a(newLoanAllowedEntity));
        }
    }

    /* renamed from: wz.d$f */
    /* synthetic */ class C29605f extends C41535k implements C43064a {
        C29605f(Object obj) {
            super(0, obj, C29599d.class, "getCreditInfoPermissionStatusObservable", "getCreditInfoPermissionStatusObservable()Lio/reactivex/Observable;", 0);
        }

        public final C40749p invoke() {
            return ((C29599d) this.receiver).m89846i4();
        }
    }

    public C29599d(IRetrofitService iRetrofitService, C30416a aVar, C30417b bVar, C26094a aVar2) {
        C41536l.m120489i(iRetrofitService, "service");
        C41536l.m120489i(aVar, "creditInfoPermissionStatusMapper");
        C41536l.m120489i(bVar, "isNewApplicationAllowedMapper");
        C41536l.m120489i(aVar2, "pendingProductConfirmationMapper");
        this.f74757d = iRetrofitService;
        this.f74758e = aVar;
        this.f74759f = bVar;
        this.f74760g = aVar2;
    }

    /* access modifiers changed from: private */
    /* renamed from: i4 */
    public final C40749p m89846i4() {
        C40762x<BankApiResponse<List<ServiceStatusEntity>>> serviceStatus = this.f74757d.getServiceStatus("COMMON_GET_EXT_SERVICE_STATUS_V2", "CREDIT_INFO_GET_CUSTOMER_INFO_OFFER");
        C41536l.m120488h(serviceStatus, "service.getServiceStatus…OMER_INFO_OFFER\n        )");
        C40749p g = C19273c.m64722h(serviceStatus).mo95062A(new C29597b(new C29602c(this))).mo95075O().mo95021g();
        C41536l.m120488h(g, "private fun getCreditInf…           .cache()\n    }");
        return g;
    }

    /* access modifiers changed from: private */
    /* renamed from: j4 */
    public static final C30124a m89847j4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C30124a) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: k4 */
    public static final List m89848k4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: l4 */
    public static final Boolean m89849l4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (Boolean) lVar.invoke(obj);
    }

    /* renamed from: I2 */
    public C40762x mo47345I2(String str) {
        C41536l.m120489i(str, "applicationType");
        C40762x<BankApiResponse<NewLoanAllowedEntity>> isNewApplicationAllowed = this.f74757d.isNewApplicationAllowed("APPLICATIONS_NEW_APP_ALLOWED", str);
        C41536l.m120488h(isNewApplicationAllowed, "service.isNewApplication…applicationType\n        )");
        C40762x A = C19273c.m64722h(isNewApplicationAllowed).mo95062A(new C29598c(new C29604e(this)));
        C41536l.m120488h(A, "override fun isNewApplic…nsform(isAllowed) }\n    }");
        return A;
    }

    /* renamed from: X2 */
    public void mo47346X2() {
        this.f74762i.mo66814o(true, new C29605f(this)).mo94979E0();
    }

    public void addStore(C27503h hVar) {
        C41536l.m120489i(hVar, "store");
        this.f74761h.addStore(hVar);
    }

    public void clean() {
        mo69492h4();
    }

    /* renamed from: e1 */
    public C40762x mo47347e1() {
        C40762x<BankApiResponse<List<PendingProductConfirmationEntity>>> pendingProductConfirmationsReactive = this.f74757d.getPendingProductConfirmationsReactive("APPLICATIONS_RBS_GET_DETAILS");
        C41536l.m120488h(pendingProductConfirmationsReactive, "service.getPendingProduc…ICATIONS_RBS_GET_DETAILS)");
        C40762x A = C19273c.m64722h(pendingProductConfirmationsReactive).mo95062A(new C29596a(new C29603d(this)));
        C41536l.m120488h(A, "override fun getPendingP…apper::transform) }\n    }");
        return A;
    }

    /* renamed from: g4 */
    public C27503h mo69491g4(C27503h hVar) {
        C41536l.m120489i(hVar, "<this>");
        return this.f74761h.mo66226a(hVar);
    }

    /* renamed from: h4 */
    public void mo69492h4() {
        this.f74761h.mo66227b();
    }

    /* renamed from: k0 */
    public C40749p mo47348k0(boolean z) {
        C40749p e = C26186e.m81987e(C26453c.m82747e(this.f74762i.mo66812m()));
        this.f74762i.mo66814o(z, new C29601b(this)).mo94979E0();
        return e;
    }
}
