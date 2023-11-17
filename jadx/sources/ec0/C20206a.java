package ec0;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.shared.helper.C34646b;
import p341ge.bog.mobilebank.shared.helper.StringSource;
import rb0.C27984c;

/* renamed from: ec0.a */
public abstract class C20206a {

    /* renamed from: a */
    private final StringSource f54891a;

    /* renamed from: b */
    private final int f54892b;

    /* renamed from: c */
    private final boolean f54893c;

    /* renamed from: ec0.a$a */
    public static final class C20207a extends C20206a {

        /* renamed from: d */
        private final boolean f54894d;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C20207a(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? true : z);
        }

        /* renamed from: c */
        public boolean mo48611c() {
            return this.f54894d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C20207a) && this.f54894d == ((C20207a) obj).f54894d;
        }

        public int hashCode() {
            boolean z = this.f54894d;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public String toString() {
            boolean z = this.f54894d;
            return "Statement(isEnabled=" + z + ")";
        }

        public C20207a(boolean z) {
            super(C34646b.m101748b("deposits.statement", new Object[0]), C27984c.f71246v, z, (DefaultConstructorMarker) null);
            this.f54894d = z;
        }
    }

    /* renamed from: ec0.a$b */
    public static final class C20208b extends C20206a {

        /* renamed from: d */
        private final boolean f54895d;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C20208b(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? true : z);
        }

        /* renamed from: c */
        public boolean mo48611c() {
            return this.f54895d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C20208b) && this.f54895d == ((C20208b) obj).f54895d;
        }

        public int hashCode() {
            boolean z = this.f54895d;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public String toString() {
            boolean z = this.f54895d;
            return "TopUp(isEnabled=" + z + ")";
        }

        public C20208b(boolean z) {
            super(C34646b.m101748b("deposits.topup", new Object[0]), C27984c.f71239n, z, (DefaultConstructorMarker) null);
            this.f54895d = z;
        }
    }

    /* renamed from: ec0.a$c */
    public static final class C20209c extends C20206a {

        /* renamed from: d */
        private final boolean f54896d;

        public C20209c(boolean z) {
            super(C34646b.m101748b("deposits.transfer", new Object[0]), C27984c.icons_24_payment_transfer_transfers_fill, z, (DefaultConstructorMarker) null);
            this.f54896d = z;
        }

        /* renamed from: c */
        public boolean mo48611c() {
            return this.f54896d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C20209c) && this.f54896d == ((C20209c) obj).f54896d;
        }

        public int hashCode() {
            boolean z = this.f54896d;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public String toString() {
            boolean z = this.f54896d;
            return "Transfer(isEnabled=" + z + ")";
        }
    }

    public /* synthetic */ C20206a(StringSource stringSource, int i, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(stringSource, i, z);
    }

    /* renamed from: a */
    public final int mo48609a() {
        return this.f54892b;
    }

    /* renamed from: b */
    public final StringSource mo48610b() {
        return this.f54891a;
    }

    /* renamed from: c */
    public abstract boolean mo48611c();

    private C20206a(StringSource stringSource, int i, boolean z) {
        this.f54891a = stringSource;
        this.f54892b = i;
        this.f54893c = z;
    }
}
