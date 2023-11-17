package p341ge.bog.mobilebank.p975ui.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.C0430g1;
import androidx.core.content.C0767a;
import androidx.recyclerview.widget.C1806i;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import g81.C32271s;
import g91.C32308h0;
import j81.C36763e;
import j81.C36766h;
import java.util.Date;
import jg1.C41452l;
import k91.C36928a;
import p341ge.bog.mobilebank.eventbus.events.ModifyNotificationsEvent;
import p341ge.bog.mobilebank.eventbus.events.NotificationListEvent;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.model.notification.Notification;
import p341ge.bog.mobilebank.model.notification.NotificationActionCode;
import p341ge.bog.mobilebank.model.notification.ProcessNotificationRequest;
import p341ge.bog.mobilebank.model.notification.ProcessNotificationsRequest;
import p341ge.bog.mobilebank.p975ui.activities.NotificationDetailsActivity;
import p366bk.C10320i;
import p366bk.C10321j;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10325n;

/* renamed from: ge.bog.mobilebank.ui.fragments.a1 */
public class C35577a1 extends C35651n1 implements C0430g1.C0433c, C36766h {

    /* renamed from: d */
    private View f86031d;

    /* renamed from: e */
    private View f86032e;

    /* renamed from: f */
    private RecyclerView f86033f;

    /* renamed from: g */
    private View f86034g;

    /* renamed from: h */
    private C32271s f86035h;

    /* renamed from: i */
    private long f86036i = -1;

    /* renamed from: k1 */
    private ProcessNotificationRequest m105698k1(Notification notification, NotificationActionCode notificationActionCode, int i) {
        ProcessNotificationRequest processNotificationRequest = new ProcessNotificationRequest();
        processNotificationRequest.setNotificationId(notification.getNotificationId());
        processNotificationRequest.setIndexInList(i);
        processNotificationRequest.setActionCode(notificationActionCode);
        processNotificationRequest.setActionDate(new Date().getTime());
        return processNotificationRequest;
    }

    /* access modifiers changed from: private */
    /* renamed from: m1 */
    public /* synthetic */ void m105699m1(View view) {
        m105702p1();
    }

    /* renamed from: n1 */
    private void m105700n1(NotificationActionCode notificationActionCode) {
        ProcessNotificationsRequest.Builder builder = new ProcessNotificationsRequest.Builder();
        for (int i = 0; i < this.f86035h.getItemCount(); i++) {
            builder.addRequest(m105698k1(this.f86035h.mo72788k(i), notificationActionCode, i));
        }
        this.mBankApiManager.processNotifications(builder.build());
    }

    /* renamed from: o1 */
    private void m105701o1(Notification notification, NotificationActionCode notificationActionCode, int i) {
        ProcessNotificationsRequest.Builder builder = new ProcessNotificationsRequest.Builder();
        builder.addRequest(m105698k1(notification, notificationActionCode, i));
        this.mBankApiManager.processNotifications(builder.build());
    }

    /* renamed from: p1 */
    private void m105702p1() {
        this.mClient.requestNotificationList(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: s1 */
    public void m105703s1(View view) {
        C0430g1 g1Var = new C0430g1(getContext(), view);
        g1Var.mo2099d(this);
        g1Var.mo2098c(C10325n.notifications_popup_menu);
        C36928a.m109357b(g1Var.mo2096a(), C10321j.f28707e);
        g1Var.mo2100e();
    }

    /* renamed from: L0 */
    public void mo86639L0(C36763e eVar, int i) {
        m105701o1((Notification) eVar, NotificationActionCode.ACTION_CODE_DELETE, i);
    }

    /* renamed from: Z */
    public void mo86640Z(C36763e eVar, int i) {
        m105701o1((Notification) eVar, NotificationActionCode.ACTION_CODE_UNREAD, i);
    }

    /* renamed from: l1 */
    public void mo86641l1() {
        View findViewById = this.rootView.findViewById(C10322k.f28784Qe);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
    }

    /* access modifiers changed from: protected */
    public int layoutId() {
        return C10324m.notification_list_layout;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f86031d = onCreateView.findViewById(C10322k.f28776Oc);
        this.f86032e = onCreateView.findViewById(C10322k.main_layout);
        this.f86033f = (RecyclerView) onCreateView.findViewById(C10322k.notification_list_view);
        this.f86034g = onCreateView.findViewById(C10322k.f28736Gc);
        onCreateView.findViewById(C10322k.menu_btn).setOnClickListener(new C35685y0(this));
        onCreateView.findViewById(C10322k.horizontal_error_retry_button).setOnClickListener(new C35687z0(this));
        this.f86033f.setLayoutManager(new LinearLayoutManager(getContext()));
        boolean z = true;
        C1806i iVar = new C1806i(getContext(), 1);
        iVar.mo5985l(C0767a.m2895e(getContext(), C10320i.divider));
        this.f86033f.mo5351j(iVar);
        C32271s sVar = new C32271s();
        this.f86035h = sVar;
        sVar.mo72793s(1);
        this.f86035h.mo72792r(this);
        this.f86033f.setAdapter(this.f86035h);
        this.mEventBus.mo96185q(this);
        Client client = this.mClient;
        if (bundle != null) {
            z = false;
        }
        client.requestNotificationList(z);
        return onCreateView;
    }

    public void onDestroy() {
        super.onDestroy();
        this.mEventBus.mo96186s(this);
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == C10322k.mark_all_read) {
            m105700n1(NotificationActionCode.ACTION_CODE_READ);
            return true;
        } else if (itemId != C10322k.delete_all) {
            return false;
        } else {
            m105700n1(NotificationActionCode.ACTION_CODE_DELETE);
            return true;
        }
    }

    @C41452l
    public void onModifyNotificationsEvent(ModifyNotificationsEvent modifyNotificationsEvent) {
        int i;
        if (modifyNotificationsEvent.getState() == 20) {
            this.f86035h.mo72794t(modifyNotificationsEvent.getProcessedNotifications());
            View view = this.f86032e;
            int i2 = 0;
            if (this.f86035h.getItemCount() > 0) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
            View view2 = this.f86034g;
            if (this.f86035h.getItemCount() > 0) {
                i2 = 8;
            }
            view2.setVisibility(i2);
        }
    }

    @C41452l
    public void onNotificationListEvent(NotificationListEvent notificationListEvent) {
        int i;
        int j;
        int i2 = 0;
        this.mClient.requestNotificationsCount(this.mPreferencesApiManager.getFcmToken(), false);
        int state = notificationListEvent.getState();
        if (state == 10) {
            mo86645r1();
        } else if (state == 20) {
            this.f86035h.mo72785h(notificationListEvent.getNotificationList().getNotifications());
            View view = this.f86032e;
            if (this.f86035h.getItemCount() > 0) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
            View view2 = this.f86034g;
            if (this.f86035h.getItemCount() > 0) {
                i2 = 8;
            }
            view2.setVisibility(i2);
            this.f86031d.setVisibility(8);
            long j2 = this.f86036i;
            if (!(j2 == -1 || (j = this.f86035h.mo72787j(Long.valueOf(j2))) == -1)) {
                C32308h0.m95238c();
                NotificationDetailsActivity.m104362K2(getContext(), j, 1);
            }
            mo86641l1();
        } else if (state == 30 || state == 40) {
            this.f86032e.setVisibility(8);
            this.f86034g.setVisibility(8);
            this.f86031d.setVisibility(0);
            mo86641l1();
        }
    }

    /* renamed from: q1 */
    public void mo86644q1(Long l) {
        this.f86036i = l.longValue();
    }

    /* renamed from: r1 */
    public void mo86645r1() {
        View findViewById = this.rootView.findViewById(C10322k.f28784Qe);
        if (findViewById != null) {
            findViewById.setVisibility(0);
        }
    }
}
