package androidx.core.provider;

import android.util.Base64;
import androidx.core.util.C1008h;
import java.util.List;

/* renamed from: androidx.core.provider.e */
public final class C0946e {

    /* renamed from: a */
    private final String f3564a;

    /* renamed from: b */
    private final String f3565b;

    /* renamed from: c */
    private final String f3566c;

    /* renamed from: d */
    private final List f3567d;

    /* renamed from: e */
    private final int f3568e = 0;

    /* renamed from: f */
    private final String f3569f;

    public C0946e(String str, String str2, String str3, List list) {
        this.f3564a = (String) C1008h.m3530g(str);
        this.f3565b = (String) C1008h.m3530g(str2);
        this.f3566c = (String) C1008h.m3530g(str3);
        this.f3567d = (List) C1008h.m3530g(list);
        this.f3569f = m3401a(str, str2, str3);
    }

    /* renamed from: a */
    private String m3401a(String str, String str2, String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    /* renamed from: b */
    public List mo3386b() {
        return this.f3567d;
    }

    /* renamed from: c */
    public int mo3387c() {
        return this.f3568e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public String mo3388d() {
        return this.f3569f;
    }

    /* renamed from: e */
    public String mo3389e() {
        return this.f3564a;
    }

    /* renamed from: f */
    public String mo3390f() {
        return this.f3565b;
    }

    /* renamed from: g */
    public String mo3391g() {
        return this.f3566c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f3564a + ", mProviderPackage: " + this.f3565b + ", mQuery: " + this.f3566c + ", mCertificates:");
        for (int i = 0; i < this.f3567d.size(); i++) {
            sb.append(" [");
            List list = (List) this.f3567d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f3568e);
        return sb.toString();
    }
}
