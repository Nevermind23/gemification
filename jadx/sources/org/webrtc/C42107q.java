package org.webrtc;

import android.graphics.Point;
import android.view.View;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: org.webrtc.q */
public abstract class C42107q {

    /* renamed from: a */
    private static float f99033a = 0.5625f;

    /* renamed from: org.webrtc.q$a */
    static /* synthetic */ class C42108a {

        /* renamed from: a */
        static final /* synthetic */ int[] f99034a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                org.webrtc.q$d[] r0 = org.webrtc.C42107q.C42111d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f99034a = r0
                org.webrtc.q$d r1 = org.webrtc.C42107q.C42111d.SCALE_ASPECT_FIT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f99034a     // Catch:{ NoSuchFieldError -> 0x001d }
                org.webrtc.q$d r1 = org.webrtc.C42107q.C42111d.SCALE_ASPECT_FILL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f99034a     // Catch:{ NoSuchFieldError -> 0x0028 }
                org.webrtc.q$d r1 = org.webrtc.C42107q.C42111d.SCALE_ASPECT_BALANCED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.webrtc.C42107q.C42108a.<clinit>():void");
        }
    }

    /* renamed from: org.webrtc.q$b */
    public interface C42109b {
        /* renamed from: a */
        void mo97612a();
    }

    /* renamed from: org.webrtc.q$c */
    public interface C42110c {
    }

    /* renamed from: org.webrtc.q$d */
    public enum C42111d {
        SCALE_ASPECT_FIT,
        SCALE_ASPECT_FILL,
        SCALE_ASPECT_BALANCED
    }

    /* renamed from: org.webrtc.q$e */
    public static class C42112e {

        /* renamed from: a */
        private float f99039a;

        /* renamed from: b */
        private float f99040b;

        public C42112e() {
            C42111d dVar = C42111d.SCALE_ASPECT_BALANCED;
            this.f99039a = C42107q.m122309b(dVar);
            this.f99040b = C42107q.m122309b(dVar);
        }

        /* renamed from: a */
        public Point mo97615a(int i, int i2, int i3, int i4) {
            boolean z;
            float f;
            int defaultSize = View.getDefaultSize(Integer.MAX_VALUE, i);
            int defaultSize2 = View.getDefaultSize(Integer.MAX_VALUE, i2);
            if (i3 == 0 || i4 == 0 || defaultSize == 0 || defaultSize2 == 0) {
                return new Point(defaultSize, defaultSize2);
            }
            float f2 = ((float) i3) / ((float) i4);
            float f3 = ((float) defaultSize) / ((float) defaultSize2);
            boolean z2 = true;
            if (f2 > 1.0f) {
                z = true;
            } else {
                z = false;
            }
            if (f3 <= 1.0f) {
                z2 = false;
            }
            if (z == z2) {
                f = this.f99039a;
            } else {
                f = this.f99040b;
            }
            Point c = C42107q.m122310c(f, f2, defaultSize, defaultSize2);
            if (View.MeasureSpec.getMode(i) == 1073741824) {
                c.x = defaultSize;
            }
            if (View.MeasureSpec.getMode(i2) == 1073741824) {
                c.y = defaultSize2;
            }
            return c;
        }

        /* renamed from: b */
        public void mo97616b(C42111d dVar) {
            mo97617c(dVar, dVar);
        }

        /* renamed from: c */
        public void mo97617c(C42111d dVar, C42111d dVar2) {
            this.f99039a = C42107q.m122309b(dVar);
            this.f99040b = C42107q.m122309b(dVar2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static float m122309b(C42111d dVar) {
        int i = C42108a.f99034a[dVar.ordinal()];
        if (i == 1) {
            return 1.0f;
        }
        if (i == 2) {
            return Utils.FLOAT_EPSILON;
        }
        if (i == 3) {
            return f99033a;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: c */
    public static Point m122310c(float f, float f2, int i, int i2) {
        if (f == Utils.FLOAT_EPSILON || f2 == Utils.FLOAT_EPSILON) {
            return new Point(i, i2);
        }
        return new Point(Math.min(i, Math.round((((float) i2) / f) * f2)), Math.min(i2, Math.round((((float) i) / f) / f2)));
    }
}
