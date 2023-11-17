package com.tbuonomo.viewpagerdotsindicator;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.C1907a;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.tbuonomo.viewpagerdotsindicator.a */
public abstract class C11829a extends FrameLayout {

    /* renamed from: k */
    public static final C11830a f34351k = new C11830a((DefaultConstructorMarker) null);

    /* renamed from: d */
    protected final ArrayList f34352d = new ArrayList();

    /* renamed from: e */
    private boolean f34353e = true;

    /* renamed from: f */
    private int f34354f = -16711681;

    /* renamed from: g */
    private float f34355g;

    /* renamed from: h */
    private float f34356h;

    /* renamed from: i */
    private float f34357i;

    /* renamed from: j */
    private C11831b f34358j;

    /* renamed from: com.tbuonomo.viewpagerdotsindicator.a$a */
    public static final class C11830a {
        private C11830a() {
        }

        public /* synthetic */ C11830a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.tbuonomo.viewpagerdotsindicator.a$b */
    public interface C11831b {
        /* renamed from: a */
        void mo31727a(int i, boolean z);

        /* renamed from: b */
        int mo31728b();

        /* renamed from: c */
        void mo31729c(C11841c cVar);

        /* renamed from: d */
        boolean mo31730d();

        /* renamed from: e */
        void mo31731e();

        int getCount();
    }

    /* renamed from: com.tbuonomo.viewpagerdotsindicator.a$c */
    public enum C11832c {
        DEFAULT(16.0f, 8.0f, r6, C11844f.f34404U, C11844f.f34406W, C11844f.f34407X, C11844f.f34405V),
        SPRING(16.0f, 4.0f, r2, C11844f.f34443v, C11844f.f34445x, C11844f.f34446y, C11844f.f34444w),
        WORM(16.0f, 4.0f, r8, C11844f.f34427i0, C11844f.f34431k0, C11844f.f34433l0, C11844f.f34429j0);
        

        /* renamed from: d */
        private final float f34363d;

        /* renamed from: e */
        private final float f34364e;

        /* renamed from: f */
        private final int[] f34365f;

        /* renamed from: g */
        private final int f34366g;

        /* renamed from: h */
        private final int f34367h;

        /* renamed from: i */
        private final int f34368i;

        /* renamed from: j */
        private final int f34369j;

        private C11832c(float f, float f2, int[] iArr, int i, int i2, int i3, int i4) {
            this.f34363d = f;
            this.f34364e = f2;
            this.f34365f = iArr;
            this.f34366g = i;
            this.f34367h = i2;
            this.f34368i = i3;
            this.f34369j = i4;
        }

        /* renamed from: a */
        public final float mo31733a() {
            return this.f34363d;
        }

        /* renamed from: b */
        public final float mo31734b() {
            return this.f34364e;
        }

        /* renamed from: c */
        public final int mo31735c() {
            return this.f34366g;
        }

        /* renamed from: e */
        public final int mo31736e() {
            return this.f34369j;
        }

        /* renamed from: f */
        public final int mo31737f() {
            return this.f34367h;
        }

        /* renamed from: g */
        public final int mo31738g() {
            return this.f34368i;
        }

        /* renamed from: h */
        public final int[] mo31739h() {
            return this.f34365f;
        }
    }

    /* renamed from: com.tbuonomo.viewpagerdotsindicator.a$d */
    static final class C11833d implements Runnable {

        /* renamed from: d */
        final /* synthetic */ C11829a f34370d;

        C11833d(C11829a aVar) {
            this.f34370d = aVar;
        }

        public final void run() {
            this.f34370d.m43314n();
            this.f34370d.mo31714m();
            this.f34370d.m43315o();
            this.f34370d.m43316p();
        }
    }

    /* renamed from: com.tbuonomo.viewpagerdotsindicator.a$e */
    public static final class C11834e extends DataSetObserver {

        /* renamed from: a */
        final /* synthetic */ C11829a f34371a;

        C11834e(C11829a aVar) {
            this.f34371a = aVar;
        }

        public void onChanged() {
            super.onChanged();
            this.f34371a.mo31713l();
        }
    }

    /* renamed from: com.tbuonomo.viewpagerdotsindicator.a$f */
    public static final class C11835f implements C11831b {

        /* renamed from: a */
        private ViewPager.C1902j f34372a;

        /* renamed from: b */
        final /* synthetic */ C11829a f34373b;

        /* renamed from: c */
        final /* synthetic */ ViewPager f34374c;

        /* renamed from: com.tbuonomo.viewpagerdotsindicator.a$f$a */
        public static final class C11836a implements ViewPager.C1902j {

            /* renamed from: d */
            final /* synthetic */ C11841c f34375d;

            C11836a(C11841c cVar) {
                this.f34375d = cVar;
            }

            /* renamed from: L */
            public void mo6548L(int i, float f, int i2) {
                this.f34375d.mo31743b(i, f);
            }

            /* renamed from: Q */
            public void mo6549Q(int i) {
            }

            /* renamed from: l0 */
            public void mo6550l0(int i) {
            }
        }

        C11835f(C11829a aVar, ViewPager viewPager) {
            this.f34373b = aVar;
            this.f34374c = viewPager;
        }

        /* renamed from: a */
        public void mo31727a(int i, boolean z) {
            this.f34374c.setCurrentItem(i, z);
        }

        /* renamed from: b */
        public int mo31728b() {
            return this.f34374c.getCurrentItem();
        }

        /* renamed from: c */
        public void mo31729c(C11841c cVar) {
            C41536l.m120490j(cVar, "onPageChangeListenerHelper");
            C11836a aVar = new C11836a(cVar);
            this.f34372a = aVar;
            this.f34374c.addOnPageChangeListener(aVar);
        }

        /* renamed from: d */
        public boolean mo31730d() {
            return this.f34373b.mo31711i(this.f34374c);
        }

        /* renamed from: e */
        public void mo31731e() {
            ViewPager.C1902j jVar = this.f34372a;
            if (jVar != null) {
                this.f34374c.removeOnPageChangeListener(jVar);
            }
        }

        public int getCount() {
            C1907a adapter = this.f34374c.getAdapter();
            if (adapter != null) {
                return adapter.mo6557d();
            }
            return 0;
        }
    }

    /* renamed from: com.tbuonomo.viewpagerdotsindicator.a$g */
    public static final class C11837g extends RecyclerView.C1739j {

        /* renamed from: a */
        final /* synthetic */ C11829a f34376a;

        C11837g(C11829a aVar) {
            this.f34376a = aVar;
        }

        /* renamed from: a */
        public void mo5583a() {
            super.mo5583a();
            this.f34376a.mo31713l();
        }
    }

    /* renamed from: com.tbuonomo.viewpagerdotsindicator.a$h */
    public static final class C11838h implements C11831b {

        /* renamed from: a */
        private ViewPager2.C1928i f34377a;

        /* renamed from: b */
        final /* synthetic */ C11829a f34378b;

        /* renamed from: c */
        final /* synthetic */ ViewPager2 f34379c;

        /* renamed from: com.tbuonomo.viewpagerdotsindicator.a$h$a */
        public static final class C11839a extends ViewPager2.C1928i {

            /* renamed from: a */
            final /* synthetic */ C11841c f34380a;

            C11839a(C11841c cVar) {
                this.f34380a = cVar;
            }

            public void onPageScrolled(int i, float f, int i2) {
                super.onPageScrolled(i, f, i2);
                this.f34380a.mo31743b(i, f);
            }
        }

        C11838h(C11829a aVar, ViewPager2 viewPager2) {
            this.f34378b = aVar;
            this.f34379c = viewPager2;
        }

        /* renamed from: a */
        public void mo31727a(int i, boolean z) {
            this.f34379c.mo6606l(i, z);
        }

        /* renamed from: b */
        public int mo31728b() {
            return this.f34379c.getCurrentItem();
        }

        /* renamed from: c */
        public void mo31729c(C11841c cVar) {
            C41536l.m120490j(cVar, "onPageChangeListenerHelper");
            C11839a aVar = new C11839a(cVar);
            this.f34377a = aVar;
            this.f34379c.mo6603h(aVar);
        }

        /* renamed from: d */
        public boolean mo31730d() {
            return this.f34378b.mo31712j(this.f34379c);
        }

        /* renamed from: e */
        public void mo31731e() {
            ViewPager2.C1928i iVar = this.f34377a;
            if (iVar != null) {
                this.f34379c.mo6614p(iVar);
            }
        }

        public int getCount() {
            RecyclerView.C1736h adapter = this.f34379c.getAdapter();
            if (adapter != null) {
                return adapter.getItemCount();
            }
            return 0;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11829a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C41536l.m120490j(context, "context");
        float g = mo31703g(getType().mo31733a());
        this.f34355g = g;
        this.f34356h = g / 2.0f;
        this.f34357i = mo31703g(getType().mo31734b());
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, getType().mo31739h());
            setDotsColor(obtainStyledAttributes.getColor(getType().mo31735c(), -16711681));
            this.f34355g = obtainStyledAttributes.getDimension(getType().mo31737f(), this.f34355g);
            this.f34356h = obtainStyledAttributes.getDimension(getType().mo31736e(), this.f34356h);
            this.f34357i = obtainStyledAttributes.getDimension(getType().mo31738g(), this.f34357i);
            obtainStyledAttributes.recycle();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public final void m43314n() {
        int size = this.f34352d.size();
        C11831b bVar = this.f34358j;
        if (bVar == null) {
            C41536l.m120500t();
        }
        if (size < bVar.getCount()) {
            C11831b bVar2 = this.f34358j;
            if (bVar2 == null) {
                C41536l.m120500t();
            }
            mo31702e(bVar2.getCount() - this.f34352d.size());
            return;
        }
        int size2 = this.f34352d.size();
        C11831b bVar3 = this.f34358j;
        if (bVar3 == null) {
            C41536l.m120500t();
        }
        if (size2 > bVar3.getCount()) {
            int size3 = this.f34352d.size();
            C11831b bVar4 = this.f34358j;
            if (bVar4 == null) {
                C41536l.m120500t();
            }
            m43317r(size3 - bVar4.getCount());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public final void m43315o() {
        C11831b bVar = this.f34358j;
        if (bVar == null) {
            C41536l.m120500t();
        }
        int b = bVar.mo31728b();
        for (int i = 0; i < b; i++) {
            Object obj = this.f34352d.get(i);
            C41536l.m120485e(obj, "dots[i]");
            mo31717s((View) obj, (int) this.f34355g);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public final void m43316p() {
        C11831b bVar = this.f34358j;
        if (bVar == null) {
            C41536l.m120500t();
        }
        if (bVar.mo31730d()) {
            C11831b bVar2 = this.f34358j;
            if (bVar2 == null) {
                C41536l.m120500t();
            }
            bVar2.mo31731e();
            C11841c f = mo31691f();
            C11831b bVar3 = this.f34358j;
            if (bVar3 == null) {
                C41536l.m120500t();
            }
            bVar3.mo31729c(f);
            C11831b bVar4 = this.f34358j;
            if (bVar4 == null) {
                C41536l.m120500t();
            }
            f.mo31743b(bVar4.mo31728b(), Utils.FLOAT_EPSILON);
        }
    }

    /* renamed from: r */
    private final void m43317r(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            mo31695q(i2);
        }
    }

    /* renamed from: d */
    public abstract void mo31690d(int i);

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo31702e(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            mo31690d(i2);
        }
    }

    /* renamed from: f */
    public abstract C11841c mo31691f();

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final float mo31703g(float f) {
        Context context = getContext();
        C41536l.m120485e(context, "context");
        Resources resources = context.getResources();
        C41536l.m120485e(resources, "context.resources");
        return resources.getDisplayMetrics().density * f;
    }

    public final boolean getDotsClickable() {
        return this.f34353e;
    }

    public final int getDotsColor() {
        return this.f34354f;
    }

    /* access modifiers changed from: protected */
    public final float getDotsCornerRadius() {
        return this.f34356h;
    }

    /* access modifiers changed from: protected */
    public final float getDotsSize() {
        return this.f34355g;
    }

    /* access modifiers changed from: protected */
    public final float getDotsSpacing() {
        return this.f34357i;
    }

    public final C11831b getPager() {
        return this.f34358j;
    }

    public abstract C11832c getType();

    /* renamed from: h */
    public final boolean mo31710h(ArrayList arrayList, int i) {
        C41536l.m120490j(arrayList, "$this$isInBounds");
        int size = arrayList.size();
        if (i >= 0 && size > i) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final boolean mo31711i(ViewPager viewPager) {
        C41536l.m120490j(viewPager, "$this$isNotEmpty");
        C1907a adapter = viewPager.getAdapter();
        if (adapter == null) {
            C41536l.m120500t();
        }
        C41536l.m120485e(adapter, "adapter!!");
        if (adapter.mo6557d() > 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final boolean mo31712j(ViewPager2 viewPager2) {
        C41536l.m120490j(viewPager2, "$this$isNotEmpty");
        RecyclerView.C1736h adapter = viewPager2.getAdapter();
        if (adapter == null) {
            C41536l.m120500t();
        }
        C41536l.m120485e(adapter, "adapter!!");
        if (adapter.getItemCount() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public abstract void mo31694k(int i);

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo31713l() {
        if (this.f34358j != null) {
            post(new C11833d(this));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo31714m() {
        int size = this.f34352d.size();
        for (int i = 0; i < size; i++) {
            mo31694k(i);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        mo31713l();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (getLayoutDirection() == 1) {
            setLayoutDirection(0);
            setRotation(180.0f);
            requestLayout();
        }
    }

    /* renamed from: q */
    public abstract void mo31695q(int i);

    /* renamed from: s */
    public final void mo31717s(View view, int i) {
        C41536l.m120490j(view, "$this$setWidth");
        view.getLayoutParams().width = i;
        view.requestLayout();
    }

    public final void setDotsClickable(boolean z) {
        this.f34353e = z;
    }

    public final void setDotsColor(int i) {
        this.f34354f = i;
        mo31714m();
    }

    /* access modifiers changed from: protected */
    public final void setDotsCornerRadius(float f) {
        this.f34356h = f;
    }

    /* access modifiers changed from: protected */
    public final void setDotsSize(float f) {
        this.f34355g = f;
    }

    /* access modifiers changed from: protected */
    public final void setDotsSpacing(float f) {
        this.f34357i = f;
    }

    public final void setPager(C11831b bVar) {
        this.f34358j = bVar;
    }

    public final void setPointsColor(int i) {
        setDotsColor(i);
        mo31714m();
    }

    public final void setViewPager(ViewPager viewPager) {
        C41536l.m120490j(viewPager, "viewPager");
        if (viewPager.getAdapter() != null) {
            C1907a adapter = viewPager.getAdapter();
            if (adapter == null) {
                C41536l.m120500t();
            }
            adapter.mo6562k(new C11834e(this));
            this.f34358j = new C11835f(this, viewPager);
            mo31713l();
            return;
        }
        throw new IllegalStateException("You have to set an adapter to the view pager before initializing the dots indicator !");
    }

    public final void setViewPager2(ViewPager2 viewPager2) {
        C41536l.m120490j(viewPager2, "viewPager2");
        if (viewPager2.getAdapter() != null) {
            RecyclerView.C1736h adapter = viewPager2.getAdapter();
            if (adapter == null) {
                C41536l.m120500t();
            }
            adapter.registerAdapterDataObserver(new C11837g(this));
            this.f34358j = new C11838h(this, viewPager2);
            mo31713l();
            return;
        }
        throw new IllegalStateException("You have to set an adapter to the view pager before initializing the dots indicator !");
    }
}
