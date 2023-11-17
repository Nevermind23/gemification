package j71;

import java.util.Date;
import kotlin.jvm.internal.C41536l;

/* renamed from: j71.f */
public final class C36753f {

    /* renamed from: a */
    private final String f88691a;

    /* renamed from: b */
    private final String f88692b;

    /* renamed from: c */
    private final String f88693c;

    /* renamed from: d */
    private final boolean f88694d;

    /* renamed from: e */
    private final Date f88695e;

    public C36753f(String str, String str2, String str3, boolean z, Date date) {
        C41536l.m120489i(str, "deviceId");
        C41536l.m120489i(str2, "deviceType");
        C41536l.m120489i(str3, "deviceName");
        C41536l.m120489i(date, "deviceRegDate");
        this.f88691a = str;
        this.f88692b = str2;
        this.f88693c = str3;
        this.f88694d = z;
        this.f88695e = date;
    }

    /* renamed from: a */
    public final String mo89614a() {
        return this.f88691a;
    }

    /* renamed from: b */
    public final String mo89615b() {
        return this.f88693c;
    }

    /* renamed from: c */
    public final Date mo89616c() {
        return this.f88695e;
    }

    /* renamed from: d */
    public final String mo89617d() {
        return this.f88692b;
    }

    /* renamed from: e */
    public final boolean mo89618e() {
        return this.f88694d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36753f)) {
            return false;
        }
        C36753f fVar = (C36753f) obj;
        return C41536l.m120484d(this.f88691a, fVar.f88691a) && C41536l.m120484d(this.f88692b, fVar.f88692b) && C41536l.m120484d(this.f88693c, fVar.f88693c) && this.f88694d == fVar.f88694d && C41536l.m120484d(this.f88695e, fVar.f88695e);
    }

    public int hashCode() {
        int hashCode = ((((this.f88691a.hashCode() * 31) + this.f88692b.hashCode()) * 31) + this.f88693c.hashCode()) * 31;
        boolean z = this.f88694d;
        if (z) {
            z = true;
        }
        return ((hashCode + (z ? 1 : 0)) * 31) + this.f88695e.hashCode();
    }

    public String toString() {
        String str = this.f88691a;
        String str2 = this.f88692b;
        String str3 = this.f88693c;
        boolean z = this.f88694d;
        Date date = this.f88695e;
        return "PassDevice(deviceId=" + str + ", deviceType=" + str2 + ", deviceName=" + str3 + ", isPhysicalDevice=" + z + ", deviceRegDate=" + date + ")";
    }
}
