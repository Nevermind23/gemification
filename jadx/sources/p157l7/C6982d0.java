package p157l7;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.firstparty.RetrieveInAppPaymentCredentialResponse;
import com.google.android.gms.tapandpay.firstparty.zzab;
import com.google.android.gms.tapandpay.firstparty.zzad;
import com.google.android.gms.tapandpay.firstparty.zzap;
import com.google.android.gms.tapandpay.firstparty.zzg;
import com.google.android.gms.tapandpay.firstparty.zzj;
import com.google.android.gms.tapandpay.firstparty.zzl;
import com.google.android.gms.tapandpay.firstparty.zzn;
import com.google.android.gms.tapandpay.firstparty.zzp;
import com.google.android.gms.tapandpay.firstparty.zzr;
import com.google.android.gms.tapandpay.firstparty.zzt;
import com.google.android.gms.tapandpay.firstparty.zzv;
import com.google.android.gms.tapandpay.firstparty.zzx;
import com.google.android.gms.tapandpay.firstparty.zzz;
import com.google.android.gms.tapandpay.globalactions.GetGlobalActionCardsResponse;
import com.google.android.gms.tapandpay.issuer.PushProvisionSessionContext;
import com.google.android.gms.tapandpay.issuer.TokenInfo;
import com.google.android.gms.tapandpay.issuer.TokenStatus;
import com.google.android.gms.tapandpay.quickaccesswallet.QuickAccessWalletConfig;

/* renamed from: l7.d0 */
public abstract class C6982d0 extends C7012y implements C6984e0 {
    public C6982d0() {
        super("com.google.android.gms.tapandpay.internal.ITapAndPayServiceCallbacks");
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final boolean mo21123k(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 2:
                C6978b0.m27004b(parcel);
                mo21145a1((Status) C6978b0.m27003a(parcel, Status.CREATOR));
                return true;
            case 3:
                C6978b0.m27004b(parcel);
                mo21122k1((Status) C6978b0.m27003a(parcel, Status.CREATOR), (Bundle) C6978b0.m27003a(parcel, Bundle.CREATOR));
                return true;
            case 4:
                C6978b0.m27004b(parcel);
                mo21158p0((Status) C6978b0.m27003a(parcel, Status.CREATOR), (zzp) C6978b0.m27003a(parcel, zzp.CREATOR));
                return true;
            case 5:
                C6978b0.m27004b(parcel);
                mo21138P0((Status) C6978b0.m27003a(parcel, Status.CREATOR));
                return true;
            case 6:
                C6978b0.m27004b(parcel);
                mo21151j1((Status) C6978b0.m27003a(parcel, Status.CREATOR));
                return true;
            case 8:
                C6978b0.m27004b(parcel);
                mo21134G0((Status) C6978b0.m27003a(parcel, Status.CREATOR), (zzj) C6978b0.m27003a(parcel, zzj.CREATOR));
                return true;
            case 9:
                C6978b0.m27004b(parcel);
                mo21144Z0((Status) C6978b0.m27003a(parcel, Status.CREATOR));
                return true;
            case 10:
                mo21160q();
                return true;
            case 11:
                boolean e = C6978b0.m27007e(parcel);
                C6978b0.m27004b(parcel);
                mo21156n0((Status) C6978b0.m27003a(parcel, Status.CREATOR), e);
                return true;
            case 12:
                C6978b0.m27004b(parcel);
                mo21132F0((Status) C6978b0.m27003a(parcel, Status.CREATOR));
                return true;
            case 13:
                boolean e2 = C6978b0.m27007e(parcel);
                C6978b0.m27004b(parcel);
                mo21164t2((Status) C6978b0.m27003a(parcel, Status.CREATOR), e2);
                return true;
            case 14:
                C6978b0.m27004b(parcel);
                mo21171z2((Status) C6978b0.m27003a(parcel, Status.CREATOR));
                return true;
            case 15:
                C6978b0.m27004b(parcel);
                mo21163s1((Status) C6978b0.m27003a(parcel, Status.CREATOR), (zzl) C6978b0.m27003a(parcel, zzl.CREATOR));
                return true;
            case 17:
                C6978b0.m27004b(parcel);
                mo21149g1((Status) C6978b0.m27003a(parcel, Status.CREATOR), (RetrieveInAppPaymentCredentialResponse) C6978b0.m27003a(parcel, RetrieveInAppPaymentCredentialResponse.CREATOR));
                return true;
            case 18:
                String readString = parcel.readString();
                C6978b0.m27004b(parcel);
                mo21136L0((Status) C6978b0.m27003a(parcel, Status.CREATOR), readString);
                return true;
            case 19:
                String readString2 = parcel.readString();
                C6978b0.m27004b(parcel);
                mo21131D((Status) C6978b0.m27003a(parcel, Status.CREATOR), readString2);
                return true;
            case 20:
                C6978b0.m27004b(parcel);
                mo21162r2((Status) C6978b0.m27003a(parcel, Status.CREATOR), (TokenStatus) C6978b0.m27003a(parcel, TokenStatus.CREATOR));
                return true;
            case 21:
                boolean e3 = C6978b0.m27007e(parcel);
                C6978b0.m27004b(parcel);
                mo21147e0((Status) C6978b0.m27003a(parcel, Status.CREATOR), e3);
                return true;
            case 22:
                C6978b0.m27004b(parcel);
                mo21170y1((Status) C6978b0.m27003a(parcel, Status.CREATOR));
                return true;
            case 23:
                String readString3 = parcel.readString();
                C6978b0.m27004b(parcel);
                mo21113p1((Status) C6978b0.m27003a(parcel, Status.CREATOR), readString3);
                return true;
            case 24:
                String readString4 = parcel.readString();
                C6978b0.m27004b(parcel);
                mo21161r1((Status) C6978b0.m27003a(parcel, Status.CREATOR), readString4);
                return true;
            case 25:
                C6978b0.m27004b(parcel);
                mo21152k0((Status) C6978b0.m27003a(parcel, Status.CREATOR));
                return true;
            case 27:
                C6978b0.m27004b(parcel);
                mo21133G((Status) C6978b0.m27003a(parcel, Status.CREATOR), (zzad) C6978b0.m27003a(parcel, zzad.CREATOR));
                return true;
            case 28:
                C6978b0.m27004b(parcel);
                mo21142S0((Status) C6978b0.m27003a(parcel, Status.CREATOR), (zzz) C6978b0.m27003a(parcel, zzz.CREATOR));
                return true;
            case 29:
                C6978b0.m27004b(parcel);
                mo21167v1((Status) C6978b0.m27003a(parcel, Status.CREATOR));
                return true;
            case 30:
                C6978b0.m27004b(parcel);
                mo21143Y0((Status) C6978b0.m27003a(parcel, Status.CREATOR), (zzr) C6978b0.m27003a(parcel, zzr.CREATOR));
                return true;
            case 31:
                C6978b0.m27004b(parcel);
                mo21169x2((Status) C6978b0.m27003a(parcel, Status.CREATOR), (zzn) C6978b0.m27003a(parcel, zzn.CREATOR));
                return true;
            case 35:
                C6978b0.m27004b(parcel);
                mo21150j0((Status) C6978b0.m27003a(parcel, Status.CREATOR), (zzab) C6978b0.m27003a(parcel, zzab.CREATOR));
                return true;
            case 38:
                C6978b0.m27004b(parcel);
                mo21153m0((Status) C6978b0.m27003a(parcel, Status.CREATOR));
                return true;
            case 39:
                C6978b0.m27004b(parcel);
                mo21157n2((Status) C6978b0.m27003a(parcel, Status.CREATOR), (zzv) C6978b0.m27003a(parcel, zzv.CREATOR));
                return true;
            case 40:
                C6978b0.m27004b(parcel);
                mo21140R0((Status) C6978b0.m27003a(parcel, Status.CREATOR));
                return true;
            case 41:
                C6978b0.m27004b(parcel);
                mo21166u2((Status) C6978b0.m27003a(parcel, Status.CREATOR), (zzap) C6978b0.m27003a(parcel, zzap.CREATOR));
                return true;
            case 42:
                C6978b0.m27004b(parcel);
                mo21155m2((Status) C6978b0.m27003a(parcel, Status.CREATOR), (GetGlobalActionCardsResponse) C6978b0.m27003a(parcel, GetGlobalActionCardsResponse.CREATOR));
                return true;
            case 43:
                String readString5 = parcel.readString();
                C6978b0.m27004b(parcel);
                mo21141S((Status) C6978b0.m27003a(parcel, Status.CREATOR), readString5);
                return true;
            case 44:
                C6978b0.m27004b(parcel);
                mo21168x1((Status) C6978b0.m27003a(parcel, Status.CREATOR));
                return true;
            case 45:
                C6978b0.m27004b(parcel);
                mo21135J1((Status) C6978b0.m27003a(parcel, Status.CREATOR));
                return true;
            case 46:
                C6978b0.m27004b(parcel);
                mo21165u0((Status) C6978b0.m27003a(parcel, Status.CREATOR), (zzx) C6978b0.m27003a(parcel, zzx.CREATOR));
                return true;
            case 47:
                C6978b0.m27004b(parcel);
                mo21146a2((Status) C6978b0.m27003a(parcel, Status.CREATOR), (QuickAccessWalletConfig) C6978b0.m27003a(parcel, QuickAccessWalletConfig.CREATOR));
                return true;
            case 48:
                C6978b0.m27004b(parcel);
                mo21139Q1((Status) C6978b0.m27003a(parcel, Status.CREATOR), (zzt) C6978b0.m27003a(parcel, zzt.CREATOR));
                return true;
            case 49:
                boolean e4 = C6978b0.m27007e(parcel);
                C6978b0.m27004b(parcel);
                mo21137N1((Status) C6978b0.m27003a(parcel, Status.CREATOR), e4);
                return true;
            case 50:
                C6978b0.m27004b(parcel);
                mo21114A0((Status) C6978b0.m27003a(parcel, Status.CREATOR), (TokenInfo[]) parcel.createTypedArray(TokenInfo.CREATOR));
                return true;
            case 51:
                C6978b0.m27004b(parcel);
                mo21148f1((Status) C6978b0.m27003a(parcel, Status.CREATOR), (zzg) C6978b0.m27003a(parcel, zzg.CREATOR));
                return true;
            case 52:
                byte[] createByteArray = parcel.createByteArray();
                C6978b0.m27004b(parcel);
                mo21154m1((Status) C6978b0.m27003a(parcel, Status.CREATOR), createByteArray);
                return true;
            case 53:
                C6978b0.m27004b(parcel);
                mo21159p2((Status) C6978b0.m27003a(parcel, Status.CREATOR), (PushProvisionSessionContext) C6978b0.m27003a(parcel, PushProvisionSessionContext.CREATOR));
                return true;
            default:
                return false;
        }
    }
}
