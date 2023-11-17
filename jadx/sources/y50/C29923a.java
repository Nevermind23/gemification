package y50;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: y50.a */
public abstract class C29923a {

    /* renamed from: a */
    public static final C29924a f75711a = new C29924a((DefaultConstructorMarker) null);

    /* renamed from: y50.a$a */
    public static final class C29924a {
        private C29924a() {
        }

        public /* synthetic */ C29924a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: y50.a$b */
    public static final class C29925b extends C29923a {

        /* renamed from: b */
        private final C29928b f75712b;

        /* renamed from: c */
        private final boolean f75713c;

        /* renamed from: d */
        private final int f75714d;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C29925b(C29928b bVar, boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(bVar, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? 1 : i);
        }

        /* renamed from: a */
        public int mo70223a() {
            return this.f75714d;
        }

        /* renamed from: b */
        public final C29928b mo70224b() {
            return this.f75712b;
        }

        /* renamed from: c */
        public final boolean mo70225c() {
            return this.f75713c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C29925b)) {
                return false;
            }
            C29925b bVar = (C29925b) obj;
            return C41536l.m120484d(this.f75712b, bVar.f75712b) && this.f75713c == bVar.f75713c && this.f75714d == bVar.f75714d;
        }

        public int hashCode() {
            int hashCode = this.f75712b.hashCode() * 31;
            boolean z = this.f75713c;
            if (z) {
                z = true;
            }
            return ((hashCode + (z ? 1 : 0)) * 31) + this.f75714d;
        }

        public String toString() {
            C29928b bVar = this.f75712b;
            boolean z = this.f75713c;
            int i = this.f75714d;
            return "ContactListItem(contact=" + bVar + ", selectionEnabled=" + z + ", itemType=" + i + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C29925b(C29928b bVar, boolean z, int i) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(bVar, "contact");
            this.f75712b = bVar;
            this.f75713c = z;
            this.f75714d = i;
        }
    }

    /* renamed from: y50.a$c */
    public static final class C29926c extends C29923a {

        /* renamed from: b */
        private final int f75715b;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C29926c(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0 : i);
        }

        /* renamed from: a */
        public int mo70223a() {
            return this.f75715b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C29926c) && this.f75715b == ((C29926c) obj).f75715b;
        }

        public int hashCode() {
            return this.f75715b;
        }

        public String toString() {
            int i = this.f75715b;
            return "HeaderListItem(itemType=" + i + ")";
        }

        public C29926c(int i) {
            super((DefaultConstructorMarker) null);
            this.f75715b = i;
        }
    }

    /* renamed from: y50.a$d */
    public static final class C29927d extends C29923a {

        /* renamed from: b */
        private final boolean f75716b;

        /* renamed from: c */
        private final int f75717c;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C29927d(boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(z, (i2 & 2) != 0 ? 2 : i);
        }

        /* renamed from: a */
        public int mo70223a() {
            return this.f75717c;
        }

        /* renamed from: b */
        public final boolean mo70232b() {
            return this.f75716b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C29927d)) {
                return false;
            }
            C29927d dVar = (C29927d) obj;
            return this.f75716b == dVar.f75716b && this.f75717c == dVar.f75717c;
        }

        public int hashCode() {
            boolean z = this.f75716b;
            if (z) {
                z = true;
            }
            return ((z ? 1 : 0) * true) + this.f75717c;
        }

        public String toString() {
            boolean z = this.f75716b;
            int i = this.f75717c;
            return "InteractWithAllListItem(isChecked=" + z + ", itemType=" + i + ")";
        }

        public C29927d(boolean z, int i) {
            super((DefaultConstructorMarker) null);
            this.f75716b = z;
            this.f75717c = i;
        }
    }

    private C29923a() {
    }

    public /* synthetic */ C29923a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: a */
    public abstract int mo70223a();
}
