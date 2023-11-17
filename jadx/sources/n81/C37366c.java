package n81;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
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
import g91.C32335t0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import p012ab.C0097a;
import p012ab.C0098b;
import p012ab.C0099c;
import p042cb.C2288a;
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
import p341ge.bog.mobilebank.p975ui.views.widgets.BogInputLayout;
import p342j$.util.concurrent.ConcurrentHashMap;
import p366bk.C10322k;
import p366bk.C10329r;

/* renamed from: n81.c */
public abstract class C37366c implements C2288a {

    /* renamed from: r */
    private static final int[] f89851r = {10, 20, 50, 100, BogInputLayout.INPUT_NORMAL_STATE, 500, 1000};
    /* access modifiers changed from: private */

    /* renamed from: s */
    public static final TimeInterpolator f89852s = new DecelerateInterpolator();
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C7465c f89853a;

    /* renamed from: b */
    private final C6492b f89854b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C0099c f89855c;

    /* renamed from: d */
    private final float f89856d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f89857e;

    /* renamed from: f */
    private Context f89858f;

    /* renamed from: g */
    private ShapeDrawable f89859g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public Set f89860h = Collections.newSetFromMap(new ConcurrentHashMap());

    /* renamed from: i */
    private SparseArray f89861i = new SparseArray();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C37373g f89862j = new C37373g();

    /* renamed from: k */
    private int f89863k = 4;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public Set f89864l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public Map f89865m = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: n */
    public Map f89866n = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: o */
    public float f89867o;

    /* renamed from: p */
    private final C37377k f89868p = new C37377k();
    /* access modifiers changed from: private */

    /* renamed from: q */
    public C0099c.C0105f f89869q;

    /* renamed from: n81.c$a */
    class C37367a implements C7465c.C7472g {
        C37367a() {
        }

        /* renamed from: b */
        public boolean mo172b(C7899d dVar) {
            return C37366c.this.f89869q != null && C37366c.this.f89869q.mo188r0((C0098b) C37366c.this.f89862j.mo90458a(dVar));
        }
    }

    /* renamed from: n81.c$b */
    class C37368b implements C7465c.C7470e {
        C37368b() {
        }

        /* renamed from: h */
        public void mo177h(C7899d dVar) {
            C0099c.C0106g unused = C37366c.this.getClass();
        }
    }

    /* renamed from: n81.c$c */
    class C37369c implements C7465c.C7472g {
        C37369c() {
        }

        /* renamed from: b */
        public boolean mo172b(C7899d dVar) {
            C0099c.C0102c unused = C37366c.this.getClass();
            return false;
        }
    }

    /* renamed from: n81.c$d */
    class C37370d implements C7465c.C7470e {
        C37370d() {
        }

        /* renamed from: h */
        public void mo177h(C7899d dVar) {
            C0099c.C0103d unused = C37366c.this.getClass();
        }
    }

    /* renamed from: n81.c$e */
    private class C37371e extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        private final C37375i f89874d;

        /* renamed from: e */
        private final C7899d f89875e;

        /* renamed from: f */
        private final LatLng f89876f;

        /* renamed from: g */
        private final LatLng f89877g;

        /* renamed from: h */
        private boolean f89878h;

        /* renamed from: i */
        private C5861b f89879i;

        /* renamed from: a */
        public void mo90454a() {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{Utils.FLOAT_EPSILON, 1.0f});
            ofFloat.setInterpolator(C37366c.f89852s);
            ofFloat.addUpdateListener(this);
            ofFloat.addListener(this);
            ofFloat.start();
        }

        /* renamed from: b */
        public void mo90455b(C5861b bVar) {
            this.f89879i = bVar;
            this.f89878h = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (this.f89878h) {
                C37366c.this.f89866n.remove((C0097a) C37366c.this.f89865m.get(this.f89875e));
                C37366c.this.f89862j.mo90461d(this.f89875e);
                C37366c.this.f89865m.remove(this.f89875e);
                this.f89879i.mo19071i(this.f89875e);
            }
            this.f89874d.f89897b = this.f89877g;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float animatedFraction = valueAnimator.getAnimatedFraction();
            LatLng latLng = this.f89877g;
            double d = latLng.f14073d;
            LatLng latLng2 = this.f89876f;
            double d2 = latLng2.f14073d;
            double d3 = (double) animatedFraction;
            double d4 = ((d - d2) * d3) + d2;
            double d5 = latLng.f14074e - latLng2.f14074e;
            if (Math.abs(d5) > 180.0d) {
                d5 -= Math.signum(d5) * 360.0d;
            }
            this.f89875e.mo22879g(new LatLng(d4, (d5 * d3) + this.f89876f.f14074e));
        }

        private C37371e(C37375i iVar, LatLng latLng, LatLng latLng2) {
            this.f89874d = iVar;
            this.f89875e = iVar.f89896a;
            this.f89876f = latLng;
            this.f89877g = latLng2;
        }
    }

    /* renamed from: n81.c$f */
    private class C37372f {

        /* renamed from: a */
        private final C0097a f89881a;

        /* renamed from: b */
        private final Set f89882b;

        /* renamed from: c */
        private final LatLng f89883c;

        public C37372f(C0097a aVar, Set set, LatLng latLng) {
            this.f89881a = aVar;
            this.f89882b = set;
            this.f89883c = latLng;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public void m110171b(C37374h hVar) {
            C37375i iVar;
            C37375i iVar2;
            if (!C37366c.this.mo90453L(this.f89881a)) {
                for (C0098b bVar : this.f89881a.mo166n3()) {
                    C7899d b = C37366c.this.f89862j.mo90459b(bVar);
                    if (b == null) {
                        MarkerOptions markerOptions = new MarkerOptions();
                        LatLng latLng = this.f89883c;
                        if (latLng != null) {
                            markerOptions.mo14143L1(latLng);
                        } else {
                            markerOptions.mo14143L1(bVar.getPosition());
                        }
                        C37366c.this.mo90449H(bVar, markerOptions);
                        b = C37366c.this.f89855c.mo178i().mo19085i(markerOptions);
                        iVar2 = new C37375i(b);
                        C37366c.this.f89862j.mo90460c(bVar, b);
                        LatLng latLng2 = this.f89883c;
                        if (latLng2 != null) {
                            hVar.mo90463b(iVar2, latLng2, bVar.getPosition());
                        }
                    } else {
                        iVar2 = new C37375i(b);
                    }
                    C37366c.this.mo90451J(bVar, b);
                    this.f89882b.add(iVar2);
                }
                return;
            }
            C7899d dVar = (C7899d) C37366c.this.f89866n.get(this.f89881a);
            if (dVar == null) {
                MarkerOptions markerOptions2 = new MarkerOptions();
                LatLng latLng3 = this.f89883c;
                if (latLng3 == null) {
                    latLng3 = this.f89881a.getPosition();
                }
                MarkerOptions L1 = markerOptions2.mo14143L1(latLng3);
                C37366c.this.mo90450I(this.f89881a, L1);
                dVar = C37366c.this.f89855c.mo176g().mo19085i(L1);
                C37366c.this.f89865m.put(dVar, this.f89881a);
                C37366c.this.f89866n.put(this.f89881a, dVar);
                iVar = new C37375i(dVar);
                LatLng latLng4 = this.f89883c;
                if (latLng4 != null) {
                    hVar.mo90463b(iVar, latLng4, this.f89881a.getPosition());
                }
            } else {
                iVar = new C37375i(dVar);
            }
            C37366c.this.mo90452K(this.f89881a, dVar);
            this.f89882b.add(iVar);
        }
    }

    /* renamed from: n81.c$g */
    private static class C37373g {

        /* renamed from: a */
        private Map f89885a;

        /* renamed from: b */
        private Map f89886b;

        /* renamed from: a */
        public Object mo90458a(C7899d dVar) {
            return this.f89886b.get(dVar);
        }

        /* renamed from: b */
        public C7899d mo90459b(Object obj) {
            return (C7899d) this.f89885a.get(obj);
        }

        /* renamed from: c */
        public void mo90460c(Object obj, C7899d dVar) {
            this.f89885a.put(obj, dVar);
            this.f89886b.put(dVar, obj);
        }

        /* renamed from: d */
        public void mo90461d(C7899d dVar) {
            Object obj = this.f89886b.get(dVar);
            this.f89886b.remove(dVar);
            this.f89885a.remove(obj);
        }

        private C37373g() {
            this.f89885a = new HashMap();
            this.f89886b = new HashMap();
        }
    }

    /* renamed from: n81.c$h */
    private class C37374h extends Handler implements MessageQueue.IdleHandler {

        /* renamed from: d */
        private final Lock f89887d;

        /* renamed from: e */
        private final Condition f89888e;

        /* renamed from: f */
        private Queue f89889f;

        /* renamed from: g */
        private Queue f89890g;

        /* renamed from: h */
        private Queue f89891h;

        /* renamed from: i */
        private Queue f89892i;

        /* renamed from: j */
        private Queue f89893j;

        /* renamed from: k */
        private boolean f89894k;

        /* renamed from: e */
        private void m110176e() {
            if (!this.f89892i.isEmpty()) {
                m110177g((C7899d) this.f89892i.poll());
            } else if (!this.f89893j.isEmpty()) {
                ((C37371e) this.f89893j.poll()).mo90454a();
            } else if (!this.f89890g.isEmpty()) {
                ((C37372f) this.f89890g.poll()).m110171b(this);
            } else if (!this.f89889f.isEmpty()) {
                ((C37372f) this.f89889f.poll()).m110171b(this);
            } else if (!this.f89891h.isEmpty()) {
                m110177g((C7899d) this.f89891h.poll());
            }
        }

        /* renamed from: g */
        private void m110177g(C7899d dVar) {
            C37366c.this.f89866n.remove((C0097a) C37366c.this.f89865m.get(dVar));
            C37366c.this.f89862j.mo90461d(dVar);
            C37366c.this.f89865m.remove(dVar);
            C37366c.this.f89855c.mo179j().mo19071i(dVar);
        }

        /* renamed from: a */
        public void mo90462a(boolean z, C37372f fVar) {
            this.f89887d.lock();
            sendEmptyMessage(0);
            if (z) {
                this.f89890g.add(fVar);
            } else {
                this.f89889f.add(fVar);
            }
            this.f89887d.unlock();
        }

        /* renamed from: b */
        public void mo90463b(C37375i iVar, LatLng latLng, LatLng latLng2) {
            this.f89887d.lock();
            this.f89893j.add(new C37371e(iVar, latLng, latLng2));
            this.f89887d.unlock();
        }

        /* renamed from: c */
        public void mo90464c(C37375i iVar, LatLng latLng, LatLng latLng2) {
            this.f89887d.lock();
            C37371e eVar = new C37371e(iVar, latLng, latLng2);
            eVar.mo90455b(C37366c.this.f89855c.mo179j());
            this.f89893j.add(eVar);
            this.f89887d.unlock();
        }

        /* renamed from: d */
        public boolean mo90465d() {
            boolean z;
            try {
                this.f89887d.lock();
                if (!this.f89889f.isEmpty() || !this.f89890g.isEmpty() || !this.f89892i.isEmpty() || !this.f89891h.isEmpty() || !this.f89893j.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                return z;
            } finally {
                this.f89887d.unlock();
            }
        }

        /* renamed from: f */
        public void mo90466f(boolean z, C7899d dVar) {
            this.f89887d.lock();
            sendEmptyMessage(0);
            if (z) {
                this.f89892i.add(dVar);
            } else {
                this.f89891h.add(dVar);
            }
            this.f89887d.unlock();
        }

        /* renamed from: h */
        public void mo90467h() {
            while (mo90465d()) {
                sendEmptyMessage(0);
                this.f89887d.lock();
                try {
                    if (mo90465d()) {
                        this.f89888e.await();
                    }
                    this.f89887d.unlock();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                } catch (Throwable th) {
                    this.f89887d.unlock();
                    throw th;
                }
            }
        }

        public void handleMessage(Message message) {
            if (!this.f89894k) {
                Looper.myQueue().addIdleHandler(this);
                this.f89894k = true;
            }
            removeMessages(0);
            this.f89887d.lock();
            int i = 0;
            while (i < 10) {
                try {
                    m110176e();
                    i++;
                } catch (Throwable th) {
                    this.f89887d.unlock();
                    throw th;
                }
            }
            if (!mo90465d()) {
                this.f89894k = false;
                Looper.myQueue().removeIdleHandler(this);
                this.f89888e.signalAll();
            } else {
                sendEmptyMessageDelayed(0, 10);
            }
            this.f89887d.unlock();
        }

        public boolean queueIdle() {
            sendEmptyMessage(0);
            return true;
        }

        private C37374h() {
            super(Looper.getMainLooper());
            ReentrantLock reentrantLock = new ReentrantLock();
            this.f89887d = reentrantLock;
            this.f89888e = reentrantLock.newCondition();
            this.f89889f = new LinkedList();
            this.f89890g = new LinkedList();
            this.f89891h = new LinkedList();
            this.f89892i = new LinkedList();
            this.f89893j = new LinkedList();
        }
    }

    /* renamed from: n81.c$i */
    private static class C37375i {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final C7899d f89896a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public LatLng f89897b;

        public boolean equals(Object obj) {
            if (obj instanceof C37375i) {
                return this.f89896a.equals(((C37375i) obj).f89896a);
            }
            return false;
        }

        public int hashCode() {
            return this.f89896a.hashCode();
        }

        private C37375i(C7899d dVar) {
            this.f89896a = dVar;
            this.f89897b = dVar.mo22872a();
        }
    }

    /* renamed from: n81.c$j */
    private class C37376j implements Runnable {

        /* renamed from: d */
        final Set f89898d;

        /* renamed from: e */
        private Runnable f89899e;

        /* renamed from: f */
        private C7478g f89900f;

        /* renamed from: g */
        private C6196b f89901g;

        /* renamed from: h */
        private float f89902h;

        /* renamed from: a */
        public void mo90472a(Runnable runnable) {
            this.f89899e = runnable;
        }

        /* renamed from: b */
        public void mo90473b(float f) {
            this.f89902h = f;
            this.f89901g = new C6196b(Math.pow(2.0d, (double) Math.min(f, C37366c.this.f89867o)) * 256.0d);
        }

        /* renamed from: c */
        public void mo90474c(C7478g gVar) {
            this.f89900f = gVar;
        }

        public void run() {
            boolean z;
            ArrayList arrayList;
            if (this.f89898d.equals(C37366c.this.f89864l)) {
                this.f89899e.run();
                return;
            }
            C37374h hVar = new C37374h();
            float f = this.f89902h;
            if (f > C37366c.this.f89867o) {
                z = true;
            } else {
                z = false;
            }
            float v = f - C37366c.this.f89867o;
            Set<C37375i> u = C37366c.this.f89860h;
            LatLngBounds latLngBounds = this.f89900f.mo21896a().f14166h;
            if (C37366c.this.f89864l != null) {
                arrayList = new ArrayList();
                for (C0097a aVar : C37366c.this.f89864l) {
                    if (C37366c.this.mo90453L(aVar) && latLngBounds.mo14132w(aVar.getPosition())) {
                        arrayList.add(this.f89901g.mo19783b(aVar.getPosition()));
                    }
                }
            } else {
                arrayList = null;
            }
            Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
            for (C0097a aVar2 : this.f89898d) {
                boolean w = latLngBounds.mo14132w(aVar2.getPosition());
                if (!z || !w) {
                    hVar.mo90462a(w, new C37372f(aVar2, newSetFromMap, (LatLng) null));
                } else {
                    C6126b A = C37366c.m110128C(arrayList, this.f89901g.mo19783b(aVar2.getPosition()));
                    if (A == null || !C37366c.this.f89857e) {
                        hVar.mo90462a(true, new C37372f(aVar2, newSetFromMap, (LatLng) null));
                    } else {
                        hVar.mo90462a(true, new C37372f(aVar2, newSetFromMap, this.f89901g.mo19782a(A)));
                    }
                }
            }
            hVar.mo90467h();
            u.removeAll(newSetFromMap);
            ArrayList arrayList2 = new ArrayList();
            for (C0097a aVar3 : this.f89898d) {
                if (C37366c.this.mo90453L(aVar3) && latLngBounds.mo14132w(aVar3.getPosition())) {
                    arrayList2.add(this.f89901g.mo19783b(aVar3.getPosition()));
                }
            }
            for (C37375i iVar : u) {
                boolean w2 = latLngBounds.mo14132w(iVar.f89897b);
                if (z || v <= -3.0f || !w2) {
                    hVar.mo90466f(w2, iVar.f89896a);
                } else {
                    C6126b A2 = C37366c.m110128C(arrayList2, this.f89901g.mo19783b(iVar.f89897b));
                    if (A2 == null || !C37366c.this.f89857e) {
                        hVar.mo90466f(true, iVar.f89896a);
                    } else {
                        hVar.mo90464c(iVar, iVar.f89897b, this.f89901g.mo19782a(A2));
                    }
                }
            }
            hVar.mo90467h();
            C37366c.this.f89860h = newSetFromMap;
            C37366c.this.f89864l = this.f89898d;
            C37366c.this.f89867o = f;
            this.f89899e.run();
        }

        private C37376j(Set set) {
            this.f89898d = set;
        }
    }

    /* renamed from: n81.c$k */
    private class C37377k extends Handler {

        /* renamed from: a */
        private boolean f89904a;

        /* renamed from: b */
        private C37376j f89905b;

        /* renamed from: n81.c$k$a */
        class C37378a implements Runnable {
            C37378a() {
            }

            public void run() {
                C37377k.this.sendEmptyMessage(1);
            }
        }

        /* renamed from: a */
        public void mo90476a(Set set) {
            synchronized (this) {
                this.f89905b = new C37376j(set);
            }
            sendEmptyMessage(0);
        }

        public void handleMessage(Message message) {
            C37376j jVar;
            if (message.what == 1) {
                this.f89904a = false;
                if (this.f89905b != null) {
                    sendEmptyMessage(0);
                    return;
                }
                return;
            }
            removeMessages(0);
            if (!this.f89904a && this.f89905b != null) {
                C7478g g = C37366c.this.f89853a.mo21878g();
                synchronized (this) {
                    jVar = this.f89905b;
                    this.f89905b = null;
                    this.f89904a = true;
                }
                jVar.mo90472a(new C37378a());
                jVar.mo90474c(g);
                jVar.mo90473b(C37366c.this.f89853a.mo21876e().f14037e);
                new Thread(jVar).start();
            }
        }

        private C37377k() {
            this.f89904a = false;
            this.f89905b = null;
        }
    }

    public C37366c(Context context, C7465c cVar, C0099c cVar2) {
        this.f89853a = cVar;
        this.f89857e = true;
        this.f89858f = context;
        this.f89856d = context.getResources().getDisplayMetrics().density;
        C6492b bVar = new C6492b(context);
        this.f89854b = bVar;
        bVar.mo20407g(m110130G(context));
        bVar.mo20409i(C10329r.f28971H);
        bVar.mo20405e(m110129F());
        this.f89855c = cVar2;
    }

    /* renamed from: B */
    private static double m110127B(C6126b bVar, C6126b bVar2) {
        double d = bVar.f19065a;
        double d2 = bVar2.f19065a;
        double d3 = (d - d2) * (d - d2);
        double d4 = bVar.f19066b;
        double d5 = bVar2.f19066b;
        return d3 + ((d4 - d5) * (d4 - d5));
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public static C6126b m110128C(List list, C6126b bVar) {
        C6126b bVar2 = null;
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            double d = 10000.0d;
            while (it.hasNext()) {
                C6126b bVar3 = (C6126b) it.next();
                double B = m110127B(bVar3, bVar);
                if (B < d) {
                    bVar2 = bVar3;
                    d = B;
                }
            }
        }
        return bVar2;
    }

    /* renamed from: F */
    private LayerDrawable m110129F() {
        this.f89859g = new ShapeDrawable(new OvalShape());
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(-2130706433);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable, this.f89859g});
        int i = (int) (this.f89856d * 3.0f);
        layerDrawable.setLayerInset(1, i, i, i, i);
        return layerDrawable;
    }

    /* renamed from: G */
    private C6493c m110130G(Context context) {
        C6493c cVar = new C6493c(context);
        cVar.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        cVar.setId(C10322k.f28890s1);
        int i = (int) (this.f89856d * 12.0f);
        cVar.setPadding(i, i, i, i);
        return cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public int mo90447D(C0097a aVar) {
        int a = aVar.mo164a();
        int i = 0;
        if (a <= f89851r[0]) {
            return a;
        }
        while (true) {
            int[] iArr = f89851r;
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
    /* renamed from: E */
    public String mo90448E(int i) {
        if (i < f89851r[0]) {
            return String.valueOf(i);
        }
        return String.valueOf(i) + "+";
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public void mo90449H(C0098b bVar, MarkerOptions markerOptions) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public void mo90450I(C0097a aVar, MarkerOptions markerOptions) {
        int D = mo90447D(aVar);
        C7896a aVar2 = (C7896a) this.f89861i.get(D);
        if (aVar2 == null) {
            this.f89859g.getPaint().setColor(C32335t0.m95366k(this.f89858f));
            aVar2 = C7897b.m29875a(this.f89854b.mo20404d(mo90448E(D)));
            this.f89861i.put(D, aVar2);
        }
        markerOptions.mo14139H1(aVar2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public void mo90451J(C0098b bVar, C7899d dVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public void mo90452K(C0097a aVar, C7899d dVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public boolean mo90453L(C0097a aVar) {
        return aVar.mo164a() > this.f89863k;
    }

    /* renamed from: a */
    public void mo7327a(C0099c.C0102c cVar) {
    }

    /* renamed from: b */
    public void mo7328b(C0099c.C0104e eVar) {
    }

    /* renamed from: c */
    public void mo7329c() {
        this.f89855c.mo178i().mo19088l(new C37367a());
        this.f89855c.mo178i().mo19086j(new C37368b());
        this.f89855c.mo176g().mo19088l(new C37369c());
        this.f89855c.mo176g().mo19086j(new C37370d());
    }

    /* renamed from: d */
    public void mo7330d(C0099c.C0103d dVar) {
    }

    /* renamed from: e */
    public void mo7331e(C0099c.C0106g gVar) {
    }

    /* renamed from: f */
    public void mo7332f() {
        this.f89855c.mo178i().mo19088l((C7465c.C7472g) null);
        this.f89855c.mo178i().mo19086j((C7465c.C7470e) null);
        this.f89855c.mo176g().mo19088l((C7465c.C7472g) null);
        this.f89855c.mo176g().mo19086j((C7465c.C7470e) null);
    }

    /* renamed from: g */
    public void mo7333g(C0099c.C0105f fVar) {
        this.f89869q = fVar;
    }

    /* renamed from: h */
    public void mo7334h(C0099c.C0107h hVar) {
    }

    /* renamed from: i */
    public void mo7335i(Set set) {
        this.f89868p.mo90476a(set);
    }
}
