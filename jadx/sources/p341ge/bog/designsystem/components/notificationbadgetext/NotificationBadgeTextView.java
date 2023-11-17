package p341ge.bog.designsystem.components.notificationbadgetext;

import af1.C40303i;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.C0767a;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.properties.C41551a;
import kotlin.properties.C41553c;
import kotlin.properties.C41555e;
import p341ge.bog.designsystem.components.common.Color;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.notificationbadges.NotificationBadgeView;
import p352ak.C9964m0;
import p601sg.C17778c;
import p601sg.C17779d;
import p601sg.C17787l;
import p642vh.C18355e0;
import ue1.C43064a;

/* renamed from: ge.bog.designsystem.components.notificationbadgetext.NotificationBadgeTextView */
public final class NotificationBadgeTextView extends LayerView {

    /* renamed from: g */
    static final /* synthetic */ C40303i[] f39889g;

    /* renamed from: d */
    private final C9964m0 f39890d;

    /* renamed from: e */
    private final C41555e f39891e;

    /* renamed from: f */
    private final C18355e0 f39892f;

    /* renamed from: ge.bog.designsystem.components.notificationbadgetext.NotificationBadgeTextView$b */
    public static final class C13407b extends C41553c {

        /* renamed from: a */
        final /* synthetic */ NotificationBadgeTextView f39899a;

        /* renamed from: b */
        final /* synthetic */ Context f39900b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13407b(Object obj, NotificationBadgeTextView notificationBadgeTextView, Context context) {
            super(obj);
            this.f39899a = notificationBadgeTextView;
            this.f39900b = context;
        }

        /* access modifiers changed from: protected */
        public void afterChange(C40303i iVar, Object obj, Object obj2) {
            Integer num;
            Integer num2;
            Color b;
            Color a;
            int i;
            int i2;
            int i3;
            C41536l.m120489i(iVar, "property");
            C13406a aVar = (C13406a) obj2;
            if (!C41536l.m120484d((C13406a) obj, aVar)) {
                Integer num3 = null;
                if (aVar != null) {
                    num = Integer.valueOf(aVar.mo36258d());
                } else {
                    num = null;
                }
                if (num != null) {
                    NotificationBadgeView a2 = this.f39899a.getNotificationBadge();
                    int d = aVar.mo36258d();
                    Integer f = aVar.mo36261f();
                    if (f != null) {
                        i = f.intValue();
                    } else {
                        i = this.f39899a.getResources().getDimensionPixelSize(C17779d.notification_badge_text_icon_size);
                    }
                    Integer c = aVar.mo36257c();
                    if (c != null) {
                        i2 = c.intValue();
                    } else {
                        i2 = this.f39899a.getResources().getDimensionPixelSize(C17779d.notification_badge_text_icon_size);
                    }
                    Color e = aVar.mo36259e();
                    if (e != null) {
                        i3 = e.mo35260a(this.f39900b);
                    } else {
                        i3 = -1;
                    }
                    a2.setBadge(new NotificationBadgeView.BadgeType.Icon(d, i, i2, i3));
                }
                NotificationBadgeView a3 = this.f39899a.getNotificationBadge();
                if (aVar == null || (a = aVar.mo36255a()) == null) {
                    num2 = null;
                } else {
                    num2 = Integer.valueOf(a.mo35260a(this.f39900b));
                }
                a3.setBadgeColor(num2);
                NotificationBadgeView a4 = this.f39899a.getNotificationBadge();
                if (!(aVar == null || (b = aVar.mo36256b()) == null)) {
                    num3 = Integer.valueOf(b.mo35260a(this.f39900b));
                }
                a4.setBorderColor(num3);
            }
        }
    }

    static {
        Class<NotificationBadgeTextView> cls = NotificationBadgeTextView.class;
        f39889g = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "iconProperties", "getIconProperties()Lge/bog/designsystem/components/notificationbadgetext/NotificationBadgeTextView$BadgeIconProperties;", 0)), C41520a0.m120439e(new C41539o(cls, "text", "getText()Ljava/lang/CharSequence;", 0))};
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public NotificationBadgeTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    /* access modifiers changed from: private */
    public final NotificationBadgeView getNotificationBadge() {
        NotificationBadgeView notificationBadgeView = this.f39890d.f27261e;
        C41536l.m120488h(notificationBadgeView, "binding.badgeView");
        return notificationBadgeView;
    }

    public final C13406a getIconProperties() {
        return (C13406a) this.f39891e.getValue(this, f39889g[0]);
    }

    public final CharSequence getText() {
        return this.f39892f.getValue(this, f39889g[1]);
    }

    public final int getTextColor() {
        return this.f39890d.f27262f.getCurrentTextColor();
    }

    public final void setIconProperties(C13406a aVar) {
        this.f39891e.setValue(this, f39889g[0], aVar);
    }

    public final void setText(CharSequence charSequence) {
        this.f39892f.setValue(this, f39889g[1], charSequence);
    }

    public final void setTextColor(int i) {
        this.f39890d.f27262f.setTextColor(i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NotificationBadgeTextView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NotificationBadgeTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C41536l.m120489i(context, "context");
        C9964m0 d = C9964m0.m36547d(LayoutInflater.from(context), this, true);
        C41536l.m120488h(d, "inflate(\n        LayoutI…ontext), this, true\n    )");
        this.f39890d = d;
        C41551a aVar = C41551a.f97718a;
        this.f39891e = new C13407b((Object) null, this, context);
        AppCompatTextView appCompatTextView = d.f27262f;
        C41536l.m120488h(appCompatTextView, "binding.text");
        this.f39892f = new C18355e0(appCompatTextView, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        int[] iArr = C17787l.f50074P8;
        C41536l.m120488h(iArr, "NotificationBadgeTextView");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        C41536l.m120488h(obtainStyledAttributes, "obtainStyledAttributes(set, attrs, defStyleAttr, defStyleRes)");
        setText(obtainStyledAttributes.getString(C17787l.f50089Q8));
        setTextColor(obtainStyledAttributes.getColor(C17787l.f50104R8, C0767a.m2893c(context, C17778c.f49634s)));
        obtainStyledAttributes.recycle();
    }

    /* renamed from: ge.bog.designsystem.components.notificationbadgetext.NotificationBadgeTextView$a */
    public static final class C13406a {

        /* renamed from: a */
        private final int f39893a;

        /* renamed from: b */
        private final Color f39894b;

        /* renamed from: c */
        private final Integer f39895c;

        /* renamed from: d */
        private final Integer f39896d;

        /* renamed from: e */
        private final Color f39897e;

        /* renamed from: f */
        private final Color f39898f;

        public C13406a(int i, Color color, Integer num, Integer num2, Color color2, Color color3) {
            this.f39893a = i;
            this.f39894b = color;
            this.f39895c = num;
            this.f39896d = num2;
            this.f39897e = color2;
            this.f39898f = color3;
        }

        /* renamed from: a */
        public final Color mo36255a() {
            return this.f39897e;
        }

        /* renamed from: b */
        public final Color mo36256b() {
            return this.f39898f;
        }

        /* renamed from: c */
        public final Integer mo36257c() {
            return this.f39896d;
        }

        /* renamed from: d */
        public final int mo36258d() {
            return this.f39893a;
        }

        /* renamed from: e */
        public final Color mo36259e() {
            return this.f39894b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13406a)) {
                return false;
            }
            C13406a aVar = (C13406a) obj;
            return this.f39893a == aVar.f39893a && C41536l.m120484d(this.f39894b, aVar.f39894b) && C41536l.m120484d(this.f39895c, aVar.f39895c) && C41536l.m120484d(this.f39896d, aVar.f39896d) && C41536l.m120484d(this.f39897e, aVar.f39897e) && C41536l.m120484d(this.f39898f, aVar.f39898f);
        }

        /* renamed from: f */
        public final Integer mo36261f() {
            return this.f39895c;
        }

        public int hashCode() {
            int i = this.f39893a * 31;
            Color color = this.f39894b;
            int i2 = 0;
            int hashCode = (i + (color == null ? 0 : color.hashCode())) * 31;
            Integer num = this.f39895c;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.f39896d;
            int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Color color2 = this.f39897e;
            int hashCode4 = (hashCode3 + (color2 == null ? 0 : color2.hashCode())) * 31;
            Color color3 = this.f39898f;
            if (color3 != null) {
                i2 = color3.hashCode();
            }
            return hashCode4 + i2;
        }

        public String toString() {
            int i = this.f39893a;
            Color color = this.f39894b;
            Integer num = this.f39895c;
            Integer num2 = this.f39896d;
            Color color2 = this.f39897e;
            Color color3 = this.f39898f;
            return "BadgeIconProperties(iconResId=" + i + ", iconTintColor=" + color + ", width=" + num + ", height=" + num2 + ", backgroundColor=" + color2 + ", borderColor=" + color3 + ")";
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ C13406a(int r7, p341ge.bog.designsystem.components.common.Color r8, java.lang.Integer r9, java.lang.Integer r10, p341ge.bog.designsystem.components.common.Color r11, p341ge.bog.designsystem.components.common.Color r12, int r13, kotlin.jvm.internal.DefaultConstructorMarker r14) {
            /*
                r6 = this;
                r0 = r13 & 2
                r1 = 0
                if (r0 == 0) goto L_0x0007
                r0 = r1
                goto L_0x0008
            L_0x0007:
                r0 = r8
            L_0x0008:
                r2 = r13 & 4
                if (r2 == 0) goto L_0x000e
                r2 = r1
                goto L_0x000f
            L_0x000e:
                r2 = r9
            L_0x000f:
                r3 = r13 & 8
                if (r3 == 0) goto L_0x0015
                r3 = r1
                goto L_0x0016
            L_0x0015:
                r3 = r10
            L_0x0016:
                r4 = r13 & 16
                if (r4 == 0) goto L_0x001c
                r4 = r1
                goto L_0x001d
            L_0x001c:
                r4 = r11
            L_0x001d:
                r5 = r13 & 32
                if (r5 == 0) goto L_0x0022
                goto L_0x0023
            L_0x0022:
                r1 = r12
            L_0x0023:
                r8 = r6
                r9 = r7
                r10 = r0
                r11 = r2
                r12 = r3
                r13 = r4
                r14 = r1
                r8.<init>(r9, r10, r11, r12, r13, r14)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.designsystem.components.notificationbadgetext.NotificationBadgeTextView.C13406a.<init>(int, ge.bog.designsystem.components.common.Color, java.lang.Integer, java.lang.Integer, ge.bog.designsystem.components.common.Color, ge.bog.designsystem.components.common.Color, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }
}
