package p341ge.bog.mobilebank.consumerloanapplication.presentation.result;

import android.os.Bundle;
import androidx.lifecycle.C1644x;
import b41.C31128a;
import b41.C31132b;
import c41.C31270e;
import com.salesforce.marketingcloud.UrlHandler;
import ed1.C40749p;
import ed1.C40754t;
import ee1.C40767b;
import g91.C32343x;
import h00.C24846c;
import h90.C24920a;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41232r;
import he1.C41233s;
import he1.C41238w;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import k90.C25688c;
import k90.C25689d;
import k90.C25690e;
import k90.C25691f;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import n90.C26381a;
import n90.C26390b;
import p341ge.bog.designsystem.components.common.Color;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.pagestate.PageStateType;
import p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferInfo;
import p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductCode;
import p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductType;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.consumerloanapplication.presentation.model.common.ResultData;
import p380ck.C10464h;
import p80.C27242a;
import p842nv.C26615g;
import p930wp.C29560c;
import u70.C28608d;
import ue1.C43075l;
import ue1.C43080q;

/* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.result.d */
public final class C22700d extends C21481a implements C25688c, C25689d {

    /* renamed from: t */
    public static final C22705c f59914t = new C22705c((DefaultConstructorMarker) null);

    /* renamed from: u */
    private static final List f59915u;

    /* renamed from: v */
    private static final List f59916v;

    /* renamed from: d */
    private final ResultData f59917d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C26615g f59918e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C29560c f59919f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C27242a f59920g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C24920a f59921h;

    /* renamed from: i */
    private final C25688c f59922i = this;

    /* renamed from: j */
    private final C25689d f59923j = this;

    /* renamed from: k */
    private final C1644x f59924k = new C1644x();

    /* renamed from: l */
    private final C1644x f59925l = new C1644x();

    /* renamed from: m */
    private final C1644x f59926m = new C1644x();

    /* renamed from: n */
    private final C1644x f59927n = new C1644x();

    /* renamed from: o */
    private final C1644x f59928o = new C1644x();

    /* renamed from: p */
    private final C1644x f59929p = new C1644x();

    /* renamed from: q */
    private final C1644x f59930q = new C1644x();

    /* renamed from: r */
    private final C40767b f59931r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public OfferInfo f59932s;

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.result.d$a */
    static final class C22701a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C22700d f59933d;

        /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.result.d$a$a */
        static final class C22702a extends C41537m implements C43080q {

            /* renamed from: d */
            final /* synthetic */ C22700d f59934d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C22702a(C22700d dVar) {
                super(3);
                this.f59934d = dVar;
            }

            /* renamed from: a */
            public final C41232r invoke(List list, List list2, List list3) {
                C41536l.m120489i(list, "offers");
                C41536l.m120489i(list2, "salaries");
                C41536l.m120489i(list3, "applications");
                return new C41232r(list, this.f59934d.f59921h.mo63332b(list2), list3);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22701a(C22700d dVar) {
            super(1);
            this.f59933d = dVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final C41232r m73604c(C43080q qVar, Object obj, Object obj2, Object obj3) {
            C41536l.m120489i(qVar, "$tmp0");
            return (C41232r) qVar.invoke(obj, obj2, obj3);
        }

        /* renamed from: b */
        public final C40754t invoke(Integer num) {
            C40749p pVar;
            C40749p pVar2;
            C40749p pVar3;
            C41536l.m120489i(num, "requestCode");
            if (this.f59933d.m73555Gw()) {
                pVar = C26615g.m83078c(this.f59933d.f59918e, true, false, 2, (Object) null);
            } else {
                pVar = C40749p.m118043h0(C41341q.m119907j());
                C41536l.m120488h(pVar, "{\n                      …())\n                    }");
            }
            if (this.f59933d.m73556Hw()) {
                C27242a hw = this.f59933d.f59920g;
                String a = this.f59933d.mo56251yw().mo56203a();
                if (a == null) {
                    a = "";
                }
                pVar2 = hw.mo66533a(a).mo95075O();
            } else {
                pVar2 = C40749p.m118043h0(C41341q.m119907j());
            }
            if (this.f59933d.m73552Dw()) {
                pVar3 = this.f59933d.f59919f.mo69404a(true).mo95075O();
            } else {
                pVar3 = C40749p.m118043h0(C41341q.m119907j());
            }
            C40749p c1 = C40749p.m118036c1(pVar, pVar2, pVar3, new C22699c(new C22702a(this.f59933d)));
            C41536l.m120488h(c1, "class ViewModel @Assiste…ViewModel\n        }\n    }");
            return C31270e.m92879h(C32343x.m95413R0(c1), num.intValue());
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.result.d$b */
    static final class C22703b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C22700d f59935d;

        /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.result.d$b$a */
        static final class C22704a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C22700d f59936d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C22704a(C22700d dVar) {
                super(1);
                this.f59936d = dVar;
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: ge.bog.mobilebank.model.Application} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: ge.bog.mobilebank.model.Application} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: ge.bog.mobilebank.cleanarch.domain.offer.model.OfferInfo} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: ge.bog.mobilebank.model.Application} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: ge.bog.mobilebank.model.Application} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: ge.bog.mobilebank.model.Application} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: ge.bog.mobilebank.model.Application} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void mo56256a(he1.C41232r r8) {
                /*
                    r7 = this;
                    java.lang.Object r0 = r8.mo95688a()
                    java.util.List r0 = (java.util.List) r0
                    java.lang.Object r1 = r8.mo95689b()
                    java.util.List r1 = (java.util.List) r1
                    java.lang.Object r8 = r8.mo95690c()
                    java.util.List r8 = (java.util.List) r8
                    ge.bog.mobilebank.consumerloanapplication.presentation.result.d r2 = r7.f59936d
                    boolean r2 = r2.m73552Dw()
                    r3 = 0
                    if (r2 == 0) goto L_0x0066
                    java.lang.String r0 = "applications"
                    kotlin.jvm.internal.C41536l.m120488h(r8, r0)
                    ge.bog.mobilebank.consumerloanapplication.presentation.result.d r0 = r7.f59936d
                    java.util.Iterator r8 = r8.iterator()
                L_0x0026:
                    boolean r1 = r8.hasNext()
                    if (r1 == 0) goto L_0x004a
                    java.lang.Object r1 = r8.next()
                    r2 = r1
                    ge.bog.mobilebank.model.Application r2 = (p341ge.bog.mobilebank.model.Application) r2
                    long r4 = r2.getAppId()
                    java.lang.String r2 = java.lang.String.valueOf(r4)
                    ge.bog.mobilebank.consumerloanapplication.presentation.model.common.ResultData r4 = r0.mo56251yw()
                    java.lang.String r4 = r4.mo56203a()
                    boolean r2 = kotlin.jvm.internal.C41536l.m120484d(r2, r4)
                    if (r2 == 0) goto L_0x0026
                    r3 = r1
                L_0x004a:
                    ge.bog.mobilebank.model.Application r3 = (p341ge.bog.mobilebank.model.Application) r3
                    if (r3 == 0) goto L_0x0058
                    ge.bog.mobilebank.consumerloanapplication.presentation.result.d r8 = r7.f59936d
                    androidx.lifecycle.x r8 = r8.mo56234Ik()
                    m41.C37224b.m109965d(r8, r3)
                    goto L_0x0095
                L_0x0058:
                    ge.bog.mobilebank.consumerloanapplication.presentation.result.d r8 = r7.f59936d
                    java.util.List r0 = ie1.C41341q.m119907j()
                    java.util.List r1 = ie1.C41341q.m119907j()
                    r8.m73558Jw(r0, r1)
                    goto L_0x0095
                L_0x0066:
                    ge.bog.mobilebank.consumerloanapplication.presentation.result.d r8 = r7.f59936d
                    java.lang.String r2 = "offers"
                    kotlin.jvm.internal.C41536l.m120488h(r0, r2)
                    java.util.Iterator r2 = r0.iterator()
                L_0x0071:
                    boolean r4 = r2.hasNext()
                    if (r4 == 0) goto L_0x008b
                    java.lang.Object r4 = r2.next()
                    r5 = r4
                    ge.bog.mobilebank.cleanarch.domain.offer.model.OfferInfo r5 = (p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferInfo) r5
                    ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductCode r5 = r5.getProductCode()
                    ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductCode$CL r6 = p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductCode.C21008CL.f56471f
                    boolean r5 = kotlin.jvm.internal.C41536l.m120484d(r5, r6)
                    if (r5 == 0) goto L_0x0071
                    r3 = r4
                L_0x008b:
                    ge.bog.mobilebank.cleanarch.domain.offer.model.OfferInfo r3 = (p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferInfo) r3
                    r8.f59932s = r3
                    ge.bog.mobilebank.consumerloanapplication.presentation.result.d r8 = r7.f59936d
                    r8.m73558Jw(r0, r1)
                L_0x0095:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.consumerloanapplication.presentation.result.C22700d.C22703b.C22704a.mo56256a(he1.r):void");
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo56256a((C41232r) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22703b(C22700d dVar) {
            super(1);
            this.f59935d = dVar;
        }

        /* renamed from: a */
        public final void mo56255a(C31128a aVar) {
            this.f59935d.mo56239Y8().mo4823o(aVar);
            C41536l.m120488h(aVar, "result");
            C31132b.m92648j(aVar, (int[]) null, new C22704a(this.f59935d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo56255a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.result.d$c */
    public static final class C22705c {
        private C22705c() {
        }

        public /* synthetic */ C22705c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.result.d$d */
    public interface C22706d {
        /* renamed from: a */
        C22700d mo32544a(ResultData resultData);
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.result.d$e */
    public /* synthetic */ class C22707e {

        /* renamed from: a */
        public static final /* synthetic */ int[] f59937a;

        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|17) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                h00.c[] r0 = h00.C24846c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                h00.c r1 = h00.C24846c.A     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                h00.c r1 = h00.C24846c.B     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                h00.c r1 = h00.C24846c.M     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                h00.c r1 = h00.C24846c.W     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                h00.c r1 = h00.C24846c.P     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                h00.c r1 = h00.C24846c.R     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                h00.c r1 = h00.C24846c.ERROR     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                f59937a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.consumerloanapplication.presentation.result.C22700d.C22707e.<clinit>():void");
        }
    }

    static {
        C24846c cVar = C24846c.A;
        C24846c cVar2 = C24846c.B;
        C24846c cVar3 = C24846c.M;
        f59915u = C41341q.m119910m(cVar, cVar2, cVar3, C24846c.R);
        f59916v = C41341q.m119910m(cVar, cVar2, cVar3);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22700d(ResultData resultData, C26615g gVar, C29560c cVar, C27242a aVar, C24920a aVar2) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(resultData, "resultData");
        C41536l.m120489i(gVar, "getOffersInfo");
        C41536l.m120489i(cVar, "getApplications");
        C41536l.m120489i(aVar, "getApplicantSalary");
        C41536l.m120489i(aVar2, "salaryUiMapper");
        this.f59917d = resultData;
        this.f59918e = gVar;
        this.f59919f = cVar;
        this.f59920g = aVar;
        this.f59921h = aVar2;
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<Int>()");
        this.f59931r = h1;
        C41205b F0 = C40749p.m118047l0(onInit(), onRefresh()).mo94989L0(new C25690e(new C22701a(this))).mo94981F0(new C25691f(new C22703b(this)));
        C41536l.m120488h(F0, "merge(onInit(), onRefres…          }\n            }");
        bindToLifecycle(F0);
        String b = resultData.mo56208f().mo63280b();
        C32343x.m95397J0(this, "check_my_limit", "status_is_" + b, "finished_application", C10464h.C10465a.FACEBOOKANDFIREBASE, (Bundle) null, 16, (Object) null);
    }

    /* renamed from: Bw */
    private final C26381a.C26382a m73550Bw(boolean z, PageStateType pageStateType, String str, String str2) {
        String str3;
        String F = C32343x.m95388F(str, new Object[0]);
        if (str2 != null) {
            str3 = C32343x.m95388F(str2, new Object[0]);
        } else {
            str3 = null;
        }
        return new C26381a.C26382a(z, pageStateType, F, str3);
    }

    /* renamed from: Cw */
    static /* synthetic */ C26381a.C26382a m73551Cw(C22700d dVar, boolean z, PageStateType pageStateType, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        return dVar.m73550Bw(z, pageStateType, str, str2);
    }

    /* access modifiers changed from: private */
    /* renamed from: Dw */
    public final boolean m73552Dw() {
        return this.f59917d.mo56208f() == C24846c.C;
    }

    /* renamed from: Ew */
    private final C26381a.C26383b m73553Ew() {
        String offerAmount;
        BigDecimal bigDecimal = null;
        if (!this.f59917d.mo56210h()) {
            return null;
        }
        if (!C41341q.m119910m(C24846c.A, C24846c.B, C24846c.M).contains(this.f59917d.mo56208f()) || this.f59932s == null) {
            return null;
        }
        BigDecimal e = this.f59917d.mo56207e();
        OfferInfo offerInfo = this.f59932s;
        if (!(offerInfo == null || (offerAmount = offerInfo.getOfferAmount()) == null)) {
            bigDecimal = new BigDecimal(offerAmount);
        }
        OfferInfo offerInfo2 = this.f59932s;
        C41536l.m120486f(offerInfo2);
        return new C26381a.C26383b(e, bigDecimal, offerInfo2.getOfferCcy());
    }

    /* renamed from: Fw */
    private final C26381a.C26384c m73554Fw() {
        if (!this.f59917d.mo56210h()) {
            return null;
        }
        BigDecimal e = this.f59917d.mo56207e();
        String b = this.f59917d.mo56204b();
        C41536l.m120486f(b);
        String d = this.f59917d.mo56205d();
        String h0 = C32343x.m95452h0(C28608d.f72616b, new Object[0]);
        return new C26381a.C26384c(e, b, d + " " + h0);
    }

    /* access modifiers changed from: private */
    /* renamed from: Gw */
    public final boolean m73555Gw() {
        if ((!this.f59917d.mo56210h() || !f59915u.contains(this.f59917d.mo56208f())) && (this.f59917d.mo56210h() || !f59916v.contains(this.f59917d.mo56208f()))) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: Hw */
    public final boolean m73556Hw() {
        if (this.f59917d.mo56210h()) {
            if (C41341q.m119910m(C24846c.B, C24846c.W).contains(this.f59917d.mo56208f())) {
                return true;
            }
        }
        if (this.f59917d.mo56210h() || this.f59917d.mo56208f() != C24846c.W) {
            return false;
        }
        return true;
    }

    /* renamed from: Iw */
    private final C26381a.C26385d m73557Iw(List list) {
        if (this.f59917d.mo56210h()) {
            ArrayList arrayList = new ArrayList();
            for (Object next : list) {
                if (!C41536l.m120484d(((OfferInfo) next).getProductCode(), OfferProductCode.C21008CL.f56471f)) {
                    arrayList.add(next);
                }
            }
            list = arrayList;
        }
        if (!list.isEmpty()) {
            return new C26381a.C26385d(this.f59917d.mo56210h(), list);
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: Jw */
    public final void m73558Jw(List list, List list2) {
        List list3;
        switch (C22707e.f59937a[this.f59917d.mo56208f().ordinal()]) {
            case 1:
                list3 = m73562Nw(list);
                break;
            case 2:
                list3 = m73563Ow(list, list2);
                break;
            case 3:
                list3 = m73564Pw(list);
                break;
            case 4:
                list3 = m73567Sw(list2);
                break;
            case 5:
                list3 = m73565Qw();
                break;
            case 6:
                list3 = m73566Rw(list);
                break;
            case 7:
                list3 = m73581qw();
                break;
            default:
                list3 = m73581qw();
                break;
        }
        mo56240ce().mo4823o(C41233s.m119492a(this.f59917d.mo56208f(), C41358y.m120004T(list3)));
    }

    /* renamed from: Kw */
    private final C26381a.C26386e m73559Kw() {
        if (this.f59917d.mo56210h()) {
            return C26381a.C26386e.f66861a;
        }
        return null;
    }

    /* renamed from: Lw */
    private final C26381a.C26387f m73560Lw(boolean z, String str, String str2, List list) {
        if (m73556Hw()) {
            return new C26381a.C26387f(z, C32343x.m95388F(str, new Object[0]), C32343x.m95388F(str2, new Object[0]), list);
        }
        return null;
    }

    /* renamed from: Mw */
    private final C26381a.C26388g m73561Mw(String str) {
        C26390b bVar;
        if (!this.f59917d.mo56210h() || this.f59917d.mo56208f() != C24846c.P) {
            bVar = C26390b.RETURN_HOME;
        } else {
            bVar = C26390b.OPEN_OFFERS;
        }
        return new C26381a.C26388g(bVar, C32343x.m95388F(str, new Object[0]));
    }

    /* renamed from: Nw */
    private final List m73562Nw(List list) {
        String str;
        C26381a[] aVarArr = new C26381a[4];
        boolean z = !this.f59917d.mo56210h();
        PageStateType.Success success = new PageStateType.Success((Image) null, 0, (Color) null, (Color) null, 15, (DefaultConstructorMarker) null);
        String str2 = "CML.result.A.main.text";
        if (this.f59917d.mo56210h()) {
            str = "CLA.result.A.main.text";
        } else {
            str = str2;
        }
        if (this.f59917d.mo56210h()) {
            str2 = "CLA.result.A.explanatory.text";
        }
        aVarArr[0] = m73550Bw(z, success, str, str2);
        aVarArr[1] = m73553Ew();
        aVarArr[2] = m73559Kw();
        aVarArr[3] = m73557Iw(list);
        return C41341q.m119910m(aVarArr);
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [ge.bog.designsystem.components.pagestate.PageStateType] */
    /* JADX WARNING: type inference failed for: r12v1, types: [ge.bog.designsystem.components.pagestate.PageStateType$Success] */
    /* JADX WARNING: type inference failed for: r5v7, types: [ge.bog.designsystem.components.pagestate.PageStateType$Warning] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: Ow */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List m73563Ow(java.util.List r20, java.util.List r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = 5
            n90.a[] r1 = new n90.C26381a[r1]
            ge.bog.mobilebank.consumerloanapplication.presentation.model.common.ResultData r2 = r0.f59917d
            boolean r2 = r2.mo56210h()
            r3 = 1
            r2 = r2 ^ r3
            ge.bog.mobilebank.consumerloanapplication.presentation.model.common.ResultData r4 = r0.f59917d
            boolean r4 = r4.mo56210h()
            if (r4 == 0) goto L_0x0023
            ge.bog.designsystem.components.pagestate.PageStateType$Warning r4 = new ge.bog.designsystem.components.pagestate.PageStateType$Warning
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 15
            r11 = 0
            r5 = r4
            r5.<init>(r6, r7, r8, r9, r10, r11)
            goto L_0x0032
        L_0x0023:
            ge.bog.designsystem.components.pagestate.PageStateType$Success r4 = new ge.bog.designsystem.components.pagestate.PageStateType$Success
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 15
            r18 = 0
            r12 = r4
            r12.<init>(r13, r14, r15, r16, r17, r18)
        L_0x0032:
            ge.bog.mobilebank.consumerloanapplication.presentation.model.common.ResultData r5 = r0.f59917d
            boolean r5 = r5.mo56210h()
            if (r5 == 0) goto L_0x003d
            java.lang.String r5 = "CLA.result.B.main.text"
            goto L_0x003f
        L_0x003d:
            java.lang.String r5 = "CML.result.B.main.text"
        L_0x003f:
            ge.bog.mobilebank.consumerloanapplication.presentation.model.common.ResultData r6 = r0.f59917d
            boolean r6 = r6.mo56210h()
            if (r6 == 0) goto L_0x004a
            java.lang.String r6 = "CLA.result.B.explanatory.text"
            goto L_0x004c
        L_0x004a:
            java.lang.String r6 = "CML.result.M.explanatory.text"
        L_0x004c:
            n90.a$a r2 = r0.m73550Bw(r2, r4, r5, r6)
            r4 = 0
            r1[r4] = r2
            n90.a$b r2 = r19.m73553Ew()
            r1[r3] = r2
            ge.bog.mobilebank.consumerloanapplication.presentation.model.common.ResultData r2 = r0.f59917d
            boolean r2 = r2.mo56210h()
            r2 = r2 ^ r3
            ge.bog.mobilebank.consumerloanapplication.presentation.model.common.ResultData r3 = r0.f59917d
            boolean r3 = r3.mo56210h()
            if (r3 == 0) goto L_0x006b
            java.lang.String r3 = "CLA.result.B.your.income.header"
            goto L_0x006d
        L_0x006b:
            java.lang.String r3 = "CML.result.B.your.income.header"
        L_0x006d:
            ge.bog.mobilebank.consumerloanapplication.presentation.model.common.ResultData r4 = r0.f59917d
            boolean r4 = r4.mo56210h()
            if (r4 == 0) goto L_0x0078
            java.lang.String r4 = "CLA.result.B.add.income.button"
            goto L_0x007a
        L_0x0078:
            java.lang.String r4 = "CML.result.B.add.income.button"
        L_0x007a:
            r5 = r21
            n90.a$f r2 = r0.m73560Lw(r2, r3, r4, r5)
            r3 = 2
            r1[r3] = r2
            r2 = 3
            n90.a$e r3 = r19.m73559Kw()
            r1[r2] = r3
            r2 = 4
            n90.a$d r3 = r19.m73557Iw(r20)
            r1[r2] = r3
            java.util.List r1 = ie1.C41341q.m119910m(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.consumerloanapplication.presentation.result.C22700d.m73563Ow(java.util.List, java.util.List):java.util.List");
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [ge.bog.designsystem.components.pagestate.PageStateType] */
    /* JADX WARNING: type inference failed for: r12v1, types: [ge.bog.designsystem.components.pagestate.PageStateType$Success] */
    /* JADX WARNING: type inference failed for: r5v6, types: [ge.bog.designsystem.components.pagestate.PageStateType$Warning] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: Pw */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List m73564Pw(java.util.List r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = 4
            n90.a[] r1 = new n90.C26381a[r1]
            ge.bog.mobilebank.consumerloanapplication.presentation.model.common.ResultData r2 = r0.f59917d
            boolean r2 = r2.mo56210h()
            r3 = 1
            r2 = r2 ^ r3
            ge.bog.mobilebank.consumerloanapplication.presentation.model.common.ResultData r4 = r0.f59917d
            boolean r4 = r4.mo56210h()
            if (r4 == 0) goto L_0x0023
            ge.bog.designsystem.components.pagestate.PageStateType$Warning r4 = new ge.bog.designsystem.components.pagestate.PageStateType$Warning
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 15
            r11 = 0
            r5 = r4
            r5.<init>(r6, r7, r8, r9, r10, r11)
            goto L_0x0032
        L_0x0023:
            ge.bog.designsystem.components.pagestate.PageStateType$Success r4 = new ge.bog.designsystem.components.pagestate.PageStateType$Success
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 15
            r18 = 0
            r12 = r4
            r12.<init>(r13, r14, r15, r16, r17, r18)
        L_0x0032:
            ge.bog.mobilebank.consumerloanapplication.presentation.model.common.ResultData r5 = r0.f59917d
            boolean r5 = r5.mo56210h()
            if (r5 == 0) goto L_0x003d
            java.lang.String r5 = "CLA.result.M.main.text"
            goto L_0x003f
        L_0x003d:
            java.lang.String r5 = "CML.result.M.main.text"
        L_0x003f:
            ge.bog.mobilebank.consumerloanapplication.presentation.model.common.ResultData r6 = r0.f59917d
            boolean r6 = r6.mo56210h()
            if (r6 == 0) goto L_0x004a
            java.lang.String r6 = "CLA.result.M.explanatory.text"
            goto L_0x004c
        L_0x004a:
            java.lang.String r6 = "CML.result.M.explanatory.text"
        L_0x004c:
            n90.a$a r2 = r0.m73550Bw(r2, r4, r5, r6)
            r4 = 0
            r1[r4] = r2
            n90.a$b r2 = r19.m73553Ew()
            r1[r3] = r2
            r2 = 2
            n90.a$e r3 = r19.m73559Kw()
            r1[r2] = r3
            r2 = 3
            n90.a$d r3 = r19.m73557Iw(r20)
            r1[r2] = r3
            java.util.List r1 = ie1.C41341q.m119910m(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.consumerloanapplication.presentation.result.C22700d.m73564Pw(java.util.List):java.util.List");
    }

    /* renamed from: Qw */
    private final List m73565Qw() {
        String str;
        String str2;
        String str3;
        C26381a[] aVarArr = new C26381a[3];
        PageStateType.Warning warning = new PageStateType.Warning((Image) null, 0, (Color) null, (Color) null, 15, (DefaultConstructorMarker) null);
        if (this.f59917d.mo56210h()) {
            str = "CLA.result.P.main.text";
        } else {
            str = "CML.result.P.main.text";
        }
        String str4 = str;
        if (this.f59917d.mo56210h()) {
            str2 = "CLA.result.P.explanatory.text";
        } else {
            str2 = "CML.result.P.explanatory.text";
        }
        aVarArr[0] = m73551Cw(this, false, warning, str4, str2, 1, (Object) null);
        if (this.f59917d.mo56210h()) {
            str3 = "CLA.result.P.result.check.appl.button";
        } else {
            str3 = "CML.result.P.result.check.appl.button";
        }
        aVarArr[1] = m73561Mw(str3);
        aVarArr[2] = m73554Fw();
        return C41341q.m119910m(aVarArr);
    }

    /* renamed from: Rw */
    private final List m73566Rw(List list) {
        String str;
        String str2;
        String str3;
        C26381a[] aVarArr = new C26381a[4];
        PageStateType.Error error = new PageStateType.Error((Image) null, 0, (Color) null, (Color) null, 15, (DefaultConstructorMarker) null);
        if (this.f59917d.mo56210h()) {
            str = "CLA.result.R.main.text";
        } else {
            str = "CML.result.R.main.text";
        }
        String str4 = str;
        if (this.f59917d.mo56210h()) {
            str2 = this.f59917d.mo56209g();
            if (str2 == null) {
                str2 = "CLA.result.R.explanatory.text";
            }
        } else {
            str2 = "CML.result.R.explanatory.text";
        }
        aVarArr[0] = m73551Cw(this, false, error, str4, str2, 1, (Object) null);
        if (this.f59917d.mo56210h()) {
            str3 = "CLA.result.home.page.button";
        } else {
            str3 = "CML.result.home.page.button";
        }
        aVarArr[1] = m73561Mw(str3);
        aVarArr[2] = m73554Fw();
        aVarArr[3] = m73557Iw(list);
        return C41341q.m119910m(aVarArr);
    }

    /* renamed from: Sw */
    private final List m73567Sw(List list) {
        String str;
        String str2;
        String str3;
        String str4;
        C26381a[] aVarArr = new C26381a[2];
        PageStateType.Warning warning = new PageStateType.Warning((Image) null, 0, (Color) null, (Color) null, 15, (DefaultConstructorMarker) null);
        if (this.f59917d.mo56210h()) {
            str = "CLA.result.W.main.text";
        } else {
            str = "CML.result.W.main.text";
        }
        String str5 = str;
        if (this.f59917d.mo56210h()) {
            str2 = "CLA.result.W.explanatory.text";
        } else {
            str2 = "CML.result.W.explanatory.text";
        }
        boolean z = false;
        aVarArr[0] = m73551Cw(this, false, warning, str5, str2, 1, (Object) null);
        if (this.f59917d.mo56208f() == C24846c.W) {
            z = true;
        }
        if (this.f59917d.mo56210h()) {
            str3 = "CLA.result.W.income.block.header";
        } else {
            str3 = "CML.result.W.income.block.header";
        }
        if (this.f59917d.mo56210h()) {
            str4 = "CLA.result.W.add.income";
        } else {
            str4 = "CML.result.W.add.income";
        }
        aVarArr[1] = m73560Lw(z, str3, str4, list);
        return C41341q.m119910m(aVarArr);
    }

    /* access modifiers changed from: private */
    /* renamed from: fw */
    public static final C40754t m73570fw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: gw */
    public static final void m73571gw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: qw */
    private final List m73581qw() {
        C26381a[] aVarArr = new C26381a[2];
        PageStateType.Error error = new PageStateType.Error((Image) null, 0, (Color) null, (Color) null, 15, (DefaultConstructorMarker) null);
        String g = this.f59917d.mo56209g();
        if (g == null) {
            g = C32343x.m95452h0(C28608d.f72615a, new Object[0]);
        }
        aVarArr[0] = m73551Cw(this, false, error, g, (String) null, 9, (Object) null);
        aVarArr[1] = m73561Mw("CML.result.home.page.button");
        return C41341q.m119910m(aVarArr);
    }

    /* renamed from: Aw */
    public C1644x mo56235Km() {
        return this.f59926m;
    }

    /* renamed from: Hp */
    public void mo56233Hp() {
        C37224b.m109965d(mo56238Ul(), this.f59917d);
    }

    /* renamed from: R9 */
    public void mo56236R9(C26390b bVar) {
        C41536l.m120489i(bVar, UrlHandler.ACTION);
        C37224b.m109965d(mo56235Km(), bVar);
    }

    /* renamed from: Ri */
    public void mo56237Ri() {
        String str;
        if (this.f59932s != null) {
            if (this.f59917d.mo56208f() == C24846c.A) {
                str = String.valueOf(this.f59917d.mo56207e());
            } else {
                str = null;
            }
            String str2 = str;
            OfferInfo offerInfo = this.f59932s;
            C41536l.m120486f(offerInfo);
            mo56241mc().mo4823o(C32343x.m95466m(OfferInfo.copy$default(offerInfo, 0, (String) null, (OfferProductType) null, (OfferProductCode) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (String) null, false, (String) null, (String) null, false, str2, (OfferInfo.C20999b) null, 786431, (Object) null)));
            C32343x.m95397J0(this, "applications_cl", "cl_activation", "cl_activation_button_click", C10464h.C10465a.FACEBOOKANDFIREBASE, (Bundle) null, 16, (Object) null);
        }
    }

    /* renamed from: r2 */
    public void mo56242r2(OfferInfo offerInfo) {
        C41536l.m120489i(offerInfo, "offer");
        C37224b.m109965d(mo56249xq(), offerInfo);
    }

    /* renamed from: rw */
    public C1644x mo56240ce() {
        return this.f59924k;
    }

    /* renamed from: sw */
    public C1644x mo56238Ul() {
        return this.f59927n;
    }

    /* renamed from: tw */
    public C1644x mo56234Ik() {
        return this.f59930q;
    }

    /* renamed from: uw */
    public final C25688c mo56246uw() {
        return this.f59922i;
    }

    /* renamed from: vw */
    public C1644x mo56249xq() {
        return this.f59925l;
    }

    /* renamed from: ww */
    public C1644x mo56241mc() {
        return this.f59928o;
    }

    /* renamed from: xw */
    public final C25689d mo56250xw() {
        return this.f59923j;
    }

    /* renamed from: yw */
    public final ResultData mo56251yw() {
        return this.f59917d;
    }

    /* renamed from: zw */
    public C1644x mo56239Y8() {
        return this.f59929p;
    }
}
