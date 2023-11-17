package ie1;

import bf1.C40344i;
import he1.C41238w;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C41536l;
import oe1.C41861k;
import ue1.C43079p;

/* renamed from: ie1.z0 */
public abstract class C41363z0 {

    /* renamed from: ie1.z0$a */
    static final class C41364a extends C41861k implements C43079p {

        /* renamed from: f */
        Object f97395f;

        /* renamed from: g */
        Object f97396g;

        /* renamed from: h */
        int f97397h;

        /* renamed from: i */
        int f97398i;

        /* renamed from: j */
        private /* synthetic */ Object f97399j;

        /* renamed from: k */
        final /* synthetic */ int f97400k;

        /* renamed from: l */
        final /* synthetic */ int f97401l;

        /* renamed from: m */
        final /* synthetic */ Iterator f97402m;

        /* renamed from: n */
        final /* synthetic */ boolean f97403n;

        /* renamed from: o */
        final /* synthetic */ boolean f97404o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41364a(int i, int i2, Iterator it, boolean z, boolean z2, Continuation continuation) {
            super(2, continuation);
            this.f97400k = i;
            this.f97401l = i2;
            this.f97402m = it;
            this.f97403n = z;
            this.f97404o = z2;
        }

        /* renamed from: a */
        public final Continuation mo3708a(Object obj, Continuation continuation) {
            C41364a aVar = new C41364a(this.f97400k, this.f97401l, this.f97402m, this.f97403n, this.f97404o, continuation);
            aVar.f97399j = obj;
            return aVar;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x00ec  */
        /* JADX WARNING: Removed duplicated region for block: B:59:0x012a  */
        /* JADX WARNING: Removed duplicated region for block: B:62:0x0134  */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x0126 A[SYNTHETIC] */
        /* renamed from: f */
        public final java.lang.Object mo3709f(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = ne1.C41793d.m121157c()
                int r1 = r11.f97398i
                r2 = 5
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                r7 = 0
                if (r1 == 0) goto L_0x005a
                if (r1 == r6) goto L_0x0046
                if (r1 == r5) goto L_0x0041
                if (r1 == r4) goto L_0x002f
                if (r1 == r3) goto L_0x0021
                if (r1 != r2) goto L_0x0019
                goto L_0x0041
            L_0x0019:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L_0x0021:
                java.lang.Object r1 = r11.f97395f
                ie1.u0 r1 = (ie1.C41350u0) r1
                java.lang.Object r4 = r11.f97399j
                bf1.i r4 = (bf1.C40344i) r4
                he1.C41228o.m119483b(r12)
                r12 = r11
                goto L_0x014e
            L_0x002f:
                java.lang.Object r1 = r11.f97396g
                java.util.Iterator r1 = (java.util.Iterator) r1
                java.lang.Object r5 = r11.f97395f
                ie1.u0 r5 = (ie1.C41350u0) r5
                java.lang.Object r8 = r11.f97399j
                bf1.i r8 = (bf1.C40344i) r8
                he1.C41228o.m119483b(r12)
                r12 = r11
                goto L_0x0120
            L_0x0041:
                he1.C41228o.m119483b(r12)
                goto L_0x016a
            L_0x0046:
                int r1 = r11.f97397h
                java.lang.Object r2 = r11.f97396g
                java.util.Iterator r2 = (java.util.Iterator) r2
                java.lang.Object r3 = r11.f97395f
                java.util.ArrayList r3 = (java.util.ArrayList) r3
                java.lang.Object r4 = r11.f97399j
                bf1.i r4 = (bf1.C40344i) r4
                he1.C41228o.m119483b(r12)
                r8 = r11
            L_0x0058:
                r12 = r1
                goto L_0x00a9
            L_0x005a:
                he1.C41228o.m119483b(r12)
                java.lang.Object r12 = r11.f97399j
                bf1.i r12 = (bf1.C40344i) r12
                int r1 = r11.f97400k
                r8 = 1024(0x400, float:1.435E-42)
                int r1 = ze1.C43429k.m124588g(r1, r8)
                int r8 = r11.f97401l
                int r9 = r11.f97400k
                int r8 = r8 - r9
                if (r8 < 0) goto L_0x00dd
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>(r1)
                java.util.Iterator r1 = r11.f97402m
                r3 = 0
                r4 = r12
                r12 = r3
                r3 = r2
                r2 = r1
                r1 = r8
                r8 = r11
            L_0x007e:
                boolean r9 = r2.hasNext()
                if (r9 == 0) goto L_0x00bb
                java.lang.Object r9 = r2.next()
                if (r12 <= 0) goto L_0x008d
                int r12 = r12 + -1
                goto L_0x007e
            L_0x008d:
                r3.add(r9)
                int r9 = r3.size()
                int r10 = r8.f97400k
                if (r9 != r10) goto L_0x007e
                r8.f97399j = r4
                r8.f97395f = r3
                r8.f97396g = r2
                r8.f97397h = r1
                r8.f97398i = r6
                java.lang.Object r12 = r4.mo94381d(r3, r8)
                if (r12 != r0) goto L_0x0058
                return r0
            L_0x00a9:
                boolean r1 = r8.f97403n
                if (r1 == 0) goto L_0x00b1
                r3.clear()
                goto L_0x00b9
            L_0x00b1:
                java.util.ArrayList r1 = new java.util.ArrayList
                int r3 = r8.f97400k
                r1.<init>(r3)
                r3 = r1
            L_0x00b9:
                r1 = r12
                goto L_0x007e
            L_0x00bb:
                boolean r12 = r3.isEmpty()
                r12 = r12 ^ r6
                if (r12 == 0) goto L_0x016a
                boolean r12 = r8.f97404o
                if (r12 != 0) goto L_0x00ce
                int r12 = r3.size()
                int r1 = r8.f97400k
                if (r12 != r1) goto L_0x016a
            L_0x00ce:
                r8.f97399j = r7
                r8.f97395f = r7
                r8.f97396g = r7
                r8.f97398i = r5
                java.lang.Object r12 = r4.mo94381d(r3, r8)
                if (r12 != r0) goto L_0x016a
                return r0
            L_0x00dd:
                ie1.u0 r5 = new ie1.u0
                r5.<init>(r1)
                java.util.Iterator r1 = r11.f97402m
                r8 = r12
                r12 = r11
            L_0x00e6:
                boolean r9 = r1.hasNext()
                if (r9 == 0) goto L_0x0126
                java.lang.Object r9 = r1.next()
                r5.mo95980l(r9)
                boolean r9 = r5.mo95982o()
                if (r9 == 0) goto L_0x00e6
                int r9 = r5.size()
                int r10 = r12.f97400k
                if (r9 >= r10) goto L_0x0106
                ie1.u0 r5 = r5.mo95981n(r10)
                goto L_0x00e6
            L_0x0106:
                boolean r9 = r12.f97403n
                if (r9 == 0) goto L_0x010c
                r9 = r5
                goto L_0x0111
            L_0x010c:
                java.util.ArrayList r9 = new java.util.ArrayList
                r9.<init>(r5)
            L_0x0111:
                r12.f97399j = r8
                r12.f97395f = r5
                r12.f97396g = r1
                r12.f97398i = r4
                java.lang.Object r9 = r8.mo94381d(r9, r12)
                if (r9 != r0) goto L_0x0120
                return r0
            L_0x0120:
                int r9 = r12.f97401l
                r5.mo95983r(r9)
                goto L_0x00e6
            L_0x0126:
                boolean r1 = r12.f97404o
                if (r1 == 0) goto L_0x016a
                r1 = r5
                r4 = r8
            L_0x012c:
                int r5 = r1.size()
                int r8 = r12.f97401l
                if (r5 <= r8) goto L_0x0154
                boolean r5 = r12.f97403n
                if (r5 == 0) goto L_0x013a
                r5 = r1
                goto L_0x013f
            L_0x013a:
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>(r1)
            L_0x013f:
                r12.f97399j = r4
                r12.f97395f = r1
                r12.f97396g = r7
                r12.f97398i = r3
                java.lang.Object r5 = r4.mo94381d(r5, r12)
                if (r5 != r0) goto L_0x014e
                return r0
            L_0x014e:
                int r5 = r12.f97401l
                r1.mo95983r(r5)
                goto L_0x012c
            L_0x0154:
                boolean r3 = r1.isEmpty()
                r3 = r3 ^ r6
                if (r3 == 0) goto L_0x016a
                r12.f97399j = r7
                r12.f97395f = r7
                r12.f97396g = r7
                r12.f97398i = r2
                java.lang.Object r12 = r4.mo94381d(r1, r12)
                if (r12 != r0) goto L_0x016a
                return r0
            L_0x016a:
                he1.w r12 = he1.C41238w.f97225a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: ie1.C41363z0.C41364a.mo3709f(java.lang.Object):java.lang.Object");
        }

        /* renamed from: m */
        public final Object invoke(C40344i iVar, Continuation continuation) {
            return ((C41364a) mo3708a(iVar, continuation)).mo3709f(C41238w.f97225a);
        }
    }

    /* renamed from: a */
    public static final void m120044a(int i, int i2) {
        boolean z;
        String str;
        if (i <= 0 || i2 <= 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            if (i != i2) {
                str = "Both size " + i + " and step " + i2 + " must be greater than zero.";
            } else {
                str = "size " + i + " must be greater than zero.";
            }
            throw new IllegalArgumentException(str.toString());
        }
    }

    /* renamed from: b */
    public static final Iterator m120045b(Iterator it, int i, int i2, boolean z, boolean z2) {
        C41536l.m120489i(it, "iterator");
        if (!it.hasNext()) {
            return C41362z.f97394d;
        }
        return C40346k.m116840a(new C41364a(i, i2, it, z2, z, (Continuation) null));
    }
}
