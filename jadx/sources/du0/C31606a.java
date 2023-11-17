package du0;

import kotlin.jvm.internal.C41536l;

/* renamed from: du0.a */
public final class C31606a {

    /* renamed from: a */
    private final String f78177a;

    public C31606a(String str) {
        C41536l.m120489i(str, "newsKey");
        this.f78177a = str;
    }

    /* renamed from: a */
    public final String mo72017a() {
        return this.f78177a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C31606a) && C41536l.m120484d(this.f78177a, ((C31606a) obj).f78177a);
    }

    public int hashCode() {
        return this.f78177a.hashCode();
    }

    public String toString() {
        String str = this.f78177a;
        return "NewsKeyUI(newsKey=" + str + ")";
    }
}
