package p588rh;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.github.mikephil.charting.utils.Utils;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.common.Color;
import p560ph.C17355e;
import p601sg.C17777b;
import p601sg.C17778c;
import p601sg.C17779d;
import p601sg.C17786k;
import p642vh.C18368l;

/* renamed from: rh.a */
public final class C17615a extends C17355e {

    /* renamed from: m */
    private final C17355e.C17357b f49325m;

    /* renamed from: rh.a$a */
    public static final class C17616a implements C17355e.C17357b {

        /* renamed from: a */
        public static final C17616a f49326a = new C17616a();

        /* renamed from: b */
        private static final C17355e.C17356a f49327b = new C17355e.C17356a(C18368l.m62762k(64), C18368l.m62762k(40), C17786k.TextSmallButtonWhite500Left, new Color.Attribute(C17777b.f49593b));

        /* renamed from: c */
        private static final C17355e.C17356a f49328c = new C17355e.C17356a(C18368l.m62762k(40), C18368l.m62762k(40), C17786k.TextCaption2InvertComponents200Left, new Color.Attribute(C17777b.color_invert_component_tr_50));

        /* renamed from: d */
        private static final C17355e.C17356a f49329d;

        /* renamed from: e */
        private static final C17355e.C17356a f49330e;

        static {
            int k = C18368l.m62762k(32);
            int k2 = C18368l.m62762k(32);
            int i = C17786k.f49839z0;
            f49329d = new C17355e.C17356a(k, k2, i, new Color.Attribute(C17777b.f49600q));
            f49330e = new C17355e.C17356a(C18368l.m62762k(24), C18368l.m62762k(24), i, new Color.Resource(C17778c.f49638w));
        }

        private C17616a() {
        }

        /* renamed from: a */
        public C17355e.C17356a mo44788a() {
            return f49330e;
        }

        /* renamed from: b */
        public C17355e.C17356a mo44789b() {
            return f49327b;
        }

        /* renamed from: c */
        public C17355e.C17356a mo44790c() {
            return f49328c;
        }

        /* renamed from: d */
        public C17355e.C17356a mo44791d() {
            return f49329d;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17615a(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* renamed from: g */
    private final String m61250g(C17355e.C17356a aVar) {
        if (!C41536l.m120484d(aVar, getViewType().mo44789b())) {
            return getValue();
        }
        String value = getValue();
        String suffix = getSuffix();
        if (suffix == null) {
            suffix = "";
        }
        return value + " " + suffix;
    }

    /* renamed from: e */
    public int mo44766e() {
        return Math.max((int) (getTextPaint().measureText(m61250g(getViewType().mo44789b())) + ((float) C18368l.m62762k(24))), getViewType().mo44789b().mo44784d());
    }

    public C17355e.C17357b getViewType() {
        return this.f49325m;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (C41536l.m120484d(getAppliedType(), getViewType().mo44789b())) {
            int dimensionPixelSize = getResources().getDimensionPixelSize(C17779d.layer_radius_24);
            getActiveItemRectF().set(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, (float) getWidth(), (float) getHeight());
            if (canvas != null) {
                float f = (float) dimensionPixelSize;
                canvas.drawRoundRect(getActiveItemRectF(), f, f, getBackgroundPaint());
            }
        } else if (canvas != null) {
            canvas.drawCircle(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f, ((float) Math.min(getWidth(), getHeight())) / 2.0f, getBackgroundPaint());
        }
        if (canvas != null) {
            C17355e.C17356a appliedType = getAppliedType();
            if (appliedType == null) {
                appliedType = getViewType().mo44788a();
            }
            canvas.drawText(m61250g(appliedType), (float) (getWidth() / 2), ((float) (getHeight() / 2)) - ((getTextPaint().descent() + getTextPaint().ascent()) / ((float) 2)), getTextPaint());
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (C41536l.m120484d(getAppliedType(), getViewType().mo44789b())) {
            i = View.MeasureSpec.makeMeasureSpec(mo44766e(), 1073741824);
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getViewType().mo44789b().mo44782b(), 1073741824));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C17615a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C41536l.m120489i(context, "context");
        this.f49325m = C17616a.f49326a;
    }
}
