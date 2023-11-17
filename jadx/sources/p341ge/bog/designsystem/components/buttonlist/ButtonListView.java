package p341ge.bog.designsystem.components.buttonlist;

import af1.C40303i;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bumptech.glide.C2379b;
import com.bumptech.glide.C2394j;
import he1.C41238w;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.properties.C41551a;
import kotlin.properties.C41553c;
import kotlin.properties.C41555e;
import p035c4.C2247a;
import p045d.C5769a;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.notificationbadges.BadgeRelativeLayout;
import p341ge.bog.designsystem.components.notificationbadges.NotificationBadgeView;
import p352ak.C9973n1;
import p462ih.C15653c;
import p462ih.C15654d;
import p601sg.C17779d;
import p601sg.C17780e;
import p601sg.C17787l;
import p642vh.C18337b;
import p642vh.C18355e0;
import p642vh.C18368l;
import p642vh.C18378q;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.designsystem.components.buttonlist.ButtonListView */
public final class ButtonListView extends ConstraintLayout {

    /* renamed from: m */
    static final /* synthetic */ C40303i[] f38918m;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C9973n1 f38919d;

    /* renamed from: e */
    private C43064a f38920e;

    /* renamed from: f */
    private final C18378q f38921f;

    /* renamed from: g */
    private final C18337b f38922g;

    /* renamed from: h */
    private final C18355e0 f38923h;

    /* renamed from: i */
    private final C18355e0 f38924i;

    /* renamed from: j */
    private final C41555e f38925j;

    /* renamed from: k */
    private final C41555e f38926k;

    /* renamed from: l */
    private final C41555e f38927l;

    /* renamed from: ge.bog.designsystem.components.buttonlist.ButtonListView$a */
    public enum C13196a {
        TEXT_BUTTON,
        BORDER_BUTTON,
        NO_BUTTON
    }

    /* renamed from: ge.bog.designsystem.components.buttonlist.ButtonListView$b */
    public /* synthetic */ class C13197b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f38932a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                ge.bog.designsystem.components.buttonlist.ButtonListView$a[] r0 = p341ge.bog.designsystem.components.buttonlist.ButtonListView.C13196a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ge.bog.designsystem.components.buttonlist.ButtonListView$a r1 = p341ge.bog.designsystem.components.buttonlist.ButtonListView.C13196a.TEXT_BUTTON     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                ge.bog.designsystem.components.buttonlist.ButtonListView$a r1 = p341ge.bog.designsystem.components.buttonlist.ButtonListView.C13196a.BORDER_BUTTON     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                ge.bog.designsystem.components.buttonlist.ButtonListView$a r1 = p341ge.bog.designsystem.components.buttonlist.ButtonListView.C13196a.NO_BUTTON     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f38932a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.designsystem.components.buttonlist.ButtonListView.C13197b.<clinit>():void");
        }
    }

    /* renamed from: ge.bog.designsystem.components.buttonlist.ButtonListView$c */
    static final class C13198c extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C13198c f38933d = new C13198c();

        C13198c() {
            super(1);
        }

        /* renamed from: a */
        public final C2394j invoke(C2394j jVar) {
            C41536l.m120489i(jVar, "$this$setImage");
            C2247a c0 = ((C2394j) jVar.mo7222d()).mo7220c0(C17780e.f49668q1);
            C41536l.m120488h(c0, "circleCrop()\n           …rawable.thumbnail_circle)");
            return (C2394j) c0;
        }
    }

    /* renamed from: ge.bog.designsystem.components.buttonlist.ButtonListView$d */
    public static final class C13199d extends C41553c {

        /* renamed from: a */
        final /* synthetic */ ButtonListView f38934a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13199d(Object obj, ButtonListView buttonListView) {
            super(obj);
            this.f38934a = buttonListView;
        }

        /* access modifiers changed from: protected */
        public void afterChange(C40303i iVar, Object obj, Object obj2) {
            C41536l.m120489i(iVar, "property");
            CharSequence charSequence = (CharSequence) obj2;
            if (!C41536l.m120484d((CharSequence) obj, charSequence)) {
                this.f38934a.f38919d.f27303k.setButtonText(charSequence);
                this.f38934a.f38919d.f27298f.setButtonText(charSequence);
            }
        }
    }

    /* renamed from: ge.bog.designsystem.components.buttonlist.ButtonListView$e */
    public static final class C13200e extends C41553c {

        /* renamed from: a */
        final /* synthetic */ ButtonListView f38935a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13200e(Object obj, ButtonListView buttonListView) {
            super(obj);
            this.f38935a = buttonListView;
        }

        /* access modifiers changed from: protected */
        public void afterChange(C40303i iVar, Object obj, Object obj2) {
            C41536l.m120489i(iVar, "property");
            C13196a aVar = (C13196a) obj2;
            if (((C13196a) obj) != aVar) {
                int i = C13197b.f38932a[aVar.ordinal()];
                if (i == 1) {
                    this.f38935a.f38919d.f27303k.setVisibility(0);
                    this.f38935a.f38919d.f27298f.setVisibility(8);
                } else if (i == 2) {
                    this.f38935a.f38919d.f27303k.setVisibility(8);
                    this.f38935a.f38919d.f27298f.setVisibility(0);
                } else if (i == 3) {
                    this.f38935a.f38919d.f27303k.setVisibility(8);
                    this.f38935a.f38919d.f27298f.setVisibility(8);
                }
            }
        }
    }

    /* renamed from: ge.bog.designsystem.components.buttonlist.ButtonListView$f */
    public static final class C13201f extends C41553c {

        /* renamed from: a */
        final /* synthetic */ ButtonListView f38936a;

        /* renamed from: b */
        final /* synthetic */ Context f38937b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13201f(Object obj, ButtonListView buttonListView, Context context) {
            super(obj);
            this.f38936a = buttonListView;
            this.f38937b = context;
        }

        /* access modifiers changed from: protected */
        public void afterChange(C40303i iVar, Object obj, Object obj2) {
            boolean z;
            C41536l.m120489i(iVar, "property");
            if (((Number) obj).intValue() != ((Number) obj2).intValue()) {
                int i = 0;
                if (this.f38936a.getBadgeCount() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                int dimensionPixelSize = this.f38937b.getResources().getDimensionPixelSize(C17779d.button_list_badge_padding_end);
                int dimensionPixelSize2 = this.f38937b.getResources().getDimensionPixelSize(C17779d.button_list_badge_padding_top);
                BadgeRelativeLayout badgeRelativeLayout = this.f38936a.f38919d.f27297e;
                if (!z) {
                    dimensionPixelSize = 0;
                }
                if (z) {
                    i = dimensionPixelSize2;
                }
                C41536l.m120488h(badgeRelativeLayout, "badgeContainer");
                badgeRelativeLayout.setPadding(badgeRelativeLayout.getPaddingLeft(), i, dimensionPixelSize, badgeRelativeLayout.getPaddingBottom());
                this.f38936a.f38919d.f27297e.setBadgeVisible(z);
                this.f38936a.f38919d.f27297e.getBadgeView().setBadge(new NotificationBadgeView.BadgeType.Number(this.f38936a.getBadgeCount()));
            }
        }
    }

    static {
        Class<ButtonListView> cls = ButtonListView.class;
        f38918m = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "iconTint", "getIconTint()Ljava/lang/Integer;", 0)), C41520a0.m120439e(new C41539o(cls, "iconBackgroundColor", "getIconBackgroundColor()Ljava/lang/Integer;", 0)), C41520a0.m120439e(new C41539o(cls, "topText", "getTopText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "bottomText", "getBottomText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonText", "getButtonText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "type", "getType()Lge/bog/designsystem/components/buttonlist/ButtonListView$Type;", 0)), C41520a0.m120439e(new C41539o(cls, "badgeCount", "getBadgeCount()I", 0))};
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ButtonListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static final void m49636j(ButtonListView buttonListView, View view) {
        C41536l.m120489i(buttonListView, "this$0");
        C43064a aVar = buttonListView.f38920e;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static final void m49637k(ButtonListView buttonListView, View view) {
        C41536l.m120489i(buttonListView, "this$0");
        C43064a aVar = buttonListView.f38920e;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* renamed from: n */
    public static /* synthetic */ void m49639n(ButtonListView buttonListView, Integer num, Drawable drawable, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            drawable = null;
        }
        if ((i & 4) != 0) {
            str = null;
        }
        buttonListView.mo34956m(num, drawable, str);
    }

    private final void setImageLayoutParams(int i) {
        AppCompatImageView appCompatImageView = this.f38919d.f27302j;
        C41536l.m120488h(appCompatImageView, "binding.imageView");
        ViewGroup.LayoutParams layoutParams = appCompatImageView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = i;
            layoutParams.height = i;
            appCompatImageView.setLayoutParams(layoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    public final int getBadgeCount() {
        return ((Number) this.f38927l.getValue(this, f38918m[6])).intValue();
    }

    public final CharSequence getBottomText() {
        return this.f38924i.getValue(this, f38918m[3]);
    }

    public final CharSequence getButtonText() {
        return (CharSequence) this.f38925j.getValue(this, f38918m[4]);
    }

    public final Integer getIconBackgroundColor() {
        return this.f38922g.getValue(this, f38918m[1]);
    }

    public final Integer getIconTint() {
        return this.f38921f.getValue(this, f38918m[0]);
    }

    public final C43064a getOnButtonClicked() {
        return this.f38920e;
    }

    public final CharSequence getTopText() {
        return this.f38923h.getValue(this, f38918m[2]);
    }

    public final C13196a getType() {
        return (C13196a) this.f38926k.getValue(this, f38918m[5]);
    }

    /* renamed from: m */
    public final void mo34956m(Integer num, Drawable drawable, String str) {
        if (num != null) {
            setImageLayoutParams(getContext().getResources().getDimensionPixelSize(C17779d.button_list_icon_width));
            try {
                this.f38919d.f27302j.setImageDrawable(C5769a.m23210b(this.f38919d.f27302j.getContext(), num.intValue()));
            } catch (Exception unused) {
                this.f38919d.f27302j.setImageDrawable((Drawable) null);
            }
        } else if (drawable != null) {
            setImageLayoutParams(-1);
            this.f38919d.f27302j.setImageDrawable(drawable);
        } else if (str != null) {
            setImageLayoutParams(-1);
            ((C2394j) ((C2394j) C2379b.m9210t(getContext()).mo7757y(str).mo7222d()).mo7220c0(C17780e.f49668q1)).mo7718L0(this.f38919d.f27302j);
        } else {
            this.f38919d.f27302j.setImageDrawable((Drawable) null);
            C2379b.m9210t(getContext()).mo7742m(this.f38919d.f27302j);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(C18368l.m62762k(60), 1073741824));
    }

    public final void setBadgeCount(int i) {
        this.f38927l.setValue(this, f38918m[6], Integer.valueOf(i));
    }

    public final void setBottomText(CharSequence charSequence) {
        this.f38924i.setValue(this, f38918m[3], charSequence);
    }

    public final void setButtonText(CharSequence charSequence) {
        this.f38925j.setValue(this, f38918m[4], charSequence);
    }

    public final void setIconBackgroundColor(Integer num) {
        this.f38922g.setValue(this, f38918m[1], num);
    }

    public final void setIconTint(Integer num) {
        this.f38921f.setValue(this, f38918m[0], num);
    }

    public final void setImage(Integer num) {
        m49639n(this, num, (Drawable) null, (String) null, 6, (Object) null);
    }

    public final void setOnButtonClicked(C43064a aVar) {
        this.f38920e = aVar;
    }

    public final void setTopText(CharSequence charSequence) {
        this.f38923h.setValue(this, f38918m[2], charSequence);
    }

    public final void setType(C13196a aVar) {
        C41536l.m120489i(aVar, "<set-?>");
        this.f38926k.setValue(this, f38918m[5], aVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ButtonListView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public final void setImage(Image image) {
        boolean z;
        C41536l.m120489i(image, "image");
        if (image instanceof Image.Attribute) {
            z = true;
        } else {
            z = image instanceof Image.Resource;
        }
        if (z) {
            setImageLayoutParams(getContext().getResources().getDimensionPixelSize(C17779d.button_list_icon_width));
        } else {
            setImageLayoutParams(-1);
        }
        AppCompatImageView appCompatImageView = this.f38919d.f27302j;
        C41536l.m120488h(appCompatImageView, "binding.imageView");
        C18368l.m62777z(appCompatImageView, image, C13198c.f38933d);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ButtonListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        C41536l.m120489i(context2, "context");
        C9973n1 c = C9973n1.m36581c(LayoutInflater.from(context), this);
        C41536l.m120488h(c, "inflate(\n        LayoutI…from(context), this\n    )");
        this.f38919d = c;
        AppCompatImageView appCompatImageView = c.f27302j;
        C41536l.m120488h(appCompatImageView, "binding.imageView");
        this.f38921f = new C18378q(appCompatImageView);
        LayerView layerView = c.f27301i;
        C41536l.m120488h(layerView, "binding.iconLayerView");
        this.f38922g = new C18337b(layerView);
        AppCompatTextView appCompatTextView = c.f27304l;
        C41536l.m120488h(appCompatTextView, "binding.topText");
        this.f38923h = new C18355e0(appCompatTextView, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        AppCompatTextView appCompatTextView2 = c.f27299g;
        C41536l.m120488h(appCompatTextView2, "binding.bottomText");
        this.f38924i = new C18355e0(appCompatTextView2, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        C41551a aVar = C41551a.f97718a;
        this.f38925j = new C13199d((Object) null, this);
        C13196a aVar2 = C13196a.TEXT_BUTTON;
        this.f38926k = new C13200e(aVar2, this);
        this.f38927l = new C13201f(0, this, context2);
        setLayoutParams(new ConstraintLayout.C0620b(-1, C18368l.m62762k(60)));
        setPadding(0, 0, (int) getResources().getDimension(C17779d.f49645S1), 0);
        c.f27303k.setOnClickListener(new C15653c(this));
        c.f27298f.setOnClickListener(new C15654d(this));
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet2, C17787l.f50082Q1);
            C41536l.m120488h(obtainStyledAttributes, "context.obtainStyledAttr…styleable.ButtonListView)");
            setTopText(obtainStyledAttributes.getString(C17787l.f50172W1));
            setBottomText(obtainStyledAttributes.getString(C17787l.f50097R1));
            setButtonText(obtainStyledAttributes.getString(C17787l.f50127T1));
            setIconTint(Integer.valueOf(obtainStyledAttributes.getResourceId(C17787l.f50157V1, 0)));
            setIconBackgroundColor(Integer.valueOf(obtainStyledAttributes.getResourceId(C17787l.f50142U1, 0)));
            int i2 = obtainStyledAttributes.getInt(C17787l.f50112S1, 0);
            if (i2 != 0) {
                if (i2 == 1) {
                    aVar2 = C13196a.BORDER_BUTTON;
                } else if (i2 == 2) {
                    aVar2 = C13196a.NO_BUTTON;
                } else {
                    throw new IllegalStateException("Unknown Button type");
                }
            }
            setType(aVar2);
            C41238w wVar = C41238w.f97225a;
            obtainStyledAttributes.recycle();
        }
    }
}
