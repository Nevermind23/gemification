package com.facebook.shimmer;

import android.content.res.TypedArray;
import android.graphics.RectF;
import com.github.mikephil.charting.utils.Utils;
import p116i5.C6571a;

/* renamed from: com.facebook.shimmer.a */
public class C2736a {

    /* renamed from: a */
    final float[] f8560a = new float[4];

    /* renamed from: b */
    final int[] f8561b = new int[4];

    /* renamed from: c */
    final RectF f8562c = new RectF();

    /* renamed from: d */
    int f8563d = 0;

    /* renamed from: e */
    int f8564e = -1;

    /* renamed from: f */
    int f8565f = 1291845631;

    /* renamed from: g */
    int f8566g = 0;

    /* renamed from: h */
    int f8567h = 0;

    /* renamed from: i */
    int f8568i = 0;

    /* renamed from: j */
    float f8569j = 1.0f;

    /* renamed from: k */
    float f8570k = 1.0f;

    /* renamed from: l */
    float f8571l = Utils.FLOAT_EPSILON;

    /* renamed from: m */
    float f8572m = 0.5f;

    /* renamed from: n */
    float f8573n = 20.0f;

    /* renamed from: o */
    boolean f8574o = true;

    /* renamed from: p */
    boolean f8575p = true;

    /* renamed from: q */
    boolean f8576q = true;

    /* renamed from: r */
    int f8577r = -1;

    /* renamed from: s */
    int f8578s = 1;

    /* renamed from: t */
    long f8579t = 1000;

    /* renamed from: u */
    long f8580u;

    /* renamed from: com.facebook.shimmer.a$a */
    public static class C2737a extends C2738b {
        public C2737a() {
            this.f8581a.f8576q = true;
        }

        /* access modifiers changed from: protected */
        /* renamed from: v */
        public C2737a mo8666d() {
            return this;
        }
    }

    /* renamed from: com.facebook.shimmer.a$b */
    public static abstract class C2738b {

        /* renamed from: a */
        final C2736a f8581a = new C2736a();

        /* renamed from: b */
        private static float m10612b(float f, float f2, float f3) {
            return Math.min(f2, Math.max(f, f3));
        }

        /* renamed from: a */
        public C2736a mo8668a() {
            this.f8581a.mo8663b();
            this.f8581a.mo8664c();
            return this.f8581a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C2738b mo8669c(TypedArray typedArray) {
            int i = C6571a.f20050e;
            if (typedArray.hasValue(i)) {
                mo8672g(typedArray.getBoolean(i, this.f8581a.f8574o));
            }
            int i2 = C6571a.f20047b;
            if (typedArray.hasValue(i2)) {
                mo8670e(typedArray.getBoolean(i2, this.f8581a.f8575p));
            }
            int i3 = C6571a.f20048c;
            if (typedArray.hasValue(i3)) {
                mo8671f(typedArray.getFloat(i3, 0.3f));
            }
            int i4 = C6571a.f20058m;
            if (typedArray.hasValue(i4)) {
                mo8679n(typedArray.getFloat(i4, 1.0f));
            }
            int i5 = C6571a.f20054i;
            if (typedArray.hasValue(i5)) {
                mo8675j((long) typedArray.getInt(i5, (int) this.f8581a.f8579t));
            }
            int i6 = C6571a.f20061p;
            if (typedArray.hasValue(i6)) {
                mo8681p(typedArray.getInt(i6, this.f8581a.f8577r));
            }
            int i7 = C6571a.f20062q;
            if (typedArray.hasValue(i7)) {
                mo8682q((long) typedArray.getInt(i7, (int) this.f8581a.f8580u));
            }
            int i8 = C6571a.f20063r;
            if (typedArray.hasValue(i8)) {
                mo8683r(typedArray.getInt(i8, this.f8581a.f8578s));
            }
            int i9 = C6571a.f20052g;
            if (typedArray.hasValue(i9)) {
                int i12 = typedArray.getInt(i9, this.f8581a.f8563d);
                if (i12 == 1) {
                    mo8673h(1);
                } else if (i12 == 2) {
                    mo8673h(2);
                } else if (i12 != 3) {
                    mo8673h(0);
                } else {
                    mo8673h(3);
                }
            }
            int i13 = C6571a.f20064s;
            if (typedArray.hasValue(i13)) {
                if (typedArray.getInt(i13, this.f8581a.f8566g) != 1) {
                    mo8684s(0);
                } else {
                    mo8684s(1);
                }
            }
            int i14 = C6571a.f20053h;
            if (typedArray.hasValue(i14)) {
                mo8674i(typedArray.getFloat(i14, this.f8581a.f8572m));
            }
            int i15 = C6571a.f20056k;
            if (typedArray.hasValue(i15)) {
                mo8677l(typedArray.getDimensionPixelSize(i15, this.f8581a.f8567h));
            }
            int i16 = C6571a.f20055j;
            if (typedArray.hasValue(i16)) {
                mo8676k(typedArray.getDimensionPixelSize(i16, this.f8581a.f8568i));
            }
            int i17 = C6571a.f20060o;
            if (typedArray.hasValue(i17)) {
                mo8680o(typedArray.getFloat(i17, this.f8581a.f8571l));
            }
            int i18 = C6571a.f20066u;
            if (typedArray.hasValue(i18)) {
                mo8686u(typedArray.getFloat(i18, this.f8581a.f8569j));
            }
            int i19 = C6571a.f20057l;
            if (typedArray.hasValue(i19)) {
                mo8678m(typedArray.getFloat(i19, this.f8581a.f8570k));
            }
            int i22 = C6571a.f20065t;
            if (typedArray.hasValue(i22)) {
                mo8685t(typedArray.getFloat(i22, this.f8581a.f8573n));
            }
            return mo8666d();
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public abstract C2738b mo8666d();

        /* renamed from: e */
        public C2738b mo8670e(boolean z) {
            this.f8581a.f8575p = z;
            return mo8666d();
        }

        /* renamed from: f */
        public C2738b mo8671f(float f) {
            C2736a aVar = this.f8581a;
            aVar.f8565f = (((int) (m10612b(Utils.FLOAT_EPSILON, 1.0f, f) * 255.0f)) << 24) | (aVar.f8565f & 16777215);
            return mo8666d();
        }

        /* renamed from: g */
        public C2738b mo8672g(boolean z) {
            this.f8581a.f8574o = z;
            return mo8666d();
        }

        /* renamed from: h */
        public C2738b mo8673h(int i) {
            this.f8581a.f8563d = i;
            return mo8666d();
        }

        /* renamed from: i */
        public C2738b mo8674i(float f) {
            if (f >= Utils.FLOAT_EPSILON) {
                this.f8581a.f8572m = f;
                return mo8666d();
            }
            throw new IllegalArgumentException("Given invalid dropoff value: " + f);
        }

        /* renamed from: j */
        public C2738b mo8675j(long j) {
            if (j >= 0) {
                this.f8581a.f8579t = j;
                return mo8666d();
            }
            throw new IllegalArgumentException("Given a negative duration: " + j);
        }

        /* renamed from: k */
        public C2738b mo8676k(int i) {
            if (i >= 0) {
                this.f8581a.f8568i = i;
                return mo8666d();
            }
            throw new IllegalArgumentException("Given invalid height: " + i);
        }

        /* renamed from: l */
        public C2738b mo8677l(int i) {
            if (i >= 0) {
                this.f8581a.f8567h = i;
                return mo8666d();
            }
            throw new IllegalArgumentException("Given invalid width: " + i);
        }

        /* renamed from: m */
        public C2738b mo8678m(float f) {
            if (f >= Utils.FLOAT_EPSILON) {
                this.f8581a.f8570k = f;
                return mo8666d();
            }
            throw new IllegalArgumentException("Given invalid height ratio: " + f);
        }

        /* renamed from: n */
        public C2738b mo8679n(float f) {
            C2736a aVar = this.f8581a;
            aVar.f8564e = (((int) (m10612b(Utils.FLOAT_EPSILON, 1.0f, f) * 255.0f)) << 24) | (aVar.f8564e & 16777215);
            return mo8666d();
        }

        /* renamed from: o */
        public C2738b mo8680o(float f) {
            if (f >= Utils.FLOAT_EPSILON) {
                this.f8581a.f8571l = f;
                return mo8666d();
            }
            throw new IllegalArgumentException("Given invalid intensity value: " + f);
        }

        /* renamed from: p */
        public C2738b mo8681p(int i) {
            this.f8581a.f8577r = i;
            return mo8666d();
        }

        /* renamed from: q */
        public C2738b mo8682q(long j) {
            if (j >= 0) {
                this.f8581a.f8580u = j;
                return mo8666d();
            }
            throw new IllegalArgumentException("Given a negative repeat delay: " + j);
        }

        /* renamed from: r */
        public C2738b mo8683r(int i) {
            this.f8581a.f8578s = i;
            return mo8666d();
        }

        /* renamed from: s */
        public C2738b mo8684s(int i) {
            this.f8581a.f8566g = i;
            return mo8666d();
        }

        /* renamed from: t */
        public C2738b mo8685t(float f) {
            this.f8581a.f8573n = f;
            return mo8666d();
        }

        /* renamed from: u */
        public C2738b mo8686u(float f) {
            if (f >= Utils.FLOAT_EPSILON) {
                this.f8581a.f8569j = f;
                return mo8666d();
            }
            throw new IllegalArgumentException("Given invalid width ratio: " + f);
        }
    }

    /* renamed from: com.facebook.shimmer.a$c */
    public static class C2739c extends C2738b {
        public C2739c() {
            this.f8581a.f8576q = false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: v */
        public C2739c mo8669c(TypedArray typedArray) {
            super.mo8669c(typedArray);
            int i = C6571a.f20049d;
            if (typedArray.hasValue(i)) {
                mo8689x(typedArray.getColor(i, this.f8581a.f8565f));
            }
            int i2 = C6571a.f20059n;
            if (typedArray.hasValue(i2)) {
                mo8690y(typedArray.getColor(i2, this.f8581a.f8564e));
            }
            return mo8666d();
        }

        /* access modifiers changed from: protected */
        /* renamed from: w */
        public C2739c mo8666d() {
            return this;
        }

        /* renamed from: x */
        public C2739c mo8689x(int i) {
            C2736a aVar = this.f8581a;
            aVar.f8565f = (i & 16777215) | (aVar.f8565f & -16777216);
            return mo8666d();
        }

        /* renamed from: y */
        public C2739c mo8690y(int i) {
            this.f8581a.f8564e = i;
            return mo8666d();
        }
    }

    C2736a() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo8662a(int i) {
        int i2 = this.f8568i;
        return i2 > 0 ? i2 : Math.round(this.f8570k * ((float) i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo8663b() {
        if (this.f8566g != 1) {
            int[] iArr = this.f8561b;
            int i = this.f8565f;
            iArr[0] = i;
            int i2 = this.f8564e;
            iArr[1] = i2;
            iArr[2] = i2;
            iArr[3] = i;
            return;
        }
        int[] iArr2 = this.f8561b;
        int i3 = this.f8564e;
        iArr2[0] = i3;
        iArr2[1] = i3;
        int i4 = this.f8565f;
        iArr2[2] = i4;
        iArr2[3] = i4;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo8664c() {
        if (this.f8566g != 1) {
            this.f8560a[0] = Math.max(((1.0f - this.f8571l) - this.f8572m) / 2.0f, Utils.FLOAT_EPSILON);
            this.f8560a[1] = Math.max(((1.0f - this.f8571l) - 0.001f) / 2.0f, Utils.FLOAT_EPSILON);
            this.f8560a[2] = Math.min(((this.f8571l + 1.0f) + 0.001f) / 2.0f, 1.0f);
            this.f8560a[3] = Math.min(((this.f8571l + 1.0f) + this.f8572m) / 2.0f, 1.0f);
            return;
        }
        float[] fArr = this.f8560a;
        fArr[0] = 0.0f;
        fArr[1] = Math.min(this.f8571l, 1.0f);
        this.f8560a[2] = Math.min(this.f8571l + this.f8572m, 1.0f);
        this.f8560a[3] = 1.0f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo8665d(int i) {
        int i2 = this.f8567h;
        return i2 > 0 ? i2 : Math.round(this.f8569j * ((float) i));
    }
}
