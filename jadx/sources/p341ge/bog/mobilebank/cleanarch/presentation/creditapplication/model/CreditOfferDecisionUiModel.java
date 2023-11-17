package p341ge.bog.mobilebank.cleanarch.presentation.creditapplication.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.creditapplication.model.CreditOfferDecisionUiModel */
public final class CreditOfferDecisionUiModel implements Parcelable {
    public static final Parcelable.Creator<CreditOfferDecisionUiModel> CREATOR = new C21686a();

    /* renamed from: d */
    private CreditOfferUiModel f57866d;

    /* renamed from: e */
    private ArrayList f57867e;

    /* renamed from: f */
    private CreditCardOfferDetailsUiModel f57868f;

    /* renamed from: g */
    private Integer f57869g;

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.creditapplication.model.CreditOfferDecisionUiModel$a */
    public static final class C21686a implements Parcelable.Creator {
        /* renamed from: a */
        public final CreditOfferDecisionUiModel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            C41536l.m120489i(parcel, "parcel");
            CreditOfferUiModel createFromParcel = CreditOfferUiModel.CREATOR.createFromParcel(parcel);
            Integer num = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList.add(CreditOfferRefinanceUiModel.CREATOR.createFromParcel(parcel));
                }
            }
            CreditCardOfferDetailsUiModel createFromParcel2 = CreditCardOfferDetailsUiModel.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                num = Integer.valueOf(parcel.readInt());
            }
            return new CreditOfferDecisionUiModel(createFromParcel, arrayList, createFromParcel2, num);
        }

        /* renamed from: b */
        public final CreditOfferDecisionUiModel[] newArray(int i) {
            return new CreditOfferDecisionUiModel[i];
        }
    }

    public CreditOfferDecisionUiModel(CreditOfferUiModel creditOfferUiModel, ArrayList arrayList, CreditCardOfferDetailsUiModel creditCardOfferDetailsUiModel, Integer num) {
        C41536l.m120489i(creditOfferUiModel, "cardInfo");
        C41536l.m120489i(creditCardOfferDetailsUiModel, "details");
        this.f57866d = creditOfferUiModel;
        this.f57867e = arrayList;
        this.f57868f = creditCardOfferDetailsUiModel;
        this.f57869g = num;
    }

    /* renamed from: b */
    public static /* synthetic */ CreditOfferDecisionUiModel m70140b(CreditOfferDecisionUiModel creditOfferDecisionUiModel, CreditOfferUiModel creditOfferUiModel, ArrayList arrayList, CreditCardOfferDetailsUiModel creditCardOfferDetailsUiModel, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            creditOfferUiModel = creditOfferDecisionUiModel.f57866d;
        }
        if ((i & 2) != 0) {
            arrayList = creditOfferDecisionUiModel.f57867e;
        }
        if ((i & 4) != 0) {
            creditCardOfferDetailsUiModel = creditOfferDecisionUiModel.f57868f;
        }
        if ((i & 8) != 0) {
            num = creditOfferDecisionUiModel.f57869g;
        }
        return creditOfferDecisionUiModel.mo54061a(creditOfferUiModel, arrayList, creditCardOfferDetailsUiModel, num);
    }

    /* renamed from: a */
    public final CreditOfferDecisionUiModel mo54061a(CreditOfferUiModel creditOfferUiModel, ArrayList arrayList, CreditCardOfferDetailsUiModel creditCardOfferDetailsUiModel, Integer num) {
        C41536l.m120489i(creditOfferUiModel, "cardInfo");
        C41536l.m120489i(creditCardOfferDetailsUiModel, "details");
        return new CreditOfferDecisionUiModel(creditOfferUiModel, arrayList, creditCardOfferDetailsUiModel, num);
    }

    /* renamed from: d */
    public final CreditOfferUiModel mo54062d() {
        return this.f57866d;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final CreditCardOfferDetailsUiModel mo54064e() {
        return this.f57868f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreditOfferDecisionUiModel)) {
            return false;
        }
        CreditOfferDecisionUiModel creditOfferDecisionUiModel = (CreditOfferDecisionUiModel) obj;
        return C41536l.m120484d(this.f57866d, creditOfferDecisionUiModel.f57866d) && C41536l.m120484d(this.f57867e, creditOfferDecisionUiModel.f57867e) && C41536l.m120484d(this.f57868f, creditOfferDecisionUiModel.f57868f) && C41536l.m120484d(this.f57869g, creditOfferDecisionUiModel.f57869g);
    }

    /* renamed from: f */
    public final ArrayList mo54066f() {
        return this.f57867e;
    }

    /* renamed from: g */
    public final void mo54067g(CreditCardOfferDetailsUiModel creditCardOfferDetailsUiModel) {
        C41536l.m120489i(creditCardOfferDetailsUiModel, "<set-?>");
        this.f57868f = creditCardOfferDetailsUiModel;
    }

    public int hashCode() {
        int hashCode = this.f57866d.hashCode() * 31;
        ArrayList arrayList = this.f57867e;
        int i = 0;
        int hashCode2 = (((hashCode + (arrayList == null ? 0 : arrayList.hashCode())) * 31) + this.f57868f.hashCode()) * 31;
        Integer num = this.f57869g;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        CreditOfferUiModel creditOfferUiModel = this.f57866d;
        ArrayList arrayList = this.f57867e;
        CreditCardOfferDetailsUiModel creditCardOfferDetailsUiModel = this.f57868f;
        Integer num = this.f57869g;
        return "CreditOfferDecisionUiModel(cardInfo=" + creditOfferUiModel + ", refinanceInfo=" + arrayList + ", details=" + creditCardOfferDetailsUiModel + ", responseCode=" + num + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        this.f57866d.writeToParcel(parcel, i);
        ArrayList arrayList = this.f57867e;
        if (arrayList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((CreditOfferRefinanceUiModel) it.next()).writeToParcel(parcel, i);
            }
        }
        this.f57868f.writeToParcel(parcel, i);
        Integer num = this.f57869g;
        if (num == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(num.intValue());
    }
}
