package ck0;

import kotlin.jvm.internal.C41536l;

/* renamed from: ck0.a */
public final class C19764a {

    /* renamed from: a */
    private final String f54140a;

    public C19764a(String str) {
        C41536l.m120489i(str, "hardwareId");
        this.f54140a = str;
    }

    /* renamed from: a */
    public final String mo48004a() {
        return this.f54140a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C19764a) && C41536l.m120484d(this.f54140a, ((C19764a) obj).f54140a);
    }

    public int hashCode() {
        return this.f54140a.hashCode();
    }

    public String toString() {
        String str = this.f54140a;
        return "HardwareId(hardwareId=" + str + ")";
    }
}
