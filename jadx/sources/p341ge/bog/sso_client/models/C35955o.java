package p341ge.bog.sso_client.models;

import ba1.C10214s;
import ba1.C10220y;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ge.bog.sso_client.models.o */
public abstract class C35955o {

    /* renamed from: a */
    private final boolean f86990a;

    /* renamed from: b */
    private final boolean f86991b;

    /* renamed from: c */
    private final int f86992c;

    /* renamed from: d */
    private final int f86993d;

    /* renamed from: ge.bog.sso_client.models.o$a */
    public static final class C35956a extends C35955o {

        /* renamed from: e */
        private final boolean f86994e;

        /* renamed from: f */
        private final boolean f86995f;

        public C35956a(boolean z, boolean z2) {
            super(z, z2, C10214s.icons_16_security_face_id_ios, C10220y.setup_security_parameters_biometrics, (DefaultConstructorMarker) null);
            this.f86994e = z;
            this.f86995f = z2;
        }

        /* renamed from: a */
        public boolean mo88533a() {
            return this.f86995f;
        }

        /* renamed from: c */
        public boolean mo88535c() {
            return this.f86994e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C35956a)) {
                return false;
            }
            C35956a aVar = (C35956a) obj;
            return mo88535c() == aVar.mo88535c() && mo88533a() == aVar.mo88533a();
        }

        public int hashCode() {
            boolean c = mo88535c();
            boolean z = true;
            if (c) {
                c = true;
            }
            int i = (c ? 1 : 0) * true;
            boolean a = mo88533a();
            if (!a) {
                z = a;
            }
            return i + (z ? 1 : 0);
        }

        public String toString() {
            return "Biometric(switchedOn=" + mo88535c() + ", enabled=" + mo88533a() + ')';
        }
    }

    /* renamed from: ge.bog.sso_client.models.o$b */
    public static final class C35957b extends C35955o {

        /* renamed from: e */
        public static final C35957b f86996e = new C35957b();

        private C35957b() {
            super(true, true, C10214s.f28279k, C10220y.sso_change_password, (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: ge.bog.sso_client.models.o$c */
    public static final class C35958c extends C35955o {

        /* renamed from: e */
        public static final C35958c f86997e = new C35958c();

        private C35958c() {
            super(true, true, C10214s.icons_16_security_verified_modified, C10220y.sso_my_devices, (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: ge.bog.sso_client.models.o$d */
    public static final class C35959d extends C35955o {

        /* renamed from: e */
        private final boolean f86998e;

        /* renamed from: f */
        private final boolean f86999f;

        public C35959d(boolean z, boolean z2) {
            super(z, z2, C10214s.icons_16_security_passcode, C10220y.sso_add_pass_code, (DefaultConstructorMarker) null);
            this.f86998e = z;
            this.f86999f = z2;
        }

        /* renamed from: a */
        public boolean mo88533a() {
            return this.f86999f;
        }

        /* renamed from: c */
        public boolean mo88535c() {
            return this.f86998e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C35959d)) {
                return false;
            }
            C35959d dVar = (C35959d) obj;
            return mo88535c() == dVar.mo88535c() && mo88533a() == dVar.mo88533a();
        }

        public int hashCode() {
            boolean c = mo88535c();
            boolean z = true;
            if (c) {
                c = true;
            }
            int i = (c ? 1 : 0) * true;
            boolean a = mo88533a();
            if (!a) {
                z = a;
            }
            return i + (z ? 1 : 0);
        }

        public String toString() {
            return "PassCode(switchedOn=" + mo88535c() + ", enabled=" + mo88533a() + ')';
        }
    }

    public /* synthetic */ C35955o(boolean z, boolean z2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2, i, i2);
    }

    /* renamed from: a */
    public boolean mo88533a() {
        return this.f86991b;
    }

    /* renamed from: b */
    public final int mo88534b() {
        return this.f86992c;
    }

    /* renamed from: c */
    public boolean mo88535c() {
        return this.f86990a;
    }

    /* renamed from: d */
    public final int mo88536d() {
        return this.f86993d;
    }

    private C35955o(boolean z, boolean z2, int i, int i2) {
        this.f86990a = z;
        this.f86991b = z2;
        this.f86992c = i;
        this.f86993d = i2;
    }
}
