package p613te;

import com.threatmetrix.TrustDefender.C11893e;
import java.util.Map;
import p613te.C17952j;

/* renamed from: te.c */
public class C17945c implements Runnable {

    /* renamed from: j */
    private static final String f51075j = C17952j.m61850c(C17945c.class);

    /* renamed from: k */
    public static int f51076k = 24;

    /* renamed from: l */
    public static int f51077l = 0;

    /* renamed from: m */
    public static int f51078m = 1;

    /* renamed from: n */
    public static int f51079n = 2;

    /* renamed from: d */
    private final C17946d f51080d;

    /* renamed from: e */
    private final C11893e.C11894a f51081e;

    /* renamed from: f */
    private final String f51082f;

    /* renamed from: g */
    private final C11893e.C11895b f51083g;

    /* renamed from: h */
    private final byte[] f51084h;

    /* renamed from: i */
    private final int f51085i;

    static {
        int i = 4;
        while (true) {
            try {
                i /= 0;
            } catch (Exception unused) {
                return;
            }
        }
    }

    public C17945c(C17946d dVar, C11893e.C11894a aVar, String str, Map map, byte[] bArr, int i, C11893e.C11895b bVar) {
        this.f51080d = dVar;
        if (map != null && !map.isEmpty()) {
            dVar.mo45615n(map);
        }
        this.f51081e = aVar;
        this.f51084h = bArr;
        this.f51083g = bVar;
        this.f51082f = str;
        this.f51085i = i <= 0 ? 0 : i;
    }

    /* renamed from: a */
    private void m61807a(boolean z) {
        long nanoTime = System.nanoTime();
        String str = f51075j;
        C17952j.C17953a.m61857b(str, C17931a.m61768c("$%F\u0018\n\u0018\u0015\u000b\u0006\u0016\nV;", 234, 5) + this.f51082f, z ? C17931a.m61768c("aSa^dSWO", 175, 3) : C17931a.m61772g("\u0017\u0019\u0007\u0019\u001c\u0012\u0018\u0012", 11, 230, 0));
        C11893e.C11894a aVar = this.f51081e;
        int m = aVar == C11893e.C11894a.GET ? this.f51080d.mo45614m(this.f51082f) : aVar == C11893e.C11894a.POST ? this.f51080d.mo45612f(this.f51082f, this.f51084h) : -1;
        long nanoTime2 = (System.nanoTime() - nanoTime) / 1000000;
        if (m < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(C17931a.m61772g("5/680.h<6e7)74*%5#\\\"-)&W", 'S', '\"', 1));
            sb.append(this.f51082f);
            sb.append(C17931a.m61772g("~UFPCy", 27, 'y', 1));
            sb.append(this.f51080d.mo45613k().toString());
            sb.append(C17931a.m61768c("Y\"&V", 162, 5));
            sb.append(nanoTime2);
            int i = f51076k;
            if ((i * (f51078m + i)) % f51079n != 0) {
                f51076k = 88;
                f51077l = m61808b();
            }
            sb.append(C17931a.m61772g("^e", 228, 243, 0));
            C17952j.m61855h(str, sb.toString());
            return;
        }
        C17952j.C17953a.m61860e(str, C17931a.m61768c("zlzwmhxfd9\u001e", 'w', 2) + this.f51080d.mo45610b() + C17931a.m61768c("i26f", 181, 2) + nanoTime2 + C17931a.m61768c("\u0007\f", 'f', 2));
    }

    /* renamed from: b */
    public static int m61808b() {
        return 21;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:30|31) */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        p613te.C17952j.m61853f(f51075j, p613te.C17931a.m61772g("_f]\u0012}\u0001\r\u0012\b\u000f\u000fAJ", 159, 244, 3) + r0.toString() + p613te.C17931a.m61768c("e]24\"687d55g;/<A2ACoEAr", 20, 4) + r10.f51080d.mo45616o());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00df, code lost:
        r10.f51080d.mo45617q();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00e4, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x00a6 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r10 = this;
            te.d r0 = r10.f51080d
            com.threatmetrix.TrustDefender.e$c r0 = r0.mo45613k()
            r1 = 0
            r2 = r1
        L_0x0008:
            int r3 = r10.f51085i
            r4 = 4
            if (r2 > r3) goto L_0x0085
            boolean r3 = r0.mo31948c()
            if (r3 != 0) goto L_0x0085
            int r3 = r0.mo31946a()
            r5 = -6
            if (r3 == r5) goto L_0x0085
            int r3 = f51076k
            int r5 = f51078m
            int r5 = r5 + r3
            int r5 = r5 * r3
            int r3 = f51079n
            int r5 = r5 % r3
            int r3 = f51077l
            if (r5 == r3) goto L_0x0033
            int r3 = m61808b()
            f51076k = r3
            int r3 = m61808b()
            f51077l = r3
        L_0x0033:
            int r3 = r0.mo31946a()
            r5 = -5
            if (r3 == r5) goto L_0x0085
            r0 = 1
            if (r2 == 0) goto L_0x003f
            r3 = r0
            goto L_0x0040
        L_0x003f:
            r3 = r1
        L_0x0040:
            r10.m61807a(r3)
            int r2 = r2 + 1
            te.d r3 = r10.f51080d
            com.threatmetrix.TrustDefender.e$c r3 = r3.mo45613k()
            boolean r5 = r3.mo31948c()
            if (r5 != 0) goto L_0x0083
            java.lang.String r5 = f51075j
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r7 = 46
            r8 = 221(0xdd, float:3.1E-43)
            java.lang.String r9 = "\u0016\"!\u001d\u001fKR"
            java.lang.String r0 = p613te.C17931a.m61772g(r9, r7, r8, r0)
            r6.append(r0)
            int r0 = r3.mo31946a()
            r6.append(r0)
            java.lang.String r0 = ">6\u000b\rz\u000f\u0011\u0010=\u000e\u000e@\u0014\b\u0015\u001a\u000b\u001a\u001cH\u001e\u001aK"
            r7 = 134(0x86, float:1.88E-43)
            java.lang.String r0 = p613te.C17931a.m61768c(r0, r7, r4)
            r6.append(r0)
            java.lang.String r0 = r10.f51082f
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            p613te.C17952j.m61855h(r5, r0)
        L_0x0083:
            r0 = r3
            goto L_0x0008
        L_0x0085:
            com.threatmetrix.TrustDefender.e$b r1 = r10.f51083g     // Catch:{ IOException -> 0x00a6 }
            if (r1 == 0) goto L_0x009e
            int r1 = r0.mo31946a()     // Catch:{ IOException -> 0x00a6 }
            r2 = 200(0xc8, float:2.8E-43)
            if (r1 != r2) goto L_0x0098
            te.d r1 = r10.f51080d     // Catch:{ IOException -> 0x00a6 }
            java.io.InputStream r1 = r1.mo45611e()     // Catch:{ IOException -> 0x00a6 }
            goto L_0x0099
        L_0x0098:
            r1 = 0
        L_0x0099:
            com.threatmetrix.TrustDefender.e$b r2 = r10.f51083g     // Catch:{ IOException -> 0x00a6 }
            r2.mo31945a(r0, r1)     // Catch:{ IOException -> 0x00a6 }
        L_0x009e:
            te.d r0 = r10.f51080d
            r0.mo45617q()
            goto L_0x00de
        L_0x00a4:
            r0 = move-exception
            goto L_0x00df
        L_0x00a6:
            java.lang.String r1 = f51075j     // Catch:{ all -> 0x00a4 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a4 }
            r2.<init>()     // Catch:{ all -> 0x00a4 }
            java.lang.String r3 = "_f]\u0012}\u0001\r\u0012\b\u000f\u000fAJ"
            r5 = 3
            r6 = 159(0x9f, float:2.23E-43)
            r7 = 244(0xf4, float:3.42E-43)
            java.lang.String r3 = p613te.C17931a.m61772g(r3, r6, r7, r5)     // Catch:{ all -> 0x00a4 }
            r2.append(r3)     // Catch:{ all -> 0x00a4 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00a4 }
            r2.append(r0)     // Catch:{ all -> 0x00a4 }
            java.lang.String r0 = "e]24\"687d55g;/<A2ACoEAr"
            r3 = 20
            java.lang.String r0 = p613te.C17931a.m61768c(r0, r3, r4)     // Catch:{ all -> 0x00a4 }
            r2.append(r0)     // Catch:{ all -> 0x00a4 }
            te.d r0 = r10.f51080d     // Catch:{ all -> 0x00a4 }
            java.lang.String r0 = r0.mo45616o()     // Catch:{ all -> 0x00a4 }
            r2.append(r0)     // Catch:{ all -> 0x00a4 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x00a4 }
            p613te.C17952j.m61853f(r1, r0)     // Catch:{ all -> 0x00a4 }
            goto L_0x009e
        L_0x00de:
            return
        L_0x00df:
            te.d r1 = r10.f51080d
            r1.mo45617q()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p613te.C17945c.run():void");
    }
}
