package p486kd;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.location.Location;
import android.view.SurfaceHolder;
import com.github.mikephil.charting.utils.Utils;
import com.otaliastudios.cameraview.C11278a;
import com.otaliastudios.cameraview.C11280b;
import com.otaliastudios.cameraview.CameraException;
import com.otaliastudios.cameraview.video.C11285a;
import com.otaliastudios.cameraview.video.C11289c;
import com.otaliastudios.cameraview.video.C11291d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p337z7.C9231i;
import p337z7.Task;
import p346ae.C9802a;
import p346ae.C9811e;
import p346ae.C9818g;
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
import p528nd.C16914a;
import p556pd.C17338a;
import p570qd.C17486a;
import p570qd.C17488b;
import p570qd.C17489c;
import p584rd.C17582a;
import p598sd.C17757b;
import p598sd.C17758c;
import p625ud.C18108a;
import p625ud.C18110b;
import p625ud.C18111c;
import p638vd.C18298a;
import p651wd.C18502b;
import p679yd.C18879b;

/* renamed from: kd.a */
public class C16350a extends C16392c implements Camera.PreviewCallback, Camera.ErrorCallback, C18108a.C18109a {

    /* renamed from: g0 */
    private final C16914a f46196g0 = C16914a.m59497a();
    /* access modifiers changed from: private */

    /* renamed from: h0 */
    public Camera f46197h0;

    /* renamed from: i0 */
    int f46198i0;

    /* renamed from: kd.a$a */
    class C16351a implements Comparator {
        C16351a() {
        }

        /* renamed from: a */
        public int compare(int[] iArr, int[] iArr2) {
            return (iArr2[1] - iArr2[0]) - (iArr[1] - iArr[0]);
        }
    }

    /* renamed from: kd.a$b */
    class C16352b implements Runnable {

        /* renamed from: d */
        final /* synthetic */ C18879b f46200d;

        /* renamed from: e */
        final /* synthetic */ C18298a f46201e;

        /* renamed from: f */
        final /* synthetic */ PointF f46202f;

        /* renamed from: kd.a$b$a */
        class C16353a implements Runnable {
            C16353a() {
            }

            public void run() {
                C16401d.C16413l B = C16350a.this.mo43506B();
                C16352b bVar = C16352b.this;
                B.mo29446k(bVar.f46201e, false, bVar.f46202f);
            }
        }

        /* renamed from: kd.a$b$b */
        class C16354b implements Camera.AutoFocusCallback {

            /* renamed from: kd.a$b$b$a */
            class C16355a implements Runnable {
                C16355a() {
                }

                public void run() {
                    C16350a.this.f46197h0.cancelAutoFocus();
                    Camera.Parameters parameters = C16350a.this.f46197h0.getParameters();
                    int maxNumFocusAreas = parameters.getMaxNumFocusAreas();
                    int maxNumMeteringAreas = parameters.getMaxNumMeteringAreas();
                    if (maxNumFocusAreas > 0) {
                        parameters.setFocusAreas((List) null);
                    }
                    if (maxNumMeteringAreas > 0) {
                        parameters.setMeteringAreas((List) null);
                    }
                    C16350a.this.m58168g2(parameters);
                    C16350a.this.f46197h0.setParameters(parameters);
                }
            }

            C16354b() {
            }

            public void onAutoFocus(boolean z, Camera camera) {
                C16350a.this.mo43507N().mo45330g("focus end");
                C16350a.this.mo43507N().mo45330g("focus reset");
                C16401d.C16413l B = C16350a.this.mo43506B();
                C16352b bVar = C16352b.this;
                B.mo29446k(bVar.f46201e, z, bVar.f46202f);
                if (C16350a.this.mo43464U1()) {
                    C16350a.this.mo43507N().mo45347x("focus reset", C17757b.ENGINE, C16350a.this.mo43423A(), new C16355a());
                }
            }
        }

        C16352b(C18879b bVar, C18298a aVar, PointF pointF) {
            this.f46200d = bVar;
            this.f46201e = aVar;
            this.f46202f = pointF;
        }

        public void run() {
            if (C16350a.this.f46334j.mo42894m()) {
                C17338a aVar = new C17338a(C16350a.this.mo43490w(), C16350a.this.mo43460T().mo26809l());
                C18879b f = this.f46200d.mo46875f(aVar);
                Camera.Parameters parameters = C16350a.this.f46197h0.getParameters();
                int maxNumFocusAreas = parameters.getMaxNumFocusAreas();
                int maxNumMeteringAreas = parameters.getMaxNumMeteringAreas();
                if (maxNumFocusAreas > 0) {
                    parameters.setFocusAreas(f.mo46874e(maxNumFocusAreas, aVar));
                }
                if (maxNumMeteringAreas > 0) {
                    parameters.setMeteringAreas(f.mo46874e(maxNumMeteringAreas, aVar));
                }
                parameters.setFocusMode("auto");
                C16350a.this.f46197h0.setParameters(parameters);
                C16350a.this.mo43506B().mo29439f(this.f46201e, this.f46202f);
                C16350a.this.mo43507N().mo45330g("focus end");
                C16350a.this.mo43507N().mo45334k("focus end", true, 2500, new C16353a());
                try {
                    C16350a.this.f46197h0.autoFocus(new C16354b());
                } catch (RuntimeException e) {
                    C16401d.f46370h.mo42877b("startAutoFocus:", "Error calling autoFocus", e);
                }
            }
        }
    }

    /* renamed from: kd.a$c */
    class C16356c implements Runnable {

        /* renamed from: d */
        final /* synthetic */ C15750g f46207d;

        C16356c(C15750g gVar) {
            this.f46207d = gVar;
        }

        public void run() {
            Camera.Parameters parameters = C16350a.this.f46197h0.getParameters();
            if (C16350a.this.m58170i2(parameters, this.f46207d)) {
                C16350a.this.f46197h0.setParameters(parameters);
            }
        }
    }

    /* renamed from: kd.a$d */
    class C16357d implements Runnable {

        /* renamed from: d */
        final /* synthetic */ Location f46209d;

        C16357d(Location location) {
            this.f46209d = location;
        }

        public void run() {
            Camera.Parameters parameters = C16350a.this.f46197h0.getParameters();
            if (C16350a.this.m58172k2(parameters, this.f46209d)) {
                C16350a.this.f46197h0.setParameters(parameters);
            }
        }
    }

    /* renamed from: kd.a$e */
    class C16358e implements Runnable {

        /* renamed from: d */
        final /* synthetic */ C15757n f46211d;

        C16358e(C15757n nVar) {
            this.f46211d = nVar;
        }

        public void run() {
            Camera.Parameters parameters = C16350a.this.f46197h0.getParameters();
            if (C16350a.this.m58175n2(parameters, this.f46211d)) {
                C16350a.this.f46197h0.setParameters(parameters);
            }
        }
    }

    /* renamed from: kd.a$f */
    class C16359f implements Runnable {

        /* renamed from: d */
        final /* synthetic */ C15752i f46213d;

        C16359f(C15752i iVar) {
            this.f46213d = iVar;
        }

        public void run() {
            Camera.Parameters parameters = C16350a.this.f46197h0.getParameters();
            if (C16350a.this.m58171j2(parameters, this.f46213d)) {
                C16350a.this.f46197h0.setParameters(parameters);
            }
        }
    }

    /* renamed from: kd.a$g */
    class C16360g implements Runnable {

        /* renamed from: d */
        final /* synthetic */ float f46215d;

        /* renamed from: e */
        final /* synthetic */ boolean f46216e;

        /* renamed from: f */
        final /* synthetic */ PointF[] f46217f;

        C16360g(float f, boolean z, PointF[] pointFArr) {
            this.f46215d = f;
            this.f46216e = z;
            this.f46217f = pointFArr;
        }

        public void run() {
            Camera.Parameters parameters = C16350a.this.f46197h0.getParameters();
            if (C16350a.this.m58176o2(parameters, this.f46215d)) {
                C16350a.this.f46197h0.setParameters(parameters);
                if (this.f46216e) {
                    C16350a.this.mo43506B().mo29452q(C16350a.this.f46349y, this.f46217f);
                }
            }
        }
    }

    /* renamed from: kd.a$h */
    class C16361h implements Runnable {

        /* renamed from: d */
        final /* synthetic */ float f46219d;

        /* renamed from: e */
        final /* synthetic */ boolean f46220e;

        /* renamed from: f */
        final /* synthetic */ float[] f46221f;

        /* renamed from: g */
        final /* synthetic */ PointF[] f46222g;

        C16361h(float f, boolean z, float[] fArr, PointF[] pointFArr) {
            this.f46219d = f;
            this.f46220e = z;
            this.f46221f = fArr;
            this.f46222g = pointFArr;
        }

        public void run() {
            Camera.Parameters parameters = C16350a.this.f46197h0.getParameters();
            if (C16350a.this.m58169h2(parameters, this.f46219d)) {
                C16350a.this.f46197h0.setParameters(parameters);
                if (this.f46220e) {
                    C16350a.this.mo43506B().mo29447l(C16350a.this.f46350z, this.f46221f, this.f46222g);
                }
            }
        }
    }

    /* renamed from: kd.a$i */
    class C16362i implements Runnable {

        /* renamed from: d */
        final /* synthetic */ boolean f46224d;

        C16362i(boolean z) {
            this.f46224d = z;
        }

        public void run() {
            boolean unused = C16350a.this.m58173l2(this.f46224d);
        }
    }

    /* renamed from: kd.a$j */
    class C16363j implements Runnable {

        /* renamed from: d */
        final /* synthetic */ float f46226d;

        C16363j(float f) {
            this.f46226d = f;
        }

        public void run() {
            Camera.Parameters parameters = C16350a.this.f46197h0.getParameters();
            if (C16350a.this.m58174m2(parameters, this.f46226d)) {
                C16350a.this.f46197h0.setParameters(parameters);
            }
        }
    }

    /* renamed from: kd.a$k */
    class C16364k implements Comparator {
        C16364k() {
        }

        /* renamed from: a */
        public int compare(int[] iArr, int[] iArr2) {
            return (iArr[1] - iArr[0]) - (iArr2[1] - iArr2[0]);
        }
    }

    public C16350a(C16401d.C16413l lVar) {
        super(lVar);
    }

    /* renamed from: f2 */
    private void m58167f2(Camera.Parameters parameters) {
        boolean z;
        if (mo43447M() == C15753j.VIDEO) {
            z = true;
        } else {
            z = false;
        }
        parameters.setRecordingHint(z);
        m58168g2(parameters);
        m58170i2(parameters, C15750g.OFF);
        m58172k2(parameters, (Location) null);
        m58175n2(parameters, C15757n.AUTO);
        m58171j2(parameters, C15752i.OFF);
        m58176o2(parameters, Utils.FLOAT_EPSILON);
        m58169h2(parameters, Utils.FLOAT_EPSILON);
        m58173l2(this.f46301A);
        m58174m2(parameters, Utils.FLOAT_EPSILON);
    }

    /* access modifiers changed from: private */
    /* renamed from: g2 */
    public void m58168g2(Camera.Parameters parameters) {
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        if (mo43447M() == C15753j.VIDEO && supportedFocusModes.contains("continuous-video")) {
            parameters.setFocusMode("continuous-video");
        } else if (supportedFocusModes.contains("continuous-picture")) {
            parameters.setFocusMode("continuous-picture");
        } else if (supportedFocusModes.contains("infinity")) {
            parameters.setFocusMode("infinity");
        } else if (supportedFocusModes.contains("fixed")) {
            parameters.setFocusMode("fixed");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h2 */
    public boolean m58169h2(Camera.Parameters parameters, float f) {
        if (this.f46334j.mo42895n()) {
            float a = this.f46334j.mo42882a();
            float b = this.f46334j.mo42883b();
            float f2 = this.f46350z;
            if (f2 < b) {
                a = b;
            } else if (f2 <= a) {
                a = f2;
            }
            this.f46350z = a;
            parameters.setExposureCompensation((int) (a / parameters.getExposureCompensationStep()));
            return true;
        }
        this.f46350z = f;
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: i2 */
    public boolean m58170i2(Camera.Parameters parameters, C15750g gVar) {
        if (this.f46334j.mo42897p(this.f46342r)) {
            parameters.setFlashMode(this.f46196g0.mo44076c(this.f46342r));
            return true;
        }
        this.f46342r = gVar;
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: j2 */
    public boolean m58171j2(Camera.Parameters parameters, C15752i iVar) {
        if (this.f46334j.mo42897p(this.f46346v)) {
            parameters.setSceneMode(this.f46196g0.mo44077d(this.f46346v));
            return true;
        }
        this.f46346v = iVar;
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: k2 */
    public boolean m58172k2(Camera.Parameters parameters, Location location) {
        Location location2 = this.f46348x;
        if (location2 == null) {
            return true;
        }
        parameters.setGpsLatitude(location2.getLatitude());
        parameters.setGpsLongitude(this.f46348x.getLongitude());
        parameters.setGpsAltitude(this.f46348x.getAltitude());
        parameters.setGpsTimestamp(this.f46348x.getTime());
        parameters.setGpsProcessingMethod(this.f46348x.getProvider());
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: l2 */
    public boolean m58173l2(boolean z) {
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(this.f46198i0, cameraInfo);
        if (cameraInfo.canDisableShutterSound) {
            try {
                return this.f46197h0.enableShutterSound(this.f46301A);
            } catch (RuntimeException unused) {
                return false;
            }
        } else if (this.f46301A) {
            return true;
        } else {
            this.f46301A = z;
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m2 */
    public boolean m58174m2(Camera.Parameters parameters, float f) {
        List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
        m58177q2(supportedPreviewFpsRange);
        float f2 = this.f46304D;
        if (f2 == Utils.FLOAT_EPSILON) {
            for (int[] next : supportedPreviewFpsRange) {
                int i = next[0];
                float f3 = ((float) i) / 1000.0f;
                int i2 = next[1];
                float f4 = ((float) i2) / 1000.0f;
                if ((f3 <= 30.0f && 30.0f <= f4) || (f3 <= 24.0f && 24.0f <= f4)) {
                    parameters.setPreviewFpsRange(i, i2);
                    return true;
                }
            }
        } else {
            float min = Math.min(f2, this.f46334j.mo42884c());
            this.f46304D = min;
            this.f46304D = Math.max(min, this.f46334j.mo42885d());
            for (int[] next2 : supportedPreviewFpsRange) {
                float f5 = ((float) next2[1]) / 1000.0f;
                float round = (float) Math.round(this.f46304D);
                if (((float) next2[0]) / 1000.0f <= round && round <= f5) {
                    parameters.setPreviewFpsRange(next2[0], next2[1]);
                    return true;
                }
            }
        }
        this.f46304D = f;
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: n2 */
    public boolean m58175n2(Camera.Parameters parameters, C15757n nVar) {
        if (this.f46334j.mo42897p(this.f46343s)) {
            parameters.setWhiteBalance(this.f46196g0.mo44078e(this.f46343s));
            parameters.remove("auto-whitebalance-lock");
            return true;
        }
        this.f46343s = nVar;
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: o2 */
    public boolean m58176o2(Camera.Parameters parameters, float f) {
        if (this.f46334j.mo42896o()) {
            parameters.setZoom((int) (this.f46349y * ((float) parameters.getMaxZoom())));
            this.f46197h0.setParameters(parameters);
            return true;
        }
        this.f46349y = f;
        return false;
    }

    /* renamed from: q2 */
    private void m58177q2(List list) {
        if (!mo43465V() || this.f46304D == Utils.FLOAT_EPSILON) {
            Collections.sort(list, new C16351a());
        } else {
            Collections.sort(list, new C16364k());
        }
    }

    /* renamed from: A0 */
    public void mo43327A0(float f, float[] fArr, PointF[] pointFArr, boolean z) {
        float f2 = this.f46350z;
        this.f46350z = f;
        mo43507N().mo45335n("exposure correction", 20);
        this.f46326Z = mo43507N().mo45346w("exposure correction", C17757b.ENGINE, new C16361h(f2, z, fArr, pointFArr));
    }

    /* renamed from: C0 */
    public void mo43328C0(C15750g gVar) {
        C15750g gVar2 = this.f46342r;
        this.f46342r = gVar;
        C17758c N = mo43507N();
        this.f46327a0 = N.mo45346w("flash (" + gVar + ")", C17757b.ENGINE, new C16356c(gVar2));
    }

    /* renamed from: D0 */
    public void mo43329D0(int i) {
        this.f46340p = 17;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G1 */
    public List mo43330G1() {
        return Collections.singletonList(this.f46338n);
    }

    /* renamed from: H0 */
    public void mo43331H0(boolean z) {
        this.f46341q = z;
    }

    /* renamed from: I0 */
    public void mo43332I0(C15752i iVar) {
        C15752i iVar2 = this.f46346v;
        this.f46346v = iVar;
        C17758c N = mo43507N();
        this.f46329c0 = N.mo45346w("hdr (" + iVar + ")", C17757b.ENGINE, new C16359f(iVar2));
    }

    /* access modifiers changed from: protected */
    /* renamed from: I1 */
    public List mo43333I1() {
        try {
            List<Camera.Size> supportedPreviewSizes = this.f46197h0.getParameters().getSupportedPreviewSizes();
            ArrayList arrayList = new ArrayList(supportedPreviewSizes.size());
            for (Camera.Size next : supportedPreviewSizes) {
                C10396b bVar = new C10396b(next.width, next.height);
                if (!arrayList.contains(bVar)) {
                    arrayList.add(bVar);
                }
            }
            C16401d.f46370h.mo42878c("getPreviewStreamAvailableSizes:", arrayList);
            return arrayList;
        } catch (Exception e) {
            C16401d.f46370h.mo42877b("getPreviewStreamAvailableSizes:", "Failed to compute preview size. Camera params is empty");
            throw new CameraException(e, 2);
        }
    }

    /* renamed from: J0 */
    public void mo43334J0(Location location) {
        Location location2 = this.f46348x;
        this.f46348x = location;
        this.f46330d0 = mo43507N().mo45346w("location", C17757b.ENGINE, new C16357d(location2));
    }

    /* access modifiers changed from: protected */
    /* renamed from: L1 */
    public C18111c mo43335L1(int i) {
        return new C18108a(i, this);
    }

    /* renamed from: M0 */
    public void mo43336M0(C15754k kVar) {
        if (kVar == C15754k.JPEG) {
            this.f46347w = kVar;
            return;
        }
        throw new UnsupportedOperationException("Unsupported picture format: " + kVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo43337O1() {
        mo43516v0();
    }

    /* renamed from: Q0 */
    public void mo43338Q0(boolean z) {
        boolean z2 = this.f46301A;
        this.f46301A = z;
        C17758c N = mo43507N();
        this.f46331e0 = N.mo45346w("play sounds (" + z + ")", C17757b.ENGINE, new C16362i(z2));
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q1 */
    public void mo43339Q1(C11278a.C11279a aVar, boolean z) {
        C15600b bVar = C16401d.f46370h;
        bVar.mo42878c("onTakePicture:", "executing.");
        C17486a w = mo43490w();
        C17489c cVar = C17489c.SENSOR;
        C17489c cVar2 = C17489c.OUTPUT;
        aVar.f32746c = w.mo45010c(cVar, cVar2, C17488b.RELATIVE_TO_SENSOR);
        aVar.f32747d = mo43456Q(cVar2);
        C9802a aVar2 = new C9802a(aVar, this, this.f46197h0);
        this.f46335k = aVar2;
        aVar2.mo26297c();
        bVar.mo42878c("onTakePicture:", "executed.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: R1 */
    public void mo43340R1(C11278a.C11279a aVar, C10395a aVar2, boolean z) {
        C15600b bVar = C16401d.f46370h;
        bVar.mo42878c("onTakePictureSnapshot:", "executing.");
        C17489c cVar = C17489c.OUTPUT;
        aVar.f32747d = mo43475b0(cVar);
        if (this.f46333i instanceof C10254d) {
            aVar.f32746c = mo43490w().mo45010c(C17489c.VIEW, cVar, C17488b.ABSOLUTE);
            this.f46335k = new C9818g(aVar, this, (C10254d) this.f46333i, aVar2, mo43439H1());
        } else {
            aVar.f32746c = mo43490w().mo45010c(C17489c.SENSOR, cVar, C17488b.RELATIVE_TO_SENSOR);
            this.f46335k = new C9811e(aVar, this, this.f46197h0, aVar2);
        }
        this.f46335k.mo26297c();
        bVar.mo42878c("onTakePictureSnapshot:", "executed.");
    }

    /* renamed from: S0 */
    public void mo43341S0(float f) {
        this.f46304D = f;
        C17758c N = mo43507N();
        this.f46332f0 = N.mo45346w("preview fps (" + f + ")", C17757b.ENGINE, new C16363j(f));
    }

    /* access modifiers changed from: protected */
    /* renamed from: S1 */
    public void mo43342S1(C11280b.C11281a aVar) {
        C10396b bVar;
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
        try {
            this.f46197h0.unlock();
            C11285a aVar2 = new C11285a(this, this.f46197h0, this.f46198i0);
            this.f46336l = aVar2;
            aVar2.mo29498n(aVar);
        } catch (Exception e) {
            mo29502p((C11280b.C11281a) null, e);
        }
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

    /* renamed from: b */
    public void mo43344b(byte[] bArr) {
        C17757b Z = mo43508Z();
        C17757b bVar = C17757b.ENGINE;
        if (Z.mo45341a(bVar) && mo43509a0().mo45341a(bVar)) {
            this.f46197h0.addCallbackBuffer(bArr);
        }
    }

    /* renamed from: c1 */
    public void mo43345c1(C15757n nVar) {
        C15757n nVar2 = this.f46343s;
        this.f46343s = nVar;
        C17758c N = mo43507N();
        this.f46328b0 = N.mo45346w("white balance (" + nVar + ")", C17757b.ENGINE, new C16358e(nVar2));
    }

    /* renamed from: d1 */
    public void mo43346d1(float f, PointF[] pointFArr, boolean z) {
        float f2 = this.f46349y;
        this.f46349y = f;
        mo43507N().mo45335n("zoom", 20);
        this.f46325Y = mo43507N().mo45346w("zoom", C17757b.ENGINE, new C16360g(f2, z, pointFArr));
    }

    /* renamed from: f1 */
    public void mo43347f1(C18298a aVar, C18879b bVar, PointF pointF) {
        mo43507N().mo45346w("auto focus", C17757b.BIND, new C16352b(bVar, aVar, pointF));
    }

    /* access modifiers changed from: protected */
    /* renamed from: m0 */
    public Task mo43348m0() {
        C15600b bVar = C16401d.f46370h;
        bVar.mo42878c("onStartBind:", "Started");
        try {
            if (this.f46333i.mo26807j() == SurfaceHolder.class) {
                this.f46197h0.setPreviewDisplay((SurfaceHolder) this.f46333i.mo26806i());
            } else if (this.f46333i.mo26807j() == SurfaceTexture.class) {
                this.f46197h0.setPreviewTexture((SurfaceTexture) this.f46333i.mo26806i());
            } else {
                throw new RuntimeException("Unknown CameraPreview output class.");
            }
            this.f46337m = mo43425B1();
            this.f46338n = mo43432E1();
            bVar.mo42878c("onStartBind:", "Returning");
            return C9231i.m34113g((Object) null);
        } catch (IOException e) {
            C16401d.f46370h.mo42877b("onStartBind:", "Failed to bind.", e);
            throw new CameraException(e, 2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n0 */
    public Task mo43349n0() {
        try {
            Camera open = Camera.open(this.f46198i0);
            this.f46197h0 = open;
            if (open != null) {
                open.setErrorCallback(this);
                C15600b bVar = C16401d.f46370h;
                bVar.mo42878c("onStartEngine:", "Applying default parameters.");
                try {
                    Camera.Parameters parameters = this.f46197h0.getParameters();
                    int i = this.f46198i0;
                    C17486a w = mo43490w();
                    C17489c cVar = C17489c.SENSOR;
                    C17489c cVar2 = C17489c.VIEW;
                    this.f46334j = new C17582a(parameters, i, w.mo45009b(cVar, cVar2));
                    m58167f2(parameters);
                    this.f46197h0.setParameters(parameters);
                    try {
                        this.f46197h0.setDisplayOrientation(mo43490w().mo45010c(cVar, cVar2, C17488b.ABSOLUTE));
                        bVar.mo42878c("onStartEngine:", "Ended");
                        return C9231i.m34113g(this.f46334j);
                    } catch (Exception unused) {
                        C16401d.f46370h.mo42877b("onStartEngine:", "Failed to connect. Can't set display orientation, maybe preview already exists?");
                        throw new CameraException(1);
                    }
                } catch (Exception e) {
                    C16401d.f46370h.mo42877b("onStartEngine:", "Failed to connect. Problem with camera params");
                    throw new CameraException(e, 1);
                }
            } else {
                C16401d.f46370h.mo42877b("onStartEngine:", "Failed to connect. Camera is null, maybe in use by another app or already released?");
                throw new CameraException(1);
            }
        } catch (Exception e2) {
            C16401d.f46370h.mo42877b("onStartEngine:", "Failed to connect. Maybe in use by another app?");
            throw new CameraException(e2, 1);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o0 */
    public Task mo43350o0() {
        C15600b bVar = C16401d.f46370h;
        bVar.mo42878c("onStartPreview", "Dispatching onCameraPreviewStreamSizeChanged.");
        mo43506B().mo29450o();
        C10396b W = mo43467W(C17489c.VIEW);
        if (W != null) {
            this.f46333i.mo26819v(W.mo27062e(), W.mo27060c());
            this.f46333i.mo26818u(0);
            try {
                Camera.Parameters parameters = this.f46197h0.getParameters();
                parameters.setPreviewFormat(17);
                parameters.setPreviewSize(this.f46338n.mo27062e(), this.f46338n.mo27060c());
                C15753j M = mo43447M();
                C15753j jVar = C15753j.PICTURE;
                if (M == jVar) {
                    parameters.setPictureSize(this.f46337m.mo27062e(), this.f46337m.mo27060c());
                } else {
                    C10396b C1 = mo43427C1(jVar);
                    parameters.setPictureSize(C1.mo27062e(), C1.mo27060c());
                }
                try {
                    this.f46197h0.setParameters(parameters);
                    this.f46197h0.setPreviewCallbackWithBuffer((Camera.PreviewCallback) null);
                    this.f46197h0.setPreviewCallbackWithBuffer(this);
                    mo43354p2().mo45787k(17, this.f46338n, mo43490w());
                    bVar.mo42878c("onStartPreview", "Starting preview with startPreview().");
                    try {
                        this.f46197h0.startPreview();
                        bVar.mo42878c("onStartPreview", "Started preview.");
                        return C9231i.m34113g((Object) null);
                    } catch (Exception e) {
                        C16401d.f46370h.mo42877b("onStartPreview", "Failed to start preview.", e);
                        throw new CameraException(e, 2);
                    }
                } catch (Exception e2) {
                    C16401d.f46370h.mo42877b("onStartPreview:", "Failed to set params for camera. Maybe incorrect parameter put in params?");
                    throw new CameraException(e2, 2);
                }
            } catch (Exception e3) {
                C16401d.f46370h.mo42877b("onStartPreview:", "Failed to get params from camera. Maybe low level problem with camera or camera has already released?");
                throw new CameraException(e3, 2);
            }
        } else {
            throw new IllegalStateException("previewStreamSize should not be null at this point.");
        }
    }

    public void onError(int i, Camera camera) {
        int i2 = 0;
        RuntimeException runtimeException = new RuntimeException(C16401d.f46370h.mo42877b("Internal Camera1 error.", Integer.valueOf(i)));
        if (i == 1 || i == 2 || i == 100) {
            i2 = 3;
        }
        throw new CameraException(runtimeException, i2);
    }

    public void onPreviewFrame(byte[] bArr, Camera camera) {
        C18110b b;
        if (bArr != null && (b = mo43354p2().mo45800b(bArr, System.currentTimeMillis())) != null) {
            mo43506B().mo29445j(b);
        }
    }

    /* renamed from: p */
    public void mo29502p(C11280b.C11281a aVar, Exception exc) {
        super.mo29502p(aVar, exc);
        if (aVar == null) {
            this.f46197h0.lock();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p0 */
    public Task mo43353p0() {
        this.f46338n = null;
        this.f46337m = null;
        try {
            if (this.f46333i.mo26807j() == SurfaceHolder.class) {
                this.f46197h0.setPreviewDisplay((SurfaceHolder) null);
            } else if (this.f46333i.mo26807j() == SurfaceTexture.class) {
                this.f46197h0.setPreviewTexture((SurfaceTexture) null);
            } else {
                throw new RuntimeException("Unknown CameraPreview output class.");
            }
        } catch (IOException e) {
            C16401d.f46370h.mo42877b("onStopBind", "Could not release surface", e);
        }
        return C9231i.m34113g((Object) null);
    }

    /* renamed from: p2 */
    public C18108a mo43354p2() {
        return (C18108a) super.mo43435F1();
    }

    /* access modifiers changed from: protected */
    /* renamed from: q0 */
    public Task mo43355q0() {
        C15600b bVar = C16401d.f46370h;
        bVar.mo42878c("onStopEngine:", "About to clean up.");
        mo43507N().mo45330g("focus reset");
        mo43507N().mo45330g("focus end");
        if (this.f46197h0 != null) {
            try {
                bVar.mo42878c("onStopEngine:", "Clean up.", "Releasing camera.");
                this.f46197h0.release();
                bVar.mo42878c("onStopEngine:", "Clean up.", "Released camera.");
            } catch (Exception e) {
                C16401d.f46370h.mo42880h("onStopEngine:", "Clean up.", "Exception while releasing camera.", e);
            }
            this.f46197h0 = null;
            this.f46334j = null;
        }
        this.f46336l = null;
        this.f46334j = null;
        this.f46197h0 = null;
        C16401d.f46370h.mo42880h("onStopEngine:", "Clean up.", "Returning.");
        return C9231i.m34113g((Object) null);
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
        mo43354p2().mo45786j();
        bVar.mo42878c("onStopPreview:", "Releasing preview buffers.");
        this.f46197h0.setPreviewCallbackWithBuffer((Camera.PreviewCallback) null);
        try {
            bVar.mo42878c("onStopPreview:", "Stopping preview.");
            this.f46197h0.stopPreview();
            bVar.mo42878c("onStopPreview:", "Stopped preview.");
        } catch (Exception e) {
            C16401d.f46370h.mo42877b("stopPreview", "Could not stop preview", e);
        }
        return C9231i.m34113g((Object) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public boolean mo43357t(C15749f fVar) {
        int b = this.f46196g0.mo44075b(fVar);
        C16401d.f46370h.mo42878c("collectCameraInfo", "Facing:", fVar, "Internal:", Integer.valueOf(b), "Cameras:", Integer.valueOf(Camera.getNumberOfCameras()));
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        int numberOfCameras = Camera.getNumberOfCameras();
        for (int i = 0; i < numberOfCameras; i++) {
            Camera.getCameraInfo(i, cameraInfo);
            if (cameraInfo.facing == b) {
                mo43490w().mo45013i(fVar, cameraInfo.orientation);
                this.f46198i0 = i;
                return true;
            }
        }
        return false;
    }
}
