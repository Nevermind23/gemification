package p613te;

import com.threatmetrix.TrustDefender.C11893e;
import java.io.IOException;
import java.io.InputStream;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.security.cert.CRLException;
import java.security.cert.CertPathBuilderException;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertStoreException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLPeerUnverifiedException;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogInputLayout;

/* renamed from: te.d */
public class C17946d {

    /* renamed from: i */
    private static final String f51086i = C17952j.m61850c(C17946d.class);

    /* renamed from: j */
    private static final boolean f51087j = false;

    /* renamed from: k */
    public static int f51088k = m61819s();

    /* renamed from: l */
    public static int f51089l = 58;

    /* renamed from: m */
    public static int f51090m = 1;

    /* renamed from: n */
    public static int f51091n = 2;

    /* renamed from: a */
    private final C11893e.C11896c f51092a = new C11893e.C11896c(-2);

    /* renamed from: b */
    private final int f51093b;

    /* renamed from: c */
    private final C17955l f51094c;

    /* renamed from: d */
    private final Map f51095d = new HashMap();

    /* renamed from: e */
    private byte[][] f51096e;

    /* renamed from: f */
    private byte[][] f51097f;

    /* renamed from: g */
    private URL f51098g;

    /* renamed from: h */
    private HttpsURLConnection f51099h;

    static {
        int i = f51088k;
        if ((i * (f51090m + i)) % m61814i() != 0) {
        }
    }

    public C17946d(byte[][] bArr, byte[][] bArr2, int i) {
        this.f51096e = bArr;
        this.f51097f = bArr2;
        this.f51093b = i;
        C17955l lVar = null;
        this.f51098g = null;
        this.f51099h = null;
        this.f51094c = f51087j ? new C17955l() : lVar;
    }

    /* renamed from: a */
    private int m61809a(Certificate certificate) {
        byte[] c = C17951i.m61845c(certificate.getPublicKey().getEncoded());
        if (c != null) {
            int i = f51088k;
            if ((i * (m61813h() + i)) % f51091n != 0) {
                f51088k = m61819s();
                f51089l = 5;
            }
            if (m61812g(this.f51097f, c)) {
                return BogInputLayout.INPUT_NORMAL_STATE;
            }
        }
        String str = f51086i;
        StringBuilder sb = new StringBuilder();
        sb.append(C17931a.m61768c("*PYEQOK\bY_MXVQ\u000f[Vk\u0013\\Vi_$\u0019bjoq\u001ehs!wvmsm'", '0', 1));
        sb.append(c == null ? C17931a.m61772g(".4*)", 242, 178, 1) : C17951i.m61844b(c));
        C17952j.m61853f(str, sb.toString());
        return -6;
    }

    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v23 */
    /* JADX WARNING: type inference failed for: r6v26 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01b0 A[Catch:{ SSLPeerUnverifiedException -> 0x0221, IOException -> 0x0213, SecurityException -> 0x01e9, IllegalArgumentException -> 0x0198, all -> 0x0194, all -> 0x023b }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01cf A[Catch:{ SSLPeerUnverifiedException -> 0x0221, IOException -> 0x0213, SecurityException -> 0x01e9, IllegalArgumentException -> 0x0198, all -> 0x0194, all -> 0x023b }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01e5 A[Catch:{ SSLPeerUnverifiedException -> 0x0221, IOException -> 0x0213, SecurityException -> 0x01e9, IllegalArgumentException -> 0x0198, all -> 0x0194, all -> 0x023b }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01e8 A[Catch:{ SSLPeerUnverifiedException -> 0x0221, IOException -> 0x0213, SecurityException -> 0x01e9, IllegalArgumentException -> 0x0198, all -> 0x0194, all -> 0x023b }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x020e A[Catch:{ SSLPeerUnverifiedException -> 0x0221, IOException -> 0x0213, SecurityException -> 0x01e9, IllegalArgumentException -> 0x0198, all -> 0x0194, all -> 0x023b }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0211 A[Catch:{ SSLPeerUnverifiedException -> 0x0221, IOException -> 0x0213, SecurityException -> 0x01e9, IllegalArgumentException -> 0x0198, all -> 0x0194, all -> 0x023b }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0217 A[Catch:{ SSLPeerUnverifiedException -> 0x0221, IOException -> 0x0213, SecurityException -> 0x01e9, IllegalArgumentException -> 0x0198, all -> 0x0194, all -> 0x023b }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x021a A[Catch:{ SSLPeerUnverifiedException -> 0x0221, IOException -> 0x0213, SecurityException -> 0x01e9, IllegalArgumentException -> 0x0198, all -> 0x0194, all -> 0x023b }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0236  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x023e  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private javax.net.ssl.HttpsURLConnection m61810c(java.lang.String r17, byte[] r18, boolean r19) {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = -1
            r5 = 2
            r7 = 0
            boolean r0 = p613te.C17951i.m61843a(r17)     // Catch:{ MalformedURLException -> 0x0280, URISyntaxException -> 0x027e, SecurityException -> 0x0268 }
            if (r0 == 0) goto L_0x0037
            java.lang.String r0 = "\u0016! \u001b"
            r8 = 209(0xd1, float:2.93E-43)
            java.lang.String r0 = p613te.C17931a.m61768c(r0, r8, r5)     // Catch:{ MalformedURLException -> 0x0280, URISyntaxException -> 0x027e, SecurityException -> 0x0268 }
            boolean r0 = r2.startsWith(r0)     // Catch:{ MalformedURLException -> 0x0280, URISyntaxException -> 0x027e, SecurityException -> 0x0268 }
            if (r0 != 0) goto L_0x0037
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ MalformedURLException -> 0x0280, URISyntaxException -> 0x027e, SecurityException -> 0x0268 }
            r0.<init>()     // Catch:{ MalformedURLException -> 0x0280, URISyntaxException -> 0x027e, SecurityException -> 0x0268 }
            java.lang.String r8 = "\u001b()&*qgh"
            r9 = 87
            r10 = 37
            java.lang.String r8 = p613te.C17931a.m61772g(r8, r9, r10, r7)     // Catch:{ MalformedURLException -> 0x0280, URISyntaxException -> 0x027e, SecurityException -> 0x0268 }
            r0.append(r8)     // Catch:{ MalformedURLException -> 0x0280, URISyntaxException -> 0x027e, SecurityException -> 0x0268 }
            r0.append(r2)     // Catch:{ MalformedURLException -> 0x0280, URISyntaxException -> 0x027e, SecurityException -> 0x0268 }
            java.lang.String r0 = r0.toString()     // Catch:{ MalformedURLException -> 0x0280, URISyntaxException -> 0x027e, SecurityException -> 0x0268 }
            goto L_0x0038
        L_0x0037:
            r0 = r2
        L_0x0038:
            java.net.URL r8 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0280, URISyntaxException -> 0x027e, SecurityException -> 0x0268 }
            r8.<init>(r0)     // Catch:{ MalformedURLException -> 0x0280, URISyntaxException -> 0x027e, SecurityException -> 0x0268 }
            java.net.ProxySelector r9 = java.net.ProxySelector.getDefault()     // Catch:{ MalformedURLException -> 0x0280, URISyntaxException -> 0x027e, SecurityException -> 0x0268 }
            r10 = 1
            if (r9 != 0) goto L_0x005c
            java.lang.String r0 = f51086i     // Catch:{ MalformedURLException -> 0x0280, URISyntaxException -> 0x027e, SecurityException -> 0x0268 }
            java.lang.String r9 = "j\u000b\u000b\u0005\u0018\u000e\u0015?\u000f\u0010\f\u0014\u00149\u0002\u000b6\u0004\n~"
            r11 = 89
            java.lang.String r9 = p613te.C17931a.m61768c(r9, r11, r5)     // Catch:{ MalformedURLException -> 0x0280, URISyntaxException -> 0x027e, SecurityException -> 0x0268 }
            p613te.C17952j.C17953a.m61860e(r0, r9)     // Catch:{ MalformedURLException -> 0x0280, URISyntaxException -> 0x027e, SecurityException -> 0x0268 }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ MalformedURLException -> 0x0280, URISyntaxException -> 0x027e, SecurityException -> 0x0268 }
            r0.<init>(r10)     // Catch:{ MalformedURLException -> 0x0280, URISyntaxException -> 0x027e, SecurityException -> 0x0268 }
            java.net.Proxy r9 = java.net.Proxy.NO_PROXY     // Catch:{ MalformedURLException -> 0x0280, URISyntaxException -> 0x027e, SecurityException -> 0x0268 }
            r0.add(r9)     // Catch:{ MalformedURLException -> 0x0280, URISyntaxException -> 0x027e, SecurityException -> 0x0268 }
            goto L_0x0065
        L_0x005c:
            java.net.URI r11 = new java.net.URI     // Catch:{ MalformedURLException -> 0x0280, URISyntaxException -> 0x027e, SecurityException -> 0x0268 }
            r11.<init>(r0)     // Catch:{ MalformedURLException -> 0x0280, URISyntaxException -> 0x027e, SecurityException -> 0x0268 }
            java.util.List r0 = r9.select(r11)     // Catch:{ MalformedURLException -> 0x0280, URISyntaxException -> 0x027e, SecurityException -> 0x0268 }
        L_0x0065:
            java.util.Iterator r4 = r0.iterator()
            r9 = 0
        L_0x006a:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0242
            java.lang.Object r0 = r4.next()
            r12 = r0
            java.net.Proxy r12 = (java.net.Proxy) r12
            java.net.URLConnection r0 = r8.openConnection(r12)     // Catch:{ SSLPeerUnverifiedException -> 0x0221, IOException -> 0x0213, SecurityException -> 0x01e9, IllegalArgumentException -> 0x0198, all -> 0x0194 }
            java.lang.Object r0 = com.google.firebase.perf.network.FirebasePerfUrlConnection.instrument(r0)     // Catch:{ SSLPeerUnverifiedException -> 0x0221, IOException -> 0x0213, SecurityException -> 0x01e9, IllegalArgumentException -> 0x0198, all -> 0x0194 }
            java.net.URLConnection r0 = (java.net.URLConnection) r0     // Catch:{ SSLPeerUnverifiedException -> 0x0221, IOException -> 0x0213, SecurityException -> 0x01e9, IllegalArgumentException -> 0x0198, all -> 0x0194 }
            boolean r14 = r0 instanceof javax.net.ssl.HttpsURLConnection     // Catch:{ SSLPeerUnverifiedException -> 0x0221, IOException -> 0x0213, SecurityException -> 0x01e9, IllegalArgumentException -> 0x0198, all -> 0x0194 }
            if (r14 != 0) goto L_0x00b9
            java.lang.String r14 = f51086i     // Catch:{ SSLPeerUnverifiedException -> 0x0221, IOException -> 0x0213, SecurityException -> 0x01e9, IllegalArgumentException -> 0x0198, all -> 0x0194 }
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ SSLPeerUnverifiedException -> 0x0221, IOException -> 0x0213, SecurityException -> 0x01e9, IllegalArgumentException -> 0x0198, all -> 0x0194 }
            r15.<init>()     // Catch:{ SSLPeerUnverifiedException -> 0x0221, IOException -> 0x0213, SecurityException -> 0x01e9, IllegalArgumentException -> 0x0198, all -> 0x0194 }
            java.lang.String r6 = "\\\u0001\bq{wq,nywvliymrp!txnb\u001c"
            r11 = 194(0xc2, float:2.72E-43)
            r13 = 168(0xa8, float:2.35E-43)
            java.lang.String r6 = p613te.C17931a.m61772g(r6, r11, r13, r5)     // Catch:{ SSLPeerUnverifiedException -> 0x0221, IOException -> 0x0213, SecurityException -> 0x01e9, IllegalArgumentException -> 0x0198, all -> 0x0194 }
            r15.append(r6)     // Catch:{ SSLPeerUnverifiedException -> 0x0221, IOException -> 0x0213, SecurityException -> 0x01e9, IllegalArgumentException -> 0x0198, all -> 0x0194 }
            java.lang.Class r0 = r0.getClass()     // Catch:{ SSLPeerUnverifiedException -> 0x0221, IOException -> 0x0213, SecurityException -> 0x01e9, IllegalArgumentException -> 0x0198, all -> 0x0194 }
            java.lang.String r0 = r0.getName()     // Catch:{ SSLPeerUnverifiedException -> 0x0221, IOException -> 0x0213, SecurityException -> 0x01e9, IllegalArgumentException -> 0x0198, all -> 0x0194 }
            r15.append(r0)     // Catch:{ SSLPeerUnverifiedException -> 0x0221, IOException -> 0x0213, SecurityException -> 0x01e9, IllegalArgumentException -> 0x0198, all -> 0x0194 }
            java.lang.String r0 = "r;8>>@2k4>v"
            r6 = 173(0xad, float:2.42E-43)
            r11 = 128(0x80, float:1.794E-43)
            java.lang.String r0 = p613te.C17931a.m61772g(r0, r6, r11, r10)     // Catch:{ SSLPeerUnverifiedException -> 0x0221, IOException -> 0x0213, SecurityException -> 0x01e9, IllegalArgumentException -> 0x0198, all -> 0x0194 }
            r15.append(r0)     // Catch:{ SSLPeerUnverifiedException -> 0x0221, IOException -> 0x0213, SecurityException -> 0x01e9, IllegalArgumentException -> 0x0198, all -> 0x0194 }
            java.lang.String r0 = r15.toString()     // Catch:{ SSLPeerUnverifiedException -> 0x0221, IOException -> 0x0213, SecurityException -> 0x01e9, IllegalArgumentException -> 0x0198, all -> 0x0194 }
            p613te.C17952j.C17953a.m61858c(r14, r0)     // Catch:{ SSLPeerUnverifiedException -> 0x0221, IOException -> 0x0213, SecurityException -> 0x01e9, IllegalArgumentException -> 0x0198, all -> 0x0194 }
            goto L_0x006a
        L_0x00b9:
            te.l r6 = r1.f51094c     // Catch:{ SSLPeerUnverifiedException -> 0x0221, IOException -> 0x0213, SecurityException -> 0x01e9, IllegalArgumentException -> 0x0198, all -> 0x0194 }
            if (r6 == 0) goto L_0x00c3
            r11 = r0
            javax.net.ssl.HttpsURLConnection r11 = (javax.net.ssl.HttpsURLConnection) r11     // Catch:{ SSLPeerUnverifiedException -> 0x0221, IOException -> 0x0213, SecurityException -> 0x01e9, IllegalArgumentException -> 0x0198, all -> 0x0194 }
            r11.setSSLSocketFactory(r6)     // Catch:{ SSLPeerUnverifiedException -> 0x0221, IOException -> 0x0213, SecurityException -> 0x01e9, IllegalArgumentException -> 0x0198, all -> 0x0194 }
        L_0x00c3:
            r6 = r0
            javax.net.ssl.HttpsURLConnection r6 = (javax.net.ssl.HttpsURLConnection) r6     // Catch:{ SSLPeerUnverifiedException -> 0x0221, IOException -> 0x0213, SecurityException -> 0x01e9, IllegalArgumentException -> 0x0198, all -> 0x0194 }
            int r0 = r1.f51093b     // Catch:{ SSLPeerUnverifiedException -> 0x0221, IOException -> 0x0213, SecurityException -> 0x01e9, IllegalArgumentException -> 0x0198, all -> 0x0194 }
            r6.setConnectTimeout(r0)     // Catch:{ SSLPeerUnverifiedException -> 0x0221, IOException -> 0x0213, SecurityException -> 0x01e9, IllegalArgumentException -> 0x0198, all -> 0x0194 }
            int r0 = r1.f51093b     // Catch:{ SSLPeerUnverifiedException -> 0x0221, IOException -> 0x0213, SecurityException -> 0x01e9, IllegalArgumentException -> 0x0198, all -> 0x0194 }
            r6.setReadTimeout(r0)     // Catch:{ SSLPeerUnverifiedException -> 0x0221, IOException -> 0x0213, SecurityException -> 0x01e9, IllegalArgumentException -> 0x0198, all -> 0x0194 }
            r6.setInstanceFollowRedirects(r10)     // Catch:{ SSLPeerUnverifiedException -> 0x0221, IOException -> 0x0213, SecurityException -> 0x01e9, IllegalArgumentException -> 0x0198, all -> 0x0194 }
            r6.setUseCaches(r7)     // Catch:{ SSLPeerUnverifiedException -> 0x0221, IOException -> 0x0213, SecurityException -> 0x01e9, IllegalArgumentException -> 0x0198, all -> 0x0194 }
            r6.setDoInput(r10)     // Catch:{ SSLPeerUnverifiedException -> 0x0221, IOException -> 0x0213, SecurityException -> 0x01e9, IllegalArgumentException -> 0x0198, all -> 0x0194 }
            java.util.Map r0 = r1.f51095d     // Catch:{ SSLPeerUnverifiedException -> 0x0221, IOException -> 0x0213, SecurityException -> 0x01e9, IllegalArgumentException -> 0x0198, all -> 0x0194 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ SSLPeerUnverifiedException -> 0x0221, IOException -> 0x0213, SecurityException -> 0x01e9, IllegalArgumentException -> 0x0198, all -> 0x0194 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ SSLPeerUnverifiedException -> 0x0221, IOException -> 0x0213, SecurityException -> 0x01e9, IllegalArgumentException -> 0x0198, all -> 0x0194 }
        L_0x00e3:
            boolean r11 = r0.hasNext()     // Catch:{ SSLPeerUnverifiedException -> 0x0221, IOException -> 0x0213, SecurityException -> 0x01e9, IllegalArgumentException -> 0x0198, all -> 0x0194 }
            if (r11 == 0) goto L_0x00ff
            java.lang.Object r11 = r0.next()     // Catch:{ SSLPeerUnverifiedException -> 0x0221, IOException -> 0x0213, SecurityException -> 0x01e9, IllegalArgumentException -> 0x0198, all -> 0x0194 }
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11     // Catch:{ SSLPeerUnverifiedException -> 0x0221, IOException -> 0x0213, SecurityException -> 0x01e9, IllegalArgumentException -> 0x0198, all -> 0x0194 }
            java.lang.Object r13 = r11.getKey()     // Catch:{ SSLPeerUnverifiedException -> 0x0221, IOException -> 0x0213, SecurityException -> 0x01e9, IllegalArgumentException -> 0x0198, all -> 0x0194 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ SSLPeerUnverifiedException -> 0x0221, IOException -> 0x0213, SecurityException -> 0x01e9, IllegalArgumentException -> 0x0198, all -> 0x0194 }
            java.lang.Object r11 = r11.getValue()     // Catch:{ SSLPeerUnverifiedException -> 0x0221, IOException -> 0x0213, SecurityException -> 0x01e9, IllegalArgumentException -> 0x0198, all -> 0x0194 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ SSLPeerUnverifiedException -> 0x0221, IOException -> 0x0213, SecurityException -> 0x01e9, IllegalArgumentException -> 0x0198, all -> 0x0194 }
            r6.setRequestProperty(r13, r11)     // Catch:{ SSLPeerUnverifiedException -> 0x0221, IOException -> 0x0213, SecurityException -> 0x01e9, IllegalArgumentException -> 0x0198, all -> 0x0194 }
            goto L_0x00e3
        L_0x00ff:
            if (r19 == 0) goto L_0x0138
            java.lang.String r0 = "CCHJ"
            r11 = 241(0xf1, float:3.38E-43)
            java.lang.String r0 = p613te.C17931a.m61768c(r0, r11, r7)     // Catch:{ SSLPeerUnverifiedException -> 0x0221, IOException -> 0x0213, SecurityException -> 0x01e9, IllegalArgumentException -> 0x0198, all -> 0x0194 }
            r6.setRequestMethod(r0)     // Catch:{ SSLPeerUnverifiedException -> 0x0221, IOException -> 0x0213, SecurityException -> 0x01e9, IllegalArgumentException -> 0x0198, all -> 0x0194 }
            r6.setDoOutput(r10)     // Catch:{ SSLPeerUnverifiedException -> 0x0221, IOException -> 0x0213, SecurityException -> 0x01e9, IllegalArgumentException -> 0x0198, all -> 0x0194 }
            if (r3 == 0) goto L_0x0148
            java.io.OutputStream r0 = r6.getOutputStream()     // Catch:{ SSLPeerUnverifiedException -> 0x0221, IOException -> 0x0213, SecurityException -> 0x01e9, IllegalArgumentException -> 0x0198, all -> 0x0194 }
            r0.write(r3)     // Catch:{ SSLPeerUnverifiedException -> 0x0221, IOException -> 0x0213, SecurityException -> 0x01e9, IllegalArgumentException -> 0x0198, all -> 0x0194 }
            r0.flush()     // Catch:{ SSLPeerUnverifiedException -> 0x0221, IOException -> 0x0213, SecurityException -> 0x01e9, IllegalArgumentException -> 0x0198, all -> 0x0194 }
            r0.close()     // Catch:{ SSLPeerUnverifiedException -> 0x0221, IOException -> 0x0213, SecurityException -> 0x01e9, IllegalArgumentException -> 0x0198, all -> 0x0194 }
            int r0 = m61819s()
            int r11 = f51090m
            int r11 = r11 + r0
            int r0 = r0 * r11
            int r11 = f51091n
            int r0 = r0 % r11
            if (r0 == 0) goto L_0x0148
            int r0 = m61819s()
            f51088k = r0
            int r0 = m61819s()
            f51089l = r0
            goto L_0x0148
        L_0x0138:
            java.lang.String r0 = "hes"
            r11 = 103(0x67, float:1.44E-43)
            r13 = 197(0xc5, float:2.76E-43)
            java.lang.String r0 = p613te.C17931a.m61772g(r0, r13, r11, r10)     // Catch:{ SSLPeerUnverifiedException -> 0x0221, IOException -> 0x0213, SecurityException -> 0x01e9, IllegalArgumentException -> 0x0198, all -> 0x0194 }
            r6.setRequestMethod(r0)     // Catch:{ SSLPeerUnverifiedException -> 0x0221, IOException -> 0x0213, SecurityException -> 0x01e9, IllegalArgumentException -> 0x0198, all -> 0x0194 }
            r6.setDoOutput(r7)     // Catch:{ SSLPeerUnverifiedException -> 0x0221, IOException -> 0x0213, SecurityException -> 0x01e9, IllegalArgumentException -> 0x0198, all -> 0x0194 }
        L_0x0148:
            r6.connect()     // Catch:{ SSLPeerUnverifiedException -> 0x0221, IOException -> 0x0213, SecurityException -> 0x01e9, IllegalArgumentException -> 0x0198, all -> 0x0194 }
            java.security.cert.Certificate[] r0 = r6.getServerCertificates()     // Catch:{ SSLPeerUnverifiedException -> 0x0191, IOException -> 0x018e, SecurityException -> 0x018c, IllegalArgumentException -> 0x018a }
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ SSLPeerUnverifiedException -> 0x0191, IOException -> 0x018e, SecurityException -> 0x018c, IllegalArgumentException -> 0x018a }
            int r11 = f51088k
            int r13 = f51090m
            int r13 = r13 + r11
            int r13 = r13 * r11
            int r11 = f51091n
            int r13 = r13 % r11
            int r11 = f51089l
            if (r13 == r11) goto L_0x016c
            int r11 = m61819s()
            f51088k = r11
            int r11 = m61819s()
            f51089l = r11
        L_0x016c:
            com.threatmetrix.TrustDefender.e$c r11 = r1.f51092a     // Catch:{ SSLPeerUnverifiedException -> 0x0191, IOException -> 0x018e, SecurityException -> 0x018c, IllegalArgumentException -> 0x018a }
            if (r0 == 0) goto L_0x0172
            r13 = r10
            goto L_0x0173
        L_0x0172:
            r13 = r7
        L_0x0173:
            int r0 = r1.m61815j(r13, r0)     // Catch:{ SSLPeerUnverifiedException -> 0x0191, IOException -> 0x018e, SecurityException -> 0x018c, IllegalArgumentException -> 0x018a }
            r11.mo31947b(r0)     // Catch:{ SSLPeerUnverifiedException -> 0x0191, IOException -> 0x018e, SecurityException -> 0x018c, IllegalArgumentException -> 0x018a }
            com.threatmetrix.TrustDefender.e$c r0 = r1.f51092a     // Catch:{ SSLPeerUnverifiedException -> 0x0191, IOException -> 0x018e, SecurityException -> 0x018c, IllegalArgumentException -> 0x018a }
            int r0 = r0.mo31946a()     // Catch:{ SSLPeerUnverifiedException -> 0x0191, IOException -> 0x018e, SecurityException -> 0x018c, IllegalArgumentException -> 0x018a }
            r11 = 200(0xc8, float:2.8E-43)
            if (r0 != r11) goto L_0x0185
            return r6
        L_0x0185:
            r6.disconnect()
            goto L_0x021c
        L_0x018a:
            r0 = move-exception
            goto L_0x019a
        L_0x018c:
            r0 = move-exception
            goto L_0x01eb
        L_0x018e:
            r0 = move-exception
            goto L_0x0215
        L_0x0191:
            r0 = move-exception
            goto L_0x0223
        L_0x0194:
            r0 = move-exception
            r6 = 0
            goto L_0x023c
        L_0x0198:
            r0 = move-exception
            r6 = 0
        L_0x019a:
            java.lang.String r11 = f51086i     // Catch:{ all -> 0x023b }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x023b }
            r13.<init>()     // Catch:{ all -> 0x023b }
            java.lang.String r14 = "Y\u0007\u0007\b~\u0011\u0007\u000e\u000e@\b\u0004\r\u0011\u001b\u0019\rbIs\u001a#\u000f\u001b\u0019\u0015Q#&$.0W"
            r15 = 172(0xac, float:2.41E-43)
            r10 = 23
            java.lang.String r10 = p613te.C17931a.m61772g(r14, r15, r10, r7)     // Catch:{ all -> 0x023b }
            r13.append(r10)     // Catch:{ all -> 0x023b }
            if (r12 == 0) goto L_0x01cf
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x023b }
            r10.<init>()     // Catch:{ all -> 0x023b }
            java.lang.String r14 = "^d\\R\u000e"
            r15 = 162(0xa2, float:2.27E-43)
            r5 = 197(0xc5, float:2.76E-43)
            r7 = 3
            java.lang.String r5 = p613te.C17931a.m61772g(r14, r15, r5, r7)     // Catch:{ all -> 0x023b }
            r10.append(r5)     // Catch:{ all -> 0x023b }
            java.lang.String r5 = r12.toString()     // Catch:{ all -> 0x023b }
            r10.append(r5)     // Catch:{ all -> 0x023b }
            java.lang.String r5 = r10.toString()     // Catch:{ all -> 0x023b }
            goto L_0x01d9
        L_0x01cf:
            java.lang.String r5 = "\u0011\u0014\u0012\u001c\u001eE\u0010\u001bH\u0018 \u0018\u0019["
            r7 = 165(0xa5, float:2.31E-43)
            r10 = 6
            r12 = 0
            java.lang.String r5 = p613te.C17931a.m61772g(r5, r7, r10, r12)     // Catch:{ all -> 0x023b }
        L_0x01d9:
            r13.append(r5)     // Catch:{ all -> 0x023b }
            java.lang.String r5 = r13.toString()     // Catch:{ all -> 0x023b }
            p613te.C17952j.C17953a.m61858c(r11, r5)     // Catch:{ all -> 0x023b }
            if (r9 != 0) goto L_0x01e6
            r9 = r0
        L_0x01e6:
            if (r6 == 0) goto L_0x021c
            goto L_0x0185
        L_0x01e9:
            r0 = move-exception
            r6 = 0
        L_0x01eb:
            java.lang.String r5 = f51086i     // Catch:{ all -> 0x023b }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x023b }
            r7.<init>()     // Catch:{ all -> 0x023b }
            java.lang.String r10 = "h\u0016\u0016\u0017\u000f\u000e \u0016\u001d\u001dO\u0017\u0013\u001c *(\u001cqX}**c2^(\"8(c5+952=>5<<nD@qHG:uK@BMzLOMWY\u000f"
            r11 = 164(0xa4, float:2.3E-43)
            r13 = 0
            java.lang.String r10 = p613te.C17931a.m61768c(r10, r11, r13)     // Catch:{ all -> 0x023b }
            r7.append(r10)     // Catch:{ all -> 0x023b }
            java.lang.String r10 = r12.toString()     // Catch:{ all -> 0x023b }
            r7.append(r10)     // Catch:{ all -> 0x023b }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x023b }
            p613te.C17952j.C17953a.m61858c(r5, r7)     // Catch:{ all -> 0x023b }
            if (r9 != 0) goto L_0x020f
            r9 = r0
        L_0x020f:
            if (r6 == 0) goto L_0x021c
            goto L_0x0185
        L_0x0213:
            r0 = move-exception
            r6 = 0
        L_0x0215:
            if (r9 != 0) goto L_0x0218
            r9 = r0
        L_0x0218:
            if (r6 == 0) goto L_0x021c
            goto L_0x0185
        L_0x021c:
            r5 = 2
            r7 = 0
            r10 = 1
            goto L_0x006a
        L_0x0221:
            r0 = move-exception
            r6 = 0
        L_0x0223:
            java.lang.String r2 = f51086i     // Catch:{ all -> 0x023b }
            java.lang.String r3 = "K_^j\u0017kcjXdZVXSQ"
            r4 = 171(0xab, float:2.4E-43)
            r5 = 3
            java.lang.String r3 = p613te.C17931a.m61768c(r3, r4, r5)     // Catch:{ all -> 0x023b }
            p613te.C17952j.m61848a(r2, r3, r0)     // Catch:{ all -> 0x023b }
            r1.m61816l(r0)     // Catch:{ all -> 0x023b }
            if (r6 == 0) goto L_0x0239
            r6.disconnect()
        L_0x0239:
            r2 = 0
            return r2
        L_0x023b:
            r0 = move-exception
        L_0x023c:
            if (r6 == 0) goto L_0x0241
            r6.disconnect()
        L_0x0241:
            throw r0
        L_0x0242:
            if (r9 == 0) goto L_0x0266
            java.lang.String r0 = f51086i
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r4 = 213(0xd5, float:2.98E-43)
            r5 = 187(0xbb, float:2.62E-43)
            java.lang.String r6 = "Vu\u0004\u0005\u0007\r9}\u000b\u000b\f\u0004\u0003\u0015A\u0017\u0013D\u0018\f\u0015\u0018\u001e\u0010K\u0015\u001d\"$P"
            r7 = 3
            java.lang.String r4 = p613te.C17931a.m61772g(r6, r4, r5, r7)
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            p613te.C17952j.m61848a(r0, r2, r9)
            r1.m61816l(r9)
        L_0x0266:
            r2 = 0
            return r2
        L_0x0268:
            r0 = move-exception
            java.lang.String r2 = f51086i
            java.lang.String r3 = "\u000f\"!42*6<c2'5)0/=k13=966r589<KL"
            r5 = 59
            r6 = 0
            java.lang.String r3 = p613te.C17931a.m61768c(r3, r5, r6)
            p613te.C17952j.m61848a(r2, r3, r0)
            com.threatmetrix.TrustDefender.e$c r0 = r1.f51092a
            r0.mo31947b(r4)
            r2 = 0
            return r2
        L_0x027e:
            r0 = move-exception
            goto L_0x0281
        L_0x0280:
            r0 = move-exception
        L_0x0281:
            java.lang.String r2 = f51086i
            java.lang.String r3 = "c\b\u000fx\u0003~x3gc\\"
            r5 = 101(0x65, float:1.42E-43)
            r6 = 2
            java.lang.String r3 = p613te.C17931a.m61768c(r3, r5, r6)
            p613te.C17952j.m61848a(r2, r3, r0)
            com.threatmetrix.TrustDefender.e$c r0 = r1.f51092a
            r0.mo31947b(r4)
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p613te.C17946d.m61810c(java.lang.String, byte[], boolean):javax.net.ssl.HttpsURLConnection");
    }

    /* renamed from: d */
    private int m61811d(Certificate certificate) {
        try {
            byte[] c = C17951i.m61845c(certificate.getEncoded());
            if (c != null && m61812g(this.f51096e, c)) {
                return BogInputLayout.INPUT_NORMAL_STATE;
            }
            String str = f51086i;
            int i = f51088k;
            if (((f51090m + i) * i) % f51091n != f51089l) {
                f51088k = m61819s();
                f51089l = m61819s();
            }
            StringBuilder sb = new StringBuilder();
            sb.append(C17931a.m61768c("h\r\u0014}\b\u0004}8z{\b\t|xzsp\u0003r8+rx{{&nw#wtime\u001d", 175, 5));
            sb.append(c == null ? C17931a.m61768c("\u0001\u0007|{", 248, 3) : C17951i.m61844b(c));
            C17952j.m61853f(str, sb.toString());
            return -6;
        } catch (CertificateEncodingException e) {
            C17952j.m61854g(f51086i, C17931a.m61768c("\u0012/;r?i?-9/+=b%&23'#%\u001e\u001b-\u001dV12", 176, 2), e.toString());
            return -8;
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* renamed from: g */
    private static boolean m61812g(byte[][] bArr, byte[] bArr2) {
        if (!(bArr2 == null || bArr == null || bArr.length == 0)) {
            int i = f51088k;
            if (((f51090m + i) * i) % f51091n != f51089l) {
                f51088k = 97;
                f51089l = 6;
            }
            for (byte[] equals : bArr) {
                if (Arrays.equals(bArr2, equals)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: h */
    public static int m61813h() {
        return 1;
    }

    /* renamed from: i */
    public static int m61814i() {
        return 2;
    }

    /* renamed from: j */
    private int m61815j(boolean z, List list) {
        String str;
        String g;
        if (this.f51096e == null && this.f51097f == null) {
            return BogInputLayout.INPUT_NORMAL_STATE;
        }
        int i = -6;
        if (!z) {
            str = f51086i;
            g = C17931a.m61768c("0JXO_UOZU\u0011XT]a[[", 230, 0);
        } else if (list == null || list.isEmpty()) {
            str = f51086i;
            g = C17931a.m61772g("\u0004#1j9e9-=<41C3n36DG=;?:9M?", 'a', 160, 0);
        } else {
            int i2 = f51088k;
            if (((f51090m + i2) * i2) % f51091n != f51089l) {
                f51088k = 70;
                f51089l = 48;
            }
            Certificate certificate = (Certificate) list.get(0);
            if (this.f51097f != null) {
                i = m61809a(certificate);
            }
            return (i == 200 || this.f51096e == null) ? i : m61811d(certificate);
        }
        C17952j.m61853f(str, g);
        return -6;
    }

    /* renamed from: l */
    private void m61816l(Exception exc) {
        C11893e.C11896c cVar;
        int i;
        if (exc.getCause() instanceof CertificateException) {
            if (m61817p(exc.getCause(), CertificateNotYetValidException.class)) {
                cVar = this.f51092a;
                i = -10;
            } else if (m61817p(exc.getCause(), CertificateExpiredException.class)) {
                cVar = this.f51092a;
                i = -9;
            } else if (m61817p(exc.getCause(), CertificateEncodingException.class)) {
                cVar = this.f51092a;
                i = -8;
            } else {
                cVar = this.f51092a;
                i = -7;
            }
        } else if (exc.getCause() instanceof CertPathBuilderException) {
            cVar = this.f51092a;
            i = -12;
        } else if (exc.getCause() instanceof CertPathValidatorException) {
            cVar = this.f51092a;
            i = -13;
        } else if (exc.getCause() instanceof CertStoreException) {
            cVar = this.f51092a;
            i = -14;
        } else if (exc.getCause() instanceof CRLException) {
            this.f51092a.mo31947b(-15);
            int i2 = f51088k;
            if ((i2 * (m61813h() + i2)) % f51091n != 0) {
                f51088k = 58;
                f51089l = m61819s();
                return;
            }
            return;
        } else if (exc instanceof SSLPeerUnverifiedException) {
            cVar = this.f51092a;
            i = -5;
        } else if (exc instanceof UnknownHostException) {
            cVar = this.f51092a;
            i = -3;
        } else if (exc instanceof SocketTimeoutException) {
            cVar = this.f51092a;
            i = -4;
        } else if (this.f51092a.mo31946a() == -2) {
            cVar = this.f51092a;
            i = -1;
        } else {
            return;
        }
        cVar.mo31947b(i);
    }

    /* renamed from: p */
    private static boolean m61817p(Throwable th, Class cls) {
        int i = f51088k;
        if ((i * (m61813h() + i)) % f51091n != 0) {
            f51088k = m61819s();
            f51089l = m61819s();
        }
        for (Throwable cause = th.getCause(); cause != null; cause = cause.getCause()) {
            if (cls.isInstance(cause)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: r */
    public static int m61818r() {
        return 0;
    }

    /* renamed from: s */
    public static int m61819s() {
        return 82;
    }

    /* renamed from: b */
    public String mo45610b() {
        int i = f51088k;
        if (((f51090m + i) * i) % f51091n != f51089l) {
            f51088k = 89;
            f51089l = 40;
        }
        URL url = this.f51098g;
        if (url == null) {
            return null;
        }
        return url.toString();
    }

    /* renamed from: e */
    public InputStream mo45611e() {
        HttpsURLConnection httpsURLConnection = this.f51099h;
        if (httpsURLConnection == null) {
            return null;
        }
        int i = f51088k;
        if ((i * (f51090m + i)) % f51091n != 0) {
            f51088k = 34;
            f51089l = 62;
        }
        return httpsURLConnection.getInputStream();
    }

    /* renamed from: f */
    public int mo45612f(String str, byte[] bArr) {
        HttpsURLConnection c = m61810c(str, bArr, true);
        if (c == null) {
            while (true) {
                try {
                    int[] iArr = new int[-1];
                } catch (Exception unused) {
                    f51088k = 18;
                    throw null;
                } catch (Exception unused2) {
                    f51088k = m61819s();
                    while (true) {
                        try {
                            int[] iArr2 = new int[-1];
                        } catch (Exception unused3) {
                            f51088k = m61819s();
                            return this.f51092a.mo31946a();
                        }
                    }
                }
            }
        } else {
            this.f51098g = c.getURL();
            this.f51099h = c;
            try {
                int responseCode = c.getResponseCode();
                this.f51092a.mo31947b(responseCode);
                return responseCode;
            } catch (IOException e) {
                C17952j.m61848a(f51086i, C17931a.m61772g("r\u0010\u001c\u001b\u001b\u001fI\u0019\u0017\u001a\u001aE", '!', 174, 2), e);
                m61816l(e);
                return this.f51092a.mo31946a();
            }
        }
    }

    /* renamed from: k */
    public C11893e.C11896c mo45613k() {
        return this.f51092a;
    }

    /* renamed from: m */
    public int mo45614m(String str) {
        HttpsURLConnection c = m61810c(str, (byte[]) null, false);
        if (c == null) {
            String str2 = f51086i;
            C17952j.m61853f(str2, C17931a.m61772g("^\n\b\u0007|y\n}\u0003\u00011vpwy\u0002}oC(jgs$qqu bpb]o_\u0019[fdcYVfZ_]\u000ea[\u000b", 27, 'I', 2) + str);
        } else {
            this.f51098g = c.getURL();
            this.f51099h = c;
            try {
                int responseCode = c.getResponseCode();
                this.f51092a.mo31947b(responseCode);
                int i = f51088k;
                if (((f51090m + i) * i) % f51091n != f51089l) {
                    f51088k = 37;
                    f51089l = m61819s();
                }
                return responseCode;
            } catch (IOException e) {
                String str3 = f51086i;
                C17952j.m61848a(str3, C17931a.m61772g("+VTSIFVJOM}C=DFNJ<u|", 165, 141, 1) + str + C17931a.m61772g("]mR", '{', 206, 2), e);
                m61816l(e);
            }
        }
        return this.f51092a.mo31946a();
    }

    /* renamed from: n */
    public void mo45615n(Map map) {
        Map map2 = this.f51095d;
        int i = f51088k;
        if ((i * (f51090m + i)) % f51091n != 0) {
            f51088k = 46;
            f51089l = m61819s();
        }
        map2.putAll(map);
    }

    /* renamed from: o */
    public String mo45616o() {
        if (((m61819s() + m61813h()) * m61819s()) % f51091n != m61818r()) {
            f51088k = 96;
            f51089l = m61819s();
        }
        URL url = this.f51098g;
        if (url == null) {
            return null;
        }
        return url.getHost();
    }

    /* renamed from: q */
    public void mo45617q() {
        HttpsURLConnection httpsURLConnection = this.f51099h;
        if (httpsURLConnection != null) {
            httpsURLConnection.disconnect();
            int i = f51088k;
            if (((f51090m + i) * i) % f51091n != f51089l) {
                f51088k = 76;
                f51089l = m61819s();
            }
            this.f51099h = null;
        }
    }
}
