package p341ge.bog.designsystem.components.common;

import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.content.C0767a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p642vh.C18368l;

/* renamed from: ge.bog.designsystem.components.common.Color */
public abstract class Color implements Parcelable {

    /* renamed from: ge.bog.designsystem.components.common.Color$Attribute */
    public static final class Attribute extends Color {
        public static final Parcelable.Creator<Attribute> CREATOR = new C13249a();

        /* renamed from: d */
        private final int f39147d;

        /* renamed from: ge.bog.designsystem.components.common.Color$Attribute$a */
        public static final class C13249a implements Parcelable.Creator {
            /* renamed from: a */
            public final Attribute createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                return new Attribute(parcel.readInt());
            }

            /* renamed from: b */
            public final Attribute[] newArray(int i) {
                return new Attribute[i];
            }
        }

        public Attribute(int i) {
            super((DefaultConstructorMarker) null);
            this.f39147d = i;
        }

        /* renamed from: d */
        public final int mo35262d() {
            return this.f39147d;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Attribute) && this.f39147d == ((Attribute) obj).f39147d;
        }

        public int hashCode() {
            return this.f39147d;
        }

        public String toString() {
            int i = this.f39147d;
            return "Attribute(attr=" + i + ")";
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeInt(this.f39147d);
        }
    }

    /* renamed from: ge.bog.designsystem.components.common.Color$Raw */
    public static final class Raw extends Color {
        public static final Parcelable.Creator<Raw> CREATOR = new C13250a();

        /* renamed from: d */
        private final int f39148d;

        /* renamed from: ge.bog.designsystem.components.common.Color$Raw$a */
        public static final class C13250a implements Parcelable.Creator {
            /* renamed from: a */
            public final Raw createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                return new Raw(parcel.readInt());
            }

            /* renamed from: b */
            public final Raw[] newArray(int i) {
                return new Raw[i];
            }
        }

        public Raw(int i) {
            super((DefaultConstructorMarker) null);
            this.f39148d = i;
        }

        /* renamed from: d */
        public final int mo35272d() {
            return this.f39148d;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Raw) && this.f39148d == ((Raw) obj).f39148d;
        }

        public int hashCode() {
            return this.f39148d;
        }

        public String toString() {
            int i = this.f39148d;
            return "Raw(value=" + i + ")";
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeInt(this.f39148d);
        }
    }

    /* renamed from: ge.bog.designsystem.components.common.Color$Resource */
    public static final class Resource extends Color {
        public static final Parcelable.Creator<Resource> CREATOR = new C13251a();

        /* renamed from: d */
        private final int f39149d;

        /* renamed from: ge.bog.designsystem.components.common.Color$Resource$a */
        public static final class C13251a implements Parcelable.Creator {
            /* renamed from: a */
            public final Resource createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                return new Resource(parcel.readInt());
            }

            /* renamed from: b */
            public final Resource[] newArray(int i) {
                return new Resource[i];
            }
        }

        public Resource(int i) {
            super((DefaultConstructorMarker) null);
            this.f39149d = i;
        }

        /* renamed from: d */
        public final int mo35282d() {
            return this.f39149d;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Resource) && this.f39149d == ((Resource) obj).f39149d;
        }

        public int hashCode() {
            return this.f39149d;
        }

        public String toString() {
            int i = this.f39149d;
            return "Resource(resId=" + i + ")";
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeInt(this.f39149d);
        }
    }

    /* renamed from: ge.bog.designsystem.components.common.Color$StateList */
    public static final class StateList extends Color {
        public static final Parcelable.Creator<StateList> CREATOR = new C13252a();

        /* renamed from: d */
        private final ColorStateList f39150d;

        /* renamed from: ge.bog.designsystem.components.common.Color$StateList$a */
        public static final class C13252a implements Parcelable.Creator {
            /* renamed from: a */
            public final StateList createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                return new StateList((ColorStateList) parcel.readParcelable(StateList.class.getClassLoader()));
            }

            /* renamed from: b */
            public final StateList[] newArray(int i) {
                return new StateList[i];
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public StateList(ColorStateList colorStateList) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(colorStateList, "stateList");
            this.f39150d = colorStateList;
        }

        /* renamed from: d */
        public final ColorStateList mo35292d() {
            return this.f39150d;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StateList) && C41536l.m120484d(this.f39150d, ((StateList) obj).f39150d);
        }

        public int hashCode() {
            return this.f39150d.hashCode();
        }

        public String toString() {
            ColorStateList colorStateList = this.f39150d;
            return "StateList(stateList=" + colorStateList + ")";
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeParcelable(this.f39150d, i);
        }
    }

    private Color() {
    }

    public /* synthetic */ Color(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: a */
    public final int mo35260a(Context context) {
        C41536l.m120489i(context, "context");
        if (this instanceof Resource) {
            return C0767a.m2893c(context, ((Resource) this).mo35282d());
        }
        if (this instanceof Attribute) {
            return C18368l.m62755d(context, ((Attribute) this).mo35262d());
        }
        if (this instanceof Raw) {
            return ((Raw) this).mo35272d();
        }
        if (this instanceof StateList) {
            return ((StateList) this).mo35292d().getDefaultColor();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: b */
    public final ColorStateList mo35261b(Context context) {
        ColorStateList colorStateList;
        C41536l.m120489i(context, "context");
        ColorStateList valueOf = ColorStateList.valueOf(mo35260a(context));
        C41536l.m120488h(valueOf, "valueOf(getRawColor(context))");
        if (this instanceof StateList) {
            colorStateList = ((StateList) this).mo35292d();
        } else if (this instanceof Resource) {
            colorStateList = C0767a.m2894d(context, ((Resource) this).mo35282d());
        } else if (this instanceof Attribute) {
            colorStateList = C0767a.m2894d(context, C18368l.m62758g(context, ((Attribute) this).mo35262d()));
        } else if (this instanceof Raw) {
            colorStateList = valueOf;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        if (colorStateList == null) {
            return valueOf;
        }
        return colorStateList;
    }
}
