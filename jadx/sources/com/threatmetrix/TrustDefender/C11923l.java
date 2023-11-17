package com.threatmetrix.TrustDefender;

import android.content.Context;
import android.support.p013v4.media.session.C0125b;
import com.threatmetrix.TrustDefender.C11907h;
import com.threatmetrix.TrustDefender.C11969r1;
import com.threatmetrix.TrustDefender.peppep;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import p585re.C17586c;
import p585re.C17588e;
import p585re.C17592i;
import p585re.C17598o;
import p585re.C17600q;
import p585re.C17601r;
import p585re.C17603t;

/* renamed from: com.threatmetrix.TrustDefender.l */
public class C11923l {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final String f34882c = C11907h.m43615j(C11923l.class);

    /* renamed from: d */
    private static final Map f34883d;

    /* renamed from: a */
    private Map f34884a = new TreeMap();

    /* renamed from: b */
    private long f34885b;

    /* renamed from: com.threatmetrix.TrustDefender.l$a */
    public class C11924a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ peppep.C11953g f34886d;

        /* renamed from: e */
        public final /* synthetic */ C17598o f34887e;

        /* renamed from: f */
        public final /* synthetic */ C17603t f34888f;

        /* renamed from: g */
        public final /* synthetic */ boolean f34889g;

        /* renamed from: h */
        public final /* synthetic */ long f34890h;

        /* renamed from: i */
        public final /* synthetic */ int f34891i;

        /* renamed from: j */
        public final /* synthetic */ C17592i f34892j;

        public C11924a(peppep.C11953g gVar, C17598o oVar, C17603t tVar, boolean z, long j, int i, C17592i iVar, C17588e eVar) {
            this.f34886d = gVar;
            this.f34887e = oVar;
            this.f34888f = tVar;
            this.f34889g = z;
            this.f34890h = j;
            this.f34891i = i;
            this.f34892j = iVar;
        }

        public void run() {
            String c;
            StringBuilder sb;
            try {
                C11907h.m43612g(C11923l.f34882c, "scanPackages({}): marking scan as started", this.f34886d.toString());
                ((C17601r) this.f34887e).mo45181j(this.f34888f.f49314a, this.f34889g, this.f34890h, this.f34891i);
                c = C11923l.f34882c;
                sb = new StringBuilder();
            } catch (Throwable th) {
                String c2 = C11923l.f34882c;
                C11907h.C11908a.m43624b(c2, "scanPackages(" + this.f34886d + "): complete");
                this.f34892j.mo45154l();
                throw th;
            }
            sb.append("scanPackages(");
            sb.append(this.f34886d);
            sb.append("): complete");
            C11907h.C11908a.m43624b(c, sb.toString());
            this.f34892j.mo45154l();
        }
    }

    /* renamed from: com.threatmetrix.TrustDefender.l$b */
    public static class C11925b implements Callable {

        /* renamed from: d */
        public final /* synthetic */ Class f34894d;

        public C11925b(Class cls) {
            this.f34894d = cls;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0059, code lost:
            r5 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
            com.threatmetrix.TrustDefender.C11907h.m43612g(com.threatmetrix.TrustDefender.C11923l.m43749c(), "Failed to load module ({}): {}", r11.f34894d.getSimpleName(), r5.getMessage());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x009f, code lost:
            r3 = e;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x009f A[ExcHandler: ClassNotFoundException (e java.lang.ClassNotFoundException), Splitter:B:1:0x0003] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.util.ArrayList call() {
            /*
                r11 = this;
                r0 = 1
                r1 = 0
                r2 = 2
                java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ ServiceConfigurationError -> 0x00a3, SecurityException -> 0x00a1, ClassNotFoundException -> 0x009f }
                r3.<init>()     // Catch:{ ServiceConfigurationError -> 0x00a3, SecurityException -> 0x00a1, ClassNotFoundException -> 0x009f }
                java.lang.Class r4 = r11.f34894d     // Catch:{ ServiceConfigurationError -> 0x00a3, SecurityException -> 0x00a1, ClassNotFoundException -> 0x009f }
                java.lang.ClassLoader r4 = r4.getClassLoader()     // Catch:{ ServiceConfigurationError -> 0x00a3, SecurityException -> 0x00a1, ClassNotFoundException -> 0x009f }
                if (r4 == 0) goto L_0x007d
                java.lang.Class r5 = r11.f34894d     // Catch:{ ServiceConfigurationError -> 0x00a3, SecurityException -> 0x00a1, ClassNotFoundException -> 0x009f }
                re.b r6 = new re.b     // Catch:{ ServiceConfigurationError -> 0x00a3, SecurityException -> 0x00a1, ClassNotFoundException -> 0x009f }
                r6.<init>(r4)     // Catch:{ ServiceConfigurationError -> 0x00a3, SecurityException -> 0x00a1, ClassNotFoundException -> 0x009f }
                java.util.ServiceLoader r4 = java.util.ServiceLoader.load(r5, r6)     // Catch:{ ServiceConfigurationError -> 0x00a3, SecurityException -> 0x00a1, ClassNotFoundException -> 0x009f }
                java.util.Iterator r4 = r4.iterator()     // Catch:{ ServiceConfigurationError -> 0x00a3, SecurityException -> 0x00a1, ClassNotFoundException -> 0x009f }
            L_0x001f:
                boolean r5 = r4.hasNext()     // Catch:{ ServiceConfigurationError -> 0x00a3, SecurityException -> 0x00a1, ClassNotFoundException -> 0x009f }
                if (r5 == 0) goto L_0x0076
                java.lang.Object r5 = r4.next()     // Catch:{ ServiceConfigurationError -> 0x005b, SecurityException -> 0x0059, ClassNotFoundException -> 0x009f }
                java.lang.String r6 = "6.3-81"
                boolean r7 = r5 instanceof p585re.C17587d     // Catch:{ ServiceConfigurationError -> 0x005b, SecurityException -> 0x0059, ClassNotFoundException -> 0x009f }
                if (r7 == 0) goto L_0x001f
                r7 = r5
                re.d r7 = (p585re.C17587d) r7     // Catch:{ ServiceConfigurationError -> 0x005b, SecurityException -> 0x0059, ClassNotFoundException -> 0x009f }
                java.lang.String r7 = r7.mo45140c()     // Catch:{ ServiceConfigurationError -> 0x005b, SecurityException -> 0x0059, ClassNotFoundException -> 0x009f }
                boolean r8 = com.threatmetrix.TrustDefender.C11923l.m43752j(r6, r7)     // Catch:{ ServiceConfigurationError -> 0x005b, SecurityException -> 0x0059, ClassNotFoundException -> 0x009f }
                if (r8 != 0) goto L_0x0055
                java.lang.String r5 = com.threatmetrix.TrustDefender.C11923l.f34882c     // Catch:{ ServiceConfigurationError -> 0x005b, SecurityException -> 0x0059, ClassNotFoundException -> 0x009f }
                java.lang.String r8 = "module {} version mismatch(expected {}, actual {})"
                r9 = 3
                java.lang.String[] r9 = new java.lang.String[r9]     // Catch:{ ServiceConfigurationError -> 0x005b, SecurityException -> 0x0059, ClassNotFoundException -> 0x009f }
                java.lang.Class r10 = r11.f34894d     // Catch:{ ServiceConfigurationError -> 0x005b, SecurityException -> 0x0059, ClassNotFoundException -> 0x009f }
                java.lang.String r10 = r10.getSimpleName()     // Catch:{ ServiceConfigurationError -> 0x005b, SecurityException -> 0x0059, ClassNotFoundException -> 0x009f }
                r9[r1] = r10     // Catch:{ ServiceConfigurationError -> 0x005b, SecurityException -> 0x0059, ClassNotFoundException -> 0x009f }
                r9[r0] = r6     // Catch:{ ServiceConfigurationError -> 0x005b, SecurityException -> 0x0059, ClassNotFoundException -> 0x009f }
                r9[r2] = r7     // Catch:{ ServiceConfigurationError -> 0x005b, SecurityException -> 0x0059, ClassNotFoundException -> 0x009f }
                com.threatmetrix.TrustDefender.C11907h.m43611f(r5, r8, r9)     // Catch:{ ServiceConfigurationError -> 0x005b, SecurityException -> 0x0059, ClassNotFoundException -> 0x009f }
                goto L_0x001f
            L_0x0055:
                r3.add(r5)     // Catch:{ ServiceConfigurationError -> 0x005b, SecurityException -> 0x0059, ClassNotFoundException -> 0x009f }
                goto L_0x001f
            L_0x0059:
                r5 = move-exception
                goto L_0x005c
            L_0x005b:
                r5 = move-exception
            L_0x005c:
                java.lang.String r6 = com.threatmetrix.TrustDefender.C11923l.f34882c     // Catch:{ ServiceConfigurationError -> 0x00a3, SecurityException -> 0x00a1, ClassNotFoundException -> 0x009f }
                java.lang.String r7 = "Failed to load module ({}): {}"
                java.lang.String[] r8 = new java.lang.String[r2]     // Catch:{ ServiceConfigurationError -> 0x00a3, SecurityException -> 0x00a1, ClassNotFoundException -> 0x009f }
                java.lang.Class r9 = r11.f34894d     // Catch:{ ServiceConfigurationError -> 0x00a3, SecurityException -> 0x00a1, ClassNotFoundException -> 0x009f }
                java.lang.String r9 = r9.getSimpleName()     // Catch:{ ServiceConfigurationError -> 0x00a3, SecurityException -> 0x00a1, ClassNotFoundException -> 0x009f }
                r8[r1] = r9     // Catch:{ ServiceConfigurationError -> 0x00a3, SecurityException -> 0x00a1, ClassNotFoundException -> 0x009f }
                java.lang.String r5 = r5.getMessage()     // Catch:{ ServiceConfigurationError -> 0x00a3, SecurityException -> 0x00a1, ClassNotFoundException -> 0x009f }
                r8[r0] = r5     // Catch:{ ServiceConfigurationError -> 0x00a3, SecurityException -> 0x00a1, ClassNotFoundException -> 0x009f }
                com.threatmetrix.TrustDefender.C11907h.m43612g(r6, r7, r8)     // Catch:{ ServiceConfigurationError -> 0x00a3, SecurityException -> 0x00a1, ClassNotFoundException -> 0x009f }
                goto L_0x001f
            L_0x0076:
                boolean r0 = r3.isEmpty()     // Catch:{ ServiceConfigurationError -> 0x00a3, SecurityException -> 0x00a1, ClassNotFoundException -> 0x009f }
                if (r0 != 0) goto L_0x00bd
                return r3
            L_0x007d:
                java.lang.ClassNotFoundException r3 = new java.lang.ClassNotFoundException     // Catch:{ ServiceConfigurationError -> 0x00a3, SecurityException -> 0x00a1, ClassNotFoundException -> 0x009f }
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ ServiceConfigurationError -> 0x00a3, SecurityException -> 0x00a1, ClassNotFoundException -> 0x009f }
                r4.<init>()     // Catch:{ ServiceConfigurationError -> 0x00a3, SecurityException -> 0x00a1, ClassNotFoundException -> 0x009f }
                java.lang.String r5 = "Failed to get "
                r4.append(r5)     // Catch:{ ServiceConfigurationError -> 0x00a3, SecurityException -> 0x00a1, ClassNotFoundException -> 0x009f }
                java.lang.Class r5 = r11.f34894d     // Catch:{ ServiceConfigurationError -> 0x00a3, SecurityException -> 0x00a1, ClassNotFoundException -> 0x009f }
                java.lang.String r5 = r5.getSimpleName()     // Catch:{ ServiceConfigurationError -> 0x00a3, SecurityException -> 0x00a1, ClassNotFoundException -> 0x009f }
                r4.append(r5)     // Catch:{ ServiceConfigurationError -> 0x00a3, SecurityException -> 0x00a1, ClassNotFoundException -> 0x009f }
                java.lang.String r5 = " class loader"
                r4.append(r5)     // Catch:{ ServiceConfigurationError -> 0x00a3, SecurityException -> 0x00a1, ClassNotFoundException -> 0x009f }
                java.lang.String r4 = r4.toString()     // Catch:{ ServiceConfigurationError -> 0x00a3, SecurityException -> 0x00a1, ClassNotFoundException -> 0x009f }
                r3.<init>(r4)     // Catch:{ ServiceConfigurationError -> 0x00a3, SecurityException -> 0x00a1, ClassNotFoundException -> 0x009f }
                throw r3     // Catch:{ ServiceConfigurationError -> 0x00a3, SecurityException -> 0x00a1, ClassNotFoundException -> 0x009f }
            L_0x009f:
                r3 = move-exception
                goto L_0x00a4
            L_0x00a1:
                r3 = move-exception
                goto L_0x00a4
            L_0x00a3:
                r3 = move-exception
            L_0x00a4:
                java.lang.String r4 = com.threatmetrix.TrustDefender.C11923l.f34882c
                java.lang.String[] r2 = new java.lang.String[r2]
                java.lang.Class r5 = r11.f34894d
                java.lang.String r5 = r5.getSimpleName()
                r2[r1] = r5
                java.lang.String r1 = r3.getMessage()
                r2[r0] = r1
                java.lang.String r0 = "Failed to configure service loader ({}): {}"
                com.threatmetrix.TrustDefender.C11907h.m43611f(r4, r0, r2)
            L_0x00bd:
                r0 = 0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.threatmetrix.TrustDefender.C11923l.C11925b.call():java.util.ArrayList");
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f34883d = hashMap;
        hashMap.put("MODULE_TYPE_AUTHENTICATION", 1L);
        hashMap.put("MODULE_TYPE_BIOMETRICS", 2L);
        hashMap.put("MODULE_TYPE_DEVICE_SECURITY", 4L);
    }

    /* renamed from: b */
    public static C11893e m43748b() {
        ArrayList k = m43753k(C11893e.class);
        if (k == null || k.isEmpty()) {
            return null;
        }
        return (C11893e) k.get(0);
    }

    /* renamed from: f */
    public static boolean m43750f(String str, C17598o oVar) {
        if (oVar == null) {
            return false;
        }
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1951042291:
                if (str.equals("MODULE_TYPE_BIOMETRICS")) {
                    c = 0;
                    break;
                }
                break;
            case -96285750:
                if (str.equals("MODULE_TYPE_AUTHENTICATION")) {
                    c = 1;
                    break;
                }
                break;
            case 1026190327:
                if (str.equals("MODULE_TYPE_DEVICE_SECURITY")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return true;
            case 1:
                return oVar instanceof C17600q;
            case 2:
                return oVar instanceof C17601r;
            default:
                return false;
        }
    }

    /* renamed from: g */
    private Map m43751g(String str, Context context) {
        Boolean valueOf;
        String str2;
        HashMap hashMap = new HashMap();
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1951042291:
                if (str.equals("MODULE_TYPE_BIOMETRICS")) {
                    c = 0;
                    break;
                }
                break;
            case -96285750:
                if (str.equals("MODULE_TYPE_AUTHENTICATION")) {
                    c = 1;
                    break;
                }
                break;
            case 1026190327:
                if (str.equals("MODULE_TYPE_DEVICE_SECURITY")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                hashMap.put("androidVersion", Integer.valueOf(C11969r1.C11983n.C11984a.f35247c));
                valueOf = Boolean.valueOf(C11969r1.C11986o.m44001a());
                str2 = "hasElapsedRealtimeNanos";
                break;
            case 1:
                hashMap.put("androidVersion", Integer.valueOf(C11969r1.C11983n.C11984a.f35247c));
                hashMap.put("isHardwareStrongIDCanSign", Boolean.valueOf(C11969r1.C11972c.m43953b()));
                hashMap.put("isHardwareStrongIDApi18Available", Boolean.valueOf(C11969r1.C11972c.m43954c()));
                valueOf = Boolean.valueOf(C11969r1.C11972c.m43952a());
                str2 = "isHardwareStrongIDApi23Available";
                break;
            case 2:
                hashMap.put("infoLoggingStatus", Boolean.valueOf(C11907h.m43613h()));
                hashMap.put("nonFatalLoggingStatus", Boolean.valueOf(C11907h.m43621p()));
                hashMap.put("androidVersion", Integer.valueOf(C11969r1.C11983n.C11984a.f35247c));
                valueOf = Boolean.valueOf(new C11969r1.C11975f(context).mo32040b());
                str2 = "canCallGetInstalledApplications";
                break;
            default:
                return hashMap;
        }
        hashMap.put(str2, valueOf);
        return hashMap;
    }

    /* renamed from: j */
    public static boolean m43752j(String str, String str2) {
        int indexOf;
        if (C11921k0.m43739v(str) || C11921k0.m43739v(str2) || (indexOf = str.indexOf(45)) <= 0) {
            return false;
        }
        return str.regionMatches(0, str2, 0, indexOf);
    }

    /* renamed from: k */
    private static ArrayList m43753k(Class cls) {
        try {
            return (ArrayList) Executors.newSingleThreadExecutor().submit(new C11925b(cls)).get();
        } catch (InterruptedException | ExecutionException e) {
            C11907h.m43612g(f34882c, "Failed to load module({}): {}", cls.getSimpleName(), e.getMessage());
            return null;
        }
    }

    /* renamed from: q */
    private C17598o m43754q(String str) {
        if (!this.f34884a.containsKey(str) || !m43750f(str, (C17598o) this.f34884a.get(str))) {
            return null;
        }
        return (C17598o) this.f34884a.get(str);
    }

    /* renamed from: a */
    public Map mo31966a(C11938n0 n0Var, long j, Map map) {
        C17598o q = m43754q("MODULE_TYPE_BIOMETRICS");
        if (!m43750f("MODULE_TYPE_BIOMETRICS", q)) {
            return null;
        }
        HashMap hashMap = new HashMap(16);
        hashMap.put("options", Long.valueOf(j));
        hashMap.put("uiDataDuration", Integer.valueOf(n0Var.f35026f));
        hashMap.put("uiDataInterval", Integer.valueOf(n0Var.f35027g));
        hashMap.put("uiDataPrecisionCount", Integer.valueOf(n0Var.f35028h));
        hashMap.put("uiDataTransmissionLimit", Integer.valueOf(n0Var.f35029i));
        hashMap.put("sensorDuration", Integer.valueOf(n0Var.f35030j));
        hashMap.put("sensorInterval", Integer.valueOf(n0Var.f35031k));
        hashMap.put("sensorPrecisionCount", Integer.valueOf(n0Var.f35032l));
        hashMap.put("sensorTransmissionSize", Integer.valueOf(n0Var.f35033m));
        hashMap.put("transmissionFrequency", Integer.valueOf(n0Var.f35034n));
        hashMap.put("bbShouldSendSensorRawData", Integer.valueOf(n0Var.f35035o));
        hashMap.put("bbShouldSendSensorStatsData", Integer.valueOf(n0Var.f35036p));
        hashMap.put("bbShouldSendUIRawData", Integer.valueOf(n0Var.f35037q));
        hashMap.put("bbShouldSendUIStatsData", Integer.valueOf(n0Var.f35038r));
        hashMap.put("sensorIntervalThreshold", Integer.valueOf(n0Var.f35039s));
        hashMap.putAll(map);
        return q.mo45172d(hashMap);
    }

    /* renamed from: d */
    public long mo31967d() {
        return this.f34885b;
    }

    /* renamed from: e */
    public List mo31968e(Context context) {
        ArrayList k = m43753k(C17586c.class);
        if (k == null) {
            C11907h.C11908a.m43631i(f34882c, "module list is null");
            return null;
        }
        Iterator it = k.iterator();
        if (!it.hasNext()) {
            ArrayList arrayList = new ArrayList();
            this.f34885b = 0;
            for (Map.Entry entry : this.f34884a.entrySet()) {
                C17598o oVar = (C17598o) entry.getValue();
                if (oVar != null) {
                    if (oVar.mo45176h(context, m43751g((String) entry.getKey(), context))) {
                        arrayList.add(oVar.mo45177i());
                        Map map = f34883d;
                        if (map.containsKey(entry.getKey())) {
                            Long l = (Long) map.get(entry.getKey());
                            if (l != null) {
                                this.f34885b |= l.longValue();
                            }
                            ((C17598o) entry.getValue()).mo45170b();
                        }
                    } else {
                        C11907h.m43611f(f34882c, "Failed to configure module({})", oVar.mo45177i());
                    }
                }
            }
            return arrayList;
        }
        C0125b.m366a(it.next());
        C11907h.C11908a.m43631i(f34882c, "init module");
        throw null;
    }

    /* renamed from: h */
    public Long mo31969h(String str, int i) {
        C17598o q = m43754q(str);
        if (m43750f(str, q)) {
            return q.mo45169a(i);
        }
        return 0L;
    }

    /* renamed from: i */
    public boolean mo31970i(C17603t tVar, C17592i iVar, peppep.C11953g gVar, long j, int i, C17588e eVar) {
        String str;
        String str2;
        peppep.C11953g gVar2 = gVar;
        C17598o q = m43754q("MODULE_TYPE_DEVICE_SECURITY");
        if (!(q instanceof C17601r)) {
            str = f34882c;
            str2 = "Invalid module";
        } else {
            boolean z = gVar2 == peppep.C11953g.INIT || gVar2 == peppep.C11953g.PROFILE;
            if (!z && (j & 12288) == 0) {
                str = f34882c;
                str2 = "Scan option is not enabled";
            } else if (!iVar.mo45149f(z)) {
                str = f34882c;
                str2 = "Scan already in progress or cancel requested, aborting";
            } else {
                new Thread(new C11924a(gVar, q, tVar, z, j, i, iVar, eVar)).start();
                return true;
            }
        }
        C11907h.C11908a.m43624b(str, str2);
        return false;
    }

    /* renamed from: l */
    public Set mo31971l() {
        HashSet hashSet = new HashSet();
        for (Map.Entry value : this.f34884a.entrySet()) {
            C17598o oVar = (C17598o) value.getValue();
            if (oVar != null && oVar.mo45174f()) {
                hashSet.addAll(oVar.mo45171c());
            }
        }
        return hashSet;
    }

    /* renamed from: m */
    public String mo31972m(String str) {
        C17598o q = m43754q(str);
        if (m43750f(str, q)) {
            return q.mo45173e();
        }
        return null;
    }

    /* renamed from: n */
    public Map mo31973n(long j) {
        C17598o q = m43754q("MODULE_TYPE_DEVICE_SECURITY");
        if (!m43750f("MODULE_TYPE_DEVICE_SECURITY", q)) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("options", Long.valueOf(j));
        return q.mo45172d(hashMap);
    }

    /* renamed from: o */
    public boolean mo31974o() {
        for (Map.Entry value : this.f34884a.entrySet()) {
            C17598o oVar = (C17598o) value.getValue();
            if (oVar != null && oVar.mo45175g()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: p */
    public C17600q mo31975p() {
        C17598o q = m43754q("MODULE_TYPE_AUTHENTICATION");
        if (q == null || !q.mo45174f()) {
            return null;
        }
        return (C17600q) q;
    }
}
