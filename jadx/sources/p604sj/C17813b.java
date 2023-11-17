package p604sj;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: sj.b */
public enum C17813b {
    SMALL,
    BIG,
    EXTRA_LARGE;
    

    /* renamed from: d */
    public static final C17814a f50695d = null;

    /* renamed from: sj.b$a */
    public static final class C17814a {
        private C17814a() {
        }

        public /* synthetic */ C17814a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C17813b mo45401a(int i) {
            boolean z;
            for (C17813b bVar : C17813b.values()) {
                if (bVar.ordinal() == i) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return bVar;
                }
            }
            return null;
        }
    }

    static {
        f50695d = new C17814a((DefaultConstructorMarker) null);
    }
}
