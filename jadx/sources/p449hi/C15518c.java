package p449hi;

import kotlin.jvm.internal.C41536l;
import ue1.C43064a;

/* renamed from: hi.c */
public final class C15518c {

    /* renamed from: a */
    private final int f44028a;

    /* renamed from: b */
    private final String f44029b;

    /* renamed from: c */
    private final C43064a f44030c;

    /* renamed from: d */
    private final Integer f44031d;

    public C15518c(int i, String str, C43064a aVar, Integer num) {
        C41536l.m120489i(str, "title");
        this.f44028a = i;
        this.f44029b = str;
        this.f44030c = aVar;
        this.f44031d = num;
    }

    /* renamed from: a */
    public final C43064a mo42633a() {
        return this.f44030c;
    }

    /* renamed from: b */
    public final int mo42634b() {
        return this.f44028a;
    }

    /* renamed from: c */
    public final Integer mo42635c() {
        return this.f44031d;
    }

    /* renamed from: d */
    public final String mo42636d() {
        return this.f44029b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15518c)) {
            return false;
        }
        C15518c cVar = (C15518c) obj;
        return this.f44028a == cVar.f44028a && C41536l.m120484d(this.f44029b, cVar.f44029b) && C41536l.m120484d(this.f44030c, cVar.f44030c) && C41536l.m120484d(this.f44031d, cVar.f44031d);
    }

    public int hashCode() {
        int hashCode = ((this.f44028a * 31) + this.f44029b.hashCode()) * 31;
        C43064a aVar = this.f44030c;
        int i = 0;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Integer num = this.f44031d;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        int i = this.f44028a;
        String str = this.f44029b;
        C43064a aVar = this.f44030c;
        Integer num = this.f44031d;
        return "HeaderButton(icon=" + i + ", title=" + str + ", action=" + aVar + ", maxLines=" + num + ")";
    }
}
