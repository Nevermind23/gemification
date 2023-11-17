package p341ge.bog.mobilebank.cleanarch.presentation.common.compoundview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.C0767a;
import g91.C32343x;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.designsystem.components.buttons.Button;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10330s;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.common.compoundview.InfoMessageView */
public final class InfoMessageView extends LinearLayout {

    /* renamed from: d */
    private final Button f57432d;

    /* renamed from: e */
    private final TextView f57433e;

    /* renamed from: f */
    private final ImageView f57434f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InfoMessageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        boolean z;
        C41536l.m120489i(context, "context");
        boolean z2 = true;
        setOrientation(1);
        setGravity(17);
        C32343x.m95467m0(this, C10324m.view_info_message, true);
        View findViewById = findViewById(C10322k.message_button);
        C41536l.m120488h(findViewById, "findViewById(R.id.message_button)");
        this.f57432d = (Button) findViewById;
        View findViewById2 = findViewById(C10322k.f28715Cl);
        C41536l.m120488h(findViewById2, "findViewById(R.id.message_text)");
        this.f57433e = (TextView) findViewById2;
        View findViewById3 = findViewById(C10322k.f28789Sg);
        C41536l.m120488h(findViewById3, "findViewById(R.id.icon_image)");
        this.f57434f = (ImageView) findViewById3;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C10330s.f29162S3);
        C41536l.m120488h(obtainStyledAttributes, "context.obtainStyledAttr…tyleable.InfoMessageView)");
        int resourceId = obtainStyledAttributes.getResourceId(C10330s.f29192V3, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(C10330s.f29172T3, 0);
        String string = obtainStyledAttributes.getString(C10330s.f29202W3);
        String str = "";
        string = string == null ? str : string;
        String string2 = obtainStyledAttributes.getString(C10330s.f29182U3);
        str = string2 != null ? string2 : str;
        int i = C10330s.f29222Y3;
        if (resourceId != 0) {
            z = true;
        } else {
            z = false;
        }
        boolean z3 = obtainStyledAttributes.getBoolean(i, z);
        boolean z4 = obtainStyledAttributes.getBoolean(C10330s.f29212X3, str.length() <= 0 ? false : z2);
        obtainStyledAttributes.recycle();
        setShowIcon(z3);
        setIcon(resourceId);
        setShowButton(z4);
        setButtonIcon(resourceId2);
        setButtonText(str);
        setMessage(string);
    }

    public final void setButtonIcon(int i) {
        try {
            this.f57432d.setButtonIcon(C0767a.m2895e(getContext(), i));
        } catch (Exception unused) {
            this.f57432d.setButtonIcon((Drawable) null);
        }
    }

    public final void setButtonText(String str) {
        C41536l.m120489i(str, "text");
        this.f57432d.setButtonText(str);
    }

    public final void setIcon(int i) {
        this.f57434f.setImageResource(i);
    }

    public final void setMessage(String str) {
        C41536l.m120489i(str, "message");
        this.f57433e.setText(str);
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f57432d.setOnClickListener(onClickListener);
    }

    public final void setShowButton(boolean z) {
        C32343x.m95483r1(this.f57432d, z, false, 2, (Object) null);
    }

    public final void setShowIcon(boolean z) {
        C32343x.m95483r1(this.f57434f, z, false, 2, (Object) null);
    }
}
