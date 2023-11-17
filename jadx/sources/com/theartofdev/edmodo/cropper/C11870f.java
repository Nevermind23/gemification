package com.theartofdev.edmodo.cropper;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: com.theartofdev.edmodo.cropper.f */
final class C11870f {

    /* renamed from: g */
    private static final Matrix f34660g = new Matrix();

    /* renamed from: a */
    private final float f34661a;

    /* renamed from: b */
    private final float f34662b;

    /* renamed from: c */
    private final float f34663c;

    /* renamed from: d */
    private final float f34664d;

    /* renamed from: e */
    private final C11872b f34665e;

    /* renamed from: f */
    private final PointF f34666f = new PointF();

    /* renamed from: com.theartofdev.edmodo.cropper.f$a */
    static /* synthetic */ class C11871a {

        /* renamed from: a */
        static final /* synthetic */ int[] f34667a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|(3:17|18|20)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.theartofdev.edmodo.cropper.f$b[] r0 = com.theartofdev.edmodo.cropper.C11870f.C11872b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f34667a = r0
                com.theartofdev.edmodo.cropper.f$b r1 = com.theartofdev.edmodo.cropper.C11870f.C11872b.TOP_LEFT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f34667a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.theartofdev.edmodo.cropper.f$b r1 = com.theartofdev.edmodo.cropper.C11870f.C11872b.TOP_RIGHT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f34667a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.theartofdev.edmodo.cropper.f$b r1 = com.theartofdev.edmodo.cropper.C11870f.C11872b.BOTTOM_LEFT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f34667a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.theartofdev.edmodo.cropper.f$b r1 = com.theartofdev.edmodo.cropper.C11870f.C11872b.BOTTOM_RIGHT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f34667a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.theartofdev.edmodo.cropper.f$b r1 = com.theartofdev.edmodo.cropper.C11870f.C11872b.LEFT     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f34667a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.theartofdev.edmodo.cropper.f$b r1 = com.theartofdev.edmodo.cropper.C11870f.C11872b.TOP     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f34667a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.theartofdev.edmodo.cropper.f$b r1 = com.theartofdev.edmodo.cropper.C11870f.C11872b.RIGHT     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f34667a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.theartofdev.edmodo.cropper.f$b r1 = com.theartofdev.edmodo.cropper.C11870f.C11872b.BOTTOM     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f34667a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.theartofdev.edmodo.cropper.f$b r1 = com.theartofdev.edmodo.cropper.C11870f.C11872b.CENTER     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.theartofdev.edmodo.cropper.C11870f.C11871a.<clinit>():void");
        }
    }

    /* renamed from: com.theartofdev.edmodo.cropper.f$b */
    public enum C11872b {
        TOP_LEFT,
        TOP_RIGHT,
        BOTTOM_LEFT,
        BOTTOM_RIGHT,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        CENTER
    }

    public C11870f(C11872b bVar, C11869e eVar, float f, float f2) {
        this.f34665e = bVar;
        this.f34661a = eVar.mo31873e();
        this.f34662b = eVar.mo31872d();
        this.f34663c = eVar.mo31871c();
        this.f34664d = eVar.mo31870b();
        m43509l(eVar.mo31875h(), f, f2);
    }

    /* renamed from: a */
    private void m43498a(RectF rectF, float f, RectF rectF2, int i, float f2, float f3, boolean z, boolean z2) {
        float f4 = (float) i;
        if (f > f4) {
            f = ((f - f4) / 1.05f) + f4;
            this.f34666f.y -= (f - f4) / 1.1f;
        }
        float f5 = rectF2.bottom;
        if (f > f5) {
            this.f34666f.y -= (f - f5) / 2.0f;
        }
        if (f5 - f < f2) {
            f = f5;
        }
        float f6 = rectF.top;
        float f7 = this.f34662b;
        if (f - f6 < f7) {
            f = f6 + f7;
        }
        float f8 = this.f34664d;
        if (f - f6 > f8) {
            f = f6 + f8;
        }
        if (f5 - f < f2) {
            f = f5;
        }
        if (f3 > Utils.FLOAT_EPSILON) {
            float f9 = (f - f6) * f3;
            float f12 = this.f34661a;
            if (f9 < f12) {
                f = Math.min(f5, f6 + (f12 / f3));
                f9 = (f - rectF.top) * f3;
            }
            float f13 = this.f34663c;
            if (f9 > f13) {
                f = Math.min(rectF2.bottom, rectF.top + (f13 / f3));
                f9 = (f - rectF.top) * f3;
            }
            if (!z || !z2) {
                if (z) {
                    float f14 = rectF.right;
                    float f15 = rectF2.left;
                    if (f14 - f9 < f15) {
                        f = Math.min(rectF2.bottom, rectF.top + ((f14 - f15) / f3));
                        f9 = (f - rectF.top) * f3;
                    }
                }
                if (z2) {
                    float f16 = rectF.left;
                    float f17 = rectF2.right;
                    if (f9 + f16 > f17) {
                        f = Math.min(f, Math.min(rectF2.bottom, rectF.top + ((f17 - f16) / f3)));
                    }
                }
            } else {
                f = Math.min(f, Math.min(rectF2.bottom, rectF.top + (rectF2.width() / f3)));
            }
        }
        rectF.bottom = f;
    }

    /* renamed from: b */
    private void m43499b(RectF rectF, float f) {
        rectF.bottom = rectF.top + (rectF.width() / f);
    }

    /* renamed from: c */
    private void m43500c(RectF rectF, float f, RectF rectF2, float f2, float f3, boolean z, boolean z2) {
        if (f < Utils.FLOAT_EPSILON) {
            f /= 1.05f;
            this.f34666f.x -= f / 1.1f;
        }
        float f4 = rectF2.left;
        if (f < f4) {
            this.f34666f.x -= (f - f4) / 2.0f;
        }
        if (f - f4 < f2) {
            f = f4;
        }
        float f5 = rectF.right;
        float f6 = this.f34661a;
        if (f5 - f < f6) {
            f = f5 - f6;
        }
        float f7 = this.f34663c;
        if (f5 - f > f7) {
            f = f5 - f7;
        }
        if (f - f4 < f2) {
            f = f4;
        }
        if (f3 > Utils.FLOAT_EPSILON) {
            float f8 = (f5 - f) / f3;
            float f9 = this.f34662b;
            if (f8 < f9) {
                f = Math.max(f4, f5 - (f9 * f3));
                f8 = (rectF.right - f) / f3;
            }
            float f12 = this.f34664d;
            if (f8 > f12) {
                f = Math.max(rectF2.left, rectF.right - (f12 * f3));
                f8 = (rectF.right - f) / f3;
            }
            if (!z || !z2) {
                if (z) {
                    float f13 = rectF.bottom;
                    float f14 = rectF2.top;
                    if (f13 - f8 < f14) {
                        f = Math.max(rectF2.left, rectF.right - ((f13 - f14) * f3));
                        f8 = (rectF.right - f) / f3;
                    }
                }
                if (z2) {
                    float f15 = rectF.top;
                    float f16 = rectF2.bottom;
                    if (f8 + f15 > f16) {
                        f = Math.max(f, Math.max(rectF2.left, rectF.right - ((f16 - f15) * f3)));
                    }
                }
            } else {
                f = Math.max(f, Math.max(rectF2.left, rectF.right - (rectF2.height() * f3)));
            }
        }
        rectF.left = f;
    }

    /* renamed from: d */
    private void m43501d(RectF rectF, float f) {
        rectF.left = rectF.right - (rectF.height() * f);
    }

    /* renamed from: e */
    private void m43502e(RectF rectF, RectF rectF2, float f) {
        rectF.inset((rectF.width() - (rectF.height() * f)) / 2.0f, Utils.FLOAT_EPSILON);
        float f2 = rectF.left;
        float f3 = rectF2.left;
        if (f2 < f3) {
            rectF.offset(f3 - f2, Utils.FLOAT_EPSILON);
        }
        float f4 = rectF.right;
        float f5 = rectF2.right;
        if (f4 > f5) {
            rectF.offset(f5 - f4, Utils.FLOAT_EPSILON);
        }
    }

    /* renamed from: f */
    private void m43503f(RectF rectF, float f, RectF rectF2, int i, float f2, float f3, boolean z, boolean z2) {
        float f4 = (float) i;
        if (f > f4) {
            f = ((f - f4) / 1.05f) + f4;
            this.f34666f.x -= (f - f4) / 1.1f;
        }
        float f5 = rectF2.right;
        if (f > f5) {
            this.f34666f.x -= (f - f5) / 2.0f;
        }
        if (f5 - f < f2) {
            f = f5;
        }
        float f6 = rectF.left;
        float f7 = this.f34661a;
        if (f - f6 < f7) {
            f = f6 + f7;
        }
        float f8 = this.f34663c;
        if (f - f6 > f8) {
            f = f6 + f8;
        }
        if (f5 - f < f2) {
            f = f5;
        }
        if (f3 > Utils.FLOAT_EPSILON) {
            float f9 = (f - f6) / f3;
            float f12 = this.f34662b;
            if (f9 < f12) {
                f = Math.min(f5, f6 + (f12 * f3));
                f9 = (f - rectF.left) / f3;
            }
            float f13 = this.f34664d;
            if (f9 > f13) {
                f = Math.min(rectF2.right, rectF.left + (f13 * f3));
                f9 = (f - rectF.left) / f3;
            }
            if (!z || !z2) {
                if (z) {
                    float f14 = rectF.bottom;
                    float f15 = rectF2.top;
                    if (f14 - f9 < f15) {
                        f = Math.min(rectF2.right, rectF.left + ((f14 - f15) * f3));
                        f9 = (f - rectF.left) / f3;
                    }
                }
                if (z2) {
                    float f16 = rectF.top;
                    float f17 = rectF2.bottom;
                    if (f9 + f16 > f17) {
                        f = Math.min(f, Math.min(rectF2.right, rectF.left + ((f17 - f16) * f3)));
                    }
                }
            } else {
                f = Math.min(f, Math.min(rectF2.right, rectF.left + (rectF2.height() * f3)));
            }
        }
        rectF.right = f;
    }

    /* renamed from: g */
    private void m43504g(RectF rectF, float f) {
        rectF.right = rectF.left + (rectF.height() * f);
    }

    /* renamed from: h */
    private void m43505h(RectF rectF, float f, RectF rectF2, float f2, float f3, boolean z, boolean z2) {
        if (f < Utils.FLOAT_EPSILON) {
            f /= 1.05f;
            this.f34666f.y -= f / 1.1f;
        }
        float f4 = rectF2.top;
        if (f < f4) {
            this.f34666f.y -= (f - f4) / 2.0f;
        }
        if (f - f4 < f2) {
            f = f4;
        }
        float f5 = rectF.bottom;
        float f6 = this.f34662b;
        if (f5 - f < f6) {
            f = f5 - f6;
        }
        float f7 = this.f34664d;
        if (f5 - f > f7) {
            f = f5 - f7;
        }
        if (f - f4 < f2) {
            f = f4;
        }
        if (f3 > Utils.FLOAT_EPSILON) {
            float f8 = (f5 - f) * f3;
            float f9 = this.f34661a;
            if (f8 < f9) {
                f = Math.max(f4, f5 - (f9 / f3));
                f8 = (rectF.bottom - f) * f3;
            }
            float f12 = this.f34663c;
            if (f8 > f12) {
                f = Math.max(rectF2.top, rectF.bottom - (f12 / f3));
                f8 = (rectF.bottom - f) * f3;
            }
            if (!z || !z2) {
                if (z) {
                    float f13 = rectF.right;
                    float f14 = rectF2.left;
                    if (f13 - f8 < f14) {
                        f = Math.max(rectF2.top, rectF.bottom - ((f13 - f14) / f3));
                        f8 = (rectF.bottom - f) * f3;
                    }
                }
                if (z2) {
                    float f15 = rectF.left;
                    float f16 = rectF2.right;
                    if (f8 + f15 > f16) {
                        f = Math.max(f, Math.max(rectF2.top, rectF.bottom - ((f16 - f15) / f3)));
                    }
                }
            } else {
                f = Math.max(f, Math.max(rectF2.top, rectF.bottom - (rectF2.width() / f3)));
            }
        }
        rectF.top = f;
    }

    /* renamed from: i */
    private void m43506i(RectF rectF, RectF rectF2, float f) {
        rectF.inset(Utils.FLOAT_EPSILON, (rectF.height() - (rectF.width() / f)) / 2.0f);
        float f2 = rectF.top;
        float f3 = rectF2.top;
        if (f2 < f3) {
            rectF.offset(Utils.FLOAT_EPSILON, f3 - f2);
        }
        float f4 = rectF.bottom;
        float f5 = rectF2.bottom;
        if (f4 > f5) {
            rectF.offset(Utils.FLOAT_EPSILON, f5 - f4);
        }
    }

    /* renamed from: j */
    private void m43507j(RectF rectF, float f) {
        rectF.top = rectF.bottom - (rectF.width() / f);
    }

    /* renamed from: k */
    private static float m43508k(float f, float f2, float f3, float f4) {
        return (f3 - f) / (f4 - f2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0046, code lost:
        r4 = r4 - r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0047, code lost:
        r5 = r3.f34666f;
        r5.x = r1;
        r5.y = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0026, code lost:
        r1 = r4 - r5;
        r4 = 0.0f;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m43509l(android.graphics.RectF r4, float r5, float r6) {
        /*
            r3 = this;
            int[] r0 = com.theartofdev.edmodo.cropper.C11870f.C11871a.f34667a
            com.theartofdev.edmodo.cropper.f$b r1 = r3.f34665e
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 0
            switch(r0) {
                case 1: goto L_0x0040;
                case 2: goto L_0x0039;
                case 3: goto L_0x0032;
                case 4: goto L_0x002b;
                case 5: goto L_0x0024;
                case 6: goto L_0x0021;
                case 7: goto L_0x001e;
                case 8: goto L_0x001b;
                case 9: goto L_0x0010;
                default: goto L_0x000e;
            }
        L_0x000e:
            r4 = r1
            goto L_0x0047
        L_0x0010:
            float r0 = r4.centerX()
            float r1 = r0 - r5
            float r4 = r4.centerY()
            goto L_0x0046
        L_0x001b:
            float r4 = r4.bottom
            goto L_0x0046
        L_0x001e:
            float r4 = r4.right
            goto L_0x0026
        L_0x0021:
            float r4 = r4.top
            goto L_0x0046
        L_0x0024:
            float r4 = r4.left
        L_0x0026:
            float r4 = r4 - r5
            r2 = r1
            r1 = r4
            r4 = r2
            goto L_0x0047
        L_0x002b:
            float r0 = r4.right
            float r1 = r0 - r5
            float r4 = r4.bottom
            goto L_0x0046
        L_0x0032:
            float r0 = r4.left
            float r1 = r0 - r5
            float r4 = r4.bottom
            goto L_0x0046
        L_0x0039:
            float r0 = r4.right
            float r1 = r0 - r5
            float r4 = r4.top
            goto L_0x0046
        L_0x0040:
            float r0 = r4.left
            float r1 = r0 - r5
            float r4 = r4.top
        L_0x0046:
            float r4 = r4 - r6
        L_0x0047:
            android.graphics.PointF r5 = r3.f34666f
            r5.x = r1
            r5.y = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.theartofdev.edmodo.cropper.C11870f.m43509l(android.graphics.RectF, float, float):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0056, code lost:
        if ((r0 + r9) <= r10.bottom) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002d, code lost:
        if ((r1 + r8) <= r10.right) goto L_0x0039;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m43510n(android.graphics.RectF r7, float r8, float r9, android.graphics.RectF r10, int r11, int r12, float r13) {
        /*
            r6 = this;
            float r0 = r7.centerX()
            float r8 = r8 - r0
            float r0 = r7.centerY()
            float r9 = r9 - r0
            float r0 = r7.left
            float r1 = r0 + r8
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 1073741824(0x40000000, float:2.0)
            r4 = 1065772646(0x3f866666, float:1.05)
            if (r1 < 0) goto L_0x002f
            float r1 = r7.right
            float r5 = r1 + r8
            float r11 = (float) r11
            int r11 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r11 > 0) goto L_0x002f
            float r0 = r0 + r8
            float r11 = r10.left
            int r11 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r11 < 0) goto L_0x002f
            float r1 = r1 + r8
            float r11 = r10.right
            int r11 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r11 <= 0) goto L_0x0039
        L_0x002f:
            float r8 = r8 / r4
            android.graphics.PointF r11 = r6.f34666f
            float r0 = r11.x
            float r1 = r8 / r3
            float r0 = r0 - r1
            r11.x = r0
        L_0x0039:
            float r11 = r7.top
            float r0 = r11 + r9
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x0058
            float r0 = r7.bottom
            float r1 = r0 + r9
            float r12 = (float) r12
            int r12 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r12 > 0) goto L_0x0058
            float r11 = r11 + r9
            float r12 = r10.top
            int r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r11 < 0) goto L_0x0058
            float r0 = r0 + r9
            float r11 = r10.bottom
            int r11 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r11 <= 0) goto L_0x0062
        L_0x0058:
            float r9 = r9 / r4
            android.graphics.PointF r11 = r6.f34666f
            float r12 = r11.y
            float r0 = r9 / r3
            float r12 = r12 - r0
            r11.y = r12
        L_0x0062:
            r7.offset(r8, r9)
            r6.m43513q(r7, r10, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.theartofdev.edmodo.cropper.C11870f.m43510n(android.graphics.RectF, float, float, android.graphics.RectF, int, int, float):void");
    }

    /* renamed from: o */
    private void m43511o(RectF rectF, float f, float f2, RectF rectF2, int i, int i2, float f3, float f4) {
        RectF rectF3 = rectF;
        float f5 = f;
        float f6 = f2;
        RectF rectF4 = rectF2;
        float f7 = f4;
        switch (C11871a.f34667a[this.f34665e.ordinal()]) {
            case 1:
                if (m43508k(f, f6, rectF3.right, rectF3.bottom) < f7) {
                    m43505h(rectF, f2, rectF2, f3, f4, true, false);
                    m43501d(rectF, f7);
                    return;
                }
                m43500c(rectF, f, rectF2, f3, f4, true, false);
                m43507j(rectF, f7);
                return;
            case 2:
                if (m43508k(rectF3.left, f6, f, rectF3.bottom) < f7) {
                    m43505h(rectF, f2, rectF2, f3, f4, false, true);
                    m43504g(rectF, f7);
                    return;
                }
                m43503f(rectF, f, rectF2, i, f3, f4, true, false);
                m43507j(rectF, f7);
                return;
            case 3:
                if (m43508k(f, rectF3.top, rectF3.right, f6) < f7) {
                    m43498a(rectF, f2, rectF2, i2, f3, f4, true, false);
                    m43501d(rectF, f7);
                    return;
                }
                m43500c(rectF, f, rectF2, f3, f4, false, true);
                m43499b(rectF, f7);
                return;
            case 4:
                if (m43508k(rectF3.left, rectF3.top, f, f6) < f7) {
                    m43498a(rectF, f2, rectF2, i2, f3, f4, false, true);
                    m43504g(rectF, f7);
                    return;
                }
                m43503f(rectF, f, rectF2, i, f3, f4, false, true);
                m43499b(rectF, f7);
                return;
            case 5:
                m43500c(rectF, f, rectF2, f3, f4, true, true);
                m43506i(rectF, rectF4, f7);
                return;
            case 6:
                m43505h(rectF, f2, rectF2, f3, f4, true, true);
                m43502e(rectF, rectF4, f7);
                return;
            case 7:
                m43503f(rectF, f, rectF2, i, f3, f4, true, true);
                m43506i(rectF, rectF4, f7);
                return;
            case 8:
                m43498a(rectF, f2, rectF2, i2, f3, f4, true, true);
                m43502e(rectF, rectF4, f7);
                return;
            default:
                return;
        }
    }

    /* renamed from: p */
    private void m43512p(RectF rectF, float f, float f2, RectF rectF2, int i, int i2, float f3) {
        switch (C11871a.f34667a[this.f34665e.ordinal()]) {
            case 1:
                RectF rectF3 = rectF;
                RectF rectF4 = rectF2;
                float f4 = f3;
                m43505h(rectF3, f2, rectF4, f4, Utils.FLOAT_EPSILON, false, false);
                m43500c(rectF3, f, rectF4, f4, Utils.FLOAT_EPSILON, false, false);
                return;
            case 2:
                RectF rectF5 = rectF;
                RectF rectF6 = rectF2;
                m43505h(rectF5, f2, rectF6, f3, Utils.FLOAT_EPSILON, false, false);
                m43503f(rectF5, f, rectF6, i, f3, Utils.FLOAT_EPSILON, false, false);
                return;
            case 3:
                RectF rectF7 = rectF;
                RectF rectF8 = rectF2;
                m43498a(rectF7, f2, rectF8, i2, f3, Utils.FLOAT_EPSILON, false, false);
                m43500c(rectF7, f, rectF8, f3, Utils.FLOAT_EPSILON, false, false);
                return;
            case 4:
                RectF rectF9 = rectF;
                RectF rectF10 = rectF2;
                float f5 = f3;
                m43498a(rectF9, f2, rectF10, i2, f5, Utils.FLOAT_EPSILON, false, false);
                m43503f(rectF9, f, rectF10, i, f5, Utils.FLOAT_EPSILON, false, false);
                return;
            case 5:
                m43500c(rectF, f, rectF2, f3, Utils.FLOAT_EPSILON, false, false);
                return;
            case 6:
                m43505h(rectF, f2, rectF2, f3, Utils.FLOAT_EPSILON, false, false);
                return;
            case 7:
                m43503f(rectF, f, rectF2, i, f3, Utils.FLOAT_EPSILON, false, false);
                return;
            case 8:
                m43498a(rectF, f2, rectF2, i2, f3, Utils.FLOAT_EPSILON, false, false);
                return;
            default:
                return;
        }
    }

    /* renamed from: q */
    private void m43513q(RectF rectF, RectF rectF2, float f) {
        float f2 = rectF.left;
        float f3 = rectF2.left;
        if (f2 < f3 + f) {
            rectF.offset(f3 - f2, Utils.FLOAT_EPSILON);
        }
        float f4 = rectF.top;
        float f5 = rectF2.top;
        if (f4 < f5 + f) {
            rectF.offset(Utils.FLOAT_EPSILON, f5 - f4);
        }
        float f6 = rectF.right;
        float f7 = rectF2.right;
        if (f6 > f7 - f) {
            rectF.offset(f7 - f6, Utils.FLOAT_EPSILON);
        }
        float f8 = rectF.bottom;
        float f9 = rectF2.bottom;
        if (f8 > f9 - f) {
            rectF.offset(Utils.FLOAT_EPSILON, f9 - f8);
        }
    }

    /* renamed from: m */
    public void mo31882m(RectF rectF, float f, float f2, RectF rectF2, int i, int i2, float f3, boolean z, float f4) {
        PointF pointF = this.f34666f;
        float f5 = f + pointF.x;
        float f6 = f2 + pointF.y;
        if (this.f34665e == C11872b.CENTER) {
            m43510n(rectF, f5, f6, rectF2, i, i2, f3);
        } else if (z) {
            m43511o(rectF, f5, f6, rectF2, i, i2, f3, f4);
        } else {
            m43512p(rectF, f5, f6, rectF2, i, i2, f3);
        }
    }
}
