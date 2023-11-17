package p341ge.bog.mobilebank.eventbus.events;

import android.os.Parcel;
import android.os.Parcelable;
import org.parceler.C42027a;
import org.parceler.C42034d;
import org.parceler.ParcelerRuntimeException;
import p341ge.bog.mobilebank.eventbus.RootEvent$$PackageHelper;

/* renamed from: ge.bog.mobilebank.eventbus.events.ProviderConfigurationEvent$$Parcelable */
public class ProviderConfigurationEvent$$Parcelable implements Parcelable, C42034d {
    public static final Parcelable.Creator<ProviderConfigurationEvent$$Parcelable> CREATOR = new Parcelable.Creator<ProviderConfigurationEvent$$Parcelable>() {
        public ProviderConfigurationEvent$$Parcelable createFromParcel(Parcel parcel) {
            return new ProviderConfigurationEvent$$Parcelable(ProviderConfigurationEvent$$Parcelable.read(parcel, new C42027a()));
        }

        public ProviderConfigurationEvent$$Parcelable[] newArray(int i) {
            return new ProviderConfigurationEvent$$Parcelable[i];
        }
    };
    private ProviderConfigurationEvent providerConfigurationEvent$$0;

    public ProviderConfigurationEvent$$Parcelable(ProviderConfigurationEvent providerConfigurationEvent) {
        this.providerConfigurationEvent$$0 = providerConfigurationEvent;
    }

    public static ProviderConfigurationEvent read(Parcel parcel, C42027a aVar) {
        int readInt = parcel.readInt();
        if (!aVar.mo97496a(readInt)) {
            int g = aVar.mo97502g();
            ProviderConfigurationEvent providerConfigurationEvent = new ProviderConfigurationEvent();
            aVar.mo97501f(g, providerConfigurationEvent);
            RootEvent$$PackageHelper.accessRootEvent$FS$errorKey(providerConfigurationEvent, parcel.readString());
            providerConfigurationEvent.errorCode = parcel.readString();
            RootEvent$$PackageHelper.accessRootEvent$FS$currentState(providerConfigurationEvent, parcel.readInt());
            RootEvent$$PackageHelper.accessRootEvent$FS$error(providerConfigurationEvent, parcel.readString());
            aVar.mo97501f(readInt, providerConfigurationEvent);
            return providerConfigurationEvent;
        } else if (!aVar.mo97499d(readInt)) {
            return (ProviderConfigurationEvent) aVar.mo97497b(readInt);
        } else {
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
    }

    public static void write(ProviderConfigurationEvent providerConfigurationEvent, Parcel parcel, int i, C42027a aVar) {
        int c = aVar.mo97498c(providerConfigurationEvent);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        parcel.writeInt(aVar.mo97500e(providerConfigurationEvent));
        parcel.writeString(RootEvent$$PackageHelper.accessRootEvent$FG$errorKey(providerConfigurationEvent));
        parcel.writeString(providerConfigurationEvent.errorCode);
        parcel.writeInt(RootEvent$$PackageHelper.accessRootEvent$FG$currentState(providerConfigurationEvent));
        parcel.writeString(RootEvent$$PackageHelper.accessRootEvent$FG$error(providerConfigurationEvent));
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        write(this.providerConfigurationEvent$$0, parcel, i, new C42027a());
    }

    public ProviderConfigurationEvent getParcel() {
        return this.providerConfigurationEvent$$0;
    }
}
