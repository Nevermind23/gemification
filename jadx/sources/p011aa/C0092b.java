package p011aa;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import com.google.firebase.C5270e;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: aa.b */
public class C0092b {

    /* renamed from: c */
    private static final String[] f916c = {"*", "FCM", "GCM", ""};

    /* renamed from: a */
    private final SharedPreferences f917a;

    /* renamed from: b */
    private final String f918b;

    public C0092b(C5270e eVar) {
        this.f917a = eVar.mo17481j().getSharedPreferences("com.google.android.gms.appid", 0);
        this.f918b = m250b(eVar);
    }

    /* renamed from: a */
    private String m249a(String str, String str2) {
        return "|T|" + str + "|" + str2;
    }

    /* renamed from: b */
    private static String m250b(C5270e eVar) {
        String d = eVar.mo17483n().mo17518d();
        if (d != null) {
            return d;
        }
        String c = eVar.mo17483n().mo17517c();
        if (!c.startsWith("1:") && !c.startsWith("2:")) {
            return c;
        }
        String[] split = c.split(":");
        if (split.length != 4) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    /* renamed from: c */
    private static String m251c(PublicKey publicKey) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            digest[0] = (byte) (((digest[0] & 15) + 112) & C11051p3.f31759c);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    /* renamed from: d */
    private String m252d(String str) {
        try {
            return new JSONObject(str).getString("token");
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: e */
    private PublicKey m253e(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e) {
            Log.w("ContentValues", "Invalid key stored " + e);
            return null;
        }
    }

    /* renamed from: g */
    private String m254g() {
        String string;
        synchronized (this.f917a) {
            string = this.f917a.getString("|S|id", (String) null);
        }
        return string;
    }

    /* renamed from: h */
    private String m255h() {
        synchronized (this.f917a) {
            String string = this.f917a.getString("|S||P|", (String) null);
            if (string == null) {
                return null;
            }
            PublicKey e = m253e(string);
            if (e == null) {
                return null;
            }
            String c = m251c(e);
            return c;
        }
    }

    /* renamed from: f */
    public String mo149f() {
        synchronized (this.f917a) {
            String g = m254g();
            if (g != null) {
                return g;
            }
            String h = m255h();
            return h;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002d, code lost:
        return r4;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo150i() {
        /*
            r7 = this;
            android.content.SharedPreferences r0 = r7.f917a
            monitor-enter(r0)
            java.lang.String[] r1 = f916c     // Catch:{ all -> 0x0033 }
            int r2 = r1.length     // Catch:{ all -> 0x0033 }
            r3 = 0
        L_0x0007:
            r4 = 0
            if (r3 >= r2) goto L_0x0031
            r5 = r1[r3]     // Catch:{ all -> 0x0033 }
            java.lang.String r6 = r7.f918b     // Catch:{ all -> 0x0033 }
            java.lang.String r5 = r7.m249a(r6, r5)     // Catch:{ all -> 0x0033 }
            android.content.SharedPreferences r6 = r7.f917a     // Catch:{ all -> 0x0033 }
            java.lang.String r4 = r6.getString(r5, r4)     // Catch:{ all -> 0x0033 }
            if (r4 == 0) goto L_0x002e
            boolean r5 = r4.isEmpty()     // Catch:{ all -> 0x0033 }
            if (r5 != 0) goto L_0x002e
            java.lang.String r1 = "{"
            boolean r1 = r4.startsWith(r1)     // Catch:{ all -> 0x0033 }
            if (r1 == 0) goto L_0x002c
            java.lang.String r4 = r7.m252d(r4)     // Catch:{ all -> 0x0033 }
        L_0x002c:
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            return r4
        L_0x002e:
            int r3 = r3 + 1
            goto L_0x0007
        L_0x0031:
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            return r4
        L_0x0033:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p011aa.C0092b.mo150i():java.lang.String");
    }
}
