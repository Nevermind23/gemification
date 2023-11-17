package p341ge.bog.designsystem.components.pagedescription;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.content.C0767a;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.common.Color;
import p341ge.bog.designsystem.components.common.Image;
import p352ak.C9952k4;
import p352ak.C9960l4;
import p601sg.C17778c;
import p601sg.C17779d;
import p601sg.C17786k;
import p601sg.C17787l;
import p642vh.C18382u;
import p698zi.C19031a;

/* renamed from: ge.bog.designsystem.components.pagedescription.PageDescriptionView */
public final class PageDescriptionView extends LinearLayout {

    /* renamed from: d */
    private C19031a f39961d;

    /* renamed from: e */
    private C13419a f39962e;

    /* renamed from: f */
    private Integer f39963f;

    /* renamed from: g */
    private String f39964g;

    /* renamed from: h */
    private boolean f39965h;

    /* renamed from: i */
    private Integer f39966i;

    /* renamed from: ge.bog.designsystem.components.pagedescription.PageDescriptionView$a */
    public enum C13419a {
        SmallTitle(1, r15, r12, C17779d.f49641I1),
        NormalTitle(2, r12, r13, r14),
        LowerCaseTitle(3, C17786k.TextSubtitle2InvertComponents400Left, r13, r14);
        

        /* renamed from: h */
        public static final C13420a f39967h = null;

        /* renamed from: d */
        private final int f39972d;

        /* renamed from: e */
        private final int f39973e;

        /* renamed from: f */
        private final int f39974f;

        /* renamed from: g */
        private final int f39975g;

        /* renamed from: ge.bog.designsystem.components.pagedescription.PageDescriptionView$a$a */
        public static final class C13420a {
            private C13420a() {
            }

            public /* synthetic */ C13420a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final C13419a mo36373a(int i) {
                boolean z;
                for (C13419a aVar : C13419a.values()) {
                    if (aVar.mo36369b() == i) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        return aVar;
                    }
                }
                return null;
            }
        }

        static {
            f39967h = new C13420a((DefaultConstructorMarker) null);
        }

        private C13419a(int i, int i2, int i3, int i4) {
            this.f39972d = i;
            this.f39973e = i2;
            this.f39974f = i3;
            this.f39975g = i4;
        }

        /* renamed from: b */
        public final int mo36369b() {
            return this.f39972d;
        }

        /* renamed from: c */
        public final int mo36370c() {
            return this.f39974f;
        }

        /* renamed from: e */
        public final int mo36371e() {
            return this.f39973e;
        }

        /* renamed from: f */
        public final int mo36372f() {
            return this.f39975g;
        }
    }

    /* renamed from: ge.bog.designsystem.components.pagedescription.PageDescriptionView$b */
    public enum C13421b {
        ICON(1, r19, r19, new C18382u.C18383a(r15), (int) null, 16, (C18382u) null),
        IMAGE(2, r15, r16, new C18382u.C18383a(C17779d.page_description_image_width), new C18382u.C18384b(-2)),
        CIRCLE_IMAGE(3, r15, r16, new C18382u.C18383a(r3), (int) null, 16, (C18382u) null),
        CIRCLE_IMAGE_BIG(4, C17779d.f49641I1, C17779d.f49644Q1, new C18382u.C18383a(C17779d.page_description_icon_big_size), (int) null, 16, (C18382u) null);
        

        /* renamed from: i */
        public static final C13422a f39976i = null;

        /* renamed from: d */
        private final int f39982d;

        /* renamed from: e */
        private final int f39983e;

        /* renamed from: f */
        private final int f39984f;

        /* renamed from: g */
        private final C18382u f39985g;

        /* renamed from: h */
        private final C18382u f39986h;

        /* renamed from: ge.bog.designsystem.components.pagedescription.PageDescriptionView$b$a */
        public static final class C13422a {
            private C13422a() {
            }

            public /* synthetic */ C13422a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final C13421b mo36379a(int i) {
                boolean z;
                for (C13421b bVar : C13421b.values()) {
                    if (bVar.mo36374b() == i) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        return bVar;
                    }
                }
                return null;
            }
        }

        static {
            f39976i = new C13422a((DefaultConstructorMarker) null);
        }

        private C13421b(int i, int i2, int i3, C18382u uVar, C18382u uVar2) {
            this.f39982d = i;
            this.f39983e = i2;
            this.f39984f = i3;
            this.f39985g = uVar;
            this.f39986h = uVar2;
        }

        /* renamed from: b */
        public final int mo36374b() {
            return this.f39982d;
        }

        /* renamed from: c */
        public final C18382u mo36375c() {
            return this.f39986h;
        }

        /* renamed from: e */
        public final C18382u mo36376e() {
            return this.f39985g;
        }

        /* renamed from: f */
        public final int mo36377f() {
            return this.f39984f;
        }

        /* renamed from: g */
        public final int mo36378g() {
            return this.f39983e;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PageDescriptionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    public static /* synthetic */ void getDrawableSrc$annotations() {
    }

    public static /* synthetic */ void getImageUrl$annotations() {
    }

    public final Integer getBadgeColor() {
        C19031a aVar = this.f39961d;
        if (aVar == null) {
            C41536l.m120506z("pageDescriptionViewType");
            aVar = null;
        }
        return aVar.mo47222a();
    }

    public final CharSequence getButtonText() {
        C19031a aVar = this.f39961d;
        if (aVar == null) {
            C41536l.m120506z("pageDescriptionViewType");
            aVar = null;
        }
        return aVar.mo47223b();
    }

    public final C13419a getDescriptionType() {
        return this.f39962e;
    }

    public final Integer getDrawableSrc() {
        return this.f39963f;
    }

    public final C13421b getDrawableType() {
        C19031a aVar = this.f39961d;
        if (aVar == null) {
            C41536l.m120506z("pageDescriptionViewType");
            aVar = null;
        }
        return aVar.mo47225d();
    }

    public final String getImageUrl() {
        return this.f39964g;
    }

    public final boolean getShowBadge() {
        return this.f39965h;
    }

    public final String getText() {
        C19031a aVar = this.f39961d;
        if (aVar == null) {
            C41536l.m120506z("pageDescriptionViewType");
            aVar = null;
        }
        return aVar.mo47227f();
    }

    public final String getTitle() {
        C19031a aVar = this.f39961d;
        if (aVar == null) {
            C41536l.m120506z("pageDescriptionViewType");
            aVar = null;
        }
        return aVar.mo47228g();
    }

    public final void setBadgeColor(Integer num) {
        C19031a aVar = this.f39961d;
        if (aVar == null) {
            C41536l.m120506z("pageDescriptionViewType");
            aVar = null;
        }
        aVar.mo47229h(num);
        this.f39966i = num;
    }

    public final void setButtonClickListener(View.OnClickListener onClickListener) {
        C41536l.m120489i(onClickListener, "listener");
        C19031a aVar = this.f39961d;
        if (aVar == null) {
            C41536l.m120506z("pageDescriptionViewType");
            aVar = null;
        }
        aVar.mo47230i(onClickListener);
    }

    public final void setButtonText(CharSequence charSequence) {
        C19031a aVar = this.f39961d;
        if (aVar == null) {
            C41536l.m120506z("pageDescriptionViewType");
            aVar = null;
        }
        aVar.mo47231j(charSequence);
    }

    public final void setDescriptionType(C13419a aVar) {
        C41536l.m120489i(aVar, C11755a.C11756a.f34100b);
        C19031a aVar2 = this.f39961d;
        if (aVar2 == null) {
            C41536l.m120506z("pageDescriptionViewType");
            aVar2 = null;
        }
        aVar2.mo47233l(aVar);
        this.f39962e = aVar;
    }

    public final void setDrawableSrc(Integer num) {
        C19031a aVar = this.f39961d;
        Image.Resource resource = null;
        if (aVar == null) {
            C41536l.m120506z("pageDescriptionViewType");
            aVar = null;
        }
        if (num != null) {
            resource = new Image.Resource(num.intValue(), (Boolean) null, 2, (DefaultConstructorMarker) null);
        }
        aVar.mo47232k(resource);
        this.f39963f = num;
    }

    public final void setDrawableTint(Color color) {
        C41536l.m120489i(color, "color");
        C19031a aVar = this.f39961d;
        if (aVar == null) {
            C41536l.m120506z("pageDescriptionViewType");
            aVar = null;
        }
        aVar.mo47235n(color);
    }

    public final void setDrawableTintAttr(int i) {
        C19031a aVar = this.f39961d;
        if (aVar == null) {
            C41536l.m120506z("pageDescriptionViewType");
            aVar = null;
        }
        aVar.mo47236o(i);
    }

    public final void setDrawableTintColor(int i) {
        C19031a aVar = this.f39961d;
        if (aVar == null) {
            C41536l.m120506z("pageDescriptionViewType");
            aVar = null;
        }
        aVar.mo47237p(i);
    }

    public final void setDrawableType(C13421b bVar) {
        C41536l.m120489i(bVar, C11755a.C11756a.f34100b);
        C19031a aVar = this.f39961d;
        if (aVar == null) {
            C41536l.m120506z("pageDescriptionViewType");
            aVar = null;
        }
        aVar.mo47238q(bVar);
    }

    public final void setImage(Image image) {
        C19031a aVar = this.f39961d;
        if (aVar == null) {
            C41536l.m120506z("pageDescriptionViewType");
            aVar = null;
        }
        aVar.mo47232k(image);
    }

    public final void setImageUrl(String str) {
        C19031a aVar = this.f39961d;
        Image.Url url = null;
        if (aVar == null) {
            C41536l.m120506z("pageDescriptionViewType");
            aVar = null;
        }
        if (str != null) {
            url = new Image.Url(str, (Image.Placeholder) null, (Image.Placeholder) null, (Map) null, (Drawable) null, (Drawable) null, (Boolean) null, 126, (DefaultConstructorMarker) null);
        }
        aVar.mo47232k(url);
        this.f39964g = str;
    }

    public final void setShowBadge(boolean z) {
        this.f39965h = z;
        C19031a aVar = this.f39961d;
        if (aVar == null) {
            C41536l.m120506z("pageDescriptionViewType");
            aVar = null;
        }
        aVar.mo47241t(z);
    }

    public final void setSpannedText(Spanned spanned) {
        C19031a aVar = this.f39961d;
        if (aVar == null) {
            C41536l.m120506z("pageDescriptionViewType");
            aVar = null;
        }
        aVar.mo47242u(spanned);
    }

    public final void setText(String str) {
        C19031a aVar = this.f39961d;
        if (aVar == null) {
            C41536l.m120506z("pageDescriptionViewType");
            aVar = null;
        }
        aVar.mo47243v(str);
    }

    public final void setTextGravity(int i) {
        C19031a aVar = this.f39961d;
        if (aVar == null) {
            C41536l.m120506z("pageDescriptionViewType");
            aVar = null;
        }
        aVar.mo47244w(i);
    }

    public final void setTitle(String str) {
        C19031a aVar = this.f39961d;
        if (aVar == null) {
            C41536l.m120506z("pageDescriptionViewType");
            aVar = null;
        }
        aVar.mo47245x(str);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PageDescriptionView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public final void setDrawableTint(int i) {
        C19031a aVar = this.f39961d;
        if (aVar == null) {
            C41536l.m120506z("pageDescriptionViewType");
            aVar = null;
        }
        aVar.mo47234m(i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PageDescriptionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C19031a aVar;
        C41536l.m120489i(context, "context");
        C13419a aVar2 = C13419a.NormalTitle;
        this.f39962e = aVar2;
        int[] iArr = C17787l.f50528s9;
        C41536l.m120488h(iArr, "PageDescriptionView");
        boolean z = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        C41536l.m120488h(obtainStyledAttributes, "obtainStyledAttributes(set, attrs, defStyleAttr, defStyleRes)");
        LayoutInflater from = LayoutInflater.from(context);
        int i2 = obtainStyledAttributes.getInt(C17787l.f50635z9, 2);
        if (i2 == 1) {
            setOrientation(0);
            C9960l4 c = C9960l4.m36531c(from, this);
            C41536l.m120488h(c, "inflate(\n               …                        )");
            aVar = new C19031a.C19032a(c);
        } else if (i2 == 2) {
            setOrientation(1);
            C9952k4 c2 = C9952k4.m36501c(from, this);
            C41536l.m120488h(c2, "inflate(\n               …                        )");
            aVar = new C19031a.C19034b(c2);
        } else {
            throw new IllegalStateException("Unknown Page Description type");
        }
        this.f39961d = aVar;
        C13419a a = C13419a.f39967h.mo36373a(obtainStyledAttributes.getInt(C17787l.f50560u9, aVar2.mo36369b()));
        setDescriptionType(a != null ? a : aVar2);
        int i3 = obtainStyledAttributes.getInt(C17787l.f50605x9, 1);
        setTitle(obtainStyledAttributes.getString(C17787l.f49880C9));
        setText(obtainStyledAttributes.getString(C17787l.f49865B9));
        setShowBadge(obtainStyledAttributes.getBoolean(C17787l.f49850A9, false));
        setButtonText(obtainStyledAttributes.getString(C17787l.f50620y9));
        setBadgeColor(Integer.valueOf(obtainStyledAttributes.getColor(C17787l.f50544t9, C0767a.m2893c(context, C17778c.f49617S))));
        int resourceId = obtainStyledAttributes.getResourceId(C17787l.f50575v9, 0);
        Integer num = null;
        if (resourceId != 0) {
            setImage(new Image.Resource(resourceId, (Boolean) null, 2, (DefaultConstructorMarker) null));
        }
        Integer valueOf = Integer.valueOf(obtainStyledAttributes.getColor(C17787l.f50590w9, -1));
        num = valueOf.intValue() != -1 ? true : z ? valueOf : num;
        if (num != null) {
            setDrawableTintColor(num.intValue());
        }
        C13421b a2 = C13421b.f39976i.mo36379a(i3);
        setDrawableType(a2 == null ? C13421b.IMAGE : a2);
        obtainStyledAttributes.recycle();
    }
}
