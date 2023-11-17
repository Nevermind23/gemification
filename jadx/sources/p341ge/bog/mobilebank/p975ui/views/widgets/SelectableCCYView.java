package p341ge.bog.mobilebank.p975ui.views.widgets;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import g91.C32355x0;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: ge.bog.mobilebank.ui.views.widgets.SelectableCCYView */
public class SelectableCCYView extends FrameLayout {

    /* renamed from: bg */
    private GradientDrawable f86401bg;
    private int borderColor;
    private int borderSize;
    private BogTextView ccyText;
    private View container;
    private boolean isCCYSelected;
    private int selectedBorderSize;
    private String text;
    private int textColor;

    public SelectableCCYView(Context context) {
        super(context);
        setUpView(context);
    }

    private void resetItem() {
        this.f86401bg.setColor(0);
        if (isCCYSelected()) {
            this.f86401bg.setStroke(this.selectedBorderSize, this.borderColor);
            this.ccyText.setTextColor(this.textColor);
            return;
        }
        this.f86401bg.setStroke(this.borderSize, this.borderColor);
        this.ccyText.setTextColor(this.textColor);
        setAlpha(0.5f);
    }

    private void setUpView(Context context) {
        View.inflate(context, C10324m.selectable_ccy_view, this);
        this.container = findViewById(C10322k.f28862l7);
        this.ccyText = (BogTextView) findViewById(C10322k.ccy_text);
        this.borderSize = C32355x0.m95511b(0.5f, getContext());
        this.selectedBorderSize = C32355x0.m95511b(1.0f, getContext());
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.f86401bg = gradientDrawable;
        gradientDrawable.setShape(1);
        setBackground(this.f86401bg);
    }

    public String getText() {
        return this.text;
    }

    public boolean isCCYSelected() {
        return this.isCCYSelected;
    }

    public void setBorderColor(int i) {
        this.borderColor = C32355x0.m95514e(i, getContext());
        resetItem();
    }

    public void setCCYSelected(boolean z) {
        this.isCCYSelected = z;
        resetItem();
    }

    public void setText(String str) {
        this.text = str;
        this.ccyText.setText(str);
    }

    public void setTextColor(int i) {
        this.textColor = C32355x0.m95514e(i, getContext());
        resetItem();
    }

    public SelectableCCYView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setUpView(context);
    }
}
