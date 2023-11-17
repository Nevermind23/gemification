package p341ge.bog.mobilebank.p975ui.views.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.content.C0767a;
import g91.C32289b0;
import p366bk.C10320i;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: ge.bog.mobilebank.ui.views.widgets.FuturePaymentsTypeView */
public class FuturePaymentsTypeView extends LinearLayout {
    private View divider;
    private BogTextView mAmountTV;
    private String mAmountText;
    private BogTextView mDetailTV;
    private String mDetailText;
    private ImageView mIconIV;
    private BogTextView mTitleTV;
    private String mTitleText;

    public FuturePaymentsTypeView(Context context) {
        super(context);
        View.inflate(getContext(), C10324m.layout_future_payments_type_view, this);
        setupViews();
    }

    private void setupViews() {
        this.mTitleTV = (BogTextView) findViewById(C10322k.f28846ii);
        this.mDetailTV = (BogTextView) findViewById(C10322k.item_details);
        this.mIconIV = (ImageView) findViewById(C10322k.rounded_image);
        this.mAmountTV = (BogTextView) findViewById(C10322k.amount_text_view);
        this.divider = findViewById(C10322k.f28729Eu);
    }

    public String getAmountText() {
        return this.mAmountText;
    }

    public String getDetailText() {
        return this.mDetailText;
    }

    public String getTitleText() {
        return this.mTitleText;
    }

    public void setAmount(String str) {
        if (str != null) {
            this.mAmountText = str;
            this.mAmountTV.setText(str);
        }
    }

    public void setDetail(String str) {
        int i;
        if (str != null) {
            this.mDetailText = str;
            this.mDetailTV.setText(str);
            BogTextView bogTextView = this.mDetailTV;
            if (str.length() > 0) {
                i = 0;
            } else {
                i = 8;
            }
            bogTextView.setVisibility(i);
        }
    }

    public void setDividerVisibility(boolean z) {
        this.divider.setVisibility(z ? 0 : 8);
    }

    public void setIcon(String str) {
        if (str != null) {
            ImageView imageView = this.mIconIV;
            int i = C10320i.express;
            C32289b0.m95107s(imageView, str, Integer.valueOf(i), Integer.valueOf(i), true, false);
        }
    }

    public void setTitle(String str) {
        if (str != null) {
            this.mTitleText = str;
            this.mTitleTV.setText(str);
        }
    }

    public void setIcon(int i) {
        this.mIconIV.setImageDrawable(C0767a.m2895e(getContext(), i));
    }

    public FuturePaymentsTypeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View.inflate(getContext(), C10324m.layout_future_payments_type_view, this);
        setupViews();
    }
}
