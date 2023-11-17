package p341ge.bog.designsystem.components.fixedbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p045d.C5769a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.creditcardsmallpicker.CreditCardSmallPickerView;
import p352ak.C9927h3;
import p601sg.C17787l;

/* renamed from: ge.bog.designsystem.components.fixedbutton.FixedButtonCardSelectorView */
public final class FixedButtonCardSelectorView extends LinearLayout {

    /* renamed from: d */
    private final C9927h3 f39504d;

    /* renamed from: e */
    private String f39505e;

    /* renamed from: f */
    private final Button f39506f;

    /* renamed from: g */
    private final Button f39507g;

    /* renamed from: h */
    private final CreditCardSmallPickerView f39508h;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FixedButtonCardSelectorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    public final String getCommissionText() {
        return this.f39505e;
    }

    public final Button getMainButton() {
        return this.f39506f;
    }

    public final CreditCardSmallPickerView getPicker() {
        return this.f39508h;
    }

    public final Button getSecondaryButton() {
        return this.f39507g;
    }

    public final void setCommissionText(String str) {
        this.f39505e = str;
        if (str != null) {
            this.f39504d.f27057e.setVisibility(0);
            this.f39504d.f27057e.setText(str);
            return;
        }
        this.f39504d.f27057e.setVisibility(8);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FixedButtonCardSelectorView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FixedButtonCardSelectorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        CreditCardSmallPickerView.C13278a aVar;
        C41536l.m120489i(context, "context");
        C9927h3 d = C9927h3.m36414d(LayoutInflater.from(context), this, true);
        C41536l.m120488h(d, "inflate(LayoutInflater.from(context), this, true)");
        this.f39504d = d;
        Button button = d.f27058f;
        C41536l.m120488h(button, "binding.mainButton");
        this.f39506f = button;
        Button button2 = d.f27060h;
        C41536l.m120488h(button2, "binding.secondaryButton");
        this.f39507g = button2;
        CreditCardSmallPickerView creditCardSmallPickerView = d.f27059g;
        C41536l.m120488h(creditCardSmallPickerView, "binding.picker");
        this.f39508h = creditCardSmallPickerView;
        int[] iArr = C17787l.f50100R4;
        C41536l.m120488h(iArr, "FixedButtonCardSelectorView");
        int i2 = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        C41536l.m120488h(obtainStyledAttributes, "obtainStyledAttributes(set, attrs, defStyleAttr, defStyleRes)");
        button.setButtonText(obtainStyledAttributes.getString(C17787l.f50190X4));
        setCommissionText(obtainStyledAttributes.getString(C17787l.f50115S4));
        int i3 = obtainStyledAttributes.getInt(C17787l.f50160V4, 0);
        if (i3 == 0) {
            aVar = CreditCardSmallPickerView.C13278a.WITH_IMAGE;
        } else if (i3 == 1) {
            aVar = CreditCardSmallPickerView.C13278a.WITHOUT_IMAGE;
        } else {
            throw new IllegalStateException("Unknown type");
        }
        creditCardSmallPickerView.setCreditCardPickerType(aVar);
        button2.setVisibility(!obtainStyledAttributes.getBoolean(C17787l.f50175W4, false) ? 8 : i2);
        int resourceId = obtainStyledAttributes.getResourceId(C17787l.f50205Y4, -1);
        if (resourceId != -1) {
            button2.setButtonIcon(C5769a.m23210b(context, resourceId));
        }
        creditCardSmallPickerView.mo35468h(new CreditCardSmallPickerView.C13282c(obtainStyledAttributes.getString(C17787l.f50130T4), obtainStyledAttributes.getString(C17787l.f50145U4)));
        obtainStyledAttributes.recycle();
    }
}
