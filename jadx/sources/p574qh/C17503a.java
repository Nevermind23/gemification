package p574qh;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.common.Color;
import p560ph.C17355e;
import p601sg.C17777b;
import p601sg.C17778c;
import p601sg.C17786k;
import p642vh.C18368l;

/* renamed from: qh.a */
public final class C17503a extends C17355e {

    /* renamed from: qh.a$a */
    public static final class C17504a implements C17355e.C17357b {

        /* renamed from: a */
        public static final C17504a f49016a = new C17504a();

        /* renamed from: b */
        private static final C17355e.C17356a f49017b = new C17355e.C17356a(C18368l.m62762k(40), C18368l.m62762k(40), C17786k.TextSmallButtonWhite500Left, new Color.Attribute(C17777b.f49593b));

        /* renamed from: c */
        private static final C17355e.C17356a f49018c = new C17355e.C17356a(C18368l.m62762k(40), C18368l.m62762k(40), C17786k.TextCaption2InvertComponents200Left, new Color.Attribute(C17777b.color_invert_component_tr_50));

        /* renamed from: d */
        private static final C17355e.C17356a f49019d;

        /* renamed from: e */
        private static final C17355e.C17356a f49020e;

        static {
            int k = C18368l.m62762k(32);
            int k2 = C18368l.m62762k(32);
            int i = C17786k.f49839z0;
            f49019d = new C17355e.C17356a(k, k2, i, new Color.Attribute(C17777b.f49600q));
            f49020e = new C17355e.C17356a(C18368l.m62762k(24), C18368l.m62762k(24), i, new Color.Resource(C17778c.f49638w));
        }

        private C17504a() {
        }

        /* renamed from: a */
        public C17355e.C17356a mo44788a() {
            return f49020e;
        }

        /* renamed from: b */
        public C17355e.C17356a mo44789b() {
            return f49017b;
        }

        /* renamed from: c */
        public C17355e.C17356a mo44790c() {
            return f49018c;
        }

        /* renamed from: d */
        public C17355e.C17356a mo44791d() {
            return f49019d;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17503a(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* renamed from: e */
    public int mo44766e() {
        return getViewType().mo44789b().mo44784d();
    }

    public String getSuffix() {
        return null;
    }

    public C17355e.C17357b getViewType() {
        return C17504a.f49016a;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (canvas != null) {
            canvas.drawCircle(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f, ((float) Math.min(getWidth(), getHeight())) / 2.0f, getBackgroundPaint());
        }
        if (canvas != null) {
            canvas.drawText(getValue(), (float) (getWidth() / 2), ((float) (getHeight() / 2)) - ((getTextPaint().descent() + getTextPaint().ascent()) / ((float) 2)), getTextPaint());
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getViewType().mo44789b().mo44782b(), 1073741824));
    }

    public void setSuffix(String str) {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C17503a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C41536l.m120489i(context, "context");
    }
}
