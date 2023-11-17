package p684yi;

import kotlin.jvm.internal.C41536l;
import p341ge.bog.designsystem.components.common.Color;

/* renamed from: yi.b */
public final class C18920b {

    /* renamed from: a */
    private final String f52910a;

    /* renamed from: b */
    private final int f52911b;

    /* renamed from: c */
    private final Color f52912c;

    /* renamed from: d */
    private final Color f52913d;

    /* renamed from: e */
    private final Color f52914e;

    /* renamed from: f */
    private final boolean f52915f;

    public C18920b(String str, int i, Color color, Color color2, Color color3, boolean z) {
        C41536l.m120489i(str, "text");
        C41536l.m120489i(color, "iconTintColor");
        C41536l.m120489i(color2, "iconBackgroundColor");
        this.f52910a = str;
        this.f52911b = i;
        this.f52912c = color;
        this.f52913d = color2;
        this.f52914e = color3;
        this.f52915f = z;
    }

    /* renamed from: a */
    public final int mo46945a() {
        return this.f52911b;
    }

    /* renamed from: b */
    public final Color mo46946b() {
        return this.f52914e;
    }

    /* renamed from: c */
    public final Color mo46947c() {
        return this.f52913d;
    }

    /* renamed from: d */
    public final Color mo46948d() {
        return this.f52912c;
    }

    /* renamed from: e */
    public final String mo46949e() {
        return this.f52910a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18920b)) {
            return false;
        }
        C18920b bVar = (C18920b) obj;
        return C41536l.m120484d(this.f52910a, bVar.f52910a) && this.f52911b == bVar.f52911b && C41536l.m120484d(this.f52912c, bVar.f52912c) && C41536l.m120484d(this.f52913d, bVar.f52913d) && C41536l.m120484d(this.f52914e, bVar.f52914e) && this.f52915f == bVar.f52915f;
    }

    /* renamed from: f */
    public final boolean mo46951f() {
        return this.f52915f;
    }

    public int hashCode() {
        int hashCode = ((((((this.f52910a.hashCode() * 31) + this.f52911b) * 31) + this.f52912c.hashCode()) * 31) + this.f52913d.hashCode()) * 31;
        Color color = this.f52914e;
        int hashCode2 = (hashCode + (color == null ? 0 : color.hashCode())) * 31;
        boolean z = this.f52915f;
        if (z) {
            z = true;
        }
        return hashCode2 + (z ? 1 : 0);
    }

    public String toString() {
        String str = this.f52910a;
        int i = this.f52911b;
        Color color = this.f52912c;
        Color color2 = this.f52913d;
        Color color3 = this.f52914e;
        boolean z = this.f52915f;
        return "InfoListItemData(text=" + str + ", icon=" + i + ", iconTintColor=" + color + ", iconBackgroundColor=" + color2 + ", iconBackgroundBorderColor=" + color3 + ", textFaded=" + z + ")";
    }
}
