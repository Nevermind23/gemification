package p341ge.bog.mobilebank.cardapplications.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.shared.helper.StringSource;
import p519mi.C16686a;

/* renamed from: ge.bog.mobilebank.cardapplications.presentation.model.FeedbackItem */
public final class FeedbackItem implements Parcelable {
    public static final Parcelable.Creator<FeedbackItem> CREATOR = new C14225a();

    /* renamed from: d */
    private final StringSource f41732d;

    /* renamed from: e */
    private final StringSource f41733e;

    /* renamed from: f */
    private final StringSource f41734f;

    /* renamed from: g */
    private final C16686a f41735g;

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.model.FeedbackItem$a */
    public static final class C14225a implements Parcelable.Creator {
        /* renamed from: a */
        public final FeedbackItem createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            Class<FeedbackItem> cls = FeedbackItem.class;
            return new FeedbackItem((StringSource) parcel.readParcelable(cls.getClassLoader()), (StringSource) parcel.readParcelable(cls.getClassLoader()), (StringSource) parcel.readParcelable(cls.getClassLoader()), C16686a.valueOf(parcel.readString()));
        }

        /* renamed from: b */
        public final FeedbackItem[] newArray(int i) {
            return new FeedbackItem[i];
        }
    }

    public FeedbackItem(StringSource stringSource, StringSource stringSource2, StringSource stringSource3, C16686a aVar) {
        C41536l.m120489i(stringSource, "title");
        C41536l.m120489i(stringSource2, "text");
        C41536l.m120489i(aVar, "feedbackState");
        this.f41732d = stringSource;
        this.f41733e = stringSource2;
        this.f41734f = stringSource3;
        this.f41735g = aVar;
    }

    /* renamed from: a */
    public final StringSource mo39739a() {
        return this.f41733e;
    }

    /* renamed from: b */
    public final StringSource mo39740b() {
        return this.f41732d;
    }

    /* renamed from: d */
    public final StringSource mo39741d() {
        return this.f41734f;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedbackItem)) {
            return false;
        }
        FeedbackItem feedbackItem = (FeedbackItem) obj;
        return C41536l.m120484d(this.f41732d, feedbackItem.f41732d) && C41536l.m120484d(this.f41733e, feedbackItem.f41733e) && C41536l.m120484d(this.f41734f, feedbackItem.f41734f) && this.f41735g == feedbackItem.f41735g;
    }

    public int hashCode() {
        int hashCode = ((this.f41732d.hashCode() * 31) + this.f41733e.hashCode()) * 31;
        StringSource stringSource = this.f41734f;
        return ((hashCode + (stringSource == null ? 0 : stringSource.hashCode())) * 31) + this.f41735g.hashCode();
    }

    public String toString() {
        StringSource stringSource = this.f41732d;
        StringSource stringSource2 = this.f41733e;
        StringSource stringSource3 = this.f41734f;
        C16686a aVar = this.f41735g;
        return "FeedbackItem(title=" + stringSource + ", text=" + stringSource2 + ", warningText=" + stringSource3 + ", feedbackState=" + aVar + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeParcelable(this.f41732d, i);
        parcel.writeParcelable(this.f41733e, i);
        parcel.writeParcelable(this.f41734f, i);
        parcel.writeString(this.f41735g.name());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FeedbackItem(StringSource stringSource, StringSource stringSource2, StringSource stringSource3, C16686a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(stringSource, stringSource2, (i & 4) != 0 ? null : stringSource3, (i & 8) != 0 ? C16686a.PENDING : aVar);
    }
}
