package rj0;

import kotlin.jvm.internal.C41536l;
import pi0.C27534a;

/* renamed from: rj0.a */
public final class C28046a implements C27534a {

    /* renamed from: a */
    private final String f71396a;

    public C28046a(String str) {
        C41536l.m120489i(str, "imageUrl");
        this.f71396a = str;
    }

    /* renamed from: a */
    public final String mo67587a() {
        return this.f71396a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C28046a) && C41536l.m120484d(this.f71396a, ((C28046a) obj).f71396a);
    }

    public int hashCode() {
        return this.f71396a.hashCode();
    }

    public String toString() {
        String str = this.f71396a;
        return "IntroductionItem(imageUrl=" + str + ")";
    }
}
