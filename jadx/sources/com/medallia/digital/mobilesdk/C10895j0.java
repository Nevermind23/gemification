package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.C10812f6;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.medallia.digital.mobilesdk.j0 */
abstract class C10895j0<T> implements Runnable {

    /* renamed from: i */
    private static final int f31279i = 1048576;

    /* renamed from: j */
    private static final String f31280j = "Content-Type";

    /* renamed from: k */
    private static final int f31281k = 600;

    /* renamed from: l */
    private static final String f31282l = "application/json";

    /* renamed from: m */
    static final int f31283m = -44;

    /* renamed from: n */
    private static final String f31284n = "BaseRequest: Error parsing server response ";

    /* renamed from: o */
    static final int f31285o = -45;

    /* renamed from: p */
    private static final String f31286p = "BaseRequest: Error no Connection Available";

    /* renamed from: q */
    static final int f31287q = -46;

    /* renamed from: r */
    private static final String f31288r = "BaseRequest: Error timeout";

    /* renamed from: s */
    private static final String f31289s = "https";

    /* renamed from: a */
    private final C10899d f31290a;

    /* renamed from: b */
    private final String f31291b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C10812f6.C10813a f31292c;

    /* renamed from: d */
    private final Map<String, String> f31293d;

    /* renamed from: e */
    private final JSONObject f31294e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public int f31295f;

    /* renamed from: g */
    private final int f31296g;

    /* renamed from: h */
    private String f31297h;

    /* renamed from: com.medallia.digital.mobilesdk.j0$a */
    class C10896a extends C11033o4 {

        /* renamed from: a */
        final /* synthetic */ String f31298a;

        C10896a(String str) {
            this.f31298a = str;
        }

        /* renamed from: a */
        public void mo27617a() {
            String str = this.f31298a;
            if (str != null && str.contains("No address associated with hostname") && C10895j0.this.f31295f == 0) {
                C10895j0.this.mo28508a((int) C10895j0.f31285o);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Message: ");
            String str2 = this.f31298a;
            if (str2 == null) {
                str2 = "Unknown network error";
            }
            sb.append(str2);
            sb.append(" StatusCode ");
            String str3 = this.f31298a;
            int i = C10895j0.f31281k;
            sb.append(str3 != null ? C10895j0.this.f31295f : C10895j0.f31281k);
            C10735b4.m39111c(sb.toString());
            if (C10895j0.this.f31292c != null) {
                C10812f6.C10813a b = C10895j0.this.f31292c;
                if (this.f31298a != null) {
                    i = C10895j0.this.f31295f;
                }
                b.mo28087a(new C11244z5(i));
            }
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.j0$b */
    static /* synthetic */ class C10897b {

        /* renamed from: a */
        static final /* synthetic */ int[] f31300a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.medallia.digital.mobilesdk.j0$c[] r0 = com.medallia.digital.mobilesdk.C10895j0.C10898c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f31300a = r0
                com.medallia.digital.mobilesdk.j0$c r1 = com.medallia.digital.mobilesdk.C10895j0.C10898c.ContentType     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f31300a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.medallia.digital.mobilesdk.j0$c r1 = com.medallia.digital.mobilesdk.C10895j0.C10898c.Accept     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.medallia.digital.mobilesdk.C10895j0.C10897b.<clinit>():void");
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.j0$c */
    private enum C10898c {
        ContentType,
        Accept;

        public String toString() {
            int i = C10897b.f31300a[ordinal()];
            return i != 1 ? i != 2 ? "" : "Accept" : C10895j0.f31280j;
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.j0$d */
    enum C10899d {
        DEPRECATED_GET_OR_POST,
        GET,
        POST,
        PUT,
        DELETE,
        HEAD,
        OPTIONS,
        TRACE,
        PATCH
    }

    C10895j0(C10899d dVar, String str, HashMap<String, String> hashMap, JSONObject jSONObject, int i, C10812f6.C10813a aVar) {
        this.f31290a = dVar;
        this.f31291b = str;
        this.f31292c = aVar;
        this.f31294e = jSONObject;
        this.f31293d = m39772a(hashMap);
        this.f31296g = i;
    }

    /* renamed from: c */
    private String m39775c() {
        return f31282l;
    }

    /* renamed from: d */
    private Map<String, String> m39776d() {
        Map<String, String> map = this.f31293d;
        return map != null ? map : new HashMap();
    }

    /* renamed from: f */
    private C10899d m39777f() {
        return this.f31290a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo28509a(T t);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract T mo28511b(InputStream inputStream);

    /* renamed from: e */
    public String mo28512e() {
        return this.f31297h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public C10812f6.C10813a mo28513g() {
        return this.f31292c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public int mo28514h() {
        return this.f31295f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public String mo28515i() {
        return this.f31291b;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: java.net.HttpURLConnection} */
    /* JADX WARNING: type inference failed for: r1v0, types: [java.net.HttpURLConnection] */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: type inference failed for: r1v11 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0040 A[SYNTHETIC, Splitter:B:13:0x0040] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005d A[SYNTHETIC, Splitter:B:25:0x005d] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x007b A[SYNTHETIC, Splitter:B:38:0x007b] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008f A[SYNTHETIC, Splitter:B:45:0x008f] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo28516j() {
        /*
            r5 = this;
            r0 = 0
            java.net.HttpURLConnection r1 = r5.mo28507a()     // Catch:{ SocketTimeoutException -> 0x006e, Exception -> 0x0052, all -> 0x004f }
            int r2 = r1.getResponseCode()     // Catch:{ SocketTimeoutException -> 0x006f, Exception -> 0x004d }
            r5.f31295f = r2     // Catch:{ SocketTimeoutException -> 0x006f, Exception -> 0x004d }
            r3 = 400(0x190, float:5.6E-43)
            if (r2 >= r3) goto L_0x0033
            java.io.InputStream r0 = r1.getInputStream()     // Catch:{ SocketTimeoutException -> 0x006f, Exception -> 0x004d }
            java.lang.Object r2 = r5.mo28511b((java.io.InputStream) r0)     // Catch:{ SocketTimeoutException -> 0x006f, Exception -> 0x004d }
            int r3 = r5.f31295f     // Catch:{ SocketTimeoutException -> 0x006f, Exception -> 0x004d }
            r4 = -44
            if (r3 != r4) goto L_0x002f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ SocketTimeoutException -> 0x006f, Exception -> 0x004d }
            r3.<init>()     // Catch:{ SocketTimeoutException -> 0x006f, Exception -> 0x004d }
            java.lang.String r4 = "BaseRequest: Error parsing server response "
            r3.append(r4)     // Catch:{ SocketTimeoutException -> 0x006f, Exception -> 0x004d }
            r3.append(r2)     // Catch:{ SocketTimeoutException -> 0x006f, Exception -> 0x004d }
            java.lang.String r2 = r3.toString()     // Catch:{ SocketTimeoutException -> 0x006f, Exception -> 0x004d }
            goto L_0x003b
        L_0x002f:
            r5.mo28509a(r2)     // Catch:{ SocketTimeoutException -> 0x006f, Exception -> 0x004d }
            goto L_0x003e
        L_0x0033:
            java.io.InputStream r2 = r1.getErrorStream()     // Catch:{ SocketTimeoutException -> 0x006f, Exception -> 0x004d }
            java.lang.String r2 = r5.m39771a((java.io.InputStream) r2)     // Catch:{ SocketTimeoutException -> 0x006f, Exception -> 0x004d }
        L_0x003b:
            r5.mo28510a((java.lang.String) r2)     // Catch:{ SocketTimeoutException -> 0x006f, Exception -> 0x004d }
        L_0x003e:
            if (r0 == 0) goto L_0x0089
            r0.close()     // Catch:{ IOException -> 0x0044 }
            goto L_0x0089
        L_0x0044:
            r0 = move-exception
            java.lang.String r0 = r0.toString()
            r5.mo28510a((java.lang.String) r0)
            goto L_0x0089
        L_0x004d:
            r2 = move-exception
            goto L_0x0054
        L_0x004f:
            r2 = move-exception
            r1 = r0
            goto L_0x008d
        L_0x0052:
            r2 = move-exception
            r1 = r0
        L_0x0054:
            java.lang.String r2 = r2.getMessage()     // Catch:{ all -> 0x006c }
            r5.mo28510a((java.lang.String) r2)     // Catch:{ all -> 0x006c }
            if (r0 == 0) goto L_0x0069
            r0.close()     // Catch:{ IOException -> 0x0061 }
            goto L_0x0069
        L_0x0061:
            r0 = move-exception
            java.lang.String r0 = r0.toString()
            r5.mo28510a((java.lang.String) r0)
        L_0x0069:
            if (r1 == 0) goto L_0x008c
            goto L_0x0089
        L_0x006c:
            r2 = move-exception
            goto L_0x008d
        L_0x006e:
            r1 = r0
        L_0x006f:
            r2 = -46
            r5.mo28508a((int) r2)     // Catch:{ all -> 0x006c }
            java.lang.String r2 = "BaseRequest: Error timeout"
            r5.mo28510a((java.lang.String) r2)     // Catch:{ all -> 0x006c }
            if (r0 == 0) goto L_0x0087
            r0.close()     // Catch:{ IOException -> 0x007f }
            goto L_0x0087
        L_0x007f:
            r0 = move-exception
            java.lang.String r0 = r0.toString()
            r5.mo28510a((java.lang.String) r0)
        L_0x0087:
            if (r1 == 0) goto L_0x008c
        L_0x0089:
            r1.disconnect()
        L_0x008c:
            return
        L_0x008d:
            if (r0 == 0) goto L_0x009b
            r0.close()     // Catch:{ IOException -> 0x0093 }
            goto L_0x009b
        L_0x0093:
            r0 = move-exception
            java.lang.String r0 = r0.toString()
            r5.mo28510a((java.lang.String) r0)
        L_0x009b:
            if (r1 == 0) goto L_0x00a0
            r1.disconnect()
        L_0x00a0:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.medallia.digital.mobilesdk.C10895j0.mo28516j():void");
    }

    public void run() {
        mo28516j();
    }

    C10895j0(C10899d dVar, String str, HashMap<String, String> hashMap, JSONObject jSONObject, String str2, int i, C10812f6.C10813a aVar) {
        this.f31290a = dVar;
        this.f31291b = str;
        this.f31292c = aVar;
        this.f31294e = jSONObject;
        this.f31293d = m39772a(hashMap);
        this.f31296g = i;
        this.f31297h = str2;
    }

    /* renamed from: a */
    private String m39771a(InputStream inputStream) {
        try {
            return C10988l8.m40230a(inputStream).toString("UTF-8");
        } catch (Exception unused) {
            mo28508a((int) f31283m);
            return null;
        }
    }

    /* renamed from: b */
    private byte[] m39774b() {
        try {
            JSONObject jSONObject = this.f31294e;
            if (jSONObject == null) {
                return null;
            }
            return jSONObject.toString().getBytes();
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00f1, code lost:
        if (r2 == null) goto L_0x011d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.net.HttpURLConnection mo28507a() {
        /*
            r8 = this;
            java.net.URL r0 = new java.net.URL
            java.lang.String r1 = r8.mo28515i()
            r0.<init>(r1)
            java.net.URLConnection r0 = r0.openConnection()
            java.lang.Object r0 = com.google.firebase.perf.network.FirebasePerfUrlConnection.instrument(r0)
            java.net.URLConnection r0 = (java.net.URLConnection) r0
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0
            r1 = 0
            r0.setUseCaches(r1)
            int r2 = r8.f31296g
            r0.setConnectTimeout(r2)
            int r2 = r8.f31296g
            r0.setReadTimeout(r2)
            com.medallia.digital.mobilesdk.j0$d r2 = r8.m39777f()
            java.lang.String r2 = r2.name()
            r0.setRequestMethod(r2)
            java.util.Map r2 = r8.m39776d()
            if (r2 == 0) goto L_0x0064
            java.util.Map r2 = r8.m39776d()
            int r2 = r2.size()
            if (r2 <= 0) goto L_0x0064
            java.util.Map r2 = r8.m39776d()
            java.util.Set r2 = r2.keySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x004a:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0064
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.util.Map r4 = r8.m39776d()
            java.lang.Object r4 = r4.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            r0.setRequestProperty(r3, r4)
            goto L_0x004a
        L_0x0064:
            java.lang.String r2 = r8.mo28512e()
            if (r2 != 0) goto L_0x0077
            byte[] r2 = r8.m39774b()
            if (r2 == 0) goto L_0x011d
            byte[] r2 = r8.m39774b()
            int r2 = r2.length
            if (r2 <= 0) goto L_0x011d
        L_0x0077:
            r2 = 1
            r0.setDoInput(r2)
            r0.setDoOutput(r2)
            com.medallia.digital.mobilesdk.j0$d r2 = r8.m39777f()
            java.lang.String r2 = r2.name()
            com.medallia.digital.mobilesdk.j0$d r3 = com.medallia.digital.mobilesdk.C10895j0.C10899d.PUT
            java.lang.String r3 = r3.toString()
            boolean r2 = r2.equals(r3)
            java.lang.String r3 = "Content-Type"
            if (r2 == 0) goto L_0x009d
            java.lang.String r2 = r8.mo28512e()
            if (r2 == 0) goto L_0x009d
            java.lang.String r2 = " "
            goto L_0x00a1
        L_0x009d:
            java.lang.String r2 = r8.m39775c()
        L_0x00a1:
            r0.setRequestProperty(r3, r2)
            java.lang.String r2 = r8.mo28512e()
            if (r2 == 0) goto L_0x010f
            r2 = 0
            java.lang.String r3 = r8.mo28512e()     // Catch:{ IOException -> 0x00e9 }
            java.io.FileInputStream r2 = com.medallia.digital.mobilesdk.C10930k2.m39988e((java.lang.String) r3)     // Catch:{ IOException -> 0x00e9 }
            int r3 = r2.available()     // Catch:{ IOException -> 0x00e9 }
            r0.setFixedLengthStreamingMode(r3)     // Catch:{ IOException -> 0x00e9 }
            java.io.DataOutputStream r3 = new java.io.DataOutputStream     // Catch:{ IOException -> 0x00e9 }
            java.io.OutputStream r4 = r0.getOutputStream()     // Catch:{ IOException -> 0x00e9 }
            r3.<init>(r4)     // Catch:{ IOException -> 0x00e9 }
            r4 = 1048576(0x100000, float:1.469368E-39)
            byte[] r5 = new byte[r4]     // Catch:{ IOException -> 0x00e9 }
            int r6 = r2.available()     // Catch:{ IOException -> 0x00e9 }
            int r6 = java.lang.Math.min(r6, r4)     // Catch:{ IOException -> 0x00e9 }
        L_0x00cf:
            int r7 = r2.read(r5, r1, r6)     // Catch:{ IOException -> 0x00e9 }
            if (r7 <= 0) goto L_0x00e1
            r3.write(r5, r1, r6)     // Catch:{ IOException -> 0x00e9 }
            int r6 = r2.available()     // Catch:{ IOException -> 0x00e9 }
            int r6 = java.lang.Math.min(r6, r4)     // Catch:{ IOException -> 0x00e9 }
            goto L_0x00cf
        L_0x00e1:
            java.lang.String r1 = "LivingLens Done writing file to server - continue processing"
            com.medallia.digital.mobilesdk.C10735b4.m39109b(r1)     // Catch:{ IOException -> 0x00e9 }
            goto L_0x00f3
        L_0x00e7:
            r0 = move-exception
            goto L_0x0100
        L_0x00e9:
            r1 = move-exception
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x00e7 }
            com.medallia.digital.mobilesdk.C10735b4.m39111c(r1)     // Catch:{ all -> 0x00e7 }
            if (r2 == 0) goto L_0x011d
        L_0x00f3:
            r2.close()     // Catch:{ IOException -> 0x00f7 }
            goto L_0x011d
        L_0x00f7:
            r1 = move-exception
            java.lang.String r1 = r1.getMessage()
            com.medallia.digital.mobilesdk.C10735b4.m39111c(r1)
            goto L_0x011d
        L_0x0100:
            if (r2 == 0) goto L_0x010e
            r2.close()     // Catch:{ IOException -> 0x0106 }
            goto L_0x010e
        L_0x0106:
            r1 = move-exception
            java.lang.String r1 = r1.getMessage()
            com.medallia.digital.mobilesdk.C10735b4.m39111c(r1)
        L_0x010e:
            throw r0
        L_0x010f:
            java.io.OutputStream r1 = r0.getOutputStream()
            byte[] r2 = r8.m39774b()
            r1.write(r2)
            r1.close()
        L_0x011d:
            r0.connect()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.medallia.digital.mobilesdk.C10895j0.mo28507a():java.net.HttpURLConnection");
    }

    /* renamed from: a */
    private Map<String, String> m39772a(HashMap<String, String> hashMap) {
        if (hashMap == null) {
            hashMap = new HashMap<>();
        }
        hashMap.put(C10898c.Accept.toString(), f31282l);
        return hashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28508a(int i) {
        this.f31295f = i;
    }

    /* renamed from: a */
    public void mo28510a(String str) {
        C11004m7.m40304b().mo28763a().execute(new C10896a(str));
    }
}
