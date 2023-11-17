package nm0;

import ed1.C40734b;
import ed1.C40749p;
import ed1.C40762x;
import j51.C36735g;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import lm0.C26055a;
import m51.C37228a;
import mm0.C26255a;
import nd0.C26453c;
import od0.C26940a;
import od0.C26941b;
import p341ge.bog.mobilebank.junior.data.model.ChildApprovalEntity;
import p341ge.bog.mobilebank.junior.data.model.ChildOtpRequestEntity;
import p341ge.bog.mobilebank.junior.data.model.ChildRequestApproveEntity;
import pd0.C27503h;
import qm0.C27851a;
import sm0.C28249a;
import sm0.C28250b;
import sm0.C28251c;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: nm0.e */
public final class C26558e implements C27851a, C26941b {

    /* renamed from: d */
    private final C26255a f67164d;

    /* renamed from: e */
    private final C26055a f67165e;

    /* renamed from: f */
    private final C36735g f67166f;

    /* renamed from: g */
    private final /* synthetic */ C26940a f67167g = new C26940a();

    /* renamed from: h */
    private final C27503h f67168h = mo65833e4(new C27503h());

    /* renamed from: nm0.e$a */
    /* synthetic */ class C26559a extends C41535k implements C43075l {
        C26559a(Object obj) {
            super(1, obj, C26055a.class, "transform", "transform(Lge/bog/mobilebank/junior/data/model/ChildApprovalEntity;)Lge/bog/mobilebank/junior/domain/model/ChildApproval;", 0);
        }

        /* renamed from: b */
        public final C28249a invoke(ChildApprovalEntity childApprovalEntity) {
            C41536l.m120489i(childApprovalEntity, "p0");
            return ((C26055a) this.receiver).mo64950a(childApprovalEntity);
        }
    }

    /* renamed from: nm0.e$b */
    /* synthetic */ class C26560b extends C41535k implements C43075l {
        C26560b(Object obj) {
            super(1, obj, C26055a.class, "transform", "transformJuniorRequestData(Ljava/util/List;)Ljava/util/List;", 0);
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "p0");
            return ((C26055a) this.receiver).mo64954e(list);
        }
    }

    /* renamed from: nm0.e$c */
    /* synthetic */ class C26561c extends C41535k implements C43064a {
        C26561c(Object obj) {
            super(0, obj, C26558e.class, "getJuniorDataObservable", "getJuniorDataObservable()Lio/reactivex/Observable;", 0);
        }

        public final C40749p invoke() {
            return ((C26558e) this.receiver).m82957h4();
        }
    }

    /* renamed from: nm0.e$d */
    /* synthetic */ class C26562d extends C41535k implements C43075l {
        C26562d(Object obj) {
            super(1, obj, C26055a.class, "transform", "transform(Lge/bog/mobilebank/junior/data/model/ChildRequestApproveEntity;)Lge/bog/mobilebank/junior/domain/model/ChildRequestApprove;", 0);
        }

        /* renamed from: b */
        public final C28251c invoke(ChildRequestApproveEntity childRequestApproveEntity) {
            C41536l.m120489i(childRequestApproveEntity, "p0");
            return ((C26055a) this.receiver).mo64952c(childRequestApproveEntity);
        }
    }

    /* renamed from: nm0.e$e */
    /* synthetic */ class C26563e extends C41535k implements C43075l {
        C26563e(Object obj) {
            super(1, obj, C26055a.class, "transform", "transform(Lge/bog/mobilebank/junior/data/model/ChildOtpRequestEntity;)Lge/bog/mobilebank/junior/domain/model/ChildOtpRequest;", 0);
        }

        /* renamed from: b */
        public final C28250b invoke(ChildOtpRequestEntity childOtpRequestEntity) {
            C41536l.m120489i(childOtpRequestEntity, "p0");
            return ((C26055a) this.receiver).mo64951b(childOtpRequestEntity);
        }
    }

    public C26558e(C26255a aVar, C26055a aVar2, C36735g gVar) {
        C41536l.m120489i(aVar, "service");
        C41536l.m120489i(aVar2, "mapper");
        C41536l.m120489i(gVar, "getLoginInfo");
        this.f67164d = aVar;
        this.f67165e = aVar2;
        this.f67166f = gVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: f4 */
    public static final C28249a m82956f4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C28249a) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: h4 */
    public final C40749p m82957h4() {
        Long l;
        C26255a aVar = this.f67164d;
        C37228a a = this.f67166f.mo89562a();
        if (a != null) {
            l = Long.valueOf(a.mo90305b());
        } else {
            l = null;
        }
        C40749p k0 = aVar.mo65352i3(String.valueOf(l)).mo95026k0(new C26554a(new C26560b(this.f67165e)));
        C41536l.m120488h(k0, "service.getJuniorRequest…  .map(mapper::transform)");
        return k0;
    }

    /* access modifiers changed from: private */
    /* renamed from: i4 */
    public static final List m82958i4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* renamed from: j4 */
    private final void m82959j4(boolean z) {
        this.f67168h.mo66814o(z, new C26561c(this)).mo94979E0();
    }

    /* access modifiers changed from: private */
    /* renamed from: k4 */
    public static final C28251c m82960k4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C28251c) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: l4 */
    public static final C28250b m82961l4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C28250b) lVar.invoke(obj);
    }

    /* renamed from: B2 */
    public C40762x mo65826B2(String str) {
        C41536l.m120489i(str, "phone");
        C40762x A = this.f67164d.mo65345B2(str).mo95062A(new C26555b(new C26563e(this.f67165e)));
        C41536l.m120488h(A, "service.sendOtpToChild(p…  .map(mapper::transform)");
        return A;
    }

    /* renamed from: C0 */
    public C40734b mo65827C0(long j) {
        return this.f67164d.mo65346C0(j);
    }

    /* renamed from: E2 */
    public C40762x mo65828E2(String str, long j) {
        C41536l.m120489i(str, "contact");
        C40762x A = this.f67164d.mo65347E2(str, j).mo95062A(new C26556c(new C26559a(this.f67165e)));
        C41536l.m120488h(A, "service.approveFinancial… ).map(mapper::transform)");
        return A;
    }

    /* renamed from: K2 */
    public C40734b mo65829K2(String str, String str2, long j, long j2) {
        C41536l.m120489i(str, "phone");
        C41536l.m120489i(str2, "otp");
        return this.f67164d.mo65348K2(str, str2, j, j2);
    }

    /* renamed from: N0 */
    public C40734b mo65830N0(HashMap hashMap) {
        C41536l.m120489i(hashMap, "params");
        return this.f67164d.mo65349N0(hashMap);
    }

    /* renamed from: T1 */
    public C40762x mo65831T1(HashMap hashMap) {
        C41536l.m120489i(hashMap, "params");
        C40762x A = this.f67164d.mo65350T1(hashMap).mo95062A(new C26557d(new C26562d(this.f67165e)));
        C41536l.m120488h(A, "service.registerChildOnB…s).map(mapper::transform)");
        return A;
    }

    /* renamed from: T7 */
    public void mo65832T7() {
        m82959j4(true);
    }

    public void addStore(C27503h hVar) {
        C41536l.m120489i(hVar, "store");
        this.f67167g.addStore(hVar);
    }

    public void clean() {
        mo65834g4();
    }

    /* renamed from: e4 */
    public C27503h mo65833e4(C27503h hVar) {
        C41536l.m120489i(hVar, "<this>");
        return this.f67167g.mo66226a(hVar);
    }

    /* renamed from: g4 */
    public void mo65834g4() {
        this.f67167g.mo66227b();
    }

    /* renamed from: h3 */
    public C40734b mo65835h3(String str) {
        C41536l.m120489i(str, "childRequestId");
        return this.f67164d.mo65351h3(str);
    }

    /* renamed from: kl */
    public C40749p mo65836kl(boolean z) {
        C40749p e = C26453c.m82747e(this.f67168h.mo66812m());
        m82959j4(z);
        return e;
    }
}
