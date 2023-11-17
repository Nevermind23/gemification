package p341ge.bog.mobilebank.loanactivation.presentation.activation.form.view;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.salesforce.marketingcloud.storage.p385db.C11769i;
import g91.C32314k;
import g91.C32343x;
import jq0.C36778d;
import jq0.C36779e;
import jq0.C36780f;
import jq0.C36781g;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kq0.C36931b;
import lq0.C37124a;
import np0.C37435a;
import np0.C37443i;
import oq0.C37710d;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p561pi.C17367b;
import p642vh.C18368l;
import sp0.C38491j;
import wq0.C39640a;
import yp0.C40044a;

/* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.form.view.FormLoanDetailsView */
public final class FormLoanDetailsView extends LayerView {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C38491j f79959d;

    /* renamed from: e */
    private final TextWatcher f79960e;

    /* renamed from: f */
    private C36931b f79961f;

    /* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.form.view.FormLoanDetailsView$a */
    public static final class C32474a implements TextWatcher {

        /* renamed from: d */
        final /* synthetic */ FormLoanDetailsView f79962d;

        public C32474a(FormLoanDetailsView formLoanDetailsView) {
            this.f79962d = formLoanDetailsView;
        }

        public void afterTextChanged(Editable editable) {
            C36931b listener = this.f79962d.getListener();
            if (listener != null) {
                listener.mo73187d(this.f79962d.f79959d.f92219e.getRawText());
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FormLoanDetailsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final void m95924e(FormLoanDetailsView formLoanDetailsView, View view) {
        C41536l.m120489i(formLoanDetailsView, "this$0");
        C36931b bVar = formLoanDetailsView.f79961f;
        if (bVar != null) {
            bVar.mo73185T();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static final void m95925f(FormLoanDetailsView formLoanDetailsView, View view) {
        C41536l.m120489i(formLoanDetailsView, "this$0");
        C36931b bVar = formLoanDetailsView.f79961f;
        if (bVar != null) {
            bVar.mo73182N2();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static final boolean m95927h(EditText editText, TextView textView, int i, KeyEvent keyEvent) {
        C41536l.m120489i(editText, "$this_apply");
        if (i != 6) {
            return false;
        }
        editText.clearFocus();
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static final void m95928i(FormLoanDetailsView formLoanDetailsView, View view, boolean z) {
        C36931b bVar;
        C41536l.m120489i(formLoanDetailsView, "this$0");
        if (!z && (bVar = formLoanDetailsView.f79961f) != null) {
            bVar.mo73186V(C40044a.LOAN_ACTIVATION_AMOUNT_CHANGED);
        }
    }

    public final C36931b getListener() {
        return this.f79961f;
    }

    /* renamed from: j */
    public final void mo73282j(C37710d dVar, C37710d dVar2, C37710d dVar3, String str, C37124a aVar) {
        int i;
        int i2;
        C41536l.m120489i(dVar, "loanAmount");
        C41536l.m120489i(dVar2, "payDay");
        C41536l.m120489i(dVar3, "term");
        C41536l.m120489i(str, "ccy");
        C41536l.m120489i(aVar, C11769i.C11770a.f34151n);
        Input input = this.f79959d.f92219e;
        C41536l.m120488h(input, "updateState$lambda$7");
        int i3 = 8;
        if (dVar.mo90943h()) {
            i = 0;
        } else {
            i = 8;
        }
        input.setVisibility(i);
        String str2 = (String) dVar.mo90941f();
        if (str2 != null) {
            input.setInfoText(dVar.mo90937c());
            if (!C41536l.m120484d(input.getRawText(), str2)) {
                input.getTextInput().removeTextChangedListener(this.f79960e);
                String a = C32314k.m95245a(str);
                C41536l.m120488h(a, "getCurrencySym(ccy)");
                input.setSuffix(a);
                input.setFormatter(new C17367b((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null));
                input.setInputText((String) dVar.mo90941f());
                input.getTextInput().addTextChangedListener(this.f79960e);
            }
        }
        C39640a.m115206b(input, dVar.mo90938d());
        Input input2 = this.f79959d.f92222h;
        C41536l.m120488h(input2, "updateState$lambda$9");
        if (dVar2.mo90943h()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        input2.setVisibility(i2);
        input2.setEnabled(dVar2.mo90942g());
        Integer num = (Integer) dVar2.mo90941f();
        if (num != null) {
            num.intValue();
            input2.setInputText(((Integer) dVar2.mo90941f()).toString());
        }
        C39640a.m115206b(input2, dVar2.mo90938d());
        Input input3 = this.f79959d.f92221g;
        C41536l.m120488h(input3, "updateState$lambda$11");
        if (dVar3.mo90943h()) {
            i3 = 0;
        }
        input3.setVisibility(i3);
        input3.setEnabled(dVar3.mo90942g());
        Integer num2 = (Integer) dVar3.mo90941f();
        if (num2 != null) {
            num2.intValue();
            input3.setInputText(dVar3.mo90941f() + " " + C32343x.m95388F(aVar.mo90073O(), new Object[0]));
        }
        C39640a.m115206b(input3, dVar3.mo90938d());
    }

    public final void setListener(C36931b bVar) {
        this.f79961f = bVar;
    }

    public final void setUpViews(C37124a aVar) {
        C41536l.m120489i(aVar, C11769i.C11770a.f34151n);
        this.f79959d.f92220f.setTitle(C32343x.m95388F(aVar.mo90066H(), new Object[0]));
        this.f79959d.f92219e.setHintText((CharSequence) C32343x.m95388F("loan.activation.details.page.details.block.amount", new Object[0]));
        this.f79959d.f92221g.setHintText((CharSequence) C32343x.m95388F(aVar.mo90068J(), new Object[0]));
        this.f79959d.f92222h.setHintText((CharSequence) C32343x.m95388F(aVar.mo90069K(), new Object[0]));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FormLoanDetailsView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FormLoanDetailsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C41536l.m120489i(context, "context");
        C38491j d = C38491j.m112979d(LayoutInflater.from(context), this, true);
        C41536l.m120488h(d, "inflate(LayoutInflater.from(context), this, true)");
        this.f79959d = d;
        setBackgroundColor(C18368l.m62755d(context, C37435a.f89964a));
        setLayerStyle(C37443i.f90018c);
        EditText textInput = d.f92219e.getTextInput();
        C32474a aVar = new C32474a(this);
        textInput.addTextChangedListener(aVar);
        this.f79960e = aVar;
        d.f92221g.setOnClickListener(new C36778d(this));
        d.f92222h.setOnClickListener(new C36779e(this));
        EditText textInput2 = d.f92219e.getTextInput();
        textInput2.setImeOptions(6);
        textInput2.setOnEditorActionListener(new C36780f(textInput2));
        textInput2.setOnFocusChangeListener(new C36781g(this));
    }
}
