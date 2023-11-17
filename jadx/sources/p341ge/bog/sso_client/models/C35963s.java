package p341ge.bog.sso_client.models;

import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.sso_client.models.s */
public final class C35963s {

    /* renamed from: a */
    private String f87007a;

    /* renamed from: b */
    private String f87008b;

    public C35963s(String str, String str2) {
        this.f87007a = str;
        this.f87008b = str2;
    }

    /* renamed from: a */
    public final String mo88555a() {
        return this.f87007a;
    }

    /* renamed from: b */
    public final String mo88556b() {
        return this.f87008b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35963s)) {
            return false;
        }
        C35963s sVar = (C35963s) obj;
        return C41536l.m120484d(this.f87007a, sVar.f87007a) && C41536l.m120484d(this.f87008b, sVar.f87008b);
    }

    public int hashCode() {
        String str = this.f87007a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f87008b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "SetupSecurityParametersResponse(biometricAuthToken=" + this.f87007a + ", passcodeAuthToken=" + this.f87008b + ')';
    }
}
