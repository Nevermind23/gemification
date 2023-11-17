package org.webrtc;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.opengl.GLException;
import android.view.Surface;
import android.view.SurfaceHolder;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import org.webrtc.C42076d;
import org.webrtc.C42079e;

class EglBase10Impl implements C42079e {

    /* renamed from: g */
    private final EGL10 f98805g;

    /* renamed from: h */
    private EGLContext f98806h;

    /* renamed from: i */
    private EGLConfig f98807i;

    /* renamed from: j */
    private EGLDisplay f98808j;

    /* renamed from: k */
    private EGLSurface f98809k = EGL10.EGL_NO_SURFACE;

    /* renamed from: org.webrtc.EglBase10Impl$a */
    class C42051a implements SurfaceHolder {

        /* renamed from: a */
        private final Surface f98810a;

        C42051a(Surface surface) {
            this.f98810a = surface;
        }

        public void addCallback(SurfaceHolder.Callback callback) {
        }

        public Surface getSurface() {
            return this.f98810a;
        }

        public Rect getSurfaceFrame() {
            return null;
        }

        public boolean isCreating() {
            return false;
        }

        public Canvas lockCanvas() {
            return null;
        }

        public void removeCallback(SurfaceHolder.Callback callback) {
        }

        public void setFixedSize(int i, int i2) {
        }

        public void setFormat(int i) {
        }

        public void setKeepScreenOn(boolean z) {
        }

        public void setSizeFromLayout() {
        }

        public void setType(int i) {
        }

        public void unlockCanvasAndPost(Canvas canvas) {
        }

        public Canvas lockCanvas(Rect rect) {
            return null;
        }
    }

    /* renamed from: org.webrtc.EglBase10Impl$b */
    private static class C42052b implements C42079e.C42080a {

        /* renamed from: a */
        private final EGL10 f98812a;

        /* renamed from: b */
        private final EGLContext f98813b;

        /* renamed from: c */
        private final EGLConfig f98814c;

        public C42052b(EGL10 egl10, EGLContext eGLContext, EGLConfig eGLConfig) {
            this.f98812a = egl10;
            this.f98813b = eGLContext;
            this.f98814c = eGLConfig;
        }

        /* renamed from: a */
        public EGLContext mo97557a() {
            return this.f98813b;
        }
    }

    public EglBase10Impl(EGLContext eGLContext, int[] iArr) {
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.f98805g = egl10;
        EGLDisplay m = m122170m();
        this.f98808j = m;
        this.f98807i = m122169l(egl10, m, iArr);
        int h = C42075c.m122233h(iArr);
        Logging.m122183b("EglBase10Impl", "Using OpenGL ES version " + h);
        this.f98806h = m122167j(eGLContext, this.f98808j, this.f98807i, h);
    }

    /* renamed from: i */
    private void m122166i() {
        if (this.f98808j == EGL10.EGL_NO_DISPLAY || this.f98806h == EGL10.EGL_NO_CONTEXT || this.f98807i == null) {
            throw new RuntimeException("This object has been released");
        }
    }

    /* renamed from: j */
    private EGLContext m122167j(EGLContext eGLContext, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i) {
        EGLContext eglCreateContext;
        if (eGLContext == null || eGLContext != EGL10.EGL_NO_CONTEXT) {
            int[] iArr = {12440, i, 12344};
            if (eGLContext == null) {
                eGLContext = EGL10.EGL_NO_CONTEXT;
            }
            synchronized (C42076d.f98959a) {
                eglCreateContext = this.f98805g.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, iArr);
            }
            if (eglCreateContext != EGL10.EGL_NO_CONTEXT) {
                return eglCreateContext;
            }
            int eglGetError = this.f98805g.eglGetError();
            throw new GLException(eglGetError, "Failed to create EGL context: 0x" + Integer.toHexString(this.f98805g.eglGetError()));
        }
        throw new RuntimeException("Invalid sharedContext");
    }

    /* renamed from: k */
    private void m122168k(Object obj) {
        if ((obj instanceof SurfaceHolder) || (obj instanceof SurfaceTexture)) {
            m122166i();
            if (this.f98809k == EGL10.EGL_NO_SURFACE) {
                EGLSurface eglCreateWindowSurface = this.f98805g.eglCreateWindowSurface(this.f98808j, this.f98807i, obj, new int[]{12344});
                this.f98809k = eglCreateWindowSurface;
                if (eglCreateWindowSurface == EGL10.EGL_NO_SURFACE) {
                    int eglGetError = this.f98805g.eglGetError();
                    throw new GLException(eglGetError, "Failed to create window surface: 0x" + Integer.toHexString(this.f98805g.eglGetError()));
                }
                return;
            }
            throw new RuntimeException("Already has an EGLSurface");
        }
        throw new IllegalStateException("Input must be either a SurfaceHolder or SurfaceTexture");
    }

    /* renamed from: l */
    private static EGLConfig m122169l(EGL10 egl10, EGLDisplay eGLDisplay, int[] iArr) {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        if (!egl10.eglChooseConfig(eGLDisplay, iArr, eGLConfigArr, 1, iArr2)) {
            int eglGetError = egl10.eglGetError();
            throw new GLException(eglGetError, "eglChooseConfig failed: 0x" + Integer.toHexString(egl10.eglGetError()));
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

    /* renamed from: m */
    private EGLDisplay m122170m() {
        EGLDisplay eglGetDisplay = this.f98805g.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        if (eglGetDisplay != EGL10.EGL_NO_DISPLAY) {
            if (this.f98805g.eglInitialize(eglGetDisplay, new int[2])) {
                return eglGetDisplay;
            }
            int eglGetError = this.f98805g.eglGetError();
            throw new GLException(eglGetError, "Unable to initialize EGL10: 0x" + Integer.toHexString(this.f98805g.eglGetError()));
        }
        int eglGetError2 = this.f98805g.eglGetError();
        throw new GLException(eglGetError2, "Unable to get EGL10 display: 0x" + Integer.toHexString(this.f98805g.eglGetError()));
    }

    /* renamed from: a */
    public void mo97536a() {
        m122166i();
        mo97543h();
        mo97539d();
        this.f98805g.eglDestroyContext(this.f98808j, this.f98806h);
        this.f98805g.eglTerminate(this.f98808j);
        this.f98806h = EGL10.EGL_NO_CONTEXT;
        this.f98808j = EGL10.EGL_NO_DISPLAY;
        this.f98807i = null;
    }

    /* renamed from: b */
    public void mo97537b(Surface surface) {
        m122168k(new C42051a(surface));
    }

    /* renamed from: c */
    public C42076d.C42078b mo97538c() {
        return new C42052b(this.f98805g, this.f98806h, this.f98807i);
    }

    /* renamed from: d */
    public void mo97539d() {
        synchronized (C42076d.f98959a) {
            EGL10 egl10 = this.f98805g;
            EGLDisplay eGLDisplay = this.f98808j;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT)) {
                int eglGetError = this.f98805g.eglGetError();
                throw new GLException(eglGetError, "eglDetachCurrent failed: 0x" + Integer.toHexString(this.f98805g.eglGetError()));
            }
        }
    }

    /* renamed from: e */
    public boolean mo97540e() {
        return this.f98809k != EGL10.EGL_NO_SURFACE;
    }

    /* renamed from: f */
    public void mo97541f(SurfaceTexture surfaceTexture) {
        m122168k(surfaceTexture);
    }

    /* renamed from: g */
    public void mo97542g() {
        m122166i();
        if (this.f98809k != EGL10.EGL_NO_SURFACE) {
            synchronized (C42076d.f98959a) {
                EGL10 egl10 = this.f98805g;
                EGLDisplay eGLDisplay = this.f98808j;
                EGLSurface eGLSurface = this.f98809k;
                if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f98806h)) {
                    int eglGetError = this.f98805g.eglGetError();
                    throw new GLException(eglGetError, "eglMakeCurrent failed: 0x" + Integer.toHexString(this.f98805g.eglGetError()));
                }
            }
            return;
        }
        throw new RuntimeException("No EGLSurface - can't make current");
    }

    /* renamed from: h */
    public void mo97543h() {
        EGLSurface eGLSurface = this.f98809k;
        if (eGLSurface != EGL10.EGL_NO_SURFACE) {
            this.f98805g.eglDestroySurface(this.f98808j, eGLSurface);
            this.f98809k = EGL10.EGL_NO_SURFACE;
        }
    }
}
