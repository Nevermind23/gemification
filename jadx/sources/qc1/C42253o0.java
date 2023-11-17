package qc1;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import ba1.C10145d;
import ba1.C10146d0;
import ba1.C10205l;
import cd1.C40393c;
import ce1.C40397a;
import ce1.C40398b;
import com.google.gson.Gson;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import da1.C12033d;
import da1.C12038f;
import da1.C12043i;
import dd1.C40481a2;
import dd1.C40492c;
import dd1.C40524h;
import dd1.C40527h2;
import dd1.C40539j1;
import dd1.C40545k1;
import dd1.C40552l2;
import dd1.C40578p1;
import dd1.C40580p2;
import dd1.C40581p3;
import dd1.C40619v4;
import dd1.C40623w2;
import dd1.C40630y;
import dd1.C40632y1;
import de1.C40640a;
import ed1.C40734b;
import ed1.C40739f;
import ed1.C40762x;
import ei1.C40894a;
import fh1.C40951a;
import gb1.C32381m;
import gb1.C32383o;
import gd1.C40992a;
import gh1.C41125a;
import ha1.C15458b;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41217g;
import he1.C41238w;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nh1.C41806a;
import p341ge.bog.mobilebank.eventbus.events.AgreementTemplateEventKt;
import p341ge.bog.sso_client.models.C35939g;
import p341ge.bog.sso_client.models.C35947l;
import p341ge.bog.sso_client.models.C35962r;
import p341ge.bog.sso_client.models.RelatedCompany;
import p341ge.bog.sso_client.models.Session;
import p341ge.bog.sso_client.models.UserContact;
import p341ge.bog.sso_client.models.UserNameRules;
import p341ge.bog.sso_client.network.ApiException;
import p341ge.bog.sso_client.network.ConnectionFailedException;
import qa1.C27700a1;
import rc1.C42355a;
import rc1.C42357b;
import sso.queery.GetClientInfoQuery;
import sso.type.AuthElementType;
import sso.type.UserContactType;
import ue1.C43064a;
import ue1.C43075l;
import za1.C40221d;
import za1.C40227j;

/* renamed from: qc1.o0 */
public final class C42253o0 extends C15458b {

    /* renamed from: Q */
    public static final C42254a f99388Q = new C42254a((DefaultConstructorMarker) null);

    /* renamed from: A */
    private final C1644x f99389A = new C1644x();

    /* renamed from: B */
    private final C1644x f99390B = new C1644x();

    /* renamed from: C */
    private final C1644x f99391C = new C1644x();

    /* renamed from: D */
    private final C1644x f99392D = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: E */
    public final C1644x f99393E = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: F */
    public final C1644x f99394F = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: G */
    public final C1644x f99395G = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: H */
    public final C1644x f99396H = new C1644x();

    /* renamed from: I */
    private boolean f99397I;

    /* renamed from: J */
    private String f99398J = "";

    /* renamed from: K */
    private boolean f99399K;

    /* renamed from: L */
    private String f99400L;

    /* renamed from: M */
    private List f99401M = C41341q.m119907j();

    /* renamed from: N */
    private C12033d f99402N = new C12033d(new C12038f((List) null, (RelatedCompany) null, 3, (DefaultConstructorMarker) null), m122679Vw());

    /* renamed from: O */
    private final C41217g f99403O = C41219i.m119470b(new C42255a0(this));

    /* renamed from: P */
    private C10205l.C10206a f99404P;

    /* renamed from: h */
    private final C40580p2 f99405h;

    /* renamed from: i */
    private final C40552l2 f99406i;

    /* renamed from: j */
    private final C40524h f99407j;

    /* renamed from: k */
    private final C40630y f99408k;

    /* renamed from: l */
    private final C40539j1 f99409l;

    /* renamed from: m */
    private final C40632y1 f99410m;

    /* renamed from: n */
    private final C40527h2 f99411n;

    /* renamed from: o */
    private final C40221d f99412o;

    /* renamed from: p */
    private final C40581p3 f99413p;

    /* renamed from: q */
    private final C40619v4 f99414q;

    /* renamed from: r */
    private final C40623w2 f99415r;

    /* renamed from: s */
    private final C40481a2 f99416s;

    /* renamed from: t */
    private final C40227j f99417t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public final C27700a1 f99418u;

    /* renamed from: v */
    private final C40545k1 f99419v;

    /* renamed from: w */
    private final C40492c f99420w;

    /* renamed from: x */
    private final C40393c f99421x;

    /* renamed from: y */
    private final C10146d0.C10172e f99422y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public final C32383o f99423z = new C32383o();

    /* renamed from: qc1.o0$a */
    public static final class C42254a {
        private C42254a() {
        }

        public /* synthetic */ C42254a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: qc1.o0$a0 */
    static final class C42255a0 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C42253o0 f99424d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42255a0(C42253o0 o0Var) {
            super(0);
            this.f99424d = o0Var;
        }

        /* renamed from: b */
        public final C42355a invoke() {
            return new C42355a(this.f99424d.f99418u);
        }
    }

    /* renamed from: qc1.o0$b */
    static final class C42256b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C42253o0 f99425d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42256b(C42253o0 o0Var) {
            super(1);
            this.f99425d = o0Var;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            this.f99425d.f99396H.mo4826r(new C35947l.C35949b(th));
        }
    }

    /* renamed from: qc1.o0$b0 */
    static final class C42257b0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C43064a f99426d;

        /* renamed from: e */
        final /* synthetic */ C42253o0 f99427e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42257b0(C43064a aVar, C42253o0 o0Var) {
            super(1);
            this.f99426d = aVar;
            this.f99427e = o0Var;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            C43064a aVar = this.f99426d;
            if (aVar != null) {
                aVar.invoke();
            }
            C40894a.m118635a(th);
            this.f99427e.m122688jx(th, AgreementTemplateEventKt.CONTRACT_TYPE_CREFIT_INFO_CHECK_PERMISSION_OFFERS_ID);
        }
    }

    /* renamed from: qc1.o0$c */
    static final class C42258c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C42253o0 f99428d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42258c(C42253o0 o0Var) {
            super(0);
            this.f99428d = o0Var;
        }

        public final void invoke() {
            this.f99428d.f99396H.mo4826r(new C35947l.C35951d(C41238w.f97225a));
        }
    }

    /* renamed from: qc1.o0$c0 */
    static final class C42259c0 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f99429d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42259c0(C43064a aVar) {
            super(0);
            this.f99429d = aVar;
        }

        public final void invoke() {
            C43064a aVar = this.f99429d;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    /* renamed from: qc1.o0$d */
    static final class C42260d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C42253o0 f99430d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42260d(C42253o0 o0Var) {
            super(1);
            this.f99430d = o0Var;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            C40894a.m118635a(th);
            this.f99430d.m122688jx(th, AgreementTemplateEventKt.CONTRACT_TYPE_CREFIT_INFO_CHECK_PERMISSION_APPL_ID);
        }
    }

    /* renamed from: qc1.o0$d0 */
    static final class C42261d0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C42253o0 f99431d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42261d0(C42253o0 o0Var) {
            super(1);
            this.f99431d = o0Var;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            C40894a.m118635a(th);
            this.f99431d.m122688jx(th, "1");
        }
    }

    /* renamed from: qc1.o0$e */
    static final class C42262e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C42253o0 f99432d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42262e(C42253o0 o0Var) {
            super(1);
            this.f99432d = o0Var;
        }

        /* renamed from: a */
        public final void mo97755a(List list) {
            C41536l.m120489i(list, "it");
            this.f99432d.mo97718Iw().mo32134f().mo32171j(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo97755a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: qc1.o0$e0 */
    static final class C42263e0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C42253o0 f99433d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42263e0(C42253o0 o0Var) {
            super(1);
            this.f99433d = o0Var;
        }

        /* renamed from: a */
        public final void mo97756a(C35939g gVar) {
            C12043i.m44222h(this.f99433d.mo97718Iw().mo32134f(), (C42357b) null, AuthElementType.PASSWORD, 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo97756a((C35939g) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: qc1.o0$f */
    static final class C42264f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C42253o0 f99434d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42264f(C42253o0 o0Var) {
            super(1);
            this.f99434d = o0Var;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            C40894a.m118635a(th);
            this.f99434d.m122688jx(th, "3");
        }
    }

    /* renamed from: qc1.o0$g */
    static final class C42265g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C42253o0 f99435d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42265g(C42253o0 o0Var) {
            super(0);
            this.f99435d = o0Var;
        }

        public final void invoke() {
            C12043i.m44222h(this.f99435d.mo97718Iw().mo32134f(), (C42357b) null, AuthElementType.OTP, 1, (Object) null);
        }
    }

    /* renamed from: qc1.o0$h */
    public static final class C42266h implements C41125a {

        /* renamed from: a */
        private final Object f99436a = mo26679a().mo95345c().mo97161i().mo97675g(C41520a0.m120436b(C10146d0.C10172e.class), (C41806a) null, (C43064a) null);

        /* renamed from: a */
        public C40951a mo26679a() {
            return C41125a.C41126a.m119226a(this);
        }

        /* renamed from: b */
        public final Object mo97758b() {
            return this.f99436a;
        }
    }

    /* renamed from: qc1.o0$i */
    static final class C42267i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C42253o0 f99437d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42267i(C42253o0 o0Var) {
            super(1);
            this.f99437d = o0Var;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            C40894a.m118635a(th);
            this.f99437d.f99423z.mo4826r(new C35947l.C35949b(th));
        }
    }

    /* renamed from: qc1.o0$j */
    static final class C42268j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C42253o0 f99438d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42268j(C42253o0 o0Var) {
            super(0);
            this.f99438d = o0Var;
        }

        public final void invoke() {
            this.f99438d.mo97718Iw().mo32129a().mo32127e();
        }
    }

    /* renamed from: qc1.o0$k */
    public static final class C42269k implements C41125a {

        /* renamed from: a */
        private final Object f99439a = mo26679a().mo95345c().mo97161i().mo97675g(C41520a0.m120436b(C10146d0.C10172e.class), (C41806a) null, (C43064a) null);

        /* renamed from: a */
        public C40951a mo26679a() {
            return C41125a.C41126a.m119226a(this);
        }

        /* renamed from: b */
        public final Object mo97760b() {
            return this.f99439a;
        }
    }

    /* renamed from: qc1.o0$l */
    static final class C42270l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C42253o0 f99440d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42270l(C42253o0 o0Var) {
            super(0);
            this.f99440d = o0Var;
        }

        public final void invoke() {
            this.f99440d.f99394F.mo4823o(C35947l.C35950c.f86976a);
        }
    }

    /* renamed from: qc1.o0$m */
    static final class C42271m extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C42253o0 f99441d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42271m(C42253o0 o0Var) {
            super(1);
            this.f99441d = o0Var;
        }

        /* renamed from: a */
        public final void mo97761a(UserNameRules userNameRules) {
            this.f99441d.f99394F.mo4823o(new C35947l.C35951d(userNameRules));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo97761a((UserNameRules) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: qc1.o0$n */
    static final class C42272n extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C42253o0 f99442d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42272n(C42253o0 o0Var) {
            super(1);
            this.f99442d = o0Var;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            this.f99442d.f99394F.mo4823o(new C35947l.C35949b(th));
        }
    }

    /* renamed from: qc1.o0$o */
    static final class C42273o extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C42253o0 f99443d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42273o(C42253o0 o0Var) {
            super(1);
            this.f99443d = o0Var;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            C40894a.m118635a(th);
            this.f99443d.m122688jx(th, "5");
        }
    }

    /* renamed from: qc1.o0$p */
    static final class C42274p extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C42253o0 f99444d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42274p(C42253o0 o0Var) {
            super(1);
            this.f99444d = o0Var;
        }

        /* renamed from: a */
        public final void mo97764a(C35939g gVar) {
            C12043i.m44222h(this.f99444d.mo97718Iw().mo32134f(), (C42357b) null, AuthElementType.BIOMETRY, 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo97764a((C35939g) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: qc1.o0$q */
    static final class C42275q extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C42253o0 f99445d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42275q(C42253o0 o0Var) {
            super(1);
            this.f99445d = o0Var;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            C40894a.m118635a(th);
            this.f99445d.m122688jx(th, AgreementTemplateEventKt.CONTRACT_TYPE_MBANK_PENSION_CONTRACT_ANDROID_ID);
        }
    }

    /* renamed from: qc1.o0$r */
    static final class C42276r extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C42253o0 f99446d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42276r(C42253o0 o0Var) {
            super(1);
            this.f99446d = o0Var;
        }

        /* renamed from: a */
        public final void mo97766a(C35939g gVar) {
            C12043i.m44222h(this.f99446d.mo97718Iw().mo32134f(), (C42357b) null, AuthElementType.PASSCODE, 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo97766a((C35939g) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: qc1.o0$s */
    static final class C42277s extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C42253o0 f99447d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42277s(C42253o0 o0Var) {
            super(0);
            this.f99447d = o0Var;
        }

        public final void invoke() {
            this.f99447d.f99393E.mo4823o(C35947l.C35950c.f86976a);
        }
    }

    /* renamed from: qc1.o0$t */
    static final class C42278t extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C42253o0 f99448d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42278t(C42253o0 o0Var) {
            super(0);
            this.f99448d = o0Var;
        }

        public final void invoke() {
            this.f99448d.f99393E.mo4823o(new C35947l.C35951d(C41238w.f97225a));
        }
    }

    /* renamed from: qc1.o0$u */
    static final class C42279u extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C42253o0 f99449d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42279u(C42253o0 o0Var) {
            super(1);
            this.f99449d = o0Var;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            this.f99449d.f99393E.mo4823o(new C35947l.C35949b(th));
        }
    }

    /* renamed from: qc1.o0$v */
    static final class C42280v extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C42253o0 f99450d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42280v(C42253o0 o0Var) {
            super(0);
            this.f99450d = o0Var;
        }

        public final void invoke() {
            this.f99450d.f99395G.mo4823o(C35947l.C35950c.f86976a);
        }
    }

    /* renamed from: qc1.o0$w */
    static final class C42281w extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C42253o0 f99451d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42281w(C42253o0 o0Var) {
            super(0);
            this.f99451d = o0Var;
        }

        public final void invoke() {
            this.f99451d.f99395G.mo4823o(new C35947l.C35951d(C41238w.f97225a));
        }
    }

    /* renamed from: qc1.o0$x */
    static final class C42282x extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C42253o0 f99452d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42282x(C42253o0 o0Var) {
            super(1);
            this.f99452d = o0Var;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            this.f99452d.f99395G.mo4823o(new C35947l.C35949b(th));
        }
    }

    /* renamed from: qc1.o0$y */
    static final class C42283y extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C42283y f99453d = new C42283y();

        C42283y() {
            super(1);
        }

        /* renamed from: a */
        public final void mo97769a(Session session) {
            C41536l.m120489i(session, "$this$edit");
            session.setPassCodeToken$sso_client_release((String) null);
            session.setBiometricToken$sso_client_release((String) null);
            session.setAvailableAuthTypes$sso_client_release(C41361y0.m120039k(session.getAvailableAuthTypes$sso_client_release(), AuthElementType.BIOMETRY));
            session.setAvailableAuthTypes$sso_client_release(C41361y0.m120039k(session.getAvailableAuthTypes$sso_client_release(), AuthElementType.PASSCODE));
            session.setAvailableAuthTypes$sso_client_release(C41361y0.m120039k(session.getAvailableAuthTypes$sso_client_release(), AuthElementType.TRUSTED_DEVICE));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo97769a((Session) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: qc1.o0$z */
    public static final class C42284z implements C41125a {

        /* renamed from: a */
        private final Object f99454a = mo26679a().mo95345c().mo97161i().mo97675g(C41520a0.m120436b(C10146d0.C10172e.class), (C41806a) null, (C43064a) null);

        /* renamed from: a */
        public C40951a mo26679a() {
            return C41125a.C41126a.m119226a(this);
        }

        /* renamed from: b */
        public final Object mo97770b() {
            return this.f99454a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C42253o0(C40580p2 p2Var, C40552l2 l2Var, C40524h hVar, C40630y yVar, C40539j1 j1Var, C40632y1 y1Var, C40527h2 h2Var, C40221d dVar, C40581p3 p3Var, C40619v4 v4Var, C40623w2 w2Var, C40481a2 a2Var, C40227j jVar, C27700a1 a1Var, C40545k1 k1Var, C40492c cVar, C40393c cVar2, C10146d0.C10172e eVar) {
        super((C40578p1) null, 1, (DefaultConstructorMarker) null);
        C40580p2 p2Var2 = p2Var;
        C40552l2 l2Var2 = l2Var;
        C40524h hVar2 = hVar;
        C40630y yVar2 = yVar;
        C40539j1 j1Var2 = j1Var;
        C40632y1 y1Var2 = y1Var;
        C40527h2 h2Var2 = h2Var;
        C40221d dVar2 = dVar;
        C40581p3 p3Var2 = p3Var;
        C40619v4 v4Var2 = v4Var;
        C40623w2 w2Var2 = w2Var;
        C40481a2 a2Var2 = a2Var;
        C40227j jVar2 = jVar;
        C40492c cVar3 = cVar;
        C41536l.m120489i(p2Var2, "passwordLoginAndStoreLoginInfoUseCase");
        C41536l.m120489i(l2Var2, "passCodeLoginAndStoreLoginInfoUseCase");
        C41536l.m120489i(hVar2, "biometricLoginAndStoreLoginInfoUseCase");
        C41536l.m120489i(yVar2, "finishAuthenticationUseCase");
        C41536l.m120489i(j1Var2, "getRelatedCompaniesUseCase");
        C41536l.m120489i(y1Var2, "getUserContactsUseCase");
        C41536l.m120489i(h2Var2, "onAfterAuthErrorUseCase");
        C41536l.m120489i(dVar2, "getUserInfo");
        C41536l.m120489i(p3Var2, "requestOTP");
        C41536l.m120489i(v4Var2, "verifyOneTimePassword");
        C41536l.m120489i(w2Var2, "prolongPasswordUseCase");
        C41536l.m120489i(a2Var2, "getUserNameRulesUseCase");
        C41536l.m120489i(jVar2, "updateUsername");
        C41536l.m120489i(a1Var, "storage");
        C41536l.m120489i(k1Var, "getSettingUseCase");
        C41536l.m120489i(cVar, "channelActivation");
        C41536l.m120489i(cVar2, "startTMXProfilingUseCase");
        C41536l.m120489i(eVar, "config");
        this.f99405h = p2Var2;
        this.f99406i = l2Var2;
        this.f99407j = hVar2;
        this.f99408k = yVar2;
        this.f99409l = j1Var2;
        this.f99410m = y1Var2;
        this.f99411n = h2Var2;
        this.f99412o = dVar2;
        this.f99413p = p3Var2;
        this.f99414q = v4Var2;
        this.f99415r = w2Var2;
        this.f99416s = a2Var2;
        this.f99417t = jVar2;
        this.f99418u = a1Var;
        this.f99419v = k1Var;
        this.f99420w = cVar;
        this.f99421x = cVar2;
        this.f99422y = eVar;
        C41205b F0 = h2Var.mo94563a().mo95027o0(C40992a.m118827a()).mo94981F0(new C42235f0(this));
        C41536l.m120488h(F0, "onAfterAuthErrorUseCase.….Error(it))\n            }");
        C40397a.m116967a(F0, new C41204a());
    }

    /* renamed from: Cx */
    private final C40734b m122675Cx() {
        boolean z;
        String str = this.f99400L;
        boolean z2 = false;
        if (str == null || C40439w.m117118v(str)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            String username = C10146d0.C10159c.m37143b().getUsername();
            if (username == null || C40439w.m117118v(username)) {
                z2 = true;
            }
            if (z2) {
                C40734b i = C40734b.m117918i();
                C41536l.m120488h(i, "{\n            Completable.complete()\n        }");
                return i;
            }
        }
        C40734b y = this.f99412o.mo94174a().mo95084m(new C42245k0(this)).mo95092y();
        C41536l.m120488h(y, "{\n            getUserInf…ignoreElement()\n        }");
        return y;
    }

    /* access modifiers changed from: private */
    /* renamed from: Dx */
    public static final void m122676Dx(C42253o0 o0Var, GetClientInfoQuery.GetClientInfo getClientInfo) {
        boolean z;
        List list;
        List list2;
        C41536l.m120489i(o0Var, "this$0");
        String str = o0Var.f99400L;
        if (str == null || C40439w.m117118v(str)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            C10146d0.C10159c.m37143b().setUsername$sso_client_release(o0Var.f99400L);
        }
        C10146d0.C10159c.m37143b().setAvatarUrl(getClientInfo.getImageURL());
        C10146d0.C10159c.m37143b().setFirstName(getClientInfo.getFirstName());
        C10146d0.C10159c.m37143b().setLastName(getClientInfo.getLastName());
        Session b = C10146d0.C10159c.m37143b();
        UserContactType userContactType = UserContactType.PHONE;
        List<GetClientInfoQuery.ClientContact> clientContacts = getClientInfo.getClientContacts();
        if (clientContacts == null || (list = C41358y.m120004T(clientContacts)) == null) {
            list = C41341q.m119907j();
        }
        b.setPhones(o0Var.m122677Lw(userContactType, list));
        Session b2 = C10146d0.C10159c.m37143b();
        UserContactType userContactType2 = UserContactType.MAIL;
        List<GetClientInfoQuery.ClientContact> clientContacts2 = getClientInfo.getClientContacts();
        if (clientContacts2 == null || (list2 = C41358y.m120004T(clientContacts2)) == null) {
            list2 = C41341q.m119907j();
        }
        b2.setMails(o0Var.m122677Lw(userContactType2, list2));
    }

    /* renamed from: Lw */
    private final List m122677Lw(UserContactType userContactType, List list) {
        boolean z;
        ArrayList<GetClientInfoQuery.ClientContact> arrayList = new ArrayList<>();
        for (Object next : list) {
            if (((GetClientInfoQuery.ClientContact) next).getType() == userContactType) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C41343r.m119925u(arrayList, 10));
        for (GetClientInfoQuery.ClientContact clientContact : arrayList) {
            arrayList2.add(new UserContact(clientContact.getId(), clientContact.getType(), clientContact.getContact(), clientContact.getFinancial(), clientContact.getPreSelected()));
        }
        return arrayList2;
    }

    /* renamed from: Pw */
    private final C40762x m122678Pw() {
        if (C41536l.m120484d(((C10146d0.C10172e) new C42269k().mo97760b()).mo26726q().mo92939a(), "m4B")) {
            return this.f99409l.mo94575c();
        }
        C40762x z = C40762x.m118162z(C41341q.m119907j());
        C41536l.m120488h(z, "{\n            Single.just(emptyList())\n        }");
        return z;
    }

    /* renamed from: Vw */
    private final C42355a m122679Vw() {
        return (C42355a) this.f99403O.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: ax */
    public static final void m122680ax(C42253o0 o0Var, C35939g gVar) {
        C41536l.m120489i(o0Var, "this$0");
        o0Var.f99390B.mo4823o(new C35947l.C35951d(C41238w.f97225a));
    }

    /* access modifiers changed from: private */
    /* renamed from: bx */
    public static final void m122681bx(C42253o0 o0Var, Throwable th) {
        C41536l.m120489i(o0Var, "this$0");
        C1644x xVar = o0Var.f99390B;
        C41536l.m120488h(th, "it");
        xVar.mo4823o(new C35947l.C35949b(th));
    }

    /* access modifiers changed from: private */
    /* renamed from: cx */
    public static final void m122682cx(C42253o0 o0Var, C41205b bVar) {
        C41536l.m120489i(o0Var, "this$0");
        o0Var.f99390B.mo4823o(C35947l.C35950c.f86976a);
    }

    /* access modifiers changed from: private */
    /* renamed from: ex */
    public static final void m122683ex(C42253o0 o0Var, Throwable th) {
        C41536l.m120489i(o0Var, "this$0");
        C1644x xVar = o0Var.f99389A;
        C41536l.m120488h(th, "it");
        xVar.mo4823o(new C35947l.C35949b(th));
    }

    /* access modifiers changed from: private */
    /* renamed from: fx */
    public static final void m122684fx(C42253o0 o0Var, C41205b bVar) {
        C41536l.m120489i(o0Var, "this$0");
        o0Var.f99389A.mo4823o(C35947l.C35950c.f86976a);
    }

    /* access modifiers changed from: private */
    /* renamed from: gx */
    public static final void m122685gx(C42253o0 o0Var, C35939g gVar) {
        C41536l.m120489i(o0Var, "this$0");
        o0Var.f99389A.mo4823o(new C35947l.C35951d(C41238w.f97225a));
    }

    /* access modifiers changed from: private */
    /* renamed from: jx */
    public final void m122688jx(Throwable th, String str) {
        boolean z;
        if (th instanceof ConnectionFailedException) {
            mo42542gw().mo4823o(new C35947l.C35949b(new ConnectionFailedException(C10145d.m37089c("text.no.network.info", this.f99422y))));
            return;
        }
        boolean z2 = false;
        if (th instanceof ApiException) {
            ApiException apiException = (ApiException) th;
            String errorMessage = apiException.getErrorMessage();
            if (errorMessage == null || errorMessage.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                str = apiException.getErrorMessage();
                mo42542gw().mo4823o(new C35947l.C35949b(new ApiException(-1, str, (String) null, (String) null, 12, (DefaultConstructorMarker) null)));
            }
        }
        String message = th.getMessage();
        if (message == null || message.length() == 0) {
            z2 = true;
        }
        if (!z2) {
            str = th.getMessage() + 10 + str;
        }
        mo42542gw().mo4823o(new C35947l.C35949b(new ApiException(-1, str, (String) null, (String) null, 12, (DefaultConstructorMarker) null)));
    }

    /* renamed from: ox */
    public static /* synthetic */ void m122694ox(C42253o0 o0Var, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        o0Var.mo97740nx(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: rw */
    public static final void m122697rw(C42253o0 o0Var, ApiException apiException) {
        C41536l.m120489i(o0Var, "this$0");
        C32383o gw = o0Var.mo42542gw();
        C41536l.m120488h(apiException, "it");
        gw.mo4823o(new C35947l.C35949b(apiException));
    }

    /* renamed from: rx */
    public static /* synthetic */ void m122698rx(C42253o0 o0Var, UserContact userContact, C43064a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            userContact = null;
        }
        if ((i & 2) != 0) {
            aVar = null;
        }
        o0Var.mo97742qx(userContact, aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: sx */
    public static final C40739f m122700sx(C42253o0 o0Var, UserContact userContact, List list) {
        C40734b bVar;
        C10205l.C10206a aVar;
        C41536l.m120489i(o0Var, "this$0");
        C41536l.m120489i(list, "userContacts");
        o0Var.f99401M = list;
        if (userContact == null) {
            userContact = o0Var.mo97722Nw();
        }
        UserContact userContact2 = userContact;
        if (userContact2 != null) {
            if (userContact2.mo88424f() == UserContactType.PHONE && (aVar = o0Var.f99404P) != null) {
                aVar.mo26774a();
            }
            if (userContact2.mo88424f() == UserContactType.DIGIPASS) {
                bVar = C40734b.m117918i();
            } else {
                bVar = C40581p3.m117364d(o0Var.f99413p, userContact2, (String) null, false, 6, (Object) null);
            }
            if (bVar != null) {
                return bVar;
            }
        }
        return C40734b.m117923s(new Throwable(""));
    }

    /* renamed from: zx */
    public static /* synthetic */ void m122707zx(C42253o0 o0Var, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        o0Var.mo97748yx(z);
    }

    /* renamed from: Aw */
    public final void mo97707Aw() {
        mo42540ew(C40398b.m116972e(m122678Pw(), new C42260d(this), new C42262e(this)));
    }

    /* renamed from: Ax */
    public final void mo97708Ax() {
        this.f99402N.mo32137i();
        this.f99391C.mo4823o(C10146d0.C10159c.m37143b().getUserInfo());
    }

    /* renamed from: Bw */
    public final void mo97709Bw() {
        this.f99402N.mo32133e().mo32167f();
    }

    /* renamed from: Bx */
    public final void mo97710Bx(String str) {
        C41536l.m120489i(str, "tmxFlagKey");
        mo42540ew(this.f99421x.mo94454b(str));
    }

    /* renamed from: Cw */
    public final void mo97711Cw() {
        this.f99397I = true;
        this.f99402N.mo32134f().mo32168f();
    }

    /* renamed from: Dw */
    public final void mo97712Dw(String str) {
        C41536l.m120489i(str, "code");
        C40734b z = C40619v4.m117422d(this.f99414q, str, (String) null, 2, (Object) null).mo94890I(C40640a.m117458b()).mo94906z(C40992a.m118827a());
        C41536l.m120488h(z, "verifyOneTimePassword(co…dSchedulers.mainThread())");
        mo42540ew(C40398b.m116971d(z, new C42264f(this), new C42265g(this)));
    }

    /* renamed from: Ew */
    public final void mo97713Ew(String str) {
        boolean z;
        C41536l.m120489i(str, "clientKey");
        C40630y yVar = this.f99408k;
        boolean d = C41536l.m120484d(((C10146d0.C10172e) new C42266h().mo97758b()).mo26726q().mo92939a(), "m4B");
        if (this.f99399K || this.f99418u.mo67244e()) {
            z = true;
        } else {
            z = false;
        }
        C40734b z2 = yVar.mo94632c(str, false, d, z).mo94895d(m122675Cx()).mo94890I(C40640a.m117458b()).mo94906z(C40992a.m118827a());
        C41536l.m120488h(z2, "finishAuthenticationUseC…dSchedulers.mainThread())");
        mo42540ew(C40398b.m116971d(z2, new C42267i(this), new C42268j(this)));
    }

    /* renamed from: Ex */
    public final void mo97714Ex() {
        this.f99402N.mo32136h().mo32178f();
    }

    /* renamed from: Fw */
    public final void mo97715Fw() {
        this.f99402N.mo32134f().mo32172k();
    }

    /* renamed from: Gw */
    public final LiveData mo97716Gw() {
        return this.f99396H;
    }

    /* renamed from: Hw */
    public final LiveData mo97717Hw() {
        return this.f99392D;
    }

    /* renamed from: Iw */
    public final C12033d mo97718Iw() {
        return this.f99402N;
    }

    /* renamed from: Jw */
    public final LiveData mo97719Jw() {
        return this.f99390B;
    }

    /* renamed from: Kw */
    public final List mo97720Kw() {
        return this.f99401M;
    }

    /* renamed from: Mw */
    public final LiveData mo97721Mw() {
        return this.f99391C;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: ge.bog.sso_client.models.UserContact} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: ge.bog.sso_client.models.UserContact} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: ge.bog.sso_client.models.UserContact} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: ge.bog.sso_client.models.UserContact} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: Nw */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p341ge.bog.sso_client.models.UserContact mo97722Nw() {
        /*
            r11 = this;
            java.util.List r0 = r11.f99401M
            java.util.Iterator r0 = r0.iterator()
        L_0x0006:
            boolean r1 = r0.hasNext()
            r2 = 1
            r3 = 0
            r4 = 0
            if (r1 == 0) goto L_0x0030
            java.lang.Object r1 = r0.next()
            r5 = r1
            ge.bog.sso_client.models.UserContact r5 = (p341ge.bog.sso_client.models.UserContact) r5
            java.lang.Boolean r6 = r5.mo88419b()
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            boolean r6 = kotlin.jvm.internal.C41536l.m120484d(r6, r7)
            if (r6 == 0) goto L_0x002c
            sso.type.UserContactType r5 = r5.mo88424f()
            sso.type.UserContactType r6 = sso.type.UserContactType.PHONE
            if (r5 != r6) goto L_0x002c
            r5 = r2
            goto L_0x002d
        L_0x002c:
            r5 = r3
        L_0x002d:
            if (r5 == 0) goto L_0x0006
            goto L_0x0031
        L_0x0030:
            r1 = r4
        L_0x0031:
            ge.bog.sso_client.models.UserContact r1 = (p341ge.bog.sso_client.models.UserContact) r1
            java.util.List r0 = r11.f99401M
            java.util.Iterator r0 = r0.iterator()
        L_0x0039:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x0060
            java.lang.Object r5 = r0.next()
            r6 = r5
            ge.bog.sso_client.models.UserContact r6 = (p341ge.bog.sso_client.models.UserContact) r6
            java.lang.Boolean r7 = r6.mo88419b()
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            boolean r7 = kotlin.jvm.internal.C41536l.m120484d(r7, r8)
            if (r7 == 0) goto L_0x005c
            sso.type.UserContactType r6 = r6.mo88424f()
            sso.type.UserContactType r7 = sso.type.UserContactType.MAIL
            if (r6 != r7) goto L_0x005c
            r6 = r2
            goto L_0x005d
        L_0x005c:
            r6 = r3
        L_0x005d:
            if (r6 == 0) goto L_0x0039
            goto L_0x0061
        L_0x0060:
            r5 = r4
        L_0x0061:
            ge.bog.sso_client.models.UserContact r5 = (p341ge.bog.sso_client.models.UserContact) r5
            java.util.List r0 = r11.f99401M
            java.util.Iterator r0 = r0.iterator()
        L_0x0069:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x0084
            java.lang.Object r6 = r0.next()
            r7 = r6
            ge.bog.sso_client.models.UserContact r7 = (p341ge.bog.sso_client.models.UserContact) r7
            sso.type.UserContactType r7 = r7.mo88424f()
            sso.type.UserContactType r8 = sso.type.UserContactType.PHONE
            if (r7 != r8) goto L_0x0080
            r7 = r2
            goto L_0x0081
        L_0x0080:
            r7 = r3
        L_0x0081:
            if (r7 == 0) goto L_0x0069
            goto L_0x0085
        L_0x0084:
            r6 = r4
        L_0x0085:
            ge.bog.sso_client.models.UserContact r6 = (p341ge.bog.sso_client.models.UserContact) r6
            java.util.List r0 = r11.f99401M
            java.util.Iterator r0 = r0.iterator()
        L_0x008d:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L_0x00a8
            java.lang.Object r7 = r0.next()
            r8 = r7
            ge.bog.sso_client.models.UserContact r8 = (p341ge.bog.sso_client.models.UserContact) r8
            sso.type.UserContactType r8 = r8.mo88424f()
            sso.type.UserContactType r9 = sso.type.UserContactType.MAIL
            if (r8 != r9) goto L_0x00a4
            r8 = r2
            goto L_0x00a5
        L_0x00a4:
            r8 = r3
        L_0x00a5:
            if (r8 == 0) goto L_0x008d
            goto L_0x00a9
        L_0x00a8:
            r7 = r4
        L_0x00a9:
            ge.bog.sso_client.models.UserContact r7 = (p341ge.bog.sso_client.models.UserContact) r7
            java.util.List r0 = r11.f99401M
            java.util.Iterator r0 = r0.iterator()
        L_0x00b1:
            boolean r8 = r0.hasNext()
            if (r8 == 0) goto L_0x00cc
            java.lang.Object r8 = r0.next()
            r9 = r8
            ge.bog.sso_client.models.UserContact r9 = (p341ge.bog.sso_client.models.UserContact) r9
            sso.type.UserContactType r9 = r9.mo88424f()
            sso.type.UserContactType r10 = sso.type.UserContactType.DIGIPASS
            if (r9 != r10) goto L_0x00c8
            r9 = r2
            goto L_0x00c9
        L_0x00c8:
            r9 = r3
        L_0x00c9:
            if (r9 == 0) goto L_0x00b1
            r4 = r8
        L_0x00cc:
            ge.bog.sso_client.models.UserContact r4 = (p341ge.bog.sso_client.models.UserContact) r4
            if (r1 != 0) goto L_0x00dd
            if (r5 != 0) goto L_0x00dc
            if (r6 != 0) goto L_0x00da
            if (r7 != 0) goto L_0x00d8
            r1 = r4
            goto L_0x00dd
        L_0x00d8:
            r1 = r7
            goto L_0x00dd
        L_0x00da:
            r1 = r6
            goto L_0x00dd
        L_0x00dc:
            r1 = r5
        L_0x00dd:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: qc1.C42253o0.mo97722Nw():ge.bog.sso_client.models.UserContact");
    }

    /* renamed from: Ow */
    public final String mo97723Ow() {
        return this.f99398J;
    }

    /* renamed from: Qw */
    public final LiveData mo97724Qw() {
        return this.f99395G;
    }

    /* renamed from: Rw */
    public final LiveData mo97725Rw() {
        return this.f99423z;
    }

    /* renamed from: Sw */
    public final boolean mo97726Sw() {
        return !C10146d0.C10148b.f28142a.mo26675j();
    }

    /* renamed from: Tw */
    public final LiveData mo97727Tw() {
        return this.f99389A;
    }

    /* renamed from: Uw */
    public final LiveData mo97728Uw() {
        return this.f99393E;
    }

    /* renamed from: Ww */
    public final void mo97729Ww(String str) {
        C41536l.m120489i(str, "reference");
        C40762x B = this.f99416s.mo94534a(str).mo95072K(C40640a.m117458b()).mo95063B(C40992a.m118827a());
        C41536l.m120488h(B, "getUserNameRulesUseCase(…dSchedulers.mainThread())");
        mo42540ew(C32381m.m95619h(B, new C42270l(this), new C42271m(this), new C42272n(this)));
    }

    /* renamed from: Xw */
    public final void mo97730Xw(boolean z) {
        C10146d0.C10159c.f28157a.mo26690d();
        if (z) {
            mo97708Ax();
        }
    }

    /* renamed from: Yw */
    public final boolean mo97731Yw() {
        return C10146d0.C10159c.m37143b().getBiometricEnabled$sso_client_release();
    }

    /* renamed from: Zc */
    public final LiveData mo97732Zc() {
        return this.f99394F;
    }

    /* renamed from: Zw */
    public final void mo97733Zw() {
        C40762x B = this.f99407j.mo94561d().mo95084m(new C42247l0(this)).mo95082k(new C42249m0(this)).mo95083l(new C42251n0(this)).mo95072K(C40640a.m117458b()).mo95063B(C40992a.m118827a());
        C41536l.m120488h(B, "biometricLoginAndStoreLo…dSchedulers.mainThread())");
        mo42540ew(C40398b.m116972e(B, new C42273o(this), new C42274p(this)));
    }

    /* renamed from: dx */
    public final void mo97734dx(String str) {
        C41536l.m120489i(str, "passCode");
        C40762x B = this.f99406i.mo94584d(str).mo95084m(new C42237g0(this)).mo95082k(new C42239h0(this)).mo95083l(new C42241i0(this)).mo95072K(C40640a.m117458b()).mo95063B(C40992a.m118827a());
        C41536l.m120488h(B, "passCodeLoginAndStoreLog…dSchedulers.mainThread())");
        mo42540ew(C40398b.m116972e(B, new C42275q(this), new C42276r(this)));
    }

    /* renamed from: hx */
    public final void mo97735hx() {
        this.f99418u.mo67241b();
        mo97740nx(false);
        mo97711Cw();
    }

    /* renamed from: ix */
    public final void mo97736ix() {
        this.f99402N.mo32134f().mo32172k();
    }

    /* renamed from: kx */
    public final void mo97737kx() {
        C40734b z = this.f99415r.mo94627c().mo94890I(C40640a.m117458b()).mo94906z(C40992a.m118827a());
        C41536l.m120488h(z, "prolongPasswordUseCase()…dSchedulers.mainThread())");
        mo42540ew(C32381m.m95618g(z, new C42277s(this), new C42278t(this), new C42279u(this)));
    }

    /* renamed from: lx */
    public final void mo97738lx() {
        this.f99402N.mo32132d().mo32164f();
    }

    /* renamed from: mx */
    public final void mo97739mx(String str) {
        C41536l.m120489i(str, "username");
        C40734b z = this.f99417t.mo94180a(str).mo94890I(C40640a.m117458b()).mo94906z(C40992a.m118827a());
        C41536l.m120488h(z, "updateUsername(username)…dSchedulers.mainThread())");
        mo42540ew(C32381m.m95618g(z, new C42280v(this), new C42281w(this), new C42282x(this)));
    }

    /* renamed from: nx */
    public final void mo97740nx(boolean z) {
        if (!C10146d0.C10159c.m37145e()) {
            C35962r.m107005c(C10146d0.C10159c.m37143b(), C42283y.f99453d);
            if (z) {
                this.f99392D.mo4823o(C41238w.f97225a);
            }
        }
    }

    /* renamed from: px */
    public final void mo97741px() {
        C1644x h = ((C10146d0.C10172e) new C42284z().mo97770b()).mo26717h();
        C41238w wVar = null;
        if (h != null) {
            h.mo4823o((Object) null);
            wVar = C41238w.f97225a;
        }
        if (wVar == null) {
            C10146d0.f28134c.mo26709e();
        }
    }

    /* renamed from: qx */
    public final void mo97742qx(UserContact userContact, C43064a aVar) {
        C40734b z = this.f99410m.mo94634c().mo95088s(new C42243j0(this, userContact)).mo94890I(C40640a.m117458b()).mo94906z(C40992a.m118827a());
        C41536l.m120488h(z, "getUserContactsUseCase()…dSchedulers.mainThread())");
        mo42540ew(C40398b.m116971d(z, new C42257b0(aVar, this), new C42259c0(aVar)));
    }

    /* renamed from: tx */
    public final void mo97743tx(String str) {
        C41536l.m120489i(str, C11755a.C11756a.f34100b);
        if (str.length() == 4) {
            mo97734dx(str);
            this.f99398J = "";
            return;
        }
        this.f99398J = str;
    }

    /* renamed from: ux */
    public final void mo97744ux(C10205l.C10206a aVar) {
        this.f99404P = aVar;
    }

    /* renamed from: vx */
    public final void mo97745vx(String str) {
        C41536l.m120489i(str, "password");
        C40580p2 p2Var = this.f99405h;
        String str2 = this.f99400L;
        if (str2 == null && (str2 = C10146d0.C10159c.m37143b().getUsername()) == null) {
            str2 = "";
        }
        C40762x B = p2Var.mo94597d(str2, str, this.f99397I).mo95072K(C40640a.m117458b()).mo95063B(C40992a.m118827a());
        C41536l.m120488h(B, "passwordLoginAndStoreLog…dSchedulers.mainThread())");
        mo42540ew(C40398b.m116972e(B, new C42261d0(this), new C42263e0(this)));
    }

    /* renamed from: wx */
    public final void mo97746wx() {
        this.f99418u.mo67252l(false);
        this.f99423z.mo4826r(new C35947l.C35951d(C41238w.f97225a));
    }

    /* renamed from: xx */
    public final void mo97747xx(String str, boolean z) {
        C41536l.m120489i(str, "username");
        this.f99399K = z;
        this.f99400L = str;
        C10146d0.C10159c.f28157a.mo26691f(str, true);
        C10146d0.C10159c.m37143b().setSaveUser(Boolean.valueOf(z));
        this.f99391C.mo4823o(C10146d0.C10159c.m37143b().getUserInfo());
        this.f99402N.mo32134f().mo32170i();
        C12043i.m44222h(this.f99402N.mo32134f(), (C42357b) null, (AuthElementType) null, 3, (Object) null);
    }

    /* renamed from: yx */
    public final void mo97748yx(boolean z) {
        boolean z2 = false;
        if (C41536l.m120484d(this.f99422y.mo26726q().mo92939a(), "JUNIOR")) {
            this.f99402N.mo32135g().mo32174f(false);
            return;
        }
        try {
            Gson gson = new Gson();
            String a = this.f99419v.mo94579a("DO_NEW_CLIENT_DO_ALLOWED");
            if (a == null) {
                a = "false";
            }
            Object l = gson.mo18170l(a, Boolean.TYPE);
            C41536l.m120488h(l, "Gson().fromJson(\n       …ss.java\n                )");
            z2 = ((Boolean) l).booleanValue();
        } catch (Exception unused) {
        }
        if (z2) {
            this.f99402N.mo32135g().mo32174f(z);
        } else {
            mo97738lx();
        }
    }

    /* renamed from: zw */
    public final void mo97749zw() {
        C40734b z = this.f99420w.mo94542c().mo94890I(C40640a.m117458b()).mo94906z(C40992a.m118827a());
        C41536l.m120488h(z, "channelActivation().subs…dSchedulers.mainThread())");
        mo42540ew(C40398b.m116971d(z, new C42256b(this), new C42258c(this)));
    }
}
