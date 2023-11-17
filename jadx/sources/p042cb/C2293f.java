package p042cb;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.util.SparseArray;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MarkerOptions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import p012ab.C0097a;
import p012ab.C0098b;
import p012ab.C0099c;
import p057db.C5861b;
import p070eb.C6126b;
import p083fb.C6196b;
import p109hb.C6492b;
import p109hb.C6493c;
import p196o7.C7465c;
import p196o7.C7478g;
import p222q7.C7896a;
import p222q7.C7897b;
import p222q7.C7899d;
import p340za.C9275c;
import p340za.C9277e;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogInputLayout;
import p342j$.util.concurrent.ConcurrentHashMap;

/* renamed from: cb.f */
public class C2293f implements C2288a {

    /* renamed from: r */
    private static final int[] f7094r = {10, 20, 50, 100, BogInputLayout.INPUT_NORMAL_STATE, 500, 1000};
    /* access modifiers changed from: private */

    /* renamed from: s */
    public static final TimeInterpolator f7095s = new DecelerateInterpolator();
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C7465c f7096a;

    /* renamed from: b */
    private final C6492b f7097b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C0099c f7098c;

    /* renamed from: d */
    private final float f7099d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f7100e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public long f7101f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final Executor f7102g = Executors.newSingleThreadExecutor();

    /* renamed from: h */
    private ShapeDrawable f7103h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public Set f7104i = Collections.newSetFromMap(new ConcurrentHashMap());

    /* renamed from: j */
    private SparseArray f7105j = new SparseArray();
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C2298e f7106k = new C2298e((C2294a) null);

    /* renamed from: l */
    private int f7107l = 4;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public Set f7108m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public C2298e f7109n = new C2298e((C2294a) null);
    /* access modifiers changed from: private */

    /* renamed from: o */
    public float f7110o;

    /* renamed from: p */
    private final C2302i f7111p = new C2302i(this, (C2294a) null);
    /* access modifiers changed from: private */

    /* renamed from: q */
    public C0099c.C0105f f7112q;

    /* renamed from: cb.f$a */
    class C2294a implements C7465c.C7472g {
        C2294a() {
        }

        /* renamed from: b */
        public boolean mo172b(C7899d dVar) {
            return C2293f.this.f7112q != null && C2293f.this.f7112q.mo188r0((C0098b) C2293f.this.f7106k.mo7354a(dVar));
        }
    }

    /* renamed from: cb.f$b */
    class C2295b implements C7465c.C7470e {
        C2295b() {
        }

        /* renamed from: h */
        public void mo177h(C7899d dVar) {
            C0099c.C0106g unused = C2293f.this.getClass();
        }
    }

    /* renamed from: cb.f$c */
    private class C2296c extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        private final C2300g f7115d;

        /* renamed from: e */
        private final C7899d f7116e;

        /* renamed from: f */
        private final LatLng f7117f;

        /* renamed from: g */
        private final LatLng f7118g;

        /* renamed from: h */
        private boolean f7119h;

        /* renamed from: i */
        private C5861b f7120i;

        /* synthetic */ C2296c(C2293f fVar, C2300g gVar, LatLng latLng, LatLng latLng2, C2294a aVar) {
            this(gVar, latLng, latLng2);
        }

        /* renamed from: a */
        public void mo7350a() {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{Utils.FLOAT_EPSILON, 1.0f});
            ofFloat.setInterpolator(C2293f.f7095s);
            ofFloat.setDuration(C2293f.this.f7101f);
            ofFloat.addUpdateListener(this);
            ofFloat.addListener(this);
            ofFloat.start();
        }

        /* renamed from: b */
        public void mo7351b(C5861b bVar) {
            this.f7120i = bVar;
            this.f7119h = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (this.f7119h) {
                C2293f.this.f7106k.mo7357d(this.f7116e);
                C2293f.this.f7109n.mo7357d(this.f7116e);
                this.f7120i.mo19071i(this.f7116e);
            }
            LatLng unused = this.f7115d.f7138b = this.f7118g;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float animatedFraction = valueAnimator.getAnimatedFraction();
            LatLng latLng = this.f7118g;
            double d = latLng.f14073d;
            LatLng latLng2 = this.f7117f;
            double d2 = latLng2.f14073d;
            double d3 = (double) animatedFraction;
            double d4 = ((d - d2) * d3) + d2;
            double d5 = latLng.f14074e - latLng2.f14074e;
            if (Math.abs(d5) > 180.0d) {
                d5 -= Math.signum(d5) * 360.0d;
            }
            this.f7116e.mo22879g(new LatLng(d4, (d5 * d3) + this.f7117f.f14074e));
        }

        private C2296c(C2300g gVar, LatLng latLng, LatLng latLng2) {
            this.f7115d = gVar;
            this.f7116e = gVar.f7137a;
            this.f7117f = latLng;
            this.f7118g = latLng2;
        }
    }

    /* renamed from: cb.f$d */
    private class C2297d {

        /* renamed from: a */
        private final C0097a f7122a;

        /* renamed from: b */
        private final Set f7123b;

        /* renamed from: c */
        private final LatLng f7124c;

        public C2297d(C0097a aVar, Set set, LatLng latLng) {
            this.f7122a = aVar;
            this.f7123b = set;
            this.f7124c = latLng;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public void m8827b(C2299f fVar) {
            C2300g gVar;
            C2300g gVar2;
            if (!C2293f.this.mo7349a0(this.f7122a)) {
                for (C0098b bVar : this.f7122a.mo166n3()) {
                    C7899d b = C2293f.this.f7106k.mo7355b(bVar);
                    if (b == null) {
                        MarkerOptions markerOptions = new MarkerOptions();
                        LatLng latLng = this.f7124c;
                        if (latLng != null) {
                            markerOptions.mo14143L1(latLng);
                        } else {
                            markerOptions.mo14143L1(bVar.getPosition());
                            if (bVar.mo167a() != null) {
                                markerOptions.mo14146O1(bVar.mo167a().floatValue());
                            }
                        }
                        C2293f.this.mo7342T(bVar, markerOptions);
                        b = C2293f.this.f7098c.mo178i().mo19085i(markerOptions);
                        gVar2 = new C2300g(b, (C2294a) null);
                        C2293f.this.f7106k.mo7356c(bVar, b);
                        LatLng latLng2 = this.f7124c;
                        if (latLng2 != null) {
                            fVar.mo7359b(gVar2, latLng2, bVar.getPosition());
                        }
                    } else {
                        gVar2 = new C2300g(b, (C2294a) null);
                        C2293f.this.mo7345W(bVar, b);
                    }
                    C2293f.this.mo7344V(bVar, b);
                    this.f7123b.add(gVar2);
                }
                return;
            }
            C7899d b2 = C2293f.this.f7109n.mo7355b(this.f7122a);
            if (b2 == null) {
                MarkerOptions markerOptions2 = new MarkerOptions();
                LatLng latLng3 = this.f7124c;
                if (latLng3 == null) {
                    latLng3 = this.f7122a.getPosition();
                }
                MarkerOptions L1 = markerOptions2.mo14143L1(latLng3);
                C2293f.this.mo7343U(this.f7122a, L1);
                b2 = C2293f.this.f7098c.mo176g().mo19085i(L1);
                C2293f.this.f7109n.mo7356c(this.f7122a, b2);
                gVar = new C2300g(b2, (C2294a) null);
                LatLng latLng4 = this.f7124c;
                if (latLng4 != null) {
                    fVar.mo7359b(gVar, latLng4, this.f7122a.getPosition());
                }
            } else {
                gVar = new C2300g(b2, (C2294a) null);
                C2293f.this.mo7347Y(this.f7122a, b2);
            }
            C2293f.this.mo7346X(this.f7122a, b2);
            this.f7123b.add(gVar);
        }
    }

    /* renamed from: cb.f$f */
    private class C2299f extends Handler implements MessageQueue.IdleHandler {

        /* renamed from: d */
        private final Lock f7128d;

        /* renamed from: e */
        private final Condition f7129e;

        /* renamed from: f */
        private Queue f7130f;

        /* renamed from: g */
        private Queue f7131g;

        /* renamed from: h */
        private Queue f7132h;

        /* renamed from: i */
        private Queue f7133i;

        /* renamed from: j */
        private Queue f7134j;

        /* renamed from: k */
        private boolean f7135k;

        /* synthetic */ C2299f(C2293f fVar, C2294a aVar) {
            this();
        }

        /* renamed from: e */
        private void m8832e() {
            if (!this.f7133i.isEmpty()) {
                m8833g((C7899d) this.f7133i.poll());
            } else if (!this.f7134j.isEmpty()) {
                ((C2296c) this.f7134j.poll()).mo7350a();
            } else if (!this.f7131g.isEmpty()) {
                ((C2297d) this.f7131g.poll()).m8827b(this);
            } else if (!this.f7130f.isEmpty()) {
                ((C2297d) this.f7130f.poll()).m8827b(this);
            } else if (!this.f7132h.isEmpty()) {
                m8833g((C7899d) this.f7132h.poll());
            }
        }

        /* renamed from: g */
        private void m8833g(C7899d dVar) {
            C2293f.this.f7106k.mo7357d(dVar);
            C2293f.this.f7109n.mo7357d(dVar);
            C2293f.this.f7098c.mo179j().mo19071i(dVar);
        }

        /* renamed from: a */
        public void mo7358a(boolean z, C2297d dVar) {
            this.f7128d.lock();
            sendEmptyMessage(0);
            if (z) {
                this.f7131g.add(dVar);
            } else {
                this.f7130f.add(dVar);
            }
            this.f7128d.unlock();
        }

        /* renamed from: b */
        public void mo7359b(C2300g gVar, LatLng latLng, LatLng latLng2) {
            this.f7128d.lock();
            this.f7134j.add(new C2296c(C2293f.this, gVar, latLng, latLng2, (C2294a) null));
            this.f7128d.unlock();
        }

        /* renamed from: c */
        public void mo7360c(C2300g gVar, LatLng latLng, LatLng latLng2) {
            this.f7128d.lock();
            C2296c cVar = new C2296c(C2293f.this, gVar, latLng, latLng2, (C2294a) null);
            cVar.mo7351b(C2293f.this.f7098c.mo179j());
            this.f7134j.add(cVar);
            this.f7128d.unlock();
        }

        /* renamed from: d */
        public boolean mo7361d() {
            boolean z;
            try {
                this.f7128d.lock();
                if (!this.f7130f.isEmpty() || !this.f7131g.isEmpty() || !this.f7133i.isEmpty() || !this.f7132h.isEmpty() || !this.f7134j.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                return z;
            } finally {
                this.f7128d.unlock();
            }
        }

        /* renamed from: f */
        public void mo7362f(boolean z, C7899d dVar) {
            this.f7128d.lock();
            sendEmptyMessage(0);
            if (z) {
                this.f7133i.add(dVar);
            } else {
                this.f7132h.add(dVar);
            }
            this.f7128d.unlock();
        }

        /* renamed from: h */
        public void mo7363h() {
            while (mo7361d()) {
                sendEmptyMessage(0);
                this.f7128d.lock();
                try {
                    if (mo7361d()) {
                        this.f7129e.await();
                    }
                    this.f7128d.unlock();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                } catch (Throwable th) {
                    this.f7128d.unlock();
                    throw th;
                }
            }
        }

        public void handleMessage(Message message) {
            if (!this.f7135k) {
                Looper.myQueue().addIdleHandler(this);
                this.f7135k = true;
            }
            removeMessages(0);
            this.f7128d.lock();
            int i = 0;
            while (i < 10) {
                try {
                    m8832e();
                    i++;
                } catch (Throwable th) {
                    this.f7128d.unlock();
                    throw th;
                }
            }
            if (!mo7361d()) {
                this.f7135k = false;
                Looper.myQueue().removeIdleHandler(this);
                this.f7129e.signalAll();
            } else {
                sendEmptyMessageDelayed(0, 10);
            }
            this.f7128d.unlock();
        }

        public boolean queueIdle() {
            sendEmptyMessage(0);
            return true;
        }

        private C2299f() {
            super(Looper.getMainLooper());
            ReentrantLock reentrantLock = new ReentrantLock();
            this.f7128d = reentrantLock;
            this.f7129e = reentrantLock.newCondition();
            this.f7130f = new LinkedList();
            this.f7131g = new LinkedList();
            this.f7132h = new LinkedList();
            this.f7133i = new LinkedList();
            this.f7134j = new LinkedList();
        }
    }

    /* renamed from: cb.f$g */
    private static class C2300g {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final C7899d f7137a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public LatLng f7138b;

        /* synthetic */ C2300g(C7899d dVar, C2294a aVar) {
            this(dVar);
        }

        public boolean equals(Object obj) {
            if (obj instanceof C2300g) {
                return this.f7137a.equals(((C2300g) obj).f7137a);
            }
            return false;
        }

        public int hashCode() {
            return this.f7137a.hashCode();
        }

        private C2300g(C7899d dVar) {
            this.f7137a = dVar;
            this.f7138b = dVar.mo22872a();
        }
    }

    /* renamed from: cb.f$h */
    private class C2301h implements Runnable {

        /* renamed from: d */
        final Set f7139d;

        /* renamed from: e */
        private Runnable f7140e;

        /* renamed from: f */
        private C7478g f7141f;

        /* renamed from: g */
        private C6196b f7142g;

        /* renamed from: h */
        private float f7143h;

        /* synthetic */ C2301h(C2293f fVar, Set set, C2294a aVar) {
            this(set);
        }

        /* renamed from: a */
        public void mo7368a(Runnable runnable) {
            this.f7140e = runnable;
        }

        /* renamed from: b */
        public void mo7369b(float f) {
            this.f7143h = f;
            this.f7142g = new C6196b(Math.pow(2.0d, (double) Math.min(f, C2293f.this.f7110o)) * 256.0d);
        }

        /* renamed from: c */
        public void mo7370c(C7478g gVar) {
            this.f7141f = gVar;
        }

        public void run() {
            boolean z;
            LatLngBounds latLngBounds;
            ArrayList arrayList;
            C2293f fVar = C2293f.this;
            if (!fVar.mo7348Z(fVar.m8776M(fVar.f7108m), C2293f.this.m8776M(this.f7139d))) {
                this.f7140e.run();
                return;
            }
            ArrayList arrayList2 = null;
            C2299f fVar2 = new C2299f(C2293f.this, (C2294a) null);
            float f = this.f7143h;
            if (f > C2293f.this.f7110o) {
                z = true;
            } else {
                z = false;
            }
            float B = f - C2293f.this.f7110o;
            Set<C2300g> o = C2293f.this.f7104i;
            try {
                latLngBounds = this.f7141f.mo21896a().f14166h;
            } catch (Exception e) {
                e.printStackTrace();
                latLngBounds = LatLngBounds.m17475v().mo14135b(new LatLng(Utils.DOUBLE_EPSILON, Utils.DOUBLE_EPSILON)).mo14134a();
            }
            if (C2293f.this.f7108m == null || !C2293f.this.f7100e) {
                arrayList = null;
            } else {
                arrayList = new ArrayList();
                for (C0097a aVar : C2293f.this.f7108m) {
                    if (C2293f.this.mo7349a0(aVar) && latLngBounds.mo14132w(aVar.getPosition())) {
                        arrayList.add(this.f7142g.mo19783b(aVar.getPosition()));
                    }
                }
            }
            Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
            for (C0097a aVar2 : this.f7139d) {
                boolean w = latLngBounds.mo14132w(aVar2.getPosition());
                if (!z || !w || !C2293f.this.f7100e) {
                    fVar2.mo7358a(w, new C2297d(aVar2, newSetFromMap, (LatLng) null));
                } else {
                    C6126b r = C2293f.this.m8775G(arrayList, this.f7142g.mo19783b(aVar2.getPosition()));
                    if (r != null) {
                        fVar2.mo7358a(true, new C2297d(aVar2, newSetFromMap, this.f7142g.mo19782a(r)));
                    } else {
                        fVar2.mo7358a(true, new C2297d(aVar2, newSetFromMap, (LatLng) null));
                    }
                }
            }
            fVar2.mo7363h();
            o.removeAll(newSetFromMap);
            if (C2293f.this.f7100e) {
                arrayList2 = new ArrayList();
                for (C0097a aVar3 : this.f7139d) {
                    if (C2293f.this.mo7349a0(aVar3) && latLngBounds.mo14132w(aVar3.getPosition())) {
                        arrayList2.add(this.f7142g.mo19783b(aVar3.getPosition()));
                    }
                }
            }
            for (C2300g gVar : o) {
                boolean w2 = latLngBounds.mo14132w(gVar.f7138b);
                if (z || B <= -3.0f || !w2 || !C2293f.this.f7100e) {
                    fVar2.mo7362f(w2, gVar.f7137a);
                } else {
                    C6126b r2 = C2293f.this.m8775G(arrayList2, this.f7142g.mo19783b(gVar.f7138b));
                    if (r2 != null) {
                        fVar2.mo7360c(gVar, gVar.f7138b, this.f7142g.mo19782a(r2));
                    } else {
                        fVar2.mo7362f(true, gVar.f7137a);
                    }
                }
            }
            fVar2.mo7363h();
            Set unused = C2293f.this.f7104i = newSetFromMap;
            Set unused2 = C2293f.this.f7108m = this.f7139d;
            float unused3 = C2293f.this.f7110o = f;
            this.f7140e.run();
        }

        private C2301h(Set set) {
            this.f7139d = set;
        }
    }

    public C2293f(Context context, C7465c cVar, C0099c cVar2) {
        this.f7096a = cVar;
        this.f7100e = true;
        this.f7101f = 300;
        this.f7099d = context.getResources().getDisplayMetrics().density;
        C6492b bVar = new C6492b(context);
        this.f7097b = bVar;
        bVar.mo20407g(m8782S(context));
        bVar.mo20409i(C9277e.f25731c);
        bVar.mo20405e(m8781R());
        this.f7098c = cVar2;
    }

    /* renamed from: F */
    private static double m8774F(C6126b bVar, C6126b bVar2) {
        double d = bVar.f19065a;
        double d2 = bVar2.f19065a;
        double d3 = (d - d2) * (d - d2);
        double d4 = bVar.f19066b;
        double d5 = bVar2.f19066b;
        return d3 + ((d4 - d5) * (d4 - d5));
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public C6126b m8775G(List list, C6126b bVar) {
        C6126b bVar2 = null;
        if (list != null && !list.isEmpty()) {
            int f = this.f7098c.mo175f().mo7132f();
            double d = (double) (f * f);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C6126b bVar3 = (C6126b) it.next();
                double F = m8774F(bVar3, bVar);
                if (F < d) {
                    bVar2 = bVar3;
                    d = F;
                }
            }
        }
        return bVar2;
    }

    /* access modifiers changed from: private */
    /* renamed from: M */
    public Set m8776M(Set set) {
        return set != null ? Collections.unmodifiableSet(set) : Collections.emptySet();
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public /* synthetic */ void m8777N(C7899d dVar) {
    }

    /* access modifiers changed from: private */
    /* renamed from: O */
    public /* synthetic */ boolean m8778O(C7899d dVar) {
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: P */
    public /* synthetic */ void m8779P(C7899d dVar) {
    }

    /* access modifiers changed from: private */
    /* renamed from: Q */
    public /* synthetic */ void m8780Q(C7899d dVar) {
    }

    /* renamed from: R */
    private LayerDrawable m8781R() {
        this.f7103h = new ShapeDrawable(new OvalShape());
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(-2130706433);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable, this.f7103h});
        int i = (int) (this.f7099d * 3.0f);
        layerDrawable.setLayerInset(1, i, i, i, i);
        return layerDrawable;
    }

    /* renamed from: S */
    private C6493c m8782S(Context context) {
        C6493c cVar = new C6493c(context);
        cVar.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        cVar.setId(C9275c.f25730a);
        int i = (int) (this.f7099d * 12.0f);
        cVar.setPadding(i, i, i, i);
        return cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public int mo7337H(C0097a aVar) {
        int a = aVar.mo164a();
        int i = 0;
        if (a <= f7094r[0]) {
            return a;
        }
        while (true) {
            int[] iArr = f7094r;
            if (i >= iArr.length - 1) {
                return iArr[iArr.length - 1];
            }
            int i2 = i + 1;
            if (a < iArr[i2]) {
                return iArr[i];
            }
            i = i2;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public String mo7338I(int i) {
        if (i < f7094r[0]) {
            return String.valueOf(i);
        }
        return i + "+";
    }

    /* renamed from: J */
    public int mo7339J(int i) {
        return C9277e.f25731c;
    }

    /* renamed from: K */
    public int mo7340K(int i) {
        float min = 300.0f - Math.min((float) i, 300.0f);
        return Color.HSVToColor(new float[]{((min * min) / 90000.0f) * 220.0f, 1.0f, 0.6f});
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public C7896a mo7341L(C0097a aVar) {
        int H = mo7337H(aVar);
        C7896a aVar2 = (C7896a) this.f7105j.get(H);
        if (aVar2 != null) {
            return aVar2;
        }
        this.f7103h.getPaint().setColor(mo7340K(H));
        this.f7097b.mo20409i(mo7339J(H));
        C7896a a = C7897b.m29875a(this.f7097b.mo20404d(mo7338I(H)));
        this.f7105j.put(H, a);
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: T */
    public void mo7342T(C0098b bVar, MarkerOptions markerOptions) {
        if (bVar.getTitle() != null && bVar.mo168b() != null) {
            markerOptions.mo14145N1(bVar.getTitle());
            markerOptions.mo14144M1(bVar.mo168b());
        } else if (bVar.getTitle() != null) {
            markerOptions.mo14145N1(bVar.getTitle());
        } else if (bVar.mo168b() != null) {
            markerOptions.mo14145N1(bVar.mo168b());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: U */
    public void mo7343U(C0097a aVar, MarkerOptions markerOptions) {
        markerOptions.mo14139H1(mo7341L(aVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: V */
    public void mo7344V(C0098b bVar, C7899d dVar) {
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* renamed from: W */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo7345W(p012ab.C0098b r5, p222q7.C7899d r6) {
        /*
            r4 = this;
            java.lang.String r0 = r5.getTitle()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x003a
            java.lang.String r0 = r5.mo168b()
            if (r0 == 0) goto L_0x003a
            java.lang.String r0 = r5.getTitle()
            java.lang.String r3 = r6.mo22874c()
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x0024
            java.lang.String r0 = r5.getTitle()
            r6.mo22883j(r0)
            r2 = r1
        L_0x0024:
            java.lang.String r0 = r5.mo168b()
            java.lang.String r3 = r6.mo22873b()
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x0073
            java.lang.String r0 = r5.mo168b()
            r6.mo22882i(r0)
            goto L_0x0055
        L_0x003a:
            java.lang.String r0 = r5.mo168b()
            if (r0 == 0) goto L_0x0057
            java.lang.String r0 = r5.mo168b()
            java.lang.String r3 = r6.mo22874c()
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x0057
            java.lang.String r0 = r5.mo168b()
            r6.mo22883j(r0)
        L_0x0055:
            r2 = r1
            goto L_0x0073
        L_0x0057:
            java.lang.String r0 = r5.getTitle()
            if (r0 == 0) goto L_0x0073
            java.lang.String r0 = r5.getTitle()
            java.lang.String r3 = r6.mo22874c()
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x0073
            java.lang.String r0 = r5.getTitle()
            r6.mo22883j(r0)
            goto L_0x0055
        L_0x0073:
            com.google.android.gms.maps.model.LatLng r0 = r6.mo22872a()
            com.google.android.gms.maps.model.LatLng r3 = r5.getPosition()
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x009a
            com.google.android.gms.maps.model.LatLng r0 = r5.getPosition()
            r6.mo22879g(r0)
            java.lang.Float r0 = r5.mo167a()
            if (r0 == 0) goto L_0x009b
            java.lang.Float r5 = r5.mo167a()
            float r5 = r5.floatValue()
            r6.mo22884k(r5)
            goto L_0x009b
        L_0x009a:
            r1 = r2
        L_0x009b:
            if (r1 == 0) goto L_0x00a6
            boolean r5 = r6.mo22875d()
            if (r5 == 0) goto L_0x00a6
            r6.mo22885l()
        L_0x00a6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p042cb.C2293f.mo7345W(ab.b, q7.d):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: X */
    public void mo7346X(C0097a aVar, C7899d dVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: Y */
    public void mo7347Y(C0097a aVar, C7899d dVar) {
        dVar.mo22878f(mo7341L(aVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: Z */
    public boolean mo7348Z(Set set, Set set2) {
        return !set2.equals(set);
    }

    /* renamed from: a */
    public void mo7327a(C0099c.C0102c cVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a0 */
    public boolean mo7349a0(C0097a aVar) {
        return aVar.mo164a() >= this.f7107l;
    }

    /* renamed from: b */
    public void mo7328b(C0099c.C0104e eVar) {
    }

    /* renamed from: c */
    public void mo7329c() {
        this.f7098c.mo178i().mo19088l(new C2294a());
        this.f7098c.mo178i().mo19086j(new C2295b());
        this.f7098c.mo178i().mo19087k(new C2289b(this));
        this.f7098c.mo176g().mo19088l(new C2290c(this));
        this.f7098c.mo176g().mo19086j(new C2291d(this));
        this.f7098c.mo176g().mo19087k(new C2292e(this));
    }

    /* renamed from: d */
    public void mo7330d(C0099c.C0103d dVar) {
    }

    /* renamed from: e */
    public void mo7331e(C0099c.C0106g gVar) {
    }

    /* renamed from: f */
    public void mo7332f() {
        this.f7098c.mo178i().mo19088l((C7465c.C7472g) null);
        this.f7098c.mo178i().mo19086j((C7465c.C7470e) null);
        this.f7098c.mo178i().mo19087k((C7465c.C7471f) null);
        this.f7098c.mo176g().mo19088l((C7465c.C7472g) null);
        this.f7098c.mo176g().mo19086j((C7465c.C7470e) null);
        this.f7098c.mo176g().mo19087k((C7465c.C7471f) null);
    }

    /* renamed from: g */
    public void mo7333g(C0099c.C0105f fVar) {
        this.f7112q = fVar;
    }

    /* renamed from: h */
    public void mo7334h(C0099c.C0107h hVar) {
    }

    /* renamed from: i */
    public void mo7335i(Set set) {
        this.f7111p.mo7372c(set);
    }

    /* renamed from: cb.f$e */
    private static class C2298e {

        /* renamed from: a */
        private Map f7126a;

        /* renamed from: b */
        private Map f7127b;

        private C2298e() {
            this.f7126a = new HashMap();
            this.f7127b = new HashMap();
        }

        /* renamed from: a */
        public Object mo7354a(C7899d dVar) {
            return this.f7127b.get(dVar);
        }

        /* renamed from: b */
        public C7899d mo7355b(Object obj) {
            return (C7899d) this.f7126a.get(obj);
        }

        /* renamed from: c */
        public void mo7356c(Object obj, C7899d dVar) {
            this.f7126a.put(obj, dVar);
            this.f7127b.put(dVar, obj);
        }

        /* renamed from: d */
        public void mo7357d(C7899d dVar) {
            Object obj = this.f7127b.get(dVar);
            this.f7127b.remove(dVar);
            this.f7126a.remove(obj);
        }

        /* synthetic */ C2298e(C2294a aVar) {
            this();
        }
    }

    /* renamed from: cb.f$i */
    private class C2302i extends Handler {

        /* renamed from: a */
        private boolean f7145a;

        /* renamed from: b */
        private C2301h f7146b;

        private C2302i() {
            this.f7145a = false;
            this.f7146b = null;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m8847b() {
            sendEmptyMessage(1);
        }

        /* renamed from: c */
        public void mo7372c(Set set) {
            synchronized (this) {
                this.f7146b = new C2301h(C2293f.this, set, (C2294a) null);
            }
            sendEmptyMessage(0);
        }

        public void handleMessage(Message message) {
            C2301h hVar;
            if (message.what == 1) {
                this.f7145a = false;
                if (this.f7146b != null) {
                    sendEmptyMessage(0);
                    return;
                }
                return;
            }
            removeMessages(0);
            if (!this.f7145a && this.f7146b != null) {
                C7478g g = C2293f.this.f7096a.mo21878g();
                synchronized (this) {
                    hVar = this.f7146b;
                    this.f7146b = null;
                    this.f7145a = true;
                }
                hVar.mo7368a(new C2303g(this));
                hVar.mo7370c(g);
                hVar.mo7369b(C2293f.this.f7096a.mo21876e().f14037e);
                C2293f.this.f7102g.execute(hVar);
            }
        }

        /* synthetic */ C2302i(C2293f fVar, C2294a aVar) {
            this();
        }
    }
}
