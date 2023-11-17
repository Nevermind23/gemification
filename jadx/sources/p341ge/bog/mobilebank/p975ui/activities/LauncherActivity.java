package p341ge.bog.mobilebank.p975ui.activities;

import a81.C30576e1;
import a81.C30590f1;
import a81.C30604g1;
import a81.C30618h1;
import a81.C30632i1;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.text.TextUtils;
import android.view.View;
import com.google.gson.Gson;
import com.medallia.digital.mobilesdk.MedalliaDigital;
import g91.C32313j0;
import g91.C32335t0;
import g91.C32343x;
import iu0.C36546y;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import jg1.C41438c;
import jg1.C41452l;
import n41.C37353c;
import org.parceler.C42035e;
import p198o9.C7493a;
import p198o9.C7494b;
import p316xa.C8982a;
import p341ge.bog.mobilebank.cleanarch.utm.data.entity.UtmParamsEntity;
import p341ge.bog.mobilebank.eventbus.event.ExternalUserStoredEvent;
import p341ge.bog.mobilebank.fcm.MyFirebaseMessagingService;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.model.KeyValue;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p366bk.C10316e;
import p366bk.C10320i;
import p366bk.C10328q;
import p642vh.C18368l;
import p90.C27344k0;
import q31.C38124g;
import x01.C39766b;
import x01.C39767c;

/* renamed from: ge.bog.mobilebank.ui.activities.LauncherActivity */
public class LauncherActivity extends C35509t {

    /* renamed from: R */
    private static final long f84876R = TimeUnit.DAYS.toMillis(14);

    /* renamed from: G */
    protected Client f84877G;

    /* renamed from: H */
    protected C41438c f84878H;

    /* renamed from: I */
    protected PreferencesApiManager f84879I;

    /* renamed from: J */
    protected C39766b f84880J;

    /* renamed from: K */
    protected C39767c f84881K;

    /* renamed from: L */
    private C27344k0 f84882L;

    /* renamed from: M */
    private Intent f84883M;

    /* renamed from: N */
    private boolean f84884N = false;

    /* renamed from: O */
    private String f84885O;

    /* renamed from: P */
    private boolean f84886P = false;

    /* renamed from: Q */
    private View.OnClickListener f84887Q = new C30576e1(this);

    /* renamed from: ge.bog.mobilebank.ui.activities.LauncherActivity$a */
    class C35190a extends C8982a<ArrayList<KeyValue>> {
        C35190a() {
        }
    }

    /* renamed from: G2 */
    private void m103598G2() {
        if (C32335t0.m95361f() == 2) {
            this.f84882L.f69108e.setImageResource(C10320i.ic_wide_logo_dark_wealth);
        }
    }

    /* renamed from: H2 */
    private void m103599H2() {
        this.f84882L.f69111h.setVisibility(8);
        this.f84882L.f69109f.f68328f.mo3946b().setOnClickListener(new C30618h1(this));
    }

    /* renamed from: I2 */
    private void m103600I2() {
        if (this.f84879I.getExtCustomer() != null && this.f84879I.getTermsAccepted() && this.f84884N) {
            m103610S2();
            overridePendingTransition(0, 0);
        }
    }

    /* renamed from: J2 */
    private void m103601J2() {
        Intent intent = getIntent();
        if (intent != null && intent.getData() != null) {
            String uri = intent.getData().toString();
            if (uri.startsWith("https://account-ob.bog.ge/auth/realms/bog/protocol/openid-connect/auth") || uri.startsWith("https://account-ob-sbx.bog.ge/auth/realms/bog-test/protocol/openid-connect/auth")) {
                this.f84886P = true;
            }
        }
    }

    /* renamed from: K2 */
    private void m103602K2() {
        C7493a.m28459c().mo21927a(getIntent()).mo24862g(this, new C30590f1(this)).mo24859d(this, new C30604g1(this));
    }

    /* renamed from: L2 */
    private boolean m103603L2() {
        if (checkSelfPermission("android.permission.READ_CONTACTS") == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: M2 */
    public /* synthetic */ void m103604M2(View view) {
        this.f84882L.f69109f.mo3946b().setVisibility(8);
        C36546y.m108285N().mo89326r0();
    }

    /* access modifiers changed from: private */
    /* renamed from: N2 */
    public /* synthetic */ void m103605N2(C7494b bVar) {
        Uri a;
        this.f84884N = true;
        if (!(bVar == null || (a = bVar.mo21929a()) == null)) {
            Intent intent = new Intent();
            String queryParameter = a.getQueryParameter("type");
            String queryParameter2 = a.getQueryParameter("utm_campaign");
            String queryParameter3 = a.getQueryParameter("utm_source");
            String queryParameter4 = a.getQueryParameter("utm_medium");
            if (queryParameter != null) {
                String queryParameter5 = a.getQueryParameter("parameters");
                intent.putExtra("type", queryParameter);
                if (!TextUtils.isEmpty(queryParameter5)) {
                    try {
                        intent.putExtra("parameters", C42035e.m122121c((ArrayList) new Gson().mo18171m(queryParameter5, new C35190a().getType())));
                    } catch (Exception unused) {
                    }
                }
                this.f84883M = intent;
            }
            if (!TextUtils.isEmpty(queryParameter2) || !TextUtils.isEmpty(queryParameter3) || !TextUtils.isEmpty(queryParameter4)) {
                this.f84879I.saveUtmParams(new UtmParamsEntity(Calendar.getInstance().getTimeInMillis(), queryParameter2, queryParameter4, queryParameter3));
            }
        }
        m103600I2();
    }

    /* access modifiers changed from: private */
    /* renamed from: O2 */
    public /* synthetic */ void m103606O2(Exception exc) {
        this.f84883M = null;
        this.f84884N = true;
        m103600I2();
    }

    /* access modifiers changed from: private */
    /* renamed from: P2 */
    public /* synthetic */ void m103607P2(View view) {
        C37353c language = this.f84879I.getLanguage();
        C37353c cVar = C37353c.KA;
        if (language == cVar) {
            cVar = C37353c.EN;
        }
        MedalliaDigital.setCustomParameter("language", cVar.mo90434c());
        this.f85669r.mo48812k(this, cVar);
        this.f84877G.changeDeviceLanguage();
        mo86431a2();
    }

    /* access modifiers changed from: private */
    /* renamed from: Q2 */
    public /* synthetic */ void m103608Q2(View view) {
        this.f84879I.setTermsAccepted(true);
        m103599H2();
        m103600I2();
    }

    /* renamed from: R2 */
    private void m103609R2() {
        int[] iArr = {C10320i.usertip_8};
        int[] iArr2 = {C10320i.f28688dc};
        String[] strArr = {getString(C10328q.launcher_tip_eight_title)};
        String[] strArr2 = {getString(C10328q.launcher_tip_eight_desc)};
        this.f84882L.f69111h.mo86523l(iArr, iArr2, strArr, strArr2, new int[]{C18368l.m62755d(this, C10316e.color_invert_component_tr_300)}, this.f84887Q);
        this.f84882L.f69111h.setFinalClickListener(new C30632i1(this));
    }

    /* renamed from: S2 */
    private void m103610S2() {
        boolean z;
        boolean z2;
        C32343x.m95489t1(this.f84878H, this);
        Intent intent = new Intent(this, MainActivity.class);
        String stringExtra = getIntent().getStringExtra("type");
        String stringExtra2 = getIntent().getStringExtra("messageId");
        ArrayList n = MyFirebaseMessagingService.m75492n(stringExtra, getIntent());
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            z = false;
        } else {
            z = true;
        }
        Intent intent2 = this.f84883M;
        if (intent2 == null || intent2.getStringExtra("type") == null) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (getIntent().getBooleanExtra("STARTED_FROM_PUSH", false) || !TextUtils.isEmpty(getIntent().getStringExtra("google.message_id")) || !TextUtils.isEmpty(stringExtra)) {
            C36546y.m108282F().mo27152s("push_notification", "open_app", stringExtra);
        }
        if (z) {
            intent.putExtra("PUSH_NOTIFS_OPEN", true);
            intent.putExtra("type", stringExtra);
            intent.putExtra("parameters", C42035e.m122121c(n));
            intent.putExtra("messageId", stringExtra2);
        } else if (z2) {
            intent.putExtra("PUSH_NOTIFS_OPEN", true);
            intent.putExtra("type", this.f84883M.getStringExtra("type"));
            intent.putExtra("parameters", this.f84883M.getParcelableExtra("parameters"));
        } else if (this.f84886P) {
            intent.putExtra("PUSH_NOTIFS_OPEN", true);
            intent.putExtra("type", "PUSH_NOTIF_TYPE_OPEN_BANKING_AUTH");
            ArrayList arrayList = new ArrayList();
            arrayList.add(new KeyValue("PARAM_OPEN_BANKING_URI", getIntent().getDataString()));
            intent.putExtra("parameters", C42035e.m122121c(arrayList));
        }
        intent.setFlags(268468224);
        intent.putExtra(C32313j0.f79741a, this.f84885O);
        if (this.f84881K.invoke()) {
            ((C38124g) getApplicationContext()).mo37169a().mo91600e(this, intent.getExtras());
        } else {
            startActivity(intent);
        }
        finish();
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        C27344k0 d = C27344k0.m84684d(getLayoutInflater());
        this.f84882L = d;
        setContentView((View) d.mo3946b());
        C32343x.m95423W0(this.f84878H, this);
        this.f84884N = false;
        this.f84883M = null;
        m103598G2();
        int userTheme = this.f84879I.getUserTheme();
        if (userTheme == -1) {
            userTheme = this.f84879I.getThemeType();
            this.f84879I.saveUserTheme(userTheme);
        }
        this.f84879I.saveThemeType(userTheme);
        if (!m103603L2()) {
            C36546y.m108282F().mo27136G("payments", "sync_contacts", "", (Bundle) null);
        } else if (System.currentTimeMillis() - this.f84879I.getContactsLastSyncDate() >= f84876R) {
            this.f84879I.getContactsLastSyncDate();
        }
        if (getIntent().getData() != null && m103603L2()) {
            try {
                Cursor query = getContentResolver().query(getIntent().getData(), (String[]) null, (String) null, (String[]) null, (String) null);
                if (query != null) {
                    if (query.moveToFirst()) {
                        this.f84885O = query.getString(query.getColumnIndex("DATA1"));
                        C36546y.m108282F().mo27136G("payments", "click", "phone_contact", (Bundle) null);
                    }
                    query.close();
                }
            } catch (Exception unused) {
            }
        }
        if (!this.f84879I.getTermsAccepted()) {
            this.f84880J.invoke();
            this.f84882L.f69111h.setVisibility(0);
            m103609R2();
        } else {
            m103599H2();
        }
        this.f84879I.saveTempUsername((String) null);
        if (this.f84879I.getShouldUpdateLanguage() && !TextUtils.isEmpty(this.f84879I.getExtCustomer())) {
            this.f84877G.changeDeviceLanguage();
        }
        m103602K2();
        m103601J2();
    }

    public void onCreate(Bundle bundle, PersistableBundle persistableBundle) {
        if (isTaskRoot() || !getIntent().hasCategory("android.intent.category.LAUNCHER") || getIntent().getAction() == null || !getIntent().getAction().equals("android.intent.action.MAIN")) {
            super.onCreate(bundle, persistableBundle);
        } else {
            finish();
        }
    }

    @C41452l
    public void onExternalUserStoredEvent(ExternalUserStoredEvent externalUserStoredEvent) {
        int state = externalUserStoredEvent.getState();
        if (state == 10) {
            mo86441o2();
        } else if (state != 20) {
            if (state == 30 || state == 40) {
                mo86425J1();
                this.f84882L.f69109f.mo3946b().setVisibility(0);
            }
        } else if (this.f84879I.getTermsAccepted()) {
            mo86425J1();
            m103600I2();
        }
    }
}
