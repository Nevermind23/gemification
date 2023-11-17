package p341ge.bog.mobilebank.model.bonus;

import android.os.Parcel;
import android.os.Parcelable;
import org.parceler.C42027a;
import org.parceler.C42034d;

/* renamed from: ge.bog.mobilebank.model.bonus.BonusPrize$$Parcelable */
public class BonusPrize$$Parcelable implements Parcelable, C42034d {
    public static final Parcelable.Creator<BonusPrize$$Parcelable> CREATOR = new Parcelable.Creator<BonusPrize$$Parcelable>() {
        public BonusPrize$$Parcelable createFromParcel(Parcel parcel) {
            return new BonusPrize$$Parcelable(BonusPrize$$Parcelable.read(parcel, new C42027a()));
        }

        public BonusPrize$$Parcelable[] newArray(int i) {
            return new BonusPrize$$Parcelable[i];
        }
    };
    private BonusPrize bonusPrize$$0;

    public BonusPrize$$Parcelable(BonusPrize bonusPrize) {
        this.bonusPrize$$0 = bonusPrize;
    }

    /* JADX WARNING: type inference failed for: r6v2, types: [java.lang.Enum] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p341ge.bog.mobilebank.model.bonus.BonusPrize read(android.os.Parcel r6, org.parceler.C42027a r7) {
        /*
            int r0 = r6.readInt()
            boolean r1 = r7.mo97496a(r0)
            if (r1 == 0) goto L_0x001f
            boolean r6 = r7.mo97499d(r0)
            if (r6 != 0) goto L_0x0017
            java.lang.Object r6 = r7.mo97497b(r0)
            ge.bog.mobilebank.model.bonus.BonusPrize r6 = (p341ge.bog.mobilebank.model.bonus.BonusPrize) r6
            return r6
        L_0x0017:
            org.parceler.ParcelerRuntimeException r6 = new org.parceler.ParcelerRuntimeException
            java.lang.String r7 = "An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory."
            r6.<init>(r7)
            throw r6
        L_0x001f:
            int r1 = r7.mo97502g()
            ge.bog.mobilebank.model.bonus.BonusPrize r2 = new ge.bog.mobilebank.model.bonus.BonusPrize
            r2.<init>()
            r7.mo97501f(r1, r2)
            java.lang.String r1 = r6.readString()
            r2.prizeDesc = r1
            java.lang.String r1 = r6.readString()
            r2.industryName = r1
            long r3 = r6.readLong()
            r2.finalDate = r3
            java.lang.String r1 = r6.readString()
            r2.prizeOrderNumber = r1
            java.lang.String r1 = r6.readString()
            r2.attachmentFileBase64 = r1
            int r1 = r6.readInt()
            r2.totalCount = r1
            long r3 = r6.readLong()
            r2.prizeNumber = r3
            long r3 = r6.readLong()
            r2.prizeNo = r3
            java.lang.String r1 = r6.readString()
            r2.industryAddress = r1
            java.lang.String r1 = r6.readString()
            r2.prizeName = r1
            java.lang.String r1 = r6.readString()
            r2.industryWebsite = r1
            java.lang.String r1 = r6.readString()
            r2.industryInformation = r1
            java.lang.String r1 = r6.readString()
            r2.prizeCode = r1
            long r3 = r6.readLong()
            r2.prizeCost = r3
            java.lang.String r1 = r6.readString()
            r3 = 0
            if (r1 != 0) goto L_0x0088
            r1 = r3
            goto L_0x0090
        L_0x0088:
            java.lang.Class<ge.bog.mobilebank.model.bonus.BonusType> r4 = p341ge.bog.mobilebank.model.bonus.BonusType.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r4, r1)
            ge.bog.mobilebank.model.bonus.BonusType r1 = (p341ge.bog.mobilebank.model.bonus.BonusType) r1
        L_0x0090:
            r2.bonusType = r1
            long r4 = r6.readLong()
            r2.orderDate = r4
            java.lang.String r1 = r6.readString()
            r2.industryPhoneNumber = r1
            int r1 = r6.readInt()
            r2.categoryId = r1
            java.lang.String r6 = r6.readString()
            if (r6 != 0) goto L_0x00ab
            goto L_0x00b4
        L_0x00ab:
            java.lang.Class<ge.bog.mobilebank.model.bonus.BonusPrizeStatus> r1 = p341ge.bog.mobilebank.model.bonus.BonusPrizeStatus.class
            java.lang.Enum r6 = java.lang.Enum.valueOf(r1, r6)
            r3 = r6
            ge.bog.mobilebank.model.bonus.BonusPrizeStatus r3 = (p341ge.bog.mobilebank.model.bonus.BonusPrizeStatus) r3
        L_0x00b4:
            r2.status = r3
            r7.mo97501f(r0, r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.model.bonus.BonusPrize$$Parcelable.read(android.os.Parcel, org.parceler.a):ge.bog.mobilebank.model.bonus.BonusPrize");
    }

    public static void write(BonusPrize bonusPrize, Parcel parcel, int i, C42027a aVar) {
        String str;
        int c = aVar.mo97498c(bonusPrize);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        parcel.writeInt(aVar.mo97500e(bonusPrize));
        parcel.writeString(bonusPrize.prizeDesc);
        parcel.writeString(bonusPrize.industryName);
        parcel.writeLong(bonusPrize.finalDate);
        parcel.writeString(bonusPrize.prizeOrderNumber);
        parcel.writeString(bonusPrize.attachmentFileBase64);
        parcel.writeInt(bonusPrize.totalCount);
        parcel.writeLong(bonusPrize.prizeNumber);
        parcel.writeLong(bonusPrize.prizeNo);
        parcel.writeString(bonusPrize.industryAddress);
        parcel.writeString(bonusPrize.prizeName);
        parcel.writeString(bonusPrize.industryWebsite);
        parcel.writeString(bonusPrize.industryInformation);
        parcel.writeString(bonusPrize.prizeCode);
        parcel.writeLong(bonusPrize.prizeCost);
        BonusType bonusType = bonusPrize.bonusType;
        String str2 = null;
        if (bonusType == null) {
            str = null;
        } else {
            str = bonusType.name();
        }
        parcel.writeString(str);
        parcel.writeLong(bonusPrize.orderDate);
        parcel.writeString(bonusPrize.industryPhoneNumber);
        parcel.writeInt(bonusPrize.categoryId);
        BonusPrizeStatus bonusPrizeStatus = bonusPrize.status;
        if (bonusPrizeStatus != null) {
            str2 = bonusPrizeStatus.name();
        }
        parcel.writeString(str2);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        write(this.bonusPrize$$0, parcel, i, new C42027a());
    }

    public BonusPrize getParcel() {
        return this.bonusPrize$$0;
    }
}
