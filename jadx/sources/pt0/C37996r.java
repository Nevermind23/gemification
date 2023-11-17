package pt0;

import androidx.lifecycle.C1607m0;
import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import at0.C31065b;
import c41.C31270e;
import com.github.mikephil.charting.utils.Utils;
import ed1.C40734b;
import ed1.C40749p;
import ed1.C40754t;
import ed1.C40762x;
import ee1.C40767b;
import g91.C32343x;
import hd1.C41204a;
import he1.C41238w;
import j51.C36735g;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kt0.C36990a;
import m51.C37228a;
import mt0.C37257a;
import mt0.C37261e;
import mt0.C37264h;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.actionsheet.ClosePiggyBankActionSheet;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.closepiggybank.ClosePiggyBankFragment;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.SelectorChipData;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.cas.CasAccountUiModel;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.moneybox.MoneyBoxTariffUiModel;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.piggybank.CasDetailsUiModel;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.piggybank.PiggyBankAccountUiModel;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.piggybank.PiggyBankPausePeriodUiModel;
import p843nw.C26625h;
import p863pw.C27623a;
import p863pw.C27631i;
import ue1.C43064a;
import ue1.C43075l;
import ue1.C43079p;
import xs0.C39845b0;
import xs0.C39849d;
import xs0.C39857g;
import xs0.C39861h0;
import xs0.C39865j0;
import xs0.C39874n;
import zs0.C40249b;

/* renamed from: pt0.r */
public final class C37996r extends C21481a implements C37984g, C37986h {
    /* access modifiers changed from: private */

    /* renamed from: A */
    public CasDetailsUiModel f91300A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public C37261e f91301B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public final C40767b f91302C;

    /* renamed from: D */
    private final C40767b f91303D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public final C40767b f91304E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public final C40767b f91305F;

    /* renamed from: G */
    private final C40767b f91306G;

    /* renamed from: H */
    private final C40767b f91307H;

    /* renamed from: I */
    private final C40767b f91308I;

    /* renamed from: J */
    private final C40767b f91309J;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C39845b0 f91310d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C39874n f91311e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C39861h0 f91312f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C39865j0 f91313g;

    /* renamed from: h */
    private final C36735g f91314h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C39857g f91315i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C39849d f91316j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C26625h f91317k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final C36990a f91318l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final C37264h f91319m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final C1644x f91320n = new C1644x();

    /* renamed from: o */
    private final C1644x f91321o;

    /* renamed from: p */
    private final LiveData f91322p;

    /* renamed from: q */
    private final C1644x f91323q;

    /* renamed from: r */
    private final C1644x f91324r;

    /* renamed from: s */
    private final C1644x f91325s;

    /* renamed from: t */
    private final C1644x f91326t;

    /* renamed from: u */
    private final C1644x f91327u;

    /* renamed from: v */
    private final C1644x f91328v;

    /* renamed from: w */
    private final C1644x f91329w;

    /* renamed from: x */
    private final C1644x f91330x;

    /* renamed from: y */
    private final C1644x f91331y;

    /* renamed from: z */
    private final LiveData f91332z;

    /* renamed from: pt0.r$a */
    static final class C37997a extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C37997a f91333d = new C37997a();

        C37997a() {
            super(1);
        }

        /* renamed from: a */
        public final Integer invoke(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            return 6;
        }
    }

    /* renamed from: pt0.r$b */
    static final class C37998b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C37996r f91334d;

        /* renamed from: e */
        final /* synthetic */ long f91335e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37998b(C37996r rVar, long j) {
            super(1);
            this.f91334d = rVar;
            this.f91335e = j;
        }

        /* renamed from: a */
        public final void mo91372a(Integer num) {
            long j;
            if (num == null || num.intValue() != 6 || this.f91334d.f91301B == null) {
                this.f91334d.f91305F.onNext(num);
                return;
            }
            C40767b vw = this.f91334d.f91304E;
            if (this.f91334d.f91300A != null) {
                CasDetailsUiModel pw = this.f91334d.f91300A;
                if (pw == null) {
                    C41536l.m120506z("details");
                    pw = null;
                }
                j = pw.mo75128f();
            } else {
                j = this.f91335e;
            }
            C41536l.m120488h(num, "it");
            vw.onNext(new C37987i(j, num.intValue()));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo91372a((Integer) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: pt0.r$c */
    private static final class C37999c {

        /* renamed from: a */
        private final double f91336a;

        /* renamed from: b */
        private final List f91337b;

        public C37999c(double d, List list) {
            C41536l.m120489i(list, "accountKeys");
            this.f91336a = d;
            this.f91337b = list;
        }

        /* renamed from: a */
        public final String mo91373a() {
            List<Number> list = this.f91337b;
            ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
            for (Number longValue : list) {
                arrayList.add(Long.valueOf(longValue.longValue()));
            }
            return C41358y.m120017g0(arrayList, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C43075l) null, 62, (Object) null);
        }

        /* renamed from: b */
        public final double mo91374b() {
            return this.f91336a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37999c)) {
                return false;
            }
            C37999c cVar = (C37999c) obj;
            return Double.compare(this.f91336a, cVar.f91336a) == 0 && C41536l.m120484d(this.f91337b, cVar.f91337b);
        }

        public int hashCode() {
            return (Double.doubleToLongBits(this.f91336a) * 31) + this.f91337b.hashCode();
        }

        public String toString() {
            double d = this.f91336a;
            List list = this.f91337b;
            return "EditCasData(amount=" + d + ", accountKeys=" + list + ")";
        }
    }

    /* renamed from: pt0.r$d */
    static final class C38000d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C37996r f91338d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38000d(C37996r rVar) {
            super(1);
            this.f91338d = rVar;
        }

        /* JADX WARNING: type inference failed for: r0v8, types: [b41.a$b] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final b41.C31128a invoke(b41.C31128a r10) {
            /*
                r9 = this;
                java.lang.String r0 = "it"
                kotlin.jvm.internal.C41536l.m120488h(r10, r0)
                pt0.r r0 = r9.f91338d
                boolean r1 = r10 instanceof b41.C31128a.C31131c     // Catch:{ all -> 0x0066 }
                r2 = 0
                if (r1 == 0) goto L_0x0038
                r1 = r10
                b41.a$c r1 = (b41.C31128a.C31131c) r1     // Catch:{ all -> 0x0066 }
                java.lang.Object r1 = r1.mo71340a()     // Catch:{ all -> 0x0066 }
                java.lang.Number r1 = (java.lang.Number) r1     // Catch:{ all -> 0x0066 }
                double r3 = r1.doubleValue()     // Catch:{ all -> 0x0066 }
                ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.piggybank.CasDetailsUiModel r0 = r0.f91300A     // Catch:{ all -> 0x0066 }
                if (r0 != 0) goto L_0x0025
                java.lang.String r0 = "details"
                kotlin.jvm.internal.C41536l.m120506z(r0)     // Catch:{ all -> 0x0066 }
                goto L_0x0026
            L_0x0025:
                r2 = r0
            L_0x0026:
                java.lang.String r0 = r2.mo75133j()     // Catch:{ all -> 0x0066 }
                java.lang.String r0 = g91.C32303f.m95200k(r3, r0)     // Catch:{ all -> 0x0066 }
                int r1 = r10.mo71341b()     // Catch:{ all -> 0x0066 }
                b41.a$c r2 = new b41.a$c     // Catch:{ all -> 0x0066 }
                r2.<init>(r0, r1)     // Catch:{ all -> 0x0066 }
                goto L_0x0076
            L_0x0038:
                boolean r0 = r10 instanceof b41.C31128a.C31129a     // Catch:{ all -> 0x0066 }
                if (r0 == 0) goto L_0x0051
                b41.a$a r2 = new b41.a$a     // Catch:{ all -> 0x0066 }
                r0 = r10
                b41.a$a r0 = (b41.C31128a.C31129a) r0     // Catch:{ all -> 0x0066 }
                java.lang.Throwable r4 = r0.mo71342c()     // Catch:{ all -> 0x0066 }
                int r5 = r10.mo71341b()     // Catch:{ all -> 0x0066 }
                r6 = 0
                r7 = 4
                r8 = 0
                r3 = r2
                r3.<init>(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0066 }
                goto L_0x0076
            L_0x0051:
                boolean r0 = r10 instanceof b41.C31128a.C31130b     // Catch:{ all -> 0x0066 }
                if (r0 == 0) goto L_0x0060
                b41.a$b r0 = new b41.a$b     // Catch:{ all -> 0x0066 }
                int r1 = r10.mo71341b()     // Catch:{ all -> 0x0066 }
                r3 = 2
                r0.<init>(r1, r2, r3, r2)     // Catch:{ all -> 0x0066 }
                goto L_0x0075
            L_0x0060:
                kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x0066 }
                r0.<init>()     // Catch:{ all -> 0x0066 }
                throw r0     // Catch:{ all -> 0x0066 }
            L_0x0066:
                r0 = move-exception
                r2 = r0
                b41.a$a r0 = new b41.a$a
                int r3 = r10.mo71341b()
                r4 = 0
                r5 = 4
                r6 = 0
                r1 = r0
                r1.<init>(r2, r3, r4, r5, r6)
            L_0x0075:
                r2 = r0
            L_0x0076:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: pt0.C37996r.C38000d.invoke(b41.a):b41.a");
        }
    }

    /* renamed from: pt0.r$e */
    static final class C38001e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C37996r f91339d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38001e(C37996r rVar) {
            super(1);
            this.f91339d = rVar;
        }

        /* JADX WARNING: type inference failed for: r0v8, types: [b41.a$b] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final b41.C31128a invoke(b41.C31128a r10) {
            /*
                r9 = this;
                java.lang.String r0 = "it"
                kotlin.jvm.internal.C41536l.m120488h(r10, r0)
                pt0.r r0 = r9.f91339d
                boolean r1 = r10 instanceof b41.C31128a.C31131c     // Catch:{ all -> 0x0072 }
                r2 = 0
                if (r1 == 0) goto L_0x0044
                r1 = r10
                b41.a$c r1 = (b41.C31128a.C31131c) r1     // Catch:{ all -> 0x0072 }
                java.lang.Object r1 = r1.mo71340a()     // Catch:{ all -> 0x0072 }
                mt0.e r1 = (mt0.C37261e) r1     // Catch:{ all -> 0x0072 }
                androidx.lifecycle.x r3 = r0.f91320n     // Catch:{ all -> 0x0072 }
                b41.a$c r4 = new b41.a$c     // Catch:{ all -> 0x0072 }
                ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.piggybank.CasDetailsUiModel r5 = r0.f91300A     // Catch:{ all -> 0x0072 }
                if (r5 != 0) goto L_0x0027
                java.lang.String r5 = "details"
                kotlin.jvm.internal.C41536l.m120506z(r5)     // Catch:{ all -> 0x0072 }
                goto L_0x0028
            L_0x0027:
                r2 = r5
            L_0x0028:
                mt0.a r0 = r0.m111710Yw(r2)     // Catch:{ all -> 0x0072 }
                int r2 = r10.mo71341b()     // Catch:{ all -> 0x0072 }
                r4.<init>(r0, r2)     // Catch:{ all -> 0x0072 }
                r3.mo4823o(r4)     // Catch:{ all -> 0x0072 }
                java.util.List r0 = r1.mo90360a()     // Catch:{ all -> 0x0072 }
                int r1 = r10.mo71341b()     // Catch:{ all -> 0x0072 }
                b41.a$c r2 = new b41.a$c     // Catch:{ all -> 0x0072 }
                r2.<init>(r0, r1)     // Catch:{ all -> 0x0072 }
                goto L_0x0082
            L_0x0044:
                boolean r0 = r10 instanceof b41.C31128a.C31129a     // Catch:{ all -> 0x0072 }
                if (r0 == 0) goto L_0x005d
                b41.a$a r2 = new b41.a$a     // Catch:{ all -> 0x0072 }
                r0 = r10
                b41.a$a r0 = (b41.C31128a.C31129a) r0     // Catch:{ all -> 0x0072 }
                java.lang.Throwable r4 = r0.mo71342c()     // Catch:{ all -> 0x0072 }
                int r5 = r10.mo71341b()     // Catch:{ all -> 0x0072 }
                r6 = 0
                r7 = 4
                r8 = 0
                r3 = r2
                r3.<init>(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0072 }
                goto L_0x0082
            L_0x005d:
                boolean r0 = r10 instanceof b41.C31128a.C31130b     // Catch:{ all -> 0x0072 }
                if (r0 == 0) goto L_0x006c
                b41.a$b r0 = new b41.a$b     // Catch:{ all -> 0x0072 }
                int r1 = r10.mo71341b()     // Catch:{ all -> 0x0072 }
                r3 = 2
                r0.<init>(r1, r2, r3, r2)     // Catch:{ all -> 0x0072 }
                goto L_0x0081
            L_0x006c:
                kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x0072 }
                r0.<init>()     // Catch:{ all -> 0x0072 }
                throw r0     // Catch:{ all -> 0x0072 }
            L_0x0072:
                r0 = move-exception
                r2 = r0
                b41.a$a r0 = new b41.a$a
                int r3 = r10.mo71341b()
                r4 = 0
                r5 = 4
                r6 = 0
                r1 = r0
                r1.<init>(r2, r3, r4, r5, r6)
            L_0x0081:
                r2 = r0
            L_0x0082:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: pt0.C37996r.C38001e.invoke(b41.a):b41.a");
        }
    }

    /* renamed from: pt0.r$f */
    static final class C38002f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C37996r f91340d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38002f(C37996r rVar) {
            super(1);
            this.f91340d = rVar;
        }

        /* renamed from: a */
        public final C40754t invoke(C37982e eVar) {
            Object obj;
            String str;
            boolean z;
            C41536l.m120489i(eVar, "it");
            Long a = eVar.mo91339a();
            C37261e zw = this.f91340d.f91301B;
            CasDetailsUiModel casDetailsUiModel = null;
            if (zw == null) {
                C41536l.m120506z("resources");
                zw = null;
            }
            Iterator it = zw.mo90362c().mo75182a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                long a2 = ((CasAccountUiModel) obj).mo75002a();
                if (a != null && a2 == a.longValue()) {
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
            CasAccountUiModel casAccountUiModel = (CasAccountUiModel) obj;
            if (casAccountUiModel != null) {
                str = casAccountUiModel.mo75004d();
            } else {
                str = null;
            }
            String valueOf = String.valueOf(str);
            C39849d nw = this.f91340d.f91316j;
            Long ow = this.f91340d.m111695Gw();
            C41536l.m120486f(ow);
            long longValue = ow.longValue();
            CasDetailsUiModel pw = this.f91340d.f91300A;
            if (pw == null) {
                C41536l.m120506z("details");
            } else {
                casDetailsUiModel = pw;
            }
            C40749p f = nw.mo93559b(longValue, casDetailsUiModel.mo75128f(), a).mo94897f(C40749p.m118043h0(valueOf));
            C41536l.m120488h(f, "closePiggyBank(customerI…(Observable.just(acctNo))");
            return C31270e.m92879h(f, -1);
        }
    }

    /* renamed from: pt0.r$g */
    static final class C38003g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C37996r f91341d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38003g(C37996r rVar) {
            super(1);
            this.f91341d = rVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final void m111766c(C37996r rVar) {
            C41536l.m120489i(rVar, "this$0");
            rVar.f91302C.onNext(C41238w.f97225a);
        }

        /* renamed from: b */
        public final C40754t invoke(C37999c cVar) {
            C41536l.m120489i(cVar, "it");
            C39857g qw = this.f91341d.f91315i;
            Long ow = this.f91341d.m111695Gw();
            C41536l.m120486f(ow);
            long longValue = ow.longValue();
            CasDetailsUiModel pw = this.f91341d.f91300A;
            CasDetailsUiModel casDetailsUiModel = null;
            if (pw == null) {
                C41536l.m120506z("details");
                pw = null;
            }
            String valueOf = String.valueOf(pw.mo75128f());
            double b = cVar.mo91374b();
            CasDetailsUiModel pw2 = this.f91341d.f91300A;
            if (pw2 == null) {
                C41536l.m120506z("details");
            } else {
                casDetailsUiModel = pw2;
            }
            C40734b o = qw.mo93563b(longValue, valueOf, b, casDetailsUiModel.mo75133j(), cVar.mo91373a()).mo94902o(new C38013s(this.f91341d));
            C41536l.m120488h(o, "editCasAgreement(\n      …t(Unit)\n                }");
            return C31270e.m92878g(o, -1);
        }
    }

    /* renamed from: pt0.r$h */
    static final class C38004h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C37996r f91342d;

        /* renamed from: pt0.r$h$a */
        static final class C38005a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ Long f91343d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C38005a(Long l) {
                super(1);
                this.f91343d = l;
            }

            /* renamed from: a */
            public final Double invoke(C27631i iVar) {
                Object obj;
                double d;
                BigDecimal f;
                boolean z;
                C41536l.m120489i(iVar, "accounts");
                List a = iVar.mo67075a().mo67081a();
                Long l = this.f91343d;
                Iterator it = a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    long b = ((C27623a) obj).mo67002b();
                    if (l != null && b == l.longValue()) {
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
                C27623a aVar = (C27623a) obj;
                if (aVar == null || (f = aVar.mo67007f()) == null) {
                    d = Utils.DOUBLE_EPSILON;
                } else {
                    d = f.doubleValue();
                }
                return Double.valueOf(d);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38004h(C37996r rVar) {
            super(1);
            this.f91342d = rVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final Double m111769c(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (Double) lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40754t invoke(Long l) {
            C41536l.m120489i(l, "acctKey");
            C40749p k0 = C26625h.m83089d(this.f91342d.f91317k, false, 1, (Object) null).mo95026k0(new C38014t(new C38005a(l)));
            C41536l.m120488h(k0, "acctKey ->\n             …0.0\n                    }");
            return C31270e.m92879h(k0, -1);
        }
    }

    /* renamed from: pt0.r$i */
    static final class C38006i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C37996r f91344d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38006i(C37996r rVar) {
            super(1);
            this.f91344d = rVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final void m111773c(C37996r rVar) {
            C41536l.m120489i(rVar, "this$0");
            rVar.f91302C.onNext(C41238w.f97225a);
        }

        /* renamed from: b */
        public final C40754t invoke(Integer num) {
            C41536l.m120489i(num, "index");
            C37261e zw = this.f91344d.f91301B;
            CasDetailsUiModel casDetailsUiModel = null;
            if (zw == null) {
                C41536l.m120506z("resources");
                zw = null;
            }
            PiggyBankPausePeriodUiModel piggyBankPausePeriodUiModel = (PiggyBankPausePeriodUiModel) zw.mo90361b().get(num.intValue());
            C39861h0 yw = this.f91344d.f91312f;
            Long ow = this.f91344d.m111695Gw();
            C41536l.m120486f(ow);
            long longValue = ow.longValue();
            CasDetailsUiModel pw = this.f91344d.f91300A;
            if (pw == null) {
                C41536l.m120506z("details");
            } else {
                casDetailsUiModel = pw;
            }
            C40734b o = yw.mo93567a(longValue, casDetailsUiModel.mo75128f(), piggyBankPausePeriodUiModel.mo75173e(), piggyBankPausePeriodUiModel.mo75171d()).mo94902o(new C38015u(this.f91344d));
            C41536l.m120488h(o, "pausePiggyBank(\n        …t(Unit)\n                }");
            return C31270e.m92878g(o, -1);
        }
    }

    /* renamed from: pt0.r$j */
    static final class C38007j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C37996r f91345d;

        /* renamed from: pt0.r$j$a */
        /* synthetic */ class C38008a extends C41535k implements C43075l {
            C38008a(Object obj) {
                super(1, obj, C37996r.class, "toPagerModel", "toPagerModel(Lge/bog/mobilebank/loyaltyandbonusprograms/domain/model/cas/CasDetails;)Lge/bog/mobilebank/loyaltyandbonusprograms/presentation/model/piggybank/CasPagerDetailsUiModel;", 0);
            }

            /* renamed from: b */
            public final C37257a invoke(C40249b bVar) {
                C41536l.m120489i(bVar, "p0");
                return ((C37996r) this.receiver).m111711Zw(bVar);
            }
        }

        /* renamed from: pt0.r$j$b */
        static final class C38009b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C37996r f91346d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C38009b(C37996r rVar) {
                super(1);
                this.f91346d = rVar;
            }

            /* renamed from: a */
            public final void mo91387a(C37257a aVar) {
                this.f91346d.f91300A = aVar.mo90344a();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo91387a((C37257a) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38007j(C37996r rVar) {
            super(1);
            this.f91345d = rVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public static final C37257a m111777d(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (C37257a) lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public static final void m111778e(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        /* renamed from: c */
        public final C40754t invoke(C37987i iVar) {
            C41536l.m120489i(iVar, "req");
            int b = iVar.mo91364b();
            C40762x m = this.f91345d.f91311e.mo93576b(iVar.mo91363a(), C41341q.m119910m(153, 6).contains(Integer.valueOf(b))).mo95062A(new C38016v(new C38008a(this.f91345d))).mo95084m(new C38017w(new C38009b(this.f91345d)));
            C41536l.m120488h(m, "private fun subscribeToP…ndToLifecycle()\n        }");
            if (b == 153) {
                b = 1;
            }
            return C31270e.m92880i(m, b);
        }
    }

    /* renamed from: pt0.r$k */
    static final class C38010k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C37996r f91347d;

        /* renamed from: e */
        final /* synthetic */ long f91348e;

        /* renamed from: pt0.r$k$a */
        static final class C38011a extends C41537m implements C43079p {

            /* renamed from: d */
            final /* synthetic */ C37996r f91349d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C38011a(C37996r rVar) {
                super(2);
                this.f91349d = rVar;
            }

            /* renamed from: a */
            public final C37261e invoke(C40249b bVar, C31065b bVar2) {
                C41536l.m120489i(bVar, "det");
                C41536l.m120489i(bVar2, "res");
                C37996r rVar = this.f91349d;
                rVar.f91301B = C37264h.m110028d(rVar.f91319m, bVar2, false, 2, (Object) null);
                C37996r rVar2 = this.f91349d;
                rVar2.f91300A = rVar2.f91318l.mo89932h(bVar);
                C37261e zw = this.f91349d.f91301B;
                if (zw != null) {
                    return zw;
                }
                C41536l.m120506z("resources");
                return null;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38010k(C37996r rVar, long j) {
            super(1);
            this.f91347d = rVar;
            this.f91348e = j;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final C37261e m111783c(C43079p pVar, Object obj, Object obj2) {
            C41536l.m120489i(pVar, "$tmp0");
            return (C37261e) pVar.invoke(obj, obj2);
        }

        /* renamed from: b */
        public final C40754t invoke(Integer num) {
            long j;
            C41536l.m120489i(num, "rc");
            C39874n sw = this.f91347d.f91311e;
            if (this.f91347d.f91300A != null) {
                CasDetailsUiModel pw = this.f91347d.f91300A;
                if (pw == null) {
                    C41536l.m120506z("details");
                    pw = null;
                }
                j = pw.mo75128f();
            } else {
                j = this.f91348e;
            }
            C40762x T = C40762x.m118154T(C39874n.m115650c(sw, j, false, 2, (Object) null), this.f91347d.f91310d.mo93556b(), new C38018x(new C38011a(this.f91347d)));
            C41536l.m120488h(T, "private fun subscribeToP…ndToLifecycle()\n        }");
            return C31270e.m92880i(T, num.intValue());
        }
    }

    /* renamed from: pt0.r$l */
    static final class C38012l extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C37996r f91350d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38012l(C37996r rVar) {
            super(1);
            this.f91350d = rVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final void m111787c(C37996r rVar) {
            C41536l.m120489i(rVar, "this$0");
            rVar.f91302C.onNext(C41238w.f97225a);
        }

        /* renamed from: b */
        public final C40754t invoke(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            C39865j0 Aw = this.f91350d.f91313g;
            Long ow = this.f91350d.m111695Gw();
            C41536l.m120486f(ow);
            long longValue = ow.longValue();
            CasDetailsUiModel pw = this.f91350d.f91300A;
            if (pw == null) {
                C41536l.m120506z("details");
                pw = null;
            }
            C40734b o = Aw.mo93570a(longValue, pw.mo75128f()).mo94902o(new C38019y(this.f91350d));
            C41536l.m120488h(o, "resumePiggyBank(customer…it)\n                    }");
            return C31270e.m92878g(o, -1);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37996r(C39845b0 b0Var, C39874n nVar, C39861h0 h0Var, C39865j0 j0Var, C36735g gVar, C39857g gVar2, C39849d dVar, C26625h hVar, C36990a aVar, C37264h hVar2, long j) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(b0Var, "getPiggyBankResources");
        C41536l.m120489i(nVar, "getCasDetails");
        C41536l.m120489i(h0Var, "pausePiggyBank");
        C41536l.m120489i(j0Var, "resumePiggyBank");
        C41536l.m120489i(gVar, "getLoginInfo");
        C41536l.m120489i(gVar2, "editCasAgreement");
        C41536l.m120489i(dVar, "closePiggyBank");
        C41536l.m120489i(hVar, "getAccountsAndDetails");
        C41536l.m120489i(aVar, "casMapper");
        C41536l.m120489i(hVar2, "mapper");
        this.f91310d = b0Var;
        this.f91311e = nVar;
        this.f91312f = h0Var;
        this.f91313g = j0Var;
        this.f91314h = gVar;
        this.f91315i = gVar2;
        this.f91316j = dVar;
        this.f91317k = hVar;
        this.f91318l = aVar;
        this.f91319m = hVar2;
        C1644x xVar = new C1644x();
        this.f91321o = xVar;
        this.f91322p = C1607m0.m5655c(xVar, new C38001e(this));
        this.f91323q = new C1644x();
        this.f91324r = new C1644x();
        this.f91325s = new C1644x();
        this.f91326t = new C1644x();
        this.f91327u = new C1644x();
        this.f91328v = new C1644x();
        this.f91329w = new C1644x();
        this.f91330x = new C1644x();
        C1644x xVar2 = new C1644x();
        this.f91331y = xVar2;
        this.f91332z = C1607m0.m5655c(xVar2, new C38000d(this));
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<Unit>()");
        this.f91302C = h1;
        C40767b h12 = C40767b.m118210h1();
        C41536l.m120488h(h12, "create<ClosePiggyBankAcctWrapper>()");
        this.f91303D = h12;
        C40767b h13 = C40767b.m118210h1();
        C41536l.m120488h(h13, "create<PiggyBankSubjectData>()");
        this.f91304E = h13;
        C40767b h14 = C40767b.m118210h1();
        C41536l.m120488h(h14, "create<Int>()");
        this.f91305F = h14;
        C40767b h15 = C40767b.m118210h1();
        C41536l.m120488h(h15, "create<Int>()");
        this.f91306G = h15;
        C40767b h16 = C40767b.m118210h1();
        C41536l.m120488h(h16, "create<Unit>()");
        this.f91307H = h16;
        C40767b h17 = C40767b.m118210h1();
        C41536l.m120488h(h17, "create<EditCasData>()");
        this.f91308I = h17;
        C40767b h18 = C40767b.m118210h1();
        C41536l.m120488h(h18, "create<Long>()");
        this.f91309J = h18;
        C40749p m0 = C40749p.m118049m0(onInit(), onRefresh(), h1.mo95026k0(new C37995q(C37997a.f91333d)));
        C41536l.m120488h(m0, "merge(onInit(), onRefres…Reload.map { RC_RELOAD })");
        bindToLifecycle(C32343x.m95487t(m0, (C43064a) null, (C43075l) null, new C37998b(this, j), 3, (Object) null));
        m111704Sw();
        m111706Uw(j);
        m111696Kw();
        m111702Qw();
        m111708Ww();
        m111698Mw();
        m111700Ow();
    }

    /* access modifiers changed from: private */
    /* renamed from: Gw */
    public final Long m111695Gw() {
        C37228a a = this.f91314h.mo89562a();
        if (a != null) {
            return Long.valueOf(a.mo90305b());
        }
        return null;
    }

    /* renamed from: Kw */
    private final void m111696Kw() {
        C40749p L0 = this.f91303D.mo94989L0(new C37990l(new C38002f(this)));
        C41536l.m120488h(L0, "private fun subscribeToC…ndToLifecycle()\n        }");
        bindToLifecycle(C31270e.m92876e(L0, this.f91328v));
    }

    /* access modifiers changed from: private */
    /* renamed from: Lw */
    public static final C40754t m111697Lw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: Mw */
    private final void m111698Mw() {
        C40749p L0 = this.f91308I.mo94989L0(new C37994p(new C38003g(this)));
        C41536l.m120488h(L0, "private fun subscribeToE…ndToLifecycle()\n        }");
        bindToLifecycle(C31270e.m92876e(L0, this.f91329w));
    }

    /* access modifiers changed from: private */
    /* renamed from: Nw */
    public static final C40754t m111699Nw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: Ow */
    private final void m111700Ow() {
        C40749p L0 = this.f91309J.mo94989L0(new C37991m(new C38004h(this)));
        C41536l.m120488h(L0, "private fun subscribeToG…ndToLifecycle()\n        }");
        bindToLifecycle(C31270e.m92876e(L0, this.f91331y));
    }

    /* access modifiers changed from: private */
    /* renamed from: Pw */
    public static final C40754t m111701Pw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: Qw */
    private final void m111702Qw() {
        C40749p L0 = this.f91306G.mo94989L0(new C37988j(new C38006i(this)));
        C41536l.m120488h(L0, "private fun subscribeToP…ndToLifecycle()\n        }");
        bindToLifecycle(C31270e.m92876e(L0, this.f91329w));
    }

    /* access modifiers changed from: private */
    /* renamed from: Rw */
    public static final C40754t m111703Rw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: Sw */
    private final void m111704Sw() {
        C40749p L0 = this.f91304E.mo94989L0(new C37993o(new C38007j(this)));
        C41536l.m120488h(L0, "private fun subscribeToP…ndToLifecycle()\n        }");
        bindToLifecycle(C31270e.m92876e(L0, this.f91320n));
    }

    /* access modifiers changed from: private */
    /* renamed from: Tw */
    public static final C40754t m111705Tw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: Uw */
    private final void m111706Uw(long j) {
        C40749p L0 = this.f91305F.mo94989L0(new C37989k(new C38010k(this, j)));
        C41536l.m120488h(L0, "private fun subscribeToP…ndToLifecycle()\n        }");
        bindToLifecycle(C31270e.m92876e(L0, this.f91321o));
    }

    /* access modifiers changed from: private */
    /* renamed from: Vw */
    public static final C40754t m111707Vw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: Ww */
    private final void m111708Ww() {
        C40749p L0 = this.f91307H.mo94989L0(new C37992n(new C38012l(this)));
        C41536l.m120488h(L0, "private fun subscribeToR…ndToLifecycle()\n        }");
        bindToLifecycle(C31270e.m92876e(L0, this.f91329w));
    }

    /* access modifiers changed from: private */
    /* renamed from: Xw */
    public static final C40754t m111709Xw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Yw */
    public final C37257a m111710Yw(CasDetailsUiModel casDetailsUiModel) {
        boolean z;
        C37261e eVar = this.f91301B;
        if (eVar == null) {
            C41536l.m120506z("resources");
            eVar = null;
        }
        Iterator it = eVar.mo90360a().iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (casDetailsUiModel.mo75128f() == ((CasDetailsUiModel) it.next()).mo75128f()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                break;
            }
            i++;
        }
        return new C37257a(casDetailsUiModel, i);
    }

    /* access modifiers changed from: private */
    /* renamed from: Zw */
    public final C37257a m111711Zw(C40249b bVar) {
        boolean z;
        C37261e eVar = this.f91301B;
        if (eVar == null) {
            C41536l.m120506z("resources");
            eVar = null;
        }
        Iterator it = eVar.mo90360a().iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (bVar.mo94213a().mo94250j() == ((CasDetailsUiModel) it.next()).mo75128f()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                break;
            }
            i++;
        }
        return new C37257a(this.f91318l.mo89932h(bVar), i);
    }

    /* access modifiers changed from: private */
    /* renamed from: lw */
    public static final Integer m111720lw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (Integer) lVar.invoke(obj);
    }

    /* renamed from: Gq */
    public LiveData mo91353Gq() {
        return this.f91325s;
    }

    /* renamed from: H4 */
    public LiveData mo91354H4() {
        return this.f91322p;
    }

    /* renamed from: Hw */
    public final C37984g mo91368Hw() {
        return this;
    }

    /* renamed from: I0 */
    public void mo91343I0(List list) {
        C41536l.m120489i(list, "selectedAccounts");
        C40767b bVar = this.f91308I;
        CasDetailsUiModel casDetailsUiModel = this.f91300A;
        if (casDetailsUiModel == null) {
            C41536l.m120506z("details");
            casDetailsUiModel = null;
        }
        double l = casDetailsUiModel.mo75135l();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((PiggyBankAccountUiModel) it.next()).mo75157a().mo75002a()));
        }
        bVar.onNext(new C37999c(l, arrayList));
    }

    /* renamed from: Iw */
    public final C37986h mo91369Iw() {
        return this;
    }

    /* renamed from: Jw */
    public void mo91370Jw() {
        C40767b bVar = this.f91309J;
        CasDetailsUiModel casDetailsUiModel = this.f91300A;
        if (casDetailsUiModel == null) {
            C41536l.m120506z("details");
            casDetailsUiModel = null;
        }
        bVar.onNext(Long.valueOf(casDetailsUiModel.mo75132i().mo75083a()));
    }

    /* renamed from: Ki */
    public LiveData mo91355Ki() {
        return this.f91329w;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: ge.bog.mobilebank.shared.helper.ImageSource$Url} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: ge.bog.mobilebank.shared.helper.ImageSource$Resource} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: ge.bog.mobilebank.shared.helper.ImageSource$Resource} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: ge.bog.mobilebank.shared.helper.ImageSource$Url} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: ge.bog.mobilebank.shared.helper.ImageSource$Url} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: ge.bog.mobilebank.shared.helper.ImageSource$Url} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: L2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo91344L2() {
        /*
            r13 = this;
            mt0.e r0 = r13.f91301B
            r1 = 0
            if (r0 != 0) goto L_0x000b
            java.lang.String r0 = "resources"
            kotlin.jvm.internal.C41536l.m120506z(r0)
            r0 = r1
        L_0x000b:
            ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.piggybank.PiggyBankResourcesUiModel r0 = r0.mo90362c()
            java.util.List r0 = r0.mo75182a()
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = ie1.C41343r.m119925u(r0, r3)
            r2.<init>(r3)
            java.util.Iterator r0 = r0.iterator()
        L_0x0022:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x009c
            java.lang.Object r3 = r0.next()
            ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.cas.CasAccountUiModel r3 = (p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.cas.CasAccountUiModel) r3
            java.lang.String r5 = r3.mo75011j()
            if (r5 == 0) goto L_0x003f
            ge.bog.mobilebank.shared.helper.ImageSource$Url r10 = new ge.bog.mobilebank.shared.helper.ImageSource$Url
            r6 = 0
            r7 = 0
            r8 = 6
            r9 = 0
            r4 = r10
            r4.<init>(r5, r6, r7, r8, r9)
            goto L_0x0056
        L_0x003f:
            java.lang.Integer r4 = r3.mo75006e()
            if (r4 == 0) goto L_0x004f
            int r4 = r4.intValue()
            ge.bog.mobilebank.shared.helper.ImageSource$Resource r10 = new ge.bog.mobilebank.shared.helper.ImageSource$Resource
            r10.<init>(r4)
            goto L_0x0056
        L_0x004f:
            ge.bog.mobilebank.shared.helper.ImageSource$Resource r10 = new ge.bog.mobilebank.shared.helper.ImageSource$Resource
            int r4 = rs0.C38335b.f91849a
            r10.<init>(r4)
        L_0x0056:
            ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.piggybank.CasDetailsUiModel r4 = r13.f91300A
            if (r4 != 0) goto L_0x0060
            java.lang.String r4 = "details"
            kotlin.jvm.internal.C41536l.m120506z(r4)
            r4 = r1
        L_0x0060:
            java.util.List r4 = r4.mo75122a()
            boolean r5 = r4 instanceof java.util.Collection
            r6 = 0
            if (r5 == 0) goto L_0x0070
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L_0x0070
            goto L_0x0093
        L_0x0070:
            java.util.Iterator r4 = r4.iterator()
        L_0x0074:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0093
            java.lang.Object r5 = r4.next()
            ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.cas.CasAccountUiModel r5 = (p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.cas.CasAccountUiModel) r5
            long r7 = r5.mo75002a()
            long r11 = r3.mo75002a()
            int r5 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            r7 = 1
            if (r5 != 0) goto L_0x008f
            r5 = r7
            goto L_0x0090
        L_0x008f:
            r5 = r6
        L_0x0090:
            if (r5 == 0) goto L_0x0074
            r6 = r7
        L_0x0093:
            ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.piggybank.PiggyBankAccountUiModel r4 = new ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.piggybank.PiggyBankAccountUiModel
            r4.<init>(r3, r10, r6)
            r2.add(r4)
            goto L_0x0022
        L_0x009c:
            androidx.lifecycle.x r0 = r13.f91326t
            m41.a r1 = g91.C32343x.m95466m(r2)
            r0.mo4823o(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pt0.C37996r.mo91344L2():void");
    }

    /* renamed from: L5 */
    public LiveData mo91356L5() {
        return this.f91332z;
    }

    /* renamed from: P7 */
    public LiveData mo91357P7() {
        return this.f91326t;
    }

    /* renamed from: Q3 */
    public LiveData mo91358Q3() {
        return this.f91327u;
    }

    /* renamed from: Ur */
    public LiveData mo91359Ur() {
        return this.f91320n;
    }

    /* renamed from: W */
    public void mo91345W(int i) {
        C37261e eVar = this.f91301B;
        CasDetailsUiModel casDetailsUiModel = null;
        if (eVar == null) {
            C41536l.m120506z("resources");
            eVar = null;
        }
        MoneyBoxTariffUiModel moneyBoxTariffUiModel = (MoneyBoxTariffUiModel) C41358y.m120010Z(eVar.mo90362c().mo75183b(), i);
        if (moneyBoxTariffUiModel != null) {
            C40767b bVar = this.f91308I;
            double e = moneyBoxTariffUiModel.mo75113e();
            CasDetailsUiModel casDetailsUiModel2 = this.f91300A;
            if (casDetailsUiModel2 == null) {
                C41536l.m120506z("details");
            } else {
                casDetailsUiModel = casDetailsUiModel2;
            }
            List<CasAccountUiModel> a = casDetailsUiModel.mo75122a();
            ArrayList arrayList = new ArrayList(C41343r.m119925u(a, 10));
            for (CasAccountUiModel a2 : a) {
                arrayList.add(Long.valueOf(a2.mo75002a()));
            }
            bVar.onNext(new C37999c(e, arrayList));
        }
    }

    /* renamed from: Zp */
    public void mo91346Zp() {
        CasDetailsUiModel casDetailsUiModel = this.f91300A;
        if (casDetailsUiModel != null) {
            C1644x xVar = this.f91327u;
            if (casDetailsUiModel == null) {
                C41536l.m120506z("details");
                casDetailsUiModel = null;
            }
            C37261e eVar = this.f91301B;
            if (eVar == null) {
                C41536l.m120506z("resources");
                eVar = null;
            }
            List<CasAccountUiModel> a = eVar.mo90362c().mo75182a();
            ArrayList arrayList = new ArrayList(C41343r.m119925u(a, 10));
            for (CasAccountUiModel casAccountUiModel : a) {
                String b = casAccountUiModel.mo75003b();
                long a2 = casAccountUiModel.mo75002a();
                double f = casAccountUiModel.mo75007f();
                String g = casAccountUiModel.mo75008g();
                if (g == null) {
                    CasDetailsUiModel casDetailsUiModel2 = this.f91300A;
                    if (casDetailsUiModel2 == null) {
                        C41536l.m120506z("details");
                        casDetailsUiModel2 = null;
                    }
                    g = casDetailsUiModel2.mo75133j();
                }
                arrayList.add(new ClosePiggyBankFragment.ClosePiggyBankAccount(b, a2, f, g));
            }
            xVar.mo4823o(C32343x.m95466m(new ClosePiggyBankActionSheet.ClosePiggyBankResources(casDetailsUiModel, arrayList)));
        }
    }

    /* renamed from: b1 */
    public void mo91347b1() {
        boolean z;
        C37261e eVar = this.f91301B;
        if (eVar == null) {
            C41536l.m120506z("resources");
            eVar = null;
        }
        List<MoneyBoxTariffUiModel> b = eVar.mo90362c().mo75183b();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(b, 10));
        for (MoneyBoxTariffUiModel moneyBoxTariffUiModel : b) {
            CasDetailsUiModel casDetailsUiModel = this.f91300A;
            if (casDetailsUiModel == null) {
                C41536l.m120506z("details");
                casDetailsUiModel = null;
            }
            String b2 = moneyBoxTariffUiModel.mo75110b(casDetailsUiModel.mo75133j());
            C41536l.m120488h(b2, "it.getFormattedAmount(details.schemeTariffCcy)");
            long d = moneyBoxTariffUiModel.mo75111d();
            CasDetailsUiModel casDetailsUiModel2 = this.f91300A;
            if (casDetailsUiModel2 == null) {
                C41536l.m120506z("details");
                casDetailsUiModel2 = null;
            }
            if (d == casDetailsUiModel2.mo75134k()) {
                z = true;
            } else {
                z = false;
            }
            arrayList.add(new SelectorChipData(b2, z));
        }
        this.f91324r.mo4823o(C32343x.m95466m(arrayList));
    }

    /* renamed from: b8 */
    public void mo91348b8(int i) {
        this.f91306G.onNext(Integer.valueOf(i));
    }

    /* renamed from: ma */
    public void mo91349ma() {
        CasDetailsUiModel casDetailsUiModel = this.f91300A;
        if (casDetailsUiModel == null) {
            C41536l.m120506z("details");
            casDetailsUiModel = null;
        }
        if (casDetailsUiModel.mo75137p()) {
            C37261e eVar = this.f91301B;
            if (eVar == null) {
                C41536l.m120506z("resources");
                eVar = null;
            }
            List<PiggyBankPausePeriodUiModel> b = eVar.mo90361b();
            ArrayList arrayList = new ArrayList(C41343r.m119925u(b, 10));
            for (PiggyBankPausePeriodUiModel piggyBankPausePeriodUiModel : b) {
                String b2 = piggyBankPausePeriodUiModel.mo75170b();
                if (b2 == null) {
                    b2 = C32343x.m95388F(piggyBankPausePeriodUiModel.mo75169a(), new Object[0]);
                }
                arrayList.add(new SelectorChipData(b2, false, 2, (DefaultConstructorMarker) null));
            }
            this.f91325s.mo4823o(C32343x.m95466m(arrayList));
            return;
        }
        this.f91307H.onNext(C41238w.f97225a);
    }

    /* renamed from: nv */
    public LiveData mo91360nv() {
        return this.f91330x;
    }

    /* renamed from: of */
    public void mo91350of(Long l) {
        this.f91303D.onNext(new C37982e(l));
    }

    /* renamed from: tq */
    public LiveData mo91361tq() {
        return this.f91324r;
    }

    /* renamed from: tv */
    public LiveData mo91362tv() {
        return this.f91328v;
    }

    /* renamed from: us */
    public void mo91351us() {
        CasDetailsUiModel casDetailsUiModel = this.f91300A;
        if (casDetailsUiModel != null) {
            C1644x xVar = this.f91330x;
            if (casDetailsUiModel == null) {
                C41536l.m120506z("details");
                casDetailsUiModel = null;
            }
            xVar.mo4823o(C32343x.m95466m(Long.valueOf(casDetailsUiModel.mo75132i().mo75083a())));
        }
    }

    /* renamed from: yo */
    public void mo91352yo(int i) {
        C37261e eVar = this.f91301B;
        if (eVar == null) {
            C41536l.m120506z("resources");
            eVar = null;
        }
        this.f91304E.onNext(new C37987i(((CasDetailsUiModel) eVar.mo90360a().get(i)).mo75128f(), -1));
    }
}
