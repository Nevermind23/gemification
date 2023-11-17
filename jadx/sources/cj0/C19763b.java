package cj0;

import kotlin.jvm.internal.C41536l;
import p341ge.bog.designsystem.components.infobadge.InfoBadgeView;
import pi0.C27534a;

/* renamed from: cj0.b */
public final class C19763b implements C27534a {

    /* renamed from: a */
    private final int f54131a;

    /* renamed from: b */
    private final int f54132b;

    /* renamed from: c */
    private final String f54133c;

    /* renamed from: d */
    private final String f54134d;

    /* renamed from: e */
    private final String f54135e;

    /* renamed from: f */
    private final String f54136f;

    /* renamed from: g */
    private final String f54137g;

    /* renamed from: h */
    private final String f54138h;

    /* renamed from: i */
    private final InfoBadgeView.C13346b f54139i;

    public C19763b(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, InfoBadgeView.C13346b bVar) {
        C41536l.m120489i(str, "text");
        C41536l.m120489i(str2, "infoBadgeText");
        C41536l.m120489i(str3, "title");
        C41536l.m120489i(str4, "subTitle");
        C41536l.m120489i(str5, "resendButtonText");
        C41536l.m120489i(str6, "openGiftCardImageButtonText");
        C41536l.m120489i(bVar, "infoBadgeType");
        this.f54131a = i;
        this.f54132b = i2;
        this.f54133c = str;
        this.f54134d = str2;
        this.f54135e = str3;
        this.f54136f = str4;
        this.f54137g = str5;
        this.f54138h = str6;
        this.f54139i = bVar;
    }

    /* renamed from: a */
    public final String mo47992a() {
        return this.f54134d;
    }

    /* renamed from: b */
    public final InfoBadgeView.C13346b mo47993b() {
        return this.f54139i;
    }

    /* renamed from: c */
    public final int mo47994c() {
        return this.f54132b;
    }

    /* renamed from: d */
    public final String mo47995d() {
        return this.f54138h;
    }

    /* renamed from: e */
    public final String mo47996e() {
        return this.f54137g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19763b)) {
            return false;
        }
        C19763b bVar = (C19763b) obj;
        return this.f54131a == bVar.f54131a && this.f54132b == bVar.f54132b && C41536l.m120484d(this.f54133c, bVar.f54133c) && C41536l.m120484d(this.f54134d, bVar.f54134d) && C41536l.m120484d(this.f54135e, bVar.f54135e) && C41536l.m120484d(this.f54136f, bVar.f54136f) && C41536l.m120484d(this.f54137g, bVar.f54137g) && C41536l.m120484d(this.f54138h, bVar.f54138h) && this.f54139i == bVar.f54139i;
    }

    /* renamed from: f */
    public final int mo47998f() {
        return this.f54131a;
    }

    /* renamed from: g */
    public final String mo47999g() {
        return this.f54136f;
    }

    /* renamed from: h */
    public final String mo48000h() {
        return this.f54133c;
    }

    public int hashCode() {
        return (((((((((((((((this.f54131a * 31) + this.f54132b) * 31) + this.f54133c.hashCode()) * 31) + this.f54134d.hashCode()) * 31) + this.f54135e.hashCode()) * 31) + this.f54136f.hashCode()) * 31) + this.f54137g.hashCode()) * 31) + this.f54138h.hashCode()) * 31) + this.f54139i.hashCode();
    }

    /* renamed from: i */
    public final String mo48002i() {
        return this.f54135e;
    }

    public String toString() {
        int i = this.f54131a;
        int i2 = this.f54132b;
        String str = this.f54133c;
        String str2 = this.f54134d;
        String str3 = this.f54135e;
        String str4 = this.f54136f;
        String str5 = this.f54137g;
        String str6 = this.f54138h;
        InfoBadgeView.C13346b bVar = this.f54139i;
        return "StatementHeaderItem(resendLinkImage=" + i + ", openGiftCardImage=" + i2 + ", text=" + str + ", infoBadgeText=" + str2 + ", title=" + str3 + ", subTitle=" + str4 + ", resendButtonText=" + str5 + ", openGiftCardImageButtonText=" + str6 + ", infoBadgeType=" + bVar + ")";
    }
}
