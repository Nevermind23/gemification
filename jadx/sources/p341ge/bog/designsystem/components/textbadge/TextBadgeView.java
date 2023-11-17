package p341ge.bog.designsystem.components.textbadge;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p045d.C5769a;
import p341ge.bog.designsystem.components.common.Color;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p352ak.C10000q5;
import p352ak.C9945j5;
import p352ak.C9953k5;
import p352ak.C9961l5;
import p352ak.C9969m5;
import p352ak.C9977n5;
import p352ak.C9985o5;
import p352ak.C9993p5;
import p534nj.C16973a;
import p601sg.C17777b;
import p601sg.C17787l;
import p642vh.C18368l;

/* renamed from: ge.bog.designsystem.components.textbadge.TextBadgeView */
public final class TextBadgeView extends LayerView {

    /* renamed from: d */
    private C16973a f40383d;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TextBadgeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    public final boolean getAlignBadgeStart() {
        C16973a aVar = this.f40383d;
        if (aVar == null) {
            C41536l.m120506z("textBadgeType");
            aVar = null;
        }
        return aVar.mo44195a();
    }

    public final CharSequence getBadgeCaption() {
        C16973a aVar = this.f40383d;
        if (aVar == null) {
            C41536l.m120506z("textBadgeType");
            aVar = null;
        }
        return aVar.mo44196b();
    }

    public final int getBadgeCaptionTextColor() {
        C16973a aVar = this.f40383d;
        if (aVar == null) {
            C41536l.m120506z("textBadgeType");
            aVar = null;
        }
        return aVar.mo44201g();
    }

    public final Drawable getBadgeIcon() {
        C16973a aVar = this.f40383d;
        if (aVar == null) {
            C41536l.m120506z("textBadgeType");
            aVar = null;
        }
        return aVar.mo44197c();
    }

    public final ColorStateList getBadgeIconTint() {
        C16973a aVar = this.f40383d;
        if (aVar == null) {
            C41536l.m120506z("textBadgeType");
            aVar = null;
        }
        return aVar.mo44198d();
    }

    public final CharSequence getBadgeSecondText() {
        C16973a aVar = this.f40383d;
        if (aVar == null) {
            C41536l.m120506z("textBadgeType");
            aVar = null;
        }
        return aVar.mo44199e();
    }

    public final int getBadgeSecondTextColor() {
        C16973a aVar = this.f40383d;
        if (aVar == null) {
            C41536l.m120506z("textBadgeType");
            aVar = null;
        }
        return aVar.mo44201g();
    }

    public final CharSequence getBadgeText() {
        C16973a aVar = this.f40383d;
        if (aVar == null) {
            C41536l.m120506z("textBadgeType");
            aVar = null;
        }
        return aVar.mo44200f();
    }

    public final int getBadgeTextColor() {
        C16973a aVar = this.f40383d;
        if (aVar == null) {
            C41536l.m120506z("textBadgeType");
            aVar = null;
        }
        return aVar.mo44201g();
    }

    public final void setAlignBadgeStart(boolean z) {
        C16973a aVar = this.f40383d;
        if (aVar == null) {
            C41536l.m120506z("textBadgeType");
            aVar = null;
        }
        aVar.mo44205k(z);
    }

    public final void setBackgroundTint(int i) {
        setBackgroundTintColor(new Color.Resource(i));
    }

    public final void setBackgroundTintColor(Color color) {
        C41536l.m120489i(color, "backgroundTintColor");
        setBackgroundColor(0);
        setBackgroundTintMode(PorterDuff.Mode.SRC_OVER);
        Context context = getContext();
        C41536l.m120488h(context, "context");
        setBackgroundTintList(ColorStateList.valueOf(color.mo35260a(context)));
        refreshDrawableState();
    }

    public final void setBadgeCaption(CharSequence charSequence) {
        C16973a aVar = this.f40383d;
        if (aVar == null) {
            C41536l.m120506z("textBadgeType");
            aVar = null;
        }
        aVar.mo44206l(charSequence);
    }

    public final void setBadgeCaptionTextColor(int i) {
        C16973a aVar = this.f40383d;
        if (aVar == null) {
            C41536l.m120506z("textBadgeType");
            aVar = null;
        }
        aVar.mo44207m(i);
    }

    public final void setBadgeIcon(Drawable drawable) {
        C16973a aVar = this.f40383d;
        if (aVar == null) {
            C41536l.m120506z("textBadgeType");
            aVar = null;
        }
        aVar.mo44208n(drawable);
    }

    public final void setBadgeIconTint(ColorStateList colorStateList) {
        C16973a aVar = this.f40383d;
        if (aVar == null) {
            C41536l.m120506z("textBadgeType");
            aVar = null;
        }
        aVar.mo44209o(colorStateList);
    }

    public final void setBadgeSecondText(CharSequence charSequence) {
        C16973a aVar = this.f40383d;
        if (aVar == null) {
            C41536l.m120506z("textBadgeType");
            aVar = null;
        }
        aVar.mo44210p(charSequence);
    }

    public final void setBadgeSecondTextColor(int i) {
        C16973a aVar = this.f40383d;
        if (aVar == null) {
            C41536l.m120506z("textBadgeType");
            aVar = null;
        }
        aVar.mo44211q(i);
    }

    public final void setBadgeText(CharSequence charSequence) {
        C16973a aVar = this.f40383d;
        if (aVar == null) {
            C41536l.m120506z("textBadgeType");
            aVar = null;
        }
        aVar.mo44212r(charSequence);
    }

    public final void setBadgeTextColor(int i) {
        C16973a aVar = this.f40383d;
        if (aVar == null) {
            C41536l.m120506z("textBadgeType");
            aVar = null;
        }
        aVar.mo44213s(i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TextBadgeView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextBadgeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C16973a aVar;
        C41536l.m120489i(context, "context");
        int[] iArr = C17787l.f50291dc;
        C41536l.m120488h(iArr, "TextBadgeView");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        C41536l.m120488h(obtainStyledAttributes, "obtainStyledAttributes(set, attrs, defStyleAttr, defStyleRes)");
        LayoutInflater from = LayoutInflater.from(context);
        switch (obtainStyledAttributes.getInt(C17787l.f50483pc, 0)) {
            case 0:
                C9969m5 d = C9969m5.m36565d(from, this, true);
                C41536l.m120488h(d, "inflate(layoutInflater, this@TextBadgeView, true)");
                aVar = new C16973a.C16997f(d);
                break;
            case 1:
                C9945j5 d2 = C9945j5.m36476d(from, this, true);
                C41536l.m120488h(d2, "inflate(layoutInflater, this@TextBadgeView, true)");
                aVar = new C16973a.C16984c(d2, 0, 2, (DefaultConstructorMarker) null);
                break;
            case 2:
                C9953k5 d3 = C9953k5.m36504d(from, this, true);
                C41536l.m120488h(d3, "inflate(\n               …rue\n                    )");
                aVar = new C16973a.C16989d(d3, 0, 2, (DefaultConstructorMarker) null);
                break;
            case 3:
                C9993p5 d4 = C9993p5.m36652d(from, this, true);
                C41536l.m120488h(d4, "inflate(\n               …rue\n                    )");
                aVar = new C16973a.C16974a(d4, 0, 2, (DefaultConstructorMarker) null);
                break;
            case 4:
                C9961l5 d5 = C9961l5.m36534d(from, this, true);
                C41536l.m120488h(d5, "inflate(layoutInflater, this@TextBadgeView, true)");
                aVar = new C16973a.C16992e(d5, 0, 2, (DefaultConstructorMarker) null);
                break;
            case 5:
                C9985o5 d6 = C9985o5.m36622d(from, this, true);
                C41536l.m120488h(d6, "inflate(\n               …rue\n                    )");
                aVar = new C16973a.C17011h(d6, 0, 2, (DefaultConstructorMarker) null);
                break;
            case 6:
                C10000q5 d7 = C10000q5.m36678d(from, this, true);
                C41536l.m120488h(d7, "inflate(\n               …rue\n                    )");
                aVar = new C16973a.C16979b(d7, 0, 2, (DefaultConstructorMarker) null);
                break;
            case 7:
                C9977n5 d8 = C9977n5.m36594d(from, this, true);
                C41536l.m120488h(d8, "inflate(\n               …rue\n                    )");
                aVar = new C16973a.C17004g(d8);
                break;
            default:
                throw new IllegalStateException("Unknown Text Badge type");
        }
        this.f40383d = aVar;
        CharSequence text = obtainStyledAttributes.getText(C17787l.f50451nc);
        CharSequence text2 = obtainStyledAttributes.getText(C17787l.f50419lc);
        CharSequence text3 = obtainStyledAttributes.getText(C17787l.f50355hc);
        if (text != null) {
            setBadgeText(text);
        }
        if (text2 != null) {
            setBadgeSecondText(text2);
        }
        if (text3 != null) {
            setBadgeCaption(text3);
        }
        int resourceId = obtainStyledAttributes.getResourceId(C17787l.f50339gc, 0);
        if (resourceId != 0) {
            setBackgroundTint(resourceId);
        } else {
            setBackgroundColor(obtainStyledAttributes.getColor(C17787l.f50323fc, C18368l.m62755d(context, C17777b.f49602v)));
        }
        setAlignBadgeStart(obtainStyledAttributes.getBoolean(C17787l.f50307ec, false));
        Integer f = C18368l.m62757f(obtainStyledAttributes, C17787l.f50467oc, 0, 2, (Object) null);
        if (f != null) {
            setBadgeTextColor(f.intValue());
        }
        Integer f2 = C18368l.m62757f(obtainStyledAttributes, C17787l.f50435mc, 0, 2, (Object) null);
        if (f2 != null) {
            setBadgeSecondTextColor(f2.intValue());
        }
        Integer f3 = C18368l.m62757f(obtainStyledAttributes, C17787l.f50371ic, 0, 2, (Object) null);
        if (f3 != null) {
            setBadgeCaptionTextColor(f3.intValue());
        }
        int resourceId2 = obtainStyledAttributes.getResourceId(C17787l.f50387jc, 0);
        if (resourceId2 != 0) {
            setBadgeIcon(C5769a.m23210b(context, resourceId2));
        }
        int resourceId3 = obtainStyledAttributes.getResourceId(C17787l.f50403kc, 0);
        if (resourceId3 != 0) {
            setBadgeIconTint(C5769a.m23209a(context, resourceId3));
        }
        obtainStyledAttributes.recycle();
    }
}
