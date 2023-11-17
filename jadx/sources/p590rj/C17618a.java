package p590rj;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.Amount;

/* renamed from: rj.a */
public interface C17618a {

    /* renamed from: rj.a$a */
    public static final class C17619a implements C17618a {

        /* renamed from: a */
        private final String f49335a;

        /* renamed from: b */
        private final Amount f49336b;

        public C17619a(String str, Amount amount) {
            C41536l.m120489i(str, "title");
            C41536l.m120489i(amount, "amount");
            this.f49335a = str;
            this.f49336b = amount;
        }

        /* renamed from: a */
        public final Amount mo45202a() {
            return this.f49336b;
        }

        /* renamed from: b */
        public final String mo45203b() {
            return this.f49335a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C17619a)) {
                return false;
            }
            C17619a aVar = (C17619a) obj;
            return C41536l.m120484d(this.f49335a, aVar.f49335a) && C41536l.m120484d(this.f49336b, aVar.f49336b);
        }

        public int hashCode() {
            return (this.f49335a.hashCode() * 31) + this.f49336b.hashCode();
        }

        public String toString() {
            String str = this.f49335a;
            Amount amount = this.f49336b;
            return "Regular(title=" + str + ", amount=" + amount + ")";
        }
    }

    /* renamed from: rj.a$b */
    public static final class C17620b implements C17618a {

        /* renamed from: a */
        private final String f49337a;

        /* renamed from: b */
        private final Amount f49338b;

        /* renamed from: c */
        private final boolean f49339c;

        public C17620b(String str, Amount amount, boolean z) {
            C41536l.m120489i(str, "title");
            C41536l.m120489i(amount, "amount");
            this.f49337a = str;
            this.f49338b = amount;
            this.f49339c = z;
        }

        /* renamed from: a */
        public final Amount mo45207a() {
            return this.f49338b;
        }

        /* renamed from: b */
        public final boolean mo45208b() {
            return this.f49339c;
        }

        /* renamed from: c */
        public final String mo45209c() {
            return this.f49337a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C17620b)) {
                return false;
            }
            C17620b bVar = (C17620b) obj;
            return C41536l.m120484d(this.f49337a, bVar.f49337a) && C41536l.m120484d(this.f49338b, bVar.f49338b) && this.f49339c == bVar.f49339c;
        }

        public int hashCode() {
            int hashCode = ((this.f49337a.hashCode() * 31) + this.f49338b.hashCode()) * 31;
            boolean z = this.f49339c;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        public String toString() {
            String str = this.f49337a;
            Amount amount = this.f49338b;
            boolean z = this.f49339c;
            return "Total(title=" + str + ", amount=" + amount + ", dividerVisibility=" + z + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C17620b(String str, Amount amount, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, amount, (i & 4) != 0 ? true : z);
        }
    }
}
