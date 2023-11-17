package p341ge.bog.mobilebank.p975ui.views.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: ge.bog.mobilebank.ui.views.widgets.BogActionButton */
public final class BogActionButton extends LinearLayout {
    private ImageView buttonImage;
    private BogTextView buttonText;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public BogActionButton(Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    public final void setImage(int i) {
        this.buttonImage.setImageResource(i);
        this.buttonImage.setVisibility(0);
    }

    public final void setText(String str) {
        this.buttonText.setText(str);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public BogActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BogActionButton(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? -1 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BogActionButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C41536l.m120489i(context, "context");
        View.inflate(context, C10324m.bog_action_button_layout, this);
        setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        setOrientation(1);
        setGravity(17);
        View findViewById = findViewById(C10322k.action_button_image);
        C41536l.m120488h(findViewById, "findViewById(R.id.action_button_image)");
        this.buttonImage = (ImageView) findViewById;
        View findViewById2 = findViewById(C10322k.action_button_text);
        C41536l.m120488h(findViewById2, "findViewById(R.id.action_button_text)");
        this.buttonText = (BogTextView) findViewById2;
    }
}
