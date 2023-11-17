package p115i4;

import com.facebook.AccessToken;
import com.facebook.C2626d;
import java.io.Serializable;
import p297w4.C8769a0;

/* renamed from: i4.a */
public class C6530a implements Serializable {
    private static final long serialVersionUID = 1;

    /* renamed from: d */
    private final String f19961d;

    /* renamed from: e */
    private final String f19962e;

    /* renamed from: i4.a$b */
    static class C6532b implements Serializable {
        private static final long serialVersionUID = -2488473066578201069L;

        /* renamed from: d */
        private final String f19963d;

        /* renamed from: e */
        private final String f19964e;

        private Object readResolve() {
            return new C6530a(this.f19963d, this.f19964e);
        }

        private C6532b(String str, String str2) {
            this.f19963d = str;
            this.f19964e = str2;
        }
    }

    public C6530a(AccessToken accessToken) {
        this(accessToken.mo8134t(), C2626d.m10135f());
    }

    private Object writeReplace() {
        return new C6532b(this.f19961d, this.f19962e);
    }

    /* renamed from: a */
    public String mo20508a() {
        return this.f19961d;
    }

    /* renamed from: b */
    public String mo20509b() {
        return this.f19962e;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C6530a)) {
            return false;
        }
        C6530a aVar = (C6530a) obj;
        if (!C8769a0.m32656b(aVar.f19961d, this.f19961d) || !C8769a0.m32656b(aVar.f19962e, this.f19962e)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        String str = this.f19961d;
        int i2 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        String str2 = this.f19962e;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i ^ i2;
    }

    public C6530a(String str, String str2) {
        this.f19961d = C8769a0.m32644Q(str) ? null : str;
        this.f19962e = str2;
    }
}
