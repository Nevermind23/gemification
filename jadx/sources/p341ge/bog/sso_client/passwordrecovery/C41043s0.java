package p341ge.bog.sso_client.passwordrecovery;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import ba1.C10146d0;
import ba1.C10195g0;
import ba1.C10199i;
import ba1.C10205l;
import cd1.C40393c;
import ce1.C40398b;
import com.google.gson.Gson;
import dd1.C40479a0;
import dd1.C40500d1;
import dd1.C40508e1;
import dd1.C40514f1;
import dd1.C40543k;
import dd1.C40545k1;
import dd1.C40560m3;
import dd1.C40578p1;
import dd1.C40587q2;
import dd1.C40601s4;
import dd1.C40602t;
import dd1.C40616v1;
import dd1.C40626x0;
import dd1.C40631y0;
import dd1.C40637z1;
import de1.C40640a;
import ed1.C40734b;
import ed1.C40762x;
import ee1.C40767b;
import fh1.C40951a;
import gb1.C32381m;
import gb1.C32383o;
import gc1.C40956a;
import gc1.C40991q;
import gd1.C40992a;
import gh1.C41125a;
import ha1.C15458b;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41224m;
import he1.C41233s;
import he1.C41238w;
import ib1.C36425d;
import java.util.ArrayList;
import java.util.List;
import jb1.C36774a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nh1.C41806a;
import oc1.C41809a;
import p341ge.bog.sso_client.models.C35935c;
import p341ge.bog.sso_client.models.C35942i;
import p341ge.bog.sso_client.models.C35947l;
import p341ge.bog.sso_client.models.C35952m;
import p341ge.bog.sso_client.models.C35960p;
import p341ge.bog.sso_client.models.C35961q;
import p341ge.bog.sso_client.models.C35964t;
import p341ge.bog.sso_client.models.UserContact;
import p341ge.bog.sso_client.network.ApiException;
import p341ge.bog.sso_client.tmx_profiling.TMXFlags;
import pc1.C42117a;
import qa1.C27700a1;
import sso.type.UserContactType;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.sso_client.passwordrecovery.s0 */
public final class C41043s0 extends C15458b implements C42117a, C41809a {

    /* renamed from: W */
    public static final C41045b f96885W = new C41045b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: X */
    public static String f96886X = "";
    /* access modifiers changed from: private */

    /* renamed from: Y */
    public static String f96887Y = "";
    /* access modifiers changed from: private */

    /* renamed from: Z */
    public static String f96888Z = "";
    /* access modifiers changed from: private */

    /* renamed from: a0 */
    public static boolean f96889a0;

    /* renamed from: A */
    private final C10146d0.C10172e f96890A = ((C10146d0.C10172e) new C41064t().mo95468b());

    /* renamed from: B */
    private UserContact f96891B;

    /* renamed from: C */
    private boolean f96892C;

    /* renamed from: D */
    private UserContactType f96893D = UserContactType.UNKNOWN__;

    /* renamed from: E */
    private final C41071w f96894E = new C41071w(new C41010c());

    /* renamed from: F */
    private final C32383o f96895F = new C32383o();

    /* renamed from: G */
    private final C32383o f96896G = new C32383o();

    /* renamed from: H */
    private final C1644x f96897H = new C1644x(C41341q.m119907j());

    /* renamed from: I */
    private final C1644x f96898I = new C1644x(0);
    /* access modifiers changed from: private */

    /* renamed from: J */
    public final C1644x f96899J = new C1644x();

    /* renamed from: K */
    private final C32383o f96900K = new C32383o();
    /* access modifiers changed from: private */

    /* renamed from: L */
    public final C32383o f96901L = new C32383o();
    /* access modifiers changed from: private */

    /* renamed from: M */
    public final C1644x f96902M = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: N */
    public final C1644x f96903N = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: O */
    public final C1644x f96904O = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: P */
    public final C1644x f96905P = new C1644x(Boolean.FALSE);

    /* renamed from: Q */
    private final C1644x f96906Q = new C1644x();

    /* renamed from: R */
    private final C1644x f96907R = new C1644x();

    /* renamed from: S */
    private final C1644x f96908S = new C1644x();

    /* renamed from: T */
    private C10205l.C10206a f96909T;
    /* access modifiers changed from: private */

    /* renamed from: U */
    public boolean f96910U;

    /* renamed from: V */
    private String f96911V = "";

    /* renamed from: h */
    private final C40543k f96912h;

    /* renamed from: i */
    private final C40602t f96913i;

    /* renamed from: j */
    private final C40616v1 f96914j;

    /* renamed from: k */
    private final C40560m3 f96915k;

    /* renamed from: l */
    private final C40601s4 f96916l;

    /* renamed from: m */
    private final C42117a f96917m;

    /* renamed from: n */
    private final C40479a0 f96918n;

    /* renamed from: o */
    private final C40626x0 f96919o;

    /* renamed from: p */
    private final C40637z1 f96920p;

    /* renamed from: q */
    private final C40545k1 f96921q;

    /* renamed from: r */
    private final C40631y0 f96922r;

    /* renamed from: s */
    private final C40500d1 f96923s;

    /* renamed from: t */
    private final C40508e1 f96924t;

    /* renamed from: u */
    private final C40514f1 f96925u;

    /* renamed from: v */
    private final C40587q2 f96926v;

    /* renamed from: w */
    private final C40393c f96927w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public final C27700a1 f96928x;

    /* renamed from: y */
    private final C10199i f96929y;

    /* renamed from: z */
    private final /* synthetic */ C41809a f96930z;

    /* renamed from: ge.bog.sso_client.passwordrecovery.s0$a */
    static final class C41044a extends C41537m implements C43064a {

        /* renamed from: d */
        public static final C41044a f96931d = new C41044a();

        C41044a() {
            super(0);
        }

        public final String invoke() {
            return C10146d0.C10175f.m37216a();
        }
    }

    /* renamed from: ge.bog.sso_client.passwordrecovery.s0$b */
    public static final class C41045b {
        private C41045b() {
        }

        public /* synthetic */ C41045b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.sso_client.passwordrecovery.s0$c */
    public /* synthetic */ class C41046c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f96932a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f96933b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f96934c;

        static {
            int[] iArr = new int[C35942i.values().length];
            iArr[C35942i.OLD_FLOW.ordinal()] = 1;
            iArr[C35942i.TRUSTED.ordinal()] = 2;
            f96932a = iArr;
            int[] iArr2 = new int[C35952m.values().length];
            iArr2[C35952m.KA.ordinal()] = 1;
            iArr2[C35952m.EN.ordinal()] = 2;
            iArr2[C35952m.TR.ordinal()] = 3;
            f96933b = iArr2;
            int[] iArr3 = new int[C36774a.values().length];
            iArr3[C36774a.ADD_PHONE.ordinal()] = 1;
            iArr3[C36774a.NO_PHONE.ordinal()] = 2;
            f96934c = iArr3;
        }
    }

    /* renamed from: ge.bog.sso_client.passwordrecovery.s0$d */
    static final class C41047d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41043s0 f96935d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41047d(C41043s0 s0Var) {
            super(0);
            this.f96935d = s0Var;
        }

        public final void invoke() {
            this.f96935d.f96904O.mo4823o(C41238w.f97225a);
        }
    }

    /* renamed from: ge.bog.sso_client.passwordrecovery.s0$e */
    static final class C41048e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C41043s0 f96936d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41048e(C41043s0 s0Var) {
            super(1);
            this.f96936d = s0Var;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            C41043s0.f96889a0 = false;
            this.f96936d.m118937Ux(th);
            this.f96936d.f96905P.mo4823o(Boolean.FALSE);
        }
    }

    /* renamed from: ge.bog.sso_client.passwordrecovery.s0$f */
    static final class C41049f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ String f96937d;

        /* renamed from: e */
        final /* synthetic */ String f96938e;

        /* renamed from: f */
        final /* synthetic */ String f96939f;

        /* renamed from: g */
        final /* synthetic */ C41043s0 f96940g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41049f(String str, String str2, String str3, C41043s0 s0Var) {
            super(0);
            this.f96937d = str;
            this.f96938e = str2;
            this.f96939f = str3;
            this.f96940g = s0Var;
        }

        public final void invoke() {
            C41043s0.f96889a0 = true;
            C41043s0.f96887Y = this.f96937d;
            C41043s0.f96886X = this.f96938e;
            C41043s0.f96888Z = this.f96939f;
            this.f96940g.m118949iy();
        }
    }

    /* renamed from: ge.bog.sso_client.passwordrecovery.s0$g */
    static final class C41050g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C41043s0 f96941d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41050g(C41043s0 s0Var) {
            super(1);
            this.f96941d = s0Var;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            this.f96941d.f96910U = false;
            this.f96941d.f96899J.mo4823o(C41238w.f97225a);
            this.f96941d.f96903N.mo4823o(Boolean.FALSE);
        }
    }

    /* renamed from: ge.bog.sso_client.passwordrecovery.s0$h */
    static final class C41051h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41043s0 f96942d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41051h(C41043s0 s0Var) {
            super(0);
            this.f96942d = s0Var;
        }

        public final void invoke() {
            this.f96942d.f96910U = true;
            this.f96942d.f96903N.mo4823o(Boolean.FALSE);
            this.f96942d.m118933Rx();
        }
    }

    /* renamed from: ge.bog.sso_client.passwordrecovery.s0$i */
    static final class C41052i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C41043s0 f96943d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41052i(C41043s0 s0Var) {
            super(1);
            this.f96943d = s0Var;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            this.f96943d.f96905P.mo4823o(Boolean.FALSE);
            this.f96943d.m118937Ux(th);
        }
    }

    /* renamed from: ge.bog.sso_client.passwordrecovery.s0$j */
    static final class C41053j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C41043s0 f96944d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41053j(C41043s0 s0Var) {
            super(1);
            this.f96944d = s0Var;
        }

        /* renamed from: a */
        public final void mo95463a(C41238w wVar) {
            this.f96944d.mo95430Qx();
            this.f96944d.f96905P.mo4823o(Boolean.FALSE);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo95463a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.sso_client.passwordrecovery.s0$k */
    static final class C41054k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41043s0 f96945d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41054k(C41043s0 s0Var) {
            super(0);
            this.f96945d = s0Var;
        }

        public final void invoke() {
            this.f96945d.f96905P.mo4823o(Boolean.FALSE);
        }
    }

    /* renamed from: ge.bog.sso_client.passwordrecovery.s0$l */
    static final class C41055l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41043s0 f96946d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41055l(C41043s0 s0Var) {
            super(0);
            this.f96946d = s0Var;
        }

        public final void invoke() {
            this.f96946d.f96905P.mo4823o(Boolean.FALSE);
        }
    }

    /* renamed from: ge.bog.sso_client.passwordrecovery.s0$m */
    static final class C41056m extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41043s0 f96947d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41056m(C41043s0 s0Var) {
            super(0);
            this.f96947d = s0Var;
        }

        public final void invoke() {
            this.f96947d.f96905P.mo4823o(Boolean.FALSE);
        }
    }

    /* renamed from: ge.bog.sso_client.passwordrecovery.s0$n */
    static final class C41057n extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C41043s0 f96948d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41057n(C41043s0 s0Var) {
            super(1);
            this.f96948d = s0Var;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            this.f96948d.m118937Ux(th);
            this.f96948d.f96902M.mo4823o(Boolean.FALSE);
        }
    }

    /* renamed from: ge.bog.sso_client.passwordrecovery.s0$o */
    static final class C41058o extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C43064a f96949d;

        /* renamed from: e */
        final /* synthetic */ C41043s0 f96950e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41058o(C43064a aVar, C41043s0 s0Var) {
            super(1);
            this.f96949d = aVar;
            this.f96950e = s0Var;
        }

        /* renamed from: a */
        public final void mo95465a(C41238w wVar) {
            C43064a aVar = this.f96949d;
            if (aVar != null) {
                aVar.invoke();
            }
            this.f96950e.f96902M.mo4823o(Boolean.FALSE);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo95465a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.sso_client.passwordrecovery.s0$p */
    static final class C41059p extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C41043s0 f96951d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41059p(C41043s0 s0Var) {
            super(1);
            this.f96951d = s0Var;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            this.f96951d.mo89195up(th);
            this.f96951d.m118937Ux(th);
        }
    }

    /* renamed from: ge.bog.sso_client.passwordrecovery.s0$q */
    static final class C41060q extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41043s0 f96952d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41060q(C41043s0 s0Var) {
            super(0);
            this.f96952d = s0Var;
        }

        public final void invoke() {
            this.f96952d.f96928x.mo67252l(false);
            this.f96952d.f96901L.mo4823o(C41238w.f97225a);
        }
    }

    /* renamed from: ge.bog.sso_client.passwordrecovery.s0$r */
    static final class C41061r extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C41043s0 f96953d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41061r(C41043s0 s0Var) {
            super(1);
            this.f96953d = s0Var;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "error");
            this.f96953d.m118937Ux(th);
            this.f96953d.f96905P.mo4823o(Boolean.FALSE);
        }
    }

    /* renamed from: ge.bog.sso_client.passwordrecovery.s0$s */
    static final class C41062s extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41043s0 f96954d;

        /* renamed from: ge.bog.sso_client.passwordrecovery.s0$s$a */
        static final class C41063a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ C41043s0 f96955d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C41063a(C41043s0 s0Var) {
                super(0);
                this.f96955d = s0Var;
            }

            public final void invoke() {
                this.f96955d.f96905P.mo4823o(Boolean.FALSE);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41062s(C41043s0 s0Var) {
            super(0);
            this.f96954d = s0Var;
        }

        public final void invoke() {
            C41043s0 s0Var = this.f96954d;
            s0Var.m118921Ix(new C41063a(s0Var));
        }
    }

    /* renamed from: ge.bog.sso_client.passwordrecovery.s0$t */
    public static final class C41064t implements C41125a {

        /* renamed from: a */
        private final Object f96956a = mo26679a().mo95345c().mo97161i().mo97675g(C41520a0.m120436b(C10146d0.C10172e.class), (C41806a) null, (C43064a) null);

        /* renamed from: a */
        public C40951a mo26679a() {
            return C41125a.C41126a.m119226a(this);
        }

        /* renamed from: b */
        public final Object mo95468b() {
            return this.f96956a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41043s0(C40543k kVar, C40602t tVar, C40616v1 v1Var, C40560m3 m3Var, C40601s4 s4Var, C42117a aVar, C40479a0 a0Var, C40626x0 x0Var, C40637z1 z1Var, C40545k1 k1Var, C40631y0 y0Var, C40500d1 d1Var, C40508e1 e1Var, C40514f1 f1Var, C40587q2 q2Var, C40393c cVar, C27700a1 a1Var, C10199i iVar, C41809a aVar2) {
        super((C40578p1) null, 1, (DefaultConstructorMarker) null);
        C40543k kVar2 = kVar;
        C40602t tVar2 = tVar;
        C40616v1 v1Var2 = v1Var;
        C40560m3 m3Var2 = m3Var;
        C40601s4 s4Var2 = s4Var;
        C42117a aVar3 = aVar;
        C40479a0 a0Var2 = a0Var;
        C40626x0 x0Var2 = x0Var;
        C40637z1 z1Var2 = z1Var;
        C40545k1 k1Var2 = k1Var;
        C40631y0 y0Var2 = y0Var;
        C40500d1 d1Var2 = d1Var;
        C40508e1 e1Var2 = e1Var;
        C40393c cVar2 = cVar;
        C41536l.m120489i(kVar2, "checkCardData");
        C41536l.m120489i(tVar2, "confirmPassRecoveryTerms");
        C41536l.m120489i(v1Var2, "getUserContacts");
        C41536l.m120489i(m3Var2, "sendContactsOTP");
        C41536l.m120489i(s4Var2, "verifyContactsOTP");
        C41536l.m120489i(aVar3, "setUserNamePasswordDelegate");
        C41536l.m120489i(a0Var2, "finishPassRecovery");
        C41536l.m120489i(x0Var2, "getDeviceTrustedSkipStorage");
        C41536l.m120489i(z1Var2, "getUserDataUseCase");
        C41536l.m120489i(k1Var2, "getSettingUseCase");
        C41536l.m120489i(y0Var2, "getFaceTecData");
        C41536l.m120489i(d1Var2, "getPasswordRecoveryFlow");
        C41536l.m120489i(e1Var2, "getPasswordRecoverySelectContactsConfig");
        C41536l.m120489i(f1Var, "getPasswordRecoverySelectTransactionsConfig");
        C41536l.m120489i(q2Var, "checkValidParameters");
        C41536l.m120489i(cVar, "startTMXProfilingUseCase");
        C41536l.m120489i(a1Var, "storage");
        C41536l.m120489i(iVar, "localeManager");
        C41536l.m120489i(aVar2, "logger");
        this.f96912h = kVar2;
        this.f96913i = tVar2;
        this.f96914j = v1Var2;
        this.f96915k = m3Var2;
        this.f96916l = s4Var2;
        this.f96917m = aVar3;
        this.f96918n = a0Var2;
        this.f96919o = x0Var2;
        this.f96920p = z1Var2;
        this.f96921q = k1Var2;
        this.f96922r = y0Var2;
        this.f96923s = d1Var2;
        this.f96924t = e1Var2;
        this.f96925u = f1Var;
        this.f96926v = q2Var;
        this.f96927w = cVar;
        this.f96928x = a1Var;
        this.f96929y = iVar;
        this.f96930z = aVar2;
        f96886X = "";
        f96887Y = "";
        f96888Z = "";
        f96889a0 = false;
        C41205b F0 = mo89204yj().mo94981F0(new C41074x(this));
        C41536l.m120488h(F0, "setUserPassErrorSubject\n…ostError(Throwable(it)) }");
        mo42540ew(F0);
        mo42540ew(mo89184qo());
        mo89166hc(C41044a.f96931d);
        m118952jy();
    }

    /* access modifiers changed from: private */
    /* renamed from: Ax */
    public static final void m118909Ax(C41043s0 s0Var, Throwable th) {
        C41536l.m120489i(s0Var, "this$0");
        C41536l.m120488h(th, "error");
        s0Var.m118937Ux(th);
    }

    /* access modifiers changed from: private */
    /* renamed from: Dw */
    public static final void m118912Dw(C41043s0 s0Var, String str) {
        C41536l.m120489i(s0Var, "this$0");
        s0Var.m118937Ux(new Throwable(str));
    }

    /* renamed from: Ex */
    private final void m118914Ex(C43064a aVar) {
        C41205b I = this.f96919o.mo94629a(this.f96911V).mo95072K(C40640a.m117458b()).mo95070I(new C41007a0(this, aVar), new C41009b0(this, aVar));
        C41536l.m120488h(I, "getDeviceTrustedSkipStor…nComplete)\n            })");
        mo42540ew(I);
    }

    /* access modifiers changed from: private */
    /* renamed from: Fx */
    public static final void m118916Fx(C41043s0 s0Var, C43064a aVar, Throwable th) {
        C41536l.m120489i(s0Var, "this$0");
        C41536l.m120489i(aVar, "$onComplete");
        s0Var.m118951jx(aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: Gx */
    public static final void m118918Gx(C41043s0 s0Var, C43064a aVar, Boolean bool) {
        C41536l.m120489i(s0Var, "this$0");
        C41536l.m120489i(aVar, "$onComplete");
        if (!bool.booleanValue()) {
            s0Var.m118951jx(aVar);
            return;
        }
        s0Var.f96894E.mo95474g(C35942i.TRUSTED);
        aVar.invoke();
    }

    /* access modifiers changed from: private */
    /* renamed from: Ix */
    public final void m118921Ix(C43064a aVar) {
        C41205b I = this.f96920p.mo94636a(C10146d0.C10175f.m37216a()).mo95072K(C40640a.m117458b()).mo95070I(new C41037p0(this, aVar), new C41039q0(this, aVar));
        C41536l.m120488h(I, "getUserDataUseCase(SSO.R…Complete()\n            })");
        mo42540ew(I);
    }

    /* access modifiers changed from: private */
    /* renamed from: Jx */
    public static final void m118923Jx(C41043s0 s0Var, C43064a aVar, String str) {
        C41536l.m120489i(s0Var, "this$0");
        C41536l.m120489i(aVar, "$onComplete");
        C41536l.m120488h(str, "userName");
        s0Var.f96911V = str;
        s0Var.setUserName(str);
        s0Var.m118914Ex(aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: Kx */
    public static final void m118925Kx(C41043s0 s0Var, C43064a aVar, Throwable th) {
        C41536l.m120489i(s0Var, "this$0");
        C41536l.m120489i(aVar, "$onComplete");
        C41536l.m120488h(th, "error");
        s0Var.m118937Ux(th);
        aVar.invoke();
    }

    /* access modifiers changed from: private */
    /* renamed from: Rx */
    public final void m118933Rx() {
        this.f96900K.mo4823o(C41238w.f97225a);
        int i = C41046c.f96932a[this.f96894E.mo95470b().ordinal()];
        if (i == 1 || i == 2) {
            m118966rx();
        } else {
            mo95430Qx();
        }
    }

    /* renamed from: Tx */
    private final void m118936Tx() {
        boolean z;
        C1644x xVar = this.f96906Q;
        if (this.f96894E.mo95470b() == C35942i.CONTACTS) {
            z = true;
        } else {
            z = false;
        }
        xVar.mo4823o(Boolean.valueOf(z));
        m118914Ex(new C41056m(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: Ux */
    public final void m118937Ux(Throwable th) {
        this.f96895F.mo4823o(new C35947l.C35949b(th));
    }

    /* renamed from: Vw */
    public static /* synthetic */ void m118938Vw(C41043s0 s0Var, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        s0Var.mo95432Uw(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: Wx */
    public static final void m118939Wx(C41043s0 s0Var, C41205b bVar) {
        C41536l.m120489i(s0Var, "this$0");
        s0Var.f96905P.mo4823o(Boolean.TRUE);
    }

    /* access modifiers changed from: private */
    /* renamed from: Xx */
    public static final void m118940Xx(C41043s0 s0Var, List list) {
        boolean z;
        C41536l.m120489i(s0Var, "this$0");
        C41536l.m120488h(list, "contacts");
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            Boolean b = ((UserContact) next).mo88419b();
            if (b != null) {
                z = b.booleanValue();
            } else {
                z = false;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        s0Var.f96896G.mo4823o(arrayList);
        s0Var.f96905P.mo4823o(Boolean.FALSE);
    }

    /* access modifiers changed from: private */
    /* renamed from: Yw */
    public static final void m118941Yw(C41043s0 s0Var, C41205b bVar) {
        C41536l.m120489i(s0Var, "this$0");
        s0Var.f96903N.mo4823o(Boolean.TRUE);
    }

    /* access modifiers changed from: private */
    /* renamed from: Yx */
    public static final void m118942Yx(C41043s0 s0Var, Throwable th) {
        C41536l.m120489i(s0Var, "this$0");
        s0Var.f96905P.mo4823o(Boolean.FALSE);
        C41536l.m120488h(th, "error");
        s0Var.m118937Ux(th);
    }

    /* renamed from: Zw */
    private final void m118943Zw(C35960p pVar) {
        String str;
        this.f96907R.mo4823o(Integer.valueOf(pVar.mo88545c().intValue()));
        this.f96898I.mo4823o(Integer.valueOf(pVar.mo88544b().intValue()));
        C1644x xVar = this.f96897H;
        List<C35935c> a = pVar.mo88543a();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(a, 10));
        for (C35935c cVar : a) {
            int i = C41046c.f96933b[this.f96929y.mo26767a().ordinal()];
            if (i == 1) {
                str = cVar.mo88468a() + ' ' + cVar.mo88471d();
            } else if (i == 2) {
                str = cVar.mo88469b() + ' ' + cVar.mo88472e();
            } else if (i == 3) {
                str = cVar.mo88468a() + ' ' + cVar.mo88471d();
            } else {
                throw new NoWhenBranchMatchedException();
            }
            arrayList.add(new C40956a(cVar.mo88470c(), str));
        }
        xVar.mo4823o(arrayList);
    }

    /* renamed from: ax */
    private final void m118944ax(C35961q qVar) {
        this.f96907R.mo4823o(Integer.valueOf(qVar.mo88551c().intValue()));
        this.f96898I.mo4823o(Integer.valueOf(qVar.mo88550b().intValue()));
        C1644x xVar = this.f96897H;
        List<C35964t> a = qVar.mo88549a();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(a, 10));
        for (C35964t tVar : a) {
            arrayList.add(new C40991q(tVar.mo88564e(), tVar.mo88566f(), tVar.mo88567g(), tVar.mo88562c(), tVar.mo88560a(), tVar.mo88561b(), tVar.mo88563d()));
        }
        xVar.mo4823o(arrayList);
    }

    /* renamed from: ay */
    public static /* synthetic */ void m118945ay(C41043s0 s0Var, String str, UserContactType userContactType, C43064a aVar, int i, Object obj) {
        if ((i & 4) != 0) {
            aVar = null;
        }
        s0Var.mo95436Zx(str, userContactType, aVar);
    }

    /* renamed from: bx */
    private final boolean m118946bx(String str) {
        try {
            Gson gson = new Gson();
            String a = this.f96921q.mo94579a(str);
            if (a == null) {
                a = "false";
            }
            Object l = gson.mo18170l(a, Boolean.TYPE);
            C41536l.m120488h(l, "{\n            Gson().fro…a\n            )\n        }");
            return ((Boolean) l).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: cy */
    public static final void m118947cy(C41043s0 s0Var, C41205b bVar) {
        C41536l.m120489i(s0Var, "this$0");
        s0Var.f96902M.mo4823o(Boolean.TRUE);
    }

    /* access modifiers changed from: private */
    /* renamed from: iy */
    public final void m118949iy() {
        String str;
        C10195g0 g = this.f96890A.mo26716g();
        if (g == null || (str = g.mo26763a("link.terms.credential.recovery", new Object[0])) == null) {
            str = "https://conditions.bog.ge/en/bank-service-conditions";
        }
        C40734b z = this.f96913i.mo94613a(str).mo94906z(C40992a.m118827a());
        C41536l.m120488h(z, "confirmPassRecoveryTerms…dSchedulers.mainThread())");
        mo42540ew(C40398b.m116971d(z, new C41061r(this), new C41062s(this)));
    }

    /* renamed from: jx */
    private final void m118951jx(C43064a aVar) {
        C41205b I = this.f96923s.mo94547a(C10146d0.C10175f.m37216a()).mo95072K(C40640a.m117458b()).mo95070I(new C41021h0(this, aVar), new C41025j0(this, aVar));
        C41536l.m120488h(I, "getPasswordRecoveryFlow(…Complete()\n            })");
        mo42540ew(I);
    }

    /* renamed from: jy */
    private final void m118952jy() {
        mo42540ew(this.f96927w.mo94454b(TMXFlags.TMX_FLAG_RESET_KEY));
    }

    /* access modifiers changed from: private */
    /* renamed from: kx */
    public static final void m118954kx(C41043s0 s0Var, C43064a aVar, C35942i iVar) {
        C41536l.m120489i(s0Var, "this$0");
        C41536l.m120489i(aVar, "$onComplete");
        C41071w wVar = s0Var.f96894E;
        C41536l.m120488h(iVar, "flow");
        wVar.mo95474g(iVar);
        aVar.invoke();
    }

    /* access modifiers changed from: private */
    /* renamed from: lx */
    public static final void m118956lx(C41043s0 s0Var, C43064a aVar, Throwable th) {
        C41536l.m120489i(s0Var, "this$0");
        C41536l.m120489i(aVar, "$onComplete");
        s0Var.f96894E.mo95474g(C35942i.UNKNOWN);
        C41536l.m120488h(th, "error");
        s0Var.m118937Ux(th);
        aVar.invoke();
    }

    /* access modifiers changed from: private */
    /* renamed from: my */
    public static final void m118958my(C41043s0 s0Var, C41205b bVar) {
        C41536l.m120489i(s0Var, "this$0");
        s0Var.f96905P.mo4823o(Boolean.TRUE);
    }

    /* access modifiers changed from: private */
    /* renamed from: ny */
    public static final void m118960ny(C41043s0 s0Var, Boolean bool) {
        C41536l.m120489i(s0Var, "this$0");
        C41536l.m120488h(bool, "isValid");
        if (bool.booleanValue()) {
            s0Var.m118966rx();
        } else {
            s0Var.m118936Tx();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: oy */
    public static final void m118962oy(C41043s0 s0Var, Throwable th) {
        C41536l.m120489i(s0Var, "this$0");
        s0Var.m118936Tx();
        C41536l.m120488h(th, "error");
        s0Var.m118937Ux(th);
    }

    /* renamed from: rx */
    private final void m118966rx() {
        C40762x B = mo89168ij(C10146d0.C10175f.m37216a()).mo95063B(C40992a.m118827a());
        C41536l.m120488h(B, "getRules(SSO.RecoverPass…dSchedulers.mainThread())");
        mo42540ew(C40398b.m116972e(B, new C41052i(this), new C41053j(this)));
    }

    /* access modifiers changed from: private */
    /* renamed from: tx */
    public static final void m118969tx(C41043s0 s0Var, C41205b bVar) {
        C41536l.m120489i(s0Var, "this$0");
        s0Var.f96897H.mo4823o(C41341q.m119907j());
    }

    /* access modifiers changed from: private */
    /* renamed from: ux */
    public static final void m118971ux(C41043s0 s0Var, C35960p pVar) {
        C41536l.m120489i(s0Var, "this$0");
        C41536l.m120488h(pVar, "data");
        s0Var.m118943Zw(pVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: vx */
    public static final void m118973vx(C41043s0 s0Var, Throwable th) {
        C41536l.m120489i(s0Var, "this$0");
        C41536l.m120488h(th, "error");
        s0Var.m118937Ux(th);
    }

    /* access modifiers changed from: private */
    /* renamed from: yx */
    public static final void m118977yx(C41043s0 s0Var, C41205b bVar) {
        C41536l.m120489i(s0Var, "this$0");
        s0Var.f96897H.mo4823o(C41341q.m119907j());
    }

    /* access modifiers changed from: private */
    /* renamed from: zx */
    public static final void m118979zx(C41043s0 s0Var, C35961q qVar) {
        C41536l.m120489i(s0Var, "this$0");
        C41536l.m120488h(qVar, "data");
        s0Var.m118944ax(qVar);
    }

    /* renamed from: Bu */
    public void mo89126Bu(String str, C36425d dVar, ApiException apiException, C41224m... mVarArr) {
        C41536l.m120489i(str, "actionName");
        C41536l.m120489i(dVar, "result");
        C41536l.m120489i(mVarArr, "extraParams");
        this.f96930z.mo89126Bu(str, dVar, apiException, mVarArr);
    }

    /* renamed from: Bx */
    public final LiveData mo95421Bx() {
        return this.f96902M;
    }

    /* renamed from: Cx */
    public final LiveData mo95422Cx() {
        return this.f96908S;
    }

    /* renamed from: Dx */
    public final LiveData mo95423Dx() {
        return this.f96907R;
    }

    /* renamed from: Hx */
    public final LiveData mo95424Hx() {
        return this.f96896G;
    }

    /* renamed from: Lx */
    public final LiveData mo95425Lx() {
        return this.f96906Q;
    }

    /* renamed from: Mx */
    public final LiveData mo95426Mx() {
        return this.f96905P;
    }

    /* renamed from: Nx */
    public final boolean mo95427Nx() {
        return m118946bx("DO_EXISTING_CLIENT_WITH_CARD_REC_ALLOWED");
    }

    /* renamed from: Ox */
    public final boolean mo95428Ox() {
        return m118946bx("DO_ADD_NEW_FINANCIAL_CONTACT_ALLOWED");
    }

    /* renamed from: Px */
    public final void mo95429Px(C36774a aVar) {
        String str;
        C41536l.m120489i(aVar, "redirectionType");
        int i = C41046c.f96934c[aVar.ordinal()];
        if (i == 1) {
            str = "add_phone_redirection";
        } else if (i == 2) {
            str = "no_phone_redirection";
        } else {
            throw new NoWhenBranchMatchedException();
        }
        mo89192tn(str, C41233s.m119492a("path", "ADD_NEW_FINANCIAL_PHONE"));
    }

    /* renamed from: Qx */
    public final void mo95430Qx() {
        this.f96894E.mo95472e();
    }

    /* renamed from: S5 */
    public LiveData mo89145S5() {
        return this.f96917m.mo89145S5();
    }

    /* renamed from: Sx */
    public final void mo95431Sx() {
        this.f96905P.mo4823o(Boolean.TRUE);
        this.f96908S.mo4823o(C41238w.f97225a);
        m118914Ex(new C41055l(this));
    }

    /* renamed from: Uw */
    public final void mo95432Uw(boolean z) {
        if (z) {
            mo42540ew(C32381m.m95620i(this.f96922r.mo94633a(), (C43064a) null, new C41047d(this), (C43075l) null, 5, (Object) null));
        } else {
            this.f96904O.mo4823o(C41238w.f97225a);
        }
    }

    /* renamed from: Vx */
    public final void mo95433Vx() {
        C41205b I = this.f96914j.mo94623c().mo95072K(C40640a.m117458b()).mo95083l(new C41041r0(this)).mo95070I(new C41076y(this), new C41077z(this));
        C41536l.m120488h(I, "getUserContacts()\n      …ror(error)\n            })");
        mo42540ew(I);
    }

    /* renamed from: Wk */
    public LiveData mo89149Wk() {
        return this.f96917m.mo89149Wk();
    }

    /* renamed from: Ww */
    public final void mo95434Ww(String str, String str2, String str3) {
        boolean z;
        C41536l.m120489i(str, "cardNo");
        C41536l.m120489i(str2, "cardCvv");
        C41536l.m120489i(str3, "expDate");
        setUserName("");
        this.f96905P.mo4823o(Boolean.TRUE);
        if (!C41536l.m120484d(f96887Y, str2) || !C41536l.m120484d(f96888Z, str3) || !C41536l.m120484d(f96886X, str) || !f96889a0) {
            C40543k kVar = this.f96912h;
            StringBuilder sb = new StringBuilder();
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (charAt != ' ') {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    sb.append(charAt);
                }
            }
            String sb2 = sb.toString();
            C41536l.m120488h(sb2, "filterTo(StringBuilder(), predicate).toString()");
            C40734b I = kVar.mo94578a(sb2, str2, C40439w.m117103B(str3, C11110u2.f31950c, "/20", false, 4, (Object) null)).mo94890I(C40640a.m117458b());
            C41536l.m120488h(I, "checkCardData(cardNo.fil…scribeOn(Schedulers.io())");
            mo42540ew(C40398b.m116971d(I, new C41048e(this), new C41049f(str2, str, str3, this)));
            return;
        }
        m118949iy();
    }

    /* renamed from: Xw */
    public final void mo95435Xw(String str) {
        C41536l.m120489i(str, "password");
        if (!this.f96910U) {
            C40734b r = this.f96916l.mo94612c(str).mo94906z(C40992a.m118827a()).mo94904r(new C41019g0(this));
            C41536l.m120488h(r, "verifyContactsOTP(passwo…e(true)\n                }");
            mo42540ew(C40398b.m116971d(r, new C41050g(this), new C41051h(this)));
            return;
        }
        m118933Rx();
    }

    /* renamed from: Y4 */
    public void mo89152Y4() {
        this.f96917m.mo89152Y4();
    }

    /* renamed from: Zc */
    public LiveData mo89154Zc() {
        return this.f96917m.mo89154Zc();
    }

    /* renamed from: Zu */
    public void mo89155Zu() {
        this.f96917m.mo89155Zu();
    }

    /* renamed from: Zx */
    public final void mo95436Zx(String str, UserContactType userContactType, C43064a aVar) {
        C10205l.C10206a aVar2;
        C41536l.m120489i(str, "insertedContact");
        C41536l.m120489i(userContactType, "insertedContactType");
        this.f96910U = false;
        if (userContactType == UserContactType.PHONE && (aVar2 = this.f96909T) != null) {
            aVar2.mo26774a();
        }
        C40560m3 m3Var = this.f96915k;
        UserContact userContact = this.f96891B;
        if (userContact != null) {
            C40762x l = m3Var.mo94588c(userContact, str, userContactType).mo95063B(C40992a.m118827a()).mo95083l(new C41017f0(this));
            C41536l.m120488h(l, "sendContactsOTP(\n       …postValue(true)\n        }");
            mo42540ew(C40398b.m116972e(l, new C41057n(this), new C41058o(aVar, this)));
        }
    }

    /* renamed from: ao */
    public void mo89156ao(String str, String str2) {
        C41536l.m120489i(str, "username");
        C41536l.m120489i(str2, "password");
        this.f96917m.mo89156ao(str, str2);
    }

    /* renamed from: cx */
    public final LiveData mo95437cx() {
        return this.f96904O;
    }

    /* renamed from: dr */
    public void mo89159dr(String str, C36425d dVar, String str2, String str3, String str4, C41224m... mVarArr) {
        C41536l.m120489i(str, "actionName");
        C41536l.m120489i(mVarArr, "extraParams");
        this.f96930z.mo89159dr(str, dVar, str2, str3, str4, mVarArr);
    }

    /* renamed from: dx */
    public final UserContact mo95438dx() {
        return this.f96891B;
    }

    /* renamed from: dy */
    public final void mo95439dy(UserContact userContact) {
        this.f96891B = userContact;
    }

    /* renamed from: ex */
    public final UserContactType mo95440ex() {
        return this.f96893D;
    }

    /* renamed from: ey */
    public final void mo95441ey(UserContactType userContactType) {
        C41536l.m120489i(userContactType, "<set-?>");
        this.f96893D = userContactType;
    }

    /* renamed from: fx */
    public final LiveData mo95442fx() {
        return this.f96900K;
    }

    /* renamed from: fy */
    public final void mo95443fy(boolean z) {
        this.f96892C = z;
    }

    /* renamed from: gx */
    public final C10146d0.C10172e mo95444gx() {
        return this.f96890A;
    }

    /* renamed from: gy */
    public final void mo95445gy(C10205l.C10206a aVar) {
        this.f96909T = aVar;
    }

    /* renamed from: hc */
    public void mo89166hc(C43064a aVar) {
        C41536l.m120489i(aVar, "getProcessReference");
        this.f96930z.mo89166hc(aVar);
    }

    /* renamed from: hx */
    public final LiveData mo95446hx() {
        return this.f96903N;
    }

    /* renamed from: hy */
    public final void mo95447hy() {
        mo42540ew(C40398b.m116971d(this.f96918n.mo94532b(this.f96928x.mo67244e()), new C41059p(this), new C41060q(this)));
    }

    /* renamed from: ij */
    public C40762x mo89168ij(String str) {
        C41536l.m120489i(str, "reference");
        return this.f96917m.mo89168ij(str);
    }

    /* renamed from: ix */
    public final boolean mo95448ix() {
        return this.f96892C;
    }

    /* renamed from: ky */
    public final void mo95449ky() {
        mo95430Qx();
    }

    /* renamed from: l */
    public final void mo95450l() {
        if (this.f96894E.mo95471d()) {
            this.f96905P.mo4823o(Boolean.TRUE);
            m118914Ex(new C41054k(this));
            return;
        }
        this.f96894E.mo95473f();
    }

    /* renamed from: ly */
    public final void mo95451ly(List list) {
        C41536l.m120489i(list, "ids");
        C41205b I = this.f96926v.mo94603a(C10146d0.C10175f.m37216a(), this.f96894E.mo95470b(), list).mo95083l(new C41023i0(this)).mo95072K(C40640a.m117458b()).mo95070I(new C41027k0(this), new C41029l0(this));
        C41536l.m120488h(I, "checkValidParameters(\n  …ror(error)\n            })");
        mo42540ew(I);
    }

    /* renamed from: mx */
    public final LiveData mo95452mx() {
        return this.f96898I;
    }

    /* renamed from: ni */
    public LiveData mo89179ni() {
        return this.f96917m.mo89179ni();
    }

    /* renamed from: nx */
    public final LiveData mo95453nx() {
        return this.f96899J;
    }

    /* renamed from: ox */
    public final LiveData mo95454ox() {
        return this.f96895F;
    }

    /* renamed from: px */
    public final C41071w mo95455px() {
        return this.f96894E;
    }

    /* renamed from: qo */
    public C41204a mo89184qo() {
        return this.f96917m.mo89184qo();
    }

    /* renamed from: qx */
    public final LiveData mo95456qx() {
        return this.f96901L;
    }

    /* renamed from: s7 */
    public void mo89187s7(String str, C36425d dVar, C41224m... mVarArr) {
        C41536l.m120489i(str, "actionName");
        C41536l.m120489i(dVar, "result");
        C41536l.m120489i(mVarArr, "extraParams");
        this.f96930z.mo89187s7(str, dVar, mVarArr);
    }

    public void setUserName(String str) {
        C41536l.m120489i(str, "userName");
        this.f96917m.setUserName(str);
    }

    /* renamed from: sx */
    public final void mo95457sx() {
        C41205b I = this.f96924t.mo94552a(C10146d0.C10175f.m37216a(), this.f96894E.mo95470b()).mo95072K(C40640a.m117458b()).mo95083l(new C41031m0(this)).mo95070I(new C41033n0(this), new C41035o0(this));
        C41536l.m120488h(I, "getPasswordRecoverySelec…ror(error)\n            })");
        mo42540ew(I);
    }

    /* renamed from: tn */
    public void mo89192tn(String str, C41224m... mVarArr) {
        C41536l.m120489i(str, "actionName");
        C41536l.m120489i(mVarArr, "extraParams");
        this.f96930z.mo89192tn(str, mVarArr);
    }

    /* renamed from: up */
    public void mo89195up(Throwable th) {
        C41536l.m120489i(th, "err");
        this.f96917m.mo89195up(th);
    }

    /* renamed from: wb */
    public LiveData mo89200wb() {
        return this.f96917m.mo89200wb();
    }

    /* renamed from: wx */
    public final LiveData mo95458wx() {
        return this.f96897H;
    }

    /* renamed from: xx */
    public final void mo95459xx() {
        C41205b I = this.f96925u.mo94556a(C10146d0.C10175f.m37216a(), this.f96894E.mo95470b()).mo95072K(C40640a.m117458b()).mo95083l(new C41011c0(this)).mo95070I(new C41013d0(this), new C41015e0(this));
        C41536l.m120488h(I, "getPasswordRecoverySelec…ror(error)\n            })");
        mo42540ew(I);
    }

    /* renamed from: yj */
    public C40767b mo89204yj() {
        return this.f96917m.mo89204yj();
    }
}
