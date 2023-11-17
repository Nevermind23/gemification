package p443hc;

import p200ob.C7508b;

/* renamed from: hc.c */
enum C15464c {
    DATA_MASK_000 {
        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo42556a(int i, int i2) {
            return ((i + i2) & 1) == 0;
        }
    },
    DATA_MASK_001 {
        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo42556a(int i, int i2) {
            return (i & 1) == 0;
        }
    },
    DATA_MASK_010 {
        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo42556a(int i, int i2) {
            return i2 % 3 == 0;
        }
    },
    DATA_MASK_011 {
        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo42556a(int i, int i2) {
            return (i + i2) % 3 == 0;
        }
    },
    DATA_MASK_100 {
        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo42556a(int i, int i2) {
            return (((i / 2) + (i2 / 3)) & 1) == 0;
        }
    },
    DATA_MASK_101 {
        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo42556a(int i, int i2) {
            return (i * i2) % 6 == 0;
        }
    },
    DATA_MASK_110 {
        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo42556a(int i, int i2) {
            return (i * i2) % 6 < 3;
        }
    },
    DATA_MASK_111 {
        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo42556a(int i, int i2) {
            return (((i + i2) + ((i * i2) % 3)) & 1) == 0;
        }
    };

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract boolean mo42556a(int i, int i2);

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo42557b(C7508b bVar, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            for (int i3 = 0; i3 < i; i3++) {
                if (mo42556a(i2, i3)) {
                    bVar.mo21973d(i3, i2);
                }
            }
        }
    }
}
