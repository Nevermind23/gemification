package p341ge.bog.mobilebank.cleanarch.settings.presentation;

import a81.C30772sa;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.C1493e0;
import androidx.fragment.app.Fragment;
import com.salesforce.marketingcloud.storage.p385db.C11772k;
import he1.C41217g;
import ic1.C41280g;
import kc1.C41482m;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;
import ue1.C43064a;

/* renamed from: ge.bog.mobilebank.cleanarch.settings.presentation.SecuritySettingsActivity */
public final class SecuritySettingsActivity extends C30772sa {

    /* renamed from: G */
    public static final C22544a f59609G = new C22544a((DefaultConstructorMarker) null);

    /* renamed from: F */
    private final C41217g f59610F = C41219i.m119470b(new C22545b(this));

    /* renamed from: ge.bog.mobilebank.cleanarch.settings.presentation.SecuritySettingsActivity$a */
    public static final class C22544a {
        private C22544a() {
        }

        public /* synthetic */ C22544a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo55703a(Context context, String str) {
            C41536l.m120489i(context, "context");
            Intent intent = new Intent(context, SecuritySettingsActivity.class);
            intent.putExtra(C11772k.C11773a.f34184p, str);
            context.startActivity(intent);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.settings.presentation.SecuritySettingsActivity$b */
    static final class C22545b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ SecuritySettingsActivity f59611d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22545b(SecuritySettingsActivity securitySettingsActivity) {
            super(0);
            this.f59611d = securitySettingsActivity;
        }

        public final String invoke() {
            Intent intent = this.f59611d.getIntent();
            if (intent != null) {
                return intent.getStringExtra(C11772k.C11773a.f34184p);
            }
            return null;
        }
    }

    /* renamed from: E2 */
    private final String m73085E2() {
        return (String) this.f59610F.getValue();
    }

    /* renamed from: F2 */
    public static final void m73086F2(Context context, String str) {
        f59609G.mo55703a(context, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: M1 */
    public int mo49479M1() {
        return C10324m.f28919a1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        Fragment fragment;
        super.mo37451O1(bundle);
        C1493e0 p = getSupportFragmentManager().mo4428p();
        int i = C10322k.f28769Me;
        if (m73085E2() != null) {
            fragment = C41482m.f97637m.mo96249a(m73085E2());
        } else {
            fragment = C41280g.f97303m.mo95745a();
        }
        p.mo4639r(i, fragment);
        p.mo4515i();
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        String string = getString(C10328q.f28927Gc);
        C41536l.m120488h(string, "getString(R.string.security_settings_title)");
        return string;
    }
}
