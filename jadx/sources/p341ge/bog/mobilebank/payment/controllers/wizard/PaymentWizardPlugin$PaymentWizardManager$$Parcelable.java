package p341ge.bog.mobilebank.payment.controllers.wizard;

import android.os.Parcel;
import android.os.Parcelable;
import org.parceler.C42027a;
import org.parceler.C42034d;
import org.parceler.ParcelerRuntimeException;
import p341ge.bog.mobilebank.payment.controllers.wizard.PaymentWizardPlugin;
import p341ge.bog.mobilebank.payment.model.PaymentCustomConfiguration$$Parcelable;

/* renamed from: ge.bog.mobilebank.payment.controllers.wizard.PaymentWizardPlugin$PaymentWizardManager$$Parcelable */
public class PaymentWizardPlugin$PaymentWizardManager$$Parcelable implements Parcelable, C42034d {
    public static final Parcelable.Creator<PaymentWizardPlugin$PaymentWizardManager$$Parcelable> CREATOR = new C33618a();
    private PaymentWizardPlugin.PaymentWizardManager paymentWizardManager$$0;

    /* renamed from: ge.bog.mobilebank.payment.controllers.wizard.PaymentWizardPlugin$PaymentWizardManager$$Parcelable$a */
    class C33618a implements Parcelable.Creator {
        C33618a() {
        }

        /* renamed from: a */
        public PaymentWizardPlugin$PaymentWizardManager$$Parcelable createFromParcel(Parcel parcel) {
            return new PaymentWizardPlugin$PaymentWizardManager$$Parcelable(PaymentWizardPlugin$PaymentWizardManager$$Parcelable.read(parcel, new C42027a()));
        }

        /* renamed from: b */
        public PaymentWizardPlugin$PaymentWizardManager$$Parcelable[] newArray(int i) {
            return new PaymentWizardPlugin$PaymentWizardManager$$Parcelable[i];
        }
    }

    public PaymentWizardPlugin$PaymentWizardManager$$Parcelable(PaymentWizardPlugin.PaymentWizardManager paymentWizardManager) {
        this.paymentWizardManager$$0 = paymentWizardManager;
    }

    public static PaymentWizardPlugin.PaymentWizardManager read(Parcel parcel, C42027a aVar) {
        int readInt = parcel.readInt();
        if (!aVar.mo97496a(readInt)) {
            int g = aVar.mo97502g();
            PaymentWizardPlugin.PaymentWizardManager paymentWizardManager = new PaymentWizardPlugin.PaymentWizardManager();
            aVar.mo97501f(g, paymentWizardManager);
            paymentWizardManager.customConfiguration = PaymentCustomConfiguration$$Parcelable.read(parcel, aVar);
            aVar.mo97501f(readInt, paymentWizardManager);
            return paymentWizardManager;
        } else if (!aVar.mo97499d(readInt)) {
            return (PaymentWizardPlugin.PaymentWizardManager) aVar.mo97497b(readInt);
        } else {
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
    }

    public static void write(PaymentWizardPlugin.PaymentWizardManager paymentWizardManager, Parcel parcel, int i, C42027a aVar) {
        int c = aVar.mo97498c(paymentWizardManager);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        parcel.writeInt(aVar.mo97500e(paymentWizardManager));
        PaymentCustomConfiguration$$Parcelable.write(paymentWizardManager.customConfiguration, parcel, i, aVar);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        write(this.paymentWizardManager$$0, parcel, i, new C42027a());
    }

    public PaymentWizardPlugin.PaymentWizardManager getParcel() {
        return this.paymentWizardManager$$0;
    }
}
