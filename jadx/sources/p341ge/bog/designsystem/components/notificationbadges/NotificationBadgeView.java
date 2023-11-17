package p341ge.bog.designsystem.components.notificationbadges;

import af1.C40303i;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LevelListDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.graphics.drawable.C0836a;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.properties.C41553c;
import kotlin.properties.C41555e;
import p045d.C5769a;
import p601sg.C17777b;
import p601sg.C17779d;
import p642vh.C18368l;

/* renamed from: ge.bog.designsystem.components.notificationbadges.NotificationBadgeView */
public final class NotificationBadgeView extends AppCompatTextView {

    /* renamed from: k */
    public static final C13401a f39869k = new C13401a((DefaultConstructorMarker) null);

    /* renamed from: l */
    static final /* synthetic */ C40303i[] f39870l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static final int f39871m = C18368l.m62762k(1);

    /* renamed from: d */
    private final C41555e f39872d;

    /* renamed from: e */
    private final C41555e f39873e;

    /* renamed from: f */
    private final C41555e f39874f;

    /* renamed from: g */
    private final C41555e f39875g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final int f39876h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final int f39877i;

    /* renamed from: j */
    private Rect f39878j;

    /* renamed from: ge.bog.designsystem.components.notificationbadges.NotificationBadgeView$BadgeType */
    public static abstract class BadgeType implements Parcelable {

        /* renamed from: ge.bog.designsystem.components.notificationbadges.NotificationBadgeView$BadgeType$Empty */
        public static final class Empty extends BadgeType {
            public static final Parcelable.Creator<Empty> CREATOR = new C13398a();

            /* renamed from: d */
            public static final Empty f39879d = new Empty();

            /* renamed from: ge.bog.designsystem.components.notificationbadges.NotificationBadgeView$BadgeType$Empty$a */
            public static final class C13398a implements Parcelable.Creator {
                /* renamed from: a */
                public final Empty createFromParcel(Parcel parcel) {
                    C41536l.m120489i(parcel, "parcel");
                    parcel.readInt();
                    return Empty.f39879d;
                }

                /* renamed from: b */
                public final Empty[] newArray(int i) {
                    return new Empty[i];
                }
            }

            private Empty() {
                super((DefaultConstructorMarker) null);
            }

            /* renamed from: a */
            public void mo36224a(int i, NotificationBadgeView notificationBadgeView) {
                C41536l.m120489i(notificationBadgeView, "badge");
                notificationBadgeView.setBadgeText("");
            }

            public int describeContents() {
                return 0;
            }

            public void writeToParcel(Parcel parcel, int i) {
                C41536l.m120489i(parcel, "out");
                parcel.writeInt(1);
            }
        }

        /* renamed from: ge.bog.designsystem.components.notificationbadges.NotificationBadgeView$BadgeType$Icon */
        public static final class Icon extends BadgeType {
            public static final Parcelable.Creator<Icon> CREATOR = new C13399a();

            /* renamed from: d */
            private final int f39880d;

            /* renamed from: e */
            private final int f39881e;

            /* renamed from: f */
            private final int f39882f;

            /* renamed from: g */
            private final int f39883g;

            /* renamed from: ge.bog.designsystem.components.notificationbadges.NotificationBadgeView$BadgeType$Icon$a */
            public static final class C13399a implements Parcelable.Creator {
                /* renamed from: a */
                public final Icon createFromParcel(Parcel parcel) {
                    C41536l.m120489i(parcel, "parcel");
                    return new Icon(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                }

                /* renamed from: b */
                public final Icon[] newArray(int i) {
                    return new Icon[i];
                }
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ Icon(int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
                this(i, (i5 & 2) != 0 ? -1 : i2, (i5 & 4) != 0 ? -1 : i3, (i5 & 8) != 0 ? -1 : i4);
            }

            /* renamed from: a */
            public void mo36224a(int i, NotificationBadgeView notificationBadgeView) {
                C41536l.m120489i(notificationBadgeView, "badge");
                Context context = notificationBadgeView.getContext();
                Drawable b = C5769a.m23210b(context, this.f39880d);
                if (b != null) {
                    C41536l.m120488h(b, "requireNotNull(AppCompat…le\"\n                    }");
                    int i2 = this.f39881e;
                    if (i2 == -1) {
                        i2 = context.getResources().getDimensionPixelSize(C17779d.spacing_12);
                    }
                    int i3 = this.f39882f;
                    if (i3 == -1) {
                        i3 = context.getResources().getDimensionPixelSize(C17779d.spacing_12);
                    }
                    b.setBounds(0, 0, i2, i3);
                    int i4 = this.f39883g;
                    if (i4 == -1) {
                        C41536l.m120488h(context, "context");
                        i4 = C18368l.m62755d(context, C17777b.f49590A);
                    }
                    C0836a.m3152n(b, i4);
                    SpannableString spannableString = new SpannableString(" ");
                    spannableString.setSpan(new ImageSpan(b), 0, 1, 33);
                    notificationBadgeView.setBadgeText(spannableString);
                    return;
                }
                throw new IllegalArgumentException("Can't get drawable".toString());
            }

            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Icon)) {
                    return false;
                }
                Icon icon = (Icon) obj;
                return this.f39880d == icon.f39880d && this.f39881e == icon.f39881e && this.f39882f == icon.f39882f && this.f39883g == icon.f39883g;
            }

            public int hashCode() {
                return (((((this.f39880d * 31) + this.f39881e) * 31) + this.f39882f) * 31) + this.f39883g;
            }

            public String toString() {
                int i = this.f39880d;
                int i2 = this.f39881e;
                int i3 = this.f39882f;
                int i4 = this.f39883g;
                return "Icon(resId=" + i + ", width=" + i2 + ", height=" + i3 + ", iconTintColor=" + i4 + ")";
            }

            public void writeToParcel(Parcel parcel, int i) {
                C41536l.m120489i(parcel, "out");
                parcel.writeInt(this.f39880d);
                parcel.writeInt(this.f39881e);
                parcel.writeInt(this.f39882f);
                parcel.writeInt(this.f39883g);
            }

            public Icon(int i, int i2, int i3, int i4) {
                super((DefaultConstructorMarker) null);
                this.f39880d = i;
                this.f39881e = i2;
                this.f39882f = i3;
                this.f39883g = i4;
            }
        }

        /* renamed from: ge.bog.designsystem.components.notificationbadges.NotificationBadgeView$BadgeType$Number */
        public static final class Number extends BadgeType {
            public static final Parcelable.Creator<Number> CREATOR = new C13400a();

            /* renamed from: d */
            private final int f39884d;

            /* renamed from: ge.bog.designsystem.components.notificationbadges.NotificationBadgeView$BadgeType$Number$a */
            public static final class C13400a implements Parcelable.Creator {
                /* renamed from: a */
                public final Number createFromParcel(Parcel parcel) {
                    C41536l.m120489i(parcel, "parcel");
                    return new Number(parcel.readInt());
                }

                /* renamed from: b */
                public final Number[] newArray(int i) {
                    return new Number[i];
                }
            }

            public Number(int i) {
                super((DefaultConstructorMarker) null);
                this.f39884d = i;
            }

            /* renamed from: a */
            public void mo36224a(int i, NotificationBadgeView notificationBadgeView) {
                C41536l.m120489i(notificationBadgeView, "badge");
                int a = NotificationBadgeView.f39869k.m50364b(i);
                int i2 = this.f39884d;
                if (i2 <= a) {
                    notificationBadgeView.setBadgeText(String.valueOf(i2));
                    return;
                }
                notificationBadgeView.setBadgeText(a + "+");
            }

            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Number) && this.f39884d == ((Number) obj).f39884d;
            }

            public int hashCode() {
                return this.f39884d;
            }

            public String toString() {
                int i = this.f39884d;
                return "Number(number=" + i + ")";
            }

            public void writeToParcel(Parcel parcel, int i) {
                C41536l.m120489i(parcel, "out");
                parcel.writeInt(this.f39884d);
            }
        }

        private BadgeType() {
        }

        public /* synthetic */ BadgeType(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public abstract void mo36224a(int i, NotificationBadgeView notificationBadgeView);
    }

    /* renamed from: ge.bog.designsystem.components.notificationbadges.NotificationBadgeView$a */
    public static final class C13401a {
        private C13401a() {
        }

        public /* synthetic */ C13401a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public final int m50364b(int i) {
            return ((int) Math.pow(10.0d, ((double) i) - 1.0d)) - 1;
        }
    }

    /* renamed from: ge.bog.designsystem.components.notificationbadges.NotificationBadgeView$b */
    public static final class C13402b extends C41553c {

        /* renamed from: a */
        final /* synthetic */ NotificationBadgeView f39885a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13402b(Object obj, NotificationBadgeView notificationBadgeView) {
            super(obj);
            this.f39885a = notificationBadgeView;
        }

        /* access modifiers changed from: protected */
        public void afterChange(C40303i iVar, Object obj, Object obj2) {
            C41536l.m120489i(iVar, "property");
            BadgeType badgeType = (BadgeType) obj2;
            if (!C41536l.m120484d((BadgeType) obj, badgeType) && badgeType != null) {
                badgeType.mo36224a(this.f39885a.getMaxCharacterCount(), this.f39885a);
            }
        }
    }

    /* renamed from: ge.bog.designsystem.components.notificationbadges.NotificationBadgeView$c */
    public static final class C13403c extends C41553c {

        /* renamed from: a */
        final /* synthetic */ NotificationBadgeView f39886a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13403c(Object obj, NotificationBadgeView notificationBadgeView) {
            super(obj);
            this.f39886a = notificationBadgeView;
        }

        /* access modifiers changed from: protected */
        public void afterChange(C40303i iVar, Object obj, Object obj2) {
            C41536l.m120489i(iVar, "property");
            int intValue = ((Number) obj2).intValue();
            if (((Number) obj).intValue() != intValue) {
                boolean z = false;
                if (1 <= intValue && intValue < 4) {
                    z = true;
                }
                if (z) {
                    BadgeType badge = this.f39886a.getBadge();
                    if (badge != null) {
                        badge.mo36224a(intValue, this.f39886a);
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("Max character count must be between 1 and 3".toString());
            }
        }
    }

    /* renamed from: ge.bog.designsystem.components.notificationbadges.NotificationBadgeView$d */
    public static final class C13404d extends C41553c {

        /* renamed from: a */
        final /* synthetic */ NotificationBadgeView f39887a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13404d(Object obj, NotificationBadgeView notificationBadgeView) {
            super(obj);
            this.f39887a = notificationBadgeView;
        }

        /* access modifiers changed from: protected */
        public void afterChange(C40303i iVar, Object obj, Object obj2) {
            int i;
            C41536l.m120489i(iVar, "property");
            Integer num = (Integer) obj2;
            if (!C41536l.m120484d((Integer) obj, num)) {
                Drawable background = this.f39887a.getBackground();
                C41536l.m120487g(background, "null cannot be cast to non-null type android.graphics.drawable.LevelListDrawable");
                Drawable current = ((LevelListDrawable) background).getCurrent();
                C41536l.m120487g(current, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
                GradientDrawable gradientDrawable = (GradientDrawable) current;
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = this.f39887a.f39876h;
                }
                gradientDrawable.setColor(i);
            }
        }
    }

    /* renamed from: ge.bog.designsystem.components.notificationbadges.NotificationBadgeView$e */
    public static final class C13405e extends C41553c {

        /* renamed from: a */
        final /* synthetic */ NotificationBadgeView f39888a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13405e(Object obj, NotificationBadgeView notificationBadgeView) {
            super(obj);
            this.f39888a = notificationBadgeView;
        }

        /* access modifiers changed from: protected */
        public void afterChange(C40303i iVar, Object obj, Object obj2) {
            int i;
            C41536l.m120489i(iVar, "property");
            Integer num = (Integer) obj2;
            if (!C41536l.m120484d((Integer) obj, num)) {
                Drawable background = this.f39888a.getBackground();
                C41536l.m120487g(background, "null cannot be cast to non-null type android.graphics.drawable.LevelListDrawable");
                Drawable current = ((LevelListDrawable) background).getCurrent();
                C41536l.m120487g(current, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
                GradientDrawable gradientDrawable = (GradientDrawable) current;
                int h = NotificationBadgeView.f39871m;
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = this.f39888a.f39877i;
                }
                gradientDrawable.setStroke(h, i);
            }
        }
    }

    static {
        Class<NotificationBadgeView> cls = NotificationBadgeView.class;
        f39870l = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "badge", "getBadge()Lge/bog/designsystem/components/notificationbadges/NotificationBadgeView$BadgeType;", 0)), C41520a0.m120439e(new C41539o(cls, "maxCharacterCount", "getMaxCharacterCount()I", 0)), C41520a0.m120439e(new C41539o(cls, "badgeColor", "getBadgeColor()Ljava/lang/Integer;", 0)), C41520a0.m120439e(new C41539o(cls, "borderColor", "getBorderColor()Ljava/lang/Integer;", 0))};
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public NotificationBadgeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    private final LevelListDrawable getBadgeLevelDrawable() {
        Drawable background = getBackground();
        C41536l.m120487g(background, "null cannot be cast to non-null type android.graphics.drawable.LevelListDrawable");
        return (LevelListDrawable) background;
    }

    private final GradientDrawable getBadgeShapeDrawable() {
        Drawable background = getBackground();
        C41536l.m120487g(background, "null cannot be cast to non-null type android.graphics.drawable.LevelListDrawable");
        Drawable current = ((LevelListDrawable) background).getCurrent();
        C41536l.m120487g(current, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        return (GradientDrawable) current;
    }

    private final void setBadgeBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    /* access modifiers changed from: private */
    public final void setBadgeText(CharSequence charSequence) {
        int i;
        int i2;
        int i3;
        super.setText(charSequence, TextView.BufferType.NORMAL);
        Drawable background = getBackground();
        C41536l.m120487g(background, "null cannot be cast to non-null type android.graphics.drawable.LevelListDrawable");
        LevelListDrawable levelListDrawable = (LevelListDrawable) background;
        if (charSequence != null) {
            i = charSequence.length();
        } else {
            i = 0;
        }
        levelListDrawable.setLevel(i);
        Drawable background2 = getBackground();
        C41536l.m120487g(background2, "null cannot be cast to non-null type android.graphics.drawable.LevelListDrawable");
        Drawable current = ((LevelListDrawable) background2).getCurrent();
        C41536l.m120487g(current, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        GradientDrawable gradientDrawable = (GradientDrawable) current;
        Integer badgeColor = getBadgeColor();
        if (badgeColor != null) {
            i2 = badgeColor.intValue();
        } else {
            i2 = this.f39876h;
        }
        gradientDrawable.setColor(i2);
        int i4 = f39871m;
        Integer borderColor = getBorderColor();
        if (borderColor != null) {
            i3 = borderColor.intValue();
        } else {
            i3 = this.f39877i;
        }
        gradientDrawable.setStroke(i4, i3);
        gradientDrawable.setBounds(0, 0, gradientDrawable.getIntrinsicWidth(), gradientDrawable.getIntrinsicHeight());
        if (!C41536l.m120484d(this.f39878j, gradientDrawable.getBounds())) {
            this.f39878j.set(gradientDrawable.getBounds());
            requestLayout();
        }
    }

    public final BadgeType getBadge() {
        return (BadgeType) this.f39872d.getValue(this, f39870l[0]);
    }

    public final Integer getBadgeColor() {
        return (Integer) this.f39874f.getValue(this, f39870l[2]);
    }

    public final Integer getBorderColor() {
        return (Integer) this.f39875g.getValue(this, f39870l[3]);
    }

    public final int getMaxCharacterCount() {
        return ((Number) this.f39873e.getValue(this, f39870l[1])).intValue();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f39878j.width(), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f39878j.height(), 1073741824));
    }

    public void setBackground(Drawable drawable) {
    }

    public void setBackgroundColor(int i) {
    }

    public void setBackgroundDrawable(Drawable drawable) {
    }

    public void setBackgroundResource(int i) {
    }

    public final void setBadge(BadgeType badgeType) {
        this.f39872d.setValue(this, f39870l[0], badgeType);
    }

    public final void setBadgeColor(Integer num) {
        this.f39874f.setValue(this, f39870l[2], num);
    }

    public final void setBorderColor(Integer num) {
        this.f39875g.setValue(this, f39870l[3], num);
    }

    public final void setMaxCharacterCount(int i) {
        this.f39873e.setValue(this, f39870l[1], Integer.valueOf(i));
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NotificationBadgeView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: ge.bog.designsystem.components.notificationbadges.NotificationBadgeView$BadgeType$Icon} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v10, resolved type: ge.bog.designsystem.components.notificationbadges.NotificationBadgeView$BadgeType$Empty} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v15, resolved type: ge.bog.designsystem.components.notificationbadges.NotificationBadgeView$BadgeType$Number} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v16, resolved type: ge.bog.designsystem.components.notificationbadges.NotificationBadgeView$BadgeType$Icon} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: ge.bog.designsystem.components.notificationbadges.NotificationBadgeView$BadgeType$Icon} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v17, resolved type: ge.bog.designsystem.components.notificationbadges.NotificationBadgeView$BadgeType$Icon} */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public NotificationBadgeView(android.content.Context r9, android.util.AttributeSet r10, int r11) {
        /*
            r8 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.C41536l.m120489i(r9, r0)
            r8.<init>(r9, r10, r11)
            kotlin.properties.a r11 = kotlin.properties.C41551a.f97718a
            ge.bog.designsystem.components.notificationbadges.NotificationBadgeView$b r11 = new ge.bog.designsystem.components.notificationbadges.NotificationBadgeView$b
            r0 = 0
            r11.<init>(r0, r8)
            r8.f39872d = r11
            r11 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            ge.bog.designsystem.components.notificationbadges.NotificationBadgeView$c r1 = new ge.bog.designsystem.components.notificationbadges.NotificationBadgeView$c
            r1.<init>(r0, r8)
            r8.f39873e = r1
            ge.bog.designsystem.components.notificationbadges.NotificationBadgeView$d r1 = new ge.bog.designsystem.components.notificationbadges.NotificationBadgeView$d
            r1.<init>(r0, r8)
            r8.f39874f = r1
            ge.bog.designsystem.components.notificationbadges.NotificationBadgeView$e r1 = new ge.bog.designsystem.components.notificationbadges.NotificationBadgeView$e
            r1.<init>(r0, r8)
            r8.f39875g = r1
            int r0 = p601sg.C17778c.f49623b0
            int r0 = androidx.core.content.C0767a.m2893c(r9, r0)
            r8.f39876h = r0
            int r0 = p601sg.C17778c.f49632q
            int r0 = androidx.core.content.C0767a.m2893c(r9, r0)
            r8.f39877i = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r8.f39878j = r0
            int r0 = p601sg.C17780e.notification_badge_levels
            android.graphics.drawable.Drawable r0 = p045d.C5769a.m23210b(r9, r0)
            if (r0 == 0) goto L_0x00ef
            r8.setBadgeBackground(r0)
            int r0 = p601sg.C17786k.TextCaption2White500Left
            androidx.core.widget.C1314o.m4575q(r8, r0)
            r8.setIncludeFontPadding(r11)
            r0 = 17
            r8.setGravity(r0)
            int[] r0 = p601sg.C17787l.f50119S8
            java.lang.String r1 = "NotificationBadgeView"
            kotlin.jvm.internal.C41536l.m120488h(r0, r1)
            android.content.res.TypedArray r10 = r9.obtainStyledAttributes(r10, r0, r11, r11)
            java.lang.String r0 = "obtainStyledAttributes(set, attrs, defStyleAttr, defStyleRes)"
            kotlin.jvm.internal.C41536l.m120488h(r10, r0)
            int r0 = p601sg.C17787l.f50134T8
            int r1 = p601sg.C17778c.color_negative_solid_400
            int r1 = androidx.core.content.C0767a.m2893c(r9, r1)
            int r0 = r10.getColor(r0, r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.setBadgeColor(r0)
            int r0 = p601sg.C17787l.f50209Y8
            int r1 = p601sg.C17777b.f49595j
            int r9 = p642vh.C18368l.m62755d(r9, r1)
            int r9 = r10.getColor(r0, r9)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r8.setBorderColor(r9)
            int r9 = p601sg.C17787l.f50224Z8
            r0 = 3
            int r9 = r10.getInteger(r9, r0)
            r8.setMaxCharacterCount(r9)
            int r9 = p601sg.C17787l.f50194X8
            int r9 = r10.getInt(r9, r11)
            if (r9 == 0) goto L_0x00e6
            r0 = 1
            if (r9 == r0) goto L_0x00b7
            r0 = 2
            if (r9 != r0) goto L_0x00af
            ge.bog.designsystem.components.notificationbadges.NotificationBadgeView$BadgeType$Number r9 = new ge.bog.designsystem.components.notificationbadges.NotificationBadgeView$BadgeType$Number
            r9.<init>(r11)
            goto L_0x00e8
        L_0x00af:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Unknown badge type"
            r9.<init>(r10)
            throw r9
        L_0x00b7:
            int r9 = p601sg.C17787l.f50149U8
            int r2 = r10.getResourceId(r9, r11)
            if (r2 == 0) goto L_0x00c0
            r11 = r0
        L_0x00c0:
            if (r11 == 0) goto L_0x00da
            ge.bog.designsystem.components.notificationbadges.NotificationBadgeView$BadgeType$Icon r9 = new ge.bog.designsystem.components.notificationbadges.NotificationBadgeView$BadgeType$Icon
            int r11 = p601sg.C17787l.f50179W8
            r0 = -1
            int r3 = r10.getDimensionPixelSize(r11, r0)
            int r11 = p601sg.C17787l.f50164V8
            int r4 = r10.getDimensionPixelSize(r11, r0)
            r5 = 0
            r6 = 8
            r7 = 0
            r1 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7)
            goto L_0x00e8
        L_0x00da:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Badge icon required"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L_0x00e6:
            ge.bog.designsystem.components.notificationbadges.NotificationBadgeView$BadgeType$Empty r9 = p341ge.bog.designsystem.components.notificationbadges.NotificationBadgeView.BadgeType.Empty.f39879d
        L_0x00e8:
            r8.setBadge(r9)
            r10.recycle()
            return
        L_0x00ef:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Required value was null."
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.designsystem.components.notificationbadges.NotificationBadgeView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
