package p341ge.bog.designsystem.components.toastnotification;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.common.Color;
import p341ge.bog.designsystem.components.statusbadge.StatusBadgeType;
import p341ge.bog.designsystem.components.toastnotification.ToastNotificationIcon;
import p601sg.C17777b;
import p601sg.C17778c;
import p642vh.C18358g;

/* renamed from: ge.bog.designsystem.components.toastnotification.ToastNotificationAppearance */
public abstract class ToastNotificationAppearance implements Parcelable {

    /* renamed from: d */
    private final Color f40510d;

    /* renamed from: e */
    private final Color f40511e;

    /* renamed from: f */
    private final ToastNotificationIcon f40512f;

    /* renamed from: ge.bog.designsystem.components.toastnotification.ToastNotificationAppearance$Informative */
    public static final class Informative extends ToastNotificationAppearance {
        public static final Parcelable.Creator<Informative> CREATOR = new C13555a();

        /* renamed from: g */
        public static final Informative f40516g = new Informative();

        /* renamed from: ge.bog.designsystem.components.toastnotification.ToastNotificationAppearance$Informative$a */
        public static final class C13555a implements Parcelable.Creator {
            /* renamed from: a */
            public final Informative createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                parcel.readInt();
                return Informative.f40516g;
            }

            /* renamed from: b */
            public final Informative[] newArray(int i) {
                return new Informative[i];
            }
        }

        private Informative() {
            super(C18358g.m62729c(C17778c.f49628l), C18358g.m62729c(C17778c.color_information_tr_150), new ToastNotificationIcon.Badge(StatusBadgeType.Information.f40348l), (DefaultConstructorMarker) null);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeInt(1);
        }
    }

    /* renamed from: ge.bog.designsystem.components.toastnotification.ToastNotificationAppearance$Negative */
    public static final class Negative extends ToastNotificationAppearance {
        public static final Parcelable.Creator<Negative> CREATOR = new C13556a();

        /* renamed from: g */
        public static final Negative f40517g = new Negative();

        /* renamed from: ge.bog.designsystem.components.toastnotification.ToastNotificationAppearance$Negative$a */
        public static final class C13556a implements Parcelable.Creator {
            /* renamed from: a */
            public final Negative createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                parcel.readInt();
                return Negative.f40517g;
            }

            /* renamed from: b */
            public final Negative[] newArray(int i) {
                return new Negative[i];
            }
        }

        private Negative() {
            super(C18358g.m62729c(C17778c.f49640z), C18358g.m62729c(C17778c.f49606D), new ToastNotificationIcon.Badge(StatusBadgeType.Error.f40347l), (DefaultConstructorMarker) null);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeInt(1);
        }
    }

    /* renamed from: ge.bog.designsystem.components.toastnotification.ToastNotificationAppearance$Pending */
    public static final class Pending extends ToastNotificationAppearance {
        public static final Parcelable.Creator<Pending> CREATOR = new C13557a();

        /* renamed from: g */
        public static final Pending f40518g = new Pending();

        /* renamed from: ge.bog.designsystem.components.toastnotification.ToastNotificationAppearance$Pending$a */
        public static final class C13557a implements Parcelable.Creator {
            /* renamed from: a */
            public final Pending createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                parcel.readInt();
                return Pending.f40518g;
            }

            /* renamed from: b */
            public final Pending[] newArray(int i) {
                return new Pending[i];
            }
        }

        private Pending() {
            super(C18358g.m62729c(C17778c.color_pending_solid_25), C18358g.m62729c(C17778c.color_pending_tr_150), new ToastNotificationIcon.Badge(StatusBadgeType.Pending.f40355l), (DefaultConstructorMarker) null);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeInt(1);
        }
    }

    /* renamed from: ge.bog.designsystem.components.toastnotification.ToastNotificationAppearance$Positive */
    public static final class Positive extends ToastNotificationAppearance {
        public static final Parcelable.Creator<Positive> CREATOR = new C13558a();

        /* renamed from: g */
        public static final Positive f40519g = new Positive();

        /* renamed from: ge.bog.designsystem.components.toastnotification.ToastNotificationAppearance$Positive$a */
        public static final class C13558a implements Parcelable.Creator {
            /* renamed from: a */
            public final Positive createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                parcel.readInt();
                return Positive.f40519g;
            }

            /* renamed from: b */
            public final Positive[] newArray(int i) {
                return new Positive[i];
            }
        }

        private Positive() {
            super(C18358g.m62729c(C17778c.f49614P), C18358g.m62729c(C17778c.color_positive_tr_150), new ToastNotificationIcon.Badge(StatusBadgeType.Success.f40356l), (DefaultConstructorMarker) null);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeInt(1);
        }
    }

    public /* synthetic */ ToastNotificationAppearance(Color color, Color color2, ToastNotificationIcon toastNotificationIcon, DefaultConstructorMarker defaultConstructorMarker) {
        this(color, color2, toastNotificationIcon);
    }

    /* renamed from: a */
    public Color mo37022a() {
        return this.f40510d;
    }

    /* renamed from: b */
    public ToastNotificationIcon mo37023b() {
        return this.f40512f;
    }

    /* renamed from: d */
    public Color mo37024d() {
        return this.f40511e;
    }

    private ToastNotificationAppearance(Color color, Color color2, ToastNotificationIcon toastNotificationIcon) {
        this.f40510d = color;
        this.f40511e = color2;
        this.f40512f = toastNotificationIcon;
    }

    /* renamed from: ge.bog.designsystem.components.toastnotification.ToastNotificationAppearance$Custom */
    public static final class Custom extends ToastNotificationAppearance {
        public static final Parcelable.Creator<Custom> CREATOR = new C13554a();

        /* renamed from: g */
        private final ToastNotificationIcon f40513g;

        /* renamed from: h */
        private final Color f40514h;

        /* renamed from: i */
        private final Color f40515i;

        /* renamed from: ge.bog.designsystem.components.toastnotification.ToastNotificationAppearance$Custom$a */
        public static final class C13554a implements Parcelable.Creator {
            /* renamed from: a */
            public final Custom createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                Class<Custom> cls = Custom.class;
                return new Custom((ToastNotificationIcon) parcel.readParcelable(cls.getClassLoader()), (Color) parcel.readParcelable(cls.getClassLoader()), (Color) parcel.readParcelable(cls.getClassLoader()));
            }

            /* renamed from: b */
            public final Custom[] newArray(int i) {
                return new Custom[i];
            }
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Custom(ToastNotificationIcon toastNotificationIcon, Color color, Color color2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(toastNotificationIcon, (i & 2) != 0 ? C18358g.m62727a(C17777b.color_secondary_solid_25) : color, (i & 4) != 0 ? C18358g.m62727a(C17777b.color_secondary_tr_150) : color2);
        }

        /* renamed from: a */
        public Color mo37022a() {
            return this.f40514h;
        }

        /* renamed from: b */
        public ToastNotificationIcon mo37023b() {
            return this.f40513g;
        }

        /* renamed from: d */
        public Color mo37024d() {
            return this.f40515i;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Custom)) {
                return false;
            }
            Custom custom = (Custom) obj;
            return C41536l.m120484d(mo37023b(), custom.mo37023b()) && C41536l.m120484d(mo37022a(), custom.mo37022a()) && C41536l.m120484d(mo37024d(), custom.mo37024d());
        }

        public int hashCode() {
            return (((mo37023b().hashCode() * 31) + mo37022a().hashCode()) * 31) + mo37024d().hashCode();
        }

        public String toString() {
            ToastNotificationIcon b = mo37023b();
            Color a = mo37022a();
            Color d = mo37024d();
            return "Custom(icon=" + b + ", backgroundColor=" + a + ", strokeColor=" + d + ")";
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeParcelable(this.f40513g, i);
            parcel.writeParcelable(this.f40514h, i);
            parcel.writeParcelable(this.f40515i, i);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Custom(ToastNotificationIcon toastNotificationIcon, Color color, Color color2) {
            super(color, color2, toastNotificationIcon, (DefaultConstructorMarker) null);
            C41536l.m120489i(toastNotificationIcon, "icon");
            C41536l.m120489i(color, "backgroundColor");
            C41536l.m120489i(color2, "strokeColor");
            this.f40513g = toastNotificationIcon;
            this.f40514h = color;
            this.f40515i = color2;
        }
    }
}
