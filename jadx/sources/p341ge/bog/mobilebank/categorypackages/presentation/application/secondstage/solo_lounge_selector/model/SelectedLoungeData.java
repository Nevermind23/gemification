package p341ge.bog.mobilebank.categorypackages.presentation.application.secondstage.solo_lounge_selector.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.secondstage.solo_lounge_selector.model.SelectedLoungeData */
public final class SelectedLoungeData implements Parcelable {
    public static final Parcelable.Creator<SelectedLoungeData> CREATOR = new C14565a();

    /* renamed from: d */
    private Long f42431d;

    /* renamed from: e */
    private Long f42432e;

    /* renamed from: f */
    private SoloLoungeItem f42433f;

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.secondstage.solo_lounge_selector.model.SelectedLoungeData$a */
    public static final class C14565a implements Parcelable.Creator {
        /* renamed from: a */
        public final SelectedLoungeData createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            SoloLoungeItem soloLoungeItem = null;
            Long valueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long valueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            if (parcel.readInt() != 0) {
                soloLoungeItem = SoloLoungeItem.CREATOR.createFromParcel(parcel);
            }
            return new SelectedLoungeData(valueOf, valueOf2, soloLoungeItem);
        }

        /* renamed from: b */
        public final SelectedLoungeData[] newArray(int i) {
            return new SelectedLoungeData[i];
        }
    }

    public SelectedLoungeData() {
        this((Long) null, (Long) null, (SoloLoungeItem) null, 7, (DefaultConstructorMarker) null);
    }

    /* renamed from: a */
    public final Long mo40860a() {
        return this.f42431d;
    }

    /* renamed from: b */
    public final Long mo40861b() {
        return this.f42432e;
    }

    /* renamed from: d */
    public final SoloLoungeItem mo40862d() {
        return this.f42433f;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final boolean mo40864e() {
        if (this.f42431d == null || this.f42432e == null || this.f42433f == null) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectedLoungeData)) {
            return false;
        }
        SelectedLoungeData selectedLoungeData = (SelectedLoungeData) obj;
        return C41536l.m120484d(this.f42431d, selectedLoungeData.f42431d) && C41536l.m120484d(this.f42432e, selectedLoungeData.f42432e) && C41536l.m120484d(this.f42433f, selectedLoungeData.f42433f);
    }

    /* renamed from: f */
    public final void mo40866f(Long l) {
        this.f42431d = l;
    }

    /* renamed from: g */
    public final void mo40867g(Long l) {
        this.f42432e = l;
    }

    /* renamed from: h */
    public final void mo40868h(SoloLoungeItem soloLoungeItem) {
        this.f42433f = soloLoungeItem;
    }

    public int hashCode() {
        Long l = this.f42431d;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.f42432e;
        int hashCode2 = (hashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        SoloLoungeItem soloLoungeItem = this.f42433f;
        if (soloLoungeItem != null) {
            i = soloLoungeItem.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        Long l = this.f42431d;
        Long l2 = this.f42432e;
        SoloLoungeItem soloLoungeItem = this.f42433f;
        return "SelectedLoungeData(selectedCityId=" + l + ", selectedDistrictId=" + l2 + ", selectedStreet=" + soloLoungeItem + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        Long l = this.f42431d;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Long l2 = this.f42432e;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        SoloLoungeItem soloLoungeItem = this.f42433f;
        if (soloLoungeItem == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        soloLoungeItem.writeToParcel(parcel, i);
    }

    public SelectedLoungeData(Long l, Long l2, SoloLoungeItem soloLoungeItem) {
        this.f42431d = l;
        this.f42432e = l2;
        this.f42433f = soloLoungeItem;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SelectedLoungeData(Long l, Long l2, SoloLoungeItem soloLoungeItem, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : l2, (i & 4) != 0 ? null : soloLoungeItem);
    }
}
