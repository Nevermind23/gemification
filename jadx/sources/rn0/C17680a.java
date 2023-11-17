package rn0;

import kotlin.jvm.internal.C41536l;

/* renamed from: rn0.a */
public final class C17680a {

    /* renamed from: a */
    private final String f49398a;

    /* renamed from: b */
    private final String f49399b;

    public C17680a(String str, String str2) {
        C41536l.m120489i(str, "id");
        C41536l.m120489i(str2, "text");
        this.f49398a = str;
        this.f49399b = str2;
    }

    /* renamed from: a */
    public final String mo45240a() {
        return this.f49398a;
    }

    /* renamed from: b */
    public final String mo45241b() {
        return this.f49399b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17680a)) {
            return false;
        }
        C17680a aVar = (C17680a) obj;
        return C41536l.m120484d(this.f49398a, aVar.f49398a) && C41536l.m120484d(this.f49399b, aVar.f49399b);
    }

    public int hashCode() {
        return (this.f49398a.hashCode() * 31) + this.f49399b.hashCode();
    }

    public String toString() {
        String str = this.f49398a;
        String str2 = this.f49399b;
        return "ChoiceTextItem(id=" + str + ", text=" + str2 + ")";
    }
}
