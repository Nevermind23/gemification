package p341ge.bog.designsystem.components.biginput;

import af1.C40303i;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import he1.C41217g;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.properties.C41551a;
import kotlin.properties.C41553c;
import kotlin.properties.C41555e;
import p341ge.bog.designsystem.components.input.BogEditText;
import p352ak.C9998q3;
import p448hh.C15507a;
import p448hh.C15513b;
import p448hh.C15514c;
import p575qi.C17510b;
import p601sg.C17779d;
import p601sg.C17787l;
import p642vh.C18368l;
import ue1.C43064a;

/* renamed from: ge.bog.designsystem.components.biginput.BigInputView */
public final class BigInputView extends LinearLayout {

    /* renamed from: o */
    static final /* synthetic */ C40303i[] f38857o;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C9998q3 f38858d;

    /* renamed from: e */
    private boolean f38859e;

    /* renamed from: f */
    private final C41555e f38860f;

    /* renamed from: g */
    private final C41555e f38861g;

    /* renamed from: h */
    private final C41555e f38862h;

    /* renamed from: i */
    private final C41555e f38863i;

    /* renamed from: j */
    private final C41217g f38864j;

    /* renamed from: k */
    private C13176c f38865k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public C13175b f38866l;

    /* renamed from: m */
    private C13174a f38867m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final C15507a f38868n;

    /* renamed from: ge.bog.designsystem.components.biginput.BigInputView$a */
    public interface C13174a {
        /* renamed from: a */
        void mo34902a();
    }

    /* renamed from: ge.bog.designsystem.components.biginput.BigInputView$b */
    public interface C13175b {
        /* renamed from: a */
        void mo34903a(String str);
    }

    /* renamed from: ge.bog.designsystem.components.biginput.BigInputView$c */
    public interface C13176c {
        /* renamed from: a */
        void mo34904a(String str);
    }

    /* renamed from: ge.bog.designsystem.components.biginput.BigInputView$d */
    public static final class C13177d implements TextWatcher {

        /* renamed from: d */
        final /* synthetic */ BigInputView f38869d;

        public C13177d(BigInputView bigInputView) {
            this.f38869d = bigInputView;
        }

        public void afterTextChanged(Editable editable) {
            String str;
            boolean z;
            if (editable != null) {
                str = editable.toString();
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            if (str.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z && C41536l.m120484d(str, this.f38869d.getSuffix())) {
                this.f38869d.f38858d.f27432g.setText("");
            }
            C13175b h = this.f38869d.f38866l;
            if (h != null) {
                h.mo34903a(C40440x.m117173o0(str, this.f38869d.getSuffix()));
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: ge.bog.designsystem.components.biginput.BigInputView$e */
    public static final class C13178e extends C41553c {

        /* renamed from: a */
        final /* synthetic */ BigInputView f38870a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13178e(Object obj, BigInputView bigInputView) {
            super(obj);
            this.f38870a = bigInputView;
        }

        /* access modifiers changed from: protected */
        public void afterChange(C40303i iVar, Object obj, Object obj2) {
            C41536l.m120489i(iVar, "property");
            String str = (String) obj2;
            if (!C41536l.m120484d((String) obj, str)) {
                BogEditText bogEditText = this.f38870a.f38858d.f27432g;
                String suffix = this.f38870a.getSuffix();
                if (suffix == null) {
                    suffix = "";
                }
                bogEditText.setHint(str + suffix);
            }
        }
    }

    /* renamed from: ge.bog.designsystem.components.biginput.BigInputView$f */
    public static final class C13179f extends C41553c {

        /* renamed from: a */
        final /* synthetic */ BigInputView f38871a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13179f(Object obj, BigInputView bigInputView) {
            super(obj);
            this.f38871a = bigInputView;
        }

        /* access modifiers changed from: protected */
        public void afterChange(C40303i iVar, Object obj, Object obj2) {
            boolean z;
            C41536l.m120489i(iVar, "property");
            String str = (String) obj2;
            String str2 = (String) obj;
            if (!C41536l.m120484d(str2, str)) {
                this.f38871a.f38868n.mo42618b(str);
                String text = this.f38871a.getText();
                boolean z2 = true;
                if (text.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    if (str2.length() <= 0) {
                        z2 = false;
                    }
                    if (z2) {
                        text = C40440x.m117173o0(text, str2);
                    }
                    this.f38871a.setText(text + str);
                }
                this.f38871a.f38858d.f27432g.setHint(this.f38871a.getHint() + str);
                this.f38871a.getSuffixManager().mo45030d(str);
            }
        }
    }

    /* renamed from: ge.bog.designsystem.components.biginput.BigInputView$g */
    public static final class C13180g extends C41553c {

        /* renamed from: a */
        final /* synthetic */ BigInputView f38872a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13180g(Object obj, BigInputView bigInputView) {
            super(obj);
            this.f38872a = bigInputView;
        }

        /* access modifiers changed from: protected */
        public void afterChange(C40303i iVar, Object obj, Object obj2) {
            C41536l.m120489i(iVar, "property");
            String str = (String) obj2;
            if (!C41536l.m120484d((String) obj, str)) {
                this.f38872a.f38858d.f27431f.setText(str);
            }
        }
    }

    /* renamed from: ge.bog.designsystem.components.biginput.BigInputView$h */
    public static final class C13181h extends C41553c {

        /* renamed from: a */
        final /* synthetic */ BigInputView f38873a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13181h(Object obj, BigInputView bigInputView) {
            super(obj);
            this.f38873a = bigInputView;
        }

        /* access modifiers changed from: protected */
        public void afterChange(C40303i iVar, Object obj, Object obj2) {
            boolean z;
            C41536l.m120489i(iVar, "property");
            String str = (String) obj2;
            if (!C41536l.m120484d((String) obj, str)) {
                AppCompatTextView appCompatTextView = this.f38873a.f38858d.f27430e;
                C41536l.m120488h(appCompatTextView, "binding.descriptionText");
                if (str.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                C18368l.m62751F(appCompatTextView, z, false, 2, (Object) null);
                this.f38873a.f38858d.f27430e.setText(str);
                this.f38873a.invalidate();
            }
        }
    }

    /* renamed from: ge.bog.designsystem.components.biginput.BigInputView$i */
    static final class C13182i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ BigInputView f38874d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13182i(BigInputView bigInputView) {
            super(0);
            this.f38874d = bigInputView;
        }

        /* renamed from: b */
        public final C17510b invoke() {
            String suffix = this.f38874d.getSuffix();
            BogEditText bogEditText = this.f38874d.f38858d.f27432g;
            C41536l.m120488h(bogEditText, "binding.textInput");
            return new C17510b(suffix, bogEditText);
        }
    }

    static {
        Class<BigInputView> cls = BigInputView.class;
        f38857o = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "hint", "getHint()Ljava/lang/String;", 0)), C41520a0.m120439e(new C41539o(cls, "suffix", "getSuffix()Ljava/lang/String;", 0)), C41520a0.m120439e(new C41539o(cls, "infoText", "getInfoText()Ljava/lang/String;", 0)), C41520a0.m120439e(new C41539o(cls, "descText", "getDescText()Ljava/lang/String;", 0))};
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public BigInputView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final void m49604c(BigInputView bigInputView, View view) {
        C13176c cVar;
        C41536l.m120489i(bigInputView, "this$0");
        if (!bigInputView.f38859e && (cVar = bigInputView.f38865k) != null) {
            cVar.mo34904a(C40440x.m117173o0(bigInputView.getText(), bigInputView.getSuffix()));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final boolean m49605d(BigInputView bigInputView, TextView textView, int i, KeyEvent keyEvent) {
        C13174a aVar;
        C41536l.m120489i(bigInputView, "this$0");
        if (i != 6 || (aVar = bigInputView.f38867m) == null || aVar == null) {
            return false;
        }
        aVar.mo34902a();
        return false;
    }

    /* access modifiers changed from: private */
    public final C17510b getSuffixManager() {
        return (C17510b) this.f38864j.getValue();
    }

    public final String getDescText() {
        return (String) this.f38863i.getValue(this, f38857o[3]);
    }

    public final boolean getFormatText() {
        return this.f38868n.mo42617a();
    }

    public final String getHint() {
        return (String) this.f38860f.getValue(this, f38857o[0]);
    }

    public final String getInfoText() {
        return (String) this.f38862h.getValue(this, f38857o[2]);
    }

    public final String getSuffix() {
        return (String) this.f38861g.getValue(this, f38857o[1]);
    }

    public final String getText() {
        return String.valueOf(this.f38858d.f27432g.getText());
    }

    public final EditText getTextInput() {
        BogEditText bogEditText = this.f38858d.f27432g;
        C41536l.m120488h(bogEditText, "binding.textInput");
        return bogEditText;
    }

    /* renamed from: i */
    public final void mo34891i(boolean z) {
        this.f38859e = z;
        this.f38858d.f27432g.setFocusableInTouchMode(z);
        this.f38858d.f27432g.setShowSoftInputOnFocus(z);
        this.f38858d.f27432g.setTextIsSelectable(z);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        Resources resources = getResources();
        if (getDescText().length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i3 = C17779d.big_input_height;
        } else {
            i3 = C17779d.big_input_height_with_desc;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(resources.getDimensionPixelSize(i3), 1073741824));
    }

    public final void setDescText(String str) {
        C41536l.m120489i(str, "<set-?>");
        this.f38863i.setValue(this, f38857o[3], str);
    }

    public final void setDoneButtonListener(C13174a aVar) {
        this.f38867m = aVar;
    }

    public final void setFormatText(boolean z) {
        this.f38868n.mo42619c(z);
    }

    public final void setHint(String str) {
        C41536l.m120489i(str, "<set-?>");
        this.f38860f.setValue(this, f38857o[0], str);
    }

    public final void setInfoText(String str) {
        C41536l.m120489i(str, "<set-?>");
        this.f38862h.setValue(this, f38857o[2], str);
    }

    public final void setSuffix(String str) {
        C41536l.m120489i(str, "<set-?>");
        this.f38861g.setValue(this, f38857o[1], str);
    }

    public final void setText(String str) {
        C41536l.m120489i(str, "text");
        this.f38858d.f27432g.setText(str);
    }

    public final void setTextChangeListener(C13175b bVar) {
        this.f38866l = bVar;
    }

    public final void setTextClickListener(C13176c cVar) {
        this.f38865k = cVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BigInputView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BigInputView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C41536l.m120489i(context, "context");
        C9998q3 c = C9998q3.m36671c(LayoutInflater.from(context), this);
        C41536l.m120488h(c, "inflate(LayoutInflater.from(context), this)");
        this.f38858d = c;
        this.f38859e = true;
        C41551a aVar = C41551a.f97718a;
        String str = "";
        this.f38860f = new C13178e(str, this);
        this.f38861g = new C13179f(str, this);
        this.f38862h = new C13180g(str, this);
        this.f38863i = new C13181h(str, this);
        this.f38864j = C41219i.m119470b(new C13182i(this));
        setOrientation(1);
        c.f27432g.setId(View.generateViewId());
        int[] iArr = C17787l.f50264c1;
        C41536l.m120488h(iArr, "BigInputView");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        C41536l.m120488h(obtainStyledAttributes, "obtainStyledAttributes(set, attrs, defStyleAttr, defStyleRes)");
        String string = obtainStyledAttributes.getString(C17787l.f50344h1);
        string = string == null ? str : string;
        C41536l.m120488h(string, "getString(R.styleable.BigInputView_text) ?: \"\"");
        setText(string);
        String string2 = obtainStyledAttributes.getString(C17787l.f50312f1);
        if (string2 == null) {
            string2 = str;
        } else {
            C41536l.m120488h(string2, "getString(R.styleable.BigInputView_hint) ?: \"\"");
        }
        setHint(string2);
        String string3 = obtainStyledAttributes.getString(C17787l.f50328g1);
        if (string3 == null) {
            string3 = str;
        } else {
            C41536l.m120488h(string3, "getString(R.styleable.Bi…nputView_info_text) ?: \"\"");
        }
        setInfoText(string3);
        String string4 = obtainStyledAttributes.getString(C17787l.f50296e1);
        if (string4 != null) {
            C41536l.m120488h(string4, "getString(R.styleable.Bi…nputView_desc_text) ?: \"\"");
            str = string4;
        }
        setDescText(str);
        boolean z = obtainStyledAttributes.getBoolean(C17787l.f50360i1, false);
        int i2 = obtainStyledAttributes.getInt(C17787l.f50280d1, 0);
        obtainStyledAttributes.recycle();
        C15507a a = C15507a.f44014b.mo42624a(i2);
        this.f38868n = a;
        BogEditText bogEditText = c.f27432g;
        C41536l.m120488h(bogEditText, "binding.textInput");
        a.mo42620d(bogEditText);
        if (z) {
            BogEditText bogEditText2 = c.f27432g;
            InputFilter[] filters = bogEditText2.getFilters();
            C41536l.m120488h(filters, "binding.textInput.filters");
            bogEditText2.setFilters((InputFilter[]) C41331l.m119769m(filters, new InputFilter.AllCaps()));
        }
        c.f27432g.setOnClickListener(new C15513b(this));
        BogEditText bogEditText3 = c.f27432g;
        C41536l.m120488h(bogEditText3, "binding.textInput");
        bogEditText3.addTextChangedListener(new C13177d(this));
        c.f27432g.setOnEditorActionListener(new C15514c(this));
    }
}
