package p341ge.bog.mobilebank.p975ui.views.widgets;

import android.text.Editable;
import android.text.TextWatcher;
import g91.C32359z0;
import j81.C36772n;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p341ge.bog.mobilebank.model.template.TemplateBasketItemWrapperForSelection;

/* renamed from: ge.bog.mobilebank.ui.views.widgets.DecimalInputTextWatcher */
public class DecimalInputTextWatcher implements TextWatcher {
    private String escapeString;
    private int mCursorPosition;
    private int mDigitsAfterZero;
    private BogEditText mEditText;
    private String mPreviousValue = "";
    private boolean mRestoringPreviousValueFlag = false;
    private TemplateBasketItemWrapperForSelection templateBasketItem;
    private C36772n templateBasketWatcher;

    public DecimalInputTextWatcher(int i, String str) {
        this.mDigitsAfterZero = i;
        this.escapeString = str;
    }

    private boolean isValid(String str) {
        String replace = str.replace(this.escapeString, "");
        Pattern compile = Pattern.compile("[0-9]*((\\.[0-9]{0," + this.mDigitsAfterZero + "})?)||(\\.)?");
        Pattern compile2 = Pattern.compile("[0-9]*((,[0-9]{0," + this.mDigitsAfterZero + "})?)||(,)?");
        Matcher matcher = compile.matcher(replace);
        Matcher matcher2 = compile2.matcher(replace);
        if (matcher.matches() || matcher2.matches()) {
            return true;
        }
        return false;
    }

    private void notifyListeners(String str) {
        TemplateBasketItemWrapperForSelection templateBasketItemWrapperForSelection = this.templateBasketItem;
        if (templateBasketItemWrapperForSelection != null) {
            templateBasketItemWrapperForSelection.setNewValue(C32359z0.m95550U(str));
            C36772n nVar = this.templateBasketWatcher;
            if (nVar != null) {
                nVar.mo86325n();
            }
        }
    }

    private void overWritePreviousValue(String str) {
        String str2;
        if (this.mEditText != null) {
            if (str == null || !str.contains(".")) {
                this.mEditText.setText(this.mPreviousValue);
                this.mEditText.setSelection(this.mCursorPosition);
                return;
            }
            String substring = str.substring(0, str.indexOf("."));
            String substring2 = str.substring(str.indexOf("."), str.length());
            if (str.contains(this.escapeString)) {
                str2 = this.escapeString;
            } else {
                str2 = "";
            }
            int length = substring2.length();
            int i = this.mDigitsAfterZero;
            if (length > i) {
                substring2 = substring2.substring(0, i + 1);
            }
            BogEditText bogEditText = this.mEditText;
            bogEditText.setText(substring + substring2 + str2);
            if (this.mCursorPosition < substring.length() + substring2.length()) {
                this.mEditText.setSelection(this.mCursorPosition + 1);
            } else {
                this.mEditText.setSelection(this.mCursorPosition);
            }
        }
    }

    public void afterTextChanged(Editable editable) {
        if (this.mEditText != null) {
            boolean z = false;
            if (this.mRestoringPreviousValueFlag) {
                this.mRestoringPreviousValueFlag = false;
                notifyListeners(C32359z0.m95593u(editable.toString()));
            } else if (!isValid(editable.toString())) {
                this.mRestoringPreviousValueFlag = true;
                overWritePreviousValue(editable.toString());
            } else {
                notifyListeners(C32359z0.m95593u(this.mEditText.getText().toString()));
            }
            BogEditText bogEditText = this.mEditText;
            if (bogEditText != null) {
                z = true;
            }
            if ((!bogEditText.getText().toString().contains(this.escapeString)) && z) {
                this.mEditText.setText(this.mEditText.getText() + this.escapeString);
                this.mEditText.setNonSelectableString(this.escapeString);
            }
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.mEditText != null && !this.mRestoringPreviousValueFlag) {
            this.mPreviousValue = charSequence.toString();
            this.mCursorPosition = this.mEditText.getSelectionStart();
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void setEditText(BogEditText bogEditText) {
        this.mEditText = bogEditText;
    }

    public void setTemplateBasketWatcher(C36772n nVar) {
        this.templateBasketWatcher = nVar;
    }

    public void setTemplateItem(TemplateBasketItemWrapperForSelection templateBasketItemWrapperForSelection) {
        this.templateBasketItem = templateBasketItemWrapperForSelection;
    }
}
