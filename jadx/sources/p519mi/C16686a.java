package p519mi;

import p341ge.bog.designsystem.components.common.Color;
import p601sg.C17777b;
import p601sg.C17778c;
import p601sg.C17780e;

/* renamed from: mi.a */
public enum C16686a {
    POSITIVE(0, Integer.valueOf(C17780e.f49655M), C17780e.shape_inline_feedback_positive, new Color.Resource(C17778c.f49613O)),
    NEGATIVE(1, Integer.valueOf(C17780e.icons_24_system_error_fill), C17780e.shape_inline_feedback_negative, new Color.Resource(C17778c.f49639y)),
    INFO(2, r6, r12, new Color.Resource(r1)),
    PENDING(3, Integer.valueOf(C17780e.f49656O), C17780e.shape_inline_feedback_pending, new Color.Resource(C17778c.color_pending_solid_200)),
    PRIMARY(4, (int) null, C17780e.shape_inline_feedback_primary, new Color.Attribute(C17777b.color_primary_solid_200)),
    NORMAL_TEXT_INFO(5, (int) null, r12, new Color.Resource(r1));
    

    /* renamed from: d */
    private final int f46890d;

    /* renamed from: e */
    private final Integer f46891e;

    /* renamed from: f */
    private final int f46892f;

    /* renamed from: g */
    private final Color f46893g;

    private C16686a(int i, Integer num, int i2, Color color) {
        this.f46890d = i;
        this.f46891e = num;
        this.f46892f = i2;
        this.f46893g = color;
    }

    /* renamed from: b */
    public final int mo43810b() {
        return this.f46892f;
    }

    /* renamed from: c */
    public final Integer mo43811c() {
        return this.f46891e;
    }

    /* renamed from: e */
    public final Color mo43812e() {
        return this.f46893g;
    }

    /* renamed from: f */
    public final int mo43813f() {
        return this.f46890d;
    }
}
