package c40;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.text.style.TextAppearanceSpan;
import androidx.core.content.res.C0808h;
import com.github.mikephil.charting.animation.Easing;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Description;
import g91.C32343x;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.util.font.CustomTypefaceSpan;
import p366bk.C10318g;
import p366bk.C10321j;
import p366bk.C10329r;

/* renamed from: c40.b */
public abstract class C19473b {
    /* renamed from: a */
    private static final Bitmap m65013a(Drawable drawable, Context context) {
        Bitmap createBitmap = Bitmap.createBitmap(C32343x.m95394I(40), C32343x.m95394I(40), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(C32343x.m95418U(C10318g.chart_icon_stroke_color, context));
        paint.setStrokeWidth((float) C32343x.m95392H(0.2f));
        paint.setStyle(Paint.Style.STROKE);
        int I = C32343x.m95394I(56);
        Bitmap createBitmap2 = Bitmap.createBitmap(I, I, Bitmap.Config.ARGB_8888);
        Canvas canvas2 = new Canvas(createBitmap2);
        int i = I / 2;
        float f = (float) i;
        canvas2.drawCircle(f, f, f, paint);
        canvas2.drawBitmap(createBitmap, (float) (i - (createBitmap.getWidth() / 2)), (float) (i - (createBitmap.getHeight() / 2)), (Paint) null);
        C41536l.m120488h(createBitmap2, "backgroundBitmap");
        return createBitmap2;
    }

    /* renamed from: b */
    public static final Description m65014b() {
        Description description = new Description();
        description.setText("");
        return description;
    }

    /* renamed from: c */
    public static final void m65015c(PieChart pieChart, Context context, String str, String str2, Drawable drawable) {
        C41536l.m120489i(pieChart, "<this>");
        C41536l.m120489i(context, "context");
        C41536l.m120489i(str, "topText");
        C41536l.m120489i(str2, "bottomText");
        String str3 = " \n" + str + "\n" + str2 + "\n";
        int X = C40440x.m117156X(str3, str2, 0, false, 6, (Object) null);
        SpannableString spannableString = new SpannableString(str3);
        if (drawable != null) {
            spannableString.setSpan(new ImageSpan(context, m65013a(drawable, context), 1), 0, 1, 17);
        }
        spannableString.setSpan(new TextAppearanceSpan(context, C10329r.ChartCenterHeaderStyle), 2, X, 33);
        spannableString.setSpan(new CustomTypefaceSpan("", C0808h.m3033h(context, C10321j.f28707e)), 2, X, 18);
        spannableString.setSpan(new TextAppearanceSpan(context, C10329r.ChartCenterAmountStyle), X, str3.length(), 33);
        spannableString.setSpan(new CustomTypefaceSpan("", C0808h.m3033h(context, C10321j.f28705a)), X, str3.length(), 18);
        pieChart.setCenterText(spannableString);
    }

    /* renamed from: d */
    public static final void m65016d(PieChart pieChart, boolean z) {
        C41536l.m120489i(pieChart, "<this>");
        pieChart.setHoleRadius(75.0f);
        pieChart.getLegend().setEnabled(false);
        pieChart.setRotationEnabled(false);
        pieChart.setDescription(m65014b());
        if (z) {
            pieChart.animateXY(1000, 1000, Easing.EaseInOutExpo);
        }
    }
}
