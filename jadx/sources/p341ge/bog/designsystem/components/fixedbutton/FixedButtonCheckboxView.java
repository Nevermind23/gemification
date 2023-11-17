package p341ge.bog.designsystem.components.fixedbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.checkbox.CheckboxView;
import p352ak.C9935i3;
import p421fi.C12915a;
import p601sg.C17787l;

/* renamed from: ge.bog.designsystem.components.fixedbutton.FixedButtonCheckboxView */
public final class FixedButtonCheckboxView extends LinearLayout {

    /* renamed from: d */
    private final C9935i3 f39509d;

    /* renamed from: e */
    private final Button f39510e;

    /* renamed from: f */
    private final CheckboxView f39511f;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FixedButtonCheckboxView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final void m50172b(FixedButtonCheckboxView fixedButtonCheckboxView, CompoundButton compoundButton, boolean z, boolean z2) {
        C41536l.m120489i(fixedButtonCheckboxView, "this$0");
        C41536l.m120489i(compoundButton, "<anonymous parameter 0>");
        fixedButtonCheckboxView.f39510e.setEnabled(z);
    }

    public final Button getButton() {
        return this.f39510e;
    }

    public final CheckboxView getCheckbox() {
        return this.f39511f;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FixedButtonCheckboxView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FixedButtonCheckboxView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C41536l.m120489i(context, "context");
        C9935i3 d = C9935i3.m36442d(LayoutInflater.from(context), this, true);
        C41536l.m120488h(d, "inflate(LayoutInflater.from(context), this, true)");
        this.f39509d = d;
        Button button = d.f27104e;
        C41536l.m120488h(button, "binding.button");
        this.f39510e = button;
        CheckboxView checkboxView = d.f27105f;
        C41536l.m120488h(checkboxView, "binding.checkbox");
        this.f39511f = checkboxView;
        int[] iArr = C17787l.f50220Z4;
        C41536l.m120488h(iArr, "FixedButtonCheckboxView");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        C41536l.m120488h(obtainStyledAttributes, "obtainStyledAttributes(set, attrs, defStyleAttr, defStyleRes)");
        String string = obtainStyledAttributes.getString(C17787l.f50268c5);
        String string2 = obtainStyledAttributes.getString(C17787l.f50252b5);
        button.setButtonText(obtainStyledAttributes.getString(C17787l.f50236a5));
        checkboxView.setType$design_system_release(CheckboxView.C13224d.f39036g.mo35158a(obtainStyledAttributes.getInt(C17787l.f50284d5, CheckboxView.C13224d.NORMAL.ordinal())));
        checkboxView.mo35145g(string == null ? "" : string, string2);
        obtainStyledAttributes.recycle();
        button.setEnabled(false);
        checkboxView.setOnCheckedStateChangeListener(new C12915a(this));
    }
}
