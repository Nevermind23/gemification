package c91;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import java.util.regex.Pattern;
import p341ge.bog.mobilebank.p975ui.views.widgets.MaskedEditText2;
import p341ge.bog.mobilebank.p975ui.wizard.activities.C35862c;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: c91.f */
public class C31303f extends C31355y {

    /* renamed from: v */
    protected ViewGroup f77730v;

    /* renamed from: w */
    private Pattern f77731w;

    /* renamed from: x */
    private Drawable f77732x;

    /* renamed from: y */
    MaskedEditText2.AfterTextMaskedListener f77733y = new C31304a();

    /* renamed from: z */
    TextWatcher f77734z = new C31305b();

    /* renamed from: c91.f$a */
    class C31304a implements MaskedEditText2.AfterTextMaskedListener {
        C31304a() {
        }

        public void afterTextMasked() {
            C31303f fVar = C31303f.this;
            fVar.mo71556l2(fVar.f77882e.getEditText().getText().toString());
        }
    }

    /* renamed from: c91.f$b */
    class C31305b implements TextWatcher {
        C31305b() {
        }

        public void afterTextChanged(Editable editable) {
            C31303f.this.mo71552g2(editable);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C31303f.this.mo71554j2(charSequence, i, i2, i3);
        }
    }

    /* renamed from: h2 */
    private void m92943h2() {
        if (mo71707D1().getValidatePattern() != null) {
            this.f77731w = Pattern.compile(mo71707D1().getValidatePattern());
        }
    }

    /* renamed from: m2 */
    private void m92944m2() {
        this.f77730v = (ViewGroup) findView(C10322k.wizard_input_additional_layout);
        mo71607t1().setIgnoreAnimatedCollapse(!mo71707D1().shouldAnimate());
        String z1 = mo71611z1();
        mo71607t1().setValue(z1);
        String str = "";
        if (z1 == null) {
            z1 = str;
        }
        mo71607t1().setOriginalInputType(mo71707D1().getInputType());
        mo71607t1().setInputType(mo71707D1().getInputType());
        if (z1.length() > 0) {
            mo71607t1().getEditText().setSelection(z1.length());
        }
        int i = 0;
        this.f77882e.getEditText().setSaveEnabled(false);
        mo71559o2();
        if (mo71707D1().getNonSelectableString() != null) {
            this.f77882e.getEditText().setNonSelectableString(mo71707D1().getNonSelectableString());
            if (z1.contains(mo71707D1().getNonSelectableString())) {
                z1 = z1.replace(mo71707D1().getNonSelectableString(), str);
                mo71607t1().setValue(z1);
            }
            if (!TextUtils.isEmpty(z1)) {
                this.f77882e.getEditText().formatWithNonSelectable();
                this.f77882e.getEditText().setSelection(z1.length());
            }
        }
        mo71707D1().setVisibleInput(this.f77882e.getEditText().getText().toString());
        mo71717U1(mo71561q2(this.f77882e.getEditText().getText().toString()));
        if (mo71707D1().getMask() != null) {
            if (mo71611z1() != null) {
                str = mo71611z1().replace(mo71707D1().getMask().replace(mo71707D1().getMaskChar(), str), str).replace(" ", str);
            }
            char[] charArray = mo71707D1().getMask().toCharArray();
            if (charArray.length > 0) {
                int length = charArray.length;
                int i2 = 0;
                while (i < length) {
                    if (charArray[i] != 'x') {
                        i2++;
                    }
                    i++;
                }
                i = i2;
            }
            int length2 = str.length() + i;
            this.f77882e.getEditText().initMask(mo71707D1().getMask(), mo71707D1().getMaskChar());
            this.f77882e.getEditText().setMaskedText(str);
            if (length2 > this.f77882e.getEditText().getTextString().length()) {
                length2 = this.f77882e.getEditText().getTextString().length();
            }
            this.f77882e.getEditText().setSelection(length2, length2);
            this.f77882e.getEditText().setAfterTextMaskedListener(this.f77733y);
            mo71717U1(this.f77882e.getEditText().getText().toString());
            this.f77733y.afterTextMasked();
        }
        mo71557n2();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f2 */
    public void mo71551f2() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: g2 */
    public void mo71552g2(Editable editable) {
        if (!TextUtils.isEmpty(mo71707D1().getNonSelectableString())) {
            this.f77882e.getEditText().formatWithNonSelectable();
        }
    }

    /* renamed from: i2 */
    public void mo71553i2() {
        if (this.f77882e != null) {
            String iconUrl = mo71707D1().getIconUrl();
            if (iconUrl != null) {
                this.f77882e.loadRightPhotoFromURL(iconUrl);
                return;
            }
            Drawable drawable = this.f77732x;
            if (drawable != null) {
                this.f77882e.setRightDrawable(drawable, false);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j2 */
    public void mo71554j2(CharSequence charSequence, int i, int i2, int i3) {
        mo71556l2(charSequence.toString());
    }

    /* renamed from: k2 */
    public void mo71555k2() {
        this.f77883f.mo87965p3(false);
        mo71717U1("");
    }

    /* renamed from: l2 */
    public void mo71556l2(String str) {
        boolean z;
        C35862c cVar = this.f77883f;
        if (cVar != null) {
            if ((!TextUtils.isEmpty(str) || !this.f77894q) && (TextUtils.isEmpty(str) || !mo71560p2(str))) {
                z = false;
            } else {
                z = true;
            }
            cVar.mo87965p3(z);
        }
        if (!TextUtils.isEmpty(mo71707D1().getNonSelectableString())) {
            mo71717U1(mo71561q2(str));
        } else {
            mo71717U1(str);
        }
        mo71707D1().setVisibleInput(str);
    }

    /* access modifiers changed from: protected */
    public int layoutId() {
        return C10324m.fragment_wizard_text_input;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n2 */
    public void mo71557n2() {
        this.f77882e.getEditText().addTextChangedListener(this.f77734z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o1 */
    public void mo71558o1() {
        super.mo71558o1();
        mo71726e2();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o2 */
    public void mo71559o2() {
        this.f77882e.getEditText().removeTextChangedListener(this.f77734z);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        mo71661b2(view);
        m92943h2();
        m92944m2();
        mo71551f2();
        mo71730n1();
        mo71553i2();
    }

    /* access modifiers changed from: protected */
    /* renamed from: p2 */
    public boolean mo71560p2(String str) {
        Pattern pattern = this.f77731w;
        return pattern == null || pattern.matcher(str).matches();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q2 */
    public String mo71561q2(String str) {
        if (!TextUtils.isEmpty(mo71707D1().getNonSelectableString())) {
            return str.replace(mo71707D1().getNonSelectableString(), "");
        }
        return str;
    }
}
