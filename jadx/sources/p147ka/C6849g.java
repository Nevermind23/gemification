package p147ka;

import android.util.SparseIntArray;

/* renamed from: ka.g */
public abstract class C6849g {

    /* renamed from: ka.g$a */
    public static class C6850a {

        /* renamed from: a */
        int f20506a;

        /* renamed from: b */
        int f20507b;

        /* renamed from: c */
        int f20508c;

        public C6850a(int i, int i2, int i3) {
            this.f20506a = i;
            this.f20507b = i2;
            this.f20508c = i3;
        }

        /* renamed from: a */
        public C6850a mo20902a(C6850a aVar) {
            return new C6850a(this.f20506a - aVar.mo20905d(), this.f20507b - aVar.mo20904c(), this.f20508c - aVar.mo20903b());
        }

        /* renamed from: b */
        public int mo20903b() {
            return this.f20508c;
        }

        /* renamed from: c */
        public int mo20904c() {
            return this.f20507b;
        }

        /* renamed from: d */
        public int mo20905d() {
            return this.f20506a;
        }
    }

    /* renamed from: a */
    public static C6850a m26591a(SparseIntArray[] sparseIntArrayArr) {
        int i;
        int i2;
        SparseIntArray sparseIntArray;
        int i3 = 0;
        if (sparseIntArrayArr == null || (sparseIntArray = sparseIntArrayArr[0]) == null) {
            i2 = 0;
            i = 0;
        } else {
            int i4 = 0;
            i2 = 0;
            i = 0;
            while (i3 < sparseIntArray.size()) {
                int keyAt = sparseIntArray.keyAt(i3);
                int valueAt = sparseIntArray.valueAt(i3);
                i4 += valueAt;
                if (keyAt > 700) {
                    i += valueAt;
                }
                if (keyAt > 16) {
                    i2 += valueAt;
                }
                i3++;
            }
            i3 = i4;
        }
        return new C6850a(i3, i2, i);
    }
}
