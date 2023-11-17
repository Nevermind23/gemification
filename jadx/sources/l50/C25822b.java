package l50;

import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: l50.b */
public final class C25822b {

    /* renamed from: a */
    private final List f65658a;

    public C25822b(List list) {
        C41536l.m120489i(list, "subAccounts");
        this.f65658a = list;
    }

    /* renamed from: a */
    public final List mo64459a() {
        return this.f65658a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C25822b) && C41536l.m120484d(this.f65658a, ((C25822b) obj).f65658a);
    }

    public int hashCode() {
        return this.f65658a.hashCode();
    }

    public String toString() {
        List list = this.f65658a;
        return "AccountDetailsUIModel(subAccounts=" + list + ")";
    }
}
