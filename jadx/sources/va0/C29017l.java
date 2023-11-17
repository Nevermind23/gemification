package va0;

import kotlin.jvm.internal.C41536l;
import p341ge.bog.designsystem.components.common.Color;

/* renamed from: va0.l */
public final class C29017l {

    /* renamed from: a */
    private final String f73978a;

    /* renamed from: b */
    private final Color f73979b;

    public C29017l(String str, Color color) {
        C41536l.m120489i(str, "text");
        C41536l.m120489i(color, "color");
        this.f73978a = str;
        this.f73979b = color;
    }

    /* renamed from: a */
    public final String mo68859a() {
        return this.f73978a;
    }

    /* renamed from: b */
    public final Color mo68860b() {
        return this.f73979b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29017l)) {
            return false;
        }
        C29017l lVar = (C29017l) obj;
        return C41536l.m120484d(this.f73978a, lVar.f73978a) && C41536l.m120484d(this.f73979b, lVar.f73979b);
    }

    public int hashCode() {
        return (this.f73978a.hashCode() * 31) + this.f73979b.hashCode();
    }

    public String toString() {
        String str = this.f73978a;
        Color color = this.f73979b;
        return "ActionCardUiModel(text=" + str + ", color=" + color + ")";
    }
}
