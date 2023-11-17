package p341ge.bog.mobilebank.p975ui.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.C1547z;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.medallia.digital.mobilesdk.MedalliaDigital;
import g91.C32297d;
import g91.C32308h0;
import hd0.C24978b;
import hd1.C41205b;
import i10.C25100c;
import iu0.C36546y;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.model.notification.Notification;
import p341ge.bog.mobilebank.model.notification.NotificationActionCode;
import p341ge.bog.mobilebank.model.notification.ProcessNotificationRequest;
import p341ge.bog.mobilebank.model.notification.ProcessNotificationsRequest;
import p341ge.bog.mobilebank.model.notification.PushNotification;
import p341ge.bog.mobilebank.p975ui.fragments.C35681x0;
import p341ge.bog.mobilebank.rest.BankApi;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p341ge.bog.mobilebank.rest.manager.RootBankApiManager;
import p341ge.bog.mobilebank.rest.model.RestCallback;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p366bk.C10322k;
import p366bk.C10324m;
import r90.C27950a;

/* renamed from: ge.bog.mobilebank.ui.activities.NotificationDetailsActivity */
public class NotificationDetailsActivity extends C35541y implements ViewPager.C1902j {

    /* renamed from: G */
    protected BankApi f85171G;

    /* renamed from: H */
    protected RootBankApiManager f85172H;

    /* renamed from: I */
    protected Client f85173I;

    /* renamed from: J */
    protected PreferencesApiManager f85174J;

    /* renamed from: K */
    private ViewPager f85175K;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public int f85176L;

    /* renamed from: M */
    private List f85177M;

    /* renamed from: N */
    private boolean f85178N = false;

    /* renamed from: O */
    private boolean f85179O = false;

    /* renamed from: P */
    private C35281c f85180P;

    /* renamed from: ge.bog.mobilebank.ui.activities.NotificationDetailsActivity$a */
    class C35279a extends RestCallback {

        /* renamed from: a */
        final /* synthetic */ String f85181a;

        /* renamed from: b */
        final /* synthetic */ NotificationActionCode f85182b;

        C35279a(String str, NotificationActionCode notificationActionCode) {
            this.f85181a = str;
            this.f85182b = notificationActionCode;
        }

        public void onEnqueue(C41205b bVar) {
            NotificationDetailsActivity.this.mo86438k1(bVar);
        }

        public void onFailure(Throwable th) {
            super.onFailure(th);
            C32297d.m95153a(NotificationDetailsActivity.this);
        }

        public void onResponse(BankApiResponse bankApiResponse) {
            super.onResponse(bankApiResponse);
            if (bankApiResponse.isSuccess()) {
                for (PushNotification pushNotification : C32308h0.m95237b()) {
                    if (pushNotification.getId().equals(this.f85181a)) {
                        if (this.f85182b == NotificationActionCode.ACTION_CODE_READ) {
                            pushNotification.setIsRead(C24978b.YES);
                        } else {
                            pushNotification.setIsRead(C24978b.NO);
                            NotificationDetailsActivity.this.finish();
                        }
                    }
                }
                return;
            }
            C32297d.m95154b(NotificationDetailsActivity.this, C27950a.m86284a(bankApiResponse.getError()));
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.NotificationDetailsActivity$b */
    class C35280b extends RestCallback {

        /* renamed from: a */
        final /* synthetic */ String f85184a;

        C35280b(String str) {
            this.f85184a = str;
        }

        public void onEnqueue(C41205b bVar) {
            NotificationDetailsActivity.this.mo86438k1(bVar);
        }

        public void onFailure(Throwable th) {
            super.onFailure(th);
            C32297d.m95153a(NotificationDetailsActivity.this);
        }

        public void onResponse(BankApiResponse bankApiResponse) {
            super.onResponse(bankApiResponse);
            if (bankApiResponse.isSuccess()) {
                for (int i = 0; i < C32308h0.m95237b().size(); i++) {
                    if (((PushNotification) C32308h0.m95237b().get(i)).getId().equals(this.f85184a)) {
                        C32308h0.m95237b().remove(i);
                        NotificationDetailsActivity.this.finish();
                        return;
                    }
                }
                return;
            }
            C32297d.m95154b(NotificationDetailsActivity.this, C27950a.m86284a(bankApiResponse.getError()));
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.NotificationDetailsActivity$c */
    private class C35281c extends C1547z {

        /* renamed from: h */
        private int f85186h;

        public C35281c(FragmentManager fragmentManager, int i) {
            super(fragmentManager);
            this.f85186h = i;
        }

        /* renamed from: d */
        public int mo6557d() {
            return this.f85186h;
        }

        /* renamed from: t */
        public Fragment mo4805t(int i) {
            C35681x0 n1 = C35681x0.m105967n1(i);
            if (NotificationDetailsActivity.this.f85176L == 0) {
                n1.mo86779p1((PushNotification) C32308h0.m95237b().get(i));
            }
            n1.mo86778o1(new C35508s1(NotificationDetailsActivity.this));
            return n1;
        }
    }

    /* renamed from: G2 */
    private void m104358G2(String str) {
        this.f85171G.makePushNotificationAction(new C35280b(str), str, NotificationActionCode.ACTION_CODE_DELETE.getCode());
    }

    /* renamed from: H2 */
    private void m104359H2(String str, NotificationActionCode notificationActionCode) {
        this.f85171G.makePushNotificationAction(new C35279a(str, notificationActionCode), str, notificationActionCode.getCode());
    }

    /* renamed from: I2 */
    private void m104360I2(NotificationActionCode notificationActionCode) {
        int currentItem = this.f85175K.getCurrentItem();
        ProcessNotificationRequest processNotificationRequest = new ProcessNotificationRequest();
        processNotificationRequest.setNotificationId(((Notification) this.f85177M.get(currentItem)).getNotificationId());
        processNotificationRequest.setIndexInList(currentItem);
        processNotificationRequest.setActionCode(notificationActionCode);
        processNotificationRequest.setActionDate(new Date().getTime());
        ProcessNotificationsRequest.Builder builder = new ProcessNotificationsRequest.Builder();
        builder.addRequest(processNotificationRequest);
        this.f85172H.processNotifications(builder.build());
    }

    /* renamed from: J2 */
    private void m104361J2(Intent intent) {
        int intExtra = intent.getIntExtra("TYPE", 1);
        this.f85176L = intExtra;
        if (intExtra == 0) {
            C35281c cVar = new C35281c(getSupportFragmentManager(), C32308h0.m95237b().size());
            this.f85180P = cVar;
            this.f85175K.setAdapter(cVar);
            int intExtra2 = intent.getIntExtra("SELECTED_INDEX", 0);
            this.f85175K.setCurrentItem(intExtra2);
            mo6549Q(intExtra2);
            this.f85175K.addOnPageChangeListener(this);
            m104359H2(((PushNotification) C32308h0.m95237b().get(intExtra2)).getId(), NotificationActionCode.ACTION_CODE_READ);
            return;
        }
        this.f85177M = new ArrayList();
        if (this.f85173I.getNotificationList() != null) {
            this.f85177M.addAll(this.f85173I.getNotificationList());
        }
        C35281c cVar2 = new C35281c(getSupportFragmentManager(), this.f85177M.size());
        this.f85180P = cVar2;
        this.f85175K.setAdapter(cVar2);
        int intExtra3 = intent.getIntExtra("SELECTED_INDEX", 0);
        this.f85175K.setCurrentItem(intExtra3);
        mo6549Q(intExtra3);
        this.f85175K.addOnPageChangeListener(this);
    }

    /* renamed from: K2 */
    public static void m104362K2(Context context, int i, int i2) {
        Intent intent = new Intent(context, NotificationDetailsActivity.class);
        intent.putExtra("SELECTED_INDEX", i);
        intent.putExtra("TYPE", i2);
        intent.setFlags(67108864);
        if (i2 != 1) {
            Log.e("notificationdetails", "size: " + C32308h0.m95237b().size());
            C25100c.m80063b(context).startActivityForResult(intent, 0);
            return;
        }
        context.startActivity(intent);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F2 */
    public void mo86289F2() {
        if (this.f85176L != 0) {
            m104360I2(NotificationActionCode.ACTION_CODE_DELETE);
        } else if (this.f85175K.getCurrentItem() < C32308h0.m95237b().size()) {
            PushNotification pushNotification = (PushNotification) C32308h0.m95237b().get(this.f85175K.getCurrentItem());
            C36546y.m108282F().mo27152s("push_history", pushNotification.getType(), "delete");
            m104358G2(pushNotification.getId());
        }
    }

    /* renamed from: L */
    public void mo6548L(int i, float f, int i2) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: M1 */
    public int mo49479M1() {
        return C10324m.activity_notification_details;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        super.mo37451O1(bundle);
        this.f85175K = (ViewPager) findViewById(C10322k.viewpager);
        m104361J2(getIntent());
    }

    /* renamed from: Q */
    public void mo6549Q(int i) {
        if (this.f85176L == 0) {
            m104359H2(((PushNotification) C32308h0.m95237b().get(i)).getId(), NotificationActionCode.ACTION_CODE_READ);
            return;
        }
        List list = this.f85177M;
        if (list != null && list.size() > 0 && this.f85177M.size() > this.f85175K.getCurrentItem() && ((Notification) this.f85177M.get(this.f85175K.getCurrentItem())).getActionCode() == NotificationActionCode.ACTION_CODE_UNREAD) {
            m104360I2(NotificationActionCode.ACTION_CODE_READ);
        }
    }

    public void finish() {
        if (this.f85176L == 0) {
            setResult(-1, new Intent());
        }
        super.finish();
    }

    /* renamed from: l0 */
    public void mo6550l0(int i) {
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        m104361J2(intent);
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
        return C27950a.m86284a("mbank.notifications.header.label");
    }
}
