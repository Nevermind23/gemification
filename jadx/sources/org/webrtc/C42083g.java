package org.webrtc;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLException;
import android.view.Surface;
import org.webrtc.C42081f;

/* renamed from: org.webrtc.g */
class C42083g implements C42081f {

    /* renamed from: g */
    private EGLContext f98969g;

    /* renamed from: h */
    private EGLConfig f98970h;

    /* renamed from: i */
    private EGLDisplay f98971i;

    /* renamed from: j */
    private EGLSurface f98972j = EGL14.EGL_NO_SURFACE;

    /* renamed from: org.webrtc.g$a */
    public static class C42084a implements C42081f.C42082a {

        /* renamed from: a */
        private final EGLContext f98973a;

        public C42084a(EGLContext eGLContext) {
            this.f98973a = eGLContext;
        }

        /* renamed from: a */
        public EGLContext mo97593a() {
            return this.f98973a;
        }
    }

    public C42083g(EGLContext eGLContext, int[] iArr) {
        EGLDisplay n = m122252n();
        this.f98971i = n;
        this.f98970h = m122251m(n, iArr);
        int h = C42075c.m122233h(iArr);
        Logging.m122183b("EglBase14Impl", "Using OpenGL ES version " + h);
        this.f98969g = m122249j(eGLContext, this.f98971i, this.f98970h, h);
    }

    /* renamed from: i */
    private void m122248i() {
        if (this.f98971i == EGL14.EGL_NO_DISPLAY || this.f98969g == EGL14.EGL_NO_CONTEXT || this.f98970h == null) {
            throw new RuntimeException("This object has been released");
        }
    }

    /* renamed from: j */
    private static EGLContext m122249j(EGLContext eGLContext, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i) {
        EGLContext eglCreateContext;
        if (eGLContext == null || eGLContext != EGL14.EGL_NO_CONTEXT) {
            int[] iArr = {12440, i, 12344};
            if (eGLContext == null) {
                eGLContext = EGL14.EGL_NO_CONTEXT;
            }
            synchronized (C42076d.f98959a) {
                eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, iArr, 0);
            }
            if (eglCreateContext != EGL14.EGL_NO_CONTEXT) {
                return eglCreateContext;
            }
            int eglGetError = EGL14.eglGetError();
            throw new GLException(eglGetError, "Failed to create EGL context: 0x" + Integer.toHexString(EGL14.eglGetError()));
        }
        throw new RuntimeException("Invalid sharedContext");
    }

    /* renamed from: k */
    private void m122250k(Object obj) {
        if ((obj instanceof Surface) || (obj instanceof SurfaceTexture)) {
            m122248i();
            if (this.f98972j == EGL14.EGL_NO_SURFACE) {
                EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.f98971i, this.f98970h, obj, new int[]{12344}, 0);
                this.f98972j = eglCreateWindowSurface;
                if (eglCreateWindowSurface == EGL14.EGL_NO_SURFACE) {
                    int eglGetError = EGL14.eglGetError();
                    throw new GLException(eglGetError, "Failed to create window surface: 0x" + Integer.toHexString(EGL14.eglGetError()));
                }
                return;
            }
            throw new RuntimeException("Already has an EGLSurface");
        }
        throw new IllegalStateException("Input must be either a Surface or SurfaceTexture");
    }

    /* renamed from: m */
    private static EGLConfig m122251m(EGLDisplay eGLDisplay, int[] iArr) {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        if (!EGL14.eglChooseConfig(eGLDisplay, iArr, 0, eGLConfigArr, 0, 1, iArr2, 0)) {
            int eglGetError = EGL14.eglGetError();
            throw new GLException(eglGetError, "eglChooseConfig failed: 0x" + Integer.toHexString(EGL14.eglGetError()));
        } else if (iArr2[0] > 0) {
            EGLConfig eGLConfig = eGLConfigArr[0];
            if (eGLConfig != null) {
                return eGLConfig;
            }
            throw new RuntimeException("eglChooseConfig returned null");
        } else {
            throw new RuntimeException("Unable to find any matching EGL config");
        }
    }

    /* renamed from: n */
    private static EGLDisplay m122252n() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
            int[] iArr = new int[2];
            if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                return eglGetDisplay;
            }
            int eglGetError = EGL14.eglGetError();
            throw new GLException(eglGetError, "Unable to initialize EGL14: 0x" + Integer.toHexString(EGL14.eglGetError()));
        }
        int eglGetError2 = EGL14.eglGetError();
        throw new GLException(eglGetError2, "Unable to get EGL14 display: 0x" + Integer.toHexString(EGL14.eglGetError()));
    }

    /* renamed from: a */
    public void mo97536a() {
        m122248i();
        mo97543h();
        mo97539d();
        synchronized (C42076d.f98959a) {
            EGL14.eglDestroyContext(this.f98971i, this.f98969g);
        }
        EGL14.eglReleaseThread();
        EGL14.eglTerminate(this.f98971i);
        this.f98969g = EGL14.EGL_NO_CONTEXT;
        this.f98971i = EGL14.EGL_NO_DISPLAY;
        this.f98970h = null;
    }

    /* renamed from: b */
    public void mo97537b(Surface surface) {
        m122250k(surface);
    }

    /* renamed from: d */
    public void mo97539d() {
        synchronized (C42076d.f98959a) {
            EGLDisplay eGLDisplay = this.f98971i;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT)) {
                int eglGetError = EGL14.eglGetError();
                throw new GLException(eglGetError, "eglDetachCurrent failed: 0x" + Integer.toHexString(EGL14.eglGetError()));
            }
        }
    }

    /* renamed from: e */
    public boolean mo97540e() {
        return this.f98972j != EGL14.EGL_NO_SURFACE;
    }

    /* renamed from: f */
    public void mo97541f(SurfaceTexture surfaceTexture) {
        m122250k(surfaceTexture);
    }

    /* renamed from: g */
    public void mo97542g() {
        m122248i();
        if (this.f98972j != EGL14.EGL_NO_SURFACE) {
            synchronized (C42076d.f98959a) {
                EGLDisplay eGLDisplay = this.f98971i;
                EGLSurface eGLSurface = this.f98972j;
                if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f98969g)) {
                    int eglGetError = EGL14.eglGetError();
                    throw new GLException(eglGetError, "eglMakeCurrent failed: 0x" + Integer.toHexString(EGL14.eglGetError()));
                }
            }
            return;
        }
        throw new RuntimeException("No EGLSurface - can't make current");
    }

    /* renamed from: h */
    public void mo97543h() {
        EGLSurface eGLSurface = this.f98972j;
        if (eGLSurface != EGL14.EGL_NO_SURFACE) {
            EGL14.eglDestroySurface(this.f98971i, eGLSurface);
            this.f98972j = EGL14.EGL_NO_SURFACE;
        }
    }

    /* renamed from: l */
    public C42084a mo97538c() {
        return new C42084a(this.f98969g);
    }
}
