package g91;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: g91.y */
public final class C32356y {

    /* renamed from: a */
    private final String f79791a;

    /* renamed from: b */
    private final Long f79792b;

    public C32356y(String str, Long l) {
        this.f79791a = str;
        this.f79792b = l;
    }

    /* renamed from: a */
    public final String mo72855a() {
        return this.f79791a;
    }

    /* renamed from: b */
    public final Long mo72856b() {
        return this.f79792b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32356y)) {
            return false;
        }
        C32356y yVar = (C32356y) obj;
        return C41536l.m120484d(this.f79791a, yVar.f79791a) && C41536l.m120484d(this.f79792b, yVar.f79792b);
    }

    public int hashCode() {
        String str = this.f79791a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.f79792b;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        String str = this.f79791a;
        Long l = this.f79792b;
        return "FileNameAndSize(displayName=" + str + ", size=" + l + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C32356y(String str, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : l);
    }
}
