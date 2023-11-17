package p050d4;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.bumptech.glide.C2391h;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p035c4.C2250d;
import p089g4.C6223k;

/* renamed from: d4.d */
public abstract class C5818d implements C5825i {

    /* renamed from: i */
    private static final int f18310i = C2391h.glide_custom_view_target_tag;

    /* renamed from: d */
    private final C5819a f18311d;

    /* renamed from: e */
    protected final View f18312e;

    /* renamed from: f */
    private View.OnAttachStateChangeListener f18313f;

    /* renamed from: g */
    private boolean f18314g;

    /* renamed from: h */
    private boolean f18315h;

    /* renamed from: d4.d$a */
    static final class C5819a {

        /* renamed from: e */
        static Integer f18316e;

        /* renamed from: a */
        private final View f18317a;

        /* renamed from: b */
        private final List f18318b = new ArrayList();

        /* renamed from: c */
        boolean f18319c;

        /* renamed from: d */
        private C5820a f18320d;

        /* renamed from: d4.d$a$a */
        private static final class C5820a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: d */
            private final WeakReference f18321d;

            C5820a(C5819a aVar) {
                this.f18321d = new WeakReference(aVar);
            }

            public boolean onPreDraw() {
                if (Log.isLoggable("CustomViewTarget", 2)) {
                    Log.v("CustomViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                C5819a aVar = (C5819a) this.f18321d.get();
                if (aVar == null) {
                    return true;
                }
                aVar.mo19041a();
                return true;
            }
        }

        C5819a(View view) {
            this.f18317a = view;
        }

        /* renamed from: c */
        private static int m23441c(Context context) {
            if (f18316e == null) {
                Display defaultDisplay = ((WindowManager) C6223k.m24730d((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f18316e = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f18316e.intValue();
        }

        /* renamed from: e */
        private int m23442e(int i, int i2, int i3) {
            int i4 = i2 - i3;
            if (i4 > 0) {
                return i4;
            }
            if (this.f18319c && this.f18317a.isLayoutRequested()) {
                return 0;
            }
            int i5 = i - i3;
            if (i5 > 0) {
                return i5;
            }
            if (this.f18317a.isLayoutRequested() || i2 != -2) {
                return 0;
            }
            if (Log.isLoggable("CustomViewTarget", 4)) {
                Log.i("CustomViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use .override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            return m23441c(this.f18317a.getContext());
        }

        /* renamed from: f */
        private int m23443f() {
            int i;
            int paddingTop = this.f18317a.getPaddingTop() + this.f18317a.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.f18317a.getLayoutParams();
            if (layoutParams != null) {
                i = layoutParams.height;
            } else {
                i = 0;
            }
            return m23442e(this.f18317a.getHeight(), i, paddingTop);
        }

        /* renamed from: g */
        private int m23444g() {
            int i;
            int paddingLeft = this.f18317a.getPaddingLeft() + this.f18317a.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.f18317a.getLayoutParams();
            if (layoutParams != null) {
                i = layoutParams.width;
            } else {
                i = 0;
            }
            return m23442e(this.f18317a.getWidth(), i, paddingLeft);
        }

        /* renamed from: h */
        private boolean m23445h(int i) {
            return i > 0 || i == Integer.MIN_VALUE;
        }

        /* renamed from: i */
        private boolean m23446i(int i, int i2) {
            return m23445h(i) && m23445h(i2);
        }

        /* renamed from: j */
        private void m23447j(int i, int i2) {
            Iterator it = new ArrayList(this.f18318b).iterator();
            while (it.hasNext()) {
                ((C5824h) it.next()).mo7299e(i, i2);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo19041a() {
            if (!this.f18318b.isEmpty()) {
                int g = m23444g();
                int f = m23443f();
                if (m23446i(g, f)) {
                    m23447j(g, f);
                    mo19042b();
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo19042b() {
            ViewTreeObserver viewTreeObserver = this.f18317a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f18320d);
            }
            this.f18320d = null;
            this.f18318b.clear();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo19043d(C5824h hVar) {
            int g = m23444g();
            int f = m23443f();
            if (m23446i(g, f)) {
                hVar.mo7299e(g, f);
                return;
            }
            if (!this.f18318b.contains(hVar)) {
                this.f18318b.add(hVar);
            }
            if (this.f18320d == null) {
                ViewTreeObserver viewTreeObserver = this.f18317a.getViewTreeObserver();
                C5820a aVar = new C5820a(this);
                this.f18320d = aVar;
                viewTreeObserver.addOnPreDrawListener(aVar);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public void mo19044k(C5824h hVar) {
            this.f18318b.remove(hVar);
        }
    }

    public C5818d(View view) {
        this.f18312e = (View) C6223k.m24730d(view);
        this.f18311d = new C5819a(view);
    }

    /* renamed from: c */
    private Object m23427c() {
        return this.f18312e.getTag(f18310i);
    }

    /* renamed from: e */
    private void m23428e() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f18313f;
        if (onAttachStateChangeListener != null && !this.f18315h) {
            this.f18312e.addOnAttachStateChangeListener(onAttachStateChangeListener);
            this.f18315h = true;
        }
    }

    /* renamed from: l */
    private void m23429l() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f18313f;
        if (onAttachStateChangeListener != null && this.f18315h) {
            this.f18312e.removeOnAttachStateChangeListener(onAttachStateChangeListener);
            this.f18315h = false;
        }
    }

    /* renamed from: p */
    private void m23430p(Object obj) {
        this.f18312e.setTag(f18310i, obj);
    }

    /* renamed from: a */
    public final void mo7275a(C5824h hVar) {
        this.f18311d.mo19043d(hVar);
    }

    /* renamed from: d */
    public final void mo7278d(C5824h hVar) {
        this.f18311d.mo19044k(hVar);
    }

    /* renamed from: f */
    public void mo7279f() {
    }

    /* renamed from: g */
    public final void mo7280g(Drawable drawable) {
        m23428e();
        mo19039n(drawable);
    }

    /* renamed from: h */
    public final C2250d mo7283h() {
        Object c = m23427c();
        if (c == null) {
            return null;
        }
        if (c instanceof C2250d) {
            return (C2250d) c;
        }
        throw new IllegalArgumentException("You must not pass non-R.id ids to setTag(id)");
    }

    /* renamed from: i */
    public final void mo7284i(Drawable drawable) {
        this.f18311d.mo19042b();
        mo7760m(drawable);
        if (!this.f18314g) {
            m23429l();
        }
    }

    /* renamed from: j */
    public final void mo7287j(C2250d dVar) {
        m23430p(dVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public abstract void mo7760m(Drawable drawable);

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo19039n(Drawable drawable) {
    }

    /* renamed from: o */
    public void mo7289o() {
    }

    public void onDestroy() {
    }

    public String toString() {
        return "Target for: " + this.f18312e;
    }
}
