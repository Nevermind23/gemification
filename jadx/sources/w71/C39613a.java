package w71;

import java.text.SimpleDateFormat;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: w71.a */
public final class C39613a {

    /* renamed from: a */
    public static final C39614a f94122a = new C39614a((DefaultConstructorMarker) null);

    /* renamed from: b */
    private static final SimpleDateFormat f94123b = new SimpleDateFormat("dd.MM.yyyy HH:mm");

    /* renamed from: w71.a$a */
    public static final class C39614a {
        private C39614a() {
        }

        public /* synthetic */ C39614a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: w71.a$b */
    public /* synthetic */ class C39615b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f94124a;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                j71.i[] r0 = j71.C36756i.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                j71.i r1 = j71.C36756i.E     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                j71.i r1 = j71.C36756i.C     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                j71.i r1 = j71.C36756i.D     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                j71.i r1 = j71.C36756i.S     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f94124a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: w71.C39613a.C39615b.<clinit>():void");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0185, code lost:
        if (r4 == false) goto L_0x018a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0122  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p341ge.bog.mobilebank.transportcard.presentation.transportcardinfo.C35129a.C35132c mo93273a(java.util.List r22, java.util.List r23) {
        /*
            r21 = this;
            r0 = r23
            java.lang.String r1 = "activeCards"
            r2 = r22
            kotlin.jvm.internal.C41536l.m120489i(r2, r1)
            java.lang.String r1 = "migratedPassDevices"
            kotlin.jvm.internal.C41536l.m120489i(r0, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r22.iterator()
        L_0x001c:
            boolean r4 = r2.hasNext()
            r5 = 1
            if (r4 == 0) goto L_0x0039
            java.lang.Object r4 = r2.next()
            r6 = r4
            j71.c r6 = (j71.C36750c) r6
            java.util.List r6 = r6.mo89590a()
            boolean r6 = r6.isEmpty()
            r5 = r5 ^ r6
            if (r5 == 0) goto L_0x001c
            r3.add(r4)
            goto L_0x001c
        L_0x0039:
            java.util.Iterator r2 = r3.iterator()
        L_0x003d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x01da
            java.lang.Object r3 = r2.next()
            j71.c r3 = (j71.C36750c) r3
            long r7 = r3.mo89591b()
            long r9 = r3.mo89598h()
            java.util.List r4 = r3.mo89590a()
            java.util.ArrayList r11 = new java.util.ArrayList
            r6 = 10
            int r6 = ie1.C41343r.m119925u(r4, r6)
            r11.<init>(r6)
            java.util.Iterator r4 = r4.iterator()
        L_0x0064:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x009a
            java.lang.Object r6 = r4.next()
            j71.b r6 = (j71.C36749b) r6
            v71.e r12 = new v71.e
            java.lang.String r13 = r6.mo89585b()
            java.text.SimpleDateFormat r14 = f94123b
            java.util.Date r15 = r6.mo89586c()
            java.lang.String r15 = r14.format(r15)
            java.lang.String r5 = "DATE_FORMAT.format(activePass.startDate)"
            kotlin.jvm.internal.C41536l.m120488h(r15, r5)
            java.util.Date r5 = r6.mo89584a()
            java.lang.String r5 = r14.format(r5)
            java.lang.String r6 = "DATE_FORMAT.format(activePass.endDate)"
            kotlin.jvm.internal.C41536l.m120488h(r5, r6)
            r12.<init>(r13, r15, r5)
            r11.add(r12)
            r5 = 1
            goto L_0x0064
        L_0x009a:
            java.lang.String r12 = r3.mo89597g()
            java.lang.String r13 = r3.mo89593d()
            java.lang.String r14 = r3.mo89594e()
            j71.i r4 = r3.mo89601j()
            j71.i r5 = j71.C36756i.P
            if (r4 != r5) goto L_0x00b0
            r15 = r5
            goto L_0x00b5
        L_0x00b0:
            j71.i r4 = r3.mo89596f()
            r15 = r4
        L_0x00b5:
            j71.i r4 = r3.mo89596f()
            j71.i r5 = j71.C36756i.A
            if (r4 == r5) goto L_0x00ec
            boolean r4 = r0 instanceof java.util.Collection
            if (r4 == 0) goto L_0x00c9
            boolean r4 = r23.isEmpty()
            if (r4 == 0) goto L_0x00c9
        L_0x00c7:
            r6 = 0
            goto L_0x00e8
        L_0x00c9:
            java.util.Iterator r4 = r23.iterator()
        L_0x00cd:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x00c7
            java.lang.Object r5 = r4.next()
            j71.a r5 = (j71.C36748a) r5
            java.util.List r5 = r5.mo89582i()
            boolean r5 = r5.isEmpty()
            r16 = 1
            r5 = r5 ^ 1
            if (r5 == 0) goto L_0x00cd
            r6 = 1
        L_0x00e8:
            r16 = r6
            goto L_0x018c
        L_0x00ec:
            j71.i r4 = r3.mo89596f()
            if (r4 != r5) goto L_0x018a
            boolean r4 = r0 instanceof java.util.Collection
            if (r4 == 0) goto L_0x00fe
            boolean r4 = r23.isEmpty()
            if (r4 == 0) goto L_0x00fe
        L_0x00fc:
            r4 = 0
            goto L_0x0120
        L_0x00fe:
            java.util.Iterator r4 = r23.iterator()
        L_0x0102:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x00fc
            java.lang.Object r5 = r4.next()
            j71.a r5 = (j71.C36748a) r5
            long r16 = r5.mo89574c()
            long r18 = r3.mo89591b()
            int r5 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r5 == 0) goto L_0x011c
            r5 = 1
            goto L_0x011d
        L_0x011c:
            r5 = 0
        L_0x011d:
            if (r5 == 0) goto L_0x0102
            r4 = 1
        L_0x0120:
            if (r4 != 0) goto L_0x0187
            java.util.Iterator r4 = r23.iterator()
        L_0x0126:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0148
            java.lang.Object r5 = r4.next()
            r16 = r5
            j71.a r16 = (j71.C36748a) r16
            long r16 = r16.mo89574c()
            long r18 = r3.mo89591b()
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 != 0) goto L_0x0143
            r16 = 1
            goto L_0x0145
        L_0x0143:
            r16 = 0
        L_0x0145:
            if (r16 == 0) goto L_0x0126
            goto L_0x0149
        L_0x0148:
            r5 = 0
        L_0x0149:
            j71.a r5 = (j71.C36748a) r5
            if (r5 == 0) goto L_0x0184
            java.util.List r4 = r5.mo89582i()
            if (r4 == 0) goto L_0x0184
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L_0x015c
            r4 = 0
            r6 = 1
            goto L_0x0180
        L_0x015c:
            java.util.Iterator r4 = r4.iterator()
        L_0x0160:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x017e
            java.lang.Object r5 = r4.next()
            j71.f r5 = (j71.C36753f) r5
            java.lang.String r5 = r5.mo89614a()
            java.lang.String r6 = r3.mo89593d()
            boolean r5 = kotlin.jvm.internal.C41536l.m120484d(r5, r6)
            r6 = 1
            r5 = r5 ^ r6
            if (r5 == 0) goto L_0x0160
            r4 = r6
            goto L_0x0180
        L_0x017e:
            r6 = 1
            r4 = 0
        L_0x0180:
            if (r4 != r6) goto L_0x0184
            r4 = 1
            goto L_0x0185
        L_0x0184:
            r4 = 0
        L_0x0185:
            if (r4 == 0) goto L_0x018a
        L_0x0187:
            r16 = 1
            goto L_0x018c
        L_0x018a:
            r16 = 0
        L_0x018c:
            boolean r17 = r3.mo89602k()
            j71.d r4 = r3.mo89592c()
            java.lang.String r4 = r4.mo89604a()
            java.lang.String r5 = ""
            if (r4 != 0) goto L_0x019f
            r18 = r5
            goto L_0x01a1
        L_0x019f:
            r18 = r4
        L_0x01a1:
            j71.i r4 = r3.mo89596f()
            int[] r6 = w71.C39613a.C39615b.f94124a
            int r4 = r4.ordinal()
            r4 = r6[r4]
            r6 = 1
            if (r4 == r6) goto L_0x01c5
            r6 = 2
            if (r4 == r6) goto L_0x01c2
            r6 = 3
            if (r4 == r6) goto L_0x01bf
            r6 = 4
            if (r4 == r6) goto L_0x01bc
            r19 = r5
            goto L_0x01c9
        L_0x01bc:
            java.lang.String r4 = "tcc.device.status.S"
            goto L_0x01c7
        L_0x01bf:
            java.lang.String r4 = "tcc.device.status.D"
            goto L_0x01c7
        L_0x01c2:
            java.lang.String r4 = "tcc.device.status.C"
            goto L_0x01c7
        L_0x01c5:
            java.lang.String r4 = "tcc.device.status.E"
        L_0x01c7:
            r19 = r4
        L_0x01c9:
            java.lang.String r20 = r3.mo89600i()
            v71.a r3 = new v71.a
            r4 = 1
            r6 = r3
            r6.<init>(r7, r9, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r1.add(r3)
            r5 = r4
            goto L_0x003d
        L_0x01da:
            ge.bog.mobilebank.transportcard.presentation.transportcardinfo.a$c r0 = new ge.bog.mobilebank.transportcard.presentation.transportcardinfo.a$c
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: w71.C39613a.mo93273a(java.util.List, java.util.List):ge.bog.mobilebank.transportcard.presentation.transportcardinfo.a$c");
    }
}
