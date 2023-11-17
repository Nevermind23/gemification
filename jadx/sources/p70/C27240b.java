package p70;

import kotlin.jvm.internal.C41536l;

/* renamed from: p70.b */
public final class C27240b {

    /* renamed from: a */
    private final Long f68251a;

    /* renamed from: b */
    private final String f68252b;

    /* renamed from: c */
    private final String f68253c;

    public C27240b(Long l, String str, String str2) {
        this.f68251a = l;
        this.f68252b = str;
        this.f68253c = str2;
    }

    /* renamed from: a */
    public final Long mo66520a() {
        return this.f68251a;
    }

    /* renamed from: b */
    public final String mo66521b() {
        return this.f68252b;
    }

    /* renamed from: c */
    public final String mo66522c() {
        return this.f68253c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27240b)) {
            return false;
        }
        C27240b bVar = (C27240b) obj;
        return C41536l.m120484d(this.f68251a, bVar.f68251a) && C41536l.m120484d(this.f68252b, bVar.f68252b) && C41536l.m120484d(this.f68253c, bVar.f68253c);
    }

    public int hashCode() {
        Long l = this.f68251a;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.f68252b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f68253c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        Long l = this.f68251a;
        String str = this.f68252b;
        String str2 = this.f68253c;
        return "ManagerInfo(clientKey=" + l + ", managerFirstName=" + str + ", managerPhoneNumber=" + str2 + ")";
    }
}
