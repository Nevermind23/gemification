package cf1;

import bf1.C40342g;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C41536l;
import ue1.C43079p;
import ve1.C43151a;
import ze1.C43420e;

/* renamed from: cf1.e */
final class C40408e implements C40342g {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final CharSequence f95997a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final int f95998b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final int f95999c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C43079p f96000d;

    /* renamed from: cf1.e$a */
    public static final class C40409a implements Iterator, C43151a {

        /* renamed from: d */
        private int f96001d = -1;

        /* renamed from: e */
        private int f96002e;

        /* renamed from: f */
        private int f96003f;

        /* renamed from: g */
        private C43420e f96004g;

        /* renamed from: h */
        private int f96005h;

        /* renamed from: i */
        final /* synthetic */ C40408e f96006i;

        C40409a(C40408e eVar) {
            this.f96006i = eVar;
            int i = C43429k.m124590i(eVar.f95998b, 0, eVar.f95997a.length());
            this.f96002e = i;
            this.f96003f = i;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
            if (r0 < cf1.C40408e.m116984e(r6.f96006i)) goto L_0x0023;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final void m116986b() {
            /*
                r6 = this;
                int r0 = r6.f96003f
                r1 = 0
                if (r0 >= 0) goto L_0x000c
                r6.f96001d = r1
                r0 = 0
                r6.f96004g = r0
                goto L_0x009e
            L_0x000c:
                cf1.e r0 = r6.f96006i
                int r0 = r0.f95999c
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L_0x0023
                int r0 = r6.f96005h
                int r0 = r0 + r3
                r6.f96005h = r0
                cf1.e r4 = r6.f96006i
                int r4 = r4.f95999c
                if (r0 >= r4) goto L_0x0031
            L_0x0023:
                int r0 = r6.f96003f
                cf1.e r4 = r6.f96006i
                java.lang.CharSequence r4 = r4.f95997a
                int r4 = r4.length()
                if (r0 <= r4) goto L_0x0047
            L_0x0031:
                ze1.e r0 = new ze1.e
                int r1 = r6.f96002e
                cf1.e r4 = r6.f96006i
                java.lang.CharSequence r4 = r4.f95997a
                int r4 = cf1.C40440x.m117149R(r4)
                r0.<init>(r1, r4)
                r6.f96004g = r0
                r6.f96003f = r2
                goto L_0x009c
            L_0x0047:
                cf1.e r0 = r6.f96006i
                ue1.p r0 = r0.f96000d
                cf1.e r4 = r6.f96006i
                java.lang.CharSequence r4 = r4.f95997a
                int r5 = r6.f96003f
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.invoke(r4, r5)
                he1.m r0 = (he1.C41224m) r0
                if (r0 != 0) goto L_0x0077
                ze1.e r0 = new ze1.e
                int r1 = r6.f96002e
                cf1.e r4 = r6.f96006i
                java.lang.CharSequence r4 = r4.f95997a
                int r4 = cf1.C40440x.m117149R(r4)
                r0.<init>(r1, r4)
                r6.f96004g = r0
                r6.f96003f = r2
                goto L_0x009c
            L_0x0077:
                java.lang.Object r2 = r0.mo95675a()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.mo95676b()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.f96002e
                ze1.e r4 = ze1.C43429k.m124596o(r4, r2)
                r6.f96004g = r4
                int r2 = r2 + r0
                r6.f96002e = r2
                if (r0 != 0) goto L_0x0099
                r1 = r3
            L_0x0099:
                int r2 = r2 + r1
                r6.f96003f = r2
            L_0x009c:
                r6.f96001d = r3
            L_0x009e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: cf1.C40408e.C40409a.m116986b():void");
        }

        /* renamed from: d */
        public C43420e next() {
            if (this.f96001d == -1) {
                m116986b();
            }
            if (this.f96001d != 0) {
                C43420e eVar = this.f96004g;
                C41536l.m120487g(eVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
                this.f96004g = null;
                this.f96001d = -1;
                return eVar;
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            if (this.f96001d == -1) {
                m116986b();
            }
            if (this.f96001d == 1) {
                return true;
            }
            return false;
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C40408e(CharSequence charSequence, int i, int i2, C43079p pVar) {
        C41536l.m120489i(charSequence, "input");
        C41536l.m120489i(pVar, "getNextMatch");
        this.f95997a = charSequence;
        this.f95998b = i;
        this.f95999c = i2;
        this.f96000d = pVar;
    }

    public Iterator iterator() {
        return new C40409a(this);
    }
}
