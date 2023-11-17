package p341ge.bog.mobilebank.stories.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.salesforce.marketingcloud.storage.p385db.C11769i;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.shared.presentation.common.model.UrlDataUiModel;

/* renamed from: ge.bog.mobilebank.stories.presentation.model.StoryContentLinkUiModel */
public abstract class StoryContentLinkUiModel implements Parcelable {

    /* renamed from: ge.bog.mobilebank.stories.presentation.model.StoryContentLinkUiModel$DeepLink */
    public static final class DeepLink extends StoryContentLinkUiModel {
        public static final Parcelable.Creator<DeepLink> CREATOR = new C34835a();

        /* renamed from: d */
        private final UrlDataUiModel f84096d;

        /* renamed from: ge.bog.mobilebank.stories.presentation.model.StoryContentLinkUiModel$DeepLink$a */
        public static final class C34835a implements Parcelable.Creator {
            /* renamed from: a */
            public final DeepLink createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                return new DeepLink((UrlDataUiModel) parcel.readParcelable(DeepLink.class.getClassLoader()));
            }

            /* renamed from: b */
            public final DeepLink[] newArray(int i) {
                return new DeepLink[i];
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public DeepLink(UrlDataUiModel urlDataUiModel) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(urlDataUiModel, C11769i.C11770a.f34149l);
            this.f84096d = urlDataUiModel;
        }

        /* renamed from: a */
        public final UrlDataUiModel mo85057a() {
            return this.f84096d;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DeepLink) && C41536l.m120484d(this.f84096d, ((DeepLink) obj).f84096d);
        }

        public int hashCode() {
            return this.f84096d.hashCode();
        }

        public String toString() {
            UrlDataUiModel urlDataUiModel = this.f84096d;
            return "DeepLink(url=" + urlDataUiModel + ")";
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeParcelable(this.f84096d, i);
        }
    }

    /* renamed from: ge.bog.mobilebank.stories.presentation.model.StoryContentLinkUiModel$Url */
    public static final class Url extends StoryContentLinkUiModel {
        public static final Parcelable.Creator<Url> CREATOR = new C34836a();

        /* renamed from: d */
        private final String f84097d;

        /* renamed from: ge.bog.mobilebank.stories.presentation.model.StoryContentLinkUiModel$Url$a */
        public static final class C34836a implements Parcelable.Creator {
            /* renamed from: a */
            public final Url createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                return new Url(parcel.readString());
            }

            /* renamed from: b */
            public final Url[] newArray(int i) {
                return new Url[i];
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Url(String str) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(str, C11769i.C11770a.f34149l);
            this.f84097d = str;
        }

        /* renamed from: a */
        public final String mo85067a() {
            return this.f84097d;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Url) && C41536l.m120484d(this.f84097d, ((Url) obj).f84097d);
        }

        public int hashCode() {
            return this.f84097d.hashCode();
        }

        public String toString() {
            String str = this.f84097d;
            return "Url(url=" + str + ")";
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeString(this.f84097d);
        }
    }

    private StoryContentLinkUiModel() {
    }

    public /* synthetic */ StoryContentLinkUiModel(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
