package qe1;

import kotlin.jvm.internal.C41536l;
import pe1.C42190a;

/* renamed from: qe1.a */
public class C42348a extends C42190a {

    /* renamed from: qe1.a$a */
    private static final class C42349a {

        /* renamed from: a */
        public static final C42349a f99570a = new C42349a();

        /* renamed from: b */
        public static final Integer f99571b;

        /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
        static {
            /*
                qe1.a$a r0 = new qe1.a$a
                r0.<init>()
                f99570a = r0
                r0 = 0
                java.lang.String r1 = "android.os.Build$VERSION"
                java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ all -> 0x001f }
                java.lang.String r2 = "SDK_INT"
                java.lang.reflect.Field r1 = r1.getField(r2)     // Catch:{ all -> 0x001f }
                java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x001f }
                boolean r2 = r1 instanceof java.lang.Integer     // Catch:{ all -> 0x001f }
                if (r2 == 0) goto L_0x001f
                java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x001f }
                goto L_0x0020
            L_0x001f:
                r1 = r0
            L_0x0020:
                if (r1 == 0) goto L_0x002e
                int r2 = r1.intValue()
                if (r2 <= 0) goto L_0x002a
                r2 = 1
                goto L_0x002b
            L_0x002a:
                r2 = 0
            L_0x002b:
                if (r2 == 0) goto L_0x002e
                r0 = r1
            L_0x002e:
                f99571b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: qe1.C42348a.C42349a.<clinit>():void");
        }

        private C42349a() {
        }
    }

    /* renamed from: c */
    private final boolean m122824c(int i) {
        Integer num = C42349a.f99571b;
        return num == null || num.intValue() >= i;
    }

    /* renamed from: a */
    public void mo97667a(Throwable th, Throwable th2) {
        C41536l.m120489i(th, "cause");
        C41536l.m120489i(th2, "exception");
        if (m122824c(19)) {
            th.addSuppressed(th2);
        } else {
            super.mo97667a(th, th2);
        }
    }
}
