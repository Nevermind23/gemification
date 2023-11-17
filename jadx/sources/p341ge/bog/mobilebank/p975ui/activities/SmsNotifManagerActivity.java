package p341ge.bog.mobilebank.p975ui.activities;

import a81.C30586eb;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import androidx.fragment.app.C1493e0;
import androidx.fragment.app.FragmentManager;
import ba1.C10146d0;
import com.google.gson.Gson;
import e41.C31658b;
import g91.C32297d;
import g91.C32343x;
import hc1.C41185v;
import hd1.C41205b;
import java.util.HashMap;
import jg1.C41438c;
import jg1.C41452l;
import p341ge.bog.mobilebank.eventbus.events.SMSNotifListEvent;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.model.smsnotification.SMSContact;
import p341ge.bog.mobilebank.model.smsnotification.SMSNotification;
import p341ge.bog.mobilebank.model.smsnotification.SMSTypeGroup;
import p341ge.bog.mobilebank.p975ui.fragments.C35593d1;
import p341ge.bog.mobilebank.rest.BankApi;
import p341ge.bog.mobilebank.rest.model.RestCallback;
import p341ge.bog.mobilebank.rest.model.otpparameter.SaveSMSNotifsParams;
import p341ge.bog.mobilebank.shared.tmx_profiling.TMXFlags;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p366bk.C10322k;
import p366bk.C10328q;
import p745er.C20288a;
import p90.C27256b2;
import pc0.C27494a;
import r90.C27950a;
import t81.C38721c;
import t81.C38724d;
import t81.C38727e;
import t81.C38730f;
import t81.C38732g;

/* renamed from: ge.bog.mobilebank.ui.activities.SmsNotifManagerActivity */
public class SmsNotifManagerActivity extends C35447n0 implements C41185v.C41186a {
    /* access modifiers changed from: private */

    /* renamed from: G */
    public C27256b2 f85491G;

    /* renamed from: H */
    C31658b f85492H;

    /* renamed from: I */
    protected BankApi f85493I;

    /* renamed from: J */
    protected Client f85494J;

    /* renamed from: K */
    protected C41438c f85495K;

    /* renamed from: L */
    protected C27494a f85496L;

    /* renamed from: M */
    private SMSNotifListEvent f85497M;

    /* renamed from: N */
    private FragmentManager f85498N;

    /* renamed from: O */
    private C35593d1 f85499O;

    /* renamed from: P */
    private C38730f f85500P;

    /* renamed from: Q */
    private C38721c f85501Q;

    /* renamed from: R */
    private C38724d f85502R;

    /* renamed from: S */
    private C38732g f85503S;

    /* renamed from: T */
    private C38727e f85504T;

    /* renamed from: ge.bog.mobilebank.ui.activities.SmsNotifManagerActivity$a */
    class C35327a implements View.OnClickListener {
        C35327a() {
        }

        public void onClick(View view) {
            if (SmsNotifManagerActivity.this.f85491G.f68374j.f70288l.isOrange()) {
                SmsNotifManagerActivity.this.mo86381Z2();
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.SmsNotifManagerActivity$b */
    class C35328b implements View.OnClickListener {
        C35328b() {
        }

        public void onClick(View view) {
            SmsNotifManagerActivity.super.onBackPressed();
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.SmsNotifManagerActivity$c */
    class C35329c implements View.OnClickListener {
        C35329c() {
        }

        public void onClick(View view) {
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.SmsNotifManagerActivity$d */
    class C35330d extends RestCallback {
        C35330d() {
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m104827b() {
            SmsNotifManagerActivity.this.f85494J.requestSMSNotificationsList(true);
        }

        public void onEnqueue(C41205b bVar) {
            SmsNotifManagerActivity.this.mo86438k1(bVar);
        }

        public void onFailure(Throwable th) {
            super.onFailure(th);
            SmsNotifManagerActivity.this.mo86425J1();
        }

        public void onResponse(BankApiResponse bankApiResponse) {
            super.onResponse(bankApiResponse);
            if (bankApiResponse.isSuccess()) {
                SmsNotifManagerActivity.this.f85491G.f68374j.f70288l.setOrange(false);
                SmsNotifManagerActivity smsNotifManagerActivity = SmsNotifManagerActivity.this;
                C32297d.m95161i(smsNotifManagerActivity, smsNotifManagerActivity.getString(C10328q.f28956f2), C32297d.f79706b, new C35427j2(this));
                return;
            }
            C32297d.m95154b(SmsNotifManagerActivity.this, C27950a.m86284a(bankApiResponse.getKey()));
            SmsNotifManagerActivity.this.mo86425J1();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: C2 */
    public /* synthetic */ void m104798C2(View view) {
        m104806R2();
    }

    /* renamed from: L2 */
    private void m104802L2() {
        String str;
        SMSNotifListEvent sMSNotifListEvent = this.f85497M;
        if (sMSNotifListEvent == null || sMSNotifListEvent.getState() == 10) {
            mo86441o2();
            this.f85491G.f68370f.setVisibility(8);
        } else if (this.f85497M.getState() != 20) {
            mo86425J1();
            this.f85491G.f68370f.setVisibility(0);
            if (this.f85497M.getState() == 40) {
                str = C27950a.m86284a(this.f85497M.getErrorKey());
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                C32297d.m95154b(this, str);
            }
        } else {
            mo86425J1();
            this.f85491G.f68370f.setVisibility(8);
            m104808U2();
        }
    }

    /* renamed from: N2 */
    private C41185v m104803N2() {
        return C20288a.m66329d(getSupportFragmentManager());
    }

    /* renamed from: O2 */
    private SaveSMSNotifsParams m104804O2(String str, String str2, String str3) {
        return new SaveSMSNotifsParams(new Gson().mo18181w(this.f85497M.getContactsToSave()), BankApi.SMSNOTIFS_SAVE_NOTIFICATION_SETS, str, str2, str3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = r1.f85497M;
     */
    /* renamed from: P2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m104805P2() {
        /*
            r1 = this;
            t81.c r0 = r1.f85501Q
            if (r0 == 0) goto L_0x0016
            boolean r0 = r0.isVisible()
            if (r0 == 0) goto L_0x0016
            ge.bog.mobilebank.eventbus.events.SMSNotifListEvent r0 = r1.f85497M
            if (r0 == 0) goto L_0x0016
            boolean r0 = r0.hasUnsavedData()
            if (r0 == 0) goto L_0x0016
            r0 = 1
            return r0
        L_0x0016:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.p975ui.activities.SmsNotifManagerActivity.m104805P2():boolean");
    }

    /* renamed from: R2 */
    private void m104806R2() {
        this.f85494J.requestSMSNotificationsList(true);
    }

    /* renamed from: S2 */
    private void m104807S2(String str, String str2, String str3) {
        if (this.f85497M != null) {
            mo86441o2();
            SaveSMSNotifsParams O2 = m104804O2(str, str2, str3);
            this.f85493I.saveSMSNotifs(O2.getParametersMapWithoutNotifications(this.f85496L), O2.getNotificationSets(), new C35330d());
        }
    }

    /* renamed from: U2 */
    private void m104808U2() {
        if (this.f85498N != null) {
            mo86377M2();
            this.f85491G.f68371g.removeAllViews();
            C35593d1 d1Var = new C35593d1();
            this.f85499O = d1Var;
            d1Var.mo86668o1(this.f85497M);
            C1493e0 p = this.f85498N.mo4428p();
            p.mo4632c(C10322k.f28769Me, this.f85499O, "LIST");
            p.mo4515i();
        }
    }

    /* renamed from: W2 */
    private void m104809W2() {
        mo86437j2(getString(C10328q.notifications_unsaved_dialog_title), getString(C10328q.notifications_unsaved_dialog_text), getString(C10328q.f28966r2), getString(C10328q.f28951b2), new C35328b(), new C35329c(), false);
    }

    /* renamed from: X2 */
    private void m104810X2(String str, HashMap hashMap) {
        C41185v.m119403r2(str, hashMap).mo4576A1(getSupportFragmentManager(), (String) null);
    }

    /* renamed from: Y2 */
    public static void m104811Y2(Context context) {
        context.startActivity(new Intent(context, SmsNotifManagerActivity.class));
    }

    /* renamed from: G2 */
    public void mo86373G2(SMSContact sMSContact) {
        if (sMSContact != null && this.f85498N != null) {
            C38727e eVar = new C38727e();
            this.f85504T = eVar;
            eVar.mo92360k1(sMSContact);
            C1493e0 p = this.f85498N.mo4428p();
            p.mo4640s(C10322k.f28769Me, this.f85504T, "LANGUAGE");
            p.mo4636g("LANGUAGE");
            p.mo4515i();
        }
    }

    /* renamed from: H2 */
    public void mo86374H2(String str, String str2) {
        SMSContact contactByTag;
        SMSNotifListEvent sMSNotifListEvent = this.f85497M;
        if (sMSNotifListEvent != null && this.f85498N != null && (contactByTag = sMSNotifListEvent.getContactByTag(str)) != null) {
            C38721c cVar = new C38721c();
            this.f85501Q = cVar;
            cVar.mo92354q1(contactByTag, str2);
            C1493e0 p = this.f85498N.mo4428p();
            p.mo4640s(C10322k.f28769Me, this.f85501Q, "CONTACT_DETAILS");
            p.mo4636g("CONTACT_DETAILS");
            p.mo4515i();
        }
    }

    /* renamed from: I2 */
    public void mo86375I2(SMSTypeGroup sMSTypeGroup, String str) {
        if (sMSTypeGroup != null && this.f85498N != null) {
            C38724d dVar = new C38724d();
            this.f85502R = dVar;
            dVar.mo92357l1(sMSTypeGroup, str);
            C1493e0 p = this.f85498N.mo4428p();
            p.mo4640s(C10322k.f28769Me, this.f85502R, "GROUP_TYPE");
            p.mo4636g("GROUP_TYPE");
            p.mo4515i();
        }
    }

    /* renamed from: J2 */
    public void mo86376J2(SMSNotification sMSNotification, String str) {
        if (sMSNotification != null && this.f85498N != null) {
            C38732g gVar = new C38732g();
            this.f85503S = gVar;
            gVar.mo92365l1(sMSNotification, str);
            C1493e0 p = this.f85498N.mo4428p();
            p.mo4640s(C10322k.f28769Me, this.f85503S, "NOTIFICATION");
            p.mo4636g("NOTIFICATION");
            p.mo4515i();
        }
    }

    /* renamed from: M2 */
    public void mo86377M2() {
        try {
            if (this.f85498N != null) {
                for (int i = 0; i < this.f85498N.mo4432r0(); i++) {
                    this.f85498N.mo4409g1();
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: O */
    public void mo37615O(String str, String str2, String str3, String str4) {
        if (m104803N2() != null) {
            m104803N2().mo4577k1();
        }
        m104807S2(str, str2, str3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        this.f85491G = C27256b2.m84324d(getLayoutInflater());
        mo86438k1(this.f85492H.mo72084b(TMXFlags.TMX_FLAG_SMS_NOTIFS));
        super.mo70996D2(bundle, this.f85491G);
        this.f85491G.f68373i.f68328f.mo3946b().setOnClickListener(new C30586eb(this));
        this.f85498N = getSupportFragmentManager();
        this.f85491G.f68369e.setVisibility(8);
        this.f85491G.f68374j.f70288l.setText(C10328q.button_text_save_remember);
        this.f85491G.f68374j.f70288l.setOnClickListener(new C35327a());
    }

    /* renamed from: Q2 */
    public void mo86378Q2() {
        boolean z;
        SMSNotifListEvent sMSNotifListEvent = this.f85497M;
        if (sMSNotifListEvent != null) {
            z = sMSNotifListEvent.hasUnsavedData();
        } else {
            z = false;
        }
        this.f85491G.f68374j.f70288l.setOrange(z);
    }

    /* renamed from: R */
    public void mo37616R(String str, String str2) {
        C32297d.m95154b(this, str);
    }

    /* renamed from: S */
    public void mo37617S(boolean z) {
        if (z) {
            mo86441o2();
        } else {
            mo86425J1();
        }
    }

    /* renamed from: T2 */
    public void mo86379T2(boolean z) {
        this.f85491G.f68369e.setVisibility(z ? 0 : 8);
    }

    /* renamed from: V2 */
    public void mo86380V2(String str) {
        if (this.f85497M != null && this.f85498N != null) {
            C38730f fVar = new C38730f();
            this.f85500P = fVar;
            fVar.mo92363i1(this.f85497M, str);
            C1493e0 p = this.f85498N.mo4428p();
            p.mo4640s(C10322k.f28769Me, this.f85500P, "CONTACT_LIST");
            p.mo4636g("CONTACT_LIST");
            p.mo4515i();
        }
    }

    /* renamed from: Z2 */
    public void mo86381Z2() {
        HashMap a = this.f85496L.mo66809a(m104804O2((String) null, (String) null, (String) null));
        a.put("tmxSessionId", C10146d0.C10177h.m37232a());
        m104810X2(BankApi.SMSNOTIFS_SAVE_NOTIFICATION_SETS, a);
    }

    public void onBackPressed() {
        C35593d1 d1Var = this.f85499O;
        if (d1Var != null && d1Var.isVisible()) {
            mo86377M2();
        }
        if (m104805P2()) {
            m104809W2();
        } else {
            super.onBackPressed();
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    @C41452l
    public void onSMSNotifListEvent(SMSNotifListEvent sMSNotifListEvent) {
        C35593d1 d1Var;
        if (this.f85497M != sMSNotifListEvent) {
            this.f85497M = sMSNotifListEvent;
            m104802L2();
        } else if (sMSNotifListEvent != null && sMSNotifListEvent.getState() == 20 && (d1Var = this.f85499O) != null) {
            d1Var.mo86668o1(this.f85497M);
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        C32343x.m95423W0(this.f85495K, this);
        this.f85494J.requestSMSNotificationsList(false);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        C32343x.m95489t1(this.f85495K, this);
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        return getString(C10328q.header_text_sms_and_push);
    }
}
