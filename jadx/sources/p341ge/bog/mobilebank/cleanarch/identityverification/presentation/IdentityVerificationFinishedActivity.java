package p341ge.bog.mobilebank.cleanarch.identityverification.presentation;

import a81.C30772sa;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.core.content.C0767a;
import androidx.core.content.res.C0808h;
import g91.C32343x;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p060e1.C5893c;
import p060e1.C5958l0;
import p341ge.bog.mobilebank.cleanarch.lookup.presenttation.model.LookupUiModel;
import p366bk.C10318g;
import p366bk.C10320i;
import p366bk.C10321j;
import p366bk.C10322k;
import p366bk.C10324m;
import p90.C27324i0;

/* renamed from: ge.bog.mobilebank.cleanarch.identityverification.presentation.IdentityVerificationFinishedActivity */
public final class IdentityVerificationFinishedActivity extends C30772sa {

    /* renamed from: J */
    public static final C21074a f56580J = new C21074a((DefaultConstructorMarker) null);

    /* renamed from: F */
    private C27324i0 f56581F;

    /* renamed from: G */
    private final Handler f56582G = new Handler();

    /* renamed from: H */
    private final Runnable f56583H = new C21079e(this);

    /* renamed from: I */
    private HashMap f56584I;

    /* renamed from: ge.bog.mobilebank.cleanarch.identityverification.presentation.IdentityVerificationFinishedActivity$LookupData */
    private static final class LookupData implements Parcelable {
        public static final Parcelable.Creator<LookupData> CREATOR = new C21073a();

        /* renamed from: d */
        private final HashMap f56585d;

        /* renamed from: ge.bog.mobilebank.cleanarch.identityverification.presentation.IdentityVerificationFinishedActivity$LookupData$a */
        public static final class C21073a implements Parcelable.Creator {
            /* renamed from: a */
            public final LookupData createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                int readInt = parcel.readInt();
                HashMap hashMap = new HashMap(readInt);
                for (int i = 0; i != readInt; i++) {
                    hashMap.put(parcel.readString(), LookupUiModel.CREATOR.createFromParcel(parcel));
                }
                return new LookupData(hashMap);
            }

            /* renamed from: b */
            public final LookupData[] newArray(int i) {
                return new LookupData[i];
            }
        }

        public LookupData(HashMap hashMap) {
            C41536l.m120489i(hashMap, "data");
            this.f56585d = hashMap;
        }

        /* renamed from: a */
        public final HashMap mo52268a() {
            return this.f56585d;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LookupData) && C41536l.m120484d(this.f56585d, ((LookupData) obj).f56585d);
        }

        public int hashCode() {
            return this.f56585d.hashCode();
        }

        public String toString() {
            HashMap hashMap = this.f56585d;
            return "LookupData(data=" + hashMap + ")";
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            HashMap hashMap = this.f56585d;
            parcel.writeInt(hashMap.size());
            for (Map.Entry entry : hashMap.entrySet()) {
                parcel.writeString((String) entry.getKey());
                ((LookupUiModel) entry.getValue()).writeToParcel(parcel, i);
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.identityverification.presentation.IdentityVerificationFinishedActivity$a */
    public static final class C21074a {
        private C21074a() {
        }

        public /* synthetic */ C21074a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo52278a(Context context, HashMap hashMap) {
            C41536l.m120489i(context, "context");
            C41536l.m120489i(hashMap, "lookUpData");
            Intent intent = new Intent(context, IdentityVerificationFinishedActivity.class);
            intent.putExtra("EXTRA_LOOKUP_DATA", new LookupData(hashMap));
            intent.addFlags(65536);
            context.startActivity(intent);
        }
    }

    /* renamed from: G2 */
    private final void m68185G2() {
        C27324i0 i0Var = this.f56581F;
        if (i0Var == null) {
            C41536l.m120506z("binding");
            i0Var = null;
        }
        C5893c cVar = new C5893c();
        cVar.mo19350p0(250);
        C5958l0.m23911b(i0Var.f68931r, cVar);
        i0Var.f68936w.setBackgroundResource(C10320i.identity_verification_icon_rounded_green);
        i0Var.f68934u.setImageResource(C10320i.f28702ya);
        i0Var.f68934u.setColorFilter(C0767a.m2893c(this, C10318g.f28640b1));
        i0Var.f68912A.setTextSize(2, 14.0f);
        i0Var.f68912A.setTypeface(C0808h.m3033h(this, C10321j.bog_semi_bold));
        i0Var.f68912A.setTextColor(C0767a.m2893c(this, C10318g.color_invert_component_tr_300));
        i0Var.f68915D.setVisibility(0);
        i0Var.f68923j.setVisibility(8);
        i0Var.f68920g.setVisibility(8);
    }

    /* access modifiers changed from: private */
    /* renamed from: H2 */
    public static final void m68186H2(IdentityVerificationFinishedActivity identityVerificationFinishedActivity) {
        C41536l.m120489i(identityVerificationFinishedActivity, "this$0");
        identityVerificationFinishedActivity.m68185G2();
    }

    /* renamed from: I2 */
    private final boolean m68187I2() {
        C27324i0 i0Var = this.f56581F;
        C27324i0 i0Var2 = null;
        if (i0Var == null) {
            C41536l.m120506z("binding");
            i0Var = null;
        }
        HashMap hashMap = this.f56584I;
        if (hashMap != null) {
            LookupUiModel lookupUiModel = (LookupUiModel) hashMap.get("HOME_REDIRECT_BUTTON");
            if (lookupUiModel != null) {
                i0Var.f68918e.setButtonText(C32343x.m95388F(lookupUiModel.mo52391a(), new Object[0]));
            }
            LookupUiModel lookupUiModel2 = (LookupUiModel) hashMap.get("CANCEL_AUTHORIZATION_BUTTON");
            if (lookupUiModel2 != null) {
                i0Var.f68920g.setButtonText(C32343x.m95388F(lookupUiModel2.mo52391a(), new Object[0]));
            }
            LookupUiModel lookupUiModel3 = (LookupUiModel) hashMap.get("PAGE_HEADER_TEXT");
            if (lookupUiModel3 != null) {
                i0Var.f68939z.setText(C32343x.m95388F(lookupUiModel3.mo52391a(), new Object[0]));
            }
            LookupUiModel lookupUiModel4 = (LookupUiModel) hashMap.get("AUTHORIZE_USER");
            if (lookupUiModel4 != null) {
                i0Var.f68912A.setText(C32343x.m95388F(lookupUiModel4.mo52391a(), new Object[0]));
            }
            LookupUiModel lookupUiModel5 = (LookupUiModel) hashMap.get("AUTHORIZATION_SUCCESS");
            if (lookupUiModel5 != null) {
                i0Var.f68913B.setText(C32343x.m95388F(lookupUiModel5.mo52391a(), new Object[0]));
            }
            LookupUiModel lookupUiModel6 = (LookupUiModel) hashMap.get("INFO4");
            if (lookupUiModel6 != null) {
                i0Var.f68914C.setText(C32343x.m95388F(lookupUiModel6.mo52391a(), new Object[0]));
            }
            i0Var.f68923j.setTitle(C32343x.m95388F("online.inst.authorization.page.details.label", new Object[0]));
        }
        C27324i0 i0Var3 = this.f56581F;
        if (i0Var3 == null) {
            C41536l.m120506z("binding");
        } else {
            i0Var2 = i0Var3;
        }
        i0Var2.f68918e.setOnClickListener(new C21080f(this));
        return this.f56582G.postDelayed(this.f56583H, 50);
    }

    /* access modifiers changed from: private */
    /* renamed from: J2 */
    public static final void m68188J2(IdentityVerificationFinishedActivity identityVerificationFinishedActivity, View view) {
        C41536l.m120489i(identityVerificationFinishedActivity, "this$0");
        identityVerificationFinishedActivity.onBackPressed();
    }

    /* access modifiers changed from: protected */
    /* renamed from: M1 */
    public int mo49479M1() {
        return C10324m.activity_identity_verification;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        HashMap hashMap;
        super.mo37451O1(bundle);
        C27324i0 a = C27324i0.m84603a(findViewById(C10322k.f28864lt));
        C41536l.m120488h(a, "bind(findViewById(R.id.root))");
        this.f56581F = a;
        LookupData lookupData = (LookupData) getIntent().getParcelableExtra("EXTRA_LOOKUP_DATA");
        if (lookupData != null) {
            hashMap = lookupData.mo52268a();
        } else {
            hashMap = null;
        }
        this.f56584I = hashMap;
        m68187I2();
    }

    public void onBackPressed() {
        finish();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        this.f56582G.removeCallbacks(this.f56583H);
    }
}
