package p297w4;

import com.facebook.C2626d;
import com.salesforce.marketingcloud.messages.iam.C11651j;
import java.util.HashMap;
import java.util.Map;
import p297w4.C8813l;

/* renamed from: w4.k */
public abstract class C8808k {

    /* renamed from: a */
    private static final Map f24706a = new HashMap();

    /* renamed from: w4.k$a */
    static class C8809a implements C8813l.C8816c {

        /* renamed from: a */
        final /* synthetic */ C8811c f24707a;

        /* renamed from: b */
        final /* synthetic */ C8812d f24708b;

        C8809a(C8811c cVar, C8812d dVar) {
            this.f24707a = cVar;
            this.f24708b = dVar;
        }

        /* renamed from: a */
        public void mo24232a() {
            this.f24707a.mo8159a(C8808k.m32797g(this.f24708b));
        }
    }

    /* renamed from: w4.k$b */
    static /* synthetic */ class C8810b {

        /* renamed from: a */
        static final /* synthetic */ int[] f24709a;

        /* JADX WARNING: Can't wrap try/catch for region: R(48:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|48) */
        /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00d8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00e4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00f0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00fc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x0108 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                w4.k$d[] r0 = p297w4.C8808k.C8812d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f24709a = r0
                w4.k$d r1 = p297w4.C8808k.C8812d.RestrictiveDataFiltering     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f24709a     // Catch:{ NoSuchFieldError -> 0x001d }
                w4.k$d r1 = p297w4.C8808k.C8812d.Instrument     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f24709a     // Catch:{ NoSuchFieldError -> 0x0028 }
                w4.k$d r1 = p297w4.C8808k.C8812d.CrashReport     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f24709a     // Catch:{ NoSuchFieldError -> 0x0033 }
                w4.k$d r1 = p297w4.C8808k.C8812d.CrashShield     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f24709a     // Catch:{ NoSuchFieldError -> 0x003e }
                w4.k$d r1 = p297w4.C8808k.C8812d.ThreadCheck     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f24709a     // Catch:{ NoSuchFieldError -> 0x0049 }
                w4.k$d r1 = p297w4.C8808k.C8812d.ErrorReport     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f24709a     // Catch:{ NoSuchFieldError -> 0x0054 }
                w4.k$d r1 = p297w4.C8808k.C8812d.AAM     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f24709a     // Catch:{ NoSuchFieldError -> 0x0060 }
                w4.k$d r1 = p297w4.C8808k.C8812d.PrivacyProtection     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f24709a     // Catch:{ NoSuchFieldError -> 0x006c }
                w4.k$d r1 = p297w4.C8808k.C8812d.SuggestedEvents     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f24709a     // Catch:{ NoSuchFieldError -> 0x0078 }
                w4.k$d r1 = p297w4.C8808k.C8812d.IntelligentIntegrity     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f24709a     // Catch:{ NoSuchFieldError -> 0x0084 }
                w4.k$d r1 = p297w4.C8808k.C8812d.ModelRequest     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f24709a     // Catch:{ NoSuchFieldError -> 0x0090 }
                w4.k$d r1 = p297w4.C8808k.C8812d.EventDeactivation     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f24709a     // Catch:{ NoSuchFieldError -> 0x009c }
                w4.k$d r1 = p297w4.C8808k.C8812d.OnDeviceEventProcessing     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f24709a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                w4.k$d r1 = p297w4.C8808k.C8812d.OnDevicePostInstallEventProcessing     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f24709a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                w4.k$d r1 = p297w4.C8808k.C8812d.ChromeCustomTabsPrefetching     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f24709a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                w4.k$d r1 = p297w4.C8808k.C8812d.Monitoring     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f24709a     // Catch:{ NoSuchFieldError -> 0x00cc }
                w4.k$d r1 = p297w4.C8808k.C8812d.IgnoreAppSwitchToLoggedOut     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r0 = f24709a     // Catch:{ NoSuchFieldError -> 0x00d8 }
                w4.k$d r1 = p297w4.C8808k.C8812d.Core     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r2 = 18
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                int[] r0 = f24709a     // Catch:{ NoSuchFieldError -> 0x00e4 }
                w4.k$d r1 = p297w4.C8808k.C8812d.AppEvents     // Catch:{ NoSuchFieldError -> 0x00e4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e4 }
                r2 = 19
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00e4 }
            L_0x00e4:
                int[] r0 = f24709a     // Catch:{ NoSuchFieldError -> 0x00f0 }
                w4.k$d r1 = p297w4.C8808k.C8812d.CodelessEvents     // Catch:{ NoSuchFieldError -> 0x00f0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f0 }
                r2 = 20
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00f0 }
            L_0x00f0:
                int[] r0 = f24709a     // Catch:{ NoSuchFieldError -> 0x00fc }
                w4.k$d r1 = p297w4.C8808k.C8812d.Login     // Catch:{ NoSuchFieldError -> 0x00fc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fc }
                r2 = 21
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00fc }
            L_0x00fc:
                int[] r0 = f24709a     // Catch:{ NoSuchFieldError -> 0x0108 }
                w4.k$d r1 = p297w4.C8808k.C8812d.Share     // Catch:{ NoSuchFieldError -> 0x0108 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0108 }
                r2 = 22
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0108 }
            L_0x0108:
                int[] r0 = f24709a     // Catch:{ NoSuchFieldError -> 0x0114 }
                w4.k$d r1 = p297w4.C8808k.C8812d.Places     // Catch:{ NoSuchFieldError -> 0x0114 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0114 }
                r2 = 23
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0114 }
            L_0x0114:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p297w4.C8808k.C8810b.<clinit>():void");
        }
    }

    /* renamed from: w4.k$c */
    public interface C8811c {
        /* renamed from: a */
        void mo8159a(boolean z);
    }

    /* renamed from: w4.k$d */
    public enum C8812d {
        Unknown(-1),
        Core(0),
        AppEvents(65536),
        CodelessEvents(65792),
        RestrictiveDataFiltering(66048),
        AAM(66304),
        PrivacyProtection(66560),
        SuggestedEvents(66561),
        IntelligentIntegrity(66562),
        ModelRequest(66563),
        EventDeactivation(66816),
        OnDeviceEventProcessing(67072),
        OnDevicePostInstallEventProcessing(67073),
        Instrument(131072),
        CrashReport(131328),
        CrashShield(131329),
        ThreadCheck(131330),
        ErrorReport(131584),
        Monitoring(196608),
        Login(16777216),
        ChromeCustomTabsPrefetching(16842752),
        IgnoreAppSwitchToLoggedOut(16908288),
        Share(33554432),
        Places(50331648);
        

        /* renamed from: d */
        private final int f24735d;

        private C8812d(int i) {
            this.f24735d = i;
        }

        /* renamed from: a */
        static C8812d m32800a(int i) {
            for (C8812d dVar : values()) {
                if (dVar.f24735d == i) {
                    return dVar;
                }
            }
            return Unknown;
        }

        /* renamed from: b */
        public C8812d mo24233b() {
            int i = this.f24735d;
            if ((i & C11051p3.f31759c) > 0) {
                return m32800a(i & -256);
            }
            if ((65280 & i) > 0) {
                return m32800a(i & -65536);
            }
            if ((16711680 & i) > 0) {
                return m32800a(i & -16777216);
            }
            return m32800a(0);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public String mo24234c() {
            return "FBSDKFeature" + toString();
        }

        public String toString() {
            switch (C8810b.f24709a[ordinal()]) {
                case 1:
                    return "RestrictiveDataFiltering";
                case 2:
                    return "Instrument";
                case 3:
                    return "CrashReport";
                case 4:
                    return "CrashShield";
                case 5:
                    return "ThreadCheck";
                case 6:
                    return "ErrorReport";
                case 7:
                    return "AAM";
                case 8:
                    return "PrivacyProtection";
                case 9:
                    return "SuggestedEvents";
                case 10:
                    return "IntelligentIntegrity";
                case 11:
                    return "ModelRequest";
                case 12:
                    return "EventDeactivation";
                case 13:
                    return "OnDeviceEventProcessing";
                case 14:
                    return "OnDevicePostInstallEventProcessing";
                case 15:
                    return "ChromeCustomTabsPrefetching";
                case 16:
                    return "Monitoring";
                case 17:
                    return "IgnoreAppSwitchToLoggedOut";
                case 18:
                    return "CoreKit";
                case 19:
                    return "AppEvents";
                case 20:
                    return "CodelessEvents";
                case 21:
                    return "LoginKit";
                case 22:
                    return "ShareKit";
                case 23:
                    return "PlacesKit";
                default:
                    return C11651j.f33767h;
            }
        }
    }

    /* renamed from: a */
    public static void m32791a(C8812d dVar, C8811c cVar) {
        C8813l.m32812j(new C8809a(cVar, dVar));
    }

    /* renamed from: b */
    private static boolean m32792b(C8812d dVar) {
        switch (C8810b.f24709a[dVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                return false;
            default:
                return true;
        }
    }

    /* renamed from: c */
    public static void m32793c(C8812d dVar) {
        C2626d.m10134e().getSharedPreferences("com.facebook.internal.FEATURE_MANAGER", 0).edit().putString(dVar.mo24234c(), C2626d.m10149t()).apply();
    }

    /* renamed from: d */
    public static C8812d m32794d(String str) {
        m32796f();
        for (Map.Entry entry : f24706a.entrySet()) {
            String[] strArr = (String[]) entry.getValue();
            int length = strArr.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    if (str.startsWith(strArr[i])) {
                        return (C8812d) entry.getKey();
                    }
                    i++;
                }
            }
        }
        return C8812d.Unknown;
    }

    /* renamed from: e */
    private static boolean m32795e(C8812d dVar) {
        return C8813l.m32808f(dVar.mo24234c(), C2626d.m10135f(), m32792b(dVar));
    }

    /* renamed from: f */
    private static synchronized void m32796f() {
        synchronized (C8808k.class) {
            Map map = f24706a;
            if (map.isEmpty()) {
                map.put(C8812d.AAM, new String[]{"com.facebook.appevents.aam."});
                map.put(C8812d.CodelessEvents, new String[]{"com.facebook.appevents.codeless."});
                map.put(C8812d.ErrorReport, new String[]{"com.facebook.internal.instrument.errorreport."});
                map.put(C8812d.PrivacyProtection, new String[]{"com.facebook.appevents.ml."});
                map.put(C8812d.SuggestedEvents, new String[]{"com.facebook.appevents.suggestedevents."});
                map.put(C8812d.RestrictiveDataFiltering, new String[]{"com.facebook.appevents.restrictivedatafilter.RestrictiveDataManager"});
                map.put(C8812d.IntelligentIntegrity, new String[]{"com.facebook.appevents.integrity.IntegrityManager"});
                map.put(C8812d.EventDeactivation, new String[]{"com.facebook.appevents.eventdeactivation."});
                map.put(C8812d.OnDeviceEventProcessing, new String[]{"com.facebook.appevents.ondeviceprocessing."});
                map.put(C8812d.Monitoring, new String[]{"com.facebook.internal.logging.monitor"});
            }
        }
    }

    /* renamed from: g */
    public static boolean m32797g(C8812d dVar) {
        if (C8812d.Unknown == dVar) {
            return false;
        }
        if (C8812d.Core == dVar) {
            return true;
        }
        String string = C2626d.m10134e().getSharedPreferences("com.facebook.internal.FEATURE_MANAGER", 0).getString(dVar.mo24234c(), (String) null);
        if (string != null && string.equals(C2626d.m10149t())) {
            return false;
        }
        C8812d b = dVar.mo24233b();
        if (b == dVar) {
            return m32795e(dVar);
        }
        if (!m32797g(b) || !m32795e(dVar)) {
            return false;
        }
        return true;
    }
}
