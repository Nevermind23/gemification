package p341ge.bog.mobilebank.p975ui.views.controllers;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import g91.C32290b1;
import g91.C32359z0;
import jg1.C41438c;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.p975ui.components.BogProgressBar;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogButton;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogInputLayout;
import p341ge.bog.mobilebank.rest.BankApi;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p341ge.bog.mobilebank.rest.manager.RootBankApiManager;
import p366bk.C10323l;

/* renamed from: ge.bog.mobilebank.ui.views.controllers.a */
public abstract class C35700a extends C35703d {
    protected BankApi bankApi;
    protected Client client;
    protected BogInputLayout[] inputLayouts;
    protected BankApi mBankApi;
    protected RootBankApiManager mBankApiManager;
    protected C41438c mEventBus;
    protected PreferencesApiManager mPreferencesApiManager;
    public BogButton nextButton;
    protected BogProgressBar nextProgress;

    public C35700a(Context context) {
        this(context, (AttributeSet) null);
    }

    public void changeFocusAndHideInputs(BogInputLayout bogInputLayout, boolean z, BogInputLayout... bogInputLayoutArr) {
        for (BogInputLayout bogInputLayout2 : bogInputLayoutArr) {
            bogInputLayout2.hideLayout();
            bogInputLayout2.getEditText().setText("");
        }
        bogInputLayout.showLayout();
        if (!bogInputLayout.getEditText().isFocused()) {
            C32290b1.m95115e(bogInputLayout.getEditText());
            this.nextButton.setOrange(z);
            onChangeFocus(bogInputLayout, bogInputLayoutArr);
        }
    }

    public void dimNext() {
        if (this.nextButton.getAlpha() == 1.0f) {
            this.nextProgress.setVisibility(0);
            this.nextButton.setTextColor(0);
            this.nextButton.setAlpha(C32359z0.m95537H(C10323l.next_button_dim_alpha, getContext()));
            BogInputLayout[] bogInputLayoutArr = this.inputLayouts;
            if (bogInputLayoutArr != null) {
                for (BogInputLayout editable : bogInputLayoutArr) {
                    editable.setEditable(false);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public <T extends View> T findView(int i) {
        return findViewById(i);
    }

    public BogButton getNextButton() {
        return this.nextButton;
    }

    /* access modifiers changed from: protected */
    public void onChangeFocus(BogInputLayout bogInputLayout, BogInputLayout... bogInputLayoutArr) {
    }

    public void reset() {
    }

    public void setInputLayouts(BogInputLayout... bogInputLayoutArr) {
        this.inputLayouts = bogInputLayoutArr;
    }

    public void undimNext() {
        if (this.nextButton.getAlpha() < 1.0f) {
            this.nextProgress.setVisibility(8);
            if (this.nextButton.isOrange()) {
                this.nextButton.setTextColor(-1);
            } else {
                this.nextButton.setTextColor(-16777216);
            }
            this.nextButton.setAlpha(1.0f);
            BogInputLayout[] bogInputLayoutArr = this.inputLayouts;
            if (bogInputLayoutArr != null) {
                for (BogInputLayout editable : bogInputLayoutArr) {
                    editable.setEditable(true);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean validateNextButton(int i, int i2) {
        if (i >= i2) {
            this.nextButton.setOrange(true);
            return true;
        }
        this.nextButton.setOrange(false);
        return false;
    }

    public C35700a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
