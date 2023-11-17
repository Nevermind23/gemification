package p341ge.bog.mobilebank.cleanarch.presentation.pfm.transactions.filter;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import g50.C20727d;
import g50.C20729e;
import g91.C32343x;
import he1.C41238w;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p366bk.C10322k;
import p366bk.C10324m;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.transactions.filter.InputTextFilterView */
public final class InputTextFilterView extends C20727d {

    /* renamed from: l */
    private final TextView f59084l;

    /* renamed from: m */
    private final EditText f59085m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final View f59086n;

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.transactions.filter.InputTextFilterView$a */
    static final class C22263a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ InputTextFilterView f59087d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22263a(InputTextFilterView inputTextFilterView) {
            super(1);
            this.f59087d = inputTextFilterView;
        }

        /* renamed from: a */
        public final void mo55143a(String str) {
            int i;
            C41536l.m120489i(str, "it");
            InputTextFilterView inputTextFilterView = this.f59087d;
            boolean z = true;
            int i2 = 0;
            if (str.length() == 0) {
                i = 1;
            } else {
                i = 0;
            }
            inputTextFilterView.mo49261h(i ^ 1);
            View k = this.f59087d.f59086n;
            if (str.length() != 0) {
                z = false;
            }
            if (z) {
                i2 = 8;
            }
            k.setVisibility(i2);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55143a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InputTextFilterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C41536l.m120489i(context, "context");
        C41536l.m120489i(attributeSet, "attributeSet");
        View inflate = View.inflate(context, C10324m.filter_input_text_layout, getContentLayout());
        View findViewById = inflate.findViewById(C10322k.clear_filter);
        C41536l.m120488h(findViewById, "v.findViewById(R.id.clear_filter)");
        this.f59086n = findViewById;
        View findViewById2 = inflate.findViewById(C10322k.input_title);
        C41536l.m120488h(findViewById2, "v.findViewById(R.id.input_title)");
        this.f59084l = (TextView) findViewById2;
        View findViewById3 = inflate.findViewById(C10322k.input_text);
        C41536l.m120488h(findViewById3, "v.findViewById(R.id.input_text)");
        EditText editText = (EditText) findViewById3;
        this.f59085m = editText;
        C32343x.m95457j(editText, new C22263a(this));
        findViewById.setOnClickListener(new C20729e(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static final void m72135j(InputTextFilterView inputTextFilterView, View view) {
        C41536l.m120489i(inputTextFilterView, "this$0");
        inputTextFilterView.f59085m.setText("");
    }

    public final String getText() {
        if (this.f59085m.getText().toString().length() == 0) {
            return null;
        }
        return this.f59085m.getText().toString();
    }

    public final void setInputTitle(String str) {
        C41536l.m120489i(str, "title");
        this.f59084l.setText(str);
    }

    public final void setText(String str) {
        this.f59085m.setText(str);
    }
}
