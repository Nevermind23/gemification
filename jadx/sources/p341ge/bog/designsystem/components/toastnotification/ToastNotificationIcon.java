package p341ge.bog.designsystem.components.toastnotification;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.statusbadge.StatusBadgeType;

/* renamed from: ge.bog.designsystem.components.toastnotification.ToastNotificationIcon */
public abstract class ToastNotificationIcon implements Parcelable {

    /* renamed from: ge.bog.designsystem.components.toastnotification.ToastNotificationIcon$Badge */
    public static final class Badge extends ToastNotificationIcon {
        public static final Parcelable.Creator<Badge> CREATOR = new C13560a();

        /* renamed from: d */
        private final StatusBadgeType f40530d;

        /* renamed from: ge.bog.designsystem.components.toastnotification.ToastNotificationIcon$Badge$a */
        public static final class C13560a implements Parcelable.Creator {
            /* renamed from: a */
            public final Badge createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                return new Badge((StatusBadgeType) parcel.readParcelable(Badge.class.getClassLoader()));
            }

            /* renamed from: b */
            public final Badge[] newArray(int i) {
                return new Badge[i];
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Badge(StatusBadgeType statusBadgeType) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(statusBadgeType, "statusBadgeType");
            this.f40530d = statusBadgeType;
        }

        /* renamed from: a */
        public final StatusBadgeType mo37077a() {
            return this.f40530d;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Badge) && C41536l.m120484d(this.f40530d, ((Badge) obj).f40530d);
        }

        public int hashCode() {
            return this.f40530d.hashCode();
        }

        public String toString() {
            StatusBadgeType statusBadgeType = this.f40530d;
            return "Badge(statusBadgeType=" + statusBadgeType + ")";
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeParcelable(this.f40530d, i);
        }
    }

    /* renamed from: ge.bog.designsystem.components.toastnotification.ToastNotificationIcon$Illustration */
    public static final class Illustration extends ToastNotificationIcon {
        public static final Parcelable.Creator<Illustration> CREATOR = new C13561a();

        /* renamed from: d */
        private final Image f40531d;

        /* renamed from: ge.bog.designsystem.components.toastnotification.ToastNotificationIcon$Illustration$a */
        public static final class C13561a implements Parcelable.Creator {
            /* renamed from: a */
            public final Illustration createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                return new Illustration((Image) parcel.readParcelable(Illustration.class.getClassLoader()));
            }

            /* renamed from: b */
            public final Illustration[] newArray(int i) {
                return new Illustration[i];
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Illustration(Image image) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(image, "image");
            this.f40531d = image;
        }

        /* renamed from: a */
        public final Image mo37087a() {
            return this.f40531d;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Illustration) && C41536l.m120484d(this.f40531d, ((Illustration) obj).f40531d);
        }

        public int hashCode() {
            return this.f40531d.hashCode();
        }

        public String toString() {
            Image image = this.f40531d;
            return "Illustration(image=" + image + ")";
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeParcelable(this.f40531d, i);
        }
    }

    private ToastNotificationIcon() {
    }

    public /* synthetic */ ToastNotificationIcon(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
