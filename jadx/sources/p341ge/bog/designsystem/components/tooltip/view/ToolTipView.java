package p341ge.bog.designsystem.components.tooltip.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.github.mikephil.charting.utils.Utils;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p601sg.C17779d;
import p601sg.C17782g;
import p601sg.C17783h;
import p601sg.C17787l;
import p642vh.C18368l;
import p671xj.C18774d;
import p685yj.C18925a;
import p685yj.C18926b;
import p685yj.C18927c;

/* renamed from: ge.bog.designsystem.components.tooltip.view.ToolTipView */
public final class ToolTipView extends FrameLayout {

    /* renamed from: d */
    private C18774d.C18775a f40587d;

    /* renamed from: e */
    private float f40588e;

    /* renamed from: f */
    private int f40589f;

    /* renamed from: g */
    private View f40590g;

    /* renamed from: h */
    private int f40591h;

    /* renamed from: i */
    private int f40592i;

    /* renamed from: j */
    private final int f40593j;

    /* renamed from: k */
    private final int f40594k;

    /* renamed from: l */
    private boolean f40595l;

    /* renamed from: m */
    private final Paint f40596m;

    /* renamed from: n */
    private final Path f40597n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final C18925a f40598o;

    /* renamed from: p */
    private boolean f40599p;

    /* renamed from: q */
    private final Path f40600q;

    /* renamed from: ge.bog.designsystem.components.tooltip.view.ToolTipView$a */
    public static final class C13574a implements C18926b {

        /* renamed from: a */
        final /* synthetic */ ToolTipView f40601a;

        C13574a(ToolTipView toolTipView) {
            this.f40601a = toolTipView;
        }

        /* renamed from: a */
        public Path mo37147a(int i, int i2) {
            return this.f40601a.m50884d(new RectF(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, (float) i, (float) i2));
        }
    }

    /* renamed from: ge.bog.designsystem.components.tooltip.view.ToolTipView$b */
    public /* synthetic */ class C13575b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f40602a;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                xj.d$a[] r0 = p671xj.C18774d.C18775a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                xj.d$a r1 = p671xj.C18774d.C18775a.Bottom     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                xj.d$a r1 = p671xj.C18774d.C18775a.Top     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                xj.d$a r1 = p671xj.C18774d.C18775a.Left     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                xj.d$a r1 = p671xj.C18774d.C18775a.Right     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f40602a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.designsystem.components.tooltip.view.ToolTipView.C13575b.<clinit>():void");
        }
    }

    /* renamed from: ge.bog.designsystem.components.tooltip.view.ToolTipView$c */
    public static final class C13576c extends ViewOutlineProvider {

        /* renamed from: a */
        final /* synthetic */ ToolTipView f40603a;

        C13576c(ToolTipView toolTipView) {
            this.f40603a = toolTipView;
        }

        public void getOutline(View view, Outline outline) {
            Path a;
            C41536l.m120489i(outline, "outline");
            if (!this.f40603a.isInEditMode() && (a = this.f40603a.f40598o.mo46974a()) != null) {
                try {
                    outline.setConvexPath(a);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ToolTipView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    /* renamed from: c */
    private final void m50883c(int i, int i2) {
        this.f40600q.reset();
        this.f40600q.addRect(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, ((float) getWidth()) * 1.0f, ((float) getHeight()) * 1.0f, Path.Direction.CW);
        if (i > 0 && i2 > 0) {
            this.f40598o.mo46975b(i, i2);
            this.f40597n.reset();
            this.f40597n.set(this.f40598o.mo46976z());
            if (Build.VERSION.SDK_INT > 27) {
                this.f40600q.op(this.f40597n, Path.Op.DIFFERENCE);
            }
            try {
                invalidateOutline();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        postInvalidate();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final Path m50884d(RectF rectF) {
        int i;
        int i2;
        int i3;
        int i4;
        float f;
        C18774d.C18775a aVar;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        RectF rectF2 = rectF;
        Path path = new Path();
        C18774d.C18775a aVar2 = this.f40587d;
        C18774d.C18775a aVar3 = C18774d.C18775a.Left;
        if (aVar2 == aVar3) {
            i = this.f40591h;
        } else {
            i = 0;
        }
        float f8 = ((float) i) + rectF2.left;
        C18774d.C18775a aVar4 = C18774d.C18775a.Top;
        if (aVar2 == aVar4) {
            i2 = this.f40591h;
        } else {
            i2 = 0;
        }
        float f9 = ((float) i2) + rectF2.top;
        float f12 = rectF2.right;
        C18774d.C18775a aVar5 = C18774d.C18775a.Right;
        if (aVar2 == aVar5) {
            i3 = this.f40591h;
        } else {
            i3 = 0;
        }
        float f13 = f12 - ((float) i3);
        float f14 = rectF2.bottom;
        C18774d.C18775a aVar6 = C18774d.C18775a.Bottom;
        if (aVar2 == aVar6) {
            i4 = this.f40591h;
        } else {
            i4 = 0;
        }
        float f15 = f14 - ((float) i4);
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        View view = this.f40590g;
        if (view != null) {
            view.getLocationOnScreen(iArr);
        }
        getLocationOnScreen(iArr2);
        float f16 = (rectF2.top + rectF2.bottom) * 0.5f;
        View view2 = this.f40590g;
        if (view2 != null) {
            int i5 = iArr[0];
            int i6 = iArr2[0];
            if (i5 > i6) {
                C41536l.m120486f(view2);
                if (view2.getWidth() + i5 > i6) {
                    float f17 = (float) i5;
                    View view3 = this.f40590g;
                    C41536l.m120486f(view3);
                    f = (f17 + (((float) view3.getWidth()) / 2.0f)) - ((float) i6);
                }
            }
            f = Utils.FLOAT_EPSILON;
        } else {
            f = (rectF2.left + rectF2.right) * 0.5f;
        }
        path.moveTo(getCornerRadiusSpacing() + f8, f9);
        if (this.f40587d == aVar4) {
            if (f - ((float) getArrowWidthHalf()) < getCornerRadiusSpacing() + f8) {
                f = ((float) getArrowWidthHalf()) + getCornerRadiusSpacing() + f8;
            } else if (((float) getArrowWidthHalf()) + f > f13 - getCornerRadiusSpacing()) {
                f = (f13 - getCornerRadiusSpacing()) - ((float) getArrowWidthHalf());
            }
            f2 = f;
            float k = f9 + ((float) C18368l.m62762k(1));
            path.lineTo((f2 - ((float) this.f40592i)) + ((float) getArrowOffset()), f9);
            aVar = aVar3;
            f3 = f15;
            path.cubicTo(((float) getArrowOffset()) + (f2 - ((float) this.f40592i)), f9, f2 - ((float) getArrowCubicMidOffset()), k, f2 - ((float) getArrowWidthSectionSize()), rectF2.top + ((float) getArrowHeightSectionSize()));
            path.cubicTo(f2 - ((float) getArrowWidthSectionSize()), ((float) getArrowHeightSectionSize()) + rectF2.top, f2, rectF2.top, f2 + ((float) getArrowWidthSectionSize()), rectF2.top + ((float) getArrowHeightSectionSize()));
            path.cubicTo(f2 + ((float) getArrowWidthSectionSize()), ((float) getArrowHeightSectionSize()) + rectF2.top, f2 + ((float) getArrowCubicMidOffset()), k, (f2 + ((float) this.f40592i)) - ((float) getArrowOffset()), f9);
        } else {
            aVar = aVar3;
            f3 = f15;
            f2 = f;
        }
        path.lineTo(f13 - getCornerRadiusSpacing(), f9);
        path.quadTo(f13, f9, f13, getCornerRadiusSpacing() + f9);
        if (this.f40587d == aVar5) {
            if (f16 - ((float) getArrowWidthHalf()) < getCornerRadiusSpacing() + f9) {
                f6 = rectF2.top;
                f7 = rectF2.bottom;
            } else {
                if (f16 + ((float) getArrowWidthHalf()) > f3 - getCornerRadiusSpacing()) {
                    f6 = rectF2.top;
                    f7 = rectF2.bottom;
                }
                float k2 = f13 - ((float) C18368l.m62762k(1));
                path.lineTo(f13, (f16 - ((float) this.f40592i)) + ((float) getArrowOffset()));
                path.cubicTo(f13, (f16 - ((float) this.f40592i)) + ((float) getArrowOffset()), k2, f16 - ((float) getArrowCubicMidOffset()), rectF2.right - ((float) getArrowHeightSectionSize()), f16 - ((float) getArrowWidthSectionSize()));
                float arrowHeightSectionSize = rectF2.right - ((float) getArrowHeightSectionSize());
                float arrowWidthSectionSize = f16 - ((float) getArrowWidthSectionSize());
                float f18 = rectF2.right;
                path.cubicTo(arrowHeightSectionSize, arrowWidthSectionSize, f18, f16, f18 - ((float) getArrowHeightSectionSize()), f16 + ((float) getArrowWidthSectionSize()));
                path.cubicTo(rectF2.right - ((float) getArrowHeightSectionSize()), f16 + ((float) getArrowWidthSectionSize()), k2, f16 + ((float) getArrowCubicMidOffset()), f13, (f16 + ((float) this.f40592i)) - ((float) getArrowOffset()));
            }
            f16 = (f6 + f7) * 0.5f;
            float k22 = f13 - ((float) C18368l.m62762k(1));
            path.lineTo(f13, (f16 - ((float) this.f40592i)) + ((float) getArrowOffset()));
            path.cubicTo(f13, (f16 - ((float) this.f40592i)) + ((float) getArrowOffset()), k22, f16 - ((float) getArrowCubicMidOffset()), rectF2.right - ((float) getArrowHeightSectionSize()), f16 - ((float) getArrowWidthSectionSize()));
            float arrowHeightSectionSize2 = rectF2.right - ((float) getArrowHeightSectionSize());
            float arrowWidthSectionSize2 = f16 - ((float) getArrowWidthSectionSize());
            float f182 = rectF2.right;
            path.cubicTo(arrowHeightSectionSize2, arrowWidthSectionSize2, f182, f16, f182 - ((float) getArrowHeightSectionSize()), f16 + ((float) getArrowWidthSectionSize()));
            path.cubicTo(rectF2.right - ((float) getArrowHeightSectionSize()), f16 + ((float) getArrowWidthSectionSize()), k22, f16 + ((float) getArrowCubicMidOffset()), f13, (f16 + ((float) this.f40592i)) - ((float) getArrowOffset()));
        }
        path.lineTo(f13, f3 - getCornerRadiusSpacing());
        path.quadTo(f13, f3, f13 - getCornerRadiusSpacing(), f3);
        if (this.f40587d == aVar6) {
            if (f2 - ((float) getArrowWidthHalf()) < getCornerRadiusSpacing() + f8) {
                f2 = getCornerRadiusSpacing() + f8 + ((float) getArrowWidthHalf());
            } else if (f2 + ((float) getArrowWidthHalf()) > f13 - getCornerRadiusSpacing()) {
                f2 = (f13 - getCornerRadiusSpacing()) - ((float) getArrowWidthHalf());
            }
            float k3 = f3 - ((float) C18368l.m62762k(1));
            path.lineTo((f2 + ((float) this.f40592i)) - ((float) getArrowOffset()), f3);
            path.cubicTo((f2 + ((float) this.f40592i)) - ((float) getArrowOffset()), f3, f2 + ((float) getArrowCubicMidOffset()), k3, f2 + ((float) getArrowWidthSectionSize()), rectF2.bottom - ((float) getArrowHeightSectionSize()));
            path.cubicTo(f2 + ((float) getArrowWidthSectionSize()), rectF2.bottom - ((float) getArrowHeightSectionSize()), f2, rectF2.bottom, f2 - ((float) getArrowWidthSectionSize()), rectF2.bottom - ((float) getArrowHeightSectionSize()));
            path.cubicTo(f2 - ((float) getArrowWidthSectionSize()), rectF2.bottom - ((float) getArrowHeightSectionSize()), f2 - ((float) getArrowCubicMidOffset()), k3, (f2 - ((float) this.f40592i)) + ((float) getArrowOffset()), f3);
        }
        path.lineTo(getCornerRadiusSpacing() + f8, f3);
        path.quadTo(f8, f3, f8, f3 - getCornerRadiusSpacing());
        if (this.f40587d == aVar) {
            if (f16 - ((float) getArrowWidthHalf()) < getCornerRadiusSpacing() + f9) {
                f4 = rectF2.top;
                f5 = rectF2.bottom;
            } else {
                if (f16 + ((float) getArrowWidthHalf()) > f3 - getCornerRadiusSpacing()) {
                    f4 = rectF2.top;
                    f5 = rectF2.bottom;
                }
                float k4 = f8 + ((float) C18368l.m62762k(1));
                path.lineTo(f8, (f16 - ((float) this.f40592i)) + ((float) getArrowOffset()));
                path.cubicTo(f8, (f16 - ((float) this.f40592i)) + ((float) getArrowOffset()), k4, f16 - ((float) getArrowCubicMidOffset()), rectF2.left + ((float) getArrowHeightSectionSize()), f16 - ((float) getArrowWidthSectionSize()));
                float arrowHeightSectionSize3 = ((float) getArrowHeightSectionSize()) + rectF2.left;
                float arrowWidthSectionSize3 = f16 - ((float) getArrowWidthSectionSize());
                float f19 = rectF2.left;
                path.cubicTo(arrowHeightSectionSize3, arrowWidthSectionSize3, f19, f16, f19 + ((float) getArrowHeightSectionSize()), f16 + ((float) getArrowWidthSectionSize()));
                path.cubicTo(((float) getArrowHeightSectionSize()) + rectF2.left, f16 + ((float) getArrowWidthSectionSize()), k4, f16 + ((float) getArrowCubicMidOffset()), f8, (f16 + ((float) this.f40592i)) - ((float) getArrowOffset()));
            }
            f16 = (f4 + f5) * 0.5f;
            float k42 = f8 + ((float) C18368l.m62762k(1));
            path.lineTo(f8, (f16 - ((float) this.f40592i)) + ((float) getArrowOffset()));
            path.cubicTo(f8, (f16 - ((float) this.f40592i)) + ((float) getArrowOffset()), k42, f16 - ((float) getArrowCubicMidOffset()), rectF2.left + ((float) getArrowHeightSectionSize()), f16 - ((float) getArrowWidthSectionSize()));
            float arrowHeightSectionSize32 = ((float) getArrowHeightSectionSize()) + rectF2.left;
            float arrowWidthSectionSize32 = f16 - ((float) getArrowWidthSectionSize());
            float f192 = rectF2.left;
            path.cubicTo(arrowHeightSectionSize32, arrowWidthSectionSize32, f192, f16, f192 + ((float) getArrowHeightSectionSize()), f16 + ((float) getArrowWidthSectionSize()));
            path.cubicTo(((float) getArrowHeightSectionSize()) + rectF2.left, f16 + ((float) getArrowWidthSectionSize()), k42, f16 + ((float) getArrowCubicMidOffset()), f8, (f16 + ((float) this.f40592i)) - ((float) getArrowOffset()));
        }
        path.lineTo(f8, getCornerRadiusSpacing() + f9);
        path.quadTo(f8, f9, getCornerRadiusSpacing() + f8, f9);
        path.close();
        return path;
    }

    /* renamed from: e */
    private final void m50885e() {
        this.f40599p = true;
        this.f40595l = false;
        postInvalidate();
    }

    /* renamed from: f */
    private final void m50886f() {
        if (!this.f40595l) {
            this.f40595l = true;
            TextView textView = getTextView();
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                int i = C13575b.f40602a[this.f40587d.ordinal()];
                if (i == 1) {
                    int i2 = this.f40593j;
                    int i3 = this.f40594k;
                    marginLayoutParams.setMargins(i2, i3, i2, this.f40591h + i3);
                } else if (i == 2) {
                    int i4 = this.f40593j;
                    int i5 = this.f40594k;
                    marginLayoutParams.setMargins(i4, this.f40591h + i5, i4, i5);
                } else if (i == 3) {
                    int i6 = this.f40593j;
                    int i7 = this.f40594k;
                    marginLayoutParams.setMargins(this.f40591h + i6, i7, i6, i7);
                } else if (i == 4) {
                    int i8 = this.f40593j;
                    int i9 = this.f40594k;
                    marginLayoutParams.setMargins(i8, i9, this.f40591h + i8, i9);
                }
                textView.setLayoutParams(marginLayoutParams);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    private final int getArrowCubicMidOffset() {
        return this.f40592i / 3;
    }

    private final int getArrowHeightSectionSize() {
        return this.f40591h / 3;
    }

    private final int getArrowOffset() {
        return this.f40592i / 4;
    }

    private final int getArrowWidthHalf() {
        return this.f40592i / 2;
    }

    private final int getArrowWidthSectionSize() {
        return this.f40592i / 6;
    }

    private final float getCornerRadiusSpacing() {
        return this.f40588e / 2.0f;
    }

    private final FrameLayout getInnerContainer() {
        View findViewById = findViewById(C17782g.innerContainer);
        C41536l.m120488h(findViewById, "findViewById(R.id.innerContainer)");
        return (FrameLayout) findViewById;
    }

    private final TextView getTextView() {
        View findViewById = findViewById(C17782g.tooltipText);
        C41536l.m120488h(findViewById, "findViewById(R.id.tooltipText)");
        return (TextView) findViewById;
    }

    private final void setClipPathCreator(C18926b bVar) {
        C18927c cVar = (C18927c) this.f40598o;
        if (cVar != null) {
            cVar.mo46978e(bVar);
        }
        m50885e();
    }

    private final void setCornerRadiusPx(float f) {
        this.f40588e = f;
        m50885e();
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        C41536l.m120489i(canvas, "canvas");
        super.dispatchDraw(canvas);
        if (this.f40599p) {
            m50883c(canvas.getWidth(), canvas.getHeight());
            this.f40599p = false;
        }
        int i = Build.VERSION.SDK_INT;
        if (i <= 27) {
            canvas.drawPath(this.f40597n, this.f40596m);
        } else {
            canvas.drawPath(this.f40600q, this.f40596m);
        }
        if (i <= 27) {
            setLayerType(2, (Paint) null);
        }
    }

    public final View getAnchorView() {
        return this.f40590g;
    }

    public final int getArrowHeightPx() {
        return this.f40591h;
    }

    public final C18774d.C18775a getArrowPosition() {
        return this.f40587d;
    }

    public final int getContainerBackgroundResourceId() {
        return this.f40589f;
    }

    public ViewOutlineProvider getOutlineProvider() {
        return new C13576c(this);
    }

    public final String getText() {
        return getTextView().getText().toString();
    }

    public final int getTextColor() {
        return getTextView().getCurrentTextColor();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m50885e();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m50886f();
    }

    public final void setAnchorView(View view) {
        this.f40590g = view;
        m50885e();
    }

    public final void setArrowPosition(C18774d.C18775a aVar) {
        C41536l.m120489i(aVar, C11755a.C11756a.f34100b);
        this.f40587d = aVar;
        m50885e();
    }

    public final void setContainerBackgroundResourceId(int i) {
        this.f40589f = i;
        getInnerContainer().setBackgroundResource(this.f40589f);
        m50885e();
    }

    public final void setText(String str) {
        C41536l.m120489i(str, C11755a.C11756a.f34100b);
        getTextView().setText(str);
        m50885e();
    }

    public final void setTextColor(int i) {
        getTextView().setTextColor(i);
        m50885e();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ToolTipView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ToolTipView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C41536l.m120489i(context, "context");
        this.f40587d = C18774d.C18775a.Top;
        this.f40591h = context.getResources().getDimensionPixelSize(C17779d.tooltip_default_arrow_height);
        this.f40592i = context.getResources().getDimensionPixelSize(C17779d.tooltip_default_arrow_width);
        this.f40593j = context.getResources().getDimensionPixelSize(C17779d.f49642K1);
        this.f40594k = context.getResources().getDimensionPixelSize(C17779d.f49645S1);
        Paint paint = new Paint(1);
        this.f40596m = paint;
        this.f40597n = new Path();
        this.f40598o = new C18927c();
        this.f40599p = true;
        this.f40600q = new Path();
        View.inflate(context, C17783h.view_tooltip, this);
        int[] iArr = C17787l.f50034Md;
        C41536l.m120488h(iArr, "TooltipView");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        C41536l.m120488h(obtainStyledAttributes, "obtainStyledAttributes(set, attrs, defStyleAttr, defStyleRes)");
        setCornerRadiusPx((float) obtainStyledAttributes.getDimensionPixelSize(C17787l.f50079Pd, context.getResources().getDimensionPixelSize(C17779d.tooltip_default_corner_radius)));
        int integer = obtainStyledAttributes.getInteger(C17787l.f50049Nd, -1);
        if (integer != -1) {
            setArrowPosition(C18774d.C18775a.values()[integer]);
        }
        int resourceId = obtainStyledAttributes.getResourceId(C17787l.f50064Od, -1);
        if (resourceId != -1) {
            setContainerBackgroundResourceId(resourceId);
        }
        CharSequence text = obtainStyledAttributes.getText(C17787l.f50094Qd);
        if (text != null) {
            C41536l.m120488h(text, "getText(R.styleable.TooltipView_text)");
            setText(text.toString());
        }
        int color = obtainStyledAttributes.getColor(C17787l.f50109Rd, -1);
        if (color != -1) {
            setTextColor(color);
        }
        obtainStyledAttributes.recycle();
        paint.setAntiAlias(true);
        setWillNotDraw(false);
        paint.setColor(-16776961);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(1.0f);
        if (Build.VERSION.SDK_INT <= 27) {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            setLayerType(1, paint);
        } else {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
            setLayerType(1, (Paint) null);
        }
        setClipPathCreator(new C13574a(this));
    }
}
