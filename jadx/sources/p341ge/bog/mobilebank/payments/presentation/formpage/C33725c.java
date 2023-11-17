package p341ge.bog.mobilebank.payments.presentation.formpage;

import android.content.Context;
import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import b41.C31128a;
import b41.C31132b;
import ba1.C10146d0;
import c41.C31270e;
import com.google.gson.Gson;
import cx0.C31456c;
import dy0.C31622e;
import e41.C31658b;
import ed1.C40749p;
import ed1.C40754t;
import ed1.C40762x;
import ee1.C40767b;
import ey0.C31880b;
import ey0.C31885f;
import ey0.C31886g;
import ey0.C31887h;
import ey0.C31888i;
import ey0.C31889j;
import ey0.C31890k;
import ey0.C31891l;
import ey0.C31892m;
import ey0.C31893n;
import ey0.C31894o;
import g91.C32289b0;
import g91.C32343x;
import g91.C32359z0;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41224m;
import he1.C41232r;
import he1.C41238w;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lx0.C37176a;
import lx0.C37180e;
import lx0.C37181f;
import mx0.C37287a;
import mx0.C37289c;
import mx0.C37292f;
import mx0.C37293g;
import nx0.C37497e;
import ox0.C37829b;
import ox0.C37833c;
import p316xa.C8982a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21503d;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.payments.data.model.CodeStatus;
import p341ge.bog.mobilebank.payments.data.model.FormOtpParams;
import p341ge.bog.mobilebank.payments.domain.model.KeyValue;
import p341ge.bog.mobilebank.payments.domain.model.PaymentPayParameter;
import p341ge.bog.mobilebank.payments.presentation.form.C33692a;
import p341ge.bog.mobilebank.payments.presentation.form.model.SelectElementViewData;
import p341ge.bog.mobilebank.payments.presentation.formpage.model.CommissionIdToParamsUiModel;
import p341ge.bog.mobilebank.rest.model.otpparameter.OtpParams;
import p341ge.bog.mobilebank.shared.helper.C34646b;
import p341ge.bog.mobilebank.shared.tmx_profiling.TMXFlags;
import s31.C38421a;
import s31.C38424d;
import ue1.C43075l;
import ue1.C43079p;
import ux0.C39112a;
import ux0.C39114b;
import ux0.C39148f0;
import ux0.C39150g0;
import ux0.C39152h0;
import ux0.C39154i0;
import ux0.C39157j0;
import ux0.C39160m;
import ux0.C39166q;

/* renamed from: ge.bog.mobilebank.payments.presentation.formpage.c */
public final class C33725c extends C21481a implements C33692a, C39114b, C39112a, C39150g0, C39157j0, C39152h0, C39154i0, C39148f0, C39166q, C39160m {
    /* access modifiers changed from: private */

    /* renamed from: A */
    public final C1644x f82152A;

    /* renamed from: B */
    private final C1644x f82153B;

    /* renamed from: C */
    private final C1644x f82154C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public final C1644x f82155D;

    /* renamed from: E */
    private final C1644x f82156E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public final C1644x f82157F;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public final C1644x f82158G;

    /* renamed from: H */
    private final C1644x f82159H;

    /* renamed from: I */
    private final C1644x f82160I;

    /* renamed from: J */
    private final C1644x f82161J;
    /* access modifiers changed from: private */

    /* renamed from: K */
    public final C1644x f82162K;

    /* renamed from: L */
    private final C40767b f82163L;
    /* access modifiers changed from: private */

    /* renamed from: M */
    public String f82164M;
    /* access modifiers changed from: private */

    /* renamed from: N */
    public AtomicReference f82165N;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public final C1644x f82166O;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public final C1644x f82167P;
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public final C1644x f82168Q;

    /* renamed from: R */
    private final C1644x f82169R;

    /* renamed from: S */
    private final C1644x f82170S;

    /* renamed from: T */
    private final C1644x f82171T;

    /* renamed from: d */
    private final Gson f82172d;

    /* renamed from: e */
    private final C37289c f82173e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C37293g f82174f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C37287a f82175g;

    /* renamed from: h */
    private final C37497e f82176h;

    /* renamed from: i */
    private final C31658b f82177i;

    /* renamed from: j */
    private final C37292f f82178j;

    /* renamed from: k */
    private final Client f82179k;

    /* renamed from: l */
    private final String f82180l;

    /* renamed from: m */
    private final String f82181m;

    /* renamed from: n */
    private final /* synthetic */ C39114b f82182n;

    /* renamed from: o */
    private final /* synthetic */ C39112a f82183o;

    /* renamed from: p */
    private final /* synthetic */ C39150g0 f82184p;

    /* renamed from: q */
    private final /* synthetic */ C39157j0 f82185q;

    /* renamed from: r */
    private final /* synthetic */ C39152h0 f82186r;

    /* renamed from: s */
    private final /* synthetic */ C39154i0 f82187s;

    /* renamed from: t */
    private final /* synthetic */ C39148f0 f82188t;

    /* renamed from: u */
    private final /* synthetic */ C39166q f82189u;

    /* renamed from: v */
    private final /* synthetic */ C39160m f82190v;

    /* renamed from: w */
    private final C33725c f82191w = this;

    /* renamed from: x */
    private final C33725c f82192x = this;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public final C1644x f82193y;

    /* renamed from: z */
    private final C1644x f82194z;

    /* renamed from: ge.bog.mobilebank.payments.presentation.formpage.c$a */
    public interface C33726a {
        /* renamed from: a */
        C33725c mo32537a(String str, String str2);
    }

    /* renamed from: ge.bog.mobilebank.payments.presentation.formpage.c$b */
    public /* synthetic */ class C33727b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f82195a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                ey0.b[] r0 = ey0.C31880b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ey0.b r1 = ey0.C31880b.ADDITIONAL_INFO_TO_GET     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                ey0.b r1 = ey0.C31880b.FINAL_PAGE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                ey0.b r1 = ey0.C31880b.FIRST_PAGE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f82195a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.payments.presentation.formpage.C33725c.C33727b.<clinit>():void");
        }
    }

    /* renamed from: ge.bog.mobilebank.payments.presentation.formpage.c$c */
    static final class C33728c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C33725c f82196d;

        /* renamed from: e */
        final /* synthetic */ C37181f f82197e;

        /* renamed from: f */
        final /* synthetic */ FormOtpParams f82198f;

        /* renamed from: g */
        final /* synthetic */ String f82199g;

        /* renamed from: h */
        final /* synthetic */ CodeStatus f82200h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33728c(C33725c cVar, C37181f fVar, FormOtpParams formOtpParams, String str, CodeStatus codeStatus) {
            super(1);
            this.f82196d = cVar;
            this.f82197e = fVar;
            this.f82198f = formOtpParams;
            this.f82199g = str;
            this.f82200h = codeStatus;
        }

        /* renamed from: a */
        public final void mo80395a(List list) {
            this.f82196d.m99143kx(list, this.f82197e, this.f82198f, this.f82199g, this.f82200h);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo80395a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.payments.presentation.formpage.c$d */
    static final class C33729d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C33725c f82201d;

        /* renamed from: e */
        final /* synthetic */ C37181f f82202e;

        /* renamed from: f */
        final /* synthetic */ FormOtpParams f82203f;

        /* renamed from: g */
        final /* synthetic */ String f82204g;

        /* renamed from: h */
        final /* synthetic */ CodeStatus f82205h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33729d(C33725c cVar, C37181f fVar, FormOtpParams formOtpParams, String str, CodeStatus codeStatus) {
            super(1);
            this.f82201d = cVar;
            this.f82202e = fVar;
            this.f82203f = formOtpParams;
            this.f82204g = str;
            this.f82205h = codeStatus;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            this.f82201d.m99143kx((List) null, this.f82202e, this.f82203f, this.f82204g, this.f82205h);
        }
    }

    /* renamed from: ge.bog.mobilebank.payments.presentation.formpage.c$e */
    static final class C33730e extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C33730e f82206d = new C33730e();

        C33730e() {
            super(1);
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "lst");
            ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C37180e eVar = (C37180e) it.next();
                String E = C32343x.m95386E(eVar.mo90191f(), true, new Object[0]);
                String valueOf = String.valueOf(eVar.mo90186b());
                String E2 = C32343x.m95386E(eVar.mo90189e(), true, new Object[0]);
                BigDecimal d = eVar.mo90188d();
                BigDecimal valueOf2 = BigDecimal.valueOf((long) 100);
                C41536l.m120488h(valueOf2, "valueOf(this.toLong())");
                BigDecimal divide = d.divide(valueOf2);
                C41536l.m120488h(divide, "it.packageAmount.divide(100.toBigDecimal())");
                arrayList.add(new SelectElementViewData(false, E, valueOf, E2, C32343x.m95408P(divide, "GEL"), C32289b0.m95091c(eVar.mo90185a()), eVar.mo90187c(), eVar.mo90192g()));
            }
            return arrayList;
        }
    }

    /* renamed from: ge.bog.mobilebank.payments.presentation.formpage.c$f */
    static final class C33731f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C33725c f82207d;

        /* renamed from: ge.bog.mobilebank.payments.presentation.formpage.c$f$a */
        static final class C33732a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C33725c f82208d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C33732a(C33725c cVar) {
                super(1);
                this.f82208d = cVar;
            }

            /* renamed from: a */
            public final void mo80399a(List list) {
                this.f82208d.m99139ix();
                this.f82208d.f82167P.mo4823o(list);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo80399a((List) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.payments.presentation.formpage.c$f$b */
        static final class C33733b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C33725c f82209d;

            /* renamed from: e */
            final /* synthetic */ C31128a f82210e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C33733b(C33725c cVar, C31128a aVar) {
                super(1);
                this.f82209d = cVar;
                this.f82210e = aVar;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                C41536l.m120489i(th, "it");
                this.f82209d.f82193y.mo4823o(this.f82210e);
            }
        }

        /* renamed from: ge.bog.mobilebank.payments.presentation.formpage.c$f$c */
        static final class C33734c extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C33725c f82211d;

            /* renamed from: e */
            final /* synthetic */ C31128a f82212e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C33734c(C33725c cVar, C31128a aVar) {
                super(1);
                this.f82211d = cVar;
                this.f82212e = aVar;
            }

            /* renamed from: a */
            public final void mo80401a(List list) {
                this.f82211d.f82193y.mo4823o(this.f82212e);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo80401a((List) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33731f(C33725c cVar) {
            super(1);
            this.f82207d = cVar;
        }

        /* renamed from: a */
        public final void mo80398a(C31128a aVar) {
            C41536l.m120488h(aVar, "res");
            C31132b.m92648j(aVar, (int[]) null, new C33732a(this.f82207d), 1, (Object) null);
            C31132b.m92643e(aVar, (int[]) null, new C33733b(this.f82207d, aVar), 1, (Object) null);
            C31132b.m92646h(aVar, (int[]) null, new C33734c(this.f82207d, aVar), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo80398a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.payments.presentation.formpage.c$g */
    public static final class C33735g extends C8982a<ArrayList<PaymentPayParameter>> {
        C33735g() {
        }
    }

    /* renamed from: ge.bog.mobilebank.payments.presentation.formpage.c$h */
    static final class C33736h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C33725c f82213d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33736h(C33725c cVar) {
            super(1);
            this.f82213d = cVar;
        }

        /* renamed from: a */
        public final void mo80402a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f82213d.f82168Q.mo4823o((Object) null);
            this.f82213d.f82157F.mo4823o((Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo80402a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.payments.presentation.formpage.c$i */
    static final class C33737i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C33725c f82214d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33737i(C33725c cVar) {
            super(1);
            this.f82214d = cVar;
        }

        /* renamed from: a */
        public final void mo80403a(C31622e eVar) {
            C41536l.m120489i(eVar, "it");
            this.f82214d.f82155D.mo4823o(C32343x.m95466m(eVar));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo80403a((C31622e) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.payments.presentation.formpage.c$j */
    static final class C33738j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C33725c f82215d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33738j(C33725c cVar) {
            super(1);
            this.f82215d = cVar;
        }

        /* renamed from: a */
        public final void mo80404a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f82215d.f82158G.mo4823o(C32343x.m95466m(wVar));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo80404a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.payments.presentation.formpage.c$k */
    static final class C33739k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C33725c f82216d;

        /* renamed from: ge.bog.mobilebank.payments.presentation.formpage.c$k$a */
        static final class C33740a extends C41537m implements C43075l {

            /* renamed from: d */
            public static final C33740a f82217d = new C33740a();

            C33740a() {
                super(1);
            }

            /* renamed from: a */
            public final void mo80406a(C31128a aVar) {
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo80406a((C31128a) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33739k(C33725c cVar) {
            super(1);
            this.f82216d = cVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final void m99262c(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        /* renamed from: b */
        public final void mo80405b(C41238w wVar) {
            C41205b F0;
            C41536l.m120489i(wVar, "it");
            C33725c cVar = this.f82216d;
            String uuid = UUID.randomUUID().toString();
            C41536l.m120488h(uuid, "randomUUID().toString()");
            cVar.f82164M = uuid;
            this.f82216d.f82162K.mo4826r((Object) null);
            C33725c cVar2 = this.f82216d;
            C40749p xu = cVar2.mo56547xu(cVar2.mo80378Ow());
            if (xu != null && (F0 = xu.mo94981F0(new C33755d(C33740a.f82217d))) != null) {
                this.f82216d.bindToLifecycle(F0);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo80405b((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.payments.presentation.formpage.c$l */
    static final class C33741l extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C33725c f82218d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33741l(C33725c cVar) {
            super(1);
            this.f82218d = cVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C1644x vw = this.f82218d.f82193y;
            C41536l.m120488h(th, "it");
            vw.mo4823o(new C31128a.C31129a(th, 0, (Object) null, 6, (DefaultConstructorMarker) null));
        }
    }

    /* renamed from: ge.bog.mobilebank.payments.presentation.formpage.c$m */
    static final class C33742m extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C33725c f82219d;

        /* renamed from: ge.bog.mobilebank.payments.presentation.formpage.c$m$a */
        static final class C33743a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C33725c f82220d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C33743a(C33725c cVar) {
                super(1);
                this.f82220d = cVar;
            }

            /* renamed from: a */
            public final void mo80409a(C41224m mVar) {
                C38424d d;
                C41536l.m120489i(mVar, "<name for destructuring parameter 0>");
                C38421a aVar = (C38421a) mVar.mo95675a();
                Object b = mVar.mo95676b();
                this.f82220d.f82152A.mo4823o(this.f82220d.mo56535s5().get());
                if (b instanceof List) {
                    this.f82220d.f82166O.mo4823o((List) b);
                }
                boolean z = false;
                if (!(aVar == null || (d = aVar.mo91950d()) == null || !C37829b.m111230q(d))) {
                    z = true;
                }
                if (!z || C37829b.m111229p(aVar.mo91950d())) {
                    this.f82220d.m99139ix();
                } else {
                    this.f82220d.m99129Vw();
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo80409a((C41224m) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.payments.presentation.formpage.c$m$b */
        static final class C33744b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C33725c f82221d;

            /* renamed from: e */
            final /* synthetic */ C31128a f82222e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C33744b(C33725c cVar, C31128a aVar) {
                super(1);
                this.f82221d = cVar;
                this.f82222e = aVar;
            }

            /* renamed from: a */
            public final void mo80410a(C41224m mVar) {
                this.f82221d.f82193y.mo4823o(this.f82222e);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo80410a((C41224m) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.payments.presentation.formpage.c$m$c */
        static final class C33745c extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C33725c f82223d;

            /* renamed from: e */
            final /* synthetic */ C31128a f82224e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C33745c(C33725c cVar, C31128a aVar) {
                super(1);
                this.f82223d = cVar;
                this.f82224e = aVar;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                C41536l.m120489i(th, "it");
                this.f82223d.f82152A.mo4823o((Object) null);
                this.f82223d.f82193y.mo4823o(this.f82224e);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33742m(C33725c cVar) {
            super(1);
            this.f82219d = cVar;
        }

        /* renamed from: a */
        public final void mo80408a(C31128a aVar) {
            C41536l.m120489i(aVar, "res");
            C31132b.m92648j(aVar, (int[]) null, new C33743a(this.f82219d), 1, (Object) null);
            C31132b.m92646h(aVar, (int[]) null, new C33744b(this.f82219d, aVar), 1, (Object) null);
            C31132b.m92643e(aVar, (int[]) null, new C33745c(this.f82219d, aVar), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo80408a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.payments.presentation.formpage.c$n */
    static final class C33746n extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C33725c f82225d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33746n(C33725c cVar) {
            super(1);
            this.f82225d = cVar;
        }

        /* renamed from: a */
        public final C40754t invoke(CommissionIdToParamsUiModel commissionIdToParamsUiModel) {
            C41536l.m120489i(commissionIdToParamsUiModel, "params");
            C40749p O = this.f82225d.f82175g.mo90397a(this.f82225d.mo56484C5(), commissionIdToParamsUiModel.getId(), commissionIdToParamsUiModel.getParams()).mo95075O();
            C41536l.m120488h(O, "calculateCommissionUseCa…         ).toObservable()");
            return C31270e.m92879h(O, 1);
        }
    }

    /* renamed from: ge.bog.mobilebank.payments.presentation.formpage.c$o */
    static final class C33747o extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C33725c f82226d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33747o(C33725c cVar) {
            super(1);
            this.f82226d = cVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x0041  */
        /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo80413a(b41.C31128a r6) {
            /*
                r5 = this;
                boolean r0 = r6 instanceof b41.C31128a.C31131c
                r1 = 0
                r2 = 0
                r3 = 1
                if (r0 == 0) goto L_0x002f
                ge.bog.mobilebank.payments.presentation.formpage.c r0 = r5.f82226d
                java.util.concurrent.atomic.AtomicReference r0 = r0.f82165N
                java.lang.Object r0 = r0.get()
                java.lang.Object r4 = r6.mo71340a()
                lx0.b r4 = (lx0.C37177b) r4
                if (r4 == 0) goto L_0x001e
                java.lang.String r4 = r4.mo90176c()
                goto L_0x001f
            L_0x001e:
                r4 = r2
            L_0x001f:
                boolean r0 = kotlin.jvm.internal.C41536l.m120484d(r0, r4)
                if (r0 == 0) goto L_0x002d
                ge.bog.mobilebank.payments.presentation.formpage.c r0 = r5.f82226d
                ey0.b r4 = ey0.C31880b.FINAL_PAGE
                r0.mo56494Kf(r4)
                goto L_0x0036
            L_0x002d:
                r0 = r1
                goto L_0x0037
            L_0x002f:
                ge.bog.mobilebank.payments.presentation.formpage.c r0 = r5.f82226d
                ey0.b r4 = ey0.C31880b.ADDITIONAL_INFO_TO_GET
                r0.mo56494Kf(r4)
            L_0x0036:
                r0 = r3
            L_0x0037:
                if (r0 == 0) goto L_0x006f
                ge.bog.mobilebank.payments.presentation.formpage.c r0 = r5.f82226d
                boolean r0 = r0.m99124Gw()
                if (r0 == 0) goto L_0x006f
                ge.bog.mobilebank.payments.presentation.formpage.c r0 = r5.f82226d
                boolean r4 = r6 instanceof b41.C31128a.C31130b
                r0.mo56520fd(r4, r1)
                ge.bog.mobilebank.payments.presentation.formpage.c r0 = r5.f82226d
                androidx.lifecycle.x r0 = r0.f82168Q
                r0.mo4823o(r6)
                ge.bog.mobilebank.payments.presentation.formpage.c r0 = r5.f82226d
                boolean r6 = r6 instanceof b41.C31128a.C31129a
                if (r6 == 0) goto L_0x0062
                ox0.c r6 = ox0.C37833c.f90838a
                ge.bog.mobilebank.shared.helper.StringSource$Dictionary r6 = r6.mo91163y()
                java.lang.String r6 = p341ge.bog.mobilebank.shared.helper.C34646b.m101752f(r6, r2, r3, r2)
                goto L_0x006c
            L_0x0062:
                ox0.c r6 = ox0.C37833c.f90838a
                ge.bog.mobilebank.shared.helper.StringSource$Dictionary r6 = r6.mo91115A()
                java.lang.String r6 = p341ge.bog.mobilebank.shared.helper.C34646b.m101752f(r6, r2, r3, r2)
            L_0x006c:
                r0.mo56521gp(r6)
            L_0x006f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.payments.presentation.formpage.C33725c.C33747o.mo80413a(b41.a):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo80413a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.payments.presentation.formpage.c$p */
    static final class C33748p extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C33725c f82227d;

        /* renamed from: ge.bog.mobilebank.payments.presentation.formpage.c$p$a */
        static final class C33749a extends C41537m implements C43079p {

            /* renamed from: d */
            final /* synthetic */ String f82228d;

            /* renamed from: e */
            final /* synthetic */ FormOtpParams f82229e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C33749a(String str, FormOtpParams formOtpParams) {
                super(2);
                this.f82228d = str;
                this.f82229e = formOtpParams;
            }

            /* renamed from: a */
            public final C41232r invoke(C37181f fVar, FormOtpParams formOtpParams) {
                C41536l.m120489i(fVar, "payData");
                C41536l.m120489i(formOtpParams, "<anonymous parameter 1>");
                return new C41232r(this.f82228d, fVar, this.f82229e);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33748p(C33725c cVar) {
            super(1);
            this.f82227d = cVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final C41232r m99271c(C43079p pVar, Object obj, Object obj2) {
            C41536l.m120489i(pVar, "$tmp0");
            return (C41232r) pVar.invoke(obj, obj2);
        }

        /* renamed from: b */
        public final C40754t invoke(C41224m mVar) {
            C41536l.m120489i(mVar, "<name for destructuring parameter 0>");
            FormOtpParams formOtpParams = (FormOtpParams) mVar.mo95676b();
            C37293g rw = this.f82227d.f82174f;
            HashMap Yc = this.f82227d.mo56511Yc(formOtpParams);
            Yc.put("tmxSessionId", C10146d0.C10177h.m37232a());
            C40749p d1 = C40749p.m118037d1(rw.mo90403a(Yc).mo95075O(), C40749p.m118043h0(formOtpParams), new C33756e(new C33749a((String) mVar.mo95675a(), formOtpParams)));
            C41536l.m120488h(d1, "customEssServiceID, para…params)\n                }");
            return C31270e.m92879h(d1, 1);
        }
    }

    /* renamed from: ge.bog.mobilebank.payments.presentation.formpage.c$q */
    static final class C33750q extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C33750q f82230d = new C33750q();

        C33750q() {
            super(1);
        }

        /* renamed from: a */
        public final C31128a invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            return new C31128a.C31129a(new Exception(th), 0, (Object) null, 6, (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.payments.presentation.formpage.c$r */
    static final class C33751r extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C33725c f82231d;

        /* renamed from: ge.bog.mobilebank.payments.presentation.formpage.c$r$a */
        static final class C33752a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C33725c f82232d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C33752a(C33725c cVar) {
                super(1);
                this.f82232d = cVar;
            }

            /* renamed from: a */
            public final void mo80418a(C41232r rVar) {
                this.f82232d.mo56494Kf(C31880b.ACTION_IN_PROGRESS);
                this.f82232d.mo56520fd(true, true);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo80418a((C41232r) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.payments.presentation.formpage.c$r$b */
        static final class C33753b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C33725c f82233d;

            /* renamed from: e */
            final /* synthetic */ C31128a f82234e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C33753b(C33725c cVar, C31128a aVar) {
                super(1);
                this.f82233d = cVar;
                this.f82234e = aVar;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                C41536l.m120489i(th, "it");
                this.f82233d.mo56513af();
                this.f82233d.mo56520fd(false, true);
                this.f82233d.f82162K.mo4823o(this.f82234e);
            }
        }

        /* renamed from: ge.bog.mobilebank.payments.presentation.formpage.c$r$c */
        static final class C33754c extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C33725c f82235d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C33754c(C33725c cVar) {
                super(1);
                this.f82235d = cVar;
            }

            /* renamed from: a */
            public final void mo80420a(C41232r rVar) {
                C33725c cVar = this.f82235d;
                Object e = rVar.mo95692e();
                C41536l.m120488h(e, "resp.second");
                cVar.m99147mx((C37181f) e, (FormOtpParams) rVar.mo95694f(), (String) rVar.mo95691d());
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo80420a((C41232r) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33751r(C33725c cVar) {
            super(1);
            this.f82231d = cVar;
        }

        /* renamed from: a */
        public final void mo80417a(C31128a aVar) {
            C41536l.m120488h(aVar, "result");
            C31132b.m92646h(aVar, (int[]) null, new C33752a(this.f82231d), 1, (Object) null);
            C31132b.m92643e(aVar, (int[]) null, new C33753b(this.f82231d, aVar), 1, (Object) null);
            C31132b.m92648j(aVar, (int[]) null, new C33754c(this.f82231d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo80417a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33725c(Gson gson, C37289c cVar, C37293g gVar, C37287a aVar, C37497e eVar, C31658b bVar, C37292f fVar, Client client, C39114b bVar2, C39112a aVar2, C39150g0 g0Var, C39157j0 j0Var, C39152h0 h0Var, C39154i0 i0Var, C39148f0 f0Var, C39166q qVar, C39160m mVar, String str, String str2) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        Gson gson2 = gson;
        C37289c cVar2 = cVar;
        C37293g gVar2 = gVar;
        C37287a aVar3 = aVar;
        C37497e eVar2 = eVar;
        C31658b bVar3 = bVar;
        C37292f fVar2 = fVar;
        Client client2 = client;
        C39114b bVar4 = bVar2;
        C39112a aVar4 = aVar2;
        C39150g0 g0Var2 = g0Var;
        C39166q qVar2 = qVar;
        C41536l.m120489i(gson2, "gson");
        C41536l.m120489i(cVar2, "getPaymentCardsUseCase");
        C41536l.m120489i(gVar2, "payUseCase");
        C41536l.m120489i(aVar3, "calculateCommissionUseCase");
        C41536l.m120489i(eVar2, "searchPaymentConfigTree");
        C41536l.m120489i(bVar3, "startTMXProfilingUseCase");
        C41536l.m120489i(fVar2, "getPaymentPackagesUseCase");
        C41536l.m120489i(client2, "client");
        C41536l.m120489i(bVar4, "finalActionDelegate");
        C41536l.m120489i(aVar4, "configVersionViewModelDelegate");
        C41536l.m120489i(g0Var2, "paymentConfigViewModelDelegate");
        C41536l.m120489i(j0Var, "templatesViewModelDelegate");
        C41536l.m120489i(h0Var, "savedValuesViewModelDelegate");
        C41536l.m120489i(i0Var, "scaStateViewModelDelegate");
        C41536l.m120489i(f0Var, "pageStateViewModelDelegate");
        C41536l.m120489i(qVar, "formStageViewModelDelegate");
        C41536l.m120489i(mVar, "formButtonViewDelegate");
        String str3 = str;
        C41536l.m120489i(str3, "paymentServiceId");
        String str4 = str2;
        C41536l.m120489i(str4, "pageInitialName");
        this.f82172d = gson2;
        this.f82173e = cVar2;
        this.f82174f = gVar2;
        this.f82175g = aVar3;
        this.f82176h = eVar2;
        this.f82177i = bVar3;
        this.f82178j = fVar2;
        this.f82179k = client2;
        this.f82180l = str3;
        this.f82181m = str4;
        this.f82182n = bVar4;
        this.f82183o = aVar4;
        this.f82184p = g0Var2;
        this.f82185q = j0Var;
        this.f82186r = h0Var;
        this.f82187s = i0Var;
        this.f82188t = f0Var;
        this.f82189u = qVar;
        this.f82190v = mVar;
        C1644x xVar = new C1644x();
        this.f82193y = xVar;
        this.f82194z = new C1644x();
        this.f82152A = new C1644x();
        this.f82153B = new C1644x();
        this.f82154C = new C1644x();
        this.f82155D = new C1644x();
        this.f82156E = new C1644x();
        this.f82157F = new C1644x();
        this.f82158G = new C1644x();
        this.f82159H = new C1644x();
        this.f82160I = new C1644x();
        this.f82161J = new C1644x();
        this.f82162K = new C1644x();
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<CommissionIdToParamsUiModel>()");
        this.f82163L = h1;
        String uuid = UUID.randomUUID().toString();
        C41536l.m120488h(uuid, "randomUUID().toString()");
        this.f82164M = uuid;
        this.f82165N = new AtomicReference("");
        this.f82166O = new C1644x();
        this.f82167P = new C1644x();
        this.f82168Q = new C1644x();
        this.f82169R = new C1644x();
        this.f82170S = new C1644x();
        this.f82171T = new C1644x();
        mo56505V4(str3, str4);
        xVar.mo4823o(new C31128a.C31130b(0, (Object) null, 3, (DefaultConstructorMarker) null));
        m99145lx(mo80394zf(mo56484C5(), "PAYMENTS_FORM_VERSION_SETTINGS", "PAYMENTS_FORM_DEFAULT_VERSION"));
    }

    /* access modifiers changed from: private */
    /* renamed from: Gw */
    public final boolean m99124Gw() {
        if (mo56526ku().get() == C31880b.ADDITIONAL_INFO_TO_GET || mo56526ku().get() == C31880b.FINAL_PAGE) {
            return true;
        }
        return false;
    }

    /* renamed from: Hw */
    private final void m99125Hw(C37181f fVar, FormOtpParams formOtpParams, String str, CodeStatus codeStatus) {
        C40762x P = C37497e.C37498a.m110424a(this.f82176h, mo56484C5(), (C31456c) null, true, 2, (Object) null).mo94996P();
        C41536l.m120488h(P, "searchPaymentConfigTree(…          .firstOrError()");
        C37181f fVar2 = fVar;
        FormOtpParams formOtpParams2 = formOtpParams;
        String str2 = str;
        CodeStatus codeStatus2 = codeStatus;
        C41205b I = C32343x.m95465l1(P).mo95070I(new C31887h(new C33728c(this, fVar2, formOtpParams2, str2, codeStatus2)), new C31888i(new C33729d(this, fVar2, formOtpParams2, str2, codeStatus2)));
        C41536l.m120488h(I, "private fun checkForConf…ndToLifecycle()\n        }");
        bindToLifecycle(I);
    }

    /* access modifiers changed from: private */
    /* renamed from: Iw */
    public static final void m99126Iw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Jw */
    public static final void m99127Jw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Kw */
    private final void m99128Kw() {
        bindToLifecycle(C31270e.m92876e(C32343x.m95413R0(C31270e.m92879h(mo56522j7(), -1)), this.f82194z));
    }

    /* access modifiers changed from: private */
    /* renamed from: Vw */
    public final void m99129Vw() {
        C40749p k0 = this.f82178j.mo90402a(mo56484C5()).mo95026k0(new C31885f(C33730e.f82206d));
        C41536l.m120488h(k0, "getPaymentPackagesUseCas…      }\n                }");
        C41205b F0 = C32343x.m95413R0(C31270e.m92879h(k0, -1)).mo94981F0(new C31886g(new C33731f(this)));
        C41536l.m120488h(F0, "private fun getPackages(…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: Ww */
    public static final List m99130Ww(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Xw */
    public static final void m99131Xw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: bx */
    private final List m99132bx() {
        return C41339p.m119900e(new KeyValue("essExtOperationId", this.f82164M));
    }

    /* access modifiers changed from: private */
    /* renamed from: ix */
    public final void m99139ix() {
        boolean z = true;
        mo56509Xb(true);
        C1644x xVar = this.f82171T;
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        Long l = this.f82179k.getUserInfo().getClient().birthDate;
        C41536l.m120488h(l, "client.userInfo.client.birthDate");
        if (timeInMillis - l.longValue() <= 567979200000L) {
            z = false;
        }
        xVar.mo4823o(Boolean.valueOf(z));
        m99128Kw();
        this.f82193y.mo4823o(new C31128a.C31131c(C41238w.f97225a, 0, 2, (DefaultConstructorMarker) null));
    }

    /* renamed from: jx */
    private final void m99141jx(String str, List list) {
        int i;
        C31880b bVar = (C31880b) mo56526ku().get();
        if (bVar == null) {
            i = -1;
        } else {
            i = C33727b.f82195a[bVar.ordinal()];
        }
        if (i == 1) {
            mo80374Fw(str, list);
            C32343x.m95379A0(this, "payment_form", "recalculate_commission", "click", mo56496Kk());
        } else if (i == 2) {
            C32343x.m95379A0(this, "payment_form", "pay", "click", mo56496Kk());
        } else if (i == 3) {
            C32343x.m95379A0(this, "payment_form", "next", "click", mo56496Kk());
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x01f5  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x01f8  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0208  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x020f  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x021a  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x021d  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0228  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x022b  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0251  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0258  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x026a  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0271  */
    /* renamed from: kx */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m99143kx(java.util.List r26, lx0.C37181f r27, p341ge.bog.mobilebank.payments.data.model.FormOtpParams r28, java.lang.String r29, p341ge.bog.mobilebank.payments.data.model.CodeStatus r30) {
        /*
            r25 = this;
            r0 = r25
            r1 = r29
            ge.bog.mobilebank.payments.presentation.formpage.c$g r2 = new ge.bog.mobilebank.payments.presentation.formpage.c$g
            r2.<init>()
            java.lang.reflect.Type r2 = r2.getType()
            com.google.gson.Gson r3 = r0.f82172d
            java.lang.String r4 = r28.getExecuteParameters()
            java.lang.Object r2 = r3.mo18171m(r4, r2)
            java.lang.String r3 = "gson.fromJson(otpParams.…cuteParameters, listType)"
            kotlin.jvm.internal.C41536l.m120488h(r2, r3)
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.lang.Object r2 = ie1.C41358y.m120009Y(r2)
            ge.bog.mobilebank.payments.domain.model.PaymentPayParameter r2 = (p341ge.bog.mobilebank.payments.domain.model.PaymentPayParameter) r2
            r3 = 0
            if (r2 == 0) goto L_0x002c
            java.util.List r2 = r2.mo80181a()
            goto L_0x002d
        L_0x002c:
            r2 = r3
        L_0x002d:
            if (r2 == 0) goto L_0x0051
            java.util.Iterator r4 = r2.iterator()
        L_0x0033:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x004d
            java.lang.Object r5 = r4.next()
            r6 = r5
            ge.bog.mobilebank.payments.domain.model.KeyValue r6 = (p341ge.bog.mobilebank.payments.domain.model.KeyValue) r6
            java.lang.String r6 = r6.mo80134a()
            java.lang.String r7 = "panMD5"
            boolean r6 = kotlin.jvm.internal.C41536l.m120484d(r6, r7)
            if (r6 == 0) goto L_0x0033
            goto L_0x004e
        L_0x004d:
            r5 = r3
        L_0x004e:
            ge.bog.mobilebank.payments.domain.model.KeyValue r5 = (p341ge.bog.mobilebank.payments.domain.model.KeyValue) r5
            goto L_0x0052
        L_0x0051:
            r5 = r3
        L_0x0052:
            androidx.lifecycle.x r4 = r0.f82166O
            java.lang.Object r4 = r4.mo4814f()
            java.util.List r4 = (java.util.List) r4
            if (r4 == 0) goto L_0x0084
            java.util.Iterator r4 = r4.iterator()
        L_0x0060:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x0080
            java.lang.Object r6 = r4.next()
            r7 = r6
            ge.bog.mobilebank.payments.domain.model.PaymentCard r7 = (p341ge.bog.mobilebank.payments.domain.model.PaymentCard) r7
            java.lang.String r7 = r7.mo80157k()
            if (r5 == 0) goto L_0x0078
            java.lang.String r8 = r5.mo80135b()
            goto L_0x0079
        L_0x0078:
            r8 = r3
        L_0x0079:
            boolean r7 = kotlin.jvm.internal.C41536l.m120484d(r7, r8)
            if (r7 == 0) goto L_0x0060
            goto L_0x0081
        L_0x0080:
            r6 = r3
        L_0x0081:
            ge.bog.mobilebank.payments.domain.model.PaymentCard r6 = (p341ge.bog.mobilebank.payments.domain.model.PaymentCard) r6
            goto L_0x0085
        L_0x0084:
            r6 = r3
        L_0x0085:
            java.util.concurrent.atomic.AtomicReference r4 = r25.mo56535s5()
            java.lang.Object r4 = r4.get()
            s31.a r4 = (s31.C38421a) r4
            r5 = 1
            r7 = 0
            if (r4 == 0) goto L_0x00e5
            s31.d r4 = r4.mo91950d()
            if (r4 == 0) goto L_0x00e5
            java.util.List r4 = r4.mo91979a()
            if (r4 == 0) goto L_0x00e5
            java.util.Iterator r4 = r4.iterator()
        L_0x00a3:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L_0x00e1
            java.lang.Object r8 = r4.next()
            r9 = r8
            s31.e r9 = (s31.C38425e) r9
            java.util.List r9 = r9.mo91985b()
            if (r9 == 0) goto L_0x00d8
            java.util.Iterator r9 = r9.iterator()
        L_0x00ba:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x00d4
            java.lang.Object r10 = r9.next()
            r11 = r10
            s31.b r11 = (s31.C38422b) r11
            java.lang.String r11 = r11.mo91969l()
            java.lang.String r12 = "amount"
            boolean r11 = kotlin.jvm.internal.C41536l.m120484d(r11, r12)
            if (r11 == 0) goto L_0x00ba
            goto L_0x00d5
        L_0x00d4:
            r10 = r3
        L_0x00d5:
            s31.b r10 = (s31.C38422b) r10
            goto L_0x00d9
        L_0x00d8:
            r10 = r3
        L_0x00d9:
            if (r10 == 0) goto L_0x00dd
            r9 = r5
            goto L_0x00de
        L_0x00dd:
            r9 = r7
        L_0x00de:
            if (r9 == 0) goto L_0x00a3
            goto L_0x00e2
        L_0x00e1:
            r8 = r3
        L_0x00e2:
            s31.e r8 = (s31.C38425e) r8
            goto L_0x00e6
        L_0x00e5:
            r8 = r3
        L_0x00e6:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            if (r2 == 0) goto L_0x00f0
            r4.addAll(r2)
        L_0x00f0:
            java.util.List r9 = r27.mo90195a()
            if (r9 == 0) goto L_0x0137
            java.lang.Object r9 = ie1.C41358y.m120009Y(r9)
            lx0.a r9 = (lx0.C37176a) r9
            if (r9 == 0) goto L_0x0137
            java.util.List r9 = r9.mo90169c()
            if (r9 == 0) goto L_0x0137
            java.util.Iterator r9 = r9.iterator()
        L_0x0108:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x0122
            java.lang.Object r10 = r9.next()
            r11 = r10
            ge.bog.mobilebank.payments.domain.model.KeyValue r11 = (p341ge.bog.mobilebank.payments.domain.model.KeyValue) r11
            java.lang.String r11 = r11.mo80134a()
            java.lang.String r12 = "paymentId"
            boolean r11 = kotlin.jvm.internal.C41536l.m120484d(r11, r12)
            if (r11 == 0) goto L_0x0108
            goto L_0x0123
        L_0x0122:
            r10 = r3
        L_0x0123:
            ge.bog.mobilebank.payments.domain.model.KeyValue r10 = (p341ge.bog.mobilebank.payments.domain.model.KeyValue) r10
            if (r10 == 0) goto L_0x0137
            ge.bog.mobilebank.payments.domain.model.KeyValue r9 = new ge.bog.mobilebank.payments.domain.model.KeyValue
            java.lang.String r11 = r10.mo80134a()
            java.lang.String r10 = r10.mo80135b()
            r9.<init>(r11, r10)
            r4.add(r9)
        L_0x0137:
            java.util.concurrent.atomic.AtomicReference r9 = r25.mo56535s5()
            java.lang.Object r9 = r9.get()
            s31.a r9 = (s31.C38421a) r9
            if (r9 == 0) goto L_0x0148
            java.lang.String r9 = r9.mo91953f()
            goto L_0x0149
        L_0x0148:
            r9 = r3
        L_0x0149:
            java.lang.Object[] r10 = new java.lang.Object[r7]
            java.lang.String r9 = g91.C32343x.m95386E(r9, r5, r10)
            if (r1 == 0) goto L_0x019d
            int r10 = r29.length()
            if (r10 <= 0) goto L_0x0158
            goto L_0x0159
        L_0x0158:
            r5 = r7
        L_0x0159:
            if (r5 == 0) goto L_0x019d
            androidx.lifecycle.x r5 = r0.f82167P
            java.lang.Object r5 = r5.mo4814f()
            java.util.List r5 = (java.util.List) r5
            if (r5 == 0) goto L_0x019d
            java.lang.String r10 = "lst"
            kotlin.jvm.internal.C41536l.m120488h(r5, r10)
            java.util.Iterator r5 = r5.iterator()
        L_0x016e:
            boolean r10 = r5.hasNext()
            if (r10 == 0) goto L_0x019d
            java.lang.Object r10 = r5.next()
            ge.bog.mobilebank.payments.presentation.form.model.SelectElementViewData r10 = (p341ge.bog.mobilebank.payments.presentation.form.model.SelectElementViewData) r10
            java.lang.String r11 = r10.mo80346f()
            boolean r11 = kotlin.jvm.internal.C41536l.m120484d(r11, r1)
            if (r11 == 0) goto L_0x016e
            java.lang.String r10 = r10.mo80348h()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r9)
            java.lang.String r9 = " - "
            r11.append(r9)
            r11.append(r10)
            java.lang.String r9 = r11.toString()
            goto L_0x016e
        L_0x019d:
            r13 = r9
            java.util.List r1 = r27.mo90195a()
            if (r1 == 0) goto L_0x01b2
            java.lang.Object r1 = ie1.C41358y.m120009Y(r1)
            lx0.a r1 = (lx0.C37176a) r1
            if (r1 == 0) goto L_0x01b2
            java.lang.String r1 = r1.mo90168b()
            r12 = r1
            goto L_0x01b3
        L_0x01b2:
            r12 = r3
        L_0x01b3:
            java.util.concurrent.atomic.AtomicReference r1 = r25.mo56535s5()
            java.lang.Object r1 = r1.get()
            s31.a r1 = (s31.C38421a) r1
            if (r1 == 0) goto L_0x01ca
            java.lang.String r1 = r1.mo91948b()
            if (r1 == 0) goto L_0x01ca
            java.lang.String r1 = g91.C32289b0.m95091c(r1)
            goto L_0x01cb
        L_0x01ca:
            r1 = r3
        L_0x01cb:
            java.lang.String r5 = ""
            if (r1 != 0) goto L_0x01d1
            r14 = r5
            goto L_0x01d2
        L_0x01d1:
            r14 = r1
        L_0x01d2:
            if (r2 == 0) goto L_0x01eb
            java.util.concurrent.atomic.AtomicReference r1 = r25.mo56535s5()
            java.lang.Object r1 = r1.get()
            s31.a r1 = (s31.C38421a) r1
            if (r1 == 0) goto L_0x01e5
            java.lang.String r1 = ox0.C37829b.m111220g(r1, r2)
            goto L_0x01e6
        L_0x01e5:
            r1 = r3
        L_0x01e6:
            if (r1 != 0) goto L_0x01e9
            goto L_0x01eb
        L_0x01e9:
            r15 = r1
            goto L_0x01ec
        L_0x01eb:
            r15 = r5
        L_0x01ec:
            if (r8 == 0) goto L_0x01f8
            java.lang.String r1 = r8.mo91984a()
            if (r1 != 0) goto L_0x01f5
            goto L_0x01f8
        L_0x01f5:
            r16 = r1
            goto L_0x01fa
        L_0x01f8:
            r16 = r5
        L_0x01fa:
            if (r6 == 0) goto L_0x020f
            ge.bog.mobilebank.payments.domain.model.CardImage r1 = r6.mo80153h()
            if (r1 == 0) goto L_0x020f
            java.lang.String r1 = r1.mo80115a()
            if (r1 == 0) goto L_0x020f
            java.lang.String r1 = g91.C32289b0.m95091c(r1)
            r17 = r1
            goto L_0x0211
        L_0x020f:
            r17 = r3
        L_0x0211:
            if (r6 == 0) goto L_0x021d
            java.lang.String r1 = r6.mo80146b()
            if (r1 != 0) goto L_0x021a
            goto L_0x021d
        L_0x021a:
            r18 = r1
            goto L_0x021f
        L_0x021d:
            r18 = r5
        L_0x021f:
            if (r6 == 0) goto L_0x022b
            java.lang.String r1 = r6.mo80156j()
            if (r1 != 0) goto L_0x0228
            goto L_0x022b
        L_0x0228:
            r19 = r1
            goto L_0x022d
        L_0x022b:
            r19 = r5
        L_0x022d:
            java.util.List r1 = r27.mo90195a()
            if (r1 == 0) goto L_0x023f
            java.lang.Object r1 = ie1.C41358y.m120009Y(r1)
            lx0.a r1 = (lx0.C37176a) r1
            if (r1 == 0) goto L_0x023f
            java.lang.Long r3 = r1.mo90170d()
        L_0x023f:
            r20 = r3
            if (r26 == 0) goto L_0x0258
            java.lang.Object r1 = ie1.C41358y.m120009Y(r26)
            cx0.c r1 = (cx0.C31456c) r1
            if (r1 == 0) goto L_0x0258
            cx0.a r1 = r1.mo71852c()
            if (r1 == 0) goto L_0x0258
            boolean r1 = r1.mo71843y()
            r21 = r1
            goto L_0x025a
        L_0x0258:
            r21 = r7
        L_0x025a:
            if (r26 == 0) goto L_0x0271
            java.lang.Object r1 = ie1.C41358y.m120009Y(r26)
            cx0.c r1 = (cx0.C31456c) r1
            if (r1 == 0) goto L_0x0271
            cx0.a r1 = r1.mo71852c()
            if (r1 == 0) goto L_0x0271
            boolean r1 = r1.mo71841w()
            r22 = r1
            goto L_0x0273
        L_0x0271:
            r22 = r7
        L_0x0273:
            if (r26 == 0) goto L_0x0287
            java.lang.Object r1 = ie1.C41358y.m120009Y(r26)
            cx0.c r1 = (cx0.C31456c) r1
            if (r1 == 0) goto L_0x0287
            cx0.a r1 = r1.mo71852c()
            if (r1 == 0) goto L_0x0287
            boolean r7 = r1.mo71842x()
        L_0x0287:
            r23 = r7
            ge.bog.mobilebank.payments.domain.model.PaymentPayParameter r1 = new ge.bog.mobilebank.payments.domain.model.PaymentPayParameter
            java.lang.String r2 = r25.mo56484C5()
            r1.<init>(r2, r4)
            ge.bog.mobilebank.payments.presentation.resultpage.model.PaymentResultObjectUiModel r2 = new ge.bog.mobilebank.payments.presentation.resultpage.model.PaymentResultObjectUiModel
            r10 = r2
            r11 = r30
            r24 = r1
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            androidx.lifecycle.x r1 = r0.f82169R
            r1.mo4823o(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.payments.presentation.formpage.C33725c.m99143kx(java.util.List, lx0.f, ge.bog.mobilebank.payments.data.model.FormOtpParams, java.lang.String, ge.bog.mobilebank.payments.data.model.CodeStatus):void");
    }

    /* renamed from: lx */
    private final void m99145lx(boolean z) {
        if (z) {
            m99149nx();
            m99155qx();
            m99151ox();
            return;
        }
        this.f82170S.mo4823o(mo56484C5());
    }

    /* access modifiers changed from: private */
    /* renamed from: mx */
    public final void m99147mx(C37181f fVar, FormOtpParams formOtpParams, String str) {
        C37176a aVar;
        CodeStatus a;
        List a2 = fVar.mo90195a();
        if (a2 != null && (aVar = (C37176a) C41358y.m120009Y(a2)) != null && (a = aVar.mo90167a()) != null) {
            m99125Hw(fVar, formOtpParams, str, a);
        }
    }

    /* renamed from: nx */
    private final void m99149nx() {
        bindToLifecycle(this.f82177i.mo72084b(TMXFlags.TMX_FLAG_UTILITY_PAY));
    }

    /* renamed from: ox */
    private final void m99151ox() {
        bindToLifecycle(C39166q.C39167a.m114286a(this, mo56504Tv(), this.f82161J, (C43075l) null, 4, (Object) null));
        bindToLifecycle(mo56543we(mo56500Pp(), (C1644x) null, new C33736h(this)));
        bindToLifecycle(C39166q.C39167a.m114286a(this, mo56502Rb(), this.f82160I, (C43075l) null, 4, (Object) null));
        bindToLifecycle(mo56532qe(this.f82157F, C34646b.m101752f(C37833c.f90838a.mo91115A(), (Context) null, 1, (Object) null)));
        bindToLifecycle(C39166q.C39167a.m114286a(this, mo56480B4(), this.f82154C, (C43075l) null, 4, (Object) null));
        bindToLifecycle(C39166q.C39167a.m114286a(this, mo56519eu(), this.f82156E, (C43075l) null, 4, (Object) null));
        bindToLifecycle(mo56543we(mo56488Gr(), (C1644x) null, new C33737i(this)));
        bindToLifecycle(mo56543we(mo56490Hf(), (C1644x) null, new C33738j(this)));
        bindToLifecycle(C39166q.C39167a.m114286a(this, mo56485Cb(), this.f82159H, (C43075l) null, 4, (Object) null));
        bindToLifecycle(C39166q.C39167a.m114286a(this, mo56483Bh(), this.f82153B, (C43075l) null, 4, (Object) null));
        bindToLifecycle(mo56543we(mo56499Pi(), (C1644x) null, new C33739k(this)));
        C40749p<Integer> onInit = onInit();
        C40749p<Integer> onRefresh = onRefresh();
        C40749p C = this.f82173e.mo90399a(C41339p.m119900e(mo56484C5())).mo95075O().mo94974C(new C31892m(new C33741l(this)));
        C41536l.m120488h(C, "private fun subscribeDel…dToLifecycle()\n\n        }");
        bindToLifecycle(mo56497Mb(onInit, onRefresh, C, this.f82152A, new C33742m(this)));
    }

    /* access modifiers changed from: private */
    /* renamed from: px */
    public static final void m99153px(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: qx */
    private final void m99155qx() {
        m99157rx();
        m99163ux();
    }

    /* renamed from: rx */
    private final void m99157rx() {
        C40749p L0 = this.f82163L.mo95032s(500, TimeUnit.MILLISECONDS).mo94989L0(new C31893n(new C33746n(this)));
        C41536l.m120488h(L0, "private fun subscribeToC…ndToLifecycle()\n        }");
        C41205b F0 = C32343x.m95413R0(L0).mo94981F0(new C31894o(new C33747o(this)));
        C41536l.m120488h(F0, "private fun subscribeToC…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: sx */
    public static final C40754t m99159sx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: tx */
    public static final void m99161tx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: ux */
    private final void m99163ux() {
        C40749p L0 = mo56493J7().mo94989L0(new C31889j(new C33748p(this)));
        C41536l.m120488h(L0, "private fun subscribeToP…ndToLifecycle()\n        }");
        C41205b F0 = C32343x.m95462k1(L0).mo95035t0(new C31890k(C33750q.f82230d)).mo94981F0(new C31891l(new C33751r(this)));
        C41536l.m120488h(F0, "private fun subscribeToP…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: vx */
    public static final void m99165vx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: wx */
    public static final C40754t m99167wx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: xx */
    public static final C31128a m99169xx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C31128a) lVar.invoke(obj);
    }

    /* renamed from: A */
    public void mo56479A(C31622e eVar) {
        C41536l.m120489i(eVar, "template");
        mo56549y9(eVar);
    }

    /* renamed from: B4 */
    public C40749p mo56480B4() {
        return this.f82190v.mo56480B4();
    }

    /* renamed from: Bg */
    public void mo56482Bg() {
        int i;
        C31880b bVar = (C31880b) mo56526ku().get();
        if (bVar == null) {
            i = -1;
        } else {
            i = C33727b.f82195a[bVar.ordinal()];
        }
        if (i == 1 || i == 2 || i == 3) {
            mo56509Xb(false);
        }
    }

    /* renamed from: Bh */
    public C40749p mo56483Bh() {
        return this.f82187s.mo56483Bh();
    }

    /* renamed from: C5 */
    public String mo56484C5() {
        return this.f82184p.mo56484C5();
    }

    /* renamed from: Cb */
    public C40749p mo56485Cb() {
        return this.f82186r.mo56485Cb();
    }

    /* renamed from: Fw */
    public void mo80374Fw(String str, List list) {
        C41536l.m120489i(str, "amount");
        C41536l.m120489i(list, "paramList");
        if (m99124Gw()) {
            mo56520fd(true, false);
            this.f82165N.set(C32359z0.m95563d0());
            String d = C37829b.m111217d(str);
            C40767b bVar = this.f82163L;
            Object obj = this.f82165N.get();
            C41536l.m120488h(obj, "commissionUniqueId.get()");
            List B0 = C41358y.m119991B0(list);
            B0.add(new KeyValue("amount", d));
            C41238w wVar = C41238w.f97225a;
            bVar.onNext(new CommissionIdToParamsUiModel((String) obj, B0));
        }
    }

    /* renamed from: Gr */
    public C40749p mo56488Gr() {
        return this.f82185q.mo56488Gr();
    }

    /* renamed from: H1 */
    public void mo56489H1() {
        this.f82190v.mo56489H1();
    }

    /* renamed from: Hf */
    public C40749p mo56490Hf() {
        return this.f82190v.mo56490Hf();
    }

    /* renamed from: Hq */
    public void mo56491Hq(String str, List list, List list2) {
        C41536l.m120489i(str, "amount");
        C41536l.m120489i(list, "paramList");
        C41536l.m120489i(list2, "formValues");
        mo56495Kj(str, list, list2);
        m99141jx(str, list);
    }

    /* renamed from: J7 */
    public C40749p mo56493J7() {
        return this.f82182n.mo56493J7();
    }

    /* renamed from: Kf */
    public void mo56494Kf(C31880b bVar) {
        C41536l.m120489i(bVar, "stage");
        this.f82189u.mo56494Kf(bVar);
    }

    /* renamed from: Kj */
    public void mo56495Kj(String str, List list, List list2) {
        C41536l.m120489i(str, "amount");
        C41536l.m120489i(list, "paramList");
        C41536l.m120489i(list2, "formValues");
        this.f82190v.mo56495Kj(str, list, list2);
    }

    /* renamed from: Kk */
    public String mo56496Kk() {
        return mo56514aj();
    }

    /* renamed from: Lw */
    public C1644x mo80375Lw() {
        return this.f82171T;
    }

    /* renamed from: Mb */
    public C41205b mo56497Mb(C40749p pVar, C40749p pVar2, C40749p pVar3, C1644x xVar, C43075l lVar) {
        C41536l.m120489i(pVar, "initObservable");
        C41536l.m120489i(pVar2, "refreshObservable");
        C41536l.m120489i(pVar3, "getDataObservable");
        C41536l.m120489i(xVar, "configResultLiveData");
        C41536l.m120489i(lVar, "onResult");
        return this.f82184p.mo56497Mb(pVar, pVar2, pVar3, xVar, lVar);
    }

    /* renamed from: Mw */
    public C1644x mo80376Mw() {
        return this.f82168Q;
    }

    /* renamed from: Nw */
    public C1644x mo56546xj() {
        return this.f82162K;
    }

    /* renamed from: Ow */
    public String mo80378Ow() {
        return "PAYMENTS_BATCH_EXECUTE_NEW";
    }

    /* renamed from: P5 */
    public LiveData mo56498P5() {
        return this.f82159H;
    }

    /* renamed from: Pi */
    public C40749p mo56499Pi() {
        return this.f82182n.mo56499Pi();
    }

    /* renamed from: Pp */
    public C40749p mo56500Pp() {
        return this.f82189u.mo56500Pp();
    }

    /* renamed from: Pw */
    public C1644x mo56487Da() {
        return this.f82161J;
    }

    /* renamed from: Qw */
    public C1644x mo56541v9() {
        return this.f82193y;
    }

    /* renamed from: R1 */
    public void mo56501R1(List list) {
        C41536l.m120489i(list, "formValues");
        this.f82186r.mo56501R1(list);
    }

    /* renamed from: Rb */
    public C40749p mo56502Rb() {
        return this.f82189u.mo56502Rb();
    }

    /* renamed from: Rw */
    public final C33725c mo80381Rw() {
        return this.f82191w;
    }

    /* renamed from: Sw */
    public C1644x mo56510Xk() {
        return this.f82156E;
    }

    /* renamed from: Tu */
    public boolean mo56503Tu() {
        return mo56508Wv();
    }

    /* renamed from: Tv */
    public C40749p mo56504Tv() {
        return this.f82188t.mo56504Tv();
    }

    /* renamed from: Tw */
    public C1644x mo56481Bd() {
        return this.f82154C;
    }

    /* renamed from: Uw */
    public final C33725c mo80384Uw() {
        return this.f82192x;
    }

    /* renamed from: V4 */
    public void mo56505V4(String str, String str2) {
        C41536l.m120489i(str, "servId");
        C41536l.m120489i(str2, "pageTitle");
        this.f82184p.mo56505V4(str, str2);
    }

    /* renamed from: W3 */
    public HashMap mo56506W3(List list, String str) {
        C41536l.m120489i(list, "keyValues");
        String Ow = mo80378Ow();
        List B0 = C41358y.m119991B0(m99132bx());
        B0.addAll(list);
        C41238w wVar = C41238w.f97225a;
        HashMap Yc = mo56511Yc(C39154i0.C39155a.m114239a(this, Ow, (String) null, (String) null, (String) null, str, B0, 14, (Object) null));
        Yc.put("tmxSessionId", C10146d0.C10177h.m37232a());
        return Yc;
    }

    /* renamed from: Wv */
    public boolean mo56508Wv() {
        return this.f82184p.mo56508Wv();
    }

    /* renamed from: Xb */
    public void mo56509Xb(boolean z) {
        this.f82189u.mo56509Xb(z);
    }

    /* renamed from: Yc */
    public HashMap mo56511Yc(OtpParams otpParams) {
        C41536l.m120489i(otpParams, "otpParams");
        return this.f82187s.mo56511Yc(otpParams);
    }

    /* renamed from: Yr */
    public void mo56512Yr(List list) {
        C41536l.m120489i(list, "formValues");
        this.f82186r.mo56512Yr(list);
    }

    /* renamed from: Yw */
    public C1644x mo80385Yw() {
        return this.f82167P;
    }

    /* renamed from: Zw */
    public C1644x mo80386Zw() {
        return this.f82166O;
    }

    /* renamed from: af */
    public void mo56513af() {
        this.f82182n.mo56513af();
    }

    /* renamed from: aj */
    public String mo56514aj() {
        return this.f82184p.mo56514aj();
    }

    /* renamed from: ax */
    public C1644x mo56486Ce() {
        return this.f82152A;
    }

    /* renamed from: bs */
    public void mo56515bs() {
        mo56516c();
    }

    /* renamed from: c */
    public void mo56516c() {
        this.f82184p.mo56516c();
    }

    /* renamed from: cq */
    public void mo56517cq(C21503d dVar, String str, String str2, String str3, String str4, String str5, List list) {
        C41536l.m120489i(str, "otpServiceId");
        this.f82187s.mo56517cq(dVar, str, str2, str3, str4, str5, list);
    }

    /* renamed from: cx */
    public C1644x mo80388cx() {
        return this.f82169R;
    }

    /* renamed from: dx */
    public C1644x mo56492I2() {
        return this.f82153B;
    }

    /* renamed from: ed */
    public LiveData mo56518ed() {
        return this.f82160I;
    }

    /* renamed from: eu */
    public C40749p mo56519eu() {
        return this.f82190v.mo56519eu();
    }

    /* renamed from: ex */
    public C1644x mo56507Wl() {
        return this.f82157F;
    }

    /* renamed from: fd */
    public void mo56520fd(boolean z, boolean z2) {
        this.f82188t.mo56520fd(z, z2);
    }

    /* renamed from: fx */
    public C1644x mo80391fx() {
        return this.f82170S;
    }

    /* renamed from: gp */
    public void mo56521gp(String str) {
        this.f82190v.mo56521gp(str);
    }

    /* renamed from: gx */
    public C1644x mo56537si() {
        return this.f82155D;
    }

    /* renamed from: hx */
    public C1644x mo56523jn() {
        return this.f82194z;
    }

    /* renamed from: j7 */
    public C40749p mo56522j7() {
        return this.f82185q.mo56522j7();
    }

    /* renamed from: ju */
    public void mo56524ju(List list) {
        C41536l.m120489i(list, "formValues");
        mo56512Yr(list);
    }

    /* renamed from: k5 */
    public FormOtpParams mo56525k5(String str, String str2, String str3, String str4, String str5, List list) {
        C41536l.m120489i(str, "otpServiceId");
        return this.f82187s.mo56525k5(str, str2, str3, str4, str5, list);
    }

    /* renamed from: ku */
    public AtomicReference mo56526ku() {
        return this.f82189u.mo56526ku();
    }

    /* renamed from: ml */
    public List mo56527ml() {
        return mo56529ok();
    }

    /* renamed from: ok */
    public List mo56529ok() {
        return this.f82186r.mo56529ok();
    }

    /* renamed from: qe */
    public C41205b mo56532qe(C1644x xVar, String str) {
        C41536l.m120489i(xVar, "paymentDebtLiveData");
        C41536l.m120489i(str, "buttonText");
        return this.f82184p.mo56532qe(xVar, str);
    }

    /* renamed from: s5 */
    public AtomicReference mo56535s5() {
        return this.f82184p.mo56535s5();
    }

    /* renamed from: sc */
    public void mo56536sc(C21503d dVar, String str, String str2, String str3, String str4, List list) {
        List list2;
        String Ow = mo80378Ow();
        if (list == null || (list2 = C41358y.m119991B0(list)) == null) {
            list2 = null;
        } else {
            list2.addAll(m99132bx());
            C41238w wVar = C41238w.f97225a;
        }
        mo56517cq(dVar, Ow, str, str2, str3, str4, list2);
    }

    /* renamed from: we */
    public C41205b mo56543we(C40749p pVar, C1644x xVar, C43075l lVar) {
        C41536l.m120489i(pVar, "observable");
        return this.f82189u.mo56543we(pVar, xVar, lVar);
    }

    /* renamed from: wm */
    public LiveData mo56544wm() {
        return this.f82158G;
    }

    /* renamed from: xu */
    public C40749p mo56547xu(String str) {
        C41536l.m120489i(str, "finalService");
        return this.f82182n.mo56547xu(str);
    }

    /* renamed from: y9 */
    public void mo56549y9(C31622e eVar) {
        C41536l.m120489i(eVar, "template");
        this.f82185q.mo56549y9(eVar);
    }

    /* renamed from: zf */
    public boolean mo80394zf(String str, String str2, String str3) {
        C41536l.m120489i(str, "serviceID");
        C41536l.m120489i(str2, "settingsKey");
        C41536l.m120489i(str3, "minVersionKey");
        return this.f82183o.mo80394zf(str, str2, str3);
    }
}
