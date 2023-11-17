package p341ge.bog.designsystem.components.verifiedbadge;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p352ak.C9986o6;
import p601sg.C17779d;
import p601sg.C17780e;
import p601sg.C17787l;
import p699zj.C19038a;

/* renamed from: ge.bog.designsystem.components.verifiedbadge.VerifiedBadgeView */
public final class VerifiedBadgeView extends LayerView {

    /* renamed from: d */
    private final C9986o6 f40616d;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public VerifiedBadgeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    /* renamed from: a */
    public final void mo37161a(boolean z, int i) {
        if (z) {
            if (i == C19038a.Small.mo47252b()) {
                this.f40616d.f27375e.setImageResource(C17780e.icons_24_verified_badge);
                AppCompatImageView appCompatImageView = this.f40616d.f27375e;
                C41536l.m120488h(appCompatImageView, "binding.badgeImage");
                ViewGroup.LayoutParams layoutParams = appCompatImageView.getLayoutParams();
                if (layoutParams != null) {
                    Resources resources = getContext().getResources();
                    int i2 = C17779d.size_verification_badge_small;
                    layoutParams.height = (int) resources.getDimension(i2);
                    layoutParams.width = (int) getContext().getResources().getDimension(i2);
                    appCompatImageView.setLayoutParams(layoutParams);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            } else if (i == C19038a.Big.mo47252b()) {
                this.f40616d.f27375e.setImageResource(C17780e.icons_24_verified_badge);
                AppCompatImageView appCompatImageView2 = this.f40616d.f27375e;
                C41536l.m120488h(appCompatImageView2, "binding.badgeImage");
                ViewGroup.LayoutParams layoutParams2 = appCompatImageView2.getLayoutParams();
                if (layoutParams2 != null) {
                    Resources resources2 = getContext().getResources();
                    int i3 = C17779d.size_verification_badge_big;
                    layoutParams2.height = (int) resources2.getDimension(i3);
                    layoutParams2.width = (int) getContext().getResources().getDimension(i3);
                    appCompatImageView2.setLayoutParams(layoutParams2);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        } else if (z) {
        } else {
            if (i == C19038a.Small.mo47252b()) {
                this.f40616d.f27375e.setImageResource(C17780e.icons_24_non_verified_badge);
                AppCompatImageView appCompatImageView3 = this.f40616d.f27375e;
                C41536l.m120488h(appCompatImageView3, "binding.badgeImage");
                ViewGroup.LayoutParams layoutParams3 = appCompatImageView3.getLayoutParams();
                if (layoutParams3 != null) {
                    Resources resources3 = getContext().getResources();
                    int i4 = C17779d.f49642K1;
                    layoutParams3.height = (int) resources3.getDimension(i4);
                    layoutParams3.width = (int) getContext().getResources().getDimension(i4);
                    appCompatImageView3.setLayoutParams(layoutParams3);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            } else if (i == C19038a.Big.mo47252b()) {
                this.f40616d.f27375e.setImageResource(C17780e.icons_24_non_verified_badge);
                AppCompatImageView appCompatImageView4 = this.f40616d.f27375e;
                C41536l.m120488h(appCompatImageView4, "binding.badgeImage");
                ViewGroup.LayoutParams layoutParams4 = appCompatImageView4.getLayoutParams();
                if (layoutParams4 != null) {
                    Resources resources4 = getContext().getResources();
                    int i5 = C17779d.spacing_24;
                    layoutParams4.height = (int) resources4.getDimension(i5);
                    layoutParams4.width = (int) getContext().getResources().getDimension(i5);
                    appCompatImageView4.setLayoutParams(layoutParams4);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ VerifiedBadgeView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VerifiedBadgeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C41536l.m120489i(context, "context");
        C9986o6 c = C9986o6.m36626c(LayoutInflater.from(context), this);
        C41536l.m120488h(c, "inflate(LayoutInflater.from(context), this)");
        this.f40616d = c;
        int[] iArr = C17787l.f50405ke;
        C41536l.m120488h(iArr, "VerifiedBadgeView");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        C41536l.m120488h(obtainStyledAttributes, "obtainStyledAttributes(set, attrs, defStyleAttr, defStyleRes)");
        mo37161a(obtainStyledAttributes.getBoolean(C17787l.f50421le, false), obtainStyledAttributes.getInt(C17787l.f50437me, C19038a.Big.mo47252b()));
        obtainStyledAttributes.recycle();
    }
}
