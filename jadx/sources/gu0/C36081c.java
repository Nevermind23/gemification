package gu0;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import rt0.C38340b;

/* renamed from: gu0.c */
public enum C36081c {
    EXPRESS("MEMBER", r4, r13),
    CLASSIC("CLASSIC_NEW", C38340b.loyalty_status_classic, r12),
    SILVER("SILVER_NEW", C38340b.loyalty_status_silver, r12),
    GOLD("GOLD_NEW", C38340b.loyalty_status_gold, r12),
    EXPRESS_SMALL("MEMBER", r5, r12),
    CLASSIC_SMALL("CLASSIC_NEW", C38340b.badge_classic, r11),
    SILVER_SMALL("SILVER_NEW", C38340b.badge_silver, r11),
    GOLD_SMALL("GOLD_NEW", C38340b.badge_gold, r11);
    

    /* renamed from: g */
    public static final C36082a f87223g = null;

    /* renamed from: d */
    private final String f87233d;

    /* renamed from: e */
    private final int f87234e;

    /* renamed from: f */
    private final C36083b f87235f;

    /* renamed from: gu0.c$a */
    public static final class C36082a {
        private C36082a() {
        }

        public /* synthetic */ C36082a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C36081c mo88820a(String str, C36083b bVar) {
            boolean z;
            C41536l.m120489i(bVar, "type");
            for (C36081c cVar : C36081c.values()) {
                if (!C41536l.m120484d(cVar.mo88818c(), str) || cVar.mo88819e() != bVar) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    return cVar;
                }
            }
            return null;
        }
    }

    /* renamed from: gu0.c$b */
    public enum C36083b {
        SMALL,
        BIG
    }

    static {
        f87223g = new C36082a((DefaultConstructorMarker) null);
    }

    private C36081c(String str, int i, C36083b bVar) {
        this.f87233d = str;
        this.f87234e = i;
        this.f87235f = bVar;
    }

    /* renamed from: b */
    public final int mo88817b() {
        return this.f87234e;
    }

    /* renamed from: c */
    public final String mo88818c() {
        return this.f87233d;
    }

    /* renamed from: e */
    public final C36083b mo88819e() {
        return this.f87235f;
    }
}
