package com.tbuonomo.viewpagerdotsindicator;

import ie1.C41330k0;
import java.util.Iterator;
import ze1.C43420e;

/* renamed from: com.tbuonomo.viewpagerdotsindicator.c */
public abstract class C11841c {

    /* renamed from: a */
    private int f34382a = -1;

    /* renamed from: b */
    private int f34383b = -1;

    /* renamed from: a */
    public abstract int mo31699a();

    /* renamed from: b */
    public final void mo31743b(int i, float f) {
        float f2 = ((float) i) + f;
        float a = (float) (mo31699a() - 1);
        if (f2 == a) {
            f2 = a - 1.0E-4f;
        }
        int i2 = (int) f2;
        int i3 = i2 + 1;
        if (((float) i3) <= a && i2 != -1) {
            mo31700c(i2, i3, f2 % ((float) 1));
            int i4 = this.f34382a;
            if (i4 != -1) {
                if (i2 > i4) {
                    Iterator it = C43429k.m124596o(i4, i2).iterator();
                    while (it.hasNext()) {
                        mo31701d(((C41330k0) it).nextInt());
                    }
                }
                int i5 = this.f34383b;
                if (i3 < i5) {
                    mo31701d(i5);
                    Iterator it2 = new C43420e(i3 + 1, this.f34383b).iterator();
                    while (it2.hasNext()) {
                        mo31701d(((C41330k0) it2).nextInt());
                    }
                }
            }
            this.f34382a = i2;
            this.f34383b = i3;
        }
    }

    /* renamed from: c */
    public abstract void mo31700c(int i, int i2, float f);

    /* renamed from: d */
    public abstract void mo31701d(int i);
}
