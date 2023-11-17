package p478jj;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p601sg.C17778c;
import p601sg.C17780e;

/* renamed from: jj.a */
public enum C16203a {
    NORMAL(1, r21, (int) null, (int) null, false, false, 48, (boolean) null),
    POSITIVE(2, C17778c.f49618U, Integer.valueOf(C17780e.f49647B), Integer.valueOf(C17778c.f49617S), false, false, 48, (boolean) null),
    NEGATIVE(0, C17778c.f49607E, Integer.valueOf(C17780e.f49649D), Integer.valueOf(C17778c.f49605C), false, false, 48, (boolean) null),
    LOADING(3, r16, (int) null, (int) null, true, false),
    DOWNLOAD(4, r16, Integer.valueOf(C17780e.icons_16_system_download), Integer.valueOf(C17778c.f49630n), false, false, 48, (boolean) null);
    

    /* renamed from: j */
    public static final C16204a f45693j = null;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final C16203a[] f45694k = null;

    /* renamed from: d */
    private final int f45701d;

    /* renamed from: e */
    private final int f45702e;

    /* renamed from: f */
    private final Integer f45703f;

    /* renamed from: g */
    private final Integer f45704g;

    /* renamed from: h */
    private final boolean f45705h;

    /* renamed from: i */
    private final boolean f45706i;

    /* renamed from: jj.a$a */
    public static final class C16204a {
        private C16204a() {
        }

        public /* synthetic */ C16204a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C16203a mo43219a(int i) {
            boolean z;
            for (C16203a aVar : C16203a.f45694k) {
                if (aVar.mo43217h() == i) {
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
        f45693j = new C16204a((DefaultConstructorMarker) null);
        f45694k = values();
    }

    private C16203a(int i, int i2, Integer num, Integer num2, boolean z, boolean z2) {
        this.f45701d = i;
        this.f45702e = i2;
        this.f45703f = num;
        this.f45704g = num2;
        this.f45705h = z;
        this.f45706i = z2;
    }

    /* renamed from: c */
    public final int mo43213c() {
        return this.f45702e;
    }

    /* renamed from: e */
    public final boolean mo43214e() {
        return this.f45706i;
    }

    /* renamed from: f */
    public final Integer mo43215f() {
        return this.f45703f;
    }

    /* renamed from: g */
    public final Integer mo43216g() {
        return this.f45704g;
    }

    /* renamed from: h */
    public final int mo43217h() {
        return this.f45701d;
    }

    /* renamed from: l */
    public final boolean mo43218l() {
        return this.f45705h;
    }
}
