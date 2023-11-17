package p341ge.bog.mobilebank.gamification.presentation.dialog;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.core.view.C1200m3;
import fh0.C20486b;
import g91.C32343x;
import he1.C41217g;
import he1.C41224m;
import he1.C41233s;
import i10.C25100c;
import ih0.C25210c;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o31.C37613p;
import p341ge.bog.mobilebank.p975ui.activities.C35388f2;
import q31.C38125h;
import ue1.C43064a;

/* renamed from: ge.bog.mobilebank.gamification.presentation.dialog.GamificationPreLoginFinalsActivity */
public final class GamificationPreLoginFinalsActivity extends C35388f2 {

    /* renamed from: H */
    public static final C24048a f62377H = new C24048a((DefaultConstructorMarker) null);

    /* renamed from: F */
    private final C41217g f62378F = C41219i.m119470b(new C24049b(this));

    /* renamed from: G */
    private final C41217g f62379G = C41219i.m119470b(new C24050c(this));

    /* renamed from: ge.bog.mobilebank.gamification.presentation.dialog.GamificationPreLoginFinalsActivity$GamificationPreLoginDialogData */
    private static final class GamificationPreLoginDialogData implements Parcelable {
        public static final Parcelable.Creator<GamificationPreLoginDialogData> CREATOR = new C24047a();

        /* renamed from: d */
        private final String f62380d;

        /* renamed from: e */
        private final String f62381e;

        /* renamed from: f */
        private final String f62382f;

        /* renamed from: g */
        private final String f62383g;

        /* renamed from: ge.bog.mobilebank.gamification.presentation.dialog.GamificationPreLoginFinalsActivity$GamificationPreLoginDialogData$a */
        public static final class C24047a implements Parcelable.Creator {
            /* renamed from: a */
            public final GamificationPreLoginDialogData createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                return new GamificationPreLoginDialogData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* renamed from: b */
            public final GamificationPreLoginDialogData[] newArray(int i) {
                return new GamificationPreLoginDialogData[i];
            }
        }

        public GamificationPreLoginDialogData(String str, String str2, String str3, String str4) {
            C41536l.m120489i(str, "titleKey");
            C41536l.m120489i(str2, "bannerMessageKey");
            C41536l.m120489i(str3, "bannerButtonKey");
            this.f62380d = str;
            this.f62381e = str2;
            this.f62382f = str3;
            this.f62383g = str4;
        }

        /* renamed from: a */
        public final String mo61055a() {
            return this.f62382f;
        }

        /* renamed from: b */
        public final String mo61056b() {
            return this.f62381e;
        }

        /* renamed from: d */
        public final String mo61057d() {
            return this.f62380d;
        }

        public int describeContents() {
            return 0;
        }

        /* renamed from: e */
        public final String mo61059e() {
            return this.f62383g;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GamificationPreLoginDialogData)) {
                return false;
            }
            GamificationPreLoginDialogData gamificationPreLoginDialogData = (GamificationPreLoginDialogData) obj;
            return C41536l.m120484d(this.f62380d, gamificationPreLoginDialogData.f62380d) && C41536l.m120484d(this.f62381e, gamificationPreLoginDialogData.f62381e) && C41536l.m120484d(this.f62382f, gamificationPreLoginDialogData.f62382f) && C41536l.m120484d(this.f62383g, gamificationPreLoginDialogData.f62383g);
        }

        public int hashCode() {
            int hashCode = ((((this.f62380d.hashCode() * 31) + this.f62381e.hashCode()) * 31) + this.f62382f.hashCode()) * 31;
            String str = this.f62383g;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            String str = this.f62380d;
            String str2 = this.f62381e;
            String str3 = this.f62382f;
            String str4 = this.f62383g;
            return "GamificationPreLoginDialogData(titleKey=" + str + ", bannerMessageKey=" + str2 + ", bannerButtonKey=" + str3 + ", token=" + str4 + ")";
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeString(this.f62380d);
            parcel.writeString(this.f62381e);
            parcel.writeString(this.f62382f);
            parcel.writeString(this.f62383g);
        }
    }

    /* renamed from: ge.bog.mobilebank.gamification.presentation.dialog.GamificationPreLoginFinalsActivity$a */
    public static final class C24048a {
        private C24048a() {
        }

        public /* synthetic */ C24048a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo61068a(Context context, C25210c cVar) {
            C41536l.m120489i(context, "context");
            C41536l.m120489i(cVar, "data");
            Intent intent = new Intent(context, GamificationPreLoginFinalsActivity.class);
            C41224m[] mVarArr = new C41224m[1];
            String e = cVar.mo63722c().mo63729e();
            if (e == null) {
                e = "text.gamification.prelogin.banner.title";
            }
            String c = cVar.mo63722c().mo63728c();
            if (c == null) {
                c = "text.gamification.prelogin.banner.message";
            }
            String b = cVar.mo63722c().mo63727b();
            if (b == null) {
                b = "text.gamification.prelogin.banner.button";
            }
            mVarArr[0] = C41233s.m119492a("ARG_DATA", new GamificationPreLoginDialogData(e, c, b, cVar.mo63723d()));
            context.startActivity(C37613p.m110614a(intent, mVarArr));
            Activity b2 = C25100c.m80063b(context);
            if (b2 != null) {
                b2.overridePendingTransition(0, 0);
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.gamification.presentation.dialog.GamificationPreLoginFinalsActivity$b */
    static final class C24049b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ GamificationPreLoginFinalsActivity f62384d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24049b(GamificationPreLoginFinalsActivity gamificationPreLoginFinalsActivity) {
            super(0);
            this.f62384d = gamificationPreLoginFinalsActivity;
        }

        /* renamed from: b */
        public final C20486b invoke() {
            return C20486b.m66696d(this.f62384d.getLayoutInflater());
        }
    }

    /* renamed from: ge.bog.mobilebank.gamification.presentation.dialog.GamificationPreLoginFinalsActivity$c */
    static final class C24050c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ GamificationPreLoginFinalsActivity f62385d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24050c(GamificationPreLoginFinalsActivity gamificationPreLoginFinalsActivity) {
            super(0);
            this.f62385d = gamificationPreLoginFinalsActivity;
        }

        /* renamed from: b */
        public final GamificationPreLoginDialogData invoke() {
            Intent intent = this.f62385d.getIntent();
            GamificationPreLoginDialogData gamificationPreLoginDialogData = intent != null ? (GamificationPreLoginDialogData) intent.getParcelableExtra("ARG_DATA") : null;
            return gamificationPreLoginDialogData == null ? new GamificationPreLoginDialogData("text.gamification.prelogin.banner.title", "text.gamification.prelogin.banner.message", "text.gamification.prelogin.banner.button", (String) null) : gamificationPreLoginDialogData;
        }
    }

    /* renamed from: D2 */
    private final void m77545D2() {
        m77548G2().f55486g.setOnClickListener(new C24051a(this));
        m77548G2().f55487h.setOnClickListener(new C24052b(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: E2 */
    public static final void m77546E2(GamificationPreLoginFinalsActivity gamificationPreLoginFinalsActivity, View view) {
        C41536l.m120489i(gamificationPreLoginFinalsActivity, "this$0");
        C38125h.m112236a(gamificationPreLoginFinalsActivity).mo91645b(gamificationPreLoginFinalsActivity, gamificationPreLoginFinalsActivity.m77549H2().mo61059e());
        gamificationPreLoginFinalsActivity.finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: F2 */
    public static final void m77547F2(GamificationPreLoginFinalsActivity gamificationPreLoginFinalsActivity, View view) {
        C41536l.m120489i(gamificationPreLoginFinalsActivity, "this$0");
        gamificationPreLoginFinalsActivity.finish();
    }

    /* renamed from: G2 */
    private final C20486b m77548G2() {
        return (C20486b) this.f62378F.getValue();
    }

    /* renamed from: H2 */
    private final GamificationPreLoginDialogData m77549H2() {
        return (GamificationPreLoginDialogData) this.f62379G.getValue();
    }

    /* renamed from: I2 */
    private final void m77550I2() {
        C1200m3.m4286b(getWindow(), false);
        getWindow().setStatusBarColor(0);
        C32343x.m95444e1(this, true);
        m77548G2().f55488i.setTitle(C32343x.m95388F(m77549H2().mo61057d(), new Object[0]));
        m77548G2().f55488i.setText(C32343x.m95388F(m77549H2().mo61056b(), new Object[0]));
        m77548G2().f55486g.setButtonText(C32343x.m95388F(m77549H2().mo61055a(), new Object[0]));
        m77548G2().f55485f.setText(C32343x.m95388F("text.gamification.prelogin.login.button", new Object[0]));
        m77545D2();
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        super.mo37451O1(bundle);
        setContentView((View) m77548G2().mo3946b());
        m77550I2();
    }

    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }
}
