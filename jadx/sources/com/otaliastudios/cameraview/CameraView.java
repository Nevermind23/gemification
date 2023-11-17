package com.otaliastudios.cameraview;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.location.Location;
import android.media.MediaActionSound;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.C1593j;
import androidx.lifecycle.C1616p;
import androidx.lifecycle.C1619q;
import androidx.lifecycle.C1646z;
import com.github.mikephil.charting.utils.Utils;
import com.otaliastudios.cameraview.C11278a;
import com.otaliastudios.cameraview.C11280b;
import com.salesforce.marketingcloud.C11398b;
import java.io.File;
import java.io.FileDescriptor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p360be.C10241a;
import p360be.C10245b;
import p360be.C10246c;
import p360be.C10256f;
import p360be.C10258g;
import p374ce.C10395a;
import p374ce.C10396b;
import p374ce.C10397c;
import p374ce.C10398d;
import p458id.C15599a;
import p458id.C15600b;
import p458id.C15603c;
import p458id.C15607g;
import p472jd.C15744a;
import p472jd.C15745b;
import p472jd.C15746c;
import p472jd.C15747d;
import p472jd.C15748e;
import p472jd.C15749f;
import p472jd.C15750g;
import p472jd.C15751h;
import p472jd.C15752i;
import p472jd.C15753j;
import p472jd.C15754k;
import p472jd.C15755l;
import p472jd.C15756m;
import p472jd.C15757n;
import p486kd.C16350a;
import p486kd.C16365b;
import p486kd.C16401d;
import p570qd.C17489c;
import p598sd.C17757b;
import p612td.C17928b;
import p612td.C17929c;
import p612td.C17930d;
import p625ud.C18110b;
import p625ud.C18112d;
import p638vd.C18298a;
import p638vd.C18299b;
import p638vd.C18300c;
import p638vd.C18302d;
import p638vd.C18304f;
import p638vd.C18306g;
import p638vd.C18308h;
import p651wd.C18502b;
import p651wd.C18506f;
import p651wd.C18509h;
import p665xd.C18701a;
import p665xd.C18703c;
import p665xd.C18704d;
import p679yd.C18879b;
import p693zd.C19012c;

public class CameraView extends FrameLayout implements C1616p {

    /* renamed from: G */
    private static final C15600b f32660G = C15600b.m56349a(CameraView.class.getSimpleName());

    /* renamed from: A */
    C18506f f32661A;

    /* renamed from: B */
    C18703c f32662B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public boolean f32663C;

    /* renamed from: D */
    private boolean f32664D;

    /* renamed from: E */
    private boolean f32665E;

    /* renamed from: F */
    C19012c f32666F;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f32667d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f32668e;

    /* renamed from: f */
    private boolean f32669f;

    /* renamed from: g */
    private HashMap f32670g = new HashMap(4);

    /* renamed from: h */
    private C15755l f32671h;

    /* renamed from: i */
    private C15748e f32672i;

    /* renamed from: j */
    private C17928b f32673j;

    /* renamed from: k */
    private int f32674k;

    /* renamed from: l */
    private int f32675l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public Handler f32676m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public Executor f32677n;

    /* renamed from: o */
    C11262h f32678o;

    /* renamed from: p */
    private C10241a f32679p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public C18509h f32680q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public C16401d f32681r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public C10396b f32682s;

    /* renamed from: t */
    private MediaActionSound f32683t;

    /* renamed from: u */
    List f32684u = new CopyOnWriteArrayList();

    /* renamed from: v */
    List f32685v = new CopyOnWriteArrayList();

    /* renamed from: w */
    private C1593j f32686w;

    /* renamed from: x */
    C18304f f32687x;

    /* renamed from: y */
    C18308h f32688y;

    /* renamed from: z */
    C18306g f32689z;

    /* renamed from: com.otaliastudios.cameraview.CameraView$a */
    class C11255a implements Runnable {
        C11255a() {
        }

        public void run() {
            CameraView cameraView = CameraView.this;
            boolean unused = cameraView.f32663C = cameraView.getKeepScreenOn();
            if (!CameraView.this.f32663C) {
                CameraView.this.setKeepScreenOn(true);
            }
        }
    }

    /* renamed from: com.otaliastudios.cameraview.CameraView$b */
    class C11256b implements Runnable {
        C11256b() {
        }

        public void run() {
            CameraView cameraView = CameraView.this;
            boolean unused = cameraView.f32663C = cameraView.getKeepScreenOn();
            if (!CameraView.this.f32663C) {
                CameraView.this.setKeepScreenOn(true);
            }
        }
    }

    /* renamed from: com.otaliastudios.cameraview.CameraView$c */
    class C11257c extends C15599a {

        /* renamed from: a */
        final /* synthetic */ int f32692a;

        C11257c(int i) {
            this.f32692a = i;
        }

        /* renamed from: d */
        public void mo29431d(CameraException cameraException) {
            super.mo29431d(cameraException);
            if (cameraException.mo29314a() == 5) {
                CameraView.this.setVideoMaxDuration(this.f32692a);
                CameraView.this.mo29319H(this);
            }
        }

        /* renamed from: l */
        public void mo27288l(C11280b bVar) {
            CameraView.this.setVideoMaxDuration(this.f32692a);
            CameraView.this.mo29319H(this);
        }
    }

    /* renamed from: com.otaliastudios.cameraview.CameraView$d */
    class C11258d extends C15599a {

        /* renamed from: a */
        final /* synthetic */ int f32694a;

        C11258d(int i) {
            this.f32694a = i;
        }

        /* renamed from: d */
        public void mo29431d(CameraException cameraException) {
            super.mo29431d(cameraException);
            if (cameraException.mo29314a() == 5) {
                CameraView.this.setVideoMaxDuration(this.f32694a);
                CameraView.this.mo29319H(this);
            }
        }

        /* renamed from: l */
        public void mo27288l(C11280b bVar) {
            CameraView.this.setVideoMaxDuration(this.f32694a);
            CameraView.this.mo29319H(this);
        }
    }

    /* renamed from: com.otaliastudios.cameraview.CameraView$e */
    class C11259e implements Runnable {
        C11259e() {
        }

        public void run() {
            if (CameraView.this.getKeepScreenOn() != CameraView.this.f32663C) {
                CameraView cameraView = CameraView.this;
                cameraView.setKeepScreenOn(cameraView.f32663C);
            }
        }
    }

    /* renamed from: com.otaliastudios.cameraview.CameraView$f */
    class C11260f implements ThreadFactory {

        /* renamed from: d */
        private final AtomicInteger f32697d = new AtomicInteger(1);

        C11260f() {
        }

        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "FrameExecutor #" + this.f32697d.getAndIncrement());
        }
    }

    /* renamed from: com.otaliastudios.cameraview.CameraView$g */
    static /* synthetic */ class C11261g {

        /* renamed from: a */
        static final /* synthetic */ int[] f32699a;

        /* renamed from: b */
        static final /* synthetic */ int[] f32700b;

        /* renamed from: c */
        static final /* synthetic */ int[] f32701c;

        /* renamed from: d */
        static final /* synthetic */ int[] f32702d;

        /* JADX WARNING: Can't wrap try/catch for region: R(39:0|(2:1|2)|3|(2:5|6)|7|9|10|(2:11|12)|13|15|16|17|(2:19|20)|21|23|24|25|26|27|28|29|31|32|33|34|35|36|37|38|39|40|41|43|44|45|46|47|48|50) */
        /* JADX WARNING: Can't wrap try/catch for region: R(42:0|1|2|3|5|6|7|9|10|11|12|13|15|16|17|(2:19|20)|21|23|24|25|26|27|28|29|31|32|33|34|35|36|37|38|39|40|41|43|44|45|46|47|48|50) */
        /* JADX WARNING: Can't wrap try/catch for region: R(43:0|1|2|3|5|6|7|9|10|11|12|13|15|16|17|19|20|21|23|24|25|26|27|28|29|31|32|33|34|35|36|37|38|39|40|41|43|44|45|46|47|48|50) */
        /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0059 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0064 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0080 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x008a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0094 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x009e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00b9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00c3 */
        static {
            /*
                jd.f[] r0 = p472jd.C15749f.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f32702d = r0
                r1 = 1
                jd.f r2 = p472jd.C15749f.BACK     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f32702d     // Catch:{ NoSuchFieldError -> 0x001d }
                jd.f r3 = p472jd.C15749f.FRONT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                vd.b[] r2 = p638vd.C18299b.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f32701c = r2
                vd.b r3 = p638vd.C18299b.TAKE_PICTURE_SNAPSHOT     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = f32701c     // Catch:{ NoSuchFieldError -> 0x0038 }
                vd.b r3 = p638vd.C18299b.TAKE_PICTURE     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                r2 = 3
                int[] r3 = f32701c     // Catch:{ NoSuchFieldError -> 0x0043 }
                vd.b r4 = p638vd.C18299b.AUTO_FOCUS     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                r3 = 4
                int[] r4 = f32701c     // Catch:{ NoSuchFieldError -> 0x004e }
                vd.b r5 = p638vd.C18299b.ZOOM     // Catch:{ NoSuchFieldError -> 0x004e }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                r4 = 5
                int[] r5 = f32701c     // Catch:{ NoSuchFieldError -> 0x0059 }
                vd.b r6 = p638vd.C18299b.EXPOSURE_CORRECTION     // Catch:{ NoSuchFieldError -> 0x0059 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0059 }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x0059 }
            L_0x0059:
                int[] r5 = f32701c     // Catch:{ NoSuchFieldError -> 0x0064 }
                vd.b r6 = p638vd.C18299b.FILTER_CONTROL_1     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r7 = 6
                r5[r6] = r7     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0064:
                int[] r5 = f32701c     // Catch:{ NoSuchFieldError -> 0x006f }
                vd.b r6 = p638vd.C18299b.FILTER_CONTROL_2     // Catch:{ NoSuchFieldError -> 0x006f }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x006f }
                r7 = 7
                r5[r6] = r7     // Catch:{ NoSuchFieldError -> 0x006f }
            L_0x006f:
                vd.a[] r5 = p638vd.C18298a.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                f32700b = r5
                vd.a r6 = p638vd.C18298a.PINCH     // Catch:{ NoSuchFieldError -> 0x0080 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0080 }
                r5[r6] = r1     // Catch:{ NoSuchFieldError -> 0x0080 }
            L_0x0080:
                int[] r5 = f32700b     // Catch:{ NoSuchFieldError -> 0x008a }
                vd.a r6 = p638vd.C18298a.TAP     // Catch:{ NoSuchFieldError -> 0x008a }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x008a }
                r5[r6] = r0     // Catch:{ NoSuchFieldError -> 0x008a }
            L_0x008a:
                int[] r5 = f32700b     // Catch:{ NoSuchFieldError -> 0x0094 }
                vd.a r6 = p638vd.C18298a.LONG_TAP     // Catch:{ NoSuchFieldError -> 0x0094 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0094 }
                r5[r6] = r2     // Catch:{ NoSuchFieldError -> 0x0094 }
            L_0x0094:
                int[] r5 = f32700b     // Catch:{ NoSuchFieldError -> 0x009e }
                vd.a r6 = p638vd.C18298a.SCROLL_HORIZONTAL     // Catch:{ NoSuchFieldError -> 0x009e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x009e }
                r5[r6] = r3     // Catch:{ NoSuchFieldError -> 0x009e }
            L_0x009e:
                int[] r3 = f32700b     // Catch:{ NoSuchFieldError -> 0x00a8 }
                vd.a r5 = p638vd.C18298a.SCROLL_VERTICAL     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r3[r5] = r4     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                jd.l[] r3 = p472jd.C15755l.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f32699a = r3
                jd.l r4 = p472jd.C15755l.SURFACE     // Catch:{ NoSuchFieldError -> 0x00b9 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b9 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x00b9 }
            L_0x00b9:
                int[] r1 = f32699a     // Catch:{ NoSuchFieldError -> 0x00c3 }
                jd.l r3 = p472jd.C15755l.TEXTURE     // Catch:{ NoSuchFieldError -> 0x00c3 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c3 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x00c3 }
            L_0x00c3:
                int[] r0 = f32699a     // Catch:{ NoSuchFieldError -> 0x00cd }
                jd.l r1 = p472jd.C15755l.GL_SURFACE     // Catch:{ NoSuchFieldError -> 0x00cd }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cd }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cd }
            L_0x00cd:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.otaliastudios.cameraview.CameraView.C11261g.<clinit>():void");
        }
    }

    /* renamed from: com.otaliastudios.cameraview.CameraView$h */
    class C11262h implements C16401d.C16413l, C18509h.C18512c, C18300c.C18301a {

        /* renamed from: a */
        private final String f32703a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final C15600b f32704b;

        /* renamed from: com.otaliastudios.cameraview.CameraView$h$a */
        class C11263a implements Runnable {

            /* renamed from: d */
            final /* synthetic */ float f32706d;

            /* renamed from: e */
            final /* synthetic */ PointF[] f32707e;

            C11263a(float f, PointF[] pointFArr) {
                this.f32706d = f;
                this.f32707e = pointFArr;
            }

            public void run() {
                for (C15599a m : CameraView.this.f32684u) {
                    m.mo42876m(this.f32706d, new float[]{Utils.FLOAT_EPSILON, 1.0f}, this.f32707e);
                }
            }
        }

        /* renamed from: com.otaliastudios.cameraview.CameraView$h$b */
        class C11264b implements Runnable {

            /* renamed from: d */
            final /* synthetic */ float f32709d;

            /* renamed from: e */
            final /* synthetic */ float[] f32710e;

            /* renamed from: f */
            final /* synthetic */ PointF[] f32711f;

            C11264b(float f, float[] fArr, PointF[] pointFArr) {
                this.f32709d = f;
                this.f32710e = fArr;
                this.f32711f = pointFArr;
            }

            public void run() {
                for (C15599a f : CameraView.this.f32684u) {
                    f.mo42872f(this.f32709d, this.f32710e, this.f32711f);
                }
            }
        }

        /* renamed from: com.otaliastudios.cameraview.CameraView$h$c */
        class C11265c implements Runnable {

            /* renamed from: d */
            final /* synthetic */ C18110b f32713d;

            C11265c(C18110b bVar) {
                this.f32713d = bVar;
            }

            public void run() {
                C11262h.this.f32704b.mo42879g("dispatchFrame: executing. Passing", Long.valueOf(this.f32713d.mo45796g()), "to processors.");
                for (C18112d a : CameraView.this.f32685v) {
                    try {
                        a.mo45581a(this.f32713d);
                    } catch (Exception e) {
                        C11262h.this.f32704b.mo42880h("Frame processor crashed:", e);
                    }
                }
                this.f32713d.mo45797i();
            }
        }

        /* renamed from: com.otaliastudios.cameraview.CameraView$h$d */
        class C11266d implements Runnable {

            /* renamed from: d */
            final /* synthetic */ CameraException f32715d;

            C11266d(CameraException cameraException) {
                this.f32715d = cameraException;
            }

            public void run() {
                for (C15599a d : CameraView.this.f32684u) {
                    d.mo29431d(this.f32715d);
                }
            }
        }

        /* renamed from: com.otaliastudios.cameraview.CameraView$h$e */
        class C11267e implements Runnable {
            C11267e() {
            }

            public void run() {
                for (C15599a k : CameraView.this.f32684u) {
                    k.mo27287k();
                }
            }
        }

        /* renamed from: com.otaliastudios.cameraview.CameraView$h$f */
        class C11268f implements Runnable {
            C11268f() {
            }

            public void run() {
                for (C15599a j : CameraView.this.f32684u) {
                    j.mo27286j();
                }
            }
        }

        /* renamed from: com.otaliastudios.cameraview.CameraView$h$g */
        class C11269g implements Runnable {

            /* renamed from: d */
            final /* synthetic */ C15603c f32719d;

            C11269g(C15603c cVar) {
                this.f32719d = cVar;
            }

            public void run() {
                for (C15599a e : CameraView.this.f32684u) {
                    e.mo42871e(this.f32719d);
                }
            }
        }

        /* renamed from: com.otaliastudios.cameraview.CameraView$h$h */
        class C11270h implements Runnable {
            C11270h() {
            }

            public void run() {
                for (C15599a c : CameraView.this.f32684u) {
                    c.mo42870c();
                }
            }
        }

        /* renamed from: com.otaliastudios.cameraview.CameraView$h$i */
        class C11271i implements Runnable {
            C11271i() {
            }

            public void run() {
                CameraView.this.requestLayout();
            }
        }

        /* renamed from: com.otaliastudios.cameraview.CameraView$h$j */
        class C11272j implements Runnable {
            C11272j() {
            }

            public void run() {
                for (C15599a h : CameraView.this.f32684u) {
                    h.mo42874h();
                }
            }
        }

        /* renamed from: com.otaliastudios.cameraview.CameraView$h$k */
        class C11273k implements Runnable {

            /* renamed from: d */
            final /* synthetic */ C11278a.C11279a f32724d;

            C11273k(C11278a.C11279a aVar) {
                this.f32724d = aVar;
            }

            public void run() {
                C11278a aVar = new C11278a(this.f32724d);
                for (C15599a i : CameraView.this.f32684u) {
                    i.mo42875i(aVar);
                }
            }
        }

        /* renamed from: com.otaliastudios.cameraview.CameraView$h$l */
        class C11274l implements Runnable {

            /* renamed from: d */
            final /* synthetic */ C11280b.C11281a f32726d;

            C11274l(C11280b.C11281a aVar) {
                this.f32726d = aVar;
            }

            public void run() {
                C11280b bVar = new C11280b(this.f32726d);
                for (C15599a l : CameraView.this.f32684u) {
                    l.mo27288l(bVar);
                }
            }
        }

        /* renamed from: com.otaliastudios.cameraview.CameraView$h$m */
        class C11275m implements Runnable {

            /* renamed from: d */
            final /* synthetic */ PointF f32728d;

            /* renamed from: e */
            final /* synthetic */ C18298a f32729e;

            C11275m(PointF pointF, C18298a aVar) {
                this.f32728d = pointF;
                this.f32729e = aVar;
            }

            public void run() {
                CameraView.this.f32662B.mo46511a(1, new PointF[]{this.f32728d});
                C18701a unused = CameraView.this.getClass();
                for (C15599a b : CameraView.this.f32684u) {
                    b.mo42869b(this.f32728d);
                }
            }
        }

        /* renamed from: com.otaliastudios.cameraview.CameraView$h$n */
        class C11276n implements Runnable {

            /* renamed from: d */
            final /* synthetic */ boolean f32731d;

            /* renamed from: e */
            final /* synthetic */ C18298a f32732e;

            /* renamed from: f */
            final /* synthetic */ PointF f32733f;

            C11276n(boolean z, C18298a aVar, PointF pointF) {
                this.f32731d = z;
                this.f32732e = aVar;
                this.f32733f = pointF;
            }

            public void run() {
                if (this.f32731d && CameraView.this.f32667d) {
                    CameraView.this.m41256G(1);
                }
                C18701a unused = CameraView.this.getClass();
                for (C15599a a : CameraView.this.f32684u) {
                    a.mo42868a(this.f32731d, this.f32733f);
                }
            }
        }

        /* renamed from: com.otaliastudios.cameraview.CameraView$h$o */
        class C11277o implements Runnable {

            /* renamed from: d */
            final /* synthetic */ int f32735d;

            C11277o(int i) {
                this.f32735d = i;
            }

            public void run() {
                for (C15599a g : CameraView.this.f32684u) {
                    g.mo42873g(this.f32735d);
                }
            }
        }

        C11262h() {
            String simpleName = C11262h.class.getSimpleName();
            this.f32703a = simpleName;
            this.f32704b = C15600b.m56349a(simpleName);
        }

        /* renamed from: a */
        public void mo29434a(C11280b.C11281a aVar) {
            this.f32704b.mo42878c("dispatchOnVideoTaken", aVar);
            CameraView.this.f32676m.post(new C11274l(aVar));
        }

        /* renamed from: b */
        public Context mo29435b() {
            return CameraView.this.getContext();
        }

        /* renamed from: c */
        public void mo29436c(C15603c cVar) {
            this.f32704b.mo42878c("dispatchOnCameraOpened", cVar);
            CameraView.this.f32676m.post(new C11269g(cVar));
        }

        /* renamed from: d */
        public void mo29437d() {
            this.f32704b.mo42878c("dispatchOnVideoRecordingEnd");
            CameraView.this.f32676m.post(new C11268f());
        }

        /* renamed from: e */
        public void mo29438e() {
            this.f32704b.mo42878c("dispatchOnCameraClosed");
            CameraView.this.f32676m.post(new C11270h());
        }

        /* renamed from: f */
        public void mo29439f(C18298a aVar, PointF pointF) {
            this.f32704b.mo42878c("dispatchOnFocusStart", aVar, pointF);
            CameraView.this.f32676m.post(new C11275m(pointF, aVar));
        }

        /* renamed from: g */
        public void mo29440g() {
            this.f32704b.mo42878c("dispatchOnVideoRecordingStart");
            CameraView.this.f32676m.post(new C11267e());
        }

        public int getHeight() {
            return CameraView.this.getHeight();
        }

        public int getWidth() {
            return CameraView.this.getWidth();
        }

        /* renamed from: h */
        public void mo29443h(C11278a.C11279a aVar) {
            this.f32704b.mo42878c("dispatchOnPictureTaken", aVar);
            CameraView.this.f32676m.post(new C11273k(aVar));
        }

        /* renamed from: i */
        public void mo29444i(boolean z) {
            if (z && CameraView.this.f32667d) {
                CameraView.this.m41256G(0);
            }
            CameraView.this.f32676m.post(new C11272j());
        }

        /* renamed from: j */
        public void mo29445j(C18110b bVar) {
            this.f32704b.mo42879g("dispatchFrame:", Long.valueOf(bVar.mo45796g()), "processors:", Integer.valueOf(CameraView.this.f32685v.size()));
            if (CameraView.this.f32685v.isEmpty()) {
                bVar.mo45797i();
            } else {
                CameraView.this.f32677n.execute(new C11265c(bVar));
            }
        }

        /* renamed from: k */
        public void mo29446k(C18298a aVar, boolean z, PointF pointF) {
            this.f32704b.mo42878c("dispatchOnFocusEnd", aVar, Boolean.valueOf(z), pointF);
            CameraView.this.f32676m.post(new C11276n(z, aVar, pointF));
        }

        /* renamed from: l */
        public void mo29447l(float f, float[] fArr, PointF[] pointFArr) {
            this.f32704b.mo42878c("dispatchOnExposureCorrectionChanged", Float.valueOf(f));
            CameraView.this.f32676m.post(new C11264b(f, fArr, pointFArr));
        }

        /* renamed from: m */
        public void mo29448m(CameraException cameraException) {
            this.f32704b.mo42878c("dispatchError", cameraException);
            CameraView.this.f32676m.post(new C11266d(cameraException));
        }

        /* renamed from: n */
        public void mo29449n(int i) {
            this.f32704b.mo42878c("onDeviceOrientationChanged", Integer.valueOf(i));
            int j = CameraView.this.f32680q.mo46305j();
            if (!CameraView.this.f32668e) {
                CameraView.this.f32681r.mo43490w().mo45011g((360 - j) % 360);
            } else {
                CameraView.this.f32681r.mo43490w().mo45011g(i);
            }
            CameraView.this.f32676m.post(new C11277o((i + j) % 360));
        }

        /* renamed from: o */
        public void mo29450o() {
            C10396b W = CameraView.this.f32681r.mo43467W(C17489c.VIEW);
            if (W == null) {
                throw new RuntimeException("Preview stream size should not be null here.");
            } else if (W.equals(CameraView.this.f32682s)) {
                this.f32704b.mo42878c("onCameraPreviewStreamSizeChanged:", "swallowing because the preview size has not changed.", W);
            } else {
                this.f32704b.mo42878c("onCameraPreviewStreamSizeChanged: posting a requestLayout call.", "Preview stream size:", W);
                CameraView.this.f32676m.post(new C11271i());
            }
        }

        /* renamed from: p */
        public void mo29451p() {
            if (CameraView.this.mo29317C()) {
                this.f32704b.mo42880h("onDisplayOffsetChanged", "restarting the camera.");
                CameraView.this.close();
                CameraView.this.open();
            }
        }

        /* renamed from: q */
        public void mo29452q(float f, PointF[] pointFArr) {
            this.f32704b.mo42878c("dispatchOnZoomChanged", Float.valueOf(f));
            CameraView.this.f32676m.post(new C11263a(f, pointFArr));
        }
    }

    public CameraView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m41274y(context, attributeSet);
    }

    /* renamed from: B */
    private boolean m41253B() {
        if (this.f32681r.mo43508Z() != C17757b.OFF || this.f32681r.mo43512l0()) {
            return false;
        }
        return true;
    }

    /* renamed from: E */
    private String m41254E(int i) {
        if (i == Integer.MIN_VALUE) {
            return "AT_MOST";
        }
        if (i == 0) {
            return "UNSPECIFIED";
        }
        if (i != 1073741824) {
            return null;
        }
        return "EXACTLY";
    }

    /* renamed from: F */
    private void m41255F(C18300c cVar, C15603c cVar2) {
        C18298a c = cVar.mo46038c();
        PointF[] e = cVar.mo46040e();
        switch (C11261g.f32701c[((C18299b) this.f32670g.get(c)).ordinal()]) {
            case 1:
                mo29323M();
                return;
            case 2:
                mo29322L();
                return;
            case 3:
                this.f32681r.mo43347f1(c, C18879b.m63897c(new C10396b(getWidth(), getHeight()), e[0]), e[0]);
                return;
            case 4:
                float j0 = this.f32681r.mo43484j0();
                float b = cVar.mo46037b(j0, Utils.FLOAT_EPSILON, 1.0f);
                if (b != j0) {
                    this.f32681r.mo43346d1(b, e, true);
                    return;
                }
                return;
            case 5:
                float D = this.f32681r.mo43428D();
                float b2 = cVar2.mo42883b();
                float a = cVar2.mo42882a();
                float b3 = cVar.mo46037b(D, b2, a);
                if (b3 != D) {
                    this.f32681r.mo43327A0(b3, new float[]{b2, a}, e, true);
                    return;
                }
                return;
            case 6:
                getFilter();
                return;
            case 7:
                getFilter();
                return;
            default:
                return;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public void m41256G(int i) {
        if (this.f32667d) {
            if (this.f32683t == null) {
                this.f32683t = new MediaActionSound();
            }
            this.f32683t.play(i);
        }
    }

    /* renamed from: J */
    private void m41257J(boolean z, boolean z2) {
        Activity activity = null;
        for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                activity = (Activity) context;
            }
        }
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add("android.permission.CAMERA");
        }
        if (z2) {
            arrayList.add("android.permission.RECORD_AUDIO");
        }
        if (activity != null) {
            activity.requestPermissions((String[]) arrayList.toArray(new String[0]), 16);
        }
    }

    /* renamed from: O */
    private void m41258O(File file, FileDescriptor fileDescriptor) {
        C11280b.C11281a aVar = new C11280b.C11281a();
        if (file != null) {
            this.f32681r.mo43488q1(aVar, file, (FileDescriptor) null);
        } else if (fileDescriptor != null) {
            this.f32681r.mo43488q1(aVar, (File) null, fileDescriptor);
        } else {
            throw new IllegalStateException("file and fileDescriptor are both null.");
        }
        this.f32676m.post(new C11255a());
    }

    /* renamed from: P */
    private void m41259P(File file, FileDescriptor fileDescriptor, int i) {
        mo29377p(new C11257c(getVideoMaxDuration()));
        setVideoMaxDuration(i);
        m41258O(file, fileDescriptor);
    }

    /* renamed from: s */
    private void m41271s(C15744a aVar) {
        if (aVar == C15744a.ON || aVar == C15744a.MONO || aVar == C15744a.STEREO) {
            try {
                String[] strArr = getContext().getPackageManager().getPackageInfo(getContext().getPackageName(), C11398b.f33143v).requestedPermissions;
                int length = strArr.length;
                int i = 0;
                while (i < length) {
                    if (!strArr[i].equals("android.permission.RECORD_AUDIO")) {
                        i++;
                    } else {
                        return;
                    }
                }
                throw new IllegalStateException(f32660G.mo42877b("Permission error: when audio is enabled (Audio.ON) the RECORD_AUDIO permission should be added to the app manifest file."));
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
    }

    /* renamed from: v */
    private void m41272v() {
        C1593j jVar = this.f32686w;
        if (jVar != null) {
            jVar.mo4909d(this);
            this.f32686w = null;
        }
    }

    /* renamed from: w */
    private void m41273w() {
        C15600b bVar = f32660G;
        bVar.mo42880h("doInstantiateEngine:", "instantiating. engine:", this.f32672i);
        C16401d z = mo29428z(this.f32672i, this.f32678o);
        this.f32681r = z;
        bVar.mo42880h("doInstantiateEngine:", "instantiated. engine:", z.getClass().getSimpleName());
        this.f32681r.mo43446L0(this.f32666F);
    }

    /* renamed from: y */
    private void m41274y(Context context, AttributeSet attributeSet) {
        Context context2 = context;
        boolean isInEditMode = isInEditMode();
        this.f32665E = isInEditMode;
        if (!isInEditMode) {
            setWillNotDraw(false);
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C15607g.f44351a, 0, 0);
            C15747d dVar = new C15747d(context2, obtainStyledAttributes);
            boolean z = obtainStyledAttributes.getBoolean(C15607g.f44337M, true);
            boolean z2 = obtainStyledAttributes.getBoolean(C15607g.f44344T, true);
            this.f32664D = obtainStyledAttributes.getBoolean(C15607g.f44367i, false);
            this.f32669f = obtainStyledAttributes.getBoolean(C15607g.f44341Q, true);
            this.f32671h = dVar.mo43144j();
            this.f32672i = dVar.mo43137c();
            int color = obtainStyledAttributes.getColor(C15607g.f44393x, C18506f.f51986i);
            long j = (long) obtainStyledAttributes.getFloat(C15607g.f44348X, Utils.FLOAT_EPSILON);
            int integer = obtainStyledAttributes.getInteger(C15607g.f44347W, 0);
            int integer2 = obtainStyledAttributes.getInteger(C15607g.f44345U, 0);
            int integer3 = obtainStyledAttributes.getInteger(C15607g.f44355c, 0);
            float f = obtainStyledAttributes.getFloat(C15607g.f44339O, Utils.FLOAT_EPSILON);
            boolean z3 = obtainStyledAttributes.getBoolean(C15607g.f44340P, false);
            int i = integer;
            float f2 = f;
            long integer4 = (long) obtainStyledAttributes.getInteger(C15607g.f44361f, 3000);
            boolean z4 = z3;
            boolean z5 = obtainStyledAttributes.getBoolean(C15607g.f44326B, true);
            long j2 = integer4;
            boolean z6 = obtainStyledAttributes.getBoolean(C15607g.f44336L, false);
            int integer5 = obtainStyledAttributes.getInteger(C15607g.f44343S, 0);
            int integer6 = obtainStyledAttributes.getInteger(C15607g.f44342R, 0);
            int integer7 = obtainStyledAttributes.getInteger(C15607g.f44381p, 0);
            int integer8 = obtainStyledAttributes.getInteger(C15607g.f44379o, 0);
            int integer9 = obtainStyledAttributes.getInteger(C15607g.f44377n, 0);
            int integer10 = obtainStyledAttributes.getInteger(C15607g.f44383q, 2);
            int integer11 = obtainStyledAttributes.getInteger(C15607g.f44375m, 1);
            boolean z7 = obtainStyledAttributes.getBoolean(C15607g.f44363g, false);
            C10398d dVar2 = new C10398d(obtainStyledAttributes);
            int i2 = integer2;
            C18302d dVar3 = new C18302d(obtainStyledAttributes);
            C18704d dVar4 = new C18704d(obtainStyledAttributes);
            C17929c cVar = new C17929c(obtainStyledAttributes);
            obtainStyledAttributes.recycle();
            this.f32678o = new C11262h();
            this.f32676m = new Handler(Looper.getMainLooper());
            this.f32687x = new C18304f(this.f32678o);
            this.f32688y = new C18308h(this.f32678o);
            this.f32689z = new C18306g(this.f32678o);
            this.f32661A = new C18506f(context2);
            this.f32666F = new C19012c(context2);
            this.f32662B = new C18703c(context2);
            addView(this.f32661A);
            addView(this.f32662B);
            addView(this.f32666F);
            m41273w();
            setPlaySounds(z);
            setUseDeviceOrientation(z2);
            setGrid(dVar.mo43140f());
            setGridColor(color);
            setDrawHardwareOverlays(z7);
            setFacing(dVar.mo43138d());
            setFlash(dVar.mo43139e());
            setMode(dVar.mo43142h());
            setWhiteBalance(dVar.mo43146l());
            setHdr(dVar.mo43141g());
            setAudio(dVar.mo43135a());
            setAudioBitRate(integer3);
            setAudioCodec(dVar.mo43136b());
            setPictureSize(dVar2.mo27067a());
            setPictureMetering(z5);
            setPictureSnapshotMetering(z6);
            setPictureFormat(dVar.mo43143i());
            setVideoSize(dVar2.mo27068b());
            setVideoCodec(dVar.mo43145k());
            setVideoMaxSize(j);
            setVideoMaxDuration(i);
            setVideoBitRate(i2);
            setAutoFocusResetDelay(j2);
            setPreviewFrameRateExact(z4);
            setPreviewFrameRate(f2);
            setSnapshotMaxWidth(integer5);
            setSnapshotMaxHeight(integer6);
            setFrameProcessingMaxWidth(integer7);
            setFrameProcessingMaxHeight(integer8);
            setFrameProcessingFormat(integer9);
            setFrameProcessingPoolSize(integer10);
            setFrameProcessingExecutors(integer11);
            mo29318D(C18298a.TAP, dVar3.mo46049e());
            mo29318D(C18298a.LONG_TAP, dVar3.mo46047c());
            mo29318D(C18298a.PINCH, dVar3.mo46048d());
            mo29318D(C18298a.SCROLL_HORIZONTAL, dVar3.mo46046b());
            mo29318D(C18298a.SCROLL_VERTICAL, dVar3.mo46050f());
            dVar4.mo46513a();
            setAutoFocusMarker((C18701a) null);
            setFilter(cVar.mo45604a());
            this.f32680q = new C18509h(context2, this.f32678o);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public C10241a mo29316A(C15755l lVar, Context context, ViewGroup viewGroup) {
        int i = C11261g.f32699a[lVar.ordinal()];
        if (i == 1) {
            return new C10256f(context, viewGroup);
        }
        if (i == 2 && isHardwareAccelerated()) {
            return new C10258g(context, viewGroup);
        }
        this.f32671h = C15755l.GL_SURFACE;
        return new C10246c(context, viewGroup);
    }

    /* renamed from: C */
    public boolean mo29317C() {
        C17757b Z = this.f32681r.mo43508Z();
        C17757b bVar = C17757b.ENGINE;
        if (!Z.mo45341a(bVar) || !this.f32681r.mo43509a0().mo45341a(bVar)) {
            return false;
        }
        return true;
    }

    /* renamed from: D */
    public boolean mo29318D(C18298a aVar, C18299b bVar) {
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        C18299b bVar2 = C18299b.NONE;
        if (aVar.mo46034a(bVar)) {
            this.f32670g.put(aVar, bVar);
            int i2 = C11261g.f32700b[aVar.ordinal()];
            if (i2 == 1) {
                C18304f fVar = this.f32687x;
                if (this.f32670g.get(C18298a.PINCH) != bVar2) {
                    z = true;
                } else {
                    z = false;
                }
                fVar.mo46044i(z);
            } else if (i2 == 2 || i2 == 3) {
                C18308h hVar = this.f32688y;
                if (this.f32670g.get(C18298a.TAP) == bVar2 && this.f32670g.get(C18298a.LONG_TAP) == bVar2) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                hVar.mo46044i(z2);
            } else if (i2 == 4 || i2 == 5) {
                C18306g gVar = this.f32689z;
                if (this.f32670g.get(C18298a.SCROLL_HORIZONTAL) == bVar2 && this.f32670g.get(C18298a.SCROLL_VERTICAL) == bVar2) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                gVar.mo46044i(z3);
            }
            this.f32675l = 0;
            for (C18299b bVar3 : this.f32670g.values()) {
                int i3 = this.f32675l;
                if (bVar3 == C18299b.NONE) {
                    i = 0;
                } else {
                    i = 1;
                }
                this.f32675l = i3 + i;
            }
            return true;
        }
        mo29318D(aVar, bVar2);
        return false;
    }

    /* renamed from: H */
    public void mo29319H(C15599a aVar) {
        this.f32684u.remove(aVar);
    }

    /* renamed from: I */
    public void mo29320I(C18112d dVar) {
        if (dVar != null) {
            this.f32685v.remove(dVar);
            if (this.f32685v.size() == 0) {
                this.f32681r.mo43331H0(false);
            }
        }
    }

    /* renamed from: K */
    public void mo29321K() {
        this.f32681r.mo43485n1();
        this.f32676m.post(new C11259e());
    }

    /* renamed from: L */
    public void mo29322L() {
        this.f32681r.mo43486o1(new C11278a.C11279a());
    }

    /* renamed from: M */
    public void mo29323M() {
        this.f32681r.mo43487p1(new C11278a.C11279a());
    }

    /* renamed from: N */
    public void mo29324N(File file, int i) {
        m41259P(file, (FileDescriptor) null, i);
    }

    /* renamed from: Q */
    public void mo29325Q(File file) {
        this.f32681r.mo43489r1(new C11280b.C11281a(), file);
        this.f32676m.post(new C11256b());
    }

    /* renamed from: R */
    public void mo29326R(File file, int i) {
        mo29377p(new C11258d(getVideoMaxDuration()));
        setVideoMaxDuration(i);
        mo29325Q(file);
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.f32665E || !this.f32666F.mo47169f(layoutParams)) {
            super.addView(view, i, layoutParams);
        } else {
            this.f32666F.addView(view, layoutParams);
        }
    }

    @C1646z(C1593j.C1594a.ON_PAUSE)
    public void close() {
        if (!this.f32665E) {
            this.f32680q.mo46303g();
            this.f32681r.mo43511j1(false);
            C10241a aVar = this.f32679p;
            if (aVar != null) {
                aVar.mo26816s();
            }
        }
    }

    @C1646z(C1593j.C1594a.ON_DESTROY)
    public void destroy() {
        if (!this.f32665E) {
            mo29425t();
            mo29426u();
            this.f32681r.mo43514u(true);
            C10241a aVar = this.f32679p;
            if (aVar != null) {
                aVar.mo26814q();
            }
        }
    }

    public C15744a getAudio() {
        return this.f32681r.mo43492x();
    }

    public int getAudioBitRate() {
        return this.f32681r.mo43494y();
    }

    public C15745b getAudioCodec() {
        return this.f32681r.mo43496z();
    }

    public long getAutoFocusResetDelay() {
        return this.f32681r.mo43423A();
    }

    public C15603c getCameraOptions() {
        return this.f32681r.mo43426C();
    }

    public boolean getDrawHardwareOverlays() {
        return this.f32666F.getHardwareCanvasEnabled();
    }

    public C15748e getEngine() {
        return this.f32672i;
    }

    public float getExposureCorrection() {
        return this.f32681r.mo43428D();
    }

    public C15749f getFacing() {
        return this.f32681r.mo43430E();
    }

    public C17928b getFilter() {
        C10241a aVar = this.f32679p;
        if (aVar == null) {
            return this.f32673j;
        }
        if (aVar instanceof C10245b) {
            return ((C10245b) aVar).mo26828d();
        }
        throw new RuntimeException("Filters are only supported by the GL_SURFACE preview. Current:" + this.f32671h);
    }

    public C15750g getFlash() {
        return this.f32681r.mo43433F();
    }

    public int getFrameProcessingExecutors() {
        return this.f32674k;
    }

    public int getFrameProcessingFormat() {
        return this.f32681r.mo43436G();
    }

    public int getFrameProcessingMaxHeight() {
        return this.f32681r.mo43438H();
    }

    public int getFrameProcessingMaxWidth() {
        return this.f32681r.mo43440I();
    }

    public int getFrameProcessingPoolSize() {
        return this.f32681r.mo43441J();
    }

    public C15751h getGrid() {
        return this.f32661A.getGridMode();
    }

    public int getGridColor() {
        return this.f32661A.getGridColor();
    }

    public C15752i getHdr() {
        return this.f32681r.mo43442K();
    }

    public Location getLocation() {
        return this.f32681r.mo43445L();
    }

    public C15753j getMode() {
        return this.f32681r.mo43447M();
    }

    public C15754k getPictureFormat() {
        return this.f32681r.mo43451O();
    }

    public boolean getPictureMetering() {
        return this.f32681r.mo43453P();
    }

    public C10396b getPictureSize() {
        return this.f32681r.mo43456Q(C17489c.OUTPUT);
    }

    public boolean getPictureSnapshotMetering() {
        return this.f32681r.mo43459S();
    }

    public boolean getPlaySounds() {
        return this.f32667d;
    }

    public C15755l getPreview() {
        return this.f32671h;
    }

    public float getPreviewFrameRate() {
        return this.f32681r.mo43462U();
    }

    public boolean getPreviewFrameRateExact() {
        return this.f32681r.mo43465V();
    }

    public int getSnapshotMaxHeight() {
        return this.f32681r.mo43469X();
    }

    public int getSnapshotMaxWidth() {
        return this.f32681r.mo43471Y();
    }

    public C10396b getSnapshotSize() {
        C10396b bVar = null;
        if (!(getWidth() == 0 || getHeight() == 0)) {
            C16401d dVar = this.f32681r;
            C17489c cVar = C17489c.VIEW;
            C10396b b0 = dVar.mo43475b0(cVar);
            if (b0 == null) {
                return null;
            }
            Rect a = C18502b.m62989a(b0, C10395a.m37800f(getWidth(), getHeight()));
            bVar = new C10396b(a.width(), a.height());
            if (this.f32681r.mo43490w().mo45009b(cVar, C17489c.OUTPUT)) {
                return bVar.mo27059b();
            }
        }
        return bVar;
    }

    public boolean getUseDeviceOrientation() {
        return this.f32668e;
    }

    public int getVideoBitRate() {
        return this.f32681r.mo43477c0();
    }

    public C15756m getVideoCodec() {
        return this.f32681r.mo43478d0();
    }

    public int getVideoMaxDuration() {
        return this.f32681r.mo43479e0();
    }

    public long getVideoMaxSize() {
        return this.f32681r.mo43480f0();
    }

    public C10396b getVideoSize() {
        return this.f32681r.mo43481g0(C17489c.OUTPUT);
    }

    public C15757n getWhiteBalance() {
        return this.f32681r.mo43483i0();
    }

    public float getZoom() {
        return this.f32681r.mo43484j0();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.f32665E && this.f32679p == null) {
            mo29427x();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        this.f32682s = null;
        super.onDetachedFromWindow();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f32675l > 0;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        boolean z;
        boolean z2;
        if (this.f32665E) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824));
            return;
        }
        C10396b W = this.f32681r.mo43467W(C17489c.VIEW);
        this.f32682s = W;
        if (W == null) {
            f32660G.mo42880h("onMeasure:", "surface is not ready. Calling default behavior.");
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        float e = (float) this.f32682s.mo27062e();
        float c = (float) this.f32682s.mo27060c();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (!this.f32679p.mo26821x()) {
            if (mode == 1073741824) {
                mode = Integer.MIN_VALUE;
            }
            if (mode2 == 1073741824) {
                mode2 = Integer.MIN_VALUE;
            }
        } else {
            if (mode == Integer.MIN_VALUE && layoutParams.width == -1) {
                mode = 1073741824;
            }
            if (mode2 == Integer.MIN_VALUE && layoutParams.height == -1) {
                mode2 = 1073741824;
            }
        }
        C15600b bVar = f32660G;
        bVar.mo42878c("onMeasure:", "requested dimensions are (" + size + "[" + m41254E(mode) + "]x" + size2 + "[" + m41254E(mode2) + "])");
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        sb.append(e);
        sb.append("x");
        sb.append(c);
        sb.append(")");
        bVar.mo42878c("onMeasure:", "previewSize is", sb.toString());
        if (mode == 1073741824 && mode2 == 1073741824) {
            bVar.mo42878c("onMeasure:", "both are MATCH_PARENT or fixed value. We adapt.", "This means CROP_CENTER.", "(" + size + "x" + size2 + ")");
            super.onMeasure(i, i2);
        } else if (mode == 0 && mode2 == 0) {
            bVar.mo42878c("onMeasure:", "both are completely free.", "We respect that and extend to the whole preview size.", "(" + e + "x" + c + ")");
            super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) e, 1073741824), View.MeasureSpec.makeMeasureSpec((int) c, 1073741824));
        } else {
            float f = c / e;
            if (mode == 0 || mode2 == 0) {
                if (mode == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    size = Math.round(((float) size2) / f);
                } else {
                    size2 = Math.round(((float) size) * f);
                }
                bVar.mo42878c("onMeasure:", "one dimension was free, we adapted it to fit the ratio.", "(" + size + "x" + size2 + ")");
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            } else if (mode == 1073741824 || mode2 == 1073741824) {
                if (mode == Integer.MIN_VALUE) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    size = Math.min(Math.round(((float) size2) / f), size);
                } else {
                    size2 = Math.min(Math.round(((float) size) * f), size2);
                }
                bVar.mo42878c("onMeasure:", "one dimension was EXACTLY, another AT_MOST.", "We have TRIED to fit the aspect ratio, but it's not guaranteed.", "(" + size + "x" + size2 + ")");
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            } else {
                float f2 = (float) size2;
                float f3 = (float) size;
                if (f2 / f3 >= f) {
                    size2 = Math.round(f3 * f);
                } else {
                    size = Math.round(f2 / f);
                }
                bVar.mo42878c("onMeasure:", "both dimension were AT_MOST.", "We fit the preview aspect ratio.", "(" + size + "x" + size2 + ")");
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!mo29317C()) {
            return true;
        }
        C15603c C = this.f32681r.mo43426C();
        if (C != null) {
            if (this.f32687x.mo46043h(motionEvent)) {
                f32660G.mo42878c("onTouchEvent", "pinch!");
                m41255F(this.f32687x, C);
            } else if (this.f32689z.mo46043h(motionEvent)) {
                f32660G.mo42878c("onTouchEvent", "scroll!");
                m41255F(this.f32689z, C);
            } else if (this.f32688y.mo46043h(motionEvent)) {
                f32660G.mo42878c("onTouchEvent", "tap!");
                m41255F(this.f32688y, C);
            }
            return true;
        }
        throw new IllegalStateException("Options should not be null here.");
    }

    @C1646z(C1593j.C1594a.ON_RESUME)
    public void open() {
        if (!this.f32665E) {
            C10241a aVar = this.f32679p;
            if (aVar != null) {
                aVar.mo26817t();
            }
            if (mo29379r(getAudio())) {
                this.f32680q.mo46304h();
                this.f32681r.mo43490w().mo45012h(this.f32680q.mo46305j());
                this.f32681r.mo43510e1();
            }
        }
    }

    /* renamed from: p */
    public void mo29377p(C15599a aVar) {
        this.f32684u.add(aVar);
    }

    /* renamed from: q */
    public void mo29378q(C18112d dVar) {
        if (dVar != null) {
            this.f32685v.add(dVar);
            if (this.f32685v.size() == 1) {
                this.f32681r.mo43331H0(true);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public boolean mo29379r(C15744a aVar) {
        boolean z;
        boolean z2;
        boolean z3;
        m41271s(aVar);
        Context context = getContext();
        if (aVar == C15744a.ON || aVar == C15744a.MONO || aVar == C15744a.STEREO) {
            z = true;
        } else {
            z = false;
        }
        if (context.checkSelfPermission("android.permission.CAMERA") != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z || context.checkSelfPermission("android.permission.RECORD_AUDIO") == 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (!z2 && !z3) {
            return true;
        }
        if (this.f32669f) {
            m41257J(z2, z3);
        }
        return false;
    }

    public void removeView(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (this.f32665E || layoutParams == null || !this.f32666F.mo47169f(layoutParams)) {
            super.removeView(view);
        } else {
            this.f32666F.removeView(view);
        }
    }

    public void set(C15746c cVar) {
        if (cVar instanceof C15744a) {
            setAudio((C15744a) cVar);
        } else if (cVar instanceof C15749f) {
            setFacing((C15749f) cVar);
        } else if (cVar instanceof C15750g) {
            setFlash((C15750g) cVar);
        } else if (cVar instanceof C15751h) {
            setGrid((C15751h) cVar);
        } else if (cVar instanceof C15752i) {
            setHdr((C15752i) cVar);
        } else if (cVar instanceof C15753j) {
            setMode((C15753j) cVar);
        } else if (cVar instanceof C15757n) {
            setWhiteBalance((C15757n) cVar);
        } else if (cVar instanceof C15756m) {
            setVideoCodec((C15756m) cVar);
        } else if (cVar instanceof C15745b) {
            setAudioCodec((C15745b) cVar);
        } else if (cVar instanceof C15755l) {
            setPreview((C15755l) cVar);
        } else if (cVar instanceof C15748e) {
            setEngine((C15748e) cVar);
        } else if (cVar instanceof C15754k) {
            setPictureFormat((C15754k) cVar);
        }
    }

    public void setAudio(C15744a aVar) {
        if (aVar == getAudio() || m41253B()) {
            this.f32681r.mo43491w0(aVar);
        } else if (mo29379r(aVar)) {
            this.f32681r.mo43491w0(aVar);
        } else {
            close();
        }
    }

    public void setAudioBitRate(int i) {
        this.f32681r.mo43493x0(i);
    }

    public void setAudioCodec(C15745b bVar) {
        this.f32681r.mo43495y0(bVar);
    }

    public void setAutoFocusMarker(C18701a aVar) {
        this.f32662B.mo46512b(1, aVar);
    }

    public void setAutoFocusResetDelay(long j) {
        this.f32681r.mo43497z0(j);
    }

    public void setDrawHardwareOverlays(boolean z) {
        this.f32666F.setHardwareCanvasEnabled(z);
    }

    public void setEngine(C15748e eVar) {
        if (m41253B()) {
            this.f32672i = eVar;
            C16401d dVar = this.f32681r;
            m41273w();
            C10241a aVar = this.f32679p;
            if (aVar != null) {
                this.f32681r.mo43458R0(aVar);
            }
            setFacing(dVar.mo43430E());
            setFlash(dVar.mo43433F());
            setMode(dVar.mo43447M());
            setWhiteBalance(dVar.mo43483i0());
            setHdr(dVar.mo43442K());
            setAudio(dVar.mo43492x());
            setAudioBitRate(dVar.mo43494y());
            setAudioCodec(dVar.mo43496z());
            setPictureSize(dVar.mo43457R());
            setPictureFormat(dVar.mo43451O());
            setVideoSize(dVar.mo43482h0());
            setVideoCodec(dVar.mo43478d0());
            setVideoMaxSize(dVar.mo43480f0());
            setVideoMaxDuration(dVar.mo43479e0());
            setVideoBitRate(dVar.mo43477c0());
            setAutoFocusResetDelay(dVar.mo43423A());
            setPreviewFrameRate(dVar.mo43462U());
            setPreviewFrameRateExact(dVar.mo43465V());
            setSnapshotMaxWidth(dVar.mo43471Y());
            setSnapshotMaxHeight(dVar.mo43469X());
            setFrameProcessingMaxWidth(dVar.mo43440I());
            setFrameProcessingMaxHeight(dVar.mo43438H());
            setFrameProcessingFormat(0);
            setFrameProcessingPoolSize(dVar.mo43441J());
            this.f32681r.mo43331H0(!this.f32685v.isEmpty());
        }
    }

    public void setExperimental(boolean z) {
        this.f32664D = z;
    }

    public void setExposureCorrection(float f) {
        C15603c cameraOptions = getCameraOptions();
        if (cameraOptions != null) {
            float b = cameraOptions.mo42883b();
            float a = cameraOptions.mo42882a();
            if (f < b) {
                f = b;
            }
            if (f > a) {
                f = a;
            }
            this.f32681r.mo43327A0(f, new float[]{b, a}, (PointF[]) null, false);
        }
    }

    public void setFacing(C15749f fVar) {
        this.f32681r.mo43424B0(fVar);
    }

    public void setFilter(C17928b bVar) {
        C10241a aVar = this.f32679p;
        if (aVar == null) {
            this.f32673j = bVar;
            return;
        }
        boolean z = aVar instanceof C10245b;
        if (!(bVar instanceof C17930d) && !z) {
            throw new RuntimeException("Filters are only supported by the GL_SURFACE preview. Current preview:" + this.f32671h);
        } else if (z) {
            ((C10245b) aVar).mo26827a(bVar);
        }
    }

    public void setFlash(C15750g gVar) {
        this.f32681r.mo43328C0(gVar);
    }

    public void setFrameProcessingExecutors(int i) {
        if (i >= 1) {
            this.f32674k = i;
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 4, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C11260f());
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            this.f32677n = threadPoolExecutor;
            return;
        }
        throw new IllegalArgumentException("Need at least 1 executor, got " + i);
    }

    public void setFrameProcessingFormat(int i) {
        this.f32681r.mo43329D0(i);
    }

    public void setFrameProcessingMaxHeight(int i) {
        this.f32681r.mo43431E0(i);
    }

    public void setFrameProcessingMaxWidth(int i) {
        this.f32681r.mo43434F0(i);
    }

    public void setFrameProcessingPoolSize(int i) {
        this.f32681r.mo43437G0(i);
    }

    public void setGrid(C15751h hVar) {
        this.f32661A.setGridMode(hVar);
    }

    public void setGridColor(int i) {
        this.f32661A.setGridColor(i);
    }

    public void setHdr(C15752i iVar) {
        this.f32681r.mo43332I0(iVar);
    }

    public void setLifecycleOwner(C1619q qVar) {
        if (qVar == null) {
            m41272v();
            return;
        }
        m41272v();
        C1593j lifecycle = qVar.getLifecycle();
        this.f32686w = lifecycle;
        lifecycle.mo4906a(this);
    }

    public void setLocation(Location location) {
        this.f32681r.mo43334J0(location);
    }

    public void setMode(C15753j jVar) {
        this.f32681r.mo43443K0(jVar);
    }

    public void setPictureFormat(C15754k kVar) {
        this.f32681r.mo43336M0(kVar);
    }

    public void setPictureMetering(boolean z) {
        this.f32681r.mo43449N0(z);
    }

    public void setPictureSize(C10397c cVar) {
        this.f32681r.mo43452O0(cVar);
    }

    public void setPictureSnapshotMetering(boolean z) {
        this.f32681r.mo43454P0(z);
    }

    public void setPlaySounds(boolean z) {
        boolean z2;
        if (z) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f32667d = z2;
        this.f32681r.mo43338Q0(z);
    }

    public void setPreview(C15755l lVar) {
        boolean z;
        C10241a aVar;
        boolean z2 = true;
        if (lVar != this.f32671h) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f32671h = lVar;
            if (getWindowToken() == null) {
                z2 = false;
            }
            if (!z2 && (aVar = this.f32679p) != null) {
                aVar.mo26814q();
                this.f32679p = null;
            }
        }
    }

    public void setPreviewFrameRate(float f) {
        this.f32681r.mo43341S0(f);
    }

    public void setPreviewFrameRateExact(boolean z) {
        this.f32681r.mo43461T0(z);
    }

    public void setPreviewStreamSize(C10397c cVar) {
        this.f32681r.mo43463U0(cVar);
    }

    public void setRequestPermissions(boolean z) {
        this.f32669f = z;
    }

    public void setSnapshotMaxHeight(int i) {
        this.f32681r.mo43466V0(i);
    }

    public void setSnapshotMaxWidth(int i) {
        this.f32681r.mo43468W0(i);
    }

    public void setUseDeviceOrientation(boolean z) {
        this.f32668e = z;
    }

    public void setVideoBitRate(int i) {
        this.f32681r.mo43470X0(i);
    }

    public void setVideoCodec(C15756m mVar) {
        this.f32681r.mo43472Y0(mVar);
    }

    public void setVideoMaxDuration(int i) {
        this.f32681r.mo43473Z0(i);
    }

    public void setVideoMaxSize(long j) {
        this.f32681r.mo43474a1(j);
    }

    public void setVideoSize(C10397c cVar) {
        this.f32681r.mo43476b1(cVar);
    }

    public void setWhiteBalance(C15757n nVar) {
        this.f32681r.mo43345c1(nVar);
    }

    public void setZoom(float f) {
        if (f < Utils.FLOAT_EPSILON) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        this.f32681r.mo43346d1(f, (PointF[]) null, false);
    }

    /* renamed from: t */
    public void mo29425t() {
        this.f32684u.clear();
    }

    /* renamed from: u */
    public void mo29426u() {
        boolean z;
        if (this.f32685v.size() > 0) {
            z = true;
        } else {
            z = false;
        }
        this.f32685v.clear();
        if (z) {
            this.f32681r.mo43331H0(false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo29427x() {
        C15600b bVar = f32660G;
        bVar.mo42880h("doInstantiateEngine:", "instantiating. preview:", this.f32671h);
        C10241a A = mo29316A(this.f32671h, getContext(), this);
        this.f32679p = A;
        bVar.mo42880h("doInstantiateEngine:", "instantiated. preview:", A.getClass().getSimpleName());
        this.f32681r.mo43458R0(this.f32679p);
        C17928b bVar2 = this.f32673j;
        if (bVar2 != null) {
            setFilter(bVar2);
            this.f32673j = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public C16401d mo29428z(C15748e eVar, C16401d.C16413l lVar) {
        if (this.f32664D && eVar == C15748e.CAMERA2) {
            return new C16365b(lVar);
        }
        this.f32672i = C15748e.CAMERA1;
        return new C16350a(lVar);
    }

    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        if (this.f32665E || !this.f32666F.mo47168e(attributeSet)) {
            return super.generateLayoutParams(attributeSet);
        }
        return this.f32666F.generateLayoutParams(attributeSet);
    }
}
