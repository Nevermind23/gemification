package org.webrtc;

import android.graphics.Matrix;
import android.graphics.Point;
import android.opengl.GLES20;
import com.github.mikephil.charting.utils.Utils;
import java.nio.ByteBuffer;

/* renamed from: org.webrtc.s */
public class C42114s {

    /* renamed from: f */
    static final float[] f99048f = {Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, 1.0f, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, 1.0f};

    /* renamed from: a */
    private final float[] f99049a = new float[6];

    /* renamed from: b */
    private final Point f99050b = new Point();

    /* renamed from: c */
    private final C42116b f99051c = new C42116b();

    /* renamed from: d */
    private VideoFrame f99052d;

    /* renamed from: e */
    private final Matrix f99053e = new Matrix();

    /* renamed from: org.webrtc.s$b */
    private static class C42116b {

        /* renamed from: a */
        private ByteBuffer f99054a;

        /* renamed from: b */
        private int[] f99055b;

        private C42116b() {
        }

        /* renamed from: a */
        public void mo97623a() {
            this.f99054a = null;
            int[] iArr = this.f99055b;
            if (iArr != null) {
                GLES20.glDeleteTextures(3, iArr, 0);
                this.f99055b = null;
            }
        }
    }

    /* renamed from: a */
    public void mo97622a() {
        this.f99051c.mo97623a();
        this.f99052d = null;
    }
}
