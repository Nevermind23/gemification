package p341ge.bog.mobilebank.stories.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: ge.bog.mobilebank.stories.presentation.model.StoryGroupUiModel */
public final class StoryGroupUiModel implements Parcelable {
    public static final Parcelable.Creator<StoryGroupUiModel> CREATOR = new C34838a();

    /* renamed from: d */
    private final List f84109d;

    /* renamed from: e */
    private final long f84110e;

    /* renamed from: ge.bog.mobilebank.stories.presentation.model.StoryGroupUiModel$a */
    public static final class C34838a implements Parcelable.Creator {
        /* renamed from: a */
        public final StoryGroupUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(StoryDetailsUiModel.CREATOR.createFromParcel(parcel));
            }
            return new StoryGroupUiModel(arrayList, parcel.readLong());
        }

        /* renamed from: b */
        public final StoryGroupUiModel[] newArray(int i) {
            return new StoryGroupUiModel[i];
        }
    }

    public StoryGroupUiModel(List list, long j) {
        C41536l.m120489i(list, "stories");
        this.f84109d = list;
        this.f84110e = j;
    }

    /* renamed from: a */
    public final long mo85097a() {
        return this.f84110e;
    }

    /* renamed from: b */
    public final List mo85098b() {
        return this.f84109d;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoryGroupUiModel)) {
            return false;
        }
        StoryGroupUiModel storyGroupUiModel = (StoryGroupUiModel) obj;
        return C41536l.m120484d(this.f84109d, storyGroupUiModel.f84109d) && this.f84110e == storyGroupUiModel.f84110e;
    }

    public int hashCode() {
        return (this.f84109d.hashCode() * 31) + C7397t.m28148a(this.f84110e);
    }

    public String toString() {
        List list = this.f84109d;
        long j = this.f84110e;
        return "StoryGroupUiModel(stories=" + list + ", id=" + j + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        List<StoryDetailsUiModel> list = this.f84109d;
        parcel.writeInt(list.size());
        for (StoryDetailsUiModel writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i);
        }
        parcel.writeLong(this.f84110e);
    }
}
