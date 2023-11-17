package p341ge.bog.designsystem.components.statusbadge;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.common.Color;
import p341ge.bog.designsystem.components.common.Image;
import p601sg.C17777b;
import p601sg.C17778c;
import p601sg.C17780e;
import p642vh.C18358g;

/* renamed from: ge.bog.designsystem.components.statusbadge.StatusBadgeType */
public abstract class StatusBadgeType implements Parcelable {

    /* renamed from: k */
    public static final C13519a f40334k = new C13519a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final Image f40335d;

    /* renamed from: e */
    private final Color f40336e;

    /* renamed from: f */
    private final Color f40337f;

    /* renamed from: g */
    private final Color f40338g;

    /* renamed from: h */
    private final Color f40339h;

    /* renamed from: i */
    private final Integer f40340i;

    /* renamed from: j */
    private final int f40341j;

    /* renamed from: ge.bog.designsystem.components.statusbadge.StatusBadgeType$Custom */
    public static final class Custom extends StatusBadgeType {
        public static final Parcelable.Creator<Custom> CREATOR = new C13512a();

        /* renamed from: l */
        private final Image f40342l;

        /* renamed from: m */
        private final Color f40343m;

        /* renamed from: n */
        private final Color f40344n;

        /* renamed from: o */
        private final Color f40345o;

        /* renamed from: p */
        private final Color f40346p;

        /* renamed from: ge.bog.designsystem.components.statusbadge.StatusBadgeType$Custom$a */
        public static final class C13512a implements Parcelable.Creator {
            /* renamed from: a */
            public final Custom createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                Class<Custom> cls = Custom.class;
                return new Custom((Image) parcel.readParcelable(cls.getClassLoader()), (Color) parcel.readParcelable(cls.getClassLoader()), (Color) parcel.readParcelable(cls.getClassLoader()), (Color) parcel.readParcelable(cls.getClassLoader()), (Color) parcel.readParcelable(cls.getClassLoader()));
            }

            /* renamed from: b */
            public final Custom[] newArray(int i) {
                return new Custom[i];
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Custom(Image image, Color color, Color color2, Color color3, Color color4) {
            super(image, color, color2, color3, color4, (Integer) null, 0, 96, (DefaultConstructorMarker) null);
            Color color5 = color;
            Color color6 = color2;
            Color color7 = color3;
            Color color8 = color4;
            C41536l.m120489i(color5, "stateIconColor");
            C41536l.m120489i(color6, "backgroundColor");
            C41536l.m120489i(color7, "stateIconSolidColor");
            C41536l.m120489i(color8, "backgroundSolidColor");
            this.f40342l = image;
            this.f40343m = color5;
            this.f40344n = color6;
            this.f40345o = color7;
            this.f40346p = color8;
        }

        /* renamed from: b */
        public Color mo36732b() {
            return this.f40344n;
        }

        /* renamed from: d */
        public Color mo36733d() {
            return this.f40346p;
        }

        public int describeContents() {
            return 0;
        }

        /* renamed from: e */
        public Image mo36734e() {
            return this.f40342l;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Custom)) {
                return false;
            }
            Custom custom = (Custom) obj;
            return C41536l.m120484d(mo36734e(), custom.mo36734e()) && C41536l.m120484d(mo36735f(), custom.mo36735f()) && C41536l.m120484d(mo36732b(), custom.mo36732b()) && C41536l.m120484d(mo36736g(), custom.mo36736g()) && C41536l.m120484d(mo36733d(), custom.mo36733d());
        }

        /* renamed from: f */
        public Color mo36735f() {
            return this.f40343m;
        }

        /* renamed from: g */
        public Color mo36736g() {
            return this.f40345o;
        }

        public int hashCode() {
            return ((((((((mo36734e() == null ? 0 : mo36734e().hashCode()) * 31) + mo36735f().hashCode()) * 31) + mo36732b().hashCode()) * 31) + mo36736g().hashCode()) * 31) + mo36733d().hashCode();
        }

        public String toString() {
            Image e = mo36734e();
            Color f = mo36735f();
            Color b = mo36732b();
            Color g = mo36736g();
            Color d = mo36733d();
            return "Custom(stateIcon=" + e + ", stateIconColor=" + f + ", backgroundColor=" + b + ", stateIconSolidColor=" + g + ", backgroundSolidColor=" + d + ")";
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeParcelable(this.f40342l, i);
            parcel.writeParcelable(this.f40343m, i);
            parcel.writeParcelable(this.f40344n, i);
            parcel.writeParcelable(this.f40345o, i);
            parcel.writeParcelable(this.f40346p, i);
        }
    }

    /* renamed from: ge.bog.designsystem.components.statusbadge.StatusBadgeType$Error */
    public static final class Error extends StatusBadgeType {
        public static final Parcelable.Creator<Error> CREATOR = new C13513a();

        /* renamed from: l */
        public static final Error f40347l = new Error();

        /* renamed from: ge.bog.designsystem.components.statusbadge.StatusBadgeType$Error$a */
        public static final class C13513a implements Parcelable.Creator {
            /* renamed from: a */
            public final Error createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                parcel.readInt();
                return Error.f40347l;
            }

            /* renamed from: b */
            public final Error[] newArray(int i) {
                return new Error[i];
            }
        }

        private Error() {
            super(new Image.Resource(C17780e.f49649D, (Boolean) null, 2, (DefaultConstructorMarker) null), C18358g.m62729c(C17778c.f49605C), C18358g.m62729c(C17778c.f49607E), (Color) null, (Color) null, (Integer) null, 3, 56, (DefaultConstructorMarker) null);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeInt(1);
        }
    }

    /* renamed from: ge.bog.designsystem.components.statusbadge.StatusBadgeType$Information */
    public static final class Information extends StatusBadgeType {
        public static final Parcelable.Creator<Information> CREATOR = new C13514a();

        /* renamed from: l */
        public static final Information f40348l = new Information();

        /* renamed from: ge.bog.designsystem.components.statusbadge.StatusBadgeType$Information$a */
        public static final class C13514a implements Parcelable.Creator {
            /* renamed from: a */
            public final Information createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                parcel.readInt();
                return Information.f40348l;
            }

            /* renamed from: b */
            public final Information[] newArray(int i) {
                return new Information[i];
            }
        }

        private Information() {
            super(new Image.Resource(C17780e.f49671x, (Boolean) null, 2, (DefaultConstructorMarker) null), C18358g.m62729c(C17778c.f49630n), C18358g.m62729c(C17778c.f49631p), (Color) null, (Color) null, (Integer) null, 2, 56, (DefaultConstructorMarker) null);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeInt(1);
        }
    }

    /* renamed from: ge.bog.designsystem.components.statusbadge.StatusBadgeType$Loading */
    public static final class Loading extends StatusBadgeType {
        public static final Parcelable.Creator<Loading> CREATOR = new C13515a();

        /* renamed from: l */
        public static final Loading f40349l = new Loading();

        /* renamed from: ge.bog.designsystem.components.statusbadge.StatusBadgeType$Loading$a */
        public static final class C13515a implements Parcelable.Creator {
            /* renamed from: a */
            public final Loading createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                parcel.readInt();
                return Loading.f40349l;
            }

            /* renamed from: b */
            public final Loading[] newArray(int i) {
                return new Loading[i];
            }
        }

        private Loading() {
            super((Image) null, C18358g.m62727a(C17777b.f49603w), C18358g.m62727a(C17777b.f49604x), (Color) null, (Color) null, (Integer) null, 4, 56, (DefaultConstructorMarker) null);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeInt(1);
        }
    }

    /* renamed from: ge.bog.designsystem.components.statusbadge.StatusBadgeType$Number */
    public static final class Number extends StatusBadgeType {
        public static final Parcelable.Creator<Number> CREATOR = new C13516a();

        /* renamed from: l */
        private final int f40350l;

        /* renamed from: m */
        private final Color f40351m;

        /* renamed from: n */
        private final Color f40352n;

        /* renamed from: o */
        private final Color f40353o;

        /* renamed from: p */
        private final Color f40354p;

        /* renamed from: ge.bog.designsystem.components.statusbadge.StatusBadgeType$Number$a */
        public static final class C13516a implements Parcelable.Creator {
            /* renamed from: a */
            public final Number createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                Class<Number> cls = Number.class;
                return new Number(parcel.readInt(), (Color) parcel.readParcelable(cls.getClassLoader()), (Color) parcel.readParcelable(cls.getClassLoader()), (Color) parcel.readParcelable(cls.getClassLoader()), (Color) parcel.readParcelable(cls.getClassLoader()));
            }

            /* renamed from: b */
            public final Number[] newArray(int i) {
                return new Number[i];
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Number(int i, Color color, Color color2, Color color3, Color color4) {
            super((Image) null, color, color2, color3, color4, Integer.valueOf(i), 0, 64, (DefaultConstructorMarker) null);
            Color color5 = color;
            Color color6 = color2;
            Color color7 = color3;
            Color color8 = color4;
            C41536l.m120489i(color5, "stateIconColor");
            C41536l.m120489i(color6, "backgroundColor");
            C41536l.m120489i(color7, "stateIconSolidColor");
            C41536l.m120489i(color8, "backgroundSolidColor");
            this.f40350l = i;
            this.f40351m = color5;
            this.f40352n = color6;
            this.f40353o = color7;
            this.f40354p = color8;
        }

        /* renamed from: b */
        public Color mo36732b() {
            return this.f40352n;
        }

        /* renamed from: d */
        public Color mo36733d() {
            return this.f40354p;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Number)) {
                return false;
            }
            Number number = (Number) obj;
            return mo36766h().intValue() == number.mo36766h().intValue() && C41536l.m120484d(mo36735f(), number.mo36735f()) && C41536l.m120484d(mo36732b(), number.mo36732b()) && C41536l.m120484d(mo36736g(), number.mo36736g()) && C41536l.m120484d(mo36733d(), number.mo36733d());
        }

        /* renamed from: f */
        public Color mo36735f() {
            return this.f40351m;
        }

        /* renamed from: g */
        public Color mo36736g() {
            return this.f40353o;
        }

        /* renamed from: h */
        public Integer mo36766h() {
            return Integer.valueOf(this.f40350l);
        }

        public int hashCode() {
            return (((((((mo36766h().hashCode() * 31) + mo36735f().hashCode()) * 31) + mo36732b().hashCode()) * 31) + mo36736g().hashCode()) * 31) + mo36733d().hashCode();
        }

        public String toString() {
            Integer h = mo36766h();
            Color f = mo36735f();
            Color b = mo36732b();
            Color g = mo36736g();
            Color d = mo36733d();
            return "Number(stateNumber=" + h + ", stateIconColor=" + f + ", backgroundColor=" + b + ", stateIconSolidColor=" + g + ", backgroundSolidColor=" + d + ")";
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeInt(this.f40350l);
            parcel.writeParcelable(this.f40351m, i);
            parcel.writeParcelable(this.f40352n, i);
            parcel.writeParcelable(this.f40353o, i);
            parcel.writeParcelable(this.f40354p, i);
        }
    }

    /* renamed from: ge.bog.designsystem.components.statusbadge.StatusBadgeType$Pending */
    public static final class Pending extends StatusBadgeType {
        public static final Parcelable.Creator<Pending> CREATOR = new C13517a();

        /* renamed from: l */
        public static final Pending f40355l = new Pending();

        /* renamed from: ge.bog.designsystem.components.statusbadge.StatusBadgeType$Pending$a */
        public static final class C13517a implements Parcelable.Creator {
            /* renamed from: a */
            public final Pending createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                parcel.readInt();
                return Pending.f40355l;
            }

            /* renamed from: b */
            public final Pending[] newArray(int i) {
                return new Pending[i];
            }
        }

        private Pending() {
            super(new Image.Resource(C17780e.icons_24_system_timer_fill, (Boolean) null, 2, (DefaultConstructorMarker) null), C18358g.m62729c(C17778c.f49611L), C18358g.m62729c(C17778c.f49612N), C18358g.m62729c(C17778c.color_black_solid_300), (Color) null, (Integer) null, 5, 48, (DefaultConstructorMarker) null);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeInt(1);
        }
    }

    /* renamed from: ge.bog.designsystem.components.statusbadge.StatusBadgeType$Success */
    public static final class Success extends StatusBadgeType {
        public static final Parcelable.Creator<Success> CREATOR = new C13518a();

        /* renamed from: l */
        public static final Success f40356l = new Success();

        /* renamed from: ge.bog.designsystem.components.statusbadge.StatusBadgeType$Success$a */
        public static final class C13518a implements Parcelable.Creator {
            /* renamed from: a */
            public final Success createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                parcel.readInt();
                return Success.f40356l;
            }

            /* renamed from: b */
            public final Success[] newArray(int i) {
                return new Success[i];
            }
        }

        private Success() {
            super(new Image.Resource(C17780e.f49647B, (Boolean) null, 2, (DefaultConstructorMarker) null), C18358g.m62729c(C17778c.f49617S), C18358g.m62729c(C17778c.f49618U), (Color) null, (Color) null, (Integer) null, 1, 56, (DefaultConstructorMarker) null);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeInt(1);
        }
    }

    /* renamed from: ge.bog.designsystem.components.statusbadge.StatusBadgeType$a */
    public static final class C13519a {
        private C13519a() {
        }

        public /* synthetic */ C13519a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final StatusBadgeType[] mo36786a() {
            return new StatusBadgeType[]{Success.f40356l, Information.f40348l, Error.f40347l, Loading.f40349l, Pending.f40355l};
        }
    }

    public /* synthetic */ StatusBadgeType(Image image, Color color, Color color2, Color color3, Color color4, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(image, color, color2, color3, color4, num, i);
    }

    /* renamed from: a */
    public int mo36731a() {
        return this.f40341j;
    }

    /* renamed from: b */
    public Color mo36732b() {
        return this.f40337f;
    }

    /* renamed from: d */
    public Color mo36733d() {
        return this.f40339h;
    }

    /* renamed from: e */
    public Image mo36734e() {
        return this.f40335d;
    }

    /* renamed from: f */
    public Color mo36735f() {
        return this.f40336e;
    }

    /* renamed from: g */
    public Color mo36736g() {
        return this.f40338g;
    }

    private StatusBadgeType(Image image, Color color, Color color2, Color color3, Color color4, Integer num, int i) {
        this.f40335d = image;
        this.f40336e = color;
        this.f40337f = color2;
        this.f40338g = color3;
        this.f40339h = color4;
        this.f40340i = num;
        this.f40341j = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StatusBadgeType(Image image, Color color, Color color2, Color color3, Color color4, Integer num, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(image, color, color2, (i2 & 8) != 0 ? C18358g.m62729c(C17778c.f49623b0) : color3, (i2 & 16) != 0 ? color : color4, (i2 & 32) != 0 ? null : num, (i2 & 64) != 0 ? -1 : i, (DefaultConstructorMarker) null);
    }
}
