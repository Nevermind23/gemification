package androidx.recyclerview.widget;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.p013v4.media.session.C0125b;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.core.p016os.C0934x;
import androidx.core.util.C1008h;
import androidx.core.view.C1055a;
import androidx.core.view.C1117b3;
import androidx.core.view.C1248u0;
import androidx.core.view.C1255v0;
import androidx.core.view.C1262w0;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.C1078b;
import androidx.core.widget.C1298e;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.widget.C1769a;
import androidx.recyclerview.widget.C1782f;
import androidx.recyclerview.widget.C1812k;
import androidx.recyclerview.widget.C1829t;
import androidx.recyclerview.widget.C1836x;
import androidx.recyclerview.widget.C1839y;
import com.github.mikephil.charting.utils.Utils;
import com.salesforce.marketingcloud.C11398b;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p254t0.C8304a;
import p254t0.C8305b;
import p254t0.C8306c;
import p329z.C9147a;

public class RecyclerView extends ViewGroup implements C1255v0 {

    /* renamed from: E0 */
    private static final int[] f5034E0 = {16843830};

    /* renamed from: F0 */
    private static final float f5035F0 = ((float) (Math.log(0.78d) / Math.log(0.9d)));

    /* renamed from: G0 */
    static final boolean f5036G0 = false;

    /* renamed from: H0 */
    static final boolean f5037H0 = true;

    /* renamed from: I0 */
    static final boolean f5038I0 = true;

    /* renamed from: J0 */
    static final boolean f5039J0 = true;

    /* renamed from: K0 */
    private static final boolean f5040K0 = false;

    /* renamed from: L0 */
    private static final boolean f5041L0 = false;

    /* renamed from: M0 */
    private static final Class[] f5042M0;

    /* renamed from: N0 */
    static final Interpolator f5043N0 = new C1727c();

    /* renamed from: O0 */
    static final C1728c0 f5044O0 = new C1728c0();

    /* renamed from: A */
    boolean f5045A;

    /* renamed from: A0 */
    private boolean f5046A0;

    /* renamed from: B */
    boolean f5047B;

    /* renamed from: B0 */
    private int f5048B0;

    /* renamed from: C */
    private boolean f5049C;

    /* renamed from: C0 */
    private int f5050C0;

    /* renamed from: D */
    private int f5051D;

    /* renamed from: D0 */
    private final C1839y.C1841b f5052D0;

    /* renamed from: E */
    boolean f5053E;

    /* renamed from: F */
    private final AccessibilityManager f5054F;

    /* renamed from: G */
    private List f5055G;

    /* renamed from: H */
    boolean f5056H;

    /* renamed from: I */
    boolean f5057I;

    /* renamed from: J */
    private int f5058J;

    /* renamed from: K */
    private int f5059K;

    /* renamed from: L */
    private C1741l f5060L;

    /* renamed from: M */
    private EdgeEffect f5061M;

    /* renamed from: N */
    private EdgeEffect f5062N;

    /* renamed from: O */
    private EdgeEffect f5063O;

    /* renamed from: P */
    private EdgeEffect f5064P;

    /* renamed from: Q */
    C1742m f5065Q;

    /* renamed from: R */
    private int f5066R;

    /* renamed from: S */
    private int f5067S;

    /* renamed from: T */
    private VelocityTracker f5068T;

    /* renamed from: U */
    private int f5069U;

    /* renamed from: V */
    private int f5070V;

    /* renamed from: W */
    private int f5071W;

    /* renamed from: a0 */
    private int f5072a0;

    /* renamed from: b0 */
    private int f5073b0;

    /* renamed from: c0 */
    private C1754s f5074c0;

    /* renamed from: d */
    private final float f5075d;

    /* renamed from: d0 */
    private final int f5076d0;

    /* renamed from: e */
    private final C1761y f5077e;

    /* renamed from: e0 */
    private final int f5078e0;

    /* renamed from: f */
    final C1759w f5079f;

    /* renamed from: f0 */
    private float f5080f0;

    /* renamed from: g */
    SavedState f5081g;

    /* renamed from: g0 */
    private float f5082g0;

    /* renamed from: h */
    C1769a f5083h;

    /* renamed from: h0 */
    private boolean f5084h0;

    /* renamed from: i */
    C1782f f5085i;

    /* renamed from: i0 */
    final C1732e0 f5086i0;

    /* renamed from: j */
    final C1839y f5087j;

    /* renamed from: j0 */
    C1812k f5088j0;

    /* renamed from: k */
    boolean f5089k;

    /* renamed from: k0 */
    C1812k.C1814b f5090k0;

    /* renamed from: l */
    final Runnable f5091l;

    /* renamed from: l0 */
    final C1726b0 f5092l0;

    /* renamed from: m */
    final Rect f5093m;

    /* renamed from: m0 */
    private C1756u f5094m0;

    /* renamed from: n */
    private final Rect f5095n;

    /* renamed from: n0 */
    private List f5096n0;

    /* renamed from: o */
    final RectF f5097o;

    /* renamed from: o0 */
    boolean f5098o0;

    /* renamed from: p */
    C1736h f5099p;

    /* renamed from: p0 */
    boolean f5100p0;

    /* renamed from: q */
    C1747p f5101q;

    /* renamed from: q0 */
    private C1742m.C1743a f5102q0;

    /* renamed from: r */
    final List f5103r;

    /* renamed from: r0 */
    boolean f5104r0;

    /* renamed from: s */
    final ArrayList f5105s;

    /* renamed from: s0 */
    C1829t f5106s0;

    /* renamed from: t */
    private final ArrayList f5107t;

    /* renamed from: t0 */
    private final int[] f5108t0;

    /* renamed from: u */
    private C1755t f5109u;

    /* renamed from: u0 */
    private C1262w0 f5110u0;

    /* renamed from: v */
    boolean f5111v;

    /* renamed from: v0 */
    private final int[] f5112v0;

    /* renamed from: w */
    boolean f5113w;

    /* renamed from: w0 */
    private final int[] f5114w0;

    /* renamed from: x */
    boolean f5115x;

    /* renamed from: x0 */
    final int[] f5116x0;

    /* renamed from: y */
    boolean f5117y;

    /* renamed from: y0 */
    final List f5118y0;

    /* renamed from: z */
    private int f5119z;

    /* renamed from: z0 */
    private Runnable f5120z0;

    /* renamed from: androidx.recyclerview.widget.RecyclerView$a */
    class C1721a implements Runnable {
        C1721a() {
        }

        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f5117y && !recyclerView.isLayoutRequested()) {
                RecyclerView recyclerView2 = RecyclerView.this;
                if (!recyclerView2.f5111v) {
                    recyclerView2.requestLayout();
                } else if (recyclerView2.f5047B) {
                    recyclerView2.f5045A = true;
                } else {
                    recyclerView2.mo5249A();
                }
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$a0 */
    public static abstract class C1722a0 {

        /* renamed from: a */
        private int f5123a = -1;

        /* renamed from: b */
        private RecyclerView f5124b;

        /* renamed from: c */
        private C1747p f5125c;

        /* renamed from: d */
        private boolean f5126d;

        /* renamed from: e */
        private boolean f5127e;

        /* renamed from: f */
        private View f5128f;

        /* renamed from: g */
        private final C1723a f5129g = new C1723a(0, 0);

        /* renamed from: h */
        private boolean f5130h;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$a0$a */
        public static class C1723a {

            /* renamed from: a */
            private int f5131a;

            /* renamed from: b */
            private int f5132b;

            /* renamed from: c */
            private int f5133c;

            /* renamed from: d */
            private int f5134d;

            /* renamed from: e */
            private Interpolator f5135e;

            /* renamed from: f */
            private boolean f5136f;

            /* renamed from: g */
            private int f5137g;

            public C1723a(int i, int i2) {
                this(i, i2, Integer.MIN_VALUE, (Interpolator) null);
            }

            /* renamed from: e */
            private void m6331e() {
                if (this.f5135e != null && this.f5133c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                } else if (this.f5133c < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public boolean mo5455a() {
                return this.f5134d >= 0;
            }

            /* renamed from: b */
            public void mo5456b(int i) {
                this.f5134d = i;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: c */
            public void mo5457c(RecyclerView recyclerView) {
                int i = this.f5134d;
                if (i >= 0) {
                    this.f5134d = -1;
                    recyclerView.mo5266I0(i);
                    this.f5136f = false;
                } else if (this.f5136f) {
                    m6331e();
                    recyclerView.f5086i0.mo5487e(this.f5131a, this.f5132b, this.f5133c, this.f5135e);
                    int i2 = this.f5137g + 1;
                    this.f5137g = i2;
                    if (i2 > 10) {
                        Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f5136f = false;
                } else {
                    this.f5137g = 0;
                }
            }

            /* renamed from: d */
            public void mo5458d(int i, int i2, int i3, Interpolator interpolator) {
                this.f5131a = i;
                this.f5132b = i2;
                this.f5133c = i3;
                this.f5135e = interpolator;
                this.f5136f = true;
            }

            public C1723a(int i, int i2, int i3, Interpolator interpolator) {
                this.f5134d = -1;
                this.f5136f = false;
                this.f5137g = 0;
                this.f5131a = i;
                this.f5132b = i2;
                this.f5133c = i3;
                this.f5135e = interpolator;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$a0$b */
        public interface C1724b {
            /* renamed from: a */
            PointF mo5209a(int i);
        }

        /* renamed from: a */
        public PointF mo5437a(int i) {
            C1747p e = mo5441e();
            if (e instanceof C1724b) {
                return ((C1724b) e).mo5209a(i);
            }
            Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + C1724b.class.getCanonicalName());
            return null;
        }

        /* renamed from: b */
        public View mo5438b(int i) {
            return this.f5124b.f5101q.mo5199O(i);
        }

        /* renamed from: c */
        public int mo5439c() {
            return this.f5124b.f5101q.mo5660V();
        }

        /* renamed from: d */
        public int mo5440d(View view) {
            return this.f5124b.mo5358l0(view);
        }

        /* renamed from: e */
        public C1747p mo5441e() {
            return this.f5125c;
        }

        /* renamed from: f */
        public int mo5442f() {
            return this.f5123a;
        }

        /* renamed from: g */
        public boolean mo5443g() {
            return this.f5126d;
        }

        /* renamed from: h */
        public boolean mo5444h() {
            return this.f5127e;
        }

        /* access modifiers changed from: protected */
        /* renamed from: i */
        public void mo5445i(PointF pointF) {
            float f = pointF.x;
            float f2 = pointF.y;
            float sqrt = (float) Math.sqrt((double) ((f * f) + (f2 * f2)));
            pointF.x /= sqrt;
            pointF.y /= sqrt;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo5446j(int i, int i2) {
            PointF a;
            RecyclerView recyclerView = this.f5124b;
            if (this.f5123a == -1 || recyclerView == null) {
                mo5454r();
            }
            if (this.f5126d && this.f5128f == null && this.f5125c != null && (a = mo5437a(this.f5123a)) != null) {
                float f = a.x;
                if (!(f == Utils.FLOAT_EPSILON && a.y == Utils.FLOAT_EPSILON)) {
                    recyclerView.mo5422w1((int) Math.signum(f), (int) Math.signum(a.y), (int[]) null);
                }
            }
            this.f5126d = false;
            View view = this.f5128f;
            if (view != null) {
                if (mo5440d(view) == this.f5123a) {
                    mo5451o(this.f5128f, recyclerView.f5092l0, this.f5129g);
                    this.f5129g.mo5457c(recyclerView);
                    mo5454r();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.f5128f = null;
                }
            }
            if (this.f5127e) {
                mo5448l(i, i2, recyclerView.f5092l0, this.f5129g);
                boolean a2 = this.f5129g.mo5455a();
                this.f5129g.mo5457c(recyclerView);
                if (a2 && this.f5127e) {
                    this.f5126d = true;
                    recyclerView.f5086i0.mo5486d();
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: k */
        public void mo5447k(View view) {
            if (mo5440d(view) == mo5442f()) {
                this.f5128f = view;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: l */
        public abstract void mo5448l(int i, int i2, C1726b0 b0Var, C1723a aVar);

        /* access modifiers changed from: protected */
        /* renamed from: m */
        public abstract void mo5449m();

        /* access modifiers changed from: protected */
        /* renamed from: n */
        public abstract void mo5450n();

        /* access modifiers changed from: protected */
        /* renamed from: o */
        public abstract void mo5451o(View view, C1726b0 b0Var, C1723a aVar);

        /* renamed from: p */
        public void mo5452p(int i) {
            this.f5123a = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public void mo5453q(RecyclerView recyclerView, C1747p pVar) {
            recyclerView.f5086i0.mo5488f();
            if (this.f5130h) {
                Log.w("RecyclerView", "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            this.f5124b = recyclerView;
            this.f5125c = pVar;
            int i = this.f5123a;
            if (i != -1) {
                recyclerView.f5092l0.f5139a = i;
                this.f5127e = true;
                this.f5126d = true;
                this.f5128f = mo5438b(mo5442f());
                mo5449m();
                this.f5124b.f5086i0.mo5486d();
                this.f5130h = true;
                return;
            }
            throw new IllegalArgumentException("Invalid target position");
        }

        /* access modifiers changed from: protected */
        /* renamed from: r */
        public final void mo5454r() {
            if (this.f5127e) {
                this.f5127e = false;
                mo5450n();
                this.f5124b.f5092l0.f5139a = -1;
                this.f5128f = null;
                this.f5123a = -1;
                this.f5126d = false;
                this.f5125c.mo5701q1(this);
                this.f5125c = null;
                this.f5124b = null;
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$b */
    class C1725b implements Runnable {
        C1725b() {
        }

        public void run() {
            C1742m mVar = RecyclerView.this.f5065Q;
            if (mVar != null) {
                mVar.mo5609u();
            }
            RecyclerView.this.f5104r0 = false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$b0 */
    public static class C1726b0 {

        /* renamed from: a */
        int f5139a = -1;

        /* renamed from: b */
        private SparseArray f5140b;

        /* renamed from: c */
        int f5141c = 0;

        /* renamed from: d */
        int f5142d = 0;

        /* renamed from: e */
        int f5143e = 1;

        /* renamed from: f */
        int f5144f = 0;

        /* renamed from: g */
        boolean f5145g = false;

        /* renamed from: h */
        boolean f5146h = false;

        /* renamed from: i */
        boolean f5147i = false;

        /* renamed from: j */
        boolean f5148j = false;

        /* renamed from: k */
        boolean f5149k = false;

        /* renamed from: l */
        boolean f5150l = false;

        /* renamed from: m */
        int f5151m;

        /* renamed from: n */
        long f5152n;

        /* renamed from: o */
        int f5153o;

        /* renamed from: p */
        int f5154p;

        /* renamed from: q */
        int f5155q;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo5460a(int i) {
            if ((this.f5143e & i) == 0) {
                throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.f5143e));
            }
        }

        /* renamed from: b */
        public int mo5461b() {
            if (this.f5146h) {
                return this.f5141c - this.f5142d;
            }
            return this.f5144f;
        }

        /* renamed from: c */
        public int mo5462c() {
            return this.f5139a;
        }

        /* renamed from: d */
        public boolean mo5463d() {
            return this.f5139a != -1;
        }

        /* renamed from: e */
        public boolean mo5464e() {
            return this.f5146h;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo5465f(C1736h hVar) {
            this.f5143e = 1;
            this.f5144f = hVar.getItemCount();
            this.f5146h = false;
            this.f5147i = false;
            this.f5148j = false;
        }

        /* renamed from: g */
        public boolean mo5466g() {
            return this.f5150l;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f5139a + ", mData=" + this.f5140b + ", mItemCount=" + this.f5144f + ", mIsMeasuring=" + this.f5148j + ", mPreviousLayoutItemCount=" + this.f5141c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f5142d + ", mStructureChanged=" + this.f5145g + ", mInPreLayout=" + this.f5146h + ", mRunSimpleAnimations=" + this.f5149k + ", mRunPredictiveAnimations=" + this.f5150l + '}';
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$c */
    class C1727c implements Interpolator {
        C1727c() {
        }

        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$c0 */
    static class C1728c0 extends C1741l {
        C1728c0() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public EdgeEffect mo5469a(RecyclerView recyclerView, int i) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$d */
    class C1729d implements C1839y.C1841b {
        C1729d() {
        }

        /* renamed from: a */
        public void mo5470a(C1734f0 f0Var, C1742m.C1744b bVar, C1742m.C1744b bVar2) {
            RecyclerView.this.mo5366o(f0Var, bVar, bVar2);
        }

        /* renamed from: b */
        public void mo5471b(C1734f0 f0Var) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f5101q.mo5719y1(f0Var.itemView, recyclerView.f5079f);
        }

        /* renamed from: c */
        public void mo5472c(C1734f0 f0Var, C1742m.C1744b bVar, C1742m.C1744b bVar2) {
            RecyclerView.this.f5079f.mo5766P(f0Var);
            RecyclerView.this.mo5382q(f0Var, bVar, bVar2);
        }

        /* renamed from: d */
        public void mo5473d(C1734f0 f0Var, C1742m.C1744b bVar, C1742m.C1744b bVar2) {
            f0Var.setIsRecyclable(false);
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f5056H) {
                if (recyclerView.f5065Q.mo5591b(f0Var, f0Var, bVar, bVar2)) {
                    RecyclerView.this.mo5300Z0();
                }
            } else if (recyclerView.f5065Q.mo5593d(f0Var, bVar, bVar2)) {
                RecyclerView.this.mo5300Z0();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$d0 */
    public static abstract class C1730d0 {
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$e */
    class C1731e implements C1782f.C1784b {
        C1731e() {
        }

        /* renamed from: a */
        public View mo5474a(int i) {
            return RecyclerView.this.getChildAt(i);
        }

        /* renamed from: b */
        public void mo5475b(View view) {
            C1734f0 o0 = RecyclerView.m6198o0(view);
            if (o0 != null) {
                o0.onEnteredHiddenState(RecyclerView.this);
            }
        }

        /* renamed from: c */
        public int mo5476c() {
            return RecyclerView.this.getChildCount();
        }

        /* renamed from: d */
        public C1734f0 mo5477d(View view) {
            return RecyclerView.m6198o0(view);
        }

        /* renamed from: e */
        public void mo5478e(int i) {
            C1734f0 o0;
            View a = mo5474a(i);
            if (!(a == null || (o0 = RecyclerView.m6198o0(a)) == null)) {
                if (!o0.isTmpDetached() || o0.shouldIgnore()) {
                    o0.addFlags(C11398b.f33139r);
                } else {
                    throw new IllegalArgumentException("called detach on an already detached child " + o0 + RecyclerView.this.mo5292V());
                }
            }
            RecyclerView.this.detachViewFromParent(i);
        }

        /* renamed from: f */
        public void mo5479f(View view, int i) {
            RecyclerView.this.addView(view, i);
            RecyclerView.this.mo5256E(view);
        }

        /* renamed from: g */
        public void mo5480g() {
            int c = mo5476c();
            for (int i = 0; i < c; i++) {
                View a = mo5474a(i);
                RecyclerView.this.mo5259F(a);
                a.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        /* renamed from: h */
        public int mo5481h(View view) {
            return RecyclerView.this.indexOfChild(view);
        }

        /* renamed from: i */
        public void mo5482i(View view) {
            C1734f0 o0 = RecyclerView.m6198o0(view);
            if (o0 != null) {
                o0.onLeftHiddenState(RecyclerView.this);
            }
        }

        /* renamed from: j */
        public void mo5483j(int i) {
            View childAt = RecyclerView.this.getChildAt(i);
            if (childAt != null) {
                RecyclerView.this.mo5259F(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i);
        }

        /* renamed from: k */
        public void mo5484k(View view, int i, ViewGroup.LayoutParams layoutParams) {
            C1734f0 o0 = RecyclerView.m6198o0(view);
            if (o0 != null) {
                if (o0.isTmpDetached() || o0.shouldIgnore()) {
                    o0.clearTmpDetachFlag();
                } else {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + o0 + RecyclerView.this.mo5292V());
                }
            }
            RecyclerView.this.attachViewToParent(view, i, layoutParams);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$e0 */
    class C1732e0 implements Runnable {

        /* renamed from: d */
        private int f5158d;

        /* renamed from: e */
        private int f5159e;

        /* renamed from: f */
        OverScroller f5160f;

        /* renamed from: g */
        Interpolator f5161g;

        /* renamed from: h */
        private boolean f5162h = false;

        /* renamed from: i */
        private boolean f5163i = false;

        C1732e0() {
            Interpolator interpolator = RecyclerView.f5043N0;
            this.f5161g = interpolator;
            this.f5160f = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        /* renamed from: a */
        private int m6360a(int i, int i2) {
            boolean z;
            int i3;
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            if (abs > abs2) {
                z = true;
            } else {
                z = false;
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (z) {
                i3 = recyclerView.getWidth();
            } else {
                i3 = recyclerView.getHeight();
            }
            if (!z) {
                abs = abs2;
            }
            return Math.min((int) (((((float) abs) / ((float) i3)) + 1.0f) * 300.0f), 2000);
        }

        /* renamed from: c */
        private void m6361c() {
            RecyclerView.this.removeCallbacks(this);
            ViewCompat.m3603j0(RecyclerView.this, this);
        }

        /* renamed from: b */
        public void mo5485b(int i, int i2) {
            RecyclerView.this.setScrollState(2);
            this.f5159e = 0;
            this.f5158d = 0;
            Interpolator interpolator = this.f5161g;
            Interpolator interpolator2 = RecyclerView.f5043N0;
            if (interpolator != interpolator2) {
                this.f5161g = interpolator2;
                this.f5160f = new OverScroller(RecyclerView.this.getContext(), interpolator2);
            }
            this.f5160f.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            mo5486d();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo5486d() {
            if (this.f5162h) {
                this.f5163i = true;
            } else {
                m6361c();
            }
        }

        /* renamed from: e */
        public void mo5487e(int i, int i2, int i3, Interpolator interpolator) {
            if (i3 == Integer.MIN_VALUE) {
                i3 = m6360a(i, i2);
            }
            int i4 = i3;
            if (interpolator == null) {
                interpolator = RecyclerView.f5043N0;
            }
            if (this.f5161g != interpolator) {
                this.f5161g = interpolator;
                this.f5160f = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f5159e = 0;
            this.f5158d = 0;
            RecyclerView.this.setScrollState(2);
            this.f5160f.startScroll(0, 0, i, i2, i4);
            mo5486d();
        }

        /* renamed from: f */
        public void mo5488f() {
            RecyclerView.this.removeCallbacks(this);
            this.f5160f.abortAnimation();
        }

        public void run() {
            int i;
            int i2;
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            int i3;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f5101q == null) {
                mo5488f();
                return;
            }
            this.f5163i = false;
            this.f5162h = true;
            recyclerView.mo5249A();
            OverScroller overScroller = this.f5160f;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i4 = currX - this.f5158d;
                int i5 = currY - this.f5159e;
                this.f5158d = currX;
                this.f5159e = currY;
                int x = RecyclerView.this.mo5423x(i4);
                int z5 = RecyclerView.this.mo5426z(i5);
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.f5116x0;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.mo5271L(x, z5, iArr, (int[]) null, 1)) {
                    int[] iArr2 = RecyclerView.this.f5116x0;
                    x -= iArr2[0];
                    z5 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.mo5421w(x, z5);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.f5099p != null) {
                    int[] iArr3 = recyclerView3.f5116x0;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.mo5422w1(x, z5, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.f5116x0;
                    i = iArr4[0];
                    i2 = iArr4[1];
                    x -= i;
                    z5 -= i2;
                    C1722a0 a0Var = recyclerView4.f5101q.f5188j;
                    if (a0Var != null && !a0Var.mo5443g() && a0Var.mo5444h()) {
                        int b = RecyclerView.this.f5092l0.mo5461b();
                        if (b == 0) {
                            a0Var.mo5454r();
                        } else if (a0Var.mo5442f() >= b) {
                            a0Var.mo5452p(b - 1);
                            a0Var.mo5446j(i, i2);
                        } else {
                            a0Var.mo5446j(i, i2);
                        }
                    }
                } else {
                    i2 = 0;
                    i = 0;
                }
                if (!RecyclerView.this.f5105s.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.f5116x0;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.mo5273M(i, i2, x, z5, (int[]) null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.f5116x0;
                int i6 = x - iArr6[0];
                int i7 = z5 - iArr6[1];
                if (!(i == 0 && i2 == 0)) {
                    recyclerView6.mo5278O(i, i2);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                if (overScroller.getCurrX() == overScroller.getFinalX()) {
                    z = true;
                } else {
                    z = false;
                }
                if (overScroller.getCurrY() == overScroller.getFinalY()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (overScroller.isFinished() || ((z || i6 != 0) && (z2 || i7 != 0))) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                C1722a0 a0Var2 = RecyclerView.this.f5101q.f5188j;
                if (a0Var2 == null || !a0Var2.mo5443g()) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                if (z4 || !z3) {
                    mo5486d();
                    RecyclerView recyclerView7 = RecyclerView.this;
                    C1812k kVar = recyclerView7.f5088j0;
                    if (kVar != null) {
                        kVar.mo6000f(recyclerView7, i, i2);
                    }
                } else {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        if (i6 < 0) {
                            i3 = -currVelocity;
                        } else if (i6 > 0) {
                            i3 = currVelocity;
                        } else {
                            i3 = 0;
                        }
                        if (i7 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i7 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.mo5310d(i3, currVelocity);
                    }
                    if (RecyclerView.f5039J0) {
                        RecyclerView.this.f5090k0.mo6006b();
                    }
                }
            }
            C1722a0 a0Var3 = RecyclerView.this.f5101q.f5188j;
            if (a0Var3 != null && a0Var3.mo5443g()) {
                a0Var3.mo5446j(0, 0);
            }
            this.f5162h = false;
            if (this.f5163i) {
                m6361c();
                return;
            }
            RecyclerView.this.setScrollState(0);
            RecyclerView.this.mo5272L1(1);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$f */
    class C1733f implements C1769a.C1770a {
        C1733f() {
        }

        /* renamed from: a */
        public void mo5490a(int i, int i2) {
            RecyclerView.this.mo5282P0(i, i2);
            RecyclerView.this.f5098o0 = true;
        }

        /* renamed from: b */
        public void mo5491b(C1769a.C1771b bVar) {
            mo5498i(bVar);
        }

        /* renamed from: c */
        public void mo5492c(C1769a.C1771b bVar) {
            mo5498i(bVar);
        }

        /* renamed from: d */
        public void mo5493d(int i, int i2) {
            RecyclerView.this.mo5283Q0(i, i2, false);
            RecyclerView.this.f5098o0 = true;
        }

        /* renamed from: e */
        public void mo5494e(int i, int i2, Object obj) {
            RecyclerView.this.mo5280O1(i, i2, obj);
            RecyclerView.this.f5100p0 = true;
        }

        /* renamed from: f */
        public C1734f0 mo5495f(int i) {
            C1734f0 g0 = RecyclerView.this.mo5324g0(i, true);
            if (g0 != null && !RecyclerView.this.f5085i.mo5927n(g0.itemView)) {
                return g0;
            }
            return null;
        }

        /* renamed from: g */
        public void mo5496g(int i, int i2) {
            RecyclerView.this.mo5279O0(i, i2);
            RecyclerView.this.f5098o0 = true;
        }

        /* renamed from: h */
        public void mo5497h(int i, int i2) {
            RecyclerView.this.mo5283Q0(i, i2, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f5098o0 = true;
            recyclerView.f5092l0.f5142d += i2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public void mo5498i(C1769a.C1771b bVar) {
            int i = bVar.f5290a;
            if (i == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.f5101q.mo5165c1(recyclerView, bVar.f5291b, bVar.f5293d);
            } else if (i == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.f5101q.mo5168f1(recyclerView2, bVar.f5291b, bVar.f5293d);
            } else if (i == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.f5101q.mo5169h1(recyclerView3, bVar.f5291b, bVar.f5293d, bVar.f5292c);
            } else if (i == 8) {
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.f5101q.mo5167e1(recyclerView4, bVar.f5291b, bVar.f5293d, 1);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$f0 */
    public static abstract class C1734f0 {
        static final int FLAG_ADAPTER_FULLUPDATE = 1024;
        static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
        static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 8192;
        static final int FLAG_BOUND = 1;
        static final int FLAG_IGNORE = 128;
        static final int FLAG_INVALID = 4;
        static final int FLAG_MOVED = 2048;
        static final int FLAG_NOT_RECYCLABLE = 16;
        static final int FLAG_REMOVED = 8;
        static final int FLAG_RETURNED_FROM_SCRAP = 32;
        static final int FLAG_TMP_DETACHED = 256;
        static final int FLAG_UPDATE = 2;
        private static final List<Object> FULLUPDATE_PAYLOADS = Collections.emptyList();
        static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;
        public final View itemView;
        C1736h mBindingAdapter;
        int mFlags;
        boolean mInChangeScrap = false;
        private int mIsRecyclableCount = 0;
        long mItemId = -1;
        int mItemViewType = -1;
        WeakReference<RecyclerView> mNestedRecyclerView;
        int mOldPosition = -1;
        RecyclerView mOwnerRecyclerView;
        List<Object> mPayloads = null;
        int mPendingAccessibilityState = -1;
        int mPosition = -1;
        int mPreLayoutPosition = -1;
        C1759w mScrapContainer = null;
        C1734f0 mShadowedHolder = null;
        C1734f0 mShadowingHolder = null;
        List<Object> mUnmodifiedPayloads = null;
        private int mWasImportantForAccessibilityBeforeHidden = 0;

        public C1734f0(View view) {
            if (view != null) {
                this.itemView = view;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        /* renamed from: g */
        private void m6375g() {
            if (this.mPayloads == null) {
                ArrayList arrayList = new ArrayList();
                this.mPayloads = arrayList;
                this.mUnmodifiedPayloads = Collections.unmodifiableList(arrayList);
            }
        }

        /* access modifiers changed from: package-private */
        public void addChangePayload(Object obj) {
            if (obj == null) {
                addFlags(1024);
            } else if ((1024 & this.mFlags) == 0) {
                m6375g();
                this.mPayloads.add(obj);
            }
        }

        /* access modifiers changed from: package-private */
        public void addFlags(int i) {
            this.mFlags = i | this.mFlags;
        }

        /* access modifiers changed from: package-private */
        public void clearOldPosition() {
            this.mOldPosition = -1;
            this.mPreLayoutPosition = -1;
        }

        /* access modifiers changed from: package-private */
        public void clearPayload() {
            List<Object> list = this.mPayloads;
            if (list != null) {
                list.clear();
            }
            this.mFlags &= -1025;
        }

        /* access modifiers changed from: package-private */
        public void clearReturnedFromScrapFlag() {
            this.mFlags &= -33;
        }

        /* access modifiers changed from: package-private */
        public void clearTmpDetachFlag() {
            this.mFlags &= -257;
        }

        /* access modifiers changed from: package-private */
        public boolean doesTransientStatePreventRecycling() {
            return (this.mFlags & 16) == 0 && ViewCompat.m3575S(this.itemView);
        }

        /* access modifiers changed from: package-private */
        public void flagRemovedAndOffsetPosition(int i, int i2, boolean z) {
            addFlags(8);
            offsetPosition(i2, z);
            this.mPosition = i;
        }

        public final int getAbsoluteAdapterPosition() {
            RecyclerView recyclerView = this.mOwnerRecyclerView;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.mo5347i0(this);
        }

        @Deprecated
        public final int getAdapterPosition() {
            return getBindingAdapterPosition();
        }

        public final C1736h getBindingAdapter() {
            return this.mBindingAdapter;
        }

        public final int getBindingAdapterPosition() {
            RecyclerView recyclerView;
            C1736h adapter;
            int i0;
            if (this.mBindingAdapter == null || (recyclerView = this.mOwnerRecyclerView) == null || (adapter = recyclerView.getAdapter()) == null || (i0 = this.mOwnerRecyclerView.mo5347i0(this)) == -1) {
                return -1;
            }
            return adapter.findRelativeAdapterPositionIn(this.mBindingAdapter, this, i0);
        }

        public final long getItemId() {
            return this.mItemId;
        }

        public final int getItemViewType() {
            return this.mItemViewType;
        }

        public final int getLayoutPosition() {
            int i = this.mPreLayoutPosition;
            return i == -1 ? this.mPosition : i;
        }

        public final int getOldPosition() {
            return this.mOldPosition;
        }

        @Deprecated
        public final int getPosition() {
            int i = this.mPreLayoutPosition;
            return i == -1 ? this.mPosition : i;
        }

        /* access modifiers changed from: package-private */
        public List<Object> getUnmodifiedPayloads() {
            if ((this.mFlags & 1024) != 0) {
                return FULLUPDATE_PAYLOADS;
            }
            List<Object> list = this.mPayloads;
            if (list == null || list.size() == 0) {
                return FULLUPDATE_PAYLOADS;
            }
            return this.mUnmodifiedPayloads;
        }

        /* access modifiers changed from: package-private */
        public boolean hasAnyOfTheFlags(int i) {
            return (i & this.mFlags) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean isAdapterPositionUnknown() {
            return (this.mFlags & 512) != 0 || isInvalid();
        }

        /* access modifiers changed from: package-private */
        public boolean isAttachedToTransitionOverlay() {
            return (this.itemView.getParent() == null || this.itemView.getParent() == this.mOwnerRecyclerView) ? false : true;
        }

        /* access modifiers changed from: package-private */
        public boolean isBound() {
            return (this.mFlags & 1) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean isInvalid() {
            return (this.mFlags & 4) != 0;
        }

        public final boolean isRecyclable() {
            if ((this.mFlags & 16) != 0 || ViewCompat.m3575S(this.itemView)) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        public boolean isRemoved() {
            return (this.mFlags & 8) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean isScrap() {
            return this.mScrapContainer != null;
        }

        /* access modifiers changed from: package-private */
        public boolean isTmpDetached() {
            return (this.mFlags & 256) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean isUpdated() {
            return (this.mFlags & 2) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean needsUpdate() {
            return (this.mFlags & 2) != 0;
        }

        /* access modifiers changed from: package-private */
        public void offsetPosition(int i, boolean z) {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
            if (this.mPreLayoutPosition == -1) {
                this.mPreLayoutPosition = this.mPosition;
            }
            if (z) {
                this.mPreLayoutPosition += i;
            }
            this.mPosition += i;
            if (this.itemView.getLayoutParams() != null) {
                ((C1752q) this.itemView.getLayoutParams()).f5208f = true;
            }
        }

        /* access modifiers changed from: package-private */
        public void onEnteredHiddenState(RecyclerView recyclerView) {
            int i = this.mPendingAccessibilityState;
            if (i != -1) {
                this.mWasImportantForAccessibilityBeforeHidden = i;
            } else {
                this.mWasImportantForAccessibilityBeforeHidden = ViewCompat.m3634z(this.itemView);
            }
            recyclerView.mo5428z1(this, 4);
        }

        /* access modifiers changed from: package-private */
        public void onLeftHiddenState(RecyclerView recyclerView) {
            recyclerView.mo5428z1(this, this.mWasImportantForAccessibilityBeforeHidden);
            this.mWasImportantForAccessibilityBeforeHidden = 0;
        }

        /* access modifiers changed from: package-private */
        public void resetInternal() {
            this.mFlags = 0;
            this.mPosition = -1;
            this.mOldPosition = -1;
            this.mItemId = -1;
            this.mPreLayoutPosition = -1;
            this.mIsRecyclableCount = 0;
            this.mShadowedHolder = null;
            this.mShadowingHolder = null;
            clearPayload();
            this.mWasImportantForAccessibilityBeforeHidden = 0;
            this.mPendingAccessibilityState = -1;
            RecyclerView.m6208u(this);
        }

        /* access modifiers changed from: package-private */
        public void saveOldPosition() {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
        }

        /* access modifiers changed from: package-private */
        public void setFlags(int i, int i2) {
            this.mFlags = (i & i2) | (this.mFlags & (~i2));
        }

        public final void setIsRecyclable(boolean z) {
            int i;
            int i2 = this.mIsRecyclableCount;
            if (z) {
                i = i2 - 1;
            } else {
                i = i2 + 1;
            }
            this.mIsRecyclableCount = i;
            if (i < 0) {
                this.mIsRecyclableCount = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            } else if (!z && i == 1) {
                this.mFlags |= 16;
            } else if (z && i == 0) {
                this.mFlags &= -17;
            }
        }

        /* access modifiers changed from: package-private */
        public void setScrapContainer(C1759w wVar, boolean z) {
            this.mScrapContainer = wVar;
            this.mInChangeScrap = z;
        }

        /* access modifiers changed from: package-private */
        public boolean shouldBeKeptAsChild() {
            return (this.mFlags & 16) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean shouldIgnore() {
            return (this.mFlags & 128) != 0;
        }

        /* access modifiers changed from: package-private */
        public void stopIgnoring() {
            this.mFlags &= -129;
        }

        public String toString() {
            String str;
            String str2;
            if (getClass().isAnonymousClass()) {
                str = "ViewHolder";
            } else {
                str = getClass().getSimpleName();
            }
            StringBuilder sb = new StringBuilder(str + "{" + Integer.toHexString(hashCode()) + " position=" + this.mPosition + " id=" + this.mItemId + ", oldPos=" + this.mOldPosition + ", pLpos:" + this.mPreLayoutPosition);
            if (isScrap()) {
                sb.append(" scrap ");
                if (this.mInChangeScrap) {
                    str2 = "[changeScrap]";
                } else {
                    str2 = "[attachedScrap]";
                }
                sb.append(str2);
            }
            if (isInvalid()) {
                sb.append(" invalid");
            }
            if (!isBound()) {
                sb.append(" unbound");
            }
            if (needsUpdate()) {
                sb.append(" update");
            }
            if (isRemoved()) {
                sb.append(" removed");
            }
            if (shouldIgnore()) {
                sb.append(" ignored");
            }
            if (isTmpDetached()) {
                sb.append(" tmpDetached");
            }
            if (!isRecyclable()) {
                sb.append(" not recyclable(" + this.mIsRecyclableCount + ")");
            }
            if (isAdapterPositionUnknown()) {
                sb.append(" undefined adapter position");
            }
            if (this.itemView.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        /* access modifiers changed from: package-private */
        public void unScrap() {
            this.mScrapContainer.mo5766P(this);
        }

        /* access modifiers changed from: package-private */
        public boolean wasReturnedFromScrap() {
            return (this.mFlags & 32) != 0;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$g */
    static /* synthetic */ class C1735g {

        /* renamed from: a */
        static final /* synthetic */ int[] f5166a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                androidx.recyclerview.widget.RecyclerView$h$a[] r0 = androidx.recyclerview.widget.RecyclerView.C1736h.C1737a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f5166a = r0
                androidx.recyclerview.widget.RecyclerView$h$a r1 = androidx.recyclerview.widget.RecyclerView.C1736h.C1737a.PREVENT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f5166a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.recyclerview.widget.RecyclerView$h$a r1 = androidx.recyclerview.widget.RecyclerView.C1736h.C1737a.PREVENT_WHEN_EMPTY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C1735g.<clinit>():void");
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$h */
    public static abstract class C1736h {
        private boolean mHasStableIds = false;
        private final C1738i mObservable = new C1738i();
        private C1737a mStateRestorationPolicy = C1737a.ALLOW;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$h$a */
        public enum C1737a {
            ALLOW,
            PREVENT_WHEN_EMPTY,
            PREVENT
        }

        public final void bindViewHolder(C1734f0 f0Var, int i) {
            boolean z;
            if (f0Var.mBindingAdapter == null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                f0Var.mPosition = i;
                if (hasStableIds()) {
                    f0Var.mItemId = getItemId(i);
                }
                f0Var.setFlags(1, 519);
                C0934x.m3381a("RV OnBindView");
            }
            f0Var.mBindingAdapter = this;
            onBindViewHolder(f0Var, i, f0Var.getUnmodifiedPayloads());
            if (z) {
                f0Var.clearPayload();
                ViewGroup.LayoutParams layoutParams = f0Var.itemView.getLayoutParams();
                if (layoutParams instanceof C1752q) {
                    ((C1752q) layoutParams).f5208f = true;
                }
                C0934x.m3382b();
            }
        }

        /* access modifiers changed from: package-private */
        public boolean canRestoreState() {
            int i = C1735g.f5166a[this.mStateRestorationPolicy.ordinal()];
            if (i == 1) {
                return false;
            }
            if (i != 2) {
                return true;
            }
            if (getItemCount() > 0) {
                return true;
            }
            return false;
        }

        public final C1734f0 createViewHolder(ViewGroup viewGroup, int i) {
            try {
                C0934x.m3381a("RV CreateView");
                C1734f0 onCreateViewHolder = onCreateViewHolder(viewGroup, i);
                if (onCreateViewHolder.itemView.getParent() == null) {
                    onCreateViewHolder.mItemViewType = i;
                    return onCreateViewHolder;
                }
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            } finally {
                C0934x.m3382b();
            }
        }

        public int findRelativeAdapterPositionIn(C1736h hVar, C1734f0 f0Var, int i) {
            if (hVar == this) {
                return i;
            }
            return -1;
        }

        public abstract int getItemCount();

        public long getItemId(int i) {
            return -1;
        }

        public int getItemViewType(int i) {
            return 0;
        }

        public final C1737a getStateRestorationPolicy() {
            return this.mStateRestorationPolicy;
        }

        public final boolean hasObservers() {
            return this.mObservable.mo5575a();
        }

        public final boolean hasStableIds() {
            return this.mHasStableIds;
        }

        public final void notifyDataSetChanged() {
            this.mObservable.mo5576b();
        }

        public final void notifyItemChanged(int i) {
            this.mObservable.mo5578d(i, 1);
        }

        public final void notifyItemInserted(int i) {
            this.mObservable.mo5580f(i, 1);
        }

        public final void notifyItemMoved(int i, int i2) {
            this.mObservable.mo5577c(i, i2);
        }

        public final void notifyItemRangeChanged(int i, int i2) {
            this.mObservable.mo5578d(i, i2);
        }

        public final void notifyItemRangeInserted(int i, int i2) {
            this.mObservable.mo5580f(i, i2);
        }

        public final void notifyItemRangeRemoved(int i, int i2) {
            this.mObservable.mo5581g(i, i2);
        }

        public final void notifyItemRemoved(int i) {
            this.mObservable.mo5581g(i, 1);
        }

        public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        }

        public abstract void onBindViewHolder(C1734f0 f0Var, int i);

        public void onBindViewHolder(C1734f0 f0Var, int i, List<Object> list) {
            onBindViewHolder(f0Var, i);
        }

        public abstract C1734f0 onCreateViewHolder(ViewGroup viewGroup, int i);

        public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        }

        public boolean onFailedToRecycleView(C1734f0 f0Var) {
            return false;
        }

        public void onViewAttachedToWindow(C1734f0 f0Var) {
        }

        public void onViewDetachedFromWindow(C1734f0 f0Var) {
        }

        public void onViewRecycled(C1734f0 f0Var) {
        }

        public void registerAdapterDataObserver(C1739j jVar) {
            this.mObservable.registerObserver(jVar);
        }

        public void setHasStableIds(boolean z) {
            if (!hasObservers()) {
                this.mHasStableIds = z;
                return;
            }
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }

        public void setStateRestorationPolicy(C1737a aVar) {
            this.mStateRestorationPolicy = aVar;
            this.mObservable.mo5582h();
        }

        public void unregisterAdapterDataObserver(C1739j jVar) {
            this.mObservable.unregisterObserver(jVar);
        }

        public final void notifyItemChanged(int i, Object obj) {
            this.mObservable.mo5579e(i, 1, obj);
        }

        public final void notifyItemRangeChanged(int i, int i2, Object obj) {
            this.mObservable.mo5579e(i, i2, obj);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$i */
    static class C1738i extends Observable {
        C1738i() {
        }

        /* renamed from: a */
        public boolean mo5575a() {
            return !this.mObservers.isEmpty();
        }

        /* renamed from: b */
        public void mo5576b() {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C1739j) this.mObservers.get(size)).mo5583a();
            }
        }

        /* renamed from: c */
        public void mo5577c(int i, int i2) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C1739j) this.mObservers.get(size)).mo5587e(i, i2, 1);
            }
        }

        /* renamed from: d */
        public void mo5578d(int i, int i2) {
            mo5579e(i, i2, (Object) null);
        }

        /* renamed from: e */
        public void mo5579e(int i, int i2, Object obj) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C1739j) this.mObservers.get(size)).mo5585c(i, i2, obj);
            }
        }

        /* renamed from: f */
        public void mo5580f(int i, int i2) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C1739j) this.mObservers.get(size)).mo5586d(i, i2);
            }
        }

        /* renamed from: g */
        public void mo5581g(int i, int i2) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C1739j) this.mObservers.get(size)).mo5588f(i, i2);
            }
        }

        /* renamed from: h */
        public void mo5582h() {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C1739j) this.mObservers.get(size)).mo5589g();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$j */
    public static abstract class C1739j {
        /* renamed from: a */
        public void mo5583a() {
        }

        /* renamed from: b */
        public void mo5584b(int i, int i2) {
        }

        /* renamed from: c */
        public void mo5585c(int i, int i2, Object obj) {
            mo5584b(i, i2);
        }

        /* renamed from: d */
        public void mo5586d(int i, int i2) {
        }

        /* renamed from: e */
        public void mo5587e(int i, int i2, int i3) {
        }

        /* renamed from: f */
        public void mo5588f(int i, int i2) {
        }

        /* renamed from: g */
        public void mo5589g() {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$k */
    public interface C1740k {
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$l */
    public static class C1741l {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract EdgeEffect mo5469a(RecyclerView recyclerView, int i);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$m */
    public static abstract class C1742m {

        /* renamed from: a */
        private C1743a f5171a = null;

        /* renamed from: b */
        private ArrayList f5172b = new ArrayList();

        /* renamed from: c */
        private long f5173c = 120;

        /* renamed from: d */
        private long f5174d = 120;

        /* renamed from: e */
        private long f5175e = 250;

        /* renamed from: f */
        private long f5176f = 250;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$m$a */
        interface C1743a {
            /* renamed from: a */
            void mo5611a(C1734f0 f0Var);
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$m$b */
        public static class C1744b {

            /* renamed from: a */
            public int f5177a;

            /* renamed from: b */
            public int f5178b;

            /* renamed from: c */
            public int f5179c;

            /* renamed from: d */
            public int f5180d;

            /* renamed from: a */
            public C1744b mo5612a(C1734f0 f0Var) {
                return mo5613b(f0Var, 0);
            }

            /* renamed from: b */
            public C1744b mo5613b(C1734f0 f0Var, int i) {
                View view = f0Var.itemView;
                this.f5177a = view.getLeft();
                this.f5178b = view.getTop();
                this.f5179c = view.getRight();
                this.f5180d = view.getBottom();
                return this;
            }
        }

        /* renamed from: e */
        static int m6392e(C1734f0 f0Var) {
            int i = f0Var.mFlags & 14;
            if (f0Var.isInvalid()) {
                return 4;
            }
            if ((i & 4) != 0) {
                return i;
            }
            int oldPosition = f0Var.getOldPosition();
            int absoluteAdapterPosition = f0Var.getAbsoluteAdapterPosition();
            if (oldPosition == -1 || absoluteAdapterPosition == -1 || oldPosition == absoluteAdapterPosition) {
                return i;
            }
            return i | C11398b.f33142u;
        }

        /* renamed from: a */
        public abstract boolean mo5590a(C1734f0 f0Var, C1744b bVar, C1744b bVar2);

        /* renamed from: b */
        public abstract boolean mo5591b(C1734f0 f0Var, C1734f0 f0Var2, C1744b bVar, C1744b bVar2);

        /* renamed from: c */
        public abstract boolean mo5592c(C1734f0 f0Var, C1744b bVar, C1744b bVar2);

        /* renamed from: d */
        public abstract boolean mo5593d(C1734f0 f0Var, C1744b bVar, C1744b bVar2);

        /* renamed from: f */
        public abstract boolean mo5594f(C1734f0 f0Var);

        /* renamed from: g */
        public boolean mo5595g(C1734f0 f0Var, List list) {
            return mo5594f(f0Var);
        }

        /* renamed from: h */
        public final void mo5596h(C1734f0 f0Var) {
            mo5606r(f0Var);
            C1743a aVar = this.f5171a;
            if (aVar != null) {
                aVar.mo5611a(f0Var);
            }
        }

        /* renamed from: i */
        public final void mo5597i() {
            if (this.f5172b.size() <= 0) {
                this.f5172b.clear();
            } else {
                C0125b.m366a(this.f5172b.get(0));
                throw null;
            }
        }

        /* renamed from: j */
        public abstract void mo5598j(C1734f0 f0Var);

        /* renamed from: k */
        public abstract void mo5599k();

        /* renamed from: l */
        public long mo5600l() {
            return this.f5173c;
        }

        /* renamed from: m */
        public long mo5601m() {
            return this.f5176f;
        }

        /* renamed from: n */
        public long mo5602n() {
            return this.f5175e;
        }

        /* renamed from: o */
        public long mo5603o() {
            return this.f5174d;
        }

        /* renamed from: p */
        public abstract boolean mo5604p();

        /* renamed from: q */
        public C1744b mo5605q() {
            return new C1744b();
        }

        /* renamed from: r */
        public void mo5606r(C1734f0 f0Var) {
        }

        /* renamed from: s */
        public C1744b mo5607s(C1726b0 b0Var, C1734f0 f0Var) {
            return mo5605q().mo5612a(f0Var);
        }

        /* renamed from: t */
        public C1744b mo5608t(C1726b0 b0Var, C1734f0 f0Var, int i, List list) {
            return mo5605q().mo5612a(f0Var);
        }

        /* renamed from: u */
        public abstract void mo5609u();

        /* access modifiers changed from: package-private */
        /* renamed from: v */
        public void mo5610v(C1743a aVar) {
            this.f5171a = aVar;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$n */
    private class C1745n implements C1742m.C1743a {
        C1745n() {
        }

        /* renamed from: a */
        public void mo5611a(C1734f0 f0Var) {
            f0Var.setIsRecyclable(true);
            if (f0Var.mShadowedHolder != null && f0Var.mShadowingHolder == null) {
                f0Var.mShadowedHolder = null;
            }
            f0Var.mShadowingHolder = null;
            if (!f0Var.shouldBeKeptAsChild() && !RecyclerView.this.mo5356k1(f0Var.itemView) && f0Var.isTmpDetached()) {
                RecyclerView.this.removeDetachedView(f0Var.itemView, false);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$o */
    public static abstract class C1746o {
        /* renamed from: d */
        public void mo5614d(Rect rect, int i, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        /* renamed from: e */
        public void mo5615e(Rect rect, View view, RecyclerView recyclerView, C1726b0 b0Var) {
            mo5614d(rect, ((C1752q) view.getLayoutParams()).mo5729b(), recyclerView);
        }

        /* renamed from: f */
        public void mo5616f(Canvas canvas, RecyclerView recyclerView) {
        }

        /* renamed from: g */
        public void mo5617g(Canvas canvas, RecyclerView recyclerView, C1726b0 b0Var) {
            mo5616f(canvas, recyclerView);
        }

        /* renamed from: h */
        public void mo5618h(Canvas canvas, RecyclerView recyclerView) {
        }

        /* renamed from: i */
        public void mo5619i(Canvas canvas, RecyclerView recyclerView, C1726b0 b0Var) {
            mo5618h(canvas, recyclerView);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$p */
    public static abstract class C1747p {

        /* renamed from: d */
        C1782f f5182d;

        /* renamed from: e */
        RecyclerView f5183e;

        /* renamed from: f */
        private final C1836x.C1838b f5184f;

        /* renamed from: g */
        private final C1836x.C1838b f5185g;

        /* renamed from: h */
        C1836x f5186h;

        /* renamed from: i */
        C1836x f5187i;

        /* renamed from: j */
        C1722a0 f5188j;

        /* renamed from: k */
        boolean f5189k = false;

        /* renamed from: l */
        boolean f5190l = false;

        /* renamed from: m */
        boolean f5191m = false;

        /* renamed from: n */
        private boolean f5192n = true;

        /* renamed from: o */
        private boolean f5193o = true;

        /* renamed from: p */
        int f5194p;

        /* renamed from: q */
        boolean f5195q;

        /* renamed from: r */
        private int f5196r;

        /* renamed from: s */
        private int f5197s;

        /* renamed from: t */
        private int f5198t;

        /* renamed from: u */
        private int f5199u;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$p$a */
        class C1748a implements C1836x.C1838b {
            C1748a() {
            }

            /* renamed from: a */
            public View mo5722a(int i) {
                return C1747p.this.mo5658U(i);
            }

            /* renamed from: b */
            public int mo5723b(View view) {
                return C1747p.this.mo5671c0(view) - ((C1752q) view.getLayoutParams()).leftMargin;
            }

            /* renamed from: c */
            public int mo5724c() {
                return C1747p.this.getPaddingLeft();
            }

            /* renamed from: d */
            public int mo5725d() {
                return C1747p.this.mo5716x0() - C1747p.this.getPaddingRight();
            }

            /* renamed from: e */
            public int mo5726e(View view) {
                return C1747p.this.mo5674f0(view) + ((C1752q) view.getLayoutParams()).rightMargin;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$p$b */
        class C1749b implements C1836x.C1838b {
            C1749b() {
            }

            /* renamed from: a */
            public View mo5722a(int i) {
                return C1747p.this.mo5658U(i);
            }

            /* renamed from: b */
            public int mo5723b(View view) {
                return C1747p.this.mo5675g0(view) - ((C1752q) view.getLayoutParams()).topMargin;
            }

            /* renamed from: c */
            public int mo5724c() {
                return C1747p.this.getPaddingTop();
            }

            /* renamed from: d */
            public int mo5725d() {
                return C1747p.this.mo5684i0() - C1747p.this.getPaddingBottom();
            }

            /* renamed from: e */
            public int mo5726e(View view) {
                return C1747p.this.mo5668a0(view) + ((C1752q) view.getLayoutParams()).bottomMargin;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$p$c */
        public interface C1750c {
            /* renamed from: a */
            void mo5727a(int i, int i2);
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$p$d */
        public static class C1751d {

            /* renamed from: a */
            public int f5202a;

            /* renamed from: b */
            public int f5203b;

            /* renamed from: c */
            public boolean f5204c;

            /* renamed from: d */
            public boolean f5205d;
        }

        public C1747p() {
            C1748a aVar = new C1748a();
            this.f5184f = aVar;
            C1749b bVar = new C1749b();
            this.f5185g = bVar;
            this.f5186h = new C1836x(aVar);
            this.f5187i = new C1836x(bVar);
        }

        /* renamed from: D0 */
        private boolean m6424D0(RecyclerView recyclerView, int i, int i2) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int x0 = mo5716x0() - getPaddingRight();
            int i0 = mo5684i0() - getPaddingBottom();
            Rect rect = this.f5183e.f5093m;
            mo5669b0(focusedChild, rect);
            if (rect.left - i >= x0 || rect.right - i <= paddingLeft || rect.top - i2 >= i0 || rect.bottom - i2 <= paddingTop) {
                return false;
            }
            return true;
        }

        /* renamed from: H0 */
        private static boolean m6425H0(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (i3 > 0 && i != i3) {
                return false;
            }
            if (mode != Integer.MIN_VALUE) {
                if (mode == 0) {
                    return true;
                }
                if (mode == 1073741824 && size == i) {
                    return true;
                }
                return false;
            } else if (size >= i) {
                return true;
            } else {
                return false;
            }
        }

        /* renamed from: H1 */
        private void m6426H1(C1759w wVar, int i, View view) {
            C1734f0 o0 = RecyclerView.m6198o0(view);
            if (!o0.shouldIgnore()) {
                if (!o0.isInvalid() || o0.isRemoved() || this.f5183e.f5099p.hasStableIds()) {
                    mo5635J(i);
                    wVar.mo5761J(view);
                    this.f5183e.f5087j.mo6094k(o0);
                    return;
                }
                mo5624C1(i);
                wVar.mo5760I(o0);
            }
        }

        /* renamed from: K */
        private void m6427K(int i, View view) {
            this.f5182d.mo5919d(i);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
            if (r5 == 1073741824) goto L_0x0020;
         */
        /* renamed from: W */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static int m6428W(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L_0x001a
                if (r7 < 0) goto L_0x0011
                goto L_0x001c
            L_0x0011:
                if (r7 != r1) goto L_0x002f
                if (r5 == r2) goto L_0x0020
                if (r5 == 0) goto L_0x002f
                if (r5 == r3) goto L_0x0020
                goto L_0x002f
            L_0x001a:
                if (r7 < 0) goto L_0x001e
            L_0x001c:
                r5 = r3
                goto L_0x0031
            L_0x001e:
                if (r7 != r1) goto L_0x0022
            L_0x0020:
                r7 = r4
                goto L_0x0031
            L_0x0022:
                if (r7 != r0) goto L_0x002f
                if (r5 == r2) goto L_0x002c
                if (r5 != r3) goto L_0x0029
                goto L_0x002c
            L_0x0029:
                r7 = r4
                r5 = r6
                goto L_0x0031
            L_0x002c:
                r7 = r4
                r5 = r2
                goto L_0x0031
            L_0x002f:
                r5 = r6
                r7 = r5
            L_0x0031:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C1747p.m6428W(int, int, int, int, boolean):int");
        }

        /* renamed from: X */
        private int[] m6429X(View view, Rect rect) {
            int[] iArr = new int[2];
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int x0 = mo5716x0() - getPaddingRight();
            int i0 = mo5684i0() - getPaddingBottom();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width = rect.width() + left;
            int height = rect.height() + top;
            int i = left - paddingLeft;
            int min = Math.min(0, i);
            int i2 = top - paddingTop;
            int min2 = Math.min(0, i2);
            int i3 = width - x0;
            int max = Math.max(0, i3);
            int max2 = Math.max(0, height - i0);
            if (mo5692m0() != 1) {
                if (min == 0) {
                    min = Math.min(i, max);
                }
                max = min;
            } else if (max == 0) {
                max = Math.max(min, i3);
            }
            if (min2 == 0) {
                min2 = Math.min(i2, max2);
            }
            iArr[0] = max;
            iArr[1] = min2;
            return iArr;
        }

        /* renamed from: p */
        private void m6430p(View view, int i, boolean z) {
            C1734f0 o0 = RecyclerView.m6198o0(view);
            if (z || o0.isRemoved()) {
                this.f5183e.f5087j.mo6085b(o0);
            } else {
                this.f5183e.f5087j.mo6098p(o0);
            }
            C1752q qVar = (C1752q) view.getLayoutParams();
            if (o0.wasReturnedFromScrap() || o0.isScrap()) {
                if (o0.isScrap()) {
                    o0.unScrap();
                } else {
                    o0.clearReturnedFromScrapFlag();
                }
                this.f5182d.mo5918c(view, i, view.getLayoutParams(), false);
            } else if (view.getParent() == this.f5183e) {
                int m = this.f5182d.mo5926m(view);
                if (i == -1) {
                    i = this.f5182d.mo5922g();
                }
                if (m == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f5183e.indexOfChild(view) + this.f5183e.mo5292V());
                } else if (m != i) {
                    this.f5183e.f5101q.mo5642M0(m, i);
                }
            } else {
                this.f5182d.mo5916a(view, i, false);
                qVar.f5208f = true;
                C1722a0 a0Var = this.f5188j;
                if (a0Var != null && a0Var.mo5444h()) {
                    this.f5188j.mo5447k(view);
                }
            }
            if (qVar.f5209g) {
                o0.itemView.invalidate();
                qVar.f5209g = false;
            }
        }

        /* renamed from: r0 */
        public static C1751d m6431r0(Context context, AttributeSet attributeSet, int i, int i2) {
            C1751d dVar = new C1751d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C8306c.f23539a, i, i2);
            dVar.f5202a = obtainStyledAttributes.getInt(C8306c.f23540b, 1);
            dVar.f5203b = obtainStyledAttributes.getInt(C8306c.f23550l, 1);
            dVar.f5204c = obtainStyledAttributes.getBoolean(C8306c.f23549k, false);
            dVar.f5205d = obtainStyledAttributes.getBoolean(C8306c.f23551m, false);
            obtainStyledAttributes.recycle();
            return dVar;
        }

        /* renamed from: y */
        public static int m6432y(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            if (mode == Integer.MIN_VALUE) {
                return Math.min(size, Math.max(i2, i3));
            }
            if (mode != 1073741824) {
                return Math.max(i2, i3);
            }
            return size;
        }

        /* renamed from: A */
        public void mo5188A(int i, C1750c cVar) {
        }

        /* renamed from: A0 */
        public void mo5620A0(View view) {
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = this.f5183e;
            if (parent != recyclerView || recyclerView.indexOfChild(view) == -1) {
                throw new IllegalArgumentException("View should be fully attached to be ignored" + this.f5183e.mo5292V());
            }
            C1734f0 o0 = RecyclerView.m6198o0(view);
            o0.addFlags(128);
            this.f5183e.f5087j.mo6099q(o0);
        }

        /* renamed from: A1 */
        public boolean mo5621A1(Runnable runnable) {
            RecyclerView recyclerView = this.f5183e;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        /* renamed from: B */
        public abstract int mo5190B(C1726b0 b0Var);

        /* renamed from: B0 */
        public boolean mo5622B0() {
            return this.f5190l;
        }

        /* renamed from: B1 */
        public void mo5623B1(View view) {
            this.f5182d.mo5929p(view);
        }

        /* renamed from: C */
        public abstract int mo5146C(C1726b0 b0Var);

        /* renamed from: C0 */
        public boolean mo5192C0() {
            return this.f5191m;
        }

        /* renamed from: C1 */
        public void mo5624C1(int i) {
            if (mo5658U(i) != null) {
                this.f5182d.mo5930q(i);
            }
        }

        /* renamed from: D */
        public abstract int mo5147D(C1726b0 b0Var);

        /* renamed from: D1 */
        public boolean mo5625D1(RecyclerView recyclerView, View view, Rect rect, boolean z) {
            return mo5627E1(recyclerView, view, rect, z, false);
        }

        /* renamed from: E */
        public abstract int mo5195E(C1726b0 b0Var);

        /* renamed from: E0 */
        public final boolean mo5626E0() {
            return this.f5193o;
        }

        /* renamed from: E1 */
        public boolean mo5627E1(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            int[] X = m6429X(view, rect);
            int i = X[0];
            int i2 = X[1];
            if ((z2 && !m6424D0(recyclerView, i, i2)) || (i == 0 && i2 == 0)) {
                return false;
            }
            if (z) {
                recyclerView.scrollBy(i, i2);
            } else {
                recyclerView.mo5253C1(i, i2);
            }
            return true;
        }

        /* renamed from: F */
        public abstract int mo5148F(C1726b0 b0Var);

        /* renamed from: F0 */
        public boolean mo5628F0(C1759w wVar, C1726b0 b0Var) {
            return false;
        }

        /* renamed from: F1 */
        public void mo5629F1() {
            RecyclerView recyclerView = this.f5183e;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        /* renamed from: G */
        public abstract int mo5150G(C1726b0 b0Var);

        /* renamed from: G0 */
        public boolean mo5630G0() {
            return this.f5192n;
        }

        /* renamed from: G1 */
        public void mo5631G1() {
            this.f5189k = true;
        }

        /* renamed from: H */
        public void mo5632H(C1759w wVar) {
            for (int V = mo5660V() - 1; V >= 0; V--) {
                m6426H1(wVar, V, mo5658U(V));
            }
        }

        /* renamed from: I */
        public void mo5633I(View view) {
            int m = this.f5182d.mo5926m(view);
            if (m >= 0) {
                m6427K(m, view);
            }
        }

        /* renamed from: I0 */
        public boolean mo5634I0() {
            C1722a0 a0Var = this.f5188j;
            return a0Var != null && a0Var.mo5444h();
        }

        /* renamed from: I1 */
        public abstract int mo5152I1(int i, C1759w wVar, C1726b0 b0Var);

        /* renamed from: J */
        public void mo5635J(int i) {
            m6427K(i, mo5658U(i));
        }

        /* renamed from: J0 */
        public boolean mo5636J0(View view, boolean z, boolean z2) {
            boolean z3;
            if (!this.f5186h.mo6078b(view, 24579) || !this.f5187i.mo6078b(view, 24579)) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (z) {
                return z3;
            }
            return !z3;
        }

        /* renamed from: J1 */
        public abstract void mo5197J1(int i);

        /* renamed from: K0 */
        public void mo5637K0(View view, int i, int i2, int i3, int i4) {
            C1752q qVar = (C1752q) view.getLayoutParams();
            Rect rect = qVar.f5207e;
            view.layout(i + rect.left + qVar.leftMargin, i2 + rect.top + qVar.topMargin, (i3 - rect.right) - qVar.rightMargin, (i4 - rect.bottom) - qVar.bottomMargin);
        }

        /* renamed from: K1 */
        public abstract int mo5153K1(int i, C1759w wVar, C1726b0 b0Var);

        /* access modifiers changed from: package-private */
        /* renamed from: L */
        public void mo5638L(RecyclerView recyclerView) {
            this.f5190l = true;
            mo5652R0(recyclerView);
        }

        /* renamed from: L0 */
        public void mo5639L0(View view, int i, int i2) {
            C1752q qVar = (C1752q) view.getLayoutParams();
            Rect t0 = this.f5183e.mo5416t0(view);
            int i3 = i + t0.left + t0.right;
            int i4 = i2 + t0.top + t0.bottom;
            int W = m6428W(mo5716x0(), mo5718y0(), getPaddingLeft() + getPaddingRight() + qVar.leftMargin + qVar.rightMargin + i3, qVar.width, mo5226v());
            int W2 = m6428W(mo5684i0(), mo5685j0(), getPaddingTop() + getPaddingBottom() + qVar.topMargin + qVar.bottomMargin + i4, qVar.height, mo5227w());
            if (mo5656S1(view, W, W2, qVar)) {
                view.measure(W, W2);
            }
        }

        /* renamed from: L1 */
        public void mo5640L1(boolean z) {
            this.f5191m = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: M */
        public void mo5641M(RecyclerView recyclerView, C1759w wVar) {
            this.f5190l = false;
            mo5205T0(recyclerView, wVar);
        }

        /* renamed from: M0 */
        public void mo5642M0(int i, int i2) {
            View U = mo5658U(i);
            if (U != null) {
                mo5635J(i);
                mo5704s(U, i2);
                return;
            }
            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i + this.f5183e.toString());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: M1 */
        public void mo5643M1(RecyclerView recyclerView) {
            mo5646N1(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        /* renamed from: N */
        public View mo5644N(View view) {
            View Y;
            RecyclerView recyclerView = this.f5183e;
            if (recyclerView == null || (Y = recyclerView.mo5297Y(view)) == null || this.f5182d.mo5927n(Y)) {
                return null;
            }
            return Y;
        }

        /* renamed from: N0 */
        public void mo5645N0(int i) {
            RecyclerView recyclerView = this.f5183e;
            if (recyclerView != null) {
                recyclerView.mo5274M0(i);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: N1 */
        public void mo5646N1(int i, int i2) {
            this.f5198t = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            this.f5196r = mode;
            if (mode == 0 && !RecyclerView.f5037H0) {
                this.f5198t = 0;
            }
            this.f5199u = View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.f5197s = mode2;
            if (mode2 == 0 && !RecyclerView.f5037H0) {
                this.f5199u = 0;
            }
        }

        /* renamed from: O */
        public View mo5199O(int i) {
            int V = mo5660V();
            for (int i2 = 0; i2 < V; i2++) {
                View U = mo5658U(i2);
                C1734f0 o0 = RecyclerView.m6198o0(U);
                if (o0 != null && o0.getLayoutPosition() == i && !o0.shouldIgnore() && (this.f5183e.f5092l0.mo5464e() || !o0.isRemoved())) {
                    return U;
                }
            }
            return null;
        }

        /* renamed from: O0 */
        public void mo5647O0(int i) {
            RecyclerView recyclerView = this.f5183e;
            if (recyclerView != null) {
                recyclerView.mo5277N0(i);
            }
        }

        /* renamed from: O1 */
        public void mo5648O1(int i, int i2) {
            this.f5183e.setMeasuredDimension(i, i2);
        }

        /* renamed from: P */
        public abstract C1752q mo5154P();

        /* renamed from: P0 */
        public void mo5649P0(C1736h hVar, C1736h hVar2) {
        }

        /* renamed from: P1 */
        public void mo5155P1(Rect rect, int i, int i2) {
            mo5648O1(m6432y(i, rect.width() + getPaddingLeft() + getPaddingRight(), mo5698p0()), m6432y(i2, rect.height() + getPaddingTop() + getPaddingBottom(), mo5697o0()));
        }

        /* renamed from: Q */
        public C1752q mo5156Q(Context context, AttributeSet attributeSet) {
            return new C1752q(context, attributeSet);
        }

        /* renamed from: Q0 */
        public boolean mo5650Q0(RecyclerView recyclerView, ArrayList arrayList, int i, int i2) {
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: Q1 */
        public void mo5651Q1(int i, int i2) {
            int V = mo5660V();
            if (V == 0) {
                this.f5183e.mo5251C(i, i2);
                return;
            }
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MAX_VALUE;
            int i5 = Integer.MIN_VALUE;
            int i6 = Integer.MAX_VALUE;
            for (int i7 = 0; i7 < V; i7++) {
                View U = mo5658U(i7);
                Rect rect = this.f5183e.f5093m;
                mo5669b0(U, rect);
                int i8 = rect.left;
                if (i8 < i6) {
                    i6 = i8;
                }
                int i9 = rect.right;
                if (i9 > i3) {
                    i3 = i9;
                }
                int i12 = rect.top;
                if (i12 < i4) {
                    i4 = i12;
                }
                int i13 = rect.bottom;
                if (i13 > i5) {
                    i5 = i13;
                }
            }
            this.f5183e.f5093m.set(i6, i4, i3, i5);
            mo5155P1(this.f5183e.f5093m, i, i2);
        }

        /* renamed from: R */
        public C1752q mo5157R(ViewGroup.LayoutParams layoutParams) {
            if (layoutParams instanceof C1752q) {
                return new C1752q((C1752q) layoutParams);
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                return new C1752q((ViewGroup.MarginLayoutParams) layoutParams);
            }
            return new C1752q(layoutParams);
        }

        /* renamed from: R0 */
        public void mo5652R0(RecyclerView recyclerView) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: R1 */
        public void mo5653R1(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.f5183e = null;
                this.f5182d = null;
                this.f5198t = 0;
                this.f5199u = 0;
            } else {
                this.f5183e = recyclerView;
                this.f5182d = recyclerView.f5085i;
                this.f5198t = recyclerView.getWidth();
                this.f5199u = recyclerView.getHeight();
            }
            this.f5196r = 1073741824;
            this.f5197s = 1073741824;
        }

        /* renamed from: S */
        public int mo5654S() {
            return -1;
        }

        /* renamed from: S0 */
        public void mo5655S0(RecyclerView recyclerView) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: S1 */
        public boolean mo5656S1(View view, int i, int i2, C1752q qVar) {
            if (view.isLayoutRequested() || !this.f5192n || !m6425H0(view.getWidth(), i, qVar.width) || !m6425H0(view.getHeight(), i2, qVar.height)) {
                return true;
            }
            return false;
        }

        /* renamed from: T */
        public int mo5657T(View view) {
            return ((C1752q) view.getLayoutParams()).f5207e.bottom;
        }

        /* renamed from: T0 */
        public void mo5205T0(RecyclerView recyclerView, C1759w wVar) {
            mo5655S0(recyclerView);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: T1 */
        public boolean mo5206T1() {
            return false;
        }

        /* renamed from: U */
        public View mo5658U(int i) {
            C1782f fVar = this.f5182d;
            if (fVar != null) {
                return fVar.mo5921f(i);
            }
            return null;
        }

        /* renamed from: U0 */
        public View mo5159U0(View view, int i, C1759w wVar, C1726b0 b0Var) {
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: U1 */
        public boolean mo5659U1(View view, int i, int i2, C1752q qVar) {
            if (!this.f5192n || !m6425H0(view.getMeasuredWidth(), i, qVar.width) || !m6425H0(view.getMeasuredHeight(), i2, qVar.height)) {
                return true;
            }
            return false;
        }

        /* renamed from: V */
        public int mo5660V() {
            C1782f fVar = this.f5182d;
            if (fVar != null) {
                return fVar.mo5922g();
            }
            return 0;
        }

        /* renamed from: V0 */
        public void mo5207V0(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f5183e;
            mo5661W0(recyclerView.f5079f, recyclerView.f5092l0, accessibilityEvent);
        }

        /* renamed from: V1 */
        public abstract void mo5208V1(RecyclerView recyclerView, C1726b0 b0Var, int i);

        /* renamed from: W0 */
        public void mo5661W0(C1759w wVar, C1726b0 b0Var, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f5183e;
            if (recyclerView != null && accessibilityEvent != null) {
                boolean z = true;
                if (!recyclerView.canScrollVertically(1) && !this.f5183e.canScrollVertically(-1) && !this.f5183e.canScrollHorizontally(-1) && !this.f5183e.canScrollHorizontally(1)) {
                    z = false;
                }
                accessibilityEvent.setScrollable(z);
                C1736h hVar = this.f5183e.f5099p;
                if (hVar != null) {
                    accessibilityEvent.setItemCount(hVar.getItemCount());
                }
            }
        }

        /* renamed from: W1 */
        public void mo5662W1(C1722a0 a0Var) {
            C1722a0 a0Var2 = this.f5188j;
            if (!(a0Var2 == null || a0Var == a0Var2 || !a0Var2.mo5444h())) {
                this.f5188j.mo5454r();
            }
            this.f5188j = a0Var;
            a0Var.mo5453q(this.f5183e, this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: X0 */
        public void mo5663X0(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            RecyclerView recyclerView = this.f5183e;
            mo5160Y0(recyclerView.f5079f, recyclerView.f5092l0, accessibilityNodeInfoCompat);
        }

        /* renamed from: X1 */
        public void mo5664X1(View view) {
            C1734f0 o0 = RecyclerView.m6198o0(view);
            o0.stopIgnoring();
            o0.resetInternal();
            o0.addFlags(4);
        }

        /* renamed from: Y */
        public boolean mo5665Y() {
            RecyclerView recyclerView = this.f5183e;
            return recyclerView != null && recyclerView.f5089k;
        }

        /* renamed from: Y0 */
        public void mo5160Y0(C1759w wVar, C1726b0 b0Var, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            if (this.f5183e.canScrollVertically(-1) || this.f5183e.canScrollHorizontally(-1)) {
                accessibilityNodeInfoCompat.mo3594a(8192);
                accessibilityNodeInfoCompat.mo3626s0(true);
            }
            if (this.f5183e.canScrollVertically(1) || this.f5183e.canScrollHorizontally(1)) {
                accessibilityNodeInfoCompat.mo3594a(C11398b.f33143v);
                accessibilityNodeInfoCompat.mo3626s0(true);
            }
            accessibilityNodeInfoCompat.mo3595a0(AccessibilityNodeInfoCompat.CollectionInfoCompat.m4048a(mo5174t0(wVar, b0Var), mo5161Z(wVar, b0Var), mo5628F0(wVar, b0Var), mo5710u0(wVar, b0Var)));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: Y1 */
        public void mo5666Y1() {
            C1722a0 a0Var = this.f5188j;
            if (a0Var != null) {
                a0Var.mo5454r();
            }
        }

        /* renamed from: Z */
        public int mo5161Z(C1759w wVar, C1726b0 b0Var) {
            return -1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: Z0 */
        public void mo5667Z0(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            C1734f0 o0 = RecyclerView.m6198o0(view);
            if (o0 != null && !o0.isRemoved() && !this.f5182d.mo5927n(o0.itemView)) {
                RecyclerView recyclerView = this.f5183e;
                mo5163a1(recyclerView.f5079f, recyclerView.f5092l0, view, accessibilityNodeInfoCompat);
            }
        }

        /* renamed from: Z1 */
        public boolean mo5162Z1() {
            return false;
        }

        /* renamed from: a0 */
        public int mo5668a0(View view) {
            return view.getBottom() + mo5657T(view);
        }

        /* renamed from: a1 */
        public void mo5163a1(C1759w wVar, C1726b0 b0Var, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        }

        /* renamed from: b0 */
        public void mo5669b0(View view, Rect rect) {
            RecyclerView.m6200q0(view, rect);
        }

        /* renamed from: b1 */
        public View mo5670b1(View view, int i) {
            return null;
        }

        /* renamed from: c0 */
        public int mo5671c0(View view) {
            return view.getLeft() - mo5695n0(view);
        }

        /* renamed from: c1 */
        public void mo5165c1(RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: d0 */
        public int mo5672d0(View view) {
            Rect rect = ((C1752q) view.getLayoutParams()).f5207e;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        /* renamed from: d1 */
        public void mo5166d1(RecyclerView recyclerView) {
        }

        /* renamed from: e0 */
        public int mo5673e0(View view) {
            Rect rect = ((C1752q) view.getLayoutParams()).f5207e;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        /* renamed from: e1 */
        public void mo5167e1(RecyclerView recyclerView, int i, int i2, int i3) {
        }

        /* renamed from: f0 */
        public int mo5674f0(View view) {
            return view.getRight() + mo5705s0(view);
        }

        /* renamed from: f1 */
        public void mo5168f1(RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: g0 */
        public int mo5675g0(View view) {
            return view.getTop() - mo5712v0(view);
        }

        /* renamed from: g1 */
        public void mo5676g1(RecyclerView recyclerView, int i, int i2) {
        }

        public int getPaddingBottom() {
            RecyclerView recyclerView = this.f5183e;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public int getPaddingEnd() {
            RecyclerView recyclerView = this.f5183e;
            if (recyclerView != null) {
                return ViewCompat.m3549F(recyclerView);
            }
            return 0;
        }

        public int getPaddingLeft() {
            RecyclerView recyclerView = this.f5183e;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public int getPaddingRight() {
            RecyclerView recyclerView = this.f5183e;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public int getPaddingStart() {
            RecyclerView recyclerView = this.f5183e;
            if (recyclerView != null) {
                return ViewCompat.m3551G(recyclerView);
            }
            return 0;
        }

        public int getPaddingTop() {
            RecyclerView recyclerView = this.f5183e;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        /* renamed from: h0 */
        public View mo5683h0() {
            View focusedChild;
            RecyclerView recyclerView = this.f5183e;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f5182d.mo5927n(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        /* renamed from: h1 */
        public void mo5169h1(RecyclerView recyclerView, int i, int i2, Object obj) {
            mo5676g1(recyclerView, i, i2);
        }

        /* renamed from: i0 */
        public int mo5684i0() {
            return this.f5199u;
        }

        /* renamed from: i1 */
        public abstract void mo5170i1(C1759w wVar, C1726b0 b0Var);

        /* renamed from: j0 */
        public int mo5685j0() {
            return this.f5197s;
        }

        /* renamed from: j1 */
        public void mo5171j1(C1726b0 b0Var) {
        }

        /* renamed from: k0 */
        public int mo5686k0() {
            C1736h hVar;
            RecyclerView recyclerView = this.f5183e;
            if (recyclerView != null) {
                hVar = recyclerView.getAdapter();
            } else {
                hVar = null;
            }
            if (hVar != null) {
                return hVar.getItemCount();
            }
            return 0;
        }

        /* renamed from: k1 */
        public void mo5687k1(C1759w wVar, C1726b0 b0Var, int i, int i2) {
            this.f5183e.mo5251C(i, i2);
        }

        /* renamed from: l */
        public void mo5688l(View view) {
            mo5691m(view, -1);
        }

        /* renamed from: l0 */
        public int mo5689l0(View view) {
            return RecyclerView.m6198o0(view).getItemViewType();
        }

        /* renamed from: l1 */
        public boolean mo5690l1(RecyclerView recyclerView, View view, View view2) {
            return mo5634I0() || recyclerView.mo5262G0();
        }

        /* renamed from: m */
        public void mo5691m(View view, int i) {
            m6430p(view, i, true);
        }

        /* renamed from: m0 */
        public int mo5692m0() {
            return ViewCompat.m3541B(this.f5183e);
        }

        /* renamed from: m1 */
        public boolean mo5693m1(RecyclerView recyclerView, C1726b0 b0Var, View view, View view2) {
            return mo5690l1(recyclerView, view, view2);
        }

        /* renamed from: n */
        public void mo5694n(View view) {
            mo5696o(view, -1);
        }

        /* renamed from: n0 */
        public int mo5695n0(View view) {
            return ((C1752q) view.getLayoutParams()).f5207e.left;
        }

        /* renamed from: n1 */
        public abstract void mo5218n1(Parcelable parcelable);

        /* renamed from: o */
        public void mo5696o(View view, int i) {
            m6430p(view, i, false);
        }

        /* renamed from: o0 */
        public int mo5697o0() {
            return ViewCompat.m3543C(this.f5183e);
        }

        /* renamed from: o1 */
        public abstract Parcelable mo5220o1();

        /* renamed from: p0 */
        public int mo5698p0() {
            return ViewCompat.m3545D(this.f5183e);
        }

        /* renamed from: p1 */
        public void mo5699p1(int i) {
        }

        /* renamed from: q */
        public void mo5222q(String str) {
            RecyclerView recyclerView = this.f5183e;
            if (recyclerView != null) {
                recyclerView.mo5383r(str);
            }
        }

        /* renamed from: q0 */
        public int mo5700q0(View view) {
            return ((C1752q) view.getLayoutParams()).mo5729b();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q1 */
        public void mo5701q1(C1722a0 a0Var) {
            if (this.f5188j == a0Var) {
                this.f5188j = null;
            }
        }

        /* renamed from: r */
        public void mo5702r(View view) {
            mo5704s(view, -1);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r1 */
        public boolean mo5703r1(int i, Bundle bundle) {
            RecyclerView recyclerView = this.f5183e;
            return mo5706s1(recyclerView.f5079f, recyclerView.f5092l0, i, bundle);
        }

        /* renamed from: s */
        public void mo5704s(View view, int i) {
            mo5707t(view, i, (C1752q) view.getLayoutParams());
        }

        /* renamed from: s0 */
        public int mo5705s0(View view) {
            return ((C1752q) view.getLayoutParams()).f5207e.right;
        }

        /* JADX WARNING: Removed duplicated region for block: B:30:0x0093 A[ADDED_TO_REGION] */
        /* renamed from: s1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo5706s1(androidx.recyclerview.widget.RecyclerView.C1759w r9, androidx.recyclerview.widget.RecyclerView.C1726b0 r10, int r11, android.os.Bundle r12) {
            /*
                r8 = this;
                androidx.recyclerview.widget.RecyclerView r9 = r8.f5183e
                r10 = 0
                if (r9 != 0) goto L_0x0006
                return r10
            L_0x0006:
                int r9 = r8.mo5684i0()
                int r12 = r8.mo5716x0()
                android.graphics.Rect r0 = new android.graphics.Rect
                r0.<init>()
                androidx.recyclerview.widget.RecyclerView r1 = r8.f5183e
                android.graphics.Matrix r1 = r1.getMatrix()
                boolean r1 = r1.isIdentity()
                if (r1 == 0) goto L_0x002f
                androidx.recyclerview.widget.RecyclerView r1 = r8.f5183e
                boolean r1 = r1.getGlobalVisibleRect(r0)
                if (r1 == 0) goto L_0x002f
                int r9 = r0.height()
                int r12 = r0.width()
            L_0x002f:
                r0 = 4096(0x1000, float:5.74E-42)
                r1 = 1
                if (r11 == r0) goto L_0x0065
                r0 = 8192(0x2000, float:1.14794E-41)
                if (r11 == r0) goto L_0x003b
                r3 = r10
                r4 = r3
                goto L_0x0091
            L_0x003b:
                androidx.recyclerview.widget.RecyclerView r11 = r8.f5183e
                r0 = -1
                boolean r11 = r11.canScrollVertically(r0)
                if (r11 == 0) goto L_0x0050
                int r11 = r8.getPaddingTop()
                int r9 = r9 - r11
                int r11 = r8.getPaddingBottom()
                int r9 = r9 - r11
                int r9 = -r9
                goto L_0x0051
            L_0x0050:
                r9 = r10
            L_0x0051:
                androidx.recyclerview.widget.RecyclerView r11 = r8.f5183e
                boolean r11 = r11.canScrollHorizontally(r0)
                if (r11 == 0) goto L_0x008f
                int r11 = r8.getPaddingLeft()
                int r12 = r12 - r11
                int r11 = r8.getPaddingRight()
                int r12 = r12 - r11
                int r11 = -r12
                goto L_0x008c
            L_0x0065:
                androidx.recyclerview.widget.RecyclerView r11 = r8.f5183e
                boolean r11 = r11.canScrollVertically(r1)
                if (r11 == 0) goto L_0x0078
                int r11 = r8.getPaddingTop()
                int r9 = r9 - r11
                int r11 = r8.getPaddingBottom()
                int r9 = r9 - r11
                goto L_0x0079
            L_0x0078:
                r9 = r10
            L_0x0079:
                androidx.recyclerview.widget.RecyclerView r11 = r8.f5183e
                boolean r11 = r11.canScrollHorizontally(r1)
                if (r11 == 0) goto L_0x008f
                int r11 = r8.getPaddingLeft()
                int r12 = r12 - r11
                int r11 = r8.getPaddingRight()
                int r11 = r12 - r11
            L_0x008c:
                r4 = r9
                r3 = r11
                goto L_0x0091
            L_0x008f:
                r4 = r9
                r3 = r10
            L_0x0091:
                if (r4 != 0) goto L_0x0096
                if (r3 != 0) goto L_0x0096
                return r10
            L_0x0096:
                androidx.recyclerview.widget.RecyclerView r2 = r8.f5183e
                r5 = 0
                r6 = -2147483648(0xffffffff80000000, float:-0.0)
                r7 = 1
                r2.mo5261F1(r3, r4, r5, r6, r7)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C1747p.mo5706s1(androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$b0, int, android.os.Bundle):boolean");
        }

        /* renamed from: t */
        public void mo5707t(View view, int i, C1752q qVar) {
            C1734f0 o0 = RecyclerView.m6198o0(view);
            if (o0.isRemoved()) {
                this.f5183e.f5087j.mo6085b(o0);
            } else {
                this.f5183e.f5087j.mo6098p(o0);
            }
            this.f5182d.mo5918c(view, i, qVar, o0.isRemoved());
        }

        /* renamed from: t0 */
        public int mo5174t0(C1759w wVar, C1726b0 b0Var) {
            return -1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: t1 */
        public boolean mo5708t1(View view, int i, Bundle bundle) {
            RecyclerView recyclerView = this.f5183e;
            return mo5711u1(recyclerView.f5079f, recyclerView.f5092l0, view, i, bundle);
        }

        /* renamed from: u */
        public void mo5709u(View view, Rect rect) {
            RecyclerView recyclerView = this.f5183e;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.mo5416t0(view));
            }
        }

        /* renamed from: u0 */
        public int mo5710u0(C1759w wVar, C1726b0 b0Var) {
            return 0;
        }

        /* renamed from: u1 */
        public boolean mo5711u1(C1759w wVar, C1726b0 b0Var, View view, int i, Bundle bundle) {
            return false;
        }

        /* renamed from: v */
        public abstract boolean mo5226v();

        /* renamed from: v0 */
        public int mo5712v0(View view) {
            return ((C1752q) view.getLayoutParams()).f5207e.top;
        }

        /* renamed from: v1 */
        public void mo5713v1() {
            for (int V = mo5660V() - 1; V >= 0; V--) {
                this.f5182d.mo5930q(V);
            }
        }

        /* renamed from: w */
        public abstract boolean mo5227w();

        /* renamed from: w0 */
        public void mo5714w0(View view, boolean z, Rect rect) {
            Matrix matrix;
            if (z) {
                Rect rect2 = ((C1752q) view.getLayoutParams()).f5207e;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (!(this.f5183e == null || (matrix = view.getMatrix()) == null || matrix.isIdentity())) {
                RectF rectF = this.f5183e.f5097o;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        /* renamed from: w1 */
        public void mo5715w1(C1759w wVar) {
            for (int V = mo5660V() - 1; V >= 0; V--) {
                if (!RecyclerView.m6198o0(mo5658U(V)).shouldIgnore()) {
                    mo5721z1(V, wVar);
                }
            }
        }

        /* renamed from: x */
        public boolean mo5178x(C1752q qVar) {
            return qVar != null;
        }

        /* renamed from: x0 */
        public int mo5716x0() {
            return this.f5198t;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: x1 */
        public void mo5717x1(C1759w wVar) {
            int k = wVar.mo5779k();
            for (int i = k - 1; i >= 0; i--) {
                View o = wVar.mo5783o(i);
                C1734f0 o0 = RecyclerView.m6198o0(o);
                if (!o0.shouldIgnore()) {
                    o0.setIsRecyclable(false);
                    if (o0.isTmpDetached()) {
                        this.f5183e.removeDetachedView(o, false);
                    }
                    C1742m mVar = this.f5183e.f5065Q;
                    if (mVar != null) {
                        mVar.mo5598j(o0);
                    }
                    o0.setIsRecyclable(true);
                    wVar.mo5756E(o);
                }
            }
            wVar.mo5774f();
            if (k > 0) {
                this.f5183e.invalidate();
            }
        }

        /* renamed from: y0 */
        public int mo5718y0() {
            return this.f5196r;
        }

        /* renamed from: y1 */
        public void mo5719y1(View view, C1759w wVar) {
            mo5623B1(view);
            wVar.mo5759H(view);
        }

        /* renamed from: z */
        public void mo5228z(int i, int i2, C1726b0 b0Var, C1750c cVar) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: z0 */
        public boolean mo5720z0() {
            int V = mo5660V();
            for (int i = 0; i < V; i++) {
                ViewGroup.LayoutParams layoutParams = mo5658U(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: z1 */
        public void mo5721z1(int i, C1759w wVar) {
            View U = mo5658U(i);
            mo5624C1(i);
            wVar.mo5759H(U);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$r */
    public interface C1753r {
        /* renamed from: a */
        void mo5733a(View view);

        /* renamed from: b */
        void mo5734b(View view);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$s */
    public static abstract class C1754s {
        /* renamed from: a */
        public abstract boolean mo5735a(int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$t */
    public interface C1755t {
        /* renamed from: a */
        void mo5736a(RecyclerView recyclerView, MotionEvent motionEvent);

        /* renamed from: b */
        boolean mo5737b(RecyclerView recyclerView, MotionEvent motionEvent);

        /* renamed from: c */
        void mo5738c(boolean z);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$u */
    public static abstract class C1756u {
        /* renamed from: d */
        public void mo5739d(RecyclerView recyclerView, int i) {
        }

        /* renamed from: e */
        public void mo5740e(RecyclerView recyclerView, int i, int i2) {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$v */
    public static class C1757v {

        /* renamed from: a */
        SparseArray f5210a = new SparseArray();

        /* renamed from: b */
        int f5211b = 0;

        /* renamed from: c */
        Set f5212c = Collections.newSetFromMap(new IdentityHashMap());

        /* renamed from: androidx.recyclerview.widget.RecyclerView$v$a */
        static class C1758a {

            /* renamed from: a */
            final ArrayList f5213a = new ArrayList();

            /* renamed from: b */
            int f5214b = 5;

            /* renamed from: c */
            long f5215c = 0;

            /* renamed from: d */
            long f5216d = 0;

            C1758a() {
            }
        }

        /* renamed from: i */
        private C1758a m6593i(int i) {
            C1758a aVar = (C1758a) this.f5210a.get(i);
            if (aVar != null) {
                return aVar;
            }
            C1758a aVar2 = new C1758a();
            this.f5210a.put(i, aVar2);
            return aVar2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo5741a() {
            this.f5211b++;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo5742b(C1736h hVar) {
            this.f5212c.add(hVar);
        }

        /* renamed from: c */
        public void mo5743c() {
            for (int i = 0; i < this.f5210a.size(); i++) {
                C1758a aVar = (C1758a) this.f5210a.valueAt(i);
                Iterator it = aVar.f5213a.iterator();
                while (it.hasNext()) {
                    C9147a.m33773a(((C1734f0) it.next()).itemView);
                }
                aVar.f5213a.clear();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo5744d() {
            this.f5211b--;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo5745e(C1736h hVar, boolean z) {
            this.f5212c.remove(hVar);
            if (this.f5212c.size() == 0 && !z) {
                for (int i = 0; i < this.f5210a.size(); i++) {
                    SparseArray sparseArray = this.f5210a;
                    ArrayList arrayList = ((C1758a) sparseArray.get(sparseArray.keyAt(i))).f5213a;
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        C9147a.m33773a(((C1734f0) arrayList.get(i2)).itemView);
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo5746f(int i, long j) {
            C1758a i2 = m6593i(i);
            i2.f5216d = mo5751l(i2.f5216d, j);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo5747g(int i, long j) {
            C1758a i2 = m6593i(i);
            i2.f5215c = mo5751l(i2.f5215c, j);
        }

        /* renamed from: h */
        public C1734f0 mo5748h(int i) {
            C1758a aVar = (C1758a) this.f5210a.get(i);
            if (aVar == null || aVar.f5213a.isEmpty()) {
                return null;
            }
            ArrayList arrayList = aVar.f5213a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!((C1734f0) arrayList.get(size)).isAttachedToTransitionOverlay()) {
                    return (C1734f0) arrayList.remove(size);
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo5749j(C1736h hVar, C1736h hVar2, boolean z) {
            if (hVar != null) {
                mo5744d();
            }
            if (!z && this.f5211b == 0) {
                mo5743c();
            }
            if (hVar2 != null) {
                mo5741a();
            }
        }

        /* renamed from: k */
        public void mo5750k(C1734f0 f0Var) {
            int itemViewType = f0Var.getItemViewType();
            ArrayList arrayList = m6593i(itemViewType).f5213a;
            if (((C1758a) this.f5210a.get(itemViewType)).f5214b <= arrayList.size()) {
                C9147a.m33773a(f0Var.itemView);
                return;
            }
            f0Var.resetInternal();
            arrayList.add(f0Var);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public long mo5751l(long j, long j2) {
            return j == 0 ? j2 : ((j / 4) * 3) + (j2 / 4);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public boolean mo5752m(int i, long j, long j2) {
            long j3 = m6593i(i).f5216d;
            return j3 == 0 || j + j3 < j2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public boolean mo5753n(int i, long j, long j2) {
            long j3 = m6593i(i).f5215c;
            return j3 == 0 || j + j3 < j2;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$w */
    public final class C1759w {

        /* renamed from: a */
        final ArrayList f5217a;

        /* renamed from: b */
        ArrayList f5218b = null;

        /* renamed from: c */
        final ArrayList f5219c = new ArrayList();

        /* renamed from: d */
        private final List f5220d;

        /* renamed from: e */
        private int f5221e;

        /* renamed from: f */
        int f5222f;

        /* renamed from: g */
        C1757v f5223g;

        public C1759w() {
            ArrayList arrayList = new ArrayList();
            this.f5217a = arrayList;
            this.f5220d = Collections.unmodifiableList(arrayList);
            this.f5221e = 2;
            this.f5222f = 2;
        }

        /* renamed from: C */
        private void m6607C(C1736h hVar) {
            m6608D(hVar, false);
        }

        /* renamed from: D */
        private void m6608D(C1736h hVar, boolean z) {
            C1757v vVar = this.f5223g;
            if (vVar != null) {
                vVar.mo5745e(hVar, z);
            }
        }

        /* renamed from: N */
        private boolean m6609N(C1734f0 f0Var, int i, int i2, long j) {
            f0Var.mBindingAdapter = null;
            f0Var.mOwnerRecyclerView = RecyclerView.this;
            int itemViewType = f0Var.getItemViewType();
            long nanoTime = RecyclerView.this.getNanoTime();
            if (j != Long.MAX_VALUE && !this.f5223g.mo5752m(itemViewType, nanoTime, j)) {
                return false;
            }
            RecyclerView.this.f5099p.bindViewHolder(f0Var, i);
            this.f5223g.mo5746f(f0Var.getItemViewType(), RecyclerView.this.getNanoTime() - nanoTime);
            m6610b(f0Var);
            if (!RecyclerView.this.f5092l0.mo5464e()) {
                return true;
            }
            f0Var.mPreLayoutPosition = i2;
            return true;
        }

        /* renamed from: b */
        private void m6610b(C1734f0 f0Var) {
            if (RecyclerView.this.mo5260F0()) {
                View view = f0Var.itemView;
                if (ViewCompat.m3634z(view) == 0) {
                    ViewCompat.m3544C0(view, 1);
                }
                C1829t tVar = RecyclerView.this.f5106s0;
                if (tVar != null) {
                    C1055a c = tVar.mo6052c();
                    if (c instanceof C1829t.C1830a) {
                        ((C1829t.C1830a) c).mo6055d(view);
                    }
                    ViewCompat.m3619r0(view, c);
                }
            }
        }

        /* renamed from: r */
        private void m6611r(ViewGroup viewGroup, boolean z) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    m6611r((ViewGroup) childAt, true);
                }
            }
            if (z) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                    return;
                }
                int visibility = viewGroup.getVisibility();
                viewGroup.setVisibility(4);
                viewGroup.setVisibility(visibility);
            }
        }

        /* renamed from: s */
        private void m6612s(C1734f0 f0Var) {
            View view = f0Var.itemView;
            if (view instanceof ViewGroup) {
                m6611r((ViewGroup) view, false);
            }
        }

        /* renamed from: v */
        private void m6613v() {
            if (this.f5223g != null) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.f5099p != null && recyclerView.isAttachedToWindow()) {
                    this.f5223g.mo5742b(RecyclerView.this.f5099p);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: A */
        public void mo5754A() {
            m6613v();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: B */
        public void mo5755B() {
            for (int i = 0; i < this.f5219c.size(); i++) {
                C9147a.m33773a(((C1734f0) this.f5219c.get(i)).itemView);
            }
            m6607C(RecyclerView.this.f5099p);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: E */
        public void mo5756E(View view) {
            C1734f0 o0 = RecyclerView.m6198o0(view);
            o0.mScrapContainer = null;
            o0.mInChangeScrap = false;
            o0.clearReturnedFromScrapFlag();
            mo5760I(o0);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: F */
        public void mo5757F() {
            for (int size = this.f5219c.size() - 1; size >= 0; size--) {
                mo5758G(size);
            }
            this.f5219c.clear();
            if (RecyclerView.f5039J0) {
                RecyclerView.this.f5090k0.mo6006b();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: G */
        public void mo5758G(int i) {
            mo5770a((C1734f0) this.f5219c.get(i), true);
            this.f5219c.remove(i);
        }

        /* renamed from: H */
        public void mo5759H(View view) {
            C1734f0 o0 = RecyclerView.m6198o0(view);
            if (o0.isTmpDetached()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (o0.isScrap()) {
                o0.unScrap();
            } else if (o0.wasReturnedFromScrap()) {
                o0.clearReturnedFromScrapFlag();
            }
            mo5760I(o0);
            if (RecyclerView.this.f5065Q != null && !o0.isRecyclable()) {
                RecyclerView.this.f5065Q.mo5598j(o0);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: I */
        public void mo5760I(C1734f0 f0Var) {
            boolean z;
            boolean z2;
            boolean z3 = false;
            boolean z4 = true;
            if (f0Var.isScrap() || f0Var.itemView.getParent() != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Scrapped or attached views may not be recycled. isScrap:");
                sb.append(f0Var.isScrap());
                sb.append(" isAttached:");
                if (f0Var.itemView.getParent() != null) {
                    z3 = true;
                }
                sb.append(z3);
                sb.append(RecyclerView.this.mo5292V());
                throw new IllegalArgumentException(sb.toString());
            } else if (f0Var.isTmpDetached()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + f0Var + RecyclerView.this.mo5292V());
            } else if (!f0Var.shouldIgnore()) {
                boolean doesTransientStatePreventRecycling = f0Var.doesTransientStatePreventRecycling();
                C1736h hVar = RecyclerView.this.f5099p;
                if (hVar == null || !doesTransientStatePreventRecycling || !hVar.onFailedToRecycleView(f0Var)) {
                    z = false;
                } else {
                    z = true;
                }
                if (z || f0Var.isRecyclable()) {
                    if (this.f5222f <= 0 || f0Var.hasAnyOfTheFlags(526)) {
                        z2 = false;
                    } else {
                        int size = this.f5219c.size();
                        if (size >= this.f5222f && size > 0) {
                            mo5758G(0);
                            size--;
                        }
                        if (RecyclerView.f5039J0 && size > 0 && !RecyclerView.this.f5090k0.mo6008d(f0Var.mPosition)) {
                            int i = size - 1;
                            while (i >= 0) {
                                if (!RecyclerView.this.f5090k0.mo6008d(((C1734f0) this.f5219c.get(i)).mPosition)) {
                                    break;
                                }
                                i--;
                            }
                            size = i + 1;
                        }
                        this.f5219c.add(size, f0Var);
                        z2 = true;
                    }
                    if (!z2) {
                        mo5770a(f0Var, true);
                    } else {
                        z4 = false;
                    }
                    z3 = z2;
                } else {
                    z4 = false;
                }
                RecyclerView.this.f5087j.mo6099q(f0Var);
                if (!z3 && !z4 && doesTransientStatePreventRecycling) {
                    C9147a.m33773a(f0Var.itemView);
                    f0Var.mBindingAdapter = null;
                    f0Var.mOwnerRecyclerView = null;
                }
            } else {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.mo5292V());
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: J */
        public void mo5761J(View view) {
            C1734f0 o0 = RecyclerView.m6198o0(view);
            if (!o0.hasAnyOfTheFlags(12) && o0.isUpdated() && !RecyclerView.this.mo5389s(o0)) {
                if (this.f5218b == null) {
                    this.f5218b = new ArrayList();
                }
                o0.setScrapContainer(this, true);
                this.f5218b.add(o0);
            } else if (!o0.isInvalid() || o0.isRemoved() || RecyclerView.this.f5099p.hasStableIds()) {
                o0.setScrapContainer(this, false);
                this.f5217a.add(o0);
            } else {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.mo5292V());
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: K */
        public void mo5762K(C1757v vVar) {
            m6607C(RecyclerView.this.f5099p);
            C1757v vVar2 = this.f5223g;
            if (vVar2 != null) {
                vVar2.mo5744d();
            }
            this.f5223g = vVar;
            if (!(vVar == null || RecyclerView.this.getAdapter() == null)) {
                this.f5223g.mo5741a();
            }
            m6613v();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: L */
        public void mo5763L(C1730d0 d0Var) {
        }

        /* renamed from: M */
        public void mo5764M(int i) {
            this.f5221e = i;
            mo5767Q();
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x0037  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x005c  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x005f  */
        /* JADX WARNING: Removed duplicated region for block: B:66:0x014d  */
        /* JADX WARNING: Removed duplicated region for block: B:71:0x0176  */
        /* JADX WARNING: Removed duplicated region for block: B:72:0x0179  */
        /* JADX WARNING: Removed duplicated region for block: B:82:0x01a9  */
        /* JADX WARNING: Removed duplicated region for block: B:83:0x01b7  */
        /* renamed from: O */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public androidx.recyclerview.widget.RecyclerView.C1734f0 mo5765O(int r17, boolean r18, long r19) {
            /*
                r16 = this;
                r6 = r16
                r3 = r17
                r0 = r18
                if (r3 < 0) goto L_0x01da
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$b0 r1 = r1.f5092l0
                int r1 = r1.mo5461b()
                if (r3 >= r1) goto L_0x01da
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$b0 r1 = r1.f5092l0
                boolean r1 = r1.mo5464e()
                r2 = 0
                r7 = 1
                r8 = 0
                if (r1 == 0) goto L_0x0027
                androidx.recyclerview.widget.RecyclerView$f0 r1 = r16.mo5777i(r17)
                if (r1 == 0) goto L_0x0028
                r4 = r7
                goto L_0x0029
            L_0x0027:
                r1 = r2
            L_0x0028:
                r4 = r8
            L_0x0029:
                if (r1 != 0) goto L_0x005d
                androidx.recyclerview.widget.RecyclerView$f0 r1 = r16.mo5782n(r17, r18)
                if (r1 == 0) goto L_0x005d
                boolean r5 = r6.mo5768R(r1)
                if (r5 != 0) goto L_0x005c
                if (r0 != 0) goto L_0x005a
                r5 = 4
                r1.addFlags(r5)
                boolean r5 = r1.isScrap()
                if (r5 == 0) goto L_0x004e
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                android.view.View r9 = r1.itemView
                r5.removeDetachedView(r9, r8)
                r1.unScrap()
                goto L_0x0057
            L_0x004e:
                boolean r5 = r1.wasReturnedFromScrap()
                if (r5 == 0) goto L_0x0057
                r1.clearReturnedFromScrapFlag()
            L_0x0057:
                r6.mo5760I(r1)
            L_0x005a:
                r1 = r2
                goto L_0x005d
            L_0x005c:
                r4 = r7
            L_0x005d:
                if (r1 != 0) goto L_0x012c
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.a r5 = r5.f5083h
                int r5 = r5.mo5877m(r3)
                if (r5 < 0) goto L_0x00f4
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$h r9 = r9.f5099p
                int r9 = r9.getItemCount()
                if (r5 >= r9) goto L_0x00f4
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$h r9 = r9.f5099p
                int r9 = r9.getItemViewType(r5)
                androidx.recyclerview.widget.RecyclerView r10 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$h r10 = r10.f5099p
                boolean r10 = r10.hasStableIds()
                if (r10 == 0) goto L_0x0096
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$h r1 = r1.f5099p
                long r10 = r1.getItemId(r5)
                androidx.recyclerview.widget.RecyclerView$f0 r1 = r6.mo5781m(r10, r9, r0)
                if (r1 == 0) goto L_0x0096
                r1.mPosition = r5
                r4 = r7
            L_0x0096:
                if (r1 != 0) goto L_0x00ad
                androidx.recyclerview.widget.RecyclerView$v r0 = r16.mo5778j()
                androidx.recyclerview.widget.RecyclerView$f0 r0 = r0.mo5748h(r9)
                if (r0 == 0) goto L_0x00ac
                r0.resetInternal()
                boolean r1 = androidx.recyclerview.widget.RecyclerView.f5036G0
                if (r1 == 0) goto L_0x00ac
                r6.m6612s(r0)
            L_0x00ac:
                r1 = r0
            L_0x00ad:
                if (r1 != 0) goto L_0x012c
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                long r0 = r0.getNanoTime()
                r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r5 = (r19 > r10 ? 1 : (r19 == r10 ? 0 : -1))
                if (r5 == 0) goto L_0x00cb
                androidx.recyclerview.widget.RecyclerView$v r10 = r6.f5223g
                r11 = r9
                r12 = r0
                r14 = r19
                boolean r5 = r10.mo5753n(r11, r12, r14)
                if (r5 != 0) goto L_0x00cb
                return r2
            L_0x00cb:
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$h r5 = r2.f5099p
                androidx.recyclerview.widget.RecyclerView$f0 r2 = r5.createViewHolder(r2, r9)
                boolean r5 = androidx.recyclerview.widget.RecyclerView.f5039J0
                if (r5 == 0) goto L_0x00e6
                android.view.View r5 = r2.itemView
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.m6186c0(r5)
                if (r5 == 0) goto L_0x00e6
                java.lang.ref.WeakReference r10 = new java.lang.ref.WeakReference
                r10.<init>(r5)
                r2.mNestedRecyclerView = r10
            L_0x00e6:
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                long r10 = r5.getNanoTime()
                androidx.recyclerview.widget.RecyclerView$v r5 = r6.f5223g
                long r10 = r10 - r0
                r5.mo5747g(r9, r10)
                r9 = r2
                goto L_0x012d
            L_0x00f4:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Inconsistency detected. Invalid item position "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "(offset:"
                r1.append(r2)
                r1.append(r5)
                java.lang.String r2 = ").state:"
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$b0 r2 = r2.f5092l0
                int r2 = r2.mo5461b()
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = r2.mo5292V()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x012c:
                r9 = r1
            L_0x012d:
                r10 = r4
                if (r10 == 0) goto L_0x0166
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$b0 r0 = r0.f5092l0
                boolean r0 = r0.mo5464e()
                if (r0 != 0) goto L_0x0166
                r0 = 8192(0x2000, float:1.14794E-41)
                boolean r1 = r9.hasAnyOfTheFlags(r0)
                if (r1 == 0) goto L_0x0166
                r9.setFlags(r8, r0)
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$b0 r0 = r0.f5092l0
                boolean r0 = r0.f5149k
                if (r0 == 0) goto L_0x0166
                int r0 = androidx.recyclerview.widget.RecyclerView.C1742m.m6392e(r9)
                r0 = r0 | 4096(0x1000, float:5.74E-42)
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$m r2 = r1.f5065Q
                androidx.recyclerview.widget.RecyclerView$b0 r1 = r1.f5092l0
                java.util.List r4 = r9.getUnmodifiedPayloads()
                androidx.recyclerview.widget.RecyclerView$m$b r0 = r2.mo5608t(r1, r9, r0, r4)
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                r1.mo5321e1(r9, r0)
            L_0x0166:
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$b0 r0 = r0.f5092l0
                boolean r0 = r0.mo5464e()
                if (r0 == 0) goto L_0x0179
                boolean r0 = r9.isBound()
                if (r0 == 0) goto L_0x0179
                r9.mPreLayoutPosition = r3
                goto L_0x018c
            L_0x0179:
                boolean r0 = r9.isBound()
                if (r0 == 0) goto L_0x018e
                boolean r0 = r9.needsUpdate()
                if (r0 != 0) goto L_0x018e
                boolean r0 = r9.isInvalid()
                if (r0 == 0) goto L_0x018c
                goto L_0x018e
            L_0x018c:
                r0 = r8
                goto L_0x01a1
            L_0x018e:
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.a r0 = r0.f5083h
                int r2 = r0.mo5877m(r3)
                r0 = r16
                r1 = r9
                r3 = r17
                r4 = r19
                boolean r0 = r0.m6609N(r1, r2, r3, r4)
            L_0x01a1:
                android.view.View r1 = r9.itemView
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                if (r1 != 0) goto L_0x01b7
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r1 = r1.generateDefaultLayoutParams()
                androidx.recyclerview.widget.RecyclerView$q r1 = (androidx.recyclerview.widget.RecyclerView.C1752q) r1
                android.view.View r2 = r9.itemView
                r2.setLayoutParams(r1)
                goto L_0x01cf
            L_0x01b7:
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                boolean r2 = r2.checkLayoutParams(r1)
                if (r2 != 0) goto L_0x01cd
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r1 = r2.generateLayoutParams((android.view.ViewGroup.LayoutParams) r1)
                androidx.recyclerview.widget.RecyclerView$q r1 = (androidx.recyclerview.widget.RecyclerView.C1752q) r1
                android.view.View r2 = r9.itemView
                r2.setLayoutParams(r1)
                goto L_0x01cf
            L_0x01cd:
                androidx.recyclerview.widget.RecyclerView$q r1 = (androidx.recyclerview.widget.RecyclerView.C1752q) r1
            L_0x01cf:
                r1.f5206d = r9
                if (r10 == 0) goto L_0x01d6
                if (r0 == 0) goto L_0x01d6
                goto L_0x01d7
            L_0x01d6:
                r7 = r8
            L_0x01d7:
                r1.f5209g = r7
                return r9
            L_0x01da:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Invalid item position "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "("
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "). Item count:"
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$b0 r2 = r2.f5092l0
                int r2 = r2.mo5461b()
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = r2.mo5292V()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C1759w.mo5765O(int, boolean, long):androidx.recyclerview.widget.RecyclerView$f0");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: P */
        public void mo5766P(C1734f0 f0Var) {
            if (f0Var.mInChangeScrap) {
                this.f5218b.remove(f0Var);
            } else {
                this.f5217a.remove(f0Var);
            }
            f0Var.mScrapContainer = null;
            f0Var.mInChangeScrap = false;
            f0Var.clearReturnedFromScrapFlag();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: Q */
        public void mo5767Q() {
            int i;
            C1747p pVar = RecyclerView.this.f5101q;
            if (pVar != null) {
                i = pVar.f5194p;
            } else {
                i = 0;
            }
            this.f5222f = this.f5221e + i;
            for (int size = this.f5219c.size() - 1; size >= 0 && this.f5219c.size() > this.f5222f; size--) {
                mo5758G(size);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: R */
        public boolean mo5768R(C1734f0 f0Var) {
            if (f0Var.isRemoved()) {
                return RecyclerView.this.f5092l0.mo5464e();
            }
            int i = f0Var.mPosition;
            if (i < 0 || i >= RecyclerView.this.f5099p.getItemCount()) {
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + f0Var + RecyclerView.this.mo5292V());
            } else if (!RecyclerView.this.f5092l0.mo5464e() && RecyclerView.this.f5099p.getItemViewType(f0Var.mPosition) != f0Var.getItemViewType()) {
                return false;
            } else {
                if (!RecyclerView.this.f5099p.hasStableIds()) {
                    return true;
                }
                if (f0Var.getItemId() == RecyclerView.this.f5099p.getItemId(f0Var.mPosition)) {
                    return true;
                }
                return false;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: S */
        public void mo5769S(int i, int i2) {
            int i3;
            int i4 = i2 + i;
            for (int size = this.f5219c.size() - 1; size >= 0; size--) {
                C1734f0 f0Var = (C1734f0) this.f5219c.get(size);
                if (f0Var != null && (i3 = f0Var.mPosition) >= i && i3 < i4) {
                    f0Var.addFlags(2);
                    mo5758G(size);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo5770a(C1734f0 f0Var, boolean z) {
            C1055a aVar;
            RecyclerView.m6208u(f0Var);
            View view = f0Var.itemView;
            C1829t tVar = RecyclerView.this.f5106s0;
            if (tVar != null) {
                C1055a c = tVar.mo6052c();
                if (c instanceof C1829t.C1830a) {
                    aVar = ((C1829t.C1830a) c).mo6054c(view);
                } else {
                    aVar = null;
                }
                ViewCompat.m3619r0(view, aVar);
            }
            if (z) {
                mo5776h(f0Var);
            }
            f0Var.mBindingAdapter = null;
            f0Var.mOwnerRecyclerView = null;
            mo5778j().mo5750k(f0Var);
        }

        /* renamed from: c */
        public void mo5771c(View view, int i) {
            C1752q qVar;
            C1734f0 o0 = RecyclerView.m6198o0(view);
            if (o0 != null) {
                int m = RecyclerView.this.f5083h.mo5877m(i);
                if (m < 0 || m >= RecyclerView.this.f5099p.getItemCount()) {
                    throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i + "(offset:" + m + ").state:" + RecyclerView.this.f5092l0.mo5461b() + RecyclerView.this.mo5292V());
                }
                m6609N(o0, m, i, Long.MAX_VALUE);
                ViewGroup.LayoutParams layoutParams = o0.itemView.getLayoutParams();
                if (layoutParams == null) {
                    qVar = (C1752q) RecyclerView.this.generateDefaultLayoutParams();
                    o0.itemView.setLayoutParams(qVar);
                } else if (!RecyclerView.this.checkLayoutParams(layoutParams)) {
                    qVar = (C1752q) RecyclerView.this.generateLayoutParams(layoutParams);
                    o0.itemView.setLayoutParams(qVar);
                } else {
                    qVar = (C1752q) layoutParams;
                }
                boolean z = true;
                qVar.f5208f = true;
                qVar.f5206d = o0;
                if (o0.itemView.getParent() != null) {
                    z = false;
                }
                qVar.f5209g = z;
                return;
            }
            throw new IllegalArgumentException("The view does not have a ViewHolder. You cannot pass arbitrary views to this method, they should be created by the Adapter" + RecyclerView.this.mo5292V());
        }

        /* renamed from: d */
        public void mo5772d() {
            this.f5217a.clear();
            mo5757F();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo5773e() {
            int size = this.f5219c.size();
            for (int i = 0; i < size; i++) {
                ((C1734f0) this.f5219c.get(i)).clearOldPosition();
            }
            int size2 = this.f5217a.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((C1734f0) this.f5217a.get(i2)).clearOldPosition();
            }
            ArrayList arrayList = this.f5218b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    ((C1734f0) this.f5218b.get(i3)).clearOldPosition();
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo5774f() {
            this.f5217a.clear();
            ArrayList arrayList = this.f5218b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        /* renamed from: g */
        public int mo5775g(int i) {
            if (i < 0 || i >= RecyclerView.this.f5092l0.mo5461b()) {
                throw new IndexOutOfBoundsException("invalid position " + i + ". State item count is " + RecyclerView.this.f5092l0.mo5461b() + RecyclerView.this.mo5292V());
            } else if (!RecyclerView.this.f5092l0.mo5464e()) {
                return i;
            } else {
                return RecyclerView.this.f5083h.mo5877m(i);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo5776h(C1734f0 f0Var) {
            RecyclerView.this.getClass();
            if (RecyclerView.this.f5103r.size() <= 0) {
                C1736h hVar = RecyclerView.this.f5099p;
                if (hVar != null) {
                    hVar.onViewRecycled(f0Var);
                }
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.f5092l0 != null) {
                    recyclerView.f5087j.mo6099q(f0Var);
                    return;
                }
                return;
            }
            C0125b.m366a(RecyclerView.this.f5103r.get(0));
            throw null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public C1734f0 mo5777i(int i) {
            int size;
            int m;
            ArrayList arrayList = this.f5218b;
            if (!(arrayList == null || (size = arrayList.size()) == 0)) {
                int i2 = 0;
                int i3 = 0;
                while (i3 < size) {
                    C1734f0 f0Var = (C1734f0) this.f5218b.get(i3);
                    if (f0Var.wasReturnedFromScrap() || f0Var.getLayoutPosition() != i) {
                        i3++;
                    } else {
                        f0Var.addFlags(32);
                        return f0Var;
                    }
                }
                if (RecyclerView.this.f5099p.hasStableIds() && (m = RecyclerView.this.f5083h.mo5877m(i)) > 0 && m < RecyclerView.this.f5099p.getItemCount()) {
                    long itemId = RecyclerView.this.f5099p.getItemId(m);
                    while (i2 < size) {
                        C1734f0 f0Var2 = (C1734f0) this.f5218b.get(i2);
                        if (f0Var2.wasReturnedFromScrap() || f0Var2.getItemId() != itemId) {
                            i2++;
                        } else {
                            f0Var2.addFlags(32);
                            return f0Var2;
                        }
                    }
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public C1757v mo5778j() {
            if (this.f5223g == null) {
                this.f5223g = new C1757v();
                m6613v();
            }
            return this.f5223g;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public int mo5779k() {
            return this.f5217a.size();
        }

        /* renamed from: l */
        public List mo5780l() {
            return this.f5220d;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public C1734f0 mo5781m(long j, int i, boolean z) {
            for (int size = this.f5217a.size() - 1; size >= 0; size--) {
                C1734f0 f0Var = (C1734f0) this.f5217a.get(size);
                if (f0Var.getItemId() == j && !f0Var.wasReturnedFromScrap()) {
                    if (i == f0Var.getItemViewType()) {
                        f0Var.addFlags(32);
                        if (f0Var.isRemoved() && !RecyclerView.this.f5092l0.mo5464e()) {
                            f0Var.setFlags(2, 14);
                        }
                        return f0Var;
                    } else if (!z) {
                        this.f5217a.remove(size);
                        RecyclerView.this.removeDetachedView(f0Var.itemView, false);
                        mo5756E(f0Var.itemView);
                    }
                }
            }
            int size2 = this.f5219c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                C1734f0 f0Var2 = (C1734f0) this.f5219c.get(size2);
                if (f0Var2.getItemId() == j && !f0Var2.isAttachedToTransitionOverlay()) {
                    if (i == f0Var2.getItemViewType()) {
                        if (!z) {
                            this.f5219c.remove(size2);
                        }
                        return f0Var2;
                    } else if (!z) {
                        mo5758G(size2);
                        return null;
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public C1734f0 mo5782n(int i, boolean z) {
            View e;
            int size = this.f5217a.size();
            int i2 = 0;
            int i3 = 0;
            while (i3 < size) {
                C1734f0 f0Var = (C1734f0) this.f5217a.get(i3);
                if (f0Var.wasReturnedFromScrap() || f0Var.getLayoutPosition() != i || f0Var.isInvalid() || (!RecyclerView.this.f5092l0.f5146h && f0Var.isRemoved())) {
                    i3++;
                } else {
                    f0Var.addFlags(32);
                    return f0Var;
                }
            }
            if (z || (e = RecyclerView.this.f5085i.mo5920e(i)) == null) {
                int size2 = this.f5219c.size();
                while (i2 < size2) {
                    C1734f0 f0Var2 = (C1734f0) this.f5219c.get(i2);
                    if (f0Var2.isInvalid() || f0Var2.getLayoutPosition() != i || f0Var2.isAttachedToTransitionOverlay()) {
                        i2++;
                    } else {
                        if (!z) {
                            this.f5219c.remove(i2);
                        }
                        return f0Var2;
                    }
                }
                return null;
            }
            C1734f0 o0 = RecyclerView.m6198o0(e);
            RecyclerView.this.f5085i.mo5932s(e);
            int m = RecyclerView.this.f5085i.mo5926m(e);
            if (m != -1) {
                RecyclerView.this.f5085i.mo5919d(m);
                mo5761J(e);
                o0.addFlags(8224);
                return o0;
            }
            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + o0 + RecyclerView.this.mo5292V());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public View mo5783o(int i) {
            return ((C1734f0) this.f5217a.get(i)).itemView;
        }

        /* renamed from: p */
        public View mo5784p(int i) {
            return mo5785q(i, false);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public View mo5785q(int i, boolean z) {
            return mo5765O(i, z, Long.MAX_VALUE).itemView;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: t */
        public void mo5786t() {
            int size = this.f5219c.size();
            for (int i = 0; i < size; i++) {
                C1752q qVar = (C1752q) ((C1734f0) this.f5219c.get(i)).itemView.getLayoutParams();
                if (qVar != null) {
                    qVar.f5208f = true;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: u */
        public void mo5787u() {
            int size = this.f5219c.size();
            for (int i = 0; i < size; i++) {
                C1734f0 f0Var = (C1734f0) this.f5219c.get(i);
                if (f0Var != null) {
                    f0Var.addFlags(6);
                    f0Var.addChangePayload((Object) null);
                }
            }
            C1736h hVar = RecyclerView.this.f5099p;
            if (hVar == null || !hVar.hasStableIds()) {
                mo5757F();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: w */
        public void mo5788w(int i, int i2) {
            int size = this.f5219c.size();
            for (int i3 = 0; i3 < size; i3++) {
                C1734f0 f0Var = (C1734f0) this.f5219c.get(i3);
                if (f0Var != null && f0Var.mPosition >= i) {
                    f0Var.offsetPosition(i2, false);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: x */
        public void mo5789x(int i, int i2) {
            int i3;
            int i4;
            int i5;
            int i6;
            if (i < i2) {
                i5 = -1;
                i4 = i;
                i3 = i2;
            } else {
                i5 = 1;
                i3 = i;
                i4 = i2;
            }
            int size = this.f5219c.size();
            for (int i7 = 0; i7 < size; i7++) {
                C1734f0 f0Var = (C1734f0) this.f5219c.get(i7);
                if (f0Var != null && (i6 = f0Var.mPosition) >= i4 && i6 <= i3) {
                    if (i6 == i) {
                        f0Var.offsetPosition(i2 - i, false);
                    } else {
                        f0Var.offsetPosition(i5, false);
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: y */
        public void mo5790y(int i, int i2, boolean z) {
            int i3 = i + i2;
            for (int size = this.f5219c.size() - 1; size >= 0; size--) {
                C1734f0 f0Var = (C1734f0) this.f5219c.get(size);
                if (f0Var != null) {
                    int i4 = f0Var.mPosition;
                    if (i4 >= i3) {
                        f0Var.offsetPosition(-i2, z);
                    } else if (i4 >= i) {
                        f0Var.addFlags(8);
                        mo5758G(size);
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: z */
        public void mo5791z(C1736h hVar, C1736h hVar2, boolean z) {
            mo5772d();
            m6608D(hVar, true);
            mo5778j().mo5749j(hVar, hVar2, z);
            m6613v();
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$x */
    public interface C1760x {
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$y */
    private class C1761y extends C1739j {
        C1761y() {
        }

        /* renamed from: a */
        public void mo5583a() {
            RecyclerView.this.mo5383r((String) null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f5092l0.f5145g = true;
            recyclerView.mo5302c1(true);
            if (!RecyclerView.this.f5083h.mo5880p()) {
                RecyclerView.this.requestLayout();
            }
        }

        /* renamed from: c */
        public void mo5585c(int i, int i2, Object obj) {
            RecyclerView.this.mo5383r((String) null);
            if (RecyclerView.this.f5083h.mo5882r(i, i2, obj)) {
                mo5792h();
            }
        }

        /* renamed from: d */
        public void mo5586d(int i, int i2) {
            RecyclerView.this.mo5383r((String) null);
            if (RecyclerView.this.f5083h.mo5883s(i, i2)) {
                mo5792h();
            }
        }

        /* renamed from: e */
        public void mo5587e(int i, int i2, int i3) {
            RecyclerView.this.mo5383r((String) null);
            if (RecyclerView.this.f5083h.mo5884t(i, i2, i3)) {
                mo5792h();
            }
        }

        /* renamed from: f */
        public void mo5588f(int i, int i2) {
            RecyclerView.this.mo5383r((String) null);
            if (RecyclerView.this.f5083h.mo5885u(i, i2)) {
                mo5792h();
            }
        }

        /* renamed from: g */
        public void mo5589g() {
            C1736h hVar;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f5081g != null && (hVar = recyclerView.f5099p) != null && hVar.canRestoreState()) {
                RecyclerView.this.requestLayout();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo5792h() {
            if (RecyclerView.f5038I0) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.f5113w && recyclerView.f5111v) {
                    ViewCompat.m3603j0(recyclerView, recyclerView.f5091l);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.f5053E = true;
            recyclerView2.requestLayout();
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$z */
    public static class C1762z implements C1755t {
        /* renamed from: a */
        public void mo5736a(RecyclerView recyclerView, MotionEvent motionEvent) {
        }

        /* renamed from: c */
        public void mo5738c(boolean z) {
        }
    }

    static {
        Class cls = Integer.TYPE;
        f5042M0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
    }

    public RecyclerView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: A0 */
    private void m6167A0() {
        if (ViewCompat.m3539A(this) == 0) {
            ViewCompat.m3546D0(this, 8);
        }
    }

    /* renamed from: A1 */
    private boolean m6168A1(EdgeEffect edgeEffect, int i, int i2) {
        if (i > 0) {
            return true;
        }
        if (m6209v0(-i) < C1298e.m4516b(edgeEffect) * ((float) i2)) {
            return true;
        }
        return false;
    }

    /* renamed from: B */
    private void m6169B(Context context, String str, AttributeSet attributeSet, int i, int i2) {
        ClassLoader classLoader;
        Object[] objArr;
        Constructor<? extends U> constructor;
        if (str != null) {
            String trim = str.trim();
            if (!trim.isEmpty()) {
                String s0 = m6204s0(context, trim);
                try {
                    if (isInEditMode()) {
                        classLoader = getClass().getClassLoader();
                    } else {
                        classLoader = context.getClassLoader();
                    }
                    Class<? extends U> asSubclass = Class.forName(s0, false, classLoader).asSubclass(C1747p.class);
                    try {
                        constructor = asSubclass.getConstructor(f5042M0);
                        objArr = new Object[]{context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
                    } catch (NoSuchMethodException e) {
                        constructor = asSubclass.getConstructor(new Class[0]);
                        objArr = null;
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((C1747p) constructor.newInstance(objArr));
                } catch (NoSuchMethodException e2) {
                    e2.initCause(e);
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + s0, e2);
                } catch (ClassNotFoundException e3) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + s0, e3);
                } catch (InvocationTargetException e4) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + s0, e4);
                } catch (InstantiationException e5) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + s0, e5);
                } catch (IllegalAccessException e6) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + s0, e6);
                } catch (ClassCastException e7) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + s0, e7);
                }
            }
        }
    }

    /* renamed from: B0 */
    private void m6170B0() {
        this.f5085i = new C1782f(new C1731e());
    }

    /* renamed from: D */
    private boolean m6171D(int i, int i2) {
        m6184b0(this.f5108t0);
        int[] iArr = this.f5108t0;
        if (iArr[0] == i && iArr[1] == i2) {
            return false;
        }
        return true;
    }

    /* renamed from: G */
    private void m6172G() {
        int i = this.f5051D;
        this.f5051D = 0;
        if (i != 0 && mo5260F0()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(C11398b.f33142u);
            C1078b.m4082b(obtain, i);
            sendAccessibilityEventUnchecked(obtain);
        }
    }

    /* renamed from: H0 */
    private boolean m6173H0(View view, View view2, int i) {
        int i2;
        int i3;
        if (view2 == null || view2 == this || view2 == view || mo5297Y(view2) == null) {
            return false;
        }
        if (view == null || mo5297Y(view) == null) {
            return true;
        }
        this.f5093m.set(0, 0, view.getWidth(), view.getHeight());
        this.f5095n.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.f5093m);
        offsetDescendantRectToMyCoords(view2, this.f5095n);
        char c = 65535;
        if (this.f5101q.mo5692m0() == 1) {
            i2 = -1;
        } else {
            i2 = 1;
        }
        Rect rect = this.f5093m;
        int i4 = rect.left;
        Rect rect2 = this.f5095n;
        int i5 = rect2.left;
        if ((i4 < i5 || rect.right <= i5) && rect.right < rect2.right) {
            i3 = 1;
        } else {
            int i6 = rect.right;
            int i7 = rect2.right;
            if ((i6 > i7 || i4 >= i7) && i4 > i5) {
                i3 = -1;
            } else {
                i3 = 0;
            }
        }
        int i8 = rect.top;
        int i9 = rect2.top;
        if ((i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom) {
            c = 1;
        } else {
            int i12 = rect.bottom;
            int i13 = rect2.bottom;
            if ((i12 <= i13 && i8 < i13) || i8 <= i9) {
                c = 0;
            }
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 17) {
                    if (i != 33) {
                        if (i != 66) {
                            if (i != 130) {
                                throw new IllegalArgumentException("Invalid direction: " + i + mo5292V());
                            } else if (c > 0) {
                                return true;
                            } else {
                                return false;
                            }
                        } else if (i3 > 0) {
                            return true;
                        } else {
                            return false;
                        }
                    } else if (c < 0) {
                        return true;
                    } else {
                        return false;
                    }
                } else if (i3 < 0) {
                    return true;
                } else {
                    return false;
                }
            } else if (c > 0 || (c == 0 && i3 * i2 > 0)) {
                return true;
            } else {
                return false;
            }
        } else if (c < 0 || (c == 0 && i3 * i2 < 0)) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: I */
    private void m6174I() {
        boolean z = true;
        this.f5092l0.mo5460a(1);
        mo5294W(this.f5092l0);
        this.f5092l0.f5148j = false;
        mo5265H1();
        this.f5087j.mo6089f();
        mo5289T0();
        m6185b1();
        m6207t1();
        C1726b0 b0Var = this.f5092l0;
        if (!b0Var.f5149k || !this.f5100p0) {
            z = false;
        }
        b0Var.f5147i = z;
        this.f5100p0 = false;
        this.f5098o0 = false;
        b0Var.f5146h = b0Var.f5150l;
        b0Var.f5144f = this.f5099p.getItemCount();
        m6184b0(this.f5108t0);
        if (this.f5092l0.f5149k) {
            int g = this.f5085i.mo5922g();
            for (int i = 0; i < g; i++) {
                C1734f0 o0 = m6198o0(this.f5085i.mo5921f(i));
                if (!o0.shouldIgnore() && (!o0.isInvalid() || this.f5099p.hasStableIds())) {
                    this.f5087j.mo6088e(o0, this.f5065Q.mo5608t(this.f5092l0, o0, C1742m.m6392e(o0), o0.getUnmodifiedPayloads()));
                    if (this.f5092l0.f5147i && o0.isUpdated() && !o0.isRemoved() && !o0.shouldIgnore() && !o0.isInvalid()) {
                        this.f5087j.mo6086c(mo5352j0(o0), o0);
                    }
                }
            }
        }
        if (this.f5092l0.f5150l) {
            mo5418u1();
            C1726b0 b0Var2 = this.f5092l0;
            boolean z2 = b0Var2.f5145g;
            b0Var2.f5145g = false;
            this.f5101q.mo5170i1(this.f5079f, b0Var2);
            this.f5092l0.f5145g = z2;
            for (int i2 = 0; i2 < this.f5085i.mo5922g(); i2++) {
                C1734f0 o02 = m6198o0(this.f5085i.mo5921f(i2));
                if (!o02.shouldIgnore() && !this.f5087j.mo6092i(o02)) {
                    int e = C1742m.m6392e(o02);
                    boolean hasAnyOfTheFlags = o02.hasAnyOfTheFlags(8192);
                    if (!hasAnyOfTheFlags) {
                        e |= C11398b.f33143v;
                    }
                    C1742m.C1744b t = this.f5065Q.mo5608t(this.f5092l0, o02, e, o02.getUnmodifiedPayloads());
                    if (hasAnyOfTheFlags) {
                        mo5321e1(o02, t);
                    } else {
                        this.f5087j.mo6084a(o02, t);
                    }
                }
            }
            mo5419v();
        } else {
            mo5419v();
        }
        mo5291U0();
        mo5270K1(false);
        this.f5092l0.f5143e = 2;
    }

    /* renamed from: J */
    private void m6175J() {
        boolean z;
        mo5265H1();
        mo5289T0();
        this.f5092l0.mo5460a(6);
        this.f5083h.mo5875j();
        this.f5092l0.f5144f = this.f5099p.getItemCount();
        this.f5092l0.f5142d = 0;
        if (this.f5081g != null && this.f5099p.canRestoreState()) {
            Parcelable parcelable = this.f5081g.f5121f;
            if (parcelable != null) {
                this.f5101q.mo5218n1(parcelable);
            }
            this.f5081g = null;
        }
        C1726b0 b0Var = this.f5092l0;
        b0Var.f5146h = false;
        this.f5101q.mo5170i1(this.f5079f, b0Var);
        C1726b0 b0Var2 = this.f5092l0;
        b0Var2.f5145g = false;
        if (!b0Var2.f5149k || this.f5065Q == null) {
            z = false;
        } else {
            z = true;
        }
        b0Var2.f5149k = z;
        b0Var2.f5143e = 4;
        mo5291U0();
        mo5270K1(false);
    }

    /* renamed from: J1 */
    private boolean m6176J1(MotionEvent motionEvent) {
        boolean z;
        EdgeEffect edgeEffect = this.f5061M;
        if (edgeEffect == null || C1298e.m4516b(edgeEffect) == Utils.FLOAT_EPSILON || canScrollHorizontally(-1)) {
            z = false;
        } else {
            C1298e.m4518d(this.f5061M, Utils.FLOAT_EPSILON, 1.0f - (motionEvent.getY() / ((float) getHeight())));
            z = true;
        }
        EdgeEffect edgeEffect2 = this.f5063O;
        if (!(edgeEffect2 == null || C1298e.m4516b(edgeEffect2) == Utils.FLOAT_EPSILON || canScrollHorizontally(1))) {
            C1298e.m4518d(this.f5063O, Utils.FLOAT_EPSILON, motionEvent.getY() / ((float) getHeight()));
            z = true;
        }
        EdgeEffect edgeEffect3 = this.f5062N;
        if (!(edgeEffect3 == null || C1298e.m4516b(edgeEffect3) == Utils.FLOAT_EPSILON || canScrollVertically(-1))) {
            C1298e.m4518d(this.f5062N, Utils.FLOAT_EPSILON, motionEvent.getX() / ((float) getWidth()));
            z = true;
        }
        EdgeEffect edgeEffect4 = this.f5064P;
        if (edgeEffect4 == null || C1298e.m4516b(edgeEffect4) == Utils.FLOAT_EPSILON || canScrollVertically(1)) {
            return z;
        }
        C1298e.m4518d(this.f5064P, Utils.FLOAT_EPSILON, 1.0f - (motionEvent.getX() / ((float) getWidth())));
        return true;
    }

    /* renamed from: K */
    private void m6177K() {
        this.f5092l0.mo5460a(4);
        mo5265H1();
        mo5289T0();
        C1726b0 b0Var = this.f5092l0;
        b0Var.f5143e = 1;
        if (b0Var.f5149k) {
            for (int g = this.f5085i.mo5922g() - 1; g >= 0; g--) {
                C1734f0 o0 = m6198o0(this.f5085i.mo5921f(g));
                if (!o0.shouldIgnore()) {
                    long j0 = mo5352j0(o0);
                    C1742m.C1744b s = this.f5065Q.mo5607s(this.f5092l0, o0);
                    C1734f0 g2 = this.f5087j.mo6090g(j0);
                    if (g2 == null || g2.shouldIgnore()) {
                        this.f5087j.mo6087d(o0, s);
                    } else {
                        boolean h = this.f5087j.mo6091h(g2);
                        boolean h2 = this.f5087j.mo6091h(o0);
                        if (!h || g2 != o0) {
                            C1742m.C1744b n = this.f5087j.mo6096n(g2);
                            this.f5087j.mo6087d(o0, s);
                            C1742m.C1744b m = this.f5087j.mo6095m(o0);
                            if (n == null) {
                                m6210w0(j0, o0, g2);
                            } else {
                                m6199p(g2, o0, n, m, h, h2);
                            }
                        } else {
                            this.f5087j.mo6087d(o0, s);
                        }
                    }
                }
            }
            this.f5087j.mo6097o(this.f5052D0);
        }
        this.f5101q.mo5717x1(this.f5079f);
        C1726b0 b0Var2 = this.f5092l0;
        b0Var2.f5141c = b0Var2.f5144f;
        this.f5056H = false;
        this.f5057I = false;
        b0Var2.f5149k = false;
        b0Var2.f5150l = false;
        this.f5101q.f5189k = false;
        ArrayList arrayList = this.f5079f.f5218b;
        if (arrayList != null) {
            arrayList.clear();
        }
        C1747p pVar = this.f5101q;
        if (pVar.f5195q) {
            pVar.f5194p = 0;
            pVar.f5195q = false;
            this.f5079f.mo5767Q();
        }
        this.f5101q.mo5171j1(this.f5092l0);
        mo5291U0();
        mo5270K1(false);
        this.f5087j.mo6089f();
        int[] iArr = this.f5108t0;
        if (m6171D(iArr[0], iArr[1])) {
            mo5278O(0, 0);
        }
        m6191f1();
        m6203r1();
    }

    /* renamed from: L0 */
    private void m6178L0(int i, int i2, MotionEvent motionEvent, int i3) {
        boolean z;
        float f;
        float f2;
        int i4;
        int i5;
        int i6;
        C1747p pVar = this.f5101q;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.f5047B) {
            int[] iArr = this.f5116x0;
            int i7 = 0;
            iArr[0] = 0;
            iArr[1] = 0;
            boolean v = pVar.mo5226v();
            boolean w = this.f5101q.mo5227w();
            if (w) {
                z = v | true;
            } else {
                z = v;
            }
            if (motionEvent == null) {
                f = ((float) getHeight()) / 2.0f;
            } else {
                f = motionEvent.getY();
            }
            if (motionEvent == null) {
                f2 = ((float) getWidth()) / 2.0f;
            } else {
                f2 = motionEvent.getX();
            }
            int h1 = i - m6195h1(i, f);
            int i1 = i2 - m6197i1(i2, f2);
            mo5267I1(z ? 1 : 0, i3);
            if (v) {
                i4 = h1;
            } else {
                i4 = 0;
            }
            if (w) {
                i5 = i1;
            } else {
                i5 = 0;
            }
            if (mo5271L(i4, i5, this.f5116x0, this.f5112v0, i3)) {
                int[] iArr2 = this.f5116x0;
                h1 -= iArr2[0];
                i1 -= iArr2[1];
            }
            if (v) {
                i6 = h1;
            } else {
                i6 = 0;
            }
            if (w) {
                i7 = i1;
            }
            mo5420v1(i6, i7, motionEvent, i3);
            C1812k kVar = this.f5088j0;
            if (!(kVar == null || (h1 == 0 && i1 == 0))) {
                kVar.mo6000f(this, h1, i1);
            }
            mo5272L1(i3);
        }
    }

    /* renamed from: N1 */
    private void m6179N1() {
        this.f5086i0.mo5488f();
        C1747p pVar = this.f5101q;
        if (pVar != null) {
            pVar.mo5666Y1();
        }
    }

    /* renamed from: Q */
    private boolean m6180Q(MotionEvent motionEvent) {
        C1755t tVar = this.f5109u;
        if (tVar != null) {
            tVar.mo5736a(this, motionEvent);
            int action = motionEvent.getAction();
            if (action == 3 || action == 1) {
                this.f5109u = null;
            }
            return true;
        } else if (motionEvent.getAction() == 0) {
            return false;
        } else {
            return m6182a0(motionEvent);
        }
    }

    /* renamed from: W0 */
    private void m6181W0(MotionEvent motionEvent) {
        int i;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f5067S) {
            if (actionIndex == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.f5067S = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.f5071W = x;
            this.f5069U = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.f5072a0 = y;
            this.f5070V = y;
        }
    }

    /* renamed from: a0 */
    private boolean m6182a0(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.f5107t.size();
        int i = 0;
        while (i < size) {
            C1755t tVar = (C1755t) this.f5107t.get(i);
            if (!tVar.mo5737b(this, motionEvent) || action == 3) {
                i++;
            } else {
                this.f5109u = tVar;
                return true;
            }
        }
        return false;
    }

    /* renamed from: a1 */
    private boolean m6183a1() {
        return this.f5065Q != null && this.f5101q.mo5162Z1();
    }

    /* renamed from: b0 */
    private void m6184b0(int[] iArr) {
        int g = this.f5085i.mo5922g();
        if (g == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < g; i3++) {
            C1734f0 o0 = m6198o0(this.f5085i.mo5921f(i3));
            if (!o0.shouldIgnore()) {
                int layoutPosition = o0.getLayoutPosition();
                if (layoutPosition < i) {
                    i = layoutPosition;
                }
                if (layoutPosition > i2) {
                    i2 = layoutPosition;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    /* renamed from: b1 */
    private void m6185b1() {
        boolean z;
        boolean z2;
        boolean z3;
        if (this.f5056H) {
            this.f5083h.mo5888y();
            if (this.f5057I) {
                this.f5101q.mo5166d1(this);
            }
        }
        if (m6183a1()) {
            this.f5083h.mo5886w();
        } else {
            this.f5083h.mo5875j();
        }
        boolean z4 = false;
        if (this.f5098o0 || this.f5100p0) {
            z = true;
        } else {
            z = false;
        }
        C1726b0 b0Var = this.f5092l0;
        if (!this.f5117y || this.f5065Q == null || ((!(z3 = this.f5056H) && !z && !this.f5101q.f5189k) || (z3 && !this.f5099p.hasStableIds()))) {
            z2 = false;
        } else {
            z2 = true;
        }
        b0Var.f5149k = z2;
        C1726b0 b0Var2 = this.f5092l0;
        if (b0Var2.f5149k && z && !this.f5056H && m6183a1()) {
            z4 = true;
        }
        b0Var2.f5150l = z4;
    }

    /* renamed from: c0 */
    static RecyclerView m6186c0(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView c0 = m6186c0(viewGroup.getChildAt(i));
            if (c0 != null) {
                return c0;
            }
        }
        return null;
    }

    /* renamed from: d0 */
    private View m6187d0() {
        C1734f0 e0;
        C1726b0 b0Var = this.f5092l0;
        int i = b0Var.f5151m;
        if (i == -1) {
            i = 0;
        }
        int b = b0Var.mo5461b();
        int i2 = i;
        while (i2 < b) {
            C1734f0 e02 = mo5320e0(i2);
            if (e02 == null) {
                break;
            } else if (e02.itemView.hasFocusable()) {
                return e02.itemView;
            } else {
                i2++;
            }
        }
        int min = Math.min(b, i);
        while (true) {
            min--;
            if (min < 0 || (e0 = mo5320e0(min)) == null) {
                return null;
            }
            if (e0.itemView.hasFocusable()) {
                return e0.itemView;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* renamed from: d1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m6188d1(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 0
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 1
            if (r1 >= 0) goto L_0x0021
            r6.mo5286S()
            android.widget.EdgeEffect r1 = r6.f5061M
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r2 - r9
            androidx.core.widget.C1298e.m4518d(r1, r4, r9)
        L_0x001f:
            r9 = r3
            goto L_0x003c
        L_0x0021:
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r1 <= 0) goto L_0x003b
            r6.mo5288T()
            android.widget.EdgeEffect r1 = r6.f5063O
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            androidx.core.widget.C1298e.m4518d(r1, r4, r9)
            goto L_0x001f
        L_0x003b:
            r9 = 0
        L_0x003c:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L_0x0056
            r6.mo5290U()
            android.widget.EdgeEffect r9 = r6.f5062N
            float r1 = -r10
            int r2 = r6.getHeight()
            float r2 = (float) r2
            float r1 = r1 / r2
            int r2 = r6.getWidth()
            float r2 = (float) r2
            float r7 = r7 / r2
            androidx.core.widget.C1298e.m4518d(r9, r1, r7)
            goto L_0x0072
        L_0x0056:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 <= 0) goto L_0x0071
            r6.mo5284R()
            android.widget.EdgeEffect r9 = r6.f5064P
            int r1 = r6.getHeight()
            float r1 = (float) r1
            float r1 = r10 / r1
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r2 = r2 - r7
            androidx.core.widget.C1298e.m4518d(r9, r1, r2)
            goto L_0x0072
        L_0x0071:
            r3 = r9
        L_0x0072:
            if (r3 != 0) goto L_0x007c
            int r7 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r7 != 0) goto L_0x007c
            int r7 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r7 == 0) goto L_0x007f
        L_0x007c:
            androidx.core.view.ViewCompat.m3601i0(r6)
        L_0x007f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m6188d1(float, float, float, float):void");
    }

    /* renamed from: f1 */
    private void m6191f1() {
        C1734f0 f0Var;
        View findViewById;
        if (this.f5084h0 && this.f5099p != null && hasFocus() && getDescendantFocusability() != 393216) {
            if (getDescendantFocusability() != 131072 || !isFocused()) {
                if (!isFocused()) {
                    View focusedChild = getFocusedChild();
                    if (!f5041L0 || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                        if (!this.f5085i.mo5927n(focusedChild)) {
                            return;
                        }
                    } else if (this.f5085i.mo5922g() == 0) {
                        requestFocus();
                        return;
                    }
                }
                View view = null;
                if (this.f5092l0.f5152n == -1 || !this.f5099p.hasStableIds()) {
                    f0Var = null;
                } else {
                    f0Var = mo5322f0(this.f5092l0.f5152n);
                }
                if (f0Var != null && !this.f5085i.mo5927n(f0Var.itemView) && f0Var.itemView.hasFocusable()) {
                    view = f0Var.itemView;
                } else if (this.f5085i.mo5922g() > 0) {
                    view = m6187d0();
                }
                if (view != null) {
                    int i = this.f5092l0.f5153o;
                    if (!(((long) i) == -1 || (findViewById = view.findViewById(i)) == null || !findViewById.isFocusable())) {
                        view = findViewById;
                    }
                    view.requestFocus();
                }
            }
        }
    }

    /* renamed from: g1 */
    private void m6193g1() {
        boolean z;
        EdgeEffect edgeEffect = this.f5061M;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = this.f5061M.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.f5062N;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.f5062N.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f5063O;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z |= this.f5063O.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f5064P;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z |= this.f5064P.isFinished();
        }
        if (z) {
            ViewCompat.m3601i0(this);
        }
    }

    private C1262w0 getScrollingChildHelper() {
        if (this.f5110u0 == null) {
            this.f5110u0 = new C1262w0(this);
        }
        return this.f5110u0;
    }

    /* renamed from: h1 */
    private int m6195h1(int i, float f) {
        float height = f / ((float) getHeight());
        float width = ((float) i) / ((float) getWidth());
        EdgeEffect edgeEffect = this.f5061M;
        float f2 = Utils.FLOAT_EPSILON;
        if (edgeEffect == null || C1298e.m4516b(edgeEffect) == Utils.FLOAT_EPSILON) {
            EdgeEffect edgeEffect2 = this.f5063O;
            if (!(edgeEffect2 == null || C1298e.m4516b(edgeEffect2) == Utils.FLOAT_EPSILON)) {
                if (canScrollHorizontally(1)) {
                    this.f5063O.onRelease();
                } else {
                    float d = C1298e.m4518d(this.f5063O, width, height);
                    if (C1298e.m4516b(this.f5063O) == Utils.FLOAT_EPSILON) {
                        this.f5063O.onRelease();
                    }
                    f2 = d;
                }
                invalidate();
            }
        } else {
            if (canScrollHorizontally(-1)) {
                this.f5061M.onRelease();
            } else {
                float f3 = -C1298e.m4518d(this.f5061M, -width, 1.0f - height);
                if (C1298e.m4516b(this.f5061M) == Utils.FLOAT_EPSILON) {
                    this.f5061M.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        }
        return Math.round(f2 * ((float) getWidth()));
    }

    /* renamed from: i */
    private void m6196i(C1734f0 f0Var) {
        boolean z;
        View view = f0Var.itemView;
        if (view.getParent() == this) {
            z = true;
        } else {
            z = false;
        }
        this.f5079f.mo5766P(mo5364n0(view));
        if (f0Var.isTmpDetached()) {
            this.f5085i.mo5918c(view, -1, view.getLayoutParams(), true);
        } else if (!z) {
            this.f5085i.mo5917b(view, true);
        } else {
            this.f5085i.mo5925k(view);
        }
    }

    /* renamed from: i1 */
    private int m6197i1(int i, float f) {
        float width = f / ((float) getWidth());
        float height = ((float) i) / ((float) getHeight());
        EdgeEffect edgeEffect = this.f5062N;
        float f2 = Utils.FLOAT_EPSILON;
        if (edgeEffect == null || C1298e.m4516b(edgeEffect) == Utils.FLOAT_EPSILON) {
            EdgeEffect edgeEffect2 = this.f5064P;
            if (!(edgeEffect2 == null || C1298e.m4516b(edgeEffect2) == Utils.FLOAT_EPSILON)) {
                if (canScrollVertically(1)) {
                    this.f5064P.onRelease();
                } else {
                    float d = C1298e.m4518d(this.f5064P, height, 1.0f - width);
                    if (C1298e.m4516b(this.f5064P) == Utils.FLOAT_EPSILON) {
                        this.f5064P.onRelease();
                    }
                    f2 = d;
                }
                invalidate();
            }
        } else {
            if (canScrollVertically(-1)) {
                this.f5062N.onRelease();
            } else {
                float f3 = -C1298e.m4518d(this.f5062N, -height, width);
                if (C1298e.m4516b(this.f5062N) == Utils.FLOAT_EPSILON) {
                    this.f5062N.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        }
        return Math.round(f2 * ((float) getHeight()));
    }

    /* renamed from: o0 */
    static C1734f0 m6198o0(View view) {
        if (view == null) {
            return null;
        }
        return ((C1752q) view.getLayoutParams()).f5206d;
    }

    /* renamed from: p */
    private void m6199p(C1734f0 f0Var, C1734f0 f0Var2, C1742m.C1744b bVar, C1742m.C1744b bVar2, boolean z, boolean z2) {
        f0Var.setIsRecyclable(false);
        if (z) {
            m6196i(f0Var);
        }
        if (f0Var != f0Var2) {
            if (z2) {
                m6196i(f0Var2);
            }
            f0Var.mShadowedHolder = f0Var2;
            m6196i(f0Var);
            this.f5079f.mo5766P(f0Var);
            f0Var2.setIsRecyclable(false);
            f0Var2.mShadowingHolder = f0Var;
        }
        if (this.f5065Q.mo5591b(f0Var, f0Var2, bVar, bVar2)) {
            mo5300Z0();
        }
    }

    /* renamed from: q0 */
    static void m6200q0(View view, Rect rect) {
        C1752q qVar = (C1752q) view.getLayoutParams();
        Rect rect2 = qVar.f5207e;
        rect.set((view.getLeft() - rect2.left) - qVar.leftMargin, (view.getTop() - rect2.top) - qVar.topMargin, view.getRight() + rect2.right + qVar.rightMargin, view.getBottom() + rect2.bottom + qVar.bottomMargin);
    }

    /* renamed from: q1 */
    private void m6201q1(View view, View view2) {
        View view3;
        boolean z;
        if (view2 != null) {
            view3 = view2;
        } else {
            view3 = view;
        }
        this.f5093m.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C1752q) {
            C1752q qVar = (C1752q) layoutParams;
            if (!qVar.f5208f) {
                Rect rect = qVar.f5207e;
                Rect rect2 = this.f5093m;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f5093m);
            offsetRectIntoDescendantCoords(view, this.f5093m);
        }
        C1747p pVar = this.f5101q;
        Rect rect3 = this.f5093m;
        boolean z2 = !this.f5117y;
        if (view2 == null) {
            z = true;
        } else {
            z = false;
        }
        pVar.mo5627E1(this, view, rect3, z2, z);
    }

    /* renamed from: r0 */
    private int m6202r0(View view) {
        int id = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id = view.getId();
            }
        }
        return id;
    }

    /* renamed from: r1 */
    private void m6203r1() {
        C1726b0 b0Var = this.f5092l0;
        b0Var.f5152n = -1;
        b0Var.f5151m = -1;
        b0Var.f5153o = -1;
    }

    /* renamed from: s0 */
    private String m6204s0(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        } else if (str.contains(".")) {
            return str;
        } else {
            return RecyclerView.class.getPackage().getName() + '.' + str;
        }
    }

    /* renamed from: s1 */
    private void m6205s1() {
        VelocityTracker velocityTracker = this.f5068T;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        mo5272L1(0);
        m6193g1();
    }

    /* renamed from: t */
    private void m6206t() {
        m6205s1();
        setScrollState(0);
    }

    /* renamed from: t1 */
    private void m6207t1() {
        View view;
        long j;
        int i;
        C1734f0 f0Var = null;
        if (!this.f5084h0 || !hasFocus() || this.f5099p == null) {
            view = null;
        } else {
            view = getFocusedChild();
        }
        if (view != null) {
            f0Var = mo5299Z(view);
        }
        if (f0Var == null) {
            m6203r1();
            return;
        }
        C1726b0 b0Var = this.f5092l0;
        if (this.f5099p.hasStableIds()) {
            j = f0Var.getItemId();
        } else {
            j = -1;
        }
        b0Var.f5152n = j;
        C1726b0 b0Var2 = this.f5092l0;
        if (this.f5056H) {
            i = -1;
        } else if (f0Var.isRemoved()) {
            i = f0Var.mOldPosition;
        } else {
            i = f0Var.getAbsoluteAdapterPosition();
        }
        b0Var2.f5151m = i;
        this.f5092l0.f5153o = m6202r0(f0Var.itemView);
    }

    /* renamed from: u */
    static void m6208u(C1734f0 f0Var) {
        WeakReference<RecyclerView> weakReference = f0Var.mNestedRecyclerView;
        if (weakReference != null) {
            View view = weakReference.get();
            while (view != null) {
                if (view != f0Var.itemView) {
                    ViewParent parent = view.getParent();
                    if (parent instanceof View) {
                        view = (View) parent;
                    } else {
                        view = null;
                    }
                } else {
                    return;
                }
            }
            f0Var.mNestedRecyclerView = null;
        }
    }

    /* renamed from: v0 */
    private float m6209v0(int i) {
        double log = Math.log((double) ((((float) Math.abs(i)) * 0.35f) / (this.f5075d * 0.015f)));
        float f = f5035F0;
        return (float) (((double) (this.f5075d * 0.015f)) * Math.exp((((double) f) / (((double) f) - 1.0d)) * log));
    }

    /* renamed from: w0 */
    private void m6210w0(long j, C1734f0 f0Var, C1734f0 f0Var2) {
        int g = this.f5085i.mo5922g();
        for (int i = 0; i < g; i++) {
            C1734f0 o0 = m6198o0(this.f5085i.mo5921f(i));
            if (o0 != f0Var && mo5352j0(o0) == j) {
                C1736h hVar = this.f5099p;
                if (hVar == null || !hVar.hasStableIds()) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + o0 + " \n View Holder 2:" + f0Var + mo5292V());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + o0 + " \n View Holder 2:" + f0Var + mo5292V());
            }
        }
        Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + f0Var2 + " cannot be found but it is necessary for " + f0Var + mo5292V());
    }

    /* renamed from: y */
    private int m6211y(int i, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i2) {
        if (i > 0 && edgeEffect != null && C1298e.m4516b(edgeEffect) != Utils.FLOAT_EPSILON) {
            int round = Math.round((((float) (-i2)) / 4.0f) * C1298e.m4518d(edgeEffect, (((float) (-i)) * 4.0f) / ((float) i2), 0.5f));
            if (round != i) {
                edgeEffect.finish();
            }
            return i - round;
        } else if (i >= 0 || edgeEffect2 == null || C1298e.m4516b(edgeEffect2) == Utils.FLOAT_EPSILON) {
            return i;
        } else {
            float f = (float) i2;
            int round2 = Math.round((f / 4.0f) * C1298e.m4518d(edgeEffect2, (((float) i) * 4.0f) / f, 0.5f));
            if (round2 != i) {
                edgeEffect2.finish();
            }
            return i - round2;
        }
    }

    /* renamed from: y0 */
    private boolean m6212y0() {
        int g = this.f5085i.mo5922g();
        for (int i = 0; i < g; i++) {
            C1734f0 o0 = m6198o0(this.f5085i.mo5921f(i));
            if (o0 != null && !o0.shouldIgnore() && o0.isUpdated()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: y1 */
    private void m6213y1(C1736h hVar, boolean z, boolean z2) {
        C1736h hVar2 = this.f5099p;
        if (hVar2 != null) {
            hVar2.unregisterAdapterDataObserver(this.f5077e);
            this.f5099p.onDetachedFromRecyclerView(this);
        }
        if (!z || z2) {
            mo5353j1();
        }
        this.f5083h.mo5888y();
        C1736h hVar3 = this.f5099p;
        this.f5099p = hVar;
        if (hVar != null) {
            hVar.registerAdapterDataObserver(this.f5077e);
            hVar.onAttachedToRecyclerView(this);
        }
        C1747p pVar = this.f5101q;
        if (pVar != null) {
            pVar.mo5649P0(hVar3, this.f5099p);
        }
        this.f5079f.mo5791z(hVar3, this.f5099p, z);
        this.f5092l0.f5145g = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public void mo5249A() {
        if (!this.f5117y || this.f5056H) {
            C0934x.m3381a("RV FullInvalidate");
            mo5264H();
            C0934x.m3382b();
        } else if (this.f5083h.mo5880p()) {
            if (this.f5083h.mo5879o(4) && !this.f5083h.mo5879o(11)) {
                C0934x.m3381a("RV PartialInvalidate");
                mo5265H1();
                mo5289T0();
                this.f5083h.mo5886w();
                if (!this.f5045A) {
                    if (m6212y0()) {
                        mo5264H();
                    } else {
                        this.f5083h.mo5874i();
                    }
                }
                mo5270K1(true);
                mo5291U0();
                C0934x.m3382b();
            } else if (this.f5083h.mo5880p()) {
                C0934x.m3381a("RV FullInvalidate");
                mo5264H();
                C0934x.m3382b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B1 */
    public boolean mo5250B1(AccessibilityEvent accessibilityEvent) {
        int i;
        int i2 = 0;
        if (!mo5262G0()) {
            return false;
        }
        if (accessibilityEvent != null) {
            i = C1078b.m4081a(accessibilityEvent);
        } else {
            i = 0;
        }
        if (i != 0) {
            i2 = i;
        }
        this.f5051D |= i2;
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public void mo5251C(int i, int i2) {
        setMeasuredDimension(C1747p.m6432y(i, getPaddingLeft() + getPaddingRight(), ViewCompat.m3545D(this)), C1747p.m6432y(i2, getPaddingTop() + getPaddingBottom(), ViewCompat.m3543C(this)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C0 */
    public void mo5252C0(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + mo5292V());
        }
        Resources resources = getContext().getResources();
        new C1807j(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(C8305b.f23536a), resources.getDimensionPixelSize(C8305b.f23538c), resources.getDimensionPixelOffset(C8305b.f23537b));
    }

    /* renamed from: C1 */
    public void mo5253C1(int i, int i2) {
        mo5255D1(i, i2, (Interpolator) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D0 */
    public void mo5254D0() {
        this.f5064P = null;
        this.f5062N = null;
        this.f5063O = null;
        this.f5061M = null;
    }

    /* renamed from: D1 */
    public void mo5255D1(int i, int i2, Interpolator interpolator) {
        mo5258E1(i, i2, interpolator, Integer.MIN_VALUE);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public void mo5256E(View view) {
        C1734f0 o0 = m6198o0(view);
        mo5285R0(view);
        C1736h hVar = this.f5099p;
        if (!(hVar == null || o0 == null)) {
            hVar.onViewAttachedToWindow(o0);
        }
        List list = this.f5055G;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((C1753r) this.f5055G.get(size)).mo5734b(view);
            }
        }
    }

    /* renamed from: E0 */
    public void mo5257E0() {
        if (this.f5105s.size() != 0) {
            C1747p pVar = this.f5101q;
            if (pVar != null) {
                pVar.mo5222q("Cannot invalidate item decorations during a scroll or layout");
            }
            mo5268J0();
            requestLayout();
        }
    }

    /* renamed from: E1 */
    public void mo5258E1(int i, int i2, Interpolator interpolator, int i3) {
        mo5261F1(i, i2, interpolator, i3, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public void mo5259F(View view) {
        C1734f0 o0 = m6198o0(view);
        mo5287S0(view);
        C1736h hVar = this.f5099p;
        if (!(hVar == null || o0 == null)) {
            hVar.onViewDetachedFromWindow(o0);
        }
        List list = this.f5055G;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((C1753r) this.f5055G.get(size)).mo5733a(view);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F0 */
    public boolean mo5260F0() {
        AccessibilityManager accessibilityManager = this.f5054F;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F1 */
    public void mo5261F1(int i, int i2, Interpolator interpolator, int i3, boolean z) {
        boolean z2;
        C1747p pVar = this.f5101q;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.f5047B) {
            int i4 = 0;
            if (!pVar.mo5226v()) {
                i = 0;
            }
            if (!this.f5101q.mo5227w()) {
                i2 = 0;
            }
            if (i != 0 || i2 != 0) {
                if (i3 == Integer.MIN_VALUE || i3 > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    if (z) {
                        if (i != 0) {
                            i4 = 1;
                        }
                        if (i2 != 0) {
                            i4 |= 2;
                        }
                        mo5267I1(i4, 1);
                    }
                    this.f5086i0.mo5487e(i, i2, i3, interpolator);
                    return;
                }
                scrollBy(i, i2);
            }
        }
    }

    /* renamed from: G0 */
    public boolean mo5262G0() {
        return this.f5058J > 0;
    }

    /* renamed from: G1 */
    public void mo5263G1(int i) {
        if (!this.f5047B) {
            C1747p pVar = this.f5101q;
            if (pVar == null) {
                Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            } else {
                pVar.mo5208V1(this, this.f5092l0, i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public void mo5264H() {
        boolean z;
        if (this.f5099p == null) {
            Log.w("RecyclerView", "No adapter attached; skipping layout");
        } else if (this.f5101q == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
        } else {
            this.f5092l0.f5148j = false;
            if (!this.f5046A0 || (this.f5048B0 == getWidth() && this.f5050C0 == getHeight())) {
                z = false;
            } else {
                z = true;
            }
            this.f5048B0 = 0;
            this.f5050C0 = 0;
            this.f5046A0 = false;
            if (this.f5092l0.f5143e == 1) {
                m6174I();
                this.f5101q.mo5643M1(this);
                m6175J();
            } else if (this.f5083h.mo5881q() || z || this.f5101q.mo5716x0() != getWidth() || this.f5101q.mo5684i0() != getHeight()) {
                this.f5101q.mo5643M1(this);
                m6175J();
            } else {
                this.f5101q.mo5643M1(this);
            }
            m6177K();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H1 */
    public void mo5265H1() {
        int i = this.f5119z + 1;
        this.f5119z = i;
        if (i == 1 && !this.f5047B) {
            this.f5045A = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I0 */
    public void mo5266I0(int i) {
        if (this.f5101q != null) {
            setScrollState(2);
            this.f5101q.mo5197J1(i);
            awakenScrollBars();
        }
    }

    /* renamed from: I1 */
    public boolean mo5267I1(int i, int i2) {
        return getScrollingChildHelper().mo3745q(i, i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J0 */
    public void mo5268J0() {
        int j = this.f5085i.mo5924j();
        for (int i = 0; i < j; i++) {
            ((C1752q) this.f5085i.mo5923i(i).getLayoutParams()).f5208f = true;
        }
        this.f5079f.mo5786t();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K0 */
    public void mo5269K0() {
        int j = this.f5085i.mo5924j();
        for (int i = 0; i < j; i++) {
            C1734f0 o0 = m6198o0(this.f5085i.mo5923i(i));
            if (o0 != null && !o0.shouldIgnore()) {
                o0.addFlags(6);
            }
        }
        mo5268J0();
        this.f5079f.mo5787u();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K1 */
    public void mo5270K1(boolean z) {
        if (this.f5119z < 1) {
            this.f5119z = 1;
        }
        if (!z && !this.f5047B) {
            this.f5045A = false;
        }
        if (this.f5119z == 1) {
            if (z && this.f5045A && !this.f5047B && this.f5101q != null && this.f5099p != null) {
                mo5264H();
            }
            if (!this.f5047B) {
                this.f5045A = false;
            }
        }
        this.f5119z--;
    }

    /* renamed from: L */
    public boolean mo5271L(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return getScrollingChildHelper().mo3736d(i, i2, iArr, iArr2, i3);
    }

    /* renamed from: L1 */
    public void mo5272L1(int i) {
        getScrollingChildHelper().mo3747s(i);
    }

    /* renamed from: M */
    public final void mo5273M(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().mo3737e(i, i2, i3, i4, iArr, i5, iArr2);
    }

    /* renamed from: M0 */
    public void mo5274M0(int i) {
        int g = this.f5085i.mo5922g();
        for (int i2 = 0; i2 < g; i2++) {
            this.f5085i.mo5921f(i2).offsetLeftAndRight(i);
        }
    }

    /* renamed from: M1 */
    public void mo5275M1() {
        setScrollState(0);
        m6179N1();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public void mo5276N(int i) {
        C1747p pVar = this.f5101q;
        if (pVar != null) {
            pVar.mo5699p1(i);
        }
        mo5296X0(i);
        C1756u uVar = this.f5094m0;
        if (uVar != null) {
            uVar.mo5739d(this, i);
        }
        List list = this.f5096n0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((C1756u) this.f5096n0.get(size)).mo5739d(this, i);
            }
        }
    }

    /* renamed from: N0 */
    public void mo5277N0(int i) {
        int g = this.f5085i.mo5922g();
        for (int i2 = 0; i2 < g; i2++) {
            this.f5085i.mo5921f(i2).offsetTopAndBottom(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public void mo5278O(int i, int i2) {
        this.f5059K++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        mo5298Y0(i, i2);
        C1756u uVar = this.f5094m0;
        if (uVar != null) {
            uVar.mo5740e(this, i, i2);
        }
        List list = this.f5096n0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((C1756u) this.f5096n0.get(size)).mo5740e(this, i, i2);
            }
        }
        this.f5059K--;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O0 */
    public void mo5279O0(int i, int i2) {
        int j = this.f5085i.mo5924j();
        for (int i3 = 0; i3 < j; i3++) {
            C1734f0 o0 = m6198o0(this.f5085i.mo5923i(i3));
            if (o0 != null && !o0.shouldIgnore() && o0.mPosition >= i) {
                o0.offsetPosition(i2, false);
                this.f5092l0.f5145g = true;
            }
        }
        this.f5079f.mo5788w(i, i2);
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O1 */
    public void mo5280O1(int i, int i2, Object obj) {
        int i3;
        int j = this.f5085i.mo5924j();
        int i4 = i + i2;
        for (int i5 = 0; i5 < j; i5++) {
            View i6 = this.f5085i.mo5923i(i5);
            C1734f0 o0 = m6198o0(i6);
            if (o0 != null && !o0.shouldIgnore() && (i3 = o0.mPosition) >= i && i3 < i4) {
                o0.addFlags(2);
                o0.addChangePayload(obj);
                ((C1752q) i6.getLayoutParams()).f5208f = true;
            }
        }
        this.f5079f.mo5769S(i, i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public void mo5281P() {
        int i;
        for (int size = this.f5118y0.size() - 1; size >= 0; size--) {
            C1734f0 f0Var = (C1734f0) this.f5118y0.get(size);
            if (f0Var.itemView.getParent() == this && !f0Var.shouldIgnore() && (i = f0Var.mPendingAccessibilityState) != -1) {
                ViewCompat.m3544C0(f0Var.itemView, i);
                f0Var.mPendingAccessibilityState = -1;
            }
        }
        this.f5118y0.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P0 */
    public void mo5282P0(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int j = this.f5085i.mo5924j();
        if (i < i2) {
            i5 = -1;
            i4 = i;
            i3 = i2;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        for (int i7 = 0; i7 < j; i7++) {
            C1734f0 o0 = m6198o0(this.f5085i.mo5923i(i7));
            if (o0 != null && (i6 = o0.mPosition) >= i4 && i6 <= i3) {
                if (i6 == i) {
                    o0.offsetPosition(i2 - i, false);
                } else {
                    o0.offsetPosition(i5, false);
                }
                this.f5092l0.f5145g = true;
            }
        }
        this.f5079f.mo5789x(i, i2);
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q0 */
    public void mo5283Q0(int i, int i2, boolean z) {
        int i3 = i + i2;
        int j = this.f5085i.mo5924j();
        for (int i4 = 0; i4 < j; i4++) {
            C1734f0 o0 = m6198o0(this.f5085i.mo5923i(i4));
            if (o0 != null && !o0.shouldIgnore()) {
                int i5 = o0.mPosition;
                if (i5 >= i3) {
                    o0.offsetPosition(-i2, z);
                    this.f5092l0.f5145g = true;
                } else if (i5 >= i) {
                    o0.flagRemovedAndOffsetPosition(i - 1, -i2, z);
                    this.f5092l0.f5145g = true;
                }
            }
        }
        this.f5079f.mo5790y(i, i2, z);
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public void mo5284R() {
        if (this.f5064P == null) {
            EdgeEffect a = this.f5060L.mo5469a(this, 3);
            this.f5064P = a;
            if (this.f5089k) {
                a.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                a.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    /* renamed from: R0 */
    public void mo5285R0(View view) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public void mo5286S() {
        if (this.f5061M == null) {
            EdgeEffect a = this.f5060L.mo5469a(this, 0);
            this.f5061M = a;
            if (this.f5089k) {
                a.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                a.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    /* renamed from: S0 */
    public void mo5287S0(View view) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public void mo5288T() {
        if (this.f5063O == null) {
            EdgeEffect a = this.f5060L.mo5469a(this, 2);
            this.f5063O = a;
            if (this.f5089k) {
                a.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                a.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T0 */
    public void mo5289T0() {
        this.f5058J++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public void mo5290U() {
        if (this.f5062N == null) {
            EdgeEffect a = this.f5060L.mo5469a(this, 1);
            this.f5062N = a;
            if (this.f5089k) {
                a.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                a.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U0 */
    public void mo5291U0() {
        mo5293V0(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public String mo5292V() {
        return " " + super.toString() + ", adapter:" + this.f5099p + ", layout:" + this.f5101q + ", context:" + getContext();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V0 */
    public void mo5293V0(boolean z) {
        int i = this.f5058J - 1;
        this.f5058J = i;
        if (i < 1) {
            this.f5058J = 0;
            if (z) {
                m6172G();
                mo5281P();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W */
    public final void mo5294W(C1726b0 b0Var) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.f5086i0.f5160f;
            b0Var.f5154p = overScroller.getFinalX() - overScroller.getCurrX();
            b0Var.f5155q = overScroller.getFinalY() - overScroller.getCurrY();
            return;
        }
        b0Var.f5154p = 0;
        b0Var.f5155q = 0;
    }

    /* renamed from: X */
    public View mo5295X(float f, float f2) {
        for (int g = this.f5085i.mo5922g() - 1; g >= 0; g--) {
            View f3 = this.f5085i.mo5921f(g);
            float translationX = f3.getTranslationX();
            float translationY = f3.getTranslationY();
            if (f >= ((float) f3.getLeft()) + translationX && f <= ((float) f3.getRight()) + translationX && f2 >= ((float) f3.getTop()) + translationY && f2 <= ((float) f3.getBottom()) + translationY) {
                return f3;
            }
        }
        return null;
    }

    /* renamed from: X0 */
    public void mo5296X0(int i) {
    }

    /* renamed from: Y */
    public View mo5297Y(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = (View) parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    /* renamed from: Y0 */
    public void mo5298Y0(int i, int i2) {
    }

    /* renamed from: Z */
    public C1734f0 mo5299Z(View view) {
        View Y = mo5297Y(view);
        if (Y == null) {
            return null;
        }
        return mo5364n0(Y);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z0 */
    public void mo5300Z0() {
        if (!this.f5104r0 && this.f5111v) {
            ViewCompat.m3603j0(this, this.f5120z0);
            this.f5104r0 = true;
        }
    }

    public void addFocusables(ArrayList arrayList, int i, int i2) {
        C1747p pVar = this.f5101q;
        if (pVar == null || !pVar.mo5650Q0(this, arrayList, i, i2)) {
            super.addFocusables(arrayList, i, i2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c1 */
    public void mo5302c1(boolean z) {
        this.f5057I = z | this.f5057I;
        this.f5056H = true;
        mo5269K0();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C1752q) && this.f5101q.mo5178x((C1752q) layoutParams);
    }

    public int computeHorizontalScrollExtent() {
        C1747p pVar = this.f5101q;
        if (pVar != null && pVar.mo5226v()) {
            return this.f5101q.mo5190B(this.f5092l0);
        }
        return 0;
    }

    public int computeHorizontalScrollOffset() {
        C1747p pVar = this.f5101q;
        if (pVar != null && pVar.mo5226v()) {
            return this.f5101q.mo5146C(this.f5092l0);
        }
        return 0;
    }

    public int computeHorizontalScrollRange() {
        C1747p pVar = this.f5101q;
        if (pVar != null && pVar.mo5226v()) {
            return this.f5101q.mo5147D(this.f5092l0);
        }
        return 0;
    }

    public int computeVerticalScrollExtent() {
        C1747p pVar = this.f5101q;
        if (pVar != null && pVar.mo5227w()) {
            return this.f5101q.mo5195E(this.f5092l0);
        }
        return 0;
    }

    public int computeVerticalScrollOffset() {
        C1747p pVar = this.f5101q;
        if (pVar != null && pVar.mo5227w()) {
            return this.f5101q.mo5148F(this.f5092l0);
        }
        return 0;
    }

    public int computeVerticalScrollRange() {
        C1747p pVar = this.f5101q;
        if (pVar != null && pVar.mo5227w()) {
            return this.f5101q.mo5150G(this.f5092l0);
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo5310d(int i, int i2) {
        if (i < 0) {
            mo5286S();
            if (this.f5061M.isFinished()) {
                this.f5061M.onAbsorb(-i);
            }
        } else if (i > 0) {
            mo5288T();
            if (this.f5063O.isFinished()) {
                this.f5063O.onAbsorb(i);
            }
        }
        if (i2 < 0) {
            mo5290U();
            if (this.f5062N.isFinished()) {
                this.f5062N.onAbsorb(-i2);
            }
        } else if (i2 > 0) {
            mo5284R();
            if (this.f5064P.isFinished()) {
                this.f5064P.onAbsorb(i2);
            }
        }
        if (i != 0 || i2 != 0) {
            ViewCompat.m3601i0(this);
        }
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().mo3733a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().mo3734b(f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().mo3735c(i, i2, iArr, iArr2);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().mo3738f(i, i2, i3, i4, iArr);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    /* access modifiers changed from: protected */
    public void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    /* access modifiers changed from: protected */
    public void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public void draw(Canvas canvas) {
        boolean z;
        int i;
        boolean z2;
        boolean z3;
        int i2;
        super.draw(canvas);
        int size = this.f5105s.size();
        boolean z4 = false;
        for (int i3 = 0; i3 < size; i3++) {
            ((C1746o) this.f5105s.get(i3)).mo5619i(canvas, this, this.f5092l0);
        }
        EdgeEffect edgeEffect = this.f5061M;
        boolean z5 = true;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int save = canvas.save();
            if (this.f5089k) {
                i2 = getPaddingBottom();
            } else {
                i2 = 0;
            }
            canvas.rotate(270.0f);
            canvas.translate((float) ((-getHeight()) + i2), Utils.FLOAT_EPSILON);
            EdgeEffect edgeEffect2 = this.f5061M;
            if (edgeEffect2 == null || !edgeEffect2.draw(canvas)) {
                z = false;
            } else {
                z = true;
            }
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.f5062N;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f5089k) {
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f5062N;
            if (edgeEffect4 == null || !edgeEffect4.draw(canvas)) {
                z3 = false;
            } else {
                z3 = true;
            }
            z |= z3;
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.f5063O;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            if (this.f5089k) {
                i = getPaddingTop();
            } else {
                i = 0;
            }
            canvas.rotate(90.0f);
            canvas.translate((float) i, (float) (-width));
            EdgeEffect edgeEffect6 = this.f5063O;
            if (edgeEffect6 == null || !edgeEffect6.draw(canvas)) {
                z2 = false;
            } else {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f5064P;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f5089k) {
                canvas.translate((float) ((-getWidth()) + getPaddingRight()), (float) ((-getHeight()) + getPaddingBottom()));
            } else {
                canvas.translate((float) (-getWidth()), (float) (-getHeight()));
            }
            EdgeEffect edgeEffect8 = this.f5064P;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z4 = true;
            }
            z |= z4;
            canvas.restoreToCount(save4);
        }
        if (z || this.f5065Q == null || this.f5105s.size() <= 0 || !this.f5065Q.mo5604p()) {
            z5 = z;
        }
        if (z5) {
            ViewCompat.m3601i0(this);
        }
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    /* renamed from: e0 */
    public C1734f0 mo5320e0(int i) {
        C1734f0 f0Var = null;
        if (this.f5056H) {
            return null;
        }
        int j = this.f5085i.mo5924j();
        for (int i2 = 0; i2 < j; i2++) {
            C1734f0 o0 = m6198o0(this.f5085i.mo5923i(i2));
            if (o0 != null && !o0.isRemoved() && mo5347i0(o0) == i) {
                if (!this.f5085i.mo5927n(o0.itemView)) {
                    return o0;
                }
                f0Var = o0;
            }
        }
        return f0Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e1 */
    public void mo5321e1(C1734f0 f0Var, C1742m.C1744b bVar) {
        f0Var.setFlags(0, 8192);
        if (this.f5092l0.f5147i && f0Var.isUpdated() && !f0Var.isRemoved() && !f0Var.shouldIgnore()) {
            this.f5087j.mo6086c(mo5352j0(f0Var), f0Var);
        }
        this.f5087j.mo6088e(f0Var, bVar);
    }

    /* renamed from: f0 */
    public C1734f0 mo5322f0(long j) {
        C1736h hVar = this.f5099p;
        C1734f0 f0Var = null;
        if (hVar != null && hVar.hasStableIds()) {
            int j2 = this.f5085i.mo5924j();
            for (int i = 0; i < j2; i++) {
                C1734f0 o0 = m6198o0(this.f5085i.mo5923i(i));
                if (o0 != null && !o0.isRemoved() && o0.getItemId() == j) {
                    if (!this.f5085i.mo5927n(o0.itemView)) {
                        return o0;
                    }
                    f0Var = o0;
                }
            }
        }
        return f0Var;
    }

    public View focusSearch(View view, int i) {
        boolean z;
        View view2;
        boolean z2;
        boolean z3;
        boolean z4;
        int i2;
        int i3;
        View b1 = this.f5101q.mo5670b1(view, i);
        if (b1 != null) {
            return b1;
        }
        boolean z5 = true;
        if (this.f5099p == null || this.f5101q == null || mo5262G0() || this.f5047B) {
            z = false;
        } else {
            z = true;
        }
        FocusFinder instance = FocusFinder.getInstance();
        if (!z || !(i == 2 || i == 1)) {
            View findNextFocus = instance.findNextFocus(this, view, i);
            if (findNextFocus != null || !z) {
                view2 = findNextFocus;
            } else {
                mo5249A();
                if (mo5297Y(view) == null) {
                    return null;
                }
                mo5265H1();
                view2 = this.f5101q.mo5159U0(view, i, this.f5079f, this.f5092l0);
                mo5270K1(false);
            }
        } else {
            if (this.f5101q.mo5227w()) {
                if (i == 2) {
                    i3 = 130;
                } else {
                    i3 = 33;
                }
                if (instance.findNextFocus(this, view, i3) == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (f5040K0) {
                    i = i3;
                }
            } else {
                z2 = false;
            }
            if (!z2 && this.f5101q.mo5226v()) {
                if (this.f5101q.mo5692m0() == 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (i == 2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z3 ^ z4) {
                    i2 = 66;
                } else {
                    i2 = 17;
                }
                if (instance.findNextFocus(this, view, i2) != null) {
                    z5 = false;
                }
                if (f5040K0) {
                    i = i2;
                }
                z2 = z5;
            }
            if (z2) {
                mo5249A();
                if (mo5297Y(view) == null) {
                    return null;
                }
                mo5265H1();
                this.f5101q.mo5159U0(view, i, this.f5079f, this.f5092l0);
                mo5270K1(false);
            }
            view2 = instance.findNextFocus(this, view, i);
        }
        if (view2 == null || view2.hasFocusable()) {
            if (m6173H0(view, view2, i)) {
                return view2;
            }
            return super.focusSearch(view, i);
        } else if (getFocusedChild() == null) {
            return super.focusSearch(view, i);
        } else {
            m6201q1(view2, (View) null);
            return view;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g0 */
    public C1734f0 mo5324g0(int i, boolean z) {
        int j = this.f5085i.mo5924j();
        C1734f0 f0Var = null;
        for (int i2 = 0; i2 < j; i2++) {
            C1734f0 o0 = m6198o0(this.f5085i.mo5923i(i2));
            if (o0 != null && !o0.isRemoved()) {
                if (z) {
                    if (o0.mPosition != i) {
                        continue;
                    }
                } else if (o0.getLayoutPosition() != i) {
                    continue;
                }
                if (!this.f5085i.mo5927n(o0.itemView)) {
                    return o0;
                }
                f0Var = o0;
            }
        }
        return f0Var;
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        C1747p pVar = this.f5101q;
        if (pVar != null) {
            return pVar.mo5154P();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + mo5292V());
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        C1747p pVar = this.f5101q;
        if (pVar != null) {
            return pVar.mo5156Q(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + mo5292V());
    }

    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public C1736h getAdapter() {
        return this.f5099p;
    }

    public int getBaseline() {
        C1747p pVar = this.f5101q;
        if (pVar != null) {
            return pVar.mo5654S();
        }
        return super.getBaseline();
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        return super.getChildDrawingOrder(i, i2);
    }

    public boolean getClipToPadding() {
        return this.f5089k;
    }

    public C1829t getCompatAccessibilityDelegate() {
        return this.f5106s0;
    }

    public C1741l getEdgeEffectFactory() {
        return this.f5060L;
    }

    public C1742m getItemAnimator() {
        return this.f5065Q;
    }

    public int getItemDecorationCount() {
        return this.f5105s.size();
    }

    public C1747p getLayoutManager() {
        return this.f5101q;
    }

    public int getMaxFlingVelocity() {
        return this.f5078e0;
    }

    public int getMinFlingVelocity() {
        return this.f5076d0;
    }

    /* access modifiers changed from: package-private */
    public long getNanoTime() {
        if (f5039J0) {
            return System.nanoTime();
        }
        return 0;
    }

    public C1754s getOnFlingListener() {
        return this.f5074c0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f5084h0;
    }

    public C1757v getRecycledViewPool() {
        return this.f5079f.mo5778j();
    }

    public int getScrollState() {
        return this.f5066R;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00e0 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00f0  */
    /* renamed from: h0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo5345h0(int r8, int r9) {
        /*
            r7 = this;
            androidx.recyclerview.widget.RecyclerView$p r0 = r7.f5101q
            r1 = 0
            if (r0 != 0) goto L_0x000d
            java.lang.String r8 = "RecyclerView"
            java.lang.String r9 = "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument."
            android.util.Log.e(r8, r9)
            return r1
        L_0x000d:
            boolean r2 = r7.f5047B
            if (r2 == 0) goto L_0x0012
            return r1
        L_0x0012:
            boolean r0 = r0.mo5226v()
            androidx.recyclerview.widget.RecyclerView$p r2 = r7.f5101q
            boolean r2 = r2.mo5227w()
            if (r0 == 0) goto L_0x0026
            int r3 = java.lang.Math.abs(r8)
            int r4 = r7.f5076d0
            if (r3 >= r4) goto L_0x0027
        L_0x0026:
            r8 = r1
        L_0x0027:
            if (r2 == 0) goto L_0x0031
            int r3 = java.lang.Math.abs(r9)
            int r4 = r7.f5076d0
            if (r3 >= r4) goto L_0x0032
        L_0x0031:
            r9 = r1
        L_0x0032:
            if (r8 != 0) goto L_0x0037
            if (r9 != 0) goto L_0x0037
            return r1
        L_0x0037:
            r3 = 0
            if (r8 == 0) goto L_0x007a
            android.widget.EdgeEffect r4 = r7.f5061M
            if (r4 == 0) goto L_0x005c
            float r4 = androidx.core.widget.C1298e.m4516b(r4)
            int r4 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r4 == 0) goto L_0x005c
            android.widget.EdgeEffect r4 = r7.f5061M
            int r5 = -r8
            int r6 = r7.getWidth()
            boolean r4 = r7.m6168A1(r4, r5, r6)
            if (r4 == 0) goto L_0x0059
            android.widget.EdgeEffect r8 = r7.f5061M
            r8.onAbsorb(r5)
        L_0x0058:
            r8 = r1
        L_0x0059:
            r4 = r8
            r8 = r1
            goto L_0x007b
        L_0x005c:
            android.widget.EdgeEffect r4 = r7.f5063O
            if (r4 == 0) goto L_0x007a
            float r4 = androidx.core.widget.C1298e.m4516b(r4)
            int r4 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r4 == 0) goto L_0x007a
            android.widget.EdgeEffect r4 = r7.f5063O
            int r5 = r7.getWidth()
            boolean r4 = r7.m6168A1(r4, r8, r5)
            if (r4 == 0) goto L_0x0059
            android.widget.EdgeEffect r4 = r7.f5063O
            r4.onAbsorb(r8)
            goto L_0x0058
        L_0x007a:
            r4 = r1
        L_0x007b:
            if (r9 == 0) goto L_0x00bc
            android.widget.EdgeEffect r5 = r7.f5062N
            if (r5 == 0) goto L_0x009e
            float r5 = androidx.core.widget.C1298e.m4516b(r5)
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x009e
            android.widget.EdgeEffect r3 = r7.f5062N
            int r5 = -r9
            int r6 = r7.getHeight()
            boolean r3 = r7.m6168A1(r3, r5, r6)
            if (r3 == 0) goto L_0x009c
            android.widget.EdgeEffect r9 = r7.f5062N
            r9.onAbsorb(r5)
        L_0x009b:
            r9 = r1
        L_0x009c:
            r3 = r1
            goto L_0x00be
        L_0x009e:
            android.widget.EdgeEffect r5 = r7.f5064P
            if (r5 == 0) goto L_0x00bc
            float r5 = androidx.core.widget.C1298e.m4516b(r5)
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x00bc
            android.widget.EdgeEffect r3 = r7.f5064P
            int r5 = r7.getHeight()
            boolean r3 = r7.m6168A1(r3, r9, r5)
            if (r3 == 0) goto L_0x009c
            android.widget.EdgeEffect r3 = r7.f5064P
            r3.onAbsorb(r9)
            goto L_0x009b
        L_0x00bc:
            r3 = r9
            r9 = r1
        L_0x00be:
            if (r4 != 0) goto L_0x00c2
            if (r9 == 0) goto L_0x00dd
        L_0x00c2:
            int r5 = r7.f5078e0
            int r6 = -r5
            int r4 = java.lang.Math.min(r4, r5)
            int r4 = java.lang.Math.max(r6, r4)
            int r5 = r7.f5078e0
            int r6 = -r5
            int r9 = java.lang.Math.min(r9, r5)
            int r9 = java.lang.Math.max(r6, r9)
            androidx.recyclerview.widget.RecyclerView$e0 r5 = r7.f5086i0
            r5.mo5485b(r4, r9)
        L_0x00dd:
            r5 = 1
            if (r8 != 0) goto L_0x00e8
            if (r3 != 0) goto L_0x00e8
            if (r4 != 0) goto L_0x00e6
            if (r9 == 0) goto L_0x00e7
        L_0x00e6:
            r1 = r5
        L_0x00e7:
            return r1
        L_0x00e8:
            float r9 = (float) r8
            float r4 = (float) r3
            boolean r6 = r7.dispatchNestedPreFling(r9, r4)
            if (r6 != 0) goto L_0x012b
            if (r0 != 0) goto L_0x00f7
            if (r2 == 0) goto L_0x00f5
            goto L_0x00f7
        L_0x00f5:
            r6 = r1
            goto L_0x00f8
        L_0x00f7:
            r6 = r5
        L_0x00f8:
            r7.dispatchNestedFling(r9, r4, r6)
            androidx.recyclerview.widget.RecyclerView$s r9 = r7.f5074c0
            if (r9 == 0) goto L_0x0106
            boolean r9 = r9.mo5735a(r8, r3)
            if (r9 == 0) goto L_0x0106
            return r5
        L_0x0106:
            if (r6 == 0) goto L_0x012b
            if (r2 == 0) goto L_0x010c
            r0 = r0 | 2
        L_0x010c:
            r7.mo5267I1(r0, r5)
            int r9 = r7.f5078e0
            int r0 = -r9
            int r8 = java.lang.Math.min(r8, r9)
            int r8 = java.lang.Math.max(r0, r8)
            int r9 = r7.f5078e0
            int r0 = -r9
            int r9 = java.lang.Math.min(r3, r9)
            int r9 = java.lang.Math.max(r0, r9)
            androidx.recyclerview.widget.RecyclerView$e0 r0 = r7.f5086i0
            r0.mo5485b(r8, r9)
            return r5
        L_0x012b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.mo5345h0(int, int):boolean");
    }

    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().mo3740k();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i0 */
    public int mo5347i0(C1734f0 f0Var) {
        if (f0Var.hasAnyOfTheFlags(524) || !f0Var.isBound()) {
            return -1;
        }
        return this.f5083h.mo5873e(f0Var.mPosition);
    }

    public boolean isAttachedToWindow() {
        return this.f5111v;
    }

    public final boolean isLayoutSuppressed() {
        return this.f5047B;
    }

    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().mo3742m();
    }

    /* renamed from: j */
    public void mo5351j(C1746o oVar) {
        mo5354k(oVar, -1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j0 */
    public long mo5352j0(C1734f0 f0Var) {
        return this.f5099p.hasStableIds() ? f0Var.getItemId() : (long) f0Var.mPosition;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j1 */
    public void mo5353j1() {
        C1742m mVar = this.f5065Q;
        if (mVar != null) {
            mVar.mo5599k();
        }
        C1747p pVar = this.f5101q;
        if (pVar != null) {
            pVar.mo5715w1(this.f5079f);
            this.f5101q.mo5717x1(this.f5079f);
        }
        this.f5079f.mo5772d();
    }

    /* renamed from: k */
    public void mo5354k(C1746o oVar, int i) {
        C1747p pVar = this.f5101q;
        if (pVar != null) {
            pVar.mo5222q("Cannot add item decoration during a scroll  or layout");
        }
        if (this.f5105s.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i < 0) {
            this.f5105s.add(oVar);
        } else {
            this.f5105s.add(i, oVar);
        }
        mo5268J0();
        requestLayout();
    }

    /* renamed from: k0 */
    public int mo5355k0(View view) {
        C1734f0 o0 = m6198o0(view);
        if (o0 != null) {
            return o0.getAbsoluteAdapterPosition();
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k1 */
    public boolean mo5356k1(View view) {
        mo5265H1();
        boolean r = this.f5085i.mo5931r(view);
        if (r) {
            C1734f0 o0 = m6198o0(view);
            this.f5079f.mo5766P(o0);
            this.f5079f.mo5760I(o0);
        }
        mo5270K1(!r);
        return r;
    }

    /* renamed from: l */
    public void mo5357l(C1753r rVar) {
        if (this.f5055G == null) {
            this.f5055G = new ArrayList();
        }
        this.f5055G.add(rVar);
    }

    /* renamed from: l0 */
    public int mo5358l0(View view) {
        C1734f0 o0 = m6198o0(view);
        if (o0 != null) {
            return o0.getLayoutPosition();
        }
        return -1;
    }

    /* renamed from: l1 */
    public void mo5359l1(C1746o oVar) {
        boolean z;
        C1747p pVar = this.f5101q;
        if (pVar != null) {
            pVar.mo5222q("Cannot remove item decoration during a scroll  or layout");
        }
        this.f5105s.remove(oVar);
        if (this.f5105s.isEmpty()) {
            if (getOverScrollMode() == 2) {
                z = true;
            } else {
                z = false;
            }
            setWillNotDraw(z);
        }
        mo5268J0();
        requestLayout();
    }

    /* renamed from: m */
    public void mo5360m(C1755t tVar) {
        this.f5107t.add(tVar);
    }

    /* renamed from: m0 */
    public int mo5361m0(View view) {
        return mo5355k0(view);
    }

    /* renamed from: m1 */
    public void mo5362m1(int i) {
        int itemDecorationCount = getItemDecorationCount();
        if (i < 0 || i >= itemDecorationCount) {
            throw new IndexOutOfBoundsException(i + " is an invalid index for size " + itemDecorationCount);
        }
        mo5359l1(mo5417u0(i));
    }

    /* renamed from: n */
    public void mo5363n(C1756u uVar) {
        if (this.f5096n0 == null) {
            this.f5096n0 = new ArrayList();
        }
        this.f5096n0.add(uVar);
    }

    /* renamed from: n0 */
    public C1734f0 mo5364n0(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return m6198o0(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    /* renamed from: n1 */
    public void mo5365n1(C1755t tVar) {
        this.f5107t.remove(tVar);
        if (this.f5109u == tVar) {
            this.f5109u = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo5366o(C1734f0 f0Var, C1742m.C1744b bVar, C1742m.C1744b bVar2) {
        f0Var.setIsRecyclable(false);
        if (this.f5065Q.mo5590a(f0Var, bVar, bVar2)) {
            mo5300Z0();
        }
    }

    /* renamed from: o1 */
    public void mo5367o1(C1756u uVar) {
        List list = this.f5096n0;
        if (list != null) {
            list.remove(uVar);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0050, code lost:
        if (r1 >= 30.0f) goto L_0x0055;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.f5058J = r0
            r1 = 1
            r5.f5111v = r1
            boolean r2 = r5.f5117y
            if (r2 == 0) goto L_0x0014
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L_0x0014
            goto L_0x0015
        L_0x0014:
            r1 = r0
        L_0x0015:
            r5.f5117y = r1
            androidx.recyclerview.widget.RecyclerView$w r1 = r5.f5079f
            r1.mo5754A()
            androidx.recyclerview.widget.RecyclerView$p r1 = r5.f5101q
            if (r1 == 0) goto L_0x0023
            r1.mo5638L(r5)
        L_0x0023:
            r5.f5104r0 = r0
            boolean r0 = f5039J0
            if (r0 == 0) goto L_0x0066
            java.lang.ThreadLocal r0 = androidx.recyclerview.widget.C1812k.f5446h
            java.lang.Object r1 = r0.get()
            androidx.recyclerview.widget.k r1 = (androidx.recyclerview.widget.C1812k) r1
            r5.f5088j0 = r1
            if (r1 != 0) goto L_0x0061
            androidx.recyclerview.widget.k r1 = new androidx.recyclerview.widget.k
            r1.<init>()
            r5.f5088j0 = r1
            android.view.Display r1 = androidx.core.view.ViewCompat.m3626v(r5)
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L_0x0053
            if (r1 == 0) goto L_0x0053
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x0053
            goto L_0x0055
        L_0x0053:
            r1 = 1114636288(0x42700000, float:60.0)
        L_0x0055:
            androidx.recyclerview.widget.k r2 = r5.f5088j0
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f5450f = r3
            r0.set(r2)
        L_0x0061:
            androidx.recyclerview.widget.k r0 = r5.f5088j0
            r0.mo5999a(r5)
        L_0x0066:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        C1812k kVar;
        super.onDetachedFromWindow();
        C1742m mVar = this.f5065Q;
        if (mVar != null) {
            mVar.mo5599k();
        }
        mo5275M1();
        this.f5111v = false;
        C1747p pVar = this.f5101q;
        if (pVar != null) {
            pVar.mo5641M(this, this.f5079f);
        }
        this.f5118y0.clear();
        removeCallbacks(this.f5120z0);
        this.f5087j.mo6093j();
        this.f5079f.mo5755B();
        C9147a.m33774b(this);
        if (f5039J0 && (kVar = this.f5088j0) != null) {
            kVar.mo6002j(this);
            this.f5088j0 = null;
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f5105s.size();
        for (int i = 0; i < size; i++) {
            ((C1746o) this.f5105s.get(i)).mo5617g(canvas, this, this.f5092l0);
        }
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f;
        float f2;
        if (this.f5101q != null && !this.f5047B && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                if (this.f5101q.mo5227w()) {
                    f2 = -motionEvent.getAxisValue(9);
                } else {
                    f2 = 0.0f;
                }
                if (this.f5101q.mo5226v()) {
                    f = motionEvent.getAxisValue(10);
                    if (!(f2 == Utils.FLOAT_EPSILON && f == Utils.FLOAT_EPSILON)) {
                        m6178L0((int) (f * this.f5080f0), (int) (f2 * this.f5082g0), motionEvent, 1);
                    }
                }
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.f5101q.mo5227w()) {
                        f2 = -axisValue;
                    } else if (this.f5101q.mo5226v()) {
                        f = axisValue;
                        f2 = 0.0f;
                        m6178L0((int) (f * this.f5080f0), (int) (f2 * this.f5082g0), motionEvent, 1);
                    }
                }
                f2 = 0.0f;
                f = 0.0f;
                m6178L0((int) (f * this.f5080f0), (int) (f2 * this.f5082g0), motionEvent, 1);
            }
            f = 0.0f;
            m6178L0((int) (f * this.f5080f0), (int) (f2 * this.f5082g0), motionEvent, 1);
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.f5047B) {
            return false;
        }
        this.f5109u = null;
        if (m6182a0(motionEvent)) {
            m6206t();
            return true;
        }
        C1747p pVar = this.f5101q;
        if (pVar == null) {
            return false;
        }
        boolean v = pVar.mo5226v();
        boolean w = this.f5101q.mo5227w();
        if (this.f5068T == null) {
            this.f5068T = VelocityTracker.obtain();
        }
        this.f5068T.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f5049C) {
                this.f5049C = false;
            }
            this.f5067S = motionEvent.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.f5071W = x;
            this.f5069U = x;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.f5072a0 = y;
            this.f5070V = y;
            if (m6176J1(motionEvent) || this.f5066R == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                mo5272L1(1);
            }
            int[] iArr = this.f5114w0;
            iArr[1] = 0;
            iArr[0] = 0;
            if (w) {
                v |= true;
            }
            mo5267I1(v ? 1 : 0, 0);
        } else if (actionMasked == 1) {
            this.f5068T.clear();
            mo5272L1(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f5067S);
            if (findPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f5067S + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.f5066R != 1) {
                int i = x2 - this.f5069U;
                int i2 = y2 - this.f5070V;
                if (!v || Math.abs(i) <= this.f5073b0) {
                    z = false;
                } else {
                    this.f5071W = x2;
                    z = true;
                }
                if (w && Math.abs(i2) > this.f5073b0) {
                    this.f5072a0 = y2;
                    z = true;
                }
                if (z) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            m6206t();
        } else if (actionMasked == 5) {
            this.f5067S = motionEvent.getPointerId(actionIndex);
            int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f5071W = x3;
            this.f5069U = x3;
            int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f5072a0 = y3;
            this.f5070V = y3;
        } else if (actionMasked == 6) {
            m6181W0(motionEvent);
        }
        if (this.f5066R == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C0934x.m3381a("RV OnLayout");
        mo5264H();
        C0934x.m3382b();
        this.f5117y = true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        C1747p pVar = this.f5101q;
        if (pVar == null) {
            mo5251C(i, i2);
            return;
        }
        boolean z = false;
        if (pVar.mo5192C0()) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.f5101q.mo5687k1(this.f5079f, this.f5092l0, i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.f5046A0 = z;
            if (!z && this.f5099p != null) {
                if (this.f5092l0.f5143e == 1) {
                    m6174I();
                }
                this.f5101q.mo5646N1(i, i2);
                this.f5092l0.f5148j = true;
                m6175J();
                this.f5101q.mo5651Q1(i, i2);
                if (this.f5101q.mo5206T1()) {
                    this.f5101q.mo5646N1(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    this.f5092l0.f5148j = true;
                    m6175J();
                    this.f5101q.mo5651Q1(i, i2);
                }
                this.f5048B0 = getMeasuredWidth();
                this.f5050C0 = getMeasuredHeight();
            }
        } else if (this.f5113w) {
            this.f5101q.mo5687k1(this.f5079f, this.f5092l0, i, i2);
        } else {
            if (this.f5053E) {
                mo5265H1();
                mo5289T0();
                m6185b1();
                mo5291U0();
                C1726b0 b0Var = this.f5092l0;
                if (b0Var.f5150l) {
                    b0Var.f5146h = true;
                } else {
                    this.f5083h.mo5875j();
                    this.f5092l0.f5146h = false;
                }
                this.f5053E = false;
                mo5270K1(false);
            } else if (this.f5092l0.f5150l) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            C1736h hVar = this.f5099p;
            if (hVar != null) {
                this.f5092l0.f5144f = hVar.getItemCount();
            } else {
                this.f5092l0.f5144f = 0;
            }
            mo5265H1();
            this.f5101q.mo5687k1(this.f5079f, this.f5092l0, i, i2);
            mo5270K1(false);
            this.f5092l0.f5146h = false;
        }
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (mo5262G0()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.f5081g = savedState;
        super.onRestoreInstanceState(savedState.mo3880a());
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.f5081g;
        if (savedState2 != null) {
            savedState.mo5429b(savedState2);
        } else {
            C1747p pVar = this.f5101q;
            if (pVar != null) {
                savedState.f5121f = pVar.mo5220o1();
            } else {
                savedState.f5121f = null;
            }
        }
        return savedState;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            mo5254D0();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r6 = r17
            r7 = r18
            boolean r0 = r6.f5047B
            r8 = 0
            if (r0 != 0) goto L_0x01f2
            boolean r0 = r6.f5049C
            if (r0 == 0) goto L_0x000f
            goto L_0x01f2
        L_0x000f:
            boolean r0 = r17.m6180Q(r18)
            r9 = 1
            if (r0 == 0) goto L_0x001a
            r17.m6206t()
            return r9
        L_0x001a:
            androidx.recyclerview.widget.RecyclerView$p r0 = r6.f5101q
            if (r0 != 0) goto L_0x001f
            return r8
        L_0x001f:
            boolean r10 = r0.mo5226v()
            androidx.recyclerview.widget.RecyclerView$p r0 = r6.f5101q
            boolean r11 = r0.mo5227w()
            android.view.VelocityTracker r0 = r6.f5068T
            if (r0 != 0) goto L_0x0033
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r6.f5068T = r0
        L_0x0033:
            int r0 = r18.getActionMasked()
            int r1 = r18.getActionIndex()
            if (r0 != 0) goto L_0x0043
            int[] r2 = r6.f5114w0
            r2[r9] = r8
            r2[r8] = r8
        L_0x0043:
            android.view.MotionEvent r12 = android.view.MotionEvent.obtain(r18)
            int[] r2 = r6.f5114w0
            r3 = r2[r8]
            float r3 = (float) r3
            r2 = r2[r9]
            float r2 = (float) r2
            r12.offsetLocation(r3, r2)
            r2 = 1056964608(0x3f000000, float:0.5)
            if (r0 == 0) goto L_0x01c6
            if (r0 == r9) goto L_0x0184
            r3 = 2
            if (r0 == r3) goto L_0x008c
            r3 = 3
            if (r0 == r3) goto L_0x0087
            r3 = 5
            if (r0 == r3) goto L_0x006b
            r1 = 6
            if (r0 == r1) goto L_0x0066
            goto L_0x01e7
        L_0x0066:
            r17.m6181W0(r18)
            goto L_0x01e7
        L_0x006b:
            int r0 = r7.getPointerId(r1)
            r6.f5067S = r0
            float r0 = r7.getX(r1)
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.f5071W = r0
            r6.f5069U = r0
            float r0 = r7.getY(r1)
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.f5072a0 = r0
            r6.f5070V = r0
            goto L_0x01e7
        L_0x0087:
            r17.m6206t()
            goto L_0x01e7
        L_0x008c:
            int r0 = r6.f5067S
            int r0 = r7.findPointerIndex(r0)
            if (r0 >= 0) goto L_0x00b2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Error processing scroll; pointer index for id "
            r0.append(r1)
            int r1 = r6.f5067S
            r0.append(r1)
            java.lang.String r1 = " not found. Did any MotionEvents get skipped?"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "RecyclerView"
            android.util.Log.e(r1, r0)
            return r8
        L_0x00b2:
            float r1 = r7.getX(r0)
            float r1 = r1 + r2
            int r13 = (int) r1
            float r0 = r7.getY(r0)
            float r0 = r0 + r2
            int r14 = (int) r0
            int r0 = r6.f5071W
            int r0 = r0 - r13
            int r1 = r6.f5072a0
            int r1 = r1 - r14
            int r2 = r6.f5066R
            if (r2 == r9) goto L_0x00fb
            if (r10 == 0) goto L_0x00df
            if (r0 <= 0) goto L_0x00d4
            int r2 = r6.f5073b0
            int r0 = r0 - r2
            int r0 = java.lang.Math.max(r8, r0)
            goto L_0x00db
        L_0x00d4:
            int r2 = r6.f5073b0
            int r0 = r0 + r2
            int r0 = java.lang.Math.min(r8, r0)
        L_0x00db:
            if (r0 == 0) goto L_0x00df
            r2 = r9
            goto L_0x00e0
        L_0x00df:
            r2 = r8
        L_0x00e0:
            if (r11 == 0) goto L_0x00f6
            if (r1 <= 0) goto L_0x00ec
            int r3 = r6.f5073b0
            int r1 = r1 - r3
            int r1 = java.lang.Math.max(r8, r1)
            goto L_0x00f3
        L_0x00ec:
            int r3 = r6.f5073b0
            int r1 = r1 + r3
            int r1 = java.lang.Math.min(r8, r1)
        L_0x00f3:
            if (r1 == 0) goto L_0x00f6
            r2 = r9
        L_0x00f6:
            if (r2 == 0) goto L_0x00fb
            r6.setScrollState(r9)
        L_0x00fb:
            int r2 = r6.f5066R
            if (r2 != r9) goto L_0x01e7
            int[] r2 = r6.f5116x0
            r2[r8] = r8
            r2[r9] = r8
            float r2 = r18.getY()
            int r2 = r6.m6195h1(r0, r2)
            int r15 = r0 - r2
            float r0 = r18.getX()
            int r0 = r6.m6197i1(r1, r0)
            int r16 = r1 - r0
            if (r10 == 0) goto L_0x011d
            r1 = r15
            goto L_0x011e
        L_0x011d:
            r1 = r8
        L_0x011e:
            if (r11 == 0) goto L_0x0123
            r2 = r16
            goto L_0x0124
        L_0x0123:
            r2 = r8
        L_0x0124:
            int[] r3 = r6.f5116x0
            int[] r4 = r6.f5112v0
            r5 = 0
            r0 = r17
            boolean r0 = r0.mo5271L(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0153
            int[] r0 = r6.f5116x0
            r1 = r0[r8]
            int r15 = r15 - r1
            r0 = r0[r9]
            int r16 = r16 - r0
            int[] r0 = r6.f5114w0
            r1 = r0[r8]
            int[] r2 = r6.f5112v0
            r3 = r2[r8]
            int r1 = r1 + r3
            r0[r8] = r1
            r1 = r0[r9]
            r2 = r2[r9]
            int r1 = r1 + r2
            r0[r9] = r1
            android.view.ViewParent r0 = r17.getParent()
            r0.requestDisallowInterceptTouchEvent(r9)
        L_0x0153:
            r0 = r16
            int[] r1 = r6.f5112v0
            r2 = r1[r8]
            int r13 = r13 - r2
            r6.f5071W = r13
            r1 = r1[r9]
            int r14 = r14 - r1
            r6.f5072a0 = r14
            if (r10 == 0) goto L_0x0165
            r1 = r15
            goto L_0x0166
        L_0x0165:
            r1 = r8
        L_0x0166:
            if (r11 == 0) goto L_0x016a
            r2 = r0
            goto L_0x016b
        L_0x016a:
            r2 = r8
        L_0x016b:
            boolean r1 = r6.mo5420v1(r1, r2, r7, r8)
            if (r1 == 0) goto L_0x0178
            android.view.ViewParent r1 = r17.getParent()
            r1.requestDisallowInterceptTouchEvent(r9)
        L_0x0178:
            androidx.recyclerview.widget.k r1 = r6.f5088j0
            if (r1 == 0) goto L_0x01e7
            if (r15 != 0) goto L_0x0180
            if (r0 == 0) goto L_0x01e7
        L_0x0180:
            r1.mo6000f(r6, r15, r0)
            goto L_0x01e7
        L_0x0184:
            android.view.VelocityTracker r0 = r6.f5068T
            r0.addMovement(r12)
            android.view.VelocityTracker r0 = r6.f5068T
            int r1 = r6.f5078e0
            float r1 = (float) r1
            r2 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r2, r1)
            r0 = 0
            if (r10 == 0) goto L_0x01a0
            android.view.VelocityTracker r1 = r6.f5068T
            int r2 = r6.f5067S
            float r1 = r1.getXVelocity(r2)
            float r1 = -r1
            goto L_0x01a1
        L_0x01a0:
            r1 = r0
        L_0x01a1:
            if (r11 == 0) goto L_0x01ad
            android.view.VelocityTracker r2 = r6.f5068T
            int r3 = r6.f5067S
            float r2 = r2.getYVelocity(r3)
            float r2 = -r2
            goto L_0x01ae
        L_0x01ad:
            r2 = r0
        L_0x01ae:
            int r3 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r3 != 0) goto L_0x01b6
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x01be
        L_0x01b6:
            int r0 = (int) r1
            int r1 = (int) r2
            boolean r0 = r6.mo5345h0(r0, r1)
            if (r0 != 0) goto L_0x01c1
        L_0x01be:
            r6.setScrollState(r8)
        L_0x01c1:
            r17.m6205s1()
            r8 = r9
            goto L_0x01e7
        L_0x01c6:
            int r0 = r7.getPointerId(r8)
            r6.f5067S = r0
            float r0 = r18.getX()
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.f5071W = r0
            r6.f5069U = r0
            float r0 = r18.getY()
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.f5072a0 = r0
            r6.f5070V = r0
            if (r11 == 0) goto L_0x01e4
            r10 = r10 | 2
        L_0x01e4:
            r6.mo5267I1(r10, r8)
        L_0x01e7:
            if (r8 != 0) goto L_0x01ee
            android.view.VelocityTracker r0 = r6.f5068T
            r0.addMovement(r12)
        L_0x01ee:
            r12.recycle()
            return r9
        L_0x01f2:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: p0 */
    public void mo5380p0(View view, Rect rect) {
        m6200q0(view, rect);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p1 */
    public void mo5381p1() {
        C1734f0 f0Var;
        int g = this.f5085i.mo5922g();
        for (int i = 0; i < g; i++) {
            View f = this.f5085i.mo5921f(i);
            C1734f0 n0 = mo5364n0(f);
            if (!(n0 == null || (f0Var = n0.mShadowingHolder) == null)) {
                View view = f0Var.itemView;
                int left = f.getLeft();
                int top = f.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo5382q(C1734f0 f0Var, C1742m.C1744b bVar, C1742m.C1744b bVar2) {
        m6196i(f0Var);
        f0Var.setIsRecyclable(false);
        if (this.f5065Q.mo5592c(f0Var, bVar, bVar2)) {
            mo5300Z0();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo5383r(String str) {
        if (mo5262G0()) {
            if (str == null) {
                throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + mo5292V());
            }
            throw new IllegalStateException(str);
        } else if (this.f5059K > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + mo5292V()));
        }
    }

    /* access modifiers changed from: protected */
    public void removeDetachedView(View view, boolean z) {
        C1734f0 o0 = m6198o0(view);
        if (o0 != null) {
            if (o0.isTmpDetached()) {
                o0.clearTmpDetachFlag();
            } else if (!o0.shouldIgnore()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + o0 + mo5292V());
            }
        }
        view.clearAnimation();
        mo5259F(view);
        super.removeDetachedView(view, z);
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.f5101q.mo5693m1(this, this.f5092l0, view, view2) && view2 != null) {
            m6201q1(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.f5101q.mo5625D1(this, view, rect, z);
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.f5107t.size();
        for (int i = 0; i < size; i++) {
            ((C1755t) this.f5107t.get(i)).mo5738c(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void requestLayout() {
        if (this.f5119z != 0 || this.f5047B) {
            this.f5045A = true;
        } else {
            super.requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public boolean mo5389s(C1734f0 f0Var) {
        C1742m mVar = this.f5065Q;
        if (mVar == null || mVar.mo5595g(f0Var, f0Var.getUnmodifiedPayloads())) {
            return true;
        }
        return false;
    }

    public void scrollBy(int i, int i2) {
        C1747p pVar = this.f5101q;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.f5047B) {
            boolean v = pVar.mo5226v();
            boolean w = this.f5101q.mo5227w();
            if (v || w) {
                if (!v) {
                    i = 0;
                }
                if (!w) {
                    i2 = 0;
                }
                mo5420v1(i, i2, (MotionEvent) null, 0);
            }
        }
    }

    public void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!mo5250B1(accessibilityEvent)) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        }
    }

    public void setAccessibilityDelegateCompat(C1829t tVar) {
        this.f5106s0 = tVar;
        ViewCompat.m3619r0(this, tVar);
    }

    public void setAdapter(C1736h hVar) {
        setLayoutFrozen(false);
        m6213y1(hVar, false, true);
        mo5302c1(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(C1740k kVar) {
        if (kVar != null) {
            setChildrenDrawingOrderEnabled(false);
        }
    }

    public void setClipToPadding(boolean z) {
        if (z != this.f5089k) {
            mo5254D0();
        }
        this.f5089k = z;
        super.setClipToPadding(z);
        if (this.f5117y) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(C1741l lVar) {
        C1008h.m3530g(lVar);
        this.f5060L = lVar;
        mo5254D0();
    }

    public void setHasFixedSize(boolean z) {
        this.f5113w = z;
    }

    public void setItemAnimator(C1742m mVar) {
        C1742m mVar2 = this.f5065Q;
        if (mVar2 != null) {
            mVar2.mo5599k();
            this.f5065Q.mo5610v((C1742m.C1743a) null);
        }
        this.f5065Q = mVar;
        if (mVar != null) {
            mVar.mo5610v(this.f5102q0);
        }
    }

    public void setItemViewCacheSize(int i) {
        this.f5079f.mo5764M(i);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(C1747p pVar) {
        if (pVar != this.f5101q) {
            mo5275M1();
            if (this.f5101q != null) {
                C1742m mVar = this.f5065Q;
                if (mVar != null) {
                    mVar.mo5599k();
                }
                this.f5101q.mo5715w1(this.f5079f);
                this.f5101q.mo5717x1(this.f5079f);
                this.f5079f.mo5772d();
                if (this.f5111v) {
                    this.f5101q.mo5641M(this, this.f5079f);
                }
                this.f5101q.mo5653R1((RecyclerView) null);
                this.f5101q = null;
            } else {
                this.f5079f.mo5772d();
            }
            this.f5085i.mo5928o();
            this.f5101q = pVar;
            if (pVar != null) {
                if (pVar.f5183e == null) {
                    pVar.mo5653R1(this);
                    if (this.f5111v) {
                        this.f5101q.mo5638L(this);
                    }
                } else {
                    throw new IllegalArgumentException("LayoutManager " + pVar + " is already attached to a RecyclerView:" + pVar.f5183e.mo5292V());
                }
            }
            this.f5079f.mo5767Q();
            requestLayout();
        }
    }

    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition((LayoutTransition) null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    public void setNestedScrollingEnabled(boolean z) {
        getScrollingChildHelper().mo3743n(z);
    }

    public void setOnFlingListener(C1754s sVar) {
        this.f5074c0 = sVar;
    }

    @Deprecated
    public void setOnScrollListener(C1756u uVar) {
        this.f5094m0 = uVar;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.f5084h0 = z;
    }

    public void setRecycledViewPool(C1757v vVar) {
        this.f5079f.mo5762K(vVar);
    }

    @Deprecated
    public void setRecyclerListener(C1760x xVar) {
    }

    /* access modifiers changed from: package-private */
    public void setScrollState(int i) {
        if (i != this.f5066R) {
            this.f5066R = i;
            if (i != 2) {
                m6179N1();
            }
            mo5276N(i);
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i != 1) {
                Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
            } else {
                this.f5073b0 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
        }
        this.f5073b0 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(C1730d0 d0Var) {
        this.f5079f.mo5763L(d0Var);
    }

    public boolean startNestedScroll(int i) {
        return getScrollingChildHelper().mo3744p(i);
    }

    public void stopNestedScroll() {
        getScrollingChildHelper().mo3746r();
    }

    public final void suppressLayout(boolean z) {
        if (z != this.f5047B) {
            mo5383r("Do not suppressLayout in layout or scroll");
            if (!z) {
                this.f5047B = false;
                if (!(!this.f5045A || this.f5101q == null || this.f5099p == null)) {
                    requestLayout();
                }
                this.f5045A = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, 0));
            this.f5047B = true;
            this.f5049C = true;
            mo5275M1();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t0 */
    public Rect mo5416t0(View view) {
        C1752q qVar = (C1752q) view.getLayoutParams();
        if (!qVar.f5208f) {
            return qVar.f5207e;
        }
        if (this.f5092l0.mo5464e() && (qVar.mo5730d() || qVar.mo5732f())) {
            return qVar.f5207e;
        }
        Rect rect = qVar.f5207e;
        rect.set(0, 0, 0, 0);
        int size = this.f5105s.size();
        for (int i = 0; i < size; i++) {
            this.f5093m.set(0, 0, 0, 0);
            ((C1746o) this.f5105s.get(i)).mo5615e(this.f5093m, view, this, this.f5092l0);
            int i2 = rect.left;
            Rect rect2 = this.f5093m;
            rect.left = i2 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        qVar.f5208f = false;
        return rect;
    }

    /* renamed from: u0 */
    public C1746o mo5417u0(int i) {
        int itemDecorationCount = getItemDecorationCount();
        if (i >= 0 && i < itemDecorationCount) {
            return (C1746o) this.f5105s.get(i);
        }
        throw new IndexOutOfBoundsException(i + " is an invalid index for size " + itemDecorationCount);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u1 */
    public void mo5418u1() {
        int j = this.f5085i.mo5924j();
        for (int i = 0; i < j; i++) {
            C1734f0 o0 = m6198o0(this.f5085i.mo5923i(i));
            if (!o0.shouldIgnore()) {
                o0.saveOldPosition();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo5419v() {
        int j = this.f5085i.mo5924j();
        for (int i = 0; i < j; i++) {
            C1734f0 o0 = m6198o0(this.f5085i.mo5923i(i));
            if (!o0.shouldIgnore()) {
                o0.clearOldPosition();
            }
        }
        this.f5079f.mo5773e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v1 */
    public boolean mo5420v1(int i, int i2, MotionEvent motionEvent, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        int i8 = i;
        int i9 = i2;
        MotionEvent motionEvent2 = motionEvent;
        mo5249A();
        if (this.f5099p != null) {
            int[] iArr = this.f5116x0;
            iArr[0] = 0;
            iArr[1] = 0;
            mo5422w1(i8, i9, iArr);
            int[] iArr2 = this.f5116x0;
            int i12 = iArr2[0];
            int i13 = iArr2[1];
            i7 = i13;
            i6 = i12;
            i5 = i8 - i12;
            i4 = i9 - i13;
        } else {
            i7 = 0;
            i6 = 0;
            i5 = 0;
            i4 = 0;
        }
        if (!this.f5105s.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.f5116x0;
        iArr3[0] = 0;
        iArr3[1] = 0;
        mo5273M(i6, i7, i5, i4, this.f5112v0, i3, iArr3);
        int[] iArr4 = this.f5116x0;
        int i14 = iArr4[0];
        int i15 = i5 - i14;
        int i16 = iArr4[1];
        int i17 = i4 - i16;
        if (i14 == 0 && i16 == 0) {
            z = false;
        } else {
            z = true;
        }
        int i18 = this.f5071W;
        int[] iArr5 = this.f5112v0;
        int i19 = iArr5[0];
        this.f5071W = i18 - i19;
        int i22 = this.f5072a0;
        int i23 = iArr5[1];
        this.f5072a0 = i22 - i23;
        int[] iArr6 = this.f5114w0;
        iArr6[0] = iArr6[0] + i19;
        iArr6[1] = iArr6[1] + i23;
        if (getOverScrollMode() != 2) {
            if (motionEvent2 != null && !C1248u0.m4361h(motionEvent2, 8194)) {
                m6188d1(motionEvent.getX(), (float) i15, motionEvent.getY(), (float) i17);
            }
            mo5421w(i, i2);
        }
        if (!(i6 == 0 && i7 == 0)) {
            mo5278O(i6, i7);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        if (!z && i6 == 0 && i7 == 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo5421w(int i, int i2) {
        boolean z;
        EdgeEffect edgeEffect = this.f5061M;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            z = false;
        } else {
            this.f5061M.onRelease();
            z = this.f5061M.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f5063O;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.f5063O.onRelease();
            z |= this.f5063O.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f5062N;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.f5062N.onRelease();
            z |= this.f5062N.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f5064P;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.f5064P.onRelease();
            z |= this.f5064P.isFinished();
        }
        if (z) {
            ViewCompat.m3601i0(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w1 */
    public void mo5422w1(int i, int i2, int[] iArr) {
        int i3;
        int i4;
        mo5265H1();
        mo5289T0();
        C0934x.m3381a("RV Scroll");
        mo5294W(this.f5092l0);
        if (i != 0) {
            i3 = this.f5101q.mo5152I1(i, this.f5079f, this.f5092l0);
        } else {
            i3 = 0;
        }
        if (i2 != 0) {
            i4 = this.f5101q.mo5153K1(i2, this.f5079f, this.f5092l0);
        } else {
            i4 = 0;
        }
        C0934x.m3382b();
        mo5381p1();
        mo5291U0();
        mo5270K1(false);
        if (iArr != null) {
            iArr[0] = i3;
            iArr[1] = i4;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public int mo5423x(int i) {
        return m6211y(i, this.f5061M, this.f5063O, getWidth());
    }

    /* renamed from: x0 */
    public boolean mo5424x0() {
        if (!this.f5117y || this.f5056H || this.f5083h.mo5880p()) {
            return true;
        }
        return false;
    }

    /* renamed from: x1 */
    public void mo5425x1(int i) {
        if (!this.f5047B) {
            mo5275M1();
            C1747p pVar = this.f5101q;
            if (pVar == null) {
                Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
                return;
            }
            pVar.mo5197J1(i);
            awakenScrollBars();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public int mo5426z(int i) {
        return m6211y(i, this.f5062N, this.f5064P, getHeight());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z0 */
    public void mo5427z0() {
        this.f5083h = new C1769a(new C1733f());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z1 */
    public boolean mo5428z1(C1734f0 f0Var, int i) {
        if (mo5262G0()) {
            f0Var.mPendingAccessibilityState = i;
            this.f5118y0.add(f0Var);
            return false;
        }
        ViewCompat.m3544C0(f0Var.itemView, i);
        return true;
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C8304a.f23535a);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1720a();

        /* renamed from: f */
        Parcelable f5121f;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$SavedState$a */
        class C1720a implements Parcelable.ClassLoaderCreator {
            C1720a() {
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            /* renamed from: c */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f5121f = parcel.readParcelable(classLoader == null ? C1747p.class.getClassLoader() : classLoader);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo5429b(SavedState savedState) {
            this.f5121f = savedState.f5121f;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.f5121f, 0);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        int i2 = i;
        this.f5077e = new C1761y();
        this.f5079f = new C1759w();
        this.f5087j = new C1839y();
        this.f5091l = new C1721a();
        this.f5093m = new Rect();
        this.f5095n = new Rect();
        this.f5097o = new RectF();
        this.f5103r = new ArrayList();
        this.f5105s = new ArrayList();
        this.f5107t = new ArrayList();
        this.f5119z = 0;
        this.f5056H = false;
        this.f5057I = false;
        this.f5058J = 0;
        this.f5059K = 0;
        this.f5060L = f5044O0;
        this.f5065Q = new C1785g();
        this.f5066R = 0;
        this.f5067S = -1;
        this.f5080f0 = Float.MIN_VALUE;
        this.f5082g0 = Float.MIN_VALUE;
        this.f5084h0 = true;
        this.f5086i0 = new C1732e0();
        this.f5090k0 = f5039J0 ? new C1812k.C1814b() : null;
        this.f5092l0 = new C1726b0();
        this.f5098o0 = false;
        this.f5100p0 = false;
        this.f5102q0 = new C1745n();
        this.f5104r0 = false;
        this.f5108t0 = new int[2];
        this.f5112v0 = new int[2];
        this.f5114w0 = new int[2];
        this.f5116x0 = new int[2];
        this.f5118y0 = new ArrayList();
        this.f5120z0 = new C1725b();
        this.f5048B0 = 0;
        this.f5050C0 = 0;
        this.f5052D0 = new C1729d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f5073b0 = viewConfiguration.getScaledTouchSlop();
        this.f5080f0 = C1117b3.m4137b(viewConfiguration, context2);
        this.f5082g0 = C1117b3.m4139d(viewConfiguration, context2);
        this.f5076d0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f5078e0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f5075d = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.f5065Q.mo5610v(this.f5102q0);
        mo5427z0();
        m6170B0();
        m6167A0();
        if (ViewCompat.m3634z(this) == 0) {
            ViewCompat.m3544C0(this, 1);
        }
        this.f5054F = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new C1829t(this));
        int[] iArr = C8306c.f23539a;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet2, iArr, i2, 0);
        ViewCompat.m3615p0(this, context, iArr, attributeSet, obtainStyledAttributes, i, 0);
        String string = obtainStyledAttributes.getString(C8306c.f23548j);
        if (obtainStyledAttributes.getInt(C8306c.f23542d, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f5089k = obtainStyledAttributes.getBoolean(C8306c.f23541c, true);
        boolean z = obtainStyledAttributes.getBoolean(C8306c.f23543e, false);
        this.f5115x = z;
        if (z) {
            mo5252C0((StateListDrawable) obtainStyledAttributes.getDrawable(C8306c.f23546h), obtainStyledAttributes.getDrawable(C8306c.f23547i), (StateListDrawable) obtainStyledAttributes.getDrawable(C8306c.f23544f), obtainStyledAttributes.getDrawable(C8306c.f23545g));
        }
        obtainStyledAttributes.recycle();
        m6169B(context, string, attributeSet, i, 0);
        int[] iArr2 = f5034E0;
        TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet2, iArr2, i2, 0);
        ViewCompat.m3615p0(this, context, iArr2, attributeSet, obtainStyledAttributes2, i, 0);
        boolean z2 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z2);
        C9147a.m33776d(this, true);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$q */
    public static class C1752q extends ViewGroup.MarginLayoutParams {

        /* renamed from: d */
        C1734f0 f5206d;

        /* renamed from: e */
        final Rect f5207e = new Rect();

        /* renamed from: f */
        boolean f5208f = true;

        /* renamed from: g */
        boolean f5209g = false;

        public C1752q(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: a */
        public int mo5728a() {
            return this.f5206d.getBindingAdapterPosition();
        }

        /* renamed from: b */
        public int mo5729b() {
            return this.f5206d.getLayoutPosition();
        }

        /* renamed from: d */
        public boolean mo5730d() {
            return this.f5206d.isUpdated();
        }

        /* renamed from: e */
        public boolean mo5731e() {
            return this.f5206d.isRemoved();
        }

        /* renamed from: f */
        public boolean mo5732f() {
            return this.f5206d.isInvalid();
        }

        public C1752q(int i, int i2) {
            super(i, i2);
        }

        public C1752q(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C1752q(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C1752q(C1752q qVar) {
            super(qVar);
        }
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C1747p pVar = this.f5101q;
        if (pVar != null) {
            return pVar.mo5157R(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + mo5292V());
    }
}
