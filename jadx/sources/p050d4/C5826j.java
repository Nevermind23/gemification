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

/* renamed from: d4.j */
public abstract class C5826j extends C5815a {

    /* renamed from: i */
    private static boolean f18323i;

    /* renamed from: j */
    private static int f18324j = C2391h.glide_custom_view_target_tag;

    /* renamed from: d */
    protected final View f18325d;

    /* renamed from: e */
    private final C5827a f18326e;

    /* renamed from: f */
    private View.OnAttachStateChangeListener f18327f;

    /* renamed from: g */
    private boolean f18328g;

    /* renamed from: h */
    private boolean f18329h;

    /* renamed from: d4.j$a */
    static final class C5827a {

        /* renamed from: e */
        static Integer f18330e;

        /* renamed from: a */
        private final View f18331a;

        /* renamed from: b */
        private final List f18332b = new ArrayList();

        /* renamed from: c */
        boolean f18333c;

        /* renamed from: d */
        private C5828a f18334d;

        /* renamed from: d4.j$a$a */
        private static final class C5828a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: d */
            private final WeakReference f18335d;

            C5828a(C5827a aVar) {
                this.f18335d = new WeakReference(aVar);
            }

            public boolean onPreDraw() {
                if (Log.isLoggable("ViewTarget", 2)) {
                    Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                C5827a aVar = (C5827a) this.f18335d.get();
                if (aVar == null) {
                    return true;
                }
                aVar.mo19051a();
                return true;
            }
        }

        C5827a(View view) {
            this.f18331a = view;
        }

        /* renamed from: c */
        private static int m23485c(Context context) {
            if (f18330e == null) {
                Display defaultDisplay = ((WindowManager) C6223k.m24730d((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f18330e = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f18330e.intValue();
        }

        /* renamed from: e */
        private int m23486e(int i, int i2, int i3) {
            int i4 = i2 - i3;
            if (i4 > 0) {
                return i4;
            }
            if (this.f18333c && this.f18331a.isLayoutRequested()) {
                return 0;
            }
            int i5 = i - i3;
            if (i5 > 0) {
                return i5;
            }
            if (this.f18331a.isLayoutRequested() || i2 != -2) {
                return 0;
            }
            if (Log.isLoggable("ViewTarget", 4)) {
                Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            return m23485c(this.f18331a.getContext());
        }

        /* renamed from: f */
        private int m23487f() {
            int i;
            int paddingTop = this.f18331a.getPaddingTop() + this.f18331a.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.f18331a.getLayoutParams();
            if (layoutParams != null) {
                i = layoutParams.height;
            } else {
                i = 0;
            }
            return m23486e(this.f18331a.getHeight(), i, paddingTop);
        }

        /* renamed from: g */
        private int m23488g() {
            int i;
            int paddingLeft = this.f18331a.getPaddingLeft() + this.f18331a.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.f18331a.getLayoutParams();
            if (layoutParams != null) {
                i = layoutParams.width;
            } else {
                i = 0;
            }
            return m23486e(this.f18331a.getWidth(), i, paddingLeft);
        }

        /* renamed from: h */
        private boolean m23489h(int i) {
            return i > 0 || i == Integer.MIN_VALUE;
        }

        /* renamed from: i */
        private boolean m23490i(int i, int i2) {
            return m23489h(i) && m23489h(i2);
        }

        /* renamed from: j */
        private void m23491j(int i, int i2) {
            Iterator it = new ArrayList(this.f18332b).iterator();
            while (it.hasNext()) {
                ((C5824h) it.next()).mo7299e(i, i2);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo19051a() {
            if (!this.f18332b.isEmpty()) {
                int g = m23488g();
                int f = m23487f();
                if (m23490i(g, f)) {
                    m23491j(g, f);
                    mo19052b();
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo19052b() {
            ViewTreeObserver viewTreeObserver = this.f18331a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f18334d);
            }
            this.f18334d = null;
            this.f18332b.clear();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo19053d(C5824h hVar) {
            int g = m23488g();
            int f = m23487f();
            if (m23490i(g, f)) {
                hVar.mo7299e(g, f);
                return;
            }
            if (!this.f18332b.contains(hVar)) {
                this.f18332b.add(hVar);
            }
            if (this.f18334d == null) {
                ViewTreeObserver viewTreeObserver = this.f18331a.getViewTreeObserver();
                C5828a aVar = new C5828a(this);
                this.f18334d = aVar;
                viewTreeObserver.addOnPreDrawListener(aVar);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public void mo19054k(C5824h hVar) {
            this.f18332b.remove(hVar);
        }
    }

    public C5826j(View view) {
        this.f18325d = (View) C6223k.m24730d(view);
        this.f18326e = new C5827a(view);
    }

    /* renamed from: l */
    private Object m23475l() {
        return this.f18325d.getTag(f18324j);
    }

    /* renamed from: m */
    private void m23476m() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f18327f;
        if (onAttachStateChangeListener != null && !this.f18329h) {
            this.f18325d.addOnAttachStateChangeListener(onAttachStateChangeListener);
            this.f18329h = true;
        }
    }

    /* renamed from: n */
    private void m23477n() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f18327f;
        if (onAttachStateChangeListener != null && this.f18329h) {
            this.f18325d.removeOnAttachStateChangeListener(onAttachStateChangeListener);
            this.f18329h = false;
        }
    }

    /* renamed from: p */
    private void m23478p(Object obj) {
        f18323i = true;
        this.f18325d.setTag(f18324j, obj);
    }

    /* renamed from: a */
    public void mo7275a(C5824h hVar) {
        this.f18326e.mo19053d(hVar);
    }

    /* renamed from: d */
    public void mo7278d(C5824h hVar) {
        this.f18326e.mo19054k(hVar);
    }

    /* renamed from: g */
    public void mo7280g(Drawable drawable) {
        super.mo7280g(drawable);
        m23476m();
    }

    /* renamed from: h */
    public C2250d mo7283h() {
        Object l = m23475l();
        if (l == null) {
            return null;
        }
        if (l instanceof C2250d) {
            return (C2250d) l;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    /* renamed from: i */
    public void mo7284i(Drawable drawable) {
        super.mo7284i(drawable);
        this.f18326e.mo19052b();
        if (!this.f18328g) {
            m23477n();
        }
    }

    /* renamed from: j */
    public void mo7287j(C2250d dVar) {
        m23478p(dVar);
    }

    public String toString() {
        return "Target for: " + this.f18325d;
    }
}
