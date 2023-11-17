package p341ge.bog.designsystem.components.buttonlist;

import af1.C40303i;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.C0767a;
import androidx.core.widget.C1314o;
import com.bumptech.glide.C2379b;
import com.bumptech.glide.C2394j;
import com.salesforce.marketingcloud.storage.p385db.C11769i;
import java.io.File;
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
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.notificationbadges.NotificationBadgeView;
import p341ge.bog.designsystem.components.textbadge.TextBadgeView;
import p352ak.C9981o1;
import p462ih.C15651a;
import p462ih.C15652b;
import p601sg.C17777b;
import p601sg.C17778c;
import p601sg.C17779d;
import p601sg.C17780e;
import p601sg.C17786k;
import p601sg.C17787l;
import p642vh.C18355e0;
import p642vh.C18363i0;
import p642vh.C18368l;
import p642vh.C18381t;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.designsystem.components.buttonlist.ButtonListLargeView */
public final class ButtonListLargeView extends ConstraintLayout {

    /* renamed from: s */
    static final /* synthetic */ C40303i[] f38875s;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C9981o1 f38876d;

    /* renamed from: e */
    private Image f38877e;

    /* renamed from: f */
    private final C18381t f38878f;

    /* renamed from: g */
    private final C18363i0 f38879g;

    /* renamed from: h */
    private View.OnClickListener f38880h;

    /* renamed from: i */
    private final C18355e0 f38881i;

    /* renamed from: j */
    private final C41555e f38882j;

    /* renamed from: k */
    private TextBadgeView f38883k;

    /* renamed from: l */
    private final C41555e f38884l;

    /* renamed from: m */
    private final C41555e f38885m;

    /* renamed from: n */
    private final C41555e f38886n;

    /* renamed from: o */
    private boolean f38887o;

    /* renamed from: p */
    private final C41555e f38888p;

    /* renamed from: q */
    private final C41555e f38889q;

    /* renamed from: r */
    private final C41555e f38890r;

    /* renamed from: ge.bog.designsystem.components.buttonlist.ButtonListLargeView$a */
    public enum C13183a {
        TEXT_VIEW,
        TEXT_BADGE_VIEW,
        ONLY_UPPER_TEXT
    }

    /* renamed from: ge.bog.designsystem.components.buttonlist.ButtonListLargeView$b */
    public enum C13184b {
        BIG,
        MIDDLE
    }

    /* renamed from: ge.bog.designsystem.components.buttonlist.ButtonListLargeView$c */
    public enum C13185c {
        THUMBNAIL(r15, r11, 1, 2),
        THUMBNAIL_SECONDARY_TEXT(r11, r12, 2, 1),
        OVAL_ICON(C17786k.TextButton1InvertComponents400Left, r12, 2, 2),
        THUMBNAIL_MULTI_SECONDARY_TEXT(r15, C17786k.TextBody1InvertComponents500Left, 10, 1);
        

        /* renamed from: h */
        public static final C13186a f38898h = null;

        /* renamed from: d */
        private final int f38904d;

        /* renamed from: e */
        private final int f38905e;

        /* renamed from: f */
        private final int f38906f;

        /* renamed from: g */
        private final int f38907g;

        /* renamed from: ge.bog.designsystem.components.buttonlist.ButtonListLargeView$c$a */
        public static final class C13186a {
            private C13186a() {
            }

            public /* synthetic */ C13186a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final C13185c mo34946a(int i) {
                for (C13185c cVar : C13185c.values()) {
                    if (cVar.ordinal() == i) {
                        return cVar;
                    }
                }
                return null;
            }
        }

        static {
            f38898h = new C13186a((DefaultConstructorMarker) null);
        }

        private C13185c(int i, int i2, int i3, int i4) {
            this.f38904d = i;
            this.f38905e = i2;
            this.f38906f = i3;
            this.f38907g = i4;
        }

        /* renamed from: b */
        public final int mo34942b() {
            return this.f38906f;
        }

        /* renamed from: c */
        public final int mo34943c() {
            return this.f38904d;
        }

        /* renamed from: e */
        public final int mo34944e() {
            return this.f38907g;
        }

        /* renamed from: f */
        public final int mo34945f() {
            return this.f38905e;
        }
    }

    /* renamed from: ge.bog.designsystem.components.buttonlist.ButtonListLargeView$d */
    public /* synthetic */ class C13187d {

        /* renamed from: a */
        public static final /* synthetic */ int[] f38908a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f38909b;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|(2:1|2)|3|5|6|(2:7|8)|9|11|12|13|14|15|17) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0033 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0019 */
        static {
            /*
                ge.bog.designsystem.components.buttonlist.ButtonListLargeView$a[] r0 = p341ge.bog.designsystem.components.buttonlist.ButtonListLargeView.C13183a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                ge.bog.designsystem.components.buttonlist.ButtonListLargeView$a r2 = p341ge.bog.designsystem.components.buttonlist.ButtonListLargeView.C13183a.TEXT_VIEW     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                ge.bog.designsystem.components.buttonlist.ButtonListLargeView$a r3 = p341ge.bog.designsystem.components.buttonlist.ButtonListLargeView.C13183a.TEXT_BADGE_VIEW     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                ge.bog.designsystem.components.buttonlist.ButtonListLargeView$a r3 = p341ge.bog.designsystem.components.buttonlist.ButtonListLargeView.C13183a.ONLY_UPPER_TEXT     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r4 = 3
                r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f38908a = r0
                ge.bog.designsystem.components.buttonlist.ButtonListLargeView$b[] r0 = p341ge.bog.designsystem.components.buttonlist.ButtonListLargeView.C13184b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ge.bog.designsystem.components.buttonlist.ButtonListLargeView$b r3 = p341ge.bog.designsystem.components.buttonlist.ButtonListLargeView.C13184b.BIG     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                ge.bog.designsystem.components.buttonlist.ButtonListLargeView$b r1 = p341ge.bog.designsystem.components.buttonlist.ButtonListLargeView.C13184b.MIDDLE     // Catch:{ NoSuchFieldError -> 0x003b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003b }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003b }
            L_0x003b:
                f38909b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.designsystem.components.buttonlist.ButtonListLargeView.C13187d.<clinit>():void");
        }
    }

    /* renamed from: ge.bog.designsystem.components.buttonlist.ButtonListLargeView$e */
    static final class C13188e extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C13188e f38910d = new C13188e();

        C13188e() {
            super(1);
        }

        /* renamed from: a */
        public final C2394j invoke(C2394j jVar) {
            C41536l.m120489i(jVar, "$this$setImage");
            C2247a c = jVar.mo7219c();
            C41536l.m120488h(c, "centerCrop()");
            return (C2394j) c;
        }
    }

    /* renamed from: ge.bog.designsystem.components.buttonlist.ButtonListLargeView$f */
    public static final class C13189f extends C41553c {

        /* renamed from: a */
        final /* synthetic */ ButtonListLargeView f38911a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13189f(Object obj, ButtonListLargeView buttonListLargeView) {
            super(obj);
            this.f38911a = buttonListLargeView;
        }

        /* access modifiers changed from: protected */
        public void afterChange(C40303i iVar, Object obj, Object obj2) {
            boolean z;
            C41536l.m120489i(iVar, "property");
            CharSequence charSequence = (CharSequence) obj2;
            CharSequence charSequence2 = (CharSequence) obj;
            AppCompatTextView appCompatTextView = this.f38911a.f38876d.f27348l;
            int i = 0;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (C41341q.m119910m(C13183a.TEXT_BADGE_VIEW, C13183a.ONLY_UPPER_TEXT).contains(this.f38911a.getBottomViewType())) {
                    i = 8;
                }
            }
            appCompatTextView.setVisibility(i);
            this.f38911a.f38876d.f27348l.setText(charSequence);
        }
    }

    /* renamed from: ge.bog.designsystem.components.buttonlist.ButtonListLargeView$g */
    public static final class C13190g extends C41553c {

        /* renamed from: a */
        final /* synthetic */ ButtonListLargeView f38912a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13190g(Object obj, ButtonListLargeView buttonListLargeView) {
            super(obj);
            this.f38912a = buttonListLargeView;
        }

        /* access modifiers changed from: protected */
        public void afterChange(C40303i iVar, Object obj, Object obj2) {
            int i;
            C41536l.m120489i(iVar, "property");
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            if (((Boolean) obj).booleanValue() != booleanValue) {
                Button button = this.f38912a.f38876d.f27349m;
                if (booleanValue) {
                    i = 0;
                    if (this.f38912a.getIconButtonVisible()) {
                        this.f38912a.setIconButtonVisible(false);
                    }
                } else {
                    i = 8;
                }
                button.setVisibility(i);
            }
        }
    }

    /* renamed from: ge.bog.designsystem.components.buttonlist.ButtonListLargeView$h */
    public static final class C13191h extends C41553c {

        /* renamed from: a */
        final /* synthetic */ ButtonListLargeView f38913a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13191h(Object obj, ButtonListLargeView buttonListLargeView) {
            super(obj);
            this.f38913a = buttonListLargeView;
        }

        /* access modifiers changed from: protected */
        public void afterChange(C40303i iVar, Object obj, Object obj2) {
            int i;
            C41536l.m120489i(iVar, "property");
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            if (((Boolean) obj).booleanValue() != booleanValue) {
                Button button = this.f38913a.f38876d.f27346j;
                if (booleanValue) {
                    i = 0;
                    if (this.f38913a.getChangeButtonVisible()) {
                        this.f38913a.setChangeButtonVisible(false);
                    }
                } else {
                    i = 8;
                }
                button.setVisibility(i);
            }
        }
    }

    /* renamed from: ge.bog.designsystem.components.buttonlist.ButtonListLargeView$i */
    public static final class C13192i extends C41553c {

        /* renamed from: a */
        final /* synthetic */ ButtonListLargeView f38914a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13192i(Object obj, ButtonListLargeView buttonListLargeView) {
            super(obj);
            this.f38914a = buttonListLargeView;
        }

        /* access modifiers changed from: protected */
        public void afterChange(C40303i iVar, Object obj, Object obj2) {
            C41536l.m120489i(iVar, "property");
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            if (((Boolean) obj).booleanValue() != booleanValue) {
                this.f38914a.f38876d.f27341e.setBadgeVisible(booleanValue);
            }
        }
    }

    /* renamed from: ge.bog.designsystem.components.buttonlist.ButtonListLargeView$j */
    public static final class C13193j extends C41553c {

        /* renamed from: a */
        final /* synthetic */ ButtonListLargeView f38915a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13193j(Object obj, ButtonListLargeView buttonListLargeView) {
            super(obj);
            this.f38915a = buttonListLargeView;
        }

        /* access modifiers changed from: protected */
        public void afterChange(C40303i iVar, Object obj, Object obj2) {
            C41536l.m120489i(iVar, "property");
            C13183a aVar = (C13183a) obj2;
            if (((C13183a) obj) != aVar) {
                int i = C13187d.f38908a[aVar.ordinal()];
                if (i == 1) {
                    this.f38915a.f38876d.f27348l.setVisibility(0);
                    this.f38915a.f38876d.f27342f.setVisibility(8);
                } else if (i == 2) {
                    this.f38915a.f38876d.f27348l.setVisibility(8);
                    this.f38915a.f38876d.f27342f.setVisibility(0);
                } else if (i == 3) {
                    this.f38915a.f38876d.f27348l.setVisibility(8);
                    this.f38915a.f38876d.f27342f.setVisibility(8);
                }
            }
        }
    }

    /* renamed from: ge.bog.designsystem.components.buttonlist.ButtonListLargeView$k */
    public static final class C13194k extends C41553c {

        /* renamed from: a */
        final /* synthetic */ ButtonListLargeView f38916a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13194k(Object obj, ButtonListLargeView buttonListLargeView) {
            super(obj);
            this.f38916a = buttonListLargeView;
        }

        /* access modifiers changed from: protected */
        public void afterChange(C40303i iVar, Object obj, Object obj2) {
            C41536l.m120489i(iVar, "property");
            C13184b bVar = (C13184b) obj2;
            if (((C13184b) obj) != bVar) {
                int i = C13187d.f38909b[bVar.ordinal()];
                if (i == 1) {
                    this.f38916a.m49622q(C17779d.size_template_header_icon_image);
                } else if (i == 2) {
                    this.f38916a.m49622q(C17779d.size_template_header_icon_image_middle);
                }
            }
        }
    }

    /* renamed from: ge.bog.designsystem.components.buttonlist.ButtonListLargeView$l */
    public static final class C13195l extends C41553c {

        /* renamed from: a */
        final /* synthetic */ ButtonListLargeView f38917a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13195l(Object obj, ButtonListLargeView buttonListLargeView) {
            super(obj);
            this.f38917a = buttonListLargeView;
        }

        /* access modifiers changed from: protected */
        public void afterChange(C40303i iVar, Object obj, Object obj2) {
            C41536l.m120489i(iVar, "property");
            C13185c cVar = (C13185c) obj2;
            if (((C13185c) obj) != cVar) {
                this.f38917a.setupTextStyles(cVar);
            }
        }
    }

    static {
        Class<ButtonListLargeView> cls = ButtonListLargeView.class;
        f38875s = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "iconTint", "getIconTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "iconBackgroundTint", "getIconBackgroundTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "upperText", "getUpperText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "lowerText", "getLowerText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "changeButtonVisible", "getChangeButtonVisible()Z", 0)), C41520a0.m120439e(new C41539o(cls, "iconButtonVisible", "getIconButtonVisible()Z", 0)), C41520a0.m120439e(new C41539o(cls, "badgeVisible", "getBadgeVisible()Z", 0)), C41520a0.m120439e(new C41539o(cls, "bottomViewType", "getBottomViewType()Lge/bog/designsystem/components/buttonlist/ButtonListLargeView$BottomViewType;", 0)), C41520a0.m120439e(new C41539o(cls, "imageSizeType", "getImageSizeType()Lge/bog/designsystem/components/buttonlist/ButtonListLargeView$ImageViewSize;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonListType", "getButtonListType()Lge/bog/designsystem/components/buttonlist/ButtonListLargeView$Style;", 0))};
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ButtonListLargeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static final void m49617j(ButtonListLargeView buttonListLargeView, View view) {
        C41536l.m120489i(buttonListLargeView, "this$0");
        View.OnClickListener onClickListener = buttonListLargeView.f38880h;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static final void m49618k(ButtonListLargeView buttonListLargeView, View view) {
        C41536l.m120489i(buttonListLargeView, "this$0");
        View.OnClickListener onClickListener = buttonListLargeView.f38880h;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public final void m49622q(int i) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i);
        LayerView layerView = this.f38876d.f27347k;
        layerView.getLayoutParams().height = dimensionPixelSize;
        layerView.getLayoutParams().width = dimensionPixelSize;
        layerView.requestLayout();
    }

    /* access modifiers changed from: private */
    public final void setupTextStyles(C13185c cVar) {
        C1314o.m4575q(this.f38876d.f27350n, cVar.mo34945f());
        C1314o.m4575q(this.f38876d.f27348l, cVar.mo34943c());
        this.f38876d.f27350n.setMaxLines(cVar.mo34944e());
        this.f38876d.f27348l.setMaxLines(cVar.mo34942b());
    }

    public final boolean getBadgeOnButtonVisible() {
        return this.f38887o;
    }

    public final boolean getBadgeVisible() {
        return ((Boolean) this.f38886n.getValue(this, f38875s[6])).booleanValue();
    }

    public final C13183a getBottomViewType() {
        return (C13183a) this.f38888p.getValue(this, f38875s[7]);
    }

    public final C13185c getButtonListType() {
        return (C13185c) this.f38890r.getValue(this, f38875s[9]);
    }

    public final CharSequence getButtonText() {
        return this.f38876d.f27349m.getButtonText();
    }

    public final boolean getChangeButtonVisible() {
        return ((Boolean) this.f38884l.getValue(this, f38875s[4])).booleanValue();
    }

    public final Image getIcon() {
        return this.f38877e;
    }

    public final ColorStateList getIconBackgroundTint() {
        return this.f38879g.getValue(this, f38875s[1]);
    }

    public final Drawable getIconButtonDrawable() {
        return this.f38876d.f27346j.getButtonIcon();
    }

    public final boolean getIconButtonVisible() {
        return ((Boolean) this.f38885m.getValue(this, f38875s[5])).booleanValue();
    }

    public final ColorStateList getIconTint() {
        return this.f38878f.getValue(this, f38875s[0]);
    }

    public final C13184b getImageSizeType() {
        return (C13184b) this.f38889q.getValue(this, f38875s[8]);
    }

    public final CharSequence getLowerText() {
        return (CharSequence) this.f38882j.getValue(this, f38875s[3]);
    }

    public final TextBadgeView getTextBadge() {
        return this.f38883k;
    }

    public final CharSequence getUpperText() {
        return this.f38881i.getValue(this, f38875s[2]);
    }

    /* renamed from: o */
    public final void mo34924o(File file, int i) {
        C41536l.m120489i(file, "file");
        ((C2394j) ((C2394j) C2379b.m9210t(getContext()).mo7754v(file).mo7222d()).mo7232j(i)).mo7718L0(this.f38876d.f27345i);
    }

    /* renamed from: p */
    public final void mo34925p(String str) {
        C41536l.m120489i(str, C11769i.C11770a.f34149l);
        ((C2394j) ((C2394j) C2379b.m9210t(getContext()).mo7757y(str).mo7220c0(C17780e.f49668q1)).mo7222d()).mo7718L0(this.f38876d.f27345i);
    }

    public final void setBadgeOnButtonVisible(boolean z) {
        this.f38887o = z;
    }

    public final void setBadgeVisible(boolean z) {
        this.f38886n.setValue(this, f38875s[6], Boolean.valueOf(z));
    }

    public final void setBottomViewType(C13183a aVar) {
        C41536l.m120489i(aVar, "<set-?>");
        this.f38888p.setValue(this, f38875s[7], aVar);
    }

    public final void setButtonListType(C13185c cVar) {
        C41536l.m120489i(cVar, "<set-?>");
        this.f38890r.setValue(this, f38875s[9], cVar);
    }

    public final void setButtonText(CharSequence charSequence) {
        this.f38876d.f27349m.setButtonText(charSequence);
    }

    public final void setChangeButtonVisible(boolean z) {
        this.f38884l.setValue(this, f38875s[4], Boolean.valueOf(z));
    }

    public final void setIcon(Image image) {
        this.f38877e = image;
        AppCompatImageView appCompatImageView = this.f38876d.f27345i;
        C41536l.m120488h(appCompatImageView, "binding.icon");
        C18368l.m62777z(appCompatImageView, image, C13188e.f38910d);
    }

    public final void setIconBackgroundTint(ColorStateList colorStateList) {
        this.f38879g.setValue(this, f38875s[1], colorStateList);
    }

    public final void setIconButtonDrawable(Drawable drawable) {
        this.f38876d.f27346j.setButtonIcon(drawable);
    }

    public final void setIconButtonVisible(boolean z) {
        this.f38885m.setValue(this, f38875s[5], Boolean.valueOf(z));
    }

    public final void setIconTint(ColorStateList colorStateList) {
        this.f38878f.setValue(this, f38875s[0], colorStateList);
    }

    public final void setImageSizeType(C13184b bVar) {
        C41536l.m120489i(bVar, "<set-?>");
        this.f38889q.setValue(this, f38875s[8], bVar);
    }

    public final void setLowerText(CharSequence charSequence) {
        this.f38882j.setValue(this, f38875s[3], charSequence);
    }

    public final void setOnButtonClickListener(View.OnClickListener onClickListener) {
        C41536l.m120489i(onClickListener, "clickedListener");
        this.f38880h = onClickListener;
    }

    public final void setTextBadge(TextBadgeView textBadgeView) {
        C41536l.m120489i(textBadgeView, "<set-?>");
        this.f38883k = textBadgeView;
    }

    public final void setUpperText(CharSequence charSequence) {
        this.f38881i.setValue(this, f38875s[2], charSequence);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ButtonListLargeView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ButtonListLargeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C41536l.m120489i(context, "context");
        C9981o1 c = C9981o1.m36608c(LayoutInflater.from(context), this);
        C41536l.m120488h(c, "inflate(\n        LayoutI…from(context), this\n    )");
        this.f38876d = c;
        AppCompatImageView appCompatImageView = c.f27345i;
        C41536l.m120488h(appCompatImageView, "binding.icon");
        this.f38878f = new C18381t(appCompatImageView, (PorterDuff.Mode) null, 2, (DefaultConstructorMarker) null);
        LayerView layerView = c.f27347k;
        C41536l.m120488h(layerView, "binding.layerView");
        this.f38879g = new C18363i0(layerView);
        AppCompatTextView appCompatTextView = c.f27350n;
        C41536l.m120488h(appCompatTextView, "binding.upperText");
        this.f38881i = new C18355e0(appCompatTextView, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        C41551a aVar = C41551a.f97718a;
        this.f38882j = new C13189f((Object) null, this);
        TextBadgeView textBadgeView = c.f27342f;
        C41536l.m120488h(textBadgeView, "binding.bottomTextBadge");
        this.f38883k = textBadgeView;
        Boolean bool = Boolean.FALSE;
        this.f38884l = new C13190g(bool, this);
        this.f38885m = new C13191h(bool, this);
        this.f38886n = new C13192i(bool, this);
        this.f38887o = c.f27344h.mo36202a();
        C13183a aVar2 = C13183a.TEXT_VIEW;
        this.f38888p = new C13193j(aVar2, this);
        C13184b bVar = C13184b.BIG;
        this.f38889q = new C13194k(bVar, this);
        this.f38890r = new C13195l(C13185c.THUMBNAIL, this);
        c.f27349m.setOnClickListener(new C15651a(this));
        c.f27346j.setOnClickListener(new C15652b(this));
        int[] iArr = C17787l.f49902E1;
        C41536l.m120488h(iArr, "ButtonListLarge");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        C41536l.m120488h(obtainStyledAttributes, "obtainStyledAttributes(set, attrs, defStyleAttr, defStyleRes)");
        setUpperText(obtainStyledAttributes.getString(C17787l.f50067P1));
        setLowerText(obtainStyledAttributes.getString(C17787l.f50052O1));
        String string = obtainStyledAttributes.getString(C17787l.f49947H1);
        if (string != null) {
            setButtonText(string);
        }
        setChangeButtonVisible(obtainStyledAttributes.getBoolean(C17787l.f49962I1, true));
        setIconButtonVisible(obtainStyledAttributes.getBoolean(C17787l.f50022M1, false));
        C13185c a = C13185c.f38898h.mo34946a(obtainStyledAttributes.getInt(C17787l.f49932G1, 0));
        if (a != null) {
            setupTextStyles(a);
        }
        int i2 = obtainStyledAttributes.getInt(C17787l.f49917F1, 0);
        if (i2 != 0) {
            if (i2 == 1) {
                aVar2 = C13183a.TEXT_BADGE_VIEW;
            } else if (i2 == 2) {
                aVar2 = C13183a.ONLY_UPPER_TEXT;
            } else {
                throw new IllegalStateException("Unknown Bottom view type");
            }
        }
        setBottomViewType(aVar2);
        int resourceId = obtainStyledAttributes.getResourceId(C17787l.f49977J1, 0);
        if (resourceId != 0) {
            setIcon(new Image.Resource(resourceId, (Boolean) null, 2, (DefaultConstructorMarker) null));
        }
        int resourceId2 = obtainStyledAttributes.getResourceId(C17787l.f49992K1, 0);
        if (resourceId2 != 0) {
            setIconTint(C5769a.m23209a(context, resourceId2));
        }
        int i3 = obtainStyledAttributes.getInt(C17787l.f50037N1, 0);
        if (i3 != 0) {
            if (i3 == 1) {
                bVar = C13184b.MIDDLE;
            } else {
                throw new IllegalStateException("Unknown image size type");
            }
        }
        setImageSizeType(bVar);
        if (resourceId2 != 0) {
            setIconTint(C5769a.m23209a(context, resourceId2));
        }
        int resourceId3 = obtainStyledAttributes.getResourceId(C17787l.f50007L1, 0);
        if (resourceId3 != 0) {
            setIconBackgroundTint(C5769a.m23209a(context, resourceId3));
        }
        obtainStyledAttributes.recycle();
        NotificationBadgeView badgeView = c.f27341e.getBadgeView();
        badgeView.setBadgeColor(Integer.valueOf(C0767a.m2893c(context, C17778c.f49617S)));
        badgeView.setBorderColor(Integer.valueOf(C18368l.m62755d(context, C17777b.f49595j)));
    }
}
