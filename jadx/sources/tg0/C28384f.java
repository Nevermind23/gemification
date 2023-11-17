package tg0;

import g91.C32343x;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.galtandtaggart.domain.transactionhistory.model.GTAcquire;
import p341ge.bog.mobilebank.galtandtaggart.domain.transactionhistory.model.GTDividend;
import p341ge.bog.mobilebank.galtandtaggart.domain.transactionhistory.model.GTDividendTax;
import p341ge.bog.mobilebank.galtandtaggart.domain.transactionhistory.model.GTInstrument;
import p341ge.bog.mobilebank.galtandtaggart.domain.transactionhistory.model.GTMergerRequisition;
import p341ge.bog.mobilebank.galtandtaggart.domain.transactionhistory.model.GTTransaction;

/* renamed from: tg0.f */
public final class C28384f {

    /* renamed from: i */
    public static final C28385a f71932i = new C28385a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final C28379a f71933a;

    /* renamed from: b */
    private final String f71934b;

    /* renamed from: c */
    private final String f71935c;

    /* renamed from: d */
    private final String f71936d;

    /* renamed from: e */
    private final String f71937e;

    /* renamed from: f */
    private final String f71938f;

    /* renamed from: g */
    private final GTTransaction f71939g;

    /* renamed from: h */
    private final C28387g f71940h;

    /* renamed from: tg0.f$a */
    public static final class C28385a {

        /* renamed from: tg0.f$a$a */
        public /* synthetic */ class C28386a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f71941a;

            /* JADX WARNING: Can't wrap try/catch for region: R(27:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|27) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
            /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0046 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0050 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x005a */
            /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0064 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x006e */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
            static {
                /*
                    tg0.c[] r0 = tg0.C28381c.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    tg0.c r1 = tg0.C28381c.NULL     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    tg0.c r1 = tg0.C28381c.TRAN_AMOUNT     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    tg0.c r1 = tg0.C28381c.CASH_AMOUNT     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    tg0.c r1 = tg0.C28381c.POSITION_DELTA     // Catch:{ NoSuchFieldError -> 0x002b }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                    r2 = 4
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
                L_0x002b:
                    tg0.c r1 = tg0.C28381c.ACQUIREE_SYMBOL     // Catch:{ NoSuchFieldError -> 0x0034 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                    r2 = 5
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
                L_0x0034:
                    tg0.c r1 = tg0.C28381c.ACQUIRER_SYMBOL     // Catch:{ NoSuchFieldError -> 0x003d }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                    r2 = 6
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
                L_0x003d:
                    tg0.c r1 = tg0.C28381c.DIVIDEND_AMOUNT_PER_SHARE     // Catch:{ NoSuchFieldError -> 0x0046 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                    r2 = 7
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
                L_0x0046:
                    tg0.c r1 = tg0.C28381c.DIVIDEND_TAX_RATE     // Catch:{ NoSuchFieldError -> 0x0050 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0050 }
                    r2 = 8
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0050 }
                L_0x0050:
                    tg0.c r1 = tg0.C28381c.INSTRUMENT_SYMBOL     // Catch:{ NoSuchFieldError -> 0x005a }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                    r2 = 9
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005a }
                L_0x005a:
                    tg0.c r1 = tg0.C28381c.SHARE_NAME     // Catch:{ NoSuchFieldError -> 0x0064 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                    r2 = 10
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0064 }
                L_0x0064:
                    tg0.c r1 = tg0.C28381c.FILL_QTY     // Catch:{ NoSuchFieldError -> 0x006e }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                    r2 = 11
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
                L_0x006e:
                    tg0.c r1 = tg0.C28381c.ORDER_QTY     // Catch:{ NoSuchFieldError -> 0x0078 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                    r2 = 12
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
                L_0x0078:
                    f71941a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: tg0.C28384f.C28385a.C28386a.<clinit>():void");
            }
        }

        private C28385a() {
        }

        public /* synthetic */ C28385a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        private final String m87063b(GTTransaction gTTransaction, C28381c cVar) {
            GTAcquire a;
            GTAcquire b;
            String str;
            String str2 = null;
            switch (C28386a.f71941a[cVar.ordinal()]) {
                case 1:
                    return null;
                case 2:
                    String C = gTTransaction.mo60152C();
                    if (C == null) {
                        return null;
                    }
                    return C + " $";
                case 3:
                    BigDecimal e = gTTransaction.mo60157e();
                    if (e != null) {
                        str2 = e.toString();
                    }
                    return str2 + " $";
                case 4:
                    return gTTransaction.mo60151B();
                case 5:
                    GTMergerRequisition v = gTTransaction.mo60175v();
                    if (v == null || (a = v.mo60139a()) == null) {
                        return null;
                    }
                    return a.mo60094b();
                case 6:
                    GTMergerRequisition v2 = gTTransaction.mo60175v();
                    if (v2 == null || (b = v2.mo60140b()) == null) {
                        return null;
                    }
                    return b.mo60094b();
                case 7:
                    GTDividend h = gTTransaction.mo60161h();
                    if (h != null) {
                        return h.mo60104a();
                    }
                    return null;
                case 8:
                    GTDividendTax i = gTTransaction.mo60163i();
                    if (i != null) {
                        return i.mo60116a();
                    }
                    return null;
                case 9:
                    GTInstrument t = gTTransaction.mo60172t();
                    if (t != null) {
                        return t.mo60129d();
                    }
                    return null;
                case 10:
                    GTInstrument t2 = gTTransaction.mo60172t();
                    if (t2 != null) {
                        str = t2.mo60128b();
                    } else {
                        str = null;
                    }
                    if (str == null || gTTransaction.mo60172t().mo60129d() == null) {
                        return null;
                    }
                    return gTTransaction.mo60172t().mo60128b() + " (" + gTTransaction.mo60172t().mo60129d() + ")";
                case 11:
                    return gTTransaction.mo60169q();
                case 12:
                    return gTTransaction.mo60150A();
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }

        /* renamed from: a */
        public final C28384f mo68015a(GTTransaction gTTransaction) {
            C28379a aVar;
            C41536l.m120489i(gTTransaction, "transaction");
            C28387g d = C28380b.m87049d(gTTransaction);
            if (d.mo68018c() == C28382d.OPERATION_TYPE) {
                aVar = d.mo68017b();
            } else {
                aVar = C28380b.m87048c(gTTransaction).mo68002b();
            }
            if (aVar == null) {
                aVar = C28379a.INFO;
            }
            C28379a aVar2 = aVar;
            String a = C28380b.m87046a(d);
            String r = gTTransaction.mo60170r();
            if (r == null) {
                r = "";
            }
            return new C28384f(aVar2, C32343x.m95420V(a, r, new Object[0]), C28380b.m87047b(gTTransaction, true), m87063b(gTTransaction, d.mo68021g()), m87063b(gTTransaction, d.mo68020f()), m87063b(gTTransaction, d.mo68019e()), gTTransaction, d);
        }

        /* renamed from: c */
        public final List mo68016c(List list) {
            C41536l.m120489i(list, "transactions");
            try {
                ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(mo68015a((GTTransaction) it.next()));
                }
                return arrayList;
            } catch (Exception unused) {
                return C41341q.m119907j();
            }
        }
    }

    public C28384f(C28379a aVar, String str, String str2, String str3, String str4, String str5, GTTransaction gTTransaction, C28387g gVar) {
        C41536l.m120489i(aVar, "appearance");
        C41536l.m120489i(str, "title");
        C41536l.m120489i(gTTransaction, "transaction");
        C41536l.m120489i(gVar, "transactionType");
        this.f71933a = aVar;
        this.f71934b = str;
        this.f71935c = str2;
        this.f71936d = str3;
        this.f71937e = str4;
        this.f71938f = str5;
        this.f71939g = gTTransaction;
        this.f71940h = gVar;
    }

    /* renamed from: a */
    public final C28379a mo68004a() {
        return this.f71933a;
    }

    /* renamed from: b */
    public final String mo68005b() {
        return this.f71935c;
    }

    /* renamed from: c */
    public final String mo68006c() {
        return this.f71938f;
    }

    /* renamed from: d */
    public final String mo68007d() {
        return this.f71937e;
    }

    /* renamed from: e */
    public final String mo68008e() {
        return this.f71936d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28384f)) {
            return false;
        }
        C28384f fVar = (C28384f) obj;
        return this.f71933a == fVar.f71933a && C41536l.m120484d(this.f71934b, fVar.f71934b) && C41536l.m120484d(this.f71935c, fVar.f71935c) && C41536l.m120484d(this.f71936d, fVar.f71936d) && C41536l.m120484d(this.f71937e, fVar.f71937e) && C41536l.m120484d(this.f71938f, fVar.f71938f) && C41536l.m120484d(this.f71939g, fVar.f71939g) && this.f71940h == fVar.f71940h;
    }

    /* renamed from: f */
    public final String mo68010f() {
        return this.f71934b;
    }

    /* renamed from: g */
    public final GTTransaction mo68011g() {
        return this.f71939g;
    }

    /* renamed from: h */
    public final C28387g mo68012h() {
        return this.f71940h;
    }

    public int hashCode() {
        int hashCode = ((this.f71933a.hashCode() * 31) + this.f71934b.hashCode()) * 31;
        String str = this.f71935c;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f71936d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f71937e;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f71938f;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return ((((hashCode4 + i) * 31) + this.f71939g.hashCode()) * 31) + this.f71940h.hashCode();
    }

    public String toString() {
        C28379a aVar = this.f71933a;
        String str = this.f71934b;
        String str2 = this.f71935c;
        String str3 = this.f71936d;
        String str4 = this.f71937e;
        String str5 = this.f71938f;
        GTTransaction gTTransaction = this.f71939g;
        C28387g gVar = this.f71940h;
        return "TransactionAdapterModel(appearance=" + aVar + ", title=" + str + ", date=" + str2 + ", rightTopText=" + str3 + ", rightBottomText=" + str4 + ", leftBottomText=" + str5 + ", transaction=" + gTTransaction + ", transactionType=" + gVar + ")";
    }
}
