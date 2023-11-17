package p341ge.bog.mobilebank.p975ui.views.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.KeyEvent;
import androidx.core.content.res.C0808h;
import i91.C36373d;
import iu0.C36546y;
import p366bk.C10318g;
import p366bk.C10321j;
import p366bk.C10330s;

/* renamed from: ge.bog.mobilebank.ui.views.widgets.BogEditText */
public class BogEditText extends MaskedEditText2 {
    private boolean ccyIsSpanned;
    public EditTextBackPressedListener editTextBackPressedListener;
    private int fontNameInt;
    private boolean ignoreKeys;
    private String nonSelectableString;

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.BogEditText$EditTextBackPressedListener */
    public interface EditTextBackPressedListener {
        void onEditTextBackPressed();
    }

    public BogEditText(Context context) {
        this(context, (AttributeSet) null);
    }

    public void formatWithNonSelectable() {
        String obj = getText().toString();
        String nonSelectableString2 = getNonSelectableString();
        if (nonSelectableString2 != null && !obj.isEmpty()) {
            if (this.ccyIsSpanned) {
                obj = obj.replace(nonSelectableString2, "");
            }
            if (obj.length() > 0) {
                this.ccyIsSpanned = true;
                Spanned a = C36373d.m107943a(obj, nonSelectableString2, "", C10318g.light_gray_highlight_color, C36546y.m108285N());
                if (!getText().toString().equals(a.toString())) {
                    setText(a);
                    if (!this.ccyIsSpanned) {
                        setSelection(obj.length());
                        return;
                    }
                    return;
                }
                return;
            }
            setText("");
        }
    }

    public String getNonSelectableString() {
        return this.nonSelectableString;
    }

    public String getTextString() {
        return getText().toString();
    }

    public boolean isIgnoreKeys() {
        return this.ignoreKeys;
    }

    public boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        if (i == 67) {
            setText("");
        }
        return super.onKeyLongPress(i, keyEvent);
    }

    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        EditTextBackPressedListener editTextBackPressedListener2;
        if (i != 4 || keyEvent.getAction() != 1 || (editTextBackPressedListener2 = this.editTextBackPressedListener) == null) {
            return super.onKeyPreIme(i, keyEvent);
        }
        editTextBackPressedListener2.onEditTextBackPressed();
        return true;
    }

    /* access modifiers changed from: protected */
    public void onSelectionChanged(int i, int i2) {
        if (this.nonSelectableString == null) {
            super.onSelectionChanged(i, i2);
            return;
        }
        String replace = getText().toString().replace(this.nonSelectableString, "");
        if (i > replace.length()) {
            i = replace.length();
        }
        if (i2 > replace.length()) {
            i2 = replace.length();
        }
        setSelection(i, i2);
        super.onSelectionChanged(i, i2);
    }

    public void resetFont() {
        setTypeface(C0808h.m3033h(getContext(), C10321j.f28707e));
    }

    public void setEditTextBackPressedListener(EditTextBackPressedListener editTextBackPressedListener2) {
        this.editTextBackPressedListener = editTextBackPressedListener2;
    }

    public void setIgnoreKeys(boolean z) {
        this.ignoreKeys = z;
    }

    public void setNonSelectableString(String str) {
        this.nonSelectableString = str;
    }

    public void smsPassReceived(String str) {
        setText(str);
        setSelection(str.length());
    }

    public BogEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes;
        if (!isInEditMode() && (obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C10330s.f29198W)) != null) {
            this.fontNameInt = obtainStyledAttributes.getInt(C10330s.f29208X, -1);
            resetFont();
            obtainStyledAttributes.recycle();
        }
    }
}
