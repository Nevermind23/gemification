package e00;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.common.Color;
import p341ge.bog.designsystem.components.common.Image;
import p366bk.C10318g;
import p366bk.C10320i;
import p642vh.C18358g;

/* renamed from: e00.a */
public enum C20119a {
    DEBIT_CARD(new Image.Resource(C10320i.f28662Ea, (Boolean) null, 2, (DefaultConstructorMarker) null), (int) null, (Image) null, false, 14, (boolean) null),
    DEPOSIT(new Image.Resource(C10320i.f28665Ia, (Boolean) null, 2, (DefaultConstructorMarker) null), (int) null, (Image) null, false, 14, (boolean) null),
    CREDIT_APPLICATION(new Image.Resource(C10320i.f28678Ua, (Boolean) null, 2, (DefaultConstructorMarker) null), (int) null, (Image) null, false, 14, (boolean) null),
    DEP_LOAN(new Image.Resource(C10320i.f28666Ja, (Boolean) null, 2, (DefaultConstructorMarker) null), (int) null, (Image) null, false, 14, (boolean) null),
    GT(new Image.Resource(C10320i.f28670La, (Boolean) null, 2, (DefaultConstructorMarker) null), (int) null, (Image) null, false, 14, (boolean) null),
    CAS_CLIENT_SERVICE(new Image.Resource(C10320i.f28669Ka, (Boolean) null, 2, (DefaultConstructorMarker) null), (int) null, (Image) null, false, 14, (boolean) null),
    INSURANCE(new Image.Resource(C10320i.icons_48_general_insurance_outline, (Boolean) null, 2, (DefaultConstructorMarker) null), (int) null, (Image) null, true, 6, (boolean) null),
    BNPL_APPLICATION(new Image.Resource(C10320i.icons_48_bnpl_outline, (Boolean) null, 2, (DefaultConstructorMarker) null), C18358g.m62729c(C10318g.f28617A0), C18358g.m62729c(C10318g.f28618B0), true);
    

    /* renamed from: d */
    private final Image f54774d;

    /* renamed from: e */
    private final Color f54775e;

    /* renamed from: f */
    private final Color f54776f;

    /* renamed from: g */
    private final boolean f54777g;

    private C20119a(Image image, Color color, Color color2, boolean z) {
        this.f54774d = image;
        this.f54775e = color;
        this.f54776f = color2;
        this.f54777g = z;
    }

    /* renamed from: b */
    public final Color mo48541b() {
        return this.f54776f;
    }

    /* renamed from: c */
    public final Image mo48542c() {
        return this.f54774d;
    }

    /* renamed from: e */
    public final boolean mo48543e() {
        return this.f54777g;
    }

    /* renamed from: f */
    public final Color mo48544f() {
        return this.f54775e;
    }
}
