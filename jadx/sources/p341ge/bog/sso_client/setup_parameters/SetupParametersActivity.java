package p341ge.bog.sso_client.setup_parameters;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import ba1.C10211p;
import ba1.C10216u;
import ba1.C10218w;
import ha1.C15454a;
import he1.C41217g;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lc1.C41654d;
import lc1.C41660j;
import p341ge.bog.designsystem.components.toolbar.ToolbarView;
import p642vh.C18368l;
import ua1.C28642g;
import ue1.C43064a;

/* renamed from: ge.bog.sso_client.setup_parameters.SetupParametersActivity */
public final class SetupParametersActivity extends C15454a {

    /* renamed from: s */
    private final C41217g f96988s = C41219i.m119470b(new C41081a(this));

    /* renamed from: ge.bog.sso_client.setup_parameters.SetupParametersActivity$a */
    static final class C41081a extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ SetupParametersActivity f96989d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41081a(SetupParametersActivity setupParametersActivity) {
            super(0);
            this.f96989d = setupParametersActivity;
        }

        /* renamed from: b */
        public final C28642g invoke() {
            C28642g d = C28642g.m87671d(this.f96989d.getLayoutInflater());
            C41536l.m120488h(d, "inflate(layoutInflater)");
            return d;
        }
    }

    public SetupParametersActivity() {
        super(0, 1, (DefaultConstructorMarker) null);
    }

    /* renamed from: U0 */
    private final C28642g m119064U0() {
        return (C28642g) this.f96988s.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: V0 */
    public static final boolean m119065V0(SetupParametersActivity setupParametersActivity, MenuItem menuItem) {
        C41536l.m120489i(setupParametersActivity, "this$0");
        if (menuItem.getItemId() != C10216u.f28308V) {
            return true;
        }
        setupParametersActivity.onBackPressed();
        return true;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((View) m119064U0().mo3946b());
        getWindow().setStatusBarColor(C18368l.m62755d(this, C10211p.f28263a));
        ToolbarView toolbarView = m119064U0().f72734f;
        toolbarView.mo1887x(C10218w.close_action_menu);
        toolbarView.setOnMenuItemClickListener(new C41654d(this));
        getSupportFragmentManager().mo4428p().mo4639r(C10216u.f28301Q0, C41660j.f97907l.mo96467a()).mo4515i();
    }
}
