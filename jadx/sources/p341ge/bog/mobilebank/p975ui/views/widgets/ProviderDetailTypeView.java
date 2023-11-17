package p341ge.bog.mobilebank.p975ui.views.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.github.mikephil.charting.utils.Utils;
import i91.C36373d;
import p366bk.C10318g;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10330s;

/* renamed from: ge.bog.mobilebank.ui.views.widgets.ProviderDetailTypeView */
public class ProviderDetailTypeView extends LinearLayout implements IProviderTypeView {
    public static final String TYPE_CURRENCY = "TYPE_CURRENCY";
    public static final String TYPE_DEBT = "TYPE_DEBT";
    public static final String TYPE_GREEN = "TYPE_GREEN";
    public static final String TYPE_RED = "TYPE_RED";
    private String mInputType = "";
    private TextView mTitleTV;
    private String mTitleText;
    private String mType = "";
    private TextView mValueTV;
    private String mValueText;
    private int textSizeId;

    public ProviderDetailTypeView(Context context) {
        super(context);
        View.inflate(getContext(), C10324m.layout_detail_type_view, this);
        setupViews();
    }

    private void setupViews() {
        this.mTitleTV = (BogTextView) findViewById(C10322k.label_tv);
        this.mValueTV = (BogTextView) findViewById(C10322k.val_tv);
    }

    public String getInputType() {
        return this.mInputType;
    }

    public String getTitleText() {
        String str = this.mTitleText;
        if (str == null || str.length() <= 0) {
            return " : ";
        }
        return this.mTitleText;
    }

    public String getValueText() {
        return this.mValueText;
    }

    public void setInputType(String str) {
        this.mInputType = str;
    }

    public void setTextSizeDimen(int i) {
        this.textSizeId = i;
        this.mTitleTV.setTextSize(0, getResources().getDimension(i));
        this.mValueTV.setTextSize(0, getResources().getDimension(i));
    }

    public void setTitleText(String str, boolean z) {
        if (str != null && str.length() > 0) {
            if (z) {
                this.mTitleText = String.format("%s: ", new Object[]{str});
            } else {
                this.mTitleText = str + " ";
            }
            setValueText(" ");
        }
    }

    public void setType(String str) {
        this.mType = str;
    }

    public void setValueText(String str) {
        if (str != null && str.length() > 0) {
            String titleText = getTitleText();
            int i = C10318g.f28627N0;
            int i2 = C10318g.f28628O0;
            if (!TextUtils.isEmpty(this.mType)) {
                if (this.mType.equals(TYPE_DEBT)) {
                    try {
                        double doubleValue = Double.valueOf(str).doubleValue();
                        str = str.concat("₾");
                        if (doubleValue > Utils.DOUBLE_EPSILON) {
                            try {
                                i2 = C10318g.bog_error_red;
                            } catch (Exception unused) {
                                this.mValueTV.setText("");
                                this.mValueTV.setText(C36373d.m107944b(titleText, str, i, i2, getContext()));
                            }
                        } else {
                            i2 = C10318g.bog_dialog_green_color;
                        }
                    } catch (Exception unused2) {
                        str = "";
                        this.mValueTV.setText("");
                        this.mValueTV.setText(C36373d.m107944b(titleText, str, i, i2, getContext()));
                    }
                } else if (this.mType.equals(TYPE_CURRENCY)) {
                    str = str.concat("₾");
                } else if (this.mType.equals(TYPE_RED)) {
                    i2 = C10318g.bog_error_red;
                } else if (this.mType.equals(TYPE_GREEN)) {
                    i2 = C10318g.bog_dialog_green_color;
                } else {
                    str = "";
                }
            }
            this.mValueTV.setText(C36373d.m107944b(titleText, str, i, i2, getContext()));
        }
    }

    public void setupAttrs(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C10330s.f29369m6);
        if (obtainStyledAttributes != null) {
            setTitleText(obtainStyledAttributes.getString(C10330s.f29379n6));
            String string = obtainStyledAttributes.getString(C10330s.f29399p6);
            this.mType = string;
            setType(string);
            String string2 = obtainStyledAttributes.getString(C10330s.f29389o6);
            this.mValueText = string2;
            setValueText(string2);
            obtainStyledAttributes.recycle();
        }
    }

    public void setTitleText(String str) {
        setTitleText(str, true);
    }

    public ProviderDetailTypeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View.inflate(getContext(), C10324m.layout_detail_type_view, this);
        setupViews();
        if (attributeSet != null) {
            setupAttrs(attributeSet);
        }
    }

    public void setValueText(String str, String str2) {
        int i;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            String titleText = getTitleText();
            int i2 = C10318g.f28627N0;
            int i3 = C10318g.f28628O0;
            if (!TextUtils.isEmpty(this.mType) && this.mType.equals(TYPE_DEBT)) {
                try {
                    if (Double.valueOf(str).doubleValue() > Utils.DOUBLE_EPSILON) {
                        i = C10318g.bog_error_red;
                    } else {
                        i = C10318g.bog_dialog_green_color;
                    }
                    i3 = i;
                } catch (Exception unused) {
                    this.mValueTV.setText("");
                }
            }
            this.mValueTV.setText(C36373d.m107944b(titleText, str2, i2, i3, getContext()));
        }
    }
}
