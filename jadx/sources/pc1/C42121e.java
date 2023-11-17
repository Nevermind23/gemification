package pc1;

import android.os.Bundle;
import androidx.core.p016os.C0908e;
import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import ba1.C10146d0;
import ca1.C10379a;
import ce1.C40397a;
import ce1.C40398b;
import com.salesforce.marketingcloud.UrlHandler;
import dd1.C40481a2;
import dd1.C40520g1;
import dd1.C40537j;
import dd1.C40637z1;
import ed1.C40734b;
import ed1.C40762x;
import ee1.C40767b;
import gb1.C32383o;
import gd1.C40992a;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41224m;
import he1.C41233s;
import he1.C41238w;
import ib1.C36425d;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.sso_client.models.C35947l;
import p341ge.bog.sso_client.models.DeviceIdentifier;
import p341ge.bog.sso_client.models.PasswordRules;
import p341ge.bog.sso_client.models.UserNameRules;
import p341ge.bog.sso_client.network.ApiException;
import qa1.C27700a1;
import sso.type.ProcessFlow;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: pc1.e */
public final class C42121e implements C42117a {

    /* renamed from: s */
    public static final C42122a f99060s = new C42122a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final C40481a2 f99061d;

    /* renamed from: e */
    private final C40520g1 f99062e;

    /* renamed from: f */
    private final C40537j f99063f;

    /* renamed from: g */
    private final C40637z1 f99064g;

    /* renamed from: h */
    private final C27700a1 f99065h;

    /* renamed from: i */
    private final C10379a f99066i;

    /* renamed from: j */
    private String f99067j;

    /* renamed from: k */
    private final C1644x f99068k = new C1644x();

    /* renamed from: l */
    private final C1644x f99069l;

    /* renamed from: m */
    private final LiveData f99070m;

    /* renamed from: n */
    private final C1644x f99071n;

    /* renamed from: o */
    private C41204a f99072o;

    /* renamed from: p */
    private final C40767b f99073p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public C1644x f99074q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public C32383o f99075r;

    /* renamed from: pc1.e$a */
    public static final class C42122a {
        private C42122a() {
        }

        public /* synthetic */ C42122a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: pc1.e$b */
    static final class C42123b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C42121e f99076d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42123b(C42121e eVar) {
            super(1);
            this.f99076d = eVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            this.f99076d.f99075r.mo4823o(new C35947l.C35949b(th));
            this.f99076d.f99074q.mo4823o(new C35947l.C35949b(th));
            this.f99076d.m122342j(C36425d.FAIL, th instanceof ApiException ? (ApiException) th : null);
        }
    }

    /* renamed from: pc1.e$c */
    static final class C42124c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C42121e f99077d;

        /* renamed from: e */
        final /* synthetic */ String f99078e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42124c(C42121e eVar, String str) {
            super(0);
            this.f99077d = eVar;
            this.f99078e = str;
        }

        public final void invoke() {
            this.f99077d.f99075r.mo4823o(new C35947l.C35951d(this.f99078e));
            C42121e.m122343k(this.f99077d, (C36425d) null, (ApiException) null, 3, (Object) null);
        }
    }

    /* renamed from: pc1.e$d */
    static final class C42125d extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C42125d f99079d = new C42125d();

        C42125d() {
            super(1);
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: pc1.e$e */
    static final class C42126e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C42121e f99080d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42126e(C42121e eVar) {
            super(1);
            this.f99080d = eVar;
        }

        /* renamed from: a */
        public final void mo97627a(String str) {
            C42121e eVar = this.f99080d;
            C41536l.m120488h(str, "userName");
            eVar.setUserName(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo97627a((String) obj);
            return C41238w.f97225a;
        }
    }

    public C42121e(C40481a2 a2Var, C40520g1 g1Var, C40537j jVar, C40637z1 z1Var, C27700a1 a1Var, C10379a aVar) {
        C41536l.m120489i(a2Var, "getUserNameRules");
        C41536l.m120489i(g1Var, "getPasswordRules");
        C41536l.m120489i(jVar, "changeUsernameAndPasswordUseCase");
        C41536l.m120489i(z1Var, "getUserDataUseCase");
        C41536l.m120489i(a1Var, "storage");
        this.f99061d = a2Var;
        this.f99062e = g1Var;
        this.f99063f = jVar;
        this.f99064g = z1Var;
        this.f99065h = a1Var;
        this.f99066i = aVar;
        C1644x xVar = new C1644x();
        this.f99069l = xVar;
        this.f99070m = xVar;
        this.f99071n = new C1644x();
        this.f99072o = new C41204a();
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create()");
        this.f99073p = h1;
        this.f99074q = new C1644x();
        this.f99075r = new C32383o();
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static final void m122339g(C42121e eVar, C41205b bVar) {
        C41536l.m120489i(eVar, "this$0");
        eVar.f99074q.mo4823o(C35947l.C35950c.f86976a);
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static final C41238w m122340h(C42121e eVar, UserNameRules userNameRules, PasswordRules passwordRules) {
        C41536l.m120489i(eVar, "this$0");
        C41536l.m120489i(userNameRules, "userNameRules");
        C41536l.m120489i(passwordRules, "passwordRules");
        eVar.f99068k.mo4823o(new C35947l.C35951d(passwordRules));
        eVar.f99071n.mo4823o(new C35947l.C35951d(userNameRules));
        return C41238w.f97225a;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static final void m122341i(C42121e eVar, String str, C41238w wVar) {
        C41536l.m120489i(eVar, "this$0");
        C41536l.m120489i(str, "$reference");
        eVar.f99067j = str;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public final void m122342j(C36425d dVar, ApiException apiException) {
        Long l;
        String l2;
        String errorMessage;
        String errorKey;
        Integer errorCode;
        String num;
        C10379a aVar = this.f99066i;
        if (aVar != null) {
            C41224m[] mVarArr = new C41224m[6];
            mVarArr[0] = C41233s.m119492a(UrlHandler.ACTION, "username_password_set");
            mVarArr[1] = C41233s.m119492a("result", dVar.mo89240b());
            mVarArr[2] = C41233s.m119492a("pin", C10146d0.C10176g.m37224e());
            DeviceIdentifier c = this.f99065h.mo67242c();
            String str = null;
            if (c != null) {
                l = c.getDeviceId();
            } else {
                l = null;
            }
            mVarArr[3] = C41233s.m119492a("dev_id", String.valueOf(l));
            mVarArr[4] = C41233s.m119492a("process_reference", C10146d0.C10176g.m37221b());
            ProcessFlow a = C10146d0.C10176g.m37222c().mo88492a();
            if (a != null) {
                str = a.getRawValue();
            }
            mVarArr[5] = C41233s.m119492a("process_reference", str);
            Bundle b = C0908e.m3336b(mVarArr);
            if (!(apiException == null || (errorCode = apiException.getErrorCode()) == null || (num = errorCode.toString()) == null)) {
                b.putString("err_code", num);
            }
            if (!(apiException == null || (errorKey = apiException.getErrorKey()) == null)) {
                b.putString("err_key", errorKey);
            }
            if (!(apiException == null || (errorMessage = apiException.getErrorMessage()) == null)) {
                b.putString("err_msg", errorMessage);
            }
            Long b2 = C10146d0.C10175f.m37217b();
            if (!(b2 == null || (l2 = b2.toString()) == null)) {
                b.putString("userId", l2);
            }
            C41238w wVar = C41238w.f97225a;
            C10379a.C10380a.m37703a(aVar, "digital_onboarding", "username_password_set", (String) null, b, C10379a.C10381b.FIREBASE, 4, (Object) null);
        }
    }

    /* renamed from: k */
    static /* synthetic */ void m122343k(C42121e eVar, C36425d dVar, ApiException apiException, int i, Object obj) {
        if ((i & 1) != 0) {
            dVar = C36425d.SUCCESS;
        }
        if ((i & 2) != 0) {
            apiException = null;
        }
        eVar.m122342j(dVar, apiException);
    }

    /* renamed from: S5 */
    public LiveData mo89145S5() {
        return this.f99070m;
    }

    /* renamed from: Wk */
    public LiveData mo89149Wk() {
        return this.f99068k;
    }

    /* renamed from: Y4 */
    public void mo89152Y4() {
        this.f99074q = new C1644x();
        this.f99075r = new C32383o();
        mo97624l(new C41204a());
    }

    /* renamed from: Zc */
    public LiveData mo89154Zc() {
        return this.f99071n;
    }

    /* renamed from: Zu */
    public void mo89155Zu() {
        if (C41358y.m119999O(C41341q.m119910m(ProcessFlow.IDENTIFY_BY_CARD, ProcessFlow.IDENTIFY_BY_DOCUMENT, ProcessFlow.IDENTIFY_BY_ONLY_CARD, ProcessFlow.ADD_FINANCIAL_CONTACT), C10146d0.C10176g.m37222c().mo88492a())) {
            C40637z1 z1Var = this.f99064g;
            String b = C10146d0.C10176g.m37222c().mo88493b();
            if (b == null) {
                b = "";
            }
            C40762x B = z1Var.mo94636a(b).mo95063B(C40992a.m118827a());
            C41536l.m120488h(B, "getUserDataUseCase.invok…dSchedulers.mainThread())");
            C40397a.m116967a(C40398b.m116972e(B, C42125d.f99079d, new C42126e(this)), mo89184qo());
        }
    }

    /* renamed from: ao */
    public void mo89156ao(String str, String str2) {
        C41536l.m120489i(str, "username");
        C41536l.m120489i(str2, "password");
        C40537j jVar = this.f99063f;
        String str3 = this.f99067j;
        C41536l.m120486f(str3);
        C40734b r = jVar.mo94573a(str, str2, str3).mo94904r(new C42120d(this));
        C41536l.m120488h(r, "changeUsernameAndPasswor…lt.Loading)\n            }");
        C40397a.m116967a(C40398b.m116971d(r, new C42123b(this), new C42124c(this, str)), mo89184qo());
    }

    /* renamed from: ij */
    public C40762x mo89168ij(String str) {
        C41536l.m120489i(str, "reference");
        C40762x K = C40762x.m118154T(this.f99061d.mo94534a(str), this.f99062e.mo94559a(str), new C42118b(this)).mo95079h(new C42119c(this, str)).mo95072K(C40992a.m118827a());
        C41536l.m120488h(K, "zip(\n            getUser…dSchedulers.mainThread())");
        return K;
    }

    /* renamed from: l */
    public void mo97624l(C41204a aVar) {
        C41536l.m120489i(aVar, "<set-?>");
        this.f99072o = aVar;
    }

    /* renamed from: ni */
    public LiveData mo89179ni() {
        return this.f99074q;
    }

    /* renamed from: qo */
    public C41204a mo89184qo() {
        return this.f99072o;
    }

    public void setUserName(String str) {
        C41536l.m120489i(str, "userName");
        this.f99069l.mo4823o(str);
    }

    /* renamed from: up */
    public void mo89195up(Throwable th) {
        C41536l.m120489i(th, "err");
        this.f99074q.mo4823o(new C35947l.C35949b(th));
    }

    /* renamed from: wb */
    public LiveData mo89200wb() {
        return this.f99075r;
    }

    /* renamed from: yj */
    public C40767b mo89204yj() {
        return this.f99073p;
    }
}
