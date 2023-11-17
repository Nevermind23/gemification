package org.webrtc;

import javax.microedition.khronos.egl.EGLContext;
import org.webrtc.C42076d;
import org.webrtc.C42079e;
import org.webrtc.C42081f;

/* renamed from: org.webrtc.c */
public abstract /* synthetic */ class C42075c {
    static {
        Object obj = C42076d.f98959a;
    }

    /* renamed from: a */
    public static C42076d.C42077a m122226a() {
        return new C42076d.C42077a();
    }

    /* renamed from: b */
    public static C42076d m122227b() {
        return m122228c((C42076d.C42078b) null, C42076d.f98960b);
    }

    /* renamed from: c */
    public static C42076d m122228c(C42076d.C42078b bVar, int[] iArr) {
        if (bVar == null) {
            return m122232g(iArr);
        }
        if (bVar instanceof C42081f.C42082a) {
            return m122231f((C42081f.C42082a) bVar, iArr);
        }
        if (bVar instanceof C42079e.C42080a) {
            return m122229d((C42079e.C42080a) bVar, iArr);
        }
        throw new IllegalArgumentException("Unrecognized Context");
    }

    /* renamed from: d */
    public static C42079e m122229d(C42079e.C42080a aVar, int[] iArr) {
        EGLContext eGLContext;
        if (aVar == null) {
            eGLContext = null;
        } else {
            eGLContext = aVar.mo97557a();
        }
        return new EglBase10Impl(eGLContext, iArr);
    }

    /* renamed from: e */
    public static C42079e m122230e(int[] iArr) {
        return new EglBase10Impl((EGLContext) null, iArr);
    }

    /* renamed from: f */
    public static C42081f m122231f(C42081f.C42082a aVar, int[] iArr) {
        android.opengl.EGLContext eGLContext;
        if (aVar == null) {
            eGLContext = null;
        } else {
            eGLContext = aVar.mo97593a();
        }
        return new C42083g(eGLContext, iArr);
    }

    /* renamed from: g */
    public static C42081f m122232g(int[] iArr) {
        return new C42083g((android.opengl.EGLContext) null, iArr);
    }

    /* renamed from: h */
    public static int m122233h(int[] iArr) {
        for (int i = 0; i < iArr.length - 1; i++) {
            if (iArr[i] == 12352) {
                int i2 = iArr[i + 1];
                if (i2 == 4) {
                    return 2;
                }
                if (i2 != 64) {
                    return 1;
                }
                return 3;
            }
        }
        return 1;
    }
}
