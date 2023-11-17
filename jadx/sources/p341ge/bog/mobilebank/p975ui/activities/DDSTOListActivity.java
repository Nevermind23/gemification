package p341ge.bog.mobilebank.p975ui.activities;

import a81.C30645j0;
import a81.C30658k0;
import a81.C30772sa;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.C1547z;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.medallia.digital.mobilesdk.MedalliaDigital;
import iu0.C36546y;
import p341ge.bog.mobilebank.p975ui.fragments.C35574a0;
import p366bk.C10323l;
import p366bk.C10328q;
import p380ck.C10464h;
import p90.C27244a0;

/* renamed from: ge.bog.mobilebank.ui.activities.DDSTOListActivity */
public class DDSTOListActivity extends C30772sa implements ViewPager.C1902j {

    /* renamed from: F */
    private C27244a0 f84832F;

    /* renamed from: G */
    protected C35574a0[] f84833G = new C35574a0[2];

    /* renamed from: H */
    private boolean f84834H = false;

    /* renamed from: ge.bog.mobilebank.ui.activities.DDSTOListActivity$a */
    class C35184a extends C1547z {
        C35184a(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        /* renamed from: d */
        public int mo6557d() {
            return DDSTOListActivity.this.f84833G.length;
        }

        /* renamed from: t */
        public Fragment mo4805t(int i) {
            return DDSTOListActivity.this.f84833G[i];
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: C2 */
    public /* synthetic */ void m103481C2(View view) {
        m103485H2();
    }

    /* access modifiers changed from: private */
    /* renamed from: G2 */
    public /* synthetic */ void m103484G2(View view) {
        m103486I2();
    }

    /* renamed from: H2 */
    private void m103485H2() {
        C36546y.m108282F().mo27137H("more_automatic_services", "select_sub_tab", "payments", (Bundle) null, C10464h.C10465a.FACEBOOKANDFIREBASE);
        this.f84832F.f68266h.setCurrentItem(0);
    }

    /* renamed from: I2 */
    private void m103486I2() {
        C36546y.m108282F().mo27137H("more_automatic_services", "select_sub_tab", "transfers", (Bundle) null, C10464h.C10465a.FACEBOOKANDFIREBASE);
        this.f84832F.f68266h.setCurrentItem(1);
    }

    /* renamed from: J2 */
    private void m103487J2(int i) {
        if (i == 0) {
            Resources resources = getResources();
            int i2 = C10323l.transition_anim_duration;
            ((TransitionDrawable) this.f84832F.f68264f.getBackground()).reverseTransition(resources.getInteger(i2));
            ((TransitionDrawable) this.f84832F.f68263e.getBackground()).startTransition(getResources().getInteger(i2));
            return;
        }
        Resources resources2 = getResources();
        int i3 = C10323l.transition_anim_duration;
        ((TransitionDrawable) this.f84832F.f68263e.getBackground()).reverseTransition(resources2.getInteger(i3));
        ((TransitionDrawable) this.f84832F.f68264f.getBackground()).startTransition(getResources().getInteger(i3));
    }

    /* renamed from: K2 */
    private void m103488K2() {
        this.f84833G[0] = C35574a0.m105690r1(10);
        this.f84833G[1] = C35574a0.m105690r1(20);
        this.f84832F.f68266h.setAdapter(new C35184a(getSupportFragmentManager()));
        this.f84832F.f68266h.addOnPageChangeListener(this);
        ((TransitionDrawable) this.f84832F.f68263e.getBackground()).startTransition(0);
    }

    /* renamed from: L2 */
    public static void m103489L2(Context context) {
        m103490M2(context, false);
    }

    /* renamed from: M2 */
    public static void m103490M2(Context context, boolean z) {
        Intent intent = new Intent(context, DDSTOListActivity.class);
        intent.putExtra("SHOULD_OPEN_STO", z);
        context.startActivity(intent);
    }

    /* renamed from: L */
    public void mo6548L(int i, float f, int i2) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        C27244a0 d = C27244a0.m84281d(getLayoutInflater());
        this.f84832F = d;
        setContentView((View) d.mo3946b());
        super.mo37451O1(bundle);
        this.f84834H = getIntent().getBooleanExtra("SHOULD_OPEN_STO", false);
        m103488K2();
        if (this.f84834H) {
            this.f84832F.f68266h.setCurrentItem(1);
        }
        this.f84832F.f68263e.setOnClickListener(new C30645j0(this));
        this.f84832F.f68264f.setOnClickListener(new C30658k0(this));
        C36546y.m108282F().mo27137H("more_automatic_services", "view", "page_view", (Bundle) null, C10464h.C10465a.FACEBOOKANDFIREBASE);
    }

    /* renamed from: Q */
    public void mo6549Q(int i) {
        m103487J2(i);
    }

    /* renamed from: l0 */
    public void mo6550l0(int i) {
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
        return getString(C10328q.header_text_automatics);
    }
}
