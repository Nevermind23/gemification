package d30;

import a30.C19151a;
import a30.C19159d;
import com.github.mikephil.charting.utils.Utils;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: d30.a */
public abstract class C19878a {

    /* renamed from: a */
    public static final C19881c f54363a = new C19881c((DefaultConstructorMarker) null);

    /* renamed from: d30.a$a */
    public static final class C19879a extends C19878a {

        /* renamed from: b */
        private final double f54364b;

        /* renamed from: c */
        private final double f54365c;

        /* renamed from: d */
        private final boolean f54366d;

        /* renamed from: e */
        private final int f54367e;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C19879a(double d, double d2, boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(d, d2, z, (i2 & 8) != 0 ? 2 : i);
        }

        /* renamed from: a */
        public int mo48191a() {
            return this.f54367e;
        }

        /* renamed from: b */
        public final double mo48192b() {
            BigDecimal subtract = new BigDecimal(String.valueOf(this.f54364b)).subtract(new BigDecimal(String.valueOf(this.f54365c)));
            C41536l.m120488h(subtract, "this.subtract(other)");
            return subtract.doubleValue();
        }

        /* renamed from: c */
        public final double mo48193c() {
            return this.f54364b;
        }

        /* renamed from: d */
        public final boolean mo48194d() {
            return this.f54366d;
        }

        /* renamed from: e */
        public final double mo48195e() {
            return this.f54365c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C19879a)) {
                return false;
            }
            C19879a aVar = (C19879a) obj;
            return Double.compare(this.f54364b, aVar.f54364b) == 0 && Double.compare(this.f54365c, aVar.f54365c) == 0 && this.f54366d == aVar.f54366d && this.f54367e == aVar.f54367e;
        }

        public int hashCode() {
            int a = ((Double.doubleToLongBits(this.f54364b) * 31) + Double.doubleToLongBits(this.f54365c)) * 31;
            boolean z = this.f54366d;
            if (z) {
                z = true;
            }
            return ((a + (z ? 1 : 0)) * 31) + this.f54367e;
        }

        public String toString() {
            double d = this.f54364b;
            double d2 = this.f54365c;
            boolean z = this.f54366d;
            int i = this.f54367e;
            return "AmountsItem(operationsAmount=" + d + ", splitAmount=" + d2 + ", showDiff=" + z + ", itemType=" + i + ")";
        }

        public C19879a(double d, double d2, boolean z, int i) {
            super((DefaultConstructorMarker) null);
            this.f54364b = d;
            this.f54365c = d2;
            this.f54366d = z;
            this.f54367e = i;
        }
    }

    /* renamed from: d30.a$b */
    public static final class C19880b extends C19878a {

        /* renamed from: b */
        public static final C19880b f54368b = new C19880b();

        private C19880b() {
            super((DefaultConstructorMarker) null);
        }

        /* renamed from: a */
        public int mo48191a() {
            return 4;
        }
    }

    /* renamed from: d30.a$c */
    public static final class C19881c {
        private C19881c() {
        }

        public /* synthetic */ C19881c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: d30.a$d */
    public static final class C19882d extends C19878a {

        /* renamed from: b */
        private final C19159d f54369b;

        /* renamed from: c */
        private double f54370c;

        /* renamed from: d */
        private final int f54371d;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C19882d(C19159d dVar, double d, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(dVar, d, (i2 & 4) != 0 ? 8 : i);
        }

        /* renamed from: a */
        public int mo48191a() {
            return this.f54371d;
        }

        /* renamed from: b */
        public final C19159d mo48199b() {
            return this.f54369b;
        }

        /* renamed from: c */
        public final double mo48200c() {
            return this.f54370c;
        }

        /* renamed from: d */
        public final void mo48201d(double d) {
            this.f54370c = d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C19882d)) {
                return false;
            }
            C19882d dVar = (C19882d) obj;
            return C41536l.m120484d(this.f54369b, dVar.f54369b) && Double.compare(this.f54370c, dVar.f54370c) == 0 && this.f54371d == dVar.f54371d;
        }

        public int hashCode() {
            return (((this.f54369b.hashCode() * 31) + Double.doubleToLongBits(this.f54370c)) * 31) + this.f54371d;
        }

        public String toString() {
            C19159d dVar = this.f54369b;
            double d = this.f54370c;
            int i = this.f54371d;
            return "ContactItem(contact=" + dVar + ", requestedAmount=" + d + ", itemType=" + i + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19882d(C19159d dVar, double d, int i) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(dVar, "contact");
            this.f54369b = dVar;
            this.f54370c = d;
            this.f54371d = i;
        }
    }

    /* renamed from: d30.a$e */
    public static final class C19883e extends C19878a {

        /* renamed from: b */
        private final int f54372b;

        /* renamed from: c */
        private final int f54373c;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C19883e(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i3 & 2) != 0 ? 6 : i2);
        }

        /* renamed from: a */
        public int mo48191a() {
            return this.f54373c;
        }

        /* renamed from: b */
        public final int mo48205b() {
            return this.f54372b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C19883e)) {
                return false;
            }
            C19883e eVar = (C19883e) obj;
            return this.f54372b == eVar.f54372b && this.f54373c == eVar.f54373c;
        }

        public int hashCode() {
            return (this.f54372b * 31) + this.f54373c;
        }

        public String toString() {
            int i = this.f54372b;
            int i2 = this.f54373c;
            return "ContactsHeader(contactsCount=" + i + ", itemType=" + i2 + ")";
        }

        public C19883e(int i, int i2) {
            super((DefaultConstructorMarker) null);
            this.f54372b = i;
            this.f54373c = i2;
        }
    }

    /* renamed from: d30.a$f */
    public static final class C19884f extends C19878a {

        /* renamed from: b */
        private final C19151a f54374b;

        /* renamed from: c */
        private final int f54375c;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C19884f(C19151a aVar, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(aVar, (i2 & 2) != 0 ? 10 : i);
        }

        /* renamed from: a */
        public int mo48191a() {
            return this.f54375c;
        }

        /* renamed from: b */
        public final C19151a mo48209b() {
            return this.f54374b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C19884f)) {
                return false;
            }
            C19884f fVar = (C19884f) obj;
            return C41536l.m120484d(this.f54374b, fVar.f54374b) && this.f54375c == fVar.f54375c;
        }

        public int hashCode() {
            return (this.f54374b.hashCode() * 31) + this.f54375c;
        }

        public String toString() {
            C19151a aVar = this.f54374b;
            int i = this.f54375c;
            return "OperationItem(operation=" + aVar + ", itemType=" + i + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19884f(C19151a aVar, int i) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(aVar, "operation");
            this.f54374b = aVar;
            this.f54375c = i;
        }
    }

    /* renamed from: d30.a$g */
    public static final class C19885g extends C19878a {

        /* renamed from: b */
        public static final C19885g f54376b = new C19885g();

        private C19885g() {
            super((DefaultConstructorMarker) null);
        }

        /* renamed from: a */
        public int mo48191a() {
            return 0;
        }
    }

    /* renamed from: d30.a$h */
    public static final class C19886h extends C19878a {

        /* renamed from: b */
        private final List f54377b;

        /* renamed from: c */
        private final int f54378c;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C19886h(List list, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i2 & 2) != 0 ? 1 : i);
        }

        /* renamed from: a */
        public int mo48191a() {
            return this.f54378c;
        }

        /* renamed from: b */
        public final List mo48213b() {
            return this.f54377b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C19886h)) {
                return false;
            }
            C19886h hVar = (C19886h) obj;
            return C41536l.m120484d(this.f54377b, hVar.f54377b) && this.f54378c == hVar.f54378c;
        }

        public int hashCode() {
            return (this.f54377b.hashCode() * 31) + this.f54378c;
        }

        public String toString() {
            List list = this.f54377b;
            int i = this.f54378c;
            return "OperationsItem(operations=" + list + ", itemType=" + i + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19886h(List list, int i) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(list, "operations");
            this.f54377b = list;
            this.f54378c = i;
        }
    }

    /* renamed from: d30.a$i */
    public static final class C19887i extends C19878a {

        /* renamed from: b */
        private final boolean f54379b;

        /* renamed from: c */
        private final int f54380c;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C19887i(boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(z, (i2 & 2) != 0 ? 7 : i);
        }

        /* renamed from: a */
        public int mo48191a() {
            return this.f54380c;
        }

        /* renamed from: b */
        public final boolean mo48217b() {
            return this.f54379b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C19887i)) {
                return false;
            }
            C19887i iVar = (C19887i) obj;
            return this.f54379b == iVar.f54379b && this.f54380c == iVar.f54380c;
        }

        public int hashCode() {
            boolean z = this.f54379b;
            if (z) {
                z = true;
            }
            return ((z ? 1 : 0) * true) + this.f54380c;
        }

        public String toString() {
            boolean z = this.f54379b;
            int i = this.f54380c;
            return "ResetAmountItem(splitEvenly=" + z + ", itemType=" + i + ")";
        }

        public C19887i(boolean z, int i) {
            super((DefaultConstructorMarker) null);
            this.f54379b = z;
            this.f54380c = i;
        }
    }

    /* renamed from: d30.a$j */
    public static final class C19888j extends C19878a {

        /* renamed from: b */
        private final String f54381b;

        /* renamed from: c */
        private final String f54382c;

        /* renamed from: d */
        private final boolean f54383d;

        /* renamed from: e */
        private double f54384e;

        /* renamed from: f */
        private final int f54385f;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C19888j(String str, String str2, boolean z, double d, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, z, (i2 & 8) != 0 ? Utils.DOUBLE_EPSILON : d, (i2 & 16) != 0 ? 11 : i);
        }

        /* renamed from: a */
        public int mo48191a() {
            return this.f54385f;
        }

        /* renamed from: b */
        public final String mo48221b() {
            return this.f54382c;
        }

        /* renamed from: c */
        public final boolean mo48222c() {
            return this.f54383d;
        }

        /* renamed from: d */
        public final double mo48223d() {
            return this.f54384e;
        }

        /* renamed from: e */
        public final String mo48224e() {
            return this.f54381b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C19888j)) {
                return false;
            }
            C19888j jVar = (C19888j) obj;
            return C41536l.m120484d(this.f54381b, jVar.f54381b) && C41536l.m120484d(this.f54382c, jVar.f54382c) && this.f54383d == jVar.f54383d && Double.compare(this.f54384e, jVar.f54384e) == 0 && this.f54385f == jVar.f54385f;
        }

        /* renamed from: f */
        public final void mo48226f(double d) {
            this.f54384e = d;
        }

        public int hashCode() {
            String str = this.f54381b;
            int i = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f54382c;
            if (str2 != null) {
                i = str2.hashCode();
            }
            int i2 = (hashCode + i) * 31;
            boolean z = this.f54383d;
            if (z) {
                z = true;
            }
            return ((((i2 + (z ? 1 : 0)) * 31) + Double.doubleToLongBits(this.f54384e)) * 31) + this.f54385f;
        }

        public String toString() {
            String str = this.f54381b;
            String str2 = this.f54382c;
            boolean z = this.f54383d;
            double d = this.f54384e;
            int i = this.f54385f;
            return "SelfItem(title=" + str + ", imageUrl=" + str2 + ", include=" + z + ", requestedAmount=" + d + ", itemType=" + i + ")";
        }

        public C19888j(String str, String str2, boolean z, double d, int i) {
            super((DefaultConstructorMarker) null);
            this.f54381b = str;
            this.f54382c = str2;
            this.f54383d = z;
            this.f54384e = d;
            this.f54385f = i;
        }
    }

    /* renamed from: d30.a$k */
    public static final class C19889k extends C19878a {

        /* renamed from: b */
        public static final C19889k f54386b = new C19889k();

        private C19889k() {
            super((DefaultConstructorMarker) null);
        }

        /* renamed from: a */
        public int mo48191a() {
            return 5;
        }
    }

    /* renamed from: d30.a$l */
    public static final class C19890l extends C19878a {

        /* renamed from: b */
        private final C19899g f54387b;

        /* renamed from: c */
        private final int f54388c;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C19890l(C19899g gVar, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(gVar, (i2 & 2) != 0 ? 9 : i);
        }

        /* renamed from: a */
        public int mo48191a() {
            return this.f54388c;
        }

        /* renamed from: b */
        public final C19899g mo48229b() {
            return this.f54387b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C19890l)) {
                return false;
            }
            C19890l lVar = (C19890l) obj;
            return C41536l.m120484d(this.f54387b, lVar.f54387b) && this.f54388c == lVar.f54388c;
        }

        public int hashCode() {
            return (this.f54387b.hashCode() * 31) + this.f54388c;
        }

        public String toString() {
            C19899g gVar = this.f54387b;
            int i = this.f54388c;
            return "WizardField(wizardModel=" + gVar + ", itemType=" + i + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19890l(C19899g gVar, int i) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(gVar, "wizardModel");
            this.f54387b = gVar;
            this.f54388c = i;
        }
    }

    private C19878a() {
    }

    public /* synthetic */ C19878a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: a */
    public abstract int mo48191a();
}
