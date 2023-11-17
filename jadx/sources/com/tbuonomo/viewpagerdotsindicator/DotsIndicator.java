package com.tbuonomo.viewpagerdotsindicator;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.tbuonomo.viewpagerdotsindicator.C11829a;
import java.util.ArrayList;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class DotsIndicator extends C11829a {

    /* renamed from: q */
    public static final C11826a f34342q = new C11826a((DefaultConstructorMarker) null);

    /* renamed from: l */
    private LinearLayout f34343l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public float f34344m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public boolean f34345n;

    /* renamed from: o */
    private int f34346o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final ArgbEvaluator f34347p;

    /* renamed from: com.tbuonomo.viewpagerdotsindicator.DotsIndicator$a */
    public static final class C11826a {
        private C11826a() {
        }

        public /* synthetic */ C11826a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.tbuonomo.viewpagerdotsindicator.DotsIndicator$b */
    static final class C11827b implements View.OnClickListener {

        /* renamed from: d */
        final /* synthetic */ DotsIndicator f34348d;

        /* renamed from: e */
        final /* synthetic */ int f34349e;

        C11827b(DotsIndicator dotsIndicator, int i) {
            this.f34348d = dotsIndicator;
            this.f34349e = i;
        }

        public final void onClick(View view) {
            int i;
            if (this.f34348d.getDotsClickable()) {
                int i2 = this.f34349e;
                C11829a.C11831b pager = this.f34348d.getPager();
                if (pager != null) {
                    i = pager.getCount();
                } else {
                    i = 0;
                }
                if (i2 < i) {
                    C11829a.C11831b pager2 = this.f34348d.getPager();
                    if (pager2 == null) {
                        C41536l.m120500t();
                    }
                    pager2.mo31727a(this.f34349e, true);
                }
            }
        }
    }

    /* renamed from: com.tbuonomo.viewpagerdotsindicator.DotsIndicator$c */
    public static final class C11828c extends C11841c {

        /* renamed from: c */
        final /* synthetic */ DotsIndicator f34350c;

        C11828c(DotsIndicator dotsIndicator) {
            this.f34350c = dotsIndicator;
        }

        /* renamed from: a */
        public int mo31699a() {
            return this.f34350c.f34352d.size();
        }

        /* renamed from: c */
        public void mo31700c(int i, int i2, float f) {
            Object obj = this.f34350c.f34352d.get(i);
            C41536l.m120485e(obj, "dots[selectedPosition]");
            ImageView imageView = (ImageView) obj;
            float f2 = (float) 1;
            this.f34350c.mo31717s(imageView, (int) (this.f34350c.getDotsSize() + (this.f34350c.getDotsSize() * (this.f34350c.f34344m - f2) * (f2 - f))));
            DotsIndicator dotsIndicator = this.f34350c;
            if (dotsIndicator.mo31710h(dotsIndicator.f34352d, i2)) {
                Object obj2 = this.f34350c.f34352d.get(i2);
                C41536l.m120485e(obj2, "dots[nextPosition]");
                ImageView imageView2 = (ImageView) obj2;
                this.f34350c.mo31717s(imageView2, (int) (this.f34350c.getDotsSize() + (this.f34350c.getDotsSize() * (this.f34350c.f34344m - f2) * f)));
                Drawable background = imageView.getBackground();
                if (background != null) {
                    C11840b bVar = (C11840b) background;
                    Drawable background2 = imageView2.getBackground();
                    if (background2 != null) {
                        C11840b bVar2 = (C11840b) background2;
                        if (this.f34350c.getSelectedDotColor() != this.f34350c.getDotsColor()) {
                            Object evaluate = this.f34350c.f34347p.evaluate(f, Integer.valueOf(this.f34350c.getSelectedDotColor()), Integer.valueOf(this.f34350c.getDotsColor()));
                            if (evaluate != null) {
                                int intValue = ((Integer) evaluate).intValue();
                                Object evaluate2 = this.f34350c.f34347p.evaluate(f, Integer.valueOf(this.f34350c.getDotsColor()), Integer.valueOf(this.f34350c.getSelectedDotColor()));
                                if (evaluate2 != null) {
                                    bVar2.setColor(((Integer) evaluate2).intValue());
                                    if (this.f34350c.f34345n) {
                                        C11829a.C11831b pager = this.f34350c.getPager();
                                        if (pager == null) {
                                            C41536l.m120500t();
                                        }
                                        if (i <= pager.mo31728b()) {
                                            bVar.setColor(this.f34350c.getSelectedDotColor());
                                        }
                                    }
                                    bVar.setColor(intValue);
                                } else {
                                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
                                }
                            } else {
                                throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
                            }
                        }
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type com.tbuonomo.viewpagerdotsindicator.DotsGradientDrawable");
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.tbuonomo.viewpagerdotsindicator.DotsGradientDrawable");
                }
            }
            this.f34350c.invalidate();
        }

        /* renamed from: d */
        public void mo31701d(int i) {
            DotsIndicator dotsIndicator = this.f34350c;
            Object obj = dotsIndicator.f34352d.get(i);
            C41536l.m120485e(obj, "dots[position]");
            dotsIndicator.mo31717s((View) obj, (int) this.f34350c.getDotsSize());
            this.f34350c.mo31694k(i);
        }
    }

    public DotsIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    /* renamed from: w */
    private final void m43303w(AttributeSet attributeSet) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f34343l = linearLayout;
        linearLayout.setOrientation(0);
        addView(this.f34343l, -2, -2);
        this.f34344m = 2.5f;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C11844f.f34442u);
            setSelectedDotColor(obtainStyledAttributes.getColor(C11844f.f34385B, -16711681));
            float f = obtainStyledAttributes.getFloat(C11844f.f34447z, 2.5f);
            this.f34344m = f;
            if (f < ((float) 1)) {
                this.f34344m = 2.5f;
            }
            this.f34345n = obtainStyledAttributes.getBoolean(C11844f.f34384A, false);
            obtainStyledAttributes.recycle();
        }
        if (isInEditMode()) {
            mo31702e(5);
            mo31713l();
        }
    }

    /* renamed from: d */
    public void mo31690d(int i) {
        int i2;
        int i3;
        View inflate = LayoutInflater.from(getContext()).inflate(C11843e.dot_layout, this, false);
        ImageView imageView = (ImageView) inflate.findViewById(C11842d.dot);
        C41536l.m120485e(imageView, "imageView");
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams != null) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            C41536l.m120485e(inflate, "dot");
            inflate.setLayoutDirection(0);
            int dotsSize = (int) getDotsSize();
            layoutParams2.height = dotsSize;
            layoutParams2.width = dotsSize;
            layoutParams2.setMargins((int) getDotsSpacing(), 0, (int) getDotsSpacing(), 0);
            C11840b bVar = new C11840b();
            bVar.setCornerRadius(getDotsCornerRadius());
            if (isInEditMode()) {
                if (i == 0) {
                    i3 = this.f34346o;
                } else {
                    i3 = getDotsColor();
                }
                bVar.setColor(i3);
            } else {
                C11829a.C11831b pager = getPager();
                if (pager == null) {
                    C41536l.m120500t();
                }
                if (pager.mo31728b() == i) {
                    i2 = this.f34346o;
                } else {
                    i2 = getDotsColor();
                }
                bVar.setColor(i2);
            }
            imageView.setBackgroundDrawable(bVar);
            inflate.setOnClickListener(new C11827b(this, i));
            this.f34352d.add(imageView);
            LinearLayout linearLayout = this.f34343l;
            if (linearLayout == null) {
                C41536l.m120500t();
            }
            linearLayout.addView(inflate);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
    }

    /* renamed from: f */
    public C11841c mo31691f() {
        return new C11828c(this);
    }

    public final int getSelectedDotColor() {
        return this.f34346o;
    }

    public C11829a.C11832c getType() {
        return C11829a.C11832c.DEFAULT;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0035, code lost:
        if (r4 < r2.mo31728b()) goto L_0x0040;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo31694k(int r4) {
        /*
            r3 = this;
            java.util.ArrayList r0 = r3.f34352d
            java.lang.Object r0 = r0.get(r4)
            java.lang.String r1 = "dots[index]"
            kotlin.jvm.internal.C41536l.m120485e(r0, r1)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            android.graphics.drawable.Drawable r1 = r0.getBackground()
            if (r1 == 0) goto L_0x004c
            com.tbuonomo.viewpagerdotsindicator.b r1 = (com.tbuonomo.viewpagerdotsindicator.C11840b) r1
            com.tbuonomo.viewpagerdotsindicator.a$b r2 = r3.getPager()
            if (r2 != 0) goto L_0x001e
            kotlin.jvm.internal.C41536l.m120500t()
        L_0x001e:
            int r2 = r2.mo31728b()
            if (r4 == r2) goto L_0x0040
            boolean r2 = r3.f34345n
            if (r2 == 0) goto L_0x0038
            com.tbuonomo.viewpagerdotsindicator.a$b r2 = r3.getPager()
            if (r2 != 0) goto L_0x0031
            kotlin.jvm.internal.C41536l.m120500t()
        L_0x0031:
            int r2 = r2.mo31728b()
            if (r4 >= r2) goto L_0x0038
            goto L_0x0040
        L_0x0038:
            int r4 = r3.getDotsColor()
            r1.setColor(r4)
            goto L_0x0045
        L_0x0040:
            int r4 = r3.f34346o
            r1.setColor(r4)
        L_0x0045:
            r0.setBackgroundDrawable(r1)
            r0.invalidate()
            return
        L_0x004c:
            kotlin.TypeCastException r4 = new kotlin.TypeCastException
            java.lang.String r0 = "null cannot be cast to non-null type com.tbuonomo.viewpagerdotsindicator.DotsGradientDrawable"
            r4.<init>(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tbuonomo.viewpagerdotsindicator.DotsIndicator.mo31694k(int):void");
    }

    /* renamed from: q */
    public void mo31695q(int i) {
        LinearLayout linearLayout = this.f34343l;
        if (linearLayout == null) {
            C41536l.m120500t();
        }
        linearLayout.removeViewAt(getChildCount() - 1);
        ArrayList arrayList = this.f34352d;
        arrayList.remove(arrayList.size() - 1);
    }

    public final void setSelectedDotColor(int i) {
        this.f34346o = i;
        mo31714m();
    }

    public final void setSelectedPointColor(int i) {
        setSelectedDotColor(i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DotsIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C41536l.m120490j(context, "context");
        this.f34347p = new ArgbEvaluator();
        m43303w(attributeSet);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DotsIndicator(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
