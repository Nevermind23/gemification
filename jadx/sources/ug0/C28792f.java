package ug0;

import af1.C40303i;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.components.MarkerView;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Utils;
import g91.C32343x;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p642vh.C18355e0;
import p642vh.C18362i;
import ue0.C28765z0;

/* renamed from: ug0.f */
public final class C28792f extends MarkerView {

    /* renamed from: k */
    public static final C28793a f73606k = new C28793a((DefaultConstructorMarker) null);

    /* renamed from: l */
    static final /* synthetic */ C40303i[] f73607l;

    /* renamed from: m */
    private static final float f73608m = C32343x.m95396J(8.0f);

    /* renamed from: n */
    private static final float f73609n = C32343x.m95396J(32.0f);

    /* renamed from: d */
    private C28765z0 f73610d;

    /* renamed from: e */
    private final List f73611e;

    /* renamed from: f */
    private final Drawable f73612f;

    /* renamed from: g */
    private final Drawable f73613g;

    /* renamed from: h */
    private final C18355e0 f73614h;

    /* renamed from: i */
    private final C18362i f73615i;

    /* renamed from: j */
    private float f73616j;

    /* renamed from: ug0.f$a */
    public static final class C28793a {
        private C28793a() {
        }

        public /* synthetic */ C28793a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        Class<C28792f> cls = C28792f.class;
        f73607l = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "date", "getDate()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "price", "getPrice()F", 0))};
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C28792f(android.content.Context r19, java.util.List r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            java.lang.String r3 = "context"
            kotlin.jvm.internal.C41536l.m120489i(r1, r3)
            java.lang.String r3 = "labels"
            kotlin.jvm.internal.C41536l.m120489i(r2, r3)
            int r3 = ie0.C25188h.layout_chart_price_marker
            r0.<init>(r1, r3)
            r3 = 0
            android.view.View r4 = r0.getChildAt(r3)
            ue0.z0 r4 = ue0.C28765z0.m88195a(r4)
            java.lang.String r5 = "bind(getChildAt(0))"
            kotlin.jvm.internal.C41536l.m120488h(r4, r5)
            r0.f73610d = r4
            vh.e0 r5 = new vh.e0
            androidx.appcompat.widget.AppCompatTextView r7 = r4.f73552e
            java.lang.String r4 = "binding.dateView"
            kotlin.jvm.internal.C41536l.m120488h(r7, r4)
            r8 = 0
            r9 = 0
            r10 = 6
            r11 = 0
            r6 = r5
            r6.<init>(r7, r8, r9, r10, r11)
            r0.f73614h = r5
            vh.i r4 = new vh.i
            ue0.z0 r5 = r0.f73610d
            androidx.appcompat.widget.AppCompatTextView r13 = r5.f73553f
            java.lang.String r5 = "binding.priceView"
            kotlin.jvm.internal.C41536l.m120488h(r13, r5)
            java.lang.String r14 = "###,##0.00'$'"
            r15 = 0
            r16 = 4
            r17 = 0
            r12 = r4
            r12.<init>(r13, r14, r15, r16, r17)
            r0.f73615i = r4
            r0.f73611e = r2
            int r2 = ie0.C25185e.chart_marker_dot
            android.graphics.drawable.Drawable r2 = p045d.C5769a.m23210b(r1, r2)
            r0.f73612f = r2
            if (r2 == 0) goto L_0x0067
            int r4 = r2.getIntrinsicWidth()
            int r5 = r2.getIntrinsicHeight()
            r2.setBounds(r3, r3, r4, r5)
        L_0x0067:
            int r2 = ie0.C25185e.chart_highlight_line
            android.graphics.drawable.Drawable r1 = p045d.C5769a.m23210b(r1, r2)
            r0.f73613g = r1
            if (r1 == 0) goto L_0x007c
            int r2 = r1.getIntrinsicWidth()
            int r4 = r1.getIntrinsicHeight()
            r1.setBounds(r3, r3, r2, r4)
        L_0x007c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ug0.C28792f.<init>(android.content.Context, java.util.List):void");
    }

    private final CharSequence getDate() {
        return this.f73614h.getValue(this, f73607l[0]);
    }

    private final float getPrice() {
        return this.f73615i.getValue(this, f73607l[1]).floatValue();
    }

    private final void setDate(CharSequence charSequence) {
        this.f73614h.setValue(this, f73607l[0], charSequence);
    }

    private final void setPrice(float f) {
        this.f73615i.mo46146b(this, f73607l[1], f);
    }

    public void draw(Canvas canvas, float f, float f2) {
        C41536l.m120489i(canvas, "canvas");
        super.draw(canvas, f, Utils.FLOAT_EPSILON);
        Drawable drawable = this.f73612f;
        if (drawable != null) {
            int save = canvas.save();
            canvas.translate(f - (((float) this.f73612f.getIntrinsicWidth()) / 2.0f), f2 - (((float) this.f73612f.getIntrinsicHeight()) / 2.0f));
            drawable.draw(canvas);
            canvas.restoreToCount(save);
        }
        Drawable drawable2 = this.f73613g;
        if (drawable2 != null) {
            int save2 = canvas.save();
            canvas.translate(f - (((float) this.f73613g.getIntrinsicWidth()) / 2.0f), ((float) getHeight()) + f73608m);
            drawable2.draw(canvas);
            canvas.restoreToCount(save2);
        }
    }

    public MPPointF getOffset() {
        MPPointF instance = MPPointF.getInstance(-(((float) getWidth()) / 2.0f), -((float) getHeight()));
        C41536l.m120488h(instance, "getInstance(-(width / 2f), -height.toFloat())");
        return instance;
    }

    public void refreshContent(Entry entry, Highlight highlight) {
        C41536l.m120489i(entry, "e");
        C41536l.m120489i(highlight, "highlight");
        this.f73616j = highlight.getXPx();
        Drawable drawable = this.f73613g;
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), (int) (((float) (getChartView().getHeight() - getHeight())) - f73609n));
        }
        setDate((CharSequence) this.f73611e.get((int) entry.getX()));
        setPrice(entry.getY());
        super.refreshContent(entry, highlight);
    }
}
