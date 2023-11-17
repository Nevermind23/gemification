package p377ch;

import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.C0767a;
import androidx.core.widget.C1314o;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import com.salesforce.marketingcloud.UrlHandler;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.designsystem.components.actionsheet.additionalactions.model.AdditionalAction;
import p341ge.bog.designsystem.components.buttons.Button;
import p352ak.C9931i;
import p363bh.C10275a;
import p615tg.C17963d;

/* renamed from: ch.b */
public final class C10437b extends C1819o {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C10275a f29726f;

    /* renamed from: ch.b$a */
    public final class C10438a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C9931i f29727d;

        /* renamed from: e */
        final /* synthetic */ C10437b f29728e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10438a(C10437b bVar, C9931i iVar) {
            super(iVar.mo3946b());
            C41536l.m120489i(iVar, "binding");
            this.f29728e = bVar;
            this.f29727d = iVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m37912j(C10437b bVar, AdditionalAction additionalAction, View view) {
            C41536l.m120489i(bVar, "this$0");
            C41536l.m120489i(additionalAction, "$action");
            C10275a k = bVar.f29726f;
            if (k != null) {
                k.mo26876y0(additionalAction.mo34770a());
            }
        }

        /* renamed from: k */
        private final void m37913k(int i) {
            int c = C0767a.m2893c(this.f29727d.mo3946b().getContext(), i);
            this.f29727d.f27085e.setButtonIconTint(new ColorStateList(new int[][]{new int[]{16842910}}, new int[]{c}));
            Button button = this.f29727d.f27085e;
            button.setBackgroundTintList(button.getButtonIconTint());
        }

        /* renamed from: l */
        private final void m37914l(AdditionalAction additionalAction) {
            if (additionalAction.mo34771b() == null) {
                this.f29727d.f27085e.setVisibility(4);
                return;
            }
            Button button = this.f29727d.f27085e;
            button.setButtonIcon(C0767a.m2895e(button.getContext(), additionalAction.mo34771b().intValue()));
            if (additionalAction.mo34772d() != null) {
                m37913k(additionalAction.mo34772d().intValue());
            }
        }

        /* renamed from: m */
        private final void m37915m(AdditionalAction additionalAction) {
            C1314o.m4575q(this.f29727d.f27086f, additionalAction.mo34776f());
            this.f29727d.f27086f.setText(additionalAction.mo34774e());
        }

        /* renamed from: i */
        public final void mo27099i(AdditionalAction additionalAction) {
            C41536l.m120489i(additionalAction, UrlHandler.ACTION);
            m37914l(additionalAction);
            m37915m(additionalAction);
            this.f29727d.mo3946b().setOnClickListener(new C10436a(this.f29728e, additionalAction));
        }
    }

    public C10437b() {
        super(C17963d.f51158a.mo45633d());
    }

    /* renamed from: l */
    public void onBindViewHolder(C10438a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        Object obj = mo6026f().get(i);
        C41536l.m120488h(obj, "currentList[position]");
        aVar.mo27099i((AdditionalAction) obj);
    }

    /* renamed from: m */
    public C10438a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C9931i d = C9931i.m36428d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(LayoutInflater.f…arent,\n            false)");
        return new C10438a(this, d);
    }

    /* renamed from: n */
    public final void mo27098n(C10275a aVar) {
        C41536l.m120489i(aVar, "listener");
        this.f29726f = aVar;
    }
}
