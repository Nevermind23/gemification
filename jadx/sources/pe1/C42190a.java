package pe1;

import java.lang.reflect.Method;
import kotlin.jvm.internal.C41536l;
import xe1.C43261b;
import xe1.C43263c;

/* renamed from: pe1.a */
public class C42190a {

    /* renamed from: pe1.a$a */
    private static final class C42191a {

        /* renamed from: a */
        public static final C42191a f99257a = new C42191a();

        /* renamed from: b */
        public static final Method f99258b;

        /* renamed from: c */
        public static final Method f99259c;

        /* JADX WARNING: Removed duplicated region for block: B:10:0x003f A[LOOP:0: B:1:0x0015->B:10:0x003f, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0043 A[EDGE_INSN: B:21:0x0043->B:12:0x0043 ?: BREAK  , SYNTHETIC] */
        static {
            /*
                pe1.a$a r0 = new pe1.a$a
                r0.<init>()
                f99257a = r0
                java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
                java.lang.reflect.Method[] r1 = r0.getMethods()
                java.lang.String r2 = "throwableMethods"
                kotlin.jvm.internal.C41536l.m120488h(r1, r2)
                int r2 = r1.length
                r3 = 0
                r4 = r3
            L_0x0015:
                r5 = 0
                if (r4 >= r2) goto L_0x0042
                r6 = r1[r4]
                java.lang.String r7 = r6.getName()
                java.lang.String r8 = "addSuppressed"
                boolean r7 = kotlin.jvm.internal.C41536l.m120484d(r7, r8)
                if (r7 == 0) goto L_0x003b
                java.lang.Class[] r7 = r6.getParameterTypes()
                java.lang.String r8 = "it.parameterTypes"
                kotlin.jvm.internal.C41536l.m120488h(r7, r8)
                java.lang.Object r7 = ie1.C41333m.m119784K(r7)
                boolean r7 = kotlin.jvm.internal.C41536l.m120484d(r7, r0)
                if (r7 == 0) goto L_0x003b
                r7 = 1
                goto L_0x003c
            L_0x003b:
                r7 = r3
            L_0x003c:
                if (r7 == 0) goto L_0x003f
                goto L_0x0043
            L_0x003f:
                int r4 = r4 + 1
                goto L_0x0015
            L_0x0042:
                r6 = r5
            L_0x0043:
                f99258b = r6
                int r0 = r1.length
            L_0x0046:
                if (r3 >= r0) goto L_0x005b
                r2 = r1[r3]
                java.lang.String r4 = r2.getName()
                java.lang.String r6 = "getSuppressed"
                boolean r4 = kotlin.jvm.internal.C41536l.m120484d(r4, r6)
                if (r4 == 0) goto L_0x0058
                r5 = r2
                goto L_0x005b
            L_0x0058:
                int r3 = r3 + 1
                goto L_0x0046
            L_0x005b:
                f99259c = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: pe1.C42190a.C42191a.<clinit>():void");
        }

        private C42191a() {
        }
    }

    /* renamed from: a */
    public void mo97667a(Throwable th, Throwable th2) {
        C41536l.m120489i(th, "cause");
        C41536l.m120489i(th2, "exception");
        Method method = C42191a.f99258b;
        if (method != null) {
            method.invoke(th, new Object[]{th2});
        }
    }

    /* renamed from: b */
    public C43263c mo97668b() {
        return new C43261b();
    }
}
