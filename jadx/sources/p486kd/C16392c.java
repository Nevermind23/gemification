package p486kd;

import android.location.Location;
import com.github.mikephil.charting.utils.Utils;
import com.otaliastudios.cameraview.C11278a;
import com.otaliastudios.cameraview.C11280b;
import com.otaliastudios.cameraview.CameraException;
import com.otaliastudios.cameraview.video.C11291d;
import java.io.File;
import java.io.FileDescriptor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p337z7.C9231i;
import p337z7.Task;
import p346ae.C9809d;
import p360be.C10241a;
import p374ce.C10395a;
import p374ce.C10396b;
import p374ce.C10397c;
import p374ce.C10399e;
import p458id.C15600b;
import p458id.C15603c;
import p472jd.C15744a;
import p472jd.C15745b;
import p472jd.C15749f;
import p472jd.C15750g;
import p472jd.C15752i;
import p472jd.C15753j;
import p472jd.C15754k;
import p472jd.C15756m;
import p472jd.C15757n;
import p486kd.C16401d;
import p570qd.C17486a;
import p570qd.C17489c;
import p598sd.C17757b;
import p625ud.C18111c;
import p693zd.C19009a;

/* renamed from: kd.c */
public abstract class C16392c extends C16401d {

    /* renamed from: A */
    protected boolean f46301A;

    /* renamed from: B */
    protected boolean f46302B;

    /* renamed from: C */
    protected boolean f46303C;

    /* renamed from: D */
    protected float f46304D;

    /* renamed from: E */
    private boolean f46305E;

    /* renamed from: F */
    private C18111c f46306F;

    /* renamed from: G */
    private final C17486a f46307G = new C17486a();

    /* renamed from: H */
    private C10397c f46308H;

    /* renamed from: I */
    private C10397c f46309I;

    /* renamed from: J */
    private C10397c f46310J;
    /* access modifiers changed from: private */

    /* renamed from: K */
    public C15749f f46311K;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public C15753j f46312L;
    /* access modifiers changed from: private */

    /* renamed from: M */
    public C15744a f46313M;
    /* access modifiers changed from: private */

    /* renamed from: N */
    public long f46314N;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public int f46315O;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public int f46316P;
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public int f46317Q;

    /* renamed from: R */
    private long f46318R;

    /* renamed from: S */
    private int f46319S;

    /* renamed from: T */
    private int f46320T;

    /* renamed from: U */
    private int f46321U;

    /* renamed from: V */
    private int f46322V;

    /* renamed from: W */
    private int f46323W;

    /* renamed from: X */
    private C19009a f46324X;

    /* renamed from: Y */
    Task f46325Y = C9231i.m34113g((Object) null);

    /* renamed from: Z */
    Task f46326Z = C9231i.m34113g((Object) null);

    /* renamed from: a0 */
    Task f46327a0 = C9231i.m34113g((Object) null);

    /* renamed from: b0 */
    Task f46328b0 = C9231i.m34113g((Object) null);

    /* renamed from: c0 */
    Task f46329c0 = C9231i.m34113g((Object) null);

    /* renamed from: d0 */
    Task f46330d0 = C9231i.m34113g((Object) null);

    /* renamed from: e0 */
    Task f46331e0 = C9231i.m34113g((Object) null);

    /* renamed from: f0 */
    Task f46332f0 = C9231i.m34113g((Object) null);

    /* renamed from: i */
    protected C10241a f46333i;

    /* renamed from: j */
    protected C15603c f46334j;

    /* renamed from: k */
    protected C9809d f46335k;

    /* renamed from: l */
    protected C11291d f46336l;

    /* renamed from: m */
    protected C10396b f46337m;

    /* renamed from: n */
    protected C10396b f46338n;

    /* renamed from: o */
    protected C10396b f46339o;

    /* renamed from: p */
    protected int f46340p;

    /* renamed from: q */
    protected boolean f46341q;

    /* renamed from: r */
    protected C15750g f46342r;

    /* renamed from: s */
    protected C15757n f46343s;

    /* renamed from: t */
    protected C15756m f46344t;

    /* renamed from: u */
    protected C15745b f46345u;

    /* renamed from: v */
    protected C15752i f46346v;

    /* renamed from: w */
    protected C15754k f46347w;

    /* renamed from: x */
    protected Location f46348x;

    /* renamed from: y */
    protected float f46349y;

    /* renamed from: z */
    protected float f46350z;

    /* renamed from: kd.c$a */
    class C16393a implements Runnable {

        /* renamed from: d */
        final /* synthetic */ C15749f f46351d;

        /* renamed from: e */
        final /* synthetic */ C15749f f46352e;

        C16393a(C15749f fVar, C15749f fVar2) {
            this.f46351d = fVar;
            this.f46352e = fVar2;
        }

        public void run() {
            if (C16392c.this.mo43357t(this.f46351d)) {
                C16392c.this.mo43513t0();
            } else {
                C15749f unused = C16392c.this.f46311K = this.f46352e;
            }
        }
    }

    /* renamed from: kd.c$b */
    class C16394b implements Runnable {
        C16394b() {
        }

        public void run() {
            C16392c.this.mo43513t0();
        }
    }

    /* renamed from: kd.c$c */
    class C16395c implements Runnable {

        /* renamed from: d */
        final /* synthetic */ C11278a.C11279a f46355d;

        /* renamed from: e */
        final /* synthetic */ boolean f46356e;

        C16395c(C11278a.C11279a aVar, boolean z) {
            this.f46355d = aVar;
            this.f46356e = z;
        }

        public void run() {
            C16401d.f46370h.mo42878c("takePicture:", "running. isTakingPicture:", Boolean.valueOf(C16392c.this.mo43448M1()));
            if (!C16392c.this.mo43448M1()) {
                if (C16392c.this.f46312L != C15753j.VIDEO) {
                    C11278a.C11279a aVar = this.f46355d;
                    aVar.f32744a = false;
                    C16392c cVar = C16392c.this;
                    aVar.f32745b = cVar.f46348x;
                    aVar.f32748e = cVar.f46311K;
                    C11278a.C11279a aVar2 = this.f46355d;
                    C16392c cVar2 = C16392c.this;
                    aVar2.f32750g = cVar2.f46347w;
                    cVar2.mo43339Q1(aVar2, this.f46356e);
                    return;
                }
                throw new IllegalStateException("Can't take hq pictures while in VIDEO mode");
            }
        }
    }

    /* renamed from: kd.c$d */
    class C16396d implements Runnable {

        /* renamed from: d */
        final /* synthetic */ C11278a.C11279a f46358d;

        /* renamed from: e */
        final /* synthetic */ boolean f46359e;

        C16396d(C11278a.C11279a aVar, boolean z) {
            this.f46358d = aVar;
            this.f46359e = z;
        }

        public void run() {
            C16401d.f46370h.mo42878c("takePictureSnapshot:", "running. isTakingPicture:", Boolean.valueOf(C16392c.this.mo43448M1()));
            if (!C16392c.this.mo43448M1()) {
                C11278a.C11279a aVar = this.f46358d;
                C16392c cVar = C16392c.this;
                aVar.f32745b = cVar.f46348x;
                aVar.f32744a = true;
                aVar.f32748e = cVar.f46311K;
                this.f46358d.f32750g = C15754k.JPEG;
                C16392c.this.mo43340R1(this.f46358d, C10395a.m37801g(C16392c.this.m58298J1(C17489c.OUTPUT)), this.f46359e);
            }
        }
    }

    /* renamed from: kd.c$e */
    class C16397e implements Runnable {

        /* renamed from: d */
        final /* synthetic */ File f46361d;

        /* renamed from: e */
        final /* synthetic */ C11280b.C11281a f46362e;

        /* renamed from: f */
        final /* synthetic */ FileDescriptor f46363f;

        C16397e(File file, C11280b.C11281a aVar, FileDescriptor fileDescriptor) {
            this.f46361d = file;
            this.f46362e = aVar;
            this.f46363f = fileDescriptor;
        }

        public void run() {
            C16401d.f46370h.mo42878c("takeVideo:", "running. isTakingVideo:", Boolean.valueOf(C16392c.this.mo43450N1()));
            if (!C16392c.this.mo43450N1()) {
                if (C16392c.this.f46312L != C15753j.PICTURE) {
                    File file = this.f46361d;
                    if (file != null) {
                        this.f46362e.f32771e = file;
                    } else {
                        FileDescriptor fileDescriptor = this.f46363f;
                        if (fileDescriptor != null) {
                            this.f46362e.f32772f = fileDescriptor;
                        } else {
                            throw new IllegalStateException("file and fileDescriptor are both null.");
                        }
                    }
                    C11280b.C11281a aVar = this.f46362e;
                    aVar.f32767a = false;
                    C16392c cVar = C16392c.this;
                    aVar.f32774h = cVar.f46344t;
                    aVar.f32775i = cVar.f46345u;
                    aVar.f32768b = cVar.f46348x;
                    aVar.f32773g = cVar.f46311K;
                    this.f46362e.f32776j = C16392c.this.f46313M;
                    this.f46362e.f32777k = C16392c.this.f46314N;
                    this.f46362e.f32778l = C16392c.this.f46315O;
                    this.f46362e.f32780n = C16392c.this.f46316P;
                    this.f46362e.f32782p = C16392c.this.f46317Q;
                    C16392c.this.mo43342S1(this.f46362e);
                    return;
                }
                throw new IllegalStateException("Can't record video while in PICTURE mode");
            }
        }
    }

    /* renamed from: kd.c$f */
    class C16398f implements Runnable {

        /* renamed from: d */
        final /* synthetic */ C11280b.C11281a f46365d;

        /* renamed from: e */
        final /* synthetic */ File f46366e;

        C16398f(C11280b.C11281a aVar, File file) {
            this.f46365d = aVar;
            this.f46366e = file;
        }

        public void run() {
            C16401d.f46370h.mo42878c("takeVideoSnapshot:", "running. isTakingVideo:", Boolean.valueOf(C16392c.this.mo43450N1()));
            C11280b.C11281a aVar = this.f46365d;
            aVar.f32771e = this.f46366e;
            aVar.f32767a = true;
            C16392c cVar = C16392c.this;
            aVar.f32774h = cVar.f46344t;
            aVar.f32775i = cVar.f46345u;
            aVar.f32768b = cVar.f46348x;
            aVar.f32773g = cVar.f46311K;
            this.f46365d.f32780n = C16392c.this.f46316P;
            this.f46365d.f32782p = C16392c.this.f46317Q;
            this.f46365d.f32776j = C16392c.this.f46313M;
            this.f46365d.f32777k = C16392c.this.f46314N;
            this.f46365d.f32778l = C16392c.this.f46315O;
            C16392c.this.mo43343T1(this.f46365d, C10395a.m37801g(C16392c.this.m58298J1(C17489c.OUTPUT)));
        }
    }

    /* renamed from: kd.c$g */
    class C16399g implements Runnable {
        C16399g() {
        }

        public void run() {
            C16401d.f46370h.mo42878c("stopVideo", "running. isTakingVideo?", Boolean.valueOf(C16392c.this.mo43450N1()));
            C16392c.this.mo43455P1();
        }
    }

    /* renamed from: kd.c$h */
    class C16400h implements Runnable {
        C16400h() {
        }

        public void run() {
            C10396b E1 = C16392c.this.mo43432E1();
            if (E1.equals(C16392c.this.f46338n)) {
                C16401d.f46370h.mo42878c("onSurfaceChanged:", "The computed preview size is identical. No op.");
                return;
            }
            C16401d.f46370h.mo42878c("onSurfaceChanged:", "Computed a new preview size. Calling onPreviewStreamSizeChanged().");
            C16392c cVar = C16392c.this;
            cVar.f46338n = E1;
            cVar.mo43337O1();
        }
    }

    protected C16392c(C16401d.C16413l lVar) {
        super(lVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: J1 */
    public C10396b m58298J1(C17489c cVar) {
        C10241a aVar = this.f46333i;
        if (aVar == null) {
            return null;
        }
        if (mo43490w().mo45009b(C17489c.VIEW, cVar)) {
            return aVar.mo26809l().mo27059b();
        }
        return aVar.mo26809l();
    }

    /* renamed from: A */
    public final long mo43423A() {
        return this.f46318R;
    }

    /* renamed from: B0 */
    public final void mo43424B0(C15749f fVar) {
        C15749f fVar2 = this.f46311K;
        if (fVar != fVar2) {
            this.f46311K = fVar;
            mo43507N().mo45346w("facing", C17757b.ENGINE, new C16393a(fVar, fVar2));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: B1 */
    public final C10396b mo43425B1() {
        return mo43427C1(this.f46312L);
    }

    /* renamed from: C */
    public final C15603c mo43426C() {
        return this.f46334j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C1 */
    public final C10396b mo43427C1(C15753j jVar) {
        Collection collection;
        C10397c cVar;
        boolean b = mo43490w().mo45009b(C17489c.SENSOR, C17489c.VIEW);
        if (jVar == C15753j.PICTURE) {
            cVar = this.f46309I;
            collection = this.f46334j.mo42891j();
        } else {
            cVar = this.f46310J;
            collection = this.f46334j.mo42892k();
        }
        C10397c j = C10399e.m37823j(cVar, C10399e.m37816c());
        ArrayList arrayList = new ArrayList(collection);
        C10396b bVar = (C10396b) j.mo27066a(arrayList).get(0);
        if (arrayList.contains(bVar)) {
            C16401d.f46370h.mo42878c("computeCaptureSize:", "result:", bVar, "flip:", Boolean.valueOf(b), "mode:", jVar);
            if (b) {
                return bVar.mo27059b();
            }
            return bVar;
        }
        throw new RuntimeException("SizeSelectors must not return Sizes other than those in the input list.");
    }

    /* renamed from: D */
    public final float mo43428D() {
        return this.f46350z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D1 */
    public final C10396b mo43429D1() {
        List<C10396b> G1 = mo43330G1();
        boolean b = mo43490w().mo45009b(C17489c.SENSOR, C17489c.VIEW);
        ArrayList arrayList = new ArrayList(G1.size());
        for (C10396b bVar : G1) {
            if (b) {
                bVar = bVar.mo27059b();
            }
            arrayList.add(bVar);
        }
        C10395a f = C10395a.m37800f(this.f46338n.mo27062e(), this.f46338n.mo27060c());
        if (b) {
            f = f.mo27051b();
        }
        int i = this.f46321U;
        int i2 = this.f46322V;
        if (i <= 0 || i == Integer.MAX_VALUE) {
            i = 640;
        }
        if (i2 <= 0 || i2 == Integer.MAX_VALUE) {
            i2 = 640;
        }
        C10396b bVar2 = new C10396b(i, i2);
        C15600b bVar3 = C16401d.f46370h;
        bVar3.mo42878c("computeFrameProcessingSize:", "targetRatio:", f, "targetMaxSize:", bVar2);
        C10397c b2 = C10399e.m37815b(f, Utils.FLOAT_EPSILON);
        C10397c a = C10399e.m37814a(C10399e.m37818e(bVar2.mo27060c()), C10399e.m37819f(bVar2.mo27062e()), C10399e.m37816c());
        C10396b bVar4 = (C10396b) C10399e.m37823j(C10399e.m37814a(b2, a), a, C10399e.m37824k()).mo27066a(arrayList).get(0);
        if (arrayList.contains(bVar4)) {
            if (b) {
                bVar4 = bVar4.mo27059b();
            }
            bVar3.mo42878c("computeFrameProcessingSize:", "result:", bVar4, "flip:", Boolean.valueOf(b));
            return bVar4;
        }
        throw new RuntimeException("SizeSelectors must not return Sizes other than those in the input list.");
    }

    /* renamed from: E */
    public final C15749f mo43430E() {
        return this.f46311K;
    }

    /* renamed from: E0 */
    public final void mo43431E0(int i) {
        this.f46322V = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E1 */
    public final C10396b mo43432E1() {
        List<C10396b> I1 = mo43333I1();
        boolean b = mo43490w().mo45009b(C17489c.SENSOR, C17489c.VIEW);
        ArrayList arrayList = new ArrayList(I1.size());
        for (C10396b bVar : I1) {
            if (b) {
                bVar = bVar.mo27059b();
            }
            arrayList.add(bVar);
        }
        C10396b J1 = m58298J1(C17489c.VIEW);
        if (J1 != null) {
            C10395a f = C10395a.m37800f(this.f46337m.mo27062e(), this.f46337m.mo27060c());
            if (b) {
                f = f.mo27051b();
            }
            C15600b bVar2 = C16401d.f46370h;
            bVar2.mo42878c("computePreviewStreamSize:", "targetRatio:", f, "targetMinSize:", J1);
            C10397c a = C10399e.m37814a(C10399e.m37815b(f, Utils.FLOAT_EPSILON), C10399e.m37816c());
            C10397c a2 = C10399e.m37814a(C10399e.m37821h(J1.mo27060c()), C10399e.m37822i(J1.mo27062e()), C10399e.m37824k());
            C10397c j = C10399e.m37823j(C10399e.m37814a(a, a2), a2, a, C10399e.m37816c());
            C10397c cVar = this.f46308H;
            if (cVar != null) {
                j = C10399e.m37823j(cVar, j);
            }
            C10396b bVar3 = (C10396b) j.mo27066a(arrayList).get(0);
            if (arrayList.contains(bVar3)) {
                if (b) {
                    bVar3 = bVar3.mo27059b();
                }
                bVar2.mo42878c("computePreviewStreamSize:", "result:", bVar3, "flip:", Boolean.valueOf(b));
                return bVar3;
            }
            throw new RuntimeException("SizeSelectors must not return Sizes other than those in the input list.");
        }
        throw new IllegalStateException("targetMinSize should not be null here.");
    }

    /* renamed from: F */
    public final C15750g mo43433F() {
        return this.f46342r;
    }

    /* renamed from: F0 */
    public final void mo43434F0(int i) {
        this.f46321U = i;
    }

    /* renamed from: F1 */
    public C18111c mo43435F1() {
        if (this.f46306F == null) {
            this.f46306F = mo43335L1(this.f46323W);
        }
        return this.f46306F;
    }

    /* renamed from: G */
    public final int mo43436G() {
        return this.f46340p;
    }

    /* renamed from: G0 */
    public final void mo43437G0(int i) {
        this.f46323W = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G1 */
    public abstract List mo43330G1();

    /* renamed from: H */
    public final int mo43438H() {
        return this.f46322V;
    }

    /* renamed from: H1 */
    public final C19009a mo43439H1() {
        return this.f46324X;
    }

    /* renamed from: I */
    public final int mo43440I() {
        return this.f46321U;
    }

    /* access modifiers changed from: protected */
    /* renamed from: I1 */
    public abstract List mo43333I1();

    /* renamed from: J */
    public final int mo43441J() {
        return this.f46323W;
    }

    /* renamed from: K */
    public final C15752i mo43442K() {
        return this.f46346v;
    }

    /* renamed from: K0 */
    public final void mo43443K0(C15753j jVar) {
        if (jVar != this.f46312L) {
            this.f46312L = jVar;
            mo43507N().mo45346w("mode", C17757b.ENGINE, new C16394b());
        }
    }

    /* renamed from: K1 */
    public final boolean mo43444K1() {
        return this.f46341q;
    }

    /* renamed from: L */
    public final Location mo43445L() {
        return this.f46348x;
    }

    /* renamed from: L0 */
    public final void mo43446L0(C19009a aVar) {
        this.f46324X = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: L1 */
    public abstract C18111c mo43335L1(int i);

    /* renamed from: M */
    public final C15753j mo43447M() {
        return this.f46312L;
    }

    /* renamed from: M1 */
    public final boolean mo43448M1() {
        return this.f46335k != null;
    }

    /* renamed from: N0 */
    public final void mo43449N0(boolean z) {
        this.f46302B = z;
    }

    /* renamed from: N1 */
    public final boolean mo43450N1() {
        C11291d dVar = this.f46336l;
        return dVar != null && dVar.mo29497j();
    }

    /* renamed from: O */
    public final C15754k mo43451O() {
        return this.f46347w;
    }

    /* renamed from: O0 */
    public final void mo43452O0(C10397c cVar) {
        this.f46309I = cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public abstract void mo43337O1();

    /* renamed from: P */
    public final boolean mo43453P() {
        return this.f46302B;
    }

    /* renamed from: P0 */
    public final void mo43454P0(boolean z) {
        this.f46303C = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: P1 */
    public void mo43455P1() {
        C11291d dVar = this.f46336l;
        if (dVar != null) {
            dVar.mo29499o(false);
        }
    }

    /* renamed from: Q */
    public final C10396b mo43456Q(C17489c cVar) {
        C10396b bVar = this.f46337m;
        if (bVar == null || this.f46312L == C15753j.VIDEO) {
            return null;
        }
        if (mo43490w().mo45009b(C17489c.SENSOR, cVar)) {
            return bVar.mo27059b();
        }
        return bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q1 */
    public abstract void mo43339Q1(C11278a.C11279a aVar, boolean z);

    /* renamed from: R */
    public final C10397c mo43457R() {
        return this.f46309I;
    }

    /* renamed from: R0 */
    public final void mo43458R0(C10241a aVar) {
        C10241a aVar2 = this.f46333i;
        if (aVar2 != null) {
            aVar2.mo26820w((C10241a.C10244c) null);
        }
        this.f46333i = aVar;
        aVar.mo26820w(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: R1 */
    public abstract void mo43340R1(C11278a.C11279a aVar, C10395a aVar2, boolean z);

    /* renamed from: S */
    public final boolean mo43459S() {
        return this.f46303C;
    }

    /* access modifiers changed from: protected */
    /* renamed from: S1 */
    public abstract void mo43342S1(C11280b.C11281a aVar);

    /* renamed from: T */
    public final C10241a mo43460T() {
        return this.f46333i;
    }

    /* renamed from: T0 */
    public final void mo43461T0(boolean z) {
        this.f46305E = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: T1 */
    public abstract void mo43343T1(C11280b.C11281a aVar, C10395a aVar2);

    /* renamed from: U */
    public final float mo43462U() {
        return this.f46304D;
    }

    /* renamed from: U0 */
    public final void mo43463U0(C10397c cVar) {
        this.f46308H = cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: U1 */
    public final boolean mo43464U1() {
        long j = this.f46318R;
        return j > 0 && j != Long.MAX_VALUE;
    }

    /* renamed from: V */
    public final boolean mo43465V() {
        return this.f46305E;
    }

    /* renamed from: V0 */
    public final void mo43466V0(int i) {
        this.f46320T = i;
    }

    /* renamed from: W */
    public final C10396b mo43467W(C17489c cVar) {
        C10396b bVar = this.f46338n;
        if (bVar == null) {
            return null;
        }
        if (mo43490w().mo45009b(C17489c.SENSOR, cVar)) {
            return bVar.mo27059b();
        }
        return bVar;
    }

    /* renamed from: W0 */
    public final void mo43468W0(int i) {
        this.f46319S = i;
    }

    /* renamed from: X */
    public final int mo43469X() {
        return this.f46320T;
    }

    /* renamed from: X0 */
    public final void mo43470X0(int i) {
        this.f46316P = i;
    }

    /* renamed from: Y */
    public final int mo43471Y() {
        return this.f46319S;
    }

    /* renamed from: Y0 */
    public final void mo43472Y0(C15756m mVar) {
        this.f46344t = mVar;
    }

    /* renamed from: Z0 */
    public final void mo43473Z0(int i) {
        this.f46315O = i;
    }

    /* renamed from: a */
    public void mo29500a() {
        mo43506B().mo29440g();
    }

    /* renamed from: a1 */
    public final void mo43474a1(long j) {
        this.f46314N = j;
    }

    /* renamed from: b0 */
    public final C10396b mo43475b0(C17489c cVar) {
        int i;
        int i2;
        C10396b W = mo43467W(cVar);
        if (W == null) {
            return null;
        }
        boolean b = mo43490w().mo45009b(cVar, C17489c.VIEW);
        if (b) {
            i = this.f46320T;
        } else {
            i = this.f46319S;
        }
        if (b) {
            i2 = this.f46319S;
        } else {
            i2 = this.f46320T;
        }
        if (i <= 0) {
            i = Integer.MAX_VALUE;
        }
        if (i2 <= 0) {
            i2 = Integer.MAX_VALUE;
        }
        float j = C10395a.m37801g(W).mo27056j();
        if (C10395a.m37800f(i, i2).mo27056j() >= j) {
            int min = Math.min(W.mo27060c(), i2);
            return new C10396b((int) Math.floor((double) (((float) min) * j)), min);
        }
        int min2 = Math.min(W.mo27062e(), i);
        return new C10396b(min2, (int) Math.floor((double) (((float) min2) / j)));
    }

    /* renamed from: b1 */
    public final void mo43476b1(C10397c cVar) {
        this.f46310J = cVar;
    }

    /* renamed from: c0 */
    public final int mo43477c0() {
        return this.f46316P;
    }

    /* renamed from: d */
    public void mo29501d() {
        mo43506B().mo29437d();
    }

    /* renamed from: d0 */
    public final C15756m mo43478d0() {
        return this.f46344t;
    }

    /* renamed from: e0 */
    public final int mo43479e0() {
        return this.f46315O;
    }

    /* renamed from: f0 */
    public final long mo43480f0() {
        return this.f46314N;
    }

    /* renamed from: g0 */
    public final C10396b mo43481g0(C17489c cVar) {
        C10396b bVar = this.f46337m;
        if (bVar == null || this.f46312L == C15753j.PICTURE) {
            return null;
        }
        if (mo43490w().mo45009b(C17489c.SENSOR, cVar)) {
            return bVar.mo27059b();
        }
        return bVar;
    }

    /* renamed from: h0 */
    public final C10397c mo43482h0() {
        return this.f46310J;
    }

    /* renamed from: i0 */
    public final C15757n mo43483i0() {
        return this.f46343s;
    }

    /* renamed from: j0 */
    public final float mo43484j0() {
        return this.f46349y;
    }

    /* renamed from: k */
    public void mo26305k(C11278a.C11279a aVar, Exception exc) {
        this.f46335k = null;
        if (aVar != null) {
            mo43506B().mo29443h(aVar);
            return;
        }
        C16401d.f46370h.mo42877b("onPictureResult", "result is null: something went wrong.", exc);
        mo43506B().mo29448m(new CameraException(exc, 4));
    }

    /* renamed from: n */
    public void mo26306n(boolean z) {
        mo43506B().mo29444i(!z);
    }

    /* renamed from: n1 */
    public final void mo43485n1() {
        mo43507N().mo45332i("stop video", true, new C16399g());
    }

    /* renamed from: o */
    public final void mo26826o() {
        C16401d.f46370h.mo42878c("onSurfaceChanged:", "Size is", m58298J1(C17489c.VIEW));
        mo43507N().mo45346w("surface changed", C17757b.BIND, new C16400h());
    }

    /* renamed from: o1 */
    public void mo43486o1(C11278a.C11279a aVar) {
        mo43507N().mo45346w("take picture", C17757b.BIND, new C16395c(aVar, this.f46302B));
    }

    /* renamed from: p */
    public void mo29502p(C11280b.C11281a aVar, Exception exc) {
        this.f46336l = null;
        if (aVar != null) {
            mo43506B().mo29434a(aVar);
            return;
        }
        C16401d.f46370h.mo42877b("onVideoResult", "result is null: something went wrong.", exc);
        mo43506B().mo29448m(new CameraException(exc, 5));
    }

    /* renamed from: p1 */
    public void mo43487p1(C11278a.C11279a aVar) {
        mo43507N().mo45346w("take picture snapshot", C17757b.BIND, new C16396d(aVar, this.f46303C));
    }

    /* renamed from: q1 */
    public final void mo43488q1(C11280b.C11281a aVar, File file, FileDescriptor fileDescriptor) {
        mo43507N().mo45346w("take video", C17757b.BIND, new C16397e(file, aVar, fileDescriptor));
    }

    /* renamed from: r1 */
    public final void mo43489r1(C11280b.C11281a aVar, File file) {
        mo43507N().mo45346w("take video snapshot", C17757b.BIND, new C16398f(aVar, file));
    }

    /* renamed from: w */
    public final C17486a mo43490w() {
        return this.f46307G;
    }

    /* renamed from: w0 */
    public final void mo43491w0(C15744a aVar) {
        if (this.f46313M != aVar) {
            if (mo43450N1()) {
                C16401d.f46370h.mo42880h("Audio setting was changed while recording. Changes will take place starting from next video");
            }
            this.f46313M = aVar;
        }
    }

    /* renamed from: x */
    public final C15744a mo43492x() {
        return this.f46313M;
    }

    /* renamed from: x0 */
    public final void mo43493x0(int i) {
        this.f46317Q = i;
    }

    /* renamed from: y */
    public final int mo43494y() {
        return this.f46317Q;
    }

    /* renamed from: y0 */
    public final void mo43495y0(C15745b bVar) {
        this.f46345u = bVar;
    }

    /* renamed from: z */
    public final C15745b mo43496z() {
        return this.f46345u;
    }

    /* renamed from: z0 */
    public final void mo43497z0(long j) {
        this.f46318R = j;
    }
}
