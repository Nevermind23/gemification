package p341ge.bog.designsystem.components.actioncard;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.common.Color;
import p341ge.bog.designsystem.components.notificationbadges.NotificationBadgeView;
import p341ge.bog.designsystem.components.statusbadge.StatusBadgeType;
import p506lj.C16578a;
import p506lj.C16580b;

/* renamed from: ge.bog.designsystem.components.actioncard.BadgeData */
public abstract class BadgeData implements Parcelable {

    /* renamed from: ge.bog.designsystem.components.actioncard.BadgeData$Notification */
    public static final class Notification extends BadgeData {
        public static final Parcelable.Creator<Notification> CREATOR = new C13152a();

        /* renamed from: d */
        private final NotificationBadgeView.BadgeType f38739d;

        /* renamed from: e */
        private final Color f38740e;

        /* renamed from: f */
        private final Color f38741f;

        /* renamed from: g */
        private final int f38742g;

        /* renamed from: ge.bog.designsystem.components.actioncard.BadgeData$Notification$a */
        public static final class C13152a implements Parcelable.Creator {
            /* renamed from: a */
            public final Notification createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                Class<Notification> cls = Notification.class;
                return new Notification((NotificationBadgeView.BadgeType) parcel.readParcelable(cls.getClassLoader()), (Color) parcel.readParcelable(cls.getClassLoader()), (Color) parcel.readParcelable(cls.getClassLoader()), parcel.readInt());
            }

            /* renamed from: b */
            public final Notification[] newArray(int i) {
                return new Notification[i];
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Notification(NotificationBadgeView.BadgeType badgeType, Color color, Color color2, int i) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(badgeType, "badgeType");
            this.f38739d = badgeType;
            this.f38740e = color;
            this.f38741f = color2;
            this.f38742g = i;
        }

        /* renamed from: a */
        public final Color mo34730a() {
            return this.f38741f;
        }

        /* renamed from: b */
        public final Color mo34731b() {
            return this.f38740e;
        }

        /* renamed from: d */
        public final int mo34732d() {
            return this.f38742g;
        }

        public int describeContents() {
            return 0;
        }

        /* renamed from: e */
        public final NotificationBadgeView.BadgeType mo34734e() {
            return this.f38739d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Notification)) {
                return false;
            }
            Notification notification = (Notification) obj;
            return C41536l.m120484d(this.f38739d, notification.f38739d) && C41536l.m120484d(this.f38740e, notification.f38740e) && C41536l.m120484d(this.f38741f, notification.f38741f) && this.f38742g == notification.f38742g;
        }

        public int hashCode() {
            int hashCode = this.f38739d.hashCode() * 31;
            Color color = this.f38740e;
            int i = 0;
            int hashCode2 = (hashCode + (color == null ? 0 : color.hashCode())) * 31;
            Color color2 = this.f38741f;
            if (color2 != null) {
                i = color2.hashCode();
            }
            return ((hashCode2 + i) * 31) + this.f38742g;
        }

        public String toString() {
            NotificationBadgeView.BadgeType badgeType = this.f38739d;
            Color color = this.f38740e;
            Color color2 = this.f38741f;
            int i = this.f38742g;
            return "Notification(badgeType=" + badgeType + ", badgeColor=" + color + ", badgeBorderColor=" + color2 + ", badgeMaxCharacterCount=" + i + ")";
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeParcelable(this.f38739d, i);
            parcel.writeParcelable(this.f38740e, i);
            parcel.writeParcelable(this.f38741f, i);
            parcel.writeInt(this.f38742g);
        }
    }

    /* renamed from: ge.bog.designsystem.components.actioncard.BadgeData$Status */
    public static final class Status extends BadgeData {
        public static final Parcelable.Creator<Status> CREATOR = new C13153a();

        /* renamed from: d */
        private final StatusBadgeType f38743d;

        /* renamed from: e */
        private final C16578a f38744e;

        /* renamed from: f */
        private final C16580b f38745f;

        /* renamed from: ge.bog.designsystem.components.actioncard.BadgeData$Status$a */
        public static final class C13153a implements Parcelable.Creator {
            /* renamed from: a */
            public final Status createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                return new Status((StatusBadgeType) parcel.readParcelable(Status.class.getClassLoader()), C16578a.valueOf(parcel.readString()), C16580b.valueOf(parcel.readString()));
            }

            /* renamed from: b */
            public final Status[] newArray(int i) {
                return new Status[i];
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Status(StatusBadgeType statusBadgeType, C16578a aVar, C16580b bVar) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(statusBadgeType, "statusBadgeType");
            C41536l.m120489i(aVar, "statusBadgeFill");
            C41536l.m120489i(bVar, "statusBadgeSize");
            this.f38743d = statusBadgeType;
            this.f38744e = aVar;
            this.f38745f = bVar;
        }

        /* renamed from: a */
        public final C16578a mo34743a() {
            return this.f38744e;
        }

        /* renamed from: b */
        public final C16580b mo34744b() {
            return this.f38745f;
        }

        /* renamed from: d */
        public final StatusBadgeType mo34745d() {
            return this.f38743d;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Status)) {
                return false;
            }
            Status status = (Status) obj;
            return C41536l.m120484d(this.f38743d, status.f38743d) && this.f38744e == status.f38744e && this.f38745f == status.f38745f;
        }

        public int hashCode() {
            return (((this.f38743d.hashCode() * 31) + this.f38744e.hashCode()) * 31) + this.f38745f.hashCode();
        }

        public String toString() {
            StatusBadgeType statusBadgeType = this.f38743d;
            C16578a aVar = this.f38744e;
            C16580b bVar = this.f38745f;
            return "Status(statusBadgeType=" + statusBadgeType + ", statusBadgeFill=" + aVar + ", statusBadgeSize=" + bVar + ")";
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeParcelable(this.f38743d, i);
            parcel.writeString(this.f38744e.name());
            parcel.writeString(this.f38745f.name());
        }
    }

    /* renamed from: ge.bog.designsystem.components.actioncard.BadgeData$TextBadge */
    public static final class TextBadge extends BadgeData {
        public static final Parcelable.Creator<TextBadge> CREATOR = new C13154a();

        /* renamed from: d */
        public static final TextBadge f38746d = new TextBadge();

        /* renamed from: ge.bog.designsystem.components.actioncard.BadgeData$TextBadge$a */
        public static final class C13154a implements Parcelable.Creator {
            /* renamed from: a */
            public final TextBadge createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                parcel.readInt();
                return TextBadge.f38746d;
            }

            /* renamed from: b */
            public final TextBadge[] newArray(int i) {
                return new TextBadge[i];
            }
        }

        private TextBadge() {
            super((DefaultConstructorMarker) null);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeInt(1);
        }
    }

    private BadgeData() {
    }

    public /* synthetic */ BadgeData(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
