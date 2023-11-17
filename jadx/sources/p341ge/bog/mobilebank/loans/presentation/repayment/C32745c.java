package p341ge.bog.mobilebank.loans.presentation.repayment;

import af1.C40303i;
import android.os.Bundle;
import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import b41.C31128a;
import b41.C31132b;
import c41.C31270e;
import com.github.mikephil.charting.utils.Utils;
import ed1.C40749p;
import ed1.C40754t;
import ed1.C40762x;
import ee1.C40767b;
import fs0.C32001b;
import g91.C32306g0;
import g91.C32343x;
import hd1.C41205b;
import he1.C41233s;
import he1.C41238w;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.properties.C41553c;
import kotlin.properties.C41555e;
import ks0.C36984n;
import ks0.C36985o;
import ks0.C36986p;
import ks0.C36987q;
import ks0.C36988r;
import ks0.C36989s;
import ns0.C37457a;
import ns0.C37458b;
import os0.C37725b;
import os0.C37727c;
import p341ge.bog.designsystem.components.accountselector.AccountSelectorItemView;
import p341ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferAccounts;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.loans.presentation.LoansFlow;
import p341ge.bog.mobilebank.loans.presentation.model.OfferedPlanTypesUiModel;
import p341ge.bog.mobilebank.loans.presentation.model.PaymentResultData;
import p341ge.bog.mobilebank.loans.presentation.repayment.model.RepaymentDetailsUiModel;
import p341ge.bog.mobilebank.shared.helper.StringSource;
import p341ge.bog.mobilebank.shared2.network.ApiError;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p380ck.C10463g;
import p380ck.C10464h;
import p729cv.C19803e;
import p729cv.C19804f;
import p775gx.C24836a;
import sr0.C38518d;
import sr0.C38520e;
import tr0.C38783d;
import ue1.C43075l;
import ue1.C43079p;
import z11.C40140b;

/* renamed from: ge.bog.mobilebank.loans.presentation.repayment.c */
public final class C32745c extends C21481a {

    /* renamed from: A */
    public static final C32749c f80544A = new C32749c((DefaultConstructorMarker) null);

    /* renamed from: B */
    static final /* synthetic */ C40303i[] f80545B = {C41520a0.m120439e(new C41539o(C32745c.class, "prepaymentData", "getPrepaymentData()Lge/bog/mobilebank/loans/presentation/repayment/model/PrepaymentModel;", 0))};
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final LoansFlow.Repayment f80546d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C38518d f80547e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C38520e f80548f;

    /* renamed from: g */
    private final C19803e f80549g;

    /* renamed from: h */
    private final C19804f f80550h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C24836a f80551i;

    /* renamed from: j */
    private final C37458b f80552j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C37457a f80553k;

    /* renamed from: l */
    private final C10463g f80554l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final C1644x f80555m = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final C1644x f80556n = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final C1644x f80557o = new C1644x();

    /* renamed from: p */
    private final C1644x f80558p = new C1644x();

    /* renamed from: q */
    private final C1644x f80559q = new C1644x();

    /* renamed from: r */
    private final C1644x f80560r = new C1644x();

    /* renamed from: s */
    private final C1644x f80561s = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: t */
    public final C1644x f80562t = new C1644x();

    /* renamed from: u */
    private final C41555e f80563u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public C38783d f80564v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public C38783d f80565w;

    /* renamed from: x */
    private final C40767b f80566x;

    /* renamed from: y */
    private final C40767b f80567y;

    /* renamed from: z */
    private final C40767b f80568z;

    /* renamed from: ge.bog.mobilebank.loans.presentation.repayment.c$a */
    static final class C32746a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C32745c f80569d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32746a(C32745c cVar) {
            super(1);
            this.f80569d = cVar;
        }

        /* renamed from: a */
        public final C40754t invoke(Integer num) {
            C41536l.m120489i(num, "it");
            C40749p O = this.f80569d.f80547e.mo92086d(this.f80569d.f80546d.mo74054e(), (String) null, this.f80569d.f80546d.mo74052d(), this.f80569d.f80546d.mo74057g()).mo95075O();
            C41536l.m120488h(O, "getLoanRepaymentCalculat…         ).toObservable()");
            return C31270e.m92879h(O, num.intValue());
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.repayment.c$b */
    static final class C32747b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C32745c f80570d;

        /* renamed from: ge.bog.mobilebank.loans.presentation.repayment.c$b$a */
        static final class C32748a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C32745c f80571d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C32748a(C32745c cVar) {
                super(1);
                this.f80571d = cVar;
            }

            /* renamed from: a */
            public final void mo74443a(C38783d dVar) {
                this.f80571d.f80565w = dVar;
                if (this.f80571d.m96718Kw().mo90984p() != C37727c.PART) {
                    this.f80571d.m96724bx();
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo74443a((C38783d) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32747b(C32745c cVar) {
            super(1);
            this.f80570d = cVar;
        }

        /* renamed from: a */
        public final void mo74442a(C31128a aVar) {
            this.f80570d.f80556n.mo4823o(aVar);
            C41536l.m120488h(aVar, "result");
            C31132b.m92648j(aVar, (int[]) null, new C32748a(this.f80570d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74442a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.repayment.c$c */
    public static final class C32749c {
        private C32749c() {
        }

        public /* synthetic */ C32749c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.repayment.c$d */
    public interface C32750d {
        /* renamed from: a */
        C32745c mo32834a(LoansFlow.Repayment repayment);
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.repayment.c$e */
    public /* synthetic */ class C32751e {

        /* renamed from: a */
        public static final /* synthetic */ int[] f80572a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                fs0.b[] r0 = fs0.C32001b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                fs0.b r1 = fs0.C32001b.PREPAYMENT     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                fs0.b r1 = fs0.C32001b.FULL_PREPAYMENT     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                fs0.b r1 = fs0.C32001b.PAYMENT     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f80572a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.loans.presentation.repayment.C32745c.C32751e.<clinit>():void");
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.repayment.c$f */
    public static final class C32752f extends C41553c {

        /* renamed from: a */
        final /* synthetic */ C32745c f80573a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C32752f(Object obj, C32745c cVar) {
            super(obj);
            this.f80573a = cVar;
        }

        /* access modifiers changed from: protected */
        public void afterChange(C40303i iVar, Object obj, Object obj2) {
            C41536l.m120489i(iVar, "property");
            C37725b bVar = (C37725b) obj;
            this.f80573a.f80555m.mo4823o((C37725b) obj2);
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.repayment.c$g */
    static final class C32753g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C32745c f80574d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32753g(C32745c cVar) {
            super(1);
            this.f80574d = cVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x005a  */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x0063  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final ed1.C40754t invoke(he1.C41238w r10) {
            /*
                r9 = this;
                java.lang.String r0 = "it"
                kotlin.jvm.internal.C41536l.m120489i(r10, r0)
                ge.bog.mobilebank.loans.presentation.repayment.c r10 = r9.f80574d
                sr0.e r0 = r10.f80548f
                ge.bog.mobilebank.loans.presentation.repayment.c r10 = r9.f80574d
                ge.bog.mobilebank.loans.presentation.LoansFlow$Repayment r10 = r10.f80546d
                long r1 = r10.mo74054e()
                ge.bog.mobilebank.loans.presentation.repayment.c r10 = r9.f80574d
                os0.b r10 = r10.m96718Kw()
                os0.c r10 = r10.mo90984p()
                os0.c r3 = os0.C37727c.PART
                r4 = 0
                if (r10 != r3) goto L_0x0030
                ge.bog.mobilebank.loans.presentation.repayment.c r10 = r9.f80574d
                os0.b r10 = r10.m96718Kw()
                java.lang.String r10 = r10.mo90974g()
            L_0x002e:
                r3 = r10
                goto L_0x0044
            L_0x0030:
                ge.bog.mobilebank.loans.presentation.repayment.c r10 = r9.f80574d
                tr0.d r10 = r10.f80565w
                if (r10 == 0) goto L_0x0043
                java.math.BigDecimal r10 = r10.mo92425c()
                if (r10 == 0) goto L_0x0043
                java.lang.String r10 = r10.toString()
                goto L_0x002e
            L_0x0043:
                r3 = r4
            L_0x0044:
                ge.bog.mobilebank.loans.presentation.repayment.c r10 = r9.f80574d
                ge.bog.mobilebank.loans.presentation.LoansFlow$Repayment r10 = r10.f80546d
                java.lang.String r10 = r10.mo74052d()
                ge.bog.mobilebank.loans.presentation.repayment.c r5 = r9.f80574d
                os0.b r5 = r5.m96718Kw()
                z11.b r5 = r5.mo90979k()
                if (r5 == 0) goto L_0x0063
                long r5 = r5.mo94070b()
                java.lang.Long r5 = java.lang.Long.valueOf(r5)
                goto L_0x0064
            L_0x0063:
                r5 = r4
            L_0x0064:
                kotlin.jvm.internal.C41536l.m120486f(r5)
                long r5 = r5.longValue()
                ge.bog.mobilebank.loans.presentation.repayment.c r7 = r9.f80574d
                os0.b r7 = r7.m96718Kw()
                java.lang.String r7 = r7.mo90978j()
                ge.bog.mobilebank.loans.presentation.repayment.c r8 = r9.f80574d
                os0.b r8 = r8.m96718Kw()
                ge.bog.mobilebank.loans.presentation.model.OfferedPlanTypesUiModel r8 = r8.mo90980l()
                if (r8 == 0) goto L_0x008b
                fs0.c r8 = r8.mo74333b()
                if (r8 == 0) goto L_0x008b
                java.lang.String r4 = r8.mo72499b()
            L_0x008b:
                r8 = r4
                r4 = r10
                ed1.b r10 = r0.mo92088a(r1, r3, r4, r5, r7, r8)
                he1.w r0 = he1.C41238w.f97225a
                ed1.x r10 = r10.mo94893M(r0)
                ed1.p r10 = r10.mo95075O()
                java.lang.String r0 = "getLoanRepayment(\n      …ault(Unit).toObservable()"
                kotlin.jvm.internal.C41536l.m120488h(r10, r0)
                r0 = -1
                ed1.p r10 = c41.C31270e.m92879h(r10, r0)
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.loans.presentation.repayment.C32745c.C32753g.invoke(he1.w):ed1.t");
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.repayment.c$h */
    static final class C32754h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C32745c f80575d;

        /* renamed from: ge.bog.mobilebank.loans.presentation.repayment.c$h$a */
        static final class C32755a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C32745c f80576d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C32755a(C32745c cVar) {
                super(1);
                this.f80576d = cVar;
            }

            /* renamed from: a */
            public final void mo74446a(C41238w wVar) {
                C32745c cVar = this.f80576d;
                cVar.m96723ax(C37725b.m110886b(cVar.m96718Kw(), (C37727c) null, (StringSource) null, (String) null, false, true, false, (BigDecimal) null, (String) null, (C40140b) null, (List) null, (List) null, (OfferedPlanTypesUiModel) null, false, 8175, (Object) null));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo74446a((C41238w) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.loans.presentation.repayment.c$h$b */
        static final class C32756b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C32745c f80577d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C32756b(C32745c cVar) {
                super(1);
                this.f80577d = cVar;
            }

            /* renamed from: a */
            public final void mo74447a(C41238w wVar) {
                C32745c cVar = this.f80577d;
                cVar.m96723ax(C37725b.m110886b(cVar.m96718Kw(), (C37727c) null, (StringSource) null, (String) null, false, false, false, (BigDecimal) null, (String) null, (C40140b) null, (List) null, (List) null, (OfferedPlanTypesUiModel) null, false, 8175, (Object) null));
                C32745c.m96721Vw(this.f80577d, (String) null, (String) null, 3, (Object) null);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo74447a((C41238w) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.loans.presentation.repayment.c$h$c */
        static final class C32757c extends C41537m implements C43079p {

            /* renamed from: d */
            final /* synthetic */ C32745c f80578d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C32757c(C32745c cVar) {
                super(2);
                this.f80578d = cVar;
            }

            /* renamed from: a */
            public final void mo74448a(Throwable th, C41238w wVar) {
                Throwable th2 = th;
                C41536l.m120489i(th2, "error");
                C32745c cVar = this.f80578d;
                cVar.m96723ax(C37725b.m110886b(cVar.m96718Kw(), (C37727c) null, (StringSource) null, (String) null, false, false, false, (BigDecimal) null, (String) null, (C40140b) null, (List) null, (List) null, (OfferedPlanTypesUiModel) null, false, 8175, (Object) null));
                BankApiResponse a = ((ApiError) th2).mo84685a();
                if (C41536l.m120484d(a.getCodeStatus(), BankApiResponse.CODE_STATUS_WARNING)) {
                    this.f80578d.m96720Uw(a.getCodeStatus(), a.getKey());
                } else {
                    this.f80578d.f80557o.mo4823o(C32343x.m95466m(th));
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                mo74448a((Throwable) obj, (C41238w) obj2);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32754h(C32745c cVar) {
            super(1);
            this.f80575d = cVar;
        }

        /* renamed from: a */
        public final void mo74445a(C31128a aVar) {
            C41536l.m120488h(aVar, "result");
            C31132b.m92646h(aVar, (int[]) null, new C32755a(this.f80575d), 1, (Object) null);
            C31132b.m92648j(aVar, (int[]) null, new C32756b(this.f80575d), 1, (Object) null);
            C31132b.m92644f(aVar, (int[]) null, new C32757c(this.f80575d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74445a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.repayment.c$i */
    static final class C32758i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C32745c f80579d;

        /* renamed from: ge.bog.mobilebank.loans.presentation.repayment.c$i$a */
        static final class C32759a extends C41537m implements C43075l {

            /* renamed from: d */
            public static final C32759a f80580d = new C32759a();

            C32759a() {
                super(1);
            }

            /* renamed from: a */
            public final List invoke(C38783d dVar) {
                C41536l.m120489i(dVar, "it");
                return C41339p.m119900e(dVar);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32758i(C32745c cVar) {
            super(1);
            this.f80579d = cVar;
        }

        /* access modifiers changed from: private */
        public static final List invoke$lambda$0(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (List) lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40754t invoke(String str) {
            C40762x xVar;
            C41536l.m120489i(str, "amountText");
            Double V0 = C32343x.m95421V0(str);
            if (V0 == null || V0.doubleValue() <= Utils.DOUBLE_EPSILON) {
                xVar = C40762x.m118162z(C41341q.m119907j());
                C41536l.m120488h(xVar, "{\n                      …())\n                    }");
            } else {
                xVar = this.f80579d.f80547e.mo92086d(this.f80579d.f80546d.mo74054e(), str, this.f80579d.f80546d.mo74052d(), this.f80579d.f80546d.mo74057g()).mo95062A(new C32768d(C32759a.f80580d));
                C41536l.m120488h(xVar, "getLoanRepaymentCalculat…     ).map { listOf(it) }");
            }
            C40749p O = xVar.mo95075O();
            C41536l.m120488h(O, "details.toObservable()");
            return C31270e.m92879h(O, -1);
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.repayment.c$j */
    static final class C32760j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C32745c f80581d;

        /* renamed from: ge.bog.mobilebank.loans.presentation.repayment.c$j$a */
        static final class C32761a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C32745c f80582d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C32761a(C32745c cVar) {
                super(1);
                this.f80582d = cVar;
            }

            /* renamed from: a */
            public final void mo74452a(List list) {
                this.f80582d.m96722Zw(false);
                C32745c cVar = this.f80582d;
                C41536l.m120488h(list, "detailsResult");
                cVar.f80564v = (C38783d) C41358y.m120009Y(list);
                if (this.f80582d.m96718Kw().mo90984p() == C37727c.PART) {
                    this.f80582d.m96725cx();
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo74452a((List) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.loans.presentation.repayment.c$j$b */
        static final class C32762b extends C41537m implements C43079p {

            /* renamed from: d */
            final /* synthetic */ C32745c f80583d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C32762b(C32745c cVar) {
                super(2);
                this.f80583d = cVar;
            }

            /* renamed from: a */
            public final void mo74453a(Throwable th, List list) {
                C41536l.m120489i(th, "error");
                this.f80583d.m96722Zw(false);
                this.f80583d.f80557o.mo4823o(C32343x.m95466m(th));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                mo74453a((Throwable) obj, (List) obj2);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.loans.presentation.repayment.c$j$c */
        static final class C32763c extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C32745c f80584d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C32763c(C32745c cVar) {
                super(1);
                this.f80584d = cVar;
            }

            /* renamed from: a */
            public final void mo74454a(List list) {
                this.f80584d.m96722Zw(true);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo74454a((List) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32760j(C32745c cVar) {
            super(1);
            this.f80581d = cVar;
        }

        /* renamed from: a */
        public final void mo74451a(C31128a aVar) {
            C41536l.m120488h(aVar, "result");
            C31132b.m92648j(aVar, (int[]) null, new C32761a(this.f80581d), 1, (Object) null);
            C31132b.m92644f(aVar, (int[]) null, new C32762b(this.f80581d), 1, (Object) null);
            C31132b.m92646h(aVar, (int[]) null, new C32763c(this.f80581d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74451a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.repayment.c$k */
    static final class C32764k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C32745c f80585d;

        /* renamed from: ge.bog.mobilebank.loans.presentation.repayment.c$k$a */
        static final class C32765a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C32745c f80586d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C32765a(C32745c cVar) {
                super(1);
                this.f80586d = cVar;
            }

            /* renamed from: a */
            public final List invoke(TransferAccounts transferAccounts) {
                C41536l.m120489i(transferAccounts, "transferAccounts");
                return this.f80586d.f80553k.mo90589a(transferAccounts, this.f80586d.f80546d.mo74058h(), this.f80586d.f80546d.mo74052d());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32764k(C32745c cVar) {
            super(1);
            this.f80585d = cVar;
        }

        /* access modifiers changed from: private */
        public static final List invoke$lambda$0(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (List) lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40754t invoke(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            C40749p k0 = this.f80585d.f80551i.mo63245a().mo95075O().mo95026k0(new C32769e(new C32765a(this.f80585d)));
            C41536l.m120488h(k0, "private fun subscribeToT…ndToLifecycle()\n        }");
            return C31270e.m92879h(k0, -1);
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.repayment.c$l */
    static final class C32766l extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C32745c f80587d;

        /* renamed from: ge.bog.mobilebank.loans.presentation.repayment.c$l$a */
        static final class C32767a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C32745c f80588d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C32767a(C32745c cVar) {
                super(1);
                this.f80588d = cVar;
            }

            /* renamed from: a */
            public final void mo74458a(List list) {
                C41238w wVar;
                Object obj;
                C41536l.m120488h(list, "accounts");
                Iterator it = list.iterator();
                while (true) {
                    wVar = null;
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((C40140b) obj).mo94069a().mo34690g()) {
                        break;
                    }
                }
                C40140b bVar = (C40140b) obj;
                if (bVar != null) {
                    this.f80588d.mo74433Rw(bVar);
                    wVar = C41238w.f97225a;
                }
                if (wVar == null) {
                    C32745c cVar = this.f80588d;
                    if (list.size() == 1) {
                        cVar.mo74433Rw((C40140b) C41358y.m120007W(list));
                    }
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo74458a((List) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32766l(C32745c cVar) {
            super(1);
            this.f80587d = cVar;
        }

        /* renamed from: a */
        public final void mo74457a(C31128a aVar) {
            this.f80587d.f80562t.mo4823o(aVar);
            C41536l.m120488h(aVar, "result");
            C31132b.m92648j(aVar, (int[]) null, new C32767a(this.f80587d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74457a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: ge.bog.mobilebank.shared.helper.StringSource$Dictionary} */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C32745c(p341ge.bog.mobilebank.loans.presentation.LoansFlow.Repayment r29, sr0.C38518d r30, sr0.C38520e r31, p729cv.C19803e r32, p729cv.C19804f r33, p775gx.C24836a r34, ns0.C37458b r35, ns0.C37457a r36, p380ck.C10463g r37) {
        /*
            r28 = this;
            r0 = r28
            r1 = r29
            r2 = r30
            r3 = r31
            r4 = r32
            r5 = r33
            r6 = r34
            r7 = r35
            r8 = r36
            r9 = r37
            java.lang.String r10 = "data"
            kotlin.jvm.internal.C41536l.m120489i(r1, r10)
            java.lang.String r10 = "getLoanRepaymentCalculation"
            kotlin.jvm.internal.C41536l.m120489i(r2, r10)
            java.lang.String r10 = "getLoanRepayment"
            kotlin.jvm.internal.C41536l.m120489i(r3, r10)
            java.lang.String r10 = "refreshAssetLiability"
            kotlin.jvm.internal.C41536l.m120489i(r4, r10)
            java.lang.String r10 = "refreshProductTypes"
            kotlin.jvm.internal.C41536l.m120489i(r5, r10)
            java.lang.String r10 = "getAccountsUseCase"
            kotlin.jvm.internal.C41536l.m120489i(r6, r10)
            java.lang.String r10 = "repaymentUiMapper"
            kotlin.jvm.internal.C41536l.m120489i(r7, r10)
            java.lang.String r10 = "repaymentAccountsMapper"
            kotlin.jvm.internal.C41536l.m120489i(r8, r10)
            java.lang.String r10 = "analytics"
            kotlin.jvm.internal.C41536l.m120489i(r9, r10)
            r10 = 0
            r11 = 1
            r0.<init>(r10, r11, r10)
            r0.f80546d = r1
            r0.f80547e = r2
            r0.f80548f = r3
            r0.f80549g = r4
            r0.f80550h = r5
            r0.f80551i = r6
            r0.f80552j = r7
            r0.f80553k = r8
            r0.f80554l = r9
            androidx.lifecycle.x r2 = new androidx.lifecycle.x
            r2.<init>()
            r0.f80555m = r2
            androidx.lifecycle.x r2 = new androidx.lifecycle.x
            r2.<init>()
            r0.f80556n = r2
            androidx.lifecycle.x r2 = new androidx.lifecycle.x
            r2.<init>()
            r0.f80557o = r2
            androidx.lifecycle.x r2 = new androidx.lifecycle.x
            r2.<init>()
            r0.f80558p = r2
            androidx.lifecycle.x r2 = new androidx.lifecycle.x
            r2.<init>()
            r0.f80559q = r2
            androidx.lifecycle.x r2 = new androidx.lifecycle.x
            r2.<init>()
            r0.f80560r = r2
            androidx.lifecycle.x r2 = new androidx.lifecycle.x
            r2.<init>()
            r0.f80561s = r2
            androidx.lifecycle.x r2 = new androidx.lifecycle.x
            r2.<init>()
            r0.f80562t = r2
            kotlin.properties.a r2 = kotlin.properties.C41551a.f97718a
            os0.b r2 = new os0.b
            os0.c r13 = r28.m96719Lw()
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 8190(0x1ffe, float:1.1477E-41)
            r27 = 0
            r12 = r2
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            ge.bog.mobilebank.loans.presentation.repayment.c$f r3 = new ge.bog.mobilebank.loans.presentation.repayment.c$f
            r3.<init>(r2, r0)
            r0.f80563u = r3
            ee1.b r2 = ee1.C40767b.m118210h1()
            java.lang.String r3 = "create<String>()"
            kotlin.jvm.internal.C41536l.m120488h(r2, r3)
            r0.f80566x = r2
            ee1.b r2 = ee1.C40767b.m118210h1()
            java.lang.String r3 = "create<Unit>()"
            kotlin.jvm.internal.C41536l.m120488h(r2, r3)
            r0.f80567y = r2
            ee1.b r2 = ee1.C40767b.m118210h1()
            kotlin.jvm.internal.C41536l.m120488h(r2, r3)
            r0.f80568z = r2
            boolean r2 = r29.mo74050a()
            if (r2 == 0) goto L_0x00fb
            ge.bog.mobilebank.shared.helper.StringSource$Dictionary r1 = new ge.bog.mobilebank.shared.helper.StringSource$Dictionary
            java.lang.String r2 = "bnpl.loan.repayment.details.main.header.label"
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = 0
            r29 = r1
            r30 = r2
            r31 = r3
            r32 = r4
            r33 = r5
            r34 = r6
            r29.<init>(r30, r31, r32, r33, r34)
        L_0x00f9:
            r5 = r1
            goto L_0x0140
        L_0x00fb:
            r2 = 3
            os0.c[] r2 = new os0.C37727c[r2]
            r3 = 0
            os0.c r4 = os0.C37727c.PART
            r2[r3] = r4
            os0.c r3 = os0.C37727c.FULL
            r2[r11] = r3
            r3 = 2
            os0.c r4 = os0.C37727c.ONLY_FULL
            r2[r3] = r4
            java.util.List r2 = ie1.C41341q.m119910m(r2)
            os0.b r3 = r28.m96718Kw()
            os0.c r3 = r3.mo90984p()
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L_0x0136
            ge.bog.mobilebank.shared.helper.StringSource$Dictionary r1 = new ge.bog.mobilebank.shared.helper.StringSource$Dictionary
            java.lang.String r2 = "loan.repayment.details.main.header.label"
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = 0
            r29 = r1
            r30 = r2
            r31 = r3
            r32 = r4
            r33 = r5
            r34 = r6
            r29.<init>(r30, r31, r32, r33, r34)
            goto L_0x00f9
        L_0x0136:
            ge.bog.mobilebank.shared.helper.StringSource$Raw r2 = new ge.bog.mobilebank.shared.helper.StringSource$Raw
            java.lang.String r1 = r29.mo74056f()
            r2.<init>(r1)
            r5 = r2
        L_0x0140:
            os0.b r3 = r28.m96718Kw()
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 8189(0x1ffd, float:1.1475E-41)
            r18 = 0
            os0.b r1 = os0.C37725b.m110886b(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r0.m96723ax(r1)
            ed1.p r1 = r28.onInit()
            ed1.p r2 = r28.onRefresh()
            ed1.p r1 = ed1.C40749p.m118047l0(r1, r2)
            ge.bog.mobilebank.loans.presentation.repayment.c$a r2 = new ge.bog.mobilebank.loans.presentation.repayment.c$a
            r2.<init>(r0)
            ks0.l r3 = new ks0.l
            r3.<init>(r2)
            ed1.p r1 = r1.mo94989L0(r3)
            java.lang.String r2 = "merge(\n                o…ervable(it)\n            }"
            kotlin.jvm.internal.C41536l.m120488h(r1, r2)
            ed1.p r1 = g91.C32343x.m95413R0(r1)
            ge.bog.mobilebank.loans.presentation.repayment.c$b r2 = new ge.bog.mobilebank.loans.presentation.repayment.c$b
            r2.<init>(r0)
            ks0.m r3 = new ks0.m
            r3.<init>(r2)
            hd1.b r1 = r1.mo94981F0(r3)
            java.lang.String r2 = "merge(\n                o…          }\n            }"
            kotlin.jvm.internal.C41536l.m120488h(r1, r2)
            r0.bindToLifecycle((hd1.C41205b) r1)
            r28.m96735hx()
            r28.m96729ex()
            r28.m96741kx()
            r28.mo74438Yw()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.loans.presentation.repayment.C32745c.<init>(ge.bog.mobilebank.loans.presentation.LoansFlow$Repayment, sr0.d, sr0.e, cv.e, cv.f, gx.a, ns0.b, ns0.a, ck.g):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: Kw */
    public final C37725b m96718Kw() {
        return (C37725b) this.f80563u.getValue(this, f80545B[0]);
    }

    /* renamed from: Lw */
    private final C37727c m96719Lw() {
        int i;
        C32001b a = C32001b.f78787e.mo72498a(this.f80546d.mo74060i());
        if (a == null) {
            i = -1;
        } else {
            i = C32751e.f80572a[a.ordinal()];
        }
        if (i != 1) {
            if (i == 2) {
                return C37727c.ONLY_FULL;
            }
            if (i != 3) {
                return C37727c.NONE;
            }
            return C37727c.PAYMENT;
        } else if (this.f80546d.mo74051b()) {
            return C37727c.FULL;
        } else {
            return C37727c.PART;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Uw */
    public final void m96720Uw(String str, String str2) {
        String str3;
        String str4;
        AccountSelectorItemView.C13140a a;
        C32306g0.m95222c(this.f80546d.mo74057g());
        C10463g gVar = this.f80554l;
        if (C41536l.m120484d(str, BankApiResponse.CODE_STATUS_WARNING)) {
            str3 = "status - pending";
        } else {
            str3 = "status - success";
        }
        gVar.mo27137H("loans", str3, "conversion_loan_payment", (Bundle) null, C10464h.C10465a.FACEBOOKANDFIREBASE);
        this.f80549g.mo48091a();
        this.f80550h.mo48092a();
        StringSource o = m96718Kw().mo90983o();
        boolean d = C41536l.m120484d(str, BankApiResponse.CODE_STATUS_WARNING);
        boolean a2 = this.f80546d.mo74050a();
        RepaymentDetailsUiModel[] repaymentDetailsUiModelArr = new RepaymentDetailsUiModel[2];
        repaymentDetailsUiModelArr[0] = new RepaymentDetailsUiModel("loan.payment.result.loan", this.f80546d.mo74056f(), false);
        C40140b k = m96718Kw().mo90979k();
        if (k == null || (a = k.mo94069a()) == null || (str4 = a.mo34687e()) == null) {
            str4 = "";
        }
        repaymentDetailsUiModelArr[1] = new RepaymentDetailsUiModel("loan.payment.result.account", str4, false);
        List p = C41341q.m119913p(repaymentDetailsUiModelArr);
        p.addAll(m96718Kw().mo90970d());
        C41238w wVar = C41238w.f97225a;
        this.f80561s.mo4823o(C32343x.m95466m(new PaymentResultData(o, str2, d, a2, p)));
    }

    /* renamed from: Vw */
    static /* synthetic */ void m96721Vw(C32745c cVar, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        cVar.m96720Uw(str, str2);
    }

    /* access modifiers changed from: private */
    /* renamed from: Zw */
    public final void m96722Zw(boolean z) {
        m96723ax(C37725b.m110886b(m96718Kw(), (C37727c) null, (StringSource) null, (String) null, false, false, z, (BigDecimal) null, (String) null, (C40140b) null, (List) null, (List) null, (OfferedPlanTypesUiModel) null, false, 8159, (Object) null));
    }

    /* access modifiers changed from: private */
    /* renamed from: ax */
    public final void m96723ax(C37725b bVar) {
        this.f80563u.setValue(this, f80545B[0], bVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: bx */
    public final void m96724bx() {
        BigDecimal bigDecimal;
        C37725b Kw = m96718Kw();
        C38783d dVar = this.f80565w;
        String str = null;
        if (dVar != null) {
            bigDecimal = dVar.mo92425c();
        } else {
            bigDecimal = null;
        }
        C38783d dVar2 = this.f80565w;
        if (dVar2 != null) {
            str = dVar2.mo92426d();
        }
        m96723ax(C37725b.m110886b(Kw, (C37727c) null, (StringSource) null, (String) null, false, false, false, bigDecimal, str, (C40140b) null, this.f80552j.mo90590a(this.f80565w), C41341q.m119907j(), (OfferedPlanTypesUiModel) null, false, 6463, (Object) null));
    }

    /* access modifiers changed from: private */
    /* renamed from: cx */
    public final void m96725cx() {
        BigDecimal bigDecimal;
        C37725b Kw = m96718Kw();
        C38783d dVar = this.f80564v;
        String str = null;
        if (dVar != null) {
            bigDecimal = dVar.mo92425c();
        } else {
            bigDecimal = null;
        }
        C38783d dVar2 = this.f80564v;
        if (dVar2 != null) {
            str = dVar2.mo92426d();
        }
        m96723ax(C37725b.m110886b(Kw, (C37727c) null, (StringSource) null, (String) null, false, false, false, bigDecimal, str, (C40140b) null, this.f80552j.mo90590a(this.f80564v), this.f80552j.mo90591b(this.f80564v), (OfferedPlanTypesUiModel) null, false, 6463, (Object) null));
    }

    /* renamed from: dx */
    private final void m96727dx() {
        List e = m96718Kw().mo90971e();
        if (!e.isEmpty()) {
            this.f80560r.mo4823o(C32343x.m95466m(e));
        }
    }

    /* renamed from: ex */
    private final void m96729ex() {
        C40749p L0 = this.f80567y.mo94989L0(new C36984n(new C32753g(this)));
        C41536l.m120488h(L0, "private fun subscribeToL…ndToLifecycle()\n        }");
        C41205b F0 = C32343x.m95413R0(L0).mo94981F0(new C36985o(new C32754h(this)));
        C41536l.m120488h(F0, "private fun subscribeToL…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: fx */
    public static final C40754t m96731fx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: gx */
    public static final void m96733gx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: hx */
    private final void m96735hx() {
        C40749p Q = this.f80566x.mo95032s(500, TimeUnit.MILLISECONDS).mo94998Q(new C36988r(new C32758i(this)));
        C41536l.m120488h(Q, "private fun subscribeToL…ndToLifecycle()\n        }");
        C41205b F0 = C32343x.m95413R0(Q).mo94981F0(new C36989s(new C32760j(this)));
        C41536l.m120488h(F0, "private fun subscribeToL…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: ix */
    public static final C40754t m96737ix(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: jx */
    public static final void m96739jx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: kx */
    private final void m96741kx() {
        C40749p L0 = this.f80568z.mo94989L0(new C36986p(new C32764k(this)));
        C41536l.m120488h(L0, "private fun subscribeToT…ndToLifecycle()\n        }");
        C41205b F0 = C32343x.m95413R0(L0).mo94981F0(new C36987q(new C32766l(this)));
        C41536l.m120488h(F0, "private fun subscribeToT…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: lw */
    public static final C40754t m96742lw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: lx */
    public static final C40754t m96743lx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: mw */
    public static final void m96744mw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: mx */
    public static final void m96745mx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Fw */
    public LiveData mo74422Fw() {
        return this.f80562t;
    }

    /* renamed from: Gw */
    public LiveData mo74423Gw() {
        return this.f80556n;
    }

    /* renamed from: Hw */
    public LiveData mo74424Hw() {
        return this.f80559q;
    }

    /* renamed from: Iw */
    public LiveData mo74425Iw() {
        return this.f80558p;
    }

    /* renamed from: Jw */
    public LiveData mo74426Jw() {
        return this.f80561s;
    }

    /* renamed from: K0 */
    public void mo74427K0(boolean z) {
        m96723ax(C37725b.m110886b(m96718Kw(), (C37727c) null, (StringSource) null, (String) null, z, false, false, (BigDecimal) null, (String) null, (C40140b) null, (List) null, (List) null, (OfferedPlanTypesUiModel) null, false, 8183, (Object) null));
    }

    /* renamed from: Mw */
    public LiveData mo74428Mw() {
        return this.f80555m;
    }

    /* renamed from: Nw */
    public LiveData mo74429Nw() {
        return this.f80557o;
    }

    /* renamed from: Ow */
    public LiveData mo74430Ow() {
        return this.f80560r;
    }

    /* renamed from: Pw */
    public void mo74431Pw(boolean z) {
        m96723ax(C37725b.m110886b(m96718Kw(), (C37727c) null, (StringSource) null, (String) null, false, false, false, (BigDecimal) null, (String) null, (C40140b) null, (List) null, (List) null, (OfferedPlanTypesUiModel) null, z, C11051p3.f31758b, (Object) null));
    }

    /* renamed from: Qw */
    public boolean mo74432Qw() {
        return m96718Kw().mo90977i();
    }

    /* renamed from: Rw */
    public void mo74433Rw(C40140b bVar) {
        C40140b bVar2 = bVar;
        C41536l.m120489i(bVar2, "account");
        m96723ax(C37725b.m110886b(m96718Kw(), (C37727c) null, (StringSource) null, (String) null, false, false, false, (BigDecimal) null, (String) null, bVar2, (List) null, (List) null, (OfferedPlanTypesUiModel) null, false, 7935, (Object) null));
    }

    /* renamed from: Sw */
    public void mo74434Sw() {
        long j;
        if (mo74422Fw().mo4814f() instanceof C31128a.C31129a) {
            mo74438Yw();
        }
        C1644x xVar = this.f80559q;
        C40140b k = m96718Kw().mo90979k();
        if (k != null) {
            j = k.mo94070b();
        } else {
            j = -1;
        }
        xVar.mo4823o(C32343x.m95466m(Long.valueOf(j)));
    }

    /* renamed from: Tw */
    public void mo74435Tw() {
        this.f80558p.mo4823o(C32343x.m95466m(m96718Kw().mo90973f()));
    }

    /* renamed from: Ww */
    public void mo74436Ww(C37727c cVar) {
        C41536l.m120489i(cVar, "type");
        m96723ax(C37725b.m110886b(m96718Kw(), cVar, (StringSource) null, (String) null, false, false, false, (BigDecimal) null, (String) null, (C40140b) null, (List) null, (List) null, (OfferedPlanTypesUiModel) null, false, 8190, (Object) null));
        if (cVar == C37727c.PART) {
            m96725cx();
        } else {
            m96724bx();
        }
    }

    /* renamed from: Xw */
    public void mo74437Xw(OfferedPlanTypesUiModel offeredPlanTypesUiModel) {
        OfferedPlanTypesUiModel offeredPlanTypesUiModel2 = offeredPlanTypesUiModel;
        C41536l.m120489i(offeredPlanTypesUiModel2, "planType");
        m96723ax(C37725b.m110886b(m96718Kw(), (C37727c) null, (StringSource) null, (String) null, false, false, false, (BigDecimal) null, (String) null, (C40140b) null, (List) null, (List) null, offeredPlanTypesUiModel2, false, 6143, (Object) null));
    }

    /* renamed from: Yw */
    public void mo74438Yw() {
        this.f80568z.onNext(C41238w.f97225a);
    }

    /* renamed from: b2 */
    public void mo74439b2(String str) {
        C41536l.m120489i(str, "amount");
        m96723ax(C37725b.m110886b(m96718Kw(), (C37727c) null, (StringSource) null, str, false, false, false, (BigDecimal) null, (String) null, (C40140b) null, (List) null, (List) null, (OfferedPlanTypesUiModel) null, false, 8187, (Object) null));
        this.f80566x.onNext(str);
    }

    /* renamed from: ne */
    public void mo74440ne() {
        if (!m96718Kw().mo90985q()) {
            m96727dx();
        } else if (m96718Kw().mo90979k() == null) {
            mo74434Sw();
        } else {
            this.f80554l.mo27152s("loans", C41344r0.m119931m(C41233s.m119492a("repaymentFlag", this.f80546d.mo74060i()), C41233s.m119492a("fullPrePayment", m96718Kw().mo90978j())).toString(), "loan_pay_button_click");
            this.f80567y.onNext(C41238w.f97225a);
        }
    }
}
