package p341ge.bog.mobilebank.p975ui.activities;

import a81.C30526a7;
import a81.C30540b7;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.C1489c0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.medallia.digital.mobilesdk.MedalliaDigital;
import g91.C32308h0;
import g91.C32343x;
import iu0.C36546y;
import java.util.ArrayList;
import jg1.C41438c;
import jg1.C41452l;
import p341ge.bog.mobilebank.eventbus.events.NotificationCountEvent;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.p975ui.fragments.C35577a1;
import p341ge.bog.mobilebank.p975ui.fragments.C35643m1;
import p341ge.bog.mobilebank.p975ui.fragments.C35651n1;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p366bk.C10323l;
import p366bk.C10328q;
import p90.C27461x0;

/* renamed from: ge.bog.mobilebank.ui.activities.NotificationListActivity */
public class NotificationListActivity extends C35545z implements ViewPager.C1902j {

    /* renamed from: G */
    private C27461x0 f85188G;

    /* renamed from: H */
    protected Client f85189H;

    /* renamed from: I */
    protected C41438c f85190I;

    /* renamed from: J */
    protected PreferencesApiManager f85191J;

    /* renamed from: K */
    private C35282a f85192K;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public long f85193L;

    /* renamed from: ge.bog.mobilebank.ui.activities.NotificationListActivity$a */
    private class C35282a extends C1489c0 {

        /* renamed from: j */
        private C35651n1[] f85194j;

        public C35282a(FragmentManager fragmentManager) {
            super(fragmentManager);
            C35651n1[] n1VarArr = new C35651n1[2];
            this.f85194j = n1VarArr;
            n1VarArr[1] = new C35577a1();
            this.f85194j[0] = new C35643m1();
            ((C35577a1) this.f85194j[1]).mo86644q1(Long.valueOf(NotificationListActivity.this.f85193L));
            ((C35643m1) this.f85194j[0]).mo86734D1(Long.valueOf(NotificationListActivity.this.f85193L));
        }

        /* renamed from: d */
        public int mo6557d() {
            return 2;
        }

        /* renamed from: t */
        public Fragment mo4602t(int i) {
            return this.f85194j[i];
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: H2 */
    public /* synthetic */ void m104375H2(View view) {
        m104377J2();
    }

    /* access modifiers changed from: private */
    /* renamed from: I2 */
    public /* synthetic */ void m104376I2(View view) {
        m104378K2();
    }

    /* renamed from: J2 */
    private void m104377J2() {
        this.f85188G.f70193g.setCurrentItem(1);
    }

    /* renamed from: K2 */
    private void m104378K2() {
        this.f85188G.f70193g.setCurrentItem(0);
    }

    /* renamed from: L2 */
    private void m104379L2() {
        Resources resources = getResources();
        int i = C10323l.transition_anim_duration;
        ((TransitionDrawable) this.f85188G.f70194h.getBackground()).reverseTransition(resources.getInteger(i));
        ((TransitionDrawable) this.f85188G.f70192f.getBackground()).startTransition(getResources().getInteger(i));
    }

    /* renamed from: M2 */
    private void m104380M2() {
        Resources resources = getResources();
        int i = C10323l.transition_anim_duration;
        ((TransitionDrawable) this.f85188G.f70194h.getBackground()).startTransition(resources.getInteger(i));
        ((TransitionDrawable) this.f85188G.f70192f.getBackground()).reverseTransition(getResources().getInteger(i));
        C36546y.m108282F().mo27152s("push_history", "", "open_push_history");
    }

    /* renamed from: N2 */
    private void m104381N2() {
        this.f85188G.f70192f.setOnClickListener(new C30526a7(this));
        this.f85188G.f70194h.setOnClickListener(new C30540b7(this));
    }

    /* renamed from: O2 */
    public static void m104382O2(Context context) {
        context.startActivity(new Intent(context, NotificationListActivity.class));
    }

    /* renamed from: P2 */
    public static void m104383P2(Context context, long j) {
        Intent intent = new Intent(context, NotificationListActivity.class);
        intent.putExtra("messageId", j);
        context.startActivity(intent);
    }

    /* renamed from: L */
    public void mo6548L(int i, float f, int i2) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        C27461x0 d = C27461x0.m85150d(getLayoutInflater());
        this.f85188G = d;
        super.mo70996D2(bundle, d);
        m104381N2();
        C32343x.m95423W0(this.f85190I, this);
        this.f85193L = getIntent().getLongExtra("messageId", -1);
        C35282a aVar = new C35282a(getSupportFragmentManager());
        this.f85192K = aVar;
        this.f85188G.f70193g.setAdapter(aVar);
        this.f85188G.f70193g.addOnPageChangeListener(this);
        ((TransitionDrawable) this.f85188G.f70194h.getBackground()).startTransition(0);
        this.f85189H.requestNotificationsCount(this.f85191J.getFcmToken(), true);
    }

    /* renamed from: Q */
    public void mo6549Q(int i) {
        if (i == 1) {
            m104379L2();
        } else if (i == 0) {
            m104380M2();
        }
    }

    /* renamed from: l0 */
    public void mo6550l0(int i) {
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 0 && i2 == -1) {
            ((C35643m1) this.f85192K.mo4602t(0)).mo86735E1(new ArrayList(C32308h0.m95237b()));
            C32308h0.m95238c();
        }
        super.onActivityResult(i, i2, intent);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C32343x.m95489t1(this.f85190I, this);
    }

    @SuppressLint({"DefaultLocale"})
    @C41452l
    public void onNotificationsCount(NotificationCountEvent notificationCountEvent) {
        if (20 == notificationCountEvent.getState()) {
            if (notificationCountEvent.getUnreadPushCount() > 0) {
                this.f85188G.f70194h.setText(String.format("PUSH (%d)", new Object[]{Integer.valueOf(notificationCountEvent.getUnreadPushCount())}));
            } else {
                this.f85188G.f70194h.setText("PUSH");
            }
            if (notificationCountEvent.getUnreadMessageCount() > 0) {
                this.f85188G.f70192f.setText(String.format("INBOX (%d)", new Object[]{Integer.valueOf(notificationCountEvent.getUnreadMessageCount())}));
                return;
            }
            this.f85188G.f70192f.setText("INBOX");
        }
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
        return getString(C10328q.header_text_notifications);
    }
}
