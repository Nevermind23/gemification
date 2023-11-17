package p585re;

import com.threatmetrix.TrustDefender.C11907h;
import com.threatmetrix.TrustDefender.C11921k0;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: re.s */
public class C17602s extends HashMap {

    /* renamed from: f */
    private static final String f49311f = C11907h.m43615j(C17602s.class);

    /* renamed from: d */
    private int f49312d = 0;

    /* renamed from: e */
    private final HashMap f49313e = new HashMap();

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        r2.addSuppressed(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001f, code lost:
        r0 = move-exception;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static byte[] m61220b(java.lang.String r2) {
        /*
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            int r1 = r2.length()
            r0.<init>(r1)
            java.util.zip.GZIPOutputStream r1 = new java.util.zip.GZIPOutputStream
            r1.<init>(r0)
            byte[] r2 = r2.getBytes()     // Catch:{ all -> 0x001d }
            r1.write(r2)     // Catch:{ all -> 0x001d }
            r1.close()
            byte[] r2 = r0.toByteArray()
            return r2
        L_0x001d:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x001f }
        L_0x001f:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0024 }
            goto L_0x0028
        L_0x0024:
            r1 = move-exception
            r2.addSuppressed(r1)
        L_0x0028:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p585re.C17602s.m61220b(java.lang.String):byte[]");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        if (com.threatmetrix.TrustDefender.C11921k0.m43732o(r2) != false) goto L_0x0015;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p585re.C17602s mo45182a(java.lang.String r1, java.lang.String r2, boolean r3) {
        /*
            r0 = this;
            if (r3 == 0) goto L_0x000f
            boolean r3 = com.threatmetrix.TrustDefender.C11921k0.m43732o(r2)
            if (r3 == 0) goto L_0x000f
            java.util.Locale r3 = java.util.Locale.US
            java.lang.String r2 = r2.toLowerCase(r3)
            goto L_0x0015
        L_0x000f:
            boolean r3 = com.threatmetrix.TrustDefender.C11921k0.m43732o(r2)
            if (r3 == 0) goto L_0x0018
        L_0x0015:
            r0.put(r1, r2)
        L_0x0018:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p585re.C17602s.mo45182a(java.lang.String, java.lang.String, boolean):re.s");
    }

    /* renamed from: c */
    public C17602s mo45183c(String str, String str2) {
        mo45182a(str, str2, false);
        return this;
    }

    /* renamed from: d */
    public void mo45184d(int i) {
        this.f49312d = i;
    }

    /* renamed from: e */
    public Integer mo45185e(String str) {
        return (Integer) this.f49313e.get(str);
    }

    /* renamed from: f */
    public C17602s mo45186f(String str, String str2, Integer num) {
        this.f49313e.put(str, num);
        mo45182a(str, str2, false);
        return this;
    }

    /* renamed from: h */
    public byte[] mo45187h() {
        byte[] bArr;
        String m = mo45189m();
        try {
            bArr = m61220b(m);
        } catch (IOException e) {
            C11907h.m43619n(f49311f, "Cannot compress!", e);
            bArr = null;
        }
        return bArr == null ? m.getBytes() : bArr;
    }

    /* renamed from: l */
    public C17602s mo45188l(Map map) {
        if (map instanceof C17602s) {
            for (Map.Entry entry : map.entrySet()) {
                Integer e = ((C17602s) map).mo45185e((String) entry.getKey());
                if (e != null) {
                    mo45186f((String) entry.getKey(), (String) entry.getValue(), e);
                } else {
                    mo45183c((String) entry.getKey(), (String) entry.getValue());
                }
            }
        } else {
            putAll(map);
        }
        return this;
    }

    /* renamed from: m */
    public String mo45189m() {
        int i;
        StringBuilder sb = new StringBuilder();
        for (String str : keySet()) {
            String str2 = (String) get(str);
            if (str2 != null && !str2.isEmpty()) {
                if (sb.length() > 0) {
                    sb.append("&");
                }
                sb.append(str);
                Integer num = (Integer) this.f49313e.get(str);
                if (!(num == null || num.intValue() == -1 || str2.length() <= num.intValue())) {
                    str2 = str2.substring(0, num.intValue());
                }
                if (num == null && this.f49312d != 0 && str2.length() > (i = this.f49312d)) {
                    str2 = str2.substring(0, i);
                }
                sb.append("=");
                sb.append(C11921k0.m43731n(str2));
            }
        }
        return sb.toString();
    }
}
