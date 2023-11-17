package x80;

import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: x80.b */
public final class C29658b {

    /* renamed from: a */
    private final List f74838a;

    public C29658b(List list) {
        this.f74838a = list;
    }

    /* renamed from: a */
    public final List mo69588a() {
        return this.f74838a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C29658b) && C41536l.m120484d(this.f74838a, ((C29658b) obj).f74838a);
    }

    public int hashCode() {
        List list = this.f74838a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        List list = this.f74838a;
        return "CLApplicationData(applicantSalaryInfo=" + list + ")";
    }
}
