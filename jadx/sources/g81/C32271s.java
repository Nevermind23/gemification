package g81;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.C0767a;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.alexandrius.accordionswipelayout.library.SwipeLayout;
import g91.C32308h0;
import g91.C32319m;
import g91.C32335t0;
import hd0.C24978b;
import j81.C36766h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p341ge.bog.mobilebank.model.notification.Notification;
import p341ge.bog.mobilebank.model.notification.NotificationActionCode;
import p341ge.bog.mobilebank.model.notification.ProcessNotificationRequest;
import p341ge.bog.mobilebank.model.notification.PushNotification;
import p341ge.bog.mobilebank.p975ui.activities.NotificationDetailsActivity;
import p366bk.C10318g;
import p366bk.C10320i;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;

/* renamed from: g81.s */
public class C32271s extends RecyclerView.C1736h {

    /* renamed from: d */
    private List f79612d = new ArrayList();

    /* renamed from: e */
    private List f79613e = new ArrayList();

    /* renamed from: f */
    private int f79614f;

    /* renamed from: g */
    private C36766h f79615g;

    /* renamed from: g81.s$a */
    static class C32272a extends RecyclerView.C1734f0 {
        /* access modifiers changed from: private */

        /* renamed from: d */
        public SwipeLayout f79616d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public TextView f79617e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public TextView f79618f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public TextView f79619g;

        /* renamed from: h */
        private View f79620h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public View f79621i;

        C32272a(View view) {
            super(view);
            this.f79617e = (TextView) view.findViewById(C10322k.subject_txt);
            this.f79618f = (TextView) view.findViewById(C10322k.content_txt);
            this.f79619g = (TextView) view.findViewById(C10322k.date_txt);
            this.f79616d = (SwipeLayout) view.findViewById(C10322k.swipe_layout);
            this.f79620h = view.findViewById(C10322k.item_view);
            this.f79621i = view.findViewById(C10322k.read_circle);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ void m95002l(C32272a aVar, boolean z, String str) {
        int adapterPosition = aVar.getAdapterPosition();
        if (adapterPosition < 0) {
            return;
        }
        if (this.f79614f == 0) {
            PushNotification pushNotification = (PushNotification) this.f79613e.get(adapterPosition);
            if (!z && str.equals("DELETE_ID")) {
                this.f79615g.mo86639L0(pushNotification, adapterPosition);
            } else if (z && str.equals("MARK_AS_UNREAD")) {
                this.f79615g.mo86640Z(pushNotification, adapterPosition);
            }
        } else {
            Notification notification = (Notification) this.f79612d.get(adapterPosition);
            if (!z && str.equals("DELETE_ID")) {
                this.f79615g.mo86639L0(notification, adapterPosition);
            } else if (z && str.equals("MARK_AS_UNREAD")) {
                this.f79615g.mo86640Z(notification, adapterPosition);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ void m95003m(C32272a aVar, View view) {
        if (this.f79614f == 1) {
            C32308h0.m95238c();
        } else {
            C32308h0.m95239d(this.f79613e);
        }
        NotificationDetailsActivity.m104362K2(aVar.itemView.getContext(), aVar.getAdapterPosition(), this.f79614f);
    }

    /* renamed from: q */
    private void m95004q(Context context, SwipeLayout swipeLayout) {
        Context context2 = context;
        SwipeLayout swipeLayout2 = swipeLayout;
        SwipeLayout.C2363g gVar = new SwipeLayout.C2363g("MARK_AS_UNREAD", context2.getString(C10328q.notifications_mark_as_unread), Integer.valueOf(C10320i.swipe_mark), Integer.valueOf(C0767a.m2893c(context2, C10318g.swipe_menu_item_1)), Integer.valueOf(C0767a.m2893c(context2, C10318g.swipe_menu_item_text_color)), Integer.valueOf(C0767a.m2893c(context2, C10318g.swipe_menu_item_icon_tint_color)), (Float) null);
        SwipeLayout.C2363g gVar2 = new SwipeLayout.C2363g("DELETE_ID", context2.getString(C10328q.notifications_delete_notification), Integer.valueOf(C10320i.ic_swipe_delete), Integer.valueOf(C0767a.m2893c(context2, C10318g.swipe_menu_delete_item_color)), Integer.valueOf(C0767a.m2893c(context2, C10318g.swipe_menu_item_text_white_color)), (Integer) null, (Float) null);
        swipeLayout2.setLeftSwipeItem(gVar);
        swipeLayout2.setRightSwipeItem(gVar2);
    }

    public int getItemCount() {
        return (this.f79614f == 0 ? this.f79613e : this.f79612d).size();
    }

    /* renamed from: h */
    public void mo72785h(List list) {
        if (this.f79614f == 0) {
            this.f79613e.clear();
            this.f79613e.addAll(list);
        } else {
            this.f79612d.clear();
            this.f79612d.addAll(list);
        }
        notifyDataSetChanged();
    }

    /* renamed from: i */
    public void mo72786i(List list) {
        this.f79613e.addAll(list);
        notifyDataSetChanged();
    }

    /* renamed from: j */
    public int mo72787j(Long l) {
        for (int i = 0; i < this.f79612d.size(); i++) {
            if (((Notification) this.f79612d.get(i)).getId() == l.longValue()) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: k */
    public Notification mo72788k(int i) {
        return (Notification) this.f79612d.get(i);
    }

    /* renamed from: n */
    public void onBindViewHolder(C32272a aVar, int i) {
        if (this.f79614f == 0) {
            PushNotification pushNotification = (PushNotification) this.f79613e.get(i);
            aVar.f79617e.setText(pushNotification.getMessageTitle());
            aVar.f79618f.setText(Html.fromHtml(pushNotification.getMessage()));
            aVar.f79619g.setText(C32319m.m95296c(pushNotification.getCreateDate().longValue(), aVar.f79619g.getContext()));
            if (pushNotification.getIsRead() == C24978b.NO) {
                ViewCompat.m3629w0(aVar.f79621i, ColorStateList.valueOf(C32335t0.m95357b()));
                aVar.f79617e.setTypeface(aVar.f79617e.getTypeface(), 1);
                return;
            }
            aVar.f79617e.setTypeface(aVar.f79617e.getTypeface(), 0);
            ViewCompat.m3629w0(aVar.f79621i, ColorStateList.valueOf(C0767a.m2893c(aVar.itemView.getContext(), C10318g.grey_circle_color)));
            return;
        }
        Notification notification = (Notification) this.f79612d.get(i);
        aVar.f79617e.setText(notification.getSubject());
        aVar.f79618f.setText(Html.fromHtml(notification.getContent()));
        aVar.f79619g.setText(C32319m.m95296c(notification.getStartDate(), aVar.f79619g.getContext()));
        if (notification.getActionCode() == NotificationActionCode.ACTION_CODE_UNREAD) {
            ViewCompat.m3629w0(aVar.f79621i, ColorStateList.valueOf(C32335t0.m95357b()));
            aVar.f79617e.setTypeface(aVar.f79617e.getTypeface(), 1);
            return;
        }
        aVar.f79617e.setTypeface(aVar.f79617e.getTypeface(), 0);
        ViewCompat.m3629w0(aVar.f79621i, ColorStateList.valueOf(C0767a.m2893c(aVar.itemView.getContext(), C10318g.grey_circle_color)));
    }

    /* renamed from: o */
    public C32272a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C32272a aVar = new C32272a(LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.notification_list_item_swipable, viewGroup, false));
        m95004q(viewGroup.getContext(), aVar.f79616d);
        aVar.f79616d.setOnSwipeItemClickListener(new C32269q(this, aVar));
        aVar.itemView.setOnClickListener(new C32270r(this, aVar));
        return aVar;
    }

    /* renamed from: p */
    public void mo72791p(int i) {
        if (this.f79614f == 0) {
            this.f79613e.remove(i);
        } else {
            this.f79612d.remove(i);
        }
        notifyItemRemoved(i);
    }

    /* renamed from: r */
    public void mo72792r(C36766h hVar) {
        this.f79615g = hVar;
    }

    /* renamed from: s */
    public void mo72793s(int i) {
        this.f79614f = i;
    }

    /* renamed from: t */
    public void mo72794t(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ProcessNotificationRequest processNotificationRequest = (ProcessNotificationRequest) it.next();
            if (((Notification) this.f79612d.get(processNotificationRequest.getIndexInList())).getNotificationId() == processNotificationRequest.getNotificationId()) {
                if (processNotificationRequest.getActionCode() == NotificationActionCode.ACTION_CODE_DELETE) {
                    mo72791p(processNotificationRequest.getIndexInList());
                } else {
                    notifyItemChanged(processNotificationRequest.getIndexInList());
                }
            }
        }
    }
}
