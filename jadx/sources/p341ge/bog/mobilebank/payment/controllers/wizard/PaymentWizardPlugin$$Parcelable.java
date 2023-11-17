package p341ge.bog.mobilebank.payment.controllers.wizard;

import android.os.Parcel;
import android.os.Parcelable;
import org.parceler.C42027a;
import org.parceler.C42034d;
import org.parceler.ParcelerRuntimeException;

/* renamed from: ge.bog.mobilebank.payment.controllers.wizard.PaymentWizardPlugin$$Parcelable */
public class PaymentWizardPlugin$$Parcelable implements Parcelable, C42034d {
    public static final Parcelable.Creator<PaymentWizardPlugin$$Parcelable> CREATOR = new C33617a();
    private PaymentWizardPlugin paymentWizardPlugin$$0;

    /* renamed from: ge.bog.mobilebank.payment.controllers.wizard.PaymentWizardPlugin$$Parcelable$a */
    class C33617a implements Parcelable.Creator {
        C33617a() {
        }

        /* renamed from: a */
        public PaymentWizardPlugin$$Parcelable createFromParcel(Parcel parcel) {
            return new PaymentWizardPlugin$$Parcelable(PaymentWizardPlugin$$Parcelable.read(parcel, new C42027a()));
        }

        /* renamed from: b */
        public PaymentWizardPlugin$$Parcelable[] newArray(int i) {
            return new PaymentWizardPlugin$$Parcelable[i];
        }
    }

    public PaymentWizardPlugin$$Parcelable(PaymentWizardPlugin paymentWizardPlugin) {
        this.paymentWizardPlugin$$0 = paymentWizardPlugin;
    }

    public static PaymentWizardPlugin read(Parcel parcel, C42027a aVar) {
        int readInt = parcel.readInt();
        if (!aVar.mo97496a(readInt)) {
            int g = aVar.mo97502g();
            PaymentWizardPlugin paymentWizardPlugin = new PaymentWizardPlugin();
            aVar.mo97501f(g, paymentWizardPlugin);
            paymentWizardPlugin.manager = PaymentWizardPlugin$PaymentWizardManager$$Parcelable.read(parcel, aVar);
            aVar.mo97501f(readInt, paymentWizardPlugin);
            return paymentWizardPlugin;
        } else if (!aVar.mo97499d(readInt)) {
            return (PaymentWizardPlugin) aVar.mo97497b(readInt);
        } else {
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
    }

    public static void write(PaymentWizardPlugin paymentWizardPlugin, Parcel parcel, int i, C42027a aVar) {
        int c = aVar.mo97498c(paymentWizardPlugin);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        parcel.writeInt(aVar.mo97500e(paymentWizardPlugin));
        PaymentWizardPlugin$PaymentWizardManager$$Parcelable.write(paymentWizardPlugin.manager, parcel, i, aVar);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        write(this.paymentWizardPlugin$$0, parcel, i, new C42027a());
    }

    public PaymentWizardPlugin getParcel() {
        return this.paymentWizardPlugin$$0;
    }
}
