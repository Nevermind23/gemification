package db1;

import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: db1.c */
public final class C31553c {

    /* renamed from: a */
    private final C31554d f78112a;

    /* renamed from: b */
    private final List f78113b;

    /* renamed from: c */
    private final List f78114c;

    public C31553c(C31554d dVar, List list, List list2) {
        C41536l.m120489i(dVar, "userInfo");
        C41536l.m120489i(list, "rules");
        C41536l.m120489i(list2, "countryCodes");
        this.f78112a = dVar;
        this.f78113b = list;
        this.f78114c = list2;
    }

    /* renamed from: a */
    public final List mo71968a() {
        return this.f78114c;
    }

    /* renamed from: b */
    public final List mo71969b() {
        return this.f78113b;
    }

    /* renamed from: c */
    public final C31554d mo71970c() {
        return this.f78112a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31553c)) {
            return false;
        }
        C31553c cVar = (C31553c) obj;
        return C41536l.m120484d(this.f78112a, cVar.f78112a) && C41536l.m120484d(this.f78113b, cVar.f78113b) && C41536l.m120484d(this.f78114c, cVar.f78114c);
    }

    public int hashCode() {
        return (((this.f78112a.hashCode() * 31) + this.f78113b.hashCode()) * 31) + this.f78114c.hashCode();
    }

    public String toString() {
        return "EditProfileDataUiModel(userInfo=" + this.f78112a + ", rules=" + this.f78113b + ", countryCodes=" + this.f78114c + ')';
    }
}
