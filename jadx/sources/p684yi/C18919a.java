package p684yi;

import kotlin.jvm.internal.C41536l;
import p341ge.bog.designsystem.components.common.Color;

/* renamed from: yi.a */
public final class C18919a {

    /* renamed from: a */
    private final String f52905a;

    /* renamed from: b */
    private final String f52906b;

    /* renamed from: c */
    private final String f52907c;

    /* renamed from: d */
    private final String f52908d;

    /* renamed from: e */
    private final Color f52909e;

    public C18919a(String str, String str2, String str3, String str4, Color color) {
        C41536l.m120489i(str, "title");
        C41536l.m120489i(str2, "amount");
        this.f52905a = str;
        this.f52906b = str2;
        this.f52907c = str3;
        this.f52908d = str4;
        this.f52909e = color;
    }

    /* renamed from: a */
    public final String mo46937a() {
        return this.f52906b;
    }

    /* renamed from: b */
    public final String mo46938b() {
        return this.f52907c;
    }

    /* renamed from: c */
    public final Color mo46939c() {
        return this.f52909e;
    }

    /* renamed from: d */
    public final String mo46940d() {
        return this.f52908d;
    }

    /* renamed from: e */
    public final String mo46941e() {
        return this.f52905a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18919a)) {
            return false;
        }
        C18919a aVar = (C18919a) obj;
        return C41536l.m120484d(this.f52905a, aVar.f52905a) && C41536l.m120484d(this.f52906b, aVar.f52906b) && C41536l.m120484d(this.f52907c, aVar.f52907c) && C41536l.m120484d(this.f52908d, aVar.f52908d) && C41536l.m120484d(this.f52909e, aVar.f52909e);
    }

    public int hashCode() {
        int hashCode = ((this.f52905a.hashCode() * 31) + this.f52906b.hashCode()) * 31;
        String str = this.f52907c;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f52908d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Color color = this.f52909e;
        if (color != null) {
            i = color.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        String str = this.f52905a;
        String str2 = this.f52906b;
        String str3 = this.f52907c;
        String str4 = this.f52908d;
        Color color = this.f52909e;
        return "HeaderData(title=" + str + ", amount=" + str2 + ", amountDescriptionText=" + str3 + ", badgeText=" + str4 + ", badgeBackgroundColor=" + color + ")";
    }
}
