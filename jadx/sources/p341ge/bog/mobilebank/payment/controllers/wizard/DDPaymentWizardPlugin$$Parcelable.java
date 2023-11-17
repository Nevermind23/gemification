package p341ge.bog.mobilebank.payment.controllers.wizard;

import android.os.Parcel;
import android.os.Parcelable;
import org.parceler.C42027a;
import org.parceler.C42034d;
import org.parceler.ParcelerRuntimeException;

/* renamed from: ge.bog.mobilebank.payment.controllers.wizard.DDPaymentWizardPlugin$$Parcelable */
public class DDPaymentWizardPlugin$$Parcelable implements Parcelable, C42034d {
    public static final Parcelable.Creator<DDPaymentWizardPlugin$$Parcelable> CREATOR = new C33616a();
    private DDPaymentWizardPlugin dDPaymentWizardPlugin$$0;

    /* renamed from: ge.bog.mobilebank.payment.controllers.wizard.DDPaymentWizardPlugin$$Parcelable$a */
    class C33616a implements Parcelable.Creator {
        C33616a() {
        }

        /* renamed from: a */
        public DDPaymentWizardPlugin$$Parcelable createFromParcel(Parcel parcel) {
            return new DDPaymentWizardPlugin$$Parcelable(DDPaymentWizardPlugin$$Parcelable.read(parcel, new C42027a()));
        }

        /* renamed from: b */
        public DDPaymentWizardPlugin$$Parcelable[] newArray(int i) {
            return new DDPaymentWizardPlugin$$Parcelable[i];
        }
    }

    public DDPaymentWizardPlugin$$Parcelable(DDPaymentWizardPlugin dDPaymentWizardPlugin) {
        this.dDPaymentWizardPlugin$$0 = dDPaymentWizardPlugin;
    }

    public static DDPaymentWizardPlugin read(Parcel parcel, C42027a aVar) {
        int readInt = parcel.readInt();
        if (!aVar.mo97496a(readInt)) {
            int g = aVar.mo97502g();
            DDPaymentWizardPlugin dDPaymentWizardPlugin = new DDPaymentWizardPlugin();
            aVar.mo97501f(g, dDPaymentWizardPlugin);
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            dDPaymentWizardPlugin.isTopup = z;
            dDPaymentWizardPlugin.manager = PaymentWizardPlugin$PaymentWizardManager$$Parcelable.read(parcel, aVar);
            aVar.mo97501f(readInt, dDPaymentWizardPlugin);
            return dDPaymentWizardPlugin;
        } else if (!aVar.mo97499d(readInt)) {
            return (DDPaymentWizardPlugin) aVar.mo97497b(readInt);
        } else {
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
    }

    public static void write(DDPaymentWizardPlugin dDPaymentWizardPlugin, Parcel parcel, int i, C42027a aVar) {
        int c = aVar.mo97498c(dDPaymentWizardPlugin);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        parcel.writeInt(aVar.mo97500e(dDPaymentWizardPlugin));
        parcel.writeInt(dDPaymentWizardPlugin.isTopup ? 1 : 0);
        PaymentWizardPlugin$PaymentWizardManager$$Parcelable.write(dDPaymentWizardPlugin.manager, parcel, i, aVar);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        write(this.dDPaymentWizardPlugin$$0, parcel, i, new C42027a());
    }

    public DDPaymentWizardPlugin getParcel() {
        return this.dDPaymentWizardPlugin$$0;
    }
}
