package is0;

import kotlin.jvm.internal.C41536l;

/* renamed from: is0.b */
public interface C36493b {

    /* renamed from: is0.b$a */
    public static final class C36494a implements C36493b {

        /* renamed from: a */
        private final Throwable f87996a;

        public C36494a(Throwable th) {
            C41536l.m120489i(th, "error");
            this.f87996a = th;
        }

        /* renamed from: a */
        public final Throwable mo89292a() {
            return this.f87996a;
        }
    }

    /* renamed from: is0.b$b */
    public static final class C36495b implements C36493b {

        /* renamed from: a */
        private final String f87997a;

        public C36495b(String str) {
            C41536l.m120489i(str, "input");
            this.f87997a = str;
        }

        /* renamed from: a */
        public final String mo89293a() {
            return this.f87997a;
        }
    }
}
