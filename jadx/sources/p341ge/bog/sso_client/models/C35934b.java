package p341ge.bog.sso_client.models;

import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.sso_client.models.b */
public final class C35934b {

    /* renamed from: a */
    private final String f86919a;

    /* renamed from: b */
    private final String f86920b;

    public C35934b(String str, String str2) {
        this.f86919a = str;
        this.f86920b = str2;
    }

    /* renamed from: a */
    public final String mo88463a() {
        return this.f86919a;
    }

    /* renamed from: b */
    public final String mo88464b() {
        return this.f86920b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35934b)) {
            return false;
        }
        C35934b bVar = (C35934b) obj;
        return C41536l.m120484d(this.f86919a, bVar.f86919a) && C41536l.m120484d(this.f86920b, bVar.f86920b);
    }

    public int hashCode() {
        String str = this.f86919a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f86920b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "AppSettings(propertyKey=" + this.f86919a + ", propertyValue=" + this.f86920b + ')';
    }
}
