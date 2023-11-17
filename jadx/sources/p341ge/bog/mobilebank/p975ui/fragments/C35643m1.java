package p341ge.bog.mobilebank.p975ui.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.C0430g1;
import androidx.core.content.C0767a;
import androidx.fragment.app.C1505h;
import androidx.recyclerview.widget.C1806i;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import g81.C32271s;
import g91.C32297d;
import g91.C32308h0;
import hd0.C24978b;
import hd1.C41205b;
import iu0.C36546y;
import j81.C36763e;
import j81.C36766h;
import java.util.ArrayList;
import java.util.List;
import k91.C36928a;
import p341ge.bog.mobilebank.model.notification.NotificationActionCode;
import p341ge.bog.mobilebank.model.notification.PushHistoryObject;
import p341ge.bog.mobilebank.model.notification.PushNotification;
import p341ge.bog.mobilebank.p975ui.activities.NotificationDetailsActivity;
import p341ge.bog.mobilebank.rest.model.RestCallback;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p366bk.C10320i;
import p366bk.C10321j;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10325n;
import r90.C27950a;

/* renamed from: ge.bog.mobilebank.ui.fragments.m1 */
public class C35643m1 extends C35651n1 implements C0430g1.C0433c, C36766h {

    /* renamed from: d */
    private View f86186d;

    /* renamed from: e */
    private View f86187e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public RecyclerView f86188f;

    /* renamed from: g */
    private View f86189g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public List f86190h = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C32271s f86191i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f86192j = false;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f86193k = false;

    /* renamed from: l */
    private long f86194l = -1;

    /* renamed from: m */
    RecyclerView.C1756u f86195m = new C35646c();

    /* renamed from: ge.bog.mobilebank.ui.fragments.m1$a */
    class C35644a extends RestCallback {

        /* renamed from: a */
        final /* synthetic */ String f86196a;

        /* renamed from: b */
        final /* synthetic */ NotificationActionCode f86197b;

        C35644a(String str, NotificationActionCode notificationActionCode) {
            this.f86196a = str;
            this.f86197b = notificationActionCode;
        }

        public void onEnqueue(C41205b bVar) {
            C35643m1.this.addDisposable(bVar);
        }

        public void onFailure(Throwable th) {
            super.onFailure(th);
            C32297d.m95153a(C35643m1.this.getActivity());
        }

        public void onResponse(BankApiResponse bankApiResponse) {
            super.onResponse(bankApiResponse);
            C35643m1.this.mo86732A1();
            C35643m1 m1Var = C35643m1.this;
            m1Var.mClient.requestNotificationsCount(m1Var.mPreferencesApiManager.getFcmToken(), true);
            if (!bankApiResponse.isSuccess()) {
                C35643m1.this.mo86732A1();
                C32297d.m95154b(C35643m1.this.getActivity(), C27950a.m86284a(bankApiResponse.getError()));
            } else if (this.f86196a == null) {
                NotificationActionCode notificationActionCode = this.f86197b;
                if (notificationActionCode == NotificationActionCode.ACTION_CODE_DELETE) {
                    C35643m1.this.f86190h.clear();
                    C35643m1.this.m105877z1();
                } else if (notificationActionCode == NotificationActionCode.ACTION_CODE_READ) {
                    for (PushNotification isRead : C35643m1.this.f86190h) {
                        isRead.setIsRead(C24978b.YES);
                    }
                    C35643m1.this.f86191i.notifyDataSetChanged();
                }
            } else {
                int i = 0;
                int i2 = 0;
                while (true) {
                    if (i2 >= C35643m1.this.f86190h.size()) {
                        break;
                    } else if (((PushNotification) C35643m1.this.f86190h.get(i2)).getId().equals(this.f86196a)) {
                        i = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
                PushNotification pushNotification = (PushNotification) C35643m1.this.f86190h.get(i);
                int i3 = C35648e.f86202a[this.f86197b.ordinal()];
                if (i3 == 1) {
                    pushNotification.setIsRead(C24978b.YES);
                    C35643m1.this.f86191i.notifyItemChanged(i);
                } else if (i3 == 2) {
                    pushNotification.setIsRead(C24978b.NO);
                    C35643m1.this.f86191i.notifyItemChanged(i);
                } else if (i3 == 3) {
                    C35643m1.this.f86190h.remove(i);
                    if (C35643m1.this.f86190h.isEmpty()) {
                        C35643m1.this.m105877z1();
                    } else {
                        C35643m1.this.f86191i.mo72791p(i);
                    }
                }
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.fragments.m1$b */
    class C35645b extends RestCallback {
        C35645b() {
        }

        public void onEnqueue(C41205b bVar) {
            C35643m1.this.addDisposable(bVar);
        }

        public void onFailure(Throwable th) {
            super.onFailure(th);
            C35643m1.this.mo86732A1();
        }

        public void onResponse(BankApiResponse bankApiResponse) {
            super.onResponse(bankApiResponse);
            if (bankApiResponse.isSuccess()) {
                C35643m1 m1Var = C35643m1.this;
                m1Var.mClient.requestNotificationsCount(m1Var.mPreferencesApiManager.getFcmToken(), false);
                PushHistoryObject pushHistoryObject = (PushHistoryObject) bankApiResponse.getResult();
                if (pushHistoryObject != null) {
                    C35643m1.this.f86190h = pushHistoryObject.getNotifications();
                }
                if (C35643m1.this.f86190h == null || C35643m1.this.f86190h.size() == 0) {
                    C35643m1.this.m105859G1();
                } else {
                    C35643m1.this.f86191i.mo72785h(C35643m1.this.f86190h);
                    C35643m1 m1Var2 = C35643m1.this;
                    m1Var2.m105874v1(m1Var2.f86190h);
                    C35643m1.this.f86188f.mo5363n(C35643m1.this.f86195m);
                }
            } else {
                C1505h activity = C35643m1.this.getActivity();
                if (activity != null) {
                    if (bankApiResponse.getKey() != null) {
                        C32297d.m95154b(C35643m1.this.getActivity(), bankApiResponse.getKey());
                    } else {
                        C32297d.m95153a(activity);
                    }
                }
            }
            C35643m1.this.mo86732A1();
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.fragments.m1$c */
    class C35646c extends RecyclerView.C1756u {
        C35646c() {
        }

        /* renamed from: e */
        public void mo5740e(RecyclerView recyclerView, int i, int i2) {
            LinearLayoutManager linearLayoutManager;
            boolean z;
            if (!C35643m1.this.f86192j && !C35643m1.this.f86193k && (linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager()) != null) {
                int k0 = linearLayoutManager.mo5686k0();
                if (linearLayoutManager.mo5223q2() + 5 >= k0) {
                    z = true;
                } else {
                    z = false;
                }
                if (k0 > 0 && z) {
                    C35643m1.this.f86193k = true;
                    C35643m1.this.m105875x1();
                }
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.fragments.m1$d */
    class C35647d extends RestCallback {
        C35647d() {
        }

        public void onEnqueue(C41205b bVar) {
            C35643m1.this.addDisposable(bVar);
        }

        public void onResponse(BankApiResponse bankApiResponse) {
            super.onResponse(bankApiResponse);
            List<PushNotification> notifications = ((PushHistoryObject) bankApiResponse.getResult()).getNotifications();
            if (notifications == null || notifications.size() != 20) {
                C35643m1.this.f86192j = true;
            }
            if (!(notifications == null || notifications.size() == 0)) {
                C35643m1.this.f86191i.mo72786i(notifications);
                C35643m1.this.f86190h.addAll(notifications);
            }
            C35643m1.this.f86193k = false;
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.fragments.m1$e */
    static /* synthetic */ class C35648e {

        /* renamed from: a */
        static final /* synthetic */ int[] f86202a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                ge.bog.mobilebank.model.notification.NotificationActionCode[] r0 = p341ge.bog.mobilebank.model.notification.NotificationActionCode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f86202a = r0
                ge.bog.mobilebank.model.notification.NotificationActionCode r1 = p341ge.bog.mobilebank.model.notification.NotificationActionCode.ACTION_CODE_READ     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f86202a     // Catch:{ NoSuchFieldError -> 0x001d }
                ge.bog.mobilebank.model.notification.NotificationActionCode r1 = p341ge.bog.mobilebank.model.notification.NotificationActionCode.ACTION_CODE_UNREAD     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f86202a     // Catch:{ NoSuchFieldError -> 0x0028 }
                ge.bog.mobilebank.model.notification.NotificationActionCode r1 = p341ge.bog.mobilebank.model.notification.NotificationActionCode.ACTION_CODE_DELETE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.p975ui.fragments.C35643m1.C35648e.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: G1 */
    public void m105859G1() {
        this.f86187e.setVisibility(8);
        this.f86189g.setVisibility(0);
        this.f86186d.setVisibility(8);
        mo86732A1();
    }

    /* access modifiers changed from: private */
    /* renamed from: H1 */
    public void m105858B1(View view) {
        C0430g1 g1Var = new C0430g1(requireActivity(), view);
        g1Var.mo2099d(this);
        g1Var.mo2098c(C10325n.notifications_popup_menu);
        C36928a.m109357b(g1Var.mo2096a(), C10321j.f28707e);
        g1Var.mo2100e();
    }

    /* access modifiers changed from: private */
    /* renamed from: v1 */
    public void m105874v1(List list) {
        if (list != null) {
            int i = -1;
            for (int i2 = 0; i2 < list.size(); i2++) {
                PushNotification pushNotification = (PushNotification) list.get(i2);
                if (pushNotification != null && String.valueOf(this.f86194l).equals(pushNotification.getId())) {
                    i = i2;
                }
            }
            if (i != -1) {
                C32308h0.m95239d(this.f86190h);
                NotificationDetailsActivity.m104362K2(requireContext(), i, 0);
                this.f86194l = -1;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: x1 */
    public void m105875x1() {
        this.mBankApi.getPushNotifications(this.mPreferencesApiManager.getFcmToken(), this.f86190h.size(), 20, new C35647d());
    }

    /* renamed from: y1 */
    private void m105876y1() {
        mo86736F1();
        this.mBankApi.getPushNotifications(this.mPreferencesApiManager.getFcmToken(), 0, 20, new C35645b());
    }

    /* access modifiers changed from: private */
    /* renamed from: z1 */
    public void m105877z1() {
        this.f86187e.setVisibility(8);
        this.f86189g.setVisibility(0);
        this.f86186d.setVisibility(8);
    }

    /* renamed from: A1 */
    public void mo86732A1() {
        View findViewById = this.rootView.findViewById(C10322k.f28784Qe);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
    }

    /* renamed from: C1 */
    public void mo86733C1(String str, NotificationActionCode notificationActionCode) {
        mo86736F1();
        this.mBankApi.makePushNotificationAction(new C35644a(str, notificationActionCode), str, notificationActionCode.getCode());
    }

    /* renamed from: D1 */
    public void mo86734D1(Long l) {
        this.f86194l = l.longValue();
    }

    /* renamed from: E1 */
    public void mo86735E1(List list) {
        this.f86190h.addAll(list);
        if (list == null || list.isEmpty()) {
            m105877z1();
        } else {
            this.f86191i.mo72785h(list);
        }
        m105874v1(list);
    }

    /* renamed from: F1 */
    public void mo86736F1() {
        View findViewById = this.rootView.findViewById(C10322k.f28784Qe);
        if (findViewById != null) {
            findViewById.setVisibility(0);
        }
    }

    /* renamed from: L0 */
    public void mo86639L0(C36763e eVar, int i) {
        PushNotification pushNotification = (PushNotification) eVar;
        mo86733C1(pushNotification.getId(), NotificationActionCode.ACTION_CODE_DELETE);
        C36546y.m108282F().mo27152s("push_history", pushNotification.getType(), "delete");
    }

    /* renamed from: Z */
    public void mo86640Z(C36763e eVar, int i) {
        mo86733C1(((PushNotification) eVar).getId(), NotificationActionCode.ACTION_CODE_UNREAD);
    }

    /* access modifiers changed from: protected */
    public int layoutId() {
        return C10324m.notification_list_layout;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f86186d = onCreateView.findViewById(C10322k.f28776Oc);
        this.f86187e = onCreateView.findViewById(C10322k.main_layout);
        this.f86188f = (RecyclerView) onCreateView.findViewById(C10322k.notification_list_view);
        this.f86189g = onCreateView.findViewById(C10322k.f28736Gc);
        onCreateView.findViewById(C10322k.menu_btn).setOnClickListener(new C35640l1(this));
        this.f86188f.setLayoutManager(new LinearLayoutManager(getContext()));
        C1806i iVar = new C1806i(getContext(), 1);
        iVar.mo5985l(C0767a.m2895e(getContext(), C10320i.divider));
        this.f86188f.mo5351j(iVar);
        C32271s sVar = new C32271s();
        this.f86191i = sVar;
        sVar.mo72793s(0);
        this.f86191i.mo72792r(this);
        this.f86188f.setAdapter(this.f86191i);
        m105876y1();
        return onCreateView;
    }

    public void onDestroy() {
        super.onDestroy();
        this.mEventBus.mo96186s(this);
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == C10322k.mark_all_read) {
            mo86733C1((String) null, NotificationActionCode.ACTION_CODE_READ);
            C36546y.m108282F().mo27152s("push_history", "", "mark_all_as_read");
            return true;
        } else if (itemId != C10322k.delete_all) {
            return false;
        } else {
            mo86733C1((String) null, NotificationActionCode.ACTION_CODE_DELETE);
            C36546y.m108282F().mo27152s("push_history", "", "delete_all");
            return true;
        }
    }
}
