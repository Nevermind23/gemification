package p341ge.bog.mobilebank.payment.controllers.wizard;

import android.os.Parcel;
import android.os.Parcelable;
import org.parceler.C42027a;
import org.parceler.C42028b;
import org.parceler.C42034d;
import org.parceler.ParcelerRuntimeException;

/* renamed from: ge.bog.mobilebank.payment.controllers.wizard.PointPaymentWizardPlugin$$Parcelable */
public class PointPaymentWizardPlugin$$Parcelable implements Parcelable, C42034d {
    public static final Parcelable.Creator<PointPaymentWizardPlugin$$Parcelable> CREATOR = new C33619a();
    private PointPaymentWizardPlugin pointPaymentWizardPlugin$$0;

    /* renamed from: ge.bog.mobilebank.payment.controllers.wizard.PointPaymentWizardPlugin$$Parcelable$a */
    class C33619a implements Parcelable.Creator {
        C33619a() {
        }

        /* renamed from: a */
        public PointPaymentWizardPlugin$$Parcelable createFromParcel(Parcel parcel) {
            return new PointPaymentWizardPlugin$$Parcelable(PointPaymentWizardPlugin$$Parcelable.read(parcel, new C42027a()));
        }

        /* renamed from: b */
        public PointPaymentWizardPlugin$$Parcelable[] newArray(int i) {
            return new PointPaymentWizardPlugin$$Parcelable[i];
        }
    }

    public PointPaymentWizardPlugin$$Parcelable(PointPaymentWizardPlugin pointPaymentWizardPlugin) {
        this.pointPaymentWizardPlugin$$0 = pointPaymentWizardPlugin;
    }

    public static PointPaymentWizardPlugin read(Parcel parcel, C42027a aVar) {
        int readInt = parcel.readInt();
        if (!aVar.mo97496a(readInt)) {
            int g = aVar.mo97502g();
            PointPaymentWizardPlugin pointPaymentWizardPlugin = new PointPaymentWizardPlugin();
            aVar.mo97501f(g, pointPaymentWizardPlugin);
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            C42028b.m122113b(PointPaymentWizardPlugin.class, pointPaymentWizardPlugin, "waitingForResponse", Boolean.valueOf(z));
            pointPaymentWizardPlugin.availablePoints = parcel.readString();
            pointPaymentWizardPlugin.manager = PaymentWizardPlugin$PaymentWizardManager$$Parcelable.read(parcel, aVar);
            aVar.mo97501f(readInt, pointPaymentWizardPlugin);
            return pointPaymentWizardPlugin;
        } else if (!aVar.mo97499d(readInt)) {
            return (PointPaymentWizardPlugin) aVar.mo97497b(readInt);
        } else {
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
    }

    public static void write(PointPaymentWizardPlugin pointPaymentWizardPlugin, Parcel parcel, int i, C42027a aVar) {
        int c = aVar.mo97498c(pointPaymentWizardPlugin);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        parcel.writeInt(aVar.mo97500e(pointPaymentWizardPlugin));
        parcel.writeInt(((Boolean) C42028b.m122112a(Boolean.TYPE, PointPaymentWizardPlugin.class, pointPaymentWizardPlugin, "waitingForResponse")).booleanValue() ? 1 : 0);
        parcel.writeString(pointPaymentWizardPlugin.availablePoints);
        PaymentWizardPlugin$PaymentWizardManager$$Parcelable.write(pointPaymentWizardPlugin.manager, parcel, i, aVar);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        write(this.pointPaymentWizardPlugin$$0, parcel, i, new C42027a());
    }

    public PointPaymentWizardPlugin getParcel() {
        return this.pointPaymentWizardPlugin$$0;
    }
}
