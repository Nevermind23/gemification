package p492kj;

import kotlin.jvm.internal.C41536l;
import p519mi.C16686a;

/* renamed from: kj.a */
public final class C16434a {

    /* renamed from: a */
    private final C16686a f46421a;

    /* renamed from: b */
    private final String f46422b;

    public C16434a(C16686a aVar, String str) {
        C41536l.m120489i(aVar, "state");
        C41536l.m120489i(str, "title");
        this.f46421a = aVar;
        this.f46422b = str;
    }

    /* renamed from: a */
    public final C16686a mo43560a() {
        return this.f46421a;
    }

    /* renamed from: b */
    public final String mo43561b() {
        return this.f46422b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16434a)) {
            return false;
        }
        C16434a aVar = (C16434a) obj;
        return this.f46421a == aVar.f46421a && C41536l.m120484d(this.f46422b, aVar.f46422b);
    }

    public int hashCode() {
        return (this.f46421a.hashCode() * 31) + this.f46422b.hashCode();
    }

    public String toString() {
        C16686a aVar = this.f46421a;
        String str = this.f46422b;
        return "StatisticsFeedbackData(state=" + aVar + ", title=" + str + ")";
    }
}
