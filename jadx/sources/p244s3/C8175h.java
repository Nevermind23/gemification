package p244s3;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;
import p089g4.C6223k;
import p166m3.C7083e;

/* renamed from: s3.h */
public class C8175h implements C7083e {

    /* renamed from: b */
    private final C8176i f23321b;

    /* renamed from: c */
    private final URL f23322c;

    /* renamed from: d */
    private final String f23323d;

    /* renamed from: e */
    private String f23324e;

    /* renamed from: f */
    private URL f23325f;

    /* renamed from: g */
    private volatile byte[] f23326g;

    /* renamed from: h */
    private int f23327h;

    public C8175h(URL url) {
        this(url, C8176i.f23329b);
    }

    /* renamed from: d */
    private byte[] m30862d() {
        if (this.f23326g == null) {
            this.f23326g = mo23366c().getBytes(C7083e.f21042a);
        }
        return this.f23326g;
    }

    /* renamed from: f */
    private String m30863f() {
        if (TextUtils.isEmpty(this.f23324e)) {
            String str = this.f23323d;
            if (TextUtils.isEmpty(str)) {
                str = ((URL) C6223k.m24730d(this.f23322c)).toString();
            }
            this.f23324e = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
        }
        return this.f23324e;
    }

    /* renamed from: g */
    private URL m30864g() {
        if (this.f23325f == null) {
            this.f23325f = new URL(m30863f());
        }
        return this.f23325f;
    }

    /* renamed from: b */
    public void mo7845b(MessageDigest messageDigest) {
        messageDigest.update(m30862d());
    }

    /* renamed from: c */
    public String mo23366c() {
        String str = this.f23323d;
        return str != null ? str : ((URL) C6223k.m24730d(this.f23322c)).toString();
    }

    /* renamed from: e */
    public Map mo23367e() {
        return this.f23321b.mo23370a();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C8175h)) {
            return false;
        }
        C8175h hVar = (C8175h) obj;
        if (!mo23366c().equals(hVar.mo23366c()) || !this.f23321b.equals(hVar.f23321b)) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public URL mo23368h() {
        return m30864g();
    }

    public int hashCode() {
        if (this.f23327h == 0) {
            int hashCode = mo23366c().hashCode();
            this.f23327h = hashCode;
            this.f23327h = (hashCode * 31) + this.f23321b.hashCode();
        }
        return this.f23327h;
    }

    public String toString() {
        return mo23366c();
    }

    public C8175h(String str) {
        this(str, C8176i.f23329b);
    }

    public C8175h(URL url, C8176i iVar) {
        this.f23322c = (URL) C6223k.m24730d(url);
        this.f23323d = null;
        this.f23321b = (C8176i) C6223k.m24730d(iVar);
    }

    public C8175h(String str, C8176i iVar) {
        this.f23322c = null;
        this.f23323d = C6223k.m24728b(str);
        this.f23321b = (C8176i) C6223k.m24730d(iVar);
    }
}
