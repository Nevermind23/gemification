package p622tn;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: tn.b */
public abstract class C18031b {

    /* renamed from: tn.b$a */
    public static final class C18032a extends C18031b {

        /* renamed from: a */
        public static final C18032a f51259a = new C18032a();

        private C18032a() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: tn.b$b */
    public static final class C18033b extends C18031b {

        /* renamed from: a */
        public static final C18033b f51260a = new C18033b();

        private C18033b() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: tn.b$c */
    public static final class C18034c extends C18031b {

        /* renamed from: a */
        private final boolean f51261a;

        public C18034c(boolean z) {
            super((DefaultConstructorMarker) null);
            this.f51261a = z;
        }

        /* renamed from: a */
        public final boolean mo45732a() {
            return this.f51261a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C18034c) && this.f51261a == ((C18034c) obj).f51261a;
        }

        public int hashCode() {
            boolean z = this.f51261a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public String toString() {
            boolean z = this.f51261a;
            return "ShowBanner(needsActivation=" + z + ")";
        }
    }

    private C18031b() {
    }

    public /* synthetic */ C18031b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
