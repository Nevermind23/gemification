package nt0;

import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: nt0.c */
public final class C37461c {

    /* renamed from: a */
    private final List f90065a;

    /* renamed from: b */
    private final int f90066b;

    /* renamed from: c */
    private final String f90067c;

    public C37461c(List list, int i, String str) {
        C41536l.m120489i(list, "objects");
        this.f90065a = list;
        this.f90066b = i;
        this.f90067c = str;
    }

    /* renamed from: a */
    public final int mo90601a() {
        return this.f90066b;
    }

    /* renamed from: b */
    public final String mo90602b() {
        return this.f90067c;
    }

    /* renamed from: c */
    public final List mo90603c() {
        return this.f90065a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37461c)) {
            return false;
        }
        C37461c cVar = (C37461c) obj;
        return C41536l.m120484d(this.f90065a, cVar.f90065a) && this.f90066b == cVar.f90066b && C41536l.m120484d(this.f90067c, cVar.f90067c);
    }

    public int hashCode() {
        int hashCode = ((this.f90065a.hashCode() * 31) + this.f90066b) * 31;
        String str = this.f90067c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        List list = this.f90065a;
        int i = this.f90066b;
        String str = this.f90067c;
        return "PlusTransferWizardConfig(objects=" + list + ", index=" + i + ", initials=" + str + ")";
    }
}
