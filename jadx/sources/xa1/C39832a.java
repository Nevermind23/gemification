package xa1;

import java.util.List;
import kotlin.jvm.internal.C41536l;
import sso.queery.GetClientInfoQuery;

/* renamed from: xa1.a */
public final class C39832a {

    /* renamed from: a */
    private final GetClientInfoQuery.GetClientInfo f94542a;

    /* renamed from: b */
    private final List f94543b;

    /* renamed from: c */
    private final List f94544c;

    public C39832a(GetClientInfoQuery.GetClientInfo getClientInfo, List list, List list2) {
        C41536l.m120489i(getClientInfo, "userInfo");
        C41536l.m120489i(list, "rules");
        C41536l.m120489i(list2, "countryCodes");
        this.f94542a = getClientInfo;
        this.f94543b = list;
        this.f94544c = list2;
    }

    /* renamed from: a */
    public final List mo93529a() {
        return this.f94544c;
    }

    /* renamed from: b */
    public final List mo93530b() {
        return this.f94543b;
    }

    /* renamed from: c */
    public final GetClientInfoQuery.GetClientInfo mo93531c() {
        return this.f94542a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39832a)) {
            return false;
        }
        C39832a aVar = (C39832a) obj;
        return C41536l.m120484d(this.f94542a, aVar.f94542a) && C41536l.m120484d(this.f94543b, aVar.f94543b) && C41536l.m120484d(this.f94544c, aVar.f94544c);
    }

    public int hashCode() {
        return (((this.f94542a.hashCode() * 31) + this.f94543b.hashCode()) * 31) + this.f94544c.hashCode();
    }

    public String toString() {
        return "EditProfileData(userInfo=" + this.f94542a + ", rules=" + this.f94543b + ", countryCodes=" + this.f94544c + ')';
    }
}
