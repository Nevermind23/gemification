package xe1;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pe1.C42192b;

/* renamed from: xe1.c */
public abstract class C43263c {

    /* renamed from: d */
    public static final C43264a f101019d = new C43264a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final C43263c f101020e = C42192b.f99260a.mo97668b();

    /* renamed from: xe1.c$a */
    public static final class C43264a extends C43263c implements Serializable {

        /* renamed from: xe1.c$a$a */
        private static final class C43265a implements Serializable {

            /* renamed from: d */
            public static final C43265a f101021d = new C43265a();
            private static final long serialVersionUID = 0;

            private C43265a() {
            }

            private final Object readResolve() {
                return C43263c.f101019d;
            }
        }

        public /* synthetic */ C43264a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Object writeReplace() {
            return C43265a.f101021d;
        }

        /* renamed from: b */
        public float mo101946b() {
            return C43263c.f101020e.mo101946b();
        }

        /* renamed from: c */
        public int mo101947c() {
            return C43263c.f101020e.mo101947c();
        }

        /* renamed from: d */
        public int mo101948d(int i) {
            return C43263c.f101020e.mo101948d(i);
        }

        private C43264a() {
        }
    }

    /* renamed from: b */
    public abstract float mo101946b();

    /* renamed from: c */
    public abstract int mo101947c();

    /* renamed from: d */
    public abstract int mo101948d(int i);
}
