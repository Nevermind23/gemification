package p447hg;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: hg.d */
public final class C15501d {

    /* renamed from: a */
    private final String f44006a;

    /* renamed from: b */
    private final Long f44007b;

    public C15501d(String str, Long l) {
        this.f44006a = str;
        this.f44007b = l;
    }

    /* renamed from: a */
    public final String mo42598a() {
        return this.f44006a;
    }

    /* renamed from: b */
    public final Long mo42599b() {
        return this.f44007b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15501d)) {
            return false;
        }
        C15501d dVar = (C15501d) obj;
        return C41536l.m120484d(this.f44006a, dVar.f44006a) && C41536l.m120484d(this.f44007b, dVar.f44007b);
    }

    public int hashCode() {
        String str = this.f44006a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.f44007b;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        String str = this.f44006a;
        Long l = this.f44007b;
        return "FileNameAndSize(displayName=" + str + ", size=" + l + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15501d(String str, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : l);
    }
}
