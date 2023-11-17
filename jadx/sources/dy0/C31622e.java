package dy0;

import java.util.List;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;

/* renamed from: dy0.e */
public final class C31622e {

    /* renamed from: a */
    private final long f78187a;

    /* renamed from: b */
    private final List f78188b;

    /* renamed from: c */
    private final String f78189c;

    /* renamed from: d */
    private final String f78190d;

    /* renamed from: e */
    private final String f78191e;

    /* renamed from: f */
    private final String f78192f;

    public C31622e(long j, List list, String str, String str2, String str3, String str4) {
        C41536l.m120489i(str, "shortName");
        C41536l.m120489i(str2, IRetrofitService.SERVICE_ID);
        C41536l.m120489i(str3, "customerIdDisplayValue");
        this.f78187a = j;
        this.f78188b = list;
        this.f78189c = str;
        this.f78190d = str2;
        this.f78191e = str3;
        this.f78192f = str4;
    }

    /* renamed from: a */
    public final String mo72047a() {
        return this.f78191e;
    }

    /* renamed from: b */
    public final String mo72048b() {
        return this.f78192f;
    }

    /* renamed from: c */
    public final String mo72049c() {
        return this.f78189c;
    }

    /* renamed from: d */
    public final long mo72050d() {
        return this.f78187a;
    }

    /* renamed from: e */
    public final List mo72051e() {
        return this.f78188b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31622e)) {
            return false;
        }
        C31622e eVar = (C31622e) obj;
        return this.f78187a == eVar.f78187a && C41536l.m120484d(this.f78188b, eVar.f78188b) && C41536l.m120484d(this.f78189c, eVar.f78189c) && C41536l.m120484d(this.f78190d, eVar.f78190d) && C41536l.m120484d(this.f78191e, eVar.f78191e) && C41536l.m120484d(this.f78192f, eVar.f78192f);
    }

    public int hashCode() {
        int a = C7397t.m28148a(this.f78187a) * 31;
        List list = this.f78188b;
        int i = 0;
        int hashCode = (((((((a + (list == null ? 0 : list.hashCode())) * 31) + this.f78189c.hashCode()) * 31) + this.f78190d.hashCode()) * 31) + this.f78191e.hashCode()) * 31;
        String str = this.f78192f;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        long j = this.f78187a;
        List list = this.f78188b;
        String str = this.f78189c;
        String str2 = this.f78190d;
        String str3 = this.f78191e;
        String str4 = this.f78192f;
        return "TemplateUiModel(templateId=" + j + ", templateParameters=" + list + ", shortName=" + str + ", serviceId=" + str2 + ", customerIdDisplayValue=" + str3 + ", imageUrl=" + str4 + ")";
    }
}
