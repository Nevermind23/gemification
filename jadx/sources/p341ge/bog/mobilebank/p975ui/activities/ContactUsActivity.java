package p341ge.bog.mobilebank.p975ui.activities;

import a81.C30519a0;
import a81.C30533b0;
import a81.C30547c0;
import a81.C30561d0;
import a81.C30575e0;
import a81.C30589f0;
import a81.C30603g0;
import a81.C30617h0;
import a81.C30735q;
import a81.C30748r;
import a81.C30761s;
import a81.C30774t;
import a81.C30787u;
import a81.C30800v;
import a81.C30813w;
import a81.C30826x;
import a81.C30839y;
import a81.C30852z;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.bumptech.glide.C2379b;
import com.bumptech.glide.C2394j;
import com.medallia.digital.mobilesdk.MDExternalError;
import com.medallia.digital.mobilesdk.MDResultCallback;
import com.medallia.digital.mobilesdk.MedalliaDigital;
import g91.C32289b0;
import g91.C32290b1;
import g91.C32297d;
import g91.C32335t0;
import gd1.C40992a;
import iu0.C36546y;
import n41.C37353c;
import p341ge.bog.chat.data.ChatUser;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.p975ui.views.widgets.ContactUsItemView;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p366bk.C10320i;
import p366bk.C10328q;
import p653wf.C18569a;
import p748eu.C20292b;
import p758fu.C20557a;
import p90.C27451w;
import p932wr.C29566a;
import p932wr.C29568c;
import r90.C27950a;

/* renamed from: ge.bog.mobilebank.ui.activities.ContactUsActivity */
public class ContactUsActivity extends C35469p {
    /* access modifiers changed from: private */

    /* renamed from: G */
    public C27451w f84814G;

    /* renamed from: H */
    protected Client f84815H;

    /* renamed from: I */
    protected C18569a f84816I;

    /* renamed from: J */
    C29568c f84817J;

    /* renamed from: K */
    protected PreferencesApiManager f84818K;

    /* renamed from: L */
    protected C20292b f84819L;

    /* renamed from: M */
    private ContactUsItemView f84820M;

    /* renamed from: N */
    private boolean f84821N = false;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public boolean f84822O = false;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public boolean f84823P = false;

    /* renamed from: Q */
    private String f84824Q = null;

    /* renamed from: R */
    private String f84825R = "";

    /* renamed from: S */
    private final TextWatcher f84826S = new C35181a();

    /* renamed from: T */
    private final View.OnFocusChangeListener f84827T = new C35182b();

    /* renamed from: ge.bog.mobilebank.ui.activities.ContactUsActivity$a */
    class C35181a implements TextWatcher {
        C35181a() {
        }

        public void afterTextChanged(Editable editable) {
            boolean z;
            ContactUsActivity contactUsActivity = ContactUsActivity.this;
            if (TextUtils.isEmpty(contactUsActivity.f84814G.f70144w.getText()) || ContactUsActivity.this.f84814G.f70144w.getText().length() < 2 || TextUtils.isEmpty(ContactUsActivity.this.f84814G.f70147z.getText()) || ContactUsActivity.this.f84814G.f70147z.getText().length() < 9) {
                z = false;
            } else {
                z = true;
            }
            contactUsActivity.f84822O = z;
            ContactUsActivity.this.f84823P = false;
            ContactUsActivity.this.f84814G.f70119J.setEnabled(ContactUsActivity.this.f84822O);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.ContactUsActivity$b */
    class C35182b implements View.OnFocusChangeListener {
        C35182b() {
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m103478b() {
            ContactUsActivity.this.f84814G.f70114E.scrollTo(0, ContactUsActivity.this.f84814G.f70119J.getBottom());
        }

        public void onFocusChange(View view, boolean z) {
            if (z) {
                ContactUsActivity.this.f84814G.f70114E.post(new C35408g(this));
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.ContactUsActivity$c */
    class C35183c implements MDResultCallback {
        C35183c() {
        }

        public void onError(MDExternalError mDExternalError) {
            Log.e("medallia error", mDExternalError.getMessage());
        }

        public void onSuccess() {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: A3 */
    public /* synthetic */ void m103408A3(View view) {
        m103450b3(this.f84814G.f70126e);
    }

    /* renamed from: B3 */
    private void m103409B3(Boolean bool) {
        String str;
        String str2;
        boolean z;
        if (!bool.booleanValue()) {
            str2 = this.f84814G.f70144w.getText().toString();
            str = this.f84814G.f70147z.getText().toString();
        } else {
            str2 = null;
            str = null;
        }
        C18569a aVar = this.f84816I;
        ChatUser J = this.f85670s.mo89312J(bool.booleanValue(), str2, str, this.f84824Q);
        if (C32335t0.m95361f() == 1) {
            z = true;
        } else {
            z = false;
        }
        mo86438k1(aVar.mo33789c(this, J, z, bool.booleanValue(), !this.f84823P).mo95063B(C40992a.m118827a()).mo95069H(new C30839y(this)));
    }

    /* access modifiers changed from: private */
    /* renamed from: C2 */
    public /* synthetic */ void m103410C2(View view) {
        ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(this.f84814G.f70114E.getWindowToken(), 0);
        if (!this.f84815H.isAuthorized()) {
            m103440R3();
            return;
        }
        this.f84814G.f70119J.setLoading(true);
        m103409B3(Boolean.TRUE);
    }

    /* renamed from: C3 */
    private View m103411C3(View view) {
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        return view;
    }

    /* renamed from: D3 */
    private void m103412D3() {
        String str;
        C36546y.m108282F().mo27152s("contact_bank", "", "click_feedback_button");
        if (this.f84815H.isAuthorized()) {
            str = C27950a.m86284a(getResources().getString(C10328q.medallia_always_on_rb_auth_key));
            if (C32335t0.m95361f() == 1) {
                str = C27950a.m86284a(getResources().getString(C10328q.medallia_always_on_solo_auth_key));
            }
        } else {
            str = C27950a.m86284a(getResources().getString(C10328q.medallia_always_on_rb_not_auth_key));
            if (C32335t0.m95361f() == 1) {
                str = C27950a.m86284a(getResources().getString(C10328q.medallia_always_on_solo_not_auth_key));
            }
        }
        MedalliaDigital.showForm(str, new C35183c());
    }

    /* renamed from: E3 */
    private void m103414E3() {
        this.f84814G.f70145x.setOnClickListener(new C30533b0(this));
        this.f84814G.f70130i.setOnClickListener(new C30575e0(this));
        this.f84814G.f70131j.setOnClickListener(new C30589f0(this));
        this.f84814G.f70135n.setOnClickListener(new C30603g0(this));
        this.f84814G.f70126e.setOnClickListener(new C30617h0(this));
        this.f84814G.f70117H.setOnClickListener(new C30748r(this));
        this.f84814G.f70116G.setOnClickListener(new C30761s(this));
        this.f84814G.f70123N.setOnClickListener(new C30774t(this));
        this.f84814G.f70141t.setOnClickListener(new C30787u(this));
        this.f84814G.f70146y.setOnClickListener(new C30800v(this));
        this.f84814G.f70118I.setOnClickListener(new C30547c0(this));
        this.f84814G.f70110A.setOnClickListener(new C30561d0(this));
    }

    /* renamed from: F3 */
    private void m103416F3() {
        C27451w wVar = this.f84814G;
        wVar.f70139r.removeView(wVar.f70118I);
        C27451w wVar2 = this.f84814G;
        wVar2.f70139r.removeView(wVar2.f70123N);
        C27451w wVar3 = this.f84814G;
        wVar3.f70139r.removeView(wVar3.f70116G);
    }

    /* renamed from: G3 */
    private void m103418G3() {
        this.f84814G.f70142u.removeAllViews();
        this.f84814G.f70135n.setDivider(true);
        C27451w wVar = this.f84814G;
        wVar.f70142u.addView(wVar.f70146y);
        C27451w wVar2 = this.f84814G;
        wVar2.f70139r.addView(wVar2.f70135n, 0);
        C27451w wVar3 = this.f84814G;
        wVar3.f70139r.removeView(wVar3.f70118I);
        C27451w wVar4 = this.f84814G;
        wVar4.f70139r.removeView(wVar4.f70123N);
        C27451w wVar5 = this.f84814G;
        wVar5.f70139r.removeView(wVar5.f70116G);
    }

    /* renamed from: H3 */
    private void m103420H3() {
        this.f84814G.f70142u.removeAllViews();
        this.f84814G.f70135n.setDivider(true);
        C27451w wVar = this.f84814G;
        wVar.f70142u.addView(m103411C3(wVar.f70117H));
        C27451w wVar2 = this.f84814G;
        wVar2.f70139r.addView(wVar2.f70135n, 0);
        C27451w wVar3 = this.f84814G;
        wVar3.f70139r.removeView(wVar3.f70118I);
        C27451w wVar4 = this.f84814G;
        wVar4.f70139r.removeView(wVar4.f70123N);
        C27451w wVar5 = this.f84814G;
        wVar5.f70139r.removeView(wVar5.f70116G);
    }

    /* renamed from: I3 */
    private void m103422I3() {
        this.f84814G.f70142u.removeAllViews();
        this.f84814G.f70135n.setDivider(true);
        this.f84814G.f70116G.setDivider(false);
        C27451w wVar = this.f84814G;
        wVar.f70142u.addView(m103411C3(wVar.f70116G));
        C27451w wVar2 = this.f84814G;
        wVar2.f70139r.addView(wVar2.f70135n, 0);
        C27451w wVar3 = this.f84814G;
        wVar3.f70139r.removeView(wVar3.f70117H);
        C27451w wVar4 = this.f84814G;
        wVar4.f70139r.removeView(wVar4.f70123N);
        C27451w wVar5 = this.f84814G;
        wVar5.f70139r.removeView(wVar5.f70118I);
    }

    /* renamed from: J3 */
    private void m103424J3() {
        this.f84814G.f70142u.removeAllViews();
        this.f84814G.f70135n.setDivider(true);
        this.f84814G.f70118I.setDivider(false);
        C27451w wVar = this.f84814G;
        wVar.f70142u.addView(m103411C3(wVar.f70118I));
        C27451w wVar2 = this.f84814G;
        wVar2.f70139r.addView(wVar2.f70135n, 0);
        C27451w wVar3 = this.f84814G;
        wVar3.f70139r.removeView(wVar3.f70117H);
        C27451w wVar4 = this.f84814G;
        wVar4.f70139r.removeView(wVar4.f70123N);
        C27451w wVar5 = this.f84814G;
        wVar5.f70139r.removeView(wVar5.f70116G);
    }

    /* renamed from: K3 */
    private void m103426K3() {
        this.f84814G.f70145x.setVisibility(4);
        this.f84814G.f70142u.removeAllViews();
        this.f84814G.f70139r.removeAllViews();
        this.f84814G.f70123N.setDivider(false);
        C27451w wVar = this.f84814G;
        wVar.f70142u.addView(m103411C3(wVar.f70123N));
    }

    /* renamed from: L3 */
    private void m103428L3() {
        this.f84814G.f70126e.setTitle(C27950a.m86284a("contacts.phone.list.title.amex"));
        this.f84814G.f70117H.setTitle(C27950a.m86284a("contacts.phone.list.title.solo"));
        this.f84814G.f70123N.setTitle(C27950a.m86284a("contacts.phone.list.title.wealth"));
        this.f84814G.f70141t.setTitle(C27950a.m86284a("contacts.phone.list.title.corporate"));
        this.f84814G.f70116G.setTitle(C27950a.m86284a("contacts.phone.list.title.solo_club"));
        this.f84814G.f70118I.setTitle(C27950a.m86284a("contacts.phone.list.title.solo_x"));
    }

    /* renamed from: M3 */
    private void m103430M3() {
        boolean z;
        C20557a a = this.f84819L.mo48774a("CHAT_IS_ENABLED_ANDROID");
        if (a == null || a.mo49084a() == null || !a.mo49084a().booleanValue()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            m103456h3();
        } else {
            this.f84814G.f70138q.setVisibility(8);
        }
    }

    /* renamed from: N3 */
    private void m103432N3(Intent intent) {
        try {
            startActivity(intent);
        } catch (Exception unused) {
        }
    }

    /* renamed from: O3 */
    private void m103434O3() {
        this.f84821N = false;
        this.f84814G.f70119J.setButtonText(C27950a.m86284a("text.chat.contact.us"));
        this.f84814G.f70122M.setVisibility(8);
    }

    /* renamed from: P3 */
    public static void m103436P3(Context context) {
        context.startActivity(new Intent(context, ContactUsActivity.class));
    }

    /* renamed from: Q3 */
    public static void m103438Q3(Context context, String str) {
        Intent intent = new Intent(context, ContactUsActivity.class);
        intent.putExtra("CHAT_PREVIOUS_PAGE", str);
        context.startActivity(intent);
    }

    /* renamed from: R3 */
    private void m103440R3() {
        this.f84814G.f70137p.setText(getString(C10328q.contact_us_unauthorized));
        this.f84814G.f70119J.setEnabled(this.f84822O);
        if (this.f84814G.f70143v.getVisibility() == 8 && !this.f84821N) {
            this.f84814G.f70143v.setVisibility(0);
        } else if (!this.f84821N && this.f84822O && (TextUtils.isEmpty(this.f84814G.f70144w.getText()) || this.f84814G.f70144w.getText().length() < 2)) {
            C32297d.m95153a(this);
        } else if (!this.f84821N && this.f84822O && (TextUtils.isEmpty(this.f84814G.f70147z.getText()) || this.f84814G.f70147z.getText().length() < 9)) {
            C32297d.m95153a(this);
        } else if (this.f84821N || this.f84822O) {
            C36546y.m108282F().mo27152s("contact_bank", "", "action_start_chat");
            m103409B3(Boolean.FALSE);
        }
    }

    /* renamed from: a3 */
    private void m103449a3(boolean z) {
        int i;
        AppCompatTextView appCompatTextView = this.f84814G.f70127f;
        if (z) {
            i = C10328q.contact_us_bank_title_solo_club;
        } else {
            i = C10328q.contact_us_bank_title_solo;
        }
        appCompatTextView.setText(getString(i));
        this.f84814G.f70136o.setImageResource(C10320i.ic_solo_w_dot);
    }

    /* renamed from: b3 */
    private void m103450b3(ContactUsItemView contactUsItemView) {
        m103453e3(contactUsItemView, false);
    }

    /* renamed from: c3 */
    private void m103451c3() {
        Intent intent = new Intent("android.intent.action.SENDTO");
        intent.setData(Uri.parse("mailto:" + this.f84825R));
        startActivity(intent);
    }

    /* renamed from: d3 */
    private void m103452d3() {
        m103453e3(this.f84814G.f70131j, true);
    }

    /* renamed from: e3 */
    private void m103453e3(ContactUsItemView contactUsItemView, boolean z) {
        int i;
        String str;
        if (z) {
            i = C10328q.mobile_number_prefix;
        } else {
            i = C10328q.phone_number_prefix;
        }
        String string = getString(i);
        if (contactUsItemView.getContactType() == 0) {
            C36546y.m108282F().mo27152s("contact_bank", "phone_number", "click_phone_number");
            if (z) {
                str = contactUsItemView.getContact();
            } else {
                str = string + " " + contactUsItemView.getContact();
            }
            m103432N3(new Intent("android.intent.action.DIAL", Uri.parse("tel:" + str)));
        }
    }

    /* renamed from: f3 */
    private void m103454f3() {
        this.f84821N = true;
        this.f84814G.f70143v.setVisibility(8);
        this.f84814G.f70119J.setButtonText(C27950a.m86284a("text.chat.continue"));
    }

    /* access modifiers changed from: private */
    /* renamed from: g3 */
    public void m103455g3(C29566a aVar) {
        this.f84825R = aVar.mo69410e();
        if (aVar.mo69409d().equals("DS")) {
            this.f84814G.f70131j.setVisibility(8);
        } else if (aVar.mo69409d().equals("SOLO")) {
            this.f84814G.f70131j.setTitle(C27950a.m86284a("contact.your.banker.phone"));
            this.f84814G.f70131j.setContactNumber(aVar.mo69413h());
        } else {
            return;
        }
        this.f84814G.f70132k.setVisibility(0);
        this.f84814G.f70128g.setVisibility(0);
        this.f84814G.f70132k.setText(C27950a.m86284a(aVar.mo69408c()));
        this.f84814G.f70124O.setText(C27950a.m86284a(aVar.mo69407b()));
        this.f84814G.f70129h.setText(C27950a.m86284a(aVar.mo69406a()));
        this.f84814G.f70130i.setTitle(C27950a.m86284a("contact.your.banker.email"));
        this.f84814G.f70130i.setContactNumber(aVar.mo69410e());
        if (C37353c.EN == this.f84818K.getLanguage()) {
            this.f84814G.f70133l.setText(aVar.mo69411f());
        } else {
            this.f84814G.f70133l.setText(aVar.mo69412g());
        }
        int i = C10320i.ic_contacts_solo;
        if (aVar.mo69409d().equals("DS")) {
            i = C10320i.ds_banker_image;
        }
        this.f84814G.f70130i.setIcon(i);
        ((C2394j) ((C2394j) C2379b.m9213w(this).mo7740e().mo7727V0(aVar.mo69414i()).mo7222d()).mo7220c0(i)).mo7718L0(this.f84814G.f70134m);
    }

    /* renamed from: h3 */
    private void m103456h3() {
        this.f84814G.f70138q.setVisibility(0);
        C18569a aVar = this.f84816I;
        if (aVar != null) {
            mo86438k1(aVar.mo33792f().mo95027o0(C40992a.m118827a()).mo94981F0(new C30852z(this)));
            mo86438k1(this.f84816I.mo33790d().mo95027o0(C40992a.m118827a()).mo94981F0(new C30519a0(this)));
        }
    }

    /* renamed from: j3 */
    private void m103457j3() {
        if (this.f84815H.isAuthorized()) {
            mo86438k1(this.f84817J.mo69415a(C36546y.m108285N().mo89315M()).mo95063B(C40992a.m118827a()).mo95070I(new C30813w(this), new C30826x()));
        }
    }

    /* renamed from: k3 */
    private void m103458k3(ViewGroup viewGroup) {
        if (viewGroup.getVisibility() == 0) {
            C32290b1.m95113c(viewGroup);
            this.f84820M.setDivider(false);
            this.f84814G.f70145x.setText(getString(C10328q.contact_us_expand));
            return;
        }
        C32290b1.m95114d(viewGroup);
        this.f84820M.setDivider(true);
        this.f84814G.f70145x.setText(getString(C10328q.contact_us_collapse));
    }

    /* access modifiers changed from: private */
    /* renamed from: l3 */
    public /* synthetic */ void m103459l3(Integer num) {
        this.f84814G.f70122M.setVisibility(num.intValue() > 0 ? 0 : 8);
    }

    /* access modifiers changed from: private */
    /* renamed from: m3 */
    public /* synthetic */ void m103460m3(Boolean bool) {
        if (bool.booleanValue()) {
            this.f84814G.f70143v.setVisibility(8);
            m103454f3();
            return;
        }
        m103434O3();
    }

    /* access modifiers changed from: private */
    /* renamed from: n3 */
    public static /* synthetic */ void m103461n3(Throwable th) {
    }

    /* access modifiers changed from: private */
    /* renamed from: o3 */
    public /* synthetic */ void m103462o3(Boolean bool) {
        this.f84823P = bool.booleanValue();
        this.f84814G.f70119J.setLoading(false);
        if (bool.booleanValue()) {
            C36546y.m108282F().mo27152s("contact_bank", "", "action_start_chat");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p3 */
    public /* synthetic */ void m103463p3(View view) {
        m103450b3(this.f84814G.f70117H);
    }

    /* access modifiers changed from: private */
    /* renamed from: q3 */
    public /* synthetic */ void m103464q3(View view) {
        m103450b3(this.f84814G.f70116G);
    }

    /* access modifiers changed from: private */
    /* renamed from: r3 */
    public /* synthetic */ void m103465r3(View view) {
        m103450b3(this.f84814G.f70123N);
    }

    /* access modifiers changed from: private */
    /* renamed from: s3 */
    public /* synthetic */ void m103466s3(View view) {
        m103450b3(this.f84814G.f70141t);
    }

    /* access modifiers changed from: private */
    /* renamed from: t3 */
    public /* synthetic */ void m103467t3(View view) {
        m103450b3(this.f84814G.f70146y);
    }

    /* access modifiers changed from: private */
    /* renamed from: u3 */
    public /* synthetic */ void m103468u3(View view) {
        m103450b3(this.f84814G.f70118I);
    }

    /* access modifiers changed from: private */
    /* renamed from: v3 */
    public /* synthetic */ void m103469v3(View view) {
        m103412D3();
    }

    /* access modifiers changed from: private */
    /* renamed from: w3 */
    public /* synthetic */ void m103470w3(View view) {
        mo86109i3();
    }

    /* access modifiers changed from: private */
    /* renamed from: x3 */
    public /* synthetic */ void m103471x3(View view) {
        m103451c3();
    }

    /* access modifiers changed from: private */
    /* renamed from: y3 */
    public /* synthetic */ void m103472y3(View view) {
        m103452d3();
    }

    /* access modifiers changed from: private */
    /* renamed from: z3 */
    public /* synthetic */ void m103473z3(View view) {
        m103450b3(this.f84814G.f70135n);
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        C27451w d = C27451w.m85111d(getLayoutInflater());
        this.f84814G = d;
        super.mo70996D2(bundle, d);
        m103414E3();
        m103428L3();
        this.f84824Q = getIntent().getStringExtra("CHAT_PREVIOUS_PAGE");
        this.f84814G.f70132k.setVisibility(8);
        this.f84814G.f70128g.setVisibility(8);
        m103457j3();
        C36546y.m108282F().mo27152s("contact_bank", "", "open_contact_bank_page");
        m103430M3();
        C27451w wVar = this.f84814G;
        this.f84820M = wVar.f70135n;
        wVar.f70142u.removeAllViews();
        C27451w wVar2 = this.f84814G;
        wVar2.f70142u.addView(wVar2.f70135n);
        if (this.f84815H.getUserInfo() != null) {
            String firstName = this.f84815H.getUserInfo().getClient().getFirstName(this.f84818K.getLanguage());
            if (this.f84818K.getLanguage() == C37353c.EN) {
                firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
            }
            this.f84814G.f70140s.append(" " + firstName);
            if (this.f84815H.getUserInfo().isWealth()) {
                this.f84820M = this.f84814G.f70123N;
                m103426K3();
            }
            if (this.f84815H.getUserInfo().isDSClient()) {
                this.f84820M = this.f84814G.f70146y;
                m103418G3();
            }
            if (this.f84815H.getUserInfo().isRBClient()) {
                m103416F3();
            }
        }
        AppCompatImageView appCompatImageView = this.f84814G.f70112C;
        Integer valueOf = Integer.valueOf(C10320i.ic_evaluate);
        int i = C10320i.f28688dc;
        C32289b0.m95109u(appCompatImageView, valueOf, Integer.valueOf(i), Integer.valueOf(i), false, true);
        if (C32335t0.m95361f() == 1) {
            boolean isSoloClub = this.f84818K.getIsSoloClub();
            if (isSoloClub) {
                this.f84820M = this.f84814G.f70116G;
                m103422I3();
            } else if (this.f84818K.getIsSoloX()) {
                this.f84820M = this.f84814G.f70118I;
                m103424J3();
            } else {
                this.f84820M = this.f84814G.f70117H;
                m103420H3();
            }
            m103449a3(isSoloClub);
        }
        this.f84814G.f70119J.setOnClickListener(new C30735q(this));
        this.f84814G.f70144w.setFilters(new InputFilter[]{new InputFilter.LengthFilter(30)});
        this.f84814G.f70147z.setFilters(new InputFilter[]{new InputFilter.LengthFilter(30)});
        this.f84814G.f70144w.addTextChangedListener(this.f84826S);
        this.f84814G.f70147z.addTextChangedListener(this.f84826S);
        this.f84814G.f70144w.setOnFocusChangeListener(this.f84827T);
        this.f84814G.f70147z.setOnFocusChangeListener(this.f84827T);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i3 */
    public void mo86109i3() {
        m103458k3(this.f84814G.f70139r);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return false;
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        MedalliaDigital.enableIntercept();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        MedalliaDigital.disableIntercept();
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        return getString(C10328q.header_text_contact);
    }
}
