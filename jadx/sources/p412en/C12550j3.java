package p412en;

import af1.C40303i;
import android.os.Bundle;
import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import b41.C31128a;
import c41.C31270e;
import cf1.C40407d;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.material.datepicker.C5023l;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.DateValidatorPointBackward;
import ed1.C40735b0;
import ed1.C40749p;
import ed1.C40754t;
import ed1.C40762x;
import ee1.C40767b;
import g91.C32300e0;
import g91.C32303f;
import g91.C32306g0;
import g91.C32343x;
import g91.C32359z0;
import h21.C36143a;
import hd0.C24978b;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41224m;
import he1.C41233s;
import he1.C41238w;
import iu0.C36546y;
import j51.C36734f;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import k70.C25679c;
import k70.C25681e;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.properties.C41551a;
import kotlin.properties.C41553c;
import kotlin.properties.C41555e;
import ld0.C25950a;
import m41.C37224b;
import m70.C26148a;
import o21.C37586a;
import o31.C37603j;
import p341ge.bog.mobilebank.cardapplications.data.model.OrderCardParamsObject;
import p341ge.bog.mobilebank.cardapplications.presentation.model.C14235a;
import p341ge.bog.mobilebank.cardapplications.presentation.model.CardApplicationTypeData;
import p341ge.bog.mobilebank.cardapplications.presentation.model.CardFeeUiModel;
import p341ge.bog.mobilebank.cardapplications.presentation.model.DebitCardCurrencyUiModel;
import p341ge.bog.mobilebank.cardapplications.presentation.model.DebitCardNicknameUiModel;
import p341ge.bog.mobilebank.cardapplications.presentation.model.DebitCardPinDeliveryTypeUiModel;
import p341ge.bog.mobilebank.cardapplications.presentation.model.DebitCardReceiveTypeUiModel;
import p341ge.bog.mobilebank.cardapplications.presentation.model.DebitCardRecipientTypeUiModel;
import p341ge.bog.mobilebank.cardapplications.presentation.model.DebitCardRegTypeUiModel;
import p341ge.bog.mobilebank.cardapplications.presentation.model.DebitCardRegisterResultUiModel;
import p341ge.bog.mobilebank.cardapplications.presentation.model.DebitCardUiModel;
import p341ge.bog.mobilebank.cardapplications.presentation.model.FeedbackItem;
import p341ge.bog.mobilebank.cardapplications.presentation.model.OrderCardResult;
import p341ge.bog.mobilebank.cardapplications.presentation.model.OrderDebitCardData;
import p341ge.bog.mobilebank.cardapplications.presentation.model.PackageCommissionUiModel;
import p341ge.bog.mobilebank.cardapplications.presentation.model.RecoverCardUiModel;
import p341ge.bog.mobilebank.cardapplications.presentation.model.RegionUiModel;
import p341ge.bog.mobilebank.cardapplications.presentation.model.ScoolCardOwnerUiModel;
import p341ge.bog.mobilebank.cardapplications.presentation.model.delivery.DebitCardDeliveryCityUiModel;
import p341ge.bog.mobilebank.cardapplications.presentation.model.delivery.DebitCardDeliveryDistrictUiModel;
import p341ge.bog.mobilebank.cardapplications.presentation.model.insurance.DebitCardInsuranceInfoUiModel;
import p341ge.bog.mobilebank.cleanarch.cardinsurance.presentation.model.DebitCardInsuranceTypeUiModel;
import p341ge.bog.mobilebank.cleanarch.junior.presentation.JuniorRequestDataUiModel;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.cleanarch.utm.data.entity.UtmParamsEntity;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.model.usrinfo.UserInfo;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p341ge.bog.mobilebank.rest.model.otpparameter.OtpParams;
import p341ge.bog.mobilebank.shared.cardaccountselector.presentation.model.CardAccountSelectorData;
import p341ge.bog.mobilebank.shared.cards.presentation.scoolcardlimitchooser.model.CardDailyLimitUiModel;
import p341ge.bog.mobilebank.shared.helper.C34646b;
import p341ge.bog.mobilebank.shared.helper.StringSource;
import p355an.C10085c;
import p355an.C10089g;
import p355an.C10092j;
import p355an.C10099q;
import p380ck.C10463g;
import p380ck.C10464h;
import p383cn.C10512a;
import p383cn.C10514b;
import p383cn.C10515c;
import p383cn.C10516d;
import p383cn.C10517e;
import p398dn.C12327b;
import p398dn.C12329c;
import p398dn.C12330d;
import p398dn.C12333e;
import p398dn.C12335f;
import p412en.C12651r2;
import p519mi.C16686a;
import p523mm.C16724a0;
import p523mm.C16744h;
import p523mm.C16753k;
import p523mm.C16777u0;
import p523mm.C16792w0;
import p523mm.C16798z;
import p523mm.C16799z0;
import p537nm.C17075c0;
import p537nm.C17081e0;
import p537nm.C17085g0;
import p537nm.C17099p;
import p537nm.C17100q;
import p537nm.C17103t;
import p537nm.C17109z;
import p551om.C17267c;
import p579qm.C17537a;
import p579qm.C17539c;
import p603si.C17799b;
import p674xm.C18784b;
import p674xm.C18795c;
import p674xm.C18796d;
import p674xm.C18805i;
import p674xm.C18807j;
import p674xm.C18809k;
import p674xm.C18810l;
import p674xm.C18811m;
import p674xm.C18813o;
import p674xm.C18814p;
import p674xm.C18815q;
import p674xm.C18833r;
import p674xm.C18835s;
import p729cv.C19803e;
import p729cv.C19804f;
import p748eu.C20292b;
import p758fu.C20557a;
import p897tp.C28474a;
import pc0.C27494a;
import pf1.C42197d;
import t70.C28323a;
import ue1.C43075l;
import ue1.C43079p;

/* renamed from: en.j3 */
public final class C12550j3 extends C21481a implements C12651r2, C12657s2 {

    /* renamed from: m0 */
    static final /* synthetic */ C40303i[] f37311m0 = {C41520a0.m120439e(new C41539o(C12550j3.class, "orderInput", "getOrderInput()Lge/bog/mobilebank/cardapplications/presentation/model/OrderDebitCardInput;", 0))};
    /* access modifiers changed from: private */

    /* renamed from: A */
    public C14235a f37312A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public C17267c f37313B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public List f37314C = C41341q.m119907j();
    /* access modifiers changed from: private */

    /* renamed from: D */
    public C17100q f37315D = new C17100q((C17099p) null);
    /* access modifiers changed from: private */

    /* renamed from: E */
    public final List f37316E = new ArrayList();

    /* renamed from: F */
    private final C41555e f37317F;

    /* renamed from: G */
    private final C40767b f37318G;

    /* renamed from: H */
    private final C40767b f37319H;

    /* renamed from: I */
    private final C40767b f37320I;

    /* renamed from: J */
    private final C40767b f37321J;

    /* renamed from: K */
    private final C40767b f37322K;

    /* renamed from: L */
    private final C10514b f37323L;

    /* renamed from: M */
    private final C1644x f37324M;

    /* renamed from: N */
    private final C1644x f37325N;

    /* renamed from: O */
    private final C1644x f37326O;

    /* renamed from: P */
    private final C1644x f37327P;
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public final C1644x f37328Q;

    /* renamed from: R */
    private final C1644x f37329R;

    /* renamed from: S */
    private final C1644x f37330S;

    /* renamed from: T */
    private final C1644x f37331T;

    /* renamed from: U */
    private final C1644x f37332U;

    /* renamed from: V */
    private final C1644x f37333V;

    /* renamed from: W */
    private final C1644x f37334W;

    /* renamed from: X */
    private final C1644x f37335X;

    /* renamed from: Y */
    private final C1644x f37336Y;

    /* renamed from: Z */
    private final C1644x f37337Z;

    /* renamed from: a0 */
    private final C1644x f37338a0;

    /* renamed from: b0 */
    private final C1644x f37339b0;

    /* renamed from: c0 */
    private final C1644x f37340c0;

    /* renamed from: d */
    private final C16777u0 f37341d;

    /* renamed from: d0 */
    private final C1644x f37342d0;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C10085c f37343e;

    /* renamed from: e0 */
    private final C1644x f37344e0;

    /* renamed from: f */
    private final C16753k f37345f;

    /* renamed from: f0 */
    private final C1644x f37346f0;

    /* renamed from: g */
    private final C10099q f37347g;

    /* renamed from: g0 */
    private final C1644x f37348g0;

    /* renamed from: h */
    private final C10089g f37349h;

    /* renamed from: h0 */
    private final C1644x f37350h0;

    /* renamed from: i */
    private final C10092j f37351i;
    /* access modifiers changed from: private */

    /* renamed from: i0 */
    public final C1644x f37352i0;

    /* renamed from: j */
    private final C36734f f37353j;
    /* access modifiers changed from: private */

    /* renamed from: j0 */
    public final C1644x f37354j0;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C16744h f37355k;

    /* renamed from: k0 */
    private final C1644x f37356k0;

    /* renamed from: l */
    private final C16798z f37357l;
    /* access modifiers changed from: private */

    /* renamed from: l0 */
    public final C1644x f37358l0;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final C16724a0 f37359m;

    /* renamed from: n */
    private final PreferencesApiManager f37360n;

    /* renamed from: o */
    private final C20292b f37361o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final C16799z0 f37362p;

    /* renamed from: q */
    private final C28474a f37363q;

    /* renamed from: r */
    private final C19804f f37364r;

    /* renamed from: s */
    private final C19803e f37365s;

    /* renamed from: t */
    private final C25681e f37366t;

    /* renamed from: u */
    private final C25679c f37367u;

    /* renamed from: v */
    private final C16792w0 f37368v;

    /* renamed from: w */
    private final C27494a f37369w;

    /* renamed from: x */
    private final OrderDebitCardData f37370x;

    /* renamed from: y */
    private final C12651r2 f37371y = this;

    /* renamed from: z */
    private final C12657s2 f37372z = this;

    /* renamed from: en.j3$a */
    static final class C12551a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C12550j3 f37373d;

        /* renamed from: e */
        final /* synthetic */ Client f37374e;

        /* renamed from: en.j3$a$a */
        static final class C12552a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C12550j3 f37375d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C12552a(C12550j3 j3Var) {
                super(1);
                this.f37375d = j3Var;
            }

            /* renamed from: a */
            public final void mo33242a(C14235a aVar) {
                List list;
                String h;
                C26148a c = this.f37375d.m47723qx().mo46763d().mo46669a();
                if (c == null || (h = c.mo65094h()) == null || (list = C41339p.m119900e(new DebitCardCurrencyUiModel(h, 0))) == null) {
                    list = aVar.mo39885f();
                }
                this.f37375d.f37328Q.mo4823o(list);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo33242a((C14235a) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12551a(C12550j3 j3Var, Client client) {
            super(1);
            this.f37373d = j3Var;
            this.f37374e = client;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final void m47803c(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40754t invoke(Integer num) {
            C41536l.m120489i(num, "rc");
            C40762x m = this.f37373d.m47733wx(this.f37374e).mo95084m(new C12545i3(new C12552a(this.f37373d)));
            C41536l.m120488h(m, "class ViewModel @Assiste…eBase64)\n        }\n\n    }");
            return C31270e.m92880i(m, num.intValue());
        }
    }

    /* renamed from: en.j3$b */
    /* synthetic */ class C12553b extends C41535k implements C43075l {

        /* renamed from: d */
        public static final C12553b f37376d = new C12553b();

        C12553b() {
            super(1, C17100q.class, "<init>", "<init>(Lge/bog/mobilebank/cardapplications/domain/model/DebitCardCommission;)V", 0);
        }

        /* renamed from: b */
        public final C17100q invoke(C17099p pVar) {
            return new C17100q(pVar);
        }
    }

    /* renamed from: en.j3$c */
    /* synthetic */ class C12554c extends C41535k implements C43075l {

        /* renamed from: d */
        public static final C12554c f37377d = new C12554c();

        C12554c() {
            super(1, C17100q.class, "<init>", "<init>(Lge/bog/mobilebank/cardapplications/domain/model/DebitCardCommission;)V", 0);
        }

        /* renamed from: b */
        public final C17100q invoke(C17099p pVar) {
            return new C17100q(pVar);
        }
    }

    /* renamed from: en.j3$d */
    static final class C12555d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C12550j3 f37378d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12555d(C12550j3 j3Var) {
            super(1);
            this.f37378d = j3Var;
        }

        /* renamed from: a */
        public final void mo33245a(C17100q qVar) {
            C12550j3 j3Var = this.f37378d;
            C41536l.m120488h(qVar, "it");
            j3Var.f37315D = qVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo33245a((C17100q) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: en.j3$e */
    static final class C12556e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C12550j3 f37379d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12556e(C12550j3 j3Var) {
            super(1);
            this.f37379d = j3Var;
        }

        /* renamed from: a */
        public final C14235a invoke(C17539c cVar) {
            C41536l.m120489i(cVar, "it");
            return this.f37379d.f37343e.mo26544a(cVar, this.f37379d.mo33210fx());
        }
    }

    /* renamed from: en.j3$f */
    static final class C12557f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C12550j3 f37380d;

        /* renamed from: en.j3$f$a */
        static final class C12558a extends C41537m implements C43079p {

            /* renamed from: d */
            public static final C12558a f37381d = new C12558a();

            C12558a() {
                super(2);
            }

            /* renamed from: a */
            public final C41224m invoke(C17103t tVar, C14235a aVar) {
                C41536l.m120489i(tVar, "fee");
                C41536l.m120489i(aVar, "resources");
                return C41233s.m119492a(tVar, aVar);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12557f(C12550j3 j3Var) {
            super(1);
            this.f37380d = j3Var;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final C41224m m47811c(C43079p pVar, Object obj, Object obj2) {
            C41536l.m120489i(pVar, "$tmp0");
            return (C41224m) pVar.invoke(obj, obj2);
        }

        /* renamed from: b */
        public final C40735b0 invoke(C14235a aVar) {
            RecoverCardUiModel i;
            C41536l.m120489i(aVar, "it");
            C12550j3 j3Var = this.f37380d;
            String product = aVar.mo39882d().getProduct();
            CardApplicationTypeData.RecoverCardOrderData a = this.f37380d.mo33210fx().mo39780a().mo39286a();
            boolean z = false;
            if (!(a == null || (i = a.mo39308i()) == null || !i.mo39825m())) {
                z = true;
            }
            return C40762x.m118154T(C12550j3.m47699dx(j3Var, product, (C17085g0) null, z, 2, (Object) null), C40762x.m118162z(aVar), new C12581k3(C12558a.f37381d));
        }
    }

    /* renamed from: en.j3$g */
    static final class C12559g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C12550j3 f37382d;

        /* renamed from: e */
        final /* synthetic */ Client f37383e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12559g(C12550j3 j3Var, Client client) {
            super(1);
            this.f37382d = j3Var;
            this.f37383e = client;
        }

        /* renamed from: a */
        public final C14235a invoke(C41224m mVar) {
            C41536l.m120489i(mVar, "<name for destructuring parameter 0>");
            C14235a aVar = (C14235a) mVar.mo95676b();
            C12550j3 j3Var = this.f37382d;
            List xw = j3Var.m47696bx(aVar.mo39894n(), aVar.mo39886g().mo39786f());
            List ww = this.f37382d.m47695ax(aVar.mo39895o(), aVar.mo39882d().getCsFlag());
            C12327b bVar = C12327b.f36972a;
            UserInfo client = this.f37383e.getUserInfo().getClient();
            C41536l.m120488h(client, "client.userInfo.client");
            String e = bVar.mo32914e(client);
            UserInfo client2 = this.f37383e.getUserInfo().getClient();
            C41536l.m120488h(client2, "client.userInfo.client");
            String f = bVar.mo32915f(client2);
            C41536l.m120488h(aVar, "resources");
            String str = "resources";
            j3Var.f37312A = C14235a.m52709b(aVar, (List) null, (List) null, (List) null, (List) null, xw, (DebitCardNicknameUiModel) null, (List) null, (List) null, (List) null, ww, (List) null, (List) null, (List) null, (DebitCardInsuranceInfoUiModel) null, (DebitCardUiModel) null, (C17103t) mVar.mo95675a(), (List) null, (OrderDebitCardData) null, e, f, (List) null, 1277423, (Object) null);
            this.f37382d.m47694Zw(this.f37383e);
            C1644x Hw = this.f37382d.f37354j0;
            C18833r Ew = this.f37382d.m47723qx();
            Hw.mo4823o(new C18835s(Ew.mo46771j().mo46708d(), Ew.mo46767g().mo46708d(), Ew.mo46777p().mo46708d(), Ew.mo46778q().mo46708d(), Ew.mo46779r().mo46708d()));
            C14235a Fw = this.f37382d.f37312A;
            if (Fw != null) {
                return Fw;
            }
            C41536l.m120506z(str);
            return null;
        }
    }

    /* renamed from: en.j3$h */
    /* synthetic */ class C12560h extends C41535k implements C43075l {
        C12560h(Object obj) {
            super(1, obj, C10092j.class, "transform", "transformCardLimits(Ljava/util/List;)Ljava/util/List;", 0);
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "p0");
            return ((C10092j) this.receiver).mo26565k(list);
        }
    }

    /* renamed from: en.j3$i */
    public static final class C12561i extends C41553c {

        /* renamed from: a */
        final /* synthetic */ C12550j3 f37384a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12561i(Object obj, C12550j3 j3Var) {
            super(obj);
            this.f37384a = j3Var;
        }

        /* access modifiers changed from: protected */
        public void afterChange(C40303i iVar, Object obj, Object obj2) {
            C41536l.m120489i(iVar, "property");
            C18833r rVar = (C18833r) obj;
            this.f37384a.m47651Bx((C18833r) obj2);
        }
    }

    /* renamed from: en.j3$j */
    static final class C12562j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C12550j3 f37385d;

        /* renamed from: en.j3$j$a */
        static final class C12563a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C12550j3 f37386d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C12563a(C12550j3 j3Var) {
                super(1);
                this.f37386d = j3Var;
            }

            /* renamed from: a */
            public final void mo33252a(C17267c cVar) {
                this.f37386d.f37313B = cVar;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo33252a((C17267c) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: en.j3$j$b */
        static final class C12564b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C12550j3 f37387d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C12564b(C12550j3 j3Var) {
                super(1);
                this.f37387d = j3Var;
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: ge.bog.mobilebank.cardapplications.presentation.model.DebitCardReceiveTypeUiModel} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: ge.bog.mobilebank.cardapplications.presentation.model.DebitCardReceiveTypeUiModel} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: ge.bog.mobilebank.cardapplications.presentation.model.DebitCardReceiveTypeUiModel} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: ge.bog.mobilebank.cardapplications.presentation.model.DebitCardReceiveTypeUiModel} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.String invoke(p551om.C17267c r7) {
                /*
                    r6 = this;
                    java.lang.String r0 = "fee"
                    kotlin.jvm.internal.C41536l.m120489i(r7, r0)
                    en.j3 r0 = r6.f37387d
                    ge.bog.mobilebank.cardapplications.presentation.model.a r0 = r0.f37312A
                    r1 = 0
                    if (r0 != 0) goto L_0x0014
                    java.lang.String r0 = "resources"
                    kotlin.jvm.internal.C41536l.m120506z(r0)
                    r0 = r1
                L_0x0014:
                    java.util.List r0 = r0.mo39895o()
                    java.util.Iterator r0 = r0.iterator()
                L_0x001c:
                    boolean r2 = r0.hasNext()
                    r3 = 0
                    if (r2 == 0) goto L_0x0038
                    java.lang.Object r2 = r0.next()
                    r4 = r2
                    ge.bog.mobilebank.cardapplications.presentation.model.DebitCardReceiveTypeUiModel r4 = (p341ge.bog.mobilebank.cardapplications.presentation.model.DebitCardReceiveTypeUiModel) r4
                    xm.i r4 = r4.mo39572a()
                    xm.i r5 = p674xm.C18805i.HOME
                    if (r4 != r5) goto L_0x0034
                    r4 = 1
                    goto L_0x0035
                L_0x0034:
                    r4 = r3
                L_0x0035:
                    if (r4 == 0) goto L_0x001c
                    r1 = r2
                L_0x0038:
                    ge.bog.mobilebank.cardapplications.presentation.model.DebitCardReceiveTypeUiModel r1 = (p341ge.bog.mobilebank.cardapplications.presentation.model.DebitCardReceiveTypeUiModel) r1
                    if (r1 == 0) goto L_0x0043
                    java.lang.String r0 = r1.mo39573b()
                    if (r0 == 0) goto L_0x0043
                    goto L_0x0045
                L_0x0043:
                    java.lang.String r0 = "text.card.applications.receive.type.home"
                L_0x0045:
                    java.lang.Object[] r1 = new java.lang.Object[r3]
                    java.lang.String r0 = g91.C32343x.m95388F(r0, r1)
                    double r1 = r7.mo44665a()
                    java.lang.String r7 = r7.mo44666b()
                    java.lang.String r7 = g91.C32303f.m95200k(r1, r7)
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    r1.append(r0)
                    java.lang.String r0 = " - "
                    r1.append(r0)
                    r1.append(r7)
                    java.lang.String r7 = r1.toString()
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: p412en.C12550j3.C12562j.C12564b.invoke(om.c):java.lang.String");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12562j(C12550j3 j3Var) {
            super(1);
            this.f37385d = j3Var;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public static final void m47817d(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public static final String m47818e(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (String) lVar.invoke(obj);
        }

        /* renamed from: c */
        public final C40754t invoke(C17085g0 g0Var) {
            C41536l.m120489i(g0Var, "it");
            C16744h Bw = this.f37385d.f37355k;
            C14235a Fw = this.f37385d.f37312A;
            C14235a aVar = null;
            if (Fw == null) {
                C41536l.m120506z("resources");
                Fw = null;
            }
            String plcClass = Fw.mo39882d().getPlcClass();
            C14235a Fw2 = this.f37385d.f37312A;
            if (Fw2 == null) {
                C41536l.m120506z("resources");
            } else {
                aVar = Fw2;
            }
            C40762x A = Bw.mo43871a(plcClass, aVar.mo39882d().getPlcType(), g0Var).mo95084m(new C12586l3(new C12563a(this.f37385d))).mo95062A(new C12591m3(new C12564b(this.f37385d)));
            C41536l.m120488h(A, "private fun subscribeToC…ndToLifecycle()\n        }");
            return C31270e.m92880i(A, -1);
        }
    }

    /* renamed from: en.j3$k */
    static final class C12565k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C12550j3 f37388d;

        /* renamed from: en.j3$k$a */
        /* synthetic */ class C12566a extends C41535k implements C43079p {
            C12566a(Object obj) {
                super(2, obj, C12550j3.class, "combineFees", "combineFees(Lge/bog/mobilebank/cardapplications/domain/model/DebitCardFeeWrapper;Lge/bog/mobilebank/cardapplications/domain/model/DebitCardCommissionWrapper;)Ljava/util/List;", 0);
            }

            /* renamed from: b */
            public final List invoke(C17103t tVar, C17100q qVar) {
                C41536l.m120489i(tVar, "p0");
                C41536l.m120489i(qVar, "p1");
                return ((C12550j3) this.receiver).m47691Ww(tVar, qVar);
            }
        }

        /* renamed from: en.j3$k$b */
        static final class C12567b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C12550j3 f37389d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C12567b(C12550j3 j3Var) {
                super(1);
                this.f37389d = j3Var;
            }

            /* renamed from: a */
            public final void mo33256a(C41205b bVar) {
                this.f37389d.m47687Tw(true);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo33256a((C41205b) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: en.j3$k$c */
        static final class C12568c extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C12550j3 f37390d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C12568c(C12550j3 j3Var) {
                super(1);
                this.f37390d = j3Var;
            }

            /* renamed from: a */
            public final void mo33257a(List list) {
                C12550j3 j3Var = this.f37390d;
                C41536l.m120488h(list, "it");
                j3Var.f37314C = list;
                C12550j3.m47689Uw(this.f37390d, false, 1, (Object) null);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo33257a((List) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12565k(C12550j3 j3Var) {
            super(1);
            this.f37388d = j3Var;
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public static final List m47825e(C43079p pVar, Object obj, Object obj2) {
            C41536l.m120489i(pVar, "$tmp0");
            return (List) pVar.invoke(obj, obj2);
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public static final void m47826f(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        /* renamed from: g */
        public static final void m47827g(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        /* renamed from: d */
        public final C40754t invoke(C41238w wVar) {
            C17085g0 g0Var;
            RecoverCardUiModel i;
            C41536l.m120489i(wVar, "it");
            DebitCardRegTypeUiModel e = this.f37388d.m47723qx().mo46764e().mo46669a();
            if (e == null || (g0Var = e.mo39595b()) == null) {
                g0Var = C17085g0.NEW_ACCOUNT;
            }
            C12550j3 j3Var = this.f37388d;
            CardApplicationTypeData.RecoverCardOrderData a = j3Var.mo33210fx().mo39780a().mo39286a();
            boolean z = false;
            if (!(a == null || (i = a.mo39308i()) == null || !i.mo39825m())) {
                z = true;
            }
            C40762x m = C40762x.m118154T(C12550j3.m47699dx(j3Var, (String) null, g0Var, z, 1, (Object) null), this.f37388d.m47708ix(g0Var), new C12596n3(new C12566a(this.f37388d))).mo95083l(new C12601o3(new C12567b(this.f37388d))).mo95084m(new C12609p3(new C12568c(this.f37388d)));
            C41536l.m120488h(m, "private fun subscribeToC…ndToLifecycle()\n        }");
            return C31270e.m92880i(m, -1);
        }
    }

    /* renamed from: en.j3$l */
    static final class C12569l extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C12550j3 f37391d;

        /* renamed from: en.j3$l$a */
        /* synthetic */ class C12570a extends C41535k implements C43075l {
            C12570a(Object obj) {
                super(1, obj, C12550j3.class, "onDebitCardOrderResult", "onDebitCardOrderResult(Lge/bog/mobilebank/cardapplications/domain/model/DebitCardRegisterResult;)V", 0);
            }

            /* renamed from: b */
            public final void mo33259b(C17109z zVar) {
                C41536l.m120489i(zVar, "p0");
                ((C12550j3) this.receiver).m47649Ax(zVar);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo33259b((C17109z) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: en.j3$l$b */
        /* synthetic */ class C12571b extends C41535k implements C43075l {

            /* renamed from: d */
            public static final C12571b f37392d = new C12571b();

            C12571b() {
                super(1, C18809k.class, "toUiModel", "toUiModel(Lge/bog/mobilebank/cardapplications/domain/model/DebitCardRegisterResult;)Lge/bog/mobilebank/cardapplications/presentation/model/DebitCardRegisterResultUiModel;", 1);
            }

            /* renamed from: b */
            public final DebitCardRegisterResultUiModel invoke(C17109z zVar) {
                C41536l.m120489i(zVar, "p0");
                return C18809k.m63590a(zVar);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12569l(C12550j3 j3Var) {
            super(1);
            this.f37391d = j3Var;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public static final void m47834d(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public static final DebitCardRegisterResultUiModel m47835e(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (DebitCardRegisterResultUiModel) lVar.invoke(obj);
        }

        /* renamed from: c */
        public final C40754t invoke(OrderCardParamsObject orderCardParamsObject) {
            C41536l.m120489i(orderCardParamsObject, "it");
            C40762x A = this.f37391d.f37362p.mo43919a(this.f37391d.mo33228rx(orderCardParamsObject)).mo95084m(new C12614q3(new C12570a(this.f37391d))).mo95062A(new C12653r3(C12571b.f37392d));
            C41536l.m120488h(A, "orderDebitCard(getOtpPar…egisterResult::toUiModel)");
            return C31270e.m92880i(A, -1);
        }
    }

    /* renamed from: en.j3$m */
    static final class C12572m extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C12550j3 f37393d;

        /* renamed from: en.j3$m$a */
        static final class C12573a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C12550j3 f37394d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C12573a(C12550j3 j3Var) {
                super(1);
                this.f37394d = j3Var;
            }

            /* renamed from: a */
            public final void mo33262a(C41205b bVar) {
                this.f37394d.m47687Tw(true);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo33262a((C41205b) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: en.j3$m$b */
        static final class C12574b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C12550j3 f37395d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C12574b(C12550j3 j3Var) {
                super(1);
                this.f37395d = j3Var;
            }

            /* renamed from: a */
            public final void mo33263a(C25950a aVar) {
                C1644x Jw = this.f37395d.f37352i0;
                C41536l.m120488h(aVar, "contract");
                C37224b.m109965d(Jw, aVar);
                C12550j3.m47689Uw(this.f37395d, false, 1, (Object) null);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo33263a((C25950a) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12572m(C12550j3 j3Var) {
            super(1);
            this.f37393d = j3Var;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public static final void m47841d(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public static final void m47842e(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        /* renamed from: c */
        public final C40754t invoke(HashMap hashMap) {
            C41536l.m120489i(hashMap, "it");
            C40762x m = this.f37393d.f37359m.mo43855a(hashMap).mo95083l(new C12658s3(new C12573a(this.f37393d))).mo95084m(new C12663t3(new C12574b(this.f37393d)));
            C41536l.m120488h(m, "private fun subscribeToP…ndToLifecycle()\n        }");
            return C31270e.m92880i(m, -1);
        }
    }

    /* renamed from: en.j3$n */
    static final class C12575n extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C12550j3 f37396d;

        /* renamed from: en.j3$n$a */
        static final class C12576a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C12550j3 f37397d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C12576a(C12550j3 j3Var) {
                super(1);
                this.f37397d = j3Var;
            }

            /* renamed from: a */
            public final void mo33265a(List list) {
                String str;
                List yw = this.f37397d.f37316E;
                C41536l.m120488h(list, "it");
                C37603j.m110579b(yw, list);
                C1644x Iw = this.f37397d.f37358l0;
                CardDailyLimitUiModel e = this.f37397d.m47723qx().mo46762c().mo46669a();
                if (e != null) {
                    str = e.mo84222a();
                } else {
                    str = null;
                }
                C37224b.m109965d(Iw, new C18795c(list, str));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo33265a((List) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12575n(C12550j3 j3Var) {
            super(1);
            this.f37396d = j3Var;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final void m47847c(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40754t invoke(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            C40762x m = this.f37396d.m47657Ex().mo95084m(new C12668u3(new C12576a(this.f37396d)));
            C41536l.m120488h(m, "private fun subscribeToS…ndToLifecycle()\n        }");
            return C31270e.m92880i(m, -1);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12550j3(C16777u0 u0Var, C10085c cVar, C16753k kVar, C10099q qVar, C10089g gVar, C10092j jVar, C36734f fVar, C16744h hVar, C16798z zVar, C16724a0 a0Var, PreferencesApiManager preferencesApiManager, C20292b bVar, C16799z0 z0Var, C28474a aVar, C19804f fVar2, C19803e eVar, C25681e eVar2, C25679c cVar2, C16792w0 w0Var, C27494a aVar2, Client client, OrderDebitCardData orderDebitCardData) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C16777u0 u0Var2 = u0Var;
        C10085c cVar3 = cVar;
        C16753k kVar2 = kVar;
        C10099q qVar2 = qVar;
        C10089g gVar2 = gVar;
        C10092j jVar2 = jVar;
        C36734f fVar3 = fVar;
        C16744h hVar2 = hVar;
        C16798z zVar2 = zVar;
        C16724a0 a0Var2 = a0Var;
        PreferencesApiManager preferencesApiManager2 = preferencesApiManager;
        C20292b bVar2 = bVar;
        C16799z0 z0Var2 = z0Var;
        C19803e eVar3 = eVar;
        C41536l.m120489i(u0Var2, "getOrderCardResources");
        C41536l.m120489i(cVar3, "debitCardApplicationResourcesMapper");
        C41536l.m120489i(kVar2, "getDebitCardFee");
        C41536l.m120489i(qVar2, "debitCardServiceCenterSelectorMapper");
        C41536l.m120489i(gVar2, "deliveryMapper");
        C41536l.m120489i(jVar2, "debitCardMapper");
        C41536l.m120489i(fVar3, "getClientPhones");
        C41536l.m120489i(hVar2, "getCardDeliveryFee");
        C41536l.m120489i(zVar2, "getDigitalCardCommission");
        C41536l.m120489i(a0Var2, "getCardPreContract");
        C41536l.m120489i(preferencesApiManager2, "preferencesApiManager");
        C41536l.m120489i(bVar2, "getAppSettingByName");
        C41536l.m120489i(z0Var2, "orderDebitCard");
        C41536l.m120489i(aVar, "applicationEventPoster");
        C41536l.m120489i(fVar2, "refreshProductTypeList");
        C41536l.m120489i(eVar, "refreshAssetLiability");
        C41536l.m120489i(eVar2, "updateCards");
        C41536l.m120489i(cVar2, "refreshAllProducts");
        C41536l.m120489i(w0Var, "getSchoolCardLimitTypes");
        C41536l.m120489i(aVar2, "otpParamsMapBuilder");
        C41536l.m120489i(client, "client");
        C41536l.m120489i(orderDebitCardData, "data");
        this.f37341d = u0Var2;
        this.f37343e = cVar3;
        this.f37345f = kVar2;
        this.f37347g = qVar2;
        this.f37349h = gVar2;
        this.f37351i = jVar2;
        this.f37353j = fVar3;
        this.f37355k = hVar2;
        this.f37357l = zVar2;
        this.f37359m = a0Var2;
        this.f37360n = preferencesApiManager2;
        this.f37361o = bVar2;
        this.f37362p = z0Var2;
        this.f37363q = aVar;
        this.f37364r = fVar2;
        this.f37365s = eVar;
        this.f37366t = eVar2;
        this.f37367u = cVar2;
        this.f37368v = w0Var;
        this.f37369w = aVar2;
        this.f37370x = orderDebitCardData;
        C41551a aVar3 = C41551a.f97718a;
        this.f37317F = new C12561i(new C18833r((C18815q.C18832q) null, (C18815q.C18819d) null, (C18815q.C18818c) null, (C18815q.C18828m) null, (C18815q.C18820e) null, (C18815q.C18826k) null, (C18815q.C18831p) null, (C18815q.C18827l) null, (C18815q.C18829n) null, (C18815q.C18822g) null, (C18815q.C18832q) null, (C18815q.C18832q) null, (C18815q.C18832q) null, (C18815q.C18832q) null, (C18815q.C18832q) null, (C18815q.C18825j) null, (C18815q.C18824i) null, (C18815q.C18816a) null, (C18815q.C18830o) null, (C18815q.C18817b) null, 1048575, (DefaultConstructorMarker) null), this);
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<RegType>()");
        this.f37318G = h1;
        C40767b h12 = C40767b.m118210h1();
        C41536l.m120488h(h12, "create<Unit>()");
        this.f37319H = h12;
        C40767b h13 = C40767b.m118210h1();
        C41536l.m120488h(h13, "create<HashMap<String, Any>>()");
        this.f37320I = h13;
        C40767b h14 = C40767b.m118210h1();
        C41536l.m120488h(h14, "create<OrderCardParamsObject>()");
        this.f37321J = h14;
        C40767b h15 = C40767b.m118210h1();
        C41536l.m120488h(h15, "create<Unit>()");
        this.f37322K = h15;
        C10514b aVar4 = orderDebitCardData.mo39786f() ? new C10512a() : new C10517e();
        this.f37323L = aVar4;
        C1644x xVar = new C1644x();
        this.f37324M = xVar;
        this.f37325N = new C1644x();
        this.f37326O = new C1644x();
        this.f37327P = new C1644x();
        this.f37328Q = new C1644x();
        this.f37329R = new C1644x();
        this.f37330S = new C1644x();
        this.f37331T = new C1644x();
        this.f37332U = new C1644x(aVar4.mo27230a());
        this.f37333V = new C1644x();
        this.f37334W = new C1644x();
        this.f37335X = new C1644x();
        this.f37336Y = new C1644x();
        this.f37337Z = new C1644x();
        this.f37338a0 = new C1644x(new C18813o(C18814p.DISABLED, C32343x.m95388F("text.card.applications.button.next", new Object[0]), false, 4, (DefaultConstructorMarker) null));
        this.f37339b0 = new C1644x();
        this.f37340c0 = new C1644x();
        this.f37342d0 = new C1644x();
        this.f37344e0 = new C1644x();
        this.f37346f0 = new C1644x();
        this.f37348g0 = new C1644x();
        this.f37350h0 = new C1644x();
        this.f37352i0 = new C1644x();
        this.f37354j0 = new C1644x();
        this.f37356k0 = new C1644x();
        this.f37358l0 = new C1644x();
        m47688Tx();
        C40749p Q = C40749p.m118047l0(onInit(), onRefresh()).mo94998Q(new C12708y2(new C12551a(this, client)));
        C41536l.m120488h(Q, "merge(onInit(), onRefres…ervable(rc)\n            }");
        bindToLifecycle(C31270e.m92876e(Q, xVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: Ax */
    public final void m47649Ax(C17109z zVar) {
        long j;
        CardApplicationTypeData.SchoolCardOrderData schoolCardOrderData;
        JuniorRequestDataUiModel j2;
        m47663Hx();
        m47655Dx();
        C14235a aVar = this.f37312A;
        Long l = null;
        if (aVar == null) {
            C41536l.m120506z("resources");
            aVar = null;
        }
        m47731vx(new C18784b.C18791g(aVar.mo39882d().getSubProductCode(), this.f37370x.mo39786f()));
        C1644x xVar = this.f37336Y;
        C12329c cVar = C12329c.f36974a;
        C14235a aVar2 = this.f37312A;
        if (aVar2 == null) {
            C41536l.m120506z("resources");
            aVar2 = null;
        }
        List a = cVar.mo32918a(aVar2, m47723qx());
        C14235a aVar3 = this.f37312A;
        if (aVar3 == null) {
            C41536l.m120506z("resources");
            aVar3 = null;
        }
        List c = cVar.mo32920c(aVar3, m47723qx());
        C14235a aVar4 = this.f37312A;
        if (aVar4 == null) {
            C41536l.m120506z("resources");
            aVar4 = null;
        }
        boolean f = aVar4.mo39886g().mo39786f();
        Long a2 = zVar.mo44521a();
        if (a2 != null) {
            j = a2.longValue();
        } else {
            j = -1;
        }
        boolean e = m47723qx().mo46773l().mo46728e();
        FeedbackItem ex = m47701ex(zVar);
        CardApplicationTypeData a3 = this.f37370x.mo39780a();
        if (a3 instanceof CardApplicationTypeData.SchoolCardOrderData) {
            schoolCardOrderData = (CardApplicationTypeData.SchoolCardOrderData) a3;
        } else {
            schoolCardOrderData = null;
        }
        if (!(schoolCardOrderData == null || (j2 = schoolCardOrderData.mo39319j()) == null)) {
            l = j2.mo52347h();
        }
        C37224b.m109965d(xVar, new OrderCardResult(a, c, f, j, e, ex, (FeedbackItem) null, l, (StringSource) null, 320, (DefaultConstructorMarker) null));
    }

    /* access modifiers changed from: private */
    /* renamed from: Bx */
    public final void m47651Bx(C18833r rVar) {
        this.f37325N.mo4823o(rVar);
        C10514b bVar = this.f37323L;
        C12333e eVar = C12333e.f36978a;
        C10515c c = bVar.mo27230a().mo27239c();
        C14235a aVar = this.f37312A;
        if (aVar == null) {
            C41536l.m120506z("resources");
            aVar = null;
        }
        bVar.mo27234g(eVar.mo32936a(rVar, c, aVar));
        this.f37332U.mo4823o(this.f37323L.mo27230a());
        m47689Uw(this, false, 1, (Object) null);
    }

    /* renamed from: Cx */
    private final void m47653Cx() {
        CardApplicationTypeData.SchoolCardOrderData schoolCardOrderData;
        C14235a aVar = this.f37312A;
        JuniorRequestDataUiModel juniorRequestDataUiModel = null;
        if (aVar == null) {
            C41536l.m120506z("resources");
            aVar = null;
        }
        m47731vx(new C18784b.C18789e(aVar.mo39882d().getSubProductCode(), this.f37370x.mo39786f()));
        if (!this.f37370x.mo39786f() && !m47723qx().mo46773l().mo46728e()) {
            CardApplicationTypeData a = this.f37370x.mo39780a();
            if (a instanceof CardApplicationTypeData.SchoolCardOrderData) {
                schoolCardOrderData = (CardApplicationTypeData.SchoolCardOrderData) a;
            } else {
                schoolCardOrderData = null;
            }
            if (schoolCardOrderData != null) {
                juniorRequestDataUiModel = schoolCardOrderData.mo39319j();
            }
            if (juniorRequestDataUiModel == null) {
                C12651r2.C12652a.m48081a(this, (String) null, (String) null, (String) null, 7, (Object) null);
                return;
            }
        }
        m47672Mn();
    }

    /* renamed from: Dx */
    private final void m47655Dx() {
        this.f37364r.mo48092a();
        this.f37365s.mo48091a();
        this.f37366t.invoke();
        this.f37363q.mo68096b();
        this.f37367u.mo64183a();
    }

    /* access modifiers changed from: private */
    /* renamed from: Ex */
    public final C40762x m47657Ex() {
        if (this.f37316E.isEmpty()) {
            C40762x A = this.f37368v.mo43913a().mo95062A(new C12534g3(new C12560h(this.f37351i)));
            C41536l.m120488h(A, "getSchoolCardLimitTypes(…bitCardMapper::transform)");
            return A;
        }
        C40762x z = C40762x.m118162z(this.f37316E);
        C41536l.m120488h(z, "just(cardLimits)");
        return z;
    }

    /* access modifiers changed from: private */
    /* renamed from: Fx */
    public static final List m47659Fx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* renamed from: Gx */
    private static final C41224m m47661Gx(C12550j3 j3Var, long j) {
        C14235a aVar = j3Var.f37312A;
        if (aVar == null) {
            C41536l.m120506z("resources");
            aVar = null;
        }
        for (DebitCardDeliveryCityUiModel debitCardDeliveryCityUiModel : aVar.mo39887h()) {
            Iterator it = debitCardDeliveryCityUiModel.mo39901b().iterator();
            while (true) {
                if (it.hasNext()) {
                    DebitCardDeliveryDistrictUiModel debitCardDeliveryDistrictUiModel = (DebitCardDeliveryDistrictUiModel) it.next();
                    if (debitCardDeliveryDistrictUiModel.mo39914d() == j) {
                        return C41233s.m119492a(debitCardDeliveryCityUiModel, debitCardDeliveryDistrictUiModel);
                    }
                }
            }
        }
        return C41233s.m119492a((Object) null, (Object) null);
    }

    /* renamed from: Hx */
    private final void m47663Hx() {
        C10463g F = C36546y.m108282F();
        C14235a aVar = this.f37312A;
        C14235a aVar2 = null;
        if (aVar == null) {
            C41536l.m120506z("resources");
            aVar = null;
        }
        F.mo27152s("applications", aVar.mo39882d().getSubProductCode(), "order_debit_card");
        C14235a aVar3 = this.f37312A;
        if (aVar3 == null) {
            C41536l.m120506z("resources");
        } else {
            aVar2 = aVar3;
        }
        C32306g0.m95221b("debit_card_ordered", aVar2.mo39882d().getSubProductCode());
    }

    /* renamed from: Ix */
    private final void m47665Ix(C18833r rVar) {
        this.f37317F.setValue(this, f37311m0[0], rVar);
    }

    /* renamed from: Jx */
    private final void m47667Jx() {
        C40749p L0 = this.f37318G.mo94989L0(new C12501b3(new C12562j(this)));
        C41536l.m120488h(L0, "private fun subscribeToC…ndToLifecycle()\n        }");
        bindToLifecycle(C31270e.m92876e(L0, this.f37346f0));
    }

    /* access modifiers changed from: private */
    /* renamed from: Kx */
    public static final C40754t m47669Kx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: Lx */
    private final void m47671Lx() {
        C40749p L0 = this.f37319H.mo94989L0(new C12506c3(new C12565k(this)));
        C41536l.m120488h(L0, "private fun subscribeToC…ndToLifecycle()\n        }");
        bindToLifecycle(C31270e.m92876e(L0, this.f37348g0));
    }

    /* renamed from: Mn */
    private final void m47672Mn() {
        C12330d dVar = C12330d.f36975a;
        C18833r qx = m47723qx();
        C14235a aVar = this.f37312A;
        if (aVar == null) {
            C41536l.m120506z("resources");
            aVar = null;
        }
        this.f37320I.onNext(mo33228rx(dVar.mo32924c(qx, aVar, this.f37315D.mo44470a(), this.f37313B)));
    }

    /* access modifiers changed from: private */
    /* renamed from: Mx */
    public static final C40754t m47674Mx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: Nx */
    private final void m47676Nx() {
        C40749p L0 = this.f37321J.mo94989L0(new C12662t2(new C12569l(this)));
        C41536l.m120488h(L0, "private fun subscribeToO…ndToLifecycle()\n        }");
        bindToLifecycle(C31270e.m92876e(L0, this.f37335X));
    }

    /* access modifiers changed from: private */
    /* renamed from: Ox */
    public static final C40754t m47678Ox(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: Px */
    private final void m47680Px() {
        C40749p L0 = this.f37320I.mo94989L0(new C12495a3(new C12572m(this)));
        C41536l.m120488h(L0, "private fun subscribeToP…ndToLifecycle()\n        }");
        bindToLifecycle(C31270e.m92876e(L0, this.f37350h0));
    }

    /* access modifiers changed from: private */
    /* renamed from: Qx */
    public static final C40754t m47682Qx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: Rx */
    private final void m47684Rx() {
        C40749p L0 = this.f37322K.mo94989L0(new C12713z2(new C12575n(this)));
        C41536l.m120488h(L0, "private fun subscribeToS…ndToLifecycle()\n        }");
        bindToLifecycle(C31270e.m92876e(L0, this.f37356k0));
    }

    /* renamed from: Sw */
    private final C18833r m47685Sw(C18833r rVar, C14235a aVar) {
        CardApplicationTypeData.PayRollCardOrderData payRollCardOrderData;
        Long l;
        Object obj;
        Object obj2;
        C18815q.C18819d dVar;
        C18815q.C18818c cVar;
        Object obj3;
        boolean z;
        Object obj4;
        boolean z2;
        Object obj5;
        boolean z3;
        Object obj6;
        boolean z4;
        boolean z5;
        RecoverCardUiModel i;
        boolean z6;
        CardApplicationTypeData a = aVar.mo39886g().mo39780a();
        if (a instanceof CardApplicationTypeData.PayRollCardOrderData) {
            payRollCardOrderData = (CardApplicationTypeData.PayRollCardOrderData) a;
        } else {
            payRollCardOrderData = null;
        }
        if (payRollCardOrderData != null) {
            l = payRollCardOrderData.mo39296i();
        } else {
            l = null;
        }
        Iterator it = aVar.mo39881c().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            long b = ((C26148a) obj).mo65087b();
            if (l != null && b == l.longValue()) {
                z6 = true;
                continue;
            } else {
                z6 = false;
                continue;
            }
            if (z6) {
                break;
            }
        }
        C26148a aVar2 = (C26148a) obj;
        Iterator it2 = aVar.mo39881c().iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it2.next();
            C26148a aVar3 = (C26148a) obj2;
            CardApplicationTypeData.RecoverCardOrderData a2 = aVar.mo39886g().mo39780a().mo39286a();
            if (a2 == null || (i = a2.mo39308i()) == null || i.mo39811a() != aVar3.mo65087b()) {
                z5 = false;
                continue;
            } else {
                z5 = true;
                continue;
            }
            if (z5) {
                break;
            }
        }
        C26148a aVar4 = (C26148a) obj2;
        if (aVar.mo39886g().mo39791j() || aVar.mo39886g().mo39792k()) {
            Iterator it3 = aVar.mo39897q().iterator();
            while (true) {
                if (!it3.hasNext()) {
                    obj3 = null;
                    break;
                }
                obj3 = it3.next();
                if (((DebitCardRegTypeUiModel) obj3).mo39595b() == C17085g0.NEW_ACCOUNT) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            dVar = new C18815q.C18819d((DebitCardRegTypeUiModel) obj3, false, false, 2, (DefaultConstructorMarker) null);
        } else if (aVar.mo39881c().isEmpty()) {
            Iterator it4 = aVar.mo39897q().iterator();
            while (true) {
                if (!it4.hasNext()) {
                    obj6 = null;
                    break;
                }
                obj6 = it4.next();
                if (((DebitCardRegTypeUiModel) obj6).mo39595b() == C17085g0.NEW_ACCOUNT) {
                    z4 = true;
                    continue;
                } else {
                    z4 = false;
                    continue;
                }
                if (z4) {
                    break;
                }
            }
            dVar = new C18815q.C18819d((DebitCardRegTypeUiModel) obj6, false, false, 4, (DefaultConstructorMarker) null);
        } else if (this.f37370x.mo39780a().mo39289e() && aVar2 != null) {
            Iterator it5 = aVar.mo39897q().iterator();
            while (true) {
                if (!it5.hasNext()) {
                    obj5 = null;
                    break;
                }
                obj5 = it5.next();
                if (((DebitCardRegTypeUiModel) obj5).mo39595b() == C17085g0.EXISTING_ACCOUNT) {
                    z3 = true;
                    continue;
                } else {
                    z3 = false;
                    continue;
                }
                if (z3) {
                    break;
                }
            }
            dVar = new C18815q.C18819d((DebitCardRegTypeUiModel) obj5, false, false, 4, (DefaultConstructorMarker) null);
        } else if (!this.f37370x.mo39780a().mo39290f() || aVar4 == null) {
            dVar = new C18815q.C18819d((DebitCardRegTypeUiModel) null, true, false, 5, (DefaultConstructorMarker) null);
        } else {
            Iterator it6 = aVar.mo39897q().iterator();
            while (true) {
                if (!it6.hasNext()) {
                    obj4 = null;
                    break;
                }
                obj4 = it6.next();
                if (((DebitCardRegTypeUiModel) obj4).mo39595b() == C17085g0.EXISTING_ACCOUNT) {
                    z2 = true;
                    continue;
                } else {
                    z2 = false;
                    continue;
                }
                if (z2) {
                    break;
                }
            }
            dVar = new C18815q.C18819d((DebitCardRegTypeUiModel) obj4, false, false, 4, (DefaultConstructorMarker) null);
        }
        C18815q.C18819d dVar2 = dVar;
        if (aVar.mo39886g().mo39791j() || aVar.mo39886g().mo39792k()) {
            cVar = new C18815q.C18818c((C26148a) null, false, false);
        } else if (this.f37370x.mo39780a().mo39289e()) {
            cVar = new C18815q.C18818c(aVar2, false, true);
        } else if (this.f37370x.mo39780a().mo39290f()) {
            cVar = new C18815q.C18818c(aVar4, false, true);
        } else {
            cVar = rVar.mo46763d();
        }
        return C18833r.m63688b(rVar, (C18815q.C18832q) null, dVar2, cVar, (C18815q.C18828m) null, (C18815q.C18820e) null, (C18815q.C18826k) null, (C18815q.C18831p) null, (C18815q.C18827l) null, (C18815q.C18829n) null, (C18815q.C18822g) null, (C18815q.C18832q) null, (C18815q.C18832q) null, (C18815q.C18832q) null, (C18815q.C18832q) null, (C18815q.C18832q) null, (C18815q.C18825j) null, (C18815q.C18824i) null, (C18815q.C18816a) null, (C18815q.C18830o) null, (C18815q.C18817b) null, 1048569, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: Sx */
    public static final C40754t m47686Sx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Tw */
    public final void m47687Tw(boolean z) {
        C18814p pVar;
        String str;
        C1644x xVar = this.f37338a0;
        if (z) {
            pVar = C18814p.LOADING;
        } else if (C43193c.m123893c(this.f37323L.mo27230a().mo27241e()) == 100) {
            pVar = C18814p.ENABLED;
        } else {
            pVar = C18814p.DISABLED;
        }
        C10515c c = this.f37323L.mo27230a().mo27239c();
        C10515c cVar = C10515c.SUMMARY;
        boolean z2 = false;
        if (c == cVar) {
            str = m47729ux();
        } else {
            str = C32343x.m95388F("text.card.applications.button.next", new Object[0]);
        }
        if (this.f37323L.mo27230a().mo27239c() == cVar) {
            z2 = true;
        }
        xVar.mo4823o(new C18813o(pVar, str, z2));
    }

    /* renamed from: Tx */
    private final void m47688Tx() {
        m47667Jx();
        m47671Lx();
        m47680Px();
        m47676Nx();
        m47684Rx();
    }

    /* renamed from: Uw */
    static /* synthetic */ void m47689Uw(C12550j3 j3Var, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        j3Var.m47687Tw(z);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: k51.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: Vw */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final p674xm.C18815q.C18826k m47690Vw(p674xm.C18815q.C18828m r11) {
        /*
            r10 = this;
            xm.r r0 = r10.m47723qx()
            xm.q$k r0 = r0.mo46774m()
            java.lang.String r0 = r0.mo46669a()
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 != 0) goto L_0x0064
            dn.d r0 = p398dn.C12330d.f36975a
            j51.f r4 = r10.f37353j
            java.util.List r4 = r4.mo89561a()
            java.util.Iterator r4 = r4.iterator()
        L_0x001d:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0031
            java.lang.Object r5 = r4.next()
            r6 = r5
            k51.b r6 = (k51.C36874b) r6
            boolean r6 = r6.mo89807b()
            if (r6 == 0) goto L_0x001d
            goto L_0x0032
        L_0x0031:
            r5 = r3
        L_0x0032:
            k51.b r5 = (k51.C36874b) r5
            if (r5 != 0) goto L_0x0043
            j51.f r4 = r10.f37353j
            java.util.List r4 = r4.mo89561a()
            java.lang.Object r4 = ie1.C41358y.m120009Y(r4)
            r5 = r4
            k51.b r5 = (k51.C36874b) r5
        L_0x0043:
            if (r5 == 0) goto L_0x004a
            java.lang.String r4 = r5.mo89806a()
            goto L_0x004b
        L_0x004a:
            r4 = r3
        L_0x004b:
            ge.bog.mobilebank.cardapplications.presentation.model.DebitCardPinDeliveryTypeUiModel r5 = r11.mo46669a()
            if (r5 == 0) goto L_0x0056
            nm.e0 r5 = r5.mo39561a()
            goto L_0x0057
        L_0x0056:
            r5 = r3
        L_0x0057:
            nm.e0 r6 = p537nm.C17081e0.SMS
            if (r5 == r6) goto L_0x005d
            r5 = r1
            goto L_0x005e
        L_0x005d:
            r5 = r2
        L_0x005e:
            java.lang.Object r0 = r0.mo32928h(r4, r5)
            java.lang.String r0 = (java.lang.String) r0
        L_0x0064:
            r5 = r0
            xm.q$k r0 = new xm.q$k
            ge.bog.mobilebank.cardapplications.presentation.model.DebitCardPinDeliveryTypeUiModel r11 = r11.mo46669a()
            if (r11 == 0) goto L_0x0071
            nm.e0 r3 = r11.mo39561a()
        L_0x0071:
            nm.e0 r11 = p537nm.C17081e0.SMS
            if (r3 != r11) goto L_0x0077
            r6 = r1
            goto L_0x0078
        L_0x0077:
            r6 = r2
        L_0x0078:
            r7 = 0
            r8 = 4
            r9 = 0
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p412en.C12550j3.m47690Vw(xm.q$m):xm.q$k");
    }

    /* access modifiers changed from: private */
    /* renamed from: Ww */
    public final List m47691Ww(C17103t tVar, C17100q qVar) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        m47693Yw(qVar, arrayList2, arrayList);
        m47692Xw(tVar, arrayList2, arrayList);
        return C42197d.m122527U(C41358y.m120023m0(arrayList2, arrayList));
    }

    /* JADX WARNING: type inference failed for: r11v4, types: [ge.bog.mobilebank.cleanarch.cardinsurance.presentation.model.DebitCardInsuranceTypeUiModel] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: Xw */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m47692Xw(p537nm.C17103t r11, java.util.ArrayList r12, java.util.ArrayList r13) {
        /*
            r10 = this;
            nm.s r0 = r11.mo44487a()
            r1 = 0
            if (r0 == 0) goto L_0x0039
            boolean r2 = r0.mo44483e()
            if (r2 == 0) goto L_0x0039
            ge.bog.mobilebank.cardapplications.presentation.model.PackageCommissionUiModel r2 = new ge.bog.mobilebank.cardapplications.presentation.model.PackageCommissionUiModel
            double r4 = r0.mo44481c()
            java.lang.String r6 = r0.mo44482d()
            r7 = 0
            r8 = 4
            r9 = 0
            r3 = r2
            r3.<init>(r4, r6, r7, r8, r9)
            r12.add(r2)
            ge.bog.mobilebank.cardapplications.presentation.model.CardFeeUiModel r12 = new ge.bog.mobilebank.cardapplications.presentation.model.CardFeeUiModel
            java.lang.String r2 = "text.card.applications.solo.package.fee"
            java.lang.Object[] r3 = new java.lang.Object[r1]
            java.lang.String r2 = g91.C32343x.m95388F(r2, r3)
            double r3 = r0.mo44481c()
            java.lang.String r0 = r0.mo44482d()
            r12.<init>(r2, r3, r0)
            r13.add(r12)
        L_0x0039:
            om.c r12 = r10.f37313B
            r0 = 0
            if (r12 == 0) goto L_0x006e
            xm.r r2 = r10.m47723qx()
            xm.q$l r2 = r2.mo46773l()
            ge.bog.mobilebank.cardapplications.presentation.model.DebitCardReceiveTypeUiModel r2 = r2.mo46669a()
            if (r2 == 0) goto L_0x0051
            xm.i r2 = r2.mo39572a()
            goto L_0x0052
        L_0x0051:
            r2 = r0
        L_0x0052:
            xm.i r3 = p674xm.C18805i.HOME
            if (r2 != r3) goto L_0x006e
            ge.bog.mobilebank.cardapplications.presentation.model.CardFeeUiModel r2 = new ge.bog.mobilebank.cardapplications.presentation.model.CardFeeUiModel
            java.lang.String r3 = "text.card.applications.delivery.fee"
            java.lang.Object[] r4 = new java.lang.Object[r1]
            java.lang.String r3 = g91.C32343x.m95388F(r3, r4)
            double r4 = r12.mo44665a()
            java.lang.String r12 = r12.mo44666b()
            r2.<init>(r3, r4, r12)
            r13.add(r2)
        L_0x006e:
            nm.s r11 = r11.mo44487a()
            if (r11 == 0) goto L_0x008c
            ge.bog.mobilebank.cardapplications.presentation.model.CardFeeUiModel r12 = new ge.bog.mobilebank.cardapplications.presentation.model.CardFeeUiModel
            java.lang.String r2 = "text.card.applications.card.fee"
            java.lang.Object[] r3 = new java.lang.Object[r1]
            java.lang.String r2 = g91.C32343x.m95388F(r2, r3)
            double r3 = r11.mo44479a()
            java.lang.String r11 = r11.mo44480b()
            r12.<init>(r2, r3, r11)
            r13.add(r12)
        L_0x008c:
            xm.r r11 = r10.m47723qx()
            xm.q$i r11 = r11.mo46770i()
            ge.bog.mobilebank.cleanarch.cardinsurance.presentation.model.DebitCardInsuranceTypeUiModel r11 = r11.mo46669a()
            boolean r12 = r11 instanceof p341ge.bog.mobilebank.cleanarch.cardinsurance.presentation.model.DebitCardInsuranceTypeUiModel.InsuranceType
            if (r12 == 0) goto L_0x009f
            r0 = r11
            ge.bog.mobilebank.cleanarch.cardinsurance.presentation.model.DebitCardInsuranceTypeUiModel$InsuranceType r0 = (p341ge.bog.mobilebank.cleanarch.cardinsurance.presentation.model.DebitCardInsuranceTypeUiModel.InsuranceType) r0
        L_0x009f:
            if (r0 == 0) goto L_0x00c0
            ge.bog.mobilebank.cardapplications.presentation.model.CardFeeUiModel r11 = new ge.bog.mobilebank.cardapplications.presentation.model.CardFeeUiModel
            java.lang.String r12 = "text.card.applications.insurance.fee"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r12 = g91.C32343x.m95388F(r12, r1)
            java.lang.Double r0 = r0.mo49686f()
            if (r0 == 0) goto L_0x00b6
            double r0 = r0.doubleValue()
            goto L_0x00b8
        L_0x00b6:
            r0 = 0
        L_0x00b8:
            java.lang.String r2 = "GEL"
            r11.<init>(r12, r0, r2)
            r13.add(r11)
        L_0x00c0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p412en.C12550j3.m47692Xw(nm.t, java.util.ArrayList, java.util.ArrayList):void");
    }

    /* renamed from: Yw */
    private final void m47693Yw(C17100q qVar, ArrayList arrayList, ArrayList arrayList2) {
        C17099p a = qVar.mo44470a();
        if (a != null && a.mo44466c() && a.mo44464a() != null && a.mo44465b() != null) {
            BigDecimal a2 = a.mo44464a();
            C41536l.m120486f(a2);
            double doubleValue = a2.doubleValue();
            String b = a.mo44465b();
            C41536l.m120486f(b);
            arrayList.add(new PackageCommissionUiModel(doubleValue, b, true));
            String F = C32343x.m95388F("text.card.applications.account.package.fee", new Object[0]);
            BigDecimal a3 = a.mo44464a();
            C41536l.m120486f(a3);
            double doubleValue2 = a3.doubleValue();
            String b2 = a.mo44465b();
            C41536l.m120486f(b2);
            arrayList2.add(new CardFeeUiModel(F, doubleValue2, b2));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Zw */
    public final void m47694Zw(Client client) {
        Object obj;
        C10515c cVar;
        boolean z;
        Object obj2;
        boolean z2;
        CardApplicationTypeData.StudentCardOrderData studentCardOrderData;
        RegionUiModel regionUiModel;
        CardApplicationTypeData.StudentCardOrderData studentCardOrderData2;
        boolean z3;
        CardApplicationTypeData.StudentCardOrderData studentCardOrderData3;
        boolean z4;
        DebitCardReceiveTypeUiModel debitCardReceiveTypeUiModel;
        int i;
        List i2;
        List i3;
        List i4;
        boolean z5;
        boolean z6;
        boolean z7;
        String tx = m47727tx();
        if (tx == null) {
            UserInfo client2 = client.getUserInfo().getClient();
            tx = (client2.firstNameInt + " " + client2.lastNameInt).toUpperCase(Locale.ROOT);
            C41536l.m120488h(tx, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        }
        C18815q.C18828m n = m47723qx().mo46775n();
        C14235a aVar = this.f37312A;
        C14235a aVar2 = null;
        if (aVar == null) {
            C41536l.m120506z("resources");
            aVar = null;
        }
        Iterator it = aVar.mo39894n().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((DebitCardPinDeliveryTypeUiModel) obj).mo39561a() == C17081e0.SMS) {
                z7 = true;
                continue;
            } else {
                z7 = false;
                continue;
            }
            if (z7) {
                break;
            }
        }
        DebitCardPinDeliveryTypeUiModel debitCardPinDeliveryTypeUiModel = (DebitCardPinDeliveryTypeUiModel) obj;
        C14235a aVar3 = this.f37312A;
        if (aVar3 == null) {
            C41536l.m120506z("resources");
            aVar3 = null;
        }
        Iterator it2 = aVar3.mo39894n().iterator();
        int i5 = 0;
        while (true) {
            if (!it2.hasNext()) {
                i5 = -1;
                break;
            }
            if (((DebitCardPinDeliveryTypeUiModel) it2.next()).mo39561a() == C17081e0.SMS) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (z6) {
                break;
            }
            i5++;
        }
        Integer valueOf = Integer.valueOf(i5);
        if (this.f37370x.mo39786f()) {
            cVar = C10515c.CARD_DETAILS;
        } else {
            cVar = C10515c.PICKUP_DETAILS;
        }
        C18815q.C18828m d = C18815q.C18828m.m63659d(n, debitCardPinDeliveryTypeUiModel, valueOf, cVar, false, 8, (Object) null);
        C14235a aVar4 = this.f37312A;
        if (aVar4 == null) {
            C41536l.m120506z("resources");
            aVar4 = null;
        }
        Iterator it3 = aVar4.mo39894n().iterator();
        int i6 = 0;
        while (true) {
            if (!it3.hasNext()) {
                i6 = -1;
                break;
            }
            if (((DebitCardPinDeliveryTypeUiModel) it3.next()).mo39561a() == C17081e0.SMS) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                break;
            }
            i6++;
        }
        C12330d dVar = C12330d.f36975a;
        C18833r k = dVar.mo32931k(m47723qx(), d);
        C18815q.C18821f fVar = C18815q.f52571d;
        C14235a aVar5 = this.f37312A;
        if (aVar5 == null) {
            C41536l.m120506z("resources");
            aVar5 = null;
        }
        if (aVar5.mo39882d().getPlcSchoolFlag() || this.f37370x.mo39792k()) {
            z = false;
        } else {
            z = true;
        }
        C18815q.C18832q a = fVar.mo46699a(tx, z, !this.f37370x.mo39786f());
        C14235a aVar6 = this.f37312A;
        if (aVar6 == null) {
            C41536l.m120506z("resources");
            aVar6 = null;
        }
        Iterator it4 = aVar6.mo39885f().iterator();
        while (true) {
            if (!it4.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it4.next();
            if (C41536l.m120484d(((DebitCardCurrencyUiModel) obj2).mo39510a(), "GEL")) {
                break;
            }
        }
        DebitCardCurrencyUiModel debitCardCurrencyUiModel = (DebitCardCurrencyUiModel) obj2;
        C14235a aVar7 = this.f37312A;
        if (aVar7 == null) {
            C41536l.m120506z("resources");
            aVar7 = null;
        }
        Iterator it5 = aVar7.mo39885f().iterator();
        int i7 = 0;
        while (true) {
            if (!it5.hasNext()) {
                i7 = -1;
                break;
            } else if (C41536l.m120484d(((DebitCardCurrencyUiModel) it5.next()).mo39510a(), "GEL")) {
                break;
            } else {
                i7++;
            }
        }
        Integer valueOf2 = Integer.valueOf(i7);
        if (this.f37370x.mo39791j() || this.f37370x.mo39792k()) {
            z2 = false;
        } else {
            z2 = true;
        }
        C18815q.C18820e eVar = new C18815q.C18820e(debitCardCurrencyUiModel, valueOf2, z2);
        C18815q.C18826k Vw = m47690Vw(d);
        C18815q.C18832q gx = m47704gx();
        C14235a aVar8 = this.f37312A;
        if (aVar8 == null) {
            C41536l.m120506z("resources");
            aVar8 = null;
        }
        CardApplicationTypeData a2 = aVar8.mo39886g().mo39780a();
        if (a2 instanceof CardApplicationTypeData.StudentCardOrderData) {
            studentCardOrderData = (CardApplicationTypeData.StudentCardOrderData) a2;
        } else {
            studentCardOrderData = null;
        }
        if (studentCardOrderData == null || (i4 = studentCardOrderData.mo39340i()) == null) {
            regionUiModel = null;
        } else {
            regionUiModel = (RegionUiModel) C41358y.m120009Y(i4);
        }
        C14235a aVar9 = this.f37312A;
        if (aVar9 == null) {
            C41536l.m120506z("resources");
            aVar9 = null;
        }
        CardApplicationTypeData a3 = aVar9.mo39886g().mo39780a();
        if (a3 instanceof CardApplicationTypeData.StudentCardOrderData) {
            studentCardOrderData2 = (CardApplicationTypeData.StudentCardOrderData) a3;
        } else {
            studentCardOrderData2 = null;
        }
        if (studentCardOrderData2 == null || (i3 = studentCardOrderData2.mo39340i()) == null || i3.size() <= 1) {
            z3 = false;
        } else {
            z3 = true;
        }
        C14235a aVar10 = this.f37312A;
        if (aVar10 == null) {
            C41536l.m120506z("resources");
            aVar10 = null;
        }
        CardApplicationTypeData a4 = aVar10.mo39886g().mo39780a();
        if (a4 instanceof CardApplicationTypeData.StudentCardOrderData) {
            studentCardOrderData3 = (CardApplicationTypeData.StudentCardOrderData) a4;
        } else {
            studentCardOrderData3 = null;
        }
        if (studentCardOrderData3 == null || (i2 = studentCardOrderData3.mo39340i()) == null || !(!i2.isEmpty())) {
            z4 = false;
        } else {
            z4 = true;
        }
        C18815q.C18830o oVar = new C18815q.C18830o(regionUiModel, z3, z4);
        C14235a aVar11 = this.f37312A;
        if (aVar11 == null) {
            C41536l.m120506z("resources");
            aVar11 = null;
        }
        C18833r b = C18833r.m63688b(k, a, (C18815q.C18819d) null, (C18815q.C18818c) null, (C18815q.C18828m) null, eVar, Vw, (C18815q.C18831p) null, (C18815q.C18827l) null, (C18815q.C18829n) null, (C18815q.C18822g) null, (C18815q.C18832q) null, (C18815q.C18832q) null, (C18815q.C18832q) null, gx, (C18815q.C18832q) null, (C18815q.C18825j) null, (C18815q.C18824i) null, (C18815q.C18816a) null, oVar, new C18815q.C18817b((CardDailyLimitUiModel) null, aVar11.mo39882d().getPlcSchoolFlag(), false, 4, (DefaultConstructorMarker) null), 253902, (Object) null);
        C14235a aVar12 = this.f37312A;
        if (aVar12 == null) {
            C41536l.m120506z("resources");
            aVar12 = null;
        }
        C18833r Sw = m47685Sw(b, aVar12);
        C14235a aVar13 = this.f37312A;
        if (aVar13 == null) {
            C41536l.m120506z("resources");
            aVar13 = null;
        }
        if (aVar13.mo39895o().size() == 1) {
            C14235a aVar14 = this.f37312A;
            if (aVar14 == null) {
                C41536l.m120506z("resources");
                aVar14 = null;
            }
            debitCardReceiveTypeUiModel = (DebitCardReceiveTypeUiModel) C41358y.m120009Y(aVar14.mo39895o());
        } else {
            debitCardReceiveTypeUiModel = null;
        }
        C14235a aVar15 = this.f37312A;
        if (aVar15 == null) {
            C41536l.m120506z("resources");
            aVar15 = null;
        }
        if (aVar15.mo39895o().size() == 1) {
            i = 0;
        } else {
            i = -1;
        }
        C18815q.C18827l lVar = new C18815q.C18827l(debitCardReceiveTypeUiModel, i, false, 4, (DefaultConstructorMarker) null);
        C14235a aVar16 = this.f37312A;
        if (aVar16 == null) {
            C41536l.m120506z("resources");
        } else {
            aVar2 = aVar16;
        }
        m47665Ix(dVar.mo32933m(dVar.mo32930j(Sw, lVar, (DebitCardPinDeliveryTypeUiModel) C41358y.m120010Z(aVar2.mo39894n(), i6), Integer.valueOf(i6)), m47706hx()));
    }

    /* access modifiers changed from: private */
    /* renamed from: ax */
    public final List m47695ax(List list, boolean z) {
        boolean z2;
        if (z) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (((DebitCardReceiveTypeUiModel) next).mo39572a() == C18805i.BANK) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: bx */
    public final List m47696bx(List list, boolean z) {
        boolean z2;
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            DebitCardPinDeliveryTypeUiModel debitCardPinDeliveryTypeUiModel = (DebitCardPinDeliveryTypeUiModel) next;
            if (!z || debitCardPinDeliveryTypeUiModel.mo39561a() == C17081e0.SMS) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: cx */
    private final C40762x m47697cx(String str, C17085g0 g0Var, boolean z) {
        CardApplicationTypeData.PayRollCardOrderData payRollCardOrderData;
        Long l;
        C16753k kVar = this.f37345f;
        C24978b b = C24978b.m79846b(Boolean.valueOf(this.f37370x.mo39786f()));
        C41536l.m120488h(b, "fromBoolean(data.isDigital)");
        C24978b b2 = C24978b.m79846b(Boolean.valueOf(z));
        C41536l.m120488h(b2, "fromBoolean(closeCard)");
        CardApplicationTypeData a = this.f37370x.mo39780a();
        if (a instanceof CardApplicationTypeData.PayRollCardOrderData) {
            payRollCardOrderData = (CardApplicationTypeData.PayRollCardOrderData) a;
        } else {
            payRollCardOrderData = null;
        }
        if (payRollCardOrderData != null) {
            l = Long.valueOf(payRollCardOrderData.mo39297j());
        } else {
            l = null;
        }
        return kVar.mo43877c(new C17537a(str, g0Var, b, b2, l, (String) null, 32, (DefaultConstructorMarker) null));
    }

    /* renamed from: dx */
    static /* synthetic */ C40762x m47699dx(C12550j3 j3Var, String str, C17085g0 g0Var, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            C14235a aVar = j3Var.f37312A;
            if (aVar == null) {
                C41536l.m120506z("resources");
                aVar = null;
            }
            str = aVar.mo39882d().getProduct();
        }
        if ((i & 2) != 0) {
            g0Var = C17085g0.NEW_ACCOUNT;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return j3Var.m47697cx(str, g0Var, z);
    }

    /* renamed from: ex */
    private final FeedbackItem m47701ex(C17109z zVar) {
        List<C12335f> m = C41341q.m119910m(C12335f.PLASTIC_PRINT_WARNING_1, C12335f.PLASTIC_PRINT_WARNING_2);
        ArrayList arrayList = new ArrayList(C41343r.m119925u(m, 10));
        for (C12335f b : m) {
            arrayList.add(Long.valueOf(b.mo32937b()));
        }
        if (C41358y.m119999O(arrayList, zVar.mo44522b())) {
            return new FeedbackItem(C34646b.m101748b("text.card.applications.success.plastic.print.warning.infobox.title", new Object[0]), C34646b.m101748b("text.card.applications.success.plastic.print.warning.infobox.message", new Object[0]), C34646b.m101748b("text.card.applications.success.plastic.print.warning", new Object[0]), (C16686a) null, 8, (DefaultConstructorMarker) null);
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: k51.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: gx */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final p674xm.C18815q.C18832q m47704gx() {
        /*
            r10 = this;
            j51.f r0 = r10.f37353j
            java.util.List r0 = r0.mo89561a()
            java.util.Iterator r0 = r0.iterator()
        L_0x000a:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L_0x001f
            java.lang.Object r1 = r0.next()
            r3 = r1
            k51.b r3 = (k51.C36874b) r3
            boolean r3 = r3.mo89807b()
            if (r3 == 0) goto L_0x000a
            goto L_0x0020
        L_0x001f:
            r1 = r2
        L_0x0020:
            k51.b r1 = (k51.C36874b) r1
            if (r1 != 0) goto L_0x0031
            j51.f r0 = r10.f37353j
            java.util.List r0 = r0.mo89561a()
            java.lang.Object r0 = ie1.C41358y.m120009Y(r0)
            r1 = r0
            k51.b r1 = (k51.C36874b) r1
        L_0x0031:
            if (r1 == 0) goto L_0x0037
            java.lang.String r2 = r1.mo89806a()
        L_0x0037:
            r4 = r2
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 14
            r9 = 0
            xm.q$q r0 = new xm.q$q
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p412en.C12550j3.m47704gx():xm.q$q");
    }

    /* renamed from: hx */
    private final C18815q.C18829n m47706hx() {
        boolean z;
        C14235a aVar = this.f37312A;
        C14235a aVar2 = null;
        if (aVar == null) {
            C41536l.m120506z("resources");
            aVar = null;
        }
        Iterator it = aVar.mo39896p().iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (((DebitCardRecipientTypeUiModel) it.next()).mo39584b() == C18807j.PERSONALLY) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                break;
            }
            i++;
        }
        int i2 = i;
        C14235a aVar3 = this.f37312A;
        if (aVar3 == null) {
            C41536l.m120506z("resources");
        } else {
            aVar2 = aVar3;
        }
        return new C18815q.C18829n((DebitCardRecipientTypeUiModel) C41358y.m120010Z(aVar2.mo39896p(), i2), i2, false, 4, (DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: ix */
    public final C40762x m47708ix(C17085g0 g0Var) {
        C40762x xVar;
        C14235a aVar = this.f37312A;
        C14235a aVar2 = null;
        if (aVar == null) {
            C41536l.m120506z("resources");
            aVar = null;
        }
        if (aVar.mo39886g().mo39786f()) {
            C16798z zVar = this.f37357l;
            C17075c0 c0Var = C17075c0.DIGITAL;
            C14235a aVar3 = this.f37312A;
            if (aVar3 == null) {
                C41536l.m120506z("resources");
            } else {
                aVar2 = aVar3;
            }
            xVar = zVar.mo43918a(c0Var, aVar2.mo39882d().getProduct(), g0Var.mo44353b()).mo95062A(new C12540h3(C12553b.f37376d)).mo95065D(new C12667u2());
        } else {
            C16798z zVar2 = this.f37357l;
            C17075c0 c0Var2 = C17075c0.PLASTIC;
            C14235a aVar4 = this.f37312A;
            if (aVar4 == null) {
                C41536l.m120506z("resources");
            } else {
                aVar2 = aVar4;
            }
            xVar = zVar2.mo43918a(c0Var2, aVar2.mo39882d().getProduct(), g0Var.mo44353b()).mo95062A(new C12672v2(C12554c.f37377d)).mo95065D(new C12680w2());
        }
        C40762x m = xVar.mo95084m(new C12685x2(new C12555d(this)));
        C41536l.m120488h(m, "private fun getDigitalCa…ission = it\n            }");
        return m;
    }

    /* access modifiers changed from: private */
    /* renamed from: jx */
    public static final C17100q m47710jx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C17100q) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: kx */
    public static final C17100q m47712kx(Throwable th) {
        C41536l.m120489i(th, "it");
        return new C17100q((C17099p) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: lx */
    public static final C17100q m47714lx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C17100q) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: mx */
    public static final C17100q m47716mx(Throwable th) {
        C41536l.m120489i(th, "it");
        return new C17100q((C17099p) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: nx */
    public static final void m47718nx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: ox */
    private final String m47720ox() {
        C25950a aVar;
        String a;
        C31128a aVar2 = (C31128a) this.f37350h0.mo4814f();
        if (aVar2 != null) {
            aVar = (C25950a) aVar2.mo71340a();
        } else {
            aVar = null;
        }
        if (aVar == null || (a = aVar.mo64864a()) == null) {
            return null;
        }
        byte[] bytes = a.getBytes(C40407d.f95989b);
        C41536l.m120488h(bytes, "this as java.lang.String).getBytes(charset)");
        if (bytes != null) {
            return C32359z0.m95597y(bytes);
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: qx */
    public final C18833r m47723qx() {
        return (C18833r) this.f37317F.getValue(this, f37311m0[0]);
    }

    /* access modifiers changed from: private */
    /* renamed from: sw */
    public static final C40754t m47725sw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: tx */
    private final String m47727tx() {
        CardApplicationTypeData.SchoolCardOrderData schoolCardOrderData;
        T t;
        boolean z;
        CardApplicationTypeData a = this.f37370x.mo39780a();
        if (a instanceof CardApplicationTypeData.SchoolCardOrderData) {
            schoolCardOrderData = (CardApplicationTypeData.SchoolCardOrderData) a;
        } else {
            schoolCardOrderData = null;
        }
        if (schoolCardOrderData == null) {
            return null;
        }
        C14235a aVar = this.f37312A;
        if (aVar == null) {
            C41536l.m120506z("resources");
            aVar = null;
        }
        Iterator<T> it = aVar.mo39882d().getClientChildren().iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((ScoolCardOwnerUiModel) t).mo39856a() == schoolCardOrderData.mo39318i()) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        ScoolCardOwnerUiModel scoolCardOwnerUiModel = (ScoolCardOwnerUiModel) t;
        if (scoolCardOwnerUiModel == null) {
            return null;
        }
        String b = scoolCardOwnerUiModel.mo39857b();
        Locale locale = Locale.ROOT;
        String upperCase = b.toUpperCase(locale);
        C41536l.m120488h(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        String upperCase2 = scoolCardOwnerUiModel.mo39858d().toUpperCase(locale);
        C41536l.m120488h(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase + " " + upperCase2;
    }

    /* renamed from: ux */
    private final String m47729ux() {
        String str;
        double d = 0.0d;
        for (CardFeeUiModel a : C41356x.m119982J(this.f37314C, CardFeeUiModel.class)) {
            d += a.mo39402a();
        }
        String F = C32343x.m95388F("text.card.applications.button.order", new Object[0]);
        if (d > Utils.DOUBLE_EPSILON) {
            str = " - " + C32303f.m95200k(d, "GEL");
        } else {
            str = "";
        }
        return F + str;
    }

    /* renamed from: vx */
    private final void m47731vx(C18784b bVar) {
        C10463g F = C36546y.m108282F();
        C41536l.m120488h(F, "getAnalytics()");
        bVar.mo46587c(F);
    }

    /* access modifiers changed from: private */
    /* renamed from: wx */
    public final C40762x m47733wx(Client client) {
        CardApplicationTypeData.StudentCardOrderData studentCardOrderData;
        ArrayList arrayList;
        CardApplicationTypeData.SchoolCardOrderData schoolCardOrderData;
        Long l;
        RecoverCardUiModel i;
        List<RegionUiModel> i2;
        C16777u0 u0Var = this.f37341d;
        String d = this.f37370x.mo39782d();
        CardApplicationTypeData a = this.f37370x.mo39780a();
        Long l2 = null;
        if (a instanceof CardApplicationTypeData.StudentCardOrderData) {
            studentCardOrderData = (CardApplicationTypeData.StudentCardOrderData) a;
        } else {
            studentCardOrderData = null;
        }
        if (studentCardOrderData == null || (i2 = studentCardOrderData.mo39340i()) == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(C41343r.m119925u(i2, 10));
            for (RegionUiModel b : i2) {
                arrayList2.add(b.mo39835b());
            }
            arrayList = arrayList2;
        }
        boolean h = this.f37370x.mo39788h();
        CardApplicationTypeData a2 = this.f37370x.mo39780a();
        if (a2 instanceof CardApplicationTypeData.SchoolCardOrderData) {
            schoolCardOrderData = (CardApplicationTypeData.SchoolCardOrderData) a2;
        } else {
            schoolCardOrderData = null;
        }
        if (schoolCardOrderData != null) {
            l = Long.valueOf(schoolCardOrderData.mo39318i());
        } else {
            l = null;
        }
        CardApplicationTypeData.RecoverCardOrderData a3 = this.f37370x.mo39780a().mo39286a();
        if (!(a3 == null || (i = a3.mo39308i()) == null)) {
            l2 = Long.valueOf(i.mo39811a());
        }
        C40762x A = u0Var.mo43890E(d, arrayList, h, l, l2, this.f37370x.mo39780a() instanceof CardApplicationTypeData.WishCardData, this.f37370x.mo39787g()).mo95062A(new C12511d3(new C12556e(this))).mo95087r(new C12524e3(new C12557f(this))).mo95062A(new C12529f3(new C12559g(this, client)));
        C41536l.m120488h(A, "private fun observeIniti…sources\n                }");
        return A;
    }

    /* access modifiers changed from: private */
    /* renamed from: xx */
    public static final C14235a m47735xx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C14235a) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: yx */
    public static final C40735b0 m47737yx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40735b0) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: zx */
    public static final C14235a m47739zx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C14235a) lVar.invoke(obj);
    }

    /* renamed from: Al */
    public void mo33179Al(String str) {
        String str2 = str;
        C41536l.m120489i(str2, "name");
        m47665Ix(C18833r.m63688b(m47723qx(), C18815q.C18832q.m63681g(m47723qx().mo46771j(), str2, false, false, (C17799b) null, 14, (Object) null), (C18815q.C18819d) null, (C18815q.C18818c) null, (C18815q.C18828m) null, (C18815q.C18820e) null, (C18815q.C18826k) null, (C18815q.C18831p) null, (C18815q.C18827l) null, (C18815q.C18829n) null, (C18815q.C18822g) null, (C18815q.C18832q) null, (C18815q.C18832q) null, (C18815q.C18832q) null, (C18815q.C18832q) null, (C18815q.C18832q) null, (C18815q.C18825j) null, (C18815q.C18824i) null, (C18815q.C18816a) null, (C18815q.C18830o) null, (C18815q.C18817b) null, 1048574, (Object) null));
    }

    /* renamed from: C2 */
    public void mo33180C2(String str) {
        String str2 = str;
        C41536l.m120489i(str2, "number");
        C18833r qx = m47723qx();
        C18815q.C18826k kVar = r1;
        C18815q.C18826k kVar2 = new C18815q.C18826k(str2, true, (C17799b) null, 4, (DefaultConstructorMarker) null);
        m47665Ix(C18833r.m63688b(qx, (C18815q.C18832q) null, (C18815q.C18819d) null, (C18815q.C18818c) null, (C18815q.C18828m) null, (C18815q.C18820e) null, kVar, (C18815q.C18831p) null, (C18815q.C18827l) null, (C18815q.C18829n) null, (C18815q.C18822g) null, (C18815q.C18832q) null, (C18815q.C18832q) null, (C18815q.C18832q) null, (C18815q.C18832q) null, (C18815q.C18832q) null, (C18815q.C18825j) null, (C18815q.C18824i) null, (C18815q.C18816a) null, (C18815q.C18830o) null, (C18815q.C18817b) null, 1048543, (Object) null));
    }

    /* renamed from: C4 */
    public LiveData mo33181C4() {
        return this.f37358l0;
    }

    /* renamed from: Cn */
    public void mo33182Cn(String str) {
        C41536l.m120489i(str, "phoneNumber");
        m47665Ix(C12330d.f36975a.mo32932l(m47723qx(), str));
    }

    /* renamed from: D6 */
    public LiveData mo33183D6() {
        return this.f37344e0;
    }

    /* renamed from: Dc */
    public void mo33184Dc(long j) {
        int i;
        boolean z;
        boolean z2;
        C12327b bVar = C12327b.f36972a;
        C14235a aVar = this.f37312A;
        C14235a aVar2 = null;
        if (aVar == null) {
            C41536l.m120506z("resources");
            aVar = null;
        }
        C18810l a = bVar.mo32910a(j, aVar.mo39883e());
        C14235a aVar3 = this.f37312A;
        if (aVar3 == null) {
            C41536l.m120506z("resources");
            aVar3 = null;
        }
        Iterator it = aVar3.mo39895o().iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            if (((DebitCardReceiveTypeUiModel) it.next()).mo39572a() == C18805i.BANK) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                break;
            }
            i2++;
        }
        C14235a aVar4 = this.f37312A;
        if (aVar4 == null) {
            C41536l.m120506z("resources");
            aVar4 = null;
        }
        Iterator it2 = aVar4.mo39894n().iterator();
        int i3 = 0;
        while (true) {
            if (!it2.hasNext()) {
                i = -1;
                break;
            }
            if (((DebitCardPinDeliveryTypeUiModel) it2.next()).mo39561a() == C17081e0.SMS) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i = i3;
                break;
            }
            i3++;
        }
        C18833r qx = m47723qx();
        C18815q.C18831p pVar = r15;
        C18815q.C18831p pVar2 = new C18815q.C18831p(a, false, 2, (DefaultConstructorMarker) null);
        C18833r b = C18833r.m63688b(qx, (C18815q.C18832q) null, (C18815q.C18819d) null, (C18815q.C18818c) null, (C18815q.C18828m) null, (C18815q.C18820e) null, (C18815q.C18826k) null, pVar, (C18815q.C18827l) null, (C18815q.C18829n) null, (C18815q.C18822g) null, (C18815q.C18832q) null, (C18815q.C18832q) null, (C18815q.C18832q) null, (C18815q.C18832q) null, (C18815q.C18832q) null, (C18815q.C18825j) null, (C18815q.C18824i) null, (C18815q.C18816a) null, (C18815q.C18830o) null, (C18815q.C18817b) null, 1048511, (Object) null);
        if (b.mo46773l().mo46669a() == null) {
            C12330d dVar = C12330d.f36975a;
            C14235a aVar5 = this.f37312A;
            if (aVar5 == null) {
                C41536l.m120506z("resources");
                aVar5 = null;
            }
            C18815q.C18827l lVar = new C18815q.C18827l((DebitCardReceiveTypeUiModel) C41358y.m120010Z(aVar5.mo39895o(), i2), i2, false, 4, (DefaultConstructorMarker) null);
            C14235a aVar6 = this.f37312A;
            if (aVar6 == null) {
                C41536l.m120506z("resources");
            } else {
                aVar2 = aVar6;
            }
            b = dVar.mo32930j(b, lVar, (DebitCardPinDeliveryTypeUiModel) C41358y.m120010Z(aVar2.mo39894n(), i), Integer.valueOf(i));
        }
        m47665Ix(b);
    }

    /* renamed from: Dn */
    public void mo33185Dn(int i) {
        boolean z;
        C14235a aVar = this.f37312A;
        C14235a aVar2 = null;
        if (aVar == null) {
            C41536l.m120506z("resources");
            aVar = null;
        }
        DebitCardReceiveTypeUiModel debitCardReceiveTypeUiModel = (DebitCardReceiveTypeUiModel) C41358y.m120010Z(aVar.mo39895o(), i);
        C14235a aVar3 = this.f37312A;
        if (aVar3 == null) {
            C41536l.m120506z("resources");
            aVar3 = null;
        }
        Iterator it = aVar3.mo39894n().iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            if (((DebitCardPinDeliveryTypeUiModel) it.next()).mo39561a() == C17081e0.SMS) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                break;
            }
            i2++;
        }
        int i3 = i2;
        C12330d dVar = C12330d.f36975a;
        C18833r qx = m47723qx();
        C18815q.C18827l lVar = new C18815q.C18827l(debitCardReceiveTypeUiModel, i, false, 4, (DefaultConstructorMarker) null);
        C14235a aVar4 = this.f37312A;
        if (aVar4 == null) {
            C41536l.m120506z("resources");
        } else {
            aVar2 = aVar4;
        }
        m47665Ix(dVar.mo32930j(qx, lVar, (DebitCardPinDeliveryTypeUiModel) C41358y.m120010Z(aVar2.mo39894n(), i3), Integer.valueOf(i3)));
    }

    /* renamed from: E1 */
    public void mo33186E1() {
        long j;
        C1644x xVar = this.f37327P;
        C14235a aVar = this.f37312A;
        if (aVar == null) {
            C41536l.m120506z("resources");
            aVar = null;
        }
        List r = aVar.mo39898r();
        C26148a c = m47723qx().mo46763d().mo46669a();
        if (c != null) {
            j = c.mo65087b();
        } else {
            j = -1;
        }
        C37224b.m109965d(xVar, new CardAccountSelectorData(r, Long.valueOf(j)));
    }

    /* renamed from: F */
    public LiveData mo33187F() {
        return this.f37333V;
    }

    /* renamed from: G7 */
    public void mo33188G7(String str, String str2, String str3) {
        Long l;
        UtmParamsEntity utmParamsEntity;
        C14235a aVar;
        Double c;
        UtmParamsEntity utmParams = this.f37360n.getUtmParams();
        C20557a b = this.f37361o.mo48775b("UTM_PARAMETER_EXPIRATION_IN_HOURS");
        if (b == null || (c = b.mo49086c()) == null) {
            l = null;
        } else {
            l = Long.valueOf((long) c.doubleValue());
        }
        if (!C28323a.m86959a(utmParams, l)) {
            utmParamsEntity = null;
        } else {
            utmParamsEntity = utmParams;
        }
        C12330d dVar = C12330d.f36975a;
        C18833r qx = m47723qx();
        C14235a aVar2 = this.f37312A;
        if (aVar2 == null) {
            C41536l.m120506z("resources");
            aVar = null;
        } else {
            aVar = aVar2;
        }
        OrderCardParamsObject b2 = dVar.mo32923b(qx, aVar, utmParamsEntity, this.f37313B, this.f37370x.mo39784e(), str, str2, str3, m47720ox());
        if (C32300e0.f79712a.mo72816a(str, str2, str3)) {
            this.f37321J.onNext(b2);
        } else {
            C37224b.m109965d(this.f37334W, b2);
        }
    }

    /* renamed from: Gc */
    public void mo33189Gc(String str) {
        String str2 = str;
        C41536l.m120489i(str2, "firstName");
        m47665Ix(C18833r.m63688b(m47723qx(), (C18815q.C18832q) null, (C18815q.C18819d) null, (C18815q.C18818c) null, (C18815q.C18828m) null, (C18815q.C18820e) null, (C18815q.C18826k) null, (C18815q.C18831p) null, (C18815q.C18827l) null, (C18815q.C18829n) null, (C18815q.C18822g) null, (C18815q.C18832q) null, C18815q.C18832q.m63681g(m47723qx().mo46777p(), str2, false, false, (C17799b) null, 14, (Object) null), (C18815q.C18832q) null, (C18815q.C18832q) null, (C18815q.C18832q) null, (C18815q.C18825j) null, (C18815q.C18824i) null, (C18815q.C18816a) null, (C18815q.C18830o) null, (C18815q.C18817b) null, 1046527, (Object) null));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v0, resolved type: ge.bog.mobilebank.cardapplications.presentation.model.RegionUiModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v1, resolved type: ge.bog.mobilebank.cardapplications.presentation.model.RegionUiModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v3, resolved type: ge.bog.mobilebank.cardapplications.presentation.model.RegionUiModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v2, resolved type: ge.bog.mobilebank.cardapplications.presentation.model.RegionUiModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v5, resolved type: ge.bog.mobilebank.cardapplications.presentation.model.RegionUiModel} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: Hh */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo33190Hh(java.lang.String r29) {
        /*
            r28 = this;
            r0 = r28
            r1 = r29
            java.lang.String r2 = "regionId"
            kotlin.jvm.internal.C41536l.m120489i(r1, r2)
            xm.r r3 = r28.m47723qx()
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            xm.r r2 = r28.m47723qx()
            xm.q$o r22 = r2.mo46781t()
            ge.bog.mobilebank.cardapplications.presentation.model.a r2 = r0.f37312A
            r23 = 0
            if (r2 != 0) goto L_0x0038
            java.lang.String r2 = "resources"
            kotlin.jvm.internal.C41536l.m120506z(r2)
            r2 = r23
        L_0x0038:
            ge.bog.mobilebank.cardapplications.presentation.model.OrderDebitCardData r2 = r2.mo39886g()
            ge.bog.mobilebank.cardapplications.presentation.model.CardApplicationTypeData r2 = r2.mo39780a()
            boolean r15 = r2 instanceof p341ge.bog.mobilebank.cardapplications.presentation.model.CardApplicationTypeData.StudentCardOrderData
            if (r15 == 0) goto L_0x0047
            ge.bog.mobilebank.cardapplications.presentation.model.CardApplicationTypeData$StudentCardOrderData r2 = (p341ge.bog.mobilebank.cardapplications.presentation.model.CardApplicationTypeData.StudentCardOrderData) r2
            goto L_0x0049
        L_0x0047:
            r2 = r23
        L_0x0049:
            if (r2 == 0) goto L_0x0071
            java.util.List r2 = r2.mo39340i()
            if (r2 == 0) goto L_0x0071
            java.util.Iterator r2 = r2.iterator()
        L_0x0055:
            boolean r15 = r2.hasNext()
            if (r15 == 0) goto L_0x006f
            java.lang.Object r15 = r2.next()
            r24 = r15
            ge.bog.mobilebank.cardapplications.presentation.model.RegionUiModel r24 = (p341ge.bog.mobilebank.cardapplications.presentation.model.RegionUiModel) r24
            java.lang.String r14 = r24.mo39835b()
            boolean r14 = kotlin.jvm.internal.C41536l.m120484d(r14, r1)
            if (r14 == 0) goto L_0x0055
            r23 = r15
        L_0x006f:
            ge.bog.mobilebank.cardapplications.presentation.model.RegionUiModel r23 = (p341ge.bog.mobilebank.cardapplications.presentation.model.RegionUiModel) r23
        L_0x0071:
            r24 = 0
            r25 = 0
            r26 = 6
            r27 = 0
            xm.q$o r22 = p674xm.C18815q.C18830o.m63672d(r22, r23, r24, r25, r26, r27)
            r23 = 0
            r24 = 786431(0xbffff, float:1.102025E-39)
            r25 = 0
            r1 = 0
            r14 = r1
            r1 = 0
            r15 = r1
            xm.r r1 = p674xm.C18833r.m63688b(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r0.m47665Ix(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p412en.C12550j3.mo33190Hh(java.lang.String):void");
    }

    /* renamed from: Hl */
    public void mo33191Hl() {
        m47665Ix(m47723qx());
    }

    /* renamed from: J1 */
    public LiveData mo33192J1() {
        return this.f37338a0;
    }

    /* renamed from: Jp */
    public void mo33193Jp() {
        List e = C41339p.m119900e(DebitCardInsuranceTypeUiModel.NoInsurance.f56170d);
        C14235a aVar = this.f37312A;
        if (aVar == null) {
            C41536l.m120506z("resources");
            aVar = null;
        }
        List m0 = C41358y.m120023m0(e, aVar.mo39890j().mo39956a());
        C36143a.C36148e eVar = C36143a.C36148e.f87337d;
        C10463g F = C36546y.m108282F();
        C41536l.m120488h(F, "getAnalytics()");
        eVar.mo88899c(F);
        C37224b.m109965d(this.f37340c0, new C18796d(m0, m47723qx().mo46770i().mo46669a()));
    }

    /* renamed from: K9 */
    public LiveData mo33194K9() {
        return this.f37332U;
    }

    /* renamed from: L6 */
    public void mo33195L6(int i) {
        C14235a aVar = this.f37312A;
        if (aVar == null) {
            C41536l.m120506z("resources");
            aVar = null;
        }
        C12330d dVar = C12330d.f36975a;
        m47665Ix(dVar.mo32933m(m47723qx(), new C18815q.C18829n((DebitCardRecipientTypeUiModel) C41358y.m120010Z(aVar.mo39896p(), i), i, dVar.mo32926f(m47723qx().mo46773l().mo46669a()))));
    }

    /* renamed from: Od */
    public void mo33196Od(DebitCardRegTypeUiModel debitCardRegTypeUiModel) {
        boolean z;
        C41536l.m120489i(debitCardRegTypeUiModel, "regType");
        C1644x xVar = this.f37328Q;
        C14235a aVar = this.f37312A;
        if (aVar == null) {
            C41536l.m120506z("resources");
            aVar = null;
        }
        xVar.mo4823o(aVar.mo39885f());
        C18833r qx = m47723qx();
        C18815q.C18819d d = C18815q.C18819d.m63618d(m47723qx().mo46764e(), debitCardRegTypeUiModel, false, false, 6, (Object) null);
        C17085g0 b = debitCardRegTypeUiModel.mo39595b();
        C17085g0 g0Var = C17085g0.EXISTING_ACCOUNT;
        if (b == g0Var) {
            z = true;
        } else {
            z = false;
        }
        m47665Ix(C18833r.m63688b(qx, (C18815q.C18832q) null, d, new C18815q.C18818c((C26148a) null, true, z, 1, (DefaultConstructorMarker) null), (C18815q.C18828m) null, (C18815q.C18820e) null, (C18815q.C18826k) null, (C18815q.C18831p) null, (C18815q.C18827l) null, (C18815q.C18829n) null, (C18815q.C18822g) null, (C18815q.C18832q) null, (C18815q.C18832q) null, (C18815q.C18832q) null, (C18815q.C18832q) null, (C18815q.C18832q) null, (C18815q.C18825j) null, (C18815q.C18824i) null, (C18815q.C18816a) null, (C18815q.C18830o) null, (C18815q.C18817b) null, 1048569, (Object) null));
        if (debitCardRegTypeUiModel.mo39595b() == g0Var) {
            mo33186E1();
        }
    }

    /* renamed from: Rv */
    public LiveData mo33197Rv() {
        return this.f37325N;
    }

    /* renamed from: Sl */
    public LiveData mo33198Sl() {
        return this.f37337Z;
    }

    /* renamed from: Vi */
    public LiveData mo33199Vi() {
        return this.f37328Q;
    }

    /* renamed from: W6 */
    public void mo33200W6() {
        C1644x xVar = this.f37342d0;
        C10089g gVar = this.f37349h;
        C14235a aVar = this.f37312A;
        if (aVar == null) {
            C41536l.m120506z("resources");
            aVar = null;
        }
        C37224b.m109965d(xVar, gVar.mo26550c(aVar.mo39887h()));
    }

    /* renamed from: X9 */
    public LiveData mo33201X9() {
        return this.f37324M;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [ge.bog.mobilebank.cardapplications.presentation.model.CardApplicationTypeData] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: Xq */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo33202Xq() {
        /*
            r3 = this;
            ge.bog.mobilebank.cardapplications.presentation.model.a r0 = r3.f37312A
            r1 = 0
            if (r0 != 0) goto L_0x000b
            java.lang.String r0 = "resources"
            kotlin.jvm.internal.C41536l.m120506z(r0)
            r0 = r1
        L_0x000b:
            ge.bog.mobilebank.cardapplications.presentation.model.OrderDebitCardData r0 = r0.mo39886g()
            ge.bog.mobilebank.cardapplications.presentation.model.CardApplicationTypeData r0 = r0.mo39780a()
            boolean r2 = r0 instanceof p341ge.bog.mobilebank.cardapplications.presentation.model.CardApplicationTypeData.StudentCardOrderData
            if (r2 == 0) goto L_0x001a
            r1 = r0
            ge.bog.mobilebank.cardapplications.presentation.model.CardApplicationTypeData$StudentCardOrderData r1 = (p341ge.bog.mobilebank.cardapplications.presentation.model.CardApplicationTypeData.StudentCardOrderData) r1
        L_0x001a:
            if (r1 == 0) goto L_0x0027
            java.util.List r0 = r1.mo39340i()
            if (r0 == 0) goto L_0x0027
            androidx.lifecycle.x r1 = r3.f37337Z
            m41.C37224b.m109965d(r1, r0)
        L_0x0027:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p412en.C12550j3.mo33202Xq():void");
    }

    /* renamed from: Yo */
    public LiveData mo33203Yo() {
        return this.f37354j0;
    }

    /* renamed from: Zh */
    public LiveData mo33204Zh() {
        return this.f37356k0;
    }

    /* renamed from: a0 */
    public LiveData mo33205a0() {
        return this.f37334W;
    }

    /* renamed from: e1 */
    public void mo33206e1(CardDailyLimitUiModel cardDailyLimitUiModel) {
        CardDailyLimitUiModel cardDailyLimitUiModel2 = cardDailyLimitUiModel;
        C41536l.m120489i(cardDailyLimitUiModel2, "cardDailyLimitUiModel");
        m47665Ix(C18833r.m63688b(m47723qx(), (C18815q.C18832q) null, (C18815q.C18819d) null, (C18815q.C18818c) null, (C18815q.C18828m) null, (C18815q.C18820e) null, (C18815q.C18826k) null, (C18815q.C18831p) null, (C18815q.C18827l) null, (C18815q.C18829n) null, (C18815q.C18822g) null, (C18815q.C18832q) null, (C18815q.C18832q) null, (C18815q.C18832q) null, (C18815q.C18832q) null, (C18815q.C18832q) null, (C18815q.C18825j) null, (C18815q.C18824i) null, (C18815q.C18816a) null, (C18815q.C18830o) null, C18815q.C18817b.m63608d(m47723qx().mo46762c(), cardDailyLimitUiModel2, false, false, 6, (Object) null), 524287, (Object) null));
    }

    /* renamed from: e8 */
    public LiveData mo33207e8() {
        return this.f37331T;
    }

    /* renamed from: ep */
    public LiveData mo33208ep() {
        return this.f37336Y;
    }

    /* renamed from: fg */
    public void mo33209fg() {
        long W1 = C5023l.m19556W1();
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(W1);
        instance.set(1, instance.get(1) - 18);
        long timeInMillis = instance.getTimeInMillis();
        C1644x xVar = this.f37344e0;
        CalendarConstraints.C4986b b = new CalendarConstraints.C4986b().mo16158e(DateValidatorPointBackward.m19406a(timeInMillis)).mo16155b(timeInMillis);
        Long e = m47723qx().mo46776o().mo46669a();
        if (e != null) {
            timeInMillis = e.longValue();
        }
        CalendarConstraints a = b.mo16156c(timeInMillis).mo16154a();
        C41536l.m120488h(a, "Builder()\n              …                 .build()");
        C37224b.m109965d(xVar, new C37586a(a, m47723qx().mo46776o().mo46669a()));
    }

    /* renamed from: fx */
    public final OrderDebitCardData mo33210fx() {
        return this.f37370x;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: m70.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: m70.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: m70.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: m70.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: gu */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo33211gu(long r37) {
        /*
            r36 = this;
            r0 = r36
            ge.bog.mobilebank.cardapplications.presentation.model.a r1 = r0.f37312A
            r2 = 0
            if (r1 != 0) goto L_0x000d
            java.lang.String r1 = "resources"
            kotlin.jvm.internal.C41536l.m120506z(r1)
            r1 = r2
        L_0x000d:
            java.util.List r1 = r1.mo39881c()
            java.util.Iterator r1 = r1.iterator()
        L_0x0015:
            boolean r3 = r1.hasNext()
            r4 = 0
            if (r3 == 0) goto L_0x0031
            java.lang.Object r3 = r1.next()
            r5 = r3
            m70.a r5 = (m70.C26148a) r5
            long r5 = r5.mo65087b()
            int r5 = (r5 > r37 ? 1 : (r5 == r37 ? 0 : -1))
            if (r5 != 0) goto L_0x002d
            r5 = 1
            goto L_0x002e
        L_0x002d:
            r5 = r4
        L_0x002e:
            if (r5 == 0) goto L_0x0015
            r2 = r3
        L_0x0031:
            r6 = r2
            m70.a r6 = (m70.C26148a) r6
            ge.bog.mobilebank.cardapplications.presentation.model.DebitCardCurrencyUiModel r1 = new ge.bog.mobilebank.cardapplications.presentation.model.DebitCardCurrencyUiModel
            if (r6 == 0) goto L_0x003e
            java.lang.String r2 = r6.mo65094h()
            if (r2 != 0) goto L_0x0040
        L_0x003e:
            java.lang.String r2 = "GEL"
        L_0x0040:
            r7 = 0
            r1.<init>(r2, r7)
            androidx.lifecycle.x r2 = r0.f37328Q
            java.util.List r3 = ie1.C41339p.m119900e(r1)
            r2.mo4823o(r3)
            xm.r r13 = r36.m47723qx()
            r14 = 0
            r15 = 0
            xm.q$c r5 = new xm.q$c
            r16 = r5
            r7 = 0
            r8 = 1
            r9 = 2
            r10 = 0
            r5.<init>(r6, r7, r8, r9, r10)
            r17 = 0
            xm.q$e r7 = new xm.q$e
            r18 = r7
            java.lang.Integer r9 = java.lang.Integer.valueOf(r4)
            r10 = 0
            r11 = 4
            r12 = 0
            r8 = r1
            r7.<init>(r8, r9, r10, r11, r12)
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 1048555(0xfffeb, float:1.469339E-39)
            r35 = 0
            xm.r r1 = p674xm.C18833r.m63688b(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            r0.m47665Ix(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p412en.C12550j3.mo33211gu(long):void");
    }

    /* renamed from: ht */
    public void mo33212ht() {
        C14235a aVar = this.f37312A;
        if (aVar == null) {
            C41536l.m120506z("resources");
            aVar = null;
        }
        List m = aVar.mo39893m();
        if (m != null) {
            C37224b.m109965d(this.f37329R, m);
        }
    }

    /* renamed from: i6 */
    public LiveData mo33213i6() {
        return this.f37342d0;
    }

    /* renamed from: jc */
    public void mo33214jc(String str, boolean z) {
        C18815q.C18824i iVar;
        DebitCardInsuranceTypeUiModel.NoInsurance noInsurance;
        Object obj;
        String str2 = str;
        if (str2 != null) {
            C14235a aVar = this.f37312A;
            if (aVar == null) {
                C41536l.m120506z("resources");
                aVar = null;
            }
            Iterator it = aVar.mo39890j().mo39956a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C41536l.m120484d(str2, ((DebitCardInsuranceTypeUiModel) obj).mo49682d())) {
                    break;
                }
            }
            iVar = C18815q.C18824i.m63639d(m47723qx().mo46770i(), (DebitCardInsuranceTypeUiModel) obj, false, 2, (Object) null);
        } else {
            C18815q.C18824i i = m47723qx().mo46770i();
            if (z) {
                noInsurance = DebitCardInsuranceTypeUiModel.NoInsurance.f56170d;
            } else {
                noInsurance = null;
            }
            iVar = C18815q.C18824i.m63639d(i, noInsurance, false, 2, (Object) null);
        }
        m47665Ix(C18833r.m63688b(m47723qx(), (C18815q.C18832q) null, (C18815q.C18819d) null, (C18815q.C18818c) null, (C18815q.C18828m) null, (C18815q.C18820e) null, (C18815q.C18826k) null, (C18815q.C18831p) null, (C18815q.C18827l) null, (C18815q.C18829n) null, (C18815q.C18822g) null, (C18815q.C18832q) null, (C18815q.C18832q) null, (C18815q.C18832q) null, (C18815q.C18832q) null, (C18815q.C18832q) null, (C18815q.C18825j) null, iVar, (C18815q.C18816a) null, (C18815q.C18830o) null, (C18815q.C18817b) null, 983039, (Object) null));
        if (z || str2 != null) {
            this.f37319H.onNext(C41238w.f97225a);
        }
    }

    /* renamed from: ko */
    public LiveData mo33215ko() {
        return this.f37335X;
    }

    /* renamed from: l */
    public void mo33216l() {
        C41238w wVar;
        C10516d e = this.f37323L.mo27237e();
        if (e != null) {
            C37224b.m109965d(this.f37331T, e);
            wVar = C41238w.f97225a;
        } else {
            wVar = null;
        }
        if (wVar == null) {
            C37224b.m109962a(this.f37333V);
        }
    }

    /* renamed from: l5 */
    public void mo33217l5() {
        C1644x xVar = this.f37339b0;
        C10099q qVar = this.f37347g;
        C14235a aVar = this.f37312A;
        if (aVar == null) {
            C41536l.m120506z("resources");
            aVar = null;
        }
        C37224b.m109965d(xVar, qVar.mo26576c(aVar.mo39883e()));
    }

    /* renamed from: mq */
    public void mo33218mq() {
        C1644x xVar = this.f37326O;
        C14235a aVar = this.f37312A;
        if (aVar == null) {
            C41536l.m120506z("resources");
            aVar = null;
        }
        C37224b.m109965d(xVar, aVar.mo39897q());
    }

    /* renamed from: nt */
    public LiveData mo33219nt() {
        return this.f37326O;
    }

    /* renamed from: oh */
    public void mo33220oh(long j) {
        C18811m mVar;
        C41224m Gx = m47661Gx(this, j);
        DebitCardDeliveryCityUiModel debitCardDeliveryCityUiModel = (DebitCardDeliveryCityUiModel) Gx.mo95675a();
        DebitCardDeliveryDistrictUiModel debitCardDeliveryDistrictUiModel = (DebitCardDeliveryDistrictUiModel) Gx.mo95676b();
        C14235a aVar = null;
        if (debitCardDeliveryCityUiModel == null || debitCardDeliveryDistrictUiModel == null) {
            mVar = null;
        } else {
            mVar = new C18811m(debitCardDeliveryDistrictUiModel, debitCardDeliveryCityUiModel);
        }
        C12330d dVar = C12330d.f36975a;
        C18833r qx = m47723qx();
        C14235a aVar2 = this.f37312A;
        if (aVar2 == null) {
            C41536l.m120506z("resources");
        } else {
            aVar = aVar2;
        }
        m47665Ix(dVar.mo32929i(qx, mVar, aVar.mo39883e()));
    }

    /* renamed from: p8 */
    public void mo33221p8(String str) {
        String str2 = str;
        C41536l.m120489i(str2, "lastName");
        m47665Ix(C18833r.m63688b(m47723qx(), (C18815q.C18832q) null, (C18815q.C18819d) null, (C18815q.C18818c) null, (C18815q.C18828m) null, (C18815q.C18820e) null, (C18815q.C18826k) null, (C18815q.C18831p) null, (C18815q.C18827l) null, (C18815q.C18829n) null, (C18815q.C18822g) null, (C18815q.C18832q) null, (C18815q.C18832q) null, C18815q.C18832q.m63681g(m47723qx().mo46778q(), str2, false, false, (C17799b) null, 14, (Object) null), (C18815q.C18832q) null, (C18815q.C18832q) null, (C18815q.C18825j) null, (C18815q.C18824i) null, (C18815q.C18816a) null, (C18815q.C18830o) null, (C18815q.C18817b) null, 1044479, (Object) null));
    }

    /* renamed from: pl */
    public LiveData mo33222pl() {
        return this.f37350h0;
    }

    /* renamed from: pm */
    public void mo33223pm(int i) {
        C14235a aVar = this.f37312A;
        if (aVar == null) {
            C41536l.m120506z("resources");
            aVar = null;
        }
        DebitCardPinDeliveryTypeUiModel debitCardPinDeliveryTypeUiModel = (DebitCardPinDeliveryTypeUiModel) C41358y.m120010Z(aVar.mo39894n(), i);
        if (debitCardPinDeliveryTypeUiModel != null) {
            C18815q.C18828m d = C18815q.C18828m.m63659d(m47723qx().mo46775n(), debitCardPinDeliveryTypeUiModel, Integer.valueOf(i), (C10515c) null, false, 12, (Object) null);
            m47665Ix(C18833r.m63688b(m47723qx(), (C18815q.C18832q) null, (C18815q.C18819d) null, (C18815q.C18818c) null, d, (C18815q.C18820e) null, m47690Vw(d), (C18815q.C18831p) null, (C18815q.C18827l) null, (C18815q.C18829n) null, (C18815q.C18822g) null, (C18815q.C18832q) null, (C18815q.C18832q) null, (C18815q.C18832q) null, (C18815q.C18832q) null, (C18815q.C18832q) null, (C18815q.C18825j) null, (C18815q.C18824i) null, (C18815q.C18816a) null, (C18815q.C18830o) null, (C18815q.C18817b) null, 1048535, (Object) null));
        }
    }

    /* renamed from: px */
    public final C12651r2 mo33224px() {
        return this.f37371y;
    }

    /* renamed from: q2 */
    public LiveData mo33225q2() {
        return this.f37327P;
    }

    /* renamed from: r */
    public void mo33226r() {
        DebitCardRegTypeUiModel e;
        C17085g0 b;
        C10516d d = this.f37323L.mo27236d();
        Object obj = null;
        if (d != null) {
            m47731vx(new C18784b.C18790f(this.f37323L.mo27230a().mo27240d() - 1, this.f37370x.mo39786f()));
            if (d.mo27239c() == C10515c.PICKUP_DETAILS) {
                C14235a aVar = this.f37312A;
                if (aVar == null) {
                    C41536l.m120506z("resources");
                    aVar = null;
                }
                if (!aVar.mo39886g().mo39786f()) {
                    C14235a aVar2 = this.f37312A;
                    if (aVar2 == null) {
                        C41536l.m120506z("resources");
                        aVar2 = null;
                    }
                    if (!(!aVar2.mo39882d().getCsFlag() || (e = m47723qx().mo46764e().mo46669a()) == null || (b = e.mo39595b()) == null)) {
                        this.f37318G.onNext(b);
                    }
                }
            }
            DebitCardRegTypeUiModel e2 = m47723qx().mo46764e().mo46669a();
            if (e2 != null) {
                obj = e2.mo39595b();
            }
            if (obj == C17085g0.NEW_ACCOUNT) {
                String lowerCase = C10464h.C10467c.NEW.name().toLowerCase(Locale.ROOT);
                C41536l.m120488h(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                C32343x.m95397J0(this, "Instant_Delivery", lowerCase, "choose_account_type", C10464h.C10465a.FIREBASE, (Bundle) null, 16, (Object) null);
            } else {
                String lowerCase2 = C10464h.C10467c.EXISTING.name().toLowerCase(Locale.ROOT);
                C41536l.m120488h(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                C32343x.m95397J0(this, "Instant_Delivery", lowerCase2, "choose_account_type", C10464h.C10465a.FIREBASE, (Bundle) null, 16, (Object) null);
            }
            if (d.mo27239c() == C10515c.SUMMARY) {
                this.f37319H.onNext(C41238w.f97225a);
            }
            C37224b.m109965d(this.f37330S, d);
            mo33191Hl();
            obj = C41238w.f97225a;
        }
        if (obj == null) {
            m47653Cx();
        }
    }

    /* renamed from: rf */
    public LiveData mo33227rf() {
        return this.f37346f0;
    }

    /* renamed from: rx */
    public HashMap mo33228rx(OtpParams otpParams) {
        C41536l.m120489i(otpParams, "otpParams");
        return this.f37369w.mo66809a(otpParams);
    }

    /* renamed from: sx */
    public final C12657s2 mo33229sx() {
        return this.f37372z;
    }

    /* renamed from: t1 */
    public void mo33230t1(boolean z) {
        m47665Ix(C18833r.m63688b(m47723qx(), (C18815q.C18832q) null, (C18815q.C18819d) null, (C18815q.C18818c) null, (C18815q.C18828m) null, (C18815q.C18820e) null, (C18815q.C18826k) null, (C18815q.C18831p) null, (C18815q.C18827l) null, (C18815q.C18829n) null, (C18815q.C18822g) null, (C18815q.C18832q) null, (C18815q.C18832q) null, (C18815q.C18832q) null, (C18815q.C18832q) null, (C18815q.C18832q) null, (C18815q.C18825j) null, (C18815q.C18824i) null, C18815q.C18816a.m63604d(m47723qx().mo46784v(), z, false, false, 6, (Object) null), (C18815q.C18830o) null, (C18815q.C18817b) null, 917503, (Object) null));
    }

    /* renamed from: u8 */
    public void mo33231u8(long j) {
        m47665Ix(C18833r.m63688b(m47723qx(), (C18815q.C18832q) null, (C18815q.C18819d) null, (C18815q.C18818c) null, (C18815q.C18828m) null, (C18815q.C18820e) null, (C18815q.C18826k) null, (C18815q.C18831p) null, (C18815q.C18827l) null, (C18815q.C18829n) null, (C18815q.C18822g) null, (C18815q.C18832q) null, (C18815q.C18832q) null, (C18815q.C18832q) null, (C18815q.C18832q) null, (C18815q.C18832q) null, C18815q.C18825j.m63643d(m47723qx().mo46776o(), Long.valueOf(j), false, false, 6, (Object) null), (C18815q.C18824i) null, (C18815q.C18816a) null, (C18815q.C18830o) null, (C18815q.C18817b) null, 1015807, (Object) null));
    }

    /* renamed from: va */
    public LiveData mo33232va() {
        return this.f37340c0;
    }

    /* renamed from: vu */
    public LiveData mo33233vu() {
        return this.f37329R;
    }

    /* renamed from: w2 */
    public LiveData mo33234w2() {
        return this.f37352i0;
    }

    /* renamed from: w5 */
    public LiveData mo33235w5() {
        return this.f37339b0;
    }

    /* renamed from: wa */
    public void mo33236wa() {
        this.f37322K.onNext(C41238w.f97225a);
    }

    /* renamed from: wp */
    public void mo33237wp(String str) {
        String str2 = str;
        C41536l.m120489i(str2, "address");
        m47665Ix(C18833r.m63688b(m47723qx(), (C18815q.C18832q) null, (C18815q.C18819d) null, (C18815q.C18818c) null, (C18815q.C18828m) null, (C18815q.C18820e) null, (C18815q.C18826k) null, (C18815q.C18831p) null, (C18815q.C18827l) null, (C18815q.C18829n) null, (C18815q.C18822g) null, C18815q.C18832q.m63681g(m47723qx().mo46767g(), str2, false, false, (C17799b) null, 14, (Object) null), (C18815q.C18832q) null, (C18815q.C18832q) null, (C18815q.C18832q) null, (C18815q.C18832q) null, (C18815q.C18825j) null, (C18815q.C18824i) null, (C18815q.C18816a) null, (C18815q.C18830o) null, (C18815q.C18817b) null, 1047551, (Object) null));
    }

    /* renamed from: y */
    public void mo33238y(int i) {
        C14235a aVar = this.f37312A;
        if (aVar == null) {
            C41536l.m120506z("resources");
            aVar = null;
        }
        DebitCardCurrencyUiModel debitCardCurrencyUiModel = (DebitCardCurrencyUiModel) C41358y.m120010Z(aVar.mo39885f(), i);
        if (debitCardCurrencyUiModel != null) {
            C18833r qx = m47723qx();
            C18815q.C18820e eVar = r2;
            C18815q.C18820e eVar2 = new C18815q.C18820e(debitCardCurrencyUiModel, Integer.valueOf(i), false, 4, (DefaultConstructorMarker) null);
            m47665Ix(C18833r.m63688b(qx, (C18815q.C18832q) null, (C18815q.C18819d) null, (C18815q.C18818c) null, (C18815q.C18828m) null, eVar, (C18815q.C18826k) null, (C18815q.C18831p) null, (C18815q.C18827l) null, (C18815q.C18829n) null, (C18815q.C18822g) null, (C18815q.C18832q) null, (C18815q.C18832q) null, (C18815q.C18832q) null, (C18815q.C18832q) null, (C18815q.C18832q) null, (C18815q.C18825j) null, (C18815q.C18824i) null, (C18815q.C18816a) null, (C18815q.C18830o) null, (C18815q.C18817b) null, 1048559, (Object) null));
        }
    }

    /* renamed from: y0 */
    public LiveData mo33239y0() {
        return this.f37348g0;
    }

    /* renamed from: zj */
    public LiveData mo33240zj() {
        return this.f37330S;
    }
}
