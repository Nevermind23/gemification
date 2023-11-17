package p341ge.bog.mobilebank.model.offers;

import android.os.Parcel;
import android.os.Parcelable;
import hd0.C24978b;
import java.math.BigDecimal;
import java.util.List;
import org.parceler.C42027a;
import org.parceler.C42034d;

/* renamed from: ge.bog.mobilebank.model.offers.LoanOfferDetails$$Parcelable */
public class LoanOfferDetails$$Parcelable implements Parcelable, C42034d {
    public static final Parcelable.Creator<LoanOfferDetails$$Parcelable> CREATOR = new Parcelable.Creator<LoanOfferDetails$$Parcelable>() {
        public LoanOfferDetails$$Parcelable createFromParcel(Parcel parcel) {
            return new LoanOfferDetails$$Parcelable(LoanOfferDetails$$Parcelable.read(parcel, new C42027a()));
        }

        public LoanOfferDetails$$Parcelable[] newArray(int i) {
            return new LoanOfferDetails$$Parcelable[i];
        }
    };
    private LoanOfferDetails loanOfferDetails$$0;

    public LoanOfferDetails$$Parcelable(LoanOfferDetails loanOfferDetails) {
        this.loanOfferDetails$$0 = loanOfferDetails;
    }

    /* JADX WARNING: type inference failed for: r1v43, types: [java.lang.Enum] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p341ge.bog.mobilebank.model.offers.LoanOfferDetails read(android.os.Parcel r7, org.parceler.C42027a r8) {
        /*
            int r0 = r7.readInt()
            boolean r1 = r8.mo97496a(r0)
            if (r1 == 0) goto L_0x001f
            boolean r7 = r8.mo97499d(r0)
            if (r7 != 0) goto L_0x0017
            java.lang.Object r7 = r8.mo97497b(r0)
            ge.bog.mobilebank.model.offers.LoanOfferDetails r7 = (p341ge.bog.mobilebank.model.offers.LoanOfferDetails) r7
            return r7
        L_0x0017:
            org.parceler.ParcelerRuntimeException r7 = new org.parceler.ParcelerRuntimeException
            java.lang.String r8 = "An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory."
            r7.<init>(r8)
            throw r7
        L_0x001f:
            int r1 = r8.mo97502g()
            ge.bog.mobilebank.model.offers.LoanOfferDetails r2 = new ge.bog.mobilebank.model.offers.LoanOfferDetails
            r2.<init>()
            r8.mo97501f(r1, r2)
            java.io.Serializable r1 = r7.readSerializable()
            java.math.BigDecimal r1 = (java.math.BigDecimal) r1
            r2.periodFee = r1
            int r1 = r7.readInt()
            r3 = 0
            if (r1 >= 0) goto L_0x003c
            r4 = r3
            goto L_0x0050
        L_0x003c:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r1)
            r5 = 0
        L_0x0042:
            if (r5 >= r1) goto L_0x0050
            java.io.Serializable r6 = r7.readSerializable()
            java.math.BigDecimal r6 = (java.math.BigDecimal) r6
            r4.add(r6)
            int r5 = r5 + 1
            goto L_0x0042
        L_0x0050:
            r2.loanAmounts = r4
            java.io.Serializable r1 = r7.readSerializable()
            java.math.BigDecimal r1 = (java.math.BigDecimal) r1
            r2.commissionRate = r1
            java.lang.String r1 = r7.readString()
            r2.extraCode = r1
            java.io.Serializable r1 = r7.readSerializable()
            java.math.BigDecimal r1 = (java.math.BigDecimal) r1
            r2.repayAmount = r1
            java.lang.String r1 = r7.readString()
            r2.repayCcy = r1
            long r4 = r7.readLong()
            r2.decNo = r4
            java.io.Serializable r1 = r7.readSerializable()
            java.math.BigDecimal r1 = (java.math.BigDecimal) r1
            r2.rate = r1
            java.io.Serializable r1 = r7.readSerializable()
            java.math.BigDecimal r1 = (java.math.BigDecimal) r1
            r2.pmt = r1
            java.lang.String r1 = r7.readString()
            r2.ccy = r1
            java.io.Serializable r1 = r7.readSerializable()
            java.math.BigDecimal r1 = (java.math.BigDecimal) r1
            r2.payCount = r1
            int r1 = r7.readInt()
            if (r1 >= 0) goto L_0x009a
            r1 = r3
            goto L_0x00a2
        L_0x009a:
            int r1 = r7.readInt()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
        L_0x00a2:
            r2.term = r1
            java.io.Serializable r1 = r7.readSerializable()
            java.math.BigDecimal r1 = (java.math.BigDecimal) r1
            r2.withAmount = r1
            java.lang.String r1 = r7.readString()
            java.lang.Class<hd0.b> r4 = hd0.C24978b.class
            if (r1 != 0) goto L_0x00b6
            r1 = r3
            goto L_0x00bc
        L_0x00b6:
            java.lang.Enum r1 = java.lang.Enum.valueOf(r4, r1)
            hd0.b r1 = (hd0.C24978b) r1
        L_0x00bc:
            r2.expressFlag = r1
            java.io.Serializable r1 = r7.readSerializable()
            java.math.BigDecimal r1 = (java.math.BigDecimal) r1
            r2.prePenalty = r1
            int r1 = r7.readInt()
            r2.maxTerm = r1
            java.io.Serializable r1 = r7.readSerializable()
            java.math.BigDecimal r1 = (java.math.BigDecimal) r1
            r2.amount = r1
            java.lang.String r1 = r7.readString()
            if (r1 != 0) goto L_0x00db
            goto L_0x00e2
        L_0x00db:
            java.lang.Enum r1 = java.lang.Enum.valueOf(r4, r1)
            r3 = r1
            hd0.b r3 = (hd0.C24978b) r3
        L_0x00e2:
            r2.insFlag = r3
            java.lang.String r1 = r7.readString()
            r2.decScheme = r1
            java.io.Serializable r1 = r7.readSerializable()
            java.math.BigDecimal r1 = (java.math.BigDecimal) r1
            r2.irr = r1
            java.lang.String r1 = r7.readString()
            r2.attachmentFileBase64 = r1
            java.lang.String r1 = r7.readString()
            r2.priOver = r1
            int r1 = r7.readInt()
            r2.minTerm = r1
            java.io.Serializable r1 = r7.readSerializable()
            java.math.BigDecimal r1 = (java.math.BigDecimal) r1
            r2.insAmount = r1
            java.lang.String r1 = r7.readString()
            r2.payDay = r1
            java.io.Serializable r1 = r7.readSerializable()
            java.math.BigDecimal r1 = (java.math.BigDecimal) r1
            r2.overdueOnetimeFine = r1
            java.io.Serializable r1 = r7.readSerializable()
            java.math.BigDecimal r1 = (java.math.BigDecimal) r1
            r2.commissionAmount = r1
            long r3 = r7.readLong()
            r2.payDate = r3
            r8.mo97501f(r0, r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.model.offers.LoanOfferDetails$$Parcelable.read(android.os.Parcel, org.parceler.a):ge.bog.mobilebank.model.offers.LoanOfferDetails");
    }

    public static void write(LoanOfferDetails loanOfferDetails, Parcel parcel, int i, C42027a aVar) {
        String str;
        int c = aVar.mo97498c(loanOfferDetails);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        parcel.writeInt(aVar.mo97500e(loanOfferDetails));
        parcel.writeSerializable(loanOfferDetails.periodFee);
        List<BigDecimal> list = loanOfferDetails.loanAmounts;
        if (list == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(list.size());
            for (BigDecimal writeSerializable : loanOfferDetails.loanAmounts) {
                parcel.writeSerializable(writeSerializable);
            }
        }
        parcel.writeSerializable(loanOfferDetails.commissionRate);
        parcel.writeString(loanOfferDetails.extraCode);
        parcel.writeSerializable(loanOfferDetails.repayAmount);
        parcel.writeString(loanOfferDetails.repayCcy);
        parcel.writeLong(loanOfferDetails.decNo);
        parcel.writeSerializable(loanOfferDetails.rate);
        parcel.writeSerializable(loanOfferDetails.pmt);
        parcel.writeString(loanOfferDetails.ccy);
        parcel.writeSerializable(loanOfferDetails.payCount);
        if (loanOfferDetails.term == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(loanOfferDetails.term.intValue());
        }
        parcel.writeSerializable(loanOfferDetails.withAmount);
        C24978b bVar = loanOfferDetails.expressFlag;
        String str2 = null;
        if (bVar == null) {
            str = null;
        } else {
            str = bVar.name();
        }
        parcel.writeString(str);
        parcel.writeSerializable(loanOfferDetails.prePenalty);
        parcel.writeInt(loanOfferDetails.maxTerm);
        parcel.writeSerializable(loanOfferDetails.amount);
        C24978b bVar2 = loanOfferDetails.insFlag;
        if (bVar2 != null) {
            str2 = bVar2.name();
        }
        parcel.writeString(str2);
        parcel.writeString(loanOfferDetails.decScheme);
        parcel.writeSerializable(loanOfferDetails.irr);
        parcel.writeString(loanOfferDetails.attachmentFileBase64);
        parcel.writeString(loanOfferDetails.priOver);
        parcel.writeInt(loanOfferDetails.minTerm);
        parcel.writeSerializable(loanOfferDetails.insAmount);
        parcel.writeString(loanOfferDetails.payDay);
        parcel.writeSerializable(loanOfferDetails.overdueOnetimeFine);
        parcel.writeSerializable(loanOfferDetails.commissionAmount);
        parcel.writeLong(loanOfferDetails.payDate);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        write(this.loanOfferDetails$$0, parcel, i, new C42027a());
    }

    public LoanOfferDetails getParcel() {
        return this.loanOfferDetails$$0;
    }
}
