package p248s7;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.C4342p0;
import com.google.android.gms.internal.measurement.C4359q0;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzaw;
import com.google.android.gms.measurement.internal.zzlj;
import com.google.android.gms.measurement.internal.zzq;
import java.util.List;

/* renamed from: s7.e */
public abstract class C8251e extends C4342p0 implements C8252f {
    public C8251e() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final boolean mo13050k(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                C4359q0.m16486c(parcel);
                mo14429o0((zzaw) C4359q0.m16484a(parcel, zzaw.CREATOR), (zzq) C4359q0.m16484a(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                C4359q0.m16486c(parcel);
                mo14423F((zzlj) C4359q0.m16484a(parcel, zzlj.CREATOR), (zzq) C4359q0.m16484a(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                return true;
            case 4:
                C4359q0.m16486c(parcel);
                mo14431q0((zzq) C4359q0.m16484a(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                return true;
            case 5:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                C4359q0.m16486c(parcel);
                mo14541c2((zzaw) C4359q0.m16484a(parcel, zzaw.CREATOR), readString, readString2);
                parcel2.writeNoException();
                return true;
            case 6:
                C4359q0.m16486c(parcel);
                mo14427i1((zzq) C4359q0.m16484a(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                return true;
            case 7:
                boolean f = C4359q0.m16489f(parcel);
                C4359q0.m16486c(parcel);
                List L = mo14540L((zzq) C4359q0.m16484a(parcel, zzq.CREATOR), f);
                parcel2.writeNoException();
                parcel2.writeTypedList(L);
                return true;
            case 9:
                String readString3 = parcel.readString();
                C4359q0.m16486c(parcel);
                byte[] t1 = mo14433t1((zzaw) C4359q0.m16484a(parcel, zzaw.CREATOR), readString3);
                parcel2.writeNoException();
                parcel2.writeByteArray(t1);
                return true;
            case 10:
                long readLong = parcel.readLong();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                C4359q0.m16486c(parcel);
                mo14434v0(readLong, readString4, readString5, readString6);
                parcel2.writeNoException();
                return true;
            case 11:
                C4359q0.m16486c(parcel);
                String w1 = mo14435w1((zzq) C4359q0.m16484a(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                parcel2.writeString(w1);
                return true;
            case 12:
                C4359q0.m16486c(parcel);
                mo14432q2((zzac) C4359q0.m16484a(parcel, zzac.CREATOR), (zzq) C4359q0.m16484a(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                return true;
            case 13:
                C4359q0.m16486c(parcel);
                mo14539J((zzac) C4359q0.m16484a(parcel, zzac.CREATOR));
                parcel2.writeNoException();
                return true;
            case 14:
                C4359q0.m16486c(parcel);
                List I0 = mo14424I0(parcel.readString(), parcel.readString(), C4359q0.m16489f(parcel), (zzq) C4359q0.m16484a(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(I0);
                return true;
            case 15:
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                String readString9 = parcel.readString();
                boolean f2 = C4359q0.m16489f(parcel);
                C4359q0.m16486c(parcel);
                List o1 = mo14430o1(readString7, readString8, readString9, f2);
                parcel2.writeNoException();
                parcel2.writeTypedList(o1);
                return true;
            case 16:
                C4359q0.m16486c(parcel);
                List W1 = mo14426W1(parcel.readString(), parcel.readString(), (zzq) C4359q0.m16484a(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(W1);
                return true;
            case 17:
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                String readString12 = parcel.readString();
                C4359q0.m16486c(parcel);
                List B1 = mo14421B1(readString10, readString11, readString12);
                parcel2.writeNoException();
                parcel2.writeTypedList(B1);
                return true;
            case 18:
                C4359q0.m16486c(parcel);
                mo14425N0((zzq) C4359q0.m16484a(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                return true;
            case 19:
                C4359q0.m16486c(parcel);
                mo14428l1((Bundle) C4359q0.m16484a(parcel, Bundle.CREATOR), (zzq) C4359q0.m16484a(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                return true;
            case 20:
                C4359q0.m16486c(parcel);
                mo14422D0((zzq) C4359q0.m16484a(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
