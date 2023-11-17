package p422fj;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p601sg.C17778c;

/* renamed from: fj.b */
public enum C12920b {
    POSITIVE(C17778c.f49613O, 1),
    NEGATIVE(C17778c.f49639y, 2),
    PENDING(C17778c.f49611L, 3),
    PRIMARY(C17778c.f49619W, 4);
    

    /* renamed from: f */
    public static final C12921a f38149f = null;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C12920b[] f38150g = null;

    /* renamed from: d */
    private final int f38156d;

    /* renamed from: e */
    private final int f38157e;

    /* renamed from: fj.b$a */
    public static final class C12921a {
        private C12921a() {
        }

        public /* synthetic */ C12921a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C12920b mo33675a(int i) {
            boolean z;
            for (C12920b bVar : C12920b.f38150g) {
                if (bVar.mo33673c() == i) {
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
        f38149f = new C12921a((DefaultConstructorMarker) null);
        f38150g = values();
    }

    private C12920b(int i, int i2) {
        this.f38156d = i;
        this.f38157e = i2;
    }

    /* renamed from: c */
    public final int mo33673c() {
        return this.f38157e;
    }

    /* renamed from: e */
    public final int mo33674e() {
        return this.f38156d;
    }
}
