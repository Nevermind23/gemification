package com.medallia.digital.mobilesdk;

import android.util.Log;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: com.medallia.digital.mobilesdk.b4 */
final class C10735b4 implements C10769c8 {

    /* renamed from: d */
    private static final String f30689d = "com.medallia.digital";

    /* renamed from: e */
    private static final int f30690e = 3;

    /* renamed from: f */
    protected static C10735b4 f30691f;

    /* renamed from: a */
    private final SimpleDateFormat f30692a = new SimpleDateFormat("dd-MM HH:mm:ss.SSS", Locale.US);

    /* renamed from: b */
    private MDLogLevel f30693b = MDLogLevel.OFF;

    /* renamed from: c */
    private C10737b f30694c;

    /* renamed from: com.medallia.digital.mobilesdk.b4$a */
    static /* synthetic */ class C10736a {

        /* renamed from: a */
        static final /* synthetic */ int[] f30695a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.medallia.digital.mobilesdk.MDLogLevel[] r0 = com.medallia.digital.mobilesdk.MDLogLevel.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f30695a = r0
                com.medallia.digital.mobilesdk.MDLogLevel r1 = com.medallia.digital.mobilesdk.MDLogLevel.DEBUG     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f30695a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.medallia.digital.mobilesdk.MDLogLevel r1 = com.medallia.digital.mobilesdk.MDLogLevel.INFO     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f30695a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.medallia.digital.mobilesdk.MDLogLevel r1 = com.medallia.digital.mobilesdk.MDLogLevel.WARN     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f30695a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.medallia.digital.mobilesdk.MDLogLevel r1 = com.medallia.digital.mobilesdk.MDLogLevel.ERROR     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f30695a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.medallia.digital.mobilesdk.MDLogLevel r1 = com.medallia.digital.mobilesdk.MDLogLevel.FATAL     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.medallia.digital.mobilesdk.C10735b4.C10736a.<clinit>():void");
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.b4$b */
    protected interface C10737b {
        /* renamed from: a */
        void mo28121a(String str);
    }

    private C10735b4() {
    }

    /* renamed from: a */
    protected static C10735b4 m39105a() {
        if (f30691f == null) {
            f30691f = new C10735b4();
        }
        return f30691f;
    }

    /* renamed from: b */
    private void m39108b(MDLogLevel mDLogLevel, String str) {
        if (!this.f30693b.equals(MDLogLevel.OFF) && this.f30693b.getLevel() >= mDLogLevel.getLevel()) {
            String a = m39106a(mDLogLevel, str);
            m39110c(mDLogLevel, a);
            C10737b bVar = this.f30694c;
            if (bVar != null) {
                bVar.mo28121a(a);
            }
        }
    }

    /* renamed from: c */
    private void m39110c(MDLogLevel mDLogLevel, String str) {
        int i = C10736a.f30695a[mDLogLevel.ordinal()];
        if (i == 1) {
            Log.d(f30689d, str);
        } else if (i == 2) {
            Log.i(f30689d, str);
        } else if (i == 3) {
            Log.w(f30689d, str);
        } else if (i == 4) {
            Log.e(f30689d, str);
        } else if (i == 5) {
            Log.wtf(f30689d, str);
        }
    }

    /* renamed from: d */
    public static void m39112d(String str) {
        m39105a().m39108b(MDLogLevel.FATAL, str);
    }

    /* renamed from: e */
    public static void m39113e(String str) {
        m39105a().m39108b(MDLogLevel.INFO, str);
    }

    /* renamed from: f */
    public static void m39114f(String str) {
        m39105a().m39108b(MDLogLevel.WARN, str);
    }

    public void clearAndDisconnect() {
        m39107a(C10735b4.class.getSimpleName());
        f30691f = null;
    }

    /* renamed from: a */
    private String m39106a(MDLogLevel mDLogLevel, String str) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[3];
        return String.format(Locale.US, "%s [%s][%s][%s:%d]%s> %s", new Object[]{this.f30692a.format(new Date()), mDLogLevel.toString(), Thread.currentThread(), stackTraceElement.getFileName(), Integer.valueOf(stackTraceElement.getLineNumber()), stackTraceElement.getMethodName(), str});
    }

    /* renamed from: b */
    public static void m39109b(String str) {
        m39105a().m39108b(MDLogLevel.DEBUG, str);
    }

    /* renamed from: c */
    public static void m39111c(String str) {
        m39105a().m39108b(MDLogLevel.ERROR, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28119a(MDLogLevel mDLogLevel) {
        this.f30693b = mDLogLevel;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28120a(C10737b bVar) {
        this.f30694c = bVar;
    }

    /* renamed from: a */
    public static void m39107a(String str) {
        C10735b4 a = m39105a();
        MDLogLevel mDLogLevel = MDLogLevel.DEBUG;
        a.m39108b(mDLogLevel, "Clear and Disconnect - " + str);
    }
}
