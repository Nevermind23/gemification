package com.threatmetrix.TrustDefender;

import com.threatmetrix.TrustDefender.C11965r;
import com.threatmetrix.TrustDefender.C11969r1;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import p585re.C17596m;
import p585re.C17603t;
import p585re.C17604u;

/* renamed from: com.threatmetrix.TrustDefender.u0 */
public class C11996u0 {

    /* renamed from: e */
    private static volatile C11996u0 f35306e;

    /* renamed from: f */
    private static final String f35307f = C11907h.m43615j(C11996u0.class);

    /* renamed from: g */
    private static final Lock f35308g = new ReentrantLock();

    /* renamed from: a */
    private final NativeGathererHelper f35309a = new NativeGathererHelper();

    /* renamed from: b */
    public boolean f35310b = false;

    /* renamed from: c */
    private final Lock f35311c = new ReentrantLock();

    /* renamed from: d */
    private boolean f35312d = false;

    /* renamed from: com.threatmetrix.TrustDefender.u0$a */
    public class C11997a implements FilenameFilter {

        /* renamed from: a */
        public final /* synthetic */ String f35313a;

        public C11997a(String str) {
            this.f35313a = str;
        }

        public boolean accept(File file, String str) {
            return str.contains(this.f35313a);
        }
    }

    private C11996u0() {
    }

    /* renamed from: F */
    public static C11965r.C11967b[] m44035F() {
        try {
            if (m44036s().mo32072e()) {
                return (C11965r.C11967b[]) m44036s().mo32083p().getAddresses(C11965r.C11967b.class);
            }
            return null;
        } catch (Throwable th) {
            C11907h.m43619n(f35307f, "Native code:", th);
            return null;
        }
    }

    /* renamed from: s */
    public static C11996u0 m44036s() {
        if (f35306e == null) {
            try {
                Lock lock = f35308g;
                lock.lock();
                if (f35306e == null) {
                    f35306e = new C11996u0();
                }
                lock.unlock();
            } catch (Throwable th) {
                f35308g.unlock();
                throw th;
            }
        }
        return f35306e;
    }

    /* renamed from: A */
    public boolean mo32061A() {
        return this.f35312d;
    }

    /* renamed from: B */
    public int mo32062B() {
        try {
            if (this.f35310b) {
                return this.f35309a.getCpuCores();
            }
            return 0;
        } catch (Throwable th) {
            C11907h.m43619n(f35307f, "Native code:", th);
            return 0;
        }
    }

    /* renamed from: C */
    public C17596m mo32063C() {
        int selinuxMode;
        C17596m mVar = null;
        try {
            if (this.f35310b && ((selinuxMode = this.f35309a.getSelinuxMode()) >= 0 || selinuxMode <= 4)) {
                mVar = C17596m.values()[selinuxMode];
            }
        } catch (Throwable th) {
            C11907h.m43619n(f35307f, "Native code:", th);
        }
        if (!Thread.interrupted()) {
            return mVar;
        }
        C11907h.m43607b(f35307f, "Thread interrupt detected, throwing");
        throw new InterruptedException();
    }

    /* renamed from: D */
    public String mo32064D(byte[] bArr) {
        try {
            if (!this.f35310b || bArr == null) {
                return null;
            }
            return this.f35309a.sha1HexEncode(bArr);
        } catch (Throwable th) {
            C11907h.m43619n(f35307f, "Native code:", th);
            return null;
        }
    }

    /* renamed from: E */
    public String mo32065E(String str, C17604u uVar) {
        String str2 = null;
        try {
            if (this.f35310b && C11921k0.m43732o(str)) {
                str2 = this.f35309a.hashFile(str, uVar.f49318d);
            }
        } catch (Throwable th) {
            C11907h.m43619n(f35307f, "Native code:", th);
        }
        if (!Thread.interrupted()) {
            return str2;
        }
        C11907h.m43607b(f35307f, "Thread interrupt detected, throwing");
        throw new InterruptedException();
    }

    /* renamed from: G */
    public long mo32066G(C17603t tVar, String str, String str2) {
        try {
            if (!this.f35310b || str2 == null) {
                return -1;
            }
            return this.f35309a.getLongConfig(tVar.f49314a, str, str2);
        } catch (Throwable th) {
            C11907h.m43619n(f35307f, "Native code:", th);
            return -1;
        }
    }

    /* renamed from: H */
    public int mo32067H(C17603t tVar, String str, String str2, int i) {
        int i2 = -1;
        try {
            if (this.f35310b && str2 != null) {
                i2 = this.f35309a.setIntConfig(tVar.f49314a, str, str2, i);
            }
        } catch (Throwable th) {
            C11907h.m43619n(f35307f, "Native code:", th);
        }
        if (!Thread.interrupted()) {
            return i2;
        }
        C11907h.m43607b(f35307f, "Thread interrupt detected, throwing");
        throw new InterruptedException();
    }

    /* renamed from: a */
    public void mo32068a(int i) {
        try {
            if (this.f35310b) {
                this.f35309a.setInfoLogging(i);
            }
        } catch (Throwable th) {
            C11907h.m43619n(f35307f, "Native code:", th);
        }
    }

    /* renamed from: b */
    public int mo32069b(C17603t tVar, String str, String str2) {
        try {
            if (!this.f35310b || str2 == null) {
                return -1;
            }
            return this.f35309a.getIntConfig(tVar.f49314a, str, str2);
        } catch (Throwable th) {
            C11907h.m43619n(f35307f, "Native code:", th);
            return -1;
        }
    }

    /* renamed from: c */
    public String mo32070c(String str) {
        try {
            return this.f35310b ? this.f35309a.getTextSectionHash(str) : "";
        } catch (Throwable th) {
            C11907h.m43619n(f35307f, "Native code:", th);
            return "";
        }
    }

    /* renamed from: d */
    public String mo32071d(String str) {
        try {
            if (this.f35310b) {
                return this.f35309a.validatePackage(str);
            }
            return null;
        } catch (Throwable th) {
            C11907h.m43619n(f35307f, "Native code:", th);
            return null;
        }
    }

    /* renamed from: e */
    public boolean mo32072e() {
        return this.f35310b;
    }

    /* renamed from: f */
    public String mo32073f(C17603t tVar) {
        try {
            if (!this.f35310b || C11969r1.C11983n.C11984a.f35247c >= C11969r1.C11983n.C11985b.f35270v) {
                return null;
            }
            return this.f35309a.getConnections(tVar.f49314a);
        } catch (Throwable th) {
            C11907h.m43619n(f35307f, "Native code:", th);
            return null;
        }
    }

    /* renamed from: g */
    public String mo32074g(int i) {
        try {
            if (!this.f35310b || i <= 0) {
                return null;
            }
            return this.f35309a.getRandomString(i);
        } catch (Throwable th) {
            C11907h.m43619n(f35307f, "Native code:", th);
            return null;
        }
    }

    /* renamed from: h */
    public String mo32075h(byte[] bArr) {
        try {
            if (!this.f35310b || bArr == null || bArr.length <= 0) {
                return null;
            }
            return this.f35309a.sha1Base32Encode(bArr);
        } catch (Throwable th) {
            C11907h.m43619n(f35307f, "Native code:", th);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001a  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0017 A[RETURN, SYNTHETIC] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo32076i(java.lang.String r4) {
        /*
            r3 = this;
            r0 = -1
            boolean r1 = r3.f35310b     // Catch:{ all -> 0x000c }
            if (r1 == 0) goto L_0x0014
            com.threatmetrix.TrustDefender.NativeGathererHelper r1 = r3.f35309a     // Catch:{ all -> 0x000c }
            int r4 = r1.jniDetectedDebugStatus(r4)     // Catch:{ all -> 0x000c }
            goto L_0x0015
        L_0x000c:
            r4 = move-exception
            java.lang.String r1 = f35307f
            java.lang.String r2 = "Native code:"
            com.threatmetrix.TrustDefender.C11907h.m43619n(r1, r2, r4)
        L_0x0014:
            r4 = r0
        L_0x0015:
            if (r0 != r4) goto L_0x001a
            java.lang.String r4 = ""
            goto L_0x0023
        L_0x001a:
            if (r4 <= 0) goto L_0x001e
            r4 = 1
            goto L_0x001f
        L_0x001e:
            r4 = 0
        L_0x001f:
            java.lang.String r4 = java.lang.String.valueOf(r4)
        L_0x0023:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.threatmetrix.TrustDefender.C11996u0.mo32076i(java.lang.String):java.lang.String");
    }

    /* renamed from: j */
    public List mo32077j(String str) {
        String[] fontList;
        List list = null;
        try {
            if (!(!this.f35310b || str == null || (fontList = this.f35309a.getFontList(str)) == null)) {
                list = Arrays.asList(fontList);
            }
        } catch (Throwable th) {
            C11907h.m43619n(f35307f, "Native code:", th);
        }
        if (!Thread.interrupted()) {
            return list;
        }
        C11907h.m43607b(f35307f, "Thread interrupt detected, throwing");
        throw new InterruptedException();
    }

    /* renamed from: k */
    public String mo32078k(C17603t tVar, String str, String str2) {
        try {
            if (!this.f35310b || str2 == null) {
                return null;
            }
            return this.f35309a.getStringConfig(tVar.f49314a, str, str2);
        } catch (Throwable th) {
            C11907h.m43619n(f35307f, "Native code:", th);
            return null;
        }
    }

    /* renamed from: l */
    public String mo32079l(byte[] bArr) {
        try {
            if (!this.f35310b || bArr == null) {
                return null;
            }
            return this.f35309a.sha256HexEncode(bArr);
        } catch (Throwable th) {
            C11907h.m43619n(f35307f, "Native code:", th);
            return null;
        }
    }

    /* renamed from: m */
    public boolean mo32080m(C17603t tVar, String str, boolean z, boolean z2) {
        String[] list;
        String absolutePath = tVar.f49314a.getFilesDir().getAbsolutePath();
        String a = new C11969r1.C11977h(tVar).mo32042a();
        if (!(mo32089w(absolutePath, str, z, z2) || (list = new File(a).list(new C11997a(str))) == null || list.length == 0)) {
            this.f35312d = true;
        }
        return this.f35310b;
    }

    /* renamed from: n */
    public String mo32081n(String str, String str2) {
        try {
            if (!this.f35310b || !C11921k0.m43732o(str2) || !C11921k0.m43732o(str)) {
                return null;
            }
            return this.f35309a.xor(str, str2);
        } catch (Throwable th) {
            C11907h.m43619n(f35307f, "Native code:", th);
            return null;
        }
    }

    /* renamed from: o */
    public long mo32082o(String str) {
        try {
            if (this.f35310b) {
                return this.f35309a.getAppTime(str);
            }
            return 0;
        } catch (Throwable th) {
            C11907h.m43619n(f35307f, "Native code:", th);
            return 0;
        }
    }

    /* renamed from: p */
    public NativeGathererHelper mo32083p() {
        return this.f35309a;
    }

    /* renamed from: q */
    public int mo32084q(C17603t tVar, String str, String str2, long j) {
        int i = -1;
        try {
            if (this.f35310b && str2 != null) {
                i = this.f35309a.setLongConfig(tVar.f49314a, str, str2, j);
            }
        } catch (Throwable th) {
            C11907h.m43619n(f35307f, "Native code:", th);
        }
        if (!Thread.interrupted()) {
            return i;
        }
        C11907h.m43607b(f35307f, "Thread interrupt detected, throwing");
        throw new InterruptedException();
    }

    /* renamed from: r */
    public String mo32085r(String str) {
        try {
            if (!this.f35310b || str == null) {
                return null;
            }
            return this.f35309a.md5(str);
        } catch (Throwable th) {
            C11907h.m43619n(f35307f, "Native code:", th);
            return null;
        }
    }

    /* renamed from: t */
    public long mo32086t(int i) {
        try {
            if (this.f35310b) {
                return this.f35309a.getTamperCode(i);
            }
            return 0;
        } catch (Throwable th) {
            C11907h.m43619n(f35307f, "Native code:", th);
            return 0;
        }
    }

    /* renamed from: u */
    public String mo32087u(String str) {
        try {
            if (!this.f35310b || str == null) {
                return null;
            }
            return this.f35309a.urlEncode(str);
        } catch (Throwable th) {
            C11907h.m43619n(f35307f, "Native code:", th);
            return null;
        }
    }

    /* renamed from: v */
    public String[] mo32088v(String[] strArr) {
        String[] strArr2 = null;
        try {
            C11907h.m43607b(f35307f, this.f35310b ? " available " : "not available ");
            if (this.f35310b && strArr != null) {
                strArr2 = this.f35309a.checkURLs(strArr);
            }
        } catch (Throwable th) {
            C11907h.m43619n(f35307f, "Native code:", th);
        }
        if (!Thread.interrupted()) {
            return strArr2;
        }
        C11907h.m43607b(f35307f, "Thread interrupt detected, throwing");
        throw new InterruptedException();
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x001f */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo32089w(java.lang.String r3, java.lang.String r4, boolean r5, boolean r6) {
        /*
            r2 = this;
            boolean r0 = r2.f35310b
            if (r0 == 0) goto L_0x0006
            r3 = 1
            return r3
        L_0x0006:
            java.util.concurrent.locks.Lock r0 = r2.f35311c     // Catch:{ all -> 0x0033 }
            r0.lock()     // Catch:{ all -> 0x0033 }
            boolean r0 = r2.f35310b     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x0015
            java.util.concurrent.locks.Lock r3 = r2.f35311c
            r3.unlock()
            return r0
        L_0x0015:
            r0 = 0
            com.threatmetrix.TrustDefender.NativeGathererHelper r1 = r2.f35309a     // Catch:{ UnsatisfiedLinkError -> 0x0022, all -> 0x001f }
            boolean r3 = r1.bf0066f0066f0066(r3, r4, r5, r6)     // Catch:{ UnsatisfiedLinkError -> 0x0022, all -> 0x001f }
            r2.f35310b = r3     // Catch:{ UnsatisfiedLinkError -> 0x0022, all -> 0x001f }
            goto L_0x002b
        L_0x001f:
            r2.f35310b = r0     // Catch:{ all -> 0x0033 }
            goto L_0x002b
        L_0x0022:
            r3 = move-exception
            java.lang.String r4 = f35307f     // Catch:{ all -> 0x0033 }
            java.lang.String r5 = "Native code:"
            com.threatmetrix.TrustDefender.C11907h.C11908a.m43629g(r4, r5, r3)     // Catch:{ all -> 0x0033 }
            goto L_0x001f
        L_0x002b:
            java.util.concurrent.locks.Lock r3 = r2.f35311c
            r3.unlock()
            boolean r3 = r2.f35310b
            return r3
        L_0x0033:
            r3 = move-exception
            java.util.concurrent.locks.Lock r4 = r2.f35311c
            r4.unlock()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.threatmetrix.TrustDefender.C11996u0.mo32089w(java.lang.String, java.lang.String, boolean, boolean):boolean");
    }

    /* renamed from: x */
    public String mo32090x() {
        try {
            if (this.f35310b) {
                return this.f35309a.getBinaryArch();
            }
            return null;
        } catch (Throwable th) {
            C11907h.m43619n(f35307f, "Native code:", th);
            return null;
        }
    }

    /* renamed from: y */
    public String[] mo32091y() {
        String[] strArr = null;
        try {
            if (this.f35310b && C11969r1.C11983n.C11984a.f35247c < C11969r1.C11983n.C11985b.f35270v) {
                strArr = this.f35309a.getNetworkInfo();
            }
        } catch (Throwable th) {
            C11907h.m43619n(f35307f, "Native code:", th);
        }
        if (!Thread.interrupted()) {
            return strArr;
        }
        C11907h.m43607b(f35307f, "Thread interrupt detected, throwing");
        throw new InterruptedException();
    }

    /* renamed from: z */
    public int mo32092z(C17603t tVar, String str, String str2, String str3) {
        int i = -1;
        try {
            if (!(!this.f35310b || str2 == null || str3 == null)) {
                i = this.f35309a.setStringConfig(tVar.f49314a, str, str2, str3);
            }
        } catch (Throwable th) {
            C11907h.m43619n(f35307f, "Native code:", th);
        }
        if (!Thread.interrupted()) {
            return i;
        }
        C11907h.m43607b(f35307f, "Thread interrupt detected, throwing");
        throw new InterruptedException();
    }
}
