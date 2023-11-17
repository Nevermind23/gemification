package p341ge.bog.mobilebank.p975ui.views.lettertile;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import p341ge.bog.mobilebank.p975ui.views.lettertile.C35704a;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10330s;
import w81.C39617b;

/* renamed from: ge.bog.mobilebank.ui.views.lettertile.LetterTileView */
public class LetterTileView extends FrameLayout {

    /* renamed from: g */
    private static C39617b f86319g;

    /* renamed from: d */
    private ImageView f86320d;

    /* renamed from: e */
    private TextView f86321e;

    /* renamed from: f */
    private boolean f86322f;

    public LetterTileView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m106027a(attributeSet);
    }

    /* renamed from: a */
    private void m106027a(AttributeSet attributeSet) {
        View.inflate(getContext(), C10324m.letter_tile, this);
        if (!isInEditMode()) {
            if (f86319g == null) {
                f86319g = new C39617b(getContext());
            }
            this.f86320d = (ImageView) findViewById(C10322k.letter_tile_background);
            this.f86321e = (TextView) findViewById(C10322k.letter_tile_initials);
            if (attributeSet != null) {
                TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C10330s.f29397p4, 0, 0);
                this.f86322f = obtainStyledAttributes.getBoolean(C10330s.f29407q4, false);
                obtainStyledAttributes.recycle();
            }
        }
    }

    public void setUpWithString(String str) {
        C35704a.C35705a a = C35704a.m106028b().mo86931a(str);
        TextView textView = this.f86321e;
        Object[] objArr = new Object[2];
        objArr[0] = a.f86324a[0];
        String str2 = a.f86325b;
        if (str2 == null) {
            str2 = "";
        }
        objArr[1] = str2;
        textView.setText(String.format("%s%s", objArr));
        if (this.f86322f) {
            this.f86321e.setShadowLayer(15.0f, 10.0f, 10.0f, -16777216);
        }
        int a2 = f86319g.mo93274a(a.f86324a);
        setTag(Integer.valueOf(a2));
        Bitmap createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        new Canvas(createBitmap).drawColor(a2);
        this.f86320d.setImageBitmap(createBitmap);
    }
}
