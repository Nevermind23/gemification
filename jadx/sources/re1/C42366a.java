package re1;

import qe1.C42348a;
import xe1.C43263c;
import ye1.C43373a;

/* renamed from: re1.a */
public class C42366a extends C42348a {

    /* renamed from: re1.a$a */
    private static final class C42367a {

        /* renamed from: a */
        public static final C42367a f99605a = new C42367a();

        /* renamed from: b */
        public static final Integer f99606b;

        /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
        static {
            /*
                re1.a$a r0 = new re1.a$a
                r0.<init>()
                f99605a = r0
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
                f99606b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: re1.C42366a.C42367a.<clinit>():void");
        }

        private C42367a() {
        }
    }

    /* renamed from: c */
    private final boolean m122878c(int i) {
        Integer num = C42367a.f99606b;
        return num == null || num.intValue() >= i;
    }

    /* renamed from: b */
    public C43263c mo97668b() {
        return m122878c(34) ? new C43373a() : super.mo97668b();
    }
}
