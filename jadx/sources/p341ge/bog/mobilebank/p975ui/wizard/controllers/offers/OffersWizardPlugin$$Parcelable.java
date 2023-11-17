package p341ge.bog.mobilebank.p975ui.wizard.controllers.offers;

import android.os.Parcel;
import android.os.Parcelable;
import org.parceler.C42027a;
import org.parceler.C42034d;
import org.parceler.ParcelerRuntimeException;

/* renamed from: ge.bog.mobilebank.ui.wizard.controllers.offers.OffersWizardPlugin$$Parcelable */
public class OffersWizardPlugin$$Parcelable implements Parcelable, C42034d {
    public static final Parcelable.Creator<OffersWizardPlugin$$Parcelable> CREATOR = new C35888a();
    private OffersWizardPlugin offersWizardPlugin$$0;

    /* renamed from: ge.bog.mobilebank.ui.wizard.controllers.offers.OffersWizardPlugin$$Parcelable$a */
    class C35888a implements Parcelable.Creator {
        C35888a() {
        }

        /* renamed from: a */
        public OffersWizardPlugin$$Parcelable createFromParcel(Parcel parcel) {
            return new OffersWizardPlugin$$Parcelable(OffersWizardPlugin$$Parcelable.read(parcel, new C42027a()));
        }

        /* renamed from: b */
        public OffersWizardPlugin$$Parcelable[] newArray(int i) {
            return new OffersWizardPlugin$$Parcelable[i];
        }
    }

    public OffersWizardPlugin$$Parcelable(OffersWizardPlugin offersWizardPlugin) {
        this.offersWizardPlugin$$0 = offersWizardPlugin;
    }

    public static OffersWizardPlugin read(Parcel parcel, C42027a aVar) {
        int readInt = parcel.readInt();
        if (!aVar.mo97496a(readInt)) {
            int g = aVar.mo97502g();
            OffersWizardPlugin offersWizardPlugin = new OffersWizardPlugin();
            aVar.mo97501f(g, offersWizardPlugin);
            aVar.mo97501f(readInt, offersWizardPlugin);
            return offersWizardPlugin;
        } else if (!aVar.mo97499d(readInt)) {
            return (OffersWizardPlugin) aVar.mo97497b(readInt);
        } else {
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
    }

    public static void write(OffersWizardPlugin offersWizardPlugin, Parcel parcel, int i, C42027a aVar) {
        int c = aVar.mo97498c(offersWizardPlugin);
        if (c != -1) {
            parcel.writeInt(c);
        } else {
            parcel.writeInt(aVar.mo97500e(offersWizardPlugin));
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        write(this.offersWizardPlugin$$0, parcel, i, new C42027a());
    }

    public OffersWizardPlugin getParcel() {
        return this.offersWizardPlugin$$0;
    }
}
