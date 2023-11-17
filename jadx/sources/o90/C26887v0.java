package o90;

import android.os.Bundle;
import androidx.lifecycle.C1644x;
import b41.C31128a;
import b41.C31132b;
import c41.C31270e;
import ed1.C40735b0;
import ed1.C40749p;
import ed1.C40754t;
import ed1.C40762x;
import f90.C20454a;
import g90.C20779a;
import g90.C20781c;
import g90.C20782d;
import g91.C32343x;
import gd1.C40992a;
import h90.C24921b;
import h90.C24922c;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41224m;
import he1.C41233s;
import he1.C41238w;
import iu0.C36546y;
import j90.C25361d;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.lookup.presenttation.model.LookupUiModel;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.consumerloanapplication.presentation.model.addincomes.ClientIncomesInitialData;
import p341ge.bog.mobilebank.consumerloanapplication.presentation.model.addincomes.FormData;
import p341ge.bog.mobilebank.consumerloanapplication.presentation.model.addincomes.IncomeType;
import p341ge.bog.mobilebank.consumerloanapplication.presentation.model.common.ClaDetailsUiModel;
import p380ck.C10464h;
import p80.C27242a;
import p842nv.C26617h;
import p855oy.C27094a;
import p897tp.C28474a;
import q80.C27689c;
import r80.C27947a;
import t80.C28326c;
import t80.C28327d;
import ue1.C43075l;
import ue1.C43079p;
import w80.C29244c;
import x80.C29657a;
import x80.C29660d;

/* renamed from: o90.v0 */
public final class C26887v0 extends C21481a implements C26835m0, C26842n0 {

    /* renamed from: z */
    public static final C26896c f67624z = new C26896c((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final ClientIncomesInitialData f67625d;

    /* renamed from: e */
    private final boolean f67626e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C27689c f67627f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C27242a f67628g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C28326c f67629h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C28327d f67630i;

    /* renamed from: j */
    private final C29244c f67631j;

    /* renamed from: k */
    private final C26617h f67632k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final C27094a f67633l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final C24922c f67634m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final C28474a f67635n;

    /* renamed from: o */
    private final C26835m0 f67636o = this;

    /* renamed from: p */
    private final C26842n0 f67637p = this;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public C20779a f67638q;

    /* renamed from: r */
    private final C1644x f67639r;

    /* renamed from: s */
    private final C1644x f67640s;

    /* renamed from: t */
    private final C1644x f67641t;

    /* renamed from: u */
    private final C1644x f67642u;

    /* renamed from: v */
    private final C1644x f67643v;

    /* renamed from: w */
    private final C1644x f67644w;

    /* renamed from: x */
    private final C1644x f67645x;

    /* renamed from: y */
    private final C1644x f67646y;

    /* renamed from: o90.v0$a */
    static final class C26888a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C26887v0 f67647d;

        /* renamed from: o90.v0$a$a */
        static final class C26889a extends C41537m implements C43079p {

            /* renamed from: d */
            final /* synthetic */ C26887v0 f67648d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C26889a(C26887v0 v0Var) {
                super(2);
                this.f67648d = v0Var;
            }

            /* renamed from: a */
            public final C41224m invoke(C27947a aVar, List list) {
                C41536l.m120489i(aVar, "loanDetails");
                C41536l.m120489i(list, "incomes");
                return C41233s.m119492a(this.f67648d.f67634m.mo63333a(aVar), list);
            }
        }

        /* renamed from: o90.v0$a$b */
        static final class C26890b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C26887v0 f67649d;

            /* renamed from: o90.v0$a$b$a */
            static final class C26891a extends C41537m implements C43079p {

                /* renamed from: d */
                public static final C26891a f67650d = new C26891a();

                C26891a() {
                    super(2);
                }

                /* renamed from: a */
                public final C41224m invoke(List list, List list2) {
                    C41536l.m120489i(list, "incomeTypes");
                    C41536l.m120489i(list2, "currencies");
                    return C41233s.m119492a(list, list2);
                }
            }

            /* renamed from: o90.v0$a$b$b */
            static final class C26892b extends C41537m implements C43075l {

                /* renamed from: d */
                final /* synthetic */ C26887v0 f67651d;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C26892b(C26887v0 v0Var) {
                    super(1);
                    this.f67651d = v0Var;
                }

                /* renamed from: a */
                public final C41224m invoke(C41224m mVar) {
                    C41536l.m120489i(mVar, "<name for destructuring parameter 0>");
                    List list = (List) mVar.mo95675a();
                    List list2 = (List) mVar.mo95676b();
                    C27094a sw = this.f67651d.f67633l;
                    C41536l.m120488h(list, "incomeTypes");
                    List b = sw.mo66388b(list);
                    C27094a sw2 = this.f67651d.f67633l;
                    C41536l.m120488h(list2, "jobPositions");
                    return C41233s.m119492a(b, sw2.mo66388b(list2));
                }
            }

            /* renamed from: o90.v0$a$b$c */
            static final class C26893c extends C41537m implements C43075l {

                /* renamed from: d */
                final /* synthetic */ ClaDetailsUiModel f67652d;

                /* renamed from: e */
                final /* synthetic */ C26887v0 f67653e;

                /* renamed from: f */
                final /* synthetic */ List f67654f;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C26893c(ClaDetailsUiModel claDetailsUiModel, C26887v0 v0Var, List list) {
                    super(1);
                    this.f67652d = claDetailsUiModel;
                    this.f67653e = v0Var;
                    this.f67654f = list;
                }

                /* renamed from: a */
                public final C41224m invoke(C41224m mVar) {
                    C41536l.m120489i(mVar, "<name for destructuring parameter 0>");
                    ClaDetailsUiModel claDetailsUiModel = this.f67652d;
                    C26887v0 v0Var = this.f67653e;
                    List list = this.f67654f;
                    C41536l.m120488h(list, "incomes");
                    return C41233s.m119492a(claDetailsUiModel, v0Var.m83607Qw(list, (List) mVar.mo95675a(), (List) mVar.mo95676b()));
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C26890b(C26887v0 v0Var) {
                super(1);
                this.f67649d = v0Var;
            }

            /* access modifiers changed from: private */
            /* renamed from: g */
            public static final List m83664g(Throwable th) {
                C41536l.m120489i(th, "it");
                return C41341q.m119907j();
            }

            /* access modifiers changed from: private */
            /* renamed from: h */
            public static final List m83665h(Throwable th) {
                C41536l.m120489i(th, "it");
                return C41341q.m119907j();
            }

            /* access modifiers changed from: private */
            /* renamed from: i */
            public static final C41224m m83666i(C43079p pVar, Object obj, Object obj2) {
                C41536l.m120489i(pVar, "$tmp0");
                return (C41224m) pVar.invoke(obj, obj2);
            }

            /* access modifiers changed from: private */
            /* renamed from: k */
            public static final C41224m m83667k(C43075l lVar, Object obj) {
                C41536l.m120489i(lVar, "$tmp0");
                return (C41224m) lVar.invoke(obj);
            }

            /* access modifiers changed from: private */
            /* renamed from: l */
            public static final C41224m m83668l(C43075l lVar, Object obj) {
                C41536l.m120489i(lVar, "$tmp0");
                return (C41224m) lVar.invoke(obj);
            }

            /* renamed from: f */
            public final C40735b0 invoke(C41224m mVar) {
                C41536l.m120489i(mVar, "<name for destructuring parameter 0>");
                ClaDetailsUiModel claDetailsUiModel = (ClaDetailsUiModel) mVar.mo95675a();
                List list = (List) mVar.mo95676b();
                if (list.isEmpty()) {
                    return C40762x.m118162z(C41233s.m119492a(claDetailsUiModel, C41341q.m119907j()));
                }
                return C40762x.m118154T(this.f67649d.f67629h.mo67968a().mo95065D(new C26905w0()), this.f67649d.f67630i.mo67969a().mo95065D(new C26908x0()), new C26911y0(C26891a.f67650d)).mo95062A(new C26914z0(new C26892b(this.f67649d))).mo95062A(new C26770a1(new C26893c(claDetailsUiModel, this.f67649d, list)));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26888a(C26887v0 v0Var) {
            super(1);
            this.f67647d = v0Var;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public static final C41224m m83655d(C43079p pVar, Object obj, Object obj2) {
            C41536l.m120489i(pVar, "$tmp0");
            return (C41224m) pVar.invoke(obj, obj2);
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public static final C40735b0 m83656e(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (C40735b0) lVar.invoke(obj);
        }

        /* renamed from: c */
        public final C40754t invoke(Integer num) {
            C40762x xVar;
            C41536l.m120489i(num, "it");
            C40762x c = this.f67647d.f67627f.mo67228c();
            if (this.f67647d.f67625d.mo56068b() != null) {
                xVar = this.f67647d.f67628g.mo66533a(this.f67647d.f67625d.mo56068b());
            } else {
                xVar = C40762x.m118162z(C41341q.m119907j());
                C41536l.m120488h(xVar, "just(\n                  …f()\n                    )");
            }
            C40749p O = C40762x.m118154T(c, xVar, new C26860t0(new C26889a(this.f67647d))).mo95087r(new C26884u0(new C26890b(this.f67647d))).mo95075O();
            C41536l.m120488h(O, "class ViewModel @Assiste…ViewModel\n        }\n    }");
            return C31270e.m92879h(O, 1);
        }
    }

    /* renamed from: o90.v0$b */
    static final class C26894b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C26887v0 f67655d;

        /* renamed from: o90.v0$b$a */
        static final class C26895a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C26887v0 f67656d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C26895a(C26887v0 v0Var) {
                super(1);
                this.f67656d = v0Var;
            }

            /* renamed from: a */
            public final void mo66205a(C41224m mVar) {
                this.f67656d.f67625d.mo56077i(((ClaDetailsUiModel) mVar.mo95675a()).mo56187d());
                this.f67656d.f67638q.mo49322a().addAll((List) mVar.mo95676b());
                this.f67656d.m83605Ow();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo66205a((C41224m) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26894b(C26887v0 v0Var) {
            super(1);
            this.f67655d = v0Var;
        }

        /* renamed from: a */
        public final void mo66204a(C31128a aVar) {
            this.f67655d.mo66151qv().mo4823o(aVar);
            C41536l.m120488h(aVar, "result");
            C31132b.m92648j(aVar, (int[]) null, new C26895a(this.f67655d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo66204a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: o90.v0$c */
    public static final class C26896c {
        private C26896c() {
        }

        public /* synthetic */ C26896c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: o90.v0$d */
    public interface C26897d {
        /* renamed from: a */
        C26887v0 mo32538a(ClientIncomesInitialData clientIncomesInitialData, boolean z);
    }

    /* renamed from: o90.v0$e */
    static final class C26898e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ String f67657d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26898e(String str) {
            super(1);
            this.f67657d = str;
        }

        /* renamed from: a */
        public final Boolean invoke(C20782d dVar) {
            C41536l.m120489i(dVar, "it");
            return Boolean.valueOf(C41536l.m120484d(dVar.mo49345i(), this.f67657d));
        }
    }

    /* renamed from: o90.v0$f */
    /* synthetic */ class C26899f extends C41535k implements C43075l {

        /* renamed from: d */
        public static final C26899f f67658d = new C26899f();

        C26899f() {
            super(1, C25361d.C25363b.class, "<init>", "<init>(Lge/bog/mobilebank/consumerloanapplication/domain/prepareapplication/model/PrepareApplication;)V", 0);
        }

        /* renamed from: b */
        public final C25361d.C25363b invoke(C29660d dVar) {
            C41536l.m120489i(dVar, "p0");
            return new C25361d.C25363b(dVar);
        }
    }

    /* renamed from: o90.v0$g */
    static final class C26900g extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C26900g f67659d = new C26900g();

        C26900g() {
            super(1);
        }

        /* renamed from: a */
        public final void mo66208a(C41205b bVar) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo66208a((C41205b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: o90.v0$h */
    static final class C26901h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C26887v0 f67660d;

        /* renamed from: o90.v0$h$a */
        static final class C26902a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C26887v0 f67661d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C26902a(C26887v0 v0Var) {
                super(1);
                this.f67661d = v0Var;
            }

            /* renamed from: a */
            public final void mo66210a(C25361d dVar) {
                this.f67661d.f67635n.mo68096b();
                C26887v0 v0Var = this.f67661d;
                C41536l.m120488h(dVar, "prepareApplicationResult");
                v0Var.m83601Kw(dVar);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo66210a((C25361d) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26901h(C26887v0 v0Var) {
            super(1);
            this.f67660d = v0Var;
        }

        /* renamed from: a */
        public final void mo66209a(C31128a aVar) {
            this.f67660d.mo66147Na().mo4823o(aVar);
            C41536l.m120488h(aVar, "result");
            C31132b.m92648j(aVar, (int[]) null, new C26902a(this.f67660d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo66209a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26887v0(ClientIncomesInitialData clientIncomesInitialData, boolean z, C27689c cVar, C27242a aVar, C28326c cVar2, C28327d dVar, C29244c cVar3, C26617h hVar, C27094a aVar2, C24922c cVar4, C28474a aVar3) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(clientIncomesInitialData, "data");
        C41536l.m120489i(cVar, "getLoanDetails");
        C41536l.m120489i(aVar, "getApplicantSalary");
        C41536l.m120489i(cVar2, "getIncomeTypesLookup");
        C41536l.m120489i(dVar, "getJobPositionsLookup");
        C41536l.m120489i(cVar3, "updateApplication");
        C41536l.m120489i(hVar, "refreshOffersUseCase");
        C41536l.m120489i(aVar2, "lookupUiMapper");
        C41536l.m120489i(cVar4, "detailsMapper");
        C41536l.m120489i(aVar3, "applicationEventPoster");
        this.f67625d = clientIncomesInitialData;
        this.f67626e = z;
        this.f67627f = cVar;
        this.f67628g = aVar;
        this.f67629h = cVar2;
        this.f67630i = dVar;
        this.f67631j = cVar3;
        this.f67632k = hVar;
        this.f67633l = aVar2;
        this.f67634m = cVar4;
        this.f67635n = aVar3;
        this.f67638q = new C20779a(clientIncomesInitialData.mo56074g(), clientIncomesInitialData.mo56071e(), clientIncomesInitialData.mo56067a(), clientIncomesInitialData.mo56075h(), (List) null, 16, (DefaultConstructorMarker) null);
        this.f67639r = new C1644x();
        this.f67640s = new C1644x();
        this.f67641t = new C1644x();
        this.f67642u = new C1644x();
        this.f67643v = new C1644x();
        this.f67644w = new C1644x();
        this.f67645x = new C1644x();
        this.f67646y = new C1644x();
        C40749p L0 = C40749p.m118047l0(onInit(), onRefresh()).mo94989L0(new C26845o0(new C26888a(this)));
        C41536l.m120488h(L0, "merge(\n                o…le(RC_INIT)\n            }");
        C41205b F0 = C32343x.m95413R0(L0).mo94981F0(new C26848p0(new C26894b(this)));
        C41536l.m120488h(F0, "merge(\n                o…      }\n                }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: Hw */
    public static final C25361d m83598Hw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C25361d) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Iw */
    public static final void m83599Iw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Jw */
    public static final void m83600Jw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00b2  */
    /* renamed from: Kw */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m83601Kw(j90.C25361d r15) {
        /*
            r14 = this;
            boolean r0 = r15 instanceof j90.C25361d.C25363b
            r1 = 0
            if (r0 == 0) goto L_0x0009
            r2 = r15
            j90.d$b r2 = (j90.C25361d.C25363b) r2
            goto L_0x000a
        L_0x0009:
            r2 = r1
        L_0x000a:
            if (r2 == 0) goto L_0x0011
            x80.d r2 = r2.mo63949a()
            goto L_0x0012
        L_0x0011:
            r2 = r1
        L_0x0012:
            boolean r3 = r15 instanceof j90.C25361d.C25362a
            if (r3 == 0) goto L_0x001a
            r4 = r15
            j90.d$a r4 = (j90.C25361d.C25362a) r4
            goto L_0x001b
        L_0x001a:
            r4 = r1
        L_0x001b:
            if (r4 == 0) goto L_0x0022
            java.lang.Throwable r4 = r4.mo63945a()
            goto L_0x0023
        L_0x0022:
            r4 = r1
        L_0x0023:
            r5 = 0
            if (r0 == 0) goto L_0x0043
            r14.m83603Mw()
            j90.d$b r15 = (j90.C25361d.C25363b) r15
            x80.d r15 = r15.mo63949a()
            x80.c r15 = r15.mo69598a()
            java.lang.String r15 = r15.mo69594c()
            if (r15 == 0) goto L_0x0041
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.String r15 = g91.C32343x.m95388F(r15, r0)
        L_0x003f:
            r9 = r15
            goto L_0x0072
        L_0x0041:
            r9 = r1
            goto L_0x0072
        L_0x0043:
            if (r3 == 0) goto L_0x00ea
            j90.d$a r15 = (j90.C25361d.C25362a) r15
            java.lang.Throwable r15 = r15.mo63945a()
            boolean r0 = r15 instanceof p341ge.bog.mobilebank.shared2.network.ApiError
            if (r0 == 0) goto L_0x0052
            ge.bog.mobilebank.shared2.network.ApiError r15 = (p341ge.bog.mobilebank.shared2.network.ApiError) r15
            goto L_0x0053
        L_0x0052:
            r15 = r1
        L_0x0053:
            if (r15 == 0) goto L_0x0069
            ge.bog.mobilebank.shared2.network.BankApiResponse r15 = r15.mo84685a()
            if (r15 == 0) goto L_0x0069
            java.lang.String r15 = r15.getKey()
            if (r15 == 0) goto L_0x0069
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.String r15 = g91.C32343x.m95388F(r15, r0)
            if (r15 != 0) goto L_0x003f
        L_0x0069:
            int r15 = p366bk.C10328q.f28955d2
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.String r15 = g91.C32343x.m95452h0(r15, r0)
            goto L_0x003f
        L_0x0072:
            if (r2 == 0) goto L_0x0088
            h00.c$a r15 = h00.C24846c.f63808e
            x80.c r0 = r2.mo69598a()
            java.lang.String r0 = r0.mo69593b()
            h00.c r15 = r15.mo63281a(r0)
            if (r15 != 0) goto L_0x0086
            h00.c r15 = h00.C24846c.ERROR
        L_0x0086:
            r8 = r15
            goto L_0x0092
        L_0x0088:
            boolean r15 = r4 instanceof java.net.SocketTimeoutException
            if (r15 == 0) goto L_0x008f
            h00.c r15 = h00.C24846c.TIME_OUT
            goto L_0x0086
        L_0x008f:
            h00.c r15 = h00.C24846c.ERROR
            goto L_0x0086
        L_0x0092:
            r15 = 4
            h00.c[] r15 = new h00.C24846c[r15]
            h00.c r0 = h00.C24846c.A
            r15[r5] = r0
            r0 = 1
            h00.c r3 = h00.C24846c.B
            r15[r0] = r3
            r0 = 2
            h00.c r3 = h00.C24846c.M
            r15[r0] = r3
            r0 = 3
            h00.c r3 = h00.C24846c.R
            r15[r0] = r3
            java.util.List r15 = ie1.C41341q.m119910m(r15)
            boolean r15 = r15.contains(r8)
            if (r15 == 0) goto L_0x00b7
            nv.h r15 = r14.f67632k
            r15.mo65871a()
        L_0x00b7:
            androidx.lifecycle.x r15 = r14.mo66149fn()
            ge.bog.mobilebank.consumerloanapplication.presentation.model.common.ResultData r0 = new ge.bog.mobilebank.consumerloanapplication.presentation.model.common.ResultData
            boolean r7 = r14.f67626e
            if (r2 == 0) goto L_0x00cb
            x80.c r2 = r2.mo69598a()
            if (r2 == 0) goto L_0x00cb
            java.lang.String r1 = r2.mo69592a()
        L_0x00cb:
            r10 = r1
            g90.a r1 = r14.f67638q
            java.math.BigDecimal r11 = r1.mo49323b()
            g90.a r1 = r14.f67638q
            java.lang.String r12 = r1.mo49324c()
            ge.bog.mobilebank.consumerloanapplication.presentation.model.addincomes.ClientIncomesInitialData r1 = r14.f67625d
            java.lang.String r13 = r1.mo56071e()
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            m41.a r0 = g91.C32343x.m95466m(r0)
            r15.mo4823o(r0)
            return
        L_0x00ea:
            kotlin.NoWhenBranchMatchedException r15 = new kotlin.NoWhenBranchMatchedException
            r15.<init>()
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: o90.C26887v0.m83601Kw(j90.d):void");
    }

    /* renamed from: Lw */
    private final void m83602Lw() {
        if (this.f67626e) {
            C32343x.m95383C0(this, "applications_cl", (String) null, "cl_app_page_2_add_income", 2, (Object) null);
        }
    }

    /* renamed from: Mw */
    private final void m83603Mw() {
        if (this.f67626e) {
            C36546y.m108282F().mo27137H("applications_CL_E2E", "CONSUMER_LOAN_E2E_SEND_TO_CRIF_UPDATE", (String) null, (Bundle) null, C10464h.C10465a.FACEBOOKANDFIREBASE);
        }
    }

    /* renamed from: Nw */
    private final void m83604Nw() {
        if (this.f67626e) {
            C32343x.m95383C0(this, "applications_cl", (String) null, "cl_app_page_2_delete_income", 2, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Ow */
    public final void m83605Ow() {
        mo66148Wc().mo4823o(this.f67638q);
    }

    /* renamed from: Pw */
    private final C20782d m83606Pw(C29657a aVar, List list, List list2) {
        Object obj;
        LookupUiModel lookupUiModel;
        Object obj2;
        IncomeType a = IncomeType.f59832d.mo56156a(aVar.mo69585i());
        String d = aVar.mo69578d();
        String uuid = UUID.randomUUID().toString();
        C41536l.m120488h(uuid, "randomUUID().toString()");
        C20781c yw = m83627yw(aVar);
        String str = null;
        if (a == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C41536l.m120484d(((LookupUiModel) obj).mo52393d(), aVar.mo69585i())) {
                break;
            }
        }
        LookupUiModel lookupUiModel2 = (LookupUiModel) obj;
        String a2 = aVar.mo69575a();
        String c = aVar.mo69577c();
        String e = aVar.mo69579e();
        String g = aVar.mo69582g();
        String f = aVar.mo69581f();
        if (C41536l.m120484d(a, IncomeType.Other.f59842e)) {
            Iterator it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it2.next();
                if (C41536l.m120484d(((LookupUiModel) obj2).mo52393d(), aVar.mo69576b())) {
                    break;
                }
            }
            lookupUiModel = (LookupUiModel) obj2;
        } else {
            lookupUiModel = null;
        }
        if (C41536l.m120484d(a, IncomeType.MoneyTransfer.f59839e)) {
            str = aVar.mo69576b();
        }
        return new C20782d(d, uuid, yw, false, a, lookupUiModel2, a2, c, e, g, f, lookupUiModel, str);
    }

    /* access modifiers changed from: private */
    /* renamed from: Qw */
    public final List m83607Qw(List list, List list2, List list3) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C20782d Pw = m83606Pw((C29657a) it.next(), list2, list3);
            if (Pw != null) {
                arrayList.add(Pw);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: iw */
    public static final C40754t m83613iw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: jw */
    public static final void m83614jw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: yw */
    private final C20781c m83627yw(C29657a aVar) {
        if (C20454a.f55451a.mo48972b(aVar)) {
            return C20781c.PARTIAL;
        }
        return C20781c.NONE;
    }

    /* renamed from: Aw */
    public final C26835m0 mo66188Aw() {
        return this.f67636o;
    }

    /* renamed from: Bw */
    public C1644x mo66153wn() {
        return this.f67646y;
    }

    /* renamed from: Cw */
    public C1644x mo66146Lq() {
        return this.f67644w;
    }

    /* renamed from: Dw */
    public C1644x mo66150hb() {
        return this.f67642u;
    }

    /* renamed from: Ew */
    public C1644x mo66149fn() {
        return this.f67645x;
    }

    /* renamed from: Fw */
    public final C26842n0 mo66193Fw() {
        return this.f67637p;
    }

    /* renamed from: Gw */
    public C1644x mo66147Na() {
        return this.f67640s;
    }

    /* renamed from: I4 */
    public void mo66129I4(FormData formData) {
        C41536l.m120489i(formData, "formData");
        mo66146Lq().mo4823o(C32343x.m95466m(new C41224m(formData, String.valueOf(this.f67625d.mo56069d()))));
    }

    /* renamed from: Oa */
    public void mo66130Oa(FormData formData) {
        C20782d dVar;
        if (formData != null) {
            dVar = C24921b.m79667a(formData);
        } else {
            dVar = null;
        }
        if (dVar != null && dVar.mo49349m()) {
            Iterator it = this.f67638q.mo49322a().iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (C41536l.m120484d(((C20782d) it.next()).mo49345i(), dVar.mo49345i())) {
                    break;
                } else {
                    i++;
                }
            }
            if (i != -1) {
                this.f67638q.mo49322a().set(i, dVar);
            } else {
                this.f67638q.mo49322a().add(dVar);
                m83602Lw();
            }
            m83605Ow();
        }
    }

    /* renamed from: P6 */
    public void mo66131P6() {
        String str;
        if (this.f67638q.mo49325d()) {
            if (this.f67626e) {
                str = "CREDIT_APPLICATION";
            } else {
                str = "CREDIT_LIMIT_APP";
            }
            C29244c cVar = this.f67631j;
            String f = this.f67625d.mo56073f();
            String b = this.f67625d.mo56068b();
            if (b == null) {
                b = "";
            }
            C40762x B = cVar.mo69089a(str, f, b, this.f67638q.mo49326e()).mo95062A(new C26851q0(C26899f.f67658d)).mo95065D(new C26808g0()).mo95063B(C40992a.m118827a());
            C41536l.m120488h(B, "updateApplication(\n     …dSchedulers.mainThread())");
            C41205b F0 = C31270e.m92880i(B, 1).mo94980F(new C26854r0(C26900g.f67659d)).mo94981F0(new C26857s0(new C26901h(this)));
            C41536l.m120488h(F0, "override fun onSubmit() …ndToLifecycle()\n        }");
            bindToLifecycle(F0);
        }
    }

    /* renamed from: ie */
    public void mo66132ie(String str) {
        String str2;
        Object obj;
        C41536l.m120489i(str, "id");
        Iterator it = this.f67638q.mo49322a().iterator();
        while (true) {
            str2 = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C41536l.m120484d(((C20782d) obj).mo49345i(), str)) {
                break;
            }
        }
        C20782d dVar = (C20782d) obj;
        if (dVar != null) {
            C1644x xw = mo66152tr();
            FormData b = C24921b.m79668b(dVar);
            BigDecimal d = this.f67625d.mo56069d();
            if (d != null) {
                str2 = d.toString();
            }
            xw.mo4823o(C32343x.m95466m(new C41224m(b, str2)));
        }
    }

    /* renamed from: kj */
    public void mo66133kj(String str) {
        Object obj;
        C41536l.m120489i(str, "id");
        Iterator it = this.f67638q.mo49322a().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C41536l.m120484d(((C20782d) obj).mo49345i(), str)) {
                break;
            }
        }
        C20782d dVar = (C20782d) obj;
        if (dVar != null) {
            mo66153wn().mo4823o(C32343x.m95466m(C24921b.m79668b(dVar)));
        }
    }

    /* renamed from: s6 */
    public void mo66134s6() {
        mo66150hb().mo4823o(C32343x.m95466m(C41238w.f97225a));
    }

    /* renamed from: ww */
    public C1644x mo66151qv() {
        return this.f67639r;
    }

    /* renamed from: xa */
    public void mo66135xa(String str) {
        C41536l.m120489i(str, "id");
        boolean unused = C41352v.m119961F(this.f67638q.mo49322a(), new C26898e(str));
        m83605Ow();
        m83604Nw();
    }

    /* renamed from: xw */
    public C1644x mo66152tr() {
        return this.f67643v;
    }

    /* renamed from: zw */
    public C1644x mo66148Wc() {
        return this.f67641t;
    }
}
