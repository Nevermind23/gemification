package p341ge.bog.mobilebank.shared;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ge.bog.mobilebank.shared.P2PFlowType */
public abstract class P2PFlowType implements Parcelable {

    /* renamed from: ge.bog.mobilebank.shared.P2PFlowType$P2PSend */
    public static final class P2PSend extends P2PFlowType {
        public static final Parcelable.Creator<P2PSend> CREATOR = new C34614a();

        /* renamed from: d */
        private final boolean f83646d;

        /* renamed from: ge.bog.mobilebank.shared.P2PFlowType$P2PSend$a */
        public static final class C34614a implements Parcelable.Creator {
            /* renamed from: a */
            public final P2PSend createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                return new P2PSend(parcel.readInt() != 0);
            }

            /* renamed from: b */
            public final P2PSend[] newArray(int i) {
                return new P2PSend[i];
            }
        }

        public P2PSend(boolean z) {
            super((DefaultConstructorMarker) null);
            this.f83646d = z;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeInt(this.f83646d ? 1 : 0);
        }
    }

    /* renamed from: ge.bog.mobilebank.shared.P2PFlowType$P2PTopUp */
    public static final class P2PTopUp extends P2PFlowType {
        public static final Parcelable.Creator<P2PTopUp> CREATOR = new C34615a();

        /* renamed from: d */
        private final String f83647d;

        /* renamed from: ge.bog.mobilebank.shared.P2PFlowType$P2PTopUp$a */
        public static final class C34615a implements Parcelable.Creator {
            /* renamed from: a */
            public final P2PTopUp createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                return new P2PTopUp(parcel.readString());
            }

            /* renamed from: b */
            public final P2PTopUp[] newArray(int i) {
                return new P2PTopUp[i];
            }
        }

        public P2PTopUp() {
            this((String) null, 1, (DefaultConstructorMarker) null);
        }

        /* renamed from: a */
        public final String mo84158a() {
            return this.f83647d;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeString(this.f83647d);
        }

        public P2PTopUp(String str) {
            super((DefaultConstructorMarker) null);
            this.f83647d = str;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ P2PTopUp(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    private P2PFlowType() {
    }

    public /* synthetic */ P2PFlowType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
