package p341ge.bog.mobilebank.p975ui.activities.bonuses.plus;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import b81.C31148a;
import b81.C31149b;
import g91.C32297d;
import g91.C32303f;
import g91.C32343x;
import jg1.C41438c;
import jg1.C41452l;
import p341ge.bog.mobilebank.eventbus.events.BonusProgramRegisterEvent;
import p341ge.bog.mobilebank.rest.manager.RootBankApiManager;
import p90.C27363m1;
import r90.C27950a;

/* renamed from: ge.bog.mobilebank.ui.activities.bonuses.plus.PlusActivationActivity */
public class PlusActivationActivity extends C35353a {

    /* renamed from: G */
    protected RootBankApiManager f85625G;

    /* renamed from: H */
    protected C41438c f85626H;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public C27363m1 f85627I;

    /* renamed from: ge.bog.mobilebank.ui.activities.bonuses.plus.PlusActivationActivity$a */
    class C35352a implements CompoundButton.OnCheckedChangeListener {
        C35352a() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            PlusActivationActivity.this.f85627I.f69277h.setOrange(z);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: C2 */
    public /* synthetic */ void m104975C2(View view) {
        m104979H2();
    }

    /* renamed from: H2 */
    private void m104979H2() {
        if (this.f85627I.f69277h.isOrange()) {
            this.f85627I.f69282m.setVisibility(0);
            this.f85625G.joinBonusProgram();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: I2 */
    public /* synthetic */ void m104980I2(View view) {
        m104981J2();
    }

    /* renamed from: J2 */
    private void m104981J2() {
        C32303f.m95184D(C27950a.m86284a("link.terms.plus.conditions.pdf"), this);
    }

    /* renamed from: K2 */
    public static void m104982K2(Activity activity) {
        activity.startActivityForResult(new Intent(activity, PlusActivationActivity.class), 9999);
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        C27363m1 d = C27363m1.m84762d(getLayoutInflater());
        this.f85627I = d;
        super.mo70996D2(bundle, d);
        C32343x.m95423W0(this.f85626H, this);
        this.f85627I.f69274e.setOnCheckedChangeListener(new C35352a());
        this.f85627I.f69277h.setOnClickListener(new C31148a(this));
        this.f85627I.f69276g.setOnClickListener(new C31149b(this));
    }

    @C41452l
    public void onBonusProgramRegisterEvent(BonusProgramRegisterEvent bonusProgramRegisterEvent) {
        int state = bonusProgramRegisterEvent.getState();
        if (state == 20) {
            setResult(-1);
            finish();
        } else if (state == 30) {
            C32297d.m95153a(this);
        } else if (state == 40) {
            C32297d.m95154b(this, C27950a.m86284a(bonusProgramRegisterEvent.getErrorKey()));
        }
        this.f85627I.f69282m.setVisibility(8);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C32343x.m95489t1(this.f85626H, this);
    }
}
