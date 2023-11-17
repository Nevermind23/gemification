package xh1;

import android.opengl.GLES20;

/* renamed from: xh1.l */
public class C43318l {

    /* renamed from: a */
    private final int f101087a;

    /* renamed from: b */
    private int f101088b;

    /* renamed from: c */
    private int f101089c;

    /* renamed from: d */
    private int f101090d;

    /* renamed from: e */
    private int f101091e;

    public C43318l(int i) {
        switch (i) {
            case 6407:
            case 6408:
            case 6409:
                this.f101087a = i;
                this.f101090d = 0;
                this.f101091e = 0;
                return;
            default:
                throw new IllegalArgumentException("Invalid pixel format: " + i);
        }
    }

    /* renamed from: a */
    public void mo102010a() {
        GLES20.glDeleteTextures(1, new int[]{this.f101089c}, 0);
        this.f101089c = 0;
        GLES20.glDeleteFramebuffers(1, new int[]{this.f101088b}, 0);
        this.f101088b = 0;
        this.f101090d = 0;
        this.f101091e = 0;
    }
}
