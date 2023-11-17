package p341ge.bog.mobilebank.p975ui.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.gson.Gson;
import g91.C32300e0;
import g91.C32319m;
import iu0.C36546y;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.parceler.C42035e;
import p316xa.C8982a;
import p341ge.bog.mobilebank.cleanarch.presentation.pushnotification.PushNotificationHandlerActivity;
import p341ge.bog.mobilebank.model.KeyValue;
import p341ge.bog.mobilebank.model.notification.Notification;
import p341ge.bog.mobilebank.model.notification.PushNotification;
import p366bk.C10318g;
import p90.C27248a4;
import r90.C27950a;

/* renamed from: ge.bog.mobilebank.ui.fragments.x0 */
public class C35681x0 extends C35651n1 {

    /* renamed from: d */
    private C27248a4 f86263d;

    /* renamed from: e */
    private int f86264e;

    /* renamed from: f */
    private PushNotification f86265f;

    /* renamed from: g */
    private C35683b f86266g;

    /* renamed from: ge.bog.mobilebank.ui.fragments.x0$a */
    class C35682a extends C8982a<ArrayList<KeyValue>> {
        C35682a() {
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.fragments.x0$b */
    public interface C35683b {
        /* renamed from: a */
        void mo86494a();
    }

    /* renamed from: k1 */
    private String m105964k1(String str) {
        return String.format("<html><style>body{background-color: %s; color: %s;}</style><body>%s</body></html>", new Object[]{C32300e0.m95168f(getResources().getColor(C10318g.f28625J0)), C32300e0.m95168f(getResources().getColor(C10318g.f28630R0)), str});
    }

    /* access modifiers changed from: private */
    /* renamed from: l1 */
    public /* synthetic */ void m105965l1(View view) {
        C35683b bVar = this.f86266g;
        if (bVar != null) {
            bVar.mo86494a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m1 */
    public /* synthetic */ void m105966m1(String str, ArrayList arrayList, View view) {
        Intent intent = new Intent();
        intent.putExtra("PUSH_NOTIFS_OPEN", true);
        intent.putExtra("type", str);
        intent.putExtra("parameters", C42035e.m122121c(arrayList));
        intent.putExtra("messageId", this.f86265f.getId());
        PushNotificationHandlerActivity.m72287O5(getActivity(), intent);
    }

    /* renamed from: n1 */
    public static C35681x0 m105967n1(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("NOTIFICATION_INDEX", i);
        C35681x0 x0Var = new C35681x0();
        x0Var.setArguments(bundle);
        return x0Var;
    }

    /* renamed from: o1 */
    public void mo86778o1(C35683b bVar) {
        this.f86266g = bVar;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f86264e = getArguments().getInt("NOTIFICATION_INDEX");
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        C27248a4 d = C27248a4.m84292d(getLayoutInflater(), viewGroup, false);
        this.f86263d = d;
        return d.mo3946b();
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f86263d = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        DateFormat timeFormat = android.text.format.DateFormat.getTimeFormat(C36546y.m108285N());
        this.f86263d.f68310f.setPadding(0, 0, 0, 0);
        this.f86263d.f68311g.setOnClickListener(new C35675v0(this));
        PushNotification pushNotification = this.f86265f;
        if (pushNotification != null) {
            String type = pushNotification.getType();
            if (type != null && !type.isEmpty() && !type.equals("MESSAGES")) {
                this.f86263d.f68312h.setVisibility(0);
                this.f86263d.f68312h.setButtonText(C27950a.m86284a("notifications.push.redirect.button.label"));
                this.f86263d.f68312h.setOnClickListener(new C35679w0(this, type, (ArrayList) new Gson().mo18166h(this.f86265f.getParameters(), new C35682a().getType())));
            }
            this.f86263d.f68313i.setText(this.f86265f.getMessageTitle());
            this.f86263d.f68313i.setTitle(String.format("%s  %s", new Object[]{C32319m.m95296c(this.f86265f.getCreateDate().longValue(), getContext()), timeFormat.format(new Date(this.f86265f.getCreateDate().longValue()))}));
            this.f86263d.f68310f.loadData(Base64.encodeToString(m105964k1(this.f86265f.getMessage()).getBytes(), 0), "text/html; charset=utf-8", "base64");
            return;
        }
        List<Notification> notificationList = this.mClient.getNotificationList();
        if (notificationList != null) {
            Notification notification = notificationList.get(this.f86264e);
            this.f86263d.f68313i.setText(notification.getSubject());
            this.f86263d.f68313i.setTitle(String.format("%s  %s", new Object[]{C32319m.m95296c(notification.getStartDate(), getContext()), timeFormat.format(new Date(notification.getStartDate()))}));
            this.f86263d.f68310f.loadData(Base64.encodeToString(m105964k1(notification.getContent()).getBytes(), 0), "text/html; charset=utf-8", "base64");
        }
    }

    /* renamed from: p1 */
    public void mo86779p1(PushNotification pushNotification) {
        this.f86265f = pushNotification;
    }
}
