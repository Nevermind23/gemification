package p341ge.bog.mobilebank.p975ui.wizard.controllers;

import android.os.Parcel;
import android.os.Parcelable;
import org.parceler.C42027a;
import org.parceler.C42028b;
import org.parceler.C42034d;
import org.parceler.ParcelerRuntimeException;

/* renamed from: ge.bog.mobilebank.ui.wizard.controllers.TransportPlusExchangeWizardPlugin$$Parcelable */
public class TransportPlusExchangeWizardPlugin$$Parcelable implements Parcelable, C42034d {
    public static final Parcelable.Creator<TransportPlusExchangeWizardPlugin$$Parcelable> CREATOR = new C35884a();
    private TransportPlusExchangeWizardPlugin transportPlusExchangeWizardPlugin$$0;

    /* renamed from: ge.bog.mobilebank.ui.wizard.controllers.TransportPlusExchangeWizardPlugin$$Parcelable$a */
    class C35884a implements Parcelable.Creator {
        C35884a() {
        }

        /* renamed from: a */
        public TransportPlusExchangeWizardPlugin$$Parcelable createFromParcel(Parcel parcel) {
            return new TransportPlusExchangeWizardPlugin$$Parcelable(TransportPlusExchangeWizardPlugin$$Parcelable.read(parcel, new C42027a()));
        }

        /* renamed from: b */
        public TransportPlusExchangeWizardPlugin$$Parcelable[] newArray(int i) {
            return new TransportPlusExchangeWizardPlugin$$Parcelable[i];
        }
    }

    public TransportPlusExchangeWizardPlugin$$Parcelable(TransportPlusExchangeWizardPlugin transportPlusExchangeWizardPlugin) {
        this.transportPlusExchangeWizardPlugin$$0 = transportPlusExchangeWizardPlugin;
    }

    public static TransportPlusExchangeWizardPlugin read(Parcel parcel, C42027a aVar) {
        int readInt = parcel.readInt();
        if (!aVar.mo97496a(readInt)) {
            int g = aVar.mo97502g();
            TransportPlusExchangeWizardPlugin transportPlusExchangeWizardPlugin = new TransportPlusExchangeWizardPlugin();
            aVar.mo97501f(g, transportPlusExchangeWizardPlugin);
            Class<TransportPlusExchangeWizardPlugin> cls = TransportPlusExchangeWizardPlugin.class;
            C42028b.m122113b(cls, transportPlusExchangeWizardPlugin, "pointAmount", parcel.readString());
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            C42028b.m122113b(cls, transportPlusExchangeWizardPlugin, "waitingForResponse", Boolean.valueOf(z));
            C42028b.m122113b(cls, transportPlusExchangeWizardPlugin, "availablePoints", parcel.readString());
            aVar.mo97501f(readInt, transportPlusExchangeWizardPlugin);
            return transportPlusExchangeWizardPlugin;
        } else if (!aVar.mo97499d(readInt)) {
            return (TransportPlusExchangeWizardPlugin) aVar.mo97497b(readInt);
        } else {
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
    }

    public static void write(TransportPlusExchangeWizardPlugin transportPlusExchangeWizardPlugin, Parcel parcel, int i, C42027a aVar) {
        int c = aVar.mo97498c(transportPlusExchangeWizardPlugin);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        parcel.writeInt(aVar.mo97500e(transportPlusExchangeWizardPlugin));
        Class<String> cls = String.class;
        Class<TransportPlusExchangeWizardPlugin> cls2 = TransportPlusExchangeWizardPlugin.class;
        parcel.writeString((String) C42028b.m122112a(cls, cls2, transportPlusExchangeWizardPlugin, "pointAmount"));
        parcel.writeInt(((Boolean) C42028b.m122112a(Boolean.TYPE, cls2, transportPlusExchangeWizardPlugin, "waitingForResponse")).booleanValue() ? 1 : 0);
        parcel.writeString((String) C42028b.m122112a(cls, cls2, transportPlusExchangeWizardPlugin, "availablePoints"));
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        write(this.transportPlusExchangeWizardPlugin$$0, parcel, i, new C42027a());
    }

    public TransportPlusExchangeWizardPlugin getParcel() {
        return this.transportPlusExchangeWizardPlugin$$0;
    }
}
