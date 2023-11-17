package p506lj;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p601sg.C17779d;
import p601sg.C17786k;
import p642vh.C18382u;

/* renamed from: lj.b */
public enum C16580b {
    EXTRA_SMALL(0, new C18382u.C18383a(C17779d.size_status_badge_extra_small), new C18382u.C18383a(C17779d.size_status_badge_icon_extra_small), 0, 8, (int) null),
    SMALL(1, new C18382u.C18383a(C17779d.size_status_badge_small), new C18382u.C18383a(C17779d.size_status_badge_icon_small), 0, 8, (int) null),
    MEDIUM(2, new C18382u.C18383a(C17779d.size_status_badge_medium), new C18382u.C18383a(C17779d.size_status_badge_icon_medium), 0, 8, (int) null),
    LARGE(3, new C18382u.C18383a(C17779d.size_status_badge_large), new C18382u.C18383a(C17779d.size_status_badge_icon_large), C17786k.TextTitle2);
    

    /* renamed from: h */
    public static final C16581a f46756h = null;

    /* renamed from: d */
    private final int f46762d;

    /* renamed from: e */
    private final C18382u f46763e;

    /* renamed from: f */
    private final C18382u f46764f;

    /* renamed from: g */
    private final int f46765g;

    /* renamed from: lj.b$a */
    public static final class C16581a {
        private C16581a() {
        }

        public /* synthetic */ C16581a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C16580b mo43732a(int i) {
            C16580b bVar;
            boolean z;
            C16580b[] values = C16580b.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    bVar = null;
                    break;
                }
                bVar = values[i2];
                if (bVar.mo43728b() == i) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    break;
                }
                i2++;
            }
            if (bVar == null) {
                return C16580b.MEDIUM;
            }
            return bVar;
        }
    }

    static {
        f46756h = new C16581a((DefaultConstructorMarker) null);
    }

    private C16580b(int i, C18382u uVar, C18382u uVar2, int i2) {
        this.f46762d = i;
        this.f46763e = uVar;
        this.f46764f = uVar2;
        this.f46765g = i2;
    }

    /* renamed from: b */
    public final int mo43728b() {
        return this.f46762d;
    }

    /* renamed from: c */
    public final C18382u mo43729c() {
        return this.f46763e;
    }

    /* renamed from: e */
    public final int mo43730e() {
        return this.f46765g;
    }

    /* renamed from: f */
    public final C18382u mo43731f() {
        return this.f46764f;
    }
}
