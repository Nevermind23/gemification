package p344ac;

import p200ob.C7507a;

/* renamed from: ac.i */
abstract class C9770i extends C9769h {
    C9770i(C7507a aVar) {
        super(aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract void mo26216h(StringBuilder sb, int i);

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract int mo26217i(int i);

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo26221j(StringBuilder sb, int i, int i2) {
        int f = mo26222b().mo26246f(i, i2);
        mo26216h(sb, f);
        int i3 = mo26217i(f);
        int i4 = 100000;
        for (int i5 = 0; i5 < 5; i5++) {
            if (i3 / i4 == 0) {
                sb.append('0');
            }
            i4 /= 10;
        }
        sb.append(i3);
    }
}
