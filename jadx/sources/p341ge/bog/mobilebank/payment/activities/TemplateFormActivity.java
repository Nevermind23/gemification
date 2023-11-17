package p341ge.bog.mobilebank.payment.activities;

import android.content.Intent;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.C0430g1;
import androidx.core.content.C0767a;
import g91.C32303f;
import iu0.C36546y;
import java.io.File;
import java.util.ArrayList;
import mw0.C37286s;
import org.parceler.C42035e;
import ow0.C37825f;
import p341ge.bog.mobilebank.p975ui.views.widgets.TextTypeView;
import p366bk.C10318g;
import p366bk.C10320i;
import p366bk.C10325n;
import p366bk.C10328q;

/* renamed from: ge.bog.mobilebank.payment.activities.TemplateFormActivity */
public class TemplateFormActivity extends PaymentFormActivity {

    /* renamed from: T */
    C37825f f81935T;

    /* renamed from: ge.bog.mobilebank.payment.activities.TemplateFormActivity$a */
    class C33604a implements View.OnClickListener {
        C33604a() {
        }

        public void onClick(View view) {
            TemplateFormActivity.this.mo79614K2().mo91082A();
        }
    }

    /* renamed from: ge.bog.mobilebank.payment.activities.TemplateFormActivity$b */
    class C33605b implements C0430g1.C0433c {
        C33605b() {
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m98669b() {
            TemplateFormActivity.this.mo79614K2().mo91102S();
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            String charSequence = menuItem.getTitle().toString();
            String string = TemplateFormActivity.this.getResources().getString(C10328q.f28948Wc);
            String string2 = TemplateFormActivity.this.getResources().getString(C10328q.settings_menu_text_delete);
            if (charSequence.equals(string)) {
                TemplateFormActivity.this.mo79614K2().mo91109c0(true);
            } else if (charSequence.equals(string2)) {
                TemplateFormActivity.this.mo86440m2(new C33615g(this));
            }
            return true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: P2 */
    public /* synthetic */ void m98654P2(View view) {
        mo79601U2();
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public void mo79599D0() {
        this.f81917G.f68871u.setVisibility(0);
        this.f81917G.f68858h.setVisibility(8);
        C36546y.m108282F().mo27138I("payment_details");
        mo86441o2();
        boolean z = getIntent().getExtras().getBoolean("CREATE_NEW_TEMPLATE", false);
        long j = getIntent().getExtras().getLong("TEMPLATE_GROUP_ID", -1);
        boolean z2 = getIntent().getExtras().getBoolean("FINISH_AFTER_CREATE_TEMPLATE", false);
        long longExtra = getIntent().getLongExtra("TEMPLATE_ITEM_ID", -1);
        boolean z3 = getIntent().getExtras().getBoolean("OPEN_TEMPLATE_IN_EDIT_MODE", false);
        C37825f fVar = r0;
        C37825f fVar2 = new C37825f(this, getIntent().getExtras().getString("PAYMENT_SERVICE_ID"), getIntent().getExtras().getBoolean("PAYMENT_IS_COMPANY", false), z, j, z2, longExtra, z3, getIntent().getExtras().getString("PAYMENT_ESS_ID", ""), getIntent().getExtras().getString("CAR_DEBT_KEY_CORRESPONDING_VALUE", (String) null), (ArrayList) C42035e.m122119a(getIntent().getParcelableExtra("PAYMENT_RESULT_INFO")), getIntent().getIntExtra("PAYMENT_PACK_INDEX", -1));
        C37825f fVar3 = fVar;
        this.f81935T = fVar3;
        this.f81922L = fVar3;
        mo79614K2().mo91085F();
        this.f81917G.f68862l.f68328f.mo3946b().setOnClickListener(new C33604a());
        this.f81917G.f68868r.f70288l.setOnClickListener(new C37286s(this));
    }

    /* renamed from: e3 */
    public C37825f mo79614K2() {
        return this.f81935T;
    }

    /* renamed from: f3 */
    public void mo79626f3() {
        this.f81917G.f68868r.f70287k.setVisibility(8);
    }

    /* renamed from: g3 */
    public void mo79627g3() {
        this.f81917G.f68871u.setVisibility(8);
    }

    /* renamed from: h3 */
    public void mo79628h3() {
        this.f81917G.f68872v.setVisibility(8);
    }

    /* renamed from: i3 */
    public void mo79629i3(String str, String str2) {
        this.f81917G.f68871u.setMainText(str);
        this.f81917G.f68871u.mo86897a(str2, C10320i.f28688dc);
        this.f81917G.f68871u.mo86901e(C10325n.template_menu, new C33605b());
    }

    /* renamed from: j3 */
    public void mo79630j3(File file, String str) {
        TextTypeView textTypeView = this.f81917G.f68872v;
        int i = C10320i.ic_upload_image;
        textTypeView.loadRightPhotoFromFile(file, i, i);
        this.f81917G.f68872v.setTitleText(str);
    }

    /* renamed from: k3 */
    public void mo79631k3(String str, String str2, View.OnClickListener onClickListener) {
        TextTypeView textTypeView = this.f81917G.f68872v;
        int i = C10320i.ic_upload_image;
        textTypeView.loadRightPhotoFromURL(str, i, i);
        this.f81917G.f68872v.setTitleText(str2);
        this.f81917G.f68872v.setOnClickListener(onClickListener);
        this.f81917G.f68872v.setIconClickListener(onClickListener);
        this.f81917G.f68872v.setUnderLineColor(C0767a.m2893c(this, C10318g.payment_details_input_divider_color));
        this.f81917G.f68872v.setClickEnabled(true);
    }

    /* renamed from: l3 */
    public void mo79632l3() {
        this.f81917G.f68871u.setVisibility(0);
    }

    /* renamed from: m3 */
    public void mo79633m3() {
        this.f81917G.f68872v.setVisibility(0);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 != -1) {
            return;
        }
        if (i == 10002) {
            mo79614K2().mo91107a0(intent.getStringExtra("CROPPED_PATH"));
        } else if (i == 139 || (i == 140 && this.f81935T != null)) {
            this.f81935T.mo91105Y(i, intent);
        }
    }

    public void onBackPressed() {
        if (!mo79614K2().mo91106Z()) {
            super.onBackPressed();
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C37825f fVar;
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (C32303f.m95190a(iArr) && (fVar = this.f81935T) != null) {
            fVar.mo91108b0(i);
        }
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        return getString(C10328q.tab_bar_payments);
    }
}
