package q51;

import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: q51.c */
public final class C38132c {

    /* renamed from: a */
    private final long f91546a;

    /* renamed from: b */
    private final String f91547b;

    /* renamed from: c */
    private final String f91548c;

    /* renamed from: d */
    private final String f91549d;

    public C38132c(long j, String str, String str2, String str3) {
        C41536l.m120489i(str, "cardDisplayText");
        this.f91546a = j;
        this.f91547b = str;
        this.f91548c = str2;
        this.f91549d = str3;
    }

    /* renamed from: a */
    public final String mo91668a() {
        return this.f91547b;
    }

    /* renamed from: b */
    public final long mo91669b() {
        return this.f91546a;
    }

    /* renamed from: c */
    public final String mo91670c() {
        return this.f91549d;
    }

    /* renamed from: d */
    public final String mo91671d() {
        return this.f91548c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38132c)) {
            return false;
        }
        C38132c cVar = (C38132c) obj;
        return this.f91546a == cVar.f91546a && C41536l.m120484d(this.f91547b, cVar.f91547b) && C41536l.m120484d(this.f91548c, cVar.f91548c) && C41536l.m120484d(this.f91549d, cVar.f91549d);
    }

    public int hashCode() {
        int a = ((C7397t.m28148a(this.f91546a) * 31) + this.f91547b.hashCode()) * 31;
        String str = this.f91548c;
        int i = 0;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f91549d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        long j = this.f91546a;
        String str = this.f91547b;
        String str2 = this.f91548c;
        String str3 = this.f91549d;
        return "StatementCardModel(cardId=" + j + ", cardDisplayText=" + str + ", lastFour=" + str2 + ", imageLink=" + str3 + ")";
    }
}
