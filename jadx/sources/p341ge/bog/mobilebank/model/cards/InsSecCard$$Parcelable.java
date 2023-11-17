package p341ge.bog.mobilebank.model.cards;

import android.os.Parcel;
import android.os.Parcelable;
import hd0.C24978b;
import org.parceler.C42027a;
import org.parceler.C42034d;

/* renamed from: ge.bog.mobilebank.model.cards.InsSecCard$$Parcelable */
public class InsSecCard$$Parcelable implements Parcelable, C42034d {
    public static final Parcelable.Creator<InsSecCard$$Parcelable> CREATOR = new Parcelable.Creator<InsSecCard$$Parcelable>() {
        public InsSecCard$$Parcelable createFromParcel(Parcel parcel) {
            return new InsSecCard$$Parcelable(InsSecCard$$Parcelable.read(parcel, new C42027a()));
        }

        public InsSecCard$$Parcelable[] newArray(int i) {
            return new InsSecCard$$Parcelable[i];
        }
    };
    private InsSecCard insSecCard$$0;

    public InsSecCard$$Parcelable(InsSecCard insSecCard) {
        this.insSecCard$$0 = insSecCard;
    }

    /* JADX WARNING: type inference failed for: r1v19, types: [java.lang.Enum] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p341ge.bog.mobilebank.model.cards.InsSecCard read(android.os.Parcel r7, org.parceler.C42027a r8) {
        /*
            int r0 = r7.readInt()
            boolean r1 = r8.mo97496a(r0)
            if (r1 == 0) goto L_0x001f
            boolean r7 = r8.mo97499d(r0)
            if (r7 != 0) goto L_0x0017
            java.lang.Object r7 = r8.mo97497b(r0)
            ge.bog.mobilebank.model.cards.InsSecCard r7 = (p341ge.bog.mobilebank.model.cards.InsSecCard) r7
            return r7
        L_0x0017:
            org.parceler.ParcelerRuntimeException r7 = new org.parceler.ParcelerRuntimeException
            java.lang.String r8 = "An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory."
            r7.<init>(r8)
            throw r7
        L_0x001f:
            int r1 = r8.mo97502g()
            ge.bog.mobilebank.model.cards.InsSecCard r2 = new ge.bog.mobilebank.model.cards.InsSecCard
            r2.<init>()
            r8.mo97501f(r1, r2)
            java.lang.String r1 = r7.readString()
            r2.lastFour = r1
            java.lang.String r1 = r7.readString()
            r2.dictionaryKey = r1
            java.lang.String r1 = r7.readString()
            r3 = 0
            java.lang.Class<hd0.b> r4 = hd0.C24978b.class
            if (r1 != 0) goto L_0x0042
            r1 = r3
            goto L_0x0048
        L_0x0042:
            java.lang.Enum r1 = java.lang.Enum.valueOf(r4, r1)
            hd0.b r1 = (hd0.C24978b) r1
        L_0x0048:
            r2.sec3D = r1
            java.lang.String r1 = r7.readString()
            r2.subProductCode = r1
            java.lang.String r1 = r7.readString()
            r2.cardName = r1
            java.lang.String r1 = r7.readString()
            r2.mobile = r1
            java.lang.String r1 = r7.readString()
            r2.attachmentFileBase64 = r1
            java.lang.String r1 = r7.readString()
            r2.insuranceType = r1
            java.lang.String r1 = r7.readString()
            if (r1 != 0) goto L_0x0070
            r1 = r3
            goto L_0x0076
        L_0x0070:
            java.lang.Enum r1 = java.lang.Enum.valueOf(r4, r1)
            hd0.b r1 = (hd0.C24978b) r1
        L_0x0076:
            r2.secAllow = r1
            java.lang.String r1 = r7.readString()
            if (r1 != 0) goto L_0x0080
            r1 = r3
            goto L_0x0086
        L_0x0080:
            java.lang.Enum r1 = java.lang.Enum.valueOf(r4, r1)
            hd0.b r1 = (hd0.C24978b) r1
        L_0x0086:
            r2.dgPassYN = r1
            java.lang.String r1 = r7.readString()
            if (r1 != 0) goto L_0x0090
            r1 = r3
            goto L_0x0096
        L_0x0090:
            java.lang.Enum r1 = java.lang.Enum.valueOf(r4, r1)
            hd0.b r1 = (hd0.C24978b) r1
        L_0x0096:
            r2.digipassAllow = r1
            java.lang.String r1 = r7.readString()
            r2.insuranceTypeKey = r1
            long r5 = r7.readLong()
            r2.cardId = r5
            java.lang.String r1 = r7.readString()
            if (r1 != 0) goto L_0x00ab
            goto L_0x00b2
        L_0x00ab:
            java.lang.Enum r1 = java.lang.Enum.valueOf(r4, r1)
            r3 = r1
            hd0.b r3 = (hd0.C24978b) r3
        L_0x00b2:
            r2.insAllow = r3
            long r3 = r7.readLong()
            r2.acctKey = r3
            java.lang.String r7 = r7.readString()
            r2.insuranceId = r7
            r8.mo97501f(r0, r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.model.cards.InsSecCard$$Parcelable.read(android.os.Parcel, org.parceler.a):ge.bog.mobilebank.model.cards.InsSecCard");
    }

    public static void write(InsSecCard insSecCard, Parcel parcel, int i, C42027a aVar) {
        String str;
        String str2;
        String str3;
        String str4;
        int c = aVar.mo97498c(insSecCard);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        parcel.writeInt(aVar.mo97500e(insSecCard));
        parcel.writeString(insSecCard.lastFour);
        parcel.writeString(insSecCard.dictionaryKey);
        C24978b bVar = insSecCard.sec3D;
        String str5 = null;
        if (bVar == null) {
            str = null;
        } else {
            str = bVar.name();
        }
        parcel.writeString(str);
        parcel.writeString(insSecCard.subProductCode);
        parcel.writeString(insSecCard.cardName);
        parcel.writeString(insSecCard.mobile);
        parcel.writeString(insSecCard.attachmentFileBase64);
        parcel.writeString(insSecCard.insuranceType);
        C24978b bVar2 = insSecCard.secAllow;
        if (bVar2 == null) {
            str2 = null;
        } else {
            str2 = bVar2.name();
        }
        parcel.writeString(str2);
        C24978b bVar3 = insSecCard.dgPassYN;
        if (bVar3 == null) {
            str3 = null;
        } else {
            str3 = bVar3.name();
        }
        parcel.writeString(str3);
        C24978b bVar4 = insSecCard.digipassAllow;
        if (bVar4 == null) {
            str4 = null;
        } else {
            str4 = bVar4.name();
        }
        parcel.writeString(str4);
        parcel.writeString(insSecCard.insuranceTypeKey);
        parcel.writeLong(insSecCard.cardId);
        C24978b bVar5 = insSecCard.insAllow;
        if (bVar5 != null) {
            str5 = bVar5.name();
        }
        parcel.writeString(str5);
        parcel.writeLong(insSecCard.acctKey);
        parcel.writeString(insSecCard.insuranceId);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        write(this.insSecCard$$0, parcel, i, new C42027a());
    }

    public InsSecCard getParcel() {
        return this.insSecCard$$0;
    }
}
