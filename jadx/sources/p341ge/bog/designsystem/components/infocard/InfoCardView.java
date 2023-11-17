package p341ge.bog.designsystem.components.infocard;

import af1.C40303i;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.C0767a;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p352ak.C9975n3;
import p601sg.C17786k;
import p601sg.C17787l;
import p630ui.C18168a;
import p642vh.C18355e0;
import p642vh.C18368l;
import p642vh.C18377p;
import ue1.C43064a;

/* renamed from: ge.bog.designsystem.components.infocard.InfoCardView */
public final class InfoCardView extends ConstraintLayout {

    /* renamed from: i */
    static final /* synthetic */ C40303i[] f39615i;

    /* renamed from: d */
    private final C9975n3 f39616d;

    /* renamed from: e */
    private final C18355e0 f39617e;

    /* renamed from: f */
    private final C18355e0 f39618f;

    /* renamed from: g */
    private final C18377p f39619g;

    /* renamed from: h */
    private Integer f39620h;

    static {
        Class<InfoCardView> cls = InfoCardView.class;
        f39615i = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "title", "getTitle()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "text", "getText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "icon", "getIcon()Ljava/lang/Integer;", 0))};
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public InfoCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    /* renamed from: h */
    private final String m50250h(Integer num) {
        if (num == null || num.intValue() < 0) {
            return "";
        }
        return num + ".";
    }

    public final Integer getCardNumber() {
        boolean z;
        CharSequence text = this.f39616d.f27312g.getText();
        if (text == null || text.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        return Integer.valueOf(Integer.parseInt(C40445z.m117190U0(this.f39616d.f27312g.getText().toString(), 1)));
    }

    public final Integer getIcon() {
        return this.f39619g.getValue(this, f39615i[2]);
    }

    public final CharSequence getText() {
        return this.f39618f.getValue(this, f39615i[1]);
    }

    public final CharSequence getTitle() {
        return this.f39617e.getValue(this, f39615i[0]);
    }

    public final void setCardNumber(Integer num) {
        this.f39620h = num;
        this.f39616d.f27312g.setText(m50250h(num));
    }

    public final void setDrawableTint(int i) {
        this.f39616d.f27311f.setColorFilter(C0767a.m2893c(getContext(), i));
    }

    public final void setDrawableTintAttr(int i) {
        AppCompatImageView appCompatImageView = this.f39616d.f27311f;
        Context context = getContext();
        C41536l.m120488h(context, "context");
        appCompatImageView.setColorFilter(C18368l.m62755d(context, i));
    }

    public final void setIcon(Integer num) {
        this.f39619g.setValue(this, f39615i[2], num);
    }

    public final void setLayerStyle(int i) {
        if (i != 0) {
            Context context = getContext();
            C41536l.m120488h(context, "context");
            new C18168a(context, i).mo45824a(this);
            return;
        }
        C18168a.f51475c.mo45833a(this);
    }

    public final void setText(CharSequence charSequence) {
        this.f39618f.setValue(this, f39615i[1], charSequence);
    }

    public final void setTitle(CharSequence charSequence) {
        this.f39617e.setValue(this, f39615i[0], charSequence);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InfoCardView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InfoCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Context context2 = context;
        C41536l.m120489i(context2, "context");
        C9975n3 c = C9975n3.m36588c(LayoutInflater.from(context), this);
        C41536l.m120488h(c, "inflate(\n        LayoutI…from(context), this\n    )");
        this.f39616d = c;
        AppCompatTextView appCompatTextView = c.f27313h;
        C41536l.m120488h(appCompatTextView, "binding.cardTitleText");
        this.f39617e = new C18355e0(appCompatTextView, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        AppCompatTextView appCompatTextView2 = c.f27310e;
        C41536l.m120488h(appCompatTextView2, "binding.cardBaseText");
        this.f39618f = new C18355e0(appCompatTextView2, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        AppCompatImageView appCompatImageView = c.f27311f;
        C41536l.m120488h(appCompatImageView, "binding.cardImage");
        this.f39619g = new C18377p(appCompatImageView);
        setLayerStyle(C17786k.f49834t);
        int[] iArr = C17787l.f50285d6;
        C41536l.m120488h(iArr, "InfoCardView");
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        C41536l.m120488h(obtainStyledAttributes, "obtainStyledAttributes(set, attrs, defStyleAttr, defStyleRes)");
        setTitle(obtainStyledAttributes.getString(C17787l.f50381j6));
        setText(obtainStyledAttributes.getString(C17787l.f50365i6));
        setCardNumber(Integer.valueOf(obtainStyledAttributes.getInt(C17787l.f50301e6, -1)));
        setIcon(Integer.valueOf(obtainStyledAttributes.getResourceId(C17787l.f50317f6, 0)));
        AppCompatImageView appCompatImageView2 = c.f27311f;
        C41536l.m120488h(appCompatImageView2, "binding.cardImage");
        ViewGroup.LayoutParams layoutParams = appCompatImageView2.getLayoutParams();
        if (layoutParams != null) {
            ConstraintLayout.C0620b bVar = (ConstraintLayout.C0620b) layoutParams;
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C17787l.f50349h6, -1);
            if (dimensionPixelSize != -1) {
                bVar.width = dimensionPixelSize;
            }
            int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(C17787l.f50333g6, -1);
            if (dimensionPixelSize2 != -1) {
                bVar.height = dimensionPixelSize2;
            }
            appCompatImageView2.setLayoutParams(bVar);
            obtainStyledAttributes.recycle();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
    }
}
