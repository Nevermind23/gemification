package p344ac;

import p200ob.C7507a;

/* renamed from: ac.h */
abstract class C9769h extends C9771j {
    C9769h(C7507a aVar) {
        super(aVar);
    }

    /* renamed from: e */
    private static void m35923e(StringBuilder sb, int i) {
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < 13; i4++) {
            int charAt = sb.charAt(i4 + i) - '0';
            if ((i4 & 1) == 0) {
                charAt *= 3;
            }
            i3 += charAt;
        }
        int i5 = 10 - (i3 % 10);
        if (i5 != 10) {
            i2 = i5;
        }
        sb.append(i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo26219f(StringBuilder sb, int i) {
        sb.append("(01)");
        int length = sb.length();
        sb.append('9');
        mo26220g(sb, i, length);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo26220g(StringBuilder sb, int i, int i2) {
        for (int i3 = 0; i3 < 4; i3++) {
            int f = mo26222b().mo26246f((i3 * 10) + i, 10);
            if (f / 100 == 0) {
                sb.append('0');
            }
            if (f / 10 == 0) {
                sb.append('0');
            }
            sb.append(f);
        }
        m35923e(sb, i2);
    }
}
