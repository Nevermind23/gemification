package p783hv;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p793iw.C25263b;

/* renamed from: hv.a */
public abstract class C25067a {

    /* renamed from: hv.a$a */
    public static final class C25068a extends C25067a {

        /* renamed from: a */
        private final String f64416a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C25068a(String str) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(str, "date");
            this.f64416a = str;
        }

        /* renamed from: a */
        public final String mo63504a() {
            return this.f64416a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C25068a) && C41536l.m120484d(this.f64416a, ((C25068a) obj).f64416a);
        }

        public int hashCode() {
            return this.f64416a.hashCode();
        }

        public String toString() {
            String str = this.f64416a;
            return "BSplitHeader(date=" + str + ")";
        }
    }

    /* renamed from: hv.a$b */
    public static final class C25069b extends C25067a {

        /* renamed from: a */
        private final C25263b f64417a;

        /* renamed from: b */
        private final boolean f64418b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C25069b(C25263b bVar, boolean z) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(bVar, "transaction");
            this.f64417a = bVar;
            this.f64418b = z;
        }

        /* renamed from: a */
        public final C25263b mo63508a() {
            return this.f64417a;
        }

        /* renamed from: b */
        public final boolean mo63509b() {
            return this.f64418b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C25069b)) {
                return false;
            }
            C25069b bVar = (C25069b) obj;
            return C41536l.m120484d(this.f64417a, bVar.f64417a) && this.f64418b == bVar.f64418b;
        }

        public int hashCode() {
            int hashCode = this.f64417a.hashCode() * 31;
            boolean z = this.f64418b;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        public String toString() {
            C25263b bVar = this.f64417a;
            boolean z = this.f64418b;
            return "BSplitTransaction(transaction=" + bVar + ", isSelected=" + z + ")";
        }
    }

    private C25067a() {
    }

    public /* synthetic */ C25067a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
