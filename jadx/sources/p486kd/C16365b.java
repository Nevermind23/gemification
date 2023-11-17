package p486kd;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.location.Location;
import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import android.util.Pair;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.github.mikephil.charting.utils.Utils;
import com.otaliastudios.cameraview.C11278a;
import com.otaliastudios.cameraview.C11280b;
import com.otaliastudios.cameraview.CameraException;
import com.otaliastudios.cameraview.video.C11289c;
import com.otaliastudios.cameraview.video.C11291d;
import com.otaliastudios.cameraview.video.Full2VideoRecorder;
import com.salesforce.marketingcloud.C11398b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import p337z7.C9227g;
import p337z7.C9231i;
import p337z7.Task;
import p346ae.C9805b;
import p346ae.C9814f;
import p360be.C10241a;
import p360be.C10254d;
import p374ce.C10395a;
import p374ce.C10396b;
import p458id.C15600b;
import p472jd.C15749f;
import p472jd.C15750g;
import p472jd.C15752i;
import p472jd.C15753j;
import p472jd.C15754k;
import p472jd.C15757n;
import p486kd.C16401d;
import p500ld.C16544a;
import p500ld.C16546c;
import p500ld.C16549e;
import p500ld.C16550f;
import p500ld.C16551g;
import p500ld.C16552h;
import p528nd.C16915b;
import p542od.C17176g;
import p542od.C17177h;
import p570qd.C17486a;
import p570qd.C17488b;
import p570qd.C17489c;
import p584rd.C17583b;
import p598sd.C17757b;
import p598sd.C17758c;
import p625ud.C18110b;
import p625ud.C18111c;
import p625ud.C18113e;
import p638vd.C18298a;
import p651wd.C18502b;
import p651wd.C18504d;
import p679yd.C18879b;

/* renamed from: kd.b */
public class C16365b extends C16392c implements ImageReader.OnImageAvailableListener, C16546c {
    /* access modifiers changed from: private */

    /* renamed from: g0 */
    public final CameraManager f46229g0 = ((CameraManager) mo43506B().mo29435b().getSystemService("camera"));
    /* access modifiers changed from: private */

    /* renamed from: h0 */
    public String f46230h0;
    /* access modifiers changed from: private */

    /* renamed from: i0 */
    public CameraDevice f46231i0;
    /* access modifiers changed from: private */

    /* renamed from: j0 */
    public CameraCharacteristics f46232j0;
    /* access modifiers changed from: private */

    /* renamed from: k0 */
    public CameraCaptureSession f46233k0;
    /* access modifiers changed from: private */

    /* renamed from: l0 */
    public CaptureRequest.Builder f46234l0;
    /* access modifiers changed from: private */

    /* renamed from: m0 */
    public TotalCaptureResult f46235m0;

    /* renamed from: n0 */
    private final C16915b f46236n0 = C16915b.m59507a();

    /* renamed from: o0 */
    private ImageReader f46237o0;

    /* renamed from: p0 */
    private Surface f46238p0;

    /* renamed from: q0 */
    private Surface f46239q0;

    /* renamed from: r0 */
    private C11280b.C11281a f46240r0;

    /* renamed from: s0 */
    private ImageReader f46241s0;

    /* renamed from: t0 */
    private final boolean f46242t0 = false;
    /* access modifiers changed from: private */

    /* renamed from: u0 */
    public final List f46243u0 = new CopyOnWriteArrayList();

    /* renamed from: v0 */
    private C17176g f46244v0;

    /* renamed from: w0 */
    private final CameraCaptureSession.CaptureCallback f46245w0 = new C16376k();

    /* renamed from: kd.b$a */
    class C16366a implements Runnable {
        C16366a() {
        }

        public void run() {
            C16365b.this.m58214G2();
        }
    }

    /* renamed from: kd.b$b */
    class C16367b implements Runnable {

        /* renamed from: d */
        final /* synthetic */ C15750g f46247d;

        /* renamed from: e */
        final /* synthetic */ C15750g f46248e;

        C16367b(C15750g gVar, C15750g gVar2) {
            this.f46247d = gVar;
            this.f46248e = gVar2;
        }

        public void run() {
            boolean z;
            C16365b bVar = C16365b.this;
            boolean p2 = bVar.mo43387p2(bVar.f46234l0, this.f46247d);
            if (C16365b.this.mo43508Z() == C17757b.PREVIEW) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C16365b bVar2 = C16365b.this;
                bVar2.f46342r = C15750g.OFF;
                bVar2.mo43387p2(bVar2.f46234l0, this.f46247d);
                try {
                    C16365b.this.f46233k0.capture(C16365b.this.f46234l0.build(), (CameraCaptureSession.CaptureCallback) null, (Handler) null);
                    C16365b bVar3 = C16365b.this;
                    bVar3.f46342r = this.f46248e;
                    bVar3.mo43387p2(bVar3.f46234l0, this.f46247d);
                    C16365b.this.mo43392u2();
                } catch (CameraAccessException e) {
                    throw C16365b.this.m58239z2(e);
                }
            } else if (p2) {
                C16365b.this.mo43392u2();
            }
        }
    }

    /* renamed from: kd.b$c */
    class C16368c implements Runnable {

        /* renamed from: d */
        final /* synthetic */ Location f46250d;

        C16368c(Location location) {
            this.f46250d = location;
        }

        public void run() {
            C16365b bVar = C16365b.this;
            if (bVar.mo43390s2(bVar.f46234l0, this.f46250d)) {
                C16365b.this.mo43392u2();
            }
        }
    }

    /* renamed from: kd.b$d */
    class C16369d implements Runnable {

        /* renamed from: d */
        final /* synthetic */ C15757n f46252d;

        C16369d(C15757n nVar) {
            this.f46252d = nVar;
        }

        public void run() {
            C16365b bVar = C16365b.this;
            if (bVar.mo43393w2(bVar.f46234l0, this.f46252d)) {
                C16365b.this.mo43392u2();
            }
        }
    }

    /* renamed from: kd.b$e */
    class C16370e implements Runnable {

        /* renamed from: d */
        final /* synthetic */ C15752i f46254d;

        C16370e(C15752i iVar) {
            this.f46254d = iVar;
        }

        public void run() {
            C16365b bVar = C16365b.this;
            if (bVar.mo43389r2(bVar.f46234l0, this.f46254d)) {
                C16365b.this.mo43392u2();
            }
        }
    }

    /* renamed from: kd.b$f */
    class C16371f implements Runnable {

        /* renamed from: d */
        final /* synthetic */ float f46256d;

        /* renamed from: e */
        final /* synthetic */ boolean f46257e;

        /* renamed from: f */
        final /* synthetic */ float f46258f;

        /* renamed from: g */
        final /* synthetic */ PointF[] f46259g;

        C16371f(float f, boolean z, float f2, PointF[] pointFArr) {
            this.f46256d = f;
            this.f46257e = z;
            this.f46258f = f2;
            this.f46259g = pointFArr;
        }

        public void run() {
            C16365b bVar = C16365b.this;
            if (bVar.mo43394x2(bVar.f46234l0, this.f46256d)) {
                C16365b.this.mo43392u2();
                if (this.f46257e) {
                    C16365b.this.mo43506B().mo29452q(this.f46258f, this.f46259g);
                }
            }
        }
    }

    /* renamed from: kd.b$g */
    class C16372g implements Runnable {

        /* renamed from: d */
        final /* synthetic */ float f46261d;

        /* renamed from: e */
        final /* synthetic */ boolean f46262e;

        /* renamed from: f */
        final /* synthetic */ float f46263f;

        /* renamed from: g */
        final /* synthetic */ float[] f46264g;

        /* renamed from: h */
        final /* synthetic */ PointF[] f46265h;

        C16372g(float f, boolean z, float f2, float[] fArr, PointF[] pointFArr) {
            this.f46261d = f;
            this.f46262e = z;
            this.f46263f = f2;
            this.f46264g = fArr;
            this.f46265h = pointFArr;
        }

        public void run() {
            C16365b bVar = C16365b.this;
            if (bVar.mo43385o2(bVar.f46234l0, this.f46261d)) {
                C16365b.this.mo43392u2();
                if (this.f46262e) {
                    C16365b.this.mo43506B().mo29447l(this.f46263f, this.f46264g, this.f46265h);
                }
            }
        }
    }

    /* renamed from: kd.b$h */
    class C16373h implements Runnable {

        /* renamed from: d */
        final /* synthetic */ float f46267d;

        C16373h(float f) {
            this.f46267d = f;
        }

        public void run() {
            C16365b bVar = C16365b.this;
            if (bVar.mo43391t2(bVar.f46234l0, this.f46267d)) {
                C16365b.this.mo43392u2();
            }
        }
    }

    /* renamed from: kd.b$i */
    class C16374i implements Comparator {

        /* renamed from: d */
        final /* synthetic */ boolean f46269d;

        C16374i(boolean z) {
            this.f46269d = z;
        }

        /* renamed from: a */
        public int compare(Range range, Range range2) {
            if (this.f46269d) {
                return (((Integer) range.getUpper()).intValue() - ((Integer) range.getLower()).intValue()) - (((Integer) range2.getUpper()).intValue() - ((Integer) range2.getLower()).intValue());
            }
            return (((Integer) range2.getUpper()).intValue() - ((Integer) range2.getLower()).intValue()) - (((Integer) range.getUpper()).intValue() - ((Integer) range.getLower()).intValue());
        }
    }

    /* renamed from: kd.b$j */
    class C16375j implements Runnable {
        C16375j() {
        }

        public void run() {
            C16365b.this.mo43513t0();
        }
    }

    /* renamed from: kd.b$k */
    class C16376k extends CameraCaptureSession.CaptureCallback {
        C16376k() {
        }

        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            TotalCaptureResult unused = C16365b.this.f46235m0 = totalCaptureResult;
            for (C16544a g : C16365b.this.f46243u0) {
                g.mo26302g(C16365b.this, captureRequest, totalCaptureResult);
            }
        }

        public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
            for (C16544a f : C16365b.this.f46243u0) {
                f.mo43693f(C16365b.this, captureRequest, captureResult);
            }
        }

        public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
            for (C16544a e : C16365b.this.f46243u0) {
                e.mo26301e(C16365b.this, captureRequest);
            }
        }
    }

    /* renamed from: kd.b$l */
    class C16377l implements Runnable {

        /* renamed from: d */
        final /* synthetic */ boolean f46273d;

        C16377l(boolean z) {
            this.f46273d = z;
        }

        public void run() {
            C17757b Z = C16365b.this.mo43508Z();
            C17757b bVar = C17757b.BIND;
            if (!Z.mo45341a(bVar) || !C16365b.this.mo43512l0()) {
                C16365b bVar2 = C16365b.this;
                bVar2.f46341q = this.f46273d;
                if (bVar2.mo43508Z().mo45341a(bVar)) {
                    C16365b.this.mo43515u0();
                    return;
                }
                return;
            }
            C16365b.this.mo43331H0(this.f46273d);
        }
    }

    /* renamed from: kd.b$m */
    class C16378m implements Runnable {

        /* renamed from: d */
        final /* synthetic */ int f46275d;

        C16378m(int i) {
            this.f46275d = i;
        }

        public void run() {
            C17757b Z = C16365b.this.mo43508Z();
            C17757b bVar = C17757b.BIND;
            if (!Z.mo45341a(bVar) || !C16365b.this.mo43512l0()) {
                C16365b bVar2 = C16365b.this;
                int i = this.f46275d;
                if (i <= 0) {
                    i = 35;
                }
                bVar2.f46340p = i;
                if (bVar2.mo43508Z().mo45341a(bVar)) {
                    C16365b.this.mo43515u0();
                    return;
                }
                return;
            }
            C16365b.this.mo43329D0(this.f46275d);
        }
    }

    /* renamed from: kd.b$n */
    class C16379n implements Runnable {

        /* renamed from: d */
        final /* synthetic */ C18298a f46277d;

        /* renamed from: e */
        final /* synthetic */ PointF f46278e;

        /* renamed from: f */
        final /* synthetic */ C18879b f46279f;

        /* renamed from: kd.b$n$a */
        class C16380a extends C16551g {

            /* renamed from: a */
            final /* synthetic */ C17176g f46281a;

            /* renamed from: kd.b$n$a$a */
            class C16381a implements Runnable {
                C16381a() {
                }

                public void run() {
                    C16365b.this.m58218L2();
                }
            }

            C16380a(C17176g gVar) {
                this.f46281a = gVar;
            }

            /* access modifiers changed from: protected */
            /* renamed from: b */
            public void mo26309b(C16544a aVar) {
                C16365b.this.mo43506B().mo29446k(C16379n.this.f46277d, this.f46281a.mo44593r(), C16379n.this.f46278e);
                C16365b.this.mo43507N().mo45330g("reset metering");
                if (C16365b.this.mo43464U1()) {
                    C16365b.this.mo43507N().mo45347x("reset metering", C17757b.PREVIEW, C16365b.this.mo43423A(), new C16381a());
                }
            }
        }

        C16379n(C18298a aVar, PointF pointF, C18879b bVar) {
            this.f46277d = aVar;
            this.f46278e = pointF;
            this.f46279f = bVar;
        }

        public void run() {
            if (C16365b.this.f46334j.mo42894m()) {
                C16365b.this.mo43506B().mo29439f(this.f46277d, this.f46278e);
                C17176g b2 = C16365b.this.m58210A2(this.f46279f);
                C16550f b = C16549e.m58777b(5000, b2);
                b.mo43692d(C16365b.this);
                b.mo43691c(new C16380a(b2));
            }
        }
    }

    /* renamed from: kd.b$o */
    class C16382o extends C16550f {
        C16382o() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: m */
        public void mo26303m(C16546c cVar) {
            super.mo26303m(cVar);
            C16365b.this.mo43384n2(cVar.mo43383m(this));
            CaptureRequest.Builder m = cVar.mo43383m(this);
            CaptureRequest.Key key = CaptureRequest.CONTROL_AE_LOCK;
            Boolean bool = Boolean.FALSE;
            m.set(key, bool);
            cVar.mo43383m(this).set(CaptureRequest.CONTROL_AWB_LOCK, bool);
            cVar.mo43378e(this);
            mo43702o(Integer.MAX_VALUE);
        }
    }

    /* renamed from: kd.b$p */
    static /* synthetic */ class C16383p {

        /* renamed from: a */
        static final /* synthetic */ int[] f46285a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                jd.k[] r0 = p472jd.C15754k.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f46285a = r0
                jd.k r1 = p472jd.C15754k.JPEG     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f46285a     // Catch:{ NoSuchFieldError -> 0x001d }
                jd.k r1 = p472jd.C15754k.DNG     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p486kd.C16365b.C16383p.<clinit>():void");
        }
    }

    /* renamed from: kd.b$q */
    class C16384q extends CameraDevice.StateCallback {

        /* renamed from: a */
        final /* synthetic */ C9227g f46286a;

        C16384q(C9227g gVar) {
            this.f46286a = gVar;
        }

        public void onDisconnected(CameraDevice cameraDevice) {
            CameraException cameraException = new CameraException(3);
            if (!this.f46286a.mo24883a().mo24872q()) {
                this.f46286a.mo24886d(cameraException);
                return;
            }
            C16401d.f46370h.mo42878c("CameraDevice.StateCallback reported disconnection.");
            throw cameraException;
        }

        public void onError(CameraDevice cameraDevice, int i) {
            if (!this.f46286a.mo24883a().mo24872q()) {
                this.f46286a.mo24886d(C16365b.this.m58238y2(i));
                return;
            }
            C16401d.f46370h.mo42877b("CameraDevice.StateCallback reported an error:", Integer.valueOf(i));
            throw new CameraException(3);
        }

        public void onOpened(CameraDevice cameraDevice) {
            int i;
            CameraDevice unused = C16365b.this.f46231i0 = cameraDevice;
            try {
                C16401d.f46370h.mo42878c("onStartEngine:", "Opened camera device.");
                C16365b bVar = C16365b.this;
                CameraCharacteristics unused2 = bVar.f46232j0 = bVar.f46229g0.getCameraCharacteristics(C16365b.this.f46230h0);
                boolean b = C16365b.this.mo43490w().mo45009b(C17489c.SENSOR, C17489c.VIEW);
                int i2 = C16383p.f46285a[C16365b.this.f46347w.ordinal()];
                if (i2 == 1) {
                    i = C11398b.f33139r;
                } else if (i2 == 2) {
                    i = 32;
                } else {
                    throw new IllegalArgumentException("Unknown format:" + C16365b.this.f46347w);
                }
                C16365b bVar2 = C16365b.this;
                bVar2.f46334j = new C17583b(bVar2.f46229g0, C16365b.this.f46230h0, b, i);
                C16365b bVar3 = C16365b.this;
                CaptureRequest.Builder unused3 = bVar3.m58211B2(bVar3.mo43375E2());
                this.f46286a.mo24887e(C16365b.this.f46334j);
            } catch (CameraAccessException e) {
                this.f46286a.mo24886d(C16365b.this.m58239z2(e));
            }
        }
    }

    /* renamed from: kd.b$r */
    class C16385r implements Callable {

        /* renamed from: d */
        final /* synthetic */ Object f46288d;

        C16385r(Object obj) {
            this.f46288d = obj;
        }

        /* renamed from: a */
        public Void call() {
            ((SurfaceHolder) this.f46288d).setFixedSize(C16365b.this.f46338n.mo27062e(), C16365b.this.f46338n.mo27060c());
            return null;
        }
    }

    /* renamed from: kd.b$s */
    class C16386s extends CameraCaptureSession.StateCallback {

        /* renamed from: a */
        final /* synthetic */ C9227g f46290a;

        C16386s(C9227g gVar) {
            this.f46290a = gVar;
        }

        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            RuntimeException runtimeException = new RuntimeException(C16401d.f46370h.mo42877b("onConfigureFailed! Session", cameraCaptureSession));
            if (!this.f46290a.mo24883a().mo24872q()) {
                this.f46290a.mo24886d(new CameraException(runtimeException, 2));
                return;
            }
            throw new CameraException(3);
        }

        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            CameraCaptureSession unused = C16365b.this.f46233k0 = cameraCaptureSession;
            C16401d.f46370h.mo42878c("onStartBind:", "Completed");
            this.f46290a.mo24887e((Object) null);
        }

        public void onReady(CameraCaptureSession cameraCaptureSession) {
            super.onReady(cameraCaptureSession);
            C16401d.f46370h.mo42878c("CameraCaptureSession.StateCallback reported onReady.");
        }
    }

    /* renamed from: kd.b$t */
    class C16387t implements Runnable {

        /* renamed from: d */
        final /* synthetic */ C11280b.C11281a f46292d;

        C16387t(C11280b.C11281a aVar) {
            this.f46292d = aVar;
        }

        public void run() {
            C16365b.this.m58212C2(this.f46292d);
        }
    }

    /* renamed from: kd.b$u */
    class C16388u extends C16550f {

        /* renamed from: e */
        final /* synthetic */ C9227g f46294e;

        C16388u(C9227g gVar) {
            this.f46294e = gVar;
        }

        /* renamed from: g */
        public void mo26302g(C16546c cVar, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            super.mo26302g(cVar, captureRequest, totalCaptureResult);
            mo43702o(Integer.MAX_VALUE);
            this.f46294e.mo24887e((Object) null);
        }
    }

    /* renamed from: kd.b$v */
    class C16389v extends C16551g {

        /* renamed from: a */
        final /* synthetic */ C11278a.C11279a f46296a;

        C16389v(C11278a.C11279a aVar) {
            this.f46296a = aVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo26309b(C16544a aVar) {
            C16365b.this.mo43454P0(false);
            C16365b.this.mo43487p1(this.f46296a);
            C16365b.this.mo43454P0(true);
        }
    }

    /* renamed from: kd.b$w */
    class C16390w extends C16551g {

        /* renamed from: a */
        final /* synthetic */ C11278a.C11279a f46298a;

        C16390w(C11278a.C11279a aVar) {
            this.f46298a = aVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo26309b(C16544a aVar) {
            C16365b.this.mo43449N0(false);
            C16365b.this.mo43486o1(this.f46298a);
            C16365b.this.mo43449N0(true);
        }
    }

    /* renamed from: kd.b$x */
    class C16391x implements Runnable {
        C16391x() {
        }

        public void run() {
            C16365b.this.m58218L2();
        }
    }

    public C16365b(C16401d.C16413l lVar) {
        super(lVar);
        new C16552h().mo43692d(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: A2 */
    public C17176g m58210A2(C18879b bVar) {
        boolean z;
        C17176g gVar = this.f46244v0;
        if (gVar != null) {
            gVar.mo43689a(this);
        }
        mo43388q2(this.f46234l0);
        if (bVar == null) {
            z = true;
        } else {
            z = false;
        }
        C17176g gVar2 = new C17176g(this, bVar, z);
        this.f46244v0 = gVar2;
        return gVar2;
    }

    /* access modifiers changed from: private */
    /* renamed from: B2 */
    public CaptureRequest.Builder m58211B2(int i) {
        CaptureRequest.Builder builder = this.f46234l0;
        CaptureRequest.Builder createCaptureRequest = this.f46231i0.createCaptureRequest(i);
        this.f46234l0 = createCaptureRequest;
        createCaptureRequest.setTag(Integer.valueOf(i));
        m58236m2(this.f46234l0, builder);
        return this.f46234l0;
    }

    /* access modifiers changed from: private */
    /* renamed from: C2 */
    public void m58212C2(C11280b.C11281a aVar) {
        C11291d dVar = this.f46336l;
        if (dVar instanceof Full2VideoRecorder) {
            Full2VideoRecorder full2VideoRecorder = (Full2VideoRecorder) dVar;
            try {
                m58211B2(3);
                m58235l2(full2VideoRecorder.mo29485v());
                m58237v2(true, 3);
                this.f46336l.mo29498n(aVar);
            } catch (CameraAccessException e) {
                mo29502p((C11280b.C11281a) null, e);
                throw m58239z2(e);
            } catch (CameraException e2) {
                mo29502p((C11280b.C11281a) null, e2);
                throw e2;
            }
        } else {
            throw new IllegalStateException("doTakeVideo called, but video recorder is not a Full2VideoRecorder! " + this.f46336l);
        }
    }

    /* renamed from: F2 */
    private Rect m58213F2(float f, float f2) {
        Rect rect = (Rect) mo43376H2(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE, new Rect());
        int width = rect.width() - ((int) (((float) rect.width()) / f2));
        int height = rect.height() - ((int) (((float) rect.height()) / f2));
        float f3 = f - 1.0f;
        float f4 = f2 - 1.0f;
        int i = (int) (((((float) width) * f3) / f4) / 2.0f);
        int i2 = (int) (((((float) height) * f3) / f4) / 2.0f);
        return new Rect(i, i2, rect.width() - i, rect.height() - i2);
    }

    /* access modifiers changed from: private */
    /* renamed from: G2 */
    public void m58214G2() {
        if (((Integer) this.f46234l0.build().getTag()).intValue() != mo43375E2()) {
            try {
                m58211B2(mo43375E2());
                m58235l2(new Surface[0]);
                mo43392u2();
            } catch (CameraAccessException e) {
                throw m58239z2(e);
            }
        }
    }

    /* renamed from: I2 */
    private Object m58215I2(CameraCharacteristics cameraCharacteristics, CameraCharacteristics.Key key, Object obj) {
        Object obj2 = cameraCharacteristics.get(key);
        return obj2 == null ? obj : obj2;
    }

    /* renamed from: J2 */
    private void m58216J2() {
        this.f46234l0.removeTarget(this.f46239q0);
        Surface surface = this.f46238p0;
        if (surface != null) {
            this.f46234l0.removeTarget(surface);
        }
    }

    /* renamed from: K2 */
    private void m58217K2(Range[] rangeArr) {
        boolean z;
        if (!mo43465V() || this.f46304D == Utils.FLOAT_EPSILON) {
            z = false;
        } else {
            z = true;
        }
        Arrays.sort(rangeArr, new C16374i(z));
    }

    /* access modifiers changed from: private */
    /* renamed from: L2 */
    public void m58218L2() {
        C16549e.m58776a(new C16382o(), new C17177h()).mo43692d(this);
    }

    /* renamed from: l2 */
    private void m58235l2(Surface... surfaceArr) {
        this.f46234l0.addTarget(this.f46239q0);
        Surface surface = this.f46238p0;
        if (surface != null) {
            this.f46234l0.addTarget(surface);
        }
        int length = surfaceArr.length;
        int i = 0;
        while (i < length) {
            Surface surface2 = surfaceArr[i];
            if (surface2 != null) {
                this.f46234l0.addTarget(surface2);
                i++;
            } else {
                throw new IllegalArgumentException("Should not add a null surface.");
            }
        }
    }

    /* renamed from: m2 */
    private void m58236m2(CaptureRequest.Builder builder, CaptureRequest.Builder builder2) {
        C16401d.f46370h.mo42878c("applyAllParameters:", "called for tag", builder.build().getTag());
        builder.set(CaptureRequest.CONTROL_MODE, 1);
        mo43384n2(builder);
        mo43387p2(builder, C15750g.OFF);
        mo43390s2(builder, (Location) null);
        mo43393w2(builder, C15757n.AUTO);
        mo43389r2(builder, C15752i.OFF);
        mo43394x2(builder, Utils.FLOAT_EPSILON);
        mo43385o2(builder, Utils.FLOAT_EPSILON);
        mo43391t2(builder, Utils.FLOAT_EPSILON);
        if (builder2 != null) {
            CaptureRequest.Key key = CaptureRequest.CONTROL_AF_REGIONS;
            builder.set(key, (MeteringRectangle[]) builder2.get(key));
            CaptureRequest.Key key2 = CaptureRequest.CONTROL_AE_REGIONS;
            builder.set(key2, (MeteringRectangle[]) builder2.get(key2));
            CaptureRequest.Key key3 = CaptureRequest.CONTROL_AWB_REGIONS;
            builder.set(key3, (MeteringRectangle[]) builder2.get(key3));
            CaptureRequest.Key key4 = CaptureRequest.CONTROL_AF_MODE;
            builder.set(key4, (Integer) builder2.get(key4));
        }
    }

    /* renamed from: v2 */
    private void m58237v2(boolean z, int i) {
        if ((mo43508Z() == C17757b.PREVIEW && !mo43512l0()) || !z) {
            try {
                this.f46233k0.setRepeatingRequest(this.f46234l0.build(), this.f46245w0, (Handler) null);
            } catch (CameraAccessException e) {
                throw new CameraException(e, i);
            } catch (IllegalStateException e2) {
                C16401d.f46370h.mo42877b("applyRepeatingRequestBuilder: session is invalid!", e2, "checkStarted:", Boolean.valueOf(z), "currentThread:", Thread.currentThread().getName(), "state:", mo43508Z(), "targetState:", mo43509a0());
                throw new CameraException(3);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: y2 */
    public CameraException m58238y2(int i) {
        int i2 = 1;
        if (!(i == 1 || i == 2 || i == 3 || i == 4 || i == 5)) {
            i2 = 0;
        }
        return new CameraException(i2);
    }

    /* access modifiers changed from: private */
    /* renamed from: z2 */
    public CameraException m58239z2(CameraAccessException cameraAccessException) {
        int reason = cameraAccessException.getReason();
        int i = 1;
        if (reason != 1) {
            if (reason == 2 || reason == 3) {
                i = 3;
            } else if (!(reason == 4 || reason == 5)) {
                i = 0;
            }
        }
        return new CameraException(cameraAccessException, i);
    }

    /* renamed from: A0 */
    public void mo43327A0(float f, float[] fArr, PointF[] pointFArr, boolean z) {
        float f2 = this.f46350z;
        this.f46350z = f;
        mo43507N().mo45335n("exposure correction", 20);
        this.f46326Z = mo43507N().mo45346w("exposure correction", C17757b.ENGINE, new C16372g(f2, z, f, fArr, pointFArr));
    }

    /* renamed from: C0 */
    public void mo43328C0(C15750g gVar) {
        C15750g gVar2 = this.f46342r;
        this.f46342r = gVar;
        C17758c N = mo43507N();
        this.f46327a0 = N.mo45346w("flash (" + gVar + ")", C17757b.ENGINE, new C16367b(gVar2, gVar));
    }

    /* renamed from: D0 */
    public void mo43329D0(int i) {
        if (this.f46340p == 0) {
            this.f46340p = 35;
        }
        C17758c N = mo43507N();
        N.mo45332i("frame processing format (" + i + ")", true, new C16378m(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: D2 */
    public List mo43374D2(Range[] rangeArr) {
        ArrayList arrayList = new ArrayList();
        int round = Math.round(this.f46334j.mo42885d());
        int round2 = Math.round(this.f46334j.mo42884c());
        for (Range range : rangeArr) {
            if ((range.contains(Integer.valueOf(round)) || range.contains(Integer.valueOf(round2))) && C18504d.m62992a(range)) {
                arrayList.add(range);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E2 */
    public int mo43375E2() {
        return 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G1 */
    public List mo43330G1() {
        try {
            StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.f46229g0.getCameraCharacteristics(this.f46230h0).get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
            if (streamConfigurationMap != null) {
                Size[] outputSizes = streamConfigurationMap.getOutputSizes(this.f46340p);
                ArrayList arrayList = new ArrayList(outputSizes.length);
                for (Size size : outputSizes) {
                    C10396b bVar = new C10396b(size.getWidth(), size.getHeight());
                    if (!arrayList.contains(bVar)) {
                        arrayList.add(bVar);
                    }
                }
                return arrayList;
            }
            throw new RuntimeException("StreamConfigurationMap is null. Should not happen.");
        } catch (CameraAccessException e) {
            throw m58239z2(e);
        }
    }

    /* renamed from: H0 */
    public void mo43331H0(boolean z) {
        C17758c N = mo43507N();
        N.mo45332i("has frame processors (" + z + ")", true, new C16377l(z));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H2 */
    public Object mo43376H2(CameraCharacteristics.Key key, Object obj) {
        return m58215I2(this.f46232j0, key, obj);
    }

    /* renamed from: I0 */
    public void mo43332I0(C15752i iVar) {
        C15752i iVar2 = this.f46346v;
        this.f46346v = iVar;
        C17758c N = mo43507N();
        this.f46329c0 = N.mo45346w("hdr (" + iVar + ")", C17757b.ENGINE, new C16370e(iVar2));
    }

    /* access modifiers changed from: protected */
    /* renamed from: I1 */
    public List mo43333I1() {
        try {
            StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.f46229g0.getCameraCharacteristics(this.f46230h0).get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
            if (streamConfigurationMap != null) {
                Size[] outputSizes = streamConfigurationMap.getOutputSizes(this.f46333i.mo26807j());
                ArrayList arrayList = new ArrayList(outputSizes.length);
                for (Size size : outputSizes) {
                    C10396b bVar = new C10396b(size.getWidth(), size.getHeight());
                    if (!arrayList.contains(bVar)) {
                        arrayList.add(bVar);
                    }
                }
                return arrayList;
            }
            throw new RuntimeException("StreamConfigurationMap is null. Should not happen.");
        } catch (CameraAccessException e) {
            throw m58239z2(e);
        }
    }

    /* renamed from: J0 */
    public void mo43334J0(Location location) {
        Location location2 = this.f46348x;
        this.f46348x = location;
        this.f46330d0 = mo43507N().mo45346w("location", C17757b.ENGINE, new C16368c(location2));
    }

    /* access modifiers changed from: protected */
    /* renamed from: L1 */
    public C18111c mo43335L1(int i) {
        return new C18113e(i);
    }

    /* renamed from: M0 */
    public void mo43336M0(C15754k kVar) {
        if (kVar != this.f46347w) {
            this.f46347w = kVar;
            C17758c N = mo43507N();
            N.mo45346w("picture format (" + kVar + ")", C17757b.ENGINE, new C16375j());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo43337O1() {
        C16401d.f46370h.mo42878c("onPreviewStreamSizeChanged:", "Calling restartBind().");
        mo43515u0();
    }

    /* renamed from: Q0 */
    public void mo43338Q0(boolean z) {
        this.f46301A = z;
        this.f46331e0 = C9231i.m34113g((Object) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q1 */
    public void mo43339Q1(C11278a.C11279a aVar, boolean z) {
        if (z) {
            C16401d.f46370h.mo42878c("onTakePicture:", "doMetering is true. Delaying.");
            C16550f b = C16549e.m58777b(2500, m58210A2((C18879b) null));
            b.mo43691c(new C16390w(aVar));
            b.mo43692d(this);
            return;
        }
        C16401d.f46370h.mo42878c("onTakePicture:", "doMetering is false. Performing.");
        C17486a w = mo43490w();
        C17489c cVar = C17489c.SENSOR;
        C17489c cVar2 = C17489c.OUTPUT;
        aVar.f32746c = w.mo45010c(cVar, cVar2, C17488b.RELATIVE_TO_SENSOR);
        aVar.f32747d = mo43456Q(cVar2);
        try {
            CaptureRequest.Builder createCaptureRequest = this.f46231i0.createCaptureRequest(2);
            m58236m2(createCaptureRequest, this.f46234l0);
            C9805b bVar = new C9805b(aVar, this, createCaptureRequest, this.f46241s0);
            this.f46335k = bVar;
            bVar.mo26297c();
        } catch (CameraAccessException e) {
            throw m58239z2(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: R1 */
    public void mo43340R1(C11278a.C11279a aVar, C10395a aVar2, boolean z) {
        if (z) {
            C16401d.f46370h.mo42878c("onTakePictureSnapshot:", "doMetering is true. Delaying.");
            C16550f b = C16549e.m58777b(2500, m58210A2((C18879b) null));
            b.mo43691c(new C16389v(aVar));
            b.mo43692d(this);
            return;
        }
        C16401d.f46370h.mo42878c("onTakePictureSnapshot:", "doMetering is false. Performing.");
        if (this.f46333i instanceof C10254d) {
            C17489c cVar = C17489c.OUTPUT;
            aVar.f32747d = mo43475b0(cVar);
            aVar.f32746c = mo43490w().mo45010c(C17489c.VIEW, cVar, C17488b.ABSOLUTE);
            C9814f fVar = new C9814f(aVar, this, (C10254d) this.f46333i, aVar2);
            this.f46335k = fVar;
            fVar.mo26297c();
            return;
        }
        throw new RuntimeException("takePictureSnapshot with Camera2 is only supported with Preview.GL_SURFACE");
    }

    /* renamed from: S0 */
    public void mo43341S0(float f) {
        float f2 = this.f46304D;
        this.f46304D = f;
        C17758c N = mo43507N();
        this.f46332f0 = N.mo45346w("preview fps (" + f + ")", C17757b.ENGINE, new C16373h(f2));
    }

    /* access modifiers changed from: protected */
    /* renamed from: S1 */
    public void mo43342S1(C11280b.C11281a aVar) {
        C10396b bVar;
        C15600b bVar2 = C16401d.f46370h;
        bVar2.mo42878c("onTakeVideo", "called.");
        C17486a w = mo43490w();
        C17489c cVar = C17489c.SENSOR;
        C17489c cVar2 = C17489c.OUTPUT;
        aVar.f32769c = w.mo45010c(cVar, cVar2, C17488b.RELATIVE_TO_SENSOR);
        if (mo43490w().mo45009b(cVar, cVar2)) {
            bVar = this.f46337m.mo27059b();
        } else {
            bVar = this.f46337m;
        }
        aVar.f32770d = bVar;
        bVar2.mo42880h("onTakeVideo", "calling restartBind.");
        this.f46240r0 = aVar;
        mo43515u0();
    }

    /* access modifiers changed from: protected */
    /* renamed from: T1 */
    public void mo43343T1(C11280b.C11281a aVar, C10395a aVar2) {
        C10241a aVar3 = this.f46333i;
        if (aVar3 instanceof C10254d) {
            C10254d dVar = (C10254d) aVar3;
            C17489c cVar = C17489c.OUTPUT;
            C10396b b0 = mo43475b0(cVar);
            if (b0 != null) {
                Rect a = C18502b.m62989a(b0, aVar2);
                aVar.f32770d = new C10396b(a.width(), a.height());
                aVar.f32769c = mo43490w().mo45010c(C17489c.VIEW, cVar, C17488b.ABSOLUTE);
                aVar.f32781o = Math.round(this.f46304D);
                C16401d.f46370h.mo42878c("onTakeVideoSnapshot", "rotation:", Integer.valueOf(aVar.f32769c), "size:", aVar.f32770d);
                C11289c cVar2 = new C11289c(this, dVar, mo43439H1());
                this.f46336l = cVar2;
                cVar2.mo29498n(aVar);
                return;
            }
            throw new IllegalStateException("outputSize should not be null.");
        }
        throw new IllegalStateException("Video snapshots are only supported with GL_SURFACE.");
    }

    /* renamed from: c */
    public void mo43377c(C16544a aVar) {
        this.f46243u0.remove(aVar);
    }

    /* renamed from: c1 */
    public void mo43345c1(C15757n nVar) {
        C15757n nVar2 = this.f46343s;
        this.f46343s = nVar;
        C17758c N = mo43507N();
        this.f46328b0 = N.mo45346w("white balance (" + nVar + ")", C17757b.ENGINE, new C16369d(nVar2));
    }

    /* renamed from: d */
    public void mo29501d() {
        boolean z;
        super.mo29501d();
        if (!(this.f46336l instanceof Full2VideoRecorder) || ((Integer) mo43376H2(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL, -1)).intValue() != 2) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            C15600b bVar = C16401d.f46370h;
            bVar.mo42880h("Applying the Issue549 workaround.", Thread.currentThread());
            m58214G2();
            bVar.mo42880h("Applied the Issue549 workaround. Sleeping...");
            try {
                Thread.sleep(600);
            } catch (InterruptedException unused) {
            }
            C16401d.f46370h.mo42880h("Applied the Issue549 workaround. Slept!");
        }
    }

    /* renamed from: d1 */
    public void mo43346d1(float f, PointF[] pointFArr, boolean z) {
        float f2 = this.f46349y;
        this.f46349y = f;
        mo43507N().mo45335n("zoom", 20);
        this.f46325Y = mo43507N().mo45346w("zoom", C17757b.ENGINE, new C16371f(f2, z, f, pointFArr));
    }

    /* renamed from: e */
    public void mo43378e(C16544a aVar) {
        mo43392u2();
    }

    /* renamed from: f1 */
    public void mo43347f1(C18298a aVar, C18879b bVar, PointF pointF) {
        C17758c N = mo43507N();
        N.mo45346w("autofocus (" + aVar + ")", C17757b.PREVIEW, new C16379n(aVar, pointF, bVar));
    }

    /* renamed from: g */
    public void mo43379g(C16544a aVar, CaptureRequest.Builder builder) {
        if (mo43508Z() == C17757b.PREVIEW && !mo43512l0()) {
            this.f46233k0.capture(builder.build(), this.f46245w0, (Handler) null);
        }
    }

    /* renamed from: h */
    public void mo43380h(C16544a aVar) {
        if (!this.f46243u0.contains(aVar)) {
            this.f46243u0.add(aVar);
        }
    }

    /* renamed from: i */
    public CameraCharacteristics mo43381i(C16544a aVar) {
        return this.f46232j0;
    }

    /* renamed from: k */
    public void mo26305k(C11278a.C11279a aVar, Exception exc) {
        boolean z;
        boolean z2 = this.f46335k instanceof C9805b;
        super.mo26305k(aVar, exc);
        if ((!z2 || !mo43453P()) && (z2 || !mo43459S())) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            mo43507N().mo45346w("reset metering after picture", C17757b.PREVIEW, new C16391x());
        }
    }

    /* renamed from: l */
    public TotalCaptureResult mo43382l(C16544a aVar) {
        return this.f46235m0;
    }

    /* renamed from: m */
    public CaptureRequest.Builder mo43383m(C16544a aVar) {
        return this.f46234l0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m0 */
    public Task mo43348m0() {
        int i;
        C15600b bVar = C16401d.f46370h;
        bVar.mo42878c("onStartBind:", "Started");
        C9227g gVar = new C9227g();
        this.f46337m = mo43425B1();
        this.f46338n = mo43432E1();
        ArrayList arrayList = new ArrayList();
        Class<SurfaceTexture> j = this.f46333i.mo26807j();
        Object i2 = this.f46333i.mo26806i();
        if (j == SurfaceHolder.class) {
            try {
                bVar.mo42878c("onStartBind:", "Waiting on UI thread...");
                C9231i.m34107a(C9231i.m34109c(new C16385r(i2)));
                this.f46239q0 = ((SurfaceHolder) i2).getSurface();
            } catch (InterruptedException | ExecutionException e) {
                throw new CameraException(e, 1);
            }
        } else if (j == SurfaceTexture.class) {
            SurfaceTexture surfaceTexture = (SurfaceTexture) i2;
            surfaceTexture.setDefaultBufferSize(this.f46338n.mo27062e(), this.f46338n.mo27060c());
            this.f46239q0 = new Surface(surfaceTexture);
        } else {
            throw new RuntimeException("Unknown CameraPreview output class.");
        }
        arrayList.add(this.f46239q0);
        if (mo43447M() == C15753j.VIDEO && this.f46240r0 != null) {
            Full2VideoRecorder full2VideoRecorder = new Full2VideoRecorder(this, this.f46230h0);
            try {
                arrayList.add(full2VideoRecorder.mo29484u(this.f46240r0));
                this.f46336l = full2VideoRecorder;
            } catch (Full2VideoRecorder.PrepareException e2) {
                throw new CameraException(e2, 1);
            }
        }
        if (mo43447M() == C15753j.PICTURE) {
            int i3 = C16383p.f46285a[this.f46347w.ordinal()];
            if (i3 == 1) {
                i = C11398b.f33139r;
            } else if (i3 == 2) {
                i = 32;
            } else {
                throw new IllegalArgumentException("Unknown format:" + this.f46347w);
            }
            ImageReader newInstance = ImageReader.newInstance(this.f46337m.mo27062e(), this.f46337m.mo27060c(), i, 2);
            this.f46241s0 = newInstance;
            arrayList.add(newInstance.getSurface());
        }
        if (mo43444K1()) {
            C10396b D1 = mo43429D1();
            this.f46339o = D1;
            ImageReader newInstance2 = ImageReader.newInstance(D1.mo27062e(), this.f46339o.mo27060c(), this.f46340p, mo43441J() + 1);
            this.f46237o0 = newInstance2;
            newInstance2.setOnImageAvailableListener(this, (Handler) null);
            Surface surface = this.f46237o0.getSurface();
            this.f46238p0 = surface;
            arrayList.add(surface);
        } else {
            this.f46237o0 = null;
            this.f46339o = null;
            this.f46238p0 = null;
        }
        try {
            this.f46231i0.createCaptureSession(arrayList, new C16386s(gVar), (Handler) null);
            return gVar.mo24883a();
        } catch (CameraAccessException e3) {
            throw m58239z2(e3);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n0 */
    public Task mo43349n0() {
        C9227g gVar = new C9227g();
        try {
            this.f46229g0.openCamera(this.f46230h0, new C16384q(gVar), (Handler) null);
            return gVar.mo24883a();
        } catch (CameraAccessException e) {
            throw m58239z2(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n2 */
    public void mo43384n2(CaptureRequest.Builder builder) {
        int[] iArr = (int[]) mo43376H2(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES, new int[0]);
        ArrayList arrayList = new ArrayList();
        for (int valueOf : iArr) {
            arrayList.add(Integer.valueOf(valueOf));
        }
        if (mo43447M() == C15753j.VIDEO && arrayList.contains(3)) {
            builder.set(CaptureRequest.CONTROL_AF_MODE, 3);
        } else if (arrayList.contains(4)) {
            builder.set(CaptureRequest.CONTROL_AF_MODE, 4);
        } else if (arrayList.contains(1)) {
            builder.set(CaptureRequest.CONTROL_AF_MODE, 1);
        } else if (arrayList.contains(0)) {
            builder.set(CaptureRequest.CONTROL_AF_MODE, 0);
            builder.set(CaptureRequest.LENS_FOCUS_DISTANCE, Float.valueOf(Utils.FLOAT_EPSILON));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o0 */
    public Task mo43350o0() {
        C15600b bVar = C16401d.f46370h;
        bVar.mo42878c("onStartPreview:", "Dispatching onCameraPreviewStreamSizeChanged.");
        mo43506B().mo29450o();
        C17489c cVar = C17489c.VIEW;
        C10396b W = mo43467W(cVar);
        if (W != null) {
            this.f46333i.mo26819v(W.mo27062e(), W.mo27060c());
            this.f46333i.mo26818u(mo43490w().mo45010c(C17489c.BASE, cVar, C17488b.ABSOLUTE));
            if (mo43444K1()) {
                mo43435F1().mo45787k(this.f46340p, this.f46339o, mo43490w());
            }
            bVar.mo42878c("onStartPreview:", "Starting preview.");
            m58235l2(new Surface[0]);
            m58237v2(false, 2);
            bVar.mo42878c("onStartPreview:", "Started preview.");
            C11280b.C11281a aVar = this.f46240r0;
            if (aVar != null) {
                this.f46240r0 = null;
                mo43507N().mo45346w("do take video", C17757b.PREVIEW, new C16387t(aVar));
            }
            C9227g gVar = new C9227g();
            new C16388u(gVar).mo43692d(this);
            return gVar.mo24883a();
        }
        throw new IllegalStateException("previewStreamSize should not be null at this point.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: o2 */
    public boolean mo43385o2(CaptureRequest.Builder builder, float f) {
        if (this.f46334j.mo42895n()) {
            builder.set(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, Integer.valueOf(Math.round(this.f46350z * ((Rational) mo43376H2(CameraCharacteristics.CONTROL_AE_COMPENSATION_STEP, new Rational(1, 1))).floatValue())));
            return true;
        }
        this.f46350z = f;
        return false;
    }

    public void onImageAvailable(ImageReader imageReader) {
        Image image;
        C16401d.f46370h.mo42879g("onImageAvailable:", "trying to acquire Image.");
        try {
            image = imageReader.acquireLatestImage();
        } catch (Exception unused) {
            image = null;
        }
        if (image == null) {
            C16401d.f46370h.mo42880h("onImageAvailable:", "failed to acquire Image!");
        } else if (mo43508Z() != C17757b.PREVIEW || mo43512l0()) {
            C16401d.f46370h.mo42878c("onImageAvailable:", "Image acquired in wrong state. Closing it now.");
            image.close();
        } else {
            C18110b b = mo43435F1().mo45800b(image, System.currentTimeMillis());
            if (b != null) {
                C16401d.f46370h.mo42879g("onImageAvailable:", "Image acquired, dispatching.");
                mo43506B().mo29445j(b);
                return;
            }
            C16401d.f46370h.mo42878c("onImageAvailable:", "Image acquired, but no free frames. DROPPING.");
        }
    }

    /* renamed from: p */
    public void mo29502p(C11280b.C11281a aVar, Exception exc) {
        super.mo29502p(aVar, exc);
        mo43507N().mo45346w("restore preview template", C17757b.BIND, new C16366a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: p0 */
    public Task mo43353p0() {
        C15600b bVar = C16401d.f46370h;
        bVar.mo42878c("onStopBind:", "About to clean up.");
        this.f46238p0 = null;
        this.f46239q0 = null;
        this.f46338n = null;
        this.f46337m = null;
        this.f46339o = null;
        ImageReader imageReader = this.f46237o0;
        if (imageReader != null) {
            imageReader.close();
            this.f46237o0 = null;
        }
        ImageReader imageReader2 = this.f46241s0;
        if (imageReader2 != null) {
            imageReader2.close();
            this.f46241s0 = null;
        }
        this.f46233k0.close();
        this.f46233k0 = null;
        bVar.mo42878c("onStopBind:", "Returning.");
        return C9231i.m34113g((Object) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p2 */
    public boolean mo43387p2(CaptureRequest.Builder builder, C15750g gVar) {
        if (this.f46334j.mo42897p(this.f46342r)) {
            int[] iArr = (int[]) mo43376H2(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES, new int[0]);
            ArrayList arrayList = new ArrayList();
            for (int valueOf : iArr) {
                arrayList.add(Integer.valueOf(valueOf));
            }
            for (Pair pair : this.f46236n0.mo44084c(this.f46342r)) {
                if (arrayList.contains(pair.first)) {
                    C15600b bVar = C16401d.f46370h;
                    bVar.mo42878c("applyFlash: setting CONTROL_AE_MODE to", pair.first);
                    bVar.mo42878c("applyFlash: setting FLASH_MODE to", pair.second);
                    builder.set(CaptureRequest.CONTROL_AE_MODE, (Integer) pair.first);
                    builder.set(CaptureRequest.FLASH_MODE, (Integer) pair.second);
                    return true;
                }
            }
        }
        this.f46342r = gVar;
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q0 */
    public Task mo43355q0() {
        try {
            C15600b bVar = C16401d.f46370h;
            bVar.mo42878c("onStopEngine:", "Clean up.", "Releasing camera.");
            this.f46231i0.close();
            bVar.mo42878c("onStopEngine:", "Clean up.", "Released camera.");
        } catch (Exception e) {
            C16401d.f46370h.mo42880h("onStopEngine:", "Clean up.", "Exception while releasing camera.", e);
        }
        this.f46231i0 = null;
        C16401d.f46370h.mo42878c("onStopEngine:", "Aborting actions.");
        for (C16544a a : this.f46243u0) {
            a.mo43689a(this);
        }
        this.f46232j0 = null;
        this.f46334j = null;
        this.f46336l = null;
        this.f46234l0 = null;
        C16401d.f46370h.mo42880h("onStopEngine:", "Returning.");
        return C9231i.m34113g((Object) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: q2 */
    public void mo43388q2(CaptureRequest.Builder builder) {
        int[] iArr = (int[]) mo43376H2(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES, new int[0]);
        ArrayList arrayList = new ArrayList();
        for (int valueOf : iArr) {
            arrayList.add(Integer.valueOf(valueOf));
        }
        if (arrayList.contains(1)) {
            builder.set(CaptureRequest.CONTROL_AF_MODE, 1);
        } else if (mo43447M() == C15753j.VIDEO && arrayList.contains(3)) {
            builder.set(CaptureRequest.CONTROL_AF_MODE, 3);
        } else if (arrayList.contains(4)) {
            builder.set(CaptureRequest.CONTROL_AF_MODE, 4);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r0 */
    public Task mo43356r0() {
        C15600b bVar = C16401d.f46370h;
        bVar.mo42878c("onStopPreview:", "Started.");
        C11291d dVar = this.f46336l;
        if (dVar != null) {
            dVar.mo29499o(true);
            this.f46336l = null;
        }
        this.f46335k = null;
        if (mo43444K1()) {
            mo43435F1().mo45786j();
        }
        m58216J2();
        this.f46235m0 = null;
        bVar.mo42878c("onStopPreview:", "Returning.");
        return C9231i.m34113g((Object) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r2 */
    public boolean mo43389r2(CaptureRequest.Builder builder, C15752i iVar) {
        if (this.f46334j.mo42897p(this.f46346v)) {
            builder.set(CaptureRequest.CONTROL_SCENE_MODE, Integer.valueOf(this.f46236n0.mo44085d(this.f46346v)));
            return true;
        }
        this.f46346v = iVar;
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s2 */
    public boolean mo43390s2(CaptureRequest.Builder builder, Location location) {
        Location location2 = this.f46348x;
        if (location2 == null) {
            return true;
        }
        builder.set(CaptureRequest.JPEG_GPS_LOCATION, location2);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final boolean mo43357t(C15749f fVar) {
        int b = this.f46236n0.mo44083b(fVar);
        try {
            String[] cameraIdList = this.f46229g0.getCameraIdList();
            C16401d.f46370h.mo42878c("collectCameraInfo", "Facing:", fVar, "Internal:", Integer.valueOf(b), "Cameras:", Integer.valueOf(cameraIdList.length));
            int length = cameraIdList.length;
            int i = 0;
            while (i < length) {
                String str = cameraIdList[i];
                try {
                    CameraCharacteristics cameraCharacteristics = this.f46229g0.getCameraCharacteristics(str);
                    if (b == ((Integer) m58215I2(cameraCharacteristics, CameraCharacteristics.LENS_FACING, -99)).intValue()) {
                        this.f46230h0 = str;
                        mo43490w().mo45013i(fVar, ((Integer) m58215I2(cameraCharacteristics, CameraCharacteristics.SENSOR_ORIENTATION, 0)).intValue());
                        return true;
                    }
                    i++;
                } catch (CameraAccessException unused) {
                }
            }
            return false;
        } catch (CameraAccessException e) {
            throw m58239z2(e);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0024  */
    /* renamed from: t2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo43391t2(android.hardware.camera2.CaptureRequest.Builder r6, float r7) {
        /*
            r5 = this;
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES
            r1 = 0
            android.util.Range[] r2 = new android.util.Range[r1]
            java.lang.Object r0 = r5.mo43376H2(r0, r2)
            android.util.Range[] r0 = (android.util.Range[]) r0
            r5.m58217K2(r0)
            float r2 = r5.f46304D
            r3 = 0
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            r4 = 1
            if (r3 != 0) goto L_0x0048
            java.util.List r0 = r5.mo43374D2(r0)
            java.util.Iterator r0 = r0.iterator()
        L_0x001e:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x008a
            java.lang.Object r2 = r0.next()
            android.util.Range r2 = (android.util.Range) r2
            r3 = 30
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r3 = r2.contains(r3)
            if (r3 != 0) goto L_0x0042
            r3 = 24
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r3 = r2.contains(r3)
            if (r3 == 0) goto L_0x001e
        L_0x0042:
            android.hardware.camera2.CaptureRequest$Key r7 = android.hardware.camera2.CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE
            r6.set(r7, r2)
            return r4
        L_0x0048:
            id.c r3 = r5.f46334j
            float r3 = r3.mo42884c()
            float r2 = java.lang.Math.min(r2, r3)
            r5.f46304D = r2
            id.c r3 = r5.f46334j
            float r3 = r3.mo42885d()
            float r2 = java.lang.Math.max(r2, r3)
            r5.f46304D = r2
            java.util.List r0 = r5.mo43374D2(r0)
            java.util.Iterator r0 = r0.iterator()
        L_0x0068:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x008a
            java.lang.Object r2 = r0.next()
            android.util.Range r2 = (android.util.Range) r2
            float r3 = r5.f46304D
            int r3 = java.lang.Math.round(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r3 = r2.contains(r3)
            if (r3 == 0) goto L_0x0068
            android.hardware.camera2.CaptureRequest$Key r7 = android.hardware.camera2.CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE
            r6.set(r7, r2)
            return r4
        L_0x008a:
            r5.f46304D = r7
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p486kd.C16365b.mo43391t2(android.hardware.camera2.CaptureRequest$Builder, float):boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: u2 */
    public void mo43392u2() {
        m58237v2(true, 3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: w2 */
    public boolean mo43393w2(CaptureRequest.Builder builder, C15757n nVar) {
        if (this.f46334j.mo42897p(this.f46343s)) {
            builder.set(CaptureRequest.CONTROL_AWB_MODE, Integer.valueOf(this.f46236n0.mo44086e(this.f46343s)));
            return true;
        }
        this.f46343s = nVar;
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public boolean mo43394x2(CaptureRequest.Builder builder, float f) {
        if (this.f46334j.mo42896o()) {
            float floatValue = ((Float) mo43376H2(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM, Float.valueOf(1.0f))).floatValue();
            builder.set(CaptureRequest.SCALER_CROP_REGION, m58213F2((this.f46349y * (floatValue - 1.0f)) + 1.0f, floatValue));
            return true;
        }
        this.f46349y = f;
        return false;
    }
}
