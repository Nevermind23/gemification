package qe0;

import ed1.C40734b;
import ed1.C40762x;
import ef0.C20228c;
import ef0.C20230e;
import ef0.C20231f;
import ef0.C20232g;
import fb1.C31973a;
import ff0.C20472a;
import he1.C41238w;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import je0.C25429w0;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.galtandtaggart.data.onboarding.userinfo.model.OnboardingListOfValuesApiModel;
import p341ge.bog.mobilebank.galtandtaggart.data.onboarding.userinfo.model.ReviewDataApiModel;
import p748eu.C20292b;
import p758fu.C20557a;
import pe0.C27519a;
import ue1.C43075l;

/* renamed from: qe0.g */
public final class C27782g implements C20472a {

    /* renamed from: k */
    public static final C27783a f70874k = new C27783a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final C25429w0 f70875d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C27519a f70876e;

    /* renamed from: f */
    private final C20292b f70877f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final AtomicReference f70878g = new AtomicReference((Object) null);
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final AtomicReference f70879h = new AtomicReference();

    /* renamed from: i */
    private final AtomicReference f70880i = new AtomicReference((Object) null);
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final AtomicReference f70881j = new AtomicReference((Object) null);

    /* renamed from: qe0.g$a */
    public static final class C27783a {
        private C27783a() {
        }

        public /* synthetic */ C27783a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: qe0.g$b */
    static final class C27784b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C27782g f70882d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27784b(C27782g gVar) {
            super(1);
            this.f70882d = gVar;
        }

        /* renamed from: a */
        public final C20230e invoke(ReviewDataApiModel reviewDataApiModel) {
            C41536l.m120489i(reviewDataApiModel, "it");
            C27519a i4 = this.f70882d.f70876e;
            Object obj = this.f70882d.f70878g.get();
            C41536l.m120488h(obj, "temporaryUserInfoModel.get()");
            return i4.mo66837d(reviewDataApiModel, (C20232g) obj);
        }
    }

    /* renamed from: qe0.g$c */
    static final class C27785c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C27782g f70883d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27785c(C27782g gVar) {
            super(1);
            this.f70883d = gVar;
        }

        /* renamed from: a */
        public final void mo67320a(C20230e eVar) {
            this.f70883d.f70881j.set(eVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo67320a((C20230e) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: qe0.g$d */
    static final class C27786d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C27782g f70884d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27786d(C27782g gVar) {
            super(1);
            this.f70884d = gVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            this.f70884d.f70881j.set((Object) null);
        }
    }

    /* renamed from: qe0.g$e */
    /* synthetic */ class C27787e extends C41535k implements C43075l {
        C27787e(Object obj) {
            super(1, obj, C27519a.class, "convert", "convert(Lge/bog/mobilebank/galtandtaggart/data/onboarding/userinfo/model/OnboardingListOfValuesApiModel;)Lge/bog/mobilebank/galtandtaggart/domain/onboarding/userinfo/model/UserInfoModel;", 0);
        }

        /* renamed from: b */
        public final C20232g invoke(OnboardingListOfValuesApiModel onboardingListOfValuesApiModel) {
            C41536l.m120489i(onboardingListOfValuesApiModel, "p0");
            return ((C27519a) this.receiver).mo66838e(onboardingListOfValuesApiModel);
        }
    }

    /* renamed from: qe0.g$f */
    static final class C27788f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C27782g f70885d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27788f(C27782g gVar) {
            super(1);
            this.f70885d = gVar;
        }

        /* renamed from: a */
        public final void mo67323a(C20232g gVar) {
            this.f70885d.f70878g.set(gVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo67323a((C20232g) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: qe0.g$g */
    static final class C27789g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C27782g f70886d;

        /* renamed from: e */
        final /* synthetic */ String f70887e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27789g(C27782g gVar, String str) {
            super(1);
            this.f70886d = gVar;
            this.f70887e = str;
        }

        /* renamed from: a */
        public final void mo67324a(HashMap hashMap) {
            this.f70886d.f70879h.set(hashMap.get("sessionToken"));
            C31973a aVar = C31973a.f78755a;
            Object obj = this.f70886d.f70879h.get();
            C41536l.m120488h(obj, "identomatToken.get()");
            aVar.mo72469d((String) obj);
            aVar.mo72467b(this.f70887e);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo67324a((HashMap) obj);
            return C41238w.f97225a;
        }
    }

    public C27782g(C25429w0 w0Var, C27519a aVar, C20292b bVar) {
        C41536l.m120489i(w0Var, "service");
        C41536l.m120489i(aVar, "userInfoMapper");
        C41536l.m120489i(bVar, "getAppSettingByNameUseCase");
        this.f70875d = w0Var;
        this.f70876e = aVar;
        this.f70877f = bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: j4 */
    public static final C20230e m85946j4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C20230e) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: k4 */
    public static final void m85947k4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: l4 */
    public static final void m85948l4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: m4 */
    public static final C20232g m85949m4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C20232g) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: n4 */
    public static final void m85950n4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: p4 */
    public static final void m85951p4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: q4 */
    private final int m85952q4(boolean z) {
        return z ? 1 : 0;
    }

    /* renamed from: D0 */
    public C20230e mo49012D0() {
        Object obj = this.f70881j.get();
        C41536l.m120488h(obj, "reviewData.get()");
        return (C20230e) obj;
    }

    /* renamed from: E */
    public C40734b mo49013E() {
        return this.f70875d.mo63984E();
    }

    /* renamed from: F1 */
    public C40734b mo49014F1() {
        return this.f70875d.mo63981B1((String) this.f70879h.get());
    }

    /* renamed from: T2 */
    public void mo49015T2(C20232g gVar) {
        C41536l.m120489i(gVar, "userInfo");
        this.f70878g.set(gVar);
    }

    /* renamed from: b2 */
    public C40734b mo49016b2() {
        String str;
        String str2;
        String str3;
        String str4;
        Object obj = this.f70880i.get();
        C41536l.m120488h(obj, "agreedDisclosureTypes.get()");
        String g0 = C41358y.m120017g0((Iterable) obj, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C43075l) null, 62, (Object) null);
        C20232g gVar = (C20232g) this.f70878g.get();
        C25429w0 w0Var = this.f70875d;
        C20231f i = gVar.mo48702a().mo48662i();
        if (i != null) {
            str = i.mo48696a();
        } else {
            str = null;
        }
        String h = gVar.mo48702a().mo48660h();
        C20231f m = gVar.mo48702a().mo48666m();
        if (m != null) {
            str2 = m.mo48696a();
        } else {
            str2 = null;
        }
        C20231f k = gVar.mo48702a().mo48664k();
        if (k != null) {
            str3 = k.mo48696a();
        } else {
            str3 = null;
        }
        Integer valueOf = Integer.valueOf(m85952q4(gVar.mo48702a().mo48653a()));
        String f = gVar.mo48702a().mo48658f();
        String g = gVar.mo48702a().mo48659g();
        C20231f a = gVar.mo48703b().mo48669a();
        if (a != null) {
            str4 = a.mo48696a();
        } else {
            str4 = null;
        }
        C40734b y = w0Var.mo63985E1(g0, str, h, str2, str3, valueOf, f, g, str4, gVar.mo48704c().mo48674a(), (String) this.f70879h.get()).mo95062A(new C27779d(new C27784b(this))).mo95084m(new C27780e(new C27785c(this))).mo95082k(new C27781f(new C27786d(this))).mo95092y();
        C41536l.m120488h(y, "override fun preloadRevi…  }.ignoreElement()\n    }");
        return y;
    }

    /* renamed from: c */
    public C40762x mo49017c() {
        C20232g gVar = (C20232g) this.f70878g.get();
        if (gVar == null) {
            return mo49019n0();
        }
        C40762x z = C40762x.m118162z(gVar);
        C41536l.m120488h(z, "just(userInfo)");
        return z;
    }

    public void clean() {
        this.f70878g.set((Object) null);
        this.f70879h.set((Object) null);
        this.f70880i.set((Object) null);
    }

    /* renamed from: j2 */
    public void mo49018j2(List list) {
        C41536l.m120489i(list, "disclosureTypes");
        this.f70880i.set(list);
    }

    /* renamed from: n0 */
    public C40762x mo49019n0() {
        C40762x m = this.f70875d.mo63999c().mo95062A(new C27776a(new C27787e(this.f70876e))).mo95084m(new C27777b(new C27788f(this)));
        C41536l.m120488h(m, "override fun preloadUser…t(it)\n            }\n    }");
        return m;
    }

    /* renamed from: p2 */
    public C40734b mo49020p2(C20228c cVar) {
        String str;
        boolean z;
        boolean z2;
        C41536l.m120489i(cVar, "type");
        C20557a b = this.f70877f.mo48775b("GT_IDENTOMAT_URL");
        if (b == null || (str = b.mo49087d()) == null) {
            str = "https://widget.identomat.com/api/";
        }
        C25429w0 w0Var = this.f70875d;
        boolean z3 = true;
        if (cVar == C20228c.IdCard) {
            z = true;
        } else {
            z = false;
        }
        int q4 = m85952q4(z);
        if (cVar == C20228c.Passport) {
            z2 = true;
        } else {
            z2 = false;
        }
        int q42 = m85952q4(z2);
        if (cVar != C20228c.ResidenceLicense) {
            z3 = false;
        }
        C40734b y = w0Var.mo63992H1(q4, q42, m85952q4(z3)).mo95084m(new C27778c(new C27789g(this, str))).mo95092y();
        C41536l.m120488h(y, "override fun startIdento…  }.ignoreElement()\n    }");
        return y;
    }
}
