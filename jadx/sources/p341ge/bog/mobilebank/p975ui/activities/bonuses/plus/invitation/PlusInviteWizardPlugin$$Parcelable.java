package p341ge.bog.mobilebank.p975ui.activities.bonuses.plus.invitation;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import org.parceler.C42027a;
import org.parceler.C42034d;
import org.parceler.ParcelerRuntimeException;

/* renamed from: ge.bog.mobilebank.ui.activities.bonuses.plus.invitation.PlusInviteWizardPlugin$$Parcelable */
public class PlusInviteWizardPlugin$$Parcelable implements Parcelable, C42034d {
    public static final Parcelable.Creator<PlusInviteWizardPlugin$$Parcelable> CREATOR = new C35356a();
    private PlusInviteWizardPlugin plusInviteWizardPlugin$$0;

    /* renamed from: ge.bog.mobilebank.ui.activities.bonuses.plus.invitation.PlusInviteWizardPlugin$$Parcelable$a */
    class C35356a implements Parcelable.Creator {
        C35356a() {
        }

        /* renamed from: a */
        public PlusInviteWizardPlugin$$Parcelable createFromParcel(Parcel parcel) {
            return new PlusInviteWizardPlugin$$Parcelable(PlusInviteWizardPlugin$$Parcelable.read(parcel, new C42027a()));
        }

        /* renamed from: b */
        public PlusInviteWizardPlugin$$Parcelable[] newArray(int i) {
            return new PlusInviteWizardPlugin$$Parcelable[i];
        }
    }

    public PlusInviteWizardPlugin$$Parcelable(PlusInviteWizardPlugin plusInviteWizardPlugin) {
        this.plusInviteWizardPlugin$$0 = plusInviteWizardPlugin;
    }

    public static PlusInviteWizardPlugin read(Parcel parcel, C42027a aVar) {
        Integer num;
        int readInt = parcel.readInt();
        if (!aVar.mo97496a(readInt)) {
            int g = aVar.mo97502g();
            PlusInviteWizardPlugin plusInviteWizardPlugin = new PlusInviteWizardPlugin();
            aVar.mo97501f(g, plusInviteWizardPlugin);
            int readInt2 = parcel.readInt();
            ArrayList<Integer> arrayList = null;
            boolean z = false;
            if (readInt2 >= 0) {
                ArrayList<Integer> arrayList2 = new ArrayList<>(readInt2);
                for (int i = 0; i < readInt2; i++) {
                    if (parcel.readInt() < 0) {
                        num = null;
                    } else {
                        num = Integer.valueOf(parcel.readInt());
                    }
                    arrayList2.add(num);
                }
                arrayList = arrayList2;
            }
            plusInviteWizardPlugin.selectedProducts = arrayList;
            if (parcel.readInt() == 1) {
                z = true;
            }
            plusInviteWizardPlugin.isSoloClient = z;
            aVar.mo97501f(readInt, plusInviteWizardPlugin);
            return plusInviteWizardPlugin;
        } else if (!aVar.mo97499d(readInt)) {
            return (PlusInviteWizardPlugin) aVar.mo97497b(readInt);
        } else {
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
    }

    public static void write(PlusInviteWizardPlugin plusInviteWizardPlugin, Parcel parcel, int i, C42027a aVar) {
        int c = aVar.mo97498c(plusInviteWizardPlugin);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        parcel.writeInt(aVar.mo97500e(plusInviteWizardPlugin));
        ArrayList<Integer> arrayList = plusInviteWizardPlugin.selectedProducts;
        if (arrayList == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(arrayList.size());
            Iterator<Integer> it = plusInviteWizardPlugin.selectedProducts.iterator();
            while (it.hasNext()) {
                Integer next = it.next();
                if (next == null) {
                    parcel.writeInt(-1);
                } else {
                    parcel.writeInt(1);
                    parcel.writeInt(next.intValue());
                }
            }
        }
        parcel.writeInt(plusInviteWizardPlugin.isSoloClient ? 1 : 0);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        write(this.plusInviteWizardPlugin$$0, parcel, i, new C42027a());
    }

    public PlusInviteWizardPlugin getParcel() {
        return this.plusInviteWizardPlugin$$0;
    }
}
