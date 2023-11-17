package com.salesforce.marketingcloud.http;

import android.os.Bundle;
import com.salesforce.marketingcloud.C11461g;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import com.salesforce.marketingcloud.storage.p385db.C11769i;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ue1.C43064a;

/* renamed from: com.salesforce.marketingcloud.http.b */
public final class C11476b {

    /* renamed from: i */
    public static final C11478b f33361i = new C11478b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final String f33362j = C11461g.m41875a("Request");

    /* renamed from: k */
    public static final String f33363k = "GET";

    /* renamed from: l */
    public static final String f33364l = "POST";

    /* renamed from: m */
    public static final String f33365m = "PATCH";

    /* renamed from: n */
    public static final int f33366n = -100;

    /* renamed from: o */
    private static final int f33367o = 30000;

    /* renamed from: a */
    private final String f33368a;

    /* renamed from: b */
    private final String f33369b;

    /* renamed from: c */
    private final int f33370c;

    /* renamed from: d */
    private final String f33371d;

    /* renamed from: e */
    private final String f33372e;

    /* renamed from: f */
    private final List<String> f33373f;

    /* renamed from: g */
    private final C11474a f33374g;

    /* renamed from: h */
    private String f33375h;

    /* renamed from: com.salesforce.marketingcloud.http.b$a */
    public static final class C11477a {

        /* renamed from: a */
        private String f33376a;

        /* renamed from: b */
        private String f33377b;

        /* renamed from: c */
        private int f33378c = C11476b.f33367o;

        /* renamed from: d */
        private String f33379d;

        /* renamed from: e */
        private String f33380e;

        /* renamed from: f */
        private C11474a f33381f;

        /* renamed from: g */
        private Map<String, String> f33382g = new LinkedHashMap();

        /* renamed from: h */
        private List<String> f33383h;

        /* renamed from: a */
        public final C11477a mo30007a(int i) {
            this.f33378c = i;
            return this;
        }

        /* renamed from: b */
        public final C11477a mo30013b(String str) {
            C41536l.m120489i(str, "method");
            this.f33376a = str;
            return this;
        }

        /* renamed from: c */
        public final C11477a mo30014c(String str) {
            C41536l.m120489i(str, "requestBody");
            this.f33379d = str;
            return this;
        }

        /* renamed from: d */
        public final C11477a mo30015d(String str) {
            C41536l.m120489i(str, C11769i.C11770a.f34149l);
            this.f33377b = str;
            return this;
        }

        /* renamed from: a */
        public final C11477a mo30008a(C11474a aVar) {
            C41536l.m120489i(aVar, "requestId");
            this.f33381f = aVar;
            return this;
        }

        /* renamed from: a */
        public final C11477a mo30009a(String str) {
            C41536l.m120489i(str, "contentType");
            this.f33380e = str;
            return this;
        }

        /* renamed from: a */
        public final C11477a mo30010a(String str, String str2) {
            C41536l.m120489i(str, "key");
            C41536l.m120489i(str2, C11755a.C11756a.f34100b);
            this.f33382g.put(str, C40440x.m117146P0(str2).toString());
            return this;
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x004c  */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x0056  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x0089  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.salesforce.marketingcloud.http.C11476b mo30011a() {
            /*
                r9 = this;
                java.util.List<java.lang.String> r0 = r9.f33383h
                if (r0 != 0) goto L_0x0047
                java.util.Map<java.lang.String, java.lang.String> r0 = r9.f33382g
                boolean r0 = r0.isEmpty()
                r0 = r0 ^ 1
                if (r0 == 0) goto L_0x0043
                java.util.Map<java.lang.String, java.lang.String> r0 = r9.f33382g
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                java.util.Set r0 = r0.entrySet()
                java.util.Iterator r0 = r0.iterator()
            L_0x001d:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L_0x0041
                java.lang.Object r2 = r0.next()
                java.util.Map$Entry r2 = (java.util.Map.Entry) r2
                java.lang.Object r3 = r2.getKey()
                java.lang.String r3 = (java.lang.String) r3
                java.lang.Object r2 = r2.getValue()
                java.lang.String r2 = (java.lang.String) r2
                java.util.List r3 = ie1.C41339p.m119900e(r3)
                java.util.List r2 = ie1.C41358y.m120024n0(r3, r2)
                boolean unused = ie1.C41352v.m119965z(r1, r2)
                goto L_0x001d
            L_0x0041:
                r7 = r1
                goto L_0x0048
            L_0x0043:
                java.util.List r0 = ie1.C41341q.m119907j()
            L_0x0047:
                r7 = r0
            L_0x0048:
                java.lang.String r3 = r9.f33379d
                if (r3 != 0) goto L_0x0050
                java.lang.String r0 = ""
                r9.f33380e = r0
            L_0x0050:
                java.lang.String r2 = r9.f33376a
                java.lang.String r0 = "Required value was null."
                if (r2 == 0) goto L_0x0089
                java.lang.String r6 = r9.f33377b
                if (r6 == 0) goto L_0x007f
                int r4 = r9.f33378c
                java.lang.String r5 = r9.f33380e
                if (r5 == 0) goto L_0x0075
                com.salesforce.marketingcloud.http.a r8 = r9.f33381f
                if (r8 == 0) goto L_0x006b
                com.salesforce.marketingcloud.http.b r0 = new com.salesforce.marketingcloud.http.b
                r1 = r0
                r1.<init>(r2, r3, r4, r5, r6, r7, r8)
                return r0
            L_0x006b:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r0 = r0.toString()
                r1.<init>(r0)
                throw r1
            L_0x0075:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r0 = r0.toString()
                r1.<init>(r0)
                throw r1
            L_0x007f:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r0 = r0.toString()
                r1.<init>(r0)
                throw r1
            L_0x0089:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r0 = r0.toString()
                r1.<init>(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.http.C11476b.C11477a.mo30011a():com.salesforce.marketingcloud.http.b");
        }

        /* renamed from: a */
        public final void mo30012a(List<String> list) {
            C41536l.m120489i(list, "headers");
            this.f33383h = list;
        }
    }

    /* renamed from: com.salesforce.marketingcloud.http.b$b */
    public static final class C11478b {
        private C11478b() {
        }

        public /* synthetic */ C11478b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C11477a mo30016a() {
            return new C11477a();
        }

        /* renamed from: b */
        public final String mo30018b() {
            return C11476b.f33362j;
        }

        /* renamed from: a */
        public final C11476b mo30017a(Bundle bundle) {
            C41536l.m120489i(bundle, "data");
            C11477a a = C11476b.f33361i.mo30016a();
            String string = bundle.getString("method");
            if (string != null) {
                a.mo30013b(string);
            }
            String string2 = bundle.getString("requestBody");
            if (string2 != null) {
                a.mo30014c(string2);
            }
            a.mo30007a(bundle.getInt("connectionTimeout"));
            String string3 = bundle.getString("contentType");
            if (string3 != null) {
                a.mo30009a(string3);
            }
            String string4 = bundle.getString(C11769i.C11770a.f34149l);
            if (string4 != null) {
                a.mo30015d(string4);
            }
            ArrayList<String> stringArrayList = bundle.getStringArrayList("headers");
            if (stringArrayList != null) {
                a.mo30012a((List<String>) stringArrayList);
            }
            a.mo30008a(C11474a.values()[bundle.getInt("mcRequestId", 0)]);
            C11476b a2 = a.mo30011a();
            a2.mo29986a(bundle.getString("tag"));
            return a2;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.salesforce.marketingcloud.http.b$c */
    public @interface C11479c {
    }

    /* renamed from: com.salesforce.marketingcloud.http.b$d */
    static final class C11480d extends C41537m implements C43064a {

        /* renamed from: a */
        public static final C11480d f33384a = new C11480d();

        C11480d() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Unable to complete request";
        }
    }

    public C11476b(String str, String str2, int i, String str3, String str4, List<String> list, C11474a aVar) {
        C41536l.m120489i(str, "method");
        C41536l.m120489i(str3, "contentType");
        C41536l.m120489i(str4, C11769i.C11770a.f34149l);
        C41536l.m120489i(list, "headers");
        C41536l.m120489i(aVar, "requestId");
        this.f33368a = str;
        this.f33369b = str2;
        this.f33370c = i;
        this.f33371d = str3;
        this.f33372e = str4;
        this.f33373f = list;
        this.f33374g = aVar;
    }

    /* renamed from: a */
    public static final C11476b m41933a(Bundle bundle) {
        return f33361i.mo30017a(bundle);
    }

    /* renamed from: b */
    public static final C11477a m41937b() {
        return f33361i.mo30016a();
    }

    /* renamed from: c */
    public final String mo29987c() {
        return this.f33368a;
    }

    /* renamed from: d */
    public final String mo29988d() {
        return this.f33369b;
    }

    /* renamed from: e */
    public final int mo29989e() {
        return this.f33370c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11476b)) {
            return false;
        }
        C11476b bVar = (C11476b) obj;
        return C41536l.m120484d(this.f33368a, bVar.f33368a) && C41536l.m120484d(this.f33369b, bVar.f33369b) && this.f33370c == bVar.f33370c && C41536l.m120484d(this.f33371d, bVar.f33371d) && C41536l.m120484d(this.f33372e, bVar.f33372e) && C41536l.m120484d(this.f33373f, bVar.f33373f) && this.f33374g == bVar.f33374g;
    }

    /* renamed from: f */
    public final String mo29991f() {
        return this.f33371d;
    }

    /* renamed from: g */
    public final String mo29992g() {
        return this.f33372e;
    }

    /* renamed from: h */
    public final List<String> mo29993h() {
        return this.f33373f;
    }

    public int hashCode() {
        int hashCode = this.f33368a.hashCode() * 31;
        String str = this.f33369b;
        return ((((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f33370c) * 31) + this.f33371d.hashCode()) * 31) + this.f33372e.hashCode()) * 31) + this.f33373f.hashCode()) * 31) + this.f33374g.hashCode();
    }

    /* renamed from: i */
    public final C11474a mo29995i() {
        return this.f33374g;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:35|36|(1:38)(1:39)) */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0098, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        se1.C42550b.m123187a(r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009c, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r4 = m41936a(r3.getErrorStream());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d9, code lost:
        if (r4 == null) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00dc, code lost:
        r2.mo30038a(r4);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00d1 */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x011f  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.salesforce.marketingcloud.http.C11486d mo29996j() {
        /*
            r12 = this;
            long r0 = java.lang.System.currentTimeMillis()
            r2 = 0
            java.net.URL r3 = new java.net.URL     // Catch:{ Exception -> 0x0101 }
            java.lang.String r4 = r12.f33372e     // Catch:{ Exception -> 0x0101 }
            r3.<init>(r4)     // Catch:{ Exception -> 0x0101 }
            java.net.URLConnection r3 = r3.openConnection()     // Catch:{ Exception -> 0x0101 }
            java.lang.Object r3 = com.google.firebase.perf.network.FirebasePerfUrlConnection.instrument(r3)     // Catch:{ Exception -> 0x0101 }
            java.net.URLConnection r3 = (java.net.URLConnection) r3     // Catch:{ Exception -> 0x0101 }
            if (r3 == 0) goto L_0x00f7
            javax.net.ssl.HttpsURLConnection r3 = (javax.net.ssl.HttpsURLConnection) r3     // Catch:{ Exception -> 0x0101 }
            java.lang.String r4 = r12.f33368a     // Catch:{ Exception -> 0x00f4, all -> 0x00f1 }
            r3.setRequestMethod(r4)     // Catch:{ Exception -> 0x00f4, all -> 0x00f1 }
            r4 = 1
            r3.setDoInput(r4)     // Catch:{ Exception -> 0x00f4, all -> 0x00f1 }
            r5 = 0
            r3.setUseCaches(r5)     // Catch:{ Exception -> 0x00f4, all -> 0x00f1 }
            r3.setAllowUserInteraction(r5)     // Catch:{ Exception -> 0x00f4, all -> 0x00f1 }
            int r6 = r12.f33370c     // Catch:{ Exception -> 0x00f4, all -> 0x00f1 }
            r3.setConnectTimeout(r6)     // Catch:{ Exception -> 0x00f4, all -> 0x00f1 }
            java.util.List<java.lang.String> r6 = r12.f33373f     // Catch:{ Exception -> 0x00f4, all -> 0x00f1 }
            int r6 = r6.size()     // Catch:{ Exception -> 0x00f4, all -> 0x00f1 }
            ze1.e r5 = ze1.C43429k.m124596o(r5, r6)     // Catch:{ Exception -> 0x00f4, all -> 0x00f1 }
            r6 = 2
            ze1.c r5 = ze1.C43429k.m124594m(r5, r6)     // Catch:{ Exception -> 0x00f4, all -> 0x00f1 }
            int r6 = r5.mo102109j()     // Catch:{ Exception -> 0x00f4, all -> 0x00f1 }
            int r7 = r5.mo102110l()     // Catch:{ Exception -> 0x00f4, all -> 0x00f1 }
            int r5 = r5.mo102111n()     // Catch:{ Exception -> 0x00f4, all -> 0x00f1 }
            if (r5 <= 0) goto L_0x004e
            if (r6 <= r7) goto L_0x0052
        L_0x004e:
            if (r5 >= 0) goto L_0x006e
            if (r7 > r6) goto L_0x006e
        L_0x0052:
            int r8 = r6 + r5
            java.util.List<java.lang.String> r9 = r12.f33373f     // Catch:{ Exception -> 0x00f4, all -> 0x00f1 }
            java.lang.Object r9 = r9.get(r6)     // Catch:{ Exception -> 0x00f4, all -> 0x00f1 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ Exception -> 0x00f4, all -> 0x00f1 }
            java.util.List<java.lang.String> r10 = r12.f33373f     // Catch:{ Exception -> 0x00f4, all -> 0x00f1 }
            int r11 = r6 + 1
            java.lang.Object r10 = r10.get(r11)     // Catch:{ Exception -> 0x00f4, all -> 0x00f1 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ Exception -> 0x00f4, all -> 0x00f1 }
            r3.setRequestProperty(r9, r10)     // Catch:{ Exception -> 0x00f4, all -> 0x00f1 }
            if (r6 != r7) goto L_0x006c
            goto L_0x006e
        L_0x006c:
            r6 = r8
            goto L_0x0052
        L_0x006e:
            java.lang.String r5 = r12.f33369b     // Catch:{ Exception -> 0x00f4, all -> 0x00f1 }
            if (r5 == 0) goto L_0x009d
            r3.setDoOutput(r4)     // Catch:{ Exception -> 0x00f4, all -> 0x00f1 }
            java.lang.String r4 = "Content-Type"
            java.lang.String r6 = r12.f33371d     // Catch:{ Exception -> 0x00f4, all -> 0x00f1 }
            r3.setRequestProperty(r4, r6)     // Catch:{ Exception -> 0x00f4, all -> 0x00f1 }
            java.io.OutputStream r4 = r3.getOutputStream()     // Catch:{ Exception -> 0x00f4, all -> 0x00f1 }
            java.nio.charset.Charset r6 = com.salesforce.marketingcloud.internal.C11516m.m42088b()     // Catch:{ all -> 0x0096 }
            byte[] r5 = r5.getBytes(r6)     // Catch:{ all -> 0x0096 }
            java.lang.String r6 = "(this as java.lang.String).getBytes(charset)"
            kotlin.jvm.internal.C41536l.m120488h(r5, r6)     // Catch:{ all -> 0x0096 }
            r4.write(r5)     // Catch:{ all -> 0x0096 }
            he1.w r5 = he1.C41238w.f97225a     // Catch:{ all -> 0x0096 }
            se1.C42550b.m123187a(r4, r2)     // Catch:{ Exception -> 0x00f4, all -> 0x00f1 }
            goto L_0x009d
        L_0x0096:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0098 }
        L_0x0098:
            r1 = move-exception
            se1.C42550b.m123187a(r4, r0)     // Catch:{ Exception -> 0x00f4, all -> 0x00f1 }
            throw r1     // Catch:{ Exception -> 0x00f4, all -> 0x00f1 }
        L_0x009d:
            com.salesforce.marketingcloud.http.d$b r2 = com.salesforce.marketingcloud.http.C11486d.f33402g     // Catch:{ Exception -> 0x00f4, all -> 0x00f1 }
            com.salesforce.marketingcloud.http.d$a r2 = r2.mo30043a()     // Catch:{ Exception -> 0x00f4, all -> 0x00f1 }
            int r4 = r3.getResponseCode()     // Catch:{ Exception -> 0x00f4, all -> 0x00f1 }
            r2.mo30036a((int) r4)     // Catch:{ Exception -> 0x00f4, all -> 0x00f1 }
            java.lang.String r4 = r3.getResponseMessage()     // Catch:{ Exception -> 0x00f4, all -> 0x00f1 }
            java.lang.String r5 = "connection.responseMessage"
            kotlin.jvm.internal.C41536l.m120488h(r4, r5)     // Catch:{ Exception -> 0x00f4, all -> 0x00f1 }
            r2.mo30042b((java.lang.String) r4)     // Catch:{ Exception -> 0x00f4, all -> 0x00f1 }
            java.util.Map r4 = r3.getHeaderFields()     // Catch:{ Exception -> 0x00f4, all -> 0x00f1 }
            java.lang.String r5 = "connection.headerFields"
            kotlin.jvm.internal.C41536l.m120488h(r4, r5)     // Catch:{ Exception -> 0x00f4, all -> 0x00f1 }
            r2.mo30039a((java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>>) r4)     // Catch:{ Exception -> 0x00f4, all -> 0x00f1 }
            java.io.InputStream r4 = r3.getInputStream()     // Catch:{ IOException -> 0x00d1 }
            java.lang.String r4 = r12.m41936a((java.io.InputStream) r4)     // Catch:{ IOException -> 0x00d1 }
            if (r4 != 0) goto L_0x00cd
            goto L_0x00df
        L_0x00cd:
            r2.mo30038a((java.lang.String) r4)     // Catch:{ IOException -> 0x00d1 }
            goto L_0x00df
        L_0x00d1:
            java.io.InputStream r4 = r3.getErrorStream()     // Catch:{ Exception -> 0x00f4, all -> 0x00f1 }
            java.lang.String r4 = r12.m41936a((java.io.InputStream) r4)     // Catch:{ Exception -> 0x00f4, all -> 0x00f1 }
            if (r4 != 0) goto L_0x00dc
            goto L_0x00df
        L_0x00dc:
            r2.mo30038a((java.lang.String) r4)     // Catch:{ Exception -> 0x00f4, all -> 0x00f1 }
        L_0x00df:
            r2.mo30041b((long) r0)     // Catch:{ Exception -> 0x00f4, all -> 0x00f1 }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x00f4, all -> 0x00f1 }
            r2.mo30037a((long) r0)     // Catch:{ Exception -> 0x00f4, all -> 0x00f1 }
            com.salesforce.marketingcloud.http.d r0 = r2.mo30040a()     // Catch:{ Exception -> 0x00f4, all -> 0x00f1 }
            r3.disconnect()
            goto L_0x011b
        L_0x00f1:
            r0 = move-exception
            r2 = r3
            goto L_0x011c
        L_0x00f4:
            r0 = move-exception
            r2 = r3
            goto L_0x0102
        L_0x00f7:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ Exception -> 0x0101 }
            java.lang.String r1 = "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection"
            r0.<init>(r1)     // Catch:{ Exception -> 0x0101 }
            throw r0     // Catch:{ Exception -> 0x0101 }
        L_0x00ff:
            r0 = move-exception
            goto L_0x011c
        L_0x0101:
            r0 = move-exception
        L_0x0102:
            com.salesforce.marketingcloud.g r1 = com.salesforce.marketingcloud.C11461g.f33306a     // Catch:{ all -> 0x00ff }
            java.lang.String r3 = f33362j     // Catch:{ all -> 0x00ff }
            com.salesforce.marketingcloud.http.b$d r4 = com.salesforce.marketingcloud.http.C11476b.C11480d.f33384a     // Catch:{ all -> 0x00ff }
            r1.mo29962b((java.lang.String) r3, (java.lang.Throwable) r0, (ue1.C43064a) r4)     // Catch:{ all -> 0x00ff }
            com.salesforce.marketingcloud.http.d$b r0 = com.salesforce.marketingcloud.http.C11486d.f33402g     // Catch:{ all -> 0x00ff }
            java.lang.String r1 = "ERROR"
            r3 = -100
            com.salesforce.marketingcloud.http.d r0 = r0.mo30044a(r1, r3)     // Catch:{ all -> 0x00ff }
            if (r2 != 0) goto L_0x0118
            goto L_0x011b
        L_0x0118:
            r2.disconnect()
        L_0x011b:
            return r0
        L_0x011c:
            if (r2 != 0) goto L_0x011f
            goto L_0x0122
        L_0x011f:
            r2.disconnect()
        L_0x0122:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.http.C11476b.mo29996j():com.salesforce.marketingcloud.http.d");
    }

    /* renamed from: k */
    public final int mo29997k() {
        return this.f33370c;
    }

    /* renamed from: l */
    public final String mo29998l() {
        return this.f33371d;
    }

    /* renamed from: m */
    public final List<String> mo29999m() {
        return this.f33373f;
    }

    /* renamed from: n */
    public final String mo30000n() {
        return this.f33368a;
    }

    /* renamed from: o */
    public final String mo30001o() {
        return this.f33369b;
    }

    /* renamed from: p */
    public final C11474a mo30002p() {
        return this.f33374g;
    }

    /* renamed from: q */
    public final String mo30003q() {
        return this.f33375h;
    }

    /* renamed from: r */
    public final String mo30004r() {
        return this.f33372e;
    }

    /* renamed from: s */
    public final Bundle mo30005s() {
        Bundle bundle = new Bundle();
        bundle.putString("method", mo30000n());
        bundle.putString("requestBody", mo30001o());
        bundle.putInt("connectionTimeout", mo29997k());
        bundle.putString("contentType", mo29998l());
        bundle.putString(C11769i.C11770a.f34149l, mo30004r());
        bundle.putStringArrayList("headers", mo29999m() instanceof ArrayList ? (ArrayList) mo29999m() : new ArrayList(mo29999m()));
        bundle.putInt("mcRequestId", mo30002p().ordinal());
        bundle.putString("tag", mo30003q());
        return bundle;
    }

    public String toString() {
        return "Request(method=" + this.f33368a + ", requestBody=" + this.f33369b + ", connectionTimeout=" + this.f33370c + ", contentType=" + this.f33371d + ", url=" + this.f33372e + ", headers=" + this.f33373f + ", requestId=" + this.f33374g + ')';
    }

    /* renamed from: a */
    public static /* synthetic */ C11476b m41934a(C11476b bVar, String str, String str2, int i, String str3, String str4, List<String> list, C11474a aVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = bVar.f33368a;
        }
        if ((i2 & 2) != 0) {
            str2 = bVar.f33369b;
        }
        String str5 = str2;
        if ((i2 & 4) != 0) {
            i = bVar.f33370c;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            str3 = bVar.f33371d;
        }
        String str6 = str3;
        if ((i2 & 16) != 0) {
            str4 = bVar.f33372e;
        }
        String str7 = str4;
        if ((i2 & 32) != 0) {
            list = bVar.f33373f;
        }
        List<String> list2 = list;
        if ((i2 & 64) != 0) {
            aVar = bVar.f33374g;
        }
        return bVar.mo29985a(str, str5, i3, str6, str7, list2, aVar);
    }

    /* renamed from: a */
    public final C11476b mo29985a(String str, String str2, int i, String str3, String str4, List<String> list, C11474a aVar) {
        C41536l.m120489i(str, "method");
        C41536l.m120489i(str3, "contentType");
        C41536l.m120489i(str4, C11769i.C11770a.f34149l);
        C41536l.m120489i(list, "headers");
        C11474a aVar2 = aVar;
        C41536l.m120489i(aVar2, "requestId");
        return new C11476b(str, str2, i, str3, str4, list, aVar2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0030, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
        se1.C42550b.m123187a(r1, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
        throw r0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String m41936a(java.io.InputStream r5) {
        /*
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L_0x0035
            java.io.BufferedReader r1 = new java.io.BufferedReader
            java.nio.charset.Charset r2 = com.salesforce.marketingcloud.internal.C11516m.m42088b()
            java.io.InputStreamReader r3 = new java.io.InputStreamReader
            r3.<init>(r5, r2)
            r1.<init>(r3)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x002e }
            r5.<init>()     // Catch:{ all -> 0x002e }
        L_0x0016:
            java.lang.String r2 = r1.readLine()     // Catch:{ all -> 0x002e }
            if (r2 == 0) goto L_0x0025
            r5.append(r2)     // Catch:{ all -> 0x002e }
            r2 = 10
            r5.append(r2)     // Catch:{ all -> 0x002e }
            goto L_0x0016
        L_0x0025:
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x002e }
            se1.C42550b.m123187a(r1, r0)
            r0 = r5
            goto L_0x0035
        L_0x002e:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x0030 }
        L_0x0030:
            r0 = move-exception
            se1.C42550b.m123187a(r1, r5)
            throw r0
        L_0x0035:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.http.C11476b.m41936a(java.io.InputStream):java.lang.String");
    }

    /* renamed from: a */
    public final void mo29986a(String str) {
        this.f33375h = str;
    }
}
