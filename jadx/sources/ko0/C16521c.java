package ko0;

import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.common.Color;
import sn0.C17898b;
import sn0.C17900d;

/* renamed from: ko0.c */
public enum C16521c {
    PLUS(r4, r5, Integer.valueOf(r0), r7, (Integer) null, C17898b.f50933j, 16, (int) null),
    MR(r4, r5, Integer.valueOf(r0), r7, (Integer) null, C17898b.color_brand_mr_solid_500, 16, (int) null),
    CASHBACK(r4, r5, Integer.valueOf(r1), r7, Integer.valueOf(r0), C17898b.f50934k),
    GIFT(r4, r5, Integer.valueOf(C17900d.gift_star), r7, Integer.valueOf(r9), r9);
    

    /* renamed from: j */
    public static final C16522a f46671j = null;

    /* renamed from: d */
    private final List f46677d;

    /* renamed from: e */
    private final int f46678e;

    /* renamed from: f */
    private final Integer f46679f;

    /* renamed from: g */
    private final Color f46680g;

    /* renamed from: h */
    private final Integer f46681h;

    /* renamed from: i */
    private final int f46682i;

    /* renamed from: ko0.c$a */
    public static final class C16522a {
        private C16522a() {
        }

        public /* synthetic */ C16522a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C16521c mo43680a(String str) {
            C41536l.m120489i(str, "benefType");
            for (C16521c cVar : C16521c.values()) {
                if (cVar.mo43676e().contains(str)) {
                    return cVar;
                }
            }
            return null;
        }
    }

    static {
        f46671j = new C16522a((DefaultConstructorMarker) null);
    }

    private C16521c(List list, int i, Integer num, Color color, Integer num2, int i2) {
        this.f46677d = list;
        this.f46678e = i;
        this.f46679f = num;
        this.f46680g = color;
        this.f46681h = num2;
        this.f46682i = i2;
    }

    /* renamed from: b */
    public final Color mo43674b() {
        return this.f46680g;
    }

    /* renamed from: c */
    public final Integer mo43675c() {
        return this.f46679f;
    }

    /* renamed from: e */
    public final List mo43676e() {
        return this.f46677d;
    }

    /* renamed from: f */
    public final int mo43677f() {
        return this.f46678e;
    }

    /* renamed from: g */
    public final int mo43678g() {
        return this.f46682i;
    }

    /* renamed from: h */
    public final Integer mo43679h() {
        return this.f46681h;
    }
}
