package p341ge.bog.mobilebank.p975ui.views.widgets.deprecated;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import com.google.android.material.textfield.TextInputEditText;
import p366bk.C10330s;

@Deprecated
/* renamed from: ge.bog.mobilebank.ui.views.widgets.deprecated.BogTextInputET */
public class BogTextInputET extends TextInputEditText {
    public static final char emptyChar = '…';
    private String emptyStr;
    private boolean whiteSpacesSelectable;

    public BogTextInputET(Context context) {
        this(context, (AttributeSet) null);
    }

    public String getRawText() {
        return getText().toString().replaceAll(String.valueOf(emptyChar), "");
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return i == 66 || super.onKeyDown(i, keyEvent);
    }

    /* access modifiers changed from: protected */
    public void onSelectionChanged(int i, int i2) {
        if (this.whiteSpacesSelectable) {
            super.onSelectionChanged(i, i2);
            return;
        }
        String obj = getText().toString();
        if (obj.length() > 0 && i < obj.length() && obj.charAt(i) == 8230) {
            int i3 = i;
            while (true) {
                if (i3 >= obj.length()) {
                    i3 = i;
                    break;
                } else if (obj.charAt(i3) != 8230) {
                    break;
                } else {
                    i3++;
                }
            }
            if (i3 != i) {
                try {
                    setSelection(i3);
                } catch (Exception unused) {
                }
            } else {
                setSelection(getText().length());
            }
        }
        super.onSelectionChanged(i, i2);
    }

    public void setEmptyStr(String str) {
        this.emptyStr = str;
    }

    public void setSpecialCharSelectable(boolean z) {
        this.whiteSpacesSelectable = z;
    }

    public BogTextInputET(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.whiteSpacesSelectable = true;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C10330s.f29029F0);
        if (obtainStyledAttributes != null) {
            obtainStyledAttributes.recycle();
        }
    }
}
