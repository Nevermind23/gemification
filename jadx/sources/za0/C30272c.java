package za0;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p190o1.C7397t;

/* renamed from: za0.c */
public abstract class C30272c {

    /* renamed from: za0.c$a */
    public static final class C30273a extends C30272c {

        /* renamed from: a */
        private final long f76173a;

        /* renamed from: b */
        private final int f76174b;

        /* renamed from: c */
        private final String f76175c;

        /* renamed from: d */
        private final String f76176d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C30273a(long j, int i, String str, String str2) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(str, "title");
            C41536l.m120489i(str2, "lookUpValue");
            this.f76173a = j;
            this.f76174b = i;
            this.f76175c = str;
            this.f76176d = str2;
        }

        /* renamed from: a */
        public final int mo70598a() {
            return this.f76174b;
        }

        /* renamed from: b */
        public final long mo70599b() {
            return this.f76173a;
        }

        /* renamed from: c */
        public final String mo70600c() {
            return this.f76176d;
        }

        /* renamed from: d */
        public final String mo70601d() {
            return this.f76175c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C30273a)) {
                return false;
            }
            C30273a aVar = (C30273a) obj;
            return this.f76173a == aVar.f76173a && this.f76174b == aVar.f76174b && C41536l.m120484d(this.f76175c, aVar.f76175c) && C41536l.m120484d(this.f76176d, aVar.f76176d);
        }

        public int hashCode() {
            return (((((C7397t.m28148a(this.f76173a) * 31) + this.f76174b) * 31) + this.f76175c.hashCode()) * 31) + this.f76176d.hashCode();
        }

        public String toString() {
            long j = this.f76173a;
            int i = this.f76174b;
            String str = this.f76175c;
            String str2 = this.f76176d;
            return "DepositPurpose(id=" + j + ", icon=" + i + ", title=" + str + ", lookUpValue=" + str2 + ")";
        }
    }

    /* renamed from: za0.c$b */
    public static final class C30274b extends C30272c {

        /* renamed from: a */
        private final C30276d f76177a;

        /* renamed from: b */
        private final int f76178b;

        /* renamed from: c */
        private final String f76179c;

        /* renamed from: d */
        private final String f76180d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C30274b(C30276d dVar, int i, String str, String str2) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(dVar, "type");
            C41536l.m120489i(str, "title");
            C41536l.m120489i(str2, "description");
            this.f76177a = dVar;
            this.f76178b = i;
            this.f76179c = str;
            this.f76180d = str2;
        }

        /* renamed from: a */
        public final String mo70605a() {
            return this.f76180d;
        }

        /* renamed from: b */
        public final int mo70606b() {
            return this.f76178b;
        }

        /* renamed from: c */
        public final String mo70607c() {
            return this.f76179c;
        }

        /* renamed from: d */
        public final C30276d mo70608d() {
            return this.f76177a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C30274b)) {
                return false;
            }
            C30274b bVar = (C30274b) obj;
            return this.f76177a == bVar.f76177a && this.f76178b == bVar.f76178b && C41536l.m120484d(this.f76179c, bVar.f76179c) && C41536l.m120484d(this.f76180d, bVar.f76180d);
        }

        public int hashCode() {
            return (((((this.f76177a.hashCode() * 31) + this.f76178b) * 31) + this.f76179c.hashCode()) * 31) + this.f76180d.hashCode();
        }

        public String toString() {
            C30276d dVar = this.f76177a;
            int i = this.f76178b;
            String str = this.f76179c;
            String str2 = this.f76180d;
            return "DepositReason(type=" + dVar + ", icon=" + i + ", title=" + str + ", description=" + str2 + ")";
        }
    }

    /* renamed from: za0.c$c */
    public static final class C30275c extends C30272c {

        /* renamed from: a */
        private final C30277e f76181a;

        /* renamed from: b */
        private final int f76182b;

        /* renamed from: c */
        private final String f76183c;

        /* renamed from: d */
        private final String f76184d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C30275c(C30277e eVar, int i, String str, String str2) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(eVar, "type");
            C41536l.m120489i(str, "title");
            C41536l.m120489i(str2, "description");
            this.f76181a = eVar;
            this.f76182b = i;
            this.f76183c = str;
            this.f76184d = str2;
        }

        /* renamed from: a */
        public final String mo70612a() {
            return this.f76184d;
        }

        /* renamed from: b */
        public final int mo70613b() {
            return this.f76182b;
        }

        /* renamed from: c */
        public final String mo70614c() {
            return this.f76183c;
        }

        /* renamed from: d */
        public final C30277e mo70615d() {
            return this.f76181a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C30275c)) {
                return false;
            }
            C30275c cVar = (C30275c) obj;
            return this.f76181a == cVar.f76181a && this.f76182b == cVar.f76182b && C41536l.m120484d(this.f76183c, cVar.f76183c) && C41536l.m120484d(this.f76184d, cVar.f76184d);
        }

        public int hashCode() {
            return (((((this.f76181a.hashCode() * 31) + this.f76182b) * 31) + this.f76183c.hashCode()) * 31) + this.f76184d.hashCode();
        }

        public String toString() {
            C30277e eVar = this.f76181a;
            int i = this.f76182b;
            String str = this.f76183c;
            String str2 = this.f76184d;
            return "DepositTerm(type=" + eVar + ", icon=" + i + ", title=" + str + ", description=" + str2 + ")";
        }
    }

    private C30272c() {
    }

    public /* synthetic */ C30272c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
