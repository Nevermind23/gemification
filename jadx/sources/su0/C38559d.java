package su0;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: su0.d */
public abstract class C38559d {

    /* renamed from: a */
    private final String f92411a;

    /* renamed from: su0.d$a */
    public static final class C38560a extends C38559d {

        /* renamed from: b */
        public static final C38560a f92412b = new C38560a();

        private C38560a() {
            super("PL3", (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: su0.d$b */
    public static final class C38561b extends C38559d {

        /* renamed from: b */
        private final String f92413b;

        public C38561b(String str) {
            super(str, (DefaultConstructorMarker) null);
            this.f92413b = str;
        }

        /* renamed from: a */
        public String mo92159a() {
            return this.f92413b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C38561b) && C41536l.m120484d(this.f92413b, ((C38561b) obj).f92413b);
        }

        public int hashCode() {
            String str = this.f92413b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            String str = this.f92413b;
            return "Unknown(value=" + str + ")";
        }
    }

    public /* synthetic */ C38559d(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    /* renamed from: a */
    public String mo92159a() {
        return this.f92411a;
    }

    private C38559d(String str) {
        this.f92411a = str;
    }
}
