package p422fj;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p601sg.C17779d;

/* renamed from: fj.a */
public enum C12918a {
    THIN(1, C17779d.height_thin_progress_bar),
    THICK(2, C17779d.height_thick_progress_bar);
    

    /* renamed from: f */
    public static final C12919a f38142f = null;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C12918a[] f38143g = null;

    /* renamed from: d */
    private final int f38147d;

    /* renamed from: e */
    private final int f38148e;

    /* renamed from: fj.a$a */
    public static final class C12919a {
        private C12919a() {
        }

        public /* synthetic */ C12919a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C12918a mo33672a(int i) {
            boolean z;
            for (C12918a aVar : C12918a.f38143g) {
                if (aVar.mo33670c() == i) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return aVar;
                }
            }
            return null;
        }
    }

    static {
        f38142f = new C12919a((DefaultConstructorMarker) null);
        f38143g = values();
    }

    private C12918a(int i, int i2) {
        this.f38147d = i;
        this.f38148e = i2;
    }

    /* renamed from: c */
    public final int mo33670c() {
        return this.f38147d;
    }

    /* renamed from: e */
    public final int mo33671e() {
        return this.f38148e;
    }
}
