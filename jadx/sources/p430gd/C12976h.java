package p430gd;

import android.content.Context;
import android.hardware.Camera;
import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import p174mb.C7154b;
import p187nb.C7355a;
import p341ge.bog.mobilebank.p975ui.views.widgets.cropview.subscaleview.SubsamplingScaleImageView;
import p416fd.C12861p;
import p416fd.C12862q;

/* renamed from: gd.h */
public final class C12976h {
    /* access modifiers changed from: private */

    /* renamed from: n */
    public static final String f38255n = "h";

    /* renamed from: a */
    private Camera f38256a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Camera.CameraInfo f38257b;

    /* renamed from: c */
    private C12963a f38258c;

    /* renamed from: d */
    private C7154b f38259d;

    /* renamed from: e */
    private boolean f38260e;

    /* renamed from: f */
    private String f38261f;

    /* renamed from: g */
    private C12978i f38262g = new C12978i();

    /* renamed from: h */
    private C12983m f38263h;

    /* renamed from: i */
    private C12861p f38264i;

    /* renamed from: j */
    private C12861p f38265j;

    /* renamed from: k */
    private int f38266k = -1;

    /* renamed from: l */
    private Context f38267l;

    /* renamed from: m */
    private final C12977a f38268m;

    /* renamed from: gd.h$a */
    private final class C12977a implements Camera.PreviewCallback {

        /* renamed from: d */
        private C12986p f38269d;

        /* renamed from: e */
        private C12861p f38270e;

        public C12977a() {
        }

        /* renamed from: a */
        public void mo33760a(C12986p pVar) {
            this.f38269d = pVar;
        }

        /* renamed from: b */
        public void mo33761b(C12861p pVar) {
            this.f38270e = pVar;
        }

        public void onPreviewFrame(byte[] bArr, Camera camera) {
            C12861p pVar = this.f38270e;
            C12986p pVar2 = this.f38269d;
            if (pVar == null || pVar2 == null) {
                Log.d(C12976h.f38255n, "Got preview callback, but no handler or resolution available");
                if (pVar2 != null) {
                    pVar2.mo33519a(new Exception("No resolution available"));
                }
            } else if (bArr != null) {
                try {
                    byte[] bArr2 = bArr;
                    C12862q qVar = new C12862q(bArr2, pVar.f38002d, pVar.f38003e, camera.getParameters().getPreviewFormat(), C12976h.this.mo33748f());
                    if (C12976h.this.f38257b.facing == 1) {
                        qVar.mo33541e(true);
                    }
                    pVar2.mo33520b(qVar);
                } catch (RuntimeException e) {
                    Log.e(C12976h.f38255n, "Camera preview failed", e);
                    pVar2.mo33519a(e);
                }
            } else {
                throw new NullPointerException("No preview data received");
            }
        }
    }

    public C12976h(Context context) {
        this.f38267l = context;
        this.f38268m = new C12977a();
    }

    /* renamed from: c */
    private int m48955c() {
        int i;
        int c = this.f38263h.mo33780c();
        int i2 = 0;
        if (c != 0) {
            if (c == 1) {
                i2 = 90;
            } else if (c == 2) {
                i2 = SubsamplingScaleImageView.ORIENTATION_180;
            } else if (c == 3) {
                i2 = SubsamplingScaleImageView.ORIENTATION_270;
            }
        }
        Camera.CameraInfo cameraInfo = this.f38257b;
        if (cameraInfo.facing == 1) {
            i = (360 - ((cameraInfo.orientation + i2) % 360)) % 360;
        } else {
            i = ((cameraInfo.orientation - i2) + 360) % 360;
        }
        String str = f38255n;
        Log.i(str, "Camera Display Orientation: " + i);
        return i;
    }

    /* renamed from: g */
    private Camera.Parameters m48956g() {
        Camera.Parameters parameters = this.f38256a.getParameters();
        String str = this.f38261f;
        if (str == null) {
            this.f38261f = parameters.flatten();
        } else {
            parameters.unflatten(str);
        }
        return parameters;
    }

    /* renamed from: i */
    private static List m48957i(Camera.Parameters parameters) {
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        ArrayList arrayList = new ArrayList();
        if (supportedPreviewSizes == null) {
            Camera.Size previewSize = parameters.getPreviewSize();
            if (previewSize != null) {
                new C12861p(previewSize.width, previewSize.height);
                arrayList.add(new C12861p(previewSize.width, previewSize.height));
            }
            return arrayList;
        }
        for (Camera.Size next : supportedPreviewSizes) {
            arrayList.add(new C12861p(next.width, next.height));
        }
        return arrayList;
    }

    /* renamed from: n */
    private void m48958n(int i) {
        this.f38256a.setDisplayOrientation(i);
    }

    /* renamed from: p */
    private void m48959p(boolean z) {
        Camera.Parameters g = m48956g();
        if (g == null) {
            Log.w(f38255n, "Device error: no camera parameters are available. Proceeding without configuration.");
            return;
        }
        String str = f38255n;
        Log.i(str, "Initial camera parameters: " + g.flatten());
        if (z) {
            Log.w(str, "In camera config safe mode -- most settings will not be honored");
        }
        C12967c.m48916g(g, this.f38262g.mo33763a(), z);
        if (!z) {
            C12967c.m48920k(g, false);
            if (this.f38262g.mo33770h()) {
                C12967c.m48918i(g);
            }
            if (this.f38262g.mo33767e()) {
                C12967c.m48912c(g);
            }
            if (this.f38262g.mo33769g()) {
                C12967c.m48921l(g);
                C12967c.m48917h(g);
                C12967c.m48919j(g);
            }
        }
        List i = m48957i(g);
        if (i.size() == 0) {
            this.f38264i = null;
        } else {
            C12861p a = this.f38263h.mo33778a(i, mo33750j());
            this.f38264i = a;
            g.setPreviewSize(a.f38002d, a.f38003e);
        }
        if (Build.DEVICE.equals("glass-1")) {
            C12967c.m48914e(g);
        }
        Log.i(str, "Final camera parameters: " + g.flatten());
        this.f38256a.setParameters(g);
    }

    /* renamed from: r */
    private void m48960r() {
        try {
            int c = m48955c();
            this.f38266k = c;
            m48958n(c);
        } catch (Exception unused) {
            Log.w(f38255n, "Failed to set rotation.");
        }
        try {
            m48959p(false);
        } catch (Exception unused2) {
            try {
                m48959p(true);
            } catch (Exception unused3) {
                Log.w(f38255n, "Camera rejected even safe-mode parameters! No configuration");
            }
        }
        Camera.Size previewSize = this.f38256a.getParameters().getPreviewSize();
        if (previewSize == null) {
            this.f38265j = this.f38264i;
        } else {
            this.f38265j = new C12861p(previewSize.width, previewSize.height);
        }
        this.f38268m.mo33761b(this.f38265j);
    }

    /* renamed from: d */
    public void mo33746d() {
        Camera camera = this.f38256a;
        if (camera != null) {
            camera.release();
            this.f38256a = null;
        }
    }

    /* renamed from: e */
    public void mo33747e() {
        if (this.f38256a != null) {
            m48960r();
            return;
        }
        throw new RuntimeException("Camera not open");
    }

    /* renamed from: f */
    public int mo33748f() {
        return this.f38266k;
    }

    /* renamed from: h */
    public C12861p mo33749h() {
        if (this.f38265j == null) {
            return null;
        }
        if (mo33750j()) {
            return this.f38265j.mo33530b();
        }
        return this.f38265j;
    }

    /* renamed from: j */
    public boolean mo33750j() {
        int i = this.f38266k;
        if (i == -1) {
            throw new IllegalStateException("Rotation not calculated yet. Call configure() first.");
        } else if (i % SubsamplingScaleImageView.ORIENTATION_180 != 0) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: k */
    public boolean mo33751k() {
        String flashMode;
        Camera.Parameters parameters = this.f38256a.getParameters();
        if (parameters == null || (flashMode = parameters.getFlashMode()) == null) {
            return false;
        }
        if ("on".equals(flashMode) || "torch".equals(flashMode)) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public void mo33752l() {
        Camera b = C7355a.m28043b(this.f38262g.mo33764b());
        this.f38256a = b;
        if (b != null) {
            int a = C7355a.m28042a(this.f38262g.mo33764b());
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            this.f38257b = cameraInfo;
            Camera.getCameraInfo(a, cameraInfo);
            return;
        }
        throw new RuntimeException("Failed to open camera");
    }

    /* renamed from: m */
    public void mo33753m(C12986p pVar) {
        Camera camera = this.f38256a;
        if (camera != null && this.f38260e) {
            this.f38268m.mo33760a(pVar);
            camera.setOneShotPreviewCallback(this.f38268m);
        }
    }

    /* renamed from: o */
    public void mo33754o(C12978i iVar) {
        this.f38262g = iVar;
    }

    /* renamed from: q */
    public void mo33755q(C12983m mVar) {
        this.f38263h = mVar;
    }

    /* renamed from: s */
    public void mo33756s(C12980j jVar) {
        jVar.mo33772a(this.f38256a);
    }

    /* renamed from: t */
    public void mo33757t(boolean z) {
        if (this.f38256a != null) {
            try {
                if (z != mo33751k()) {
                    C12963a aVar = this.f38258c;
                    if (aVar != null) {
                        aVar.mo33723j();
                    }
                    Camera.Parameters parameters = this.f38256a.getParameters();
                    C12967c.m48920k(parameters, z);
                    if (this.f38262g.mo33768f()) {
                        C12967c.m48913d(parameters, z);
                    }
                    this.f38256a.setParameters(parameters);
                    C12963a aVar2 = this.f38258c;
                    if (aVar2 != null) {
                        aVar2.mo33722i();
                    }
                }
            } catch (RuntimeException e) {
                Log.e(f38255n, "Failed to set torch", e);
            }
        }
    }

    /* renamed from: u */
    public void mo33758u() {
        Camera camera = this.f38256a;
        if (camera != null && !this.f38260e) {
            camera.startPreview();
            this.f38260e = true;
            this.f38258c = new C12963a(this.f38256a, this.f38262g);
            C7154b bVar = new C7154b(this.f38267l, this, this.f38262g);
            this.f38259d = bVar;
            bVar.mo21414d();
        }
    }

    /* renamed from: v */
    public void mo33759v() {
        C12963a aVar = this.f38258c;
        if (aVar != null) {
            aVar.mo33723j();
            this.f38258c = null;
        }
        C7154b bVar = this.f38259d;
        if (bVar != null) {
            bVar.mo21415e();
            this.f38259d = null;
        }
        Camera camera = this.f38256a;
        if (camera != null && this.f38260e) {
            camera.stopPreview();
            this.f38268m.mo33760a((C12986p) null);
            this.f38260e = false;
        }
    }
}
