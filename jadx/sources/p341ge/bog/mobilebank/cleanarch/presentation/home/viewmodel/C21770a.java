package p341ge.bog.mobilebank.cleanarch.presentation.home.viewmodel;

import androidx.lifecycle.C1613n0;
import g91.C32303f;
import g91.C32359z0;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import kotlin.jvm.internal.C41524c0;
import kotlin.jvm.internal.C41536l;
import p366bk.C10328q;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.home.viewmodel.a */
public final class C21770a extends C1613n0 {

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.home.viewmodel.a$a */
    public static final class C21771a {

        /* renamed from: a */
        private boolean f58118a;

        /* renamed from: b */
        private BigDecimal f58119b;

        /* renamed from: c */
        private BigDecimal f58120c;

        public C21771a(boolean z, BigDecimal bigDecimal, BigDecimal bigDecimal2) {
            C41536l.m120489i(bigDecimal, "totalSpend");
            C41536l.m120489i(bigDecimal2, "totalValue");
            this.f58118a = z;
            this.f58119b = bigDecimal;
            this.f58120c = bigDecimal2;
        }

        /* renamed from: a */
        public final boolean mo54297a() {
            return this.f58118a;
        }

        /* renamed from: b */
        public final BigDecimal mo54298b() {
            return this.f58119b;
        }

        /* renamed from: c */
        public final BigDecimal mo54299c() {
            return this.f58120c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C21771a)) {
                return false;
            }
            C21771a aVar = (C21771a) obj;
            return this.f58118a == aVar.f58118a && C41536l.m120484d(this.f58119b, aVar.f58119b) && C41536l.m120484d(this.f58120c, aVar.f58120c);
        }

        public int hashCode() {
            boolean z = this.f58118a;
            if (z) {
                z = true;
            }
            return ((((z ? 1 : 0) * true) + this.f58119b.hashCode()) * 31) + this.f58120c.hashCode();
        }

        public String toString() {
            boolean z = this.f58118a;
            BigDecimal bigDecimal = this.f58119b;
            BigDecimal bigDecimal2 = this.f58120c;
            return "BudgetHomeData(hasBudget=" + z + ", totalSpend=" + bigDecimal + ", totalValue=" + bigDecimal2 + ")";
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.home.viewmodel.a$b */
    public static final class C21772b {

        /* renamed from: a */
        private final String f58121a;

        /* renamed from: b */
        private final String f58122b;

        /* renamed from: c */
        private final int f58123c;

        public C21772b(String str, String str2, int i) {
            C41536l.m120489i(str, "budgetSubText");
            C41536l.m120489i(str2, "currBudget");
            this.f58121a = str;
            this.f58122b = str2;
            this.f58123c = i;
        }

        /* renamed from: a */
        public final String mo54303a() {
            return this.f58121a;
        }

        /* renamed from: b */
        public final String mo54304b() {
            return this.f58122b;
        }

        /* renamed from: c */
        public final int mo54305c() {
            return this.f58123c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C21772b)) {
                return false;
            }
            C21772b bVar = (C21772b) obj;
            return C41536l.m120484d(this.f58121a, bVar.f58121a) && C41536l.m120484d(this.f58122b, bVar.f58122b) && this.f58123c == bVar.f58123c;
        }

        public int hashCode() {
            return (((this.f58121a.hashCode() * 31) + this.f58122b.hashCode()) * 31) + this.f58123c;
        }

        public String toString() {
            String str = this.f58121a;
            String str2 = this.f58122b;
            int i = this.f58123c;
            return "SimpleBudgetHomeData(budgetSubText=" + str + ", currBudget=" + str2 + ", percentage=" + i + ")";
        }
    }

    /* renamed from: dw */
    public final C21772b mo54296dw(C21771a aVar) {
        String str;
        C41536l.m120489i(aVar, "budget");
        BigDecimal subtract = aVar.mo54299c().subtract(aVar.mo54298b());
        C41536l.m120488h(subtract, "this.subtract(other)");
        if (subtract.compareTo(BigDecimal.ZERO) < 0) {
            subtract = subtract.multiply(new BigDecimal(-1));
            C41536l.m120488h(subtract, "this.multiply(other)");
            str = C32359z0.m95557a0(C10328q.main_activity_budget_overspent);
            C41536l.m120488h(str, "getString(R.string.main_activity_budget_overspent)");
        } else {
            str = C32359z0.m95557a0(C10328q.main_activity_budget_remaining);
            C41536l.m120488h(str, "getString(R.string.main_activity_budget_remaining)");
        }
        BigDecimal multiply = aVar.mo54298b().multiply(new BigDecimal(100));
        C41536l.m120488h(multiply, "this.multiply(other)");
        BigDecimal divide = multiply.divide(aVar.mo54299c(), RoundingMode.HALF_EVEN);
        C41536l.m120488h(divide, "this.divide(other, RoundingMode.HALF_EVEN)");
        C41524c0 c0Var = C41524c0.f97701a;
        String format = String.format("%s%s", Arrays.copyOf(new Object[]{C32303f.m95204o(subtract.doubleValue()), "₾"}, 2));
        C41536l.m120488h(format, "format(format, *args)");
        return new C21772b(str, format, (int) Math.ceil(divide.doubleValue()));
    }
}
