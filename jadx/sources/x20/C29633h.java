package x20;

import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.PopupMenu;
import android.widget.TextView;
import g91.C32343x;
import he1.C41238w;
import kotlin.jvm.internal.C41536l;
import p366bk.C10322k;
import p90.C27439u5;
import ue1.C43075l;
import w20.C29192a;

/* renamed from: x20.h */
public final class C29633h extends C29627b {

    /* renamed from: d */
    private final C27439u5 f74796d;

    /* renamed from: e */
    private final C43075l f74797e;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C29633h(p90.C27439u5 r4, ue1.C43075l r5) {
        /*
            r3 = this;
            java.lang.String r0 = "binding"
            kotlin.jvm.internal.C41536l.m120489i(r4, r0)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r4.mo3946b()
            java.lang.String r1 = "binding.root"
            kotlin.jvm.internal.C41536l.m120488h(r0, r1)
            r3.<init>(r0)
            r3.f74796d = r4
            r3.f74797e = r5
            android.widget.PopupMenu r5 = new android.widget.PopupMenu
            android.view.View r0 = r3.itemView
            android.content.Context r0 = r0.getContext()
            android.widget.ImageButton r1 = r4.f69970f
            r2 = 17
            r5.<init>(r0, r1, r2)
            int r0 = p366bk.C10325n.money_request_details
            r5.inflate(r0)
            x20.f r0 = new x20.f
            r0.<init>(r3)
            r5.setOnMenuItemClickListener(r0)
            android.widget.ImageButton r4 = r4.f69970f
            x20.g r0 = new x20.g
            r0.<init>(r5)
            r4.setOnClickListener(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x20.C29633h.<init>(p90.u5, ue1.l):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static final boolean m89942l(C29633h hVar, MenuItem menuItem) {
        C41536l.m120489i(hVar, "this$0");
        if (menuItem.getItemId() != C10322k.menu_item_money_request_cancel) {
            return false;
        }
        C43075l lVar = hVar.f74797e;
        if (lVar != null) {
            lVar.invoke(C41238w.f97225a);
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static final void m89943m(PopupMenu popupMenu, View view) {
        C41536l.m120489i(popupMenu, "$this_run");
        popupMenu.show();
    }

    /* renamed from: k */
    public void mo69544h(C29192a.C29194b bVar) {
        boolean z;
        boolean z2;
        C41536l.m120489i(bVar, "item");
        ImageButton imageButton = this.f74796d.f69970f;
        C41536l.m120488h(imageButton, "binding.menuIcon");
        if (bVar.mo69037h() == null) {
            z = true;
        } else {
            z = false;
        }
        C32343x.m95483r1(imageButton, z, false, 2, (Object) null);
        this.f74796d.f69975k.setText(C32343x.m95410Q(bVar.mo69036g(), "₾", false, 2, (Object) null));
        this.f74796d.f69974j.setText(C32343x.m95410Q(bVar.mo69035f(), "₾", false, 2, (Object) null));
        this.f74796d.f69972h.setProgress(bVar.mo69033e());
        TextView textView = this.f74796d.f69969e;
        C41536l.m120488h(textView, "binding.commentText");
        String c = bVar.mo69031c();
        if (c == null || c.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        C32343x.m95483r1(textView, !z2, false, 2, (Object) null);
        this.f74796d.f69969e.setText(bVar.mo69031c());
        View view = this.f74796d.f69973i;
        C41536l.m120488h(view, "binding.separator");
        C32343x.m95483r1(view, bVar.mo69032d(), false, 2, (Object) null);
    }
}
