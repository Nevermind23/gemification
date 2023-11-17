package u30;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C0767a;
import g91.C32343x;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.presentation.payments2.view.MoneyRequestGroupIconView;
import p366bk.C10318g;
import p366bk.C10328q;
import p90.C27280d6;
import r30.C27899f;
import ue1.C43075l;

/* renamed from: u30.m */
public final class C28566m extends C28567n {

    /* renamed from: d */
    private final C27280d6 f72508d;

    /* renamed from: e */
    private final C43075l f72509e;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C28566m(p90.C27280d6 r3, ue1.C43075l r4) {
        /*
            r2 = this;
            java.lang.String r0 = "binding"
            kotlin.jvm.internal.C41536l.m120489i(r3, r0)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r3.mo3946b()
            java.lang.String r1 = "binding.root"
            kotlin.jvm.internal.C41536l.m120488h(r0, r1)
            r2.<init>(r0)
            r2.f72508d = r3
            r2.f72509e = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u30.C28566m.<init>(p90.d6, ue1.l):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static final void m87526j(C28566m mVar, C27899f fVar, View view) {
        C41536l.m120489i(mVar, "this$0");
        C41536l.m120489i(fVar, "$item");
        C43075l lVar = mVar.f72509e;
        if (lVar != null) {
            lVar.invoke(fVar);
        }
    }

    /* renamed from: i */
    public void onBind(C27899f fVar) {
        boolean z;
        int i;
        C41536l.m120489i(fVar, "item");
        Context context = this.itemView.getContext();
        this.f72508d.f68556j.setValue(new MoneyRequestGroupIconView.C22009b(fVar.mo67466j(), fVar.mo67468l()));
        this.f72508d.f68552f.setText(fVar.mo67463g());
        if (fVar.mo67472p()) {
            this.f72508d.f68557k.setText(fVar.mo67469m());
            TextView textView = this.f72508d.f68552f;
            if (fVar.mo67461d()) {
                i = C10318g.money_request_requested_amount_color_green;
            } else {
                i = C10318g.color_invert_component_tr_300;
            }
            textView.setTextColor(C0767a.m2893c(context, i));
            this.f72508d.f68558l.setText(context.getString(C10328q.money_request_label_requesting));
        } else {
            this.f72508d.f68557k.setText(fVar.mo67470n());
            this.f72508d.f68552f.setTextColor(C0767a.m2893c(context, C10318g.money_request_requested_amount_color_red));
            this.f72508d.f68558l.setText(context.getString(C10328q.money_request_label_requests));
        }
        TextView textView2 = this.f72508d.f68555i;
        C41536l.m120488h(textView2, "binding.descriptionText");
        String e = fVar.mo67462e();
        if (e == null || e.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        C32343x.m95483r1(textView2, !z, false, 2, (Object) null);
        this.f72508d.f68555i.setText(fVar.mo67462e());
        this.itemView.setOnClickListener(new C28565l(this, fVar));
        ImageView imageView = this.f72508d.f68551e;
        C41536l.m120488h(imageView, "binding.alertBadgeImage");
        C32343x.m95483r1(imageView, fVar.mo67465i(), false, 2, (Object) null);
    }
}
