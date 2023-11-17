package p674xm;

import com.salesforce.marketingcloud.storage.p385db.C11769i;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.shared.helper.StringSource;
import p411em.C12487d;

/* renamed from: xm.g */
public abstract class C18799g {

    /* renamed from: a */
    private final StringSource f52534a;

    /* renamed from: b */
    private final int f52535b;

    /* renamed from: xm.g$a */
    public static final class C18800a extends C18799g {

        /* renamed from: c */
        private final StringSource f52536c;

        /* renamed from: d */
        private final StringSource f52537d;

        /* renamed from: e */
        private final int f52538e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18800a(StringSource stringSource, StringSource stringSource2, int i) {
            super(stringSource, i, (DefaultConstructorMarker) null);
            C41536l.m120489i(stringSource, "title");
            C41536l.m120489i(stringSource2, C11769i.C11770a.f34149l);
            this.f52536c = stringSource;
            this.f52537d = stringSource2;
            this.f52538e = i;
        }

        /* renamed from: a */
        public int mo46630a() {
            return this.f52538e;
        }

        /* renamed from: b */
        public StringSource mo46631b() {
            return this.f52536c;
        }

        /* renamed from: c */
        public final StringSource mo46632c() {
            return this.f52537d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C18800a)) {
                return false;
            }
            C18800a aVar = (C18800a) obj;
            return C41536l.m120484d(this.f52536c, aVar.f52536c) && C41536l.m120484d(this.f52537d, aVar.f52537d) && this.f52538e == aVar.f52538e;
        }

        public int hashCode() {
            return (((this.f52536c.hashCode() * 31) + this.f52537d.hashCode()) * 31) + this.f52538e;
        }

        public String toString() {
            StringSource stringSource = this.f52536c;
            StringSource stringSource2 = this.f52537d;
            int i = this.f52538e;
            return "ClickableTerm(title=" + stringSource + ", url=" + stringSource2 + ", iconRes=" + i + ")";
        }
    }

    /* renamed from: xm.g$c */
    public static final class C18802c extends C18799g {

        /* renamed from: c */
        private final StringSource f52541c;

        /* renamed from: d */
        private final StringSource f52542d;

        /* renamed from: e */
        private final int f52543e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18802c(StringSource stringSource, StringSource stringSource2, int i) {
            super(stringSource, i, (DefaultConstructorMarker) null);
            C41536l.m120489i(stringSource, "title");
            C41536l.m120489i(stringSource2, "text");
            this.f52541c = stringSource;
            this.f52542d = stringSource2;
            this.f52543e = i;
        }

        /* renamed from: a */
        public int mo46630a() {
            return this.f52543e;
        }

        /* renamed from: b */
        public StringSource mo46631b() {
            return this.f52541c;
        }

        /* renamed from: c */
        public final StringSource mo46639c() {
            return this.f52542d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C18802c)) {
                return false;
            }
            C18802c cVar = (C18802c) obj;
            return C41536l.m120484d(this.f52541c, cVar.f52541c) && C41536l.m120484d(this.f52542d, cVar.f52542d) && this.f52543e == cVar.f52543e;
        }

        public int hashCode() {
            return (((this.f52541c.hashCode() * 31) + this.f52542d.hashCode()) * 31) + this.f52543e;
        }

        public String toString() {
            StringSource stringSource = this.f52541c;
            StringSource stringSource2 = this.f52542d;
            int i = this.f52543e;
            return "RegularTerm(title=" + stringSource + ", text=" + stringSource2 + ", iconRes=" + i + ")";
        }
    }

    public /* synthetic */ C18799g(StringSource stringSource, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(stringSource, i);
    }

    /* renamed from: a */
    public abstract int mo46630a();

    /* renamed from: b */
    public abstract StringSource mo46631b();

    /* renamed from: xm.g$b */
    public static final class C18801b extends C18799g {

        /* renamed from: c */
        private final StringSource f52539c;

        /* renamed from: d */
        private final int f52540d;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C18801b(StringSource stringSource, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(stringSource, (i2 & 2) != 0 ? C12487d.f37169r : i);
        }

        /* renamed from: a */
        public int mo46630a() {
            return this.f52540d;
        }

        /* renamed from: b */
        public StringSource mo46631b() {
            return this.f52539c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C18801b)) {
                return false;
            }
            C18801b bVar = (C18801b) obj;
            return C41536l.m120484d(this.f52539c, bVar.f52539c) && this.f52540d == bVar.f52540d;
        }

        public int hashCode() {
            return (this.f52539c.hashCode() * 31) + this.f52540d;
        }

        public String toString() {
            StringSource stringSource = this.f52539c;
            int i = this.f52540d;
            return "CombinedOffer(title=" + stringSource + ", iconRes=" + i + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18801b(StringSource stringSource, int i) {
            super(stringSource, i, (DefaultConstructorMarker) null);
            C41536l.m120489i(stringSource, "title");
            this.f52539c = stringSource;
            this.f52540d = i;
        }
    }

    private C18799g(StringSource stringSource, int i) {
        this.f52534a = stringSource;
        this.f52535b = i;
    }
}
