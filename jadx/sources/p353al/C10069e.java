package p353al;

import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.Amount;

/* renamed from: al.e */
public abstract class C10069e {

    /* renamed from: al.e$a */
    public static final class C10070a extends C10069e {

        /* renamed from: a */
        public static final C10070a f27837a = new C10070a();

        private C10070a() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: al.e$b */
    public static final class C10071b extends C10069e {

        /* renamed from: a */
        private final List f27838a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10071b(List list) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(list, "ccyChips");
            this.f27838a = list;
        }

        /* renamed from: a */
        public final List mo26519a() {
            return this.f27838a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C10071b) && C41536l.m120484d(this.f27838a, ((C10071b) obj).f27838a);
        }

        public int hashCode() {
            return this.f27838a.hashCode();
        }

        public String toString() {
            List list = this.f27838a;
            return "Header(ccyChips=" + list + ")";
        }
    }

    /* renamed from: al.e$c */
    public static final class C10072c extends C10069e {

        /* renamed from: a */
        public static final C10072c f27839a = new C10072c();

        private C10072c() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: al.e$d */
    public static final class C10073d extends C10069e {

        /* renamed from: a */
        private final String f27840a;

        /* renamed from: b */
        private final String f27841b;

        /* renamed from: c */
        private final Amount f27842c;

        /* renamed from: d */
        private final List f27843d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10073d(String str, String str2, Amount amount, List list) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(amount, "monthlyPayment");
            C41536l.m120489i(list, "limitAmounts");
            this.f27840a = str;
            this.f27841b = str2;
            this.f27842c = amount;
            this.f27843d = list;
        }

        /* renamed from: a */
        public final String mo26523a() {
            return this.f27840a;
        }

        /* renamed from: b */
        public final List mo26524b() {
            return this.f27843d;
        }

        /* renamed from: c */
        public final Amount mo26525c() {
            return this.f27842c;
        }

        /* renamed from: d */
        public final String mo26526d() {
            return this.f27841b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10073d)) {
                return false;
            }
            C10073d dVar = (C10073d) obj;
            return C41536l.m120484d(this.f27840a, dVar.f27840a) && C41536l.m120484d(this.f27841b, dVar.f27841b) && C41536l.m120484d(this.f27842c, dVar.f27842c) && C41536l.m120484d(this.f27843d, dVar.f27843d);
        }

        public int hashCode() {
            String str = this.f27840a;
            int i = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f27841b;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return ((((hashCode + i) * 31) + this.f27842c.hashCode()) * 31) + this.f27843d.hashCode();
        }

        public String toString() {
            String str = this.f27840a;
            String str2 = this.f27841b;
            Amount amount = this.f27842c;
            List list = this.f27843d;
            return "Provider(imageUrl=" + str + ", providerName=" + str2 + ", monthlyPayment=" + amount + ", limitAmounts=" + list + ")";
        }
    }

    private C10069e() {
    }

    public /* synthetic */ C10069e(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
