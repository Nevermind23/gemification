package p341ge.bog.designsystem.components.pagestate;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.mikephil.charting.utils.Utils;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.common.Color;
import p341ge.bog.designsystem.components.common.Image;
import p601sg.C17778c;
import p601sg.C17780e;
import p601sg.C17784i;
import p601sg.C17786k;
import p642vh.C18358g;

/* renamed from: ge.bog.designsystem.components.pagestate.PageStateType */
public abstract class PageStateType implements Parcelable {

    /* renamed from: ge.bog.designsystem.components.pagestate.PageStateType$Custom */
    public static final class Custom extends PageStateType {
        public static final Parcelable.Creator<Custom> CREATOR = new C13423a();

        /* renamed from: d */
        private final Image f39991d;

        /* renamed from: e */
        private final int f39992e;

        /* renamed from: f */
        private final Color f39993f;

        /* renamed from: g */
        private final Color f39994g;

        /* renamed from: ge.bog.designsystem.components.pagestate.PageStateType$Custom$a */
        public static final class C13423a implements Parcelable.Creator {
            /* renamed from: a */
            public final Custom createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                Class<Custom> cls = Custom.class;
                return new Custom((Image) parcel.readParcelable(cls.getClassLoader()), parcel.readInt(), (Color) parcel.readParcelable(cls.getClassLoader()), (Color) parcel.readParcelable(cls.getClassLoader()));
            }

            /* renamed from: b */
            public final Custom[] newArray(int i) {
                return new Custom[i];
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Custom(Image image, int i, Color color, Color color2) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(image, "image");
            C41536l.m120489i(color, "imageTintColor");
            C41536l.m120489i(color2, "imageBackgroundColor");
            this.f39991d = image;
            this.f39992e = i;
            this.f39993f = color;
            this.f39994g = color2;
        }

        /* renamed from: a */
        public Image mo36386a() {
            return this.f39991d;
        }

        /* renamed from: b */
        public Color mo36387b() {
            return this.f39994g;
        }

        /* renamed from: d */
        public Color mo36388d() {
            return this.f39993f;
        }

        public int describeContents() {
            return 0;
        }

        /* renamed from: e */
        public int mo36389e() {
            return this.f39992e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Custom)) {
                return false;
            }
            Custom custom = (Custom) obj;
            return C41536l.m120484d(mo36386a(), custom.mo36386a()) && mo36389e() == custom.mo36389e() && C41536l.m120484d(mo36388d(), custom.mo36388d()) && C41536l.m120484d(mo36387b(), custom.mo36387b());
        }

        public int hashCode() {
            return (((((mo36386a().hashCode() * 31) + mo36389e()) * 31) + mo36388d().hashCode()) * 31) + mo36387b().hashCode();
        }

        public String toString() {
            Image a = mo36386a();
            int e = mo36389e();
            Color d = mo36388d();
            Color b = mo36387b();
            return "Custom(image=" + a + ", styleRes=" + e + ", imageTintColor=" + d + ", imageBackgroundColor=" + b + ")";
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeParcelable(this.f39991d, i);
            parcel.writeInt(this.f39992e);
            parcel.writeParcelable(this.f39993f, i);
            parcel.writeParcelable(this.f39994g, i);
        }
    }

    /* renamed from: ge.bog.designsystem.components.pagestate.PageStateType$Error */
    public static class Error extends PageStateType {
        public static final Parcelable.Creator<Error> CREATOR = new C13425b();

        /* renamed from: h */
        public static final C13424a f39995h = new C13424a((DefaultConstructorMarker) null);

        /* renamed from: d */
        private final Image f39996d;

        /* renamed from: e */
        private final int f39997e;

        /* renamed from: f */
        private final Color f39998f;

        /* renamed from: g */
        private final Color f39999g;

        /* renamed from: ge.bog.designsystem.components.pagestate.PageStateType$Error$a */
        public static final class C13424a {
            private C13424a() {
            }

            public /* synthetic */ C13424a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* renamed from: ge.bog.designsystem.components.pagestate.PageStateType$Error$b */
        public static final class C13425b implements Parcelable.Creator {
            /* renamed from: a */
            public final Error createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                Class<Error> cls = Error.class;
                return new Error((Image) parcel.readParcelable(cls.getClassLoader()), parcel.readInt(), (Color) parcel.readParcelable(cls.getClassLoader()), (Color) parcel.readParcelable(cls.getClassLoader()));
            }

            /* renamed from: b */
            public final Error[] newArray(int i) {
                return new Error[i];
            }
        }

        public Error() {
            this((Image) null, 0, (Color) null, (Color) null, 15, (DefaultConstructorMarker) null);
        }

        /* renamed from: a */
        public Image mo36386a() {
            return this.f39996d;
        }

        /* renamed from: b */
        public Color mo36387b() {
            return this.f39999g;
        }

        /* renamed from: d */
        public Color mo36388d() {
            return this.f39998f;
        }

        public int describeContents() {
            return 0;
        }

        /* renamed from: e */
        public int mo36389e() {
            return this.f39997e;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeParcelable(this.f39996d, i);
            parcel.writeInt(this.f39997e);
            parcel.writeParcelable(this.f39998f, i);
            parcel.writeParcelable(this.f39999g, i);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Error(Image image, int i, Color color, Color color2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? new Image.Resource(C17780e.icons_24_system_error_fill, (Boolean) null, 2, (DefaultConstructorMarker) null) : image, (i2 & 2) != 0 ? C17786k.TextSubtitle2Negative500Left : i, (i2 & 4) != 0 ? C18358g.m62729c(C17778c.f49605C) : color, (i2 & 8) != 0 ? C18358g.m62729c(C17778c.f49607E) : color2);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Error(Image image, int i, Color color, Color color2) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(image, "image");
            C41536l.m120489i(color, "imageTintColor");
            C41536l.m120489i(color2, "imageBackgroundColor");
            this.f39996d = image;
            this.f39997e = i;
            this.f39998f = color;
            this.f39999g = color2;
        }
    }

    /* renamed from: ge.bog.designsystem.components.pagestate.PageStateType$Info */
    public static class Info extends PageStateType {
        public static final Parcelable.Creator<Info> CREATOR = new C13427b();

        /* renamed from: h */
        public static final C13426a f40000h = new C13426a((DefaultConstructorMarker) null);

        /* renamed from: d */
        private final Image f40001d;

        /* renamed from: e */
        private final int f40002e;

        /* renamed from: f */
        private final Color f40003f;

        /* renamed from: g */
        private final Color f40004g;

        /* renamed from: ge.bog.designsystem.components.pagestate.PageStateType$Info$a */
        public static final class C13426a {
            private C13426a() {
            }

            public /* synthetic */ C13426a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* renamed from: ge.bog.designsystem.components.pagestate.PageStateType$Info$b */
        public static final class C13427b implements Parcelable.Creator {
            /* renamed from: a */
            public final Info createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                Class<Info> cls = Info.class;
                return new Info((Image) parcel.readParcelable(cls.getClassLoader()), parcel.readInt(), (Color) parcel.readParcelable(cls.getClassLoader()), (Color) parcel.readParcelable(cls.getClassLoader()));
            }

            /* renamed from: b */
            public final Info[] newArray(int i) {
                return new Info[i];
            }
        }

        public Info() {
            this((Image) null, 0, (Color) null, (Color) null, 15, (DefaultConstructorMarker) null);
        }

        /* renamed from: a */
        public Image mo36386a() {
            return this.f40001d;
        }

        /* renamed from: b */
        public Color mo36387b() {
            return this.f40004g;
        }

        /* renamed from: d */
        public Color mo36388d() {
            return this.f40003f;
        }

        public int describeContents() {
            return 0;
        }

        /* renamed from: e */
        public int mo36389e() {
            return this.f40002e;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeParcelable(this.f40001d, i);
            parcel.writeInt(this.f40002e);
            parcel.writeParcelable(this.f40003f, i);
            parcel.writeParcelable(this.f40004g, i);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Info(Image image, int i, Color color, Color color2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? new Image.Resource(C17780e.f49652J, (Boolean) null, 2, (DefaultConstructorMarker) null) : image, (i2 & 2) != 0 ? C17786k.TextSubtitle2Information500Left : i, (i2 & 4) != 0 ? C18358g.m62729c(C17778c.f49630n) : color, (i2 & 8) != 0 ? C18358g.m62729c(C17778c.f49631p) : color2);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Info(Image image, int i, Color color, Color color2) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(image, "image");
            C41536l.m120489i(color, "imageTintColor");
            C41536l.m120489i(color2, "imageBackgroundColor");
            this.f40001d = image;
            this.f40002e = i;
            this.f40003f = color;
            this.f40004g = color2;
        }
    }

    /* renamed from: ge.bog.designsystem.components.pagestate.PageStateType$Success */
    public static class Success extends PageStateType {
        public static final Parcelable.Creator<Success> CREATOR = new C13429b();

        /* renamed from: h */
        public static final C13428a f40005h = new C13428a((DefaultConstructorMarker) null);

        /* renamed from: d */
        private final Image f40006d;

        /* renamed from: e */
        private final int f40007e;

        /* renamed from: f */
        private final Color f40008f;

        /* renamed from: g */
        private final Color f40009g;

        /* renamed from: ge.bog.designsystem.components.pagestate.PageStateType$Success$a */
        public static final class C13428a {
            private C13428a() {
            }

            public /* synthetic */ C13428a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* renamed from: ge.bog.designsystem.components.pagestate.PageStateType$Success$b */
        public static final class C13429b implements Parcelable.Creator {
            /* renamed from: a */
            public final Success createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                Class<Success> cls = Success.class;
                return new Success((Image) parcel.readParcelable(cls.getClassLoader()), parcel.readInt(), (Color) parcel.readParcelable(cls.getClassLoader()), (Color) parcel.readParcelable(cls.getClassLoader()));
            }

            /* renamed from: b */
            public final Success[] newArray(int i) {
                return new Success[i];
            }
        }

        public Success() {
            this((Image) null, 0, (Color) null, (Color) null, 15, (DefaultConstructorMarker) null);
        }

        /* renamed from: a */
        public Image mo36386a() {
            return this.f40006d;
        }

        /* renamed from: b */
        public Color mo36387b() {
            return this.f40009g;
        }

        /* renamed from: d */
        public Color mo36388d() {
            return this.f40008f;
        }

        public int describeContents() {
            return 0;
        }

        /* renamed from: e */
        public int mo36389e() {
            return this.f40007e;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeParcelable(this.f40006d, i);
            parcel.writeInt(this.f40007e);
            parcel.writeParcelable(this.f40008f, i);
            parcel.writeParcelable(this.f40009g, i);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Success(Image image, int i, Color color, Color color2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? new Image.Animation.Raw(C17784i.anim_success_check, new Image.Animation.AnimationConfig(0, (Integer) null, (Integer) null, Utils.FLOAT_EPSILON, 14, (DefaultConstructorMarker) null)) : image, (i2 & 2) != 0 ? C17786k.TextSubtitle2Positive500Left : i, (i2 & 4) != 0 ? C18358g.m62729c(C17778c.f49617S) : color, (i2 & 8) != 0 ? C18358g.m62729c(C17778c.f49618U) : color2);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Success(Image image, int i, Color color, Color color2) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(image, "image");
            C41536l.m120489i(color, "imageTintColor");
            C41536l.m120489i(color2, "imageBackgroundColor");
            this.f40006d = image;
            this.f40007e = i;
            this.f40008f = color;
            this.f40009g = color2;
        }
    }

    /* renamed from: ge.bog.designsystem.components.pagestate.PageStateType$Warning */
    public static class Warning extends PageStateType {
        public static final Parcelable.Creator<Warning> CREATOR = new C13431b();

        /* renamed from: h */
        public static final C13430a f40010h = new C13430a((DefaultConstructorMarker) null);

        /* renamed from: d */
        private final Image f40011d;

        /* renamed from: e */
        private final int f40012e;

        /* renamed from: f */
        private final Color f40013f;

        /* renamed from: g */
        private final Color f40014g;

        /* renamed from: ge.bog.designsystem.components.pagestate.PageStateType$Warning$a */
        public static final class C13430a {
            private C13430a() {
            }

            public /* synthetic */ C13430a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* renamed from: ge.bog.designsystem.components.pagestate.PageStateType$Warning$b */
        public static final class C13431b implements Parcelable.Creator {
            /* renamed from: a */
            public final Warning createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                Class<Warning> cls = Warning.class;
                return new Warning((Image) parcel.readParcelable(cls.getClassLoader()), parcel.readInt(), (Color) parcel.readParcelable(cls.getClassLoader()), (Color) parcel.readParcelable(cls.getClassLoader()));
            }

            /* renamed from: b */
            public final Warning[] newArray(int i) {
                return new Warning[i];
            }
        }

        public Warning() {
            this((Image) null, 0, (Color) null, (Color) null, 15, (DefaultConstructorMarker) null);
        }

        /* renamed from: a */
        public Image mo36386a() {
            return this.f40011d;
        }

        /* renamed from: b */
        public Color mo36387b() {
            return this.f40014g;
        }

        /* renamed from: d */
        public Color mo36388d() {
            return this.f40013f;
        }

        public int describeContents() {
            return 0;
        }

        /* renamed from: e */
        public int mo36389e() {
            return this.f40012e;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeParcelable(this.f40011d, i);
            parcel.writeInt(this.f40012e);
            parcel.writeParcelable(this.f40013f, i);
            parcel.writeParcelable(this.f40014g, i);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Warning(Image image, int i, Color color, Color color2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? new Image.Resource(C17780e.f49656O, (Boolean) null, 2, (DefaultConstructorMarker) null) : image, (i2 & 2) != 0 ? C17786k.TextSubtitle2Pending500Left : i, (i2 & 4) != 0 ? C18358g.m62729c(C17778c.f49611L) : color, (i2 & 8) != 0 ? C18358g.m62729c(C17778c.f49612N) : color2);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Warning(Image image, int i, Color color, Color color2) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(image, "image");
            C41536l.m120489i(color, "imageTintColor");
            C41536l.m120489i(color2, "imageBackgroundColor");
            this.f40011d = image;
            this.f40012e = i;
            this.f40013f = color;
            this.f40014g = color2;
        }
    }

    private PageStateType() {
    }

    public /* synthetic */ PageStateType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: a */
    public abstract Image mo36386a();

    /* renamed from: b */
    public abstract Color mo36387b();

    /* renamed from: d */
    public abstract Color mo36388d();

    /* renamed from: e */
    public abstract int mo36389e();
}
